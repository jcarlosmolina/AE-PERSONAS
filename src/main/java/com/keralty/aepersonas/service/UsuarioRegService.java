package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.UsuarioRegConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.UsuarioRegOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.UsuarioReg;
import com.keralty.aepersonas.repository.UsuarioRegJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathInstance;
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
public class UsuarioRegService extends AbstractService {

    UsuarioRegJpaRepository repository;

    UsuarioRegService usuarioRegSrv;

    ParentescoService parentescoSrv;

    EstadoBeneficiarioService estadoBeneficiarioSrv;

    SolicitudService solicitudSrv;

    @Inject
    public UsuarioRegService(
            UsuarioRegService usuarioRegSrv,
            ParentescoService parentescoSrv,
            EstadoBeneficiarioService estadoBeneficiarioSrv,
            SolicitudService solicitudSrv,
            UsuarioRegJpaRepository repository) {
        this.usuarioRegSrv = usuarioRegSrv;
        this.parentescoSrv = parentescoSrv;
        this.estadoBeneficiarioSrv = estadoBeneficiarioSrv;
        this.solicitudSrv = solicitudSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, UsuarioRegConstants.CLASS_NAME);
    }

    private List<UsuarioReg> solveUsuarioRegTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, UsuarioRegConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveUsuarioRegTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, UsuarioRegConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class UsuarioReg
     *
     * @return Population of class UsuarioReg
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<UsuarioReg> get() {
        List<UsuarioReg> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class UsuarioReg that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class UsuarioReg matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<UsuarioReg> get(QueryRequest queryRequest) {
        return solveUsuarioRegTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveUsuarioRegTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveUsuarioRegTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solveUsuarioRegTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of UsuarioReg by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @param usuarioRegIdentificador Identification field usuarioRegIdentificador
     *
     * @return Instance of UsuarioReg
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public UsuarioReg getById(Long aesolicitudesidsolicitud, Long usuarioRegIdentificador) {
        return getByOID(new UsuarioRegOid(aesolicitudesidsolicitud, usuarioRegIdentificador));
    }
    
    /*
     * Returns an instance of UsuarioReg by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioReg
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public UsuarioReg getByOID(UsuarioRegOid oid) {
        Optional<UsuarioReg> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of UsuarioReg by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioReg
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public UsuarioReg getByOIDWithHV(UsuarioRegOid oid) {
        Optional<UsuarioReg> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<UsuarioReg> getInstanceByOid(UsuarioRegOid oid) {
        return oid != null && oid.getAesolicitudesidsolicitud() != null
               ? repository.findById(oid)
               : Optional.empty();
    }

    /*
     * Returns an instance of UsuarioReg by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of UsuarioReg
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public UsuarioReg getByJsonOid(String jsonOid) {
        UsuarioRegOid oid = new UsuarioRegOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of UsuarioReg related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of UsuarioReg
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<UsuarioReg> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveUsuarioRegTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of UsuarioReg related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of UsuarioReg
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<UsuarioReg> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of UsuarioReg
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of UsuarioReg
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getUsuarioRegDynamic(UsuarioRegOid oid, String displaySetItems) {
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
    public String getSuppInfo(UsuarioRegOid oid, String dsName) {
        UsuarioReg instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(UsuarioReg instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIUUsuarioReg
     *
     * @param queryRequest Query request
     * @return List of viewmodels for UsuarioReg using displayset DSUsuarioRegPIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.usuarioreg.ds.DSUsuarioRegPIU> piuPIUUsuarioReg(QueryRequest queryRequest) {
        return solveUsuarioRegTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.usuarioreg.ds.DSUsuarioRegPIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUUsuarioReg
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUUsuarioReg
     */
    public int getCount4PIUUsuarioReg(QueryRequest queryRequest) {
        return solveUsuarioRegTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioRegSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.CrearRequest request) throws ModelException {
        request.setUsuarioRegcrearpagrParentescoInstance(parentescoSrv.getByOIDWithHV(request.getUsuarioRegcrearpagrParentesco()));
        request.setUsuarioRegcrearpagrEstadoBeneficiarioInstance(estadoBeneficiarioSrv.getByOIDWithHV(request.getUsuarioRegcrearpagrEstadoBeneficiario()));
        request.setUsuarioRegcrearpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getUsuarioRegcrearpagrSolicitud()));
        return usuarioRegSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Parentesco usuarioRegcrearpagrParentesco = request.getUsuarioRegcrearpagrParentescoInstance();
        EstadoBeneficiario usuarioRegcrearpagrEstadoBeneficiario = request.getUsuarioRegcrearpagrEstadoBeneficiarioInstance();
        Solicitud usuarioRegcrearpagrSolicitud = request.getUsuarioRegcrearpagrSolicitudInstance();
        String usuarioRegcrearpatrTipoIdentificacion = request.getUsuarioRegcrearpatrTipoIdentificacion();
        String usuarioRegcrearpatrNumIdentificacion = request.getUsuarioRegcrearpatrNumIdentificacion();
        String usuarioRegcrearpatrPrimerNombre = request.getUsuarioRegcrearpatrPrimerNombre();
        String usuarioRegcrearpatrSegundoNombre = request.getUsuarioRegcrearpatrSegundoNombre();
        String usuarioRegcrearpatrPrimerApellido = request.getUsuarioRegcrearpatrPrimerApellido();
        String usuarioRegcrearpatrSegundoApellido = request.getUsuarioRegcrearpatrSegundoApellido();
        Long usuarioRegcrearpatrNumUsuario = request.getUsuarioRegcrearpatrNumUsuario();
        Date usuarioRegcrearpatrFechaInicioVigencia = request.getUsuarioRegcrearpatrFechaInicioVigencia();
        Date usuarioRegcrearpatrFechaFinVigencia = request.getUsuarioRegcrearpatrFechaFinVigencia();
        String usuarioRegcrearpatrGenero = request.getUsuarioRegcrearpatrGenero();
        Date usuarioRegcrearpatrFechaNacimiento = request.getUsuarioRegcrearpatrFechaNacimiento();

        request.checkArguments();
        UsuarioReg instance = new UsuarioReg();
        if (usuarioRegcrearpagrParentesco != null && !usuarioRegcrearpagrParentesco.isNull()) {
            instance.add2Parentesco(usuarioRegcrearpagrParentesco);
        }

        if (usuarioRegcrearpagrEstadoBeneficiario != null && !usuarioRegcrearpagrEstadoBeneficiario.isNull()) {
            instance.add2EstadoBeneficiario(usuarioRegcrearpagrEstadoBeneficiario);
        }

        instance.add2Solicitud(usuarioRegcrearpagrSolicitud);

        instance.setUsuarioRegIdentificador(Long.valueOf(0));
        instance.setUsuarioRegTipoYNumDoc(null);
        instance.setUsuarioRegIdentificador(repository.nextUsuarioRegIdentificador(instance.getAesolicitudesidsolicitud()));
        instance.setUsuarioRegTipoIdentificacion(usuarioRegcrearpatrTipoIdentificacion);
        instance.setUsuarioRegNumIdentificacion(usuarioRegcrearpatrNumIdentificacion);
        instance.setUsuarioRegPrimerNombre(usuarioRegcrearpatrPrimerNombre);
        instance.setUsuarioRegSegundoNombre(usuarioRegcrearpatrSegundoNombre);
        instance.setUsuarioRegPrimerApellido(usuarioRegcrearpatrPrimerApellido);
        instance.setUsuarioRegSegundoApellido(usuarioRegcrearpatrSegundoApellido);
        instance.setUsuarioRegNumUsuario(usuarioRegcrearpatrNumUsuario);
        instance.setUsuarioRegFechaInicioVigencia(usuarioRegcrearpatrFechaInicioVigencia);
        instance.setUsuarioRegFechaFinVigencia(usuarioRegcrearpatrFechaFinVigencia);
        instance.setUsuarioRegGenero(usuarioRegcrearpatrGenero);
        instance.setUsuarioRegFechaNacimiento(usuarioRegcrearpatrFechaNacimiento);

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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioRegSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.EliminarRequest request) throws ModelException {
        request.setUsuarioRegeliminarpthisUsuarioRegInstance(usuarioRegSrv.getByOIDWithHV(request.getUsuarioRegeliminarpthisUsuarioReg()));
        return usuarioRegSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        UsuarioReg usuarioRegeliminarpthisUsuarioReg = request.getUsuarioRegeliminarpthisUsuarioRegInstance();

        request.checkArguments();
        UsuarioReg instance = usuarioRegeliminarpthisUsuarioReg;


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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioRegSrv.modificarTxn(request);
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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.ModificarRequest request) throws ModelException {
        request.setUsuarioRegmodificarpthisUsuarioRegInstance(usuarioRegSrv.getByOIDWithHV(request.getUsuarioRegmodificarpthisUsuarioReg()));
        return usuarioRegSrv.modificarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        UsuarioReg usuarioRegmodificarpthisUsuarioReg = request.getUsuarioRegmodificarpthisUsuarioRegInstance();
        String usuarioRegmodificarpTipoYNumDoc = request.getUsuarioRegmodificarpTipoYNumDoc();

        request.checkArguments();
        UsuarioReg instance = usuarioRegmodificarpthisUsuarioReg;
        instance.setUsuarioRegTipoYNumDoc(usuarioRegmodificarpTipoYNumDoc);


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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.TCREARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioRegSrv.tCREARTxn(request);
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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.TCREARRequest request) throws ModelException {
        request.setUsuarioRegTCREARptpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getUsuarioRegTCREARptpagrSolicitud()));
        request.setUsuarioRegTCREARptpagrEstadoBeneficiarioInstance(estadoBeneficiarioSrv.getByOIDWithHV(request.getUsuarioRegTCREARptpagrEstadoBeneficiario()));
        request.setUsuarioRegTCREARptpagrParentescoInstance(parentescoSrv.getByOIDWithHV(request.getUsuarioRegTCREARptpagrParentesco()));
        return usuarioRegSrv.tCREARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.usuarioreg.siu.TCREARRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Parentesco usuarioRegTCREARptpagrParentesco = request.getUsuarioRegTCREARptpagrParentescoInstance();
        EstadoBeneficiario usuarioRegTCREARptpagrEstadoBeneficiario = request.getUsuarioRegTCREARptpagrEstadoBeneficiarioInstance();
        Solicitud usuarioRegTCREARptpagrSolicitud = request.getUsuarioRegTCREARptpagrSolicitudInstance();
        String usuarioRegTCREARptpatrTipoIdentificacion = request.getUsuarioRegTCREARptpatrTipoIdentificacion();
        String usuarioRegTCREARptpatrNumIdentificacion = request.getUsuarioRegTCREARptpatrNumIdentificacion();
        String usuarioRegTCREARptpatrPrimerNombre = request.getUsuarioRegTCREARptpatrPrimerNombre();
        String usuarioRegTCREARptpatrSegundoNombre = request.getUsuarioRegTCREARptpatrSegundoNombre();
        String usuarioRegTCREARptpatrPrimerApellido = request.getUsuarioRegTCREARptpatrPrimerApellido();
        String usuarioRegTCREARptpatrSegundoApellido = request.getUsuarioRegTCREARptpatrSegundoApellido();
        Long usuarioRegTCREARptpatrNumUsuario = request.getUsuarioRegTCREARptpatrNumUsuario();
        Date usuarioRegTCREARptpatrFechaInicioVigencia = request.getUsuarioRegTCREARptpatrFechaInicioVigencia();
        Date usuarioRegTCREARptpatrFechaFinVigencia = request.getUsuarioRegTCREARptpatrFechaFinVigencia();
        String usuarioRegTCREARptpatrGenero = request.getUsuarioRegTCREARptpatrGenero();
        Date usuarioRegTCREARptpatrFechaNacimiento = request.getUsuarioRegTCREARptpatrFechaNacimiento();

        request.checkArguments();
        UsuarioReg instance;

        com.keralty.aepersonas.viewmodel.usuarioreg.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.usuarioreg.siu.CrearRequest();
        step1Request.setUsuarioRegcrearpagrParentescoInstance(usuarioRegTCREARptpagrParentesco);
        step1Request.setUsuarioRegcrearpagrEstadoBeneficiarioInstance(usuarioRegTCREARptpagrEstadoBeneficiario);
        step1Request.setUsuarioRegcrearpagrSolicitudInstance(usuarioRegTCREARptpagrSolicitud);
        step1Request.setUsuarioRegcrearpatrTipoIdentificacion(usuarioRegTCREARptpatrTipoIdentificacion);
        step1Request.setUsuarioRegcrearpatrNumIdentificacion(usuarioRegTCREARptpatrNumIdentificacion);
        step1Request.setUsuarioRegcrearpatrPrimerNombre(usuarioRegTCREARptpatrPrimerNombre);
        step1Request.setUsuarioRegcrearpatrSegundoNombre(usuarioRegTCREARptpatrSegundoNombre);
        step1Request.setUsuarioRegcrearpatrPrimerApellido(usuarioRegTCREARptpatrPrimerApellido);
        step1Request.setUsuarioRegcrearpatrSegundoApellido(usuarioRegTCREARptpatrSegundoApellido);
        step1Request.setUsuarioRegcrearpatrNumUsuario(usuarioRegTCREARptpatrNumUsuario);
        step1Request.setUsuarioRegcrearpatrFechaInicioVigencia(usuarioRegTCREARptpatrFechaInicioVigencia);
        step1Request.setUsuarioRegcrearpatrFechaFinVigencia(usuarioRegTCREARptpatrFechaFinVigencia);
        step1Request.setUsuarioRegcrearpatrGenero(usuarioRegTCREARptpatrGenero);
        step1Request.setUsuarioRegcrearpatrFechaNacimiento(usuarioRegTCREARptpatrFechaNacimiento);
        instance = (UsuarioReg) usuarioRegSrv.crearImplementation(step1Request).getInstance();

        com.keralty.aepersonas.viewmodel.usuarioreg.siu.ModificarRequest step2Request = new com.keralty.aepersonas.viewmodel.usuarioreg.siu.ModificarRequest();
        step2Request.setUsuarioRegmodificarpthisUsuarioRegInstance(instance);
        step2Request.setUsuarioRegmodificarpTipoYNumDoc(usuarioRegTCREARptpatrTipoIdentificacion + " " + usuarioRegTCREARptpatrNumIdentificacion);
        usuarioRegSrv.modificarImplementation(step2Request);

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }


    @Override
    protected void applyHVFilter(SQLSelect sql) throws SystemException {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        SQLWhereDisjunction disjunction = new SQLWhereDisjunction();
        if (getAgentRoles().contains(AsesorConstants.CLASS_NAME)) applyHVFilter4Asesor(sql, disjunction);
        conjunction.addDisjunction(disjunction);
        sql.addConjunction(conjunction);
    }

    private void applyHVFilter4Asesor(SQLSelect sql, SQLWhereDisjunction disjunction) {
        // Solicitud.Agente = agent OR Solicitud.Agente.CodJefe = Agent.Usuario
        Asesor agentInstance = getAgentAsesor();
    {
        // 'or' Logical operator
        SQLWhereDisjunction comparison1 = new SQLWhereDisjunction();
    
        // Operand 1
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(UsuarioRegConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AGENTE, FuncionarioConstants.CLASS_NAME);
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(Constants.AGENTKEYWORD, AsesorConstants.CLASS_NAME, AsesorConstants.CLASS_NAME, agentInstance.getOid(), Constants.AGENTKEYWORD);
            comparison2.setSecondOperand(operand224);
            comparison1.addOperand(comparison2);
    
        // Operand 2
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(UsuarioRegConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOCODJEFE, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(agentInstance.getFuncionarioUsuario(), Constants.Type.STRING.getTypeName()));
            comparison1.addOperand(comparison4);
        
        disjunction.addOperand(comparison1);
    }

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
        select.getOrderByPart().addItem(Constants.normalizePath(UsuarioRegConstants.CLASS_NAME, UsuarioRegConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, false), true);
        select.getOrderByPart().addItem(Constants.normalizePath(UsuarioRegConstants.CLASS_NAME, UsuarioRegConstants.ATTR_FIELD_USUARIOREGIDENTIFICADOR, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildUsuarioRegRelatedInstance(relatedInstanceJsonOid);
        }
        if (UsuarioRegConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRegRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioRegConstants.ROLE_NAME_ESTADOBENEFICIARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRegRelatedInstance4EstadoBeneficiario(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioRegConstants.ROLE_NAME_PARENTESCO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRegRelatedInstance4Parentesco(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildUsuarioRegRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRegRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRegRelatedInstance4EstadoBeneficiario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class)): EstadoBeneficiario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRegRelatedInstance4Parentesco(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class)): Parentesco.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            UsuarioRegOid oid = new UsuarioRegOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(UsuarioRegConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAesolicitudesidsolicitud(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(UsuarioRegConstants.ATTR_FIELD_USUARIOREGIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(oid.getUsuarioRegIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison2);
        } catch (Exception e) {
            LoggerFactory.getLogger(UsuarioRegService.class).error(e.getMessage());
        }
    }

}
