package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Valor;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface ValorJpaRepositoryCustom {

    List<Valor> solveQuery(SQLSelect query);
    
    List<Valor> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Valor> executeQuery(String query);

    public List<Valor> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
