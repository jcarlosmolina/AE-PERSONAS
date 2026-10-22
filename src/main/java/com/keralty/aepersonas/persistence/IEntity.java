package com.keralty.aepersonas.persistence;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.persistence.oid.IOid;
import com.keralty.aepersonas.utils.QueryContext;

/**
 * Interface for the entity classes of the system.
 */
public interface IEntity extends Serializable {

    /**
     * Provides the getter method of the <code>attribute</code> attribute.
     * It is used to retrieve the value of the attributes present in a display set.
     *
     * @param attribute the attribute name which getter method must be returned.
     *
     * @return the getter Method for the given attribute or null if the attribute does not exist.
     */
    Method getMethod(String attribute);

    /**
     * Returns the {@link IOid} object that identifies this instance.
     * @return {@link IOid} object that identifies this instance.
     */
	IOid getOid();

    /**
     * Returns true if this instance can be observed by the connected agent.
     * @param agent Connected agent instance
     * @return TRUE if the connected agent can observe this instance. FALSE otherwise.
     */
    boolean checkHorizontalVisibility(IEntity agent);
    
    /**
     * Check the visibility of an element.
     * @param expression element over the visibility is checked
     * @return TRUE if the element is visible, FALSE otherwise.
     */
    boolean isVisible(String expression);

    /**
     * Checks Integrity Constraints defined in the class this entity is an instance of.
     * Raises an exception whenever an Integrity Constraint does not hold
     *
     * @throws ModelException if an integrity constraint isn't fulfilled.
     * @throws SystemException if any errors occurs on having checked integrity constraints.
     */
    void checkIntegrityConstraints() throws ModelException, SystemException;

    /**
     * Sets the current execution context.
     * @param serCtx Query context for setting.
     */
    void setServiceContext(QueryContext serCtx);


    /**
     * Returns true if this instance is null.
     * @return true if is null, false otherwise.
     */
    boolean isNull();

    /**
	 * Returns a Map with the values of the attributes.
	 * 
	 * @return Map with the values of the attributes.
	 */
	Map<String, Object> getValues();

    /**
     * Clean the derived attributes of the class
     * @throws SystemException if a system error occurs.
     */
    void cleanDerivations() throws SystemException;


    /**
     * Returns the data type of the <code>attribute</code>.
     *
     * @param attribute the attribute name whose data type name is to be returned.
     *
     * @return the data type name of the given attribute or null if the attribute does not exist.
     */
    String getAttributeType(String attribute);

    /**
     * Returns an ArrayList with the active facets.
     * @return ArrayList with the active facets.
     */
    List<String> getActiveFacets();
}
