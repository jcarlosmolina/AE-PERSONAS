package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.PreexistenciaCConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PreexistenciaCOid;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.PreexistenciaC;
import com.keralty.aepersonas.repository.PreexistenciaCJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.viewmodel.FilterRequest;
import com.keralty.aepersonas.viewmodel.FilterVariableRequest;
import com.keralty.aepersonas.viewmodel.InstanceResponseViewModel;
import com.keralty.aepersonas.viewmodel.PopulationResponseViewModel;
import com.keralty.aepersonas.viewmodel.PreloadResponseViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class PreexistenciaCService extends AbstractService {

    PreexistenciaCJpaRepository repository;

    PreexistenciaCService preexistenciaCSrv;

    PersonaCService personaCSrv;

    @Inject
    public PreexistenciaCService(
            PreexistenciaCService preexistenciaCSrv,
            PersonaCService personaCSrv,
            PreexistenciaCJpaRepository repository) {
        this.preexistenciaCSrv = preexistenciaCSrv;
        this.personaCSrv = personaCSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, PreexistenciaCConstants.CLASS_NAME);
    }

    private List<PreexistenciaC> solvePreexistenciaCTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, PreexistenciaCConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solvePreexistenciaCTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, PreexistenciaCConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class PreexistenciaC
     *
     * @return Population of class PreexistenciaC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreexistenciaC> get() {
        List<PreexistenciaC> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class PreexistenciaC that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class PreexistenciaC matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreexistenciaC> get(QueryRequest queryRequest) {
        return solvePreexistenciaCTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solvePreexistenciaCTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solvePreexistenciaCTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel();
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
        return new PopulationResponseViewModel(solvePreexistenciaCTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of PreexistenciaC by ID
     *
     * @param personaCID Identification field personaCID
     *
     * @param preexistenciaCIdentificador Identification field preexistenciaCIdentificador
     *
     * @return Instance of PreexistenciaC
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PreexistenciaC getById(Long personaCID, Long preexistenciaCIdentificador) {
        return getByOID(new PreexistenciaCOid(personaCID, preexistenciaCIdentificador));
    }
    
    /*
     * Returns an instance of PreexistenciaC by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PreexistenciaC
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PreexistenciaC getByOID(PreexistenciaCOid oid) {
        Optional<PreexistenciaC> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of PreexistenciaC by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PreexistenciaC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public PreexistenciaC getByOIDWithHV(PreexistenciaCOid oid) {
        Optional<PreexistenciaC> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<PreexistenciaC> getInstanceByOid(PreexistenciaCOid oid) {
        return oid != null && oid.getPersonaCID() != null
               ? repository.findById(oid)
               : Optional.empty();
    }

    /*
     * Returns an instance of PreexistenciaC by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of PreexistenciaC
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public PreexistenciaC getByJsonOid(String jsonOid) {
        PreexistenciaCOid oid = new PreexistenciaCOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of PreexistenciaC related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PreexistenciaC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreexistenciaC> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solvePreexistenciaCTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of PreexistenciaC related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PreexistenciaC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreexistenciaC> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of PreexistenciaC
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of PreexistenciaC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getPreexistenciaCDynamic(PreexistenciaCOid oid, String displaySetItems) {
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
    public String getSuppInfo(PreexistenciaCOid oid, String dsName) {
        PreexistenciaC instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(PreexistenciaC instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods



    // Service: crear

    /*
     * Entry point for service crear
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse crear(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preexistenciaCSrv.crearTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service crear
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse crearTxn(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.CrearRequest request) throws ModelException {
        request.setPreexistenciaCcrearpagrPersonaCInstance(personaCSrv.getByOIDWithHV(request.getPreexistenciaCcrearpagrPersonaC()));
        return preexistenciaCSrv.crearImplementation(request);
    }

    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse crearImplementation(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PersonaC preexistenciaCcrearpagrPersonaC = request.getPreexistenciaCcrearpagrPersonaCInstance();
        String preexistenciaCcrearpatrDescripcion = request.getPreexistenciaCcrearpatrDescripcion();
        Date preexistenciaCcrearpatrFecInicio = request.getPreexistenciaCcrearpatrFecInicio();
        Date preexistenciaCcrearpatrFecFin = request.getPreexistenciaCcrearpatrFecFin();
        String preexistenciaCcrearpatrObservacion = request.getPreexistenciaCcrearpatrObservacion();

        request.checkArguments();
        PreexistenciaC instance = new PreexistenciaC();
        instance.add2PersonaC(preexistenciaCcrearpagrPersonaC);

        instance.setPreexistenciaCIdentificador(Long.valueOf(0));
        instance.setPreexistenciaCIdentificador(repository.nextPreexistenciaCIdentificador(instance.getPersonaCID()));
        instance.setPreexistenciaCDescripcion(preexistenciaCcrearpatrDescripcion);
        instance.setPreexistenciaCFecInicio(preexistenciaCcrearpatrFecInicio);
        instance.setPreexistenciaCFecFin(preexistenciaCcrearpatrFecFin);
        instance.setPreexistenciaCObservacion(preexistenciaCcrearpatrObservacion);

        instance.setOid(instance.getOid());

        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: eliminar

    /*
     * Entry point for service eliminar
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse eliminar(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preexistenciaCSrv.eliminarTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service eliminar
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse eliminarTxn(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.EliminarRequest request) throws ModelException {
        request.setPreexistenciaCeliminarpthisPreexistenciaCInstance(preexistenciaCSrv.getByOIDWithHV(request.getPreexistenciaCeliminarpthisPreexistenciaC()));
        return preexistenciaCSrv.eliminarImplementation(request);
    }

    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse eliminarImplementation(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreexistenciaC preexistenciaCeliminarpthisPreexistenciaC = request.getPreexistenciaCeliminarpthisPreexistenciaCInstance();

        request.checkArguments();
        PreexistenciaC instance = preexistenciaCeliminarpthisPreexistenciaC;


        repository.delete(instance);
        
        response.setInstance(instance);

        return response;
    }

    // Service: modificar

    /*
     * Entry point for service modificar
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse modificar(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preexistenciaCSrv.modificarTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service modificar
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse modificarTxn(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.ModificarRequest request) throws ModelException {
        request.setPreexistenciaCmodificarpthisPreexistenciaCInstance(preexistenciaCSrv.getByOIDWithHV(request.getPreexistenciaCmodificarpthisPreexistenciaC()));
        return preexistenciaCSrv.modificarImplementation(request);
    }

    /*
     * Implements service modificar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse modificarImplementation(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreexistenciaC preexistenciaCmodificarpthisPreexistenciaC = request.getPreexistenciaCmodificarpthisPreexistenciaCInstance();
        String preexistenciaCmodificarpDescripcion = request.getPreexistenciaCmodificarpDescripcion();
        Date preexistenciaCmodificarpFecInicio = request.getPreexistenciaCmodificarpFecInicio();
        Date preexistenciaCmodificarpFecFin = request.getPreexistenciaCmodificarpFecFin();
        String preexistenciaCmodificarpObervacion = request.getPreexistenciaCmodificarpObervacion();

        request.checkArguments();
        PreexistenciaC instance = preexistenciaCmodificarpthisPreexistenciaC;
        instance.setPreexistenciaCDescripcion(preexistenciaCmodificarpDescripcion);
        instance.setPreexistenciaCFecInicio(preexistenciaCmodificarpFecInicio);
        instance.setPreexistenciaCFecFin(preexistenciaCmodificarpFecFin);
        instance.setPreexistenciaCObservacion(preexistenciaCmodificarpObervacion);


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: TCREARFROMWS

    /*
     * Entry point for service TCREARFROMWS
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARFROMWS(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.TCREARFROMWSRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preexistenciaCSrv.tCREARFROMWSTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARFROMWS
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARFROMWSTxn(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.TCREARFROMWSRequest request) throws ModelException {
        request.setPreexistenciaCTCREARFROMWSpPersonaCInstance(personaCSrv.getByOIDWithHV(request.getPreexistenciaCTCREARFROMWSpPersonaC()));
        request.setPreexistenciaCTCREARFROMWSpPreexistenciaCInstance(preexistenciaCSrv.getByOIDWithHV(request.getPreexistenciaCTCREARFROMWSpPreexistenciaC()));
        return preexistenciaCSrv.tCREARFROMWSImplementation(request);
    }

    /*
     * Implements service TCREARFROMWS
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARFROMWSImplementation(
            com.keralty.aepersonas.viewmodel.preexistenciac.siu.TCREARFROMWSRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PersonaC preexistenciaCTCREARFROMWSpPersonaC = request.getPreexistenciaCTCREARFROMWSpPersonaCInstance();
        PreexistenciaC preexistenciaCTCREARFROMWSpPreexistenciaC = request.getPreexistenciaCTCREARFROMWSpPreexistenciaCInstance();

        request.checkArguments();
        PreexistenciaC instance;

        com.keralty.aepersonas.viewmodel.preexistenciac.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.preexistenciac.siu.CrearRequest();
        step1Request.setPreexistenciaCcrearpagrPersonaCInstance(preexistenciaCTCREARFROMWSpPersonaC);
        step1Request.setPreexistenciaCcrearpatrDescripcion(preexistenciaCTCREARFROMWSpPreexistenciaC.getPreexistenciaCDescripcion());
        step1Request.setPreexistenciaCcrearpatrFecInicio(preexistenciaCTCREARFROMWSpPreexistenciaC.getPreexistenciaCFecInicio());
        step1Request.setPreexistenciaCcrearpatrFecFin(preexistenciaCTCREARFROMWSpPreexistenciaC.getPreexistenciaCFecFin());
        step1Request.setPreexistenciaCcrearpatrObservacion(preexistenciaCTCREARFROMWSpPreexistenciaC.getPreexistenciaCObservacion());
        instance = (PreexistenciaC) preexistenciaCSrv.crearImplementation(step1Request).getInstance();

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    @Override
    protected void applyOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(PreexistenciaCConstants.CLASS_NAME, PreexistenciaCConstants.ROLE_NAME_PERSONAC + "." + PersonaCConstants.ATTR_FIELD_PERSONACID, false), true);
        select.getOrderByPart().addItem(Constants.normalizePath(PreexistenciaCConstants.CLASS_NAME, PreexistenciaCConstants.ATTR_FIELD_PREEXISTENCIACIDENTIFICADOR, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildPreexistenciaCRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreexistenciaCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreexistenciaCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildPreexistenciaCRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new PreexistenciaC(mapper.readValue(relatedInstanceJsonOid, PreexistenciaCOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildPreexistenciaCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
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
            PreexistenciaCOid oid = new PreexistenciaCOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PreexistenciaCConstants.ROLE_NAME_PERSONAC + "." + PersonaCConstants.ATTR_FIELD_PERSONACID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPersonaCID(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(PreexistenciaCConstants.ATTR_FIELD_PREEXISTENCIACIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(oid.getPreexistenciaCIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison2);
        } catch (Exception e) {
            LoggerFactory.getLogger(PreexistenciaCService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
