package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.PregCuesMedCConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PregCuesMedCOid;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.PregCuesMedC;
import com.keralty.aepersonas.repository.PregCuesMedCJpaRepository;
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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class PregCuesMedCService extends AbstractService {

    PregCuesMedCJpaRepository repository;

    PregCuesMedCService pregCuesMedCSrv;

    PersonaCService personaCSrv;

    @Inject
    public PregCuesMedCService(
            PregCuesMedCService pregCuesMedCSrv,
            PersonaCService personaCSrv,
            PregCuesMedCJpaRepository repository) {
        this.pregCuesMedCSrv = pregCuesMedCSrv;
        this.personaCSrv = personaCSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, PregCuesMedCConstants.CLASS_NAME);
    }

    private List<PregCuesMedC> solvePregCuesMedCTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, PregCuesMedCConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solvePregCuesMedCTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, PregCuesMedCConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class PregCuesMedC
     *
     * @return Population of class PregCuesMedC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PregCuesMedC> get() {
        List<PregCuesMedC> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class PregCuesMedC that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class PregCuesMedC matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PregCuesMedC> get(QueryRequest queryRequest) {
        return solvePregCuesMedCTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solvePregCuesMedCTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solvePregCuesMedCTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solvePregCuesMedCTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of PregCuesMedC by ID
     *
     * @param personaCID Identification field personaCID
     *
     * @param pregCuesMedCCodPregunta Identification field pregCuesMedCCodPregunta
     *
     * @return Instance of PregCuesMedC
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PregCuesMedC getById(Long personaCID, Long pregCuesMedCCodPregunta) {
        return getByOID(new PregCuesMedCOid(personaCID, pregCuesMedCCodPregunta));
    }
    
    /*
     * Returns an instance of PregCuesMedC by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PregCuesMedC
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PregCuesMedC getByOID(PregCuesMedCOid oid) {
        Optional<PregCuesMedC> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of PregCuesMedC by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PregCuesMedC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public PregCuesMedC getByOIDWithHV(PregCuesMedCOid oid) {
        Optional<PregCuesMedC> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<PregCuesMedC> getInstanceByOid(PregCuesMedCOid oid) {
        return oid != null && oid.getPersonaCID() != null
               ? repository.findById(oid)
               : Optional.empty();
    }

    /*
     * Returns an instance of PregCuesMedC by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of PregCuesMedC
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public PregCuesMedC getByJsonOid(String jsonOid) {
        PregCuesMedCOid oid = new PregCuesMedCOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of PregCuesMedC related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PregCuesMedC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PregCuesMedC> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solvePregCuesMedCTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of PregCuesMedC related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PregCuesMedC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PregCuesMedC> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of PregCuesMedC
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of PregCuesMedC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getPregCuesMedCDynamic(PregCuesMedCOid oid, String displaySetItems) {
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
    public String getSuppInfo(PregCuesMedCOid oid, String dsName) {
        PregCuesMedC instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(PregCuesMedC instance, String dsName) {
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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = pregCuesMedCSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.CrearRequest request) throws ModelException {
        request.setPregCuesMedCcrearpagrPersonaCInstance(personaCSrv.getByOIDWithHV(request.getPregCuesMedCcrearpagrPersonaC()));
        return pregCuesMedCSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PersonaC pregCuesMedCcrearpagrPersonaC = request.getPregCuesMedCcrearpagrPersonaCInstance();
        Long pregCuesMedCcrearpatrCodPregunta = request.getPregCuesMedCcrearpatrCodPregunta();
        Boolean pregCuesMedCcrearpatrRptaPregunta = request.getPregCuesMedCcrearpatrRptaPregunta();
        String pregCuesMedCcrearpatrObservacions = request.getPregCuesMedCcrearpatrObservacions();

        request.checkArguments();
        PregCuesMedC instance = new PregCuesMedC();
        instance.add2PersonaC(pregCuesMedCcrearpagrPersonaC);

        instance.setPregCuesMedCCodPregunta(pregCuesMedCcrearpatrCodPregunta);
        instance.setPregCuesMedCRptaPregunta(pregCuesMedCcrearpatrRptaPregunta);
        instance.setPregCuesMedCObservacions(pregCuesMedCcrearpatrObservacions);

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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = pregCuesMedCSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.EliminarRequest request) throws ModelException {
        request.setPregCuesMedCeliminarpthisPregCuesMedCInstance(pregCuesMedCSrv.getByOIDWithHV(request.getPregCuesMedCeliminarpthisPregCuesMedC()));
        return pregCuesMedCSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PregCuesMedC pregCuesMedCeliminarpthisPregCuesMedC = request.getPregCuesMedCeliminarpthisPregCuesMedCInstance();

        request.checkArguments();
        PregCuesMedC instance = pregCuesMedCeliminarpthisPregCuesMedC;


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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = pregCuesMedCSrv.modificarTxn(request);
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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.ModificarRequest request) throws ModelException {
        request.setPregCuesMedCmodificarpthisPregCuesMedCInstance(pregCuesMedCSrv.getByOIDWithHV(request.getPregCuesMedCmodificarpthisPregCuesMedC()));
        return pregCuesMedCSrv.modificarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PregCuesMedC pregCuesMedCmodificarpthisPregCuesMedC = request.getPregCuesMedCmodificarpthisPregCuesMedCInstance();
        Boolean pregCuesMedCmodificarpRptaPregunta = request.getPregCuesMedCmodificarpRptaPregunta();
        String pregCuesMedCmodificarpObservacions = request.getPregCuesMedCmodificarpObservacions();

        request.checkArguments();
        PregCuesMedC instance = pregCuesMedCmodificarpthisPregCuesMedC;
        instance.setPregCuesMedCRptaPregunta(pregCuesMedCmodificarpRptaPregunta);
        instance.setPregCuesMedCObservacions(pregCuesMedCmodificarpObservacions);


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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.TCREARFROMWSRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = pregCuesMedCSrv.tCREARFROMWSTxn(request);
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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.TCREARFROMWSRequest request) throws ModelException {
        request.setPregCuesMedCTCREARFROMWSpPersonaCInstance(personaCSrv.getByOIDWithHV(request.getPregCuesMedCTCREARFROMWSpPersonaC()));
        request.setPregCuesMedCTCREARFROMWSpPregCuesMedCInstance(pregCuesMedCSrv.getByOIDWithHV(request.getPregCuesMedCTCREARFROMWSpPregCuesMedC()));
        return pregCuesMedCSrv.tCREARFROMWSImplementation(request);
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
            com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.TCREARFROMWSRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PersonaC pregCuesMedCTCREARFROMWSpPersonaC = request.getPregCuesMedCTCREARFROMWSpPersonaCInstance();
        PregCuesMedC pregCuesMedCTCREARFROMWSpPregCuesMedC = request.getPregCuesMedCTCREARFROMWSpPregCuesMedCInstance();

        request.checkArguments();
        PregCuesMedC instance;

        com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.pregcuesmedc.siu.CrearRequest();
        step1Request.setPregCuesMedCcrearpagrPersonaCInstance(pregCuesMedCTCREARFROMWSpPersonaC);
        step1Request.setPregCuesMedCcrearpatrCodPregunta(pregCuesMedCTCREARFROMWSpPregCuesMedC.getPregCuesMedCCodPregunta());
        step1Request.setPregCuesMedCcrearpatrRptaPregunta(pregCuesMedCTCREARFROMWSpPregCuesMedC.getPregCuesMedCRptaPregunta());
        step1Request.setPregCuesMedCcrearpatrObservacions(pregCuesMedCTCREARFROMWSpPregCuesMedC.getPregCuesMedCObservacions());
        instance = (PregCuesMedC) pregCuesMedCSrv.crearImplementation(step1Request).getInstance();

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
        select.getOrderByPart().addItem(Constants.normalizePath(PregCuesMedCConstants.CLASS_NAME, PregCuesMedCConstants.ROLE_NAME_PERSONAC + "." + PersonaCConstants.ATTR_FIELD_PERSONACID, false), true);
        select.getOrderByPart().addItem(Constants.normalizePath(PregCuesMedCConstants.CLASS_NAME, PregCuesMedCConstants.ATTR_FIELD_PREGCUESMEDCCODPREGUNTA, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildPregCuesMedCRelatedInstance(relatedInstanceJsonOid);
        }
        if (PregCuesMedCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPregCuesMedCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildPregCuesMedCRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new PregCuesMedC(mapper.readValue(relatedInstanceJsonOid, PregCuesMedCOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPregCuesMedCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
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
            PregCuesMedCOid oid = new PregCuesMedCOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PregCuesMedCConstants.ROLE_NAME_PERSONAC + "." + PersonaCConstants.ATTR_FIELD_PERSONACID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPersonaCID(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(PregCuesMedCConstants.ATTR_FIELD_PREGCUESMEDCCODPREGUNTA, Constants.Type.INT.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(oid.getPregCuesMedCCodPregunta(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison2);
        } catch (Exception e) {
            LoggerFactory.getLogger(PregCuesMedCService.class).error(e.getMessage());
        }
    }

}
