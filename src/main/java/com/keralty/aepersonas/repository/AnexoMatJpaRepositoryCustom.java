package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.sqlutils.SQLGetOne;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface AnexoMatJpaRepositoryCustom {

    List<AnexoMat> solveQuery(SQLSelect query);
    
    List<AnexoMat> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Double assocOperator000(AnexoMat instance) throws SystemException;

    Double assocOperator000Range1(AnexoMat instance) throws SystemException;
    
    SQLGetOne assocOperator000Range1Query(AnexoMat instance) throws SystemException;

    public List<AnexoMat> executeQuery(String query);

    public List<AnexoMat> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
