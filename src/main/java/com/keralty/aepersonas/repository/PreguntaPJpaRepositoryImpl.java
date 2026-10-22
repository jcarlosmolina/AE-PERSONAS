package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.PregCuesMedCConstants;
import com.keralty.aepersonas.global.PreguntaConstants;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.PregCuesMedC;
import com.keralty.aepersonas.persistence.PreguntaP;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameterAttribute;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class PreguntaPJpaRepositoryImpl extends AbstractRepository implements PreguntaPJpaRepositoryCustom {

    @Inject
    public PreguntaPJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<PreguntaP> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<PreguntaP> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<PreguntaP> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<PreguntaP> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, PreguntaP.class);
    }

    @Override	
    public List<PreguntaP> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<PreguntaP> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Boolean assocOperator000(PreguntaP instance) throws SystemException {
        try {
            // EXIST (Pregunta.Valores)
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PreguntaP, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Boolean assocOperator000Range1 (PreguntaP instance) throws SystemException {
        SQLExists sql = assocOperator000Range1Query(instance);
        return !new TypedQueryBuilder<PreguntaP>(em, PreguntaP.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLExists assocOperator000Range1Query (PreguntaP instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PreguntaPConstants.CLASS_NAME, PreguntaPConstants.ROLE_NAME_PREGUNTA + "." + PreguntaConstants.ROLE_NAME_VALORES, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PreguntaP, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public Collection<PregCuesMedC> assocOperator001(PreguntaP instance, PersonaC preguntaPTCREARpPersonaC) throws SystemException {
        try {
            // FOR ALL pPersonaC.PregsCuesMedC WHERE (pPersonaC.PregsCuesMedC.CodPregunta = Numero) DO marcarDatosCORE(this, pPersonaC.PregsCuesMedC.RptaPregunta, pPersonaC.PregsCuesMedC.Observacions)
        return assocOperator001Range1(instance, preguntaPTCREARpPersonaC);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PreguntaP, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator001
	@Override
    public Collection<PregCuesMedC> assocOperator001Range1 (PreguntaP instance, PersonaC preguntaPTCREARpPersonaC) throws SystemException {

        SQLSelect sql = assocOperator001Range1Query(instance, preguntaPTCREARpPersonaC);
        return new TypedQueryBuilder<PregCuesMedC>(em, PregCuesMedC.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator001
	@Override
    public SQLPopulation assocOperator001Range1Query (PreguntaP instance, PersonaC preguntaPTCREARpPersonaC) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(PreguntaPConstants.CLASS_NAME, PregCuesMedCConstants.CLASS_NAME, PreguntaPConstants.ARG_NAME_TCREAR_PREGUNTAPTCREARPPERSONAC + "." + PersonaCConstants.ROLE_NAME_PREGSCUESMEDC, preguntaPTCREARpPersonaC.getOid(), PreguntaPConstants.ARG_NAME_TCREAR_PREGUNTAPTCREARPPERSONAC);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // pPersonaC.PregsCuesMedC.CodPregunta = Numero
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameterAttribute operand112 = new SQLWhereOperandOVParameterAttribute(PreguntaPConstants.ARG_NAME_TCREAR_PREGUNTAPTCREARPPERSONAC + "." + PersonaCConstants.ROLE_NAME_PREGSCUESMEDC + "." + PregCuesMedCConstants.ATTR_NAME_PREGCUESMEDCCODPREGUNTA, PersonaCConstants.CLASS_NAME, preguntaPTCREARpPersonaC.getOid(), PreguntaPConstants.ARG_NAME_TCREAR_PREGUNTAPTCREARPPERSONAC, Constants.Type.INT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getPreguntaPNumero(), Constants.Type.INT.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PreguntaP, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
