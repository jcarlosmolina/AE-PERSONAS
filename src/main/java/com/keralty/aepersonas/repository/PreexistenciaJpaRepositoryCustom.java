package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Preexistencia;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import java.util.List;

public interface PreexistenciaJpaRepositoryCustom {

    List<Preexistencia> solveQuery(SQLSelect query);
    
    List<Preexistencia> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);
    
    Long nextPreexistenciaIdentificador(Long aesolicitudesidsolicitud, Long usuarioUsuarioIdentificador);

    public List<Preexistencia> executeQuery(String query);

    public List<Preexistencia> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
