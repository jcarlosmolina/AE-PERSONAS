package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.Collection;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * ORDER BY clause of an SQL sentence.
 */
public class SQLOrderBy {

    private SQLSelect select;

    private Collection <SQLOrderByItem> items;

    private String pendingPath;

    private SQLAlias currentAlias;

    /**
     * Creates a new ORDER BY clause for an SQL sentence.
     * @param select SQL Select sentence owning this clause
     */
    public SQLOrderBy(SQLSelect select) {
        this.select = select;
        this.items = new ArrayList<>();
    }

    /**
     * Creates a new ORDER BY clause.
     */
    public SQLOrderBy() {
    	this.items = new ArrayList<>();
    }

    /**
     * Add a new item to the clause.
     * @param itemName Name of the item
     * @param isAscending True if item is to be sorted in ascending sense. False otherwise
     */
    public void addItem(String itemName, Boolean isAscending) {
    	processItem(itemName, isAscending);
    }

    /**
     * Process the item locating its alias and adding it to the list
     * @param itemName Attribute path name
     * @param isAscending Ascending
     */
    private void processItem(String itemName, Boolean isAscending) {
        int pointIndex = -1;
        String targetClass = "";
        String originClass = select.getSourceEntityName();
        String processingPath = "";
        String attribute = "";
        String initialPath = "";
        SQLAlias aliasObject = null;
        SQLAlias aliasOriginal = null;

	    // Initialize variables
        if (!originClass.equalsIgnoreCase("")){
            itemName = Constants.normalizePath(originClass, itemName, false);
			attribute = itemName;
            targetClass = originClass;
            // Get the initial Alias
            aliasOriginal = select.getAlias("", originClass);
        } else {
            // Formula in global service. First element is a class name
			itemName = Constants.normalizePath(getSelect().getClassNameInGlobalService(), itemName, true);
            pointIndex = itemName.indexOf('.');
            attribute = itemName.substring(pointIndex + 1);
            targetClass = getSelect().getClassNameInGlobalService();
            // Get the initial Alias
            aliasOriginal = select.getAlias("", targetClass);
            initialPath = targetClass;
        }

        // If definition class alias does not exists, get the SQL starting alias
        if (aliasOriginal == null){
            aliasOriginal = select.getStartingClassAlias();
            }

        // Check if the expression contains a path
        pointIndex = attribute.lastIndexOf('.');
        if (pointIndex > -1) {
            processingPath = attribute.substring(0, pointIndex);
            attribute = attribute.substring(pointIndex + 1);
        }

        aliasObject = aliasOriginal;

        if (!processingPath.equalsIgnoreCase("")) {
            // Check if the path has been processed
            aliasObject = select.getAlias(processingPath, Constants.pathTargetClass(targetClass, processingPath));

            // If not found, obtain the alias of the remaining path
            if (aliasObject == null){
                aliasObject = select.addAggregationJoins(aliasOriginal, targetClass, processingPath, Constants.LEFTJOIN, initialPath);
            }
        }

        // Get the attribute definition class
        String aliasObjectFacet = aliasObject != null ? aliasObject.getFacet() : "";
        String attributeDefClass = Constants.getTargetFacetElement(aliasObjectFacet, attribute);

        SQLAlias attributeAlias = null;

        attributeAlias = aliasObject;
        // If reached class by the alias is not the attribute definition class, add the inheritance joins
        if (!attributeDefClass.equalsIgnoreCase(aliasObjectFacet)){
            attributeAlias = select.addInheritanceJoins(aliasObject, aliasObjectFacet, attributeDefClass);
        }

        // Get the table field name for this attribute
        String attributeAliasText = attributeAlias != null ? attributeAlias.getAlias() : "";
        String fieldName = Constants.nameField(attributeDefClass, attribute);
        // Add the Item to the list
        items.add(new SQLOrderByItem(attributeAliasText + "." + fieldName, isAscending));
        // Add the Item to the select part of the sentence
        this.getSelect().addToSelectPart(attributeAliasText + "." + fieldName);
    }

