package com.keralty.aepersonas.utils;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.IEntity;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * Holds the information about the execution of a query.
 */
public class QueryContext implements Serializable {

    private static final long serialVersionUID = 1L;

    private transient Agent agent;

    private Map<String,IEntity> activeEntities;

    private int blockSize;

    private IOid frontierOid;

    private int numInstances;


    /**
     * Empty constructor
     */
    public QueryContext(){
        blockSize = 0;
        frontierOid = null;
        numInstances = 0;
    }

    /**
     * Creates a Query Context with agent object as connected agent.
     * @param agent Connected agent info.
     * @throws SystemException in case of any error
     */
    public QueryContext(Agent agent) throws SystemException{
        this.agent = agent;        
        initialize();
        if (agent != null)
            this.agent.calculateActiveFacets();
        blockSize = 0;
        frontierOid = null;
        numInstances = 0;
    }
     
    /**
     * Gets the connected agent.
     * @return the connected agent.
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * Sets the connected agent.
     * @param agent the connected agent.
     */
    public void setAgent(Agent agent) {
        this.agent = agent;
    }
    
    /**
     * The block size
     * @return The block size.
     */
    public int getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the block size.
     * @param blockSize The block size.
     */
    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }  
    
    /**
     * The frontier OID
     * @return the frontier OID.
     */
    public IOid getFrontierOID() {
        return frontierOid;
    }

    /**
     * Sets the frontier OID.
     * @param frontierOid the frontier OID.
     */
    public void setFrontierOID(IOid frontierOid) {
        this.frontierOid = frontierOid;
    }
    
    /**
     * The number of instances
     * @return The number of instances.
     */
    public int getNumInstances() {
        return numInstances;
    }

    /**
     * Sets the number of instances.
     * @param numInstances The number of instances.
     */
    public void setNumInstances(int numInstances) {
        this.numInstances = numInstances;
    }  

    /**
     * Initialize the data source for queries
     * @throws SystemException in case of any error
     */
    protected void initialize() throws SystemException {
        try {
            activeEntities = new HashMap<>();
        } catch(Exception e) {
            throw new SystemException(e);
        }
    }

    /**
     * Gets the collection of entities that have participated in the execution of the service.
     * @return a collection of entities.
     */
    public List<IEntity> getActiveEntities() {
        return new ArrayList<>(activeEntities.values());
    }

    /**
     * Gets the active entity that has participated in the execution of the service.
     * @param activeEntity IEntity to obtain of the active entity collection
     * @throws SystemException in case of any error
     * @return a collection of entities.
     */
    public IEntity getActiveEntity(IEntity activeEntity) throws SystemException {
        IEntity entityToReturn;
        if (activeEntity == null || activeEntity.isNull()) {
            entityToReturn = activeEntity;
        } else {
            IEntity newActiveEntity = this.activeEntities.get(activeEntity.getClass().getName() + activeEntity.getOid().toString());

            if (newActiveEntity != null) {
            	newActiveEntity.cleanDerivations();
            	entityToReturn = newActiveEntity;
            } else {
            	entityToReturn = activeEntity;
            }
        }
        if (entityToReturn != null) {
            entityToReturn.setServiceContext(this);
        }
        return entityToReturn;
    }

    /**
     * Sets an entity that has participated in the execution of the service.
     * @param activeEntity the collection of participant entities.
     */
    public void setActiveEntity(IEntity activeEntity) {
        this.activeEntities.put(activeEntity.getClass().getName() + activeEntity.getOid().toString(),activeEntity);
    }

    /**
     * Deletes an entity that has participated in the execution of the service.
     * @param activeEntity the collection of participant entities.
     */

    public void delActiveEntity(IEntity activeEntity) {
    	this.activeEntities.values().remove(activeEntity);

    }

    /**
     * Clears the ActiveEntity list
     */
    public void clearActiveEntities() {
        activeEntities.clear();
    }

    /**
     * If the connected agent is "facet" return the corresponding instance, in other case returns an empty instance.
     * @param facet name of the agent name.
     * @return the connected agent instance if the connected agent is "facet", empty instance in other case.
     */
    public IEntity getAgentInstance(String facet) {
        IEntity agentToReturn = null;  
        try {
            Class<?> classFacet = Class.forName("com.keralty.aepersonas.utils.persistence." + facet);

            IEntity agentInstance = getAgent().getAgentInstance(facet);
            if (agentInstance != null)
                agentToReturn = agentInstance;
            else {
                Constructor<?> agentConstructor = classFacet.getConstructor();
                agentToReturn = (IEntity) agentConstructor.newInstance();
            }
        } catch (Exception e) {
            agentToReturn = null;
        }
        return agentToReturn; 
    }
}

