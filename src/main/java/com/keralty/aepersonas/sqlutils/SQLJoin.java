package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import com.keralty.aepersonas.global.Constants;

/**
 * This class represents a join in a from clause in the SQL statement.
 */
public class SQLJoin {

    /** Name of the table. */
    private String table;

    /** Alias of the path. */
    private String alias;

    /** Path */
    private String path;
    
    /** Type of the Join (Inner JOIN or LeftJoin). */
    private String jointype;

    /** Indicates if the left side of the join is multi-valued. Used to add the DISTINCT in the select. */
    private Boolean leftSideMultivaluated;

    /** Indicates if the right side of the join is multi-valued. Used to add the DISTINCT in the select. */
    private Boolean rightSideMultivaluated;

    /** Collection of the where. */
    private Collection<String> wheres = new ArrayList<>();

    /**
     * Constructor of the class. It initializes the default values.
     * @param jointype Type of join ("INNER JOIN" or "LEFT JOIN")
     * @param table Name of the target table of the join
     * @param previousAlias Alias of the source table of the join
     * @param currentAlias Alias of the target table of the join
     */
    public SQLJoin(String jointype, String table, SQLAlias previousAlias, SQLAlias currentAlias) {
    	this.table = table;
    	this.alias = currentAlias.getAlias();
    	this.jointype = jointype;
    	this.wheres = new ArrayList<>();
    	this.leftSideMultivaluated = false;
        this.rightSideMultivaluated = false;
    	
    	boolean samePath = previousAlias.getPath().equalsIgnoreCase(currentAlias.getPath());
    	boolean differentFacets = !previousAlias.getFacet().equalsIgnoreCase(currentAlias.getFacet());
    	
    	if (!currentAlias.getPath().isEmpty() &&
    		!(samePath && differentFacets)){

	    	String currentAliasPath = currentAlias.getPath();
	    	if (currentAliasPath.startsWith(previousAlias.getPath() + '.')) {
	    		currentAliasPath = currentAliasPath.replace(previousAlias.getPath() + '.', "");
	    	}
	    	String partialPath = currentAliasPath.substring(0, 1).toLowerCase() + currentAliasPath.substring(1);
	    	this.path = previousAlias.getAlias() + "." + partialPath;
    	} else {
    		List<String> sequence;
    		try {
    			sequence = Constants.getFacetsGetterSequence(previousAlias.getFacet(), currentAlias.getFacet());
    		} catch (Exception e) {
    			sequence = new ArrayList<>();
    		}
            StringBuilder partialPath = new StringBuilder(previousAlias.getAlias());
    		for(String facetGetter : sequence){
                partialPath.append("." + facetGetter);
    		}
            this.path = partialPath.toString();
    	}
    }
    
    /**
     * This method returns the join type of the join.
     * @return {@link String} Join type
     */
    public String getJoinType() {
        return jointype;
    }

    /**
     * Set the join type. Inner or Left.
     * @param jointype Join Type
     */
    public void setJoinType(String jointype) {
        this.jointype = jointype;
    }
    
    /**
     * Adds a new where condition to the list of where clause 
     * @param where Condition to add
     */
    public void addWhere(String where) {
    	wheres.add(where);
    }

    /**
     * This method returns the list of where conjunctions of the join (conditions in the ON clause).
     * @return {@link Collection}<{@link String}>
     */
    public Collection<String> getWheres() {
        return wheres;
    }

    /**
     * This methods returns the name of the target table of the join.
     * @return {@link String} Table name
     */
    public String getTable() {
        return table;
    }

    /**
     * This method returns the alias of the target table of the join.
     * @return {@link String}
     */
    public String getAlias() {
        return alias;
    }

    /** This method returns the path to the target entity of the join.
     * @return path to the target entity of the join
     */
    public String getPath() {
    	return path;
    }
    
    /**
     * Returns if the left side of the join is multi-valued.
     * @return {@link Boolean}
     */
    public Boolean getLeftSideMultivaluated() {
        return leftSideMultivaluated;
    }

    /**
     * Indicates if the left side of the join is multi-valued.
     * @param leftSideMultivaluated true if the left side of the join is multi-valued, false in other case
     */
    public void setLeftSideMultivaluated(Boolean leftSideMultivaluated) {
        this.leftSideMultivaluated = leftSideMultivaluated;
    }

    /**
     * Returns if the right side of the join is multi-valued.
     * @return {@link Boolean}
     */
    public Boolean getRightSideMultivaluated() {
        return rightSideMultivaluated;
    }

    /**
     * Indicates if the right side of the join is multi-valued.
     * @param rightSideMultivaluated true if the right side of the join is multi-valued, false in other case
     */
    public void setRightSideMultivaluated(Boolean rightSideMultivaluated) {
        this.rightSideMultivaluated = rightSideMultivaluated;
    }
}

