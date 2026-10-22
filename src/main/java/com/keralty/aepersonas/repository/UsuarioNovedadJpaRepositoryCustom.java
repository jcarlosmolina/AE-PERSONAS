package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.UsuarioNovedad;
import com.keralty.aepersonas.sqlutils.SQLCount;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.Collection;
import java.util.List;

public interface UsuarioNovedadJpaRepositoryCustom {

    List<UsuarioNovedad> solveQuery(SQLSelect query);
    
    List<UsuarioNovedad> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator000Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator001(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator001Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator001Range1Query(UsuarioNovedad instance) throws SystemException;

    Long assocOperator002(UsuarioNovedad instance) throws SystemException;

    Long assocOperator002Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLCount assocOperator002Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator003(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator003Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator003Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator004(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator004Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator004Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator005(UsuarioNovedad instance) throws SystemException;

    Collection<UsuarioNovedad> assocOperator005Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLPopulation assocOperator005Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator006(UsuarioNovedad instance) throws SystemException;

    Collection<UsuarioNovedad> assocOperator006Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLPopulation assocOperator006Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator007(UsuarioNovedad instance) throws SystemException;

    Collection<UsuarioNovedad> assocOperator007Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLPopulation assocOperator007Range1Query(UsuarioNovedad instance) throws SystemException;

    Long assocOperator008(UsuarioNovedad instance) throws SystemException;

    Collection<UsuarioNovedad> assocOperator008Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLPopulation assocOperator008Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator009(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator009Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator009Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator010(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator010Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator010Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator011(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator011Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator011Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator012(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator012Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator012Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator013(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator013Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator013Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator014(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator014Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator014Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator015(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator015Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator015Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator016(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator016Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator016Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator017(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator017Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator017Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator018(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator018Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator018Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator019(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator019Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator019Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator020(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator020Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator020Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator021(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator021Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator021Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator022(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator022Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator022Range1Query(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator023(UsuarioNovedad instance) throws SystemException;

    Boolean assocOperator023Range1(UsuarioNovedad instance) throws SystemException;
    
    SQLExists assocOperator023Range1Query(UsuarioNovedad instance) throws SystemException;

    public List<UsuarioNovedad> executeQuery(String query);

    public List<UsuarioNovedad> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
