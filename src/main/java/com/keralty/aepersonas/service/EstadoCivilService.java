package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoCivilConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.repository.EstadoCivilJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.viewmodel.FilterRequest;
import com.keralty.aepersonas.viewmodel.FilterVariableRequest;
import com.keralty.aepersonas.viewmodel.InstanceResponseViewModel;
import com.keralty.aepersonas.viewmodel.PopulationResponseViewModel;
import com.keralty.aepersonas.viewmodel.PreloadResponseViewModel;
import com.keralty.aepersonas.viewmodel.PreloadViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class EstadoCivilService extends AbstractService {

    EstadoCivilJpaRepository repository;

    EstadoCivilService estadoCivilSrv;

    PersonaService personaSrv;

    PersonaCService personaCSrv;

    @Inject
    public EstadoCivilService(
            EstadoCivilService estadoCivilSrv,
            PersonaService personaSrv,
            PersonaCService personaCSrv,
            EstadoCivilJpaRepository repository) {
        this.estadoCivilSrv = estadoCivilSrv;
        this.personaSrv = personaSrv;
        this.personaCSrv = personaCSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, EstadoCivilConstants.CLASS_NAME);
    }

    private List<EstadoCivil> solveEstadoCivilTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, EstadoCivilConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveEstadoCivilTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, EstadoCivilConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class EstadoCivil
     *
     * @return Population of class EstadoCivil
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoCivil> get() {
        List<EstadoCivil> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class EstadoCivil
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class EstadoCivil
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<EstadoCivil> instances = get(queryRequest);
        if(EstadoCivilConstants.DSICESTADOCIVIL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICEstadoCivil())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class EstadoCivil that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class EstadoCivil matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoCivil> get(QueryRequest queryRequest) {
        return solveEstadoCivilTypedQuery(queryRequest);
    }
    
    /*
     * Returns the list of instances that matches certain search criteria
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return List of instances that matches certain search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public QueryResponse getDynamic(QueryRequest queryRequest) {
        if (queryRequest.getDisplaySetName() == null || queryRequest.getDisplaySetName().isEmpty()) {
            return new PopulationResponseViewModel(solveEstadoCivilTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveEstadoCivilTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveEstadoCivilTypedQuery(queryRequest).stream()
                    .map(instance -> buildPreloadViewModel(instance, queryRequest.getDisplaySetName()))
                    .collect(Collectors.toList()));
        }
    }

    /*
     * Returns the population of a class with a certain structure
     *
     * @param relatedInstanceJsonOid Json Oid of the related instance
     *
     * @param relatedInstancePath Path to the related instance
     *
     * @param displaySetItems DisplaySet items for each returned instance
     *
     * @return List of instances
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public PopulationResponseViewModel getByRelatedDynamic(String relatedInstanceJsonOid, String relatedInstancePath, String displaySetItems) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstanceJsonOid))));
        return new PopulationResponseViewModel(solveEstadoCivilTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of EstadoCivil by ID
     *
     * @param estadoCivilCodigo Identification field estadoCivilCodigo
     *
     * @return Instance of EstadoCivil
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public EstadoCivil getById(Long estadoCivilCodigo) {
        return getByOID(new EstadoCivilOid(estadoCivilCodigo));
    }
    
    /*
     * Returns an instance of EstadoCivil by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of EstadoCivil
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public EstadoCivil getByOID(EstadoCivilOid oid) {
        Optional<EstadoCivil> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of EstadoCivil by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of EstadoCivil
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoCivil getByOIDWithHV(EstadoCivilOid oid) {
        Optional<EstadoCivil> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<EstadoCivil> getInstanceByOid(EstadoCivilOid oid) {
        return oid != null && oid.getEstadoCivilCodigo() != null
               ? repository.findById(oid.getEstadoCivilCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of EstadoCivil by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of EstadoCivil
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public EstadoCivil getByJsonOid(String jsonOid) {
        EstadoCivilOid oid = new EstadoCivilOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of EstadoCivil related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of EstadoCivil
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoCivil> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveEstadoCivilTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of EstadoCivil related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of EstadoCivil
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoCivil> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of EstadoCivil
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of EstadoCivil
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getEstadoCivilDynamic(EstadoCivilOid oid, String displaySetItems) {
        return new InstanceResponseViewModel(getByOIDWithHV(oid), displaySetItems);
    }

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String getSuppInfo(EstadoCivilOid oid, String dsName) {
        EstadoCivil instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(EstadoCivil instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (EstadoCivilConstants.DSICESTADOCIVIL.equals(dsName))
            return instance.buildICEstadoCivil();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(EstadoCivil instance, String dsName) {
        if (EstadoCivilConstants.DSICESTADOCIVIL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICEstadoCivil());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (EstadoCivilConstants.FILTER_NAME_IFESTADOCIVILCODIGO.equalsIgnoreCase(filterRequest.getName()))
            iFEstadoCivilCodigo(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_EstadoCivil".equals(filterRequest.getName()))
            suppInfo4ICEstadoCivil(filterRequest.getFilterVariable("searchText").toString(), sql);
    }


    private void iFEstadoCivilCodigo(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Long vCodigo = filterRequest.hasFilterVariable(EstadoCivilConstants.VAR_NAME_IFESTADOCIVILCODIGO_VCODIGO) ? (Long) filterRequest.getFilterVariable(EstadoCivilConstants.VAR_NAME_IFESTADOCIVILCODIGO_VCODIGO, FilterVariableRequest.INT) : null;

        // Codigo = vCodigo
        if (vCodigo != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(EstadoCivilConstants.ATTR_NAME_ESTADOCIVILCODIGO, Constants.Type.INT.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vCodigo, Constants.Type.INT.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUEstadoCivil
     *
     * @param queryRequest Query request
     * @return List of viewmodels for EstadoCivil using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.estadocivil.ds.AutoDS> piuPIUEstadoCivil(QueryRequest queryRequest) {
        return solveEstadoCivilTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.estadocivil.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUEstadoCivil
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUEstadoCivil
     */
    public int getCount4PIUEstadoCivil(QueryRequest queryRequest) {
        return solveEstadoCivilTypedQuery(queryRequest).size();
    }

    // Service: InsEstadoCivilPersona

    /*
     * Entry point for service InsEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insEstadoCivilPersona(
            com.keralty.aepersonas.viewmodel.estadocivil.siu.InsEstadoCivilPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = estadoCivilSrv.insEstadoCivilPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insEstadoCivilPersonaTxn(
            com.keralty.aepersonas.viewmodel.estadocivil.siu.InsEstadoCivilPersonaRequest request) throws ModelException {
        request.setEstadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getEstadoCivilInsEstadoCivilPersonapthisEstadoCivil()));
        request.setEstadoCivilInsEstadoCivilPersonapevcPersonaInstance(personaSrv.getByOIDWithHV(request.getEstadoCivilInsEstadoCivilPersonapevcPersona()));
        return estadoCivilSrv.insEstadoCivilPersonaImplementation(request, true);
    }

    /*
     * Implements service InsEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insEstadoCivilPersonaImplementation(
            com.keralty.aepersonas.viewmodel.estadocivil.siu.InsEstadoCivilPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        EstadoCivil estadoCivilInsEstadoCivilPersonapthisEstadoCivil = request.getEstadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance();
        Persona estadoCivilInsEstadoCivilPersonapevcPersona = request.getEstadoCivilInsEstadoCivilPersonapevcPersonaInstance();

        request.checkArguments();
        EstadoCivil instance = estadoCivilInsEstadoCivilPersonapthisEstadoCivil;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest();
            relatedRequest.setPersonaInsEstadoCivilPersonapthisPersonaInstance(estadoCivilInsEstadoCivilPersonapevcPersona);
            relatedRequest.setPersonaInsEstadoCivilPersonapevcEstadoCivilInstance(estadoCivilInsEstadoCivilPersonapthisEstadoCivil);
            personaSrv.insEstadoCivilPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICEstadoCivil());

        return response;
    }

    // Service: DelEstadoCivilPersona

    /*
     * Entry point for service DelEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delEstadoCivilPersona(
            com.keralty.aepersonas.viewmodel.estadocivil.siu.DelEstadoCivilPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = estadoCivilSrv.delEstadoCivilPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delEstadoCivilPersonaTxn(
            com.keralty.aepersonas.viewmodel.estadocivil.siu.DelEstadoCivilPersonaRequest request) throws ModelException {
        request.setEstadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getEstadoCivilDelEstadoCivilPersonapthisEstadoCivil()));
        request.setEstadoCivilDelEstadoCivilPersonapevcPersonaInstance(personaSrv.getByOIDWithHV(request.getEstadoCivilDelEstadoCivilPersonapevcPersona()));
        return estadoCivilSrv.delEstadoCivilPersonaImplementation(request, true);
    }

    /*
     * Implements service DelEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delEstadoCivilPersonaImplementation(
            com.keralty.aepersonas.viewmodel.estadocivil.siu.DelEstadoCivilPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        EstadoCivil estadoCivilDelEstadoCivilPersonapthisEstadoCivil = request.getEstadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance();
        Persona estadoCivilDelEstadoCivilPersonapevcPersona = request.getEstadoCivilDelEstadoCivilPersonapevcPersonaInstance();

        request.checkArguments();
        EstadoCivil instance = estadoCivilDelEstadoCivilPersonapthisEstadoCivil;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest();
            relatedRequest.setPersonaDelEstadoCivilPersonapthisPersonaInstance(estadoCivilDelEstadoCivilPersonapevcPersona);
            relatedRequest.setPersonaDelEstadoCivilPersonapevcEstadoCivilInstance(estadoCivilDelEstadoCivilPersonapthisEstadoCivil);
            personaSrv.delEstadoCivilPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICEstadoCivil());

        return response;
    }


    private void suppInfo4ICEstadoCivil(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(EstadoCivilConstants.ATTR_NAME_ESTADOCIVILDESCRIPCION, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison1);

            SQLWhereConjunction conjunction = new SQLWhereConjunction();
            conjunction.addDisjunction(disjunction);
            select.addConjunction(conjunction);
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    @Override
    protected void applyOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        applyOCOCEstadoCivil(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(EstadoCivilConstants.CLASS_NAME, EstadoCivilConstants.ATTR_FIELD_ESTADOCIVILCODIGO, false), true);
    }


    private void applyOCOCEstadoCivil(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_EstadoCivil".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(EstadoCivilConstants.CLASS_NAME, EstadoCivilConstants.ATTR_NAME_ESTADOCIVILDESCRIPCION, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildEstadoCivilRelatedInstance(relatedInstanceJsonOid);
        }
        if (EstadoCivilConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoCivilRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoCivilConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoCivilRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildEstadoCivilRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new EstadoCivil(mapper.readValue(relatedInstanceJsonOid, EstadoCivilOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildEstadoCivilRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildEstadoCivilRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            EstadoCivilOid oid = new EstadoCivilOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(EstadoCivilConstants.ATTR_FIELD_ESTADOCIVILCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getEstadoCivilCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(EstadoCivilService.class).error(e.getMessage());
        }
    }

}
