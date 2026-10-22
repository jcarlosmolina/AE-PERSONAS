package com.keralty.aepersonas.sqlutils;

/**
 * Item of an ORDER BY clause in an SQL sentence.
 *
 */
public class SQLOrderByItem {

    /**
     * ORDER BY clause.
     */
    private SQLOrderBy orderByClause;

    /**
     * Order Item Name.
     */
    private String itemName;

    /**
     * Order Item Alias.
     */
    private String itemAlias;

    /**
     * Order criterion sense.
     */
    private Boolean isAscending;

    /**
     * Creates a new item for the ORDER BY clause of an SQL sentence.
     * @param orderByClause Clause owning this item
     * @param itemName Name of the item
     * @param isAscending True if the item is order in ascending sense. False otherwise
     */
    public SQLOrderByItem(SQLOrderBy orderByClause, String itemName, Boolean isAscending) {
        this.orderByClause = orderByClause;
        this.itemName = itemName;
        this.isAscending = isAscending;
        this.itemAlias = "";
    }

    /**
     * Creates a new item for the ORDER BY clause of an SQL sentence.
     * @param itemName Name of the item
     * @param isAscending True if the item is order in ascending sense. False otherwise
     */
    public SQLOrderByItem(String itemName, Boolean isAscending) {
        this.itemName = itemName;
        this.isAscending = isAscending;
        this.itemAlias = "";
    }

    /**
     * ORDER BY clause owning this item.
     * @return {@link SQLOrderBy} ORDER BY clause owning this item
     */
    public SQLOrderBy getOrderByClause() {
        return orderByClause;
    }

    /**
     * Name of the item.
     * @return {@link String} Name of the item
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Alias of the item.
     * @return {@link String} Alias of the item
     */
    public String getItemAlias() {
        return itemAlias;
    }

    /**
     * Ordering sense.
     * @return {@link Boolean} True if sorted in ascending order. False otherwise
     */
    public Boolean getIsAscending() {
        return isAscending;
    }

    /**
     * Text of this item for the ORDER BY clause of an SQL sentence.
     * @return {@link String} Text of this item for the ORDER BY clause of an SQL sentence
     */
    public String getText() {
        String returnText = ""; 
    	if (isAscending) {
    		returnText = itemName + " ASC";
        } else {
        	returnText = itemName + " DESC";
        }
    	return returnText; 
    }
}
