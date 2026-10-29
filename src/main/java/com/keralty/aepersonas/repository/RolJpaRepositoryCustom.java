package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Rol;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface RolJpaRepositoryCustom {

    List<Rol> solveQuery(SQLSelect query);
    
    List<Rol> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Rol> executeQuery(String query);

    public List<Rol> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
