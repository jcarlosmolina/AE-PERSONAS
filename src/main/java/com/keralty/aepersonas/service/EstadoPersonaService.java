package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoPersonaConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.repository.EstadoPersonaJpaRepository;
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
public class EstadoPersonaService extends AbstractService {

    EstadoPersonaJpaRepository repository;

    EstadoPersonaService estadoPersonaSrv;

    PersonaService personaSrv;

    PersonaCService personaCSrv;

    @Inject
    public EstadoPersonaService(
            EstadoPersonaService estadoPersonaSrv,
            PersonaService personaSrv,
            PersonaCService personaCSrv,
            EstadoPersonaJpaRepository repository) {
        this.estadoPersonaSrv = estadoPersonaSrv;
        this.personaSrv = personaSrv;
        this.personaCSrv = personaCSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, EstadoPersonaConstants.CLASS_NAME);
    }

    private List<EstadoPersona> solveEstadoPersonaTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, EstadoPersonaConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveEstadoPersonaTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, EstadoPersonaConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class EstadoPersona
     *
     * @return Population of class EstadoPersona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoPersona> get() {
        List<EstadoPersona> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class EstadoPersona
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class EstadoPersona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<EstadoPersona> instances = get(queryRequest);
        if(EstadoPersonaConstants.DSICESTADOPERSONA.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICEstadoPersona())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class EstadoPersona that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class EstadoPersona matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoPersona> get(QueryRequest queryRequest) {
        return solveEstadoPersonaTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveEstadoPersonaTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveEstadoPersonaTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveEstadoPersonaTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveEstadoPersonaTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of EstadoPersona by ID
     *
     * @param estadoPersonaCodigo Identification field estadoPersonaCodigo
     *
     * @return Instance of EstadoPersona
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public EstadoPersona getById(Long estadoPersonaCodigo) {
        return getByOID(new EstadoPersonaOid(estadoPersonaCodigo));
    }
    
    /*
     * Returns an instance of EstadoPersona by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of EstadoPersona
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public EstadoPersona getByOID(EstadoPersonaOid oid) {
        Optional<EstadoPersona> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of EstadoPersona by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of EstadoPersona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoPersona getByOIDWithHV(EstadoPersonaOid oid) {
        Optional<EstadoPersona> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<EstadoPersona> getInstanceByOid(EstadoPersonaOid oid) {
        return oid != null && oid.getEstadoPersonaCodigo() != null
               ? repository.findById(oid.getEstadoPersonaCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of EstadoPersona by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of EstadoPersona
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public EstadoPersona getByJsonOid(String jsonOid) {
        EstadoPersonaOid oid = new EstadoPersonaOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of EstadoPersona related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of EstadoPersona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoPersona> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveEstadoPersonaTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of EstadoPersona related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of EstadoPersona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoPersona> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of EstadoPersona
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of EstadoPersona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getEstadoPersonaDynamic(EstadoPersonaOid oid, String displaySetItems) {
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
    public String getSuppInfo(EstadoPersonaOid oid, String dsName) {
        EstadoPersona instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(EstadoPersona instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (EstadoPersonaConstants.DSICESTADOPERSONA.equals(dsName))
            return instance.buildICEstadoPersona();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(EstadoPersona instance, String dsName) {
        if (EstadoPersonaConstants.DSICESTADOPERSONA.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICEstadoPersona());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (EstadoPersonaConstants.FILTER_NAME_IFESTADOPERSONACODIGO.equalsIgnoreCase(filterRequest.getName()))
            iFEstadoPersonaCodigo(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_EstadoPersona".equals(filterRequest.getName()))
            suppInfo4ICEstadoPersona(filterRequest.getFilterVariable("searchText").toString(), sql);
    }


    private void iFEstadoPersonaCodigo(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Long vCodigo = filterRequest.hasFilterVariable(EstadoPersonaConstants.VAR_NAME_IFESTADOPERSONACODIGO_VCODIGO) ? (Long) filterRequest.getFilterVariable(EstadoPersonaConstants.VAR_NAME_IFESTADOPERSONACODIGO_VCODIGO, FilterVariableRequest.INT) : null;

        // Codigo = vCodigo
        if (vCodigo != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(EstadoPersonaConstants.ATTR_NAME_ESTADOPERSONACODIGO, Constants.Type.INT.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vCodigo, Constants.Type.INT.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUEstadoPersona
     *
     * @param queryRequest Query request
     * @return List of viewmodels for EstadoPersona using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.estadopersona.ds.AutoDS> piuPIUEstadoPersona(QueryRequest queryRequest) {
        return solveEstadoPersonaTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.estadopersona.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUEstadoPersona
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUEstadoPersona
     */
    public int getCount4PIUEstadoPersona(QueryRequest queryRequest) {
        return solveEstadoPersonaTypedQuery(queryRequest).size();
    }

    // Service: InsEstadoPersona

    /*
     * Entry point for service InsEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insEstadoPersona(
            com.keralty.aepersonas.viewmodel.estadopersona.siu.InsEstadoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = estadoPersonaSrv.insEstadoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insEstadoPersonaTxn(
            com.keralty.aepersonas.viewmodel.estadopersona.siu.InsEstadoPersonaRequest request) throws ModelException {
        request.setEstadoPersonaInsEstadoPersonapthisEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getEstadoPersonaInsEstadoPersonapthisEstadoPersona()));
        request.setEstadoPersonaInsEstadoPersonapevcPersonaInstance(personaSrv.getByOIDWithHV(request.getEstadoPersonaInsEstadoPersonapevcPersona()));
        return estadoPersonaSrv.insEstadoPersonaImplementation(request, true);
    }

    /*
     * Implements service InsEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insEstadoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.estadopersona.siu.InsEstadoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        EstadoPersona estadoPersonaInsEstadoPersonapthisEstadoPersona = request.getEstadoPersonaInsEstadoPersonapthisEstadoPersonaInstance();
        Persona estadoPersonaInsEstadoPersonapevcPersona = request.getEstadoPersonaInsEstadoPersonapevcPersonaInstance();

        request.checkArguments();
        EstadoPersona instance = estadoPersonaInsEstadoPersonapthisEstadoPersona;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest();
            relatedRequest.setPersonaInsEstadoPersonapthisPersonaInstance(estadoPersonaInsEstadoPersonapevcPersona);
            relatedRequest.setPersonaInsEstadoPersonapevcEstadoPersonaInstance(estadoPersonaInsEstadoPersonapthisEstadoPersona);
            personaSrv.insEstadoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICEstadoPersona());

        return response;
    }

    // Service: DelEstadoPersona

    /*
     * Entry point for service DelEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delEstadoPersona(
            com.keralty.aepersonas.viewmodel.estadopersona.siu.DelEstadoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = estadoPersonaSrv.delEstadoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delEstadoPersonaTxn(
            com.keralty.aepersonas.viewmodel.estadopersona.siu.DelEstadoPersonaRequest request) throws ModelException {
        request.setEstadoPersonaDelEstadoPersonapthisEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getEstadoPersonaDelEstadoPersonapthisEstadoPersona()));
        request.setEstadoPersonaDelEstadoPersonapevcPersonaInstance(personaSrv.getByOIDWithHV(request.getEstadoPersonaDelEstadoPersonapevcPersona()));
        return estadoPersonaSrv.delEstadoPersonaImplementation(request, true);
    }

    /*
     * Implements service DelEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delEstadoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.estadopersona.siu.DelEstadoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        EstadoPersona estadoPersonaDelEstadoPersonapthisEstadoPersona = request.getEstadoPersonaDelEstadoPersonapthisEstadoPersonaInstance();
        Persona estadoPersonaDelEstadoPersonapevcPersona = request.getEstadoPersonaDelEstadoPersonapevcPersonaInstance();

        request.checkArguments();
        EstadoPersona instance = estadoPersonaDelEstadoPersonapthisEstadoPersona;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest();
            relatedRequest.setPersonaDelEstadoPersonapthisPersonaInstance(estadoPersonaDelEstadoPersonapevcPersona);
            relatedRequest.setPersonaDelEstadoPersonapevcEstadoPersonaInstance(estadoPersonaDelEstadoPersonapthisEstadoPersona);
            personaSrv.delEstadoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICEstadoPersona());

        return response;
    }


    private void suppInfo4ICEstadoPersona(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(EstadoPersonaConstants.ATTR_NAME_ESTADOPERSONADESCRIPCION, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison1);

            SQLWhereConjunction conjunction = new SQLWhereConjunction();
            conjunction.addDisjunction(disjunction);
            select.addConjunction(conjunction);
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    @Override
    protected void applyOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        applyOCOCEstadoPersona(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(EstadoPersonaConstants.CLASS_NAME, EstadoPersonaConstants.ATTR_FIELD_ESTADOPERSONACODIGO, false), true);
    }


    private void applyOCOCEstadoPersona(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_EstadoPersona".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(EstadoPersonaConstants.CLASS_NAME, EstadoPersonaConstants.ATTR_NAME_ESTADOPERSONADESCRIPCION, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildEstadoPersonaRelatedInstance(relatedInstanceJsonOid);
        }
        if (EstadoPersonaConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoPersonaRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoPersonaConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoPersonaRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildEstadoPersonaRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new EstadoPersona(mapper.readValue(relatedInstanceJsonOid, EstadoPersonaOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildEstadoPersonaRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildEstadoPersonaRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            EstadoPersonaOid oid = new EstadoPersonaOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(EstadoPersonaConstants.ATTR_FIELD_ESTADOPERSONACODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getEstadoPersonaCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(EstadoPersonaService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
