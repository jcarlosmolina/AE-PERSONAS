package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.CuestionarioMed;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface CuestionarioMedJpaRepositoryCustom {

    List<CuestionarioMed> solveQuery(SQLSelect query);
    
    List<CuestionarioMed> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<CuestionarioMed> executeQuery(String query);

    public List<CuestionarioMed> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
