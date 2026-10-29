package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.RespRegional;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface RespRegionalJpaRepositoryCustom {

    List<RespRegional> solveQuery(SQLSelect query);
    
    List<RespRegional> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Funcionario findParent(Long oid);

    public List<RespRegional> executeQuery(String query);

    public List<RespRegional> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
