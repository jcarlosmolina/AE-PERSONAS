package com.keralty.aepersonas.sqlutils;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import com.keralty.aepersonas.global.Constants;

public class TypedQueryBuilder<T> {

    private EntityManager em;
    private Class<T> t;
    private TypedQuery<T> query;

    public TypedQueryBuilder(EntityManager em, Class<T> t) {
        this.em = em;
        this.t = t;
    }

    public TypedQueryBuilder<T> build(String jpqlQuery) {
        query = em.createQuery(jpqlQuery, t);
        return this;
    }

    public TypedQueryBuilder<T> build(SQLSelect select) {
    	return build(select, 0, 0);
    }
    
    public TypedQueryBuilder<T> build(SQLSelect select, int pageSize, int pageNumber) {
        query = em.createQuery(buildQuery(select), t);
        
        if (query == null) {
            return this;
        }

        if (pageSize != 0) {
            query.setFirstResult((pageNumber - 1) * pageSize);
            query.setMaxResults(pageSize);
            ((org.hibernate.query.Query<T>)query).setFetchSize(pageSize);
        }
		
		setParameters(select.getParameters());
		
        return this;
    }

    public TypedQueryBuilder<T> build4Count(SQLSelect select) {
    	query = em.createQuery(buildCountQuery(select), t);
    	return query != null ? setParameters(select.getParameters()) : this;
    }

    public TypedQueryBuilder<T> setParameters(List<SQLParam> params) {
        int i = 1;
        for (SQLParam param : params) {
            setParameter(param, i++);
        }
        return this;
    }

    public List<T> execute() {
        return query != null ? query.getResultList() : new ArrayList<>();
    }
    
    @SuppressWarnings("unchecked")
    public T getSingleResult() {
        return query != null ? getSingleResultOrDefaultValue() : (T)getDefaultValue();
    }

    @SuppressWarnings("unchecked")
    private T getSingleResultOrDefaultValue() {
    	T result = query.getSingleResult();
    	return result != null ? result : (T)getDefaultValue();
    }

    private Object getDefaultValue() {
    	switch (t.getSimpleName()) {
    		case "Long":
    			return Long.valueOf(0);
    		case "Double":
    			return Double.valueOf(0);
    		case "String":
    			return "";
    		case "Boolean":
    			return false;
    		case "Date":
    			return Date.valueOf(Constants.DATE_DEFAULTVALUE);
    		case "Time":
    			return Time.valueOf(Constants.TIME_DEFAULTVALUE);
    		case "Timestamp":
    			return Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
    		default:
    			return null;
    	}
    }

    private String buildQuery(SQLSelect select) {
        String jpqlQuery;
        try {
            jpqlQuery = returnsScalarValue(select) ? select.getSQLSentence() : select.getJPQLSentence();
        } catch (Exception e) {
            jpqlQuery = "";
        }
        return jpqlQuery;
    }

    private String buildCountQuery(SQLSelect select) {
        String jpqlQuery;
        try {
            jpqlQuery = select.getSQLSentence();
        } catch (Exception e) {
            jpqlQuery = "";
        }
        return jpqlQuery;
    }

    private boolean returnsScalarValue(SQLSelect select) {
        return (select instanceof SQLSum || select instanceof SQLMax || select instanceof SQLMin
                || select instanceof SQLAvg || select instanceof SQLGetOne || select instanceof SQLForAllCondition);
    }

    private void setParameter(SQLParam param, int position) {
        if (param.getParamType().equalsIgnoreCase(Constants.Type.NAT.getTypeName())
                || param.getParamType().equalsIgnoreCase(Constants.Type.INT.getTypeName())
                || param.getParamType().equalsIgnoreCase(Constants.Type.AUTONUMERIC.getTypeName())) {
            setIntegerParameter(param, position);
        } else if (param.getParamType().equalsIgnoreCase(Constants.Type.REAL.getTypeName())) {
            setRealParameter(param, position);
        } else {
            query.setParameter(position, param.getParamValue());
        }
    }

    private void setIntegerParameter(SQLParam param, int position) {
        try {
            if (param.getParamValue() instanceof Double) {
                query.setParameter(position, ((Double) param.getParamValue()).intValue());
            } else {
                query.setParameter(position, param.getParamValue());
            }
        } catch (Exception e) {
            if (param.getParamValue() instanceof Double) {
                query.setParameter(position, ((Double) param.getParamValue()).longValue());
            } else {
                query.setParameter(position, (Long) param.getParamValue());
            }
        }
    }

    private void setRealParameter(SQLParam param, int position) {
        try {
            if (param.getParamValue() instanceof Integer) {
                query.setParameter(position, (double) ((Integer) param.getParamValue()).intValue());
            } else {
                query.setParameter(position, param.getParamValue());
            }
        } catch (Exception e) {
            if (param.getParamValue() instanceof Double) {
                query.setParameter(position, ((Double) param.getParamValue()).intValue());
            } else {
                query.setParameter(position, param.getParamValue());
            }
        }
    }
}
