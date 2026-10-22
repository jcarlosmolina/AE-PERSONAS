package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoDireccion;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.repository.DireccionJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandNull;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class DireccionService extends AbstractService {

    DireccionJpaRepository repository;

    DireccionService direccionSrv;

    PersonaService personaSrv;

    SolicitudService solicitudSrv;

    TitularService titularSrv;

    TipoDireccionService tipoDireccionSrv;

    PaisService paisSrv;

    MunicipioService municipioSrv;

    DepartamentoService departamentoSrv;

    UsuarioService usuarioSrv;

    @Inject
    public DireccionService(
            DireccionService direccionSrv,
            PersonaService personaSrv,
            SolicitudService solicitudSrv,
            TitularService titularSrv,
            TipoDireccionService tipoDireccionSrv,
            PaisService paisSrv,
            MunicipioService municipioSrv,
            DepartamentoService departamentoSrv,
            UsuarioService usuarioSrv,
            DireccionJpaRepository repository) {
        this.direccionSrv = direccionSrv;
        this.personaSrv = personaSrv;
        this.solicitudSrv = solicitudSrv;
        this.titularSrv = titularSrv;
        this.tipoDireccionSrv = tipoDireccionSrv;
        this.paisSrv = paisSrv;
        this.municipioSrv = municipioSrv;
        this.departamentoSrv = departamentoSrv;
        this.usuarioSrv = usuarioSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, DireccionConstants.CLASS_NAME);
    }

    private List<Direccion> solveDireccionTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, DireccionConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveDireccionTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, DireccionConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Direccion
     *
     * @return Population of class Direccion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Direccion> get() {
        List<Direccion> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Direccion
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Direccion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Direccion> instances = get(queryRequest);
        if(DireccionConstants.DSICDIRECCION.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICDireccion())).collect(Collectors.toList());
        }
        if(DireccionConstants.DSDSDIRECCIONNULL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSDireccionNull())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Direccion that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Direccion matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Direccion> get(QueryRequest queryRequest) {
        return solveDireccionTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveDireccionTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveDireccionTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveDireccionTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveDireccionTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Direccion by ID
     *
     * @param direccionIdentificador Identification field direccionIdentificador
     *
     * @return Instance of Direccion
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Direccion getById(Long direccionIdentificador) {
        return getByOID(new DireccionOid(direccionIdentificador));
    }
    
    /*
     * Returns an instance of Direccion by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Direccion
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Direccion getByOID(DireccionOid oid) {
        Optional<Direccion> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Direccion by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Direccion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Direccion getByOIDWithHV(DireccionOid oid) {
        Optional<Direccion> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Direccion> getInstanceByOid(DireccionOid oid) {
        return oid != null && oid.getDireccionIdentificador() != null
               ? repository.findById(oid.getDireccionIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of Direccion by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Direccion
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Direccion getByJsonOid(String jsonOid) {
        DireccionOid oid = new DireccionOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Direccion related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Direccion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Direccion> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveDireccionTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Direccion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Direccion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Direccion> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Direccion
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Direccion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getDireccionDynamic(DireccionOid oid, String displaySetItems) {
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
    public String getSuppInfo(DireccionOid oid, String dsName) {
        Direccion instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Direccion instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (DireccionConstants.DSICDIRECCION.equals(dsName))
            return instance.buildICDireccion();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Direccion instance, String dsName) {
        if (DireccionConstants.DSICDIRECCION.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICDireccion());
        if (DireccionConstants.DSDSDIRECCIONNULL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSDireccionNull());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (DireccionConstants.FILTER_NAME_FDIRECCIONPORPERSONAYTIPO.equalsIgnoreCase(filterRequest.getName()))
            fDireccionPorPErsonaYTipo(filterRequest, sql);
    }

    @Override
    protected void applyNavigationalFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if ("Persona_TADDUSUARIOASOL_ptDireccionesTitular_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431886233600805FiltNav13(filterRequest, sql);
        if ("Solicitud_TMODDIRECCION_pt_Direcciones_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431957012480960FiltNav3(filterRequest, sql);
        if ("Usuario_TMODUSUARIO_pt_Direccion_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1432633737216826FiltNav2(filterRequest, sql);
        if ("Usuario_TMODUSUARIO_pt_DireccionUsuario_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1432633737216826FiltNav11(filterRequest, sql);
    }


    private void fDireccionPorPErsonaYTipo(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Persona vfPer = filterRequest.hasFilterVariable(DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFPER) ? personaSrv.getByOID(new PersonaOid().fromJsonString(toJson(filterRequest.getFilterVariable(DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFPER)))) : null;
        TipoDireccion vfTipo = filterRequest.hasFilterVariable(DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFTIPO) ? tipoDireccionSrv.getByOID(new TipoDireccionOid().fromJsonString(toJson(filterRequest.getFilterVariable(DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFTIPO)))) : null;

        // Persona = vfPer
        if (vfPer != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(DireccionConstants.ROLE_NAME_PERSONA, PersonaConstants.CLASS_NAME);
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFPER, PersonaConstants.CLASS_NAME, PersonaConstants.CLASS_NAME, vfPer.getOid(), DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFPER);
            comparison1.setSecondOperand(operand223);
            conjunction.addOperand(comparison1);

        }        

        // TipoDireccion = vfTipo
        if (vfTipo != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(DireccionConstants.ROLE_NAME_TIPODIRECCION, TipoDireccionConstants.CLASS_NAME);
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFTIPO, TipoDireccionConstants.CLASS_NAME, TipoDireccionConstants.CLASS_NAME, vfTipo.getOid(), DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFTIPO);
            comparison2.setSecondOperand(operand224);
            conjunction.addOperand(comparison2);

        }        

        sql.addConjunction(conjunction);
    }

    private void clas1431886233600805FiltNav13(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Solicitud personaTADDUSUARIOASOLptSolicitud = filterRequest.hasFilterVariable(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD) ? solicitudSrv.getByOID(new SolicitudOid().fromJsonString(toJson(filterRequest.getFilterVariable(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD)))) : null;

        // Persona = ptSolicitud.TitularPersona
        if (personaTADDUSUARIOASOLptSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(DireccionConstants.ROLE_NAME_PERSONA, PersonaConstants.CLASS_NAME);
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            if (personaTADDUSUARIOASOLptSolicitud.isNull() || personaTADDUSUARIOASOLptSolicitud.getTitularPersona().isNull())
            {
            comparison1.setSecondOperand(new SQLWhereOperandNull());
            }
            else
            {
            SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_TITULARPERSONA, SolicitudConstants.CLASS_NAME, PersonaConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD);
            comparison1.setSecondOperand(operand223);
            }
            conjunction.addOperand(comparison1);

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1431957012480960FiltNav3(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Solicitud solicitudTMODDIRECCIONpthisSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.ARG_NAME_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTHISSOLICITUD) ? solicitudSrv.getByOID(new SolicitudOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.ARG_NAME_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTHISSOLICITUD)))) : null;

        // Persona = pthisSolicitud.ContratantePersona
        if (solicitudTMODDIRECCIONpthisSolicitud != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(DireccionConstants.ROLE_NAME_PERSONA, PersonaConstants.CLASS_NAME);
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            if (solicitudTMODDIRECCIONpthisSolicitud.isNull() || solicitudTMODDIRECCIONpthisSolicitud.getContratantePersona().isNull())
            {
            comparison1.setSecondOperand(new SQLWhereOperandNull());
            }
            else
            {
            SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ARG_NAME_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTHISSOLICITUD + "." + SolicitudConstants.ROLE_NAME_CONTRATANTEPERSONA, SolicitudConstants.CLASS_NAME, PersonaConstants.CLASS_NAME, solicitudTMODDIRECCIONpthisSolicitud.getOid(), SolicitudConstants.ARG_NAME_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTHISSOLICITUD);
            comparison1.setSecondOperand(operand223);
            }
            conjunction.addOperand(comparison1);

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1432633737216826FiltNav2(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Usuario usuarioTMODUSUARIOpthisUsuario = filterRequest.hasFilterVariable(UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO) ? usuarioSrv.getByOID(new UsuarioOid().fromJsonString(toJson(filterRequest.getFilterVariable(UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO)))) : null;

        // Persona = pthisUsuario.Solicitud.TitularPersona
        if (usuarioTMODUSUARIOpthisUsuario != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(DireccionConstants.ROLE_NAME_PERSONA, PersonaConstants.CLASS_NAME);
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            if (usuarioTMODUSUARIOpthisUsuario.isNull() || usuarioTMODUSUARIOpthisUsuario.getSolicitud().getTitularPersona().isNull())
            {
            comparison1.setSecondOperand(new SQLWhereOperandNull());
            }
            else
            {
            SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO + "." + UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_TITULARPERSONA, UsuarioConstants.CLASS_NAME, PersonaConstants.CLASS_NAME, usuarioTMODUSUARIOpthisUsuario.getOid(), UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO);
            comparison1.setSecondOperand(operand223);
            }
            conjunction.addOperand(comparison1);

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1432633737216826FiltNav11(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Usuario usuarioTMODUSUARIOpthisUsuario = filterRequest.hasFilterVariable(UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO) ? usuarioSrv.getByOID(new UsuarioOid().fromJsonString(toJson(filterRequest.getFilterVariable(UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO)))) : null;

        // Persona = pthisUsuario.UsuarioPersona
        if (usuarioTMODUSUARIOpthisUsuario != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(DireccionConstants.ROLE_NAME_PERSONA, PersonaConstants.CLASS_NAME);
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO + "." + UsuarioConstants.ROLE_NAME_USUARIOPERSONA, UsuarioConstants.CLASS_NAME, PersonaConstants.CLASS_NAME, usuarioTMODUSUARIOpthisUsuario.getOid(), UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO);
            comparison1.setSecondOperand(operand223);
            conjunction.addOperand(comparison1);

        }        
        sql.addConjunction(conjunction);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUDireccionNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Direccion using displayset DSDireccionNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.direccion.ds.DSDireccionNull> piuPIUDireccionNull(QueryRequest queryRequest) {
        return solveDireccionTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.direccion.ds.DSDireccionNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUDireccionNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUDireccionNull
     */
    public int getCount4PIUDireccionNull(QueryRequest queryRequest) {
        return solveDireccionTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest request) {
        request.setDireccioncrearpagrPersonaInstance(personaSrv.getByOIDWithHV(request.getDireccioncrearpagrPersona()));
        request.setDireccioncrearpagrContratoInstance(solicitudSrv.getByOIDWithHV(request.getDireccioncrearpagrContrato()));
        request.setDireccioncrearpagrTitularInstance(titularSrv.getByOIDWithHV(request.getDireccioncrearpagrTitular()));
        request.setDireccioncrearpagrTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getDireccioncrearpagrTipoDireccion()));
        request.setDireccioncrearpagrPaisInstance(paisSrv.getByOIDWithHV(request.getDireccioncrearpagrPais()));
        request.setDireccioncrearpagrMunicipioInstance(municipioSrv.getByOIDWithHV(request.getDireccioncrearpagrMunicipio()));
        request.setDireccioncrearpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDireccioncrearpagrDepartamento()));
        return direccionSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        Persona direccioncrearpagrPersona = request.getDireccioncrearpagrPersonaInstance();
        Solicitud direccioncrearpagrContrato = request.getDireccioncrearpagrContratoInstance();
        Titular direccioncrearpagrTitular = request.getDireccioncrearpagrTitularInstance();
        TipoDireccion direccioncrearpagrTipoDireccion = request.getDireccioncrearpagrTipoDireccionInstance();
        Pais direccioncrearpagrPais = request.getDireccioncrearpagrPaisInstance();
        Municipio direccioncrearpagrMunicipio = request.getDireccioncrearpagrMunicipioInstance();
        Departamento direccioncrearpagrDepartamento = request.getDireccioncrearpagrDepartamentoInstance();
        String direccioncrearpatrDireccionCompleta = request.getDireccioncrearpatrDireccionCompleta();
        Boolean direccioncrearpatrRural = request.getDireccioncrearpatrRural();
        Direccion instance = new Direccion();
        if (direccioncrearpagrPersona != null && !direccioncrearpagrPersona.isNull()) {
            instance.add2Persona(direccioncrearpagrPersona);
        }

        if (direccioncrearpagrContrato != null && !direccioncrearpagrContrato.isNull()) {
            direccioncrearpagrContrato.add2Direccion(instance);
            instance.add2Contrato(direccioncrearpagrContrato);
        }

        if (direccioncrearpagrTitular != null && !direccioncrearpagrTitular.isNull()) {
            direccioncrearpagrTitular.add2Direccion(instance);
            instance.add2Titular(direccioncrearpagrTitular);
        }

        if (direccioncrearpagrTipoDireccion != null && !direccioncrearpagrTipoDireccion.isNull()) {
            instance.add2TipoDireccion(direccioncrearpagrTipoDireccion);
        }

        if (direccioncrearpagrPais != null && !direccioncrearpagrPais.isNull()) {
            instance.add2Pais(direccioncrearpagrPais);
        }

        if (direccioncrearpagrMunicipio != null && !direccioncrearpagrMunicipio.isNull()) {
            instance.add2Municipio(direccioncrearpagrMunicipio);
        }

        if (direccioncrearpagrDepartamento != null && !direccioncrearpagrDepartamento.isNull()) {
            instance.add2Departamento(direccioncrearpagrDepartamento);
        }

        instance.setDireccionIdentificador(Long.valueOf(0));
        instance.setDireccionCodigo(null);
        instance.setDireccionDireccionCompleta(direccioncrearpatrDireccionCompleta);
        instance.setDireccionRural(direccioncrearpatrRural);

        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

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
            com.keralty.aepersonas.viewmodel.direccion.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.EliminarRequest request) throws ModelException {
        request.setDireccioneliminarpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccioneliminarpthisDireccion()));
        return direccionSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccioneliminarpthisDireccion = request.getDireccioneliminarpthisDireccionInstance();

        request.checkArguments();
        Direccion instance = direccioneliminarpthisDireccion;


        repository.delete(instance);
        
        response.setInstance(instance);
        response.setInstanceSuppInfo(instance.buildICDireccion());

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
            com.keralty.aepersonas.viewmodel.direccion.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.modificarTxn(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.ModificarRequest request) throws ModelException {
        request.setDireccionmodificarpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionmodificarpthisDireccion()));
        return direccionSrv.modificarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionmodificarpthisDireccion = request.getDireccionmodificarpthisDireccionInstance();
        String direccionmodificarpDireccionCompleta = request.getDireccionmodificarpDireccionCompleta();
        Boolean direccionmodificarpRural = request.getDireccionmodificarpRural();

        request.checkArguments();
        Direccion instance = direccionmodificarpthisDireccion;
        instance.setDireccionDireccionCompleta(direccionmodificarpDireccionCompleta);
        instance.setDireccionRural(direccionmodificarpRural);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: InsTipoDireccion

    /*
     * Entry point for service InsTipoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insTipoDireccion(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsTipoDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.insTipoDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsTipoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insTipoDireccionTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsTipoDireccionRequest request) throws ModelException {
        request.setDireccionInsTipoDireccionpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionInsTipoDireccionpthisDireccion()));
        request.setDireccionInsTipoDireccionpevcTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getDireccionInsTipoDireccionpevcTipoDireccion()));
        return direccionSrv.insTipoDireccionImplementation(request, true);
    }

    /*
     * Implements service InsTipoDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insTipoDireccionImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsTipoDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionInsTipoDireccionpthisDireccion = request.getDireccionInsTipoDireccionpthisDireccionInstance();
        TipoDireccion direccionInsTipoDireccionpevcTipoDireccion = request.getDireccionInsTipoDireccionpevcTipoDireccionInstance();

        request.checkArguments();
        Direccion instance = direccionInsTipoDireccionpthisDireccion;

        instance.add2TipoDireccion(direccionInsTipoDireccionpevcTipoDireccion);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.tipodireccion.siu.InsTipoDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.tipodireccion.siu.InsTipoDireccionRequest();
            relatedRequest.setTipoDireccionInsTipoDireccionpthisTipoDireccionInstance(direccionInsTipoDireccionpevcTipoDireccion);
            relatedRequest.setTipoDireccionInsTipoDireccionpevcDireccionInstance(direccionInsTipoDireccionpthisDireccion);
            tipoDireccionSrv.insTipoDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: DelTipoDireccion

    /*
     * Entry point for service DelTipoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delTipoDireccion(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelTipoDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.delTipoDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelTipoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delTipoDireccionTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelTipoDireccionRequest request) throws ModelException {
        request.setDireccionDelTipoDireccionpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionDelTipoDireccionpthisDireccion()));
        request.setDireccionDelTipoDireccionpevcTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getDireccionDelTipoDireccionpevcTipoDireccion()));
        return direccionSrv.delTipoDireccionImplementation(request, true);
    }

    /*
     * Implements service DelTipoDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delTipoDireccionImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelTipoDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionDelTipoDireccionpthisDireccion = request.getDireccionDelTipoDireccionpthisDireccionInstance();
        TipoDireccion direccionDelTipoDireccionpevcTipoDireccion = request.getDireccionDelTipoDireccionpevcTipoDireccionInstance();

        request.checkArguments();
        Direccion instance = direccionDelTipoDireccionpthisDireccion;

        instance.add2TipoDireccion(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.tipodireccion.siu.DelTipoDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.tipodireccion.siu.DelTipoDireccionRequest();
            relatedRequest.setTipoDireccionDelTipoDireccionpthisTipoDireccionInstance(direccionDelTipoDireccionpevcTipoDireccion);
            relatedRequest.setTipoDireccionDelTipoDireccionpevcDireccionInstance(direccionDelTipoDireccionpthisDireccion);
            tipoDireccionSrv.delTipoDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: InsMunicipioDireccion

    /*
     * Entry point for service InsMunicipioDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insMunicipioDireccion(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsMunicipioDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.insMunicipioDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsMunicipioDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insMunicipioDireccionTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsMunicipioDireccionRequest request) throws ModelException {
        request.setDireccionInsMunicipioDireccionpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionInsMunicipioDireccionpthisDireccion()));
        request.setDireccionInsMunicipioDireccionpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getDireccionInsMunicipioDireccionpevcMunicipio()));
        return direccionSrv.insMunicipioDireccionImplementation(request, true);
    }

    /*
     * Implements service InsMunicipioDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insMunicipioDireccionImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsMunicipioDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionInsMunicipioDireccionpthisDireccion = request.getDireccionInsMunicipioDireccionpthisDireccionInstance();
        Municipio direccionInsMunicipioDireccionpevcMunicipio = request.getDireccionInsMunicipioDireccionpevcMunicipioInstance();

        request.checkArguments();
        Direccion instance = direccionInsMunicipioDireccionpthisDireccion;

        instance.add2Municipio(direccionInsMunicipioDireccionpevcMunicipio);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioDireccionRequest();
            relatedRequest.setMunicipioInsMunicipioDireccionpthisMunicipioInstance(direccionInsMunicipioDireccionpevcMunicipio);
            relatedRequest.setMunicipioInsMunicipioDireccionpevcDireccionInstance(direccionInsMunicipioDireccionpthisDireccion);
            municipioSrv.insMunicipioDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: DelMunicipioDireccion

    /*
     * Entry point for service DelMunicipioDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delMunicipioDireccion(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelMunicipioDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.delMunicipioDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelMunicipioDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delMunicipioDireccionTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelMunicipioDireccionRequest request) throws ModelException {
        request.setDireccionDelMunicipioDireccionpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionDelMunicipioDireccionpthisDireccion()));
        request.setDireccionDelMunicipioDireccionpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getDireccionDelMunicipioDireccionpevcMunicipio()));
        return direccionSrv.delMunicipioDireccionImplementation(request, true);
    }

    /*
     * Implements service DelMunicipioDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delMunicipioDireccionImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelMunicipioDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionDelMunicipioDireccionpthisDireccion = request.getDireccionDelMunicipioDireccionpthisDireccionInstance();
        Municipio direccionDelMunicipioDireccionpevcMunicipio = request.getDireccionDelMunicipioDireccionpevcMunicipioInstance();

        request.checkArguments();
        Direccion instance = direccionDelMunicipioDireccionpthisDireccion;

        instance.add2Municipio(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioDireccionRequest();
            relatedRequest.setMunicipioDelMunicipioDireccionpthisMunicipioInstance(direccionDelMunicipioDireccionpevcMunicipio);
            relatedRequest.setMunicipioDelMunicipioDireccionpevcDireccionInstance(direccionDelMunicipioDireccionpthisDireccion);
            municipioSrv.delMunicipioDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: InsDepartamentoDireccion

    /*
     * Entry point for service InsDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDepartamentoDireccion(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDepartamentoDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.insDepartamentoDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDepartamentoDireccionTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDepartamentoDireccionRequest request) throws ModelException {
        request.setDireccionInsDepartamentoDireccionpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionInsDepartamentoDireccionpthisDireccion()));
        request.setDireccionInsDepartamentoDireccionpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDireccionInsDepartamentoDireccionpevcDepartamento()));
        return direccionSrv.insDepartamentoDireccionImplementation(request, true);
    }

    /*
     * Implements service InsDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDepartamentoDireccionImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDepartamentoDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionInsDepartamentoDireccionpthisDireccion = request.getDireccionInsDepartamentoDireccionpthisDireccionInstance();
        Departamento direccionInsDepartamentoDireccionpevcDepartamento = request.getDireccionInsDepartamentoDireccionpevcDepartamentoInstance();

        request.checkArguments();
        Direccion instance = direccionInsDepartamentoDireccionpthisDireccion;

        instance.add2Departamento(direccionInsDepartamentoDireccionpevcDepartamento);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoDireccionRequest();
            relatedRequest.setDepartamentoInsDepartamentoDireccionpthisDepartamentoInstance(direccionInsDepartamentoDireccionpevcDepartamento);
            relatedRequest.setDepartamentoInsDepartamentoDireccionpevcDireccionInstance(direccionInsDepartamentoDireccionpthisDireccion);
            departamentoSrv.insDepartamentoDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: DelDepartamentoDireccion

    /*
     * Entry point for service DelDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDepartamentoDireccion(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDepartamentoDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.delDepartamentoDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDepartamentoDireccionTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDepartamentoDireccionRequest request) throws ModelException {
        request.setDireccionDelDepartamentoDireccionpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionDelDepartamentoDireccionpthisDireccion()));
        request.setDireccionDelDepartamentoDireccionpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDireccionDelDepartamentoDireccionpevcDepartamento()));
        return direccionSrv.delDepartamentoDireccionImplementation(request, true);
    }

    /*
     * Implements service DelDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDepartamentoDireccionImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDepartamentoDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionDelDepartamentoDireccionpthisDireccion = request.getDireccionDelDepartamentoDireccionpthisDireccionInstance();
        Departamento direccionDelDepartamentoDireccionpevcDepartamento = request.getDireccionDelDepartamentoDireccionpevcDepartamentoInstance();

        request.checkArguments();
        Direccion instance = direccionDelDepartamentoDireccionpthisDireccion;

        instance.add2Departamento(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoDireccionRequest();
            relatedRequest.setDepartamentoDelDepartamentoDireccionpthisDepartamentoInstance(direccionDelDepartamentoDireccionpevcDepartamento);
            relatedRequest.setDepartamentoDelDepartamentoDireccionpevcDireccionInstance(direccionDelDepartamentoDireccionpthisDireccion);
            departamentoSrv.delDepartamentoDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: InsPaisDireccion

    /*
     * Entry point for service InsPaisDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insPaisDireccion(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsPaisDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.insPaisDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsPaisDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insPaisDireccionTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsPaisDireccionRequest request) throws ModelException {
        request.setDireccionInsPaisDireccionpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionInsPaisDireccionpthisDireccion()));
        request.setDireccionInsPaisDireccionpevcPaisInstance(paisSrv.getByOIDWithHV(request.getDireccionInsPaisDireccionpevcPais()));
        return direccionSrv.insPaisDireccionImplementation(request, true);
    }

    /*
     * Implements service InsPaisDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insPaisDireccionImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsPaisDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionInsPaisDireccionpthisDireccion = request.getDireccionInsPaisDireccionpthisDireccionInstance();
        Pais direccionInsPaisDireccionpevcPais = request.getDireccionInsPaisDireccionpevcPaisInstance();

        request.checkArguments();
        Direccion instance = direccionInsPaisDireccionpthisDireccion;

        instance.add2Pais(direccionInsPaisDireccionpevcPais);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.pais.siu.InsPaisDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.pais.siu.InsPaisDireccionRequest();
            relatedRequest.setPaisInsPaisDireccionpthisPaisInstance(direccionInsPaisDireccionpevcPais);
            relatedRequest.setPaisInsPaisDireccionpevcDireccionInstance(direccionInsPaisDireccionpthisDireccion);
            paisSrv.insPaisDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: DelPaisDireccion

    /*
     * Entry point for service DelPaisDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delPaisDireccion(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelPaisDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.delPaisDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelPaisDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delPaisDireccionTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelPaisDireccionRequest request) throws ModelException {
        request.setDireccionDelPaisDireccionpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionDelPaisDireccionpthisDireccion()));
        request.setDireccionDelPaisDireccionpevcPaisInstance(paisSrv.getByOIDWithHV(request.getDireccionDelPaisDireccionpevcPais()));
        return direccionSrv.delPaisDireccionImplementation(request, true);
    }

    /*
     * Implements service DelPaisDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delPaisDireccionImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelPaisDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionDelPaisDireccionpthisDireccion = request.getDireccionDelPaisDireccionpthisDireccionInstance();
        Pais direccionDelPaisDireccionpevcPais = request.getDireccionDelPaisDireccionpevcPaisInstance();

        request.checkArguments();
        Direccion instance = direccionDelPaisDireccionpthisDireccion;

        instance.add2Pais(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.pais.siu.DelPaisDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.pais.siu.DelPaisDireccionRequest();
            relatedRequest.setPaisDelPaisDireccionpthisPaisInstance(direccionDelPaisDireccionpevcPais);
            relatedRequest.setPaisDelPaisDireccionpevcDireccionInstance(direccionDelPaisDireccionpthisDireccion);
            paisSrv.delPaisDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: registrarCodigo

    /*
     * Entry point for service registrarCodigo
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse registrarCodigo(
            com.keralty.aepersonas.viewmodel.direccion.siu.RegistrarCodigoRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.registrarCodigoTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service registrarCodigo
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse registrarCodigoTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.RegistrarCodigoRequest request) throws ModelException {
        request.setDireccionregistrarCodigopthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionregistrarCodigopthisDireccion()));
        return direccionSrv.registrarCodigoImplementation(request);
    }

    /*
     * Implements service registrarCodigo
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse registrarCodigoImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.RegistrarCodigoRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionregistrarCodigopthisDireccion = request.getDireccionregistrarCodigopthisDireccionInstance();
        Long direccionregistrarCodigopCodigo = request.getDireccionregistrarCodigopCodigo();

        request.checkArguments();
        Direccion instance = direccionregistrarCodigopthisDireccion;
        instance.setDireccionCodigo(direccionregistrarCodigopCodigo);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: InsDirTitular

    /*
     * Entry point for service InsDirTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDirTitular(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDirTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.insDirTitularTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDirTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDirTitularTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDirTitularRequest request) throws ModelException {
        request.setDireccionInsDirTitularpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionInsDirTitularpthisDireccion()));
        request.setDireccionInsDirTitularpevcTitularInstance(titularSrv.getByOIDWithHV(request.getDireccionInsDirTitularpevcTitular()));
        return direccionSrv.insDirTitularImplementation(request, true);
    }

    /*
     * Implements service InsDirTitular
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDirTitularImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDirTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionInsDirTitularpthisDireccion = request.getDireccionInsDirTitularpthisDireccionInstance();
        Titular direccionInsDirTitularpevcTitular = request.getDireccionInsDirTitularpevcTitularInstance();

        request.checkArguments();
        Direccion instance = direccionInsDirTitularpthisDireccion;

        instance.add2Titular(direccionInsDirTitularpevcTitular);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.titular.siu.InsDirTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.titular.siu.InsDirTitularRequest();
            relatedRequest.setTitularInsDirTitularpthisTitularInstance(direccionInsDirTitularpevcTitular);
            relatedRequest.setTitularInsDirTitularpevcDireccionInstance(direccionInsDirTitularpthisDireccion);
            titularSrv.insDirTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
    }

    // Service: DelDirTitular

    /*
     * Entry point for service DelDirTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDirTitular(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDirTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.delDirTitularTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDirTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDirTitularTxn(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDirTitularRequest request) throws ModelException {
        request.setDireccionDelDirTitularpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionDelDirTitularpthisDireccion()));
        request.setDireccionDelDirTitularpevcTitularInstance(titularSrv.getByOIDWithHV(request.getDireccionDelDirTitularpevcTitular()));
        return direccionSrv.delDirTitularImplementation(request, true);
    }

    /*
     * Implements service DelDirTitular
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDirTitularImplementation(
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDirTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Direccion direccionDelDirTitularpthisDireccion = request.getDireccionDelDirTitularpthisDireccionInstance();
        Titular direccionDelDirTitularpevcTitular = request.getDireccionDelDirTitularpevcTitularInstance();

        request.checkArguments();
        Direccion instance = direccionDelDirTitularpthisDireccion;

        instance.add2Titular(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.titular.siu.DelDirTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.titular.siu.DelDirTitularRequest();
            relatedRequest.setTitularDelDirTitularpthisTitularInstance(direccionDelDirTitularpevcTitular);
            relatedRequest.setTitularDelDirTitularpevcDireccionInstance(direccionDelDirTitularpthisDireccion);
            titularSrv.delDirTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDireccion());

        return response;
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
            com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.tMODIFICARTxn(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest request) throws ModelException, SystemException {
        request.setDireccionTMODIFICARpthisDireccionInstance(direccionSrv.getByOIDWithHV(request.getDireccionTMODIFICARpthisDireccion()));
        request.setDireccionTMODIFICARptpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDireccionTMODIFICARptpevcDepartamento()));
        request.setDireccionTMODIFICARptpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getDireccionTMODIFICARptpevcMunicipio()));
        request.setDireccionTMODIFICARptpevcPaisInstance(paisSrv.getByOIDWithHV(request.getDireccionTMODIFICARptpevcPais()));
        request.setDireccionTMODIFICARptpevcTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getDireccionTMODIFICARptpevcTipoDireccion()));
        return direccionSrv.tMODIFICARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        String direccionTMODIFICARptpDireccionCompleta = request.getDireccionTMODIFICARptpDireccionCompleta();
        Boolean direccionTMODIFICARptpRural = request.getDireccionTMODIFICARptpRural();
        Departamento direccionTMODIFICARptpevcDepartamento = request.getDireccionTMODIFICARptpevcDepartamentoInstance();
        Municipio direccionTMODIFICARptpevcMunicipio = request.getDireccionTMODIFICARptpevcMunicipioInstance();
        Pais direccionTMODIFICARptpevcPais = request.getDireccionTMODIFICARptpevcPaisInstance();
        TipoDireccion direccionTMODIFICARptpevcTipoDireccion = request.getDireccionTMODIFICARptpevcTipoDireccionInstance();
        Direccion direccionTMODIFICARpthisDireccion = request.getDireccionTMODIFICARpthisDireccionInstance();

        request.checkArguments();
        Direccion instance = direccionTMODIFICARpthisDireccion;

        com.keralty.aepersonas.viewmodel.direccion.siu.ModificarRequest step1Request = new com.keralty.aepersonas.viewmodel.direccion.siu.ModificarRequest();
        step1Request.setDireccionmodificarpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
        step1Request.setDireccionmodificarpDireccionCompleta(direccionTMODIFICARptpDireccionCompleta);
        step1Request.setDireccionmodificarpRural(direccionTMODIFICARptpRural);
        direccionSrv.modificarImplementation(step1Request);

        boolean guard2 = repository.assocOperator000(direccionTMODIFICARpthisDireccion).equals(false) && (direccionTMODIFICARptpevcDepartamento != null && !direccionTMODIFICARptpevcDepartamento.isNull());

        if (guard2) {
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDepartamentoDireccionRequest step2Request = new com.keralty.aepersonas.viewmodel.direccion.siu.InsDepartamentoDireccionRequest();
            step2Request.setDireccionInsDepartamentoDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step2Request.setDireccionInsDepartamentoDireccionpevcDepartamentoInstance(direccionTMODIFICARptpevcDepartamento);
            direccionSrv.insDepartamentoDireccionImplementation(step2Request, true);
        }

        boolean guard3 = repository.assocOperator001(direccionTMODIFICARpthisDireccion).equals(true) && (direccionTMODIFICARptpevcDepartamento == null || direccionTMODIFICARptpevcDepartamento.isNull());

        if (guard3) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDepartamentoDireccionRequest step3Request = new com.keralty.aepersonas.viewmodel.direccion.siu.DelDepartamentoDireccionRequest();
            step3Request.setDireccionDelDepartamentoDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step3Request.setDireccionDelDepartamentoDireccionpevcDepartamentoInstance(direccionTMODIFICARpthisDireccion.getDepartamento());
            direccionSrv.delDepartamentoDireccionImplementation(step3Request, true);
        }

        /* Action 4: IF (EXIST (Departamento) = true AND ptpevcDepartamento <> NULL AND Departamento <> ptpevcDepartamento) */
        boolean ifCondition4 = repository.assocOperator012(direccionTMODIFICARpthisDireccion).equals(true) && (direccionTMODIFICARptpevcDepartamento != null && !direccionTMODIFICARptpevcDepartamento.isNull()) && !(direccionTMODIFICARpthisDireccion.getDepartamento().equalsObject(direccionTMODIFICARptpevcDepartamento));
        if (ifCondition4) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDepartamentoDireccionRequest step40Request = new com.keralty.aepersonas.viewmodel.direccion.siu.DelDepartamentoDireccionRequest();
            step40Request.setDireccionDelDepartamentoDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step40Request.setDireccionDelDepartamentoDireccionpevcDepartamentoInstance(direccionTMODIFICARpthisDireccion.getDepartamento());
            direccionSrv.delDepartamentoDireccionImplementation(step40Request, true);
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDepartamentoDireccionRequest step41Request = new com.keralty.aepersonas.viewmodel.direccion.siu.InsDepartamentoDireccionRequest();
            step41Request.setDireccionInsDepartamentoDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step41Request.setDireccionInsDepartamentoDireccionpevcDepartamentoInstance(direccionTMODIFICARptpevcDepartamento);
            direccionSrv.insDepartamentoDireccionImplementation(step41Request, true);
        }

        boolean guard5 = repository.assocOperator003(direccionTMODIFICARpthisDireccion).equals(false) && (direccionTMODIFICARptpevcMunicipio != null && !direccionTMODIFICARptpevcMunicipio.isNull());

        if (guard5) {
            com.keralty.aepersonas.viewmodel.direccion.siu.InsMunicipioDireccionRequest step5Request = new com.keralty.aepersonas.viewmodel.direccion.siu.InsMunicipioDireccionRequest();
            step5Request.setDireccionInsMunicipioDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step5Request.setDireccionInsMunicipioDireccionpevcMunicipioInstance(direccionTMODIFICARptpevcMunicipio);
            direccionSrv.insMunicipioDireccionImplementation(step5Request, true);
        }

        boolean guard6 = repository.assocOperator004(direccionTMODIFICARpthisDireccion).equals(true) && (direccionTMODIFICARptpevcMunicipio == null || direccionTMODIFICARptpevcMunicipio.isNull());

        if (guard6) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelMunicipioDireccionRequest step6Request = new com.keralty.aepersonas.viewmodel.direccion.siu.DelMunicipioDireccionRequest();
            step6Request.setDireccionDelMunicipioDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step6Request.setDireccionDelMunicipioDireccionpevcMunicipioInstance(direccionTMODIFICARpthisDireccion.getMunicipio());
            direccionSrv.delMunicipioDireccionImplementation(step6Request, true);
        }

        /* Action 7: IF (EXIST (Municipio) = true AND ptpevcMunicipio <> NULL AND Municipio <> ptpevcMunicipio) */
        boolean ifCondition7 = repository.assocOperator013(direccionTMODIFICARpthisDireccion).equals(true) && (direccionTMODIFICARptpevcMunicipio != null && !direccionTMODIFICARptpevcMunicipio.isNull()) && !(direccionTMODIFICARpthisDireccion.getMunicipio().equalsObject(direccionTMODIFICARptpevcMunicipio));
        if (ifCondition7) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelMunicipioDireccionRequest step70Request = new com.keralty.aepersonas.viewmodel.direccion.siu.DelMunicipioDireccionRequest();
            step70Request.setDireccionDelMunicipioDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step70Request.setDireccionDelMunicipioDireccionpevcMunicipioInstance(direccionTMODIFICARpthisDireccion.getMunicipio());
            direccionSrv.delMunicipioDireccionImplementation(step70Request, true);
            com.keralty.aepersonas.viewmodel.direccion.siu.InsMunicipioDireccionRequest step71Request = new com.keralty.aepersonas.viewmodel.direccion.siu.InsMunicipioDireccionRequest();
            step71Request.setDireccionInsMunicipioDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step71Request.setDireccionInsMunicipioDireccionpevcMunicipioInstance(direccionTMODIFICARptpevcMunicipio);
            direccionSrv.insMunicipioDireccionImplementation(step71Request, true);
        }

        boolean guard8 = repository.assocOperator006(direccionTMODIFICARpthisDireccion).equals(false) && (direccionTMODIFICARptpevcPais != null && !direccionTMODIFICARptpevcPais.isNull());

        if (guard8) {
            com.keralty.aepersonas.viewmodel.direccion.siu.InsPaisDireccionRequest step8Request = new com.keralty.aepersonas.viewmodel.direccion.siu.InsPaisDireccionRequest();
            step8Request.setDireccionInsPaisDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step8Request.setDireccionInsPaisDireccionpevcPaisInstance(direccionTMODIFICARptpevcPais);
            direccionSrv.insPaisDireccionImplementation(step8Request, true);
        }

        boolean guard9 = repository.assocOperator007(direccionTMODIFICARpthisDireccion).equals(true) && (direccionTMODIFICARptpevcPais == null || direccionTMODIFICARptpevcPais.isNull());

        if (guard9) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelPaisDireccionRequest step9Request = new com.keralty.aepersonas.viewmodel.direccion.siu.DelPaisDireccionRequest();
            step9Request.setDireccionDelPaisDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step9Request.setDireccionDelPaisDireccionpevcPaisInstance(direccionTMODIFICARpthisDireccion.getPais());
            direccionSrv.delPaisDireccionImplementation(step9Request, true);
        }

        /* Action 10: IF (EXIST (Pais) = true AND ptpevcPais <> NULL AND Pais <> ptpevcPais) */
        boolean ifCondition10 = repository.assocOperator014(direccionTMODIFICARpthisDireccion).equals(true) && (direccionTMODIFICARptpevcPais != null && !direccionTMODIFICARptpevcPais.isNull()) && !(direccionTMODIFICARpthisDireccion.getPais().equalsObject(direccionTMODIFICARptpevcPais));
        if (ifCondition10) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelPaisDireccionRequest step100Request = new com.keralty.aepersonas.viewmodel.direccion.siu.DelPaisDireccionRequest();
            step100Request.setDireccionDelPaisDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step100Request.setDireccionDelPaisDireccionpevcPaisInstance(direccionTMODIFICARpthisDireccion.getPais());
            direccionSrv.delPaisDireccionImplementation(step100Request, true);
            com.keralty.aepersonas.viewmodel.direccion.siu.InsPaisDireccionRequest step101Request = new com.keralty.aepersonas.viewmodel.direccion.siu.InsPaisDireccionRequest();
            step101Request.setDireccionInsPaisDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step101Request.setDireccionInsPaisDireccionpevcPaisInstance(direccionTMODIFICARptpevcPais);
            direccionSrv.insPaisDireccionImplementation(step101Request, true);
        }

        boolean guard11 = repository.assocOperator009(direccionTMODIFICARpthisDireccion).equals(false) && (direccionTMODIFICARptpevcTipoDireccion != null && !direccionTMODIFICARptpevcTipoDireccion.isNull());

        if (guard11) {
            com.keralty.aepersonas.viewmodel.direccion.siu.InsTipoDireccionRequest step11Request = new com.keralty.aepersonas.viewmodel.direccion.siu.InsTipoDireccionRequest();
            step11Request.setDireccionInsTipoDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step11Request.setDireccionInsTipoDireccionpevcTipoDireccionInstance(direccionTMODIFICARptpevcTipoDireccion);
            direccionSrv.insTipoDireccionImplementation(step11Request, true);
        }

        boolean guard12 = repository.assocOperator010(direccionTMODIFICARpthisDireccion).equals(true) && (direccionTMODIFICARptpevcTipoDireccion == null || direccionTMODIFICARptpevcTipoDireccion.isNull());

        if (guard12) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelTipoDireccionRequest step12Request = new com.keralty.aepersonas.viewmodel.direccion.siu.DelTipoDireccionRequest();
            step12Request.setDireccionDelTipoDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step12Request.setDireccionDelTipoDireccionpevcTipoDireccionInstance(direccionTMODIFICARpthisDireccion.getTipoDireccion());
            direccionSrv.delTipoDireccionImplementation(step12Request, true);
        }

        /* Action 13: IF (EXIST (TipoDireccion) = true AND ptpevcTipoDireccion <> NULL AND TipoDireccion <> ptpevcTipoDireccion) */
        boolean ifCondition13 = repository.assocOperator015(direccionTMODIFICARpthisDireccion).equals(true) && (direccionTMODIFICARptpevcTipoDireccion != null && !direccionTMODIFICARptpevcTipoDireccion.isNull()) && !(direccionTMODIFICARpthisDireccion.getTipoDireccion().equalsObject(direccionTMODIFICARptpevcTipoDireccion));
        if (ifCondition13) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelTipoDireccionRequest step130Request = new com.keralty.aepersonas.viewmodel.direccion.siu.DelTipoDireccionRequest();
            step130Request.setDireccionDelTipoDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step130Request.setDireccionDelTipoDireccionpevcTipoDireccionInstance(direccionTMODIFICARpthisDireccion.getTipoDireccion());
            direccionSrv.delTipoDireccionImplementation(step130Request, true);
            com.keralty.aepersonas.viewmodel.direccion.siu.InsTipoDireccionRequest step131Request = new com.keralty.aepersonas.viewmodel.direccion.siu.InsTipoDireccionRequest();
            step131Request.setDireccionInsTipoDireccionpthisDireccionInstance(direccionTMODIFICARpthisDireccion);
            step131Request.setDireccionInsTipoDireccionpevcTipoDireccionInstance(direccionTMODIFICARptpevcTipoDireccion);
            direccionSrv.insTipoDireccionImplementation(step131Request, true);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICDireccion());

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
            com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = direccionSrv.tCREARTxn(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest request) {
        request.setDireccionTCREARptpagrPersonaInstance(personaSrv.getByOIDWithHV(request.getDireccionTCREARptpagrPersona()));
        request.setDireccionTCREARptpagrContratoInstance(solicitudSrv.getByOIDWithHV(request.getDireccionTCREARptpagrContrato()));
        request.setDireccionTCREARptpagrTitularInstance(titularSrv.getByOIDWithHV(request.getDireccionTCREARptpagrTitular()));
        request.setDireccionTCREARptpagrTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getDireccionTCREARptpagrTipoDireccion()));
        request.setDireccionTCREARptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(request.getDireccionTCREARptpagrMunicipio()));
        request.setDireccionTCREARptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDireccionTCREARptpagrDepartamento()));
        request.setDireccionTCREARptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getDireccionTCREARptpagrPais()));
        return direccionSrv.tCREARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest request) {
        ServiceResponse response = new ServiceResponse();
        Persona direccionTCREARptpagrPersona = request.getDireccionTCREARptpagrPersonaInstance();
        Solicitud direccionTCREARptpagrContrato = request.getDireccionTCREARptpagrContratoInstance();
        Titular direccionTCREARptpagrTitular = request.getDireccionTCREARptpagrTitularInstance();
        TipoDireccion direccionTCREARptpagrTipoDireccion = request.getDireccionTCREARptpagrTipoDireccionInstance();
        Pais direccionTCREARptpagrPais = request.getDireccionTCREARptpagrPaisInstance();
        Municipio direccionTCREARptpagrMunicipio = request.getDireccionTCREARptpagrMunicipioInstance();
        Departamento direccionTCREARptpagrDepartamento = request.getDireccionTCREARptpagrDepartamentoInstance();
        String direccionTCREARptpatrDireccionCompleta = request.getDireccionTCREARptpatrDireccionCompleta();
        Boolean direccionTCREARptpatrRural = request.getDireccionTCREARptpatrRural();
        Direccion instance;

        com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest();
        step1Request.setDireccioncrearpagrPersonaInstance(direccionTCREARptpagrPersona);
        step1Request.setDireccioncrearpagrContratoInstance(direccionTCREARptpagrContrato);
        step1Request.setDireccioncrearpagrTitularInstance(direccionTCREARptpagrTitular);
        step1Request.setDireccioncrearpagrTipoDireccionInstance(direccionTCREARptpagrTipoDireccion);
        step1Request.setDireccioncrearpagrPaisInstance(direccionTCREARptpagrPais);
        step1Request.setDireccioncrearpagrMunicipioInstance(direccionTCREARptpagrMunicipio);
        step1Request.setDireccioncrearpagrDepartamentoInstance(direccionTCREARptpagrDepartamento);
        step1Request.setDireccioncrearpatrDireccionCompleta(direccionTCREARptpatrDireccionCompleta);
        step1Request.setDireccioncrearpatrRural(direccionTCREARptpatrRural);
        instance = (Direccion) direccionSrv.crearImplementation(step1Request).getInstance();

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICDireccion());

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
        select.getOrderByPart().addItem(Constants.normalizePath(DireccionConstants.CLASS_NAME, DireccionConstants.ATTR_FIELD_DIRECCIONIDENTIFICADOR, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildDireccionRelatedInstance(relatedInstanceJsonOid);
        }
        if (DireccionConstants.ROLE_NAME_PERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_TIPODIRECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4TipoDireccion(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_MUNICIPIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_DEPARTAMENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_PAIS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_CONTRATO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_TITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildDireccionRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildDireccionRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildDireccionRelatedInstance4TipoDireccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new TipoDireccion(mapper.readValue(relatedInstanceJsonOid, TipoDireccionOid.class)): TipoDireccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildDireccionRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildDireccionRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildDireccionRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildDireccionRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildDireccionRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            DireccionOid oid = new DireccionOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(DireccionConstants.ATTR_FIELD_DIRECCIONIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getDireccionIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(DireccionService.class).error(e.getMessage());
        }
    }

}
