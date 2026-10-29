package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.DireccionC;
import com.keralty.aepersonas.persistence.DirSucursalC;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLGetOne;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.Collection;
import java.util.List;

public interface PersonaCJpaRepositoryCustom {

    List<PersonaC> solveQuery(SQLSelect query);
    
    List<PersonaC> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000(PersonaC instance) throws SystemException;

    Boolean assocOperator000Range1(PersonaC instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(PersonaC instance) throws SystemException;

    String assocOperator001(PersonaC instance) throws SystemException;

    String assocOperator001Range1(PersonaC instance) throws SystemException;
    
    SQLGetOne assocOperator001Range1Query(PersonaC instance) throws SystemException;

    Boolean assocOperator002(PersonaC instance) throws SystemException;

    Boolean assocOperator002Range1(PersonaC instance) throws SystemException;
    
    SQLExists assocOperator002Range1Query(PersonaC instance) throws SystemException;

    String assocOperator003(PersonaC instance) throws SystemException;

    String assocOperator003Range1(PersonaC instance) throws SystemException;
    
    SQLGetOne assocOperator003Range1Query(PersonaC instance) throws SystemException;

    Boolean assocOperator004(PersonaC instance) throws SystemException;

    Boolean assocOperator004Range1(PersonaC instance) throws SystemException;
    
    SQLExists assocOperator004Range1Query(PersonaC instance) throws SystemException;

    String assocOperator005(PersonaC instance) throws SystemException;

    Collection<DireccionC> assocOperator005Range1(PersonaC instance) throws SystemException;
    
    SQLPopulation assocOperator005Range1Query(PersonaC instance) throws SystemException;

    Boolean assocOperator006(PersonaC instance) throws SystemException;

    Boolean assocOperator006Range1(PersonaC instance) throws SystemException;
    
    SQLExists assocOperator006Range1Query(PersonaC instance) throws SystemException;

    String assocOperator007(PersonaC instance) throws SystemException;

    Collection<DirSucursalC> assocOperator007Range1(PersonaC instance) throws SystemException;
    
    SQLPopulation assocOperator007Range1Query(PersonaC instance) throws SystemException;

    Boolean assocOperator008(PersonaC instance) throws SystemException;

    Boolean assocOperator008Range1(PersonaC instance) throws SystemException;
    
    SQLExists assocOperator008Range1Query(PersonaC instance) throws SystemException;

    Boolean assocOperator009(PersonaC instance) throws SystemException;

    Boolean assocOperator009Range1(PersonaC instance) throws SystemException;
    
    SQLExists assocOperator009Range1Query(PersonaC instance) throws SystemException;

    Boolean assocOperator010(PersonaC instance) throws SystemException;

    Boolean assocOperator010Range1(PersonaC instance) throws SystemException;
    
    SQLExists assocOperator010Range1Query(PersonaC instance) throws SystemException;

    Boolean assocOperator011(PersonaC instance) throws SystemException;

    Boolean assocOperator011Range1(PersonaC instance) throws SystemException;
    
    SQLExists assocOperator011Range1Query(PersonaC instance) throws SystemException;

    public List<PersonaC> executeQuery(String query);

    public List<PersonaC> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
