package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.CausaExclusionConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FamiliaNovedadConstants;
import com.keralty.aepersonas.global.NovedadConstants;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.global.SolicitudNovedadConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioNovedadConstants;
import com.keralty.aepersonas.persistence.UsuarioNovedad;
import com.keralty.aepersonas.sqlutils.SQLCount;
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

public class UsuarioNovedadJpaRepositoryImpl extends AbstractRepository implements UsuarioNovedadJpaRepositoryCustom {

    @Inject
    public UsuarioNovedadJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<UsuarioNovedad> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<UsuarioNovedad> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<UsuarioNovedad> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<UsuarioNovedad> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, UsuarioNovedad.class);
    }

    @Override	
    public List<UsuarioNovedad> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<UsuarioNovedad> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Boolean assocOperator000(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (Parentesco)
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Boolean assocOperator000Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator000Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLExists assocOperator000Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public Boolean assocOperator001(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (FamiliaNovedad.NovedadCT) WHERE (FamiliaNovedad.NovedadCT.TipoIdentificacion.Codigo = TipoIdentificacion.Codigo AND FamiliaNovedad.NovedadCT.TitNumidentificacion = NumIdentificacion)
            return assocOperator001Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator001
	@Override
    public Boolean assocOperator001Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator001Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator001
	@Override
    public SQLExists assocOperator001Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // FamiliaNovedad.NovedadCT.TipoIdentificacion.Codigo = TipoIdentificacion.Codigo
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getFamiliaNovedad().getNovedadCT().getTipoIdentificacion().getTipoIdentificacionCodigo()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getFamiliaNovedad().getNovedadCT().getTipoIdentificacion().getTipoIdentificacionCodigo(), Constants.Type.INT.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    if (instance.getTipoIdentificacion().getTipoIdentificacionCodigo()!= null){
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getTipoIdentificacion().getTipoIdentificacionCodigo(), Constants.Type.INT.getTypeName()));
                    } else {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison1);


            // FamiliaNovedad.NovedadCT.TitNumidentificacion = NumIdentificacion
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    if (instance.getFamiliaNovedad().getNovedadCT().getNovedadCTTitNumidentificacion()!= null){
                    comparison2.setFirstOperand(new SQLWhereOperandLiteral(instance.getFamiliaNovedad().getNovedadCT().getNovedadCTTitNumidentificacion(), Constants.Type.STRING.getTypeName()));
                    } else {
                    comparison2.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(instance.getUsuarioNovedadNumIdentificacion(), Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator002
	@Override
    public Long assocOperator002(UsuarioNovedad instance) throws SystemException {
        try {
            // COUNT (FamiliaNovedad.UsuarioNovedad) WHERE (FamiliaNovedad.UsuarioNovedad.idUsuarioNovedad <> idUsuarioNovedad AND FamiliaNovedad.UsuarioNovedad.Parentesco.EsTitular = true)
            return assocOperator002Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator002, Method: assocOperator002";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator002
	@Override
    public Long assocOperator002Range1 (UsuarioNovedad instance) throws SystemException {
        SQLCount sql = assocOperator002Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator002
	@Override
    public SQLCount assocOperator002Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // FamiliaNovedad.UsuarioNovedad.idUsuarioNovedad <> idUsuarioNovedad
                    // '<>' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("<>");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ATTR_NAME_USUARIONOVEDADIDUSUARIONOVEDAD, Constants.Type.INT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getUsuarioNovedadidUsuarioNovedad(), Constants.Type.INT.getTypeName()));
                    conjunction.addOperand(comparison1);


            // FamiliaNovedad.UsuarioNovedad.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator002, Method: assocOperator002Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public Boolean assocOperator003(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (FamiliaNovedad.Solicitud.Novedad.CausasExclusion) WHERE (FamiliaNovedad.Solicitud.Novedad.CausasExclusion.Descripcion = MotivoEstado)
            return assocOperator003Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator003
	@Override
    public Boolean assocOperator003Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator003Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator003
	@Override
    public SQLExists assocOperator003Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_SOLICITUD + "." + SolicitudNovedadConstants.ROLE_NAME_NOVEDAD + "." + NovedadConstants.ROLE_NAME_CAUSASEXCLUSION, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // FamiliaNovedad.Solicitud.Novedad.CausasExclusion.Descripcion = MotivoEstado
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_SOLICITUD + "." + SolicitudNovedadConstants.ROLE_NAME_NOVEDAD + "." + NovedadConstants.ROLE_NAME_CAUSASEXCLUSION + "." + CausaExclusionConstants.ATTR_NAME_CAUSAEXCLUSIONDESCRIPCION, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getUsuarioNovedadMotivoEstado()!= null){
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getUsuarioNovedadMotivoEstado(), Constants.Type.STRING.getTypeName()));
                    } else {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator004
	@Override
    public Boolean assocOperator004(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (EstadoBeneficiario)
            return assocOperator004Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator004, Method: assocOperator004";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator004
	@Override
    public Boolean assocOperator004Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator004Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator004
	@Override
    public SQLExists assocOperator004Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_ESTADOBENEFICIARIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator004, Method: assocOperator004Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator005
	@Override
    public Boolean assocOperator005(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (FamiliaNovedad.UsuarioNovedad) WHERE (FamiliaNovedad.UsuarioNovedad.drvEsPadre = true AND FamiliaNovedad.UsuarioNovedad.drvEdad - drvEdad < 10)
            for(UsuarioNovedad item : assocOperator005Range1(instance)){
                // FamiliaNovedad.UsuarioNovedad.drvEsPadre = true
                boolean conditionsMet = (item.getUsuarioNovedaddrvEsPadre().equals(true));
                // FamiliaNovedad.UsuarioNovedad.drvEdad - drvEdad < 10
                conditionsMet &= (item.getUsuarioNovedaddrvEdad() - instance.getUsuarioNovedaddrvEdad() < Long.valueOf(10));
                if (conditionsMet) return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator005, Method: assocOperator005";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator005
	@Override
    public Collection<UsuarioNovedad> assocOperator005Range1 (UsuarioNovedad instance) throws SystemException {

        SQLSelect sql = assocOperator005Range1Query(instance);
        return new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator005
	@Override
    public SQLPopulation assocOperator005Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            return new SQLPopulation(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.CLASS_NAME, instance.getOid(), UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator005, Method: assocOperator005Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator006
	@Override
    public Boolean assocOperator006(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (FamiliaNovedad.UsuarioNovedad) WHERE (FamiliaNovedad.UsuarioNovedad.drvEsHijo = true AND drvEdad - FamiliaNovedad.UsuarioNovedad.drvEdad < 10)
            for(UsuarioNovedad item : assocOperator006Range1(instance)){
                // FamiliaNovedad.UsuarioNovedad.drvEsHijo = true
                boolean conditionsMet = (item.getUsuarioNovedaddrvEsHijo().equals(true));
                // drvEdad - FamiliaNovedad.UsuarioNovedad.drvEdad < 10
                conditionsMet &= (instance.getUsuarioNovedaddrvEdad() - item.getUsuarioNovedaddrvEdad() < Long.valueOf(10));
                if (conditionsMet) return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator006, Method: assocOperator006";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator006
	@Override
    public Collection<UsuarioNovedad> assocOperator006Range1 (UsuarioNovedad instance) throws SystemException {

        SQLSelect sql = assocOperator006Range1Query(instance);
        return new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator006
	@Override
    public SQLPopulation assocOperator006Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            return new SQLPopulation(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.CLASS_NAME, instance.getOid(), UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator006, Method: assocOperator006Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator007
	@Override
    public Boolean assocOperator007(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (FamiliaNovedad.UsuarioNovedad) WHERE (FamiliaNovedad.UsuarioNovedad.drvEsConyuge = true AND Genero = FamiliaNovedad.UsuarioNovedad.Genero)
            for(UsuarioNovedad item : assocOperator007Range1(instance)){
                // FamiliaNovedad.UsuarioNovedad.drvEsConyuge = true
                if(item.getUsuarioNovedaddrvEsConyuge().equals(true))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator007, Method: assocOperator007";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator007
	@Override
    public Collection<UsuarioNovedad> assocOperator007Range1 (UsuarioNovedad instance) throws SystemException {

        SQLSelect sql = assocOperator007Range1Query(instance);
        return new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator007
	@Override
    public SQLPopulation assocOperator007Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.CLASS_NAME, instance.getOid(), UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Genero = FamiliaNovedad.UsuarioNovedad.Genero
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getUsuarioNovedadGenero()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getUsuarioNovedadGenero(), Constants.Type.STRING.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    SQLWhereOperandPathAttribute operand223 = new SQLWhereOperandPathAttribute(UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ATTR_NAME_USUARIONOVEDADGENERO, Constants.Type.STRING.getTypeName());
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator007, Method: assocOperator007Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator008
	@Override
    public Long assocOperator008(UsuarioNovedad instance) throws SystemException {
        try {
            // COUNT (FamiliaNovedad.UsuarioNovedad) WHERE (FamiliaNovedad.UsuarioNovedad.idUsuarioNovedad <> idUsuarioNovedad AND FamiliaNovedad.UsuarioNovedad.drvEsConyuge = true AND FamiliaNovedad.UsuarioNovedad.drvEstaActivo = true AND FamiliaNovedad.UsuarioNovedad.FechaIniVigencia >= FamiliaNovedad.Solicitud.CtrFInicioContrato)
            long count = 0L;
            for(UsuarioNovedad item : assocOperator008Range1(instance)){
                // FamiliaNovedad.UsuarioNovedad.drvEsConyuge = true
                boolean conditionsMet = (item.getUsuarioNovedaddrvEsConyuge().equals(true));
                // FamiliaNovedad.UsuarioNovedad.drvEstaActivo = true
                conditionsMet &= (item.getUsuarioNovedaddrvEstaActivo().equals(true));
                if(conditionsMet) count++;
            }
            return count;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator008, Method: assocOperator008";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator008
	@Override
    public Collection<UsuarioNovedad> assocOperator008Range1 (UsuarioNovedad instance) throws SystemException {

        SQLSelect sql = assocOperator008Range1Query(instance);
        return new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator008
	@Override
    public SQLPopulation assocOperator008Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.CLASS_NAME, instance.getOid(), UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // FamiliaNovedad.UsuarioNovedad.idUsuarioNovedad <> idUsuarioNovedad
                    // '<>' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("<>");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ATTR_NAME_USUARIONOVEDADIDUSUARIONOVEDAD, Constants.Type.INT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getUsuarioNovedadidUsuarioNovedad(), Constants.Type.INT.getTypeName()));
                    conjunction.addOperand(comparison1);


            // FamiliaNovedad.UsuarioNovedad.FechaIniVigencia >= FamiliaNovedad.Solicitud.CtrFInicioContrato
                    // '>=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator(">=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD + "." + FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD + "." + UsuarioNovedadConstants.ATTR_NAME_USUARIONOVEDADFECHAINIVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    if (instance.getFamiliaNovedad().getSolicitud().getSolicitudNovedadCtrFInicioContrato()!= null){
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(instance.getFamiliaNovedad().getSolicitud().getSolicitudNovedadCtrFInicioContrato(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison2.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator008, Method: assocOperator008Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator009
	@Override
    public Boolean assocOperator009(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (ParentescoNuevo) WHERE (ParentescoNuevo.EsTitular = true)
            return assocOperator009Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator009, Method: assocOperator009";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator009
	@Override
    public Boolean assocOperator009Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator009Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator009
	@Override
    public SQLExists assocOperator009Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ParentescoNuevo.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getParentescoNuevo().getParentescoEsTitular()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getParentescoNuevo().getParentescoEsTitular(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator009, Method: assocOperator009Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator010
	@Override
    public Boolean assocOperator010(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (ParentescoNuevo)
            return assocOperator010Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator010, Method: assocOperator010";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator010
	@Override
    public Boolean assocOperator010Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator010Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator010
	@Override
    public SQLExists assocOperator010Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator010, Method: assocOperator010Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator011
	@Override
    public Boolean assocOperator011(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (Parentesco) WHERE (Parentesco.EsTitular = true)
            return assocOperator011Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator011, Method: assocOperator011";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator011
	@Override
    public Boolean assocOperator011Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator011Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator011
	@Override
    public SQLExists assocOperator011Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getParentesco().getParentescoEsTitular()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getParentesco().getParentescoEsTitular(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator011, Method: assocOperator011Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator012
	@Override
    public Boolean assocOperator012(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (ParentescoNuevo) WHERE (ParentescoNuevo.EsPadre = true)
            return assocOperator012Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator012, Method: assocOperator012";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator012
	@Override
    public Boolean assocOperator012Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator012Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator012
	@Override
    public SQLExists assocOperator012Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ParentescoNuevo.EsPadre = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getParentescoNuevo().getParentescoEsPadre()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getParentescoNuevo().getParentescoEsPadre(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator012, Method: assocOperator012Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator013
	@Override
    public Boolean assocOperator013(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (ParentescoNuevo)
            return assocOperator013Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator013, Method: assocOperator013";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator013
	@Override
    public Boolean assocOperator013Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator013Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator013
	@Override
    public SQLExists assocOperator013Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator013, Method: assocOperator013Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator014
	@Override
    public Boolean assocOperator014(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (Parentesco) WHERE (Parentesco.EsPadre = true)
            return assocOperator014Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator014, Method: assocOperator014";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator014
	@Override
    public Boolean assocOperator014Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator014Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator014
	@Override
    public SQLExists assocOperator014Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Parentesco.EsPadre = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getParentesco().getParentescoEsPadre()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getParentesco().getParentescoEsPadre(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator014, Method: assocOperator014Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator015
	@Override
    public Boolean assocOperator015(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (ParentescoNuevo) WHERE (ParentescoNuevo.EsHijo = true)
            return assocOperator015Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator015, Method: assocOperator015";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator015
	@Override
    public Boolean assocOperator015Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator015Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator015
	@Override
    public SQLExists assocOperator015Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ParentescoNuevo.EsHijo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getParentescoNuevo().getParentescoEsHijo()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getParentescoNuevo().getParentescoEsHijo(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator015, Method: assocOperator015Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator016
	@Override
    public Boolean assocOperator016(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (ParentescoNuevo)
            return assocOperator016Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator016, Method: assocOperator016";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator016
	@Override
    public Boolean assocOperator016Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator016Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator016
	@Override
    public SQLExists assocOperator016Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator016, Method: assocOperator016Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator017
	@Override
    public Boolean assocOperator017(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (Parentesco) WHERE (Parentesco.EsHijo = true)
            return assocOperator017Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator017, Method: assocOperator017";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator017
	@Override
    public Boolean assocOperator017Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator017Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator017
	@Override
    public SQLExists assocOperator017Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Parentesco.EsHijo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getParentesco().getParentescoEsHijo()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getParentesco().getParentescoEsHijo(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator017, Method: assocOperator017Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator018
	@Override
    public Boolean assocOperator018(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (ParentescoNuevo) WHERE (ParentescoNuevo.EsConyuge = true)
            return assocOperator018Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator018, Method: assocOperator018";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator018
	@Override
    public Boolean assocOperator018Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator018Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator018
	@Override
    public SQLExists assocOperator018Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ParentescoNuevo.EsConyuge = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getParentescoNuevo().getParentescoEsConyuge()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getParentescoNuevo().getParentescoEsConyuge(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator018, Method: assocOperator018Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator019
	@Override
    public Boolean assocOperator019(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (ParentescoNuevo)
            return assocOperator019Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator019, Method: assocOperator019";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator019
	@Override
    public Boolean assocOperator019Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator019Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator019
	@Override
    public SQLExists assocOperator019Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator019, Method: assocOperator019Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator020
	@Override
    public Boolean assocOperator020(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (Parentesco) WHERE (Parentesco.EsConyuge = true)
            return assocOperator020Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator020, Method: assocOperator020";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator020
	@Override
    public Boolean assocOperator020Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator020Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator020
	@Override
    public SQLExists assocOperator020Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Parentesco.EsConyuge = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getParentesco().getParentescoEsConyuge()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getParentesco().getParentescoEsConyuge(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator020, Method: assocOperator020Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator021
	@Override
    public Boolean assocOperator021(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (ParentescoNuevo)
            return assocOperator021Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator021, Method: assocOperator021";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator021
	@Override
    public Boolean assocOperator021Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator021Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator021
	@Override
    public SQLExists assocOperator021Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator021, Method: assocOperator021Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator022
	@Override
    public Boolean assocOperator022(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (TipoIdentificacionCD)
            return assocOperator022Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator022, Method: assocOperator022";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator022
	@Override
    public Boolean assocOperator022Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator022Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator022
	@Override
    public SQLExists assocOperator022Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACIONCD, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator022, Method: assocOperator022Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator023
	@Override
    public Boolean assocOperator023(UsuarioNovedad instance) throws SystemException {
        try {
            // EXIST (TipoIdentificacionCD)
            return assocOperator023Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator023, Method: assocOperator023";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator023
	@Override
    public Boolean assocOperator023Range1 (UsuarioNovedad instance) throws SystemException {
        SQLExists sql = assocOperator023Range1Query(instance);
        return !new TypedQueryBuilder<UsuarioNovedad>(em, UsuarioNovedad.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator023
	@Override
    public SQLExists assocOperator023Range1Query (UsuarioNovedad instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioNovedadConstants.CLASS_NAME, UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACIONCD, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: UsuarioNovedad, Assoc.Operator: AssocOperator023, Method: assocOperator023Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
