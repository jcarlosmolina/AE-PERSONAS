package com.keralty.aepersonas.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import com.keralty.aepersonas.sqlutils.NativeQueryBuilder;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;

@ApplicationScoped
public class GenericRepository {

    @PersistenceContext
    EntityManager em;

    public List<Object> solveQuery(SQLSelect query) {
        return new NativeQueryBuilder(em).build(query).execute();
    }

    public List<Object> solveQuery(SQLSelect query, List<SQLParam> params) {
        return new NativeQueryBuilder(em).build(query).setParameters(params).execute();
    }
    
    public Object solveNativeScalarQuery(String queryText) {
    	return new NativeQueryBuilder(em).build(queryText).getSingleResult();
    }
    
    public Object solveNativeScalarQuery(String queryText, List<SQLParam> params) {
    	return new NativeQueryBuilder(em).build(queryText).setParameters(params).getSingleResult();
    }
    
    public List<Object> solveNativeQuery(String queryText) {
    	return new NativeQueryBuilder(em).build(queryText).execute();
    }
    
    public List<Object> solveNativeQuery(String queryText, List<SQLParam> params) {
    	return new NativeQueryBuilder(em).build(queryText).setParameters(params).execute();
    }

    public SPBuilder getSPBuilder() {
    	return new SPBuilder(em);
    }
}

