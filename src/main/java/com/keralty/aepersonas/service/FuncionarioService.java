package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AfiliacionesConstants;
import com.keralty.aepersonas.global.AreaMedicaConstants;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.GrupoAsignacionConstants;
import com.keralty.aepersonas.global.RespRegionalConstants;
import com.keralty.aepersonas.global.RolConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.ContratoC;
import com.keralty.aepersonas.persistence.Firma;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.GrupoAsignacion;
import com.keralty.aepersonas.persistence.ObsEstado;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.FirmaOid;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionOid;
import com.keralty.aepersonas.persistence.oid.ObsEstadoOid;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.RegionalOid;
import com.keralty.aepersonas.persistence.oid.RolOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.SucursalOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Planes;
import com.keralty.aepersonas.persistence.Regional;
import com.keralty.aepersonas.persistence.Rol;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.SolicitudNovedad;
import com.keralty.aepersonas.persistence.Sucursal;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.repository.FuncionarioJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereNegation;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandSubQuery;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandThis;
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
public class FuncionarioService extends AbstractService {

    FuncionarioJpaRepository repository;

    SolicitudService solicitudSrv;

    GrupoAsignacionService grupoAsignacionSrv;

    ObsEstadoService obsEstadoSrv;

    SolicitudNovedadService solicitudNovedadSrv;

    ContratoCService contratoCSrv;

    FirmaService firmaSrv;

    RolService rolSrv;

    SucursalService sucursalSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    PlanesService planesSrv;

    RegionalService regionalSrv;

    UserFunctions userFunctionsSrv;

