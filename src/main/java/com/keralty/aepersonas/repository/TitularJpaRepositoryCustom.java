package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface TitularJpaRepositoryCustom {

    List<Titular> solveQuery(SQLSelect query);
    
    List<Titular> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000(Titular instance) throws SystemException;

    Boolean assocOperator000Range1(Titular instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(Titular instance) throws SystemException;

    Boolean assocOperator001(Titular instance) throws SystemException;

    Boolean assocOperator001Range1(Titular instance) throws SystemException;
    
    SQLExists assocOperator001Range1Query(Titular instance) throws SystemException;

    Boolean assocOperator003(Titular instance) throws SystemException;

    Boolean assocOperator003Range1(Titular instance) throws SystemException;
    
    SQLExists assocOperator003Range1Query(Titular instance) throws SystemException;

    Boolean assocOperator004(Titular instance) throws SystemException;

    Boolean assocOperator004Range1(Titular instance) throws SystemException;
    
    SQLExists assocOperator004Range1Query(Titular instance) throws SystemException;

    Boolean assocOperator006(Titular instance) throws SystemException;

    Boolean assocOperator006Range1(Titular instance) throws SystemException;
    
    SQLExists assocOperator006Range1Query(Titular instance) throws SystemException;

    Boolean assocOperator007(Titular instance) throws SystemException;

    Boolean assocOperator007Range1(Titular instance) throws SystemException;
    
    SQLExists assocOperator007Range1Query(Titular instance) throws SystemException;

    Boolean assocOperator009(Titular instance) throws SystemException;

    Boolean assocOperator009Range1(Titular instance) throws SystemException;
    
    SQLExists assocOperator009Range1Query(Titular instance) throws SystemException;

    Boolean assocOperator010(Titular instance) throws SystemException;

    Boolean assocOperator010Range1(Titular instance) throws SystemException;
    
    SQLExists assocOperator010Range1Query(Titular instance) throws SystemException;

    public List<Titular> executeQuery(String query);

    public List<Titular> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
