package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.ObsEstado;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface ObsEstadoJpaRepositoryCustom {

    List<ObsEstado> solveQuery(SQLSelect query);
    
    List<ObsEstado> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);
    
    Long nextObsEstadoId(Long documentoGIdentificador);

    public List<ObsEstado> executeQuery(String query);

    public List<ObsEstado> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