    @Inject
    public FuncionarioService(
            SolicitudService solicitudSrv,
            GrupoAsignacionService grupoAsignacionSrv,
            ObsEstadoService obsEstadoSrv,
            SolicitudNovedadService solicitudNovedadSrv,
            ContratoCService contratoCSrv,
            FirmaService firmaSrv,
            RolService rolSrv,
            SucursalService sucursalSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            PlanesService planesSrv,
            RegionalService regionalSrv,
            UserFunctions userFunctionsSrv,
            FuncionarioJpaRepository repository) {
        this.solicitudSrv = solicitudSrv;
        this.grupoAsignacionSrv = grupoAsignacionSrv;
        this.obsEstadoSrv = obsEstadoSrv;
        this.solicitudNovedadSrv = solicitudNovedadSrv;
        this.contratoCSrv = contratoCSrv;
        this.firmaSrv = firmaSrv;
        this.rolSrv = rolSrv;
        this.sucursalSrv = sucursalSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.planesSrv = planesSrv;
        this.regionalSrv = regionalSrv;
        this.userFunctionsSrv = userFunctionsSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, FuncionarioConstants.CLASS_NAME);
    }

    private List<Funcionario> solveFuncionarioTypedQuery(QueryRequest request) {
        boolean hasInMemoryFilters = hasInMemoryFilters(request);
        int requestedPageSize = request.getPageSize();
        int pageSize = requestedPageSize >= 0
                && requestedPageSize <= Constants.MAX_BLOCKSIZE
                ? requestedPageSize
                : Constants.DEFAULT_BLOCKSIZE;
        int pageNumber = Math.max(1, request.getPageNumber());

    	List<Funcionario> results = repository.solveQuery(processQueryRequest(request, FuncionarioConstants.CLASS_NAME), (hasInMemoryFilters ? 0 : pageSize), (hasInMemoryFilters ? 1 : pageNumber)).stream()
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
    
    private int solveFuncionarioTypedCountQuery(QueryRequest request) {
        return hasInMemoryFilters(request)
               ? repository.solveQuery(processQueryRequest(request, FuncionarioConstants.CLASS_NAME)).stream().filter(instance -> applyMemoryFilters(request, instance)).collect(Collectors.toList()).size()
               : repository.solveCountQuery(processCountQueryRequest(request, FuncionarioConstants.CLASS_NAME));
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
        if ("Solicitud_TREASIGNARUSUARIOS_ptUsrAfiliacion_NavFilter0".equalsIgnoreCase(filterRequest.getName())) {
            return true;
        }
        if ("SolicitudNovedad_TREASIGNARUSUARIOS_ptUsrAfiliacion_NavFilter0".equalsIgnoreCase(filterRequest.getName())) {
            return true;
        }
        if ("GrupoAsignacion_TADDUSUARIO_ptFuncionario_NavFilter0".equalsIgnoreCase(filterRequest.getName())) {
            return true;
        }
        return false;
    }

    /*
     * Returns the population of class Funcionario
     *
     * @return Population of class Funcionario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Funcionario> get() {
        List<Funcionario> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Funcionario
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Funcionario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Funcionario> instances = get(queryRequest);
        if(FuncionarioConstants.DSICAGENTE.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICAgente())).collect(Collectors.toList());
        }
        if(FuncionarioConstants.DSDSAGENTEPIU.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSAgentePIU())).collect(Collectors.toList());
        }
        if(FuncionarioConstants.DSDSFUNCIONARIODREPORTES.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSFuncionarioDReportes())).collect(Collectors.toList());
        }
        if(FuncionarioConstants.DSDSFUNCIONARIODGRUPO.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSFuncionarioDGrupo())).collect(Collectors.toList());
        }
        if(FuncionarioConstants.DSICUSUARIOLDAP.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICUsuarioLDAP())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Funcionario that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Funcionario matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Funcionario> get(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveFuncionarioTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveFuncionarioTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveFuncionarioTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveFuncionarioTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Funcionario by ID
     *
     * @param funcionarioId Identification field funcionarioId
     *
     * @return Instance of Funcionario
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Funcionario getById(Long funcionarioId) {
        return getByOID(new FuncionarioOid(funcionarioId));
    }
    
    /*
     * Returns an instance of Funcionario by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Funcionario
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Funcionario getByOID(FuncionarioOid oid) {
        Optional<Funcionario> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Funcionario by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Funcionario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Funcionario getByOIDWithHV(FuncionarioOid oid) {
        Optional<Funcionario> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Funcionario> getInstanceByOid(FuncionarioOid oid) {
        return oid != null && oid.getFuncionarioId() != null
               ? repository.findById(oid.getFuncionarioId())
               : Optional.empty();
    }

    /*
     * Returns an instance of Funcionario by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Funcionario
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Funcionario getByJsonOid(String jsonOid) {
        FuncionarioOid oid = new FuncionarioOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Funcionario related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Funcionario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Funcionario> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveFuncionarioTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Funcionario related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Funcionario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Funcionario> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Funcionario
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Funcionario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getFuncionarioDynamic(FuncionarioOid oid, String displaySetItems) {
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
    public String getSuppInfo(FuncionarioOid oid, String dsName) {
        Funcionario instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Funcionario instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (FuncionarioConstants.DSICAGENTE.equals(dsName))
            return instance.buildICAgente();
        if (FuncionarioConstants.DSICUSUARIOLDAP.equals(dsName))
            return instance.buildICUsuarioLDAP();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Funcionario instance, String dsName) {
        if (FuncionarioConstants.DSICAGENTE.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICAgente());
        if (FuncionarioConstants.DSDSAGENTEPIU.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSAgentePIU());
        if (FuncionarioConstants.DSDSFUNCIONARIODREPORTES.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSFuncionarioDReportes());
        if (FuncionarioConstants.DSDSFUNCIONARIODGRUPO.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSFuncionarioDGrupo());
        if (FuncionarioConstants.DSICUSUARIOLDAP.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICUsuarioLDAP());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (FuncionarioConstants.FILTER_NAME_IFILTERFUNCIONARIOPORNUMUSU.equalsIgnoreCase(filterRequest.getName()))
            iFilterFuncionarioPorNumUsu(filterRequest, sql);
        if (FuncionarioConstants.FILTER_NAME_IFILTERPORUSUARIOLDAP.equalsIgnoreCase(filterRequest.getName()))
            iFilterPorUsuarioLDAP(filterRequest, sql);
        if (FuncionarioConstants.FILTER_NAME_FFUNCIONARIOPORNOMBRE.equalsIgnoreCase(filterRequest.getName()))
            fFuncionarioPorNombre(filterRequest, sql);
        if (FuncionarioConstants.FILTER_NAME_FFUNCIONARIOPORNOMBRENOASESO.equalsIgnoreCase(filterRequest.getName()))
            fFuncionarioPorNombreNoAseso(filterRequest, sql);
    }

    @Override
    protected void applyNavigationalFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if ("Solicitud_TREASIGNARUSUARIOS_ptUsrAfiliacion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431957012480960FiltNav69(sql);
        if ("SolicitudNovedad_TREASIGNARUSUARIOS_ptUsrAfiliacion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1581421428736234FiltNav26(sql);
        if ("GrupoAsignacion_TADDUSUARIO_ptFuncionario_NavFilter1".equalsIgnoreCase(filterRequest.getName()))
            clas1586850168832947FiltNav4(filterRequest, sql);
        if ("GrupoAsignacion_TDELUSUARIO_ptFuncionario_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1586850168832947FiltNav2(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_Agente".equals(filterRequest.getName()))
            suppInfo4ICAgente(filterRequest.getFilterVariable("searchText").toString(), sql);
        if ("SuppInfo_IC_UsuarioLDAP".equals(filterRequest.getName()))
            suppInfo4ICUsuarioLDAP(filterRequest.getFilterVariable("searchText").toString(), sql);
    }

    private boolean applyMemoryFilters(QueryRequest queryRequest, Funcionario instance) {
        for (FilterRequest filterRequest : queryRequest.getFilters()) {
            if (!applyMemoryFilter(filterRequest, instance))
                return false;
        }
        return true;
    }
    
    private boolean applyMemoryFilter(FilterRequest filterRequest, Funcionario instance) {
        return applyMemoryNavigationalFilter(filterRequest, instance);
    }

    private boolean applyMemoryNavigationalFilter(FilterRequest filterRequest, Funcionario entity) {
        if ("Solicitud_TREASIGNARUSUARIOS_ptUsrAfiliacion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            return inMemoryClas1431957012480960FiltNav69(entity);
        if ("SolicitudNovedad_TREASIGNARUSUARIOS_ptUsrAfiliacion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            return inMemoryClas1581421428736234FiltNav26(entity);
        if ("GrupoAsignacion_TADDUSUARIO_ptFuncionario_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            return inMemoryClas1586850168832947FiltNav1(entity);
        return true;
    }


    private void iFilterFuncionarioPorNumUsu(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vfNumUsu = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_IFILTERFUNCIONARIOPORNUMUSU_VFNUMUSU) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_IFILTERFUNCIONARIOPORNUMUSU_VFNUMUSU, FilterVariableRequest.STRING) : null;

        // Usuario = vfNumUsu
        if (vfNumUsu != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vfNumUsu, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void iFilterPorUsuarioLDAP(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vfUsuLDAP = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_IFILTERPORUSUARIOLDAP_VFUSULDAP) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_IFILTERPORUSUARIOLDAP_VFUSULDAP, FilterVariableRequest.STRING) : null;

        // UsuarioLDAP = vfUsuLDAP
        if (vfUsuLDAP != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIOLDAP, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vfUsuLDAP, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void fFuncionarioPorNombre(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vfPriNom = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRE_VFPRINOM) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRE_VFPRINOM, FilterVariableRequest.STRING) : null;
        String vfSegNom = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRE_VFSEGNOM) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRE_VFSEGNOM, FilterVariableRequest.STRING) : null;
        String vfPriApe = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRE_VFPRIAPE) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRE_VFPRIAPE, FilterVariableRequest.STRING) : null;
        String vfSegApe = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRE_VFSEGAPE) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRE_VFSEGAPE, FilterVariableRequest.STRING) : null;

        // PrimerNombre LIKE "%" + vfPriNom
        if (vfPriNom != null) {
            // 'like' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERNOMBRE, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral("%" + vfPriNom, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        // SegundoNombre LIKE "%" + vfSegNom
        if (vfSegNom != null) {
            // 'like' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral("%" + vfSegNom, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // PrimerApellido LIKE "%" + vfPriApe
        if (vfPriApe != null) {
            // 'like' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral("%" + vfPriApe, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // SegundoApellido LIKE "%" + vfSegApe
        if (vfSegApe != null) {
            // 'like' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral("%" + vfSegApe, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        sql.addConjunction(conjunction);
    }

    private void fFuncionarioPorNombreNoAseso(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vfPriNom = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFPRINOM) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFPRINOM, FilterVariableRequest.STRING) : null;
        String vfSegNom = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFSEGNOM) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFSEGNOM, FilterVariableRequest.STRING) : null;
        String vfPriApe = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFPRIAPE) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFPRIAPE, FilterVariableRequest.STRING) : null;
        String vfSegApe = filterRequest.hasFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFSEGAPE) ? (String) filterRequest.getFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFSEGAPE, FilterVariableRequest.STRING) : null;

        // PrimerNombre LIKE "%" + vfPriNom
        if (vfPriNom != null) {
            // 'like' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERNOMBRE, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral("%" + vfPriNom, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        // SegundoNombre LIKE "%" + vfSegNom
        if (vfSegNom != null) {
            // 'like' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral("%" + vfSegNom, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // PrimerApellido LIKE "%" + vfPriApe
        if (vfPriApe != null) {
            // 'like' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral("%" + vfPriApe, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // SegundoApellido LIKE "%" + vfSegApe
        if (vfSegApe != null) {
            // 'like' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral("%" + vfSegApe, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        // Rol.Nombre <> "ASESOR COMERCIAL"
        // '<>' Comparison
        SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
        comparison5.setOperator("<>");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ROLE_NAME_ROL + "." + RolConstants.ATTR_NAME_ROLNOMBRE, Constants.Type.STRING.getTypeName());
        comparison5.setFirstOperand(operand116);
        
        // Operand 2
        comparison5.setSecondOperand(new SQLWhereOperandLiteral("ASESOR COMERCIAL", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison5);


        // Rol.Nombre <> "JEFEASESORES"
        // '<>' Comparison
        SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
        comparison6.setOperator("<>");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ROLE_NAME_ROL + "." + RolConstants.ATTR_NAME_ROLNOMBRE, Constants.Type.STRING.getTypeName());
        comparison6.setFirstOperand(operand117);
        
        // Operand 2
        comparison6.setSecondOperand(new SQLWhereOperandLiteral("JEFEASESORES", Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison6);


        sql.addConjunction(conjunction);
    }

    private void clas1431957012480960FiltNav69(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // Disponible = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIODISPONIBLE, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);

        sql.addConjunction(conjunction);
    }

    private void clas1581421428736234FiltNav26(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // Disponible = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIODISPONIBLE, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);

        sql.addConjunction(conjunction);
    }

    private void clas1586850168832947FiltNav4(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        GrupoAsignacion grupoAsignacionTADDUSUARIOpthisGrupoAsignacion = filterRequest.hasFilterVariable(GrupoAsignacionConstants.ARG_NAME_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTHISGRUPOASIGNACION) ? grupoAsignacionSrv.getByOID(new GrupoAsignacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(GrupoAsignacionConstants.ARG_NAME_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTHISGRUPOASIGNACION)))) : null;

        // EXIST (GrupoAsignacion) WHERE (GrupoAsignacion = pthisGrupoAsignacion) = false
        if (grupoAsignacionTADDUSUARIOpthisGrupoAsignacion != null) {
        {
            // 'not' Logical operator
            SQLWhereNegation comparison1 = new SQLWhereNegation(sql);
        
            // Operand 1
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator002 = new SQLWhereOperandSubQuery(repository.assocOperator002Range1Query(grupoAsignacionTADDUSUARIOpthisGrupoAsignacion, sql));
            comparison1.addOperand(operandSubQueryAssocOperator002);
            
            conjunction.addOperand(comparison1);
        }

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1586850168832947FiltNav2(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        GrupoAsignacion grupoAsignacionTDELUSUARIOpthisGrupoAsignacion = filterRequest.hasFilterVariable(GrupoAsignacionConstants.ARG_NAME_TDELUSUARIO_GRUPOASIGNACIONTDELUSUARIOPTHISGRUPOASIGNACION) ? grupoAsignacionSrv.getByOID(new GrupoAsignacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(GrupoAsignacionConstants.ARG_NAME_TDELUSUARIO_GRUPOASIGNACIONTDELUSUARIOPTHISGRUPOASIGNACION)))) : null;

        // EXIST (GrupoAsignacion) WHERE (GrupoAsignacion = pthisGrupoAsignacion) = true
        if (grupoAsignacionTDELUSUARIOpthisGrupoAsignacion != null) {
    // 'exist' Association operator
    SQLWhereOperandSubQuery operandSubQueryAssocOperator003 = new SQLWhereOperandSubQuery(repository.assocOperator003Range1Query(grupoAsignacionTDELUSUARIOpthisGrupoAsignacion, sql));
    conjunction.addOperand(operandSubQueryAssocOperator003);

        }        
        sql.addConjunction(conjunction);
    }

    private boolean inMemoryClas1431957012480960FiltNav69(Funcionario entity) {
        boolean result = true;

        // (drvEsAsesorIntegral = true OR Rol.Nombre = "AFILIACIONES")
        try {
            result = (entity.getFuncionariodrvEsAsesorIntegral().equals(true) || (entity.getRol().getRolNombre()).equals("AFILIACIONES"));
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
        return result;
    }

    private boolean inMemoryClas1581421428736234FiltNav26(Funcionario entity) {
        boolean result = true;

        // (drvEsAsesorIntegral = true OR drvEsAfiliacion = true)
        try {
            result = (entity.getFuncionariodrvEsAsesorIntegral().equals(true) || entity.getFuncionariodrvEsAfiliacion().equals(true));
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
        return result;
    }

    private boolean inMemoryClas1586850168832947FiltNav1(Funcionario entity) {
        boolean result = true;

        // drvEsAsesorIntegral = true OR Rol.Nombre = "AFILIACIONES"
        try {
            result = entity.getFuncionariodrvEsAsesorIntegral().equals(true) || (entity.getRol().getRolNombre()).equals("AFILIACIONES");
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
        return result;
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUAgente
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Funcionario using displayset DSAgentePIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.funcionario.ds.DSAgentePIU> piuPIUAgente(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.funcionario.ds.DSAgentePIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUAgente
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUAgente
     */
    public int getCount4PIUAgente(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUDFuncionariosReporte
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Funcionario using displayset DSFuncionarioDReportes that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.funcionario.ds.DSFuncionarioDReportes> piuPIUDFuncionariosReporte(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.funcionario.ds.DSFuncionarioDReportes::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUDFuncionariosReporte
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUDFuncionariosReporte
     */
    public int getCount4PIUDFuncionariosReporte(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUFuncionarioDGrupo
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Funcionario using displayset DSFuncionarioDGrupo that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.funcionario.ds.DSFuncionarioDGrupo> piuPIUFuncionarioDGrupo(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.funcionario.ds.DSFuncionarioDGrupo::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUFuncionarioDGrupo
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUFuncionarioDGrupo
     */
    public int getCount4PIUFuncionarioDGrupo(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUFuncionarioDDominio
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Funcionario using displayset DSFuncionarioDGrupo that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.funcionario.ds.DSFuncionarioDGrupo> piuPIUFuncionarioDDominio(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.funcionario.ds.DSFuncionarioDGrupo::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUFuncionarioDDominio
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUFuncionarioDDominio
     */
    public int getCount4PIUFuncionarioDDominio(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUFuncionarioGrupoUsuarios
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Funcionario using displayset DSAgentePIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.funcionario.ds.DSAgentePIU> piuPIUFuncionarioGrupoUsuarios(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.funcionario.ds.DSAgentePIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUFuncionarioGrupoUsuarios
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUFuncionarioGrupoUsuarios
     */
    public int getCount4PIUFuncionarioGrupoUsuarios(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUUsuarios
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Funcionario using displayset DSAgentePIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.funcionario.ds.DSAgentePIU> piuPIUUsuarios(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.funcionario.ds.DSAgentePIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUUsuarios
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUUsuarios
     */
    public int getCount4PIUUsuarios(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUFuncionarioObs
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Funcionario using displayset DSAgentePIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.funcionario.ds.DSAgentePIU> piuPIUFuncionarioObs(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.funcionario.ds.DSAgentePIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUFuncionarioObs
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUFuncionarioObs
     */
    public int getCount4PIUFuncionarioObs(QueryRequest queryRequest) {
        return solveFuncionarioTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.funcionario.siu.InsUsrAfiliacionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = funcionarioSrv.insUsrAfiliacionTxn(request);
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
            com.keralty.aepersonas.viewmodel.funcionario.siu.InsUsrAfiliacionRequest request) throws ModelException {
        request.setFuncionarioInsUsrAfiliacionpthisFuncionarioInstance(funcionarioSrv.getByOIDWithHV(request.getFuncionarioInsUsrAfiliacionpthisFuncionario()));
        request.setFuncionarioInsUsrAfiliacionpevcSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getFuncionarioInsUsrAfiliacionpevcSolicitud()));
        return funcionarioSrv.insUsrAfiliacionImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.funcionario.siu.InsUsrAfiliacionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Funcionario funcionarioInsUsrAfiliacionpthisFuncionario = request.getFuncionarioInsUsrAfiliacionpthisFuncionarioInstance();
        Solicitud funcionarioInsUsrAfiliacionpevcSolicitud = request.getFuncionarioInsUsrAfiliacionpevcSolicitudInstance();

        request.checkArguments();
        Funcionario instance = funcionarioInsUsrAfiliacionpthisFuncionario;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAfiliacionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.solicitud.siu.InsUsrAfiliacionRequest();
            relatedRequest.setSolicitudInsUsrAfiliacionpthisSolicitudInstance(funcionarioInsUsrAfiliacionpevcSolicitud);
            relatedRequest.setSolicitudInsUsrAfiliacionpevcFuncionarioInstance(funcionarioInsUsrAfiliacionpthisFuncionario);
            solicitudSrv.insUsrAfiliacionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICAgente());

        return response;
    }

    // Service: solicitudAsignada

    /*
     * Entry point for service solicitudAsignada
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse solicitudAsignada(
            com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudAsignadaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = funcionarioSrv.solicitudAsignadaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service solicitudAsignada
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse solicitudAsignadaTxn(
            com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudAsignadaRequest request) throws ModelException {
        request.setFuncionariosolicitudAsignadapthisFuncionarioInstance(funcionarioSrv.getByOIDWithHV(request.getFuncionariosolicitudAsignadapthisFuncionario()));
        return funcionarioSrv.solicitudAsignadaImplementation(request);
    }

    /*
     * Implements service solicitudAsignada
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse solicitudAsignadaImplementation(
            com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudAsignadaRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Funcionario funcionariosolicitudAsignadapthisFuncionario = request.getFuncionariosolicitudAsignadapthisFuncionarioInstance();

        request.checkArguments();
        Funcionario instance = funcionariosolicitudAsignadapthisFuncionario;
        instance.setFuncionarioNumSolNoTerminadas(funcionariosolicitudAsignadapthisFuncionario.getFuncionarioNumSolNoTerminadas() + Long.valueOf(1));


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICAgente());

        return response;
    }

    // Service: solicitudTerminada

    /*
     * Entry point for service solicitudTerminada
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse solicitudTerminada(
            com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudTerminadaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = funcionarioSrv.solicitudTerminadaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service solicitudTerminada
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse solicitudTerminadaTxn(
            com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudTerminadaRequest request) throws ModelException {
        request.setFuncionariosolicitudTerminadapthisFuncionarioInstance(funcionarioSrv.getByOIDWithHV(request.getFuncionariosolicitudTerminadapthisFuncionario()));
        return funcionarioSrv.solicitudTerminadaImplementation(request);
    }

    /*
     * Implements service solicitudTerminada
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse solicitudTerminadaImplementation(
            com.keralty.aepersonas.viewmodel.funcionario.siu.SolicitudTerminadaRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Funcionario funcionariosolicitudTerminadapthisFuncionario = request.getFuncionariosolicitudTerminadapthisFuncionarioInstance();

        request.checkArguments();
        Funcionario instance = funcionariosolicitudTerminadapthisFuncionario;
        if (funcionariosolicitudTerminadapthisFuncionario.getFuncionarioNumSolNoTerminadas() > Long.valueOf(0)) {
            instance.setFuncionarioNumSolNoTerminadas(funcionariosolicitudTerminadapthisFuncionario.getFuncionarioNumSolNoTerminadas() - Long.valueOf(1));
        } else {
            instance.setFuncionarioNumSolNoTerminadas(Long.valueOf(0));
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICAgente());

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
        // agent = this OR Agent.Usuario = CodJefe
        Asesor agentInstance = getAgentAsesor();
    {
        // 'or' Logical operator
        SQLWhereDisjunction comparison1 = new SQLWhereDisjunction();
    
        // Operand 1
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandOVParameter operand113 = new SQLWhereOperandOVParameter(Constants.AGENTKEYWORD, AsesorConstants.CLASS_NAME, AsesorConstants.CLASS_NAME, agentInstance.getOid(), Constants.AGENTKEYWORD);
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            SQLWhereOperandThis operand224 = new SQLWhereOperandThis();
            comparison2.setSecondOperand(operand224);
            comparison1.addOperand(comparison2);
    
        // Operand 2
            // '=' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("=");
            
            // Operand 1
            comparison4.setFirstOperand(new SQLWhereOperandLiteral(agentInstance.getFuncionarioUsuario(), Constants.Type.STRING.getTypeName()));
            
            // Operand 2
            SQLWhereOperandPathAttribute operand226 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOCODJEFE, Constants.Type.STRING.getTypeName());
            comparison4.setSecondOperand(operand226);
            comparison1.addOperand(comparison4);
        
        disjunction.addOperand(comparison1);
    }

    }


    private void suppInfo4ICAgente(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERNOMBRE, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison1);

            SQLWhereComparison comparison2 = new SQLWhereComparison(select);
            comparison2.setOperator("LIKE");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE, Constants.Type.STRING.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison2);

            SQLWhereComparison comparison3 = new SQLWhereComparison(select);
            comparison3.setOperator("LIKE");
            comparison3.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO, Constants.Type.STRING.getTypeName()));
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison3);

            SQLWhereComparison comparison4 = new SQLWhereComparison(select);
            comparison4.setOperator("LIKE");
            comparison4.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName()));
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison4);

            SQLWhereConjunction conjunction = new SQLWhereConjunction();
            conjunction.addDisjunction(disjunction);
            select.addConjunction(conjunction);
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }


    private void suppInfo4ICUsuarioLDAP(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIOLDAP, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison1);

            SQLWhereConjunction conjunction = new SQLWhereConjunction();
            conjunction.addDisjunction(disjunction);
            select.addConjunction(conjunction);
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
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
        select.getOrderByPart().addItem(Constants.normalizePath(FuncionarioConstants.CLASS_NAME, FuncionarioConstants.ATTR_FIELD_FUNCIONARIOID, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildFuncionarioRelatedInstance(relatedInstanceJsonOid);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLICITUDESAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem) || AreaMedicaConstants.ROLE_NAME_SOLICITUDESARME.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_OBSESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4ObsEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLNOVAIFLIACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_GRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        if (AsesorConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (RespRegionalConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_ROL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4Rol(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SUCURSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4Sucursal(relatedInstanceJsonOid, remainingPath);
        }
        if (AsesorConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (AfiliacionesConstants.ROLE_NAME_PLANES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (RespRegionalConstants.ROLE_NAME_REGIONAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4Regional(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildFuncionarioRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4ObsEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new ObsEstado(mapper.readValue(relatedInstanceJsonOid, ObsEstadoOid.class)): ObsEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4Rol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Rol(mapper.readValue(relatedInstanceJsonOid, RolOid.class)): Rol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4Sucursal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Sucursal(mapper.readValue(relatedInstanceJsonOid, SucursalOid.class)): Sucursal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildFuncionarioRelatedInstance4Regional(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Regional(mapper.readValue(relatedInstanceJsonOid, RegionalOid.class)): Regional.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            FuncionarioOid oid = new FuncionarioOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_FIELD_FUNCIONARIOID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getFuncionarioId(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(FuncionarioService.class).error(e.getMessage());
        }
    }

}
