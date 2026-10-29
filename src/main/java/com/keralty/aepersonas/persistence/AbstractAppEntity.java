package com.keralty.aepersonas.persistence;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Agent;
import com.keralty.aepersonas.utils.QueryContext;
import com.keralty.aepersonas.utils.Utilities;

import io.quarkus.arc.Arc;

/**
 * <code>AbstractAppEntity</code> represents a concrete type of entity
 */
public abstract class AbstractAppEntity implements IEntity {
    private static final long serialVersionUID = 1L;
    
    /** Auxiliary constants **/
    private static final String PATH_SEPARATOR = ".";

    /** Class query context. */
    private QueryContext serCtx;

    /**
     * Returns the context
     * 
     * @return The context.
     */
    @JsonIgnore
    public QueryContext getSerCtx() {
    	if (serCtx == null) {
    		serCtx = buildQueryContext();
    	}
    	return serCtx;
    }
    
    private QueryContext buildQueryContext() {
    	QueryContext queryContext = new QueryContext();
    	queryContext.setAgent(getAgent());
    	return queryContext;
    }
    
    private transient Agent agent;
    
    @JsonIgnore
    protected Agent getAgent() {
    	if (agent == null) {
            agent = Arc.container().select(Agent.class).get();
    	}
    	return agent;
    }
    
    protected void setAgent(Agent agent) {
    	this.agent = agent;
    }

    /**
     * Sets service context.
     * 
     * @param serCtx The context
     */
	@Override
    public void setServiceContext(QueryContext serCtx) {
        this.serCtx = serCtx;
    }

    /**
     * Clears modified flags.
     * 
     * @throws SystemException If an unexpected error
     */
    public abstract void clearModifiedFlags() throws SystemException;

    /**
     * Compares with a object.
     * 
     * @param obj The entity to compare with
     * @return boolean
     */
    public boolean equalsObject(Object obj) {
       if (isNull() && obj == null) 
             return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        return Utilities.isEqual(this, (AbstractAppEntity) obj);
    }

    /**
     * Returns true or false if OID object is or is not null.
     * 
     * @return boolean
     */
    @JsonIgnore
	@Override
    public boolean isNull() {
        return getOid() == null || getOid().isNull();
    }

    /**
     * Returns the value of an attribute by name
     * 
     * @param attributeName Name of the attribute
     * @return Value of the attribute whose name is passed as argument
     */
    public Object getAttribute(String attributeName) {
        Object attributeValue = null;
        List<String> pathItems = Arrays.asList(attributeName.split("\\."));
        AbstractAppEntity currentInstance = this;
        int itemCount = 0;
        for (String pathItem : pathItems) {
            itemCount++;
            boolean isLastItem = itemCount == pathItems.size();
            Object pathItemValue = (currentInstance != null
                    ? getMethodValue(currentInstance, getMethod(currentInstance, buildMethodName(currentInstance, pathItem, isLastItem)))
                    : null);
            if (isLastItem) {
                attributeValue = getAttributeValue(pathItemValue);
            } else {
            	AbstractAppEntity roleValue = getRoleValue(pathItemValue);
                currentInstance = (roleValue != null && !roleValue.isNull() ? (AbstractAppEntity) pathItemValue : null);
            }
        }
        return attributeValue;
    }

    private String buildMethodName(AbstractAppEntity currentInstance, String pathItem, boolean isLastItem) {
    	return "get" + (isLastItem && currentInstance != null ? currentInstance.getOid().getDefinitionClass() : "") + pathItem.replace("_", "");
    }
    
    private Object getAttributeValue(Object pathItemValue) {
    	return (pathItemValue instanceof AbstractAppEntity
                ? ((AbstractAppEntity) pathItemValue).getOid().toJson()
                : pathItemValue);
    }
    
    private AbstractAppEntity getRoleValue(Object pathItemValue) {
    	return pathItemValue != null ? (AbstractAppEntity)pathItemValue : null;
    }
    
    private Method getMethod(AbstractAppEntity entity, String methodName) {
        Method method = null;
        try {
            for (Method candidate : entity.getClass().getDeclaredMethods()) {
                if (candidate.getName().equalsIgnoreCase(methodName)) {
                    method = candidate;
                    method.setAccessible(true);
                }
            }
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            method = null;
        }
        return method;
    }

    private Object getMethodValue(AbstractAppEntity entity, Method method) {
        Object methodValue;
        try {
            methodValue = (entity != null && method != null ? method.invoke(entity) : null);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            methodValue = null;
        }
        return methodValue;
    }

    public boolean hasRelation(String relationName) {
        return getRelationMethod(relationName) != null;
    }

    public boolean isUnivaluedRelation(String relationName) {
        Method relationGetter = getRelationMethod(relationName);
        return (relationGetter != null && relationGetter.getReturnType().getName().startsWith("Collection"));
    }

    public Method getRelationMethod(String relationName) {
        return getMethod(this, "get" + relationName);
    }

