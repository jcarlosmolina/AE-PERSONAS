package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.LogAsignacionesConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.LogAsignaciones;
import com.keralty.aepersonas.persistence.oid.LogAsignacionesOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.repository.LogAsignacionesJpaRepository;
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
public class LogAsignacionesService extends AbstractService {

    LogAsignacionesJpaRepository repository;

    LogAsignacionesService logAsignacionesSrv;

    SolicitudService solicitudSrv;

    @Inject
    public LogAsignacionesService(
            LogAsignacionesService logAsignacionesSrv,
            SolicitudService solicitudSrv,
            LogAsignacionesJpaRepository repository) {
        this.logAsignacionesSrv = logAsignacionesSrv;
        this.solicitudSrv = solicitudSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, LogAsignacionesConstants.CLASS_NAME);
    }

    private List<LogAsignaciones> solveLogAsignacionesTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, LogAsignacionesConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveLogAsignacionesTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, LogAsignacionesConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class LogAsignaciones
     *
     * @return Population of class LogAsignaciones
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<LogAsignaciones> get() {
        List<LogAsignaciones> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class LogAsignaciones that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class LogAsignaciones matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<LogAsignaciones> get(QueryRequest queryRequest) {
        return solveLogAsignacionesTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveLogAsignacionesTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveLogAsignacionesTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solveLogAsignacionesTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of LogAsignaciones by ID
     *
     * @param logAsignacionesidLogAsignaciones Identification field logAsignacionesidLogAsignaciones
     *
     * @return Instance of LogAsignaciones
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public LogAsignaciones getById(Long logAsignacionesidLogAsignaciones) {
        return getByOID(new LogAsignacionesOid(logAsignacionesidLogAsignaciones));
    }
    
    /*
     * Returns an instance of LogAsignaciones by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogAsignaciones
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public LogAsignaciones getByOID(LogAsignacionesOid oid) {
        Optional<LogAsignaciones> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of LogAsignaciones by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogAsignaciones
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public LogAsignaciones getByOIDWithHV(LogAsignacionesOid oid) {
        Optional<LogAsignaciones> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<LogAsignaciones> getInstanceByOid(LogAsignacionesOid oid) {
        return oid != null && oid.getLogAsignacionesidLogAsignaciones() != null
               ? repository.findById(oid.getLogAsignacionesidLogAsignaciones())
               : Optional.empty();
    }

    /*
     * Returns an instance of LogAsignaciones by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of LogAsignaciones
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public LogAsignaciones getByJsonOid(String jsonOid) {
        LogAsignacionesOid oid = new LogAsignacionesOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of LogAsignaciones related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of LogAsignaciones
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<LogAsignaciones> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveLogAsignacionesTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of LogAsignaciones related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of LogAsignaciones
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<LogAsignaciones> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of LogAsignaciones
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of LogAsignaciones
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getLogAsignacionesDynamic(LogAsignacionesOid oid, String displaySetItems) {
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
    public String getSuppInfo(LogAsignacionesOid oid, String dsName) {
        LogAsignaciones instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(LogAsignaciones instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIULogAsignaciones
     *
     * @param queryRequest Query request
     * @return List of viewmodels for LogAsignaciones using displayset DSLogAsignaciones that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.logasignaciones.ds.DSLogAsignaciones> piuPIULogAsignaciones(QueryRequest queryRequest) {
        return solveLogAsignacionesTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.logasignaciones.ds.DSLogAsignaciones::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIULogAsignaciones
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIULogAsignaciones
     */
    public int getCount4PIULogAsignaciones(QueryRequest queryRequest) {
        return solveLogAsignacionesTypedQuery(queryRequest).size();
    }

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
            com.keralty.aepersonas.viewmodel.logasignaciones.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = logAsignacionesSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.logasignaciones.siu.CrearRequest request) throws ModelException {
        request.setLogAsignacionescrearpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getLogAsignacionescrearpagrSolicitud()));
        return logAsignacionesSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.logasignaciones.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud logAsignacionescrearpagrSolicitud = request.getLogAsignacionescrearpagrSolicitudInstance();
        String logAsignacionescrearpatrTipo = request.getLogAsignacionescrearpatrTipo();
        String logAsignacionescrearpatrUsuario = request.getLogAsignacionescrearpatrUsuario();
        String logAsignacionescrearpatrQuien = request.getLogAsignacionescrearpatrQuien();

        request.checkArguments();
        LogAsignaciones instance = new LogAsignaciones();
        instance.add2Solicitud(logAsignacionescrearpagrSolicitud);

        instance.setLogAsignacionesidLogAsignaciones(Long.valueOf(0));
        instance.setLogAsignacionesFechaHora(STDFunctions.systemDateTimeFun());
        instance.setLogAsignacionesTipo(logAsignacionescrearpatrTipo);
        instance.setLogAsignacionesUsuario(logAsignacionescrearpatrUsuario);
        instance.setLogAsignacionesQuien(logAsignacionescrearpatrQuien);

        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: TCREAR

    /*
     * Entry point for service TCREAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREAR(
            com.keralty.aepersonas.viewmodel.logasignaciones.siu.TCREARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = logAsignacionesSrv.tCREARTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARTxn(
            com.keralty.aepersonas.viewmodel.logasignaciones.siu.TCREARRequest request) throws ModelException {
        request.setLogAsignacionesTCREARptpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getLogAsignacionesTCREARptpagrSolicitud()));
        return logAsignacionesSrv.tCREARImplementation(request);
    }

    /*
     * Implements service TCREAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARImplementation(
            com.keralty.aepersonas.viewmodel.logasignaciones.siu.TCREARRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud logAsignacionesTCREARptpagrSolicitud = request.getLogAsignacionesTCREARptpagrSolicitudInstance();
        String logAsignacionesTCREARptpatrTipo = request.getLogAsignacionesTCREARptpatrTipo();
        String logAsignacionesTCREARptpatrUsuario = request.getLogAsignacionesTCREARptpatrUsuario();

        request.checkArguments();
        LogAsignaciones instance;

        /* Action 1: IF (AGENTFuncionario <> NULL) */
        boolean ifCondition1 = (((Funcionario) getAgentInstance(FuncionarioConstants.CLASS_NAME)) != null && !((Funcionario) getAgentInstance(FuncionarioConstants.CLASS_NAME)).isNull());
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.logasignaciones.siu.CrearRequest step10Request = new com.keralty.aepersonas.viewmodel.logasignaciones.siu.CrearRequest();
            step10Request.setLogAsignacionescrearpagrSolicitudInstance(logAsignacionesTCREARptpagrSolicitud);
            step10Request.setLogAsignacionescrearpatrTipo(logAsignacionesTCREARptpatrTipo);
            step10Request.setLogAsignacionescrearpatrUsuario(logAsignacionesTCREARptpatrUsuario);
            step10Request.setLogAsignacionescrearpatrQuien(((Funcionario) getAgentInstance(FuncionarioConstants.CLASS_NAME)).getFuncionarioUsuarioLDAP());
            instance = (LogAsignaciones) logAsignacionesSrv.crearImplementation(step10Request).getInstance();
        } else {
            com.keralty.aepersonas.viewmodel.logasignaciones.siu.CrearRequest step11Request = new com.keralty.aepersonas.viewmodel.logasignaciones.siu.CrearRequest();
            step11Request.setLogAsignacionescrearpagrSolicitudInstance(logAsignacionesTCREARptpagrSolicitud);
            step11Request.setLogAsignacionescrearpatrTipo(logAsignacionesTCREARptpatrTipo);
            step11Request.setLogAsignacionescrearpatrUsuario(logAsignacionesTCREARptpatrUsuario);
            step11Request.setLogAsignacionescrearpatrQuien("usuicafile");
            instance = (LogAsignaciones) logAsignacionesSrv.crearImplementation(step11Request).getInstance();
        }

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    @Override
    protected void applyOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        applyOCOCLogAsignaciones(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(LogAsignacionesConstants.CLASS_NAME, LogAsignacionesConstants.ATTR_FIELD_LOGASIGNACIONESIDLOGASIGNACIONES, false), true);
    }


    private void applyOCOCLogAsignaciones(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_LogAsignaciones".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(LogAsignacionesConstants.CLASS_NAME, LogAsignacionesConstants.ATTR_NAME_LOGASIGNACIONESFECHAHORA, false), false);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildLogAsignacionesRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogAsignacionesConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogAsignacionesRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildLogAsignacionesRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new LogAsignaciones(mapper.readValue(relatedInstanceJsonOid, LogAsignacionesOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildLogAsignacionesRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            LogAsignacionesOid oid = new LogAsignacionesOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(LogAsignacionesConstants.ATTR_FIELD_LOGASIGNACIONESIDLOGASIGNACIONES, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getLogAsignacionesidLogAsignaciones(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(LogAsignacionesService.class).error(e.getMessage());
        }
    }

}
