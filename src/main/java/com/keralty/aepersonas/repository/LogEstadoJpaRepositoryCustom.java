package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.LogEstado;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface LogEstadoJpaRepositoryCustom {

    List<LogEstado> solveQuery(SQLSelect query);
    
    List<LogEstado> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<LogEstado> executeQuery(String query);

    public List<LogEstado> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
