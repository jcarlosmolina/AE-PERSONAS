package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PreguntaConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.oid.SeccionOid;
import com.keralty.aepersonas.persistence.oid.ValorOid;
import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.PreguntaP;
import com.keralty.aepersonas.persistence.Seccion;
import com.keralty.aepersonas.persistence.Valor;
import com.keralty.aepersonas.repository.PreguntaJpaRepository;
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
public class PreguntaService extends AbstractService {

    PreguntaJpaRepository repository;

    PreguntaService preguntaSrv;

    PreguntaPService preguntaPSrv;

    ValorService valorSrv;

    SeccionService seccionSrv;

    @Inject
    public PreguntaService(
            PreguntaService preguntaSrv,
            PreguntaPService preguntaPSrv,
            ValorService valorSrv,
            SeccionService seccionSrv,
            PreguntaJpaRepository repository) {
        this.preguntaSrv = preguntaSrv;
        this.preguntaPSrv = preguntaPSrv;
        this.valorSrv = valorSrv;
        this.seccionSrv = seccionSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, PreguntaConstants.CLASS_NAME);
    }

    private List<Pregunta> solvePreguntaTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, PreguntaConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solvePreguntaTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, PreguntaConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Pregunta
     *
     * @return Population of class Pregunta
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Pregunta> get() {
        List<Pregunta> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class Pregunta that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Pregunta matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Pregunta> get(QueryRequest queryRequest) {
        return solvePreguntaTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solvePreguntaTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solvePreguntaTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solvePreguntaTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Pregunta by ID
     *
     * @param preguntaNumero Identification field preguntaNumero
     *
     * @return Instance of Pregunta
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Pregunta getById(Long preguntaNumero) {
        return getByOID(new PreguntaOid(preguntaNumero));
    }
    
    /*
     * Returns an instance of Pregunta by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Pregunta
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Pregunta getByOID(PreguntaOid oid) {
        Optional<Pregunta> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Pregunta by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Pregunta
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Pregunta getByOIDWithHV(PreguntaOid oid) {
        Optional<Pregunta> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Pregunta> getInstanceByOid(PreguntaOid oid) {
        return oid != null && oid.getPreguntaNumero() != null
               ? repository.findById(oid.getPreguntaNumero())
               : Optional.empty();
    }

    /*
     * Returns an instance of Pregunta by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Pregunta
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Pregunta getByJsonOid(String jsonOid) {
        PreguntaOid oid = new PreguntaOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Pregunta related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Pregunta
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Pregunta> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solvePreguntaTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Pregunta related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Pregunta
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Pregunta> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Pregunta
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Pregunta
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getPreguntaDynamic(PreguntaOid oid, String displaySetItems) {
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
    public String getSuppInfo(PreguntaOid oid, String dsName) {
        Pregunta instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Pregunta instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods

    /*
     * Returns a viewmodel for class Pregunta with displayset DSPreguntaIIU for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Pregunta with displayset DSPreguntaIIU
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.pregunta.ds.DSPreguntaIIU iIUPregunta(PreguntaOid oid) {
        return new com.keralty.aepersonas.viewmodel.pregunta.ds.DSPreguntaIIU(getByOIDWithHV(oid));
    }


    /*
     * Solves the query needed for PIUPregunta
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Pregunta using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.pregunta.ds.AutoDS> piuPIUPregunta(QueryRequest queryRequest) {
        return solvePreguntaTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.pregunta.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUPregunta
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUPregunta
     */
    public int getCount4PIUPregunta(QueryRequest queryRequest) {
        return solvePreguntaTypedQuery(queryRequest).size();
    }

    // Service: InsPreguntaAPersona

    /*
     * Entry point for service InsPreguntaAPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insPreguntaAPersona(
            com.keralty.aepersonas.viewmodel.pregunta.siu.InsPreguntaAPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaSrv.insPreguntaAPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsPreguntaAPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insPreguntaAPersonaTxn(
            com.keralty.aepersonas.viewmodel.pregunta.siu.InsPreguntaAPersonaRequest request) throws ModelException {
        request.setPreguntaInsPreguntaAPersonapthisPreguntaInstance(preguntaSrv.getByOIDWithHV(request.getPreguntaInsPreguntaAPersonapthisPregunta()));
        request.setPreguntaInsPreguntaAPersonapevcPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaInsPreguntaAPersonapevcPreguntaP()));
        return preguntaSrv.insPreguntaAPersonaImplementation(request, true);
    }

    /*
     * Implements service InsPreguntaAPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insPreguntaAPersonaImplementation(
            com.keralty.aepersonas.viewmodel.pregunta.siu.InsPreguntaAPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Pregunta preguntaInsPreguntaAPersonapthisPregunta = request.getPreguntaInsPreguntaAPersonapthisPreguntaInstance();
        PreguntaP preguntaInsPreguntaAPersonapevcPreguntaP = request.getPreguntaInsPreguntaAPersonapevcPreguntaPInstance();

        request.checkArguments();
        Pregunta instance = preguntaInsPreguntaAPersonapthisPregunta;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.preguntap.siu.InsPreguntaAPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.preguntap.siu.InsPreguntaAPersonaRequest();
            relatedRequest.setPreguntaPInsPreguntaAPersonapthisPreguntaPInstance(preguntaInsPreguntaAPersonapevcPreguntaP);
            relatedRequest.setPreguntaPInsPreguntaAPersonapevcPreguntaInstance(preguntaInsPreguntaAPersonapthisPregunta);
            preguntaPSrv.insPreguntaAPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: DelPreguntaDePersona

    /*
     * Entry point for service DelPreguntaDePersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delPreguntaDePersona(
            com.keralty.aepersonas.viewmodel.pregunta.siu.DelPreguntaDePersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaSrv.delPreguntaDePersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelPreguntaDePersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delPreguntaDePersonaTxn(
            com.keralty.aepersonas.viewmodel.pregunta.siu.DelPreguntaDePersonaRequest request) throws ModelException {
        request.setPreguntaDelPreguntaDePersonapthisPreguntaInstance(preguntaSrv.getByOIDWithHV(request.getPreguntaDelPreguntaDePersonapthisPregunta()));
        request.setPreguntaDelPreguntaDePersonapevcPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaDelPreguntaDePersonapevcPreguntaP()));
        return preguntaSrv.delPreguntaDePersonaImplementation(request, true);
    }

    /*
     * Implements service DelPreguntaDePersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delPreguntaDePersonaImplementation(
            com.keralty.aepersonas.viewmodel.pregunta.siu.DelPreguntaDePersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Pregunta preguntaDelPreguntaDePersonapthisPregunta = request.getPreguntaDelPreguntaDePersonapthisPreguntaInstance();
        PreguntaP preguntaDelPreguntaDePersonapevcPreguntaP = request.getPreguntaDelPreguntaDePersonapevcPreguntaPInstance();

        request.checkArguments();
        Pregunta instance = preguntaDelPreguntaDePersonapthisPregunta;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.preguntap.siu.DelPreguntaDePersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.preguntap.siu.DelPreguntaDePersonaRequest();
            relatedRequest.setPreguntaPDelPreguntaDePersonapthisPreguntaPInstance(preguntaDelPreguntaDePersonapevcPreguntaP);
            relatedRequest.setPreguntaPDelPreguntaDePersonapevcPreguntaInstance(preguntaDelPreguntaDePersonapthisPregunta);
            preguntaPSrv.delPreguntaDePersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

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
        select.getOrderByPart().addItem(Constants.normalizePath(PreguntaConstants.CLASS_NAME, PreguntaConstants.ATTR_FIELD_PREGUNTANUMERO, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildPreguntaRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreguntaConstants.ROLE_NAME_VALORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaRelatedInstance4Valor(relatedInstanceJsonOid, remainingPath);
        }
        if (PreguntaConstants.ROLE_NAME_PREGUNTASPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaRelatedInstance4PreguntaP(relatedInstanceJsonOid, remainingPath);
        }
        if (PreguntaConstants.ROLE_NAME_SECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaRelatedInstance4Seccion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildPreguntaRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPreguntaRelatedInstance4Valor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Valor(mapper.readValue(relatedInstanceJsonOid, ValorOid.class)): Valor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPreguntaRelatedInstance4PreguntaP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new PreguntaP(mapper.readValue(relatedInstanceJsonOid, PreguntaPOid.class)): PreguntaP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPreguntaRelatedInstance4Seccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Seccion(mapper.readValue(relatedInstanceJsonOid, SeccionOid.class)): Seccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            PreguntaOid oid = new PreguntaOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PreguntaConstants.ATTR_FIELD_PREGUNTANUMERO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPreguntaNumero(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(PreguntaService.class).error(e.getMessage());
        }
    }

}
