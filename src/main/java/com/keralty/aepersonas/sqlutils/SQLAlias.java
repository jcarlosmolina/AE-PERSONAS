package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.global.Constants;

/**
 * This class represents an alias in the SQL statement.
 */
public class SQLAlias {

    /** If the table represents an intermediate table. */
    private Boolean intermediate;

    /** Path represented. */
    private String path;

    /** Target facet of the path. */
    private String facet;

    /** Alias of the path. */
    private String alias;

    /** Pointer to the FROM part. */
    private SQLFrom sqlFrom;

    /** Object valued Parameter name, its instance value has been fixed using this Alias. */
    private String assignedParameterName;

    /** Counter for the multivalued path used by this Alias in left side in the Join. */
    private Integer leftMultiCounter;

    /** Counter for the multivalued path used by this Alias in right side in the Join. */
    private Integer rightMultiCounter;

    /** Join list used by this Alias. */
    private List<SQLJoin> joinList;

    /**
     * Constructor of the alias structure. It initializes the default values.
     * @param path Path that represents the alias
     * @param facet Target facet of the path of the alias
     * @param intermediate If the alias represents an intermediate table (multivalued table)
     * @param alias Alias name
     */
    public SQLAlias(String path, String facet, Boolean intermediate, String alias) {
        this.intermediate = intermediate;
        this.path = path.replace('$', '.');
        this.facet = facet;
        this.alias = alias;
        this.sqlFrom = null;
        this.assignedParameterName = "";
        leftMultiCounter = 0;
        rightMultiCounter = 0;
        joinList = new ArrayList<>();
    }

    /**
     * This returns if the alias represents an intermediate table (multivalued table).
     * @return If the alias represents an intermediate table (multivalued table)
     */
    public Boolean getIntermediate() {
        return intermediate;
    }

    /**
     * This method returns the path that represents the alias.
     * @return Path of the alias
     */
    public String getPath() {
        return path;
    }

    /**
     * Set the Alias path.
     * @param path String that represents the alias
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method returns the target facet of the path.
     * @return Target facet
     */
    public String getFacet() {
        return facet;
    }

    /**
     * this method returns the alias name.
     * @return Alias name
     */
    public String getAlias() {
        return alias;
    }

    /**
     * this method returns the sqlFrom.
     * @return SQLFrom sqlFrom
     */
    public SQLFrom getSqlFrom() {
        return sqlFrom;
    }

    /**
     * this method sets the sqlFrom.
     * @param sqlFrom sqlFrom
     */
    public void setSqlFrom(SQLFrom sqlFrom) {
        this.sqlFrom = sqlFrom;
    }

    /**
     * Gets the name of assigned parameter.
     * @return {@link String}
     */
    public String getAssignedParameterName() {
        return assignedParameterName;
    }

    /**
     * Sets name of assigned parameter name.
     * @param assignedParameterName String that represents the assigned parameter name
     */
    public void setAssignedParameterName(String assignedParameterName) {
        this.assignedParameterName = assignedParameterName;
    }

    /**
     * Gets right multicounter number.
     * @return {@link Integer}
     */
    public Integer getRightMultiCounter() {
        return rightMultiCounter;
    }

    /**
     * Gets left multicounter number.
     * @return {@link Integer}
     */
    public Integer getLeftMultiCounter() {
        return leftMultiCounter;
    }

    /**
     * Copy the counters from alias.
     * @param alias Alias
     */
    public void copyCounters(SQLAlias alias) {
        if (alias == null) {
            return;
        }

        this.leftMultiCounter = alias.getLeftMultiCounter();
        this.rightMultiCounter = alias.getRightMultiCounter();
    }

    /**
     * Increase the counters based on the join and set if the DISTINCT clause is needed.
     * @param join SQLJoin join to be added to the join list
     * @return True if the select requiers a DISTINCT clause, FALSE in any other case
     */
    public Boolean increaseCounters(SQLJoin join) {
        Boolean lReturn = false;
        if (join != null) {

            // Add the join to the list
            joinList.add(join);

            if (join.getRightSideMultivaluated()) {
                this.rightMultiCounter++;
            }
            if (join.getLeftSideMultivaluated()) {
                this.leftMultiCounter++;
            }

            // Check if Select requires a DISTINCT clause
            if (join.getLeftSideMultivaluated() && (!join.getRightSideMultivaluated() && this.rightMultiCounter > 0)
            || (join.getRightSideMultivaluated() && this.rightMultiCounter > 1)) {
                lReturn = true;
            }
        }
        return lReturn;
    }

    /**
     * Set all the join of this alias to INNER JOIN type.
     */
    public void setJoinsToInnerType() {
        for (SQLJoin join : joinList) {
            join.setJoinType(Constants.INNERJOIN);
        }
    }
}



