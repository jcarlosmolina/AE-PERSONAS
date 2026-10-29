package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.PreconditionException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.AfiliacionesConstants;
import com.keralty.aepersonas.global.AreaMedicaConstants;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.RegionalConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.SucursalConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Aesolicitudes;
import com.keralty.aepersonas.persistence.Afiliaciones;
import com.keralty.aepersonas.persistence.AreaMedica;
import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.ContratoC;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.Firma;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.GrupoAsociado;
import com.keralty.aepersonas.persistence.LogAsignaciones;
import com.keralty.aepersonas.persistence.LogEstado;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.AesolicitudesOid;
import com.keralty.aepersonas.persistence.oid.AreaMedicaOid;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.DocumentoGOid;
import com.keralty.aepersonas.persistence.oid.FirmaOid;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsociadoOid;
import com.keralty.aepersonas.persistence.oid.LogAsignacionesOid;
import com.keralty.aepersonas.persistence.oid.LogEstadoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.oid.RegionalOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioRegOid;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Planes;
import com.keralty.aepersonas.persistence.Productos;
import com.keralty.aepersonas.persistence.Regional;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.persistence.UsuarioReg;
import com.keralty.aepersonas.repository.SolicitudJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandNull;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathInstance;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandSubQuery;
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
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class SolicitudService extends AbstractService {

    SolicitudJpaRepository repository;

    SolicitudService solicitudSrv;

    PersonaService personaSrv;

    ContratanteService contratanteSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    DepartamentoService departamentoSrv;

    MunicipioService municipioSrv;

    DireccionService direccionSrv;

    TipoDireccionService tipoDireccionSrv;

    TitularService titularSrv;

    PaisService paisSrv;

    LogAsignacionesService logAsignacionesSrv;

    LogEstadoService logEstadoSrv;

    AesolicitudesService aesolicitudesSrv;

    DocumentoGService documentoGSrv;

    ProductosService productosSrv;

    PlanesService planesSrv;

    RegionalService regionalSrv;

    UsuarioService usuarioSrv;

    FirmaService firmaSrv;

    UsuarioRegService usuarioRegSrv;

    GrupoAsociadoService grupoAsociadoSrv;

    PeriodicidadService periodicidadSrv;

    ContratoCService contratoCSrv;

    UserFunctions userFunctionsSrv;

    @Inject
    public SolicitudService(
            SolicitudService solicitudSrv,
            PersonaService personaSrv,
            ContratanteService contratanteSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            DepartamentoService departamentoSrv,
            MunicipioService municipioSrv,
            DireccionService direccionSrv,
            TipoDireccionService tipoDireccionSrv,
            TitularService titularSrv,
            PaisService paisSrv,
            LogAsignacionesService logAsignacionesSrv,
            LogEstadoService logEstadoSrv,
            AesolicitudesService aesolicitudesSrv,
            DocumentoGService documentoGSrv,
            ProductosService productosSrv,
            PlanesService planesSrv,
            RegionalService regionalSrv,
            UsuarioService usuarioSrv,
            FirmaService firmaSrv,
            UsuarioRegService usuarioRegSrv,
            GrupoAsociadoService grupoAsociadoSrv,
            PeriodicidadService periodicidadSrv,
            ContratoCService contratoCSrv,
            UserFunctions userFunctionsSrv,
            SolicitudJpaRepository repository) {
        this.solicitudSrv = solicitudSrv;
        this.personaSrv = personaSrv;
        this.contratanteSrv = contratanteSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.departamentoSrv = departamentoSrv;
        this.municipioSrv = municipioSrv;
        this.direccionSrv = direccionSrv;
        this.tipoDireccionSrv = tipoDireccionSrv;
        this.titularSrv = titularSrv;
        this.paisSrv = paisSrv;
        this.logAsignacionesSrv = logAsignacionesSrv;
        this.logEstadoSrv = logEstadoSrv;
        this.aesolicitudesSrv = aesolicitudesSrv;
        this.documentoGSrv = documentoGSrv;
        this.productosSrv = productosSrv;
        this.planesSrv = planesSrv;
        this.regionalSrv = regionalSrv;
        this.usuarioSrv = usuarioSrv;
        this.firmaSrv = firmaSrv;
        this.usuarioRegSrv = usuarioRegSrv;
        this.grupoAsociadoSrv = grupoAsociadoSrv;
        this.periodicidadSrv = periodicidadSrv;
        this.contratoCSrv = contratoCSrv;
        this.userFunctionsSrv = userFunctionsSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, SolicitudConstants.CLASS_NAME);
    }

    private List<Solicitud> solveSolicitudTypedQuery(QueryRequest request) {
        boolean hasInMemoryFilters = hasInMemoryFilters(request);
        int requestedPageSize = request.getPageSize();
        int pageSize = requestedPageSize >= 0
                && requestedPageSize <= Constants.MAX_BLOCKSIZE
                ? requestedPageSize
                : Constants.DEFAULT_BLOCKSIZE;
        int pageNumber = Math.max(1, request.getPageNumber());

    	List<Solicitud> results = repository.solveQuery(processQueryRequest(request, SolicitudConstants.CLASS_NAME), (hasInMemoryFilters ? 0 : pageSize), (hasInMemoryFilters ? 1 : pageNumber)).stream()
                .filter(instance -> hasInMemoryFilters ? applyMemoryFilters(request, instance) : true).collect(Collectors.toList()); 

        if (hasInMemoryFilters && results != null && !results.isEmpty()) {
            long fromInstance = ((long) pageNumber - 1) * pageSize;
            long toInstance = (long) pageNumber * pageSize;
            if (pageSize == 0) {
               fromInstance = 0;
               toInstance = results.size();
            }
            int from = (int) Math.min(fromInstance, results.size());
            int to = (int) Math.min(toInstance, results.size());
            results = (fromInstance > results.size() - 1)
                    ? new ArrayList<>()
                    : results.subList(from, Math.max(from, to));
        }

        return results;
    }
    
    private int solveSolicitudTypedCountQuery(QueryRequest request) {
        return hasInMemoryFilters(request)
               ? repository.solveQuery(processQueryRequest(request, SolicitudConstants.CLASS_NAME)).stream().filter(instance -> applyMemoryFilters(request, instance)).collect(Collectors.toList()).size()
               : repository.solveCountQuery(processCountQueryRequest(request, SolicitudConstants.CLASS_NAME));
    }

    private boolean hasInMemoryFilters(QueryRequest queryRequest) {
        for(FilterRequest filterRequest : queryRequest.getFilters()) {
            if (hasInMemoryConjunctions(filterRequest)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasInMemoryConjunctions(FilterRequest filterRequest) {
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDLEGALIZACOMISIONES.equalsIgnoreCase(filterRequest.getName())) {
            return true;
        }
        return false;
    }

    /*
     * Returns the population of class Solicitud
     *
     * @return Population of class Solicitud
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Solicitud> get() {
        List<Solicitud> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Solicitud
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Solicitud
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Solicitud> instances = get(queryRequest);
        if(SolicitudConstants.DSDSSOLICITUDPIURADICADO.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIURadicado())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDPIUCONSULTARAD.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIUConsultaRad())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDPIUENVIODOC.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIUEnvioDoc())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDIIUNUEVAAFIL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudIIUNuevaAfil())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDIIUINFOCONTRATNAT.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudIIUInfoContratNAT())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDIIUINFOCONTRATJUR.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudIIUInfoContratJUR())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDIIUINFOOBSERVACION.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudIIUInfoObservacion())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDIIUINFOPAGO.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudIIUInfoPago())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSICSOLICITUD.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICSolicitud())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDIIUINCLUSION.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudIIUInclusion())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDVACIA.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudVacia())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDIIUDIFLIQ.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudIIUDifLiq())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDIIUPREEXISTENCIAS.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudIIUPreexistencias())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDPIUSTATUSFULL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIUStatusFull())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSIIUINFOTITULARINCFAM.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSIIUInfoTitularIncFam())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDPIUSTATUSFULLASE.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIUStatusFullAse())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDPIUSTATUSADMIN.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIUStatusAdmin())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDPIUSTATUSAFIL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIUStatusAfil())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDPIUSTATUSAREAME.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIUStatusAreaMe())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDPIUSTATUSASESOR.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIUStatusAsesor())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLPIUSTATUSGESTORMESA.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolPIUStatusGestorMesa())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDPIUSTATUSGESTMESA.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudPIUStatusGestMesa())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDINFOCONTRATANTEID.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudInfoContratanteID())).collect(Collectors.toList());
        }
        if(SolicitudConstants.DSDSSOLICITUDIIUINFOCONTRACONTA.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSSolicitudIIUInfoContraConta())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Solicitud that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Solicitud matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Solicitud> get(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveSolicitudTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveSolicitudTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveSolicitudTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveSolicitudTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Solicitud by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @return Instance of Solicitud
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Solicitud getById(Long aesolicitudesidsolicitud) {
        return getByOID(new SolicitudOid(aesolicitudesidsolicitud));
    }
    
    /*
     * Returns an instance of Solicitud by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Solicitud
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Solicitud getByOID(SolicitudOid oid) {
        Optional<Solicitud> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Solicitud by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Solicitud
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Solicitud getByOIDWithHV(SolicitudOid oid) {
        Optional<Solicitud> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Solicitud> getInstanceByOid(SolicitudOid oid) {
        return oid != null && oid.getAesolicitudesidsolicitud() != null
               ? repository.findById(oid.getAesolicitudesidsolicitud())
               : Optional.empty();
    }

    /*
     * Returns an instance of Solicitud by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Solicitud
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Solicitud getByJsonOid(String jsonOid) {
        SolicitudOid oid = new SolicitudOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Solicitud related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Solicitud
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Solicitud> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveSolicitudTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Solicitud related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Solicitud
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Solicitud> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Solicitud
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Solicitud
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getSolicitudDynamic(SolicitudOid oid, String displaySetItems) {
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
    public String getSuppInfo(SolicitudOid oid, String dsName) {
        Solicitud instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Solicitud instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (SolicitudConstants.DSICSOLICITUD.equals(dsName))
            return instance.buildICSolicitud();
        if (SolicitudConstants.DSDSSOLICITUDIIUDIFLIQ.equals(dsName))
            return instance.buildDSSolicitudIIUDifLiq();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Solicitud instance, String dsName) {
        if (SolicitudConstants.DSDSSOLICITUDPIURADICADO.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIURadicado());
        if (SolicitudConstants.DSDSSOLICITUDPIUCONSULTARAD.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIUConsultaRad());
        if (SolicitudConstants.DSDSSOLICITUDPIUENVIODOC.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIUEnvioDoc());
        if (SolicitudConstants.DSDSSOLICITUDIIUNUEVAAFIL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudIIUNuevaAfil());
        if (SolicitudConstants.DSDSSOLICITUDIIUINFOCONTRATNAT.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudIIUInfoContratNAT());
        if (SolicitudConstants.DSDSSOLICITUDIIUINFOCONTRATJUR.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudIIUInfoContratJUR());
        if (SolicitudConstants.DSDSSOLICITUDIIUINFOOBSERVACION.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudIIUInfoObservacion());
        if (SolicitudConstants.DSDSSOLICITUDIIUINFOPAGO.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudIIUInfoPago());
        if (SolicitudConstants.DSICSOLICITUD.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICSolicitud());
        if (SolicitudConstants.DSDSSOLICITUDIIUINCLUSION.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudIIUInclusion());
        if (SolicitudConstants.DSDSSOLICITUDVACIA.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudVacia());
        if (SolicitudConstants.DSDSSOLICITUDIIUDIFLIQ.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudIIUDifLiq());
        if (SolicitudConstants.DSDSSOLICITUDIIUPREEXISTENCIAS.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudIIUPreexistencias());
        if (SolicitudConstants.DSDSSOLICITUDPIUSTATUSFULL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIUStatusFull());
        if (SolicitudConstants.DSDSIIUINFOTITULARINCFAM.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSIIUInfoTitularIncFam());
        if (SolicitudConstants.DSDSSOLICITUDPIUSTATUSFULLASE.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIUStatusFullAse());
        if (SolicitudConstants.DSDSSOLICITUDPIUSTATUSADMIN.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIUStatusAdmin());
        if (SolicitudConstants.DSDSSOLICITUDPIUSTATUSAFIL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIUStatusAfil());
        if (SolicitudConstants.DSDSSOLICITUDPIUSTATUSAREAME.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIUStatusAreaMe());
        if (SolicitudConstants.DSDSSOLICITUDPIUSTATUSASESOR.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIUStatusAsesor());
        if (SolicitudConstants.DSDSSOLPIUSTATUSGESTORMESA.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolPIUStatusGestorMesa());
        if (SolicitudConstants.DSDSSOLICITUDPIUSTATUSGESTMESA.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudPIUStatusGestMesa());
        if (SolicitudConstants.DSDSSOLICITUDINFOCONTRATANTEID.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudInfoContratanteID());
        if (SolicitudConstants.DSDSSOLICITUDIIUINFOCONTRACONTA.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSSolicitudIIUInfoContraConta());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDSOLICITUD.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudSolicitud(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_IFSOLICITUDNUMCONTRATO.equalsIgnoreCase(filterRequest.getName()))
            iFSolicitudNumContrato(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDSTATUSADMIN.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudStatusAdmin(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDCONTRATANTETITULAR.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudContratanteTitular(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDLEGALIZACOMISIONES.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudLegalizaComisiones(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_IFSOLICITUDNUMSOLICITUD.equalsIgnoreCase(filterRequest.getName()))
            iFSolicitudNumSolicitud(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDCONSULTARADICADO.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudConsultaRadicado(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDSTATUSAFIL1.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudStatusAfil1(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDSTATUSAFIL2.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudStatusAfil2(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDSTATUSAFIL3.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudStatusAfil3(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDESTATUSAREAMED1.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudEstatusAreaMed1(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDESTATUSAREAMED2.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudEstatusAreaMed2(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDESTATUSAREAMED3.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudEstatusAreaMed3(filterRequest, sql);
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDSTATUSESTHOMO.equalsIgnoreCase(filterRequest.getName()))
            fSolicitudStatusEstHomo(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_Solicitud".equals(filterRequest.getName()))
            suppInfo4ICSolicitud(filterRequest.getFilterVariable("searchText").toString(), sql);
    }

    private boolean applyMemoryFilters(QueryRequest queryRequest, Solicitud instance) {
        for (FilterRequest filterRequest : queryRequest.getFilters()) {
            if (!applyMemoryFilter(filterRequest, instance))
                return false;
        }
        return true;
    }
    
    private boolean applyMemoryFilter(FilterRequest filterRequest, Solicitud instance) {
        return applyMemoryQueryFilter(filterRequest, instance);
    }

    private boolean applyMemoryQueryFilter(FilterRequest filterRequest, Solicitud entity) {
        if (SolicitudConstants.FILTER_NAME_FSOLICITUDLEGALIZACOMISIONES.equalsIgnoreCase(filterRequest.getName()))
            return inMemoryFSolicitudLegalizaComisiones(entity);
        return true;
    }


    private void fSolicitudSolicitud(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSOLICITUD_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSOLICITUD_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;
        Date vFIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSOLICITUD_VFINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSOLICITUD_VFINI, FilterVariableRequest.DATE) : null;
        Date vFFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSOLICITUD_VFFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSOLICITUD_VFFIN, FilterVariableRequest.DATE) : null;

        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        // Aesolicitudes.Fechaasignacion >= vFIni
        if (vFIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vFIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Aesolicitudes.Fechaasignacion <= vFFin
        if (vFFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vFFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // EXIST (ContratoC) = true
    // 'exist' Association operator
    SQLWhereOperandSubQuery operandSubQueryAssocOperator071 = new SQLWhereOperandSubQuery(repository.assocOperator071Range1Query(sql));
    conjunction.addOperand(operandSubQueryAssocOperator071);


        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
        comparison5.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison5.setFirstOperand(operand116);
        
        // Operand 2
        comparison5.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison5);


        // (Tramite <> 2 OR COUNT (Usuarios) = COUNT (Usuarios) WHERE (Usuarios.EstadoBeneficiario.Confirmado = true))
    {
        // 'or' Logical operator
        SQLWhereDisjunction comparison6 = new SQLWhereDisjunction();
    
        // Operand 1
            // '<>' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator("<>");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(2), Constants.Type.NAT.getTypeName()));
            comparison6.addOperand(comparison7);
    
        // Operand 2
            // '=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator("=");
            
            // Operand 1
                // 'count' Association operator
                SQLWhereOperandSubQuery operandSubQueryAssocOperator072 = new SQLWhereOperandSubQuery(repository.assocOperator072Range1Query(sql));
            comparison9.setFirstOperand(operandSubQueryAssocOperator072);
            
            // Operand 2
                // 'count' Association operator
                SQLWhereOperandSubQuery operandSubQueryAssocOperator073 = new SQLWhereOperandSubQuery(repository.assocOperator073Range1Query(sql));
            comparison9.setSecondOperand(operandSubQueryAssocOperator073);
            comparison6.addOperand(comparison9);
        
        conjunction.addOperand(comparison6);
    }


        sql.addConjunction(conjunction);
    }

    private void iFSolicitudNumContrato(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumContrato = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_IFSOLICITUDNUMCONTRATO_VNUMCONTRATO) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_IFSOLICITUDNUMCONTRATO_VNUMCONTRATO, FilterVariableRequest.STRING) : null;

        // NumContrato = vNumContrato
        if (vNumContrato != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDNUMCONTRATO, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vNumContrato, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void fSolicitudStatusAdmin(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;
        Long vTramite = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTRAMITE) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTRAMITE, FilterVariableRequest.NAT) : null;
        Productos voProducto = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOPRODUCTO) ? productosSrv.getByOID(new ProductosOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOPRODUCTO)))) : null;
        Planes voPlan = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOPLAN) ? planesSrv.getByOID(new PlanesOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOPLAN)))) : null;
        Long voEstado = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOESTADO) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOESTADO, FilterVariableRequest.INT) : null;
        Date vFElabIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VFELABINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VFELABINI, FilterVariableRequest.DATE) : null;
        Date vFElabFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VFELABFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VFELABFIN, FilterVariableRequest.DATE) : null;
        Date vFContratoIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VFCONTRATOINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VFCONTRATOINI, FilterVariableRequest.DATE) : null;
        Date vFContratoFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VFCONTRATOFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VFCONTRATOFIN, FilterVariableRequest.DATE) : null;
        String vCodAsesor = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VCODASESOR) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VCODASESOR, FilterVariableRequest.STRING) : null;
        TipoIdentificacion vTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VNUMDOC, FilterVariableRequest.STRING) : null;
        Regional voRegional = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOREGIONAL) ? regionalSrv.getByOID(new RegionalOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOREGIONAL)))) : null;
        Long vEstadoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VESTADODOC) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VESTADODOC, FilterVariableRequest.NAT) : null;

        // Completada = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Tramite = vTramite
        if (vTramite != null) {
            // '=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vTramite, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // Aesolicitudes.ProductoT = voProducto
        if (voProducto != null) {
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            SQLWhereOperandOVParameter operand226 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOPRODUCTO, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, voProducto.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOPRODUCTO);
            comparison4.setSecondOperand(operand226);
            conjunction.addOperand(comparison4);

        }        

        // Aesolicitudes.PlanT = voPlan
        if (voPlan != null) {
            // '=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            SQLWhereOperandOVParameter operand227 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOPLAN, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, voPlan.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOPLAN);
            comparison5.setSecondOperand(operand227);
            conjunction.addOperand(comparison5);

        }        

        // Estado = voEstado
        if (voEstado != null) {
            // '=' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral(voEstado, Constants.Type.INT.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        // Aesolicitudes.Fechaasignacion >= vFElabIni
        if (vFElabIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFElabIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        // Aesolicitudes.Fechaasignacion <= vFElabFin
        if (vFElabFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison8 = new SQLWhereComparison(sql);
            comparison8.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand119 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison8.setFirstOperand(operand119);
            
            // Operand 2
            comparison8.setSecondOperand(new SQLWhereOperandLiteral(vFElabFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison8);

        }        

        // FInicioContrato >= vFContratoIni
        if (vFContratoIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison9.setFirstOperand(operand1110);
            
            // Operand 2
            comparison9.setSecondOperand(new SQLWhereOperandLiteral(vFContratoIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison9);

        }        

        // FInicioContrato <= vFContratoFin
        if (vFContratoFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
            comparison10.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison10.setFirstOperand(operand1111);
            
            // Operand 2
            comparison10.setSecondOperand(new SQLWhereOperandLiteral(vFContratoFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison10);

        }        

        // Agente.Usuario LIKE "%" + vCodAsesor
        if (vCodAsesor != null) {
            // 'like' Comparison
            SQLWhereComparison comparison11 = new SQLWhereComparison(sql);
            comparison11.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison11.setFirstOperand(operand1112);
            
            // Operand 2
            comparison11.setSecondOperand(new SQLWhereOperandLiteral("%" + vCodAsesor, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison11);

        }        

        // ((Contratante.TipoIdentificacion = vTipoDoc AND Contratante.NumIdentificacion = vNumDoc) OR (Titular.TipoIdentificacion = vTipoDoc AND Titular.NumIdentificacion = vNumDoc) OR (EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc) = true))
        if (vTipoDoc != null && vNumDoc != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison12 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison13 = new SQLWhereDisjunction();
                
                    // Operand 1
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison14 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
                                    comparison15.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison15.setFirstOperand(operand1116);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2217 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTIPODOC);
                                    comparison15.setSecondOperand(operand2217);
                                    comparison14.addOperand(comparison15);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison17 = new SQLWhereComparison(sql);
                                    comparison17.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ATTR_NAME_CONTRATANTENUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison17.setFirstOperand(operand1118);
                                    
                                    // Operand 2
                                    comparison17.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison14.addOperand(comparison17);
                            
                            comparison13.addOperand(comparison14);
                        }
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison18 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison19 = new SQLWhereComparison(sql);
                                    comparison19.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1120 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison19.setFirstOperand(operand1120);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2221 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTIPODOC);
                                    comparison19.setSecondOperand(operand2221);
                                    comparison18.addOperand(comparison19);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison21 = new SQLWhereComparison(sql);
                                    comparison21.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1122 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ATTR_NAME_TITULARNUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison21.setFirstOperand(operand1122);
                                    
                                    // Operand 2
                                    comparison21.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison18.addOperand(comparison21);
                            
                            comparison13.addOperand(comparison18);
                        }
                    
                    comparison12.addOperand(comparison13);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator074 = new SQLWhereOperandSubQuery(repository.assocOperator074Range1Query(vTipoDoc, vNumDoc, sql));
            comparison12.addOperand(operandSubQueryAssocOperator074);
            
            conjunction.addOperand(comparison12);
        }

        }        

        // Agente.Sucursal.Regional = voRegional
        if (voRegional != null) {
            // '=' Comparison
            SQLWhereComparison comparison13 = new SQLWhereComparison(sql);
            comparison13.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand1114 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ROLE_NAME_SUCURSAL + "." + SucursalConstants.ROLE_NAME_REGIONAL, RegionalConstants.CLASS_NAME);
            comparison13.setFirstOperand(operand1114);
            
            // Operand 2
            SQLWhereOperandOVParameter operand2215 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOREGIONAL, RegionalConstants.CLASS_NAME, RegionalConstants.CLASS_NAME, voRegional.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VOREGIONAL);
            comparison13.setSecondOperand(operand2215);
            conjunction.addOperand(comparison13);

        }        

        // EstadoDoc = vEstadoDoc
        if (vEstadoDoc != null) {
            // '=' Comparison
            SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
            comparison14.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
            comparison14.setFirstOperand(operand1115);
            
            // Operand 2
            comparison14.setSecondOperand(new SQLWhereOperandLiteral(vEstadoDoc, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison14);

        }        

        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
        comparison15.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison15.setFirstOperand(operand1116);
        
        // Operand 2
        comparison15.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison15);


        sql.addConjunction(conjunction);
    }

    private void fSolicitudContratanteTitular(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Persona voPersona = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA) ? personaSrv.getByOID(new PersonaOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA)))) : null;
        Date vFIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VFINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VFINI, FilterVariableRequest.DATE) : null;
        Date vFFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VFFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VFFIN, FilterVariableRequest.DATE) : null;

        // ((ContratantePersona.TipoIdentificacion = voPersona.TipoIdentificacion AND ContratantePersona.NumIdentificacion = voPersona.NumIdentificacion) OR (TitularPersona.TipoIdentificacion = voPersona.TipoIdentificacion AND TitularPersona.NumIdentificacion = voPersona.NumIdentificacion) OR (EXIST (Usuarios) WHERE (Usuarios.UsuarioPersona.TipoIdentificacion = voPersona.TipoIdentificacion AND Usuarios.UsuarioPersona.NumIdentificacion = voPersona.NumIdentificacion) = true))
        if (voPersona != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison1 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison2 = new SQLWhereDisjunction();
                
                    // Operand 1
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison3 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
                                    comparison4.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTEPERSONA + "." + PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison4.setFirstOperand(operand115);
                                    
                                    // Operand 2
                                    if (voPersona.isNull() || voPersona.getTipoIdentificacion().isNull())
                                    {
                                    comparison4.setSecondOperand(new SQLWhereOperandNull());
                                    }
                                    else
                                    {
                                    SQLWhereOperandOVParameter operand226 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA + "." + PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, PersonaConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voPersona.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA);
                                    comparison4.setSecondOperand(operand226);
                                    }
                                    comparison3.addOperand(comparison4);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
                                    comparison6.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTEPERSONA + "." + PersonaConstants.ATTR_NAME_PERSONANUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison6.setFirstOperand(operand117);
                                    
                                    // Operand 2
                                    if (voPersona.getPersonaNumIdentificacion()!= null){
                                    comparison6.setSecondOperand(new SQLWhereOperandLiteral(voPersona.getPersonaNumIdentificacion(), Constants.Type.STRING.getTypeName()));
                                    } else {
                                    comparison6.setSecondOperand(new SQLWhereOperandNull());
                                    }
                                    comparison3.addOperand(comparison6);
                            
                            comparison2.addOperand(comparison3);
                        }
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison7 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison8 = new SQLWhereComparison(sql);
                                    comparison8.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand119 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULARPERSONA + "." + PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison8.setFirstOperand(operand119);
                                    
                                    // Operand 2
                                    if (voPersona.isNull() || voPersona.getTipoIdentificacion().isNull())
                                    {
                                    comparison8.setSecondOperand(new SQLWhereOperandNull());
                                    }
                                    else
                                    {
                                    SQLWhereOperandOVParameter operand2210 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA + "." + PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, PersonaConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voPersona.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA);
                                    comparison8.setSecondOperand(operand2210);
                                    }
                                    comparison7.addOperand(comparison8);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
                                    comparison10.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULARPERSONA + "." + PersonaConstants.ATTR_NAME_PERSONANUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison10.setFirstOperand(operand1111);
                                    
                                    // Operand 2
                                    if (voPersona.getPersonaNumIdentificacion()!= null){
                                    comparison10.setSecondOperand(new SQLWhereOperandLiteral(voPersona.getPersonaNumIdentificacion(), Constants.Type.STRING.getTypeName()));
                                    } else {
                                    comparison10.setSecondOperand(new SQLWhereOperandNull());
                                    }
                                    comparison7.addOperand(comparison10);
                            
                            comparison2.addOperand(comparison7);
                        }
                    
                    comparison1.addOperand(comparison2);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator075 = new SQLWhereOperandSubQuery(repository.assocOperator075Range1Query(voPersona, sql));
            comparison1.addOperand(operandSubQueryAssocOperator075);
            
            conjunction.addOperand(comparison1);
        }

        }        

        // Aesolicitudes.Fesolici >= vFIni
        if (vFIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFESOLICI, Constants.Type.DATE.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vFIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Aesolicitudes.Fesolici <= vFFin
        if (vFFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFESOLICI, Constants.Type.DATE.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vFFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // EXIST (ContratoC) = true
    // 'exist' Association operator
    SQLWhereOperandSubQuery operandSubQueryAssocOperator076 = new SQLWhereOperandSubQuery(repository.assocOperator076Range1Query(sql));
    conjunction.addOperand(operandSubQueryAssocOperator076);


        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
        comparison5.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison5.setFirstOperand(operand116);
        
        // Operand 2
        comparison5.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison5);


        // (Tramite <> 2 OR COUNT (Usuarios) = COUNT (Usuarios) WHERE (Usuarios.EstadoBeneficiario.Confirmado = true))
    {
        // 'or' Logical operator
        SQLWhereDisjunction comparison6 = new SQLWhereDisjunction();
    
        // Operand 1
            // '<>' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator("<>");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(2), Constants.Type.NAT.getTypeName()));
            comparison6.addOperand(comparison7);
    
        // Operand 2
            // '=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator("=");
            
            // Operand 1
                // 'count' Association operator
                SQLWhereOperandSubQuery operandSubQueryAssocOperator077 = new SQLWhereOperandSubQuery(repository.assocOperator077Range1Query(sql));
            comparison9.setFirstOperand(operandSubQueryAssocOperator077);
            
            // Operand 2
                // 'count' Association operator
                SQLWhereOperandSubQuery operandSubQueryAssocOperator078 = new SQLWhereOperandSubQuery(repository.assocOperator078Range1Query(sql));
            comparison9.setSecondOperand(operandSubQueryAssocOperator078);
            comparison6.addOperand(comparison9);
        
        conjunction.addOperand(comparison6);
    }


        sql.addConjunction(conjunction);
    }

    private void fSolicitudLegalizaComisiones(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Date vFInicio = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDLEGALIZACOMISIONES_VFINICIO) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDLEGALIZACOMISIONES_VFINICIO, FilterVariableRequest.DATE) : null;
        Date vFFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDLEGALIZACOMISIONES_VFFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDLEGALIZACOMISIONES_VFFIN, FilterVariableRequest.DATE) : null;

        // Tramite = 1
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
        conjunction.addOperand(comparison1);


        // Aesolicitudes.Tiposolicitud <> "F"
        // '<>' Comparison
        SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
        comparison2.setOperator("<>");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison2.setFirstOperand(operand113);
        
        // Operand 2
        comparison2.setSecondOperand(new SQLWhereOperandLiteral("F", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison2);


        // FInicioContrato >= vFInicio
        if (vFInicio != null) {
            // '>=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vFInicio, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // FInicioContrato <= vFFin
        if (vFFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(vFFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        // EstadoDoc = 2
        // '=' Comparison
        SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
        comparison5.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
        comparison5.setFirstOperand(operand116);
        
        // Operand 2
        comparison5.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(2), Constants.Type.NAT.getTypeName()));
        conjunction.addOperand(comparison5);


        // (Estado = 2 OR Estado = 3)
    {
        // 'or' Logical operator
        SQLWhereDisjunction comparison6 = new SQLWhereDisjunction();
    
        // Operand 1
            // '=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(2), Constants.Type.NAT.getTypeName()));
            comparison6.addOperand(comparison7);
    
        // Operand 2
            // '=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
            comparison9.setFirstOperand(operand1110);
            
            // Operand 2
            comparison9.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(3), Constants.Type.NAT.getTypeName()));
            comparison6.addOperand(comparison9);
        
        conjunction.addOperand(comparison6);
    }


        sql.addConjunction(conjunction);
    }

    private void iFSolicitudNumSolicitud(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_IFSOLICITUDNUMSOLICITUD_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_IFSOLICITUDNUMSOLICITUD_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;

        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void fSolicitudConsultaRadicado(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        TipoIdentificacion voTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VNUMDOC, FilterVariableRequest.STRING) : null;
        Date vfDesde = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VFDESDE) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VFDESDE, FilterVariableRequest.DATE) : null;
        Date vfHasta = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VFHASTA) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VFHASTA, FilterVariableRequest.DATE) : null;

        // ((EXIST (Contratante) WHERE (Contratante.TipoIdentificacion = voTipoDoc AND Contratante.NumIdentificacion = vNumDoc) = true) OR (EXIST (Titular) WHERE (Titular.TipoIdentificacion = voTipoDoc AND Titular.NumIdentificacion = vNumDoc) = true) OR (EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = voTipoDoc AND Usuarios.NumIdentificacion = vNumDoc) = true))
        if (voTipoDoc != null && vNumDoc != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison1 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison2 = new SQLWhereDisjunction();
                
                    // Operand 1
                    // 'exist' Association operator
                    SQLWhereOperandSubQuery operandSubQueryAssocOperator079 = new SQLWhereOperandSubQuery(repository.assocOperator079Range1Query(voTipoDoc, vNumDoc, sql));
                    comparison2.addOperand(operandSubQueryAssocOperator079);
                
                    // Operand 2
                    // 'exist' Association operator
                    SQLWhereOperandSubQuery operandSubQueryAssocOperator080 = new SQLWhereOperandSubQuery(repository.assocOperator080Range1Query(voTipoDoc, vNumDoc, sql));
                    comparison2.addOperand(operandSubQueryAssocOperator080);
                    
                    comparison1.addOperand(comparison2);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator081 = new SQLWhereOperandSubQuery(repository.assocOperator081Range1Query(voTipoDoc, vNumDoc, sql));
            comparison1.addOperand(operandSubQueryAssocOperator081);
            
            conjunction.addOperand(comparison1);
        }

        }        

        // Completada = false
        // '=' Comparison
        SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
        comparison2.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
        comparison2.setFirstOperand(operand113);
        
        // Operand 2
        comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.FALSE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison2);


        // Aesolicitudes.Fechaasignacion >= dateAdd("d", -1 * StrToInt(fugetValorParametroConf("NUMDIASCONSULTARADICADO")), systemDate())
        // '>=' Comparison
        SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
        comparison3.setOperator(">=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
        comparison3.setFirstOperand(operand114);
        
        // Operand 2
                if (STDFunctions.dateAddFun("d", Long.valueOf(-1) * STDFunctions.strToIntFun(userFunctionsSrv.fugetValorParametroConfFun("NUMDIASCONSULTARADICADO")), STDFunctions.systemDateFun()) != null) {
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(STDFunctions.dateAddFun("d", Long.valueOf(-1) * STDFunctions.strToIntFun(userFunctionsSrv.fugetValorParametroConfFun("NUMDIASCONSULTARADICADO")), STDFunctions.systemDateFun()), Constants.Type.DATE.getTypeName()));
                } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
        conjunction.addOperand(comparison3);


        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
        comparison4.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison4.setFirstOperand(operand115);
        
        // Operand 2
        comparison4.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison4);


        // Aesolicitudes.Fesolici >= vfDesde
        if (vfDesde != null) {
            // '>=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFESOLICI, Constants.Type.DATE.getTypeName());
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            comparison5.setSecondOperand(new SQLWhereOperandLiteral(vfDesde, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison5);

        }        

        // Aesolicitudes.Fesolici <= vfHasta
        if (vfHasta != null) {
            // '<=' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFESOLICI, Constants.Type.DATE.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral(vfHasta, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        sql.addConjunction(conjunction);
    }

    private void fSolicitudStatusAfil1(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;
        Long vTramite = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTRAMITE) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTRAMITE, FilterVariableRequest.NAT) : null;
        Productos voProducto = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPRODUCTO) ? productosSrv.getByOID(new ProductosOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPRODUCTO)))) : null;
        Planes voPlan = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPLAN) ? planesSrv.getByOID(new PlanesOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPLAN)))) : null;
        Long voEstado = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOESTADO) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOESTADO, FilterVariableRequest.INT) : null;
        Date vFElabIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VFELABINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VFELABINI, FilterVariableRequest.DATE) : null;
        Date vFElabFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VFELABFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VFELABFIN, FilterVariableRequest.DATE) : null;
        Date vFContratoIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VFCONTRATOINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VFCONTRATOINI, FilterVariableRequest.DATE) : null;
        Date vFContratoFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VFCONTRATOFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VFCONTRATOFIN, FilterVariableRequest.DATE) : null;
        String vCodAsesor = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VCODASESOR) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VCODASESOR, FilterVariableRequest.STRING) : null;
        TipoIdentificacion vTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VNUMDOC, FilterVariableRequest.STRING) : null;
        Regional voRegional = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOREGIONAL) ? regionalSrv.getByOID(new RegionalOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOREGIONAL)))) : null;
        Long vEstadoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VESTADODOC) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VESTADODOC, FilterVariableRequest.NAT) : null;

        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        // Tramite = vTramite
        if (vTramite != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vTramite, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Aesolicitudes.ProductoT = voProducto
        if (voProducto != null) {
            // '=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand114 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            SQLWhereOperandOVParameter operand225 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPRODUCTO, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, voProducto.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPRODUCTO);
            comparison3.setSecondOperand(operand225);
            conjunction.addOperand(comparison3);

        }        

        // Aesolicitudes.PlanT = voPlan
        if (voPlan != null) {
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            SQLWhereOperandOVParameter operand226 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPLAN, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, voPlan.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPLAN);
            comparison4.setSecondOperand(operand226);
            conjunction.addOperand(comparison4);

        }        

        // (Estado = voEstado OR (Estado = 8 AND voEstado = 1))
        if (voEstado != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison5 = new SQLWhereDisjunction();
        
            // Operand 1
                    // '=' Comparison
                    SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
                    comparison6.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                    comparison6.setFirstOperand(operand117);
                    
                    // Operand 2
                    comparison6.setSecondOperand(new SQLWhereOperandLiteral(voEstado, Constants.Type.INT.getTypeName()));
                    comparison5.addOperand(comparison6);
        
            // Operand 2
                {
                    // 'and' Logical operator
                    SQLWhereConjunction comparison8 = new SQLWhereConjunction();
                
                    // Operand 1
                            // '=' Comparison
                            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
                            comparison9.setOperator("=");
                            
                            // Operand 1
                            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                            comparison9.setFirstOperand(operand1110);
                            
                            // Operand 2
                            comparison9.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(8), Constants.Type.NAT.getTypeName()));
                            comparison8.addOperand(comparison9);
                
                    // Operand 2
                            // '=' Comparison
                            SQLWhereComparison comparison11 = new SQLWhereComparison(sql);
                            comparison11.setOperator("=");
                            
                            // Operand 1
                            comparison11.setFirstOperand(new SQLWhereOperandLiteral(voEstado, Constants.Type.INT.getTypeName()));
                            
                            // Operand 2
                            comparison11.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                            comparison8.addOperand(comparison11);
                    
                    comparison5.addOperand(comparison8);
                }
            
            conjunction.addOperand(comparison5);
        }

        }        

        // Aesolicitudes.Fechaasignacion >= vFElabIni
        if (vFElabIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral(vFElabIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        // Aesolicitudes.Fechaasignacion <= vFElabFin
        if (vFElabFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFElabFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        // FInicioContrato >= vFContratoIni
        if (vFContratoIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison8 = new SQLWhereComparison(sql);
            comparison8.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand119 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison8.setFirstOperand(operand119);
            
            // Operand 2
            comparison8.setSecondOperand(new SQLWhereOperandLiteral(vFContratoIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison8);

        }        

        // FInicioContrato <= vFContratoFin
        if (vFContratoFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison9.setFirstOperand(operand1110);
            
            // Operand 2
            comparison9.setSecondOperand(new SQLWhereOperandLiteral(vFContratoFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison9);

        }        

        // Agente.Usuario LIKE "%" + vCodAsesor
        if (vCodAsesor != null) {
            // 'like' Comparison
            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
            comparison10.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison10.setFirstOperand(operand1111);
            
            // Operand 2
            comparison10.setSecondOperand(new SQLWhereOperandLiteral("%" + vCodAsesor, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison10);

        }        

        // ((Contratante.TipoIdentificacion = vTipoDoc AND Contratante.NumIdentificacion = vNumDoc) OR (Titular.TipoIdentificacion = vTipoDoc AND Titular.NumIdentificacion = vNumDoc) OR (EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc) = true))
        if (vTipoDoc != null && vNumDoc != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison11 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison12 = new SQLWhereDisjunction();
                
                    // Operand 1
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison13 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
                                    comparison14.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison14.setFirstOperand(operand1115);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2216 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTIPODOC);
                                    comparison14.setSecondOperand(operand2216);
                                    comparison13.addOperand(comparison14);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison16 = new SQLWhereComparison(sql);
                                    comparison16.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ATTR_NAME_CONTRATANTENUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison16.setFirstOperand(operand1117);
                                    
                                    // Operand 2
                                    comparison16.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison13.addOperand(comparison16);
                            
                            comparison12.addOperand(comparison13);
                        }
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison17 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison18 = new SQLWhereComparison(sql);
                                    comparison18.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1119 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison18.setFirstOperand(operand1119);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2220 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTIPODOC);
                                    comparison18.setSecondOperand(operand2220);
                                    comparison17.addOperand(comparison18);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison20 = new SQLWhereComparison(sql);
                                    comparison20.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1121 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ATTR_NAME_TITULARNUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison20.setFirstOperand(operand1121);
                                    
                                    // Operand 2
                                    comparison20.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison17.addOperand(comparison20);
                            
                            comparison12.addOperand(comparison17);
                        }
                    
                    comparison11.addOperand(comparison12);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator082 = new SQLWhereOperandSubQuery(repository.assocOperator082Range1Query(vTipoDoc, vNumDoc, sql));
            comparison11.addOperand(operandSubQueryAssocOperator082);
            
            conjunction.addOperand(comparison11);
        }

        }        

        // Agente.Sucursal.Regional = voRegional
        if (voRegional != null) {
            // '=' Comparison
            SQLWhereComparison comparison12 = new SQLWhereComparison(sql);
            comparison12.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand1113 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ROLE_NAME_SUCURSAL + "." + SucursalConstants.ROLE_NAME_REGIONAL, RegionalConstants.CLASS_NAME);
            comparison12.setFirstOperand(operand1113);
            
            // Operand 2
            SQLWhereOperandOVParameter operand2214 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOREGIONAL, RegionalConstants.CLASS_NAME, RegionalConstants.CLASS_NAME, voRegional.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VOREGIONAL);
            comparison12.setSecondOperand(operand2214);
            conjunction.addOperand(comparison12);

        }        

        // EstadoDoc = vEstadoDoc
        if (vEstadoDoc != null) {
            // '=' Comparison
            SQLWhereComparison comparison13 = new SQLWhereComparison(sql);
            comparison13.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
            comparison13.setFirstOperand(operand1114);
            
            // Operand 2
            comparison13.setSecondOperand(new SQLWhereOperandLiteral(vEstadoDoc, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison13);

        }        

        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
        comparison14.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison14.setFirstOperand(operand1115);
        
        // Operand 2
        comparison14.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison14);


        // ((EstadoDoc = 1 AND Estado <> 4 AND Completada = true AND FechaTerminada = NULL) OR (EstadoDoc = 2 AND (Estado = 1 OR Estado = 8 OR Estado = 0) AND Completada = true))
    {
        // 'or' Logical operator
        SQLWhereDisjunction comparison15 = new SQLWhereDisjunction();
    
        // Operand 1
        {
            // 'and' Logical operator
            SQLWhereConjunction comparison16 = new SQLWhereConjunction();
        
            // Operand 1
            {
                // 'and' Logical operator
                SQLWhereConjunction comparison17 = new SQLWhereConjunction();
            
                // Operand 1
                {
                    // 'and' Logical operator
                    SQLWhereConjunction comparison18 = new SQLWhereConjunction();
                
                    // Operand 1
                        // '=' Comparison
                        SQLWhereComparison comparison19 = new SQLWhereComparison(sql);
                        comparison19.setOperator("=");
                        
                        // Operand 1
                        SQLWhereOperandPathAttribute operand1120 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
                        comparison19.setFirstOperand(operand1120);
                        
                        // Operand 2
                        comparison19.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                        comparison18.addOperand(comparison19);
                
                    // Operand 2
                        // '<>' Comparison
                        SQLWhereComparison comparison21 = new SQLWhereComparison(sql);
                        comparison21.setOperator("<>");
                        
                        // Operand 1
                        SQLWhereOperandPathAttribute operand1122 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                        comparison21.setFirstOperand(operand1122);
                        
                        // Operand 2
                        comparison21.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(4), Constants.Type.NAT.getTypeName()));
                        comparison18.addOperand(comparison21);
                    
                    comparison17.addOperand(comparison18);
                }
            
                // Operand 2
                    // '=' Comparison
                    SQLWhereComparison comparison22 = new SQLWhereComparison(sql);
                    comparison22.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand1123 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
                    comparison22.setFirstOperand(operand1123);
                    
                    // Operand 2
                    comparison22.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    comparison17.addOperand(comparison22);
                
                comparison16.addOperand(comparison17);
            }
        
            // Operand 2
                // '=' Comparison
                SQLWhereComparison comparison24 = new SQLWhereComparison(sql);
                comparison24.setOperator("=");
                
                // Operand 1
                SQLWhereOperandPathAttribute operand1125 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFECHATERMINADA, Constants.Type.DATE.getTypeName());
                comparison24.setFirstOperand(operand1125);
                
                // Operand 2
                comparison24.setSecondOperand(new SQLWhereOperandNull());
                comparison16.addOperand(comparison24);
            
            comparison15.addOperand(comparison16);
        }
    
        // Operand 2
        {
            // 'and' Logical operator
            SQLWhereConjunction comparison240 = new SQLWhereConjunction();
        
            // Operand 1
            {
                // 'and' Logical operator
                SQLWhereConjunction comparison25 = new SQLWhereConjunction();
            
                // Operand 1
                    // '=' Comparison
                    SQLWhereComparison comparison26 = new SQLWhereComparison(sql);
                    comparison26.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand1127 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
                    comparison26.setFirstOperand(operand1127);
                    
                    // Operand 2
                    comparison26.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(2), Constants.Type.NAT.getTypeName()));
                    comparison25.addOperand(comparison26);
            
                // Operand 2
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison28 = new SQLWhereDisjunction();
                
                    // Operand 1
                    {
                        // 'or' Logical operator
                        SQLWhereDisjunction comparison29 = new SQLWhereDisjunction();
                    
                        // Operand 1
                            // '=' Comparison
                            SQLWhereComparison comparison30 = new SQLWhereComparison(sql);
                            comparison30.setOperator("=");
                            
                            // Operand 1
                            SQLWhereOperandPathAttribute operand1131 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                            comparison30.setFirstOperand(operand1131);
                            
                            // Operand 2
                            comparison30.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                            comparison29.addOperand(comparison30);
                    
                        // Operand 2
                            // '=' Comparison
                            SQLWhereComparison comparison32 = new SQLWhereComparison(sql);
                            comparison32.setOperator("=");
                            
                            // Operand 1
                            SQLWhereOperandPathAttribute operand1133 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                            comparison32.setFirstOperand(operand1133);
                            
                            // Operand 2
                            comparison32.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(8), Constants.Type.NAT.getTypeName()));
                            comparison29.addOperand(comparison32);
                        
                        comparison28.addOperand(comparison29);
                    }
                
                    // Operand 2
                        // '=' Comparison
                        SQLWhereComparison comparison33 = new SQLWhereComparison(sql);
                        comparison33.setOperator("=");
                        
                        // Operand 1
                        SQLWhereOperandPathAttribute operand1134 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                        comparison33.setFirstOperand(operand1134);
                        
                        // Operand 2
                        comparison33.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(0), Constants.Type.NAT.getTypeName()));
                        comparison28.addOperand(comparison33);
                    
                    comparison25.addOperand(comparison28);
                }
                
                comparison240.addOperand(comparison25);
            }
        
            // Operand 2
                // '=' Comparison
                SQLWhereComparison comparison330 = new SQLWhereComparison(sql);
                comparison330.setOperator("=");
                
                // Operand 1
                SQLWhereOperandPathAttribute operand1134 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
                comparison330.setFirstOperand(operand1134);
                
                // Operand 2
                comparison330.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                comparison240.addOperand(comparison330);
            
            comparison15.addOperand(comparison240);
        }
        
        conjunction.addOperand(comparison15);
    }


        sql.addConjunction(conjunction);
    }

    private void fSolicitudStatusAfil2(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;
        Long vTramite = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTRAMITE) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTRAMITE, FilterVariableRequest.NAT) : null;
        Productos voProducto = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPRODUCTO) ? productosSrv.getByOID(new ProductosOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPRODUCTO)))) : null;
        Planes voPlan = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPLAN) ? planesSrv.getByOID(new PlanesOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPLAN)))) : null;
        Long voEstado = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOESTADO) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOESTADO, FilterVariableRequest.INT) : null;
        Date vFElabIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VFELABINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VFELABINI, FilterVariableRequest.DATE) : null;
        Date vFElabFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VFELABFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VFELABFIN, FilterVariableRequest.DATE) : null;
        Date vFContratoIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VFCONTRATOINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VFCONTRATOINI, FilterVariableRequest.DATE) : null;
        Date vFContratoFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VFCONTRATOFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VFCONTRATOFIN, FilterVariableRequest.DATE) : null;
        String vCodAsesor = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VCODASESOR) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VCODASESOR, FilterVariableRequest.STRING) : null;
        TipoIdentificacion vTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VNUMDOC, FilterVariableRequest.STRING) : null;
        Regional voRegional = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOREGIONAL) ? regionalSrv.getByOID(new RegionalOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOREGIONAL)))) : null;

        // Completada = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Tramite = vTramite
        if (vTramite != null) {
            // '=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vTramite, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // Aesolicitudes.ProductoT = voProducto
        if (voProducto != null) {
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            SQLWhereOperandOVParameter operand226 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPRODUCTO, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, voProducto.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPRODUCTO);
            comparison4.setSecondOperand(operand226);
            conjunction.addOperand(comparison4);

        }        

        // Aesolicitudes.PlanT = voPlan
        if (voPlan != null) {
            // '=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            SQLWhereOperandOVParameter operand227 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPLAN, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, voPlan.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPLAN);
            comparison5.setSecondOperand(operand227);
            conjunction.addOperand(comparison5);

        }        

        // (Estado = voEstado OR (Estado = 8 AND voEstado = 1))
        if (voEstado != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison6 = new SQLWhereDisjunction();
        
            // Operand 1
                    // '=' Comparison
                    SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
                    comparison7.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                    comparison7.setFirstOperand(operand118);
                    
                    // Operand 2
                    comparison7.setSecondOperand(new SQLWhereOperandLiteral(voEstado, Constants.Type.INT.getTypeName()));
                    comparison6.addOperand(comparison7);
        
            // Operand 2
                {
                    // 'and' Logical operator
                    SQLWhereConjunction comparison9 = new SQLWhereConjunction();
                
                    // Operand 1
                            // '=' Comparison
                            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
                            comparison10.setOperator("=");
                            
                            // Operand 1
                            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                            comparison10.setFirstOperand(operand1111);
                            
                            // Operand 2
                            comparison10.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(8), Constants.Type.NAT.getTypeName()));
                            comparison9.addOperand(comparison10);
                
                    // Operand 2
                            // '=' Comparison
                            SQLWhereComparison comparison12 = new SQLWhereComparison(sql);
                            comparison12.setOperator("=");
                            
                            // Operand 1
                            comparison12.setFirstOperand(new SQLWhereOperandLiteral(voEstado, Constants.Type.INT.getTypeName()));
                            
                            // Operand 2
                            comparison12.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                            comparison9.addOperand(comparison12);
                    
                    comparison6.addOperand(comparison9);
                }
            
            conjunction.addOperand(comparison6);
        }

        }        

        // Aesolicitudes.Fechaasignacion >= vFElabIni
        if (vFElabIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFElabIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        // Aesolicitudes.Fechaasignacion <= vFElabFin
        if (vFElabFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison8 = new SQLWhereComparison(sql);
            comparison8.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand119 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison8.setFirstOperand(operand119);
            
            // Operand 2
            comparison8.setSecondOperand(new SQLWhereOperandLiteral(vFElabFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison8);

        }        

        // FInicioContrato >= vFContratoIni
        if (vFContratoIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison9.setFirstOperand(operand1110);
            
            // Operand 2
            comparison9.setSecondOperand(new SQLWhereOperandLiteral(vFContratoIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison9);

        }        

        // FInicioContrato <= vFContratoFin
        if (vFContratoFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
            comparison10.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison10.setFirstOperand(operand1111);
            
            // Operand 2
            comparison10.setSecondOperand(new SQLWhereOperandLiteral(vFContratoFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison10);

        }        

        // Agente.Usuario LIKE "%" + vCodAsesor
        if (vCodAsesor != null) {
            // 'like' Comparison
            SQLWhereComparison comparison11 = new SQLWhereComparison(sql);
            comparison11.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison11.setFirstOperand(operand1112);
            
            // Operand 2
            comparison11.setSecondOperand(new SQLWhereOperandLiteral("%" + vCodAsesor, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison11);

        }        

        // ((Contratante.TipoIdentificacion = vTipoDoc AND Contratante.NumIdentificacion = vNumDoc) OR (Titular.TipoIdentificacion = vTipoDoc AND Titular.NumIdentificacion = vNumDoc) OR (EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc) = true))
        if (vTipoDoc != null && vNumDoc != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison12 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison13 = new SQLWhereDisjunction();
                
                    // Operand 1
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison14 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
                                    comparison15.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison15.setFirstOperand(operand1116);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2217 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTIPODOC);
                                    comparison15.setSecondOperand(operand2217);
                                    comparison14.addOperand(comparison15);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison17 = new SQLWhereComparison(sql);
                                    comparison17.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ATTR_NAME_CONTRATANTENUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison17.setFirstOperand(operand1118);
                                    
                                    // Operand 2
                                    comparison17.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison14.addOperand(comparison17);
                            
                            comparison13.addOperand(comparison14);
                        }
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison18 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison19 = new SQLWhereComparison(sql);
                                    comparison19.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1120 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison19.setFirstOperand(operand1120);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2221 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTIPODOC);
                                    comparison19.setSecondOperand(operand2221);
                                    comparison18.addOperand(comparison19);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison21 = new SQLWhereComparison(sql);
                                    comparison21.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1122 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ATTR_NAME_TITULARNUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison21.setFirstOperand(operand1122);
                                    
                                    // Operand 2
                                    comparison21.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison18.addOperand(comparison21);
                            
                            comparison13.addOperand(comparison18);
                        }
                    
                    comparison12.addOperand(comparison13);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator083 = new SQLWhereOperandSubQuery(repository.assocOperator083Range1Query(vTipoDoc, vNumDoc, sql));
            comparison12.addOperand(operandSubQueryAssocOperator083);
            
            conjunction.addOperand(comparison12);
        }

        }        

        // Agente.Sucursal.Regional = voRegional
        if (voRegional != null) {
            // '=' Comparison
            SQLWhereComparison comparison13 = new SQLWhereComparison(sql);
            comparison13.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand1114 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ROLE_NAME_SUCURSAL + "." + SucursalConstants.ROLE_NAME_REGIONAL, RegionalConstants.CLASS_NAME);
            comparison13.setFirstOperand(operand1114);
            
            // Operand 2
            SQLWhereOperandOVParameter operand2215 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOREGIONAL, RegionalConstants.CLASS_NAME, RegionalConstants.CLASS_NAME, voRegional.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VOREGIONAL);
            comparison13.setSecondOperand(operand2215);
            conjunction.addOperand(comparison13);

        }        

        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
        comparison14.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison14.setFirstOperand(operand1115);
        
        // Operand 2
        comparison14.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison14);


        // Estado <> 4
        // '<>' Comparison
        SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
        comparison15.setOperator("<>");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
        comparison15.setFirstOperand(operand1116);
        
        // Operand 2
        comparison15.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(4), Constants.Type.NAT.getTypeName()));
        conjunction.addOperand(comparison15);


        // FechaTerminada = NULL
        // '=' Comparison
        SQLWhereComparison comparison16 = new SQLWhereComparison(sql);
        comparison16.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFECHATERMINADA, Constants.Type.DATE.getTypeName());
        comparison16.setFirstOperand(operand1117);
        
        // Operand 2
        comparison16.setSecondOperand(new SQLWhereOperandNull());
        conjunction.addOperand(comparison16);


        // EstadoDoc = 3
        // '=' Comparison
        SQLWhereComparison comparison17 = new SQLWhereComparison(sql);
        comparison17.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
        comparison17.setFirstOperand(operand1118);
        
        // Operand 2
        comparison17.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(3), Constants.Type.NAT.getTypeName()));
        conjunction.addOperand(comparison17);


        sql.addConjunction(conjunction);
    }

    private void fSolicitudStatusAfil3(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;
        Long vTramite = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTRAMITE) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTRAMITE, FilterVariableRequest.NAT) : null;
        Productos voProducto = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPRODUCTO) ? productosSrv.getByOID(new ProductosOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPRODUCTO)))) : null;
        Planes voPlan = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPLAN) ? planesSrv.getByOID(new PlanesOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPLAN)))) : null;
        Long voEstado = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOESTADO) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOESTADO, FilterVariableRequest.INT) : null;
        Date vFElabIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VFELABINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VFELABINI, FilterVariableRequest.DATE) : null;
        Date vFElabFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VFELABFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VFELABFIN, FilterVariableRequest.DATE) : null;
        Date vFContratoIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VFCONTRATOINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VFCONTRATOINI, FilterVariableRequest.DATE) : null;
        Date vFContratoFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VFCONTRATOFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VFCONTRATOFIN, FilterVariableRequest.DATE) : null;
        String vCodAsesor = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VCODASESOR) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VCODASESOR, FilterVariableRequest.STRING) : null;
        TipoIdentificacion vTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VNUMDOC, FilterVariableRequest.STRING) : null;
        Regional voRegional = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOREGIONAL) ? regionalSrv.getByOID(new RegionalOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOREGIONAL)))) : null;

        // Completada = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Tramite = vTramite
        if (vTramite != null) {
            // '=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vTramite, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // Aesolicitudes.ProductoT = voProducto
        if (voProducto != null) {
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            SQLWhereOperandOVParameter operand226 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPRODUCTO, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, voProducto.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPRODUCTO);
            comparison4.setSecondOperand(operand226);
            conjunction.addOperand(comparison4);

        }        

        // Aesolicitudes.PlanT = voPlan
        if (voPlan != null) {
            // '=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            SQLWhereOperandOVParameter operand227 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPLAN, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, voPlan.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPLAN);
            comparison5.setSecondOperand(operand227);
            conjunction.addOperand(comparison5);

        }        

        // (Estado = voEstado OR (Estado = 8 AND voEstado = 1))
        if (voEstado != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison6 = new SQLWhereDisjunction();
        
            // Operand 1
                    // '=' Comparison
                    SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
                    comparison7.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                    comparison7.setFirstOperand(operand118);
                    
                    // Operand 2
                    comparison7.setSecondOperand(new SQLWhereOperandLiteral(voEstado, Constants.Type.INT.getTypeName()));
                    comparison6.addOperand(comparison7);
        
            // Operand 2
                {
                    // 'and' Logical operator
                    SQLWhereConjunction comparison9 = new SQLWhereConjunction();
                
                    // Operand 1
                            // '=' Comparison
                            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
                            comparison10.setOperator("=");
                            
                            // Operand 1
                            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                            comparison10.setFirstOperand(operand1111);
                            
                            // Operand 2
                            comparison10.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(8), Constants.Type.NAT.getTypeName()));
                            comparison9.addOperand(comparison10);
                
                    // Operand 2
                            // '=' Comparison
                            SQLWhereComparison comparison12 = new SQLWhereComparison(sql);
                            comparison12.setOperator("=");
                            
                            // Operand 1
                            comparison12.setFirstOperand(new SQLWhereOperandLiteral(voEstado, Constants.Type.INT.getTypeName()));
                            
                            // Operand 2
                            comparison12.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                            comparison9.addOperand(comparison12);
                    
                    comparison6.addOperand(comparison9);
                }
            
            conjunction.addOperand(comparison6);
        }

        }        

        // Aesolicitudes.Fechaasignacion >= vFElabIni
        if (vFElabIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFElabIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        // Aesolicitudes.Fechaasignacion <= vFElabFin
        if (vFElabFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison8 = new SQLWhereComparison(sql);
            comparison8.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand119 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison8.setFirstOperand(operand119);
            
            // Operand 2
            comparison8.setSecondOperand(new SQLWhereOperandLiteral(vFElabFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison8);

        }        

        // FInicioContrato >= vFContratoIni
        if (vFContratoIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison9.setFirstOperand(operand1110);
            
            // Operand 2
            comparison9.setSecondOperand(new SQLWhereOperandLiteral(vFContratoIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison9);

        }        

        // FInicioContrato <= vFContratoFin
        if (vFContratoFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
            comparison10.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison10.setFirstOperand(operand1111);
            
            // Operand 2
            comparison10.setSecondOperand(new SQLWhereOperandLiteral(vFContratoFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison10);

        }        

        // Agente.Usuario LIKE "%" + vCodAsesor
        if (vCodAsesor != null) {
            // 'like' Comparison
            SQLWhereComparison comparison11 = new SQLWhereComparison(sql);
            comparison11.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison11.setFirstOperand(operand1112);
            
            // Operand 2
            comparison11.setSecondOperand(new SQLWhereOperandLiteral("%" + vCodAsesor, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison11);

        }        

        // ((Contratante.TipoIdentificacion = vTipoDoc AND Contratante.NumIdentificacion = vNumDoc) OR (Titular.TipoIdentificacion = vTipoDoc AND Titular.NumIdentificacion = vNumDoc) OR (EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc) = true))
        if (vTipoDoc != null && vNumDoc != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison12 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison13 = new SQLWhereDisjunction();
                
                    // Operand 1
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison14 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
                                    comparison15.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison15.setFirstOperand(operand1116);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2217 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTIPODOC);
                                    comparison15.setSecondOperand(operand2217);
                                    comparison14.addOperand(comparison15);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison17 = new SQLWhereComparison(sql);
                                    comparison17.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ATTR_NAME_CONTRATANTENUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison17.setFirstOperand(operand1118);
                                    
                                    // Operand 2
                                    comparison17.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison14.addOperand(comparison17);
                            
                            comparison13.addOperand(comparison14);
                        }
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison18 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison19 = new SQLWhereComparison(sql);
                                    comparison19.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1120 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison19.setFirstOperand(operand1120);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2221 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTIPODOC);
                                    comparison19.setSecondOperand(operand2221);
                                    comparison18.addOperand(comparison19);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison21 = new SQLWhereComparison(sql);
                                    comparison21.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1122 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ATTR_NAME_TITULARNUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison21.setFirstOperand(operand1122);
                                    
                                    // Operand 2
                                    comparison21.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison18.addOperand(comparison21);
                            
                            comparison13.addOperand(comparison18);
                        }
                    
                    comparison12.addOperand(comparison13);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator084 = new SQLWhereOperandSubQuery(repository.assocOperator084Range1Query(vTipoDoc, vNumDoc, sql));
            comparison12.addOperand(operandSubQueryAssocOperator084);
            
            conjunction.addOperand(comparison12);
        }

        }        

        // Agente.Sucursal.Regional = voRegional
        if (voRegional != null) {
            // '=' Comparison
            SQLWhereComparison comparison13 = new SQLWhereComparison(sql);
            comparison13.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand1114 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ROLE_NAME_SUCURSAL + "." + SucursalConstants.ROLE_NAME_REGIONAL, RegionalConstants.CLASS_NAME);
            comparison13.setFirstOperand(operand1114);
            
            // Operand 2
            SQLWhereOperandOVParameter operand2215 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOREGIONAL, RegionalConstants.CLASS_NAME, RegionalConstants.CLASS_NAME, voRegional.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VOREGIONAL);
            comparison13.setSecondOperand(operand2215);
            conjunction.addOperand(comparison13);

        }        

        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
        comparison14.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison14.setFirstOperand(operand1115);
        
        // Operand 2
        comparison14.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison14);


        // FechaTerminada <> NULL
        // '<>' Comparison
        SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
        comparison15.setOperator("<>");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFECHATERMINADA, Constants.Type.DATE.getTypeName());
        comparison15.setFirstOperand(operand1116);
        
        // Operand 2
        comparison15.setSecondOperand(new SQLWhereOperandNull());
        conjunction.addOperand(comparison15);


        // EstadoDoc = 2
        // '=' Comparison
        SQLWhereComparison comparison16 = new SQLWhereComparison(sql);
        comparison16.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
        comparison16.setFirstOperand(operand1117);
        
        // Operand 2
        comparison16.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(2), Constants.Type.NAT.getTypeName()));
        conjunction.addOperand(comparison16);


        sql.addConjunction(conjunction);
    }

    private void fSolicitudEstatusAreaMed1(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;
        Long vTramite = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTRAMITE) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTRAMITE, FilterVariableRequest.NAT) : null;
        Productos voProducto = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPRODUCTO) ? productosSrv.getByOID(new ProductosOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPRODUCTO)))) : null;
        Planes voPlan = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPLAN) ? planesSrv.getByOID(new PlanesOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPLAN)))) : null;
        Long voEstadoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOESTADODOC) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOESTADODOC, FilterVariableRequest.NAT) : null;
        Date vFElabIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFELABINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFELABINI, FilterVariableRequest.DATE) : null;
        Date vFElabFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFELABFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFELABFIN, FilterVariableRequest.DATE) : null;
        Date vFContratoIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFCONTRATOINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFCONTRATOINI, FilterVariableRequest.DATE) : null;
        Date vFContratoFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFCONTRATOFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFCONTRATOFIN, FilterVariableRequest.DATE) : null;
        String vCodAsesor = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VCODASESOR) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VCODASESOR, FilterVariableRequest.STRING) : null;
        TipoIdentificacion vTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VNUMDOC, FilterVariableRequest.STRING) : null;
        Regional voRegional = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOREGIONAL) ? regionalSrv.getByOID(new RegionalOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOREGIONAL)))) : null;

        // Completada = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Tramite = vTramite
        if (vTramite != null) {
            // '=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vTramite, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // Aesolicitudes.ProductoT = voProducto
        if (voProducto != null) {
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            SQLWhereOperandOVParameter operand226 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPRODUCTO, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, voProducto.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPRODUCTO);
            comparison4.setSecondOperand(operand226);
            conjunction.addOperand(comparison4);

        }        

        // Aesolicitudes.PlanT = voPlan
        if (voPlan != null) {
            // '=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            SQLWhereOperandOVParameter operand227 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPLAN, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, voPlan.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPLAN);
            comparison5.setSecondOperand(operand227);
            conjunction.addOperand(comparison5);

        }        

        // EstadoDoc = voEstadoDoc
        if (voEstadoDoc != null) {
            // '=' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral(voEstadoDoc, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        // Aesolicitudes.Fechaasignacion >= vFElabIni
        if (vFElabIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFElabIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        // Aesolicitudes.Fechaasignacion <= vFElabFin
        if (vFElabFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison8 = new SQLWhereComparison(sql);
            comparison8.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand119 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison8.setFirstOperand(operand119);
            
            // Operand 2
            comparison8.setSecondOperand(new SQLWhereOperandLiteral(vFElabFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison8);

        }        

        // FInicioContrato >= vFContratoIni
        if (vFContratoIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison9.setFirstOperand(operand1110);
            
            // Operand 2
            comparison9.setSecondOperand(new SQLWhereOperandLiteral(vFContratoIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison9);

        }        

        // FInicioContrato <= vFContratoFin
        if (vFContratoFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
            comparison10.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison10.setFirstOperand(operand1111);
            
            // Operand 2
            comparison10.setSecondOperand(new SQLWhereOperandLiteral(vFContratoFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison10);

        }        

        // Agente.Usuario LIKE "%" + vCodAsesor
        if (vCodAsesor != null) {
            // 'like' Comparison
            SQLWhereComparison comparison11 = new SQLWhereComparison(sql);
            comparison11.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison11.setFirstOperand(operand1112);
            
            // Operand 2
            comparison11.setSecondOperand(new SQLWhereOperandLiteral("%" + vCodAsesor, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison11);

        }        

        // ((Contratante.TipoIdentificacion = vTipoDoc AND Contratante.NumIdentificacion = vNumDoc) OR (Titular.TipoIdentificacion = vTipoDoc AND Titular.NumIdentificacion = vNumDoc) OR (EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc) = true))
        if (vTipoDoc != null && vNumDoc != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison12 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison13 = new SQLWhereDisjunction();
                
                    // Operand 1
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison14 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
                                    comparison15.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison15.setFirstOperand(operand1116);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2217 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTIPODOC);
                                    comparison15.setSecondOperand(operand2217);
                                    comparison14.addOperand(comparison15);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison17 = new SQLWhereComparison(sql);
                                    comparison17.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ATTR_NAME_CONTRATANTENUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison17.setFirstOperand(operand1118);
                                    
                                    // Operand 2
                                    comparison17.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison14.addOperand(comparison17);
                            
                            comparison13.addOperand(comparison14);
                        }
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison18 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison19 = new SQLWhereComparison(sql);
                                    comparison19.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1120 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison19.setFirstOperand(operand1120);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2221 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTIPODOC);
                                    comparison19.setSecondOperand(operand2221);
                                    comparison18.addOperand(comparison19);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison21 = new SQLWhereComparison(sql);
                                    comparison21.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1122 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ATTR_NAME_TITULARNUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison21.setFirstOperand(operand1122);
                                    
                                    // Operand 2
                                    comparison21.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison18.addOperand(comparison21);
                            
                            comparison13.addOperand(comparison18);
                        }
                    
                    comparison12.addOperand(comparison13);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator085 = new SQLWhereOperandSubQuery(repository.assocOperator085Range1Query(vTipoDoc, vNumDoc, sql));
            comparison12.addOperand(operandSubQueryAssocOperator085);
            
            conjunction.addOperand(comparison12);
        }

        }        

        // Agente.Sucursal.Regional = voRegional
        if (voRegional != null) {
            // '=' Comparison
            SQLWhereComparison comparison13 = new SQLWhereComparison(sql);
            comparison13.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand1114 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ROLE_NAME_SUCURSAL + "." + SucursalConstants.ROLE_NAME_REGIONAL, RegionalConstants.CLASS_NAME);
            comparison13.setFirstOperand(operand1114);
            
            // Operand 2
            SQLWhereOperandOVParameter operand2215 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOREGIONAL, RegionalConstants.CLASS_NAME, RegionalConstants.CLASS_NAME, voRegional.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOREGIONAL);
            comparison13.setSecondOperand(operand2215);
            conjunction.addOperand(comparison13);

        }        

        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
        comparison14.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison14.setFirstOperand(operand1115);
        
        // Operand 2
        comparison14.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison14);


        // Estado = 5
        // '=' Comparison
        SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
        comparison15.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
        comparison15.setFirstOperand(operand1116);
        
        // Operand 2
        comparison15.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(5), Constants.Type.NAT.getTypeName()));
        conjunction.addOperand(comparison15);


        // FechaTerminada = NULL
        // '=' Comparison
        SQLWhereComparison comparison16 = new SQLWhereComparison(sql);
        comparison16.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFECHATERMINADA, Constants.Type.DATE.getTypeName());
        comparison16.setFirstOperand(operand1117);
        
        // Operand 2
        comparison16.setSecondOperand(new SQLWhereOperandNull());
        conjunction.addOperand(comparison16);


        sql.addConjunction(conjunction);
    }

    private void fSolicitudEstatusAreaMed2(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;
        Long vTramite = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTRAMITE) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTRAMITE, FilterVariableRequest.NAT) : null;
        Productos voProducto = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPRODUCTO) ? productosSrv.getByOID(new ProductosOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPRODUCTO)))) : null;
        Planes voPlan = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPLAN) ? planesSrv.getByOID(new PlanesOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPLAN)))) : null;
        Long voEstadoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOESTADODOC) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOESTADODOC, FilterVariableRequest.NAT) : null;
        Date vFElabIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFELABINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFELABINI, FilterVariableRequest.DATE) : null;
        Date vFElabFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFELABFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFELABFIN, FilterVariableRequest.DATE) : null;
        Date vFContratoIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFCONTRATOINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFCONTRATOINI, FilterVariableRequest.DATE) : null;
        Date vFContratoFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFCONTRATOFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFCONTRATOFIN, FilterVariableRequest.DATE) : null;
        String vCodAsesor = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VCODASESOR) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VCODASESOR, FilterVariableRequest.STRING) : null;
        TipoIdentificacion vTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VNUMDOC, FilterVariableRequest.STRING) : null;
        Regional voRegional = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOREGIONAL) ? regionalSrv.getByOID(new RegionalOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOREGIONAL)))) : null;

        // Completada = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Tramite = vTramite
        if (vTramite != null) {
            // '=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vTramite, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // Aesolicitudes.ProductoT = voProducto
        if (voProducto != null) {
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            SQLWhereOperandOVParameter operand226 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPRODUCTO, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, voProducto.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPRODUCTO);
            comparison4.setSecondOperand(operand226);
            conjunction.addOperand(comparison4);

        }        

        // Aesolicitudes.PlanT = voPlan
        if (voPlan != null) {
            // '=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            SQLWhereOperandOVParameter operand227 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPLAN, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, voPlan.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPLAN);
            comparison5.setSecondOperand(operand227);
            conjunction.addOperand(comparison5);

        }        

        // EstadoDoc = voEstadoDoc
        if (voEstadoDoc != null) {
            // '=' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral(voEstadoDoc, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        // Aesolicitudes.Fechaasignacion >= vFElabIni
        if (vFElabIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFElabIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        // Aesolicitudes.Fechaasignacion <= vFElabFin
        if (vFElabFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison8 = new SQLWhereComparison(sql);
            comparison8.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand119 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison8.setFirstOperand(operand119);
            
            // Operand 2
            comparison8.setSecondOperand(new SQLWhereOperandLiteral(vFElabFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison8);

        }        

        // FInicioContrato >= vFContratoIni
        if (vFContratoIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison9.setFirstOperand(operand1110);
            
            // Operand 2
            comparison9.setSecondOperand(new SQLWhereOperandLiteral(vFContratoIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison9);

        }        

        // FInicioContrato <= vFContratoFin
        if (vFContratoFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
            comparison10.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison10.setFirstOperand(operand1111);
            
            // Operand 2
            comparison10.setSecondOperand(new SQLWhereOperandLiteral(vFContratoFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison10);

        }        

        // Agente.Usuario LIKE "%" + vCodAsesor
        if (vCodAsesor != null) {
            // 'like' Comparison
            SQLWhereComparison comparison11 = new SQLWhereComparison(sql);
            comparison11.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison11.setFirstOperand(operand1112);
            
            // Operand 2
            comparison11.setSecondOperand(new SQLWhereOperandLiteral("%" + vCodAsesor, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison11);

        }        

        // ((Contratante.TipoIdentificacion = vTipoDoc AND Contratante.NumIdentificacion = vNumDoc) OR (Titular.TipoIdentificacion = vTipoDoc AND Titular.NumIdentificacion = vNumDoc) OR (EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc) = true))
        if (vTipoDoc != null && vNumDoc != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison12 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison13 = new SQLWhereDisjunction();
                
                    // Operand 1
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison14 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
                                    comparison15.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison15.setFirstOperand(operand1116);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2217 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTIPODOC);
                                    comparison15.setSecondOperand(operand2217);
                                    comparison14.addOperand(comparison15);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison17 = new SQLWhereComparison(sql);
                                    comparison17.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ATTR_NAME_CONTRATANTENUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison17.setFirstOperand(operand1118);
                                    
                                    // Operand 2
                                    comparison17.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison14.addOperand(comparison17);
                            
                            comparison13.addOperand(comparison14);
                        }
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison18 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison19 = new SQLWhereComparison(sql);
                                    comparison19.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1120 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison19.setFirstOperand(operand1120);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2221 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTIPODOC);
                                    comparison19.setSecondOperand(operand2221);
                                    comparison18.addOperand(comparison19);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison21 = new SQLWhereComparison(sql);
                                    comparison21.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1122 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ATTR_NAME_TITULARNUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison21.setFirstOperand(operand1122);
                                    
                                    // Operand 2
                                    comparison21.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison18.addOperand(comparison21);
                            
                            comparison13.addOperand(comparison18);
                        }
                    
                    comparison12.addOperand(comparison13);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator086 = new SQLWhereOperandSubQuery(repository.assocOperator086Range1Query(vTipoDoc, vNumDoc, sql));
            comparison12.addOperand(operandSubQueryAssocOperator086);
            
            conjunction.addOperand(comparison12);
        }

        }        

        // Agente.Sucursal.Regional = voRegional
        if (voRegional != null) {
            // '=' Comparison
            SQLWhereComparison comparison13 = new SQLWhereComparison(sql);
            comparison13.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand1114 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ROLE_NAME_SUCURSAL + "." + SucursalConstants.ROLE_NAME_REGIONAL, RegionalConstants.CLASS_NAME);
            comparison13.setFirstOperand(operand1114);
            
            // Operand 2
            SQLWhereOperandOVParameter operand2215 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOREGIONAL, RegionalConstants.CLASS_NAME, RegionalConstants.CLASS_NAME, voRegional.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOREGIONAL);
            comparison13.setSecondOperand(operand2215);
            conjunction.addOperand(comparison13);

        }        

        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
        comparison14.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison14.setFirstOperand(operand1115);
        
        // Operand 2
        comparison14.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison14);


        // Estado = 6
        // '=' Comparison
        SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
        comparison15.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
        comparison15.setFirstOperand(operand1116);
        
        // Operand 2
        comparison15.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(6), Constants.Type.NAT.getTypeName()));
        conjunction.addOperand(comparison15);


        // FechaTerminada = NULL
        // '=' Comparison
        SQLWhereComparison comparison16 = new SQLWhereComparison(sql);
        comparison16.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFECHATERMINADA, Constants.Type.DATE.getTypeName());
        comparison16.setFirstOperand(operand1117);
        
        // Operand 2
        comparison16.setSecondOperand(new SQLWhereOperandNull());
        conjunction.addOperand(comparison16);


        sql.addConjunction(conjunction);
    }

    private void fSolicitudEstatusAreaMed3(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;
        Long vTramite = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTRAMITE) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTRAMITE, FilterVariableRequest.NAT) : null;
        Productos voProducto = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPRODUCTO) ? productosSrv.getByOID(new ProductosOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPRODUCTO)))) : null;
        Planes voPlan = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPLAN) ? planesSrv.getByOID(new PlanesOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPLAN)))) : null;
        Long voEstadoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOESTADODOC) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOESTADODOC, FilterVariableRequest.NAT) : null;
        Date vFElabIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFELABINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFELABINI, FilterVariableRequest.DATE) : null;
        Date vFElabFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFELABFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFELABFIN, FilterVariableRequest.DATE) : null;
        Date vFContratoIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFCONTRATOINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFCONTRATOINI, FilterVariableRequest.DATE) : null;
        Date vFContratoFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFCONTRATOFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFCONTRATOFIN, FilterVariableRequest.DATE) : null;
        String vCodAsesor = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VCODASESOR) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VCODASESOR, FilterVariableRequest.STRING) : null;
        TipoIdentificacion vTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VNUMDOC, FilterVariableRequest.STRING) : null;
        Regional voRegional = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOREGIONAL) ? regionalSrv.getByOID(new RegionalOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOREGIONAL)))) : null;

        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        // Tramite = vTramite
        if (vTramite != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vTramite, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Aesolicitudes.ProductoT = voProducto
        if (voProducto != null) {
            // '=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand114 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            SQLWhereOperandOVParameter operand225 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPRODUCTO, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, voProducto.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPRODUCTO);
            comparison3.setSecondOperand(operand225);
            conjunction.addOperand(comparison3);

        }        

        // Aesolicitudes.PlanT = voPlan
        if (voPlan != null) {
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            SQLWhereOperandOVParameter operand226 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPLAN, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, voPlan.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPLAN);
            comparison4.setSecondOperand(operand226);
            conjunction.addOperand(comparison4);

        }        

        // EstadoDoc = voEstadoDoc
        if (voEstadoDoc != null) {
            // '=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            comparison5.setSecondOperand(new SQLWhereOperandLiteral(voEstadoDoc, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison5);

        }        

        // Aesolicitudes.Fechaasignacion >= vFElabIni
        if (vFElabIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral(vFElabIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        // Aesolicitudes.Fechaasignacion <= vFElabFin
        if (vFElabFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFElabFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        // FInicioContrato >= vFContratoIni
        if (vFContratoIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison8 = new SQLWhereComparison(sql);
            comparison8.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand119 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison8.setFirstOperand(operand119);
            
            // Operand 2
            comparison8.setSecondOperand(new SQLWhereOperandLiteral(vFContratoIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison8);

        }        

        // FInicioContrato <= vFContratoFin
        if (vFContratoFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison9.setFirstOperand(operand1110);
            
            // Operand 2
            comparison9.setSecondOperand(new SQLWhereOperandLiteral(vFContratoFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison9);

        }        

        // Agente.Usuario LIKE "%" + vCodAsesor
        if (vCodAsesor != null) {
            // 'like' Comparison
            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
            comparison10.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison10.setFirstOperand(operand1111);
            
            // Operand 2
            comparison10.setSecondOperand(new SQLWhereOperandLiteral("%" + vCodAsesor, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison10);

        }        

        // ((Contratante.TipoIdentificacion = vTipoDoc AND Contratante.NumIdentificacion = vNumDoc) OR (Titular.TipoIdentificacion = vTipoDoc AND Titular.NumIdentificacion = vNumDoc) OR (EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc) = true))
        if (vTipoDoc != null && vNumDoc != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison11 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison12 = new SQLWhereDisjunction();
                
                    // Operand 1
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison13 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
                                    comparison14.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison14.setFirstOperand(operand1115);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2216 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTIPODOC);
                                    comparison14.setSecondOperand(operand2216);
                                    comparison13.addOperand(comparison14);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison16 = new SQLWhereComparison(sql);
                                    comparison16.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ATTR_NAME_CONTRATANTENUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison16.setFirstOperand(operand1117);
                                    
                                    // Operand 2
                                    comparison16.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison13.addOperand(comparison16);
                            
                            comparison12.addOperand(comparison13);
                        }
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison17 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison18 = new SQLWhereComparison(sql);
                                    comparison18.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1119 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison18.setFirstOperand(operand1119);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2220 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTIPODOC);
                                    comparison18.setSecondOperand(operand2220);
                                    comparison17.addOperand(comparison18);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison20 = new SQLWhereComparison(sql);
                                    comparison20.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1121 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ATTR_NAME_TITULARNUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison20.setFirstOperand(operand1121);
                                    
                                    // Operand 2
                                    comparison20.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison17.addOperand(comparison20);
                            
                            comparison12.addOperand(comparison17);
                        }
                    
                    comparison11.addOperand(comparison12);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator087 = new SQLWhereOperandSubQuery(repository.assocOperator087Range1Query(vTipoDoc, vNumDoc, sql));
            comparison11.addOperand(operandSubQueryAssocOperator087);
            
            conjunction.addOperand(comparison11);
        }

        }        

        // Agente.Sucursal.Regional = voRegional
        if (voRegional != null) {
            // '=' Comparison
            SQLWhereComparison comparison12 = new SQLWhereComparison(sql);
            comparison12.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand1113 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ROLE_NAME_SUCURSAL + "." + SucursalConstants.ROLE_NAME_REGIONAL, RegionalConstants.CLASS_NAME);
            comparison12.setFirstOperand(operand1113);
            
            // Operand 2
            SQLWhereOperandOVParameter operand2214 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOREGIONAL, RegionalConstants.CLASS_NAME, RegionalConstants.CLASS_NAME, voRegional.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOREGIONAL);
            comparison12.setSecondOperand(operand2214);
            conjunction.addOperand(comparison12);

        }        

        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison13 = new SQLWhereComparison(sql);
        comparison13.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison13.setFirstOperand(operand1114);
        
        // Operand 2
        comparison13.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison13);


        // Completada = true
        // '=' Comparison
        SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
        comparison14.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
        comparison14.setFirstOperand(operand1115);
        
        // Operand 2
        comparison14.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison14);


        // (Estado = 7 OR FechaTerminada <> NULL)
    {
        // 'or' Logical operator
        SQLWhereDisjunction comparison15 = new SQLWhereDisjunction();
    
        // Operand 1
            // '=' Comparison
            SQLWhereComparison comparison16 = new SQLWhereComparison(sql);
            comparison16.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1117 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
            comparison16.setFirstOperand(operand1117);
            
            // Operand 2
            comparison16.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(7), Constants.Type.NAT.getTypeName()));
            comparison15.addOperand(comparison16);
    
        // Operand 2
            // '<>' Comparison
            SQLWhereComparison comparison18 = new SQLWhereComparison(sql);
            comparison18.setOperator("<>");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1119 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFECHATERMINADA, Constants.Type.DATE.getTypeName());
            comparison18.setFirstOperand(operand1119);
            
            // Operand 2
            comparison18.setSecondOperand(new SQLWhereOperandNull());
            comparison15.addOperand(comparison18);
        
        conjunction.addOperand(comparison15);
    }


        sql.addConjunction(conjunction);
    }

    private void fSolicitudStatusEstHomo(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNumSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VNUMSOLICITUD) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VNUMSOLICITUD, FilterVariableRequest.STRING) : null;
        Long vTramite = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTRAMITE) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTRAMITE, FilterVariableRequest.NAT) : null;
        Productos voProducto = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPRODUCTO) ? productosSrv.getByOID(new ProductosOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPRODUCTO)))) : null;
        Planes voPlan = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPLAN) ? planesSrv.getByOID(new PlanesOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPLAN)))) : null;
        Long voEstado = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOESTADO) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOESTADO, FilterVariableRequest.INT) : null;
        Date vFElabIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFELABINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFELABINI, FilterVariableRequest.DATE) : null;
        Date vFElabFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFELABFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFELABFIN, FilterVariableRequest.DATE) : null;
        Date vFContratoIni = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFCONTRATOINI) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFCONTRATOINI, FilterVariableRequest.DATE) : null;
        Date vFContratoFin = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFCONTRATOFIN) ? (Date) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFCONTRATOFIN, FilterVariableRequest.DATE) : null;
        String vCodAsesor = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VCODASESOR) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VCODASESOR, FilterVariableRequest.STRING) : null;
        TipoIdentificacion vTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VNUMDOC, FilterVariableRequest.STRING) : null;
        Regional voRegional = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOREGIONAL) ? regionalSrv.getByOID(new RegionalOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOREGIONAL)))) : null;
        Long vEstadoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VESTADODOC) ? (Long) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VESTADODOC, FilterVariableRequest.NAT) : null;

        // Completada = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDCOMPLETADA, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        // Aesolicitudes.Numerosolicitud = vNumSolicitud
        if (vNumSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumSolicitud, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // Tramite = vTramite
        if (vTramite != null) {
            // '=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vTramite, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // Aesolicitudes.ProductoT = voProducto
        if (voProducto != null) {
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand115 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            SQLWhereOperandOVParameter operand226 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPRODUCTO, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, voProducto.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPRODUCTO);
            comparison4.setSecondOperand(operand226);
            conjunction.addOperand(comparison4);

        }        

        // Aesolicitudes.PlanT = voPlan
        if (voPlan != null) {
            // '=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            SQLWhereOperandOVParameter operand227 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPLAN, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, voPlan.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPLAN);
            comparison5.setSecondOperand(operand227);
            conjunction.addOperand(comparison5);

        }        

        // (Estado = voEstado OR (Estado = 8 AND voEstado = 1))
        if (voEstado != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison6 = new SQLWhereDisjunction();
        
            // Operand 1
                    // '=' Comparison
                    SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
                    comparison7.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                    comparison7.setFirstOperand(operand118);
                    
                    // Operand 2
                    comparison7.setSecondOperand(new SQLWhereOperandLiteral(voEstado, Constants.Type.INT.getTypeName()));
                    comparison6.addOperand(comparison7);
        
            // Operand 2
                {
                    // 'and' Logical operator
                    SQLWhereConjunction comparison9 = new SQLWhereConjunction();
                
                    // Operand 1
                            // '=' Comparison
                            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
                            comparison10.setOperator("=");
                            
                            // Operand 1
                            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
                            comparison10.setFirstOperand(operand1111);
                            
                            // Operand 2
                            comparison10.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(8), Constants.Type.NAT.getTypeName()));
                            comparison9.addOperand(comparison10);
                
                    // Operand 2
                            // '=' Comparison
                            SQLWhereComparison comparison12 = new SQLWhereComparison(sql);
                            comparison12.setOperator("=");
                            
                            // Operand 1
                            comparison12.setFirstOperand(new SQLWhereOperandLiteral(voEstado, Constants.Type.INT.getTypeName()));
                            
                            // Operand 2
                            comparison12.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                            comparison9.addOperand(comparison12);
                    
                    comparison6.addOperand(comparison9);
                }
            
            conjunction.addOperand(comparison6);
        }

        }        

        // Aesolicitudes.Fechaasignacion >= vFElabIni
        if (vFElabIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFElabIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        // Aesolicitudes.Fechaasignacion <= vFElabFin
        if (vFElabFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison8 = new SQLWhereComparison(sql);
            comparison8.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand119 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison8.setFirstOperand(operand119);
            
            // Operand 2
            comparison8.setSecondOperand(new SQLWhereOperandLiteral(vFElabFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison8);

        }        

        // FInicioContrato >= vFContratoIni
        if (vFContratoIni != null) {
            // '>=' Comparison
            SQLWhereComparison comparison9 = new SQLWhereComparison(sql);
            comparison9.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1110 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison9.setFirstOperand(operand1110);
            
            // Operand 2
            comparison9.setSecondOperand(new SQLWhereOperandLiteral(vFContratoIni, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison9);

        }        

        // FInicioContrato <= vFContratoFin
        if (vFContratoFin != null) {
            // '<=' Comparison
            SQLWhereComparison comparison10 = new SQLWhereComparison(sql);
            comparison10.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1111 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDFINICIOCONTRATO, Constants.Type.DATE.getTypeName());
            comparison10.setFirstOperand(operand1111);
            
            // Operand 2
            comparison10.setSecondOperand(new SQLWhereOperandLiteral(vFContratoFin, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison10);

        }        

        // Agente.Usuario LIKE "%" + vCodAsesor
        if (vCodAsesor != null) {
            // 'like' Comparison
            SQLWhereComparison comparison11 = new SQLWhereComparison(sql);
            comparison11.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison11.setFirstOperand(operand1112);
            
            // Operand 2
            comparison11.setSecondOperand(new SQLWhereOperandLiteral("%" + vCodAsesor, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison11);

        }        

        // ((Contratante.TipoIdentificacion = vTipoDoc AND Contratante.NumIdentificacion = vNumDoc) OR (Titular.TipoIdentificacion = vTipoDoc AND Titular.NumIdentificacion = vNumDoc) OR (EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc) = true))
        if (vTipoDoc != null && vNumDoc != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison12 = new SQLWhereDisjunction();
        
            // Operand 1
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison13 = new SQLWhereDisjunction();
                
                    // Operand 1
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison14 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
                                    comparison15.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1116 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison15.setFirstOperand(operand1116);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2217 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTIPODOC);
                                    comparison15.setSecondOperand(operand2217);
                                    comparison14.addOperand(comparison15);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison17 = new SQLWhereComparison(sql);
                                    comparison17.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1118 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ATTR_NAME_CONTRATANTENUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison17.setFirstOperand(operand1118);
                                    
                                    // Operand 2
                                    comparison17.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison14.addOperand(comparison17);
                            
                            comparison13.addOperand(comparison14);
                        }
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison18 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison19 = new SQLWhereComparison(sql);
                                    comparison19.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathInstance operand1120 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                                    comparison19.setFirstOperand(operand1120);
                                    
                                    // Operand 2
                                    SQLWhereOperandOVParameter operand2221 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTIPODOC);
                                    comparison19.setSecondOperand(operand2221);
                                    comparison18.addOperand(comparison19);
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison21 = new SQLWhereComparison(sql);
                                    comparison21.setOperator("=");
                                    
                                    // Operand 1
                                    SQLWhereOperandPathAttribute operand1122 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ATTR_NAME_TITULARNUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                                    comparison21.setFirstOperand(operand1122);
                                    
                                    // Operand 2
                                    comparison21.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                                    comparison18.addOperand(comparison21);
                            
                            comparison13.addOperand(comparison18);
                        }
                    
                    comparison12.addOperand(comparison13);
                }
        
            // Operand 2
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator088 = new SQLWhereOperandSubQuery(repository.assocOperator088Range1Query(vTipoDoc, vNumDoc, sql));
            comparison12.addOperand(operandSubQueryAssocOperator088);
            
            conjunction.addOperand(comparison12);
        }

        }        

        // Agente.Sucursal.Regional = voRegional
        if (voRegional != null) {
            // '=' Comparison
            SQLWhereComparison comparison13 = new SQLWhereComparison(sql);
            comparison13.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand1114 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ROLE_NAME_SUCURSAL + "." + SucursalConstants.ROLE_NAME_REGIONAL, RegionalConstants.CLASS_NAME);
            comparison13.setFirstOperand(operand1114);
            
            // Operand 2
            SQLWhereOperandOVParameter operand2215 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOREGIONAL, RegionalConstants.CLASS_NAME, RegionalConstants.CLASS_NAME, voRegional.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOREGIONAL);
            comparison13.setSecondOperand(operand2215);
            conjunction.addOperand(comparison13);

        }        

        // EstadoDoc = vEstadoDoc
        if (vEstadoDoc != null) {
            // '=' Comparison
            SQLWhereComparison comparison14 = new SQLWhereComparison(sql);
            comparison14.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand1115 = new SQLWhereOperandPathAttribute(SolicitudConstants.ATTR_NAME_SOLICITUDESTADODOC, Constants.Type.NAT.getTypeName());
            comparison14.setFirstOperand(operand1115);
            
            // Operand 2
            comparison14.setSecondOperand(new SQLWhereOperandLiteral(vEstadoDoc, Constants.Type.NAT.getTypeName()));
            conjunction.addOperand(comparison14);

        }        

        // Aesolicitudes.Tiposolicitud = "E"
        // '=' Comparison
        SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
        comparison15.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand1116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESTIPOSOLICITUD, Constants.Type.STRING.getTypeName());
        comparison15.setFirstOperand(operand1116);
        
        // Operand 2
        comparison15.setSecondOperand(new SQLWhereOperandLiteral("E", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison15);


        sql.addConjunction(conjunction);
    }

    private boolean inMemoryFSolicitudLegalizaComisiones(Solicitud entity) {
        boolean result = true;

        // (Estado <> 2 OR drvTienePrimeraFirma = true)
        try {
            result = result && (!(entity.getSolicitudEstado()).equals(Long.valueOf(2)) || entity.getSolicituddrvTienePrimeraFirma().equals(true));
        } catch(Exception e) {
           LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
           throw new SystemException(e.getMessage());
        }

        // (Estado <> 3 OR (drvTienePrimeraFirma = true AND drvTieneSegundaFirma = true))
        try {
            result = result && (!(entity.getSolicitudEstado()).equals(Long.valueOf(3)) || (entity.getSolicituddrvTienePrimeraFirma().equals(true) && entity.getSolicituddrvTieneSegundaFirma().equals(true)));
        } catch(Exception e) {
           LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
           throw new SystemException(e.getMessage());
        }
        return result;
    }

    // IIU Methods

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUNuevaAfil for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUNuevaAfil
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUNuevaAfil iIUNuevaAfiliacion(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUNuevaAfil(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUInfoContratJUR for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUInfoContratJUR
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContratJUR iIUInfoContratanteJUR(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContratJUR(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUInfoObservacion for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUInfoObservacion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoObservacion iIUInfoObservaciones(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoObservacion(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUInfoPago for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUInfoPago
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoPago iIUInfoPago(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoPago(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUInclusion for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUInclusion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInclusion iIUInclusion(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInclusion(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudInfoContratanteID for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudInfoContratanteID
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudInfoContratanteID iIUInfoContratanteIDINCL(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudInfoContratanteID(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUInfoContraConta for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUInfoContraConta
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContraConta iIUInfoContratanteContactoINC(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContraConta(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudVacia for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudVacia
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudVacia iIUSolicitudVacia(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudVacia(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUDifLiq for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUDifLiq
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUDifLiq iIUDiferenciasLiquidacion(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUDifLiq(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUPreexistencias for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUPreexistencias
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUPreexistencias iIUSolicitudPreexistencias(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUPreexistencias(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset ICSolicitud for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset ICSolicitud
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.ICSolicitud iIUInfoContratanteEditable(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.ICSolicitud(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset ICSolicitud for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset ICSolicitud
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.ICSolicitud iIUInfoTitularEditable(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.ICSolicitud(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUInfoContratNAT for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUInfoContratNAT
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContratNAT iIUInfoContratanteNAT(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContratNAT(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUInfoContratJUR for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUInfoContratJUR
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContratJUR iIUInfoContratanteJURCol(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContratJUR(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudIIUInfoContratNAT for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudIIUInfoContratNAT
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContratNAT iIUInfoContratanteNATCol(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudIIUInfoContratNAT(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudPIUStatusFull for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudPIUStatusFull
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusFull iIUSolicitudEstatusVerMas(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusFull(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Solicitud with displayset DSSolicitudPIUStatusFullAse for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Solicitud with displayset DSSolicitudPIUStatusFullAse
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusFullAse iIUSolicitudEstatusVerMasAse(SolicitudOid oid) {
        return new com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusFullAse(getByOIDWithHV(oid));
    }


    /*
     * Solves the query needed for PIURadicadosObs
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Solicitud using displayset DSSolicitudPIURadicado that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIURadicado> piuPIURadicadosObs(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIURadicado::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIURadicadosObs
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIURadicadosObs
     */
    public int getCount4PIURadicadosObs(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUConsultarRadicado
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Solicitud using displayset DSSolicitudPIUConsultaRad that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUConsultaRad> piuPIUConsultarRadicado(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUConsultaRad::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUConsultarRadicado
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUConsultarRadicado
     */
    public int getCount4PIUConsultarRadicado(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUEnvioDoc
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Solicitud using displayset DSSolicitudPIUEnvioDoc that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUEnvioDoc> piuPIUEnvioDoc(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUEnvioDoc::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUEnvioDoc
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUEnvioDoc
     */
    public int getCount4PIUEnvioDoc(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUEstatusSolicitudesAdmin
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Solicitud using displayset DSSolicitudPIUStatusAdmin that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAdmin> piuPIUEstatusSolicitudesAdmin(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAdmin::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUEstatusSolicitudesAdmin
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUEstatusSolicitudesAdmin
     */
    public int getCount4PIUEstatusSolicitudesAdmin(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUEstatusSolicitudesAfil
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Solicitud using displayset DSSolicitudPIUStatusAfil that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAfil> piuPIUEstatusSolicitudesAfil(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAfil::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUEstatusSolicitudesAfil
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUEstatusSolicitudesAfil
     */
    public int getCount4PIUEstatusSolicitudesAfil(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUEstatusSolicitudesAreaMed
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Solicitud using displayset DSSolicitudPIUStatusAreaMe that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAreaMe> piuPIUEstatusSolicitudesAreaMed(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAreaMe::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUEstatusSolicitudesAreaMed
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUEstatusSolicitudesAreaMed
     */
    public int getCount4PIUEstatusSolicitudesAreaMed(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUEstatusSolicitudesAsesor
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Solicitud using displayset DSSolicitudPIUStatusAsesor that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAsesor> piuPIUEstatusSolicitudesAsesor(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAsesor::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUEstatusSolicitudesAsesor
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUEstatusSolicitudesAsesor
     */
    public int getCount4PIUEstatusSolicitudesAsesor(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUEstatusSolGestorMesa
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Solicitud using displayset DSSolicitudPIUStatusGestMesa that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusGestMesa> piuPIUEstatusSolGestorMesa(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusGestMesa::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUEstatusSolGestorMesa
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUEstatusSolGestorMesa
     */
    public int getCount4PIUEstatusSolGestorMesa(QueryRequest queryRequest) {
        return solveSolicitudTypedQuery(queryRequest).size();
    }

    // Service: InsContratanteSolicitud

    /*
     * Entry point for service InsContratanteSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insContratanteSolicitud(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsContratanteSolicitudRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.insContratanteSolicitudTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsContratanteSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insContratanteSolicitudTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsContratanteSolicitudRequest request) throws ModelException {
        request.setSolicitudInsContratanteSolicitudpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudInsContratanteSolicitudpthisSolicitud()));
        request.setSolicitudInsContratanteSolicitudpevcPersonaInstance(personaSrv.getByOIDWithHV(request.getSolicitudInsContratanteSolicitudpevcPersona()));
        return solicitudSrv.insContratanteSolicitudImplementation(request, true);
    }

    /*
     * Implements service InsContratanteSolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insContratanteSolicitudImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsContratanteSolicitudRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudInsContratanteSolicitudpthisSolicitud = request.getSolicitudInsContratanteSolicitudpthisSolicitudInstance();
        Persona solicitudInsContratanteSolicitudpevcPersona = request.getSolicitudInsContratanteSolicitudpevcPersonaInstance();

        request.checkArguments();
        Solicitud instance = solicitudInsContratanteSolicitudpthisSolicitud;

        instance.add2ContratantePersona(solicitudInsContratanteSolicitudpevcPersona);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsContratanteSolicitudRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.InsContratanteSolicitudRequest();
            relatedRequest.setPersonaInsContratanteSolicitudpthisPersonaInstance(solicitudInsContratanteSolicitudpevcPersona);
            relatedRequest.setPersonaInsContratanteSolicitudpevcSolicitudInstance(solicitudInsContratanteSolicitudpthisSolicitud);
            personaSrv.insContratanteSolicitudImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: InsTitularSolicitud

    /*
     * Entry point for service InsTitularSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insTitularSolicitud(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsTitularSolicitudRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.insTitularSolicitudTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsTitularSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insTitularSolicitudTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsTitularSolicitudRequest request) throws ModelException {
        request.setSolicitudInsTitularSolicitudpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudInsTitularSolicitudpthisSolicitud()));
        request.setSolicitudInsTitularSolicitudpevcPersonaInstance(personaSrv.getByOIDWithHV(request.getSolicitudInsTitularSolicitudpevcPersona()));
        return solicitudSrv.insTitularSolicitudImplementation(request, true);
    }

    /*
     * Implements service InsTitularSolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insTitularSolicitudImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsTitularSolicitudRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudInsTitularSolicitudpthisSolicitud = request.getSolicitudInsTitularSolicitudpthisSolicitudInstance();
        Persona solicitudInsTitularSolicitudpevcPersona = request.getSolicitudInsTitularSolicitudpevcPersonaInstance();

        request.checkArguments();
        Solicitud instance = solicitudInsTitularSolicitudpthisSolicitud;

        instance.add2TitularPersona(solicitudInsTitularSolicitudpevcPersona);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsTitularSolicitudRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.InsTitularSolicitudRequest();
            relatedRequest.setPersonaInsTitularSolicitudpthisPersonaInstance(solicitudInsTitularSolicitudpevcPersona);
            relatedRequest.setPersonaInsTitularSolicitudpevcSolicitudInstance(solicitudInsTitularSolicitudpthisSolicitud);
            personaSrv.insTitularSolicitudImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: DelContratanteSolicitud

    /*
     * Entry point for service DelContratanteSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delContratanteSolicitud(
            com.keralty.aepersonas.viewmodel.solicitud.siu.DelContratanteSolicitudRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.delContratanteSolicitudTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelContratanteSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delContratanteSolicitudTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.DelContratanteSolicitudRequest request) throws ModelException {
        request.setSolicitudDelContratanteSolicitudpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudDelContratanteSolicitudpthisSolicitud()));
        request.setSolicitudDelContratanteSolicitudpevcPersonaInstance(personaSrv.getByOIDWithHV(request.getSolicitudDelContratanteSolicitudpevcPersona()));
        return solicitudSrv.delContratanteSolicitudImplementation(request, true);
    }

    /*
     * Implements service DelContratanteSolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delContratanteSolicitudImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.DelContratanteSolicitudRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudDelContratanteSolicitudpthisSolicitud = request.getSolicitudDelContratanteSolicitudpthisSolicitudInstance();
        Persona solicitudDelContratanteSolicitudpevcPersona = request.getSolicitudDelContratanteSolicitudpevcPersonaInstance();

        request.checkArguments();
        Solicitud instance = solicitudDelContratanteSolicitudpthisSolicitud;

        instance.add2ContratantePersona(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelContratanteSolicitudRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.DelContratanteSolicitudRequest();
            relatedRequest.setPersonaDelContratanteSolicitudpthisPersonaInstance(solicitudDelContratanteSolicitudpevcPersona);
            relatedRequest.setPersonaDelContratanteSolicitudpevcSolicitudInstance(solicitudDelContratanteSolicitudpthisSolicitud);
            personaSrv.delContratanteSolicitudImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: DelTitularSolicitud

    /*
     * Entry point for service DelTitularSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delTitularSolicitud(
            com.keralty.aepersonas.viewmodel.solicitud.siu.DelTitularSolicitudRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.delTitularSolicitudTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelTitularSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delTitularSolicitudTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.DelTitularSolicitudRequest request) throws ModelException {
        request.setSolicitudDelTitularSolicitudpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudDelTitularSolicitudpthisSolicitud()));
        request.setSolicitudDelTitularSolicitudpevcPersonaInstance(personaSrv.getByOIDWithHV(request.getSolicitudDelTitularSolicitudpevcPersona()));
        return solicitudSrv.delTitularSolicitudImplementation(request, true);
    }

    /*
     * Implements service DelTitularSolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delTitularSolicitudImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.DelTitularSolicitudRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudDelTitularSolicitudpthisSolicitud = request.getSolicitudDelTitularSolicitudpthisSolicitudInstance();
        Persona solicitudDelTitularSolicitudpevcPersona = request.getSolicitudDelTitularSolicitudpevcPersonaInstance();

        request.checkArguments();
        Solicitud instance = solicitudDelTitularSolicitudpthisSolicitud;

        instance.add2TitularPersona(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelTitularSolicitudRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.DelTitularSolicitudRequest();
            relatedRequest.setPersonaDelTitularSolicitudpthisPersonaInstance(solicitudDelTitularSolicitudpevcPersona);
            relatedRequest.setPersonaDelTitularSolicitudpevcSolicitudInstance(solicitudDelTitularSolicitudpthisSolicitud);
            personaSrv.delTitularSolicitudImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: dummyDevolverIntString

    /*
     * Entry point for service dummyDevolverIntString
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringResponse dummyDevolverIntString(
            com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringRequest request) {
        com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringResponse response = new com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringResponse();
        try {
            response = solicitudSrv.dummyDevolverIntStringTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service dummyDevolverIntString
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringResponse dummyDevolverIntStringTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringRequest request) throws ModelException {
        request.setSolicituddummyDevolverIntStringpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicituddummyDevolverIntStringpthisSolicitud()));
        return solicitudSrv.dummyDevolverIntStringImplementation(request);
    }

    /*
     * Implements service dummyDevolverIntString
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringResponse dummyDevolverIntStringImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringRequest request) throws ModelException {
        com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringResponse response = new com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringResponse();
        response.setSolicituddummyDevolverIntStringpsBool(Boolean.FALSE);
        Solicitud solicituddummyDevolverIntStringpthisSolicitud = request.getSolicituddummyDevolverIntStringpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicituddummyDevolverIntStringpthisSolicitud;


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        // Value expressions for outgoing argument 'solicituddummyDevolverIntStringpsBool'
        // DEFAULT  : FALSE
        response.setSolicituddummyDevolverIntStringpsBool(Boolean.FALSE);


        // Value expressions for outgoing argument 'solicituddummyDevolverIntStringpsEstadoSolicitud'
        // DEFAULT  : 1
        response.setSolicituddummyDevolverIntStringpsEstadoSolicitud(Long.valueOf(1));


        return response;
    }

    // Service: InsUsrAreaMedica

    /*
     * Entry point for service InsUsrAreaMedica
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insUsrAreaMedica(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAreaMedicaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.insUsrAreaMedicaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsUsrAreaMedica
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insUsrAreaMedicaTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAreaMedicaRequest request) throws ModelException {
        request.setSolicitudInsUsrAreaMedicapthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudInsUsrAreaMedicapthisSolicitud()));
        request.setSolicitudInsUsrAreaMedicapevcAreaMedicaInstance(areaMedicaSrv.getByOIDWithHV(request.getSolicitudInsUsrAreaMedicapevcAreaMedica()));
        return solicitudSrv.insUsrAreaMedicaImplementation(request, true);
    }

    /*
     * Implements service InsUsrAreaMedica
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insUsrAreaMedicaImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAreaMedicaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudInsUsrAreaMedicapthisSolicitud = request.getSolicitudInsUsrAreaMedicapthisSolicitudInstance();
        AreaMedica solicitudInsUsrAreaMedicapevcAreaMedica = request.getSolicitudInsUsrAreaMedicapevcAreaMedicaInstance();

        request.checkArguments();
        Solicitud instance = solicitudInsUsrAreaMedicapthisSolicitud;

        instance.add2UsrAreaMedica(solicitudInsUsrAreaMedicapevcAreaMedica);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.areamedica.siu.InsUsrAreaMedicaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.areamedica.siu.InsUsrAreaMedicaRequest();
            relatedRequest.setAreaMedicaInsUsrAreaMedicapthisAreaMedicaInstance(solicitudInsUsrAreaMedicapevcAreaMedica);
            relatedRequest.setAreaMedicaInsUsrAreaMedicapevcSolicitudInstance(solicitudInsUsrAreaMedicapthisSolicitud);
            areaMedicaSrv.insUsrAreaMedicaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: checkDatosPagoNoOk

    /*
     * Entry point for service checkDatosPagoNoOk
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse checkDatosPagoNoOk(
            com.keralty.aepersonas.viewmodel.solicitud.siu.CheckDatosPagoNoOkRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.checkDatosPagoNoOkTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service checkDatosPagoNoOk
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse checkDatosPagoNoOkTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.CheckDatosPagoNoOkRequest request) throws ModelException {
        request.setSolicitudcheckDatosPagoNoOkpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudcheckDatosPagoNoOkpthisSolicitud()));
        return solicitudSrv.checkDatosPagoNoOkImplementation(request);
    }

    /*
     * Implements service checkDatosPagoNoOk
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse checkDatosPagoNoOkImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.CheckDatosPagoNoOkRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudcheckDatosPagoNoOkpthisSolicitud = request.getSolicitudcheckDatosPagoNoOkpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudcheckDatosPagoNoOkpthisSolicitud;
        if (!(solicitudcheckDatosPagoNoOkpthisSolicitud.getSolicitudTramite()).equals(Long.valueOf(2)) || !(solicitudcheckDatosPagoNoOkpthisSolicitud.getSolicitudtipoContrato()).equals(Long.valueOf(3))) {
            instance.setSolicituddatosPagoOK(Boolean.FALSE);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: InsUsrAfiliacion

    /*
     * Entry point for service InsUsrAfiliacion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insUsrAfiliacion(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAfiliacionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.insUsrAfiliacionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsUsrAfiliacion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insUsrAfiliacionTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAfiliacionRequest request) throws ModelException {
        request.setSolicitudInsUsrAfiliacionpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudInsUsrAfiliacionpthisSolicitud()));
        request.setSolicitudInsUsrAfiliacionpevcFuncionarioInstance(funcionarioSrv.getByOIDWithHV(request.getSolicitudInsUsrAfiliacionpevcFuncionario()));
        return solicitudSrv.insUsrAfiliacionImplementation(request, true);
    }

    /*
     * Implements service InsUsrAfiliacion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insUsrAfiliacionImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAfiliacionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudInsUsrAfiliacionpthisSolicitud = request.getSolicitudInsUsrAfiliacionpthisSolicitudInstance();
        Funcionario solicitudInsUsrAfiliacionpevcFuncionario = request.getSolicitudInsUsrAfiliacionpevcFuncionarioInstance();

        request.checkArguments();
        Solicitud instance = solicitudInsUsrAfiliacionpthisSolicitud;

        instance.add2UsrAfiliacion(solicitudInsUsrAfiliacionpevcFuncionario);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.funcionario.siu.InsUsrAfiliacionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.funcionario.siu.InsUsrAfiliacionRequest();
            relatedRequest.setFuncionarioInsUsrAfiliacionpthisFuncionarioInstance(solicitudInsUsrAfiliacionpevcFuncionario);
            relatedRequest.setFuncionarioInsUsrAfiliacionpevcSolicitudInstance(solicitudInsUsrAfiliacionpthisSolicitud);
            funcionarioSrv.insUsrAfiliacionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: asignarFechaTerminada

    /*
     * Entry point for service asignarFechaTerminada
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse asignarFechaTerminada(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFechaTerminadaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.asignarFechaTerminadaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service asignarFechaTerminada
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse asignarFechaTerminadaTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFechaTerminadaRequest request) throws ModelException {
        request.setSolicitudasignarFechaTerminadapthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudasignarFechaTerminadapthisSolicitud()));
        return solicitudSrv.asignarFechaTerminadaImplementation(request);
    }

    /*
     * Implements service asignarFechaTerminada
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse asignarFechaTerminadaImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFechaTerminadaRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudasignarFechaTerminadapthisSolicitud = request.getSolicitudasignarFechaTerminadapthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudasignarFechaTerminadapthisSolicitud;
        instance.setSolicitudFechaTerminada(STDFunctions.systemDateFun());
        instance.setSolicitudSemaforoGrabAse(userFunctionsSrv.fuCallSPgetsemaforograbadorFun(solicitudasignarFechaTerminadapthisSolicitud.getAesolicitudes().getAesolicitudesidsolicitud()));
        instance.setSolicitudSemaforoAreaMed(userFunctionsSrv.fuCallSPgetsemaforoareamedFun(solicitudasignarFechaTerminadapthisSolicitud.getAesolicitudes().getAesolicitudesidsolicitud()));


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: cambiarEstadoDoc

    /*
     * Entry point for service cambiarEstadoDoc
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambiarEstadoDoc(
            com.keralty.aepersonas.viewmodel.solicitud.siu.CambiarEstadoDocRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.cambiarEstadoDocTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service cambiarEstadoDoc
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambiarEstadoDocTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.CambiarEstadoDocRequest request) throws ModelException {
        request.setSolicitudcambiarEstadoDocpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudcambiarEstadoDocpthisSolicitud()));
        return solicitudSrv.cambiarEstadoDocImplementation(request);
    }

    /*
     * Implements service cambiarEstadoDoc
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambiarEstadoDocImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.CambiarEstadoDocRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudcambiarEstadoDocpthisSolicitud = request.getSolicitudcambiarEstadoDocpthisSolicitudInstance();
        Long solicitudcambiarEstadoDocpeEstado = request.getSolicitudcambiarEstadoDocpeEstado();

        request.checkArguments();
        Solicitud instance = solicitudcambiarEstadoDocpthisSolicitud;
        instance.setSolicitudEstadoDoc(solicitudcambiarEstadoDocpeEstado);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: asignarPrioridad

    /*
     * Entry point for service asignarPrioridad
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse asignarPrioridad(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarPrioridadRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.asignarPrioridadTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service asignarPrioridad
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse asignarPrioridadTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarPrioridadRequest request) throws ModelException {
        request.setSolicitudasignarPrioridadpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudasignarPrioridadpthisSolicitud()));
        return solicitudSrv.asignarPrioridadImplementation(request);
    }

    /*
     * Implements service asignarPrioridad
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse asignarPrioridadImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarPrioridadRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudasignarPrioridadpthisSolicitud = request.getSolicitudasignarPrioridadpthisSolicitudInstance();
        Long solicitudasignarPrioridadpePrioridad = request.getSolicitudasignarPrioridadpePrioridad();

        request.checkArguments();
        Solicitud instance = solicitudasignarPrioridadpthisSolicitud;
        if (solicitudasignarPrioridadpePrioridad > Long.valueOf(0)) {
            instance.setSolicitudPrioridad(solicitudasignarPrioridadpePrioridad);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: asignarFA

    /*
     * Entry point for service asignarFA
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse asignarFA(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFARequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.asignarFATxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service asignarFA
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse asignarFATxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFARequest request) throws ModelException {
        request.setSolicitudasignarFApthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudasignarFApthisSolicitud()));
        return solicitudSrv.asignarFAImplementation(request);
    }

    /*
     * Implements service asignarFA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse asignarFAImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFARequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudasignarFApthisSolicitud = request.getSolicitudasignarFApthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudasignarFApthisSolicitud;
        instance.setSolicitudFechaFA(STDFunctions.systemDateTimeFun());


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: asignarFUG

    /*
     * Entry point for service asignarFUG
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse asignarFUG(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFUGRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.asignarFUGTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service asignarFUG
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse asignarFUGTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFUGRequest request) throws ModelException {
        request.setSolicitudasignarFUGpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudasignarFUGpthisSolicitud()));
        return solicitudSrv.asignarFUGImplementation(request);
    }

    /*
     * Implements service asignarFUG
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse asignarFUGImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFUGRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudasignarFUGpthisSolicitud = request.getSolicitudasignarFUGpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudasignarFUGpthisSolicitud;
        instance.setSolicitudFechaFUG(STDFunctions.systemDateTimeFun());


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: TCREAROMODCONTRATANTE

    /*
     * Entry point for service TCREAROMODCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREAROMODCONTRATANTE(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODCONTRATANTERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.tCREAROMODCONTRATANTETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREAROMODCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREAROMODCONTRATANTETxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODCONTRATANTERequest request) throws ModelException, SystemException {
        request.setSolicitudTCREAROMODCONTRATANTEpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTCREAROMODCONTRATANTEpthisSolicitud()));
        request.setSolicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance(personaSrv.getByOIDWithHV(request.getSolicitudTCREAROMODCONTRATANTEptPersonaContratante()));
        return solicitudSrv.tCREAROMODCONTRATANTEImplementation(request);
    }

    /*
     * Implements service TCREAROMODCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREAROMODCONTRATANTEImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODCONTRATANTERequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Persona solicitudTCREAROMODCONTRATANTEptPersonaContratante = request.getSolicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance();
        String solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo = request.getSolicitudTCREAROMODCONTRATANTEptDCTelefonoFijo();
        String solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular = request.getSolicitudTCREAROMODCONTRATANTEptDCTelefonoCelular();
        Boolean solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE = request.getSolicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE();
        Solicitud solicitudTCREAROMODCONTRATANTEpthisSolicitud = request.getSolicitudTCREAROMODCONTRATANTEpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudTCREAROMODCONTRATANTEpthisSolicitud;

        /* Action 1: IF (EXIST (Contratante) = false) */
        boolean ifCondition1 = repository.assocOperator160(solicitudTCREAROMODCONTRATANTEpthisSolicitud).equals(false);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.contratante.siu.TNEWRequest step10Request = new com.keralty.aepersonas.viewmodel.contratante.siu.TNEWRequest();
            step10Request.setContratanteTNEWptpagrSolicitudInstance(solicitudTCREAROMODCONTRATANTEpthisSolicitud);
            step10Request.setContratanteTNEWptpagrTipoIdentificacionInstance(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getTipoIdentificacion());
            step10Request.setContratanteTNEWptpagrDepartamentoNacInstance(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getDepartamentoNacimiento());
            step10Request.setContratanteTNEWptpagrMunicipioNacInstance(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getMunicipioNacimiento());
            step10Request.setContratanteTNEWptpatrCodigo(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaCodigo());
            step10Request.setContratanteTNEWptpatrNumIdentificacion(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaNumIdentificacion());
            step10Request.setContratanteTNEWptpatrTipoPersona(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaTipoPersona());
            step10Request.setContratanteTNEWptpatrPrimerNombre(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaPrimerNombre());
            step10Request.setContratanteTNEWptpatrSegundoNombre(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaSegundoNombre());
            step10Request.setContratanteTNEWptpatrPrimerApellido(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaPrimerApellido());
            step10Request.setContratanteTNEWptpatrSegundoApellido(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaSegundoApellido());
            step10Request.setContratanteTNEWptpatrRazonSocial(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaRazonSocial());
            step10Request.setContratanteTNEWptpatrFechaNacimiento(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaFechaNacimiento());
            step10Request.setContratanteTNEWptpatrGenero(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaGenero());
            step10Request.setContratanteTNEWptpatrIndicadorExtranjero(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaIndicadorExtranjero());
            step10Request.setContratanteTNEWptpatrTelefonoFijo(solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo);
            step10Request.setContratanteTNEWptpatrTelefonoCelular(solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular);
            step10Request.setContratanteTNEWptpatrCorreoElectronico(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaCorreoElectronico());
            step10Request.setContratanteTNEWptpatrTitularConBeneficios(Boolean.TRUE);
            step10Request.setContratanteTNEWptpatrDiplomatico(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getTipoIdentificacion().getTipoIdentificacionDiplomatico());
            step10Request.setContratanteTNEWptpatrTelefonoFijoRes(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaTelefonoFijo());
            step10Request.setContratanteTNEWptpatrTelefonoCelularRes(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaTelefonoCelular());
            step10Request.setContratanteTNEWptTitularConBeneficiosCORE(solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE);
            contratanteSrv.tNEWImplementation(step10Request);
        } else {
            com.keralty.aepersonas.viewmodel.contratante.siu.TMODIFICARRequest step11Request = new com.keralty.aepersonas.viewmodel.contratante.siu.TMODIFICARRequest();
            step11Request.setContratanteTMODIFICARpthisContratanteInstance(solicitudTCREAROMODCONTRATANTEpthisSolicitud.getContratante());
            step11Request.setContratanteTMODIFICARptpNumIdentificacion(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaNumIdentificacion());
            step11Request.setContratanteTMODIFICARptpCodigo(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaCodigo());
            step11Request.setContratanteTMODIFICARptpPrimerNombre(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaPrimerNombre());
            step11Request.setContratanteTMODIFICARptpPrimerApellido(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaPrimerApellido());
            step11Request.setContratanteTMODIFICARptpSegundoApellido(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaSegundoApellido());
            step11Request.setContratanteTMODIFICARptpRazonSocial(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaRazonSocial());
            step11Request.setContratanteTMODIFICARptpFechaNacimiento(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaFechaNacimiento());
            step11Request.setContratanteTMODIFICARptpGenero(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaGenero());
            step11Request.setContratanteTMODIFICARptpIndicadorExtranjero(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaIndicadorExtranjero());
            step11Request.setContratanteTMODIFICARptpTelefonoCelular(solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular);
            step11Request.setContratanteTMODIFICARptpCorreoElectronico(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaCorreoElectronico());
            step11Request.setContratanteTMODIFICARptpevcTipoIdentificacionInstance(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getTipoIdentificacion());
            step11Request.setContratanteTMODIFICARptpDiplomatico(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getTipoIdentificacion().getTipoIdentificacionDiplomatico());
            step11Request.setContratanteTMODIFICARptpSegundoNombre(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaSegundoNombre());
            step11Request.setContratanteTMODIFICARptpTelefonoFijo(solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo);
            step11Request.setContratanteTMODIFICARptDepartamentoNacInstance(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getDepartamentoNacimiento());
            step11Request.setContratanteTMODIFICARptMunicipioNacInstance(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getMunicipioNacimiento());
            step11Request.setContratanteTMODIFICARptTelefonoFijoRes(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaTelefonoFijo());
            step11Request.setContratanteTMODIFICARptTelefonoCelularRes(solicitudTCREAROMODCONTRATANTEptPersonaContratante.getPersonaTelefonoCelular());
            contratanteSrv.tMODIFICARImplementation(step11Request);
        }

        /* Action 2: IF (ContratantePersona.TipoIdentificacion.NIT = false) */
        boolean ifCondition2 = solicitudTCREAROMODCONTRATANTEpthisSolicitud.getContratantePersona().getTipoIdentificacion().getTipoIdentificacionNIT().equals(false);
        if (ifCondition2) {
            for(Direccion step220Entity : repository.assocOperator158(solicitudTCREAROMODCONTRATANTEptPersonaContratante)) {
                com.keralty.aepersonas.viewmodel.contratante.siu.TSETDIRECCIONRESRequest step20Request = new com.keralty.aepersonas.viewmodel.contratante.siu.TSETDIRECCIONRESRequest();
                step20Request.setContratanteTSETDIRECCIONRESpthisContratanteInstance(solicitudTCREAROMODCONTRATANTEpthisSolicitud.getContratante());
                step20Request.setContratanteTSETDIRECCIONRESptDireccionRes(step220Entity.getDireccionDireccionCompleta());
                step20Request.setContratanteTSETDIRECCIONRESptDepartamentoResInstance(step220Entity.getDepartamento());
                step20Request.setContratanteTSETDIRECCIONRESptMunicipioResInstance(step220Entity.getMunicipio());
                step20Request.setContratanteTSETDIRECCIONRESptRuralDirRes(step220Entity.getDireccionRural());
                contratanteSrv.tSETDIRECCIONRESImplementation(step20Request);
            }
        } else {
            for(Direccion step221Entity : repository.assocOperator159(solicitudTCREAROMODCONTRATANTEptPersonaContratante)) {
                com.keralty.aepersonas.viewmodel.contratante.siu.TSETDIRECCIONRESRequest step21Request = new com.keralty.aepersonas.viewmodel.contratante.siu.TSETDIRECCIONRESRequest();
                step21Request.setContratanteTSETDIRECCIONRESpthisContratanteInstance(solicitudTCREAROMODCONTRATANTEpthisSolicitud.getContratante());
                step21Request.setContratanteTSETDIRECCIONRESptDireccionRes(step221Entity.getDireccionDireccionCompleta());
                step21Request.setContratanteTSETDIRECCIONRESptDepartamentoResInstance(step221Entity.getDepartamento());
                step21Request.setContratanteTSETDIRECCIONRESptMunicipioResInstance(step221Entity.getMunicipio());
                step21Request.setContratanteTSETDIRECCIONRESptRuralDirRes(step221Entity.getDireccionRural());
                contratanteSrv.tSETDIRECCIONRESImplementation(step21Request);
            }
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: TCREAROMODTITULAR

    /*
     * Entry point for service TCREAROMODTITULAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREAROMODTITULAR(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODTITULARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.tCREAROMODTITULARTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREAROMODTITULAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREAROMODTITULARTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODTITULARRequest request) throws ModelException, SystemException {
        request.setSolicitudTCREAROMODTITULARpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTCREAROMODTITULARpthisSolicitud()));
        request.setSolicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getSolicitudTCREAROMODTITULARptpagrTipoIdentificacion()));
        request.setSolicitudTCREAROMODTITULARptpagrDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(request.getSolicitudTCREAROMODTITULARptpagrDepartamentoNac()));
        request.setSolicitudTCREAROMODTITULARptpagrMunicipioNacInstance(municipioSrv.getByOIDWithHV(request.getSolicitudTCREAROMODTITULARptpagrMunicipioNac()));
        return solicitudSrv.tCREAROMODTITULARImplementation(request);
    }

    /*
     * Implements service TCREAROMODTITULAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREAROMODTITULARImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODTITULARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Departamento solicitudTCREAROMODTITULARptpagrDepartamentoNac = request.getSolicitudTCREAROMODTITULARptpagrDepartamentoNacInstance();
        Municipio solicitudTCREAROMODTITULARptpagrMunicipioNac = request.getSolicitudTCREAROMODTITULARptpagrMunicipioNacInstance();
        TipoIdentificacion solicitudTCREAROMODTITULARptpagrTipoIdentificacion = request.getSolicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance();
        Long solicitudTCREAROMODTITULARptpatrCodigo = request.getSolicitudTCREAROMODTITULARptpatrCodigo();
        String solicitudTCREAROMODTITULARptpatrNumIdentificacion = request.getSolicitudTCREAROMODTITULARptpatrNumIdentificacion();
        String solicitudTCREAROMODTITULARptpatrTipoPersona = request.getSolicitudTCREAROMODTITULARptpatrTipoPersona();
        String solicitudTCREAROMODTITULARptpatrPrimerNombre = request.getSolicitudTCREAROMODTITULARptpatrPrimerNombre();
        String solicitudTCREAROMODTITULARptpatrSegundoNombre = request.getSolicitudTCREAROMODTITULARptpatrSegundoNombre();
        String solicitudTCREAROMODTITULARptpatrPrimerApellido = request.getSolicitudTCREAROMODTITULARptpatrPrimerApellido();
        String solicitudTCREAROMODTITULARptpatrSegundoApellido = request.getSolicitudTCREAROMODTITULARptpatrSegundoApellido();
        Date solicitudTCREAROMODTITULARptpatrFechaNacimiento = request.getSolicitudTCREAROMODTITULARptpatrFechaNacimiento();
        String solicitudTCREAROMODTITULARptpatrGenero = request.getSolicitudTCREAROMODTITULARptpatrGenero();
        Boolean solicitudTCREAROMODTITULARptpatrIndicadorExtranjero = request.getSolicitudTCREAROMODTITULARptpatrIndicadorExtranjero();
        String solicitudTCREAROMODTITULARptpatrTelefonoFijo = request.getSolicitudTCREAROMODTITULARptpatrTelefonoFijo();
        String solicitudTCREAROMODTITULARptpatrTelefonoCelular = request.getSolicitudTCREAROMODTITULARptpatrTelefonoCelular();
        String solicitudTCREAROMODTITULARptpatrCorreoElectronico = request.getSolicitudTCREAROMODTITULARptpatrCorreoElectronico();
        Boolean solicitudTCREAROMODTITULARptpatrTitularConBeneficios = request.getSolicitudTCREAROMODTITULARptpatrTitularConBeneficios();
        Boolean solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc = request.getSolicitudTCREAROMODTITULARptpatrTitularRecuperadoInc();
        String solicitudTCREAROMODTITULARptDCTelefonoFijo = request.getSolicitudTCREAROMODTITULARptDCTelefonoFijo();
        String solicitudTCREAROMODTITULARptDCTelefonoCelular = request.getSolicitudTCREAROMODTITULARptDCTelefonoCelular();
        Boolean solicitudTCREAROMODTITULARptTitConBeneficiosCORE = request.getSolicitudTCREAROMODTITULARptTitConBeneficiosCORE();
        String solicitudTCREAROMODTITULARptRazonSocial = request.getSolicitudTCREAROMODTITULARptRazonSocial();
        Solicitud solicitudTCREAROMODTITULARpthisSolicitud = request.getSolicitudTCREAROMODTITULARpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudTCREAROMODTITULARpthisSolicitud;

        /* Action 1: IF (EXIST (Titular) = false) */
        boolean ifCondition1 = repository.assocOperator171(solicitudTCREAROMODTITULARpthisSolicitud).equals(false);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.titular.siu.TCREARRequest step10Request = new com.keralty.aepersonas.viewmodel.titular.siu.TCREARRequest();
            step10Request.setTitularTCREARptpagrSolicitudInstance(solicitudTCREAROMODTITULARpthisSolicitud);
            step10Request.setTitularTCREARptpagrDepartamentoNacInstance(solicitudTCREAROMODTITULARptpagrDepartamentoNac);
            step10Request.setTitularTCREARptpagrMunicipioNacInstance(solicitudTCREAROMODTITULARptpagrMunicipioNac);
            step10Request.setTitularTCREARptpagrDireccionInstance(null);
            step10Request.setTitularTCREARptpagrTipoIdentificacionInstance(solicitudTCREAROMODTITULARptpagrTipoIdentificacion);
            step10Request.setTitularTCREARptpatrCodigo(solicitudTCREAROMODTITULARptpatrCodigo);
            step10Request.setTitularTCREARptpatrNumIdentificacion(solicitudTCREAROMODTITULARptpatrNumIdentificacion);
            step10Request.setTitularTCREARptpatrTipoPersona(solicitudTCREAROMODTITULARptpatrTipoPersona);
            step10Request.setTitularTCREARptpatrPrimerNombre(solicitudTCREAROMODTITULARptpatrPrimerNombre);
            step10Request.setTitularTCREARptpatrSegundoNombre(solicitudTCREAROMODTITULARptpatrSegundoNombre);
            step10Request.setTitularTCREARptpatrPrimerApellido(solicitudTCREAROMODTITULARptpatrPrimerApellido);
            step10Request.setTitularTCREARptpatrSegundoApellido(solicitudTCREAROMODTITULARptpatrSegundoApellido);
            step10Request.setTitularTCREARptpatrFechaNacimiento(solicitudTCREAROMODTITULARptpatrFechaNacimiento);
            step10Request.setTitularTCREARptpatrGenero(solicitudTCREAROMODTITULARptpatrGenero);
            step10Request.setTitularTCREARptpatrIndicadorExtranjero(solicitudTCREAROMODTITULARptpatrIndicadorExtranjero);
            step10Request.setTitularTCREARptpatrTelefonoFijo(solicitudTCREAROMODTITULARptpatrTelefonoFijo);
            step10Request.setTitularTCREARptpatrTelefonoCelular(solicitudTCREAROMODTITULARptpatrTelefonoCelular);
            step10Request.setTitularTCREARptpatrCorreoElectronico(solicitudTCREAROMODTITULARptpatrCorreoElectronico);
            step10Request.setTitularTCREARptpatrTitularConBeneficios(solicitudTCREAROMODTITULARptpatrTitularConBeneficios);
            step10Request.setTitularTCREARptpatrTitularRecuperadoInc(solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc);
            step10Request.setTitularTCREARptpatrTelefonoFijoDC(solicitudTCREAROMODTITULARptDCTelefonoFijo);
            step10Request.setTitularTCREARptpatrTelefonoCelularDC(solicitudTCREAROMODTITULARptDCTelefonoCelular);
            step10Request.setTitularTCREARptpatrTitularConBeneficiosCO(solicitudTCREAROMODTITULARptTitConBeneficiosCORE);
            step10Request.setTitularTCREARptpatrRazonSocial(solicitudTCREAROMODTITULARptRazonSocial);
            titularSrv.tCREARImplementation(step10Request);
        } else {
            com.keralty.aepersonas.viewmodel.titular.siu.TMODIFICARRequest step11Request = new com.keralty.aepersonas.viewmodel.titular.siu.TMODIFICARRequest();
            step11Request.setTitularTMODIFICARpthisTitularInstance(solicitudTCREAROMODTITULARpthisSolicitud.getTitular());
            step11Request.setTitularTMODIFICARptpCodigo(solicitudTCREAROMODTITULARptpatrCodigo);
            step11Request.setTitularTMODIFICARptpNumIdentificacion(solicitudTCREAROMODTITULARptpatrNumIdentificacion);
            step11Request.setTitularTMODIFICARptpPrimerNombre(solicitudTCREAROMODTITULARptpatrPrimerNombre);
            step11Request.setTitularTMODIFICARptpSegundoNombre(solicitudTCREAROMODTITULARptpatrSegundoNombre);
            step11Request.setTitularTMODIFICARptpPrimerApellido(solicitudTCREAROMODTITULARptpatrPrimerApellido);
            step11Request.setTitularTMODIFICARptpSegundoApellido(solicitudTCREAROMODTITULARptpatrSegundoApellido);
            step11Request.setTitularTMODIFICARptpFechaNacimiento(solicitudTCREAROMODTITULARptpatrFechaNacimiento);
            step11Request.setTitularTMODIFICARptpGenero(solicitudTCREAROMODTITULARptpatrGenero);
            step11Request.setTitularTMODIFICARptpIndicadorExtranjero(solicitudTCREAROMODTITULARptpatrIndicadorExtranjero);
            step11Request.setTitularTMODIFICARptpTelefonoFijo(solicitudTCREAROMODTITULARptpatrTelefonoFijo);
            step11Request.setTitularTMODIFICARptpTelefonoCelular(solicitudTCREAROMODTITULARptpatrTelefonoCelular);
            step11Request.setTitularTMODIFICARptpCorreoElectronico(solicitudTCREAROMODTITULARptpatrCorreoElectronico);
            step11Request.setTitularTMODIFICARptpevcTipoIdentificacionInstance(solicitudTCREAROMODTITULARptpagrTipoIdentificacion);
            step11Request.setTitularTMODIFICARptpevcDepartamentoInstance(solicitudTCREAROMODTITULARptpagrDepartamentoNac);
            step11Request.setTitularTMODIFICARptpevcMunicipioInstance(solicitudTCREAROMODTITULARptpagrMunicipioNac);
            step11Request.setTitularTMODIFICARptpTitularConBeneficios(solicitudTCREAROMODTITULARptpatrTitularConBeneficios);
            step11Request.setTitularTMODIFICARptpTelefonoFijoDC(solicitudTCREAROMODTITULARptDCTelefonoFijo);
            step11Request.setTitularTMODIFICARptpTelefonoCelularDC(solicitudTCREAROMODTITULARptDCTelefonoCelular);
            step11Request.setTitularTMODIFICARptpRazonSocial(solicitudTCREAROMODTITULARptRazonSocial);
            titularSrv.tMODIFICARImplementation(step11Request);
        }

        for(Direccion step2Entity : repository.assocOperator170(solicitudTCREAROMODTITULARpthisSolicitud)) {
            com.keralty.aepersonas.viewmodel.titular.siu.TCREAROMODDIRECCIONRequest step2Request = new com.keralty.aepersonas.viewmodel.titular.siu.TCREAROMODDIRECCIONRequest();
            step2Request.setTitularTCREAROMODDIRECCIONpthisTitularInstance(solicitudTCREAROMODTITULARpthisSolicitud.getTitular());
            step2Request.setTitularTCREAROMODDIRECCIONptpagrTipoDireccionInstance(step2Entity.getTipoDireccion());
            step2Request.setTitularTCREAROMODDIRECCIONptpagrPaisInstance(step2Entity.getPais());
            step2Request.setTitularTCREAROMODDIRECCIONptpagrDepartamentoInstance(step2Entity.getDepartamento());
            step2Request.setTitularTCREAROMODDIRECCIONptpagrMunicipioInstance(step2Entity.getMunicipio());
            step2Request.setTitularTCREAROMODDIRECCIONptpatrDireccionCompleta(step2Entity.getDireccionDireccionCompleta());
            step2Request.setTitularTCREAROMODDIRECCIONptpatrRural(step2Entity.getDireccionRural());
            titularSrv.tCREAROMODDIRECCIONImplementation(step2Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: TASGUSRAFILI

    /*
     * Entry point for service TASGUSRAFILI
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tASGUSRAFILI(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRAFILIRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.tASGUSRAFILITxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TASGUSRAFILI
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tASGUSRAFILITxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRAFILIRequest request) throws ModelException {
        request.setSolicitudTASGUSRAFILIpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTASGUSRAFILIpthisSolicitud()));
        request.setSolicitudTASGUSRAFILIptAfiliacionInstance(funcionarioSrv.getByOIDWithHV(request.getSolicitudTASGUSRAFILIptAfiliacion()));
        return solicitudSrv.tASGUSRAFILIImplementation(request);
    }

    /*
     * Implements service TASGUSRAFILI
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tASGUSRAFILIImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRAFILIRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Funcionario solicitudTASGUSRAFILIptAfiliacion = request.getSolicitudTASGUSRAFILIptAfiliacionInstance();
        Solicitud solicitudTASGUSRAFILIpthisSolicitud = request.getSolicitudTASGUSRAFILIpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudTASGUSRAFILIpthisSolicitud;

        com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAfiliacionRequest step1Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAfiliacionRequest();
        step1Request.setSolicitudInsUsrAfiliacionpthisSolicitudInstance(solicitudTASGUSRAFILIpthisSolicitud);
        step1Request.setSolicitudInsUsrAfiliacionpevcFuncionarioInstance(solicitudTASGUSRAFILIptAfiliacion);
        solicitudSrv.insUsrAfiliacionImplementation(step1Request, true);

        /* Action 2: IF (FechaTerminada = NULL) */
        boolean ifCondition2 = solicitudTASGUSRAFILIpthisSolicitud.getSolicitudFechaTerminada() == null;
        if (ifCondition2) {
            com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudAsignadaRequest step20Request = new com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudAsignadaRequest();
            step20Request.setFuncionariosolicitudAsignadapthisFuncionarioInstance(solicitudTASGUSRAFILIpthisSolicitud.getUsrAfiliacion());
            funcionarioSrv.solicitudAsignadaImplementation(step20Request);
        }

        com.keralty.aepersonas.viewmodel.logasignaciones.siu.TCREARRequest step3Request = new com.keralty.aepersonas.viewmodel.logasignaciones.siu.TCREARRequest();
        step3Request.setLogAsignacionesTCREARptpagrSolicitudInstance(solicitudTASGUSRAFILIpthisSolicitud);
        step3Request.setLogAsignacionesTCREARptpatrTipo("Asignación Afiliaciones");
        step3Request.setLogAsignacionesTCREARptpatrUsuario(solicitudTASGUSRAFILIptAfiliacion.getFuncionarioUsuarioLDAP());
        logAsignacionesSrv.tCREARImplementation(step3Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: TASGUSRARME

    /*
     * Entry point for service TASGUSRARME
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tASGUSRARME(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRARMERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.tASGUSRARMETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TASGUSRARME
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tASGUSRARMETxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRARMERequest request) throws ModelException {
        request.setSolicitudTASGUSRARMEpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTASGUSRARMEpthisSolicitud()));
        request.setSolicitudTASGUSRARMEptAreaMedicaInstance(areaMedicaSrv.getByOIDWithHV(request.getSolicitudTASGUSRARMEptAreaMedica()));
        return solicitudSrv.tASGUSRARMEImplementation(request);
    }

    /*
     * Implements service TASGUSRARME
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tASGUSRARMEImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRARMERequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AreaMedica solicitudTASGUSRARMEptAreaMedica = request.getSolicitudTASGUSRARMEptAreaMedicaInstance();
        Solicitud solicitudTASGUSRARMEpthisSolicitud = request.getSolicitudTASGUSRARMEpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudTASGUSRARMEpthisSolicitud;

        com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAreaMedicaRequest step1Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAreaMedicaRequest();
        step1Request.setSolicitudInsUsrAreaMedicapthisSolicitudInstance(solicitudTASGUSRARMEpthisSolicitud);
        step1Request.setSolicitudInsUsrAreaMedicapevcAreaMedicaInstance(solicitudTASGUSRARMEptAreaMedica);
        solicitudSrv.insUsrAreaMedicaImplementation(step1Request, true);

        /* Action 2: IF (FechaTerminada = NULL) */
        boolean ifCondition2 = solicitudTASGUSRARMEpthisSolicitud.getSolicitudFechaTerminada() == null;
        if (ifCondition2) {
            com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudAsignadaRequest step20Request = new com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudAsignadaRequest();
            step20Request.setFuncionariosolicitudAsignadapthisFuncionarioInstance(solicitudTASGUSRARMEpthisSolicitud.getUsrAreaMedica().getFuncionarioFacet());
            funcionarioSrv.solicitudAsignadaImplementation(step20Request);
        }

        com.keralty.aepersonas.viewmodel.logasignaciones.siu.TCREARRequest step3Request = new com.keralty.aepersonas.viewmodel.logasignaciones.siu.TCREARRequest();
        step3Request.setLogAsignacionesTCREARptpagrSolicitudInstance(solicitudTASGUSRARMEpthisSolicitud);
        step3Request.setLogAsignacionesTCREARptpatrTipo("Asignación Area Medica");
        step3Request.setLogAsignacionesTCREARptpatrUsuario(solicitudTASGUSRARMEptAreaMedica.getFuncionarioUsuarioLDAP());
        logAsignacionesSrv.tCREARImplementation(step3Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: TASGAUTOUSRAFILI

    /*
     * Entry point for service TASGAUTOUSRAFILI
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tASGAUTOUSRAFILI(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRAFILIRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.tASGAUTOUSRAFILITxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TASGAUTOUSRAFILI
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tASGAUTOUSRAFILITxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRAFILIRequest request) throws ModelException {
        request.setSolicitudTASGAUTOUSRAFILIpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTASGAUTOUSRAFILIpthisSolicitud()));
        request.setSolicitudTASGAUTOUSRAFILIptFuncionarioInstance(funcionarioSrv.getByOIDWithHV(request.getSolicitudTASGAUTOUSRAFILIptFuncionario()));
        return solicitudSrv.tASGAUTOUSRAFILIImplementation(request);
    }

    /*
     * Implements service TASGAUTOUSRAFILI
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tASGAUTOUSRAFILIImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRAFILIRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Funcionario solicitudTASGAUTOUSRAFILIptFuncionario = request.getSolicitudTASGAUTOUSRAFILIptFuncionarioInstance();
        Solicitud solicitudTASGAUTOUSRAFILIpthisSolicitud = request.getSolicitudTASGAUTOUSRAFILIpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudTASGAUTOUSRAFILIpthisSolicitud;

        /* Action 1: IF (ptFuncionario <> NULL) */
        boolean ifCondition1 = (solicitudTASGAUTOUSRAFILIptFuncionario != null && !solicitudTASGAUTOUSRAFILIptFuncionario.isNull());
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRAFILIRequest step10Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRAFILIRequest();
            step10Request.setSolicitudTASGUSRAFILIpthisSolicitudInstance(solicitudTASGAUTOUSRAFILIpthisSolicitud);
            step10Request.setSolicitudTASGUSRAFILIptAfiliacionInstance(solicitudTASGAUTOUSRAFILIptFuncionario);
            solicitudSrv.tASGUSRAFILIImplementation(step10Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: TASGAUTOUSRMEDICO

    /*
     * Entry point for service TASGAUTOUSRMEDICO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tASGAUTOUSRMEDICO(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRMEDICORequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.tASGAUTOUSRMEDICOTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TASGAUTOUSRMEDICO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tASGAUTOUSRMEDICOTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRMEDICORequest request) throws ModelException {
        request.setSolicitudTASGAUTOUSRMEDICOpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTASGAUTOUSRMEDICOpthisSolicitud()));
        request.setSolicitudTASGAUTOUSRMEDICOptAreaMedicaInstance(areaMedicaSrv.getByOIDWithHV(request.getSolicitudTASGAUTOUSRMEDICOptAreaMedica()));
        return solicitudSrv.tASGAUTOUSRMEDICOImplementation(request);
    }

    /*
     * Implements service TASGAUTOUSRMEDICO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tASGAUTOUSRMEDICOImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRMEDICORequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AreaMedica solicitudTASGAUTOUSRMEDICOptAreaMedica = request.getSolicitudTASGAUTOUSRMEDICOptAreaMedicaInstance();
        Solicitud solicitudTASGAUTOUSRMEDICOpthisSolicitud = request.getSolicitudTASGAUTOUSRMEDICOpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudTASGAUTOUSRMEDICOpthisSolicitud;

        /* Action 1: IF (ptAreaMedica <> NULL) */
        boolean ifCondition1 = (solicitudTASGAUTOUSRMEDICOptAreaMedica != null && !solicitudTASGAUTOUSRMEDICOptAreaMedica.isNull());
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRARMERequest step10Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TASGUSRARMERequest();
            step10Request.setSolicitudTASGUSRARMEpthisSolicitudInstance(solicitudTASGAUTOUSRMEDICOpthisSolicitud);
            step10Request.setSolicitudTASGUSRARMEptAreaMedicaInstance(solicitudTASGAUTOUSRMEDICOptAreaMedica);
            solicitudSrv.tASGUSRARMEImplementation(step10Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: TCAMBIARESTADODOC

    /*
     * Entry point for service TCAMBIARESTADODOC
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCAMBIARESTADODOC(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.tCAMBIARESTADODOCTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCAMBIARESTADODOC
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCAMBIARESTADODOCTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest request) throws ModelException, SystemException {
        request.setSolicitudTCAMBIARESTADODOCpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTCAMBIARESTADODOCpthisSolicitud()));
        return solicitudSrv.tCAMBIARESTADODOCImplementation(request);
    }

    /*
     * Implements service TCAMBIARESTADODOC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCAMBIARESTADODOCImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Long solicitudTCAMBIARESTADODOCptEstadoDoc = request.getSolicitudTCAMBIARESTADODOCptEstadoDoc();
        Solicitud solicitudTCAMBIARESTADODOCpthisSolicitud = request.getSolicitudTCAMBIARESTADODOCpthisSolicitudInstance();

        request.checkArguments();

        tCAMBIARESTADODOCPreconditions(request);
        Solicitud instance = solicitudTCAMBIARESTADODOCpthisSolicitud;

        /* Action 1: IF (ptEstadoDoc = 1) */
        boolean ifCondition1 = (solicitudTCAMBIARESTADODOCptEstadoDoc).equals(Long.valueOf(1));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFARequest step10Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFARequest();
            step10Request.setSolicitudasignarFApthisSolicitudInstance(solicitudTCAMBIARESTADODOCpthisSolicitud);
            solicitudSrv.asignarFAImplementation(step10Request);
        }

        /* Action 2: IF (EstadoDoc <> ptEstadoDoc) */
        boolean ifCondition2 = !(solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstadoDoc()).equals(solicitudTCAMBIARESTADODOCptEstadoDoc);
        if (ifCondition2) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFUGRequest step20Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFUGRequest();
            step20Request.setSolicitudasignarFUGpthisSolicitudInstance(solicitudTCAMBIARESTADODOCpthisSolicitud);
            solicitudSrv.asignarFUGImplementation(step20Request);
            com.keralty.aepersonas.viewmodel.solicitud.siu.CambiarEstadoDocRequest step21Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.CambiarEstadoDocRequest();
            step21Request.setSolicitudcambiarEstadoDocpthisSolicitudInstance(solicitudTCAMBIARESTADODOCpthisSolicitud);
            step21Request.setSolicitudcambiarEstadoDocpeEstado(solicitudTCAMBIARESTADODOCptEstadoDoc);
            solicitudSrv.cambiarEstadoDocImplementation(step21Request);
            com.keralty.aepersonas.viewmodel.logestado.siu.TCREARRequest step22Request = new com.keralty.aepersonas.viewmodel.logestado.siu.TCREARRequest();
            step22Request.setLogEstadoTCREARptpagrSolicitudInstance(solicitudTCAMBIARESTADODOCpthisSolicitud);
            step22Request.setLogEstadoTCREARptpatrObservacion("");
            step22Request.setLogEstadoTCREARptpatrMotDevolucion("");
            step22Request.setLogEstadoTCREARptpatrEstado(solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstado());
            step22Request.setLogEstadoTCREARptpatrEstadoDoc(solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstadoDoc());
            logEstadoSrv.tCREARImplementation(step22Request);
            /* Action 23: IF (ptEstadoDoc = 2) */
            boolean ifCondition23 = (solicitudTCAMBIARESTADODOCptEstadoDoc).equals(Long.valueOf(2));
            if (ifCondition23) {
                com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringRequest step230Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.DummyDevolverIntStringRequest();
                step230Request.setSolicituddummyDevolverIntStringpthisSolicitudInstance(solicitudTCAMBIARESTADODOCpthisSolicitud);
                solicitudSrv.dummyDevolverIntStringImplementation(step230Request);
                
                
            }
            /* Action 24: IF (EXIST (UsrAfiliacion) = false AND (Estado = 0 OR Estado = 1 OR Estado = 2 OR Estado = 3 OR Estado = 5)) */
            boolean ifCondition24 = repository.assocOperator260(solicitudTCAMBIARESTADODOCpthisSolicitud).equals(false) && ((solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(0)) || (solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(1)) || (solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(2)) || (solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(3)) || (solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(5)));
            if (ifCondition24) {
                com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRAFILIRequest step240Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRAFILIRequest();
                step240Request.setSolicitudTASGAUTOUSRAFILIpthisSolicitudInstance(solicitudTCAMBIARESTADODOCpthisSolicitud);
                step240Request.setSolicitudTASGAUTOUSRAFILIptFuncionarioInstance(userFunctionsSrv.fugetFuncionarioPorIdFun(userFunctionsSrv.fuCallSPgetusugrabadorFun(solicitudTCAMBIARESTADODOCpthisSolicitud.getAesolicitudes().getAesolicitudesidsolicitud())));
                solicitudSrv.tASGAUTOUSRAFILIImplementation(step240Request);
            }
            /* Action 25: IF (EXIST (UsrAreaMedica) = false AND Estado = 5) */
            boolean ifCondition25 = repository.assocOperator261(solicitudTCAMBIARESTADODOCpthisSolicitud).equals(false) && (solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(5));
            if (ifCondition25) {
                com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRMEDICORequest step250Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TASGAUTOUSRMEDICORequest();
                step250Request.setSolicitudTASGAUTOUSRMEDICOpthisSolicitudInstance(solicitudTCAMBIARESTADODOCpthisSolicitud);
                step250Request.setSolicitudTASGAUTOUSRMEDICOptAreaMedicaInstance(userFunctionsSrv.fugetAreaMedicaPorIdFun(userFunctionsSrv.fuCallSPgetusuareamedFun(solicitudTCAMBIARESTADODOCpthisSolicitud.getAesolicitudes().getAesolicitudesidsolicitud())));
                solicitudSrv.tASGAUTOUSRMEDICOImplementation(step250Request);
            }
            com.keralty.aepersonas.viewmodel.solicitud.siu.TMARCARTERMINADARequest step26Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TMARCARTERMINADARequest();
            step26Request.setSolicitudTMARCARTERMINADApthisSolicitudInstance(solicitudTCAMBIARESTADODOCpthisSolicitud);
            solicitudSrv.tMARCARTERMINADAImplementation(step26Request);
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarPrioridadRequest step27Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarPrioridadRequest();
            step27Request.setSolicitudasignarPrioridadpthisSolicitudInstance(solicitudTCAMBIARESTADODOCpthisSolicitud);
            step27Request.setSolicitudasignarPrioridadpePrioridad(userFunctionsSrv.fugetPrioridadFun(solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstado(), solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstadoDoc()));
            solicitudSrv.asignarPrioridadImplementation(step27Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    /*
     * Checks service TCAMBIARESTADODOC preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    public ServiceResponse tCAMBIARESTADODOCCheckPreconditions(com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest request) {
        ServiceResponse response = new ServiceResponse();
        request.setSolicitudTCAMBIARESTADODOCpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTCAMBIARESTADODOCpthisSolicitud()));
        try {
            if("Clas_1431957012480960Pre_139".equals(request.getPreconditionId()))
                checkClas1431957012480960Pre139(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void tCAMBIARESTADODOCPreconditions(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest request) 
            throws ModelException {
        checkClas1431957012480960Pre139(request);
    }

    private void checkClas1431957012480960Pre139 (
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest request) 
            throws ModelException {
        // Estado <> 8

        Solicitud solicitudTCAMBIARESTADODOCpthisSolicitud = request.getSolicitudTCAMBIARESTADODOCpthisSolicitudInstance();
        boolean preconditionHolds = !(solicitudTCAMBIARESTADODOCpthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(8));
        if (!preconditionHolds) throw new PreconditionException("La solicitud ya ha sido enviada a BH");
    }

    // Service: TMARCARTERMINADA

    /*
     * Entry point for service TMARCARTERMINADA
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tMARCARTERMINADA(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TMARCARTERMINADARequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.tMARCARTERMINADATxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TMARCARTERMINADA
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tMARCARTERMINADATxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TMARCARTERMINADARequest request) throws ModelException, SystemException {
        request.setSolicitudTMARCARTERMINADApthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTMARCARTERMINADApthisSolicitud()));
        return solicitudSrv.tMARCARTERMINADAImplementation(request);
    }

    /*
     * Implements service TMARCARTERMINADA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tMARCARTERMINADAImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TMARCARTERMINADARequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudTMARCARTERMINADApthisSolicitud = request.getSolicitudTMARCARTERMINADApthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudTMARCARTERMINADApthisSolicitud;

        /* Action 1: IF (FechaTerminada = NULL AND Estado = 4 OR (EstadoDoc = 2 AND (Estado = 2 OR Estado = 3))) */
        boolean ifCondition1 = solicitudTMARCARTERMINADApthisSolicitud.getSolicitudFechaTerminada() == null && (solicitudTMARCARTERMINADApthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(4)) || ((solicitudTMARCARTERMINADApthisSolicitud.getSolicitudEstadoDoc()).equals(Long.valueOf(2)) && ((solicitudTMARCARTERMINADApthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(2)) || (solicitudTMARCARTERMINADApthisSolicitud.getSolicitudEstado()).equals(Long.valueOf(3))));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFechaTerminadaRequest step10Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.AsignarFechaTerminadaRequest();
            step10Request.setSolicitudasignarFechaTerminadapthisSolicitudInstance(solicitudTMARCARTERMINADApthisSolicitud);
            solicitudSrv.asignarFechaTerminadaImplementation(step10Request);
            /* Action 11: IF (EXIST (UsrAfiliacion) = true) */
            boolean ifCondition11 = repository.assocOperator264(solicitudTMARCARTERMINADApthisSolicitud).equals(true);
            if (ifCondition11) {
                com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudTerminadaRequest step110Request = new com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudTerminadaRequest();
                step110Request.setFuncionariosolicitudTerminadapthisFuncionarioInstance(solicitudTMARCARTERMINADApthisSolicitud.getUsrAfiliacion());
                funcionarioSrv.solicitudTerminadaImplementation(step110Request);
            }
            /* Action 12: IF (EXIST (UsrAreaMedica) = true) */
            boolean ifCondition12 = repository.assocOperator265(solicitudTMARCARTERMINADApthisSolicitud).equals(true);
            if (ifCondition12) {
                com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudTerminadaRequest step120Request = new com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudTerminadaRequest();
                step120Request.setFuncionariosolicitudTerminadapthisFuncionarioInstance(solicitudTMARCARTERMINADApthisSolicitud.getUsrAreaMedica().getFuncionarioFacet());
                funcionarioSrv.solicitudTerminadaImplementation(step120Request);
            }
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }

    // Service: TCALCESTADODOCU

    /*
     * Entry point for service TCALCESTADODOCU
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCALCESTADODOCU(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCALCESTADODOCURequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = solicitudSrv.tCALCESTADODOCUTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCALCESTADODOCU
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCALCESTADODOCUTxn(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCALCESTADODOCURequest request) throws ModelException, SystemException {
        request.setSolicitudTCALCESTADODOCUpthisSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getSolicitudTCALCESTADODOCUpthisSolicitud()));
        return solicitudSrv.tCALCESTADODOCUImplementation(request);
    }

    /*
     * Implements service TCALCESTADODOCU
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCALCESTADODOCUImplementation(
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCALCESTADODOCURequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Solicitud solicitudTCALCESTADODOCUpthisSolicitud = request.getSolicitudTCALCESTADODOCUpthisSolicitudInstance();

        request.checkArguments();
        Solicitud instance = solicitudTCALCESTADODOCUpthisSolicitud;

        /* Action 1: IF (COUNT (DocumentosGestor) = 0) */
        boolean ifCondition1 = (repository.assocOperator273(solicitudTCALCESTADODOCUpthisSolicitud)).equals(Long.valueOf(0));
        if (ifCondition1) {
            /* Action 10: IF (Tramite = 2 AND fuContratoExentoDocSol(NumContratoInclusion) = true) */
            boolean ifCondition10 = (solicitudTCALCESTADODOCUpthisSolicitud.getSolicitudTramite()).equals(Long.valueOf(2)) && userFunctionsSrv.fuContratoExentoDocSolFun(solicitudTCALCESTADODOCUpthisSolicitud.getSolicitudNumContratoInclusion()).equals(true);
            if (ifCondition10) {
                com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest step100Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest();
                step100Request.setSolicitudTCAMBIARESTADODOCpthisSolicitudInstance(solicitudTCALCESTADODOCUpthisSolicitud);
                step100Request.setSolicitudTCAMBIARESTADODOCptEstadoDoc(Long.valueOf(2));
                solicitudSrv.tCAMBIARESTADODOCImplementation(step100Request);
            } else {
                com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest step101Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest();
                step101Request.setSolicitudTCAMBIARESTADODOCpthisSolicitudInstance(solicitudTCALCESTADODOCUpthisSolicitud);
                step101Request.setSolicitudTCAMBIARESTADODOCptEstadoDoc(Long.valueOf(1));
                solicitudSrv.tCAMBIARESTADODOCImplementation(step101Request);
            }
        } else {
            /* Action 11: IF (COUNT (DocumentosGestor) WHERE (DocumentosGestor.Estado = 1) > 0) */
            boolean ifCondition11 = repository.assocOperator274(solicitudTCALCESTADODOCUpthisSolicitud) > Long.valueOf(0);
            if (ifCondition11) {
                com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest step110Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest();
                step110Request.setSolicitudTCAMBIARESTADODOCpthisSolicitudInstance(solicitudTCALCESTADODOCUpthisSolicitud);
                step110Request.setSolicitudTCAMBIARESTADODOCptEstadoDoc(Long.valueOf(1));
                solicitudSrv.tCAMBIARESTADODOCImplementation(step110Request);
            } else {
                /* Action 111: IF (COUNT (DocumentosGestor) WHERE (DocumentosGestor.Estado = 3) > 0) */
                boolean ifCondition111 = repository.assocOperator275(solicitudTCALCESTADODOCUpthisSolicitud) > Long.valueOf(0);
                if (ifCondition111) {
                    com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest step1110Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest();
                    step1110Request.setSolicitudTCAMBIARESTADODOCpthisSolicitudInstance(solicitudTCALCESTADODOCUpthisSolicitud);
                    step1110Request.setSolicitudTCAMBIARESTADODOCptEstadoDoc(Long.valueOf(3));
                    solicitudSrv.tCAMBIARESTADODOCImplementation(step1110Request);
                } else {
                    com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest step1111Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest();
                    step1111Request.setSolicitudTCAMBIARESTADODOCpthisSolicitudInstance(solicitudTCALCESTADODOCUpthisSolicitud);
                    step1111Request.setSolicitudTCAMBIARESTADODOCptEstadoDoc(Long.valueOf(2));
                    solicitudSrv.tCAMBIARESTADODOCImplementation(step1111Request);
                }
            }
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICSolicitud());

        return response;
    }


    @Override
    protected void applyHVFilter(SQLSelect sql) throws SystemException {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        SQLWhereDisjunction disjunction = new SQLWhereDisjunction();
        if (getAgentRoles().contains(AsesorConstants.CLASS_NAME)) applyHVFilter4Asesor(sql, disjunction);
        if (getAgentRoles().contains(AreaMedicaConstants.CLASS_NAME)) applyHVFilter4AreaMedica(sql, disjunction);
        if (getAgentRoles().contains(AfiliacionesConstants.CLASS_NAME)) applyHVFilter4Afiliaciones(sql, disjunction);
        conjunction.addDisjunction(disjunction);
        sql.addConjunction(conjunction);
    }

    private void applyHVFilter4Asesor(SQLSelect sql, SQLWhereDisjunction disjunction) throws SystemException{
        // Agente = agent OR Agente.CodJefe = Agent.Usuario OR EXIST (UsrAfiliacion) WHERE (UsrAfiliacion = agent) = true
        Asesor agentInstance = getAgentAsesor();
    {
        // 'or' Logical operator
        SQLWhereDisjunction comparison1 = new SQLWhereDisjunction();
    
        // Operand 1
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison2 = new SQLWhereDisjunction();
        
            // Operand 1
                // '=' Comparison
                SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                comparison3.setOperator("=");
                
                // Operand 1
                SQLWhereOperandPathInstance operand114 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AGENTE, FuncionarioConstants.CLASS_NAME);
                comparison3.setFirstOperand(operand114);
                
                // Operand 2
                SQLWhereOperandOVParameter operand225 = new SQLWhereOperandOVParameter(Constants.AGENTKEYWORD, AsesorConstants.CLASS_NAME, AsesorConstants.CLASS_NAME, agentInstance.getOid(), Constants.AGENTKEYWORD);
                comparison3.setSecondOperand(operand225);
                comparison2.addOperand(comparison3);
        
            // Operand 2
                // '=' Comparison
                SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
                comparison5.setOperator("=");
                
                // Operand 1
                SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOCODJEFE, Constants.Type.STRING.getTypeName());
                comparison5.setFirstOperand(operand116);
                
                // Operand 2
                comparison5.setSecondOperand(new SQLWhereOperandLiteral(agentInstance.getFuncionarioUsuario(), Constants.Type.STRING.getTypeName()));
                comparison2.addOperand(comparison5);
            
            comparison1.addOperand(comparison2);
        }
    
        // Operand 2
        // 'exist' Association operator
        SQLWhereOperandSubQuery operandSubQueryAssocOperator000 = new SQLWhereOperandSubQuery(repository.assocOperator000Range1Query(sql));
        comparison1.addOperand(operandSubQueryAssocOperator000);
        
        disjunction.addOperand(comparison1);
    }

    }

    private void applyHVFilter4AreaMedica(SQLSelect sql, SQLWhereDisjunction disjunction) {
        // UsrAreaMedica = agent
        AreaMedica agentInstance = getAgentAreaMedica();
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USRAREAMEDICA, AreaMedicaConstants.CLASS_NAME);
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(Constants.AGENTKEYWORD, AreaMedicaConstants.CLASS_NAME, AreaMedicaConstants.CLASS_NAME, agentInstance.getOid(), Constants.AGENTKEYWORD);
        comparison1.setSecondOperand(operand223);
        disjunction.addOperand(comparison1);

    }

    private void applyHVFilter4Afiliaciones(SQLSelect sql, SQLWhereDisjunction disjunction) throws SystemException{
        // UsrAfiliacion = agent AND COUNT (Aesolicitudes.PlanT.Afiliaciones) WHERE (Aesolicitudes.PlanT.Afiliaciones = agent) > 0
        Afiliaciones agentInstance = getAgentAfiliaciones();
    {
        // 'and' Logical operator
        SQLWhereConjunction comparison1 = new SQLWhereConjunction();
    
        // Operand 1
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USRAFILIACION, FuncionarioConstants.CLASS_NAME);
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(Constants.AGENTKEYWORD, AfiliacionesConstants.CLASS_NAME, AfiliacionesConstants.CLASS_NAME, agentInstance.getOid(), Constants.AGENTKEYWORD);
            comparison2.setSecondOperand(operand224);
            comparison1.addOperand(comparison2);
    
        // Operand 2
            // '>' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator(">");
            
            // Operand 1
                // 'count' Association operator
                SQLWhereOperandSubQuery operandSubQueryAssocOperator001 = new SQLWhereOperandSubQuery(repository.assocOperator001Range1Query(sql));
            comparison4.setFirstOperand(operandSubQueryAssocOperator001);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(0), Constants.Type.NAT.getTypeName()));
            comparison1.addOperand(comparison4);
        
        disjunction.addOperand(comparison1);
    }

    }


    private void suppInfo4ICSolicitud(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD, Constants.Type.STRING.getTypeName()));
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
        applyOCOCSolicitudPrioridadFechas(queryRequest, select);
        applyOCOCSolicitudFechaFAPrioridad(queryRequest, select);
        applyOCOCSolicitudFechaCreacion(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, false), true);
    }


    private void applyOCOCSolicitudPrioridadFechas(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_Solicitud_PrioridadFechas".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(SolicitudConstants.CLASS_NAME, SolicitudConstants.ATTR_NAME_SOLICITUDPRIORIDAD, false), true);
            select.getOrderByPart().addItem(Constants.normalizePath(SolicitudConstants.CLASS_NAME, SolicitudConstants.ATTR_NAME_SOLICITUDFECHACOMPLETADA, false), true);
            select.getOrderByPart().addItem(Constants.normalizePath(SolicitudConstants.CLASS_NAME, SolicitudConstants.ATTR_NAME_SOLICITUDFECHAULTIMODOC, false), true);
        }
    }


    private void applyOCOCSolicitudFechaFAPrioridad(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_Solicitud_FechaFA_Prioridad".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(SolicitudConstants.CLASS_NAME, SolicitudConstants.ATTR_NAME_SOLICITUDFECHAFA, false), true);
            select.getOrderByPart().addItem(Constants.normalizePath(SolicitudConstants.CLASS_NAME, SolicitudConstants.ATTR_NAME_SOLICITUDPRIORIDAD, false), true);
        }
    }


    private void applyOCOCSolicitudFechaCreacion(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_SolicitudFechaCreacion".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFESOLICI, false), false);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildSolicitudRelatedInstance(relatedInstanceJsonOid);
        }
        if (SolicitudConstants.ROLE_NAME_DIRECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_CONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_SEGUNDAFIRMA.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_FIRMACONTRATANTEINCL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4UsuarioReg(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_TITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_DOCUMENTOSGESTOR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4DocumentoG(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_LOGESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4LogEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_LOGASIGNACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4LogAsignaciones(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_AESOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Aesolicitudes(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_CONTRATANTEPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_TITULARPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_GRUPOASOCIADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4GrupoAsociado(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_AGENTE.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_USRAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_USRAREAMEDICA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4AreaMedica(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildSolicitudRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4UsuarioReg(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class)): UsuarioReg.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4DocumentoG(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new DocumentoG(mapper.readValue(relatedInstanceJsonOid, DocumentoGOid.class)): DocumentoG.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4LogEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new LogEstado(mapper.readValue(relatedInstanceJsonOid, LogEstadoOid.class)): LogEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4LogAsignaciones(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new LogAsignaciones(mapper.readValue(relatedInstanceJsonOid, LogAsignacionesOid.class)): LogAsignaciones.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4Aesolicitudes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Aesolicitudes(mapper.readValue(relatedInstanceJsonOid, AesolicitudesOid.class)): Aesolicitudes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4GrupoAsociado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class)): GrupoAsociado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSolicitudRelatedInstance4AreaMedica(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new AreaMedica(mapper.readValue(relatedInstanceJsonOid, AreaMedicaOid.class)): AreaMedica.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            SolicitudOid oid = new SolicitudOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAesolicitudesidsolicitud(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(SolicitudService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
