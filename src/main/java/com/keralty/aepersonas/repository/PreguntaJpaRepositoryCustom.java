package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface PreguntaJpaRepositoryCustom {

    List<Pregunta> solveQuery(SQLSelect query);
    
    List<Pregunta> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Pregunta> executeQuery(String query);

    public List<Pregunta> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
