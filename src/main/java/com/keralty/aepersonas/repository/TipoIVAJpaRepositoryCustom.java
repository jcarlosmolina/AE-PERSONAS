package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.TipoIVA;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.sql.Date;
import java.util.List;

public interface TipoIVAJpaRepositoryCustom {

    List<TipoIVA> solveQuery(SQLSelect query);
    
    List<TipoIVA> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<TipoIVA> executeQuery(String query);

    public List<TipoIVA> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
