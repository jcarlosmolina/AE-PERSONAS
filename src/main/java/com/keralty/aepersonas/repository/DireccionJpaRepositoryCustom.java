package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface DireccionJpaRepositoryCustom {

    List<Direccion> solveQuery(SQLSelect query);
    
    List<Direccion> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000(Direccion instance) throws SystemException;

    Boolean assocOperator000Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator001(Direccion instance) throws SystemException;

    Boolean assocOperator001Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator001Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator003(Direccion instance) throws SystemException;

    Boolean assocOperator003Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator003Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator004(Direccion instance) throws SystemException;

    Boolean assocOperator004Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator004Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator006(Direccion instance) throws SystemException;

    Boolean assocOperator006Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator006Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator007(Direccion instance) throws SystemException;

    Boolean assocOperator007Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator007Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator009(Direccion instance) throws SystemException;

    Boolean assocOperator009Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator009Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator010(Direccion instance) throws SystemException;

    Boolean assocOperator010Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator010Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator012(Direccion instance) throws SystemException;

    Boolean assocOperator012Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator012Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator013(Direccion instance) throws SystemException;

    Boolean assocOperator013Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator013Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator014(Direccion instance) throws SystemException;

    Boolean assocOperator014Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator014Range1Query(Direccion instance) throws SystemException;

    Boolean assocOperator015(Direccion instance) throws SystemException;

    Boolean assocOperator015Range1(Direccion instance) throws SystemException;
    
    SQLExists assocOperator015Range1Query(Direccion instance) throws SystemException;

    public List<Direccion> executeQuery(String query);

    public List<Direccion> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
