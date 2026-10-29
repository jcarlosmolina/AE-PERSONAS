package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PreexistenciaConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.oid.PreexistenciaOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Preexistencia;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.repository.PreexistenciaJpaRepository;
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
public class PreexistenciaService extends AbstractService {

    PreexistenciaJpaRepository repository;

    PreexistenciaService preexistenciaSrv;

    UsuarioService usuarioSrv;

    @Inject
    public PreexistenciaService(
            PreexistenciaService preexistenciaSrv,
            UsuarioService usuarioSrv,
            PreexistenciaJpaRepository repository) {
        this.preexistenciaSrv = preexistenciaSrv;
        this.usuarioSrv = usuarioSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, PreexistenciaConstants.CLASS_NAME);
    }

    private List<Preexistencia> solvePreexistenciaTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, PreexistenciaConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solvePreexistenciaTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, PreexistenciaConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Preexistencia
     *
     * @return Population of class Preexistencia
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Preexistencia> get() {
        List<Preexistencia> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class Preexistencia that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Preexistencia matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Preexistencia> get(QueryRequest queryRequest) {
        return solvePreexistenciaTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solvePreexistenciaTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solvePreexistenciaTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solvePreexistenciaTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Preexistencia by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @param usuarioUsuarioIdentificador Identification field usuarioUsuarioIdentificador
     *
     * @param preexistenciaIdentificador Identification field preexistenciaIdentificador
     *
     * @return Instance of Preexistencia
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Preexistencia getById(Long aesolicitudesidsolicitud, Long usuarioUsuarioIdentificador, Long preexistenciaIdentificador) {
        return getByOID(new PreexistenciaOid(aesolicitudesidsolicitud, usuarioUsuarioIdentificador, preexistenciaIdentificador));
    }
    
    /*
     * Returns an instance of Preexistencia by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Preexistencia
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Preexistencia getByOID(PreexistenciaOid oid) {
        Optional<Preexistencia> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Preexistencia by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Preexistencia
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Preexistencia getByOIDWithHV(PreexistenciaOid oid) {
        Optional<Preexistencia> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Preexistencia> getInstanceByOid(PreexistenciaOid oid) {
        return oid != null && oid.getAesolicitudesidsolicitud() != null
               ? repository.findById(oid)
               : Optional.empty();
    }

    /*
     * Returns an instance of Preexistencia by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Preexistencia
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Preexistencia getByJsonOid(String jsonOid) {
        PreexistenciaOid oid = new PreexistenciaOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Preexistencia related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Preexistencia
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Preexistencia> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solvePreexistenciaTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Preexistencia related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Preexistencia
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Preexistencia> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Preexistencia
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Preexistencia
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getPreexistenciaDynamic(PreexistenciaOid oid, String displaySetItems) {
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
    public String getSuppInfo(PreexistenciaOid oid, String dsName) {
        Preexistencia instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Preexistencia instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIUPreexistencia
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Preexistencia using displayset DSPreexistenciaPIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.preexistencia.ds.DSPreexistenciaPIU> piuPIUPreexistencia(QueryRequest queryRequest) {
        return solvePreexistenciaTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.preexistencia.ds.DSPreexistenciaPIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUPreexistencia
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUPreexistencia
     */
    public int getCount4PIUPreexistencia(QueryRequest queryRequest) {
        return solvePreexistenciaTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUPreexistenciaNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Preexistencia using displayset DSPreexistenciaNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.preexistencia.ds.DSPreexistenciaNull> piuPIUPreexistenciaNull(QueryRequest queryRequest) {
        return solvePreexistenciaTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.preexistencia.ds.DSPreexistenciaNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUPreexistenciaNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUPreexistenciaNull
     */
    public int getCount4PIUPreexistenciaNull(QueryRequest queryRequest) {
        return solvePreexistenciaTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.preexistencia.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preexistenciaSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.preexistencia.siu.CrearRequest request) throws ModelException {
        request.setPreexistenciacrearpagrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getPreexistenciacrearpagrUsuario()));
        return preexistenciaSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.preexistencia.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario preexistenciacrearpagrUsuario = request.getPreexistenciacrearpagrUsuarioInstance();
        String preexistenciacrearpatrDescripcion = request.getPreexistenciacrearpatrDescripcion();
        Date preexistenciacrearpatrFecInicio = request.getPreexistenciacrearpatrFecInicio();
        Date preexistenciacrearpatrFecFin = request.getPreexistenciacrearpatrFecFin();
        String preexistenciacrearpatrObservacion = request.getPreexistenciacrearpatrObservacion();

        request.checkArguments();
        Preexistencia instance = new Preexistencia();
        instance.add2Usuario(preexistenciacrearpagrUsuario);

        instance.setPreexistenciaIdentificador(Long.valueOf(0));
        instance.setPreexistenciaIdentificador(repository.nextPreexistenciaIdentificador(instance.getAesolicitudesidsolicitud(), instance.getUsuarioUsuarioIdentificador()));
        instance.setPreexistenciaDescripcion(preexistenciacrearpatrDescripcion);
        instance.setPreexistenciaFecInicio(preexistenciacrearpatrFecInicio);
        instance.setPreexistenciaFecFin(preexistenciacrearpatrFecFin);
        instance.setPreexistenciaObservacion(preexistenciacrearpatrObservacion);

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
            com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preexistenciaSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest request) throws ModelException {
        request.setPreexistenciaeliminarpthisPreexistenciaInstance(preexistenciaSrv.getByOIDWithHV(request.getPreexistenciaeliminarpthisPreexistencia()));
        return preexistenciaSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Preexistencia preexistenciaeliminarpthisPreexistencia = request.getPreexistenciaeliminarpthisPreexistenciaInstance();

        request.checkArguments();
        Preexistencia instance = preexistenciaeliminarpthisPreexistencia;


        repository.delete(instance);
        
        response.setInstance(instance);

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
        select.getOrderByPart().addItem(Constants.normalizePath(PreexistenciaConstants.CLASS_NAME, PreexistenciaConstants.ROLE_NAME_USUARIO + "." + UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, false), true);
        select.getOrderByPart().addItem(Constants.normalizePath(PreexistenciaConstants.CLASS_NAME, PreexistenciaConstants.ROLE_NAME_USUARIO + "." + UsuarioConstants.ATTR_FIELD_USUARIOIDENTIFICADOR, false), true);
        select.getOrderByPart().addItem(Constants.normalizePath(PreexistenciaConstants.CLASS_NAME, PreexistenciaConstants.ATTR_FIELD_PREEXISTENCIAIDENTIFICADOR, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildPreexistenciaRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreexistenciaConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreexistenciaRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildPreexistenciaRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Preexistencia(mapper.readValue(relatedInstanceJsonOid, PreexistenciaOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildPreexistenciaRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            PreexistenciaOid oid = new PreexistenciaOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PreexistenciaConstants.ROLE_NAME_USUARIO + "." + UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAesolicitudesidsolicitud(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(PreexistenciaConstants.ROLE_NAME_USUARIO + "." + UsuarioConstants.ATTR_FIELD_USUARIOIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(oid.getUsuarioUsuarioIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison2);
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            comparison3.setFirstOperand(new SQLWhereOperandPathAttribute(PreexistenciaConstants.ATTR_FIELD_PREEXISTENCIAIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(oid.getPreexistenciaIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison3);
        } catch (Exception e) {
            LoggerFactory.getLogger(PreexistenciaService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
