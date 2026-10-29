package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Afiliaciones;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface AfiliacionesJpaRepositoryCustom {

    List<Afiliaciones> solveQuery(SQLSelect query);
    
    List<Afiliaciones> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Funcionario findParent(Long oid);

    public List<Afiliaciones> executeQuery(String query);

    public List<Afiliaciones> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
