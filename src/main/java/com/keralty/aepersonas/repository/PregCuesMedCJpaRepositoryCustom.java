package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.PregCuesMedC;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface PregCuesMedCJpaRepositoryCustom {

    List<PregCuesMedC> solveQuery(SQLSelect query);
    
    List<PregCuesMedC> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<PregCuesMedC> executeQuery(String query);

    public List<PregCuesMedC> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
