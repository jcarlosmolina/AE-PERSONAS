package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.MinCardinalityException;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.PreconditionException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.CompanyiaOid;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.EpsOid;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.PreexistenciaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Preexistencia;
import com.keralty.aepersonas.persistence.PreexistenciaC;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.repository.UsuarioJpaRepository;
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
import com.keralty.aepersonas.viewmodel.PreloadViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class UsuarioService extends AbstractService {

    UsuarioJpaRepository repository;

    UsuarioService usuarioSrv;

    PersonaService personaSrv;

    EpsService epsSrv;

    CompanyiaService companyiaSrv;

    ParentescoService parentescoSrv;

    EstadoBeneficiarioService estadoBeneficiarioSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    SolicitudService solicitudSrv;

    AesolicitudesService aesolicitudesSrv;

    PlanesService planesSrv;

    ProductosService productosSrv;

    DominioService dominioSrv;

    DocumentoGService documentoGSrv;

    DepartamentoService departamentoSrv;

    MunicipioService municipioSrv;

    EstadoCivilService estadoCivilSrv;

    DireccionService direccionSrv;

    PaisService paisSrv;

    TipoDireccionService tipoDireccionSrv;

    ContratanteService contratanteSrv;

    CuestionarioPService cuestionarioPSrv;

    AnexoMatService anexoMatSrv;

    AnexoNeoService anexoNeoSrv;

    PreexistenciaService preexistenciaSrv;

    InstitucionMatNeoService institucionMatNeoSrv;

    PeriodicidadService periodicidadSrv;

    BeneficiarioCService beneficiarioCSrv;

    PersonaCService personaCSrv;

    PreexistenciaCService preexistenciaCSrv;

    CuestionarioMedService cuestionarioMedSrv;

    UserFunctions userFunctionsSrv;

    @Inject
    public UsuarioService(
            UsuarioService usuarioSrv,
            PersonaService personaSrv,
            EpsService epsSrv,
            CompanyiaService companyiaSrv,
            ParentescoService parentescoSrv,
            EstadoBeneficiarioService estadoBeneficiarioSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            SolicitudService solicitudSrv,
            AesolicitudesService aesolicitudesSrv,
            PlanesService planesSrv,
            ProductosService productosSrv,
            DominioService dominioSrv,
            DocumentoGService documentoGSrv,
            DepartamentoService departamentoSrv,
            MunicipioService municipioSrv,
            EstadoCivilService estadoCivilSrv,
            DireccionService direccionSrv,
            PaisService paisSrv,
            TipoDireccionService tipoDireccionSrv,
            ContratanteService contratanteSrv,
            CuestionarioPService cuestionarioPSrv,
            AnexoMatService anexoMatSrv,
            AnexoNeoService anexoNeoSrv,
            PreexistenciaService preexistenciaSrv,
            InstitucionMatNeoService institucionMatNeoSrv,
            PeriodicidadService periodicidadSrv,
            BeneficiarioCService beneficiarioCSrv,
            PersonaCService personaCSrv,
            PreexistenciaCService preexistenciaCSrv,
            CuestionarioMedService cuestionarioMedSrv,
            UserFunctions userFunctionsSrv,
            UsuarioJpaRepository repository) {
        this.usuarioSrv = usuarioSrv;
        this.personaSrv = personaSrv;
        this.epsSrv = epsSrv;
        this.companyiaSrv = companyiaSrv;
        this.parentescoSrv = parentescoSrv;
        this.estadoBeneficiarioSrv = estadoBeneficiarioSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.solicitudSrv = solicitudSrv;
        this.aesolicitudesSrv = aesolicitudesSrv;
        this.planesSrv = planesSrv;
        this.productosSrv = productosSrv;
        this.dominioSrv = dominioSrv;
        this.documentoGSrv = documentoGSrv;
        this.departamentoSrv = departamentoSrv;
        this.municipioSrv = municipioSrv;
        this.estadoCivilSrv = estadoCivilSrv;
        this.direccionSrv = direccionSrv;
        this.paisSrv = paisSrv;
        this.tipoDireccionSrv = tipoDireccionSrv;
        this.contratanteSrv = contratanteSrv;
        this.cuestionarioPSrv = cuestionarioPSrv;
        this.anexoMatSrv = anexoMatSrv;
        this.anexoNeoSrv = anexoNeoSrv;
        this.preexistenciaSrv = preexistenciaSrv;
        this.institucionMatNeoSrv = institucionMatNeoSrv;
        this.periodicidadSrv = periodicidadSrv;
        this.beneficiarioCSrv = beneficiarioCSrv;
        this.personaCSrv = personaCSrv;
        this.preexistenciaCSrv = preexistenciaCSrv;
        this.cuestionarioMedSrv = cuestionarioMedSrv;
        this.userFunctionsSrv = userFunctionsSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, UsuarioConstants.CLASS_NAME);
    }

    private List<Usuario> solveUsuarioTypedQuery(QueryRequest request) {
        boolean hasInMemoryFilters = hasInMemoryFilters(request);
        int requestedPageSize = request.getPageSize();
        int pageSize = requestedPageSize >= 0
                && requestedPageSize <= Constants.MAX_BLOCKSIZE
                ? requestedPageSize
                : Constants.DEFAULT_BLOCKSIZE;
        int pageNumber = Math.max(1, request.getPageNumber());

    	List<Usuario> results = repository.solveQuery(processQueryRequest(request, UsuarioConstants.CLASS_NAME), (hasInMemoryFilters ? 0 : pageSize), (hasInMemoryFilters ? 1 : pageNumber)).stream()
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
    
    private int solveUsuarioTypedCountQuery(QueryRequest request) {
        return hasInMemoryFilters(request)
               ? repository.solveQuery(processQueryRequest(request, UsuarioConstants.CLASS_NAME)).stream().filter(instance -> applyMemoryFilters(request, instance)).collect(Collectors.toList()).size()
               : repository.solveCountQuery(processCountQueryRequest(request, UsuarioConstants.CLASS_NAME));
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
        if (UsuarioConstants.FILTER_NAME_IFUSUARIOSINCUESMED.equalsIgnoreCase(filterRequest.getName())) {
            return true;
        }
        return false;
    }

    /*
     * Returns the population of class Usuario
     *
     * @return Population of class Usuario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Usuario> get() {
        List<Usuario> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Usuario
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Usuario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Usuario> instances = get(queryRequest);
        if(UsuarioConstants.DSICUSUARIO.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICUsuario())).collect(Collectors.toList());
        }
        if(UsuarioConstants.DSDSUSUARIOPIUUSUARIOSCONT.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSUsuarioPIUUsuariosCont())).collect(Collectors.toList());
        }
        if(UsuarioConstants.DSDSUSUARIOPIUDESTATUSSOL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSUsuarioPIUDeStatusSol())).collect(Collectors.toList());
        }
        if(UsuarioConstants.DSDSUSUARIOPOLIZAINTER.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSUsuarioPolizaInter())).collect(Collectors.toList());
        }
        if(UsuarioConstants.DSDSUSUARIONULL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSUsuarioNUll())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Usuario that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Usuario matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Usuario> get(QueryRequest queryRequest) {
        return solveUsuarioTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveUsuarioTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveUsuarioTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveUsuarioTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveUsuarioTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Usuario by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @param usuarioIdentificador Identification field usuarioIdentificador
     *
     * @return Instance of Usuario
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Usuario getById(Long aesolicitudesidsolicitud, Long usuarioIdentificador) {
        return getByOID(new UsuarioOid(aesolicitudesidsolicitud, usuarioIdentificador));
    }
    
    /*
     * Returns an instance of Usuario by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Usuario
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Usuario getByOID(UsuarioOid oid) {
        Optional<Usuario> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Usuario by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Usuario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Usuario getByOIDWithHV(UsuarioOid oid) {
        Optional<Usuario> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Usuario> getInstanceByOid(UsuarioOid oid) {
        return oid != null && oid.getAesolicitudesidsolicitud() != null
               ? repository.findById(oid)
               : Optional.empty();
    }

    /*
     * Returns an instance of Usuario by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Usuario
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Usuario getByJsonOid(String jsonOid) {
        UsuarioOid oid = new UsuarioOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Usuario related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Usuario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Usuario> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveUsuarioTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Usuario related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Usuario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Usuario> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Usuario
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Usuario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getUsuarioDynamic(UsuarioOid oid, String displaySetItems) {
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
    public String getSuppInfo(UsuarioOid oid, String dsName) {
        Usuario instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Usuario instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (UsuarioConstants.DSICUSUARIO.equals(dsName))
            return instance.buildICUsuario();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Usuario instance, String dsName) {
        if (UsuarioConstants.DSICUSUARIO.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICUsuario());
        if (UsuarioConstants.DSDSUSUARIOPIUUSUARIOSCONT.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSUsuarioPIUUsuariosCont());
        if (UsuarioConstants.DSDSUSUARIOPIUDESTATUSSOL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSUsuarioPIUDeStatusSol());
        if (UsuarioConstants.DSDSUSUARIOPOLIZAINTER.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSUsuarioPolizaInter());
        if (UsuarioConstants.DSDSUSUARIONULL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSUsuarioNUll());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (UsuarioConstants.FILTER_NAME_IFUSUARIOSINCUESMED.equalsIgnoreCase(filterRequest.getName()))
            iFUsuarioSinCuesMed(filterRequest, sql);
        if (UsuarioConstants.FILTER_NAME_FUSUARIOSPOLIZAINTER.equalsIgnoreCase(filterRequest.getName()))
            fUsuariosPolizaInter(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_Usuario".equals(filterRequest.getName()))
            suppInfo4ICUsuario(filterRequest.getFilterVariable("searchText").toString(), sql);
    }

    private boolean applyMemoryFilters(QueryRequest queryRequest, Usuario instance) {
        for (FilterRequest filterRequest : queryRequest.getFilters()) {
            if (!applyMemoryFilter(filterRequest, instance))
                return false;
        }
        return true;
    }
    
    private boolean applyMemoryFilter(FilterRequest filterRequest, Usuario instance) {
        return applyMemoryQueryFilter(filterRequest, instance);
    }

    private boolean applyMemoryQueryFilter(FilterRequest filterRequest, Usuario entity) {
        if (UsuarioConstants.FILTER_NAME_IFUSUARIOSINCUESMED.equalsIgnoreCase(filterRequest.getName()))
            return inMemoryIFUsuarioSinCuesMed(entity);
        return true;
    }


    private void iFUsuarioSinCuesMed(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Solicitud voSolicitud = filterRequest.hasFilterVariable(UsuarioConstants.VAR_NAME_IFUSUARIOSINCUESMED_VOSOLICITUD) ? solicitudSrv.getByOID(new SolicitudOid().fromJsonString(toJson(filterRequest.getFilterVariable(UsuarioConstants.VAR_NAME_IFUSUARIOSINCUESMED_VOSOLICITUD)))) : null;

        // Solicitud = voSolicitud
        if (voSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD, SolicitudConstants.CLASS_NAME);
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.VAR_NAME_IFUSUARIOSINCUESMED_VOSOLICITUD, SolicitudConstants.CLASS_NAME, SolicitudConstants.CLASS_NAME, voSolicitud.getOid(), UsuarioConstants.VAR_NAME_IFUSUARIOSINCUESMED_VOSOLICITUD);
            comparison1.setSecondOperand(operand223);
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void fUsuariosPolizaInter(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Date vfDesde = filterRequest.hasFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFDESDE) ? (Date) filterRequest.getFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFDESDE, FilterVariableRequest.DATE) : null;
        Date vfHasta = filterRequest.hasFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFHASTA) ? (Date) filterRequest.getFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFHASTA, FilterVariableRequest.DATE) : null;
        TipoIdentificacion vfTipoDoc = filterRequest.hasFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFTIPODOC)))) : null;
        String vfNumIdent = filterRequest.hasFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFNUMIDENT) ? (String) filterRequest.getFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFNUMIDENT, FilterVariableRequest.STRING) : null;

        // Solicitud.Estado <> 4
        // '<>' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("<>");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ATTR_NAME_SOLICITUDESTADO, Constants.Type.INT.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(4), Constants.Type.NAT.getTypeName()));
        conjunction.addOperand(comparison1);


        // PolizaInternacional = true
        // '=' Comparison
        SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
        comparison2.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ATTR_NAME_USUARIOPOLIZAINTERNACIONAL, Constants.Type.BOOL.getTypeName());
        comparison2.setFirstOperand(operand113);
        
        // Operand 2
        comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison2);


        // Solicitud.Aesolicitudes.Fechaasignacion >= vfDesde
        if (vfDesde != null) {
            // '>=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator(">=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vfDesde, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // Solicitud.Aesolicitudes.Fechaasignacion <= vfHasta
        if (vfHasta != null) {
            // '<=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("<=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESFECHAASIGNACION, Constants.Type.DATE.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(vfHasta, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        // TipoIdentificacion = vfTipoDoc
        if (vfTipoDoc != null) {
            // '=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand116 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            SQLWhereOperandOVParameter operand227 = new SQLWhereOperandOVParameter(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vfTipoDoc.getOid(), UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFTIPODOC);
            comparison5.setSecondOperand(operand227);
            conjunction.addOperand(comparison5);

        }        

        // NumIdentificacion LIKE "%" + vfNumIdent
        if (vfNumIdent != null) {
            // 'like' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral("%" + vfNumIdent, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        sql.addConjunction(conjunction);
    }

    private boolean inMemoryIFUsuarioSinCuesMed(Usuario entity) {
        boolean result = true;

        // drvCuesMedOK = false
        try {
            result = entity.getUsuariodrvCuesMedOK().equals(false);
        } catch(Exception e) {
           LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
        return result;
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUUsuariosDeContrato
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Usuario using displayset DSUsuarioPIUUsuariosCont that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioPIUUsuariosCont> piuPIUUsuariosDeContrato(QueryRequest queryRequest) {
        return solveUsuarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioPIUUsuariosCont::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUUsuariosDeContrato
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUUsuariosDeContrato
     */
    public int getCount4PIUUsuariosDeContrato(QueryRequest queryRequest) {
        return solveUsuarioTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUUsuarioDePIUStatusSol
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Usuario using displayset DSUsuarioPIUDeStatusSol that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioPIUDeStatusSol> piuPIUUsuarioDePIUStatusSol(QueryRequest queryRequest) {
        return solveUsuarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioPIUDeStatusSol::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUUsuarioDePIUStatusSol
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUUsuarioDePIUStatusSol
     */
    public int getCount4PIUUsuarioDePIUStatusSol(QueryRequest queryRequest) {
        return solveUsuarioTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUUsuariosPolInternacional
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Usuario using displayset DSUsuarioPolizaInter that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioPolizaInter> piuPIUUsuariosPolInternacional(QueryRequest queryRequest) {
        return solveUsuarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioPolizaInter::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUUsuariosPolInternacional
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUUsuariosPolInternacional
     */
    public int getCount4PIUUsuariosPolInternacional(QueryRequest queryRequest) {
        return solveUsuarioTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUUsuarioNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Usuario using displayset DSUsuarioNUll that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioNUll> piuPIUUsuarioNull(QueryRequest queryRequest) {
        return solveUsuarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioNUll::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUUsuarioNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUUsuarioNull
     */
    public int getCount4PIUUsuarioNull(QueryRequest queryRequest) {
        return solveUsuarioTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.usuario.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.usuario.siu.CrearRequest request) throws ModelException {
        request.setUsuariocrearpagrUsuarioPersonaInstance(personaSrv.getByOIDWithHV(request.getUsuariocrearpagrUsuarioPersona()));
        request.setUsuariocrearpagrEpsInstance(epsSrv.getByOIDWithHV(request.getUsuariocrearpagrEps()));
        request.setUsuariocrearpagrCompanyiaInstance(companyiaSrv.getByOIDWithHV(request.getUsuariocrearpagrCompanyia()));
        request.setUsuariocrearpagrParentescoInstance(parentescoSrv.getByOIDWithHV(request.getUsuariocrearpagrParentesco()));
        request.setUsuariocrearpagrEstadoBeneficiarioInstance(estadoBeneficiarioSrv.getByOIDWithHV(request.getUsuariocrearpagrEstadoBeneficiario()));
        request.setUsuariocrearpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getUsuariocrearpagrTipoIdentificacion()));
        request.setUsuariocrearpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getUsuariocrearpagrSolicitud()));
        return usuarioSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.usuario.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona usuariocrearpagrUsuarioPersona = request.getUsuariocrearpagrUsuarioPersonaInstance();
        Eps usuariocrearpagrEps = request.getUsuariocrearpagrEpsInstance();
        Companyia usuariocrearpagrCompanyia = request.getUsuariocrearpagrCompanyiaInstance();
        Parentesco usuariocrearpagrParentesco = request.getUsuariocrearpagrParentescoInstance();
        EstadoBeneficiario usuariocrearpagrEstadoBeneficiario = request.getUsuariocrearpagrEstadoBeneficiarioInstance();
        TipoIdentificacion usuariocrearpagrTipoIdentificacion = request.getUsuariocrearpagrTipoIdentificacionInstance();
        Solicitud usuariocrearpagrSolicitud = request.getUsuariocrearpagrSolicitudInstance();
        Boolean usuariocrearpatrBebeGestante = request.getUsuariocrearpatrBebeGestante();
        Long usuariocrearpatrNumUsuario = request.getUsuariocrearpatrNumUsuario();
        String usuariocrearpatrNumIdentificacion = request.getUsuariocrearpatrNumIdentificacion();
        Long usuariocrearpatrCodigoTipoUsuario = request.getUsuariocrearpatrCodigoTipoUsuario();
        String usuariocrearpatrPrimerNombre = request.getUsuariocrearpatrPrimerNombre();
        String usuariocrearpatrSegundoNombre = request.getUsuariocrearpatrSegundoNombre();
        String usuariocrearpatrPrimerApellido = request.getUsuariocrearpatrPrimerApellido();
        String usuariocrearpatrSegundoApellido = request.getUsuariocrearpatrSegundoApellido();
        String usuariocrearpatrcodigoBancoRep = request.getUsuariocrearpatrcodigoBancoRep();
        Boolean usuariocrearpatrUsuarioReplicado = request.getUsuariocrearpatrUsuarioReplicado();

        request.checkArguments();
        Usuario instance = new Usuario();
        usuariocrearpagrUsuarioPersona.add2Usuarios(instance);
        instance.add2UsuarioPersona(usuariocrearpagrUsuarioPersona);

        if (usuariocrearpagrEps != null && !usuariocrearpagrEps.isNull()) {
            instance.add2Eps(usuariocrearpagrEps);
        }

        if (usuariocrearpagrCompanyia != null && !usuariocrearpagrCompanyia.isNull()) {
            instance.add2Companyia(usuariocrearpagrCompanyia);
        }

        if (usuariocrearpagrParentesco != null && !usuariocrearpagrParentesco.isNull()) {
            instance.add2Parentesco(usuariocrearpagrParentesco);
        }

        if (usuariocrearpagrEstadoBeneficiario != null && !usuariocrearpagrEstadoBeneficiario.isNull()) {
            instance.add2EstadoBeneficiario(usuariocrearpagrEstadoBeneficiario);
        }

        instance.add2TipoIdentificacion(usuariocrearpagrTipoIdentificacion);

        instance.add2Solicitud(usuariocrearpagrSolicitud);

        instance.setUsuarioIdentificador(Long.valueOf(0));
        instance.setUsuarioattrUsuarioDiligenciados(Boolean.FALSE);
        instance.setUsuariotieneDocIdentificacion(Boolean.FALSE);
        instance.setUsuariotieneDocsSolicitud(Boolean.FALSE);
        instance.setUsuarioPolizaInternacional(Boolean.FALSE);
        instance.setUsuarioIMC(null);
        instance.setUsuarioIdentificador(repository.nextUsuarioIdentificador(instance.getAesolicitudesidsolicitud()));
        instance.setUsuarioBebeGestante(usuariocrearpatrBebeGestante);
        instance.setUsuarioNumUsuario(usuariocrearpatrNumUsuario);
        instance.setUsuarioNumIdentificacion(usuariocrearpatrNumIdentificacion);
        instance.setUsuarioCodigoTipoUsuario(usuariocrearpatrCodigoTipoUsuario);
        instance.setUsuarioPrimerNombre(usuariocrearpatrPrimerNombre);
        instance.setUsuarioSegundoNombre(usuariocrearpatrSegundoNombre);
        instance.setUsuarioPrimerApellido(usuariocrearpatrPrimerApellido);
        instance.setUsuarioSegundoApellido(usuariocrearpatrSegundoApellido);
        instance.setUsuariocodigoBancoRep(usuariocrearpatrcodigoBancoRep);
        instance.setUsuarioUsuarioReplicado(usuariocrearpatrUsuarioReplicado);

        instance.setOid(instance.getOid());

        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

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
            com.keralty.aepersonas.viewmodel.usuario.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.usuario.siu.EliminarRequest request) throws ModelException {
        request.setUsuarioeliminarpthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioeliminarpthisAttrUsuario()));
        return usuarioSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.usuario.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioeliminarpthisAttrUsuario = request.getUsuarioeliminarpthisAttrUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioeliminarpthisAttrUsuario;
        if(usuarioeliminarpthisAttrUsuario.getCuestionarioP() != null && !usuarioeliminarpthisAttrUsuario.getCuestionarioP().isNull()) {
            throw new MinCardinalityException(UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ROLE_ALIAS_CUESTIONARIOP);
        }
        if(usuarioeliminarpthisAttrUsuario.getAnexoMat() != null && !usuarioeliminarpthisAttrUsuario.getAnexoMat().isNull()) {
            throw new MinCardinalityException(UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ROLE_ALIAS_ANEXOMAT);
        }
        if(usuarioeliminarpthisAttrUsuario.getAnexoNeo() != null && !usuarioeliminarpthisAttrUsuario.getAnexoNeo().isNull()) {
            throw new MinCardinalityException(UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ROLE_ALIAS_ANEXONEO);
        }
        if(usuarioeliminarpthisAttrUsuario.getPreexistencias().size() > 0) {
            throw new MinCardinalityException(UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ROLE_ALIAS_PREEXISTENCIAS);
        }

        instance.getUsuarioPersona().add2Usuarios(null);

        repository.delete(instance);
        
        response.setInstance(instance);
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: modificarAttr

    /*
     * Entry point for service modificarAttr
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse modificarAttr(
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarAttrRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.modificarAttrTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service modificarAttr
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse modificarAttrTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarAttrRequest request) throws ModelException {
        request.setUsuariomodificarAttrpthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuariomodificarAttrpthisAttrUsuario()));
        return usuarioSrv.modificarAttrImplementation(request);
    }

    /*
     * Implements service modificarAttr
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse modificarAttrImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarAttrRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuariomodificarAttrpthisAttrUsuario = request.getUsuariomodificarAttrpthisAttrUsuarioInstance();
        Boolean usuariomodificarAttrpBebeGestante = request.getUsuariomodificarAttrpBebeGestante();
        String usuariomodificarAttrpcodigoBancoRep = request.getUsuariomodificarAttrpcodigoBancoRep();
        Date usuariomodificarAttrpFechaAntiguedad = request.getUsuariomodificarAttrpFechaAntiguedad();
        Boolean usuariomodificarAttrpePolizaInternacional = request.getUsuariomodificarAttrpePolizaInternacional();

        request.checkArguments();
        Usuario instance = usuariomodificarAttrpthisAttrUsuario;
        instance.setUsuarioBebeGestante(usuariomodificarAttrpBebeGestante);
        instance.setUsuariocodigoBancoRep(usuariomodificarAttrpcodigoBancoRep);
        instance.setUsuarioFechaAntiguedadBeneficiario(usuariomodificarAttrpFechaAntiguedad);
        instance.setUsuarioPolizaInternacional(usuariomodificarAttrpePolizaInternacional);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: InsEPSUsuario

    /*
     * Entry point for service InsEPSUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insEPSUsuario(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEPSUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.insEPSUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsEPSUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insEPSUsuarioTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEPSUsuarioRequest request) throws ModelException {
        request.setUsuarioInsEPSUsuariopthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioInsEPSUsuariopthisAttrUsuario()));
        request.setUsuarioInsEPSUsuariopevcEpsInstance(epsSrv.getByOIDWithHV(request.getUsuarioInsEPSUsuariopevcEps()));
        return usuarioSrv.insEPSUsuarioImplementation(request, true);
    }

    /*
     * Implements service InsEPSUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insEPSUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEPSUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioInsEPSUsuariopthisAttrUsuario = request.getUsuarioInsEPSUsuariopthisAttrUsuarioInstance();
        Eps usuarioInsEPSUsuariopevcEps = request.getUsuarioInsEPSUsuariopevcEpsInstance();

        request.checkArguments();
        Usuario instance = usuarioInsEPSUsuariopthisAttrUsuario;

        instance.add2Eps(usuarioInsEPSUsuariopevcEps);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.eps.siu.InsEPSUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.eps.siu.InsEPSUsuarioRequest();
            relatedRequest.setEpsInsEPSUsuariopthisEPSInstance(usuarioInsEPSUsuariopevcEps);
            relatedRequest.setEpsInsEPSUsuariopevcUsuarioInstance(usuarioInsEPSUsuariopthisAttrUsuario);
            epsSrv.insEPSUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: InsParentescoUsuario

    /*
     * Entry point for service InsParentescoUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insParentescoUsuario(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.insParentescoUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsParentescoUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insParentescoUsuarioTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest request) throws ModelException {
        request.setUsuarioInsParentescoUsuariopthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioInsParentescoUsuariopthisAttrUsuario()));
        request.setUsuarioInsParentescoUsuariopevcParentescoInstance(parentescoSrv.getByOIDWithHV(request.getUsuarioInsParentescoUsuariopevcParentesco()));
        return usuarioSrv.insParentescoUsuarioImplementation(request, true);
    }

    /*
     * Implements service InsParentescoUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insParentescoUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioInsParentescoUsuariopthisAttrUsuario = request.getUsuarioInsParentescoUsuariopthisAttrUsuarioInstance();
        Parentesco usuarioInsParentescoUsuariopevcParentesco = request.getUsuarioInsParentescoUsuariopevcParentescoInstance();

        request.checkArguments();
        Usuario instance = usuarioInsParentescoUsuariopthisAttrUsuario;

        instance.add2Parentesco(usuarioInsParentescoUsuariopevcParentesco);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.parentesco.siu.InsParentescoUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.parentesco.siu.InsParentescoUsuarioRequest();
            relatedRequest.setParentescoInsParentescoUsuariopthisParentescoInstance(usuarioInsParentescoUsuariopevcParentesco);
            relatedRequest.setParentescoInsParentescoUsuariopevcUsuarioInstance(usuarioInsParentescoUsuariopthisAttrUsuario);
            parentescoSrv.insParentescoUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: InsCompanyiaUsuario

    /*
     * Entry point for service InsCompanyiaUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insCompanyiaUsuario(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsCompanyiaUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.insCompanyiaUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsCompanyiaUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insCompanyiaUsuarioTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsCompanyiaUsuarioRequest request) throws ModelException {
        request.setUsuarioInsCompanyiaUsuariopthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioInsCompanyiaUsuariopthisAttrUsuario()));
        request.setUsuarioInsCompanyiaUsuariopevcCompanyiaInstance(companyiaSrv.getByOIDWithHV(request.getUsuarioInsCompanyiaUsuariopevcCompanyia()));
        return usuarioSrv.insCompanyiaUsuarioImplementation(request, true);
    }

    /*
     * Implements service InsCompanyiaUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insCompanyiaUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsCompanyiaUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioInsCompanyiaUsuariopthisAttrUsuario = request.getUsuarioInsCompanyiaUsuariopthisAttrUsuarioInstance();
        Companyia usuarioInsCompanyiaUsuariopevcCompanyia = request.getUsuarioInsCompanyiaUsuariopevcCompanyiaInstance();

        request.checkArguments();
        Usuario instance = usuarioInsCompanyiaUsuariopthisAttrUsuario;

        instance.add2Companyia(usuarioInsCompanyiaUsuariopevcCompanyia);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.companyia.siu.InsCompanyiaUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.companyia.siu.InsCompanyiaUsuarioRequest();
            relatedRequest.setCompanyiaInsCompanyiaUsuariopthisCompanyiaInstance(usuarioInsCompanyiaUsuariopevcCompanyia);
            relatedRequest.setCompanyiaInsCompanyiaUsuariopevcUsuarioInstance(usuarioInsCompanyiaUsuariopthisAttrUsuario);
            companyiaSrv.insCompanyiaUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: DelCompanyiaUsuario

    /*
     * Entry point for service DelCompanyiaUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delCompanyiaUsuario(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelCompanyiaUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.delCompanyiaUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelCompanyiaUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delCompanyiaUsuarioTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelCompanyiaUsuarioRequest request) throws ModelException {
        request.setUsuarioDelCompanyiaUsuariopthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioDelCompanyiaUsuariopthisAttrUsuario()));
        request.setUsuarioDelCompanyiaUsuariopevcCompanyiaInstance(companyiaSrv.getByOIDWithHV(request.getUsuarioDelCompanyiaUsuariopevcCompanyia()));
        return usuarioSrv.delCompanyiaUsuarioImplementation(request, true);
    }

    /*
     * Implements service DelCompanyiaUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delCompanyiaUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelCompanyiaUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioDelCompanyiaUsuariopthisAttrUsuario = request.getUsuarioDelCompanyiaUsuariopthisAttrUsuarioInstance();
        Companyia usuarioDelCompanyiaUsuariopevcCompanyia = request.getUsuarioDelCompanyiaUsuariopevcCompanyiaInstance();

        request.checkArguments();
        Usuario instance = usuarioDelCompanyiaUsuariopthisAttrUsuario;

        instance.add2Companyia(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.companyia.siu.DelCompanyiaUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.companyia.siu.DelCompanyiaUsuarioRequest();
            relatedRequest.setCompanyiaDelCompanyiaUsuariopthisCompanyiaInstance(usuarioDelCompanyiaUsuariopevcCompanyia);
            relatedRequest.setCompanyiaDelCompanyiaUsuariopevcUsuarioInstance(usuarioDelCompanyiaUsuariopthisAttrUsuario);
            companyiaSrv.delCompanyiaUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: DelParentescorUsuario

    /*
     * Entry point for service DelParentescorUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delParentescorUsuario(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelParentescorUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.delParentescorUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelParentescorUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delParentescorUsuarioTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelParentescorUsuarioRequest request) throws ModelException {
        request.setUsuarioDelParentescorUsuariopthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioDelParentescorUsuariopthisAttrUsuario()));
        request.setUsuarioDelParentescorUsuariopevcParentescoInstance(parentescoSrv.getByOIDWithHV(request.getUsuarioDelParentescorUsuariopevcParentesco()));
        return usuarioSrv.delParentescorUsuarioImplementation(request, true);
    }

    /*
     * Implements service DelParentescorUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delParentescorUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelParentescorUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioDelParentescorUsuariopthisAttrUsuario = request.getUsuarioDelParentescorUsuariopthisAttrUsuarioInstance();
        Parentesco usuarioDelParentescorUsuariopevcParentesco = request.getUsuarioDelParentescorUsuariopevcParentescoInstance();

        request.checkArguments();
        Usuario instance = usuarioDelParentescorUsuariopthisAttrUsuario;

        instance.add2Parentesco(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.parentesco.siu.DelParentescorUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.parentesco.siu.DelParentescorUsuarioRequest();
            relatedRequest.setParentescoDelParentescorUsuariopthisParentescoInstance(usuarioDelParentescorUsuariopevcParentesco);
            relatedRequest.setParentescoDelParentescorUsuariopevcUsuarioInstance(usuarioDelParentescorUsuariopthisAttrUsuario);
            parentescoSrv.delParentescorUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: DelEPSUsuario

    /*
     * Entry point for service DelEPSUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delEPSUsuario(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelEPSUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.delEPSUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelEPSUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delEPSUsuarioTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelEPSUsuarioRequest request) throws ModelException {
        request.setUsuarioDelEPSUsuariopthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioDelEPSUsuariopthisAttrUsuario()));
        request.setUsuarioDelEPSUsuariopevcEpsInstance(epsSrv.getByOIDWithHV(request.getUsuarioDelEPSUsuariopevcEps()));
        return usuarioSrv.delEPSUsuarioImplementation(request, true);
    }

    /*
     * Implements service DelEPSUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delEPSUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelEPSUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioDelEPSUsuariopthisAttrUsuario = request.getUsuarioDelEPSUsuariopthisAttrUsuarioInstance();
        Eps usuarioDelEPSUsuariopevcEps = request.getUsuarioDelEPSUsuariopevcEpsInstance();

        request.checkArguments();
        Usuario instance = usuarioDelEPSUsuariopthisAttrUsuario;

        instance.add2Eps(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.eps.siu.DelEPSUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.eps.siu.DelEPSUsuarioRequest();
            relatedRequest.setEpsDelEPSUsuariopthisEPSInstance(usuarioDelEPSUsuariopevcEps);
            relatedRequest.setEpsDelEPSUsuariopevcUsuarioInstance(usuarioDelEPSUsuariopthisAttrUsuario);
            epsSrv.delEPSUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: CambTipoIdUsuario

    /*
     * Entry point for service CambTipoIdUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambTipoIdUsuario(
            com.keralty.aepersonas.viewmodel.usuario.siu.CambTipoIdUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.cambTipoIdUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service CambTipoIdUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambTipoIdUsuarioTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.CambTipoIdUsuarioRequest request) throws ModelException {
        request.setUsuarioCambTipoIdUsuariopthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioCambTipoIdUsuariopthisUsuario()));
        request.setUsuarioCambTipoIdUsuariopevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getUsuarioCambTipoIdUsuariopevcTipoIdentificacion()));
        return usuarioSrv.cambTipoIdUsuarioImplementation(request, true);
    }

    /*
     * Implements service CambTipoIdUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambTipoIdUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.CambTipoIdUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioCambTipoIdUsuariopthisUsuario = request.getUsuarioCambTipoIdUsuariopthisUsuarioInstance();
        TipoIdentificacion usuarioCambTipoIdUsuariopevcTipoIdentificacion = request.getUsuarioCambTipoIdUsuariopevcTipoIdentificacionInstance();

        request.checkArguments();
        Usuario instance = usuarioCambTipoIdUsuariopthisUsuario;

        instance.add2TipoIdentificacion(usuarioCambTipoIdUsuariopevcTipoIdentificacion);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdUsuarioRequest();
            relatedRequest.setTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance(usuarioCambTipoIdUsuariopevcTipoIdentificacion);
            relatedRequest.setTipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance(usuarioCambTipoIdUsuariopthisUsuario);
            tipoIdentificacionSrv.cambTipoIdUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

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
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.modificarTxn(request);
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
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarRequest request) throws ModelException {
        request.setUsuariomodificarpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuariomodificarpthisUsuario()));
        return usuarioSrv.modificarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuariomodificarpthisUsuario = request.getUsuariomodificarpthisUsuarioInstance();
        Long usuariomodificarpCodigo = request.getUsuariomodificarpCodigo();
        String usuariomodificarpNumIdentificacion = request.getUsuariomodificarpNumIdentificacion();
        String usuariomodificarpPrimerNombre = request.getUsuariomodificarpPrimerNombre();
        String usuariomodificarpSegundoNombre = request.getUsuariomodificarpSegundoNombre();
        String usuariomodificarpPrimerApellido = request.getUsuariomodificarpPrimerApellido();
        String usuariomodificarpSegundoApellido = request.getUsuariomodificarpSegundoApellido();

        request.checkArguments();
        Usuario instance = usuariomodificarpthisUsuario;
        instance.setUsuarioNumUsuario(usuariomodificarpCodigo);
        instance.setUsuarioNumIdentificacion(usuariomodificarpNumIdentificacion);
        instance.setUsuarioPrimerNombre(usuariomodificarpPrimerNombre);
        instance.setUsuarioSegundoNombre(usuariomodificarpSegundoNombre);
        instance.setUsuarioPrimerApellido(usuariomodificarpPrimerApellido);
        instance.setUsuarioSegundoApellido(usuariomodificarpSegundoApellido);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: modificarTipoUsuario

    /*
     * Entry point for service modificarTipoUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse modificarTipoUsuario(
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarTipoUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.modificarTipoUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service modificarTipoUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse modificarTipoUsuarioTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarTipoUsuarioRequest request) throws ModelException {
        request.setUsuariomodificarTipoUsuariopthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuariomodificarTipoUsuariopthisUsuario()));
        return usuarioSrv.modificarTipoUsuarioImplementation(request);
    }

    /*
     * Implements service modificarTipoUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse modificarTipoUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarTipoUsuarioRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuariomodificarTipoUsuariopthisUsuario = request.getUsuariomodificarTipoUsuariopthisUsuarioInstance();
        Long usuariomodificarTipoUsuariopTipoUsuario = request.getUsuariomodificarTipoUsuariopTipoUsuario();

        request.checkArguments();
        Usuario instance = usuariomodificarTipoUsuariopthisUsuario;
        instance.setUsuarioCodigoTipoUsuario(usuariomodificarTipoUsuariopTipoUsuario);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: marcarAttrDiligenciados

    /*
     * Entry point for service marcarAttrDiligenciados
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse marcarAttrDiligenciados(
            com.keralty.aepersonas.viewmodel.usuario.siu.MarcarAttrDiligenciadosRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.marcarAttrDiligenciadosTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service marcarAttrDiligenciados
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse marcarAttrDiligenciadosTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.MarcarAttrDiligenciadosRequest request) throws ModelException {
        request.setUsuariomarcarAttrDiligenciadospthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuariomarcarAttrDiligenciadospthisUsuario()));
        return usuarioSrv.marcarAttrDiligenciadosImplementation(request);
    }

    /*
     * Implements service marcarAttrDiligenciados
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse marcarAttrDiligenciadosImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.MarcarAttrDiligenciadosRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuariomarcarAttrDiligenciadospthisUsuario = request.getUsuariomarcarAttrDiligenciadospthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuariomarcarAttrDiligenciadospthisUsuario;
        instance.setUsuarioattrUsuarioDiligenciados(Boolean.TRUE);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: showCuesMedico

    /*
     * Entry point for service showCuesMedico
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse showCuesMedico(
            com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoRequest request) {
        com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse response = new com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse();
        try {
            response = usuarioSrv.showCuesMedicoTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service showCuesMedico
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse showCuesMedicoTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoRequest request) throws ModelException {
        request.setUsuarioshowCuesMedicopthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioshowCuesMedicopthisUsuario()));
        return usuarioSrv.showCuesMedicoImplementation(request);
    }

    /*
     * Implements service showCuesMedico
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse showCuesMedicoImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoRequest request) throws ModelException {
        com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse response = new com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse();
        Usuario usuarioshowCuesMedicopthisUsuario = request.getUsuarioshowCuesMedicopthisUsuarioInstance();

        request.checkArguments();

        showCuesMedicoPreconditions(request);
        Usuario instance = usuarioshowCuesMedicopthisUsuario;
        instance.setUsuarioNumUsuario(usuarioshowCuesMedicopthisUsuario.getUsuarioNumUsuario());


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        // Value expressions for outgoing argument 'usuarioshowCuesMedicopsCuesMedico'
        // DEFAULT  : CuestionarioP
        response.setUsuarioshowCuesMedicopsCuesMedicoInstance(usuarioshowCuesMedicopthisUsuario.getCuestionarioP());


        return response;
    }

    /*
     * Checks service showCuesMedico preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    public com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse showCuesMedicoCheckPreconditions(com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoRequest request) {
        com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse response = new com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse();
        request.setUsuarioshowCuesMedicopthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioshowCuesMedicopthisUsuario()));
        try {
            if("Clas_1432633737216826Pre_7".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre7(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void showCuesMedicoPreconditions(
            com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoRequest request) 
            throws ModelException {
        checkClas1432633737216826Pre7(request);
    }

    private void checkClas1432633737216826Pre7 (
            com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoRequest request) 
            throws ModelException {
        // drvAccesoCuesMed = TRUE

        Usuario usuarioshowCuesMedicopthisUsuario = request.getUsuarioshowCuesMedicopthisUsuarioInstance();
        boolean preconditionHolds = usuarioshowCuesMedicopthisUsuario.getUsuariodrvAccesoCuesMed().equals(true);
        if (!preconditionHolds) throw new PreconditionException("El dominio no permite diligenciar el cuestionario médico");
    }

    // Service: InsEstadoBeneficiarioCORE

    /*
     * Entry point for service InsEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insEstadoBeneficiarioCORE(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.insEstadoBeneficiarioCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insEstadoBeneficiarioCORETxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest request) throws ModelException {
        request.setUsuarioInsEstadoBeneficiarioCOREpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioInsEstadoBeneficiarioCOREpthisUsuario()));
        request.setUsuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(estadoBeneficiarioSrv.getByOIDWithHV(request.getUsuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiario()));
        return usuarioSrv.insEstadoBeneficiarioCOREImplementation(request, true);
    }

    /*
     * Implements service InsEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insEstadoBeneficiarioCOREImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioInsEstadoBeneficiarioCOREpthisUsuario = request.getUsuarioInsEstadoBeneficiarioCOREpthisUsuarioInstance();
        EstadoBeneficiario usuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiario = request.getUsuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance();

        request.checkArguments();
        Usuario instance = usuarioInsEstadoBeneficiarioCOREpthisUsuario;

        instance.add2EstadoBeneficiario(usuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiario);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.InsEstadoBeneficiarioCORERequest relatedRequest = new com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.InsEstadoBeneficiarioCORERequest();
            relatedRequest.setEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance(usuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiario);
            relatedRequest.setEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance(usuarioInsEstadoBeneficiarioCOREpthisUsuario);
            estadoBeneficiarioSrv.insEstadoBeneficiarioCOREImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: DelEstadoBeneficiarioCORE

    /*
     * Entry point for service DelEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delEstadoBeneficiarioCORE(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.delEstadoBeneficiarioCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delEstadoBeneficiarioCORETxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest request) throws ModelException {
        request.setUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioDelEstadoBeneficiarioCOREpthisUsuario()));
        request.setUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(estadoBeneficiarioSrv.getByOIDWithHV(request.getUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario()));
        return usuarioSrv.delEstadoBeneficiarioCOREImplementation(request, true);
    }

    /*
     * Implements service DelEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delEstadoBeneficiarioCOREImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioDelEstadoBeneficiarioCOREpthisUsuario = request.getUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance();
        EstadoBeneficiario usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario = request.getUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance();

        request.checkArguments();
        Usuario instance = usuarioDelEstadoBeneficiarioCOREpthisUsuario;

        instance.add2EstadoBeneficiario(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.DelEstadoBeneficiarioCORERequest relatedRequest = new com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.DelEstadoBeneficiarioCORERequest();
            relatedRequest.setEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance(usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario);
            relatedRequest.setEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance(usuarioDelEstadoBeneficiarioCOREpthisUsuario);
            estadoBeneficiarioSrv.delEstadoBeneficiarioCOREImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: registrarDatosCORE

    /*
     * Entry point for service registrarDatosCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse registrarDatosCORE(
            com.keralty.aepersonas.viewmodel.usuario.siu.RegistrarDatosCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.registrarDatosCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service registrarDatosCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse registrarDatosCORETxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.RegistrarDatosCORERequest request) throws ModelException {
        request.setUsuarioregistrarDatosCOREpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioregistrarDatosCOREpthisUsuario()));
        return usuarioSrv.registrarDatosCOREImplementation(request);
    }

    /*
     * Implements service registrarDatosCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse registrarDatosCOREImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.RegistrarDatosCORERequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioregistrarDatosCOREpthisUsuario = request.getUsuarioregistrarDatosCOREpthisUsuarioInstance();
        Long usuarioregistrarDatosCOREpNumUsuario = request.getUsuarioregistrarDatosCOREpNumUsuario();
        Boolean usuarioregistrarDatosCOREpRequierExamenMedico = request.getUsuarioregistrarDatosCOREpRequierExamenMedico();
        Long usuarioregistrarDatosCOREpEstadoMedico = request.getUsuarioregistrarDatosCOREpEstadoMedico();
        Double usuarioregistrarDatosCOREpValorCuotaInscripcion = request.getUsuarioregistrarDatosCOREpValorCuotaInscripcion();
        Boolean usuarioregistrarDatosCOREpTienePreexistencias = request.getUsuarioregistrarDatosCOREpTienePreexistencias();
        Date usuarioregistrarDatosCOREpFechaInicionVigencia = request.getUsuarioregistrarDatosCOREpFechaInicionVigencia();
        Date usuarioregistrarDatosCOREpFechaFinVigencia = request.getUsuarioregistrarDatosCOREpFechaFinVigencia();

        request.checkArguments();
        Usuario instance = usuarioregistrarDatosCOREpthisUsuario;
        instance.setUsuarioNumUsuario(usuarioregistrarDatosCOREpNumUsuario);
        instance.setUsuarioRequierExamenMedico(usuarioregistrarDatosCOREpRequierExamenMedico);
        instance.setUsuarioEstadoMedico(usuarioregistrarDatosCOREpEstadoMedico);
        instance.setUsuarioValorCuotaInscripcion(usuarioregistrarDatosCOREpValorCuotaInscripcion);
        instance.setUsuarioTienePreexistencias(usuarioregistrarDatosCOREpTienePreexistencias);
        instance.setUsuarioFechaInicioVigencia(usuarioregistrarDatosCOREpFechaInicionVigencia);
        instance.setUsuarioFechaFinVigencia(usuarioregistrarDatosCOREpFechaFinVigencia);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: setTieneDocIdentificacion

    /*
     * Entry point for service setTieneDocIdentificacion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse setTieneDocIdentificacion(
            com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocIdentificacionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.setTieneDocIdentificacionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service setTieneDocIdentificacion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse setTieneDocIdentificacionTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocIdentificacionRequest request) throws ModelException {
        request.setUsuariosetTieneDocIdentificacionpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuariosetTieneDocIdentificacionpthisUsuario()));
        return usuarioSrv.setTieneDocIdentificacionImplementation(request);
    }

    /*
     * Implements service setTieneDocIdentificacion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse setTieneDocIdentificacionImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocIdentificacionRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuariosetTieneDocIdentificacionpthisUsuario = request.getUsuariosetTieneDocIdentificacionpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuariosetTieneDocIdentificacionpthisUsuario;
        instance.setUsuariotieneDocIdentificacion(Boolean.TRUE);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: setTieneDocsSolicitud

    /*
     * Entry point for service setTieneDocsSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse setTieneDocsSolicitud(
            com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocsSolicitudRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.setTieneDocsSolicitudTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service setTieneDocsSolicitud
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse setTieneDocsSolicitudTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocsSolicitudRequest request) throws ModelException {
        request.setUsuariosetTieneDocsSolicitudpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuariosetTieneDocsSolicitudpthisUsuario()));
        return usuarioSrv.setTieneDocsSolicitudImplementation(request);
    }

    /*
     * Implements service setTieneDocsSolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse setTieneDocsSolicitudImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocsSolicitudRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuariosetTieneDocsSolicitudpthisUsuario = request.getUsuariosetTieneDocsSolicitudpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuariosetTieneDocsSolicitudpthisUsuario;
        instance.setUsuariotieneDocsSolicitud(Boolean.TRUE);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: calcularIMC

    /*
     * Entry point for service calcularIMC
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse calcularIMC(
            com.keralty.aepersonas.viewmodel.usuario.siu.CalcularIMCRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.calcularIMCTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service calcularIMC
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse calcularIMCTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.CalcularIMCRequest request) throws ModelException, SystemException {
        request.setUsuariocalcularIMCpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuariocalcularIMCpthisUsuario()));
        return usuarioSrv.calcularIMCImplementation(request);
    }

    /*
     * Implements service calcularIMC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse calcularIMCImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.CalcularIMCRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuariocalcularIMCpthisUsuario = request.getUsuariocalcularIMCpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuariocalcularIMCpthisUsuario;
        if (repository.assocOperator030(usuariocalcularIMCpthisUsuario).equals(false) || usuariocalcularIMCpthisUsuario.getCuestionarioP().getCuestionarioPYaDiligenciado().equals(false)) {
            instance.setUsuarioIMC(null);
        } else {
            instance.setUsuarioIMC(userFunctionsSrv.fuCalcularIMCUsuarioFun(usuariocalcularIMCpthisUsuario));
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICUsuario());

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
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tCREARTxn(request);
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
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest request) throws ModelException, SystemException {
        request.setUsuarioTCREARptpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getUsuarioTCREARptpagrSolicitud()));
        request.setUsuarioTCREARptpagrUsuarioInstance(personaSrv.getByOIDWithHV(request.getUsuarioTCREARptpagrUsuario()));
        request.setUsuarioTCREARptpagrParentescoInstance(parentescoSrv.getByOIDWithHV(request.getUsuarioTCREARptpagrParentesco()));
        return usuarioSrv.tCREARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Persona usuarioTCREARptpagrUsuario = request.getUsuarioTCREARptpagrUsuarioInstance();
        Parentesco usuarioTCREARptpagrParentesco = request.getUsuarioTCREARptpagrParentescoInstance();
        Solicitud usuarioTCREARptpagrSolicitud = request.getUsuarioTCREARptpagrSolicitudInstance();
        Boolean usuarioTCREARptpatrBebeGestante = request.getUsuarioTCREARptpatrBebeGestante();
        Long usuarioTCREARptpatrCodigoTipoUsuario = request.getUsuarioTCREARptpatrCodigoTipoUsuario();
        String usuarioTCREARptpatrcodigoBancoRep = request.getUsuarioTCREARptpatrcodigoBancoRep();
        Boolean usuarioTCREARptpatrUsuarioReplicado = request.getUsuarioTCREARptpatrUsuarioReplicado();

        request.checkArguments();

        tCREARPreconditions(request);
        Usuario instance;

        com.keralty.aepersonas.viewmodel.usuario.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.usuario.siu.CrearRequest();
        step1Request.setUsuariocrearpagrUsuarioPersonaInstance(usuarioTCREARptpagrUsuario);
        step1Request.setUsuariocrearpagrEpsInstance(null);
        step1Request.setUsuariocrearpagrCompanyiaInstance(null);
        step1Request.setUsuariocrearpagrParentescoInstance(usuarioTCREARptpagrParentesco);
        step1Request.setUsuariocrearpagrEstadoBeneficiarioInstance(null);
        step1Request.setUsuariocrearpagrTipoIdentificacionInstance(usuarioTCREARptpagrUsuario.getTipoIdentificacion());
        step1Request.setUsuariocrearpagrSolicitudInstance(usuarioTCREARptpagrSolicitud);
        step1Request.setUsuariocrearpatrBebeGestante(usuarioTCREARptpatrBebeGestante);
        step1Request.setUsuariocrearpatrNumUsuario(usuarioTCREARptpagrUsuario.getPersonaCodigo());
        step1Request.setUsuariocrearpatrNumIdentificacion(usuarioTCREARptpagrUsuario.getPersonaNumIdentificacion());
        step1Request.setUsuariocrearpatrCodigoTipoUsuario(usuarioTCREARptpatrCodigoTipoUsuario);
        step1Request.setUsuariocrearpatrPrimerNombre(usuarioTCREARptpagrUsuario.getPersonaPrimerNombre());
        step1Request.setUsuariocrearpatrSegundoNombre(usuarioTCREARptpagrUsuario.getPersonaSegundoNombre());
        step1Request.setUsuariocrearpatrPrimerApellido(usuarioTCREARptpagrUsuario.getPersonaPrimerApellido());
        step1Request.setUsuariocrearpatrSegundoApellido(usuarioTCREARptpagrUsuario.getPersonaSegundoApellido());
        step1Request.setUsuariocrearpatrcodigoBancoRep(usuarioTCREARptpatrcodigoBancoRep);
        step1Request.setUsuariocrearpatrUsuarioReplicado(usuarioTCREARptpatrUsuarioReplicado);
        instance = (Usuario) usuarioSrv.crearImplementation(step1Request).getInstance();

        /* Action 2: IF (Solicitud.Aesolicitudes.PlanT.AceptaPreexistencias = true AND EXIST (Solicitud.Aesolicitudes.ProductoT.Dominios) WHERE (Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT AND Solicitud.Aesolicitudes.ProductoT.Dominios.IgnorarPreexistencias = false) = true) */
        boolean ifCondition2 = instance.getSolicitud().getAesolicitudes().getPlanT().getPlanesAceptaPreexistencias().equals(true) && repository.assocOperator038(instance).equals(true);
        if (ifCondition2) {
            com.keralty.aepersonas.viewmodel.usuario.siu.TCARGARPREEXISTRequest step20Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TCARGARPREEXISTRequest();
            step20Request.setUsuarioTCARGARPREEXISTpthisUsuarioInstance(instance);
            usuarioSrv.tCARGARPREEXISTImplementation(step20Request);
        }

        com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICORequest step3Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICORequest();
        step3Request.setUsuarioTCREARCUESMEDICOpthisUsuarioInstance(instance);
        usuarioSrv.tCREARCUESMEDICOImplementation(step3Request);

        com.keralty.aepersonas.viewmodel.solicitud.siu.CheckDatosPagoNoOkRequest step4Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.CheckDatosPagoNoOkRequest();
        step4Request.setSolicitudcheckDatosPagoNoOkpthisSolicitudInstance(instance.getSolicitud());
        solicitudSrv.checkDatosPagoNoOkImplementation(step4Request);

        /* Action 5: IF (CodigoTipoUsuario = 2 AND UsuarioPersona.TieneEPSSanitas = true AND (Solicitud.Tramite = 1 OR Solicitud.Aesolicitudes.PlanT.EsBancoRep = false)) */
        boolean ifCondition5 = (instance.getUsuarioCodigoTipoUsuario()).equals(Long.valueOf(2)) && instance.getUsuarioPersona().getPersonaTieneEPSSanitas().equals(true) && ((instance.getSolicitud().getSolicitudTramite()).equals(Long.valueOf(1)) || instance.getSolicitud().getAesolicitudes().getPlanT().getPlanesEsBancoRep().equals(false));
        if (ifCondition5) {
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEPSUsuarioRequest step50Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsEPSUsuarioRequest();
            step50Request.setUsuarioInsEPSUsuariopthisAttrUsuarioInstance(instance);
            step50Request.setUsuarioInsEPSUsuariopevcEpsInstance(userFunctionsSrv.fugetEPSSanitasFun());
            usuarioSrv.insEPSUsuarioImplementation(step50Request, true);
            com.keralty.aepersonas.viewmodel.usuario.siu.MarcarAttrDiligenciadosRequest step51Request = new com.keralty.aepersonas.viewmodel.usuario.siu.MarcarAttrDiligenciadosRequest();
            step51Request.setUsuariomarcarAttrDiligenciadospthisUsuarioInstance(instance);
            usuarioSrv.marcarAttrDiligenciadosImplementation(step51Request);
        }

        /* Action 6: IF (EXIST (UsuarioPersona.DocumentosG) WHERE (UsuarioPersona.DocumentosG.Tipo = 1) = true) */
        boolean ifCondition6 = repository.assocOperator039(instance).equals(true);
        if (ifCondition6) {
            com.keralty.aepersonas.viewmodel.usuario.siu.TNOTIFICARDOCUMENTORequest step60Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TNOTIFICARDOCUMENTORequest();
            step60Request.setUsuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance(instance);
            step60Request.setUsuarioTNOTIFICARDOCUMENTOpTipoDocumento(Long.valueOf(1));
            usuarioSrv.tNOTIFICARDOCUMENTOImplementation(step60Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    private void tCREARPreconditions(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest request) 
            throws ModelException {
        checkClas1432633737216826Pre4(request);
        checkClas1432633737216826Pre25(request);
    }

    private void checkClas1432633737216826Pre4 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest request) 
            throws ModelException {
        // ptpatrBebeGestante = false OR (ptpatrBebeGestante = true AND EXIST( ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios ) WHERE (ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.PlanT = ptpagrSolicitud.Aesolicitudes.PlanT AND ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.AcepBBGestante = true) = true)

        Boolean usuarioTCREARptpatrBebeGestante = request.getUsuarioTCREARptpatrBebeGestante();
        Solicitud usuarioTCREARptpagrSolicitud = request.getUsuarioTCREARptpagrSolicitudInstance();
        try {
            boolean preconditionHolds = usuarioTCREARptpatrBebeGestante.equals(false) || (usuarioTCREARptpatrBebeGestante.equals(true) && repository.assocOperator031(usuarioTCREARptpagrSolicitud).equals(true));
            if (!preconditionHolds) throw new PreconditionException("El producto y plan de la solicitud no aceptan bebés gestantes");
        } catch (SystemException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    private void checkClas1432633737216826Pre25 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest request) 
            throws ModelException {
        // ptpagrSolicitud.PorcentajeProrrateo = NULL OR EXIST( ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios ) WHERE (ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.PlanT = ptpagrSolicitud.Aesolicitudes.PlanT AND ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.ProrrateoUsuExistente = true) = true OR ptpagrUsuario.drvVieneDeCORE = false

        Solicitud usuarioTCREARptpagrSolicitud = request.getUsuarioTCREARptpagrSolicitudInstance();
        Persona usuarioTCREARptpagrUsuario = request.getUsuarioTCREARptpagrUsuarioInstance();
        try {
            boolean preconditionHolds = usuarioTCREARptpagrSolicitud.getSolicitudPorcentajeProrrateo() == null || repository.assocOperator032(usuarioTCREARptpagrSolicitud).equals(true) || usuarioTCREARptpagrUsuario.getPersonadrvVieneDeCORE().equals(false);
            if (!preconditionHolds) throw new PreconditionException("La configuración del plan no permite porcentaje de prorrateo para usuarios existentes. Elimine el porcentaje de prorrateo (en modificar encabezado) para poder añadir al usuario");
        } catch (SystemException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    // Service: TMODIFICAR

    /*
     * Entry point for service TMODIFICAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tMODIFICAR(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tMODIFICARTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TMODIFICAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tMODIFICARTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARRequest request) throws ModelException, SystemException {
        request.setUsuarioTMODIFICARpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTMODIFICARpthisUsuario()));
        request.setUsuarioTMODIFICARptpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getUsuarioTMODIFICARptpevcTipoIdentificacion()));
        return usuarioSrv.tMODIFICARImplementation(request);
    }

    /*
     * Implements service TMODIFICAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tMODIFICARImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        String usuarioTMODIFICARptpNumIdentificacion = request.getUsuarioTMODIFICARptpNumIdentificacion();
        TipoIdentificacion usuarioTMODIFICARptpevcTipoIdentificacion = request.getUsuarioTMODIFICARptpevcTipoIdentificacionInstance();
        Long usuarioTMODIFICARptpCodigo = request.getUsuarioTMODIFICARptpCodigo();
        String usuarioTMODIFICARptpPrimerNombre = request.getUsuarioTMODIFICARptpPrimerNombre();
        String usuarioTMODIFICARptpSegundoNombre = request.getUsuarioTMODIFICARptpSegundoNombre();
        String usuarioTMODIFICARptpPrimerApellido = request.getUsuarioTMODIFICARptpPrimerApellido();
        String usuarioTMODIFICARptpSegundoApellido = request.getUsuarioTMODIFICARptpSegundoApellido();
        Boolean usuarioTMODIFICARpEsElTitular = request.getUsuarioTMODIFICARpEsElTitular();
        Usuario usuarioTMODIFICARpthisUsuario = request.getUsuarioTMODIFICARpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTMODIFICARpthisUsuario;

        /* Action 1: IF (NumIdentificacion <> ptpNumIdentificacion OR TipoIdentificacion <> ptpevcTipoIdentificacion) */
        boolean ifCondition1 = !(usuarioTMODIFICARpthisUsuario.getUsuarioNumIdentificacion()).equals(usuarioTMODIFICARptpNumIdentificacion) || !(usuarioTMODIFICARpthisUsuario.getTipoIdentificacion().equalsObject(usuarioTMODIFICARptpevcTipoIdentificacion));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarRequest step10Request = new com.keralty.aepersonas.viewmodel.usuario.siu.ModificarRequest();
            step10Request.setUsuariomodificarpthisUsuarioInstance(usuarioTMODIFICARpthisUsuario);
            step10Request.setUsuariomodificarpCodigo(usuarioTMODIFICARptpCodigo);
            step10Request.setUsuariomodificarpNumIdentificacion(usuarioTMODIFICARptpNumIdentificacion);
            step10Request.setUsuariomodificarpPrimerNombre(usuarioTMODIFICARptpPrimerNombre);
            step10Request.setUsuariomodificarpSegundoNombre(usuarioTMODIFICARptpSegundoNombre);
            step10Request.setUsuariomodificarpPrimerApellido(usuarioTMODIFICARptpPrimerApellido);
            step10Request.setUsuariomodificarpSegundoApellido(usuarioTMODIFICARptpSegundoApellido);
            usuarioSrv.modificarImplementation(step10Request);
            /* Action 11: IF (TipoIdentificacion <> ptpevcTipoIdentificacion) */
            boolean ifCondition11 = !(usuarioTMODIFICARpthisUsuario.getTipoIdentificacion().equalsObject(usuarioTMODIFICARptpevcTipoIdentificacion));
            if (ifCondition11) {
                com.keralty.aepersonas.viewmodel.usuario.siu.CambTipoIdUsuarioRequest step110Request = new com.keralty.aepersonas.viewmodel.usuario.siu.CambTipoIdUsuarioRequest();
                step110Request.setUsuarioCambTipoIdUsuariopthisUsuarioInstance(usuarioTMODIFICARpthisUsuario);
                step110Request.setUsuarioCambTipoIdUsuariopevcTipoIdentificacionInstance(usuarioTMODIFICARptpevcTipoIdentificacion);
                usuarioSrv.cambTipoIdUsuarioImplementation(step110Request, true);
            }
            /* Action 12: IF (Solicitud.Aesolicitudes.PlanT.AceptaPreexistencias = true AND EXIST (Solicitud.Aesolicitudes.ProductoT.Dominios) WHERE (Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT AND Solicitud.Aesolicitudes.ProductoT.Dominios.IgnorarPreexistencias = false) = true) */
            boolean ifCondition12 = usuarioTMODIFICARpthisUsuario.getSolicitud().getAesolicitudes().getPlanT().getPlanesAceptaPreexistencias().equals(true) && repository.assocOperator042(usuarioTMODIFICARpthisUsuario).equals(true);
            if (ifCondition12) {
                com.keralty.aepersonas.viewmodel.usuario.siu.TCARGARPREEXISTRequest step120Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TCARGARPREEXISTRequest();
                step120Request.setUsuarioTCARGARPREEXISTpthisUsuarioInstance(usuarioTMODIFICARpthisUsuario);
                usuarioSrv.tCARGARPREEXISTImplementation(step120Request);
            }
        } else {
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarRequest step13Request = new com.keralty.aepersonas.viewmodel.usuario.siu.ModificarRequest();
            step13Request.setUsuariomodificarpthisUsuarioInstance(usuarioTMODIFICARpthisUsuario);
            step13Request.setUsuariomodificarpCodigo(usuarioTMODIFICARptpCodigo);
            step13Request.setUsuariomodificarpNumIdentificacion(usuarioTMODIFICARptpNumIdentificacion);
            step13Request.setUsuariomodificarpPrimerNombre(usuarioTMODIFICARptpPrimerNombre);
            step13Request.setUsuariomodificarpSegundoNombre(usuarioTMODIFICARptpSegundoNombre);
            step13Request.setUsuariomodificarpPrimerApellido(usuarioTMODIFICARptpPrimerApellido);
            step13Request.setUsuariomodificarpSegundoApellido(usuarioTMODIFICARptpSegundoApellido);
            usuarioSrv.modificarImplementation(step13Request);
            /* Action 14: IF (TipoIdentificacion <> ptpevcTipoIdentificacion) */
            boolean ifCondition14 = !(usuarioTMODIFICARpthisUsuario.getTipoIdentificacion().equalsObject(usuarioTMODIFICARptpevcTipoIdentificacion));
            if (ifCondition14) {
                com.keralty.aepersonas.viewmodel.usuario.siu.CambTipoIdUsuarioRequest step140Request = new com.keralty.aepersonas.viewmodel.usuario.siu.CambTipoIdUsuarioRequest();
                step140Request.setUsuarioCambTipoIdUsuariopthisUsuarioInstance(usuarioTMODIFICARpthisUsuario);
                step140Request.setUsuarioCambTipoIdUsuariopevcTipoIdentificacionInstance(usuarioTMODIFICARptpevcTipoIdentificacion);
                usuarioSrv.cambTipoIdUsuarioImplementation(step140Request, true);
            }
        }

        /* Action 2: IF (pEsElTitular = true) */
        boolean ifCondition2 = usuarioTMODIFICARpEsElTitular.equals(true);
        if (ifCondition2) {
            /* Action 20: IF (EXIST (Parentesco) = false) */
            boolean ifCondition20 = repository.assocOperator043(usuarioTMODIFICARpthisUsuario).equals(false);
            if (ifCondition20) {
                com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest step200Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest();
                step200Request.setUsuarioInsParentescoUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARpthisUsuario);
                step200Request.setUsuarioInsParentescoUsuariopevcParentescoInstance(userFunctionsSrv.fugetParentescoTitularFun());
                usuarioSrv.insParentescoUsuarioImplementation(step200Request, true);
            } else {
                /* Action 201: IF (Parentesco <> fugetParentescoTitular()) */
                boolean ifCondition201 = !(usuarioTMODIFICARpthisUsuario.getParentesco().equalsObject(userFunctionsSrv.fugetParentescoTitularFun()));
                if (ifCondition201) {
                    com.keralty.aepersonas.viewmodel.usuario.siu.DelParentescorUsuarioRequest step2010Request = new com.keralty.aepersonas.viewmodel.usuario.siu.DelParentescorUsuarioRequest();
                    step2010Request.setUsuarioDelParentescorUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARpthisUsuario);
                    step2010Request.setUsuarioDelParentescorUsuariopevcParentescoInstance(usuarioTMODIFICARpthisUsuario.getParentesco());
                    usuarioSrv.delParentescorUsuarioImplementation(step2010Request, true);
                    com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest step2011Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest();
                    step2011Request.setUsuarioInsParentescoUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARpthisUsuario);
                    step2011Request.setUsuarioInsParentescoUsuariopevcParentescoInstance(userFunctionsSrv.fugetParentescoTitularFun());
                    usuarioSrv.insParentescoUsuarioImplementation(step2011Request, true);
                }
            }
            com.keralty.aepersonas.viewmodel.usuario.siu.ModificarTipoUsuarioRequest step21Request = new com.keralty.aepersonas.viewmodel.usuario.siu.ModificarTipoUsuarioRequest();
            step21Request.setUsuariomodificarTipoUsuariopthisUsuarioInstance(usuarioTMODIFICARpthisUsuario);
            step21Request.setUsuariomodificarTipoUsuariopTipoUsuario(Long.valueOf(2));
            usuarioSrv.modificarTipoUsuarioImplementation(step21Request);
        }

        com.keralty.aepersonas.viewmodel.usuario.siu.TRECREARCUESMEDICORequest step3Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TRECREARCUESMEDICORequest();
        step3Request.setUsuarioTRECREARCUESMEDICOpthisUsuarioInstance(usuarioTMODIFICARpthisUsuario);
        usuarioSrv.tRECREARCUESMEDICOImplementation(step3Request);

        com.keralty.aepersonas.viewmodel.solicitud.siu.CheckDatosPagoNoOkRequest step4Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.CheckDatosPagoNoOkRequest();
        step4Request.setSolicitudcheckDatosPagoNoOkpthisSolicitudInstance(usuarioTMODIFICARpthisUsuario.getSolicitud());
        solicitudSrv.checkDatosPagoNoOkImplementation(step4Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TMODIFICARATTR

    /*
     * Entry point for service TMODIFICARATTR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tMODIFICARATTR(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tMODIFICARATTRTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TMODIFICARATTR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tMODIFICARATTRTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) throws ModelException, SystemException {
        request.setUsuarioTMODIFICARATTRpthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTMODIFICARATTRpthisAttrUsuario()));
        request.setUsuarioTMODIFICARATTRptpevcCompanyiaInstance(companyiaSrv.getByOIDWithHV(new CompanyiaOid().fromJsonString(request.getUsuarioTMODIFICARATTRptpevcCompanyia())));
        request.setUsuarioTMODIFICARATTRptpevcEPSInstance(epsSrv.getByOIDWithHV(new EpsOid().fromJsonString(request.getUsuarioTMODIFICARATTRptpevcEPS())));
        request.setUsuarioTMODIFICARATTRptpevcParentescoInstance(parentescoSrv.getByOIDWithHV(new ParentescoOid().fromJsonString(request.getUsuarioTMODIFICARATTRptpevcParentesco())));
        return usuarioSrv.tMODIFICARATTRImplementation(request);
    }

    /*
     * Implements service TMODIFICARATTR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tMODIFICARATTRImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Boolean usuarioTMODIFICARATTRptpBebeGestante = request.getUsuarioTMODIFICARATTRptpBebeGestante();
        String usuarioTMODIFICARATTRptpcodigoBancoRep = request.getUsuarioTMODIFICARATTRptpcodigoBancoRep();
        Date usuarioTMODIFICARATTRptpFechaAntiguedad = request.getUsuarioTMODIFICARATTRptpFechaAntiguedad();
        Boolean usuarioTMODIFICARATTRptpePolizaInternacional = request.getUsuarioTMODIFICARATTRptpePolizaInternacional();
        Companyia usuarioTMODIFICARATTRptpevcCompanyia = request.getUsuarioTMODIFICARATTRptpevcCompanyiaInstance();
        Eps usuarioTMODIFICARATTRptpevcEPS = request.getUsuarioTMODIFICARATTRptpevcEPSInstance();
        Parentesco usuarioTMODIFICARATTRptpevcParentesco = request.getUsuarioTMODIFICARATTRptpevcParentescoInstance();
        Usuario usuarioTMODIFICARATTRpthisAttrUsuario = request.getUsuarioTMODIFICARATTRpthisAttrUsuarioInstance();

        request.checkArguments();

        tMODIFICARATTRPreconditions(request);
        Usuario instance = usuarioTMODIFICARATTRpthisAttrUsuario;

        com.keralty.aepersonas.viewmodel.usuario.siu.ModificarAttrRequest step1Request = new com.keralty.aepersonas.viewmodel.usuario.siu.ModificarAttrRequest();
        step1Request.setUsuariomodificarAttrpthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
        step1Request.setUsuariomodificarAttrpBebeGestante(usuarioTMODIFICARATTRptpBebeGestante);
        step1Request.setUsuariomodificarAttrpcodigoBancoRep(usuarioTMODIFICARATTRptpcodigoBancoRep);
        step1Request.setUsuariomodificarAttrpFechaAntiguedad(usuarioTMODIFICARATTRptpFechaAntiguedad);
        step1Request.setUsuariomodificarAttrpePolizaInternacional(usuarioTMODIFICARATTRptpePolizaInternacional);
        usuarioSrv.modificarAttrImplementation(step1Request);

        com.keralty.aepersonas.viewmodel.usuario.siu.MarcarAttrDiligenciadosRequest step2Request = new com.keralty.aepersonas.viewmodel.usuario.siu.MarcarAttrDiligenciadosRequest();
        step2Request.setUsuariomarcarAttrDiligenciadospthisUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
        usuarioSrv.marcarAttrDiligenciadosImplementation(step2Request);

        boolean guard3 = repository.assocOperator044(usuarioTMODIFICARATTRpthisAttrUsuario).equals(false) && (usuarioTMODIFICARATTRptpevcCompanyia != null && !usuarioTMODIFICARATTRptpevcCompanyia.isNull());

        if (guard3) {
            com.keralty.aepersonas.viewmodel.usuario.siu.InsCompanyiaUsuarioRequest step3Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsCompanyiaUsuarioRequest();
            step3Request.setUsuarioInsCompanyiaUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
            step3Request.setUsuarioInsCompanyiaUsuariopevcCompanyiaInstance(usuarioTMODIFICARATTRptpevcCompanyia);
            usuarioSrv.insCompanyiaUsuarioImplementation(step3Request, true);
        }

        boolean guard4 = repository.assocOperator045(usuarioTMODIFICARATTRpthisAttrUsuario).equals(true) && (usuarioTMODIFICARATTRptpevcCompanyia == null || usuarioTMODIFICARATTRptpevcCompanyia.isNull());

        if (guard4) {
            com.keralty.aepersonas.viewmodel.usuario.siu.DelCompanyiaUsuarioRequest step4Request = new com.keralty.aepersonas.viewmodel.usuario.siu.DelCompanyiaUsuarioRequest();
            step4Request.setUsuarioDelCompanyiaUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
            step4Request.setUsuarioDelCompanyiaUsuariopevcCompanyiaInstance(usuarioTMODIFICARATTRpthisAttrUsuario.getCompanyia());
            usuarioSrv.delCompanyiaUsuarioImplementation(step4Request, true);
        }

        /* Action 5: IF (EXIST (Companyia) = true AND ptpevcCompanyia <> NULL AND Companyia <> ptpevcCompanyia) */
        boolean ifCondition5 = repository.assocOperator049(usuarioTMODIFICARATTRpthisAttrUsuario).equals(true) && (usuarioTMODIFICARATTRptpevcCompanyia != null && !usuarioTMODIFICARATTRptpevcCompanyia.isNull()) && !(usuarioTMODIFICARATTRpthisAttrUsuario.getCompanyia().equalsObject(usuarioTMODIFICARATTRptpevcCompanyia));
        if (ifCondition5) {
            com.keralty.aepersonas.viewmodel.usuario.siu.DelCompanyiaUsuarioRequest step50Request = new com.keralty.aepersonas.viewmodel.usuario.siu.DelCompanyiaUsuarioRequest();
            step50Request.setUsuarioDelCompanyiaUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
            step50Request.setUsuarioDelCompanyiaUsuariopevcCompanyiaInstance(usuarioTMODIFICARATTRpthisAttrUsuario.getCompanyia());
            usuarioSrv.delCompanyiaUsuarioImplementation(step50Request, true);
            com.keralty.aepersonas.viewmodel.usuario.siu.InsCompanyiaUsuarioRequest step51Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsCompanyiaUsuarioRequest();
            step51Request.setUsuarioInsCompanyiaUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
            step51Request.setUsuarioInsCompanyiaUsuariopevcCompanyiaInstance(usuarioTMODIFICARATTRptpevcCompanyia);
            usuarioSrv.insCompanyiaUsuarioImplementation(step51Request, true);
        }

        /* Action 6: IF (EXIST (Eps) = false) */
        boolean ifCondition6 = repository.assocOperator050(usuarioTMODIFICARATTRpthisAttrUsuario).equals(false);
        if (ifCondition6) {
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEPSUsuarioRequest step60Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsEPSUsuarioRequest();
            step60Request.setUsuarioInsEPSUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
            step60Request.setUsuarioInsEPSUsuariopevcEpsInstance(usuarioTMODIFICARATTRptpevcEPS);
            usuarioSrv.insEPSUsuarioImplementation(step60Request, true);
        } else {
            /* Action 61: IF (Eps <> ptpevcEPS) */
            boolean ifCondition61 = !(usuarioTMODIFICARATTRpthisAttrUsuario.getEps().equalsObject(usuarioTMODIFICARATTRptpevcEPS));
            if (ifCondition61) {
                com.keralty.aepersonas.viewmodel.usuario.siu.DelEPSUsuarioRequest step610Request = new com.keralty.aepersonas.viewmodel.usuario.siu.DelEPSUsuarioRequest();
                step610Request.setUsuarioDelEPSUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
                step610Request.setUsuarioDelEPSUsuariopevcEpsInstance(usuarioTMODIFICARATTRpthisAttrUsuario.getEps());
                usuarioSrv.delEPSUsuarioImplementation(step610Request, true);
                com.keralty.aepersonas.viewmodel.usuario.siu.InsEPSUsuarioRequest step611Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsEPSUsuarioRequest();
                step611Request.setUsuarioInsEPSUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
                step611Request.setUsuarioInsEPSUsuariopevcEpsInstance(usuarioTMODIFICARATTRptpevcEPS);
                usuarioSrv.insEPSUsuarioImplementation(step611Request, true);
            }
        }

        /* Action 7: IF (EXIST (Parentesco) = false) */
        boolean ifCondition7 = repository.assocOperator051(usuarioTMODIFICARATTRpthisAttrUsuario).equals(false);
        if (ifCondition7) {
            com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest step70Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest();
            step70Request.setUsuarioInsParentescoUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
            step70Request.setUsuarioInsParentescoUsuariopevcParentescoInstance(usuarioTMODIFICARATTRptpevcParentesco);
            usuarioSrv.insParentescoUsuarioImplementation(step70Request, true);
        } else {
            /* Action 71: IF (Parentesco <> ptpevcParentesco) */
            boolean ifCondition71 = !(usuarioTMODIFICARATTRpthisAttrUsuario.getParentesco().equalsObject(usuarioTMODIFICARATTRptpevcParentesco));
            if (ifCondition71) {
                com.keralty.aepersonas.viewmodel.usuario.siu.DelParentescorUsuarioRequest step710Request = new com.keralty.aepersonas.viewmodel.usuario.siu.DelParentescorUsuarioRequest();
                step710Request.setUsuarioDelParentescorUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
                step710Request.setUsuarioDelParentescorUsuariopevcParentescoInstance(usuarioTMODIFICARATTRpthisAttrUsuario.getParentesco());
                usuarioSrv.delParentescorUsuarioImplementation(step710Request, true);
                com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest step711Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest();
                step711Request.setUsuarioInsParentescoUsuariopthisAttrUsuarioInstance(usuarioTMODIFICARATTRpthisAttrUsuario);
                step711Request.setUsuarioInsParentescoUsuariopevcParentescoInstance(usuarioTMODIFICARATTRptpevcParentesco);
                usuarioSrv.insParentescoUsuarioImplementation(step711Request, true);
            }
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    /*
     * Checks service TMODIFICARATTR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    public ServiceResponse tMODIFICARATTRCheckPreconditions(com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) {
        ServiceResponse response = new ServiceResponse();
        request.setUsuarioTMODIFICARATTRpthisAttrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTMODIFICARATTRpthisAttrUsuario()));
        request.setUsuarioTMODIFICARATTRptpevcCompanyiaInstance(companyiaSrv.getByOIDWithHV(new CompanyiaOid().fromJsonString(request.getUsuarioTMODIFICARATTRptpevcCompanyia())));
        request.setUsuarioTMODIFICARATTRptpevcEPSInstance(epsSrv.getByOIDWithHV(new EpsOid().fromJsonString(request.getUsuarioTMODIFICARATTRptpevcEPS())));
        request.setUsuarioTMODIFICARATTRptpevcParentescoInstance(parentescoSrv.getByOIDWithHV(new ParentescoOid().fromJsonString(request.getUsuarioTMODIFICARATTRptpevcParentesco())));
        try {
            if("Clas_1432633737216826Pre_3".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre3(request);
            if("Clas_1432633737216826Pre_1".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre1(request);
            if("Clas_1432633737216826Pre_11".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre11(request);
            if("Clas_1432633737216826Pre_12".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre12(request);
            if("Clas_1432633737216826Pre_26".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre26(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void tMODIFICARATTRPreconditions(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) 
            throws ModelException {
        checkClas1432633737216826Pre3(request);
        checkClas1432633737216826Pre1(request);
        checkClas1432633737216826Pre11(request);
        checkClas1432633737216826Pre12(request);
        checkClas1432633737216826Pre26(request);
    }

    private void checkClas1432633737216826Pre3 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) 
            throws ModelException {
        // ptpBebeGestante = false OR (ptpBebeGestante = true AND EXIST( Solicitud.Aesolicitudes.ProductoT.Dominios ) WHERE (Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT AND Solicitud.Aesolicitudes.ProductoT.Dominios.AcepBBGestante = true) = true)

        Boolean usuarioTMODIFICARATTRptpBebeGestante = request.getUsuarioTMODIFICARATTRptpBebeGestante();
        Usuario usuarioTMODIFICARATTRpthisAttrUsuario = request.getUsuarioTMODIFICARATTRpthisAttrUsuarioInstance();
        try {
            boolean preconditionHolds = usuarioTMODIFICARATTRptpBebeGestante.equals(false) || (usuarioTMODIFICARATTRptpBebeGestante.equals(true) && repository.assocOperator033(usuarioTMODIFICARATTRpthisAttrUsuario).equals(true));
            if (!preconditionHolds) throw new PreconditionException("El producto y plan de la solicitud no aceptan bebe gestante.");
        } catch (SystemException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    private void checkClas1432633737216826Pre1 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) 
            throws ModelException {
        // ptpBebeGestante = false OR (ptpBebeGestante = true AND (pthisAttrUsuario.UsuarioPersona.FechaNacimiento <= pthisAttrUsuario.Solicitud.Aesolicitudes.Fechaasignacion OR ((TipoIdentificacion.NombreCorto = "MS" OR TipoIdentificacion.NombreCorto = "RC") AND ptpFechaAntiguedad <> NULL)))

        Boolean usuarioTMODIFICARATTRptpBebeGestante = request.getUsuarioTMODIFICARATTRptpBebeGestante();
        Usuario usuarioTMODIFICARATTRpthisAttrUsuario = request.getUsuarioTMODIFICARATTRpthisAttrUsuarioInstance();
        Date usuarioTMODIFICARATTRptpFechaAntiguedad = request.getUsuarioTMODIFICARATTRptpFechaAntiguedad();
        boolean preconditionHolds = usuarioTMODIFICARATTRptpBebeGestante.equals(false) || (usuarioTMODIFICARATTRptpBebeGestante.equals(true) && ((STDFunctions.dateBeforeFun(usuarioTMODIFICARATTRpthisAttrUsuario.getUsuarioPersona().getPersonaFechaNacimiento(),usuarioTMODIFICARATTRpthisAttrUsuario.getSolicitud().getAesolicitudes().getAesolicitudesFechaasignacion()) || STDFunctions.dateEqualsFun(usuarioTMODIFICARATTRpthisAttrUsuario.getUsuarioPersona().getPersonaFechaNacimiento(), usuarioTMODIFICARATTRpthisAttrUsuario.getSolicitud().getAesolicitudes().getAesolicitudesFechaasignacion())) || (((usuarioTMODIFICARATTRpthisAttrUsuario.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("MS") || (usuarioTMODIFICARATTRpthisAttrUsuario.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("RC")) && usuarioTMODIFICARATTRptpFechaAntiguedad != null)));
        if (!preconditionHolds) throw new PreconditionException("Para poder marcar bebé gestante, la fecha de nacimiento del usuario no puede ser mayor a la fecha de elaboración.");
    }

    private void checkClas1432633737216826Pre11 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) 
            throws ModelException {
        // EXIST( Solicitud.Titular ) = false OR Solicitud.Titular.TitularConBeneficios = false OR (Solicitud.Titular.TipoIdentificacion = TipoIdentificacion AND Solicitud.Titular.NumIdentificacion = NumIdentificacion) OR ptpevcParentesco.EsTitular = false

        Parentesco usuarioTMODIFICARATTRptpevcParentesco = request.getUsuarioTMODIFICARATTRptpevcParentescoInstance();
        Usuario usuarioTMODIFICARATTRpthisAttrUsuario = request.getUsuarioTMODIFICARATTRpthisAttrUsuarioInstance();
        try {
            boolean preconditionHolds = repository.assocOperator034(usuarioTMODIFICARATTRpthisAttrUsuario).equals(false) || usuarioTMODIFICARATTRpthisAttrUsuario.getSolicitud().getTitular().getTitularTitularConBeneficios().equals(false) || (usuarioTMODIFICARATTRpthisAttrUsuario.getSolicitud().getTitular().getTipoIdentificacion().equalsObject(usuarioTMODIFICARATTRpthisAttrUsuario.getTipoIdentificacion()) && (usuarioTMODIFICARATTRpthisAttrUsuario.getSolicitud().getTitular().getTitularNumIdentificacion()).equals(usuarioTMODIFICARATTRpthisAttrUsuario.getUsuarioNumIdentificacion())) || usuarioTMODIFICARATTRptpevcParentesco.getParentescoEsTitular().equals(false);
            if (!preconditionHolds) throw new PreconditionException("Si el titular tiene marcado el check de titular con benerficios, a ningún otro usuario se le puede poner el parentesco titular");
        } catch (SystemException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    private void checkClas1432633737216826Pre12 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) 
            throws ModelException {
        // ptpcodigoBancoRep = NULL OR fuContieneCharEspecial(ptpcodigoBancoRep) = false

        String usuarioTMODIFICARATTRptpcodigoBancoRep = request.getUsuarioTMODIFICARATTRptpcodigoBancoRep();
        boolean preconditionHolds = usuarioTMODIFICARATTRptpcodigoBancoRep == null || userFunctionsSrv.fuContieneCharEspecialFun(usuarioTMODIFICARATTRptpcodigoBancoRep).equals(false);
        if (!preconditionHolds) throw new PreconditionException("El código de banco de la república no puede contener carácteres especiales");
    }

    private void checkClas1432633737216826Pre26 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest request) 
            throws ModelException {
        // ptpevcEPS.EpsSanitas = false OR drvDirResValidoEPS = true

        Eps usuarioTMODIFICARATTRptpevcEPS = request.getUsuarioTMODIFICARATTRptpevcEPSInstance();
        Usuario usuarioTMODIFICARATTRpthisAttrUsuario = request.getUsuarioTMODIFICARATTRpthisAttrUsuarioInstance();
        boolean preconditionHolds = usuarioTMODIFICARATTRptpevcEPS.getEpsEpsSanitas().equals(false) || usuarioTMODIFICARATTRpthisAttrUsuario.getUsuariodrvDirResValidoEPS().equals(true);
        if (!preconditionHolds) throw new PreconditionException("El municipio de residencia no es válido para EPS Sanitas");
    }

    // Service: TMODUSUARIO

    /*
     * Entry point for service TMODUSUARIO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tMODUSUARIO(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODUSUARIORequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tMODUSUARIOTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TMODUSUARIO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tMODUSUARIOTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODUSUARIORequest request) throws ModelException, SystemException {
        request.setUsuarioTMODUSUARIOpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTMODUSUARIOpthisUsuario()));
        request.setUsuarioTMODUSUARIOptpevcDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(new DepartamentoOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcDepartamentoNac())));
        request.setUsuarioTMODUSUARIOptpevcMunicipioNacInstance(municipioSrv.getByOIDWithHV(new MunicipioOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcMunicipioNac())));
        request.setUsuarioTMODUSUARIOptpevcEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(new EstadoCivilOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcEstadoCivil())));
        request.setUsuarioTMODUSUARIOptpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(new DepartamentoOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcDepartamento())));
        request.setUsuarioTMODUSUARIOptpevcMunicipioInstance(municipioSrv.getByOIDWithHV(new MunicipioOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcMunicipio())));
        request.setUsuarioTMODUSUARIOptDireccionInstance(direccionSrv.getByOIDWithHV(new DireccionOid().fromJsonString(request.getUsuarioTMODUSUARIOptDireccion())));
        request.setUsuarioTMODUSUARIOptpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(new TipoIdentificacionOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcTipoIdentificacion())));
        request.setUsuarioTMODUSUARIOptpagrPaisInstance(paisSrv.getByOIDWithHV(new PaisOid().fromJsonString(request.getUsuarioTMODUSUARIOptpagrPais())));
        request.setUsuarioTMODUSUARIOptDireccionUsuarioInstance(direccionSrv.getByOIDWithHV(new DireccionOid().fromJsonString(request.getUsuarioTMODUSUARIOptDireccionUsuario())));
        return usuarioSrv.tMODUSUARIOImplementation(request);
    }

    /*
     * Implements service TMODUSUARIO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tMODUSUARIOImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODUSUARIORequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        String usuarioTMODUSUARIOptpPrimerNombre = request.getUsuarioTMODUSUARIOptpPrimerNombre();
        String usuarioTMODUSUARIOptpSegundoNombre = request.getUsuarioTMODUSUARIOptpSegundoNombre();
        String usuarioTMODUSUARIOptpPrimerApellido = request.getUsuarioTMODUSUARIOptpPrimerApellido();
        String usuarioTMODUSUARIOptpSegundoApellido = request.getUsuarioTMODUSUARIOptpSegundoApellido();
        Date usuarioTMODUSUARIOptpFechaNacimiento = request.getUsuarioTMODUSUARIOptpFechaNacimiento();
        String usuarioTMODUSUARIOptpGenero = request.getUsuarioTMODUSUARIOptpGenero();
        Boolean usuarioTMODUSUARIOptpIndicadorExtranjero = request.getUsuarioTMODUSUARIOptpIndicadorExtranjero();
        String usuarioTMODUSUARIOptpTelefonoFijo = request.getUsuarioTMODUSUARIOptpTelefonoFijo();
        String usuarioTMODUSUARIOptpTelefonoCelular = request.getUsuarioTMODUSUARIOptpTelefonoCelular();
        String usuarioTMODUSUARIOptpCorreoElectronico = request.getUsuarioTMODUSUARIOptpCorreoElectronico();
        Departamento usuarioTMODUSUARIOptpevcDepartamentoNac = request.getUsuarioTMODUSUARIOptpevcDepartamentoNacInstance();
        Municipio usuarioTMODUSUARIOptpevcMunicipioNac = request.getUsuarioTMODUSUARIOptpevcMunicipioNacInstance();
        EstadoCivil usuarioTMODUSUARIOptpevcEstadoCivil = request.getUsuarioTMODUSUARIOptpevcEstadoCivilInstance();
        String usuarioTMODUSUARIOptpDireccionCompleta = request.getUsuarioTMODUSUARIOptpDireccionCompleta();
        Boolean usuarioTMODUSUARIOptpRural = request.getUsuarioTMODUSUARIOptpRural();
        Departamento usuarioTMODUSUARIOptpevcDepartamento = request.getUsuarioTMODUSUARIOptpevcDepartamentoInstance();
        Municipio usuarioTMODUSUARIOptpevcMunicipio = request.getUsuarioTMODUSUARIOptpevcMunicipioInstance();
        String usuarioTMODUSUARIOptpNumIdentificacion = request.getUsuarioTMODUSUARIOptpNumIdentificacion();
        TipoIdentificacion usuarioTMODUSUARIOptpevcTipoIdentificacion = request.getUsuarioTMODUSUARIOptpevcTipoIdentificacionInstance();
        Pais usuarioTMODUSUARIOptpagrPais = request.getUsuarioTMODUSUARIOptpagrPaisInstance();
        Usuario usuarioTMODUSUARIOpthisUsuario = request.getUsuarioTMODUSUARIOpthisUsuarioInstance();

        request.checkArguments();

        tMODUSUARIOPreconditions(request);
        Usuario instance = usuarioTMODUSUARIOpthisUsuario;

        com.keralty.aepersonas.viewmodel.persona.siu.TMODUSUARIORequest step1Request = new com.keralty.aepersonas.viewmodel.persona.siu.TMODUSUARIORequest();
        step1Request.setPersonaTMODUSUARIOpthisPersonaInstance(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona());
        step1Request.setPersonaTMODUSUARIOptpPrimerNombre(usuarioTMODUSUARIOptpPrimerNombre);
        step1Request.setPersonaTMODUSUARIOptpSegundoNombre(usuarioTMODUSUARIOptpSegundoNombre);
        step1Request.setPersonaTMODUSUARIOptpPrimerApellido(usuarioTMODUSUARIOptpPrimerApellido);
        step1Request.setPersonaTMODUSUARIOptpSegundoApellido(usuarioTMODUSUARIOptpSegundoApellido);
        step1Request.setPersonaTMODUSUARIOptpFechaNacimiento(usuarioTMODUSUARIOptpFechaNacimiento);
        step1Request.setPersonaTMODUSUARIOptpGenero(usuarioTMODUSUARIOptpGenero);
        step1Request.setPersonaTMODUSUARIOptpIndicadorExtranjero(usuarioTMODUSUARIOptpIndicadorExtranjero);
        step1Request.setPersonaTMODUSUARIOptpTelefonoFijo(usuarioTMODUSUARIOptpTelefonoFijo);
        step1Request.setPersonaTMODUSUARIOptpTelefonoCelular(usuarioTMODUSUARIOptpTelefonoCelular);
        step1Request.setPersonaTMODUSUARIOptpCorreoElectronico(usuarioTMODUSUARIOptpCorreoElectronico);
        step1Request.setPersonaTMODUSUARIOptpevcDepartamentoNacInstance(usuarioTMODUSUARIOptpevcDepartamentoNac);
        step1Request.setPersonaTMODUSUARIOptpevcMunicipioNacInstance(usuarioTMODUSUARIOptpevcMunicipioNac);
        step1Request.setPersonaTMODUSUARIOptpevcEstadoCivilInstance(usuarioTMODUSUARIOptpevcEstadoCivil);
        step1Request.setPersonaTMODUSUARIOptpDireccionCompleta(usuarioTMODUSUARIOptpDireccionCompleta);
        step1Request.setPersonaTMODUSUARIOptpRural(usuarioTMODUSUARIOptpRural);
        step1Request.setPersonaTMODUSUARIOptpevcTipoDireccionInstance(userFunctionsSrv.fugetTipoDirResidencialFun());
        step1Request.setPersonaTMODUSUARIOptpevcDepartamentoInstance(usuarioTMODUSUARIOptpevcDepartamento);
        step1Request.setPersonaTMODUSUARIOptpevcMunicipioInstance(usuarioTMODUSUARIOptpevcMunicipio);
        step1Request.setPersonaTMODUSUARIOptpNumIdentificacion(usuarioTMODUSUARIOptpNumIdentificacion);
        step1Request.setPersonaTMODUSUARIOptpevcTipoIdentificacionInstance(usuarioTMODUSUARIOptpevcTipoIdentificacion);
        step1Request.setPersonaTMODUSUARIOptpagrPaisInstance(usuarioTMODUSUARIOptpagrPais);
        personaSrv.tMODUSUARIOImplementation(step1Request);

        com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARRequest step2Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARRequest();
        step2Request.setUsuarioTMODIFICARpthisUsuarioInstance(usuarioTMODUSUARIOpthisUsuario);
        step2Request.setUsuarioTMODIFICARptpCodigo(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaCodigo());
        step2Request.setUsuarioTMODIFICARptpNumIdentificacion(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaNumIdentificacion());
        step2Request.setUsuarioTMODIFICARptpPrimerNombre(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaPrimerNombre());
        step2Request.setUsuarioTMODIFICARptpSegundoNombre(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaSegundoNombre());
        step2Request.setUsuarioTMODIFICARptpPrimerApellido(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaPrimerApellido());
        step2Request.setUsuarioTMODIFICARptpSegundoApellido(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaSegundoApellido());
        step2Request.setUsuarioTMODIFICARptpevcTipoIdentificacionInstance(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getTipoIdentificacion());
        step2Request.setUsuarioTMODIFICARpEsElTitular(Boolean.FALSE);
        usuarioSrv.tMODIFICARImplementation(step2Request);

        /* Action 3: IF (Solicitud.ContratantePersona = UsuarioPersona) */
        boolean ifCondition3 = usuarioTMODUSUARIOpthisUsuario.getSolicitud().getContratantePersona().equalsObject(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona());
        if (ifCondition3) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODCONTRATANTERequest step30Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODCONTRATANTERequest();
            step30Request.setSolicitudTCREAROMODCONTRATANTEpthisSolicitudInstance(usuarioTMODUSUARIOpthisUsuario.getSolicitud());
            step30Request.setSolicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance(usuarioTMODUSUARIOpthisUsuario.getSolicitud().getContratantePersona());
            step30Request.setSolicitudTCREAROMODCONTRATANTEptDCTelefonoFijo(usuarioTMODUSUARIOpthisUsuario.getSolicitud().getContratante().getContratanteTelefonoFijo());
            step30Request.setSolicitudTCREAROMODCONTRATANTEptDCTelefonoCelular(usuarioTMODUSUARIOpthisUsuario.getSolicitud().getContratante().getContratanteTelefonoCelular());
            step30Request.setSolicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE(usuarioTMODUSUARIOpthisUsuario.getSolicitud().getContratante().getContratanteTitularConBeneficiosCORE());
            solicitudSrv.tCREAROMODCONTRATANTEImplementation(step30Request);
        }

        /* Action 4: IF (EXIST (Parentesco) = true AND Parentesco.EsTitular = true) */
        boolean ifCondition4 = repository.assocOperator053(usuarioTMODUSUARIOpthisUsuario).equals(true) && usuarioTMODUSUARIOpthisUsuario.getParentesco().getParentescoEsTitular().equals(true);
        if (ifCondition4) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODTITULARRequest step40Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TCREAROMODTITULARRequest();
            step40Request.setSolicitudTCREAROMODTITULARpthisSolicitudInstance(usuarioTMODUSUARIOpthisUsuario.getSolicitud());
            step40Request.setSolicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getTipoIdentificacion());
            step40Request.setSolicitudTCREAROMODTITULARptpagrDepartamentoNacInstance(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getDepartamentoNacimiento());
            step40Request.setSolicitudTCREAROMODTITULARptpagrMunicipioNacInstance(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getMunicipioNacimiento());
            step40Request.setSolicitudTCREAROMODTITULARptpatrCodigo(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaCodigo());
            step40Request.setSolicitudTCREAROMODTITULARptpatrNumIdentificacion(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaNumIdentificacion());
            step40Request.setSolicitudTCREAROMODTITULARptpatrTipoPersona(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaTipoPersona());
            step40Request.setSolicitudTCREAROMODTITULARptpatrPrimerNombre(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaPrimerNombre());
            step40Request.setSolicitudTCREAROMODTITULARptpatrSegundoNombre(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaSegundoNombre());
            step40Request.setSolicitudTCREAROMODTITULARptpatrPrimerApellido(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaPrimerApellido());
            step40Request.setSolicitudTCREAROMODTITULARptpatrSegundoApellido(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaSegundoApellido());
            step40Request.setSolicitudTCREAROMODTITULARptpatrFechaNacimiento(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaFechaNacimiento());
            step40Request.setSolicitudTCREAROMODTITULARptpatrGenero(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaGenero());
            step40Request.setSolicitudTCREAROMODTITULARptpatrIndicadorExtranjero(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaIndicadorExtranjero());
            step40Request.setSolicitudTCREAROMODTITULARptpatrTelefonoFijo(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaTelefonoFijo());
            step40Request.setSolicitudTCREAROMODTITULARptpatrTelefonoCelular(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaTelefonoCelular());
            step40Request.setSolicitudTCREAROMODTITULARptpatrCorreoElectronico(usuarioTMODUSUARIOpthisUsuario.getUsuarioPersona().getPersonaCorreoElectronico());
            step40Request.setSolicitudTCREAROMODTITULARptpatrTitularConBeneficios(Boolean.TRUE);
            step40Request.setSolicitudTCREAROMODTITULARptpatrTitularRecuperadoInc(Boolean.FALSE);
            step40Request.setSolicitudTCREAROMODTITULARptDCTelefonoFijo(null);
            step40Request.setSolicitudTCREAROMODTITULARptDCTelefonoCelular(null);
            step40Request.setSolicitudTCREAROMODTITULARptTitConBeneficiosCORE(Boolean.FALSE);
            step40Request.setSolicitudTCREAROMODTITULARptRazonSocial(null);
            solicitudSrv.tCREAROMODTITULARImplementation(step40Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    /*
     * Checks service TMODUSUARIO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    public ServiceResponse tMODUSUARIOCheckPreconditions(com.keralty.aepersonas.viewmodel.usuario.siu.TMODUSUARIORequest request) {
        ServiceResponse response = new ServiceResponse();
        request.setUsuarioTMODUSUARIOpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTMODUSUARIOpthisUsuario()));
        request.setUsuarioTMODUSUARIOptpevcDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(new DepartamentoOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcDepartamentoNac())));
        request.setUsuarioTMODUSUARIOptpevcMunicipioNacInstance(municipioSrv.getByOIDWithHV(new MunicipioOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcMunicipioNac())));
        request.setUsuarioTMODUSUARIOptpevcEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(new EstadoCivilOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcEstadoCivil())));
        request.setUsuarioTMODUSUARIOptpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(new DepartamentoOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcDepartamento())));
        request.setUsuarioTMODUSUARIOptpevcMunicipioInstance(municipioSrv.getByOIDWithHV(new MunicipioOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcMunicipio())));
        request.setUsuarioTMODUSUARIOptDireccionInstance(direccionSrv.getByOIDWithHV(new DireccionOid().fromJsonString(request.getUsuarioTMODUSUARIOptDireccion())));
        request.setUsuarioTMODUSUARIOptpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(new TipoIdentificacionOid().fromJsonString(request.getUsuarioTMODUSUARIOptpevcTipoIdentificacion())));
        request.setUsuarioTMODUSUARIOptpagrPaisInstance(paisSrv.getByOIDWithHV(new PaisOid().fromJsonString(request.getUsuarioTMODUSUARIOptpagrPais())));
        request.setUsuarioTMODUSUARIOptDireccionUsuarioInstance(direccionSrv.getByOIDWithHV(new DireccionOid().fromJsonString(request.getUsuarioTMODUSUARIOptDireccionUsuario())));
        try {
            if("Clas_1432633737216826Pre_22".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre22(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void tMODUSUARIOPreconditions(
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODUSUARIORequest request) 
            throws ModelException {
        checkClas1432633737216826Pre22(request);
    }

    private void checkClas1432633737216826Pre22 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TMODUSUARIORequest request) 
            throws ModelException {
        // EXIST( Eps ) = false OR Eps.EpsSanitas = false OR ptpevcMunicipio.EsValidoEPS = true

        Municipio usuarioTMODUSUARIOptpevcMunicipio = request.getUsuarioTMODUSUARIOptpevcMunicipioInstance();
        Usuario usuarioTMODUSUARIOpthisUsuario = request.getUsuarioTMODUSUARIOpthisUsuarioInstance();
        try {
            boolean preconditionHolds = repository.assocOperator035(usuarioTMODUSUARIOpthisUsuario).equals(false) || usuarioTMODUSUARIOpthisUsuario.getEps().getEpsEpsSanitas().equals(false) || usuarioTMODUSUARIOptpevcMunicipio.getMunicipioEsValidoEPS().equals(true);
            if (!preconditionHolds) throw new PreconditionException("El municipio diligenciado no es válido para EPS Sanitas");
        } catch (SystemException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    // Service: TELIMINAR

    /*
     * Entry point for service TELIMINAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tELIMINAR(
            com.keralty.aepersonas.viewmodel.usuario.siu.TELIMINARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tELIMINARTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TELIMINAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tELIMINARTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TELIMINARRequest request) throws ModelException, SystemException {
        request.setUsuarioTELIMINARpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTELIMINARpthisUsuario()));
        return usuarioSrv.tELIMINARImplementation(request);
    }

    /*
     * Implements service TELIMINAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tELIMINARImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TELIMINARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioTELIMINARpthisUsuario = request.getUsuarioTELIMINARpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTELIMINARpthisUsuario;

        /* Action 1: IF (EXIST (CuestionarioP) = true) */
        boolean ifCondition1 = repository.assocOperator058(usuarioTELIMINARpthisUsuario).equals(true);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TELIMINARRequest step10Request = new com.keralty.aepersonas.viewmodel.cuestionariop.siu.TELIMINARRequest();
            step10Request.setCuestionarioPTELIMINARpthisCuestionarioPInstance(usuarioTELIMINARpthisUsuario.getCuestionarioP());
            cuestionarioPSrv.tELIMINARImplementation(step10Request);
        }

        /* Action 2: IF (EXIST (AnexoMat) = true) */
        boolean ifCondition2 = repository.assocOperator059(usuarioTELIMINARpthisUsuario).equals(true);
        if (ifCondition2) {
            com.keralty.aepersonas.viewmodel.anexomat.siu.EliminarRequest step20Request = new com.keralty.aepersonas.viewmodel.anexomat.siu.EliminarRequest();
            step20Request.setAnexoMateliminarpthisAnexoMatInstance(usuarioTELIMINARpthisUsuario.getAnexoMat());
            anexoMatSrv.eliminarImplementation(step20Request);
        }

        /* Action 3: IF (EXIST (AnexoNeo) = true) */
        boolean ifCondition3 = repository.assocOperator060(usuarioTELIMINARpthisUsuario).equals(true);
        if (ifCondition3) {
            com.keralty.aepersonas.viewmodel.anexoneo.siu.EliminarRequest step30Request = new com.keralty.aepersonas.viewmodel.anexoneo.siu.EliminarRequest();
            step30Request.setAnexoNeoeliminarpthisAnexoNeoInstance(usuarioTELIMINARpthisUsuario.getAnexoNeo());
            anexoNeoSrv.eliminarImplementation(step30Request);
        }

        for(Preexistencia step4Entity : repository.assocOperator057(usuarioTELIMINARpthisUsuario)) {
            com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest step4Request = new com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest();
            step4Request.setPreexistenciaeliminarpthisPreexistenciaInstance(step4Entity);
            preexistenciaSrv.eliminarImplementation(step4Request);
        }

        com.keralty.aepersonas.viewmodel.solicitud.siu.CheckDatosPagoNoOkRequest step5Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.CheckDatosPagoNoOkRequest();
        step5Request.setSolicitudcheckDatosPagoNoOkpthisSolicitudInstance(usuarioTELIMINARpthisUsuario.getSolicitud());
        solicitudSrv.checkDatosPagoNoOkImplementation(step5Request);

        com.keralty.aepersonas.viewmodel.solicitud.siu.TCALCESTADODOCURequest step6Request = new com.keralty.aepersonas.viewmodel.solicitud.siu.TCALCESTADODOCURequest();
        step6Request.setSolicitudTCALCESTADODOCUpthisSolicitudInstance(usuarioTELIMINARpthisUsuario.getSolicitud());
        solicitudSrv.tCALCESTADODOCUImplementation(step6Request);

        com.keralty.aepersonas.viewmodel.usuario.siu.EliminarRequest step7Request = new com.keralty.aepersonas.viewmodel.usuario.siu.EliminarRequest();
        step7Request.setUsuarioeliminarpthisAttrUsuarioInstance(usuarioTELIMINARpthisUsuario);
        usuarioSrv.eliminarImplementation(step7Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TCREARCUESMEDICO

    /*
     * Entry point for service TCREARCUESMEDICO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARCUESMEDICO(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICORequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tCREARCUESMEDICOTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARCUESMEDICO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARCUESMEDICOTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICORequest request) throws ModelException, SystemException {
        request.setUsuarioTCREARCUESMEDICOpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTCREARCUESMEDICOpthisUsuario()));
        return usuarioSrv.tCREARCUESMEDICOImplementation(request);
    }

    /*
     * Implements service TCREARCUESMEDICO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARCUESMEDICOImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICORequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioTCREARCUESMEDICOpthisUsuario = request.getUsuarioTCREARCUESMEDICOpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTCREARCUESMEDICOpthisUsuario;

        /* Action 1: IF (TipoIdentificacion.MenorSinIdentificar = false) */
        boolean ifCondition1 = usuarioTCREARCUESMEDICOpthisUsuario.getTipoIdentificacion().getTipoIdentificacionMenorSinIdentificar().equals(false);
        if (ifCondition1) {
            /* Action 10: IF (Solicitud.drvReqCuesMed = true) */
            boolean ifCondition10 = usuarioTCREARCUESMEDICOpthisUsuario.getSolicitud().getSolicituddrvReqCuesMed().equals(true);
            if (ifCondition10) {
                com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICOAUXRequest step100Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICOAUXRequest();
                step100Request.setUsuarioTCREARCUESMEDICOAUXpthisUsuarioInstance(usuarioTCREARCUESMEDICOpthisUsuario);
                step100Request.setUsuarioTCREARCUESMEDICOAUXptFechafinVigenciaUsuario(userFunctionsSrv.fuGetFechaFinVigenciaUsuarioFun(usuarioTCREARCUESMEDICOpthisUsuario.getTipoIdentificacion().getTipoIdentificacionNombreCorto(), usuarioTCREARCUESMEDICOpthisUsuario.getUsuarioNumIdentificacion(), usuarioTCREARCUESMEDICOpthisUsuario.getSolicitud().getAesolicitudes().getAesolicitudesNumerosolicitud()));
                usuarioSrv.tCREARCUESMEDICOAUXImplementation(step100Request);
            }
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TCREAROMODANEXOMAT

    /*
     * Entry point for service TCREAROMODANEXOMAT
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREAROMODANEXOMAT(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tCREAROMODANEXOMATTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREAROMODANEXOMAT
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREAROMODANEXOMATTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request) throws ModelException, SystemException {
        request.setUsuarioTCREAROMODANEXOMATpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTCREAROMODANEXOMATpthisUsuario()));
        request.setUsuarioTCREAROMODANEXOMATptInstitucionMatInstance(institucionMatNeoSrv.getByOIDWithHV(new InstitucionMatNeoOid().fromJsonString(request.getUsuarioTCREAROMODANEXOMATptInstitucionMat())));
        return usuarioSrv.tCREAROMODANEXOMATImplementation(request);
    }

    /*
     * Implements service TCREAROMODANEXOMAT
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREAROMODANEXOMATImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        InstitucionMatNeo usuarioTCREAROMODANEXOMATptInstitucionMat = request.getUsuarioTCREAROMODANEXOMATptInstitucionMatInstance();
        Date usuarioTCREAROMODANEXOMATptpatrFechaUltRegla = request.getUsuarioTCREAROMODANEXOMATptpatrFechaUltRegla();
        Long usuarioTCREAROMODANEXOMATptpatrNumCuotas = request.getUsuarioTCREAROMODANEXOMATptpatrNumCuotas();
        Usuario usuarioTCREAROMODANEXOMATpthisUsuario = request.getUsuarioTCREAROMODANEXOMATpthisUsuarioInstance();

        request.checkArguments();

        tCREAROMODANEXOMATPreconditions(request);
        Usuario instance = usuarioTCREAROMODANEXOMATpthisUsuario;

        /* Action 1: IF (EXIST (AnexoMat) = false) */
        boolean ifCondition1 = repository.assocOperator062(usuarioTCREAROMODANEXOMATpthisUsuario).equals(false);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.anexomat.siu.CrearRequest step10Request = new com.keralty.aepersonas.viewmodel.anexomat.siu.CrearRequest();
            step10Request.setAnexoMatcrearpagrUsuarioInstance(usuarioTCREAROMODANEXOMATpthisUsuario);
            step10Request.setAnexoMatcrearpagrInstitucionMaternalInstance(usuarioTCREAROMODANEXOMATptInstitucionMat);
            step10Request.setAnexoMatcrearpagrPeriodicidadInstance(userFunctionsSrv.fugetPeriodicidadMensualFun());
            step10Request.setAnexoMatcrearpatrFechaUltRegla(usuarioTCREAROMODANEXOMATptpatrFechaUltRegla);
            step10Request.setAnexoMatcrearpatrNumCuotas(usuarioTCREAROMODANEXOMATptpatrNumCuotas);
            anexoMatSrv.crearImplementation(step10Request);
        } else {
            com.keralty.aepersonas.viewmodel.anexomat.siu.TMODIFICARRequest step11Request = new com.keralty.aepersonas.viewmodel.anexomat.siu.TMODIFICARRequest();
            step11Request.setAnexoMatTMODIFICARpthisAnexoMatInstance(usuarioTCREAROMODANEXOMATpthisUsuario.getAnexoMat());
            step11Request.setAnexoMatTMODIFICARptpFechaUltRegla(usuarioTCREAROMODANEXOMATptpatrFechaUltRegla);
            step11Request.setAnexoMatTMODIFICARptpNumCuotas(usuarioTCREAROMODANEXOMATptpatrNumCuotas);
            step11Request.setAnexoMatTMODIFICARptInstitucionMatInstance(usuarioTCREAROMODANEXOMATptInstitucionMat);
            anexoMatSrv.tMODIFICARImplementation(step11Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    /*
     * Checks service TCREAROMODANEXOMAT preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    public ServiceResponse tCREAROMODANEXOMATCheckPreconditions(com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request) {
        ServiceResponse response = new ServiceResponse();
        request.setUsuarioTCREAROMODANEXOMATpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTCREAROMODANEXOMATpthisUsuario()));
        request.setUsuarioTCREAROMODANEXOMATptInstitucionMatInstance(institucionMatNeoSrv.getByOIDWithHV(new InstitucionMatNeoOid().fromJsonString(request.getUsuarioTCREAROMODANEXOMATptInstitucionMat())));
        try {
            if("Clas_1432633737216826Pre_5".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre5(request);
            if("Clas_1432633737216826Pre_6".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre6(request);
            if("Clas_1432633737216826Pre_14".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre14(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void tCREAROMODANEXOMATPreconditions(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request) 
            throws ModelException {
        checkClas1432633737216826Pre5(request);
        checkClas1432633737216826Pre6(request);
        checkClas1432633737216826Pre14(request);
    }

    private void checkClas1432633737216826Pre5 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request) 
            throws ModelException {
        // drvAceptaAnexoMat = TRUE

        Usuario usuarioTCREAROMODANEXOMATpthisUsuario = request.getUsuarioTCREAROMODANEXOMATpthisUsuarioInstance();
        boolean preconditionHolds = usuarioTCREAROMODANEXOMATpthisUsuario.getUsuariodrvAceptaAnexoMat().equals(true);
        if (!preconditionHolds) throw new PreconditionException("El dominio no acepta anexo de maternidad");
    }

    private void checkClas1432633737216826Pre6 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request) 
            throws ModelException {
        // UsuarioPersona.Genero = "F"

        Usuario usuarioTCREAROMODANEXOMATpthisUsuario = request.getUsuarioTCREAROMODANEXOMATpthisUsuarioInstance();
        boolean preconditionHolds = (usuarioTCREAROMODANEXOMATpthisUsuario.getUsuarioPersona().getPersonaGenero()).equals("F");
        if (!preconditionHolds) throw new PreconditionException("El anexo de maternidad sólo está habilitado para mujeres");
    }

    private void checkClas1432633737216826Pre14 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request) 
            throws ModelException {
        // drvTiempoEmbarazo > 0

        Usuario usuarioTCREAROMODANEXOMATpthisUsuario = request.getUsuarioTCREAROMODANEXOMATpthisUsuarioInstance();
        boolean preconditionHolds = usuarioTCREAROMODANEXOMATpthisUsuario.getUsuariodrvTiempoEmbarazo() > Long.valueOf(0);
        if (!preconditionHolds) throw new PreconditionException("La persona no se encuentra embarazada");
    }

    // Service: TCREAROMODANEXONEO

    /*
     * Entry point for service TCREAROMODANEXONEO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREAROMODANEXONEO(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tCREAROMODANEXONEOTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREAROMODANEXONEO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREAROMODANEXONEOTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request) throws ModelException, SystemException {
        request.setUsuarioTCREAROMODANEXONEOpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTCREAROMODANEXONEOpthisUsuario()));
        request.setUsuarioTCREAROMODANEXONEOptInstitucionNeoInstance(institucionMatNeoSrv.getByOIDWithHV(new InstitucionMatNeoOid().fromJsonString(request.getUsuarioTCREAROMODANEXONEOptInstitucionNeo())));
        return usuarioSrv.tCREAROMODANEXONEOImplementation(request);
    }

    /*
     * Implements service TCREAROMODANEXONEO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREAROMODANEXONEOImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        InstitucionMatNeo usuarioTCREAROMODANEXONEOptInstitucionNeo = request.getUsuarioTCREAROMODANEXONEOptInstitucionNeoInstance();
        Date usuarioTCREAROMODANEXONEOptpatrFechaUltRegla = request.getUsuarioTCREAROMODANEXONEOptpatrFechaUltRegla();
        Long usuarioTCREAROMODANEXONEOptpatrNumHijos = request.getUsuarioTCREAROMODANEXONEOptpatrNumHijos();
        Long usuarioTCREAROMODANEXONEOptpatrNumCuotas = request.getUsuarioTCREAROMODANEXONEOptpatrNumCuotas();
        Usuario usuarioTCREAROMODANEXONEOpthisUsuario = request.getUsuarioTCREAROMODANEXONEOpthisUsuarioInstance();

        request.checkArguments();

        tCREAROMODANEXONEOPreconditions(request);
        Usuario instance = usuarioTCREAROMODANEXONEOpthisUsuario;

        /* Action 1: IF (EXIST (AnexoNeo) = false) */
        boolean ifCondition1 = repository.assocOperator064(usuarioTCREAROMODANEXONEOpthisUsuario).equals(false);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CrearRequest step10Request = new com.keralty.aepersonas.viewmodel.anexoneo.siu.CrearRequest();
            step10Request.setAnexoNeocrearpagrUsuarioInstance(usuarioTCREAROMODANEXONEOpthisUsuario);
            step10Request.setAnexoNeocrearpagrInstitucionNeonatalInstance(usuarioTCREAROMODANEXONEOptInstitucionNeo);
            step10Request.setAnexoNeocrearpagrPeriodicidadInstance(userFunctionsSrv.fugetPeriodicidadMensualFun());
            step10Request.setAnexoNeocrearpatrFechaUltRegla(usuarioTCREAROMODANEXONEOptpatrFechaUltRegla);
            step10Request.setAnexoNeocrearpatrNumHijos(usuarioTCREAROMODANEXONEOptpatrNumHijos);
            step10Request.setAnexoNeocrearpatrNumCuotas(usuarioTCREAROMODANEXONEOptpatrNumCuotas);
            anexoNeoSrv.crearImplementation(step10Request);
        } else {
            com.keralty.aepersonas.viewmodel.anexoneo.siu.TMODIFICARRequest step11Request = new com.keralty.aepersonas.viewmodel.anexoneo.siu.TMODIFICARRequest();
            step11Request.setAnexoNeoTMODIFICARpthisAnexoNeoInstance(usuarioTCREAROMODANEXONEOpthisUsuario.getAnexoNeo());
            step11Request.setAnexoNeoTMODIFICARptpFechaUltRegla(usuarioTCREAROMODANEXONEOptpatrFechaUltRegla);
            step11Request.setAnexoNeoTMODIFICARptpNumHijos(usuarioTCREAROMODANEXONEOptpatrNumHijos);
            step11Request.setAnexoNeoTMODIFICARptpNumCuotas(usuarioTCREAROMODANEXONEOptpatrNumCuotas);
            step11Request.setAnexoNeoTMODIFICARptInstitucionNeoInstance(usuarioTCREAROMODANEXONEOptInstitucionNeo);
            anexoNeoSrv.tMODIFICARImplementation(step11Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    /*
     * Checks service TCREAROMODANEXONEO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    public ServiceResponse tCREAROMODANEXONEOCheckPreconditions(com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request) {
        ServiceResponse response = new ServiceResponse();
        request.setUsuarioTCREAROMODANEXONEOpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTCREAROMODANEXONEOpthisUsuario()));
        request.setUsuarioTCREAROMODANEXONEOptInstitucionNeoInstance(institucionMatNeoSrv.getByOIDWithHV(new InstitucionMatNeoOid().fromJsonString(request.getUsuarioTCREAROMODANEXONEOptInstitucionNeo())));
        try {
            if("Clas_1432633737216826Pre_8".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre8(request);
            if("Clas_1432633737216826Pre_9".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre9(request);
            if("Clas_1432633737216826Pre_10".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre10(request);
            if("Clas_1432633737216826Pre_15".equals(request.getPreconditionId()))
                checkClas1432633737216826Pre15(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void tCREAROMODANEXONEOPreconditions(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request) 
            throws ModelException {
        checkClas1432633737216826Pre8(request);
        checkClas1432633737216826Pre9(request);
        checkClas1432633737216826Pre10(request);
        checkClas1432633737216826Pre15(request);
    }

    private void checkClas1432633737216826Pre8 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request) 
            throws ModelException {
        // drvAceptaAnexoNeo = TRUE

        Usuario usuarioTCREAROMODANEXONEOpthisUsuario = request.getUsuarioTCREAROMODANEXONEOpthisUsuarioInstance();
        boolean preconditionHolds = usuarioTCREAROMODANEXONEOpthisUsuario.getUsuariodrvAceptaAnexoNeo().equals(true);
        if (!preconditionHolds) throw new PreconditionException("El dominio no acepta anexo neonatal");
    }

    private void checkClas1432633737216826Pre9 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request) 
            throws ModelException {
        // UsuarioPersona.Genero = "F"

        Usuario usuarioTCREAROMODANEXONEOpthisUsuario = request.getUsuarioTCREAROMODANEXONEOpthisUsuarioInstance();
        boolean preconditionHolds = (usuarioTCREAROMODANEXONEOpthisUsuario.getUsuarioPersona().getPersonaGenero()).equals("F");
        if (!preconditionHolds) throw new PreconditionException("El anexo neonatal sólo está habilitado para mujeres");
    }

    private void checkClas1432633737216826Pre10 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request) 
            throws ModelException {
        // drvTieneAnexoMat = TRUE

        Usuario usuarioTCREAROMODANEXONEOpthisUsuario = request.getUsuarioTCREAROMODANEXONEOpthisUsuarioInstance();
        boolean preconditionHolds = usuarioTCREAROMODANEXONEOpthisUsuario.getUsuariodrvTieneAnexoMat().equals(true);
        if (!preconditionHolds) throw new PreconditionException("Para incluir el anexo neonatal se deberá obligatoriamente haber incluido el anexo de maternidad");
    }

    private void checkClas1432633737216826Pre15 (
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request) 
            throws ModelException {
        // drvTiempoEmbarazo > 0

        Usuario usuarioTCREAROMODANEXONEOpthisUsuario = request.getUsuarioTCREAROMODANEXONEOpthisUsuarioInstance();
        boolean preconditionHolds = usuarioTCREAROMODANEXONEOpthisUsuario.getUsuariodrvTiempoEmbarazo() > Long.valueOf(0);
        if (!preconditionHolds) throw new PreconditionException("La persona no se encuentra embarazada");
    }

    // Service: TREGISTRARDATOSCORE

    /*
     * Entry point for service TREGISTRARDATOSCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tREGISTRARDATOSCORE(
            com.keralty.aepersonas.viewmodel.usuario.siu.TREGISTRARDATOSCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tREGISTRARDATOSCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TREGISTRARDATOSCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tREGISTRARDATOSCORETxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TREGISTRARDATOSCORERequest request) throws ModelException, SystemException {
        request.setUsuarioTREGISTRARDATOSCOREpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTREGISTRARDATOSCOREpthisUsuario()));
        request.setUsuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiarioInstance(estadoBeneficiarioSrv.getByOIDWithHV(request.getUsuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario()));
        return usuarioSrv.tREGISTRARDATOSCOREImplementation(request);
    }

    /*
     * Implements service TREGISTRARDATOSCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tREGISTRARDATOSCOREImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TREGISTRARDATOSCORERequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Long usuarioTREGISTRARDATOSCOREptpNumUsuario = request.getUsuarioTREGISTRARDATOSCOREptpNumUsuario();
        Boolean usuarioTREGISTRARDATOSCOREptpRequierExamenMedico = request.getUsuarioTREGISTRARDATOSCOREptpRequierExamenMedico();
        Long usuarioTREGISTRARDATOSCOREptpEstadoMedico = request.getUsuarioTREGISTRARDATOSCOREptpEstadoMedico();
        Double usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion = request.getUsuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion();
        Boolean usuarioTREGISTRARDATOSCOREptpTienePreexistencias = request.getUsuarioTREGISTRARDATOSCOREptpTienePreexistencias();
        Date usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia = request.getUsuarioTREGISTRARDATOSCOREptpFechaInicionVigencia();
        Date usuarioTREGISTRARDATOSCOREptpFechaFinVigencia = request.getUsuarioTREGISTRARDATOSCOREptpFechaFinVigencia();
        EstadoBeneficiario usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario = request.getUsuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiarioInstance();
        Usuario usuarioTREGISTRARDATOSCOREpthisUsuario = request.getUsuarioTREGISTRARDATOSCOREpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTREGISTRARDATOSCOREpthisUsuario;

        com.keralty.aepersonas.viewmodel.usuario.siu.RegistrarDatosCORERequest step1Request = new com.keralty.aepersonas.viewmodel.usuario.siu.RegistrarDatosCORERequest();
        step1Request.setUsuarioregistrarDatosCOREpthisUsuarioInstance(usuarioTREGISTRARDATOSCOREpthisUsuario);
        step1Request.setUsuarioregistrarDatosCOREpNumUsuario(usuarioTREGISTRARDATOSCOREptpNumUsuario);
        step1Request.setUsuarioregistrarDatosCOREpRequierExamenMedico(usuarioTREGISTRARDATOSCOREptpRequierExamenMedico);
        step1Request.setUsuarioregistrarDatosCOREpEstadoMedico(usuarioTREGISTRARDATOSCOREptpEstadoMedico);
        step1Request.setUsuarioregistrarDatosCOREpValorCuotaInscripcion(usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion);
        step1Request.setUsuarioregistrarDatosCOREpTienePreexistencias(usuarioTREGISTRARDATOSCOREptpTienePreexistencias);
        step1Request.setUsuarioregistrarDatosCOREpFechaInicionVigencia(usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia);
        step1Request.setUsuarioregistrarDatosCOREpFechaFinVigencia(usuarioTREGISTRARDATOSCOREptpFechaFinVigencia);
        usuarioSrv.registrarDatosCOREImplementation(step1Request);

        boolean guard2 = repository.assocOperator065(usuarioTREGISTRARDATOSCOREpthisUsuario).equals(false) && (usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario != null && !usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario.isNull());

        if (guard2) {
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest step2Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest();
            step2Request.setUsuarioInsEstadoBeneficiarioCOREpthisUsuarioInstance(usuarioTREGISTRARDATOSCOREpthisUsuario);
            step2Request.setUsuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario);
            usuarioSrv.insEstadoBeneficiarioCOREImplementation(step2Request, true);
        }

        boolean guard3 = repository.assocOperator066(usuarioTREGISTRARDATOSCOREpthisUsuario).equals(true) && (usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario == null || usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario.isNull());

        if (guard3) {
            com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest step3Request = new com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest();
            step3Request.setUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance(usuarioTREGISTRARDATOSCOREpthisUsuario);
            step3Request.setUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(usuarioTREGISTRARDATOSCOREpthisUsuario.getEstadoBeneficiario());
            usuarioSrv.delEstadoBeneficiarioCOREImplementation(step3Request, true);
        }

        /* Action 4: IF (EXIST (EstadoBeneficiario) = true AND ptpevcEstadoBeneficiario <> NULL AND EstadoBeneficiario <> ptpevcEstadoBeneficiario) */
        boolean ifCondition4 = repository.assocOperator068(usuarioTREGISTRARDATOSCOREpthisUsuario).equals(true) && (usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario != null && !usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario.isNull()) && !(usuarioTREGISTRARDATOSCOREpthisUsuario.getEstadoBeneficiario().equalsObject(usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario));
        if (ifCondition4) {
            com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest step40Request = new com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest();
            step40Request.setUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance(usuarioTREGISTRARDATOSCOREpthisUsuario);
            step40Request.setUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(usuarioTREGISTRARDATOSCOREpthisUsuario.getEstadoBeneficiario());
            usuarioSrv.delEstadoBeneficiarioCOREImplementation(step40Request, true);
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest step41Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest();
            step41Request.setUsuarioInsEstadoBeneficiarioCOREpthisUsuarioInstance(usuarioTREGISTRARDATOSCOREpthisUsuario);
            step41Request.setUsuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario);
            usuarioSrv.insEstadoBeneficiarioCOREImplementation(step41Request, true);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TACTDESDECORE

    /*
     * Entry point for service TACTDESDECORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tACTDESDECORE(
            com.keralty.aepersonas.viewmodel.usuario.siu.TACTDESDECORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tACTDESDECORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TACTDESDECORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tACTDESDECORETxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TACTDESDECORERequest request) throws ModelException, SystemException {
        request.setUsuarioTACTDESDECOREpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTACTDESDECOREpthisUsuario()));
        request.setUsuarioTACTDESDECOREpBeneficiarioCInstance(beneficiarioCSrv.getByOIDWithHV(request.getUsuarioTACTDESDECOREpBeneficiarioC()));
        return usuarioSrv.tACTDESDECOREImplementation(request);
    }

    /*
     * Implements service TACTDESDECORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tACTDESDECOREImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TACTDESDECORERequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC = request.getUsuarioTACTDESDECOREpBeneficiarioCInstance();
        Usuario usuarioTACTDESDECOREpthisUsuario = request.getUsuarioTACTDESDECOREpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTACTDESDECOREpthisUsuario;

        for(Preexistencia step1Entity : repository.assocOperator069(usuarioTACTDESDECOREpthisUsuario)) {
            com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest step1Request = new com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest();
            step1Request.setPreexistenciaeliminarpthisPreexistenciaInstance(step1Entity);
            preexistenciaSrv.eliminarImplementation(step1Request);
        }

        for(PreexistenciaC step2Entity : repository.assocOperator070(usuarioTACTDESDECOREpthisUsuario, usuarioTACTDESDECOREpBeneficiarioC)) {
            com.keralty.aepersonas.viewmodel.preexistencia.siu.CrearRequest step2Request = new com.keralty.aepersonas.viewmodel.preexistencia.siu.CrearRequest();
            step2Request.setPreexistenciacrearpagrUsuarioInstance(usuarioTACTDESDECOREpthisUsuario);
            step2Request.setPreexistenciacrearpatrDescripcion(step2Entity.getPreexistenciaCDescripcion());
            step2Request.setPreexistenciacrearpatrFecInicio(step2Entity.getPreexistenciaCFecInicio());
            step2Request.setPreexistenciacrearpatrFecFin(step2Entity.getPreexistenciaCFecFin());
            step2Request.setPreexistenciacrearpatrObservacion(step2Entity.getPreexistenciaCObservacion());
            preexistenciaSrv.crearImplementation(step2Request);
        }

        /* Action 3: IF (EXIST (pBeneficiarioC.EstadoBeneficiarioC) = true) */
        boolean ifCondition3 = repository.assocOperator073(usuarioTACTDESDECOREpBeneficiarioC).equals(true);
        if (ifCondition3) {
            /* Action 30: IF (EstadoBeneficiario <> pBeneficiarioC.EstadoBeneficiarioC) */
            boolean ifCondition30 = !(usuarioTACTDESDECOREpthisUsuario.getEstadoBeneficiario().equalsObject(usuarioTACTDESDECOREpBeneficiarioC.getEstadoBeneficiarioC()));
            if (ifCondition30) {
                /* Action 300: IF (EXIST (EstadoBeneficiario) = true) */
                boolean ifCondition300 = repository.assocOperator074(usuarioTACTDESDECOREpthisUsuario).equals(true);
                if (ifCondition300) {
                    com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest step3000Request = new com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest();
                    step3000Request.setUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance(usuarioTACTDESDECOREpthisUsuario);
                    step3000Request.setUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(usuarioTACTDESDECOREpthisUsuario.getEstadoBeneficiario());
                    usuarioSrv.delEstadoBeneficiarioCOREImplementation(step3000Request, true);
                }
                com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest step301Request = new com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest();
                step301Request.setUsuarioInsEstadoBeneficiarioCOREpthisUsuarioInstance(usuarioTACTDESDECOREpthisUsuario);
                step301Request.setUsuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(usuarioTACTDESDECOREpBeneficiarioC.getEstadoBeneficiarioC());
                usuarioSrv.insEstadoBeneficiarioCOREImplementation(step301Request, true);
            }
        }

        com.keralty.aepersonas.viewmodel.usuario.siu.ModificarAttrRequest step4Request = new com.keralty.aepersonas.viewmodel.usuario.siu.ModificarAttrRequest();
        step4Request.setUsuariomodificarAttrpthisAttrUsuarioInstance(usuarioTACTDESDECOREpthisUsuario);
        step4Request.setUsuariomodificarAttrpBebeGestante(usuarioTACTDESDECOREpBeneficiarioC.getBeneficiarioCIndicadorBBGestacion());
        step4Request.setUsuariomodificarAttrpcodigoBancoRep(usuarioTACTDESDECOREpBeneficiarioC.getBeneficiarioCCodUsuarioBancoRep());
        step4Request.setUsuariomodificarAttrpFechaAntiguedad(usuarioTACTDESDECOREpthisUsuario.getUsuarioFechaAntiguedadBeneficiario());
        step4Request.setUsuariomodificarAttrpePolizaInternacional(usuarioTACTDESDECOREpthisUsuario.getUsuarioPolizaInternacional());
        usuarioSrv.modificarAttrImplementation(step4Request);

        com.keralty.aepersonas.viewmodel.usuario.siu.RegistrarDatosCORERequest step5Request = new com.keralty.aepersonas.viewmodel.usuario.siu.RegistrarDatosCORERequest();
        step5Request.setUsuarioregistrarDatosCOREpthisUsuarioInstance(usuarioTACTDESDECOREpthisUsuario);
        step5Request.setUsuarioregistrarDatosCOREpNumUsuario(usuarioTACTDESDECOREpBeneficiarioC.getBeneficiarioCNumUsuario());
        step5Request.setUsuarioregistrarDatosCOREpRequierExamenMedico(usuarioTACTDESDECOREpBeneficiarioC.getBeneficiarioCRequiereExamenMedico());
        step5Request.setUsuarioregistrarDatosCOREpEstadoMedico(usuarioTACTDESDECOREpBeneficiarioC.getBeneficiarioCEstadoMedico());
        step5Request.setUsuarioregistrarDatosCOREpValorCuotaInscripcion(usuarioTACTDESDECOREpBeneficiarioC.getBeneficiarioCValorCuotaInscripcion());
        step5Request.setUsuarioregistrarDatosCOREpTienePreexistencias(usuarioTACTDESDECOREpBeneficiarioC.getBeneficiarioCTienePreexistencias());
        step5Request.setUsuarioregistrarDatosCOREpFechaInicionVigencia(usuarioTACTDESDECOREpBeneficiarioC.getBeneficiarioCFechaInicioVigencia());
        step5Request.setUsuarioregistrarDatosCOREpFechaFinVigencia(usuarioTACTDESDECOREpBeneficiarioC.getBeneficiarioCFechaFinVigencia());
        usuarioSrv.registrarDatosCOREImplementation(step5Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TNOTIFICARDOCUMENTO

    /*
     * Entry point for service TNOTIFICARDOCUMENTO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tNOTIFICARDOCUMENTO(
            com.keralty.aepersonas.viewmodel.usuario.siu.TNOTIFICARDOCUMENTORequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tNOTIFICARDOCUMENTOTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TNOTIFICARDOCUMENTO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tNOTIFICARDOCUMENTOTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TNOTIFICARDOCUMENTORequest request) throws ModelException {
        request.setUsuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTNOTIFICARDOCUMENTOpthisUsuario()));
        return usuarioSrv.tNOTIFICARDOCUMENTOImplementation(request);
    }

    /*
     * Implements service TNOTIFICARDOCUMENTO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tNOTIFICARDOCUMENTOImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TNOTIFICARDOCUMENTORequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Long usuarioTNOTIFICARDOCUMENTOpTipoDocumento = request.getUsuarioTNOTIFICARDOCUMENTOpTipoDocumento();
        Usuario usuarioTNOTIFICARDOCUMENTOpthisUsuario = request.getUsuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTNOTIFICARDOCUMENTOpthisUsuario;

        /* Action 1: IF (pTipoDocumento = 1) */
        boolean ifCondition1 = (usuarioTNOTIFICARDOCUMENTOpTipoDocumento).equals(Long.valueOf(1));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocIdentificacionRequest step10Request = new com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocIdentificacionRequest();
            step10Request.setUsuariosetTieneDocIdentificacionpthisUsuarioInstance(usuarioTNOTIFICARDOCUMENTOpthisUsuario);
            usuarioSrv.setTieneDocIdentificacionImplementation(step10Request);
        } else {
            com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocsSolicitudRequest step11Request = new com.keralty.aepersonas.viewmodel.usuario.siu.SetTieneDocsSolicitudRequest();
            step11Request.setUsuariosetTieneDocsSolicitudpthisUsuarioInstance(usuarioTNOTIFICARDOCUMENTOpthisUsuario);
            usuarioSrv.setTieneDocsSolicitudImplementation(step11Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TELIMINARSINPREC

    /*
     * Entry point for service TELIMINARSINPREC
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tELIMINARSINPREC(
            com.keralty.aepersonas.viewmodel.usuario.siu.TELIMINARSINPRECRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tELIMINARSINPRECTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TELIMINARSINPREC
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tELIMINARSINPRECTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TELIMINARSINPRECRequest request) throws ModelException, SystemException {
        request.setUsuarioTELIMINARSINPRECpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTELIMINARSINPRECpthisUsuario()));
        return usuarioSrv.tELIMINARSINPRECImplementation(request);
    }

    /*
     * Implements service TELIMINARSINPREC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tELIMINARSINPRECImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TELIMINARSINPRECRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioTELIMINARSINPRECpthisUsuario = request.getUsuarioTELIMINARSINPRECpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTELIMINARSINPRECpthisUsuario;

        /* Action 1: IF (EXIST (CuestionarioP) = true) */
        boolean ifCondition1 = repository.assocOperator079(usuarioTELIMINARSINPRECpthisUsuario).equals(true);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TELIMINARRequest step10Request = new com.keralty.aepersonas.viewmodel.cuestionariop.siu.TELIMINARRequest();
            step10Request.setCuestionarioPTELIMINARpthisCuestionarioPInstance(usuarioTELIMINARSINPRECpthisUsuario.getCuestionarioP());
            cuestionarioPSrv.tELIMINARImplementation(step10Request);
        }

        /* Action 2: IF (EXIST (AnexoMat) = true) */
        boolean ifCondition2 = repository.assocOperator080(usuarioTELIMINARSINPRECpthisUsuario).equals(true);
        if (ifCondition2) {
            com.keralty.aepersonas.viewmodel.anexomat.siu.EliminarRequest step20Request = new com.keralty.aepersonas.viewmodel.anexomat.siu.EliminarRequest();
            step20Request.setAnexoMateliminarpthisAnexoMatInstance(usuarioTELIMINARSINPRECpthisUsuario.getAnexoMat());
            anexoMatSrv.eliminarImplementation(step20Request);
        }

        /* Action 3: IF (EXIST (AnexoNeo) = true) */
        boolean ifCondition3 = repository.assocOperator081(usuarioTELIMINARSINPRECpthisUsuario).equals(true);
        if (ifCondition3) {
            com.keralty.aepersonas.viewmodel.anexoneo.siu.EliminarRequest step30Request = new com.keralty.aepersonas.viewmodel.anexoneo.siu.EliminarRequest();
            step30Request.setAnexoNeoeliminarpthisAnexoNeoInstance(usuarioTELIMINARSINPRECpthisUsuario.getAnexoNeo());
            anexoNeoSrv.eliminarImplementation(step30Request);
        }

        for(Preexistencia step4Entity : repository.assocOperator078(usuarioTELIMINARSINPRECpthisUsuario)) {
            com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest step4Request = new com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest();
            step4Request.setPreexistenciaeliminarpthisPreexistenciaInstance(step4Entity);
            preexistenciaSrv.eliminarImplementation(step4Request);
        }

        com.keralty.aepersonas.viewmodel.usuario.siu.EliminarRequest step5Request = new com.keralty.aepersonas.viewmodel.usuario.siu.EliminarRequest();
        step5Request.setUsuarioeliminarpthisAttrUsuarioInstance(usuarioTELIMINARSINPRECpthisUsuario);
        usuarioSrv.eliminarImplementation(step5Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TRECREARCUESMEDICO

    /*
     * Entry point for service TRECREARCUESMEDICO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tRECREARCUESMEDICO(
            com.keralty.aepersonas.viewmodel.usuario.siu.TRECREARCUESMEDICORequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tRECREARCUESMEDICOTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TRECREARCUESMEDICO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tRECREARCUESMEDICOTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TRECREARCUESMEDICORequest request) throws ModelException, SystemException {
        request.setUsuarioTRECREARCUESMEDICOpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTRECREARCUESMEDICOpthisUsuario()));
        return usuarioSrv.tRECREARCUESMEDICOImplementation(request);
    }

    /*
     * Implements service TRECREARCUESMEDICO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tRECREARCUESMEDICOImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TRECREARCUESMEDICORequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioTRECREARCUESMEDICOpthisUsuario = request.getUsuarioTRECREARCUESMEDICOpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTRECREARCUESMEDICOpthisUsuario;

        /* Action 1: IF (EXIST (CuestionarioP) = true) */
        boolean ifCondition1 = repository.assocOperator083(usuarioTRECREARCUESMEDICOpthisUsuario).equals(true);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TELIMINARRequest step10Request = new com.keralty.aepersonas.viewmodel.cuestionariop.siu.TELIMINARRequest();
            step10Request.setCuestionarioPTELIMINARpthisCuestionarioPInstance(usuarioTRECREARCUESMEDICOpthisUsuario.getCuestionarioP());
            cuestionarioPSrv.tELIMINARImplementation(step10Request);
        }

        com.keralty.aepersonas.viewmodel.usuario.siu.CalcularIMCRequest step2Request = new com.keralty.aepersonas.viewmodel.usuario.siu.CalcularIMCRequest();
        step2Request.setUsuariocalcularIMCpthisUsuarioInstance(usuarioTRECREARCUESMEDICOpthisUsuario);
        usuarioSrv.calcularIMCImplementation(step2Request);

        com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICORequest step3Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICORequest();
        step3Request.setUsuarioTCREARCUESMEDICOpthisUsuarioInstance(usuarioTRECREARCUESMEDICOpthisUsuario);
        usuarioSrv.tCREARCUESMEDICOImplementation(step3Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TCARGARPREEXIST

    /*
     * Entry point for service TCARGARPREEXIST
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCARGARPREEXIST(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCARGARPREEXISTRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tCARGARPREEXISTTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCARGARPREEXIST
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCARGARPREEXISTTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCARGARPREEXISTRequest request) throws ModelException, SystemException {
        request.setUsuarioTCARGARPREEXISTpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTCARGARPREEXISTpthisUsuario()));
        return usuarioSrv.tCARGARPREEXISTImplementation(request);
    }

    /*
     * Implements service TCARGARPREEXIST
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCARGARPREEXISTImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCARGARPREEXISTRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Usuario usuarioTCARGARPREEXISTpthisUsuario = request.getUsuarioTCARGARPREEXISTpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTCARGARPREEXISTpthisUsuario;

        for(Preexistencia step1Entity : repository.assocOperator084(usuarioTCARGARPREEXISTpthisUsuario)) {
            com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest step1Request = new com.keralty.aepersonas.viewmodel.preexistencia.siu.EliminarRequest();
            step1Request.setPreexistenciaeliminarpthisPreexistenciaInstance(step1Entity);
            preexistenciaSrv.eliminarImplementation(step1Request);
        }

        com.keralty.aepersonas.viewmodel.preexistencia.siu.CrearRequest step2Request = new com.keralty.aepersonas.viewmodel.preexistencia.siu.CrearRequest();
        step2Request.setPreexistenciacrearpagrUsuarioInstance(usuarioTCARGARPREEXISTpthisUsuario);
        step2Request.setPreexistenciacrearpatrDescripcion("");
        step2Request.setPreexistenciacrearpatrFecInicio(STDFunctions.systemDateFun());
        step2Request.setPreexistenciacrearpatrFecFin(STDFunctions.systemDateFun());
        step2Request.setPreexistenciacrearpatrObservacion("");
        preexistenciaSrv.crearImplementation(step2Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TADDPREEXIST

    /*
     * Entry point for service TADDPREEXIST
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tADDPREEXIST(
            com.keralty.aepersonas.viewmodel.usuario.siu.TADDPREEXISTRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tADDPREEXISTTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TADDPREEXIST
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tADDPREEXISTTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TADDPREEXISTRequest request) throws ModelException, SystemException {
        request.setUsuarioTADDPREEXISTpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTADDPREEXISTpthisUsuario()));
        return usuarioSrv.tADDPREEXISTImplementation(request);
    }

    /*
     * Implements service TADDPREEXIST
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tADDPREEXISTImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TADDPREEXISTRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        String usuarioTADDPREEXISTptpatrDescripcion = request.getUsuarioTADDPREEXISTptpatrDescripcion();
        Date usuarioTADDPREEXISTptpatrFecInicio = request.getUsuarioTADDPREEXISTptpatrFecInicio();
        Date usuarioTADDPREEXISTptpatrFecFin = request.getUsuarioTADDPREEXISTptpatrFecFin();
        String usuarioTADDPREEXISTptpatrObservacion = request.getUsuarioTADDPREEXISTptpatrObservacion();
        Usuario usuarioTADDPREEXISTpthisUsuario = request.getUsuarioTADDPREEXISTpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTADDPREEXISTpthisUsuario;

        /* Action 1: IF (EXIST (Preexistencias) WHERE (Preexistencias.Descripcion = ptpatrDescripcion AND Preexistencias.FecInicio = ptpatrFecInicio AND Preexistencias.FecFin = ptpatrFecFin) = false) */
        boolean ifCondition1 = repository.assocOperator086(usuarioTADDPREEXISTpthisUsuario, usuarioTADDPREEXISTptpatrDescripcion, usuarioTADDPREEXISTptpatrFecInicio, usuarioTADDPREEXISTptpatrFecFin).equals(false);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.preexistencia.siu.CrearRequest step10Request = new com.keralty.aepersonas.viewmodel.preexistencia.siu.CrearRequest();
            step10Request.setPreexistenciacrearpagrUsuarioInstance(usuarioTADDPREEXISTpthisUsuario);
            step10Request.setPreexistenciacrearpatrDescripcion(usuarioTADDPREEXISTptpatrDescripcion);
            step10Request.setPreexistenciacrearpatrFecInicio(usuarioTADDPREEXISTptpatrFecInicio);
            step10Request.setPreexistenciacrearpatrFecFin(usuarioTADDPREEXISTptpatrFecFin);
            step10Request.setPreexistenciacrearpatrObservacion(usuarioTADDPREEXISTptpatrObservacion);
            preexistenciaSrv.crearImplementation(step10Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

        return response;
    }

    // Service: TCREARCUESMEDICOAUX

    /*
     * Entry point for service TCREARCUESMEDICOAUX
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARCUESMEDICOAUX(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICOAUXRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = usuarioSrv.tCREARCUESMEDICOAUXTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARCUESMEDICOAUX
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARCUESMEDICOAUXTxn(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICOAUXRequest request) throws ModelException, SystemException {
        request.setUsuarioTCREARCUESMEDICOAUXpthisUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getUsuarioTCREARCUESMEDICOAUXpthisUsuario()));
        return usuarioSrv.tCREARCUESMEDICOAUXImplementation(request);
    }

    /*
     * Implements service TCREARCUESMEDICOAUX
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARCUESMEDICOAUXImplementation(
            com.keralty.aepersonas.viewmodel.usuario.siu.TCREARCUESMEDICOAUXRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Date usuarioTCREARCUESMEDICOAUXptFechafinVigenciaUsuario = request.getUsuarioTCREARCUESMEDICOAUXptFechafinVigenciaUsuario();
        Usuario usuarioTCREARCUESMEDICOAUXpthisUsuario = request.getUsuarioTCREARCUESMEDICOAUXpthisUsuarioInstance();

        request.checkArguments();
        Usuario instance = usuarioTCREARCUESMEDICOAUXpthisUsuario;

        /* Action 1: IF (ptFechafinVigenciaUsuario = NULL OR (Solicitud.FInicioContrato > ptFechafinVigenciaUsuario AND daysDifferenceFromDate(ptFechafinVigenciaUsuario, Solicitud.FInicioContrato) > 31)) */
        boolean ifCondition1 = usuarioTCREARCUESMEDICOAUXptFechafinVigenciaUsuario == null || (STDFunctions.dateAfterFun(usuarioTCREARCUESMEDICOAUXpthisUsuario.getSolicitud().getSolicitudFInicioContrato(),usuarioTCREARCUESMEDICOAUXptFechafinVigenciaUsuario) && STDFunctions.daysDifferenceFromDateFun(usuarioTCREARCUESMEDICOAUXptFechafinVigenciaUsuario, usuarioTCREARCUESMEDICOAUXpthisUsuario.getSolicitud().getSolicitudFInicioContrato()) > Long.valueOf(31));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCREARYSECCIONESRequest step10Request = new com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCREARYSECCIONESRequest();
            step10Request.setCuestionarioPTCREARYSECCIONESptUsuarioInstance(usuarioTCREARCUESMEDICOAUXpthisUsuario);
            step10Request.setCuestionarioPTCREARYSECCIONESptCuestionarioInstance(userFunctionsSrv.fugetCuestionarioMedicoFun());
            cuestionarioPSrv.tCREARYSECCIONESImplementation(step10Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICUsuario());

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
            SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AGENTE, FuncionarioConstants.CLASS_NAME);
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
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AGENTE + "." + FuncionarioConstants.ATTR_NAME_FUNCIONARIOCODJEFE, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(agentInstance.getFuncionarioUsuario(), Constants.Type.STRING.getTypeName()));
            comparison1.addOperand(comparison4);
        
        disjunction.addOperand(comparison1);
    }

    }


    private void suppInfo4ICUsuario(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION + "." + TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONNOMBRECORTO, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison1);

            SQLWhereComparison comparison2 = new SQLWhereComparison(select);
            comparison2.setOperator("LIKE");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison2);

            SQLWhereConjunction conjunction = new SQLWhereConjunction();
            conjunction.addDisjunction(disjunction);
            select.addConjunction(conjunction);
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    @Override
    protected void applyOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        applyOCOCPorId(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, false), true);
        select.getOrderByPart().addItem(Constants.normalizePath(UsuarioConstants.CLASS_NAME, UsuarioConstants.ATTR_FIELD_USUARIOIDENTIFICADOR, false), true);
    }


    private void applyOCOCPorId(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_PorId".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(UsuarioConstants.CLASS_NAME, UsuarioConstants.ATTR_NAME_USUARIOIDENTIFICADOR, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildUsuarioRelatedInstance(relatedInstanceJsonOid);
        }
        if (UsuarioConstants.ROLE_NAME_CUESTIONARIOP.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4CuestionarioP(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_ANEXOMAT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4AnexoMat(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_ANEXONEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4AnexoNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_PREEXISTENCIAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Preexistencia(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_USUARIOPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_EPS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Eps(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_PARENTESCO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Parentesco(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_COMPANYIA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Companyia(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4EstadoBeneficiario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildUsuarioRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4CuestionarioP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new CuestionarioP(mapper.readValue(relatedInstanceJsonOid, CuestionarioPOid.class)): CuestionarioP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4AnexoMat(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new AnexoMat(mapper.readValue(relatedInstanceJsonOid, AnexoMatOid.class)): AnexoMat.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4AnexoNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class)): AnexoNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4Preexistencia(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Preexistencia(mapper.readValue(relatedInstanceJsonOid, PreexistenciaOid.class)): Preexistencia.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4Eps(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Eps(mapper.readValue(relatedInstanceJsonOid, EpsOid.class)): Eps.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4Parentesco(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class)): Parentesco.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4Companyia(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Companyia(mapper.readValue(relatedInstanceJsonOid, CompanyiaOid.class)): Companyia.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildUsuarioRelatedInstance4EstadoBeneficiario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class)): EstadoBeneficiario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            UsuarioOid oid = new UsuarioOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAesolicitudesidsolicitud(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(UsuarioConstants.ATTR_FIELD_USUARIOIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(oid.getUsuarioIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison2);
        } catch (Exception e) {
            LoggerFactory.getLogger(UsuarioService.class).error(e.getMessage());
        }
    }

}