    public AbstractAppEntity getRelatedInstance(String relationName) {
        return (AbstractAppEntity) getMethodValue(this, getRelationMethod(relationName));
    }

    @SuppressWarnings("unchecked")
    public Collection<AbstractAppEntity> getRelatedInstances(String relationName) {
        Object value = getMethodValue(this, getRelationMethod(relationName));
        if (value != null) {
            if (value instanceof AbstractAppEntity) {
                Collection<AbstractAppEntity> results = new ArrayList<>();
                results.add((AbstractAppEntity) value);
                return results;
            } else {
                return (Collection<AbstractAppEntity>) value;
            }
        }
        return new ArrayList<>();
    }
    
    /**
     * Check the visibility of an element.
     * @param expression element over the visibility is checked
     * @return TRUE if the element is visible, FALSE otherwise.
     */
	@Override
    public boolean isVisible(String expression) {
        boolean returnValue = false;
        
        if (expression.length() == 0) {
            returnValue = true;
        }

        if (getSerCtx() == null) {
            returnValue = false;
        }

        String pendingExpression = expression;
        int pointIndex = pendingExpression.indexOf(PATH_SEPARATOR);
        if (pointIndex < 0) {
            pointIndex = 0;
        }
        // Items in expression
        while (pointIndex >= 0) {
            String item = "";
            if (pointIndex > 0) {
                item = pendingExpression.substring(0, pointIndex);
                pendingExpression = pendingExpression.substring(pointIndex + 1);
                returnValue = isRelatedItemVisible(item, pendingExpression);
            } else {
                item = pendingExpression;
                pendingExpression = "";
                returnValue = isAttributeVisible(item);
            }
            pointIndex = pendingExpression.indexOf(PATH_SEPARATOR);
        }
        return returnValue;
    }
    
    protected boolean isAttributeVisible(String item) {
    	// To be overridden/implemented in specific classes
        return !item.isEmpty();
    }
    
    private boolean isRelatedItemVisible(String item, String pendingExpression) {
        return isRelatedItemVerticallyVisible(item)
            && isRelatedItemHorizontallyVisible(item, pendingExpression);
    }

    protected boolean isRelatedItemVerticallyVisible(String item) {
        // To be overridden/implemented in specific classes
        return !item.isEmpty();
    }
    
    private boolean isRelatedItemHorizontallyVisible(String item, String pendingExpression) {
        AbstractAppEntity relatedInstance = getRelatedInstance(item);
        return relatedInstance != null
            && relatedInstance.checkHorizontalVisibility(getAgent().getAgentInstance())
            && relatedInstance.isVisible(pendingExpression);
    }
    
    /**
     * Provides the getter method of the <code>attribute</code> attribute.
     * It is used to retrieve the value of the attributes present in a display set.
     * @param attribute the attribute name whose getter method must be returned
     * @return the getter Method for the given attribute or null if the attribute getter does not exist
     */
	@Override
    public Method getMethod(String attribute) {
        Method methodToReturn = null;
        String methodToLookFor = "get" + attribute;
        String alternateMethodToLookFor = "get" + this.getOid().getDefinitionClass() + attribute;
        for (Method method : getMethods()) {
            if (methodToLookFor.equalsIgnoreCase(method.getName())
                || alternateMethodToLookFor.equalsIgnoreCase(method.getName())) {
                methodToReturn = method;
            }
        }
         
        return methodToReturn;
    }
     
    @JsonIgnore
    protected Method[] getMethods() {
        return new Method[0];
    }
     
    /**
     * Returns the data type of the <code>attribute</code>.
     * @param attribute the attribute name whose data type name is to be returned.
     * @return the data type name of the given attribute or null if the attribute does not exist.
     */
	@Override
    public String getAttributeType(String attribute) {
   	    String returnedType = "";
   	    if (attribute.contains(PATH_SEPARATOR)) {
            String role = attribute.substring(0, attribute.indexOf(PATH_SEPARATOR));
            String remainingattribute = attribute.substring(attribute.indexOf(PATH_SEPARATOR) + 1);
            returnedType = getAttributeTypeRelated(role, remainingattribute);
   	    } else {
            returnedType = getClassAttributeType(attribute);
            // If the attribute does not exist, return "String" as the default type
            if (returnedType == null || returnedType.isEmpty())
                returnedType = Constants.Type.STRING.getTypeName();
   	    }
   	    return returnedType; 
    }

    /**
     * Returns the data type of the <code>attribute</code> defined in <code>role</code>.
     * @param role the owner class of the attribute.
     * @param attribute the attribute name whose data type name is to be returned.
     * @return the data type name of the given attribute or null if the attribute does not exist.
     */
    public String getAttributeTypeRelated(String role, String attribute) {
        // To be overridden/implemented in specific classes
        return role + attribute;
    }

    protected String getClassAttributeType(String attribute) {
        // To be overridden/implemented in specific classes
        return attribute;
    }
}
