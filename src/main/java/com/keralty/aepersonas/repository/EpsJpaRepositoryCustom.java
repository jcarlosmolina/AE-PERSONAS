package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface EpsJpaRepositoryCustom {

    List<Eps> solveQuery(SQLSelect query);
    
    List<Eps> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Eps> executeQuery(String query);

    public List<Eps> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
