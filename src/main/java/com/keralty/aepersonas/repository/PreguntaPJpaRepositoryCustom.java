package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.PregCuesMedC;
import com.keralty.aepersonas.persistence.PreguntaP;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.Collection;
import java.util.List;

public interface PreguntaPJpaRepositoryCustom {

    List<PreguntaP> solveQuery(SQLSelect query);
    
    List<PreguntaP> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000(PreguntaP instance) throws SystemException;

    Boolean assocOperator000Range1(PreguntaP instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(PreguntaP instance) throws SystemException;

    Collection<PregCuesMedC> assocOperator001(PreguntaP instance, PersonaC preguntaPTCREARpPersonaC) throws SystemException;

    Collection<PregCuesMedC> assocOperator001Range1(PreguntaP instance, PersonaC preguntaPTCREARpPersonaC) throws SystemException;
    
    SQLPopulation assocOperator001Range1Query(PreguntaP instance, PersonaC preguntaPTCREARpPersonaC) throws SystemException;

    public List<PreguntaP> executeQuery(String query);

    public List<PreguntaP> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
