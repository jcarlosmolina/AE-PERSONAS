package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface EstadoCivilJpaRepositoryCustom {

    List<EstadoCivil> solveQuery(SQLSelect query);
    
    List<EstadoCivil> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<EstadoCivil> executeQuery(String query);

    public List<EstadoCivil> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
