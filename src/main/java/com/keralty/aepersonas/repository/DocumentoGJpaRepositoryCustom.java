package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.ObsEstado;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.Collection;
import java.util.List;

public interface DocumentoGJpaRepositoryCustom {

    List<DocumentoG> solveQuery(SQLSelect query);
    
    List<DocumentoG> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Collection<ObsEstado> assocOperator000(DocumentoG instance) throws SystemException;

    Collection<ObsEstado> assocOperator000Range1(DocumentoG instance) throws SystemException;
    
    SQLPopulation assocOperator000Range1Query(DocumentoG instance) throws SystemException;

    public List<DocumentoG> executeQuery(String query);

    public List<DocumentoG> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
