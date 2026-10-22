package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface ContratanteJpaRepositoryCustom {

    List<Contratante> solveQuery(SQLSelect query);
    
    List<Contratante> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000(Contratante instance) throws SystemException;

    Boolean assocOperator000Range1(Contratante instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(Contratante instance) throws SystemException;

    Boolean assocOperator001(Contratante instance) throws SystemException;

    Boolean assocOperator001Range1(Contratante instance) throws SystemException;
    
    SQLExists assocOperator001Range1Query(Contratante instance) throws SystemException;

    Boolean assocOperator003(Contratante instance) throws SystemException;

    Boolean assocOperator003Range1(Contratante instance) throws SystemException;
    
    SQLExists assocOperator003Range1Query(Contratante instance) throws SystemException;

    Boolean assocOperator004(Contratante instance) throws SystemException;

    Boolean assocOperator004Range1(Contratante instance) throws SystemException;
    
    SQLExists assocOperator004Range1Query(Contratante instance) throws SystemException;

    Boolean assocOperator006(Contratante instance) throws SystemException;

    Boolean assocOperator006Range1(Contratante instance) throws SystemException;
    
    SQLExists assocOperator006Range1Query(Contratante instance) throws SystemException;

    Boolean assocOperator007(Contratante instance) throws SystemException;

    Boolean assocOperator007Range1(Contratante instance) throws SystemException;
    
    SQLExists assocOperator007Range1Query(Contratante instance) throws SystemException;

    Boolean assocOperator010(Contratante instance) throws SystemException;

    Boolean assocOperator010Range1(Contratante instance) throws SystemException;
    
    SQLExists assocOperator010Range1Query(Contratante instance) throws SystemException;

    Boolean assocOperator011(Contratante instance) throws SystemException;

    Boolean assocOperator011Range1(Contratante instance) throws SystemException;
    
    SQLExists assocOperator011Range1Query(Contratante instance) throws SystemException;

    public List<Contratante> executeQuery(String query);

    public List<Contratante> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
