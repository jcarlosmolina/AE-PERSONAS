package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.global.FamiliaNovedadConstants;
import com.keralty.aepersonas.global.NovedadCTConstants;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioNovedadConstants;
import com.keralty.aepersonas.persistence.FamiliaNovedad;
import com.keralty.aepersonas.persistence.UsuarioNovedad;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandNull;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class FamiliaNovedadJpaRepositoryImpl extends AbstractRepository implements FamiliaNovedadJpaRepositoryCustom {

    @Inject
    public FamiliaNovedadJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<FamiliaNovedad> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<FamiliaNovedad> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<FamiliaNovedad> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<FamiliaNovedad> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, FamiliaNovedad.class);
    }

    @Override	
    public List<FamiliaNovedad> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<FamiliaNovedad> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Boolean assocOperator000(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (UsuarioNovedad) WHERE (UsuarioNovedad.EstadoBeneficiario.EsActivo = true)
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Boolean assocOperator000Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator000Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLExists assocOperator000Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuarioNovedad.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public Boolean assocOperator001(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (NovedadCT)
            return assocOperator001Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator001
	@Override
    public Boolean assocOperator001Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator001Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator001
	@Override
    public SQLExists assocOperator001Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator002
	@Override
    public Long assocOperator002(FamiliaNovedad instance) throws SystemException {
        try {
            // COUNT (UsuarioNovedad) WHERE (UsuarioNovedad.drvEsTitular = true AND UsuarioNovedad.EstadoBeneficiario.EsActivo = true AND (EXIST (UsuarioNovedad.TipoIdentificacionCD) = false AND UsuarioNovedad.TipoIdentificacion.Codigo <> NovedadCT.TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacion <> NovedadCT.TitNumidentificacion) OR (EXIST (UsuarioNovedad.TipoIdentificacionCD) = true AND UsuarioNovedad.TipoIdentificacionCD.Codigo <> NovedadCT.TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacionCD <> NovedadCT.TitNumidentificacion))
            long count = 0L;
            for(UsuarioNovedad item : assocOperator002Range1(instance)){
                // UsuarioNovedad.drvEsTitular = true AND UsuarioNovedad.EstadoBeneficiario.EsActivo = true AND (EXIST (UsuarioNovedad.TipoIdentificacionCD) = false AND UsuarioNovedad.TipoIdentificacion.Codigo <> NovedadCT.TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacion <> NovedadCT.TitNumidentificacion) OR (EXIST (UsuarioNovedad.TipoIdentificacionCD) = true AND UsuarioNovedad.TipoIdentificacionCD.Codigo <> NovedadCT.TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacionCD <> NovedadCT.TitNumidentificacion)
                if(item.getUsuarioNovedaddrvEsTitular().equals(true) && item.getEstadoBeneficiario().getEstadoBeneficiarioEsActivo().equals(true) && (assocOperator003(instance).equals(false) && !STDFunctions.areEqual(item.getTipoIdentificacion().getTipoIdentificacionCodigo(),instance.getNovedadCT().getTipoIdentificacion().getTipoIdentificacionCodigo()) && !STDFunctions.areEqual(item.getUsuarioNovedadNumIdentificacion(),instance.getNovedadCT().getNovedadCTTitNumidentificacion())) || (assocOperator004(instance).equals(true) && !STDFunctions.areEqual(item.getTipoIdentificacionCD().getTipoIdentificacionCodigo(),instance.getNovedadCT().getTipoIdentificacion().getTipoIdentificacionCodigo()) && !STDFunctions.areEqual(item.getUsuarioNovedadNumIdentificacionCD(),instance.getNovedadCT().getNovedadCTTitNumidentificacion())))
                    count += 1;
            }
            return count;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator002, Method: assocOperator002";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator002
	@Override
    public Collection<UsuarioNovedad> assocOperator002Range1 (FamiliaNovedad instance) throws SystemException {

        SQLSelect sql = assocOperator002Range1Query(instance);
        return new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator002
	@Override
    public SQLPopulation assocOperator002Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            return new SQLPopulation(FamiliaNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.CLASS_NAME, instance.getOid(), FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator002, Method: assocOperator002Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public Boolean assocOperator003(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (UsuarioNovedad.TipoIdentificacionCD)
            return assocOperator003Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator003
	@Override
    public Boolean assocOperator003Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator003Range1Query(instance, null);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator003
	@Override
    public SQLExists assocOperator003Range1Query (FamiliaNovedad instance, SQLSelect superQuery) throws SystemException {
        try {
            // Path starts with a class in the subquery
            return new SQLExists(superQuery, FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACIONCD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator004
	@Override
    public Boolean assocOperator004(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (UsuarioNovedad.TipoIdentificacionCD)
            return assocOperator004Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator004, Method: assocOperator004";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator004
	@Override
    public Boolean assocOperator004Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator004Range1Query(instance, null);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator004
	@Override
    public SQLExists assocOperator004Range1Query (FamiliaNovedad instance, SQLSelect superQuery) throws SystemException {
        try {
            // Path starts with a class in the subquery
            return new SQLExists(superQuery, FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACIONCD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator004, Method: assocOperator004Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator005
	@Override
    public Long assocOperator005(FamiliaNovedad instance) throws SystemException {
        try {
            // COUNT (UsuarioNovedad) WHERE (UsuarioNovedad.drvEsTitular = true AND UsuarioNovedad.EstadoBeneficiario.EsActivo = true AND (EXIST (UsuarioNovedad.TipoIdentificacionCD) = false AND UsuarioNovedad.TipoIdentificacion.Codigo <> TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacion <> TitNumidentificacion) OR (EXIST (UsuarioNovedad.TipoIdentificacionCD) = true AND UsuarioNovedad.TipoIdentificacionCD.Codigo <> TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacionCD <> TitNumidentificacion))
            long count = 0L;
            for(UsuarioNovedad item : assocOperator005Range1(instance)){
                // UsuarioNovedad.drvEsTitular = true AND UsuarioNovedad.EstadoBeneficiario.EsActivo = true AND (EXIST (UsuarioNovedad.TipoIdentificacionCD) = false AND UsuarioNovedad.TipoIdentificacion.Codigo <> TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacion <> TitNumidentificacion) OR (EXIST (UsuarioNovedad.TipoIdentificacionCD) = true AND UsuarioNovedad.TipoIdentificacionCD.Codigo <> TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacionCD <> TitNumidentificacion)
                if(item.getUsuarioNovedaddrvEsTitular().equals(true) && item.getEstadoBeneficiario().getEstadoBeneficiarioEsActivo().equals(true) && (assocOperator006(instance).equals(false) && !STDFunctions.areEqual(item.getTipoIdentificacion().getTipoIdentificacionCodigo(),instance.getTipoIdentificacion().getTipoIdentificacionCodigo()) && !(item.getUsuarioNovedadNumIdentificacion()).equals(instance.getFamiliaNovedadTitNumidentificacion())) || (assocOperator007(instance).equals(true) && !STDFunctions.areEqual(item.getTipoIdentificacionCD().getTipoIdentificacionCodigo(),instance.getTipoIdentificacion().getTipoIdentificacionCodigo()) && !(item.getUsuarioNovedadNumIdentificacionCD()).equals(instance.getFamiliaNovedadTitNumidentificacion())))
                    count += 1;
            }
            return count;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator005, Method: assocOperator005";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator005
	@Override
    public Collection<UsuarioNovedad> assocOperator005Range1 (FamiliaNovedad instance) throws SystemException {

        SQLSelect sql = assocOperator005Range1Query(instance);
        return new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator005
	@Override
    public SQLPopulation assocOperator005Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            return new SQLPopulation(FamiliaNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.CLASS_NAME, instance.getOid(), FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator005, Method: assocOperator005Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator006
	@Override
    public Boolean assocOperator006(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (UsuarioNovedad.TipoIdentificacionCD)
            return assocOperator006Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator006, Method: assocOperator006";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator006
	@Override
    public Boolean assocOperator006Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator006Range1Query(instance, null);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator006
	@Override
    public SQLExists assocOperator006Range1Query (FamiliaNovedad instance, SQLSelect superQuery) throws SystemException {
        try {
            // Path starts with a class in the subquery
            return new SQLExists(superQuery, FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACIONCD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator006, Method: assocOperator006Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator007
	@Override
    public Boolean assocOperator007(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (UsuarioNovedad.TipoIdentificacionCD)
            return assocOperator007Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator007, Method: assocOperator007";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator007
	@Override
    public Boolean assocOperator007Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator007Range1Query(instance, null);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator007
	@Override
    public SQLExists assocOperator007Range1Query (FamiliaNovedad instance, SQLSelect superQuery) throws SystemException {
        try {
            // Path starts with a class in the subquery
            return new SQLExists(superQuery, FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACIONCD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator007, Method: assocOperator007Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator008
	@Override
    public Boolean assocOperator008(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (NovedadCT)
            return assocOperator008Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator008, Method: assocOperator008";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator008
	@Override
    public Boolean assocOperator008Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator008Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator008
	@Override
    public SQLExists assocOperator008Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator008, Method: assocOperator008Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator009
	@Override
    public Boolean assocOperator009(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (NovedadCT)
            return assocOperator009Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator009, Method: assocOperator009";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator009
	@Override
    public Boolean assocOperator009Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator009Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator009
	@Override
    public SQLExists assocOperator009Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator009, Method: assocOperator009Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator010
	@Override
    public Boolean assocOperator010(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (NovedadCT)
            return assocOperator010Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator010, Method: assocOperator010";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator010
	@Override
    public Boolean assocOperator010Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator010Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator010
	@Override
    public SQLExists assocOperator010Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator010, Method: assocOperator010Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator011
	@Override
    public Boolean assocOperator011(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (NovedadCT)
            return assocOperator011Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator011, Method: assocOperator011";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator011
	@Override
    public Boolean assocOperator011Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator011Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator011
	@Override
    public SQLExists assocOperator011Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator011, Method: assocOperator011Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator012
	@Override
    public Boolean assocOperator012(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (NovedadCT)
            return assocOperator012Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator012, Method: assocOperator012";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator012
	@Override
    public Boolean assocOperator012Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator012Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator012
	@Override
    public SQLExists assocOperator012Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator012, Method: assocOperator012Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator013
	@Override
    public Boolean assocOperator013(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (NovedadMD)
            return assocOperator013Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator013, Method: assocOperator013";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator013
	@Override
    public Boolean assocOperator013Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator013Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator013
	@Override
    public SQLExists assocOperator013Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_NOVEDADMD, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator013, Method: assocOperator013Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator014
	@Override
    public Boolean assocOperator014(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (Firma)
            return assocOperator014Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator014, Method: assocOperator014";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator014
	@Override
    public Boolean assocOperator014Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator014Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator014
	@Override
    public SQLExists assocOperator014Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_FIRMA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator014, Method: assocOperator014Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator015
	@Override
    public Boolean assocOperator015(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (NovedadCT.Firma)
            return assocOperator015Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator015, Method: assocOperator015";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator015
	@Override
    public Boolean assocOperator015Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator015Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator015
	@Override
    public SQLExists assocOperator015Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT + "." + NovedadCTConstants.ROLE_NAME_FIRMA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator015, Method: assocOperator015Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator016
	@Override
    public Long assocOperator016(FamiliaNovedad instance) throws SystemException {
        try {
            // COUNT (UsuarioNovedad) WHERE (UsuarioNovedad.Parentesco.EsTitular = true AND UsuarioNovedad.drvEstaActivo = true)
            long count = 0L;
            for(UsuarioNovedad item : assocOperator016Range1(instance)){
                // UsuarioNovedad.drvEstaActivo = true
                if(item.getUsuarioNovedaddrvEstaActivo().equals(true))
                    count += 1;
            }
            return count;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator016, Method: assocOperator016";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator016
	@Override
    public Collection<UsuarioNovedad> assocOperator016Range1 (FamiliaNovedad instance) throws SystemException {

        SQLSelect sql = assocOperator016Range1Query(instance);
        return new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator016
	@Override
    public SQLPopulation assocOperator016Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(FamiliaNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.CLASS_NAME, instance.getOid(), FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuarioNovedad.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator016, Method: assocOperator016Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator017
	@Override
    public Boolean assocOperator017(FamiliaNovedad instance) throws SystemException {
        try {
            // EXIST (NovedadCT) WHERE (NovedadCT.TipoIdentificacion.NIT = true)
            return assocOperator017Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator017, Method: assocOperator017";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator017
	@Override
    public Boolean assocOperator017Range1 (FamiliaNovedad instance) throws SystemException {
        SQLExists sql = assocOperator017Range1Query(instance);
        return !new TypedQueryBuilder<FamiliaNovedad>(em, FamiliaNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator017
	@Override
    public SQLExists assocOperator017Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(FamiliaNovedadConstants.CLASS_NAME, FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // NovedadCT.TipoIdentificacion.NIT = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getNovedadCT().getTipoIdentificacion().getTipoIdentificacionNIT()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getNovedadCT().getTipoIdentificacion().getTipoIdentificacionNIT(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator017, Method: assocOperator017Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator018
	@Override
    public Long assocOperator018(FamiliaNovedad instance) throws SystemException {
        try {
            // SUM (UsuarioNovedad.drvEdad) WHERE (UsuarioNovedad.drvEsTitular = true)
            long result = 0L;
            for(UsuarioNovedad item : assocOperator018Range1(instance)){
                // UsuarioNovedad.drvEsTitular = true
                if(item.getUsuarioNovedaddrvEsTitular().equals(true))
                    result += item.getUsuarioNovedaddrvEdad();
            }
            return result;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator018, Method: assocOperator018";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator018
	@Override
    public Collection<UsuarioNovedad> assocOperator018Range1 (FamiliaNovedad instance) throws SystemException {

        SQLSelect sql = assocOperator018Range1Query(instance);
        return new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator018
	@Override
    public SQLPopulation assocOperator018Range1Query (FamiliaNovedad instance) throws SystemException {
        try {
            return new SQLPopulation(FamiliaNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.CLASS_NAME, instance.getOid(), FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaNovedad, Assoc.Operator: AssocOperator018, Method: assocOperator018Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
