package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.FamiliaNovedad;
import com.keralty.aepersonas.persistence.UsuarioNovedad;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.Collection;
import java.util.List;

public interface FamiliaNovedadJpaRepositoryCustom {

    List<FamiliaNovedad> solveQuery(SQLSelect query);
    
    List<FamiliaNovedad> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator000Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator001(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator001Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator001Range1Query(FamiliaNovedad instance) throws SystemException;

    Long assocOperator002(FamiliaNovedad instance) throws SystemException;

    Collection<UsuarioNovedad> assocOperator002Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLPopulation assocOperator002Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator003(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator003Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator003Range1Query(FamiliaNovedad instance, SQLSelect superQuery) throws SystemException;

    Boolean assocOperator004(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator004Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator004Range1Query(FamiliaNovedad instance, SQLSelect superQuery) throws SystemException;

    Long assocOperator005(FamiliaNovedad instance) throws SystemException;

    Collection<UsuarioNovedad> assocOperator005Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLPopulation assocOperator005Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator006(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator006Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator006Range1Query(FamiliaNovedad instance, SQLSelect superQuery) throws SystemException;

    Boolean assocOperator007(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator007Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator007Range1Query(FamiliaNovedad instance, SQLSelect superQuery) throws SystemException;

    Boolean assocOperator008(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator008Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator008Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator009(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator009Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator009Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator010(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator010Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator010Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator011(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator011Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator011Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator012(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator012Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator012Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator013(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator013Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator013Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator014(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator014Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator014Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator015(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator015Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator015Range1Query(FamiliaNovedad instance) throws SystemException;

    Long assocOperator016(FamiliaNovedad instance) throws SystemException;

    Collection<UsuarioNovedad> assocOperator016Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLPopulation assocOperator016Range1Query(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator017(FamiliaNovedad instance) throws SystemException;

    Boolean assocOperator017Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLExists assocOperator017Range1Query(FamiliaNovedad instance) throws SystemException;

    Long assocOperator018(FamiliaNovedad instance) throws SystemException;

    Collection<UsuarioNovedad> assocOperator018Range1(FamiliaNovedad instance) throws SystemException;
    
    SQLPopulation assocOperator018Range1Query(FamiliaNovedad instance) throws SystemException;

    public List<FamiliaNovedad> executeQuery(String query);

    public List<FamiliaNovedad> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
