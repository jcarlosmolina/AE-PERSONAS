package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Tarifa;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface TarifaJpaRepositoryCustom {

    List<Tarifa> solveQuery(SQLSelect query);
    
    List<Tarifa> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Tarifa> executeQuery(String query);

    public List<Tarifa> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
