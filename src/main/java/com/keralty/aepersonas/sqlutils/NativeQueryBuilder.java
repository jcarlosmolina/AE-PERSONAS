package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import com.keralty.aepersonas.global.Constants;

public class NativeQueryBuilder {

    private EntityManager em;
    private Query query;

    public NativeQueryBuilder(EntityManager em) {
        this.em = em;
    }

    public NativeQueryBuilder build(String queryText) {
        query = em.createNativeQuery(queryText);
        return this;
    }

    public NativeQueryBuilder build(SQLSelect select) {
        query = em.createNativeQuery(buildQuery(select));
        return setParameters(select.getParameters());
    }

    public NativeQueryBuilder setParameters(List<SQLParam> params) {
        int i = 1;
        for (SQLParam param : params) {
            setParameter(param, i++);
        }
        return this;
    }

    public List<Object> execute() {
        List<Object> results = new ArrayList<>();
        for (Object result : query.getResultList()) {
            results.add(result);
        }
        return results;
    }

    public Object getSingleResult() {
        return query.getSingleResult();
    }

    private String buildQuery(SQLSelect select) {
        String jpqlQuery;
        try {
            jpqlQuery = select.getSQLSentence();
        } catch (Exception e) {
            jpqlQuery = "";
        }
        return jpqlQuery;
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
