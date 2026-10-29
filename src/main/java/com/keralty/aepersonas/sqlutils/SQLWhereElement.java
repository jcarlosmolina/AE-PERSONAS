package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.Collection;

import com.keralty.aepersonas.exception.SystemException;

/**
 * Element of the WHERE clause of an SQL sentence.
 * It may be:
 * - A Comparison
 * - A Conjunction of other elements
 * - A Disjunction of other elements
 *
 */
public class SQLWhereElement {

    private static final String DEFAULT_WHERE_CLAUSE = "";

    /** owning SQLWhereElement element. */
    private SQLWhereElement owningElement;

    /** owned SQLWhereElement elements. */
    private Collection<SQLWhereElement> ownedElements;

    /** SQLWhere clause. */
    private SQLWhere whereClause;

    /**
     * Default constructor.
     */
    public SQLWhereElement() {
        ownedElements = new ArrayList<>();
    }

    /**
     * Creates a new element of a WHERE clause.
     * @param whereClause WHERE clause owning this element
     */
    public SQLWhereElement(SQLWhere whereClause) {
        this.owningElement = null;
        this.whereClause = whereClause;
    }

    /**
     * Creates a new element of a WHERE clause nested in another element.
     * @param owningElement Element of a WHERE clause that owns this element.
     */
    public SQLWhereElement(SQLWhereElement owningElement) {
        this.owningElement = owningElement;
        this.whereClause = owningElement.getWhereClause();
    }

    /**
     * Element owning this one.
     * @return {@link SQLWhereElement} Element owning this one
     */
    protected SQLWhereElement getOwningElement() {
        return owningElement;
    }

    /**
     * Elements owned by this one.
     * @return {@link Collection}<{@link SQLWhereElement}> Elements owned by this one
     */
    protected Collection<SQLWhereElement> getOwnedElements() {
        return ownedElements;
    }

    /**
     * Sets the elements owned by this one.
     * @param ownedElements Elements owned by this one
     */
    protected void setOwnedElements(Collection<SQLWhereElement> ownedElements) {
        this.ownedElements = ownedElements;
    }

    /**
     * WHERE clause owning this element.
     * @return {@link SQLWhere} WHERE clause owning this element
     */
    protected SQLWhere getWhereClause() {
        SQLWhere whereToReturn = null;
        if (owningElement == null) {
            whereToReturn = whereClause;
        } else {
            whereToReturn = owningElement.getWhereClause();
        }
        return whereToReturn; 
    }

    /**
     * Text corresponding to this element of a WHERE clause.
     * @return {@link String} Text of this element of a WHERE clause
     * @throws SystemException if any system error raised during the execution of the method.
     */
    public  String getText() throws SystemException {
        return DEFAULT_WHERE_CLAUSE;
    }
}
