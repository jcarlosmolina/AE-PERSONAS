package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLSum;
import java.util.List;

public interface BeneficiarioCJpaRepositoryCustom {

    List<BeneficiarioC> solveQuery(SQLSelect query);
    
    List<BeneficiarioC> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);
    
    Long nextBeneficiarioCID(Long contratoCContratoCID);

    Double assocOperator000(BeneficiarioC instance) throws SystemException;

    Double assocOperator000Range1(BeneficiarioC instance) throws SystemException;
    
    SQLSum assocOperator000Range1Query(BeneficiarioC instance) throws SystemException;

    Double assocOperator001(BeneficiarioC instance) throws SystemException;

    Double assocOperator001Range1(BeneficiarioC instance) throws SystemException;
    
    SQLSum assocOperator001Range1Query(BeneficiarioC instance) throws SystemException;

    Double assocOperator002(BeneficiarioC instance) throws SystemException;

    Double assocOperator002Range1(BeneficiarioC instance) throws SystemException;
    
    SQLSum assocOperator002Range1Query(BeneficiarioC instance) throws SystemException;

    Double assocOperator003(BeneficiarioC instance) throws SystemException;

    Double assocOperator003Range1(BeneficiarioC instance) throws SystemException;
    
    SQLSum assocOperator003Range1Query(BeneficiarioC instance) throws SystemException;

    Double assocOperator004(BeneficiarioC instance) throws SystemException;

    Double assocOperator004Range1(BeneficiarioC instance) throws SystemException;
    
    SQLSum assocOperator004Range1Query(BeneficiarioC instance) throws SystemException;

    Double assocOperator005(BeneficiarioC instance) throws SystemException;

    Double assocOperator005Range1(BeneficiarioC instance) throws SystemException;
    
    SQLSum assocOperator005Range1Query(BeneficiarioC instance) throws SystemException;

    Double assocOperator006(BeneficiarioC instance) throws SystemException;

    Double assocOperator006Range1(BeneficiarioC instance) throws SystemException;
    
    SQLSum assocOperator006Range1Query(BeneficiarioC instance) throws SystemException;

    Double assocOperator007(BeneficiarioC instance) throws SystemException;

    Double assocOperator007Range1(BeneficiarioC instance) throws SystemException;
    
    SQLSum assocOperator007Range1Query(BeneficiarioC instance) throws SystemException;

    Boolean assocOperator008(BeneficiarioC instance) throws SystemException;

    Boolean assocOperator008Range1(BeneficiarioC instance) throws SystemException;
    
    SQLExists assocOperator008Range1Query(BeneficiarioC instance) throws SystemException;

    Boolean assocOperator009(BeneficiarioC instance) throws SystemException;

    Boolean assocOperator009Range1(BeneficiarioC instance) throws SystemException;
    
    SQLExists assocOperator009Range1Query(BeneficiarioC instance) throws SystemException;

    public List<BeneficiarioC> executeQuery(String query);

    public List<BeneficiarioC> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
