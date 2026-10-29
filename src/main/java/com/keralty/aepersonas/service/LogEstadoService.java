package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.LogEstadoConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.UsuarioSistemaExternoConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.LogEstado;
import com.keralty.aepersonas.persistence.oid.LogEstadoOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.UsuarioSistemaExterno;
import com.keralty.aepersonas.repository.LogEstadoJpaRepository;
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
public class LogEstadoService extends AbstractService {

    LogEstadoJpaRepository repository;

    LogEstadoService logEstadoSrv;

    SolicitudService solicitudSrv;

    @Inject
    public LogEstadoService(
            LogEstadoService logEstadoSrv,
            SolicitudService solicitudSrv,
            LogEstadoJpaRepository repository) {
        this.logEstadoSrv = logEstadoSrv;
        this.solicitudSrv = solicitudSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, LogEstadoConstants.CLASS_NAME);
    }

    private List<LogEstado> solveLogEstadoTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, LogEstadoConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveLogEstadoTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, LogEstadoConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class LogEstado
     *
     * @return Population of class LogEstado
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<LogEstado> get() {
        List<LogEstado> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class LogEstado that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class LogEstado matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<LogEstado> get(QueryRequest queryRequest) {
        return solveLogEstadoTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveLogEstadoTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveLogEstadoTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solveLogEstadoTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of LogEstado by ID
     *
     * @param logEstadoId Identification field logEstadoId
     *
     * @return Instance of LogEstado
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public LogEstado getById(Long logEstadoId) {
        return getByOID(new LogEstadoOid(logEstadoId));
    }
    
    /*
     * Returns an instance of LogEstado by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogEstado
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public LogEstado getByOID(LogEstadoOid oid) {
        Optional<LogEstado> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of LogEstado by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogEstado
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public LogEstado getByOIDWithHV(LogEstadoOid oid) {
        Optional<LogEstado> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<LogEstado> getInstanceByOid(LogEstadoOid oid) {
        return oid != null && oid.getLogEstadoId() != null
               ? repository.findById(oid.getLogEstadoId())
               : Optional.empty();
    }

    /*
     * Returns an instance of LogEstado by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of LogEstado
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public LogEstado getByJsonOid(String jsonOid) {
        LogEstadoOid oid = new LogEstadoOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of LogEstado related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of LogEstado
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<LogEstado> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveLogEstadoTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of LogEstado related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of LogEstado
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<LogEstado> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of LogEstado
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of LogEstado
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getLogEstadoDynamic(LogEstadoOid oid, String displaySetItems) {
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
    public String getSuppInfo(LogEstadoOid oid, String dsName) {
        LogEstado instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(LogEstado instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIULogEstado
     *
     * @param queryRequest Query request
     * @return List of viewmodels for LogEstado using displayset DSLogEstado that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.logestado.ds.DSLogEstado> piuPIULogEstado(QueryRequest queryRequest) {
        return solveLogEstadoTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.logestado.ds.DSLogEstado::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIULogEstado
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIULogEstado
     */
    public int getCount4PIULogEstado(QueryRequest queryRequest) {
        return solveLogEstadoTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.logestado.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = logEstadoSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.logestado.siu.CrearRequest request) throws ModelException {
        request.setLogEstadocrearpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getLogEstadocrearpagrSolicitud()));
        return logEstadoSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.logestado.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud logEstadocrearpagrSolicitud = request.getLogEstadocrearpagrSolicitudInstance();
        String logEstadocrearpatrLoginFuncionario = request.getLogEstadocrearpatrLoginFuncionario();
        String logEstadocrearpatrObservacion = request.getLogEstadocrearpatrObservacion();
        String logEstadocrearpatrMotDevolucion = request.getLogEstadocrearpatrMotDevolucion();
        Long logEstadocrearpatrEstado = request.getLogEstadocrearpatrEstado();
        Long logEstadocrearpatrEstadoDoc = request.getLogEstadocrearpatrEstadoDoc();

        request.checkArguments();
        LogEstado instance = new LogEstado();
        instance.add2Solicitud(logEstadocrearpagrSolicitud);

        instance.setLogEstadoId(Long.valueOf(0));
        instance.setLogEstadoFecha(STDFunctions.systemDateTimeFun());
        instance.setLogEstadoLoginFuncionario(logEstadocrearpatrLoginFuncionario);
        instance.setLogEstadoObservacion(logEstadocrearpatrObservacion);
        instance.setLogEstadoMotDevolucion(logEstadocrearpatrMotDevolucion);
        instance.setLogEstadoEstado(logEstadocrearpatrEstado);
        instance.setLogEstadoEstadoDoc(logEstadocrearpatrEstadoDoc);

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
            com.keralty.aepersonas.viewmodel.logestado.siu.TCREARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = logEstadoSrv.tCREARTxn(request);
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
            com.keralty.aepersonas.viewmodel.logestado.siu.TCREARRequest request) throws ModelException {
        request.setLogEstadoTCREARptpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getLogEstadoTCREARptpagrSolicitud()));
        return logEstadoSrv.tCREARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.logestado.siu.TCREARRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud logEstadoTCREARptpagrSolicitud = request.getLogEstadoTCREARptpagrSolicitudInstance();
        String logEstadoTCREARptpatrObservacion = request.getLogEstadoTCREARptpatrObservacion();
        String logEstadoTCREARptpatrMotDevolucion = request.getLogEstadoTCREARptpatrMotDevolucion();
        Long logEstadoTCREARptpatrEstado = request.getLogEstadoTCREARptpatrEstado();
        Long logEstadoTCREARptpatrEstadoDoc = request.getLogEstadoTCREARptpatrEstadoDoc();

        request.checkArguments();
        LogEstado instance;

        /* Action 1: IF (AGENTFuncionario <> NULL) */
        boolean ifCondition1 = (((Funcionario) getAgentInstance(FuncionarioConstants.CLASS_NAME)) != null && !((Funcionario) getAgentInstance(FuncionarioConstants.CLASS_NAME)).isNull());
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.logestado.siu.CrearRequest step10Request = new com.keralty.aepersonas.viewmodel.logestado.siu.CrearRequest();
            step10Request.setLogEstadocrearpagrSolicitudInstance(logEstadoTCREARptpagrSolicitud);
            step10Request.setLogEstadocrearpatrLoginFuncionario(((Funcionario) getAgentInstance(FuncionarioConstants.CLASS_NAME)).getFuncionarioUsuarioLDAP());
            step10Request.setLogEstadocrearpatrObservacion(logEstadoTCREARptpatrObservacion);
            step10Request.setLogEstadocrearpatrMotDevolucion(logEstadoTCREARptpatrMotDevolucion);
            step10Request.setLogEstadocrearpatrEstado(logEstadoTCREARptpatrEstado);
            step10Request.setLogEstadocrearpatrEstadoDoc(logEstadoTCREARptpatrEstadoDoc);
            instance = (LogEstado) logEstadoSrv.crearImplementation(step10Request).getInstance();
        } else {
            /* Action 11: IF (AGENTUsuarioSistemaExterno <> NULL) */
            boolean ifCondition11 = (((UsuarioSistemaExterno) getAgentInstance(UsuarioSistemaExternoConstants.CLASS_NAME)) != null && !((UsuarioSistemaExterno) getAgentInstance(UsuarioSistemaExternoConstants.CLASS_NAME)).isNull());
            if (ifCondition11) {
                com.keralty.aepersonas.viewmodel.logestado.siu.CrearRequest step110Request = new com.keralty.aepersonas.viewmodel.logestado.siu.CrearRequest();
                step110Request.setLogEstadocrearpagrSolicitudInstance(logEstadoTCREARptpagrSolicitud);
                step110Request.setLogEstadocrearpatrLoginFuncionario(((UsuarioSistemaExterno) getAgentInstance(UsuarioSistemaExternoConstants.CLASS_NAME)).getUsuarioSistemaExternoLogin());
                step110Request.setLogEstadocrearpatrObservacion(logEstadoTCREARptpatrObservacion);
                step110Request.setLogEstadocrearpatrMotDevolucion(logEstadoTCREARptpatrMotDevolucion);
                step110Request.setLogEstadocrearpatrEstado(logEstadoTCREARptpatrEstado);
                step110Request.setLogEstadocrearpatrEstadoDoc(logEstadoTCREARptpatrEstadoDoc);
                instance = (LogEstado) logEstadoSrv.crearImplementation(step110Request).getInstance();
            } else {
                com.keralty.aepersonas.viewmodel.logestado.siu.CrearRequest step111Request = new com.keralty.aepersonas.viewmodel.logestado.siu.CrearRequest();
                step111Request.setLogEstadocrearpagrSolicitudInstance(logEstadoTCREARptpagrSolicitud);
                step111Request.setLogEstadocrearpatrLoginFuncionario("usuicafile");
                step111Request.setLogEstadocrearpatrObservacion(logEstadoTCREARptpatrObservacion);
                step111Request.setLogEstadocrearpatrMotDevolucion(logEstadoTCREARptpatrMotDevolucion);
                step111Request.setLogEstadocrearpatrEstado(logEstadoTCREARptpatrEstado);
                step111Request.setLogEstadocrearpatrEstadoDoc(logEstadoTCREARptpatrEstadoDoc);
                instance = (LogEstado) logEstadoSrv.crearImplementation(step111Request).getInstance();
            }
        }

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
        select.getOrderByPart().addItem(Constants.normalizePath(LogEstadoConstants.CLASS_NAME, LogEstadoConstants.ATTR_FIELD_LOGESTADOID, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildLogEstadoRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogEstadoConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogEstadoRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildLogEstadoRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new LogEstado(mapper.readValue(relatedInstanceJsonOid, LogEstadoOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildLogEstadoRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            LogEstadoOid oid = new LogEstadoOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(LogEstadoConstants.ATTR_FIELD_LOGESTADOID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getLogEstadoId(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(LogEstadoService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
