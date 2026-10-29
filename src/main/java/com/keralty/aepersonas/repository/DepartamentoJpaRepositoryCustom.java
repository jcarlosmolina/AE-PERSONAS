package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface DepartamentoJpaRepositoryCustom {

    List<Departamento> solveQuery(SQLSelect query);
    
    List<Departamento> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Departamento> executeQuery(String query);

    public List<Departamento> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
