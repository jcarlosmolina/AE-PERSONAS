package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.CuestionarioMed;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.PreguntaP;
import com.keralty.aepersonas.persistence.Seccion;
import com.keralty.aepersonas.persistence.SeccionP;
import com.keralty.aepersonas.sqlutils.SQLCount;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.Collection;
import java.util.List;

public interface CuestionarioPJpaRepositoryCustom {

    List<CuestionarioP> solveQuery(SQLSelect query);
    
    List<CuestionarioP> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Collection<Seccion> assocOperator000(CuestionarioMed cuestionarioPTCREARYSECCIONESptCuestionario) throws SystemException;

    Collection<Seccion> assocOperator000Range1(CuestionarioMed cuestionarioPTCREARYSECCIONESptCuestionario) throws SystemException;
    
    SQLPopulation assocOperator000Range1Query(CuestionarioMed cuestionarioPTCREARYSECCIONESptCuestionario) throws SystemException;

    Collection<SeccionP> assocOperator001(CuestionarioP instance) throws SystemException;

    Collection<SeccionP> assocOperator001Range1(CuestionarioP instance) throws SystemException;
    
    SQLPopulation assocOperator001Range1Query(CuestionarioP instance) throws SystemException;

    Long assocOperator002(CuestionarioP instance) throws SystemException;

    Long assocOperator002Range1(CuestionarioP instance) throws SystemException;
    
    SQLCount assocOperator002Range1Query(CuestionarioP instance, SQLSelect superQuery) throws SystemException;

    Collection<SeccionP> assocOperator003(CuestionarioP instance) throws SystemException;

    Collection<SeccionP> assocOperator003Range1(CuestionarioP instance) throws SystemException;
    
    SQLPopulation assocOperator003Range1Query(CuestionarioP instance) throws SystemException;

    Collection<PreguntaP> assocOperator005(CuestionarioP instance) throws SystemException;

    Collection<PreguntaP> assocOperator005Range1(CuestionarioP instance) throws SystemException;
    
    SQLPopulation assocOperator005Range1Query(CuestionarioP instance) throws SystemException;

    Boolean assocOperator006(CuestionarioP instance) throws SystemException;

    Boolean assocOperator006Range1(CuestionarioP instance) throws SystemException;
    
    SQLExists assocOperator006Range1Query(CuestionarioP instance) throws SystemException;

    Collection<PreguntaP> assocOperator007(CuestionarioP instance, Long cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta) throws SystemException;

    Collection<PreguntaP> assocOperator007Range1(CuestionarioP instance, Long cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta) throws SystemException;
    
    SQLPopulation assocOperator007Range1Query(CuestionarioP instance, Long cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta) throws SystemException;

    Collection<PreguntaP> assocOperator008(CuestionarioP instance) throws SystemException;

    Collection<PreguntaP> assocOperator008Range1(CuestionarioP instance) throws SystemException;
    
    SQLPopulation assocOperator008Range1Query(CuestionarioP instance) throws SystemException;

    public List<CuestionarioP> executeQuery(String query);

    public List<CuestionarioP> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