    /**
     * Adds a new item to the clause.  Used when the rolePath starts with a OV parameter.
     * @param itemName is the path of the criterion
     * @param isAscending is the kind of order
     * @param className is the class name of the OV parameter
     * @param parameterValue is the identification value of the OV parameter
     * @param parameterName is the name variable of the OV parameter
     * @throws SystemException with system problems
     */
    public void addItem(String itemName, String className, IOid parameterValue, String parameterName, Boolean isAscending) throws SystemException {
    	processItem(itemName, isAscending, className, parameterValue, parameterName);
    }

   /**
     * Processes the new item. Used when the rolePath starts with a OV parameter.
     * @param isAscending is the kind of order
     * @param parameterClass is the class name of the OV parameter
     * @param path the path of the criterion
     * @param parameterValue is the identification value of the OV parameter
     * @param parameterName is the name variable of the OV parameter
     * @throws SystemException with system problems
     */
    private void processItem(String path, Boolean isAscending, String parameterClass, IOid parameterValue, String parameterName) throws SystemException {
    	String rolePath = "";
    	String attributeName = "";
    	SQLAlias aliasObject = null;
    	SQLAlias attributeAlias = null;

        // Get rolePath without initial OV parameter
        rolePath = stripInitialOVParameter(path);

		// Get rolePath and Attribute name
		int pointAttrIndex = rolePath.lastIndexOf('.');
		if (pointAttrIndex != -1){
			attributeName = rolePath.substring(pointAttrIndex + 1);
			rolePath = rolePath.substring(0, pointAttrIndex);
		} else {
			attributeName = rolePath;
			rolePath = "";
		}
        
        rolePath = Constants.normalizePath(parameterClass, rolePath, false);

		// Check if the parameter appears in the alias list.
        checkIfParameterAppearsInAliasList(parameterName, parameterClass, parameterValue);

        // Process path
        processPath(rolePath, parameterName, parameterClass);

        // Check if the reached class matches with the owner class of the pendingPath
        String reachedClass = Constants.getTargetFacetElement(currentAlias.getFacet(), pendingPath);
        if (!reachedClass.isEmpty() && !reachedClass.equalsIgnoreCase(currentAlias.getFacet())) {
            // Add the join to the proper class and obtain the final alias
            currentAlias = select.addInheritanceJoins(currentAlias, currentAlias.getFacet(), reachedClass);
        }
        aliasObject = currentAlias;
        attributeAlias = aliasObject;

        // Get the table field name for this attribute
        String fieldName = Constants.normalizeDSItemPath(currentAlias.getFacet(),
                (pendingPath.isEmpty() ? "" : pendingPath + ".") + attributeName);

        // Add the Item to the list
        addFieldToSelectPart(attributeAlias, fieldName, isAscending);
    }
    
    private void processPath(String rolePath, String parameterName, String parameterClass) {
        // Determine effective path
        String effectivePath = (rolePath.isEmpty() ? parameterName : parameterName + "." + rolePath);
        
        // Check if all or part of the path has already been solved by the sql
        String commonPath = "";
        String processedPath = "";
        SQLAlias originalAlias = select.getStartingClassAlias();
        String originalPath = originalAlias != null ? originalAlias.getPath() : "";
        
        commonPath = select.calculateCommonPath(effectivePath);
        
        if (!originalPath.isEmpty() && effectivePath.startsWith(originalPath)) {
            // There's a common path with respect to the current query
            commonPath = originalPath;
            processedPath = commonPath;
            // Strip the originalPath off the effectivePath and thus obtain the pendingPath
            if (effectivePath.startsWith(originalPath + ".")) {
                pendingPath = effectivePath.replace(originalPath + ".", "");
            } else {
                pendingPath = effectivePath.replace(originalPath, "");
            }
            currentAlias = select.getAlias(processedPath, originalAlias != null ? originalAlias.getFacet() : "");
        } else if (!commonPath.isEmpty()) {
            // There's a common path with respect to the superquery
            processedPath = commonPath;
            // Strip the originalPath off the effectivePath and thus obtain the pendingPath
            if (effectivePath.startsWith(processedPath + ".")) {
                pendingPath = effectivePath.replace(processedPath + ".", "");
            } else {
                pendingPath = effectivePath.replace(processedPath, "");
            }
            String processedPathReachedFacet = Constants.pathTargetClass(parameterClass, processedPath, true);
            currentAlias = select.getAlias(processedPath, processedPathReachedFacet);
        } else {
            // There's no common path
            // 'processedPath' is 'parameterName'
            pendingPath = rolePath;
            currentAlias = select.getAliasByParameter(parameterName);
        }
    }
    
