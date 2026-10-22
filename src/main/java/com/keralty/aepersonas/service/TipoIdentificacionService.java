package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.FamiliaNovedad;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.AsesorOid;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.FamiliaNovedadOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.oid.UsuarioNovedadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.SolicitudNovedad;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.persistence.UsuarioNovedad;
import com.keralty.aepersonas.repository.TipoIdentificacionJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
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
public class TipoIdentificacionService extends AbstractService {

    TipoIdentificacionJpaRepository repository;

    TipoIdentificacionService tipoIdentificacionSrv;

    PersonaService personaSrv;

    ContratanteService contratanteSrv;

    UsuarioService usuarioSrv;

    TitularService titularSrv;

    PersonaCService personaCSrv;

    InstitucionMatNeoService institucionMatNeoSrv;

    SolicitudNovedadService solicitudNovedadSrv;

    FamiliaNovedadService familiaNovedadSrv;

    UsuarioNovedadService usuarioNovedadSrv;

    @Inject
    public TipoIdentificacionService(
            TipoIdentificacionService tipoIdentificacionSrv,
            PersonaService personaSrv,
            ContratanteService contratanteSrv,
            UsuarioService usuarioSrv,
            TitularService titularSrv,
            PersonaCService personaCSrv,
            InstitucionMatNeoService institucionMatNeoSrv,
            SolicitudNovedadService solicitudNovedadSrv,
            FamiliaNovedadService familiaNovedadSrv,
            UsuarioNovedadService usuarioNovedadSrv,
            TipoIdentificacionJpaRepository repository) {
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.personaSrv = personaSrv;
        this.contratanteSrv = contratanteSrv;
        this.usuarioSrv = usuarioSrv;
        this.titularSrv = titularSrv;
        this.personaCSrv = personaCSrv;
        this.institucionMatNeoSrv = institucionMatNeoSrv;
        this.solicitudNovedadSrv = solicitudNovedadSrv;
        this.familiaNovedadSrv = familiaNovedadSrv;
        this.usuarioNovedadSrv = usuarioNovedadSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, TipoIdentificacionConstants.CLASS_NAME);
    }

    private List<TipoIdentificacion> solveTipoIdentificacionTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, TipoIdentificacionConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveTipoIdentificacionTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, TipoIdentificacionConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class TipoIdentificacion
     *
     * @return Population of class TipoIdentificacion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<TipoIdentificacion> get() {
        List<TipoIdentificacion> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class TipoIdentificacion
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class TipoIdentificacion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<TipoIdentificacion> instances = get(queryRequest);
        if(TipoIdentificacionConstants.DSICTIPOIDENTIFICACION.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICTipoIdentificacion())).collect(Collectors.toList());
        }
        if(TipoIdentificacionConstants.DSDSTIPOIDENTIFICACIONNULL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSTipoIdentificacionNull())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class TipoIdentificacion that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class TipoIdentificacion matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<TipoIdentificacion> get(QueryRequest queryRequest) {
        return solveTipoIdentificacionTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveTipoIdentificacionTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveTipoIdentificacionTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveTipoIdentificacionTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveTipoIdentificacionTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of TipoIdentificacion by ID
     *
     * @param tipoIdentificacionCodigo Identification field tipoIdentificacionCodigo
     *
     * @return Instance of TipoIdentificacion
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public TipoIdentificacion getById(Long tipoIdentificacionCodigo) {
        return getByOID(new TipoIdentificacionOid(tipoIdentificacionCodigo));
    }
    
    /*
     * Returns an instance of TipoIdentificacion by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoIdentificacion
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public TipoIdentificacion getByOID(TipoIdentificacionOid oid) {
        Optional<TipoIdentificacion> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of TipoIdentificacion by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoIdentificacion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public TipoIdentificacion getByOIDWithHV(TipoIdentificacionOid oid) {
        Optional<TipoIdentificacion> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<TipoIdentificacion> getInstanceByOid(TipoIdentificacionOid oid) {
        return oid != null && oid.getTipoIdentificacionCodigo() != null
               ? repository.findById(oid.getTipoIdentificacionCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of TipoIdentificacion by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of TipoIdentificacion
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public TipoIdentificacion getByJsonOid(String jsonOid) {
        TipoIdentificacionOid oid = new TipoIdentificacionOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of TipoIdentificacion related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of TipoIdentificacion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<TipoIdentificacion> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveTipoIdentificacionTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of TipoIdentificacion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of TipoIdentificacion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<TipoIdentificacion> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of TipoIdentificacion
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of TipoIdentificacion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getTipoIdentificacionDynamic(TipoIdentificacionOid oid, String displaySetItems) {
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
    public String getSuppInfo(TipoIdentificacionOid oid, String dsName) {
        TipoIdentificacion instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(TipoIdentificacion instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (TipoIdentificacionConstants.DSICTIPOIDENTIFICACION.equals(dsName))
            return instance.buildICTipoIdentificacion();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(TipoIdentificacion instance, String dsName) {
        if (TipoIdentificacionConstants.DSICTIPOIDENTIFICACION.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICTipoIdentificacion());
        if (TipoIdentificacionConstants.DSDSTIPOIDENTIFICACIONNULL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSTipoIdentificacionNull());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (TipoIdentificacionConstants.FILTER_NAME_IFTIPOIDENTIFICACIONNOMBREC.equalsIgnoreCase(filterRequest.getName()))
            iFTipoIdentificacionNombreC(filterRequest, sql);
    }

    @Override
    protected void applyNavigationalFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if ("Persona_TADDUSUARIOASOL_pt_p_agrTipoIdentificacion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431886233600805FiltNav10(sql);
        if ("Solicitud_TINDICARCONTRATANTE2_pt_p_evcTipoIdentificacion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431957012480960FiltNav32(sql);
        if ("Solicitud_TINDICARTITULAR2_pt_p_agrTipoIdentificacion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431957012480960FiltNav31(sql);
        if ("Usuario_TMODUSUARIO_pt_p_evcTipoIdentificacion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1432633737216826FiltNav3(sql);
        if ("UsuarioNovedad_TCAMBIARTIPOIDENT_pt_p_evcTipoIdentificacion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1581442138112529FiltNav4(sql);
        if ("TGValidadorUsuarios_ptTipoDoc_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            iGl1658391625728650FiltNav1(sql);
        if ("Persona_F_PersonaConsultarCORE_vo_TipoIdentificacion_NavFilter".equalsIgnoreCase(filterRequest.getName()))
            clas1431886233600805FiltNav6(sql);
        if ("Persona_F_PersonaConsultarCORENat_vo_TipoIdentificacion_NavFilter".equalsIgnoreCase(filterRequest.getName()))
            clas1431886233600805FiltNav8(sql);
    }


    private void iFTipoIdentificacionNombreC(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNombreCorto = filterRequest.hasFilterVariable(TipoIdentificacionConstants.VAR_NAME_IFTIPOIDENTIFICACIONNOMBREC_VNOMBRECORTO) ? (String) filterRequest.getFilterVariable(TipoIdentificacionConstants.VAR_NAME_IFTIPOIDENTIFICACIONNOMBREC_VNOMBRECORTO, FilterVariableRequest.STRING) : null;

        // NombreCorto = vNombreCorto
        if (vNombreCorto != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONNOMBRECORTO, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vNombreCorto, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void clas1431886233600805FiltNav10(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // NIT = false
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONNIT, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.FALSE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);

        sql.addConjunction(conjunction);
    }

    private void clas1431957012480960FiltNav32(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // ValidoContratante = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONVALIDOCONTRATANTE, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);

        sql.addConjunction(conjunction);
    }

    private void clas1431957012480960FiltNav31(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // ValidoTitular = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONVALIDOTITULAR, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);

        sql.addConjunction(conjunction);
    }

    private void clas1432633737216826FiltNav3(SQLSelect sql) {
        clas1431886233600805FiltNav10(sql);
    }

    private void clas1581442138112529FiltNav4(SQLSelect sql) {
        clas1431886233600805FiltNav10(sql);
    }

    private void iGl1658391625728650FiltNav1(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // VisibleValidadorUsu = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONVISIBLEVALIDADORUSU, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);

        sql.addConjunction(conjunction);
    }

    private void clas1431886233600805FiltNav6(SQLSelect sql) {
        clas1431957012480960FiltNav32(sql);
    }

    private void clas1431886233600805FiltNav8(SQLSelect sql) {
        clas1431957012480960FiltNav32(sql);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUTipoIdentificacion
     *
     * @param queryRequest Query request
     * @return List of viewmodels for TipoIdentificacion using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.tipoidentificacion.ds.AutoDS> piuPIUTipoIdentificacion(QueryRequest queryRequest) {
        return solveTipoIdentificacionTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.tipoidentificacion.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUTipoIdentificacion
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUTipoIdentificacion
     */
    public int getCount4PIUTipoIdentificacion(QueryRequest queryRequest) {
        return solveTipoIdentificacionTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUTipoIdentificacionNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for TipoIdentificacion using displayset DSTipoIdentificacionNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.tipoidentificacion.ds.DSTipoIdentificacionNull> piuPIUTipoIdentificacionNull(QueryRequest queryRequest) {
        return solveTipoIdentificacionTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.tipoidentificacion.ds.DSTipoIdentificacionNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUTipoIdentificacionNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUTipoIdentificacionNull
     */
    public int getCount4PIUTipoIdentificacionNull(QueryRequest queryRequest) {
        return solveTipoIdentificacionTypedQuery(queryRequest).size();
    }

    // Service: CambTipoIdentificacion

    /*
     * Entry point for service CambTipoIdentificacion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambTipoIdentificacion(
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = tipoIdentificacionSrv.cambTipoIdentificacionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service CambTipoIdentificacion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambTipoIdentificacionTxn(
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionRequest request) throws ModelException {
        request.setTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion()));
        request.setTipoIdentificacionCambTipoIdentificacionpevcPersonaInstance(personaSrv.getByOIDWithHV(request.getTipoIdentificacionCambTipoIdentificacionpevcPersona()));
        return tipoIdentificacionSrv.cambTipoIdentificacionImplementation(request, true);
    }

    /*
     * Implements service CambTipoIdentificacion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambTipoIdentificacionImplementation(
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion = request.getTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance();
        Persona tipoIdentificacionCambTipoIdentificacionpevcPersona = request.getTipoIdentificacionCambTipoIdentificacionpevcPersonaInstance();

        request.checkArguments();
        TipoIdentificacion instance = tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest();
            relatedRequest.setPersonaCambTipoIdentificacionpthisPersonaInstance(tipoIdentificacionCambTipoIdentificacionpevcPersona);
            relatedRequest.setPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance(tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion);
            personaSrv.cambTipoIdentificacionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICTipoIdentificacion());

        return response;
    }

    // Service: CambTipoIdContratante

    /*
     * Entry point for service CambTipoIdContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambTipoIdContratante(
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdContratanteRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = tipoIdentificacionSrv.cambTipoIdContratanteTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service CambTipoIdContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambTipoIdContratanteTxn(
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdContratanteRequest request) throws ModelException {
        request.setTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion()));
        request.setTipoIdentificacionCambTipoIdContratantepevcContratanteInstance(contratanteSrv.getByOIDWithHV(request.getTipoIdentificacionCambTipoIdContratantepevcContratante()));
        return tipoIdentificacionSrv.cambTipoIdContratanteImplementation(request, true);
    }

    /*
     * Implements service CambTipoIdContratante
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambTipoIdContratanteImplementation(
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdContratanteRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion = request.getTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance();
        Contratante tipoIdentificacionCambTipoIdContratantepevcContratante = request.getTipoIdentificacionCambTipoIdContratantepevcContratanteInstance();

        request.checkArguments();
        TipoIdentificacion instance = tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.contratante.siu.CambTipoIdContratanteRequest relatedRequest = new com.keralty.aepersonas.viewmodel.contratante.siu.CambTipoIdContratanteRequest();
            relatedRequest.setContratanteCambTipoIdContratantepthisContratanteInstance(tipoIdentificacionCambTipoIdContratantepevcContratante);
            relatedRequest.setContratanteCambTipoIdContratantepevcTipoIdentificacionInstance(tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion);
            contratanteSrv.cambTipoIdContratanteImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICTipoIdentificacion());

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
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = tipoIdentificacionSrv.cambTipoIdUsuarioTxn(request);
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
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdUsuarioRequest request) throws ModelException {
        request.setTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion()));
        request.setTipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getTipoIdentificacionCambTipoIdUsuariopevcUsuario()));
        return tipoIdentificacionSrv.cambTipoIdUsuarioImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion = request.getTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance();
        Usuario tipoIdentificacionCambTipoIdUsuariopevcUsuario = request.getTipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance();

        request.checkArguments();
        TipoIdentificacion instance = tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.usuario.siu.CambTipoIdUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.usuario.siu.CambTipoIdUsuarioRequest();
            relatedRequest.setUsuarioCambTipoIdUsuariopthisUsuarioInstance(tipoIdentificacionCambTipoIdUsuariopevcUsuario);
            relatedRequest.setUsuarioCambTipoIdUsuariopevcTipoIdentificacionInstance(tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion);
            usuarioSrv.cambTipoIdUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICTipoIdentificacion());

        return response;
    }

    // Service: CambTipoIdentificacionTitular

    /*
     * Entry point for service CambTipoIdentificacionTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambTipoIdentificacionTitular(
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = tipoIdentificacionSrv.cambTipoIdentificacionTitularTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service CambTipoIdentificacionTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambTipoIdentificacionTitularTxn(
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionTitularRequest request) throws ModelException {
        request.setTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion()));
        request.setTipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance(titularSrv.getByOIDWithHV(request.getTipoIdentificacionCambTipoIdentificacionTitularpevcTitular()));
        return tipoIdentificacionSrv.cambTipoIdentificacionTitularImplementation(request, true);
    }

    /*
     * Implements service CambTipoIdentificacionTitular
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambTipoIdentificacionTitularImplementation(
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion = request.getTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance();
        Titular tipoIdentificacionCambTipoIdentificacionTitularpevcTitular = request.getTipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance();

        request.checkArguments();
        TipoIdentificacion instance = tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.titular.siu.CambTipoIdentificacionTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.titular.siu.CambTipoIdentificacionTitularRequest();
            relatedRequest.setTitularCambTipoIdentificacionTitularpthisTitularInstance(tipoIdentificacionCambTipoIdentificacionTitularpevcTitular);
            relatedRequest.setTitularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance(tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion);
            titularSrv.cambTipoIdentificacionTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICTipoIdentificacion());

        return response;
    }

    @Override
    protected void applyOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        applyOCOCTipoIdentificacion(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.ATTR_FIELD_TIPOIDENTIFICACIONCODIGO, false), true);
    }


    private void applyOCOCTipoIdentificacion(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_TipoIdentificacion".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONNOMBRECORTO, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildTipoIdentificacionRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_ASESORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_CONTRATANTES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_TITULARES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_INSTITUCIONMATNEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_FAMILIASNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_USUARIOSNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || TipoIdentificacionConstants.ROLE_NAME_USUARIONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildTipoIdentificacionRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTipoIdentificacionRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            TipoIdentificacionOid oid = new TipoIdentificacionOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(TipoIdentificacionConstants.ATTR_FIELD_TIPOIDENTIFICACIONCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getTipoIdentificacionCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(TipoIdentificacionService.class).error(e.getMessage());
        }
    }

}
