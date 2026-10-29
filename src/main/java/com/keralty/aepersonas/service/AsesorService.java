package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AfiliacionesConstants;
import com.keralty.aepersonas.global.AreaMedicaConstants;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.RespRegionalConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.ContratoC;
import com.keralty.aepersonas.persistence.Firma;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.GrupoAsignacion;
import com.keralty.aepersonas.persistence.ObsEstado;
import com.keralty.aepersonas.persistence.oid.AsesorOid;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.FirmaOid;
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
import com.keralty.aepersonas.repository.AsesorJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
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
public class AsesorService extends AbstractService {

    AsesorJpaRepository repository;

    ContratoCService contratoCSrv;

    SolicitudService solicitudSrv;

    ObsEstadoService obsEstadoSrv;

    SolicitudNovedadService solicitudNovedadSrv;

    GrupoAsignacionService grupoAsignacionSrv;

    FirmaService firmaSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    RolService rolSrv;

    SucursalService sucursalSrv;

    PlanesService planesSrv;

    RegionalService regionalSrv;

    UserFunctions userFunctionsSrv;

    @Inject
    public AsesorService(
            ContratoCService contratoCSrv,
            SolicitudService solicitudSrv,
            ObsEstadoService obsEstadoSrv,
            SolicitudNovedadService solicitudNovedadSrv,
            GrupoAsignacionService grupoAsignacionSrv,
            FirmaService firmaSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            RolService rolSrv,
            SucursalService sucursalSrv,
            PlanesService planesSrv,
            RegionalService regionalSrv,
            UserFunctions userFunctionsSrv,
            AsesorJpaRepository repository) {
        this.contratoCSrv = contratoCSrv;
        this.solicitudSrv = solicitudSrv;
        this.obsEstadoSrv = obsEstadoSrv;
        this.solicitudNovedadSrv = solicitudNovedadSrv;
        this.grupoAsignacionSrv = grupoAsignacionSrv;
        this.firmaSrv = firmaSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.rolSrv = rolSrv;
        this.sucursalSrv = sucursalSrv;
        this.planesSrv = planesSrv;
        this.regionalSrv = regionalSrv;
        this.userFunctionsSrv = userFunctionsSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, AsesorConstants.CLASS_NAME);
    }

    private List<Asesor> solveAsesorTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, AsesorConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveAsesorTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, AsesorConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Asesor
     *
     * @return Population of class Asesor
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Asesor> get() {
        List<Asesor> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Asesor
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Asesor
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Asesor> instances = get(queryRequest);
        if(AsesorConstants.DSICASESOR.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICAsesor())).collect(Collectors.toList());
        }
        if(AsesorConstants.DSDSASESORPIU.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSAsesorPIU())).collect(Collectors.toList());
        }
        if(AsesorConstants.DSDSASESORIIU.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSAsesorIIU())).collect(Collectors.toList());
        }
        if(AsesorConstants.DSDSASESORPIUMAESTROPRODUCTOS.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSAsesorPIUMaestroProductos())).collect(Collectors.toList());
        }
        if(AsesorConstants.DSDSASESORNULL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSAsesorNull())).collect(Collectors.toList());
        }
        if(AsesorConstants.DSDSASESORMDIRECTORES.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSAsesorMDirectores())).collect(Collectors.toList());
        }
        if(AsesorConstants.DSDSDIRECTORESOBS.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSDirectoresObs())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Asesor that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Asesor matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Asesor> get(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveAsesorTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveAsesorTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveAsesorTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveAsesorTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Asesor by ID
     *
     * @param funcionarioId Identification field funcionarioId
     *
     * @return Instance of Asesor
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Asesor getById(Long funcionarioId) {
        return getByOID(new AsesorOid(funcionarioId));
    }
    
    /*
     * Returns an instance of Asesor by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Asesor
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Asesor getByOID(AsesorOid oid) {
        Optional<Asesor> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Asesor by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Asesor
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Asesor getByOIDWithHV(AsesorOid oid) {
        Optional<Asesor> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Asesor> getInstanceByOid(AsesorOid oid) {
        return oid != null && oid.getFuncionarioId() != null
               ? repository.findById(oid.getFuncionarioId())
               : Optional.empty();
    }

    /*
     * Returns an instance of Asesor by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Asesor
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Asesor getByJsonOid(String jsonOid) {
        AsesorOid oid = new AsesorOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Asesor related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Asesor
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Asesor> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveAsesorTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Asesor related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Asesor
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Asesor> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Asesor
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Asesor
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getAsesorDynamic(AsesorOid oid, String displaySetItems) {
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
    public String getSuppInfo(AsesorOid oid, String dsName) {
        Asesor instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Asesor instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (AsesorConstants.DSICASESOR.equals(dsName))
            return instance.buildICAsesor();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Asesor instance, String dsName) {
        if (AsesorConstants.DSICASESOR.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICAsesor());
        if (AsesorConstants.DSDSASESORPIU.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSAsesorPIU());
        if (AsesorConstants.DSDSASESORIIU.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSAsesorIIU());
        if (AsesorConstants.DSDSASESORPIUMAESTROPRODUCTOS.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSAsesorPIUMaestroProductos());
        if (AsesorConstants.DSDSASESORNULL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSAsesorNull());
        if (AsesorConstants.DSDSASESORMDIRECTORES.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSAsesorMDirectores());
        if (AsesorConstants.DSDSDIRECTORESOBS.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSDirectoresObs());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (AsesorConstants.FILTER_NAME_FASESORES.equalsIgnoreCase(filterRequest.getName()))
            fAsesores(filterRequest, sql);
        if (AsesorConstants.FILTER_NAME_FDIRECTORES.equalsIgnoreCase(filterRequest.getName()))
            fDirectores(filterRequest, sql);
        if (AsesorConstants.FILTER_NAME_FASESORESAGENCIA.equalsIgnoreCase(filterRequest.getName()))
            fAsesoresAgencia(filterRequest, sql);
        if (AsesorConstants.FILTER_NAME_IFASESORPORUSUARIONOMANUAL.equalsIgnoreCase(filterRequest.getName()))
            iFAsesorPorUsuarioNoManual(filterRequest, sql);
    }

    @Override
    protected void applyNavigationalFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if ("Clas_1431886233600794FiltNav_3".equalsIgnoreCase(filterRequest.getName()))
            clas1431886233600794FiltNav3(filterRequest, sql);
        if ("Ae_solicitudes_TNUEVAAFILIACION_pDirector_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431956094976663FiltNav6(sql);
        if ("Ae_solicitudes_TINCLUSIONSC_pDirector_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431956094976663FiltNav7(sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_Asesor".equals(filterRequest.getName()))
            suppInfo4ICAsesor(filterRequest.getFilterVariable("searchText").toString(), sql);
    }


    private void fAsesores(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vUsuario = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VUSUARIO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VUSUARIO, FilterVariableRequest.STRING) : null;
        String vPrimerNombre = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VPRIMERNOMBRE) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VPRIMERNOMBRE, FilterVariableRequest.STRING) : null;
        String vSegundoNombre = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VSEGUNDONOMBRE) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VSEGUNDONOMBRE, FilterVariableRequest.STRING) : null;
        String vPrimerApellido = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VPRIMERAPELLIDO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VPRIMERAPELLIDO, FilterVariableRequest.STRING) : null;
        String vSegundoApellido = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VSEGUNDOAPELLIDO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORES_VSEGUNDOAPELLIDO, FilterVariableRequest.STRING) : null;

        // Usuario = vUsuario
        if (vUsuario != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vUsuario, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        // PrimerNombre LIKE vPrimerNombre
        if (vPrimerNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERNOMBRE, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vPrimerNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // SegundoNombre LIKE vSegundoNombre
        if (vSegundoNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE, Constants.Type.STRING.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vSegundoNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // PrimerApellido LIKE vPrimerApellido
        if (vPrimerApellido != null) {
            // 'like' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(vPrimerApellido, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        // SegundoApellido LIKE vSegundoApellido
        if (vSegundoApellido != null) {
            // 'like' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            comparison5.setSecondOperand(new SQLWhereOperandLiteral(vSegundoApellido, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison5);

        }        

        sql.addConjunction(conjunction);
    }

    private void fDirectores(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vUsuario = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VUSUARIO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VUSUARIO, FilterVariableRequest.STRING) : null;
        String vPrimerNombre = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VPRIMERNOMBRE) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VPRIMERNOMBRE, FilterVariableRequest.STRING) : null;
        String vSegundoNombre = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VSEGUNDONOMBRE) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VSEGUNDONOMBRE, FilterVariableRequest.STRING) : null;
        String vPrimerApellido = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VPRIMERAPELLIDO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VPRIMERAPELLIDO, FilterVariableRequest.STRING) : null;
        String vSegundoApellido = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VSEGUNDOAPELLIDO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FDIRECTORES_VSEGUNDOAPELLIDO, FilterVariableRequest.STRING) : null;

        // EsDirector = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(AsesorConstants.ATTR_NAME_ASESORESDIRECTOR, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        // Usuario = vUsuario
        if (vUsuario != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vUsuario, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // PrimerNombre LIKE vPrimerNombre
        if (vPrimerNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERNOMBRE, Constants.Type.STRING.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vPrimerNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // SegundoNombre LIKE vSegundoNombre
        if (vSegundoNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(vSegundoNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        // PrimerApellido LIKE vPrimerApellido
        if (vPrimerApellido != null) {
            // 'like' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            comparison5.setSecondOperand(new SQLWhereOperandLiteral(vPrimerApellido, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison5);

        }        

        // SegundoApellido LIKE vSegundoApellido
        if (vSegundoApellido != null) {
            // 'like' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral(vSegundoApellido, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        sql.addConjunction(conjunction);
    }

    private void fAsesoresAgencia(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vUsuario = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VUSUARIO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VUSUARIO, FilterVariableRequest.STRING) : null;
        String vPrimerNombre = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VPRIMERNOMBRE) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VPRIMERNOMBRE, FilterVariableRequest.STRING) : null;
        String vSegundoNombre = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VSEGUNDONOMBRE) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VSEGUNDONOMBRE, FilterVariableRequest.STRING) : null;
        String vPrimerApellido = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VPRIMERAPELLIDO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VPRIMERAPELLIDO, FilterVariableRequest.STRING) : null;
        String vSegundoApellido = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VSEGUNDOAPELLIDO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VSEGUNDOAPELLIDO, FilterVariableRequest.STRING) : null;

        // Manual = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOMANUAL, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        // Usuario = vUsuario
        if (vUsuario != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vUsuario, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // PrimerNombre LIKE vPrimerNombre
        if (vPrimerNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERNOMBRE, Constants.Type.STRING.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vPrimerNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // SegundoNombre LIKE vSegundoNombre
        if (vSegundoNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(vSegundoNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        // PrimerApellido LIKE vPrimerApellido
        if (vPrimerApellido != null) {
            // 'like' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            comparison5.setSecondOperand(new SQLWhereOperandLiteral(vPrimerApellido, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison5);

        }        

        // SegundoApellido LIKE vSegundoApellido
        if (vSegundoApellido != null) {
            // 'like' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral(vSegundoApellido, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        sql.addConjunction(conjunction);
    }

    private void iFAsesorPorUsuarioNoManual(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vfUsuario = filterRequest.hasFilterVariable(AsesorConstants.VAR_NAME_IFASESORPORUSUARIONOMANUAL_VFUSUARIO) ? (String) filterRequest.getFilterVariable(AsesorConstants.VAR_NAME_IFASESORPORUSUARIONOMANUAL_VFUSUARIO, FilterVariableRequest.STRING) : null;

        // Usuario = vfUsuario
        if (vfUsuario != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vfUsuario, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        // Manual = false
        // '=' Comparison
        SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
        comparison2.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOMANUAL, Constants.Type.BOOL.getTypeName());
        comparison2.setFirstOperand(operand113);
        
        // Operand 2
        comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.FALSE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison2);


        sql.addConjunction(conjunction);
    }

    private void clas1431886233600794FiltNav3(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Asesor selectedObject = filterRequest.hasFilterVariable(Constants.SELECTEDOBJECT) ? new Asesor(new AsesorOid().fromJsonString(filterRequest.getFilterVariable(Constants.SELECTEDOBJECT).toString())) : null;

        // CodJefe = SelectedObject.Usuario
        if (selectedObject != null) {
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOCODJEFE, Constants.Type.STRING.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(selectedObject.getFuncionarioUsuario(), Constants.Type.STRING.getTypeName()));
        conjunction.addOperand(comparison1);

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1431956094976663FiltNav6(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // esDirector = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(AsesorConstants.ATTR_NAME_ASESORESDIRECTOR, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);

        sql.addConjunction(conjunction);
    }

    private void clas1431956094976663FiltNav7(SQLSelect sql) {
        clas1431956094976663FiltNav6(sql);
    }

    // IIU Methods

    /*
     * Returns a viewmodel for class Asesor with displayset DSAsesorIIU for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Asesor with displayset DSAsesorIIU
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorIIU iIUAsesor(AsesorOid oid) {
        return new com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorIIU(getByOIDWithHV(oid));
    }

    /*
     * Returns a viewmodel for class Asesor with displayset DSAsesorPIUMaestroProductos for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class Asesor with displayset DSAsesorPIUMaestroProductos
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorPIUMaestroProductos iIUAsesorProductos(AsesorOid oid) {
        return new com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorPIUMaestroProductos(getByOIDWithHV(oid));
    }


    /*
     * Solves the query needed for PIUAsesor
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Asesor using displayset DSAsesorPIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorPIU> piuPIUAsesor(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorPIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUAsesor
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUAsesor
     */
    public int getCount4PIUAsesor(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUAsesorDetalle
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Asesor using displayset DSAsesorPIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorPIU> piuPIUAsesorDetalle(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorPIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUAsesorDetalle
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUAsesorDetalle
     */
    public int getCount4PIUAsesorDetalle(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUDirectores
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Asesor using displayset DSAsesorMDirectores that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorMDirectores> piuPIUDirectores(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorMDirectores::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUDirectores
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUDirectores
     */
    public int getCount4PIUDirectores(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUAsesoresDeAgencia
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Asesor using displayset DSAsesorPIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorPIU> piuPIUAsesoresDeAgencia(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorPIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUAsesoresDeAgencia
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUAsesoresDeAgencia
     */
    public int getCount4PIUAsesoresDeAgencia(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUAsesorNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Asesor using displayset DSAsesorNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorNull> piuPIUAsesorNull(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.asesor.ds.DSAsesorNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUAsesorNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUAsesorNull
     */
    public int getCount4PIUAsesorNull(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUDirectoresObs
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Asesor using displayset DSDirectoresObs that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.asesor.ds.DSDirectoresObs> piuPIUDirectoresObs(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.asesor.ds.DSDirectoresObs::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUDirectoresObs
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUDirectoresObs
     */
    public int getCount4PIUDirectoresObs(QueryRequest queryRequest) {
        return solveAsesorTypedQuery(queryRequest).size();
    }


    private void suppInfo4ICAsesor(String searchText, SQLSelect select) {
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
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(AsesorConstants.CLASS_NAME, FuncionarioConstants.ATTR_FIELD_FUNCIONARIOID, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildAsesorRelatedInstance(relatedInstanceJsonOid);
        }
        if (AsesorConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLICITUDESAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem) || AreaMedicaConstants.ROLE_NAME_SOLICITUDESARME.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_OBSESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4ObsEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLNOVAIFLIACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_GRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        if (RespRegionalConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        if (AsesorConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_ROL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4Rol(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SUCURSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4Sucursal(relatedInstanceJsonOid, remainingPath);
        }
        if (AfiliacionesConstants.ROLE_NAME_PLANES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (RespRegionalConstants.ROLE_NAME_REGIONAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAsesorRelatedInstance4Regional(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildAsesorRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4ObsEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new ObsEstado(mapper.readValue(relatedInstanceJsonOid, ObsEstadoOid.class)): ObsEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4Rol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Rol(mapper.readValue(relatedInstanceJsonOid, RolOid.class)): Rol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4Sucursal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Sucursal(mapper.readValue(relatedInstanceJsonOid, SucursalOid.class)): Sucursal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAsesorRelatedInstance4Regional(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Regional(mapper.readValue(relatedInstanceJsonOid, RegionalOid.class)): Regional.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            AsesorOid oid = new AsesorOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_FIELD_FUNCIONARIOID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getFuncionarioId(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(AsesorService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