    private String stripInitialOVParameter(String path) {
        int pointIndex = path.indexOf('.');
        return (pointIndex != -1 ? path.substring(pointIndex + 1) : "");
    }

    private void checkIfParameterAppearsInAliasList(String parameterName, String parameterClass, IOid parameterValue)
            throws SystemException {
        SQLAlias parameterAlias = select.getAliasByParameter(parameterName);
        // If Alias doesn't exist create a new one and add a new From to the SQL sentence
        if (parameterAlias == null) {
            String sourceTable = Constants.nameTable(parameterClass);
            parameterAlias = select.createAlias(parameterName, parameterClass, parameterName, false,
                    null);
            // Assign the parameter name to the Alias
            parameterAlias.setAssignedParameterName(parameterName);
            select.createFrom(sourceTable, parameterAlias);

            // Fix the parameter value. Add the Where part and the SQL parameters
            fixInstance(parameterAlias, parameterValue);
        }
    }

    private void addFieldToSelectPart(SQLAlias attributeAlias, String fieldName, boolean isAscending) {
        String fieldPath = attributeAlias.getAlias() + "." + fieldName;
        items.add(new SQLOrderByItem(fieldPath, isAscending));
        // Add the Item to the select part of the sentence
        this.getSelect().addToSelectPart(fieldPath);

    }

    /**
     * Add to the SQL object the necessary where and parameters in order to fix the received instance
     * @param alias SQLAlias of the instance to be fixed
     * @param oid Instance OID value
     * @throws SystemException with system problems
     */
    public void fixInstance(SQLAlias alias, IOid oid) throws SystemException {

		Collection<String> oidFields = Constants.getOIDFields(alias != null ? alias.getFacet() : "");
		SQLWhereConjunction conjunction = new SQLWhereConjunction();

		String parameterAlias = alias != null ? alias.getAlias() : "";
		for (String field : oidFields) {
			String oidExpression = parameterAlias + "." + field;
		    	SQLWhereComparison comparison = new SQLWhereComparison(select);
		    	comparison.setExplicitComparisonText(oidExpression + " = ?");
		    	conjunction.addComparison(comparison);
		}

		if (oid != null){
			Object[] oidValues = oid.getValue();
			String[] oidDataTypes = oid.getDataTypes();
			for (int i=0;i<oidValues.length;i++) {
				conjunction.addParameter(new SQLParam("", oidValues[i], oidDataTypes[i]));
			}
		} else {
			for (int i=0;i<oidFields.size();i++) {
				conjunction.addParameter(new SQLParam("", null, ""));
			}
		}
		select.addConjunction(conjunction);
    }

    /**
     * SQL Select sentence owning this clause.
     * @return {@link SQLSelect} SQL Select sentence owning this clause
     */
    public SQLSelect getSelect() {
        return select;
    }

    /**
     * Items of this clause.
     * @return {@link Collection}<{@link SQLOrderByItem}> Items of this clause
     */
    public Collection<SQLOrderByItem> getItems() {
        return items;
    }

    /**
     * Text of the ORDER BY clause of an SQL sentence.
     * @return {@link String} Text of the ORDER BY clause of an SQL sentence
     */
    public String getText() {
        StringBuilder itemsText = new StringBuilder("");

        for (SQLOrderByItem item : items) {
            if (!itemsText.toString().isEmpty()) {
                itemsText.append(", ");
            }
            itemsText.append(item.getText());
        }

        if (!itemsText.toString().isEmpty()) {
            itemsText.insert(0, " ORDER BY ");
        }
        
        return itemsText.toString();
    }
}





