package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class is an structure that represents a from clause in the SQL statement.
 */
public class SQLFrom {

    /**
     * Name of the from table.
     */
    private String table;

    /**
     * Alias of the from table.
     */
    private String alias;

    /**
     * List of joins of this from.
     */
    private Collection<SQLJoin> joins;

    /**
     * Constructor that initializes the member variables.
     */
    public SQLFrom() {
        this.table = "";
        this.alias = "";
        this.joins = new ArrayList<>();
    }

    /**
     * This method returns the from table name.
     * @return Table name
     */
    public String getTable() {
        return table.replace("_", "");
    }

    /**
     * This method sets the table name to the from structure.
     * @param table Table name
     */
    public void setTable(String table) {
        this.table = table;
    }

    /**
     * This method returns the alias or the from table.
     * @return Alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method sets the alias to the from structure.
     * @param alias Alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * This method returns the list of joins.
     * @return List of joins
     */
    public Collection<SQLJoin> getJoins() {
        return joins;
    }
    
    /**
     * Adds all joins to the current list
     * @param joinsToAdd Joins to add
     */
    public void addAllJoins(Collection<SQLJoin> joinsToAdd) {
    	joins.addAll(joinsToAdd);
    }
}




