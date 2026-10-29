package com.keralty.aepersonas.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.Query;
import jakarta.persistence.StoredProcedureQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SPBuilder {

    private EntityManager em;
    private StoredProcedureQuery storedProcedure;
    private Query query;
    private String spName;
    private List<SPParameter> spParameters;
	
    public SPBuilder(EntityManager em) {
        this.em = em;
        this.spName = "";
        this.spParameters = new ArrayList<>();
    }

    public SPBuilder createSP(String storedProcedureName) {
        this.storedProcedure = em.createStoredProcedureQuery(storedProcedureName);
        this.spName = storedProcedureName;
        return this;
    }

    public SPBuilder createSP(String storedProcedureName, Class<?> resultClass) {
        this.storedProcedure = em.createStoredProcedureQuery(storedProcedureName, resultClass);
        return this;
    }

    public SPBuilder addInputParameter(String name, Class<?> dataType, Object value) {
        this.spParameters.add(new SPParameter(name, value, SPParameter.INPUT));
        try {
            this.storedProcedure
            .registerStoredProcedureParameter(name, dataType, ParameterMode.IN)
            .setParameter(name, value);
        } catch (Exception e) {
        	return this;
        }
        return this;
    }

    public SPBuilder addOutputParameter(String name, Class<?> dataType) {
        this.spParameters.add(new SPParameter(name, null, SPParameter.OUTPUT));
        this.storedProcedure
        .registerStoredProcedureParameter(name, dataType, ParameterMode.OUT);
        return this;
    }

    public SPBuilder addInputOutputParameter(String name, Class<?> dataType, Object value) {
        this.spParameters.add(new SPParameter(name, value, SPParameter.INOUT));
        try {
            this.storedProcedure
            .registerStoredProcedureParameter(name, dataType, ParameterMode.INOUT)
            .setParameter(name, value);
        } catch (Exception e) {
        	return this;
        }
        return this;
    }

    public SPBuilder addCursorParameter(String name) {
        return addCursorParameter(name, void.class);
    }
    
    public SPBuilder addCursorParameter(String name, Class<?> dataType) {
        try {
            this.storedProcedure
            .registerStoredProcedureParameter(name, dataType, ParameterMode.REF_CURSOR)
            .setParameter(name, null);
        } catch (Exception e) {
             return this;
        }
        return this;
    }    

    public Object getParameterValue(String name) {
        return this.storedProcedure.getParameterValue(name);
    }

    public boolean isOutputParameterValueNull(String name) {
        return this.storedProcedure.getOutputParameterValue(name) == null;
    }

    public Object getOutputParameterValue(String name) {
        return this.storedProcedure.getOutputParameterValue(name);
    }

    @SuppressWarnings("unchecked")
    public List<SPResultRow> executeQuery(List<String> fieldNames) {
        return (List<SPResultRow>) this.storedProcedure.getResultList().stream().map(x -> new SPResultRow((Object[]) x, fieldNames)).collect(Collectors.toList());
    }

    public SPBuilder executeNonQuery() {
        this.storedProcedure.execute();
        return this;
    }

    public Object executeFunction() {
        query = em.createNativeQuery(buildNativeQueryStringForFunction());
        assignParameters();
        return query.getSingleResult();
    }

    public void executeServiceFunction() {
        query = em.createNativeQuery(buildNativeQueryStringForFunction());
        assignParameters();
        query.executeUpdate();
    }

    private String buildNativeQueryStringForFunction() {
        StringBuilder strBuilder = new StringBuilder("SELECT " + this.spName + "(");
        strBuilder.append(declareParameters());
        strBuilder.append(") FROM DUAL");
        return strBuilder.toString();
    }

    @SuppressWarnings("unchecked")
    public List<SPResultRow> executeQueryFunction(List<String> fieldNames) {
        query = em.createNativeQuery(buildNativeQueryStringForQueryFunction());
        assignParameters();
        return (List<SPResultRow>) query.getResultList().stream().map(x -> new SPResultRow((Object[]) x, fieldNames)).collect(Collectors.toList());
    }

    private String buildNativeQueryStringForQueryFunction() {
        StringBuilder strBuilder = new StringBuilder("SELECT " + this.spName + "(");
        strBuilder.append(declareParameters());
        strBuilder.append(") FROM DUAL");
        return strBuilder.toString();
    }

    private String declareParameters() {
        StringBuilder strBuilder = new StringBuilder();
        String separator = "";
        for(SPParameter param : this.spParameters) {
        	if (param.getValue() == null) 
        		strBuilder.append(separator + "NULL");
        	else	
        		strBuilder.append(separator + ":" + param.getName());
            separator = ", ";
        }
        return strBuilder.toString();
    }

    private void assignParameters() {
        for(SPParameter param : this.spParameters) {
        	if (param.getValue() == null) continue;
            query.setParameter(param.getName(), param.getValue());
        }
    }
}
