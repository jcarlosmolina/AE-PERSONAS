package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Seccion;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface SeccionJpaRepositoryCustom {

    List<Seccion> solveQuery(SQLSelect query);
    
    List<Seccion> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Seccion> executeQuery(String query);

    public List<Seccion> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
