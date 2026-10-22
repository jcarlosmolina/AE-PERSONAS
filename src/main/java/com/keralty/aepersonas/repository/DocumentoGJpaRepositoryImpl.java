package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.DocumentoGConstants;
import com.keralty.aepersonas.global.ObsEstadoConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.ObsEstado;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class DocumentoGJpaRepositoryImpl extends AbstractRepository implements DocumentoGJpaRepositoryCustom {

    @Inject
    public DocumentoGJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<DocumentoG> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<DocumentoG> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<DocumentoG> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<DocumentoG> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, DocumentoG.class);
    }

    @Override	
    public List<DocumentoG> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<DocumentoG> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Collection<ObsEstado> assocOperator000(DocumentoG instance) throws SystemException {
        try {
            // FOR ALL ObsEstado DO ObsEstado.eliminar(ObsEstado)
        return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: DocumentoG, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Collection<ObsEstado> assocOperator000Range1 (DocumentoG instance) throws SystemException {

        SQLSelect sql = assocOperator000Range1Query(instance);
        return new TypedQueryBuilder<ObsEstado>(em, ObsEstado.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLPopulation assocOperator000Range1Query (DocumentoG instance) throws SystemException {
        try {
            return new SQLPopulation(DocumentoGConstants.CLASS_NAME, ObsEstadoConstants.CLASS_NAME, instance.getOid(), DocumentoGConstants.ROLE_NAME_OBSESTADO);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: DocumentoG, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
