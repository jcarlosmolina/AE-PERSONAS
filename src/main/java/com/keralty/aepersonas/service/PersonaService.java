package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.MinCardinalityException;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.PreconditionException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.DocumentoGOid;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoDireccion;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.repository.PersonaJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandNull;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathInstance;
import com.keralty.aepersonas.utils.Utilities;
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
public class PersonaService extends AbstractService {

    PersonaJpaRepository repository;

    PersonaService personaSrv;

    DepartamentoService departamentoSrv;

    MunicipioService municipioSrv;

    EstadoCivilService estadoCivilSrv;

    EstadoPersonaService estadoPersonaSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    SolicitudService solicitudSrv;

    PaisService paisSrv;

    TipoDireccionService tipoDireccionSrv;

    DireccionService direccionSrv;

    AesolicitudesService aesolicitudesSrv;

    PlanesService planesSrv;

    UsuarioService usuarioSrv;

    ParentescoService parentescoSrv;

    DocumentoGService documentoGSrv;

    ContratanteService contratanteSrv;

    TitularService titularSrv;

    UserFunctions userFunctionsSrv;

    @Inject
    public PersonaService(
            PersonaService personaSrv,
            DepartamentoService departamentoSrv,
            MunicipioService municipioSrv,
            EstadoCivilService estadoCivilSrv,
            EstadoPersonaService estadoPersonaSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            SolicitudService solicitudSrv,
            PaisService paisSrv,
            TipoDireccionService tipoDireccionSrv,
            DireccionService direccionSrv,
            AesolicitudesService aesolicitudesSrv,
            PlanesService planesSrv,
            UsuarioService usuarioSrv,
            ParentescoService parentescoSrv,
            DocumentoGService documentoGSrv,
            ContratanteService contratanteSrv,
            TitularService titularSrv,
            UserFunctions userFunctionsSrv,
            PersonaJpaRepository repository) {
        this.personaSrv = personaSrv;
        this.departamentoSrv = departamentoSrv;
        this.municipioSrv = municipioSrv;
        this.estadoCivilSrv = estadoCivilSrv;
        this.estadoPersonaSrv = estadoPersonaSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.solicitudSrv = solicitudSrv;
        this.paisSrv = paisSrv;
        this.tipoDireccionSrv = tipoDireccionSrv;
        this.direccionSrv = direccionSrv;
        this.aesolicitudesSrv = aesolicitudesSrv;
        this.planesSrv = planesSrv;
        this.usuarioSrv = usuarioSrv;
        this.parentescoSrv = parentescoSrv;
        this.documentoGSrv = documentoGSrv;
        this.contratanteSrv = contratanteSrv;
        this.titularSrv = titularSrv;
        this.userFunctionsSrv = userFunctionsSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, PersonaConstants.CLASS_NAME);
    }

    private List<Persona> solvePersonaTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, PersonaConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solvePersonaTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, PersonaConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Persona
     *
     * @return Population of class Persona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Persona> get() {
        List<Persona> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Persona
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Persona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Persona> instances = get(queryRequest);
        if(PersonaConstants.DSICPERSONA.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICPersona())).collect(Collectors.toList());
        }
        if(PersonaConstants.DSDSPERSONAPIU.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSPersonaPIU())).collect(Collectors.toList());
        }
        if(PersonaConstants.DSIC2PERSONA.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildIC2Persona())).collect(Collectors.toList());
        }
        if(PersonaConstants.DSICPERSONANOMBRESAPELLIDOS.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICPersonaNombresApellidos())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Persona that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Persona matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Persona> get(QueryRequest queryRequest) {
        return solvePersonaTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solvePersonaTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solvePersonaTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solvePersonaTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solvePersonaTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Persona by ID
     *
     * @param personaIdentificador Identification field personaIdentificador
     *
     * @return Instance of Persona
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Persona getById(Long personaIdentificador) {
        return getByOID(new PersonaOid(personaIdentificador));
    }
    
    /*
     * Returns an instance of Persona by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Persona
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Persona getByOID(PersonaOid oid) {
        Optional<Persona> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Persona by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Persona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Persona getByOIDWithHV(PersonaOid oid) {
        Optional<Persona> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Persona> getInstanceByOid(PersonaOid oid) {
        return oid != null && oid.getPersonaIdentificador() != null
               ? repository.findById(oid.getPersonaIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of Persona by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Persona
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Persona getByJsonOid(String jsonOid) {
        PersonaOid oid = new PersonaOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Persona related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Persona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Persona> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solvePersonaTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Persona related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Persona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Persona> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Persona
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Persona
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getPersonaDynamic(PersonaOid oid, String displaySetItems) {
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
    public String getSuppInfo(PersonaOid oid, String dsName) {
        Persona instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Persona instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (PersonaConstants.DSICPERSONA.equals(dsName))
            return instance.buildICPersona();
        if (PersonaConstants.DSICPERSONANOMBRESAPELLIDOS.equals(dsName))
            return instance.buildICPersonaNombresApellidos();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Persona instance, String dsName) {
        if (PersonaConstants.DSICPERSONA.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICPersona());
        if (PersonaConstants.DSDSPERSONAPIU.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSPersonaPIU());
        if (PersonaConstants.DSIC2PERSONA.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildIC2Persona());
        if (PersonaConstants.DSICPERSONANOMBRESAPELLIDOS.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICPersonaNombresApellidos());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (PersonaConstants.FILTER_NAME_FPERSONAVARIOS.equalsIgnoreCase(filterRequest.getName()))
            fPersonaVarios(filterRequest, sql);
        if (PersonaConstants.FILTER_NAME_FPERSONACONSULTARCORE.equalsIgnoreCase(filterRequest.getName()))
            fPersonaConsultarCORE(filterRequest, sql);
        if (PersonaConstants.FILTER_NAME_FPERSONACONSULTARCORENAT.equalsIgnoreCase(filterRequest.getName()))
            fPersonaConsultarCORENat(filterRequest, sql);
        if (PersonaConstants.FILTER_NAME_IFPERSONACODIGOCORE.equalsIgnoreCase(filterRequest.getName()))
            iFPersonaCodigoCORE(filterRequest, sql);
        if (PersonaConstants.FILTER_NAME_IFPERSONAPORTIPOYNUMDOC.equalsIgnoreCase(filterRequest.getName()))
            iFPersonaPorTipoYNumDoc(filterRequest, sql);
    }

    @Override
    protected void applyNavigationalFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if ("Solicitud_TSUBIRDOCUMENTOATO_ptPersona_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431957012480960FiltNav74(filterRequest, sql);
        if ("Solicitud_F_SolicitudConsultaRadicado_voPersona_NavFilter".equalsIgnoreCase(filterRequest.getName()))
            clas1431957012480960FiltNav75(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_Persona".equals(filterRequest.getName()))
            suppInfo4ICPersona(filterRequest.getFilterVariable("searchText").toString(), sql);
    }


    private void fPersonaVarios(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vPrimerNombre = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VPRIMERNOMBRE) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VPRIMERNOMBRE, FilterVariableRequest.STRING) : null;
        String vPrimerApellido = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VPRIMERAPELLIDO) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VPRIMERAPELLIDO, FilterVariableRequest.STRING) : null;
        String vTipoPersona = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VTIPOPERSONA) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VTIPOPERSONA, FilterVariableRequest.STRING) : null;
        String vRazonSocial = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VRAZONSOCIAL) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VRAZONSOCIAL, FilterVariableRequest.STRING) : null;
        TipoIdentificacion voTipoIdentificacion = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VOTIPOIDENTIFICACION) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VOTIPOIDENTIFICACION)))) : null;
        String vSegundoApellido = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VSEGUNDOAPELLIDO) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VSEGUNDOAPELLIDO, FilterVariableRequest.STRING) : null;

        // PrimerNombre LIKE "%" + vPrimerNombre
        if (vPrimerNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAPRIMERNOMBRE, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral("%" + vPrimerNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        // PrimerApellido LIKE "%" + vPrimerApellido
        if (vPrimerApellido != null) {
            // 'like' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAPRIMERAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral("%" + vPrimerApellido, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // TipoPersona = vTipoPersona
        if (vTipoPersona != null) {
            // '=' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONATIPOPERSONA, Constants.Type.STRING.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(vTipoPersona, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // RazonSocial LIKE "%" + vRazonSocial
        if (vRazonSocial != null) {
            // 'like' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONARAZONSOCIAL, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral("%" + vRazonSocial, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        // TipoIdentificacion = voTipoIdentificacion
        if (voTipoIdentificacion != null) {
            // '=' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand116 = new SQLWhereOperandPathInstance(PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            SQLWhereOperandOVParameter operand227 = new SQLWhereOperandOVParameter(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VOTIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voTipoIdentificacion.getOid(), PersonaConstants.VAR_NAME_FPERSONAVARIOS_VOTIPOIDENTIFICACION);
            comparison5.setSecondOperand(operand227);
            conjunction.addOperand(comparison5);

        }        

        // SegundoApellido LIKE "%" + vSegundoApellido
        if (vSegundoApellido != null) {
            // 'like' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONASEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral("%" + vSegundoApellido, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        sql.addConjunction(conjunction);
    }

    private void fPersonaConsultarCORE(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        TipoIdentificacion voTipoIdentificacion = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VOTIPOIDENTIFICACION) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VOTIPOIDENTIFICACION)))) : null;
        String vNumIdentificacion = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VNUMIDENTIFICACION) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VNUMIDENTIFICACION, FilterVariableRequest.STRING) : null;
        String vPrimerNomORazon = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VPRIMERNOMORAZON) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VPRIMERNOMORAZON, FilterVariableRequest.STRING) : null;
        String vSegundoNombre = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VSEGUNDONOMBRE) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VSEGUNDONOMBRE, FilterVariableRequest.STRING) : null;
        String vPrimerApe = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VPRIMERAPE) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VPRIMERAPE, FilterVariableRequest.STRING) : null;
        String vSegundoApe = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VSEGUNDOAPE) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VSEGUNDOAPE, FilterVariableRequest.STRING) : null;
        Date vFechaNacimiento = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VFECHANACIMIENTO) ? (Date) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VFECHANACIMIENTO, FilterVariableRequest.DATE) : null;

        // TipoIdentificacion = voTipoIdentificacion
        if (voTipoIdentificacion != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VOTIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voTipoIdentificacion.getOid(), PersonaConstants.VAR_NAME_FPERSONACONSULTARCORE_VOTIPOIDENTIFICACION);
            comparison1.setSecondOperand(operand223);
            conjunction.addOperand(comparison1);

        }        

        // NumIdentificacion = vNumIdentificacion
        if (vNumIdentificacion != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONANUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumIdentificacion, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // (PrimerNombre LIKE "%" + vPrimerNomORazon OR RazonSocial LIKE "%" + vPrimerNomORazon)
        if (vPrimerNomORazon != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison3 = new SQLWhereDisjunction();
        
            // Operand 1
                    // 'like' Comparison
                    SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
                    comparison4.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAPRIMERNOMBRE, Constants.Type.STRING.getTypeName());
                    comparison4.setFirstOperand(operand115);
                    
                    // Operand 2
                    comparison4.setSecondOperand(new SQLWhereOperandLiteral("%" + vPrimerNomORazon, Constants.Type.STRING.getTypeName()));
                    comparison3.addOperand(comparison4);
        
            // Operand 2
                    // 'like' Comparison
                    SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
                    comparison6.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONARAZONSOCIAL, Constants.Type.STRING.getTypeName());
                    comparison6.setFirstOperand(operand117);
                    
                    // Operand 2
                    comparison6.setSecondOperand(new SQLWhereOperandLiteral("%" + vPrimerNomORazon, Constants.Type.STRING.getTypeName()));
                    comparison3.addOperand(comparison6);
            
            conjunction.addOperand(comparison3);
        }

        }        

        // SegundoNombre LIKE "%" + vSegundoNombre
        if (vSegundoNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONASEGUNDONOMBRE, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral("%" + vSegundoNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        // PrimerApellido LIKE "%" + vPrimerApe
        if (vPrimerApe != null) {
            // 'like' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAPRIMERAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            comparison5.setSecondOperand(new SQLWhereOperandLiteral("%" + vPrimerApe, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison5);

        }        

        // SegundoApellido LIKE "%" + vSegundoApe
        if (vSegundoApe != null) {
            // 'like' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONASEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral("%" + vSegundoApe, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        // FechaNacimiento = vFechaNacimiento
        if (vFechaNacimiento != null) {
            // '=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAFECHANACIMIENTO, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFechaNacimiento, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        sql.addConjunction(conjunction);
    }

    private void fPersonaConsultarCORENat(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        TipoIdentificacion voTipoIdentificacion = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VOTIPOIDENTIFICACION) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VOTIPOIDENTIFICACION)))) : null;
        String vNumIdentificacion = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VNUMIDENTIFICACION) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VNUMIDENTIFICACION, FilterVariableRequest.STRING) : null;
        String vPrimerNombre = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VPRIMERNOMBRE) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VPRIMERNOMBRE, FilterVariableRequest.STRING) : null;
        String vSegundoNombre = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VSEGUNDONOMBRE) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VSEGUNDONOMBRE, FilterVariableRequest.STRING) : null;
        String vPrimerApe = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VPRIMERAPE) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VPRIMERAPE, FilterVariableRequest.STRING) : null;
        String vSegundoApe = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VSEGUNDOAPE) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VSEGUNDOAPE, FilterVariableRequest.STRING) : null;
        Date vFechaNacimiento = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VFECHANACIMIENTO) ? (Date) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VFECHANACIMIENTO, FilterVariableRequest.DATE) : null;

        // TipoIdentificacion = voTipoIdentificacion
        if (voTipoIdentificacion != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VOTIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voTipoIdentificacion.getOid(), PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VOTIPOIDENTIFICACION);
            comparison1.setSecondOperand(operand223);
            conjunction.addOperand(comparison1);

        }        

        // NumIdentificacion = vNumIdentificacion
        if (vNumIdentificacion != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONANUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumIdentificacion, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        // PrimerNombre LIKE "%" + vPrimerNombre
        if (vPrimerNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
            comparison3.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAPRIMERNOMBRE, Constants.Type.STRING.getTypeName());
            comparison3.setFirstOperand(operand114);
            
            // Operand 2
            comparison3.setSecondOperand(new SQLWhereOperandLiteral("%" + vPrimerNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison3);

        }        

        // SegundoNombre LIKE "%" + vSegundoNombre
        if (vSegundoNombre != null) {
            // 'like' Comparison
            SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
            comparison4.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand115 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONASEGUNDONOMBRE, Constants.Type.STRING.getTypeName());
            comparison4.setFirstOperand(operand115);
            
            // Operand 2
            comparison4.setSecondOperand(new SQLWhereOperandLiteral("%" + vSegundoNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison4);

        }        

        // PrimerApellido LIKE "%" + vPrimerApe
        if (vPrimerApe != null) {
            // 'like' Comparison
            SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
            comparison5.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand116 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAPRIMERAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison5.setFirstOperand(operand116);
            
            // Operand 2
            comparison5.setSecondOperand(new SQLWhereOperandLiteral("%" + vPrimerApe, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison5);

        }        

        // SegundoApellido LIKE "%" + vSegundoApe
        if (vSegundoApe != null) {
            // 'like' Comparison
            SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
            comparison6.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand117 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONASEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName());
            comparison6.setFirstOperand(operand117);
            
            // Operand 2
            comparison6.setSecondOperand(new SQLWhereOperandLiteral("%" + vSegundoApe, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison6);

        }        

        // FechaNacimiento = vFechaNacimiento
        if (vFechaNacimiento != null) {
            // '=' Comparison
            SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
            comparison7.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand118 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAFECHANACIMIENTO, Constants.Type.DATE.getTypeName());
            comparison7.setFirstOperand(operand118);
            
            // Operand 2
            comparison7.setSecondOperand(new SQLWhereOperandLiteral(vFechaNacimiento, Constants.Type.DATE.getTypeName()));
            conjunction.addOperand(comparison7);

        }        

        sql.addConjunction(conjunction);
    }

    private void iFPersonaCodigoCORE(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Long vCodigo = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_IFPERSONACODIGOCORE_VCODIGO) ? (Long) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_IFPERSONACODIGOCORE_VCODIGO, FilterVariableRequest.INT) : null;

        // Codigo = vCodigo
        if (vCodigo != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONACODIGO, Constants.Type.INT.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vCodigo, Constants.Type.INT.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void iFPersonaPorTipoYNumDoc(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNomCorto = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_IFPERSONAPORTIPOYNUMDOC_VNOMCORTO) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_IFPERSONAPORTIPOYNUMDOC_VNOMCORTO, FilterVariableRequest.STRING) : null;
        String vNumDoc = filterRequest.hasFilterVariable(PersonaConstants.VAR_NAME_IFPERSONAPORTIPOYNUMDOC_VNUMDOC) ? (String) filterRequest.getFilterVariable(PersonaConstants.VAR_NAME_IFPERSONAPORTIPOYNUMDOC_VNUMDOC, FilterVariableRequest.STRING) : null;

        // TipoIdentificacion.NombreCorto = vNomCorto
        if (vNomCorto != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION + "." + TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONNOMBRECORTO, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vNomCorto, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        // NumIdentificacion = vNumDoc
        if (vNumDoc != null) {
            // '=' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONANUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        

        sql.addConjunction(conjunction);
    }

    private void clas1431957012480960FiltNav74(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Solicitud solicitudTSUBIRDOCUMENTOATOpthisSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTHISSOLICITUD) ? solicitudSrv.getByOID(new SolicitudOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTHISSOLICITUD)))) : null;

        // Usuarios.Solicitud.Aesolicitudes.idsolicitud = pthisSolicitud.Aesolicitudes.idsolicitud OR (pthisSolicitud.ContratantePersona.Identificador = Identificador AND (Codigo = NULL OR Codigo = 0 OR pthisSolicitud.GrupoAsociado.Codigo >= 0 OR (pthisSolicitud.Tramite = 1 AND TipoIdentificacion.NIT = true))) OR (pthisSolicitud.TitularPersona.Identificador = Identificador AND (Codigo = NULL OR Codigo = 0 OR pthisSolicitud.Tramite = 1 OR pthisSolicitud.NumFamilia = NULL))
        if (solicitudTSUBIRDOCUMENTOATOpthisSolicitud != null) {
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
                            SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_NAME_AESOLICITUDESIDSOLICITUD, Constants.Type.INT.getTypeName());
                            comparison3.setFirstOperand(operand114);
                            
                            // Operand 2
                            comparison3.setSecondOperand(new SQLWhereOperandLiteral(solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getAesolicitudes().getAesolicitudesidsolicitud(), Constants.Type.INT.getTypeName()));
                            comparison2.addOperand(comparison3);
                
                    // Operand 2
                        {
                            // 'and' Logical operator
                            SQLWhereConjunction comparison5 = new SQLWhereConjunction();
                        
                            // Operand 1
                                    // '=' Comparison
                                    SQLWhereComparison comparison6 = new SQLWhereComparison(sql);
                                    comparison6.setOperator("=");
                                    
                                    // Operand 1
                                    if (solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getContratantePersona().getPersonaIdentificador()!= null){
                                    comparison6.setFirstOperand(new SQLWhereOperandLiteral(solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getContratantePersona().getPersonaIdentificador(), Constants.Type.INT.getTypeName()));
                                    } else {
                                    comparison6.setFirstOperand(new SQLWhereOperandNull());
                                    }
                                    
                                    // Operand 2
                                    SQLWhereOperandPathAttribute operand228 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAIDENTIFICADOR, Constants.Type.INT.getTypeName());
                                    comparison6.setSecondOperand(operand228);
                                    comparison5.addOperand(comparison6);
                        
                            // Operand 2
                                {
                                    // 'or' Logical operator
                                    SQLWhereDisjunction comparison8 = new SQLWhereDisjunction();
                                
                                    // Operand 1
                                        {
                                            // 'or' Logical operator
                                            SQLWhereDisjunction comparison9 = new SQLWhereDisjunction();
                                        
                                            // Operand 1
                                                {
                                                    // 'or' Logical operator
                                                    SQLWhereDisjunction comparison10 = new SQLWhereDisjunction();
                                                
                                                    // Operand 1
                                                            // '=' Comparison
                                                            SQLWhereComparison comparison11 = new SQLWhereComparison(sql);
                                                            comparison11.setOperator("=");
                                                            
                                                            // Operand 1
                                                            SQLWhereOperandPathAttribute operand1112 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONACODIGO, Constants.Type.INT.getTypeName());
                                                            comparison11.setFirstOperand(operand1112);
                                                            
                                                            // Operand 2
                                                            comparison11.setSecondOperand(new SQLWhereOperandNull());
                                                            comparison10.addOperand(comparison11);
                                                
                                                    // Operand 2
                                                            // '=' Comparison
                                                            SQLWhereComparison comparison12 = new SQLWhereComparison(sql);
                                                            comparison12.setOperator("=");
                                                            
                                                            // Operand 1
                                                            SQLWhereOperandPathAttribute operand1113 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONACODIGO, Constants.Type.INT.getTypeName());
                                                            comparison12.setFirstOperand(operand1113);
                                                            
                                                            // Operand 2
                                                            comparison12.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(0), Constants.Type.NAT.getTypeName()));
                                                            comparison10.addOperand(comparison12);
                                                    
                                                    comparison9.addOperand(comparison10);
                                                }
                                        
                                            // Operand 2
                                                    // '>=' Comparison
                                                    SQLWhereComparison comparison13 = new SQLWhereComparison(sql);
                                                    comparison13.setOperator(">=");
                                                    
                                                    // Operand 1
                                                    if (solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getGrupoAsociado().getGrupoAsociadoCodigo()!= null){
                                                    comparison13.setFirstOperand(new SQLWhereOperandLiteral(solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getGrupoAsociado().getGrupoAsociadoCodigo(), Constants.Type.INT.getTypeName()));
                                                    } else {
                                                    comparison13.setFirstOperand(new SQLWhereOperandNull());
                                                    }
                                                    
                                                    // Operand 2
                                                    comparison13.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(0), Constants.Type.NAT.getTypeName()));
                                                    comparison9.addOperand(comparison13);
                                            
                                            comparison8.addOperand(comparison9);
                                        }
                                
                                    // Operand 2
                                        {
                                            // 'and' Logical operator
                                            SQLWhereConjunction comparison14 = new SQLWhereConjunction();
                                        
                                            // Operand 1
                                                    // '=' Comparison
                                                    SQLWhereComparison comparison15 = new SQLWhereComparison(sql);
                                                    comparison15.setOperator("=");
                                                    
                                                    // Operand 1
                                                    comparison15.setFirstOperand(new SQLWhereOperandLiteral(solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getSolicitudTramite(), Constants.Type.NAT.getTypeName()));
                                                    
                                                    // Operand 2
                                                    comparison15.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                                                    comparison14.addOperand(comparison15);
                                        
                                            // Operand 2
                                                    // '=' Comparison
                                                    SQLWhereComparison comparison17 = new SQLWhereComparison(sql);
                                                    comparison17.setOperator("=");
                                                    
                                                    // Operand 1
                                                    SQLWhereOperandPathAttribute operand1118 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION + "." + TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONNIT, Constants.Type.BOOL.getTypeName());
                                                    comparison17.setFirstOperand(operand1118);
                                                    
                                                    // Operand 2
                                                    comparison17.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                                                    comparison14.addOperand(comparison17);
                                            
                                            comparison8.addOperand(comparison14);
                                        }
                                    
                                    comparison5.addOperand(comparison8);
                                }
                            
                            comparison2.addOperand(comparison5);
                        }
                    
                    comparison1.addOperand(comparison2);
                }
        
            // Operand 2
                {
                    // 'and' Logical operator
                    SQLWhereConjunction comparison16 = new SQLWhereConjunction();
                
                    // Operand 1
                            // '=' Comparison
                            SQLWhereComparison comparison170 = new SQLWhereComparison(sql);
                            comparison170.setOperator("=");
                            
                            // Operand 1
                            if (solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getTitularPersona().getPersonaIdentificador()!= null){
                            comparison170.setFirstOperand(new SQLWhereOperandLiteral(solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getTitularPersona().getPersonaIdentificador(), Constants.Type.INT.getTypeName()));
                            } else {
                            comparison170.setFirstOperand(new SQLWhereOperandNull());
                            }
                            
                            // Operand 2
                            SQLWhereOperandPathAttribute operand2219 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONAIDENTIFICADOR, Constants.Type.INT.getTypeName());
                            comparison170.setSecondOperand(operand2219);
                            comparison16.addOperand(comparison170);
                
                    // Operand 2
                        {
                            // 'or' Logical operator
                            SQLWhereDisjunction comparison19 = new SQLWhereDisjunction();
                        
                            // Operand 1
                                {
                                    // 'or' Logical operator
                                    SQLWhereDisjunction comparison20 = new SQLWhereDisjunction();
                                
                                    // Operand 1
                                        {
                                            // 'or' Logical operator
                                            SQLWhereDisjunction comparison21 = new SQLWhereDisjunction();
                                        
                                            // Operand 1
                                                    // '=' Comparison
                                                    SQLWhereComparison comparison22 = new SQLWhereComparison(sql);
                                                    comparison22.setOperator("=");
                                                    
                                                    // Operand 1
                                                    SQLWhereOperandPathAttribute operand1123 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONACODIGO, Constants.Type.INT.getTypeName());
                                                    comparison22.setFirstOperand(operand1123);
                                                    
                                                    // Operand 2
                                                    comparison22.setSecondOperand(new SQLWhereOperandNull());
                                                    comparison21.addOperand(comparison22);
                                        
                                            // Operand 2
                                                    // '=' Comparison
                                                    SQLWhereComparison comparison23 = new SQLWhereComparison(sql);
                                                    comparison23.setOperator("=");
                                                    
                                                    // Operand 1
                                                    SQLWhereOperandPathAttribute operand1124 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONACODIGO, Constants.Type.INT.getTypeName());
                                                    comparison23.setFirstOperand(operand1124);
                                                    
                                                    // Operand 2
                                                    comparison23.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(0), Constants.Type.NAT.getTypeName()));
                                                    comparison21.addOperand(comparison23);
                                            
                                            comparison20.addOperand(comparison21);
                                        }
                                
                                    // Operand 2
                                            // '=' Comparison
                                            SQLWhereComparison comparison24 = new SQLWhereComparison(sql);
                                            comparison24.setOperator("=");
                                            
                                            // Operand 1
                                            comparison24.setFirstOperand(new SQLWhereOperandLiteral(solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getSolicitudTramite(), Constants.Type.NAT.getTypeName()));
                                            
                                            // Operand 2
                                            comparison24.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                                            comparison20.addOperand(comparison24);
                                    
                                    comparison19.addOperand(comparison20);
                                }
                        
                            // Operand 2
                                    // '=' Comparison
                                    SQLWhereComparison comparison25 = new SQLWhereComparison(sql);
                                    comparison25.setOperator("=");
                                    
                                    // Operand 1
                                    if (solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getSolicitudNumFamilia()!= null){
                                    comparison25.setFirstOperand(new SQLWhereOperandLiteral(solicitudTSUBIRDOCUMENTOATOpthisSolicitud.getSolicitudNumFamilia(), Constants.Type.STRING.getTypeName()));
                                    } else {
                                    comparison25.setFirstOperand(new SQLWhereOperandNull());
                                    }
                                    
                                    // Operand 2
                                    comparison25.setSecondOperand(new SQLWhereOperandNull());
                                    comparison19.addOperand(comparison25);
                            
                            comparison16.addOperand(comparison19);
                        }
                    
                    comparison1.addOperand(comparison16);
                }
            
            conjunction.addOperand(comparison1);
        }

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1431957012480960FiltNav75(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        TipoIdentificacion voTipoDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC) ? tipoIdentificacionSrv.getByOID(new TipoIdentificacionOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC)))) : null;
        String vNumDoc = filterRequest.hasFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VNUMDOC) ? (String) filterRequest.getFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VNUMDOC, FilterVariableRequest.STRING) : null;

        // TipoIdentificacion = voTipoDoc
        if (voTipoDoc != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC);
            comparison1.setSecondOperand(operand223);
            conjunction.addOperand(comparison1);

        }        

        // NumIdentificacion LIKE vNumDoc
        if (vNumDoc != null) {
            // 'like' Comparison
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("like");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONANUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
            comparison2.setFirstOperand(operand113);
            
            // Operand 2
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison2);

        }        
        sql.addConjunction(conjunction);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUPersona
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Persona using displayset DSPersonaPIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.persona.ds.DSPersonaPIU> piuPIUPersona(QueryRequest queryRequest) {
        return solvePersonaTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.persona.ds.DSPersonaPIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUPersona
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUPersona
     */
    public int getCount4PIUPersona(QueryRequest queryRequest) {
        return solvePersonaTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.persona.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.CrearRequest request) throws ModelException {
        request.setPersonacrearpagrDepartamentoNacimientoInstance(departamentoSrv.getByOIDWithHV(request.getPersonacrearpagrDepartamentoNacimiento()));
        request.setPersonacrearpagrMunicipioNacimientoInstance(municipioSrv.getByOIDWithHV(request.getPersonacrearpagrMunicipioNacimiento()));
        request.setPersonacrearpagrEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonacrearpagrEstadoCivil()));
        request.setPersonacrearpagrEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonacrearpagrEstadoPersona()));
        request.setPersonacrearpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonacrearpagrTipoIdentificacion()));
        return personaSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento personacrearpagrDepartamentoNacimiento = request.getPersonacrearpagrDepartamentoNacimientoInstance();
        Municipio personacrearpagrMunicipioNacimiento = request.getPersonacrearpagrMunicipioNacimientoInstance();
        EstadoCivil personacrearpagrEstadoCivil = request.getPersonacrearpagrEstadoCivilInstance();
        EstadoPersona personacrearpagrEstadoPersona = request.getPersonacrearpagrEstadoPersonaInstance();
        TipoIdentificacion personacrearpagrTipoIdentificacion = request.getPersonacrearpagrTipoIdentificacionInstance();
        String personacrearpatrNumIdentificacion = request.getPersonacrearpatrNumIdentificacion();
        String personacrearpatrTipoPersona = request.getPersonacrearpatrTipoPersona();
        String personacrearpatrPrimerNombre = request.getPersonacrearpatrPrimerNombre();
        String personacrearpatrSegundoNombre = request.getPersonacrearpatrSegundoNombre();
        String personacrearpatrPrimerApellido = request.getPersonacrearpatrPrimerApellido();
        String personacrearpatrSegundoApellido = request.getPersonacrearpatrSegundoApellido();
        String personacrearpatrRazonSocial = request.getPersonacrearpatrRazonSocial();
        Date personacrearpatrFechaNacimiento = request.getPersonacrearpatrFechaNacimiento();
        String personacrearpatrGenero = request.getPersonacrearpatrGenero();
        Boolean personacrearpatrIndicadorExtranjero = request.getPersonacrearpatrIndicadorExtranjero();
        String personacrearpatrTelefonoFijo = request.getPersonacrearpatrTelefonoFijo();
        String personacrearpatrTelefonoCelular = request.getPersonacrearpatrTelefonoCelular();
        String personacrearpatrCorreoElectronico = request.getPersonacrearpatrCorreoElectronico();

        request.checkArguments();
        Persona instance = new Persona();
        if (personacrearpagrDepartamentoNacimiento != null && !personacrearpagrDepartamentoNacimiento.isNull()) {
            instance.add2DepartamentoNacimiento(personacrearpagrDepartamentoNacimiento);
        }

        if (personacrearpagrMunicipioNacimiento != null && !personacrearpagrMunicipioNacimiento.isNull()) {
            instance.add2MunicipioNacimiento(personacrearpagrMunicipioNacimiento);
        }

        if (personacrearpagrEstadoCivil != null && !personacrearpagrEstadoCivil.isNull()) {
            instance.add2EstadoCivil(personacrearpagrEstadoCivil);
        }

        if (personacrearpagrEstadoPersona != null && !personacrearpagrEstadoPersona.isNull()) {
            instance.add2EstadoPersona(personacrearpagrEstadoPersona);
        }

        instance.add2TipoIdentificacion(personacrearpagrTipoIdentificacion);

        instance.setPersonaIdentificador(Long.valueOf(0));
        instance.setPersonaCodigo(null);
        instance.setPersonaTieneEPSSanitas(null);
        instance.setPersonaRechazadoAfiliacion(null);
        instance.setPersonaDatosBasicosMod(Boolean.FALSE);
        instance.setPersonaNumIdentificacion(personacrearpatrNumIdentificacion);
        instance.setPersonaTipoPersona(personacrearpatrTipoPersona);
        instance.setPersonaPrimerNombre(personacrearpatrPrimerNombre);
        instance.setPersonaSegundoNombre(personacrearpatrSegundoNombre);
        instance.setPersonaPrimerApellido(personacrearpatrPrimerApellido);
        instance.setPersonaSegundoApellido(personacrearpatrSegundoApellido);
        instance.setPersonaRazonSocial(personacrearpatrRazonSocial);
        instance.setPersonaFechaNacimiento(personacrearpatrFechaNacimiento);
        instance.setPersonaGenero(personacrearpatrGenero);
        instance.setPersonaIndicadorExtranjero(personacrearpatrIndicadorExtranjero);
        instance.setPersonaTelefonoFijo(personacrearpatrTelefonoFijo);
        instance.setPersonaTelefonoCelular(personacrearpatrTelefonoCelular);
        instance.setPersonaCorreoElectronico(personacrearpatrCorreoElectronico);

        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

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
            com.keralty.aepersonas.viewmodel.persona.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.EliminarRequest request) throws ModelException {
        request.setPersonaeliminarpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaeliminarpthisPersona()));
        return personaSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaeliminarpthisPersona = request.getPersonaeliminarpthisPersonaInstance();

        request.checkArguments();
        Persona instance = personaeliminarpthisPersona;
        if(personaeliminarpthisPersona.getSolicitudesContratante().size() > 0) {
            throw new MinCardinalityException(PersonaConstants.CLASS_ALIAS, PersonaConstants.ROLE_ALIAS_SOLICITUDESCONTRATANTE);
        }
        if(personaeliminarpthisPersona.getSolicitudesTitular().size() > 0) {
            throw new MinCardinalityException(PersonaConstants.CLASS_ALIAS, PersonaConstants.ROLE_ALIAS_SOLICITUDESTITULAR);
        }
        if(personaeliminarpthisPersona.getDirecciones().size() > 0) {
            throw new MinCardinalityException(PersonaConstants.CLASS_ALIAS, PersonaConstants.ROLE_ALIAS_DIRECCIONES);
        }
        if(personaeliminarpthisPersona.getUsuarios() != null && !personaeliminarpthisPersona.getUsuarios().isNull()) {
            throw new MinCardinalityException(PersonaConstants.CLASS_ALIAS, PersonaConstants.ROLE_ALIAS_USUARIOS);
        }
        if(personaeliminarpthisPersona.getDocumentosG().size() > 0) {
            throw new MinCardinalityException(PersonaConstants.CLASS_ALIAS, PersonaConstants.ROLE_ALIAS_DOCUMENTOSG);
        }


        repository.delete(instance);
        
        response.setInstance(instance);
        response.setInstanceSuppInfo(instance.buildICPersona());

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
            com.keralty.aepersonas.viewmodel.persona.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.modificarTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.ModificarRequest request) throws ModelException {
        request.setPersonamodificarpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonamodificarpthisPersona()));
        return personaSrv.modificarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personamodificarpthisPersona = request.getPersonamodificarpthisPersonaInstance();
        String personamodificarpNumIdentificacion = request.getPersonamodificarpNumIdentificacion();
        String personamodificarpPrimerNombre = request.getPersonamodificarpPrimerNombre();
        String personamodificarpSegundoNombre = request.getPersonamodificarpSegundoNombre();
        String personamodificarpPrimerApellido = request.getPersonamodificarpPrimerApellido();
        String personamodificarpSegundoApellido = request.getPersonamodificarpSegundoApellido();
        String personamodificarpRazonSocial = request.getPersonamodificarpRazonSocial();
        Date personamodificarpFechaNacimiento = request.getPersonamodificarpFechaNacimiento();
        String personamodificarpGenero = request.getPersonamodificarpGenero();
        Boolean personamodificarpIndicadorExtranjero = request.getPersonamodificarpIndicadorExtranjero();
        String personamodificarpTelefonoFijo = request.getPersonamodificarpTelefonoFijo();
        String personamodificarpTelefonoCelular = request.getPersonamodificarpTelefonoCelular();
        String personamodificarpCorreoElectronico = request.getPersonamodificarpCorreoElectronico();
        Boolean personamodificarpTieneEPSSanitas = request.getPersonamodificarpTieneEPSSanitas();
        String personamodificarpRechazadoAfiliacion = request.getPersonamodificarpRechazadoAfiliacion();

        request.checkArguments();
        Persona instance = personamodificarpthisPersona;
        instance.setPersonaNumIdentificacion(personamodificarpNumIdentificacion);
        instance.setPersonaPrimerNombre(personamodificarpPrimerNombre);
        instance.setPersonaSegundoNombre(personamodificarpSegundoNombre);
        instance.setPersonaPrimerApellido(personamodificarpPrimerApellido);
        instance.setPersonaSegundoApellido(personamodificarpSegundoApellido);
        instance.setPersonaRazonSocial(personamodificarpRazonSocial);
        instance.setPersonaFechaNacimiento(personamodificarpFechaNacimiento);
        instance.setPersonaGenero(personamodificarpGenero);
        instance.setPersonaIndicadorExtranjero(personamodificarpIndicadorExtranjero);
        instance.setPersonaTelefonoFijo(personamodificarpTelefonoFijo);
        instance.setPersonaTelefonoCelular(personamodificarpTelefonoCelular);
        instance.setPersonaCorreoElectronico(personamodificarpCorreoElectronico);
        instance.setPersonaTieneEPSSanitas(personamodificarpTieneEPSSanitas);
        instance.setPersonaRechazadoAfiliacion(personamodificarpRechazadoAfiliacion);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
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
            com.keralty.aepersonas.viewmodel.persona.siu.InsContratanteSolicitudRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.insContratanteSolicitudTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.InsContratanteSolicitudRequest request) throws ModelException {
        request.setPersonaInsContratanteSolicitudpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaInsContratanteSolicitudpthisPersona()));
        request.setPersonaInsContratanteSolicitudpevcSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaInsContratanteSolicitudpevcSolicitud()));
        return personaSrv.insContratanteSolicitudImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.persona.siu.InsContratanteSolicitudRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaInsContratanteSolicitudpthisPersona = request.getPersonaInsContratanteSolicitudpthisPersonaInstance();
        Solicitud personaInsContratanteSolicitudpevcSolicitud = request.getPersonaInsContratanteSolicitudpevcSolicitudInstance();

        request.checkArguments();
        Persona instance = personaInsContratanteSolicitudpthisPersona;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsContratanteSolicitudRequest relatedRequest = new com.keralty.aepersonas.viewmodel.solicitud.siu.InsContratanteSolicitudRequest();
            relatedRequest.setSolicitudInsContratanteSolicitudpthisSolicitudInstance(personaInsContratanteSolicitudpevcSolicitud);
            relatedRequest.setSolicitudInsContratanteSolicitudpevcPersonaInstance(personaInsContratanteSolicitudpthisPersona);
            solicitudSrv.insContratanteSolicitudImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

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
            com.keralty.aepersonas.viewmodel.persona.siu.InsTitularSolicitudRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.insTitularSolicitudTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.InsTitularSolicitudRequest request) throws ModelException {
        request.setPersonaInsTitularSolicitudpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaInsTitularSolicitudpthisPersona()));
        request.setPersonaInsTitularSolicitudpevcSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaInsTitularSolicitudpevcSolicitud()));
        return personaSrv.insTitularSolicitudImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.persona.siu.InsTitularSolicitudRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaInsTitularSolicitudpthisPersona = request.getPersonaInsTitularSolicitudpthisPersonaInstance();
        Solicitud personaInsTitularSolicitudpevcSolicitud = request.getPersonaInsTitularSolicitudpevcSolicitudInstance();

        request.checkArguments();
        Persona instance = personaInsTitularSolicitudpthisPersona;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.InsTitularSolicitudRequest relatedRequest = new com.keralty.aepersonas.viewmodel.solicitud.siu.InsTitularSolicitudRequest();
            relatedRequest.setSolicitudInsTitularSolicitudpthisSolicitudInstance(personaInsTitularSolicitudpevcSolicitud);
            relatedRequest.setSolicitudInsTitularSolicitudpevcPersonaInstance(personaInsTitularSolicitudpthisPersona);
            solicitudSrv.insTitularSolicitudImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: InsDptoNacimientoPersona

    /*
     * Entry point for service InsDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDptoNacimientoPersona(
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.insDptoNacimientoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDptoNacimientoPersonaTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest request) throws ModelException {
        request.setPersonaInsDptoNacimientoPersonapthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaInsDptoNacimientoPersonapthisPersona()));
        request.setPersonaInsDptoNacimientoPersonapevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaInsDptoNacimientoPersonapevcDepartamento()));
        return personaSrv.insDptoNacimientoPersonaImplementation(request, true);
    }

    /*
     * Implements service InsDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDptoNacimientoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaInsDptoNacimientoPersonapthisPersona = request.getPersonaInsDptoNacimientoPersonapthisPersonaInstance();
        Departamento personaInsDptoNacimientoPersonapevcDepartamento = request.getPersonaInsDptoNacimientoPersonapevcDepartamentoInstance();

        request.checkArguments();
        Persona instance = personaInsDptoNacimientoPersonapthisPersona;

        instance.add2DepartamentoNacimiento(personaInsDptoNacimientoPersonapevcDepartamento);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDptoNacimientoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.InsDptoNacimientoPersonaRequest();
            relatedRequest.setDepartamentoInsDptoNacimientoPersonapthisDepartamentoInstance(personaInsDptoNacimientoPersonapevcDepartamento);
            relatedRequest.setDepartamentoInsDptoNacimientoPersonapevcPersonaInstance(personaInsDptoNacimientoPersonapthisPersona);
            departamentoSrv.insDptoNacimientoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: DelDptoNacimientoPersona

    /*
     * Entry point for service DelDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDptoNacimientoPersona(
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.delDptoNacimientoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDptoNacimientoPersonaTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest request) throws ModelException {
        request.setPersonaDelDptoNacimientoPersonapthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaDelDptoNacimientoPersonapthisPersona()));
        request.setPersonaDelDptoNacimientoPersonapevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaDelDptoNacimientoPersonapevcDepartamento()));
        return personaSrv.delDptoNacimientoPersonaImplementation(request, true);
    }

    /*
     * Implements service DelDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDptoNacimientoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaDelDptoNacimientoPersonapthisPersona = request.getPersonaDelDptoNacimientoPersonapthisPersonaInstance();
        Departamento personaDelDptoNacimientoPersonapevcDepartamento = request.getPersonaDelDptoNacimientoPersonapevcDepartamentoInstance();

        request.checkArguments();
        Persona instance = personaDelDptoNacimientoPersonapthisPersona;

        instance.add2DepartamentoNacimiento(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDptoNacimientoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.DelDptoNacimientoPersonaRequest();
            relatedRequest.setDepartamentoDelDptoNacimientoPersonapthisDepartamentoInstance(personaDelDptoNacimientoPersonapevcDepartamento);
            relatedRequest.setDepartamentoDelDptoNacimientoPersonapevcPersonaInstance(personaDelDptoNacimientoPersonapthisPersona);
            departamentoSrv.delDptoNacimientoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: InsMunicipioNacimientoPersona

    /*
     * Entry point for service InsMunicipioNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insMunicipioNacimientoPersona(
            com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.insMunicipioNacimientoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsMunicipioNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insMunicipioNacimientoPersonaTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest request) throws ModelException {
        request.setPersonaInsMunicipioNacimientoPersonapthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaInsMunicipioNacimientoPersonapthisPersona()));
        request.setPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaInsMunicipioNacimientoPersonapevcMunicipio()));
        return personaSrv.insMunicipioNacimientoPersonaImplementation(request, true);
    }

    /*
     * Implements service InsMunicipioNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insMunicipioNacimientoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaInsMunicipioNacimientoPersonapthisPersona = request.getPersonaInsMunicipioNacimientoPersonapthisPersonaInstance();
        Municipio personaInsMunicipioNacimientoPersonapevcMunicipio = request.getPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance();

        request.checkArguments();
        Persona instance = personaInsMunicipioNacimientoPersonapthisPersona;

        instance.add2MunicipioNacimiento(personaInsMunicipioNacimientoPersonapevcMunicipio);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioNacimientoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioNacimientoPersonaRequest();
            relatedRequest.setMunicipioInsMunicipioNacimientoPersonapthisMunicipioInstance(personaInsMunicipioNacimientoPersonapevcMunicipio);
            relatedRequest.setMunicipioInsMunicipioNacimientoPersonapevcPersonaInstance(personaInsMunicipioNacimientoPersonapthisPersona);
            municipioSrv.insMunicipioNacimientoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: DelMunicipioNacimientoPersona

    /*
     * Entry point for service DelMunicipioNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delMunicipioNacimientoPersona(
            com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.delMunicipioNacimientoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelMunicipioNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delMunicipioNacimientoPersonaTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest request) throws ModelException {
        request.setPersonaDelMunicipioNacimientoPersonapthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaDelMunicipioNacimientoPersonapthisPersona()));
        request.setPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaDelMunicipioNacimientoPersonapevcMunicipio()));
        return personaSrv.delMunicipioNacimientoPersonaImplementation(request, true);
    }

    /*
     * Implements service DelMunicipioNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delMunicipioNacimientoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaDelMunicipioNacimientoPersonapthisPersona = request.getPersonaDelMunicipioNacimientoPersonapthisPersonaInstance();
        Municipio personaDelMunicipioNacimientoPersonapevcMunicipio = request.getPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance();

        request.checkArguments();
        Persona instance = personaDelMunicipioNacimientoPersonapthisPersona;

        instance.add2MunicipioNacimiento(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioNacimientoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioNacimientoPersonaRequest();
            relatedRequest.setMunicipioDelMunicipioNacimientoPersonapthisMunicipioInstance(personaDelMunicipioNacimientoPersonapevcMunicipio);
            relatedRequest.setMunicipioDelMunicipioNacimientoPersonapevcPersonaInstance(personaDelMunicipioNacimientoPersonapthisPersona);
            municipioSrv.delMunicipioNacimientoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: InsEstadoCivilPersona

    /*
     * Entry point for service InsEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insEstadoCivilPersona(
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.insEstadoCivilPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insEstadoCivilPersonaTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest request) throws ModelException {
        request.setPersonaInsEstadoCivilPersonapthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaInsEstadoCivilPersonapthisPersona()));
        request.setPersonaInsEstadoCivilPersonapevcEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaInsEstadoCivilPersonapevcEstadoCivil()));
        return personaSrv.insEstadoCivilPersonaImplementation(request, true);
    }

    /*
     * Implements service InsEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insEstadoCivilPersonaImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaInsEstadoCivilPersonapthisPersona = request.getPersonaInsEstadoCivilPersonapthisPersonaInstance();
        EstadoCivil personaInsEstadoCivilPersonapevcEstadoCivil = request.getPersonaInsEstadoCivilPersonapevcEstadoCivilInstance();

        request.checkArguments();
        Persona instance = personaInsEstadoCivilPersonapthisPersona;

        instance.add2EstadoCivil(personaInsEstadoCivilPersonapevcEstadoCivil);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.estadocivil.siu.InsEstadoCivilPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.estadocivil.siu.InsEstadoCivilPersonaRequest();
            relatedRequest.setEstadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance(personaInsEstadoCivilPersonapevcEstadoCivil);
            relatedRequest.setEstadoCivilInsEstadoCivilPersonapevcPersonaInstance(personaInsEstadoCivilPersonapthisPersona);
            estadoCivilSrv.insEstadoCivilPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: DelEstadoCivilPersona

    /*
     * Entry point for service DelEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delEstadoCivilPersona(
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.delEstadoCivilPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delEstadoCivilPersonaTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest request) throws ModelException {
        request.setPersonaDelEstadoCivilPersonapthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaDelEstadoCivilPersonapthisPersona()));
        request.setPersonaDelEstadoCivilPersonapevcEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaDelEstadoCivilPersonapevcEstadoCivil()));
        return personaSrv.delEstadoCivilPersonaImplementation(request, true);
    }

    /*
     * Implements service DelEstadoCivilPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delEstadoCivilPersonaImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaDelEstadoCivilPersonapthisPersona = request.getPersonaDelEstadoCivilPersonapthisPersonaInstance();
        EstadoCivil personaDelEstadoCivilPersonapevcEstadoCivil = request.getPersonaDelEstadoCivilPersonapevcEstadoCivilInstance();

        request.checkArguments();
        Persona instance = personaDelEstadoCivilPersonapthisPersona;

        instance.add2EstadoCivil(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.estadocivil.siu.DelEstadoCivilPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.estadocivil.siu.DelEstadoCivilPersonaRequest();
            relatedRequest.setEstadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance(personaDelEstadoCivilPersonapevcEstadoCivil);
            relatedRequest.setEstadoCivilDelEstadoCivilPersonapevcPersonaInstance(personaDelEstadoCivilPersonapthisPersona);
            estadoCivilSrv.delEstadoCivilPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

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
            com.keralty.aepersonas.viewmodel.persona.siu.RegistrarDatosCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.registrarDatosCORETxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.RegistrarDatosCORERequest request) throws ModelException {
        request.setPersonaregistrarDatosCOREpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaregistrarDatosCOREpthisPersona()));
        return personaSrv.registrarDatosCOREImplementation(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.RegistrarDatosCORERequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaregistrarDatosCOREpthisPersona = request.getPersonaregistrarDatosCOREpthisPersonaInstance();
        Long personaregistrarDatosCOREpCodigo = request.getPersonaregistrarDatosCOREpCodigo();
        Boolean personaregistrarDatosCOREpTieneEPSSanitas = request.getPersonaregistrarDatosCOREpTieneEPSSanitas();
        String personaregistrarDatosCOREpRechazadoAfiliacion = request.getPersonaregistrarDatosCOREpRechazadoAfiliacion();

        request.checkArguments();
        Persona instance = personaregistrarDatosCOREpthisPersona;
        instance.setPersonaCodigo(personaregistrarDatosCOREpCodigo);
        instance.setPersonaTieneEPSSanitas(personaregistrarDatosCOREpTieneEPSSanitas);
        instance.setPersonaRechazadoAfiliacion(personaregistrarDatosCOREpRechazadoAfiliacion);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: validarDatosRestrictiva

    /*
     * Entry point for service validarDatosRestrictiva
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse validarDatosRestrictiva(
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.validarDatosRestrictivaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service validarDatosRestrictiva
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse validarDatosRestrictivaTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) throws ModelException {
        request.setPersonavalidarDatosRestrictivapthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonavalidarDatosRestrictivapthisPersona()));
        return personaSrv.validarDatosRestrictivaImplementation(request);
    }

    /*
     * Implements service validarDatosRestrictiva
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse validarDatosRestrictivaImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();

        request.checkArguments();

        validarDatosRestrictivaPreconditions(request);
        Persona instance = personavalidarDatosRestrictivapthisPersona;
        instance.setPersonaPrimerApellido(personavalidarDatosRestrictivapthisPersona.getPersonaPrimerApellido());


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    private void validarDatosRestrictivaPreconditions(
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        checkClas1431886233600805Pre1(request);
        checkClas1431886233600805Pre2(request);
        checkClas1431886233600805Pre3(request);
        checkClas1431886233600805Pre4(request);
        checkClas1431886233600805Pre5(request);
        checkClas1431886233600805Pre88(request);
        checkClas1431886233600805Pre63(request);
        checkClas1431886233600805Pre6(request);
        checkClas1431886233600805Pre7(request);
        checkClas1431886233600805Pre89(request);
        checkClas1431886233600805Pre8(request);
        checkClas1431886233600805Pre9(request);
        checkClas1431886233600805Pre29(request);
        checkClas1431886233600805Pre30(request);
    }

    private void checkClas1431886233600805Pre1 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // CorreoElectronico = NULL OR fuValidarEmail(CorreoElectronico) = true

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaCorreoElectronico() == null || userFunctionsSrv.fuValidarEmailFun(personavalidarDatosRestrictivapthisPersona.getPersonaCorreoElectronico()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El formato proporcionado para el correo electrónico no es válido");
    }

    private void checkClas1431886233600805Pre2 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // RazonSocial = NULL OR (indexOf( RazonSocial, "y/o") = 0 AND indexOf( RazonSocial, "/") = 0)

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaRazonSocial() == null || ((STDFunctions.indexOfFun(personavalidarDatosRestrictivapthisPersona.getPersonaRazonSocial(), "y/o")).equals(Long.valueOf(0)) && (STDFunctions.indexOfFun(personavalidarDatosRestrictivapthisPersona.getPersonaRazonSocial(), "/")).equals(Long.valueOf(0)));
        if (!preconditionHolds) throw new PreconditionException("La razón social no puede contener los carácteres especiales 'y/o' ni '/'");
    }

    private void checkClas1431886233600805Pre3 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // PrimerNombre = NULL OR fuValidarNombre(PrimerNombre) = true

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaPrimerNombre() == null || userFunctionsSrv.fuValidarNombreFun(personavalidarDatosRestrictivapthisPersona.getPersonaPrimerNombre()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El nombre debe estar formado por letras y no puede contener espacios");
    }

    private void checkClas1431886233600805Pre4 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // PrimerNombre = NULL OR length( PrimerNombre ) >= 2

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaPrimerNombre() == null || STDFunctions.lengthFun(personavalidarDatosRestrictivapthisPersona.getPersonaPrimerNombre()) >= Long.valueOf(2);
        if (!preconditionHolds) throw new PreconditionException("El primer nombre debe tener como mínimo 2 caracteres");
    }

    private void checkClas1431886233600805Pre5 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // SegundoNombre = NULL OR length( SegundoNombre ) >= 2

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaSegundoNombre() == null || STDFunctions.lengthFun(personavalidarDatosRestrictivapthisPersona.getPersonaSegundoNombre()) >= Long.valueOf(2);
        if (!preconditionHolds) throw new PreconditionException("El segundo nombre, cuando es diligenciado, debe tener como mínimo 2 caracteres");
    }

    private void checkClas1431886233600805Pre88 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // SegundoNombre = NULL OR fuValidarNombre(SegundoNombre) = true

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaSegundoNombre() == null || userFunctionsSrv.fuValidarNombreFun(personavalidarDatosRestrictivapthisPersona.getPersonaSegundoNombre()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El segundo nombre debe estar formado por letras y no puede contener espacios");
    }

    private void checkClas1431886233600805Pre63 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // PrimerApellido = NULL OR fuValidarNombre(PrimerApellido) = true

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaPrimerApellido() == null || userFunctionsSrv.fuValidarNombreFun(personavalidarDatosRestrictivapthisPersona.getPersonaPrimerApellido()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El primer apellido debe estar formado por letras y no puede contener espacios");
    }

    private void checkClas1431886233600805Pre6 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // PrimerApellido = NULL OR length(PrimerApellido) >= 2

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaPrimerApellido() == null || STDFunctions.lengthFun(personavalidarDatosRestrictivapthisPersona.getPersonaPrimerApellido()) >= Long.valueOf(2);
        if (!preconditionHolds) throw new PreconditionException("El primer apellido debe tener como mínimo 2 caracteres");
    }

    private void checkClas1431886233600805Pre7 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // SegundoApellido = NULL OR length(SegundoApellido) >= 2

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaSegundoApellido() == null || STDFunctions.lengthFun(personavalidarDatosRestrictivapthisPersona.getPersonaSegundoApellido()) >= Long.valueOf(2);
        if (!preconditionHolds) throw new PreconditionException("El segundo apellido, cuando es diligenciado, debe tener como mínimo 2 caracteres");
    }

    private void checkClas1431886233600805Pre89 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // SegundoApellido = NULL OR fuValidarNombre(SegundoApellido) = true

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaSegundoApellido() == null || userFunctionsSrv.fuValidarNombreFun(personavalidarDatosRestrictivapthisPersona.getPersonaSegundoApellido()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El segundo apellido debe estar formado por letras y no puede contener espacios");
    }

    private void checkClas1431886233600805Pre8 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // Genero = NULL OR (Genero = "F" OR Genero = "M" )

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaGenero() == null || ((personavalidarDatosRestrictivapthisPersona.getPersonaGenero()).equals("F") || (personavalidarDatosRestrictivapthisPersona.getPersonaGenero()).equals("M"));
        if (!preconditionHolds) throw new PreconditionException("El género debe ser F o M");
    }

    private void checkClas1431886233600805Pre9 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // FechaNacimiento = NULL OR FechaNacimiento <= systemDate()

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaFechaNacimiento() == null || (STDFunctions.dateBeforeFun(personavalidarDatosRestrictivapthisPersona.getPersonaFechaNacimiento(),STDFunctions.systemDateFun()) || STDFunctions.dateEqualsFun(personavalidarDatosRestrictivapthisPersona.getPersonaFechaNacimiento(), STDFunctions.systemDateFun()));
        if (!preconditionHolds) throw new PreconditionException("La fecha de nacimiento no puede ser futura");
    }

    private void checkClas1431886233600805Pre29 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // TelefonoFijo = NULL OR fuValidarTelefonoFijo(TelefonoFijo) = true

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaTelefonoFijo() == null || userFunctionsSrv.fuValidarTelefonoFijoFun(personavalidarDatosRestrictivapthisPersona.getPersonaTelefonoFijo()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El teléfono fijo debe contener 7 números y al menos uno de ellos debe ser distinto");
    }

    private void checkClas1431886233600805Pre30 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest request) 
            throws ModelException {
        // TelefonoCelular = NULL OR fuValidarTelefonoCelular(TelefonoCelular) = true

        Persona personavalidarDatosRestrictivapthisPersona = request.getPersonavalidarDatosRestrictivapthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivapthisPersona.getPersonaTelefonoCelular() == null || userFunctionsSrv.fuValidarTelefonoCelularFun(personavalidarDatosRestrictivapthisPersona.getPersonaTelefonoCelular()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El teléfono celular debe contener 10 números y al menos uno de ellos debe ser distinto");
    }

    // Service: validarDatosRestrictivaTipoId

    /*
     * Entry point for service validarDatosRestrictivaTipoId
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse validarDatosRestrictivaTipoId(
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.validarDatosRestrictivaTipoIdTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service validarDatosRestrictivaTipoId
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse validarDatosRestrictivaTipoIdTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) throws ModelException {
        request.setPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonavalidarDatosRestrictivaTipoIdpthisPersona()));
        return personaSrv.validarDatosRestrictivaTipoIdImplementation(request);
    }

    /*
     * Implements service validarDatosRestrictivaTipoId
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse validarDatosRestrictivaTipoIdImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();

        request.checkArguments();

        validarDatosRestrictivaTipoIdPreconditions(request);
        Persona instance = personavalidarDatosRestrictivaTipoIdpthisPersona;
        instance.setPersonaPrimerApellido(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaPrimerApellido());


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    private void validarDatosRestrictivaTipoIdPreconditions(
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        checkClas1431886233600805Pre41(request);
        checkClas1431886233600805Pre42(request);
        checkClas1431886233600805Pre43(request);
        checkClas1431886233600805Pre44(request);
        checkClas1431886233600805Pre46(request);
        checkClas1431886233600805Pre47(request);
        checkClas1431886233600805Pre48(request);
        checkClas1431886233600805Pre66(request);
        checkClas1431886233600805Pre67(request);
        checkClas1431886233600805Pre68(request);
        checkClas1431886233600805Pre56(request);
        checkClas1431886233600805Pre69(request);
        checkClas1431886233600805Pre70(request);
        checkClas1431886233600805Pre57(request);
        checkClas1431886233600805Pre84(request);
        checkClas1431886233600805Pre91(request);
        checkClas1431886233600805Pre83(request);
        checkClas1431886233600805Pre73(request);
        checkClas1431886233600805Pre49(request);
        checkClas1431886233600805Pre50(request);
        checkClas1431886233600805Pre51(request);
        checkClas1431886233600805Pre52(request);
        checkClas1431886233600805Pre53(request);
        checkClas1431886233600805Pre54(request);
        checkClas1431886233600805Pre55(request);
        checkClas1431886233600805Pre74(request);
        checkClas1431886233600805Pre75(request);
    }

    private void checkClas1431886233600805Pre41 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "CC" OR (daysDifferenceFromDate(FechaNacimiento, systemDate()) >= 6570)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("CC") || (STDFunctions.daysDifferenceFromDateFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento(), STDFunctions.systemDateFun()) >= Long.valueOf(6570));
        if (!preconditionHolds) throw new PreconditionException("El documento de identificacion para afiliados menores de 18 es Tarjeta de identidad, Registro civil o Numero unico de identificacion personal (Nuip)");
    }

    private void checkClas1431886233600805Pre42 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // drvVieneDeCORE = false OR TipoIdentificacion.NombreCorto <> "MS" OR (daysDifferenceFromDate(FechaNacimiento, systemDate()) <= 30)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonadrvVieneDeCORE().equals(false) || !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("MS") || (STDFunctions.daysDifferenceFromDateFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento(), STDFunctions.systemDateFun()) <= Long.valueOf(30));
        if (!preconditionHolds) throw new PreconditionException("Pasado un mes desde la fecha de nacimiento del usuario solo se es permitido afiliarse a menores con tipo de identificacion Registro civil o Nuip.");
    }

    private void checkClas1431886233600805Pre43 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "TI" OR (daysDifferenceFromDate(FechaNacimiento, systemDate()) <= 6935)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("TI") || (STDFunctions.daysDifferenceFromDateFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento(), STDFunctions.systemDateFun()) <= Long.valueOf(6935));
        if (!preconditionHolds) throw new PreconditionException("El documento de identificacion para afiliados mayores de 18 años es Cedula de Ciudadania o en caso de ser extranjero Cedula de extranjeria");
    }

    private void checkClas1431886233600805Pre44 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "TI" OR (daysDifferenceFromDate(FechaNacimiento, systemDate()) >= 2555)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("TI") || (STDFunctions.daysDifferenceFromDateFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento(), STDFunctions.systemDateFun()) >= Long.valueOf(2555));
        if (!preconditionHolds) throw new PreconditionException("La Tarjeta de identidad solo se asigna a mayores de 7 años, los menores a esta edad solo deben identificarse con Registro Civil o Nuip.");
    }

    private void checkClas1431886233600805Pre46 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "RC" OR (daysDifferenceFromDate(FechaNacimiento, systemDate()) <= 6935)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("RC") || (STDFunctions.daysDifferenceFromDateFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento(), STDFunctions.systemDateFun()) <= Long.valueOf(6935));
        if (!preconditionHolds) throw new PreconditionException("El Registro civil solo es un documento valido hasta los 18 años, apartir de los 19 años todos los usuarios se deben identificar con Cedula de Ciudadania");
    }

    private void checkClas1431886233600805Pre47 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "RC" OR getYear(FechaNacimiento) <> 2000 OR length(NumIdentificacion) <> 11

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("RC") || !(STDFunctions.getYearFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())).equals(Long.valueOf(2000)) || !(STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion())).equals(Long.valueOf(11));
        if (!preconditionHolds) throw new PreconditionException("RC de 11 dígitos y los 6 primeros dígitos de la identificación deben coincidir con la fecha de nacimiento del usuario.(Teniendo en cuenta que los 3 pueden ser ceros y no se reflejan en el sistema), por lo tanto los nacidos en 2000 tendrían identifiaciones solo de 8, 9 y 10 dígitos");
    }

    private void checkClas1431886233600805Pre48 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "TI" OR getYear(FechaNacimiento) <> 2000 OR length(NumIdentificacion) <> 11

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("TI") || !(STDFunctions.getYearFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())).equals(Long.valueOf(2000)) || !(STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion())).equals(Long.valueOf(11));
        if (!preconditionHolds) throw new PreconditionException("TI de 11 dígitos y los 6 primeros dígitos de la identificación deben coincidir con la fecha de nacimiento del usuario.(Teniendo en cuenta que los 3 primeros pueden ser ceros y no se reflejan en el sistema) por lo tanto los nacidos en 2000 tendrían identifiaciones solo de 8, 9 y 10 dígitos");
    }

    private void checkClas1431886233600805Pre66 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "TI" OR getYear(FechaNacimiento) >= 2000 OR (length(NumIdentificacion) = 11 AND substring(NumIdentificacion, 1, 2) = substring(IntToStr(getYear(FechaNacimiento)), 3, 2) AND ((length(IntToStr(getMonth(FechaNacimiento))) = 2 AND substring(NumIdentificacion, 3, 2) = IntToStr(getMonth(FechaNacimiento))) OR (length(IntToStr(getMonth(FechaNacimiento))) = 1 AND substring(NumIdentificacion, 4, 1) = IntToStr(getMonth(FechaNacimiento)))) AND (length(IntToStr(getDay(FechaNacimiento))) = 2 AND substring(NumIdentificacion, 5, 2) = IntToStr(getDay(FechaNacimiento))) OR (length(IntToStr(getDay(FechaNacimiento))) = 1 AND substring(NumIdentificacion, 6, 1) = IntToStr(getDay(FechaNacimiento))))

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("TI") || STDFunctions.getYearFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento()) >= Long.valueOf(2000) || ((STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion())).equals(Long.valueOf(11)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(1), Long.valueOf(2)),STDFunctions.substringFun(STDFunctions.intToStrFun(STDFunctions.getYearFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())), Long.valueOf(3), Long.valueOf(2))) && (((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(2)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(3), Long.valueOf(2)),STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))) || ((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(1)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(4), Long.valueOf(1)),STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento()))))) && ((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(2)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(5), Long.valueOf(2)),STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))) || ((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(1)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(6), Long.valueOf(1)),STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))));
        if (!preconditionHolds) throw new PreconditionException("TI de 11 digitos y los 6 primeros digitos de la identificacion deben coincidir con la fecha de nacimiento del usuario");
    }

    private void checkClas1431886233600805Pre67 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "RC" OR getYear(FechaNacimiento) >= 2000 OR (length(NumIdentificacion) = 11 AND substring(NumIdentificacion, 1, 2) = substring(IntToStr(getYear(FechaNacimiento)), 3, 2) AND ((length(IntToStr(getMonth(FechaNacimiento))) = 2 AND substring(NumIdentificacion, 3, 2) = IntToStr(getMonth(FechaNacimiento))) OR (length(IntToStr(getMonth(FechaNacimiento))) = 1 AND substring(NumIdentificacion, 4, 1) = IntToStr(getMonth(FechaNacimiento)))) AND (length(IntToStr(getDay(FechaNacimiento))) = 2 AND substring(NumIdentificacion, 5, 2) = IntToStr(getDay(FechaNacimiento))) OR (length(IntToStr(getDay(FechaNacimiento))) = 1 AND substring(NumIdentificacion, 6, 1) = IntToStr(getDay(FechaNacimiento))))

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("RC") || STDFunctions.getYearFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento()) >= Long.valueOf(2000) || ((STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion())).equals(Long.valueOf(11)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(1), Long.valueOf(2)),STDFunctions.substringFun(STDFunctions.intToStrFun(STDFunctions.getYearFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())), Long.valueOf(3), Long.valueOf(2))) && (((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(2)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(3), Long.valueOf(2)),STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))) || ((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(1)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(4), Long.valueOf(1)),STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento()))))) && ((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(2)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(5), Long.valueOf(2)),STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))) || ((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(1)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(6), Long.valueOf(1)),STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))));
        if (!preconditionHolds) throw new PreconditionException("RC de 11 digitos y los 6 primeros digitos de la identificacion deben coincidir con la fecha de nacimiento del usuario");
    }

    private void checkClas1431886233600805Pre68 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "CE" OR length(NumIdentificacion) <= 7

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("CE") || STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) <= Long.valueOf(7);
        if (!preconditionHolds) throw new PreconditionException("Las CE de extranjeria correctas tienen como maximo 7 digitos en sus estructura");
    }

    private void checkClas1431886233600805Pre56 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "CE" OR fuSoloNumeros(NumIdentificacion) = true

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("CE") || userFunctionsSrv.fuSoloNumerosFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El Número de Identificación sólo puede contener números");
    }

    private void checkClas1431886233600805Pre69 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "MS" OR length(NumIdentificacion) <= 12

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("MS") || STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) <= Long.valueOf(12);
        if (!preconditionHolds) throw new PreconditionException("Los MS correctos tienen como maximo 12 digitos en su estructura");
    }

    private void checkClas1431886233600805Pre70 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "CC" OR (length(NumIdentificacion) >= 3 AND length(NumIdentificacion) <= 10 AND length(NumIdentificacion) <> 9)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("CC") || (STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) >= Long.valueOf(3) && STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) <= Long.valueOf(10) && !(STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion())).equals(Long.valueOf(9)));
        if (!preconditionHolds) throw new PreconditionException("CC entre 3 y 10 digitos a excepcion de 9");
    }

    private void checkClas1431886233600805Pre57 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "CC" OR fuSoloNumeros(NumIdentificacion) = true

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("CC") || userFunctionsSrv.fuSoloNumerosFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El Número de Identificación sólo puede contener números");
    }

    private void checkClas1431886233600805Pre84 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // (TipoIdentificacion.NombreCorto <> "RC" AND TipoIdentificacion.NombreCorto <> "TI") OR length(NumIdentificacion) <> 8 OR getYear(FechaNacimiento) <> 2000 OR (substring(NumIdentificacion, 1, 1) = IntToStr(getMonth(FechaNacimiento)) AND (length(IntToStr(getDay(FechaNacimiento))) = 2 AND substring(NumIdentificacion, 2, 2) = IntToStr(getDay(FechaNacimiento)) OR length(IntToStr(getDay(FechaNacimiento))) = 1 AND substring(NumIdentificacion, 2, 2) = "0" + IntToStr(getDay(FechaNacimiento))))

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = (!(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("RC") && !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("TI")) || !(STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion())).equals(Long.valueOf(8)) || !(STDFunctions.getYearFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())).equals(Long.valueOf(2000)) || (STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(1), Long.valueOf(1)),STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento()))) && ((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(2)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(2), Long.valueOf(2)),STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento()))) || (STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(1)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(2), Long.valueOf(2)),"0" + STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))));
        if (!preconditionHolds) throw new PreconditionException("RC y TI solo pueden ser de 8 digitos cuando son usuarios nacidos en el año 2000 y sus 6 primeros digitos coinciden con los 6 primeros digitos de la fecha de nacimiento.");
    }

    private void checkClas1431886233600805Pre91 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // (TipoIdentificacion.NombreCorto <> "RC" AND TipoIdentificacion.NombreCorto <> "TI") OR length(NumIdentificacion) <> 9 OR getYear(FechaNacimiento) <> 2000 OR (substring(NumIdentificacion, 1, 2) = IntToStr(getMonth(FechaNacimiento)) AND (length(IntToStr(getDay(FechaNacimiento))) = 2 AND substring(NumIdentificacion, 3, 2) = IntToStr(getDay(FechaNacimiento)) OR length(IntToStr(getDay(FechaNacimiento))) = 1 AND substring(NumIdentificacion, 3, 2) = "0" + IntToStr(getDay(FechaNacimiento))))

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = (!(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("RC") && !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("TI")) || !(STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion())).equals(Long.valueOf(9)) || !(STDFunctions.getYearFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())).equals(Long.valueOf(2000)) || (STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(1), Long.valueOf(2)),STDFunctions.intToStrFun(STDFunctions.getMonthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento()))) && ((STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(2)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(3), Long.valueOf(2)),STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento()))) || (STDFunctions.lengthFun(STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))).equals(Long.valueOf(1)) && STDFunctions.areEqual(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(3), Long.valueOf(2)),"0" + STDFunctions.intToStrFun(STDFunctions.getDayFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaFechaNacimiento())))));
        if (!preconditionHolds) throw new PreconditionException("RC y TI solo pueden ser de 9 digitos cuando son usuarios nacidos en el año 2000 y sus 6 primeros digitos coinciden con los 6 primeros digitos de la fecha de nacimiento.");
    }

    private void checkClas1431886233600805Pre83 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // (TipoIdentificacion.NombreCorto <> "RC" AND TipoIdentificacion.NombreCorto <> "TI") OR length(NumIdentificacion) <> 10 OR NumIdentificacion <= "1299999999"

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = (!(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("RC") && !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("TI")) || !(STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion())).equals(Long.valueOf(10)) || STDFunctions.strLesserThanOrEqualToFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(),"1299999999");
        if (!preconditionHolds) throw new PreconditionException("RC y TI de 10 digitos solo deben estar en un rango numerico entre 1000000000 y 1299999999");
    }

    private void checkClas1431886233600805Pre73 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "NU" OR length(NumIdentificacion) = 10

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("NU") || (STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion())).equals(Long.valueOf(10));
        if (!preconditionHolds) throw new PreconditionException("NU solo es valido de 10 digitos");
    }

    private void checkClas1431886233600805Pre49 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "CC" OR Genero <> "M" OR (StrToReal(NumIdentificacion) >= 0 AND StrToReal(NumIdentificacion) <= 20000000) OR (StrToReal(NumIdentificacion) > 70000000 AND StrToReal(NumIdentificacion) < 100000000) OR (StrToReal(NumIdentificacion) >= 1000000000)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("CC") || !(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaGenero()).equals("M") || (STDFunctions.strToRealFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) >= Utilities.convertToDouble(Utilities.convertToDouble(Long.valueOf(0))) && STDFunctions.strToRealFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) <= Utilities.convertToDouble(Utilities.convertToDouble(Long.valueOf(20000000)))) || (STDFunctions.strToRealFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) > Utilities.convertToDouble(Utilities.convertToDouble(Long.valueOf(70000000))) && STDFunctions.strToRealFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) < Utilities.convertToDouble(Utilities.convertToDouble(Long.valueOf(100000000)))) || (STDFunctions.strToRealFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) >= Utilities.convertToDouble(Utilities.convertToDouble(Long.valueOf(1000000000))));
        if (!preconditionHolds) throw new PreconditionException("El Número de Identificación debe estar dentro de un rango de 0 a 20000000, de  70000000 a 10000000 (no inclusive) o de 1000000000 en adelante");
    }

    private void checkClas1431886233600805Pre50 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "CC" OR Genero <> "F" OR (StrToReal(NumIdentificacion) > 20000000 AND StrToReal(NumIdentificacion) <= 70000000) OR (StrToReal(NumIdentificacion) >= 1000000000)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("CC") || !(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaGenero()).equals("F") || (STDFunctions.strToRealFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) > Utilities.convertToDouble(Utilities.convertToDouble(Long.valueOf(20000000))) && STDFunctions.strToRealFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) <= Utilities.convertToDouble(Utilities.convertToDouble(Long.valueOf(70000000)))) || (STDFunctions.strToRealFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) >= Utilities.convertToDouble(Utilities.convertToDouble(Long.valueOf(1000000000))));
        if (!preconditionHolds) throw new PreconditionException("El Número de Identificación debe estar por fuera un rango de 20000000 y 70000000 o menor de 1000000000");
    }

    private void checkClas1431886233600805Pre51 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "TI" OR fuSoloNumeros(NumIdentificacion) = true

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("TI") || userFunctionsSrv.fuSoloNumerosFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El Número de Identificación sólo puede contener números");
    }

    private void checkClas1431886233600805Pre52 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "NU" OR (length(NumIdentificacion) > 3 AND fuContieneCharEspecial(NumIdentificacion) = false AND fuSoloLetras(substring(NumIdentificacion, 1, 3)) = true AND fuSoloNumeros(substring(NumIdentificacion, 4, length(NumIdentificacion) - 3)) = true)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("NU") || (STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) > Long.valueOf(3) && userFunctionsSrv.fuContieneCharEspecialFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()).equals(false) && userFunctionsSrv.fuSoloLetrasFun(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(1), Long.valueOf(3))).equals(true) && userFunctionsSrv.fuSoloNumerosFun(STDFunctions.substringFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion(), Long.valueOf(4), STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) - Long.valueOf(3))).equals(true));
        if (!preconditionHolds) throw new PreconditionException("El Número de Identificación puede contener carácteres alfabeticos en las primeras 3 posiciones y números en las siguientes");
    }

    private void checkClas1431886233600805Pre53 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "RC" OR fuSoloNumeros(NumIdentificacion) = true

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("RC") || userFunctionsSrv.fuSoloNumerosFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El Número de Identificación sólo puede contener números");
    }

    private void checkClas1431886233600805Pre54 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "MS" OR fuSoloNumeros(NumIdentificacion) = true

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("MS") || userFunctionsSrv.fuSoloNumerosFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El Número de Identificación sólo puede contener números");
    }

    private void checkClas1431886233600805Pre55 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.NombreCorto <> "PA" OR fuContieneCharEspecial(NumIdentificacion) = false

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = !(personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto()).equals("PA") || userFunctionsSrv.fuContieneCharEspecialFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()).equals(false);
        if (!preconditionHolds) throw new PreconditionException("El Número de Identificación puede tener carácteres alfanúmericos sin carácteres especiales");
    }

    private void checkClas1431886233600805Pre74 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.Diplomatico = false OR fuContieneCharEspecial(NumIdentificacion) = false

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionDiplomatico().equals(false) || userFunctionsSrv.fuContieneCharEspecialFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()).equals(false);
        if (!preconditionHolds) throw new PreconditionException("El número de documento asociado a este tipo de documento es de tipo alfanumérico, puede admitir letras y números");
    }

    private void checkClas1431886233600805Pre75 (
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest request) 
            throws ModelException {
        // TipoIdentificacion.Diplomatico = false OR (length(NumIdentificacion) >= 3 AND length(NumIdentificacion) <= 11)

        Persona personavalidarDatosRestrictivaTipoIdpthisPersona = request.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance();
        boolean preconditionHolds = personavalidarDatosRestrictivaTipoIdpthisPersona.getTipoIdentificacion().getTipoIdentificacionDiplomatico().equals(false) || (STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) >= Long.valueOf(3) && STDFunctions.lengthFun(personavalidarDatosRestrictivaTipoIdpthisPersona.getPersonaNumIdentificacion()) <= Long.valueOf(11));
        if (!preconditionHolds) throw new PreconditionException("Para documentos de tipo diplomático, la longitud del número de identificación debe ser de entre 3 y 11 caracteres");
    }

    // Service: InsEstadoPersona

    /*
     * Entry point for service InsEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insEstadoPersona(
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.insEstadoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insEstadoPersonaTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest request) throws ModelException {
        request.setPersonaInsEstadoPersonapthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaInsEstadoPersonapthisPersona()));
        request.setPersonaInsEstadoPersonapevcEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaInsEstadoPersonapevcEstadoPersona()));
        return personaSrv.insEstadoPersonaImplementation(request, true);
    }

    /*
     * Implements service InsEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insEstadoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaInsEstadoPersonapthisPersona = request.getPersonaInsEstadoPersonapthisPersonaInstance();
        EstadoPersona personaInsEstadoPersonapevcEstadoPersona = request.getPersonaInsEstadoPersonapevcEstadoPersonaInstance();

        request.checkArguments();
        Persona instance = personaInsEstadoPersonapthisPersona;

        instance.add2EstadoPersona(personaInsEstadoPersonapevcEstadoPersona);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.estadopersona.siu.InsEstadoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.estadopersona.siu.InsEstadoPersonaRequest();
            relatedRequest.setEstadoPersonaInsEstadoPersonapthisEstadoPersonaInstance(personaInsEstadoPersonapevcEstadoPersona);
            relatedRequest.setEstadoPersonaInsEstadoPersonapevcPersonaInstance(personaInsEstadoPersonapthisPersona);
            estadoPersonaSrv.insEstadoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: DelEstadoPersona

    /*
     * Entry point for service DelEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delEstadoPersona(
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.delEstadoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delEstadoPersonaTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest request) throws ModelException {
        request.setPersonaDelEstadoPersonapthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaDelEstadoPersonapthisPersona()));
        request.setPersonaDelEstadoPersonapevcEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaDelEstadoPersonapevcEstadoPersona()));
        return personaSrv.delEstadoPersonaImplementation(request, true);
    }

    /*
     * Implements service DelEstadoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delEstadoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaDelEstadoPersonapthisPersona = request.getPersonaDelEstadoPersonapthisPersonaInstance();
        EstadoPersona personaDelEstadoPersonapevcEstadoPersona = request.getPersonaDelEstadoPersonapevcEstadoPersonaInstance();

        request.checkArguments();
        Persona instance = personaDelEstadoPersonapthisPersona;

        instance.add2EstadoPersona(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.estadopersona.siu.DelEstadoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.estadopersona.siu.DelEstadoPersonaRequest();
            relatedRequest.setEstadoPersonaDelEstadoPersonapthisEstadoPersonaInstance(personaDelEstadoPersonapevcEstadoPersona);
            relatedRequest.setEstadoPersonaDelEstadoPersonapevcPersonaInstance(personaDelEstadoPersonapthisPersona);
            estadoPersonaSrv.delEstadoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

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
            com.keralty.aepersonas.viewmodel.persona.siu.DelContratanteSolicitudRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.delContratanteSolicitudTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.DelContratanteSolicitudRequest request) throws ModelException {
        request.setPersonaDelContratanteSolicitudpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaDelContratanteSolicitudpthisPersona()));
        request.setPersonaDelContratanteSolicitudpevcSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaDelContratanteSolicitudpevcSolicitud()));
        return personaSrv.delContratanteSolicitudImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.persona.siu.DelContratanteSolicitudRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaDelContratanteSolicitudpthisPersona = request.getPersonaDelContratanteSolicitudpthisPersonaInstance();
        Solicitud personaDelContratanteSolicitudpevcSolicitud = request.getPersonaDelContratanteSolicitudpevcSolicitudInstance();

        request.checkArguments();
        Persona instance = personaDelContratanteSolicitudpthisPersona;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.DelContratanteSolicitudRequest relatedRequest = new com.keralty.aepersonas.viewmodel.solicitud.siu.DelContratanteSolicitudRequest();
            relatedRequest.setSolicitudDelContratanteSolicitudpthisSolicitudInstance(personaDelContratanteSolicitudpevcSolicitud);
            relatedRequest.setSolicitudDelContratanteSolicitudpevcPersonaInstance(personaDelContratanteSolicitudpthisPersona);
            solicitudSrv.delContratanteSolicitudImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

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
            com.keralty.aepersonas.viewmodel.persona.siu.DelTitularSolicitudRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.delTitularSolicitudTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.DelTitularSolicitudRequest request) throws ModelException {
        request.setPersonaDelTitularSolicitudpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaDelTitularSolicitudpthisPersona()));
        request.setPersonaDelTitularSolicitudpevcSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaDelTitularSolicitudpevcSolicitud()));
        return personaSrv.delTitularSolicitudImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.persona.siu.DelTitularSolicitudRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaDelTitularSolicitudpthisPersona = request.getPersonaDelTitularSolicitudpthisPersonaInstance();
        Solicitud personaDelTitularSolicitudpevcSolicitud = request.getPersonaDelTitularSolicitudpevcSolicitudInstance();

        request.checkArguments();
        Persona instance = personaDelTitularSolicitudpthisPersona;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.solicitud.siu.DelTitularSolicitudRequest relatedRequest = new com.keralty.aepersonas.viewmodel.solicitud.siu.DelTitularSolicitudRequest();
            relatedRequest.setSolicitudDelTitularSolicitudpthisSolicitudInstance(personaDelTitularSolicitudpevcSolicitud);
            relatedRequest.setSolicitudDelTitularSolicitudpevcPersonaInstance(personaDelTitularSolicitudpthisPersona);
            solicitudSrv.delTitularSolicitudImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
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
            com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.cambTipoIdentificacionTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest request) throws ModelException {
        request.setPersonaCambTipoIdentificacionpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaCambTipoIdentificacionpthisPersona()));
        request.setPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(new TipoIdentificacionOid().fromJsonString(request.getPersonaCambTipoIdentificacionpevcTipoIdentificacion())));
        return personaSrv.cambTipoIdentificacionImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaCambTipoIdentificacionpthisPersona = request.getPersonaCambTipoIdentificacionpthisPersonaInstance();
        TipoIdentificacion personaCambTipoIdentificacionpevcTipoIdentificacion = request.getPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance();

        request.checkArguments();
        Persona instance = personaCambTipoIdentificacionpthisPersona;
        if (personaCambTipoIdentificacionpevcTipoIdentificacion.getTipoIdentificacionNIT().equals(true)) {
            instance.setPersonaTipoPersona("J");
        } else {
            instance.setPersonaTipoPersona("N");
        }

        instance.add2TipoIdentificacion(personaCambTipoIdentificacionpevcTipoIdentificacion);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionRequest();
            relatedRequest.setTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance(personaCambTipoIdentificacionpevcTipoIdentificacion);
            relatedRequest.setTipoIdentificacionCambTipoIdentificacionpevcPersonaInstance(personaCambTipoIdentificacionpthisPersona);
            tipoIdentificacionSrv.cambTipoIdentificacionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: marcarDatosBasicosMod

    /*
     * Entry point for service marcarDatosBasicosMod
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse marcarDatosBasicosMod(
            com.keralty.aepersonas.viewmodel.persona.siu.MarcarDatosBasicosModRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.marcarDatosBasicosModTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service marcarDatosBasicosMod
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse marcarDatosBasicosModTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.MarcarDatosBasicosModRequest request) throws ModelException {
        request.setPersonamarcarDatosBasicosModpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonamarcarDatosBasicosModpthisPersona()));
        return personaSrv.marcarDatosBasicosModImplementation(request);
    }

    /*
     * Implements service marcarDatosBasicosMod
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse marcarDatosBasicosModImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.MarcarDatosBasicosModRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personamarcarDatosBasicosModpthisPersona = request.getPersonamarcarDatosBasicosModpthisPersonaInstance();
        Boolean personamarcarDatosBasicosModpModificados = request.getPersonamarcarDatosBasicosModpModificados();

        request.checkArguments();

        marcarDatosBasicosModPreconditions();
        Persona instance = personamarcarDatosBasicosModpthisPersona;
        instance.setPersonaDatosBasicosMod(personamarcarDatosBasicosModpModificados);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    private void marcarDatosBasicosModPreconditions() throws ModelException {
        checkClas1431886233600805Pre86();
    }

    private void checkClas1431886233600805Pre86 () throws ModelException {
        // AGENTAsesor = NULL OR AGENTAsesor.ModDBasicosPersona = true

        boolean preconditionHolds = (((Asesor) getAgentInstance(AsesorConstants.CLASS_NAME)) == null || ((Asesor) getAgentInstance(AsesorConstants.CLASS_NAME)).isNull()) || ((Asesor) getAgentInstance(AsesorConstants.CLASS_NAME)).getAsesorModDBasicosPersona().equals(true);
        if (!preconditionHolds) throw new PreconditionException("Modificación de datos básicos no permitida");
    }

    // Service: indicarCodigoCORE

    /*
     * Entry point for service indicarCodigoCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse indicarCodigoCORE(
            com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.indicarCodigoCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service indicarCodigoCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse indicarCodigoCORETxn(
            com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest request) throws ModelException {
        request.setPersonaindicarCodigoCOREpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaindicarCodigoCOREpthisPersona()));
        return personaSrv.indicarCodigoCOREImplementation(request);
    }

    /*
     * Implements service indicarCodigoCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse indicarCodigoCOREImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personaindicarCodigoCOREpthisPersona = request.getPersonaindicarCodigoCOREpthisPersonaInstance();
        Long personaindicarCodigoCOREpCodigo = request.getPersonaindicarCodigoCOREpCodigo();

        request.checkArguments();
        Persona instance = personaindicarCodigoCOREpthisPersona;
        instance.setPersonaCodigo(personaindicarCodigoCOREpCodigo);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: dummyGetNumCodCORE

    /*
     * Entry point for service dummyGetNumCodCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCOREResponse dummyGetNumCodCORE(
            com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCORERequest request) {
        com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCOREResponse response = new com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCOREResponse();
        try {
            response = personaSrv.dummyGetNumCodCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service dummyGetNumCodCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCOREResponse dummyGetNumCodCORETxn(
            com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCORERequest request) throws ModelException {
        request.setPersonadummyGetNumCodCOREpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonadummyGetNumCodCOREpthisPersona()));
        request.setPersonadummyGetNumCodCOREpSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonadummyGetNumCodCOREpSolicitud()));
        return personaSrv.dummyGetNumCodCOREImplementation(request);
    }

    /*
     * Implements service dummyGetNumCodCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCOREResponse dummyGetNumCodCOREImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCORERequest request) throws ModelException {
        com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCOREResponse response = new com.keralty.aepersonas.viewmodel.persona.siu.DummyGetNumCodCOREResponse();
        Solicitud personadummyGetNumCodCOREpSolicitud = request.getPersonadummyGetNumCodCOREpSolicitudInstance();
        Persona personadummyGetNumCodCOREpthisPersona = request.getPersonadummyGetNumCodCOREpthisPersonaInstance();

        request.checkArguments();
        Persona instance = personadummyGetNumCodCOREpthisPersona;


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        // Value expressions for outgoing argument 'personadummyGetNumCodCOREpsCodigo'
        // CONDITION: Codigo <> NULL AND  Codigo <> 0
        // EFFECT   : Codigo
        if (personadummyGetNumCodCOREpthisPersona.getPersonaCodigo() != null && !(personadummyGetNumCodCOREpthisPersona.getPersonaCodigo()).equals(Long.valueOf(0))) {
            response.setPersonadummyGetNumCodCOREpsCodigo(personadummyGetNumCodCOREpthisPersona.getPersonaCodigo());
        }
         else {
            // DEFAULT  : fuGetCodigoPersonaCORE(TipoIdentificacion.NombreCorto, NumIdentificacion, pSolicitud.Aesolicitudes.Numerosolicitud)
            response.setPersonadummyGetNumCodCOREpsCodigo(userFunctionsSrv.fuGetCodigoPersonaCOREFun(personadummyGetNumCodCOREpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto(), personadummyGetNumCodCOREpthisPersona.getPersonaNumIdentificacion(), personadummyGetNumCodCOREpSolicitud.getAesolicitudes().getAesolicitudesNumerosolicitud()));
        }


        return response;
    }

    // Service: cambiarTelefonos

    /*
     * Entry point for service cambiarTelefonos
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambiarTelefonos(
            com.keralty.aepersonas.viewmodel.persona.siu.CambiarTelefonosRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.cambiarTelefonosTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service cambiarTelefonos
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambiarTelefonosTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.CambiarTelefonosRequest request) throws ModelException {
        request.setPersonacambiarTelefonospthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonacambiarTelefonospthisPersona()));
        return personaSrv.cambiarTelefonosImplementation(request);
    }

    /*
     * Implements service cambiarTelefonos
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambiarTelefonosImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.CambiarTelefonosRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Persona personacambiarTelefonospthisPersona = request.getPersonacambiarTelefonospthisPersonaInstance();
        String personacambiarTelefonospTelefonoFijo = request.getPersonacambiarTelefonospTelefonoFijo();
        String personacambiarTelefonospTelefonoCelular = request.getPersonacambiarTelefonospTelefonoCelular();

        request.checkArguments();
        Persona instance = personacambiarTelefonospthisPersona;
        instance.setPersonaTelefonoFijo(personacambiarTelefonospTelefonoFijo);
        instance.setPersonaTelefonoCelular(personacambiarTelefonospTelefonoCelular);


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: TCREARNATURAL

    /*
     * Entry point for service TCREARNATURAL
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARNATURAL(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARNATURALRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tCREARNATURALTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARNATURAL
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARNATURALTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARNATURALRequest request) throws ModelException, SystemException {
        request.setPersonaTCREARNATURALptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptpagrTipoIdentificacion()));
        request.setPersonaTCREARNATURALptpagrDepartamentoNacimientoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptpagrDepartamentoNacimiento()));
        request.setPersonaTCREARNATURALptpagrMunicipioNacimientoInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptpagrMunicipioNacimiento()));
        request.setPersonaTCREARNATURALptpagrEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptpagrEstadoCivil()));
        request.setPersonaTCREARNATURALptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptpagrPais()));
        request.setPersonaTCREARNATURALptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptpagrDepartamento()));
        request.setPersonaTCREARNATURALptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptpagrMunicipio()));
        request.setPersonaTCREARNATURALptTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptTipoDireccion()));
        request.setPersonaTCREARNATURALpDCDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARNATURALpDCDepartamento()));
        request.setPersonaTCREARNATURALpDCMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARNATURALpDCMunicipio()));
        request.setPersonaTCREARNATURALpDCTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTCREARNATURALpDCTipoDireccion()));
        request.setPersonaTCREARNATURALpDCPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTCREARNATURALpDCPais()));
        request.setPersonaTCREARNATURALptEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptEstadoPersona()));
        request.setPersonaTCREARNATURALptSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaTCREARNATURALptSolicitud()));
        return personaSrv.tCREARNATURALImplementation(request);
    }

    /*
     * Implements service TCREARNATURAL
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARNATURALImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARNATURALRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Departamento personaTCREARNATURALptpagrDepartamentoNacimiento = request.getPersonaTCREARNATURALptpagrDepartamentoNacimientoInstance();
        Municipio personaTCREARNATURALptpagrMunicipioNacimiento = request.getPersonaTCREARNATURALptpagrMunicipioNacimientoInstance();
        EstadoCivil personaTCREARNATURALptpagrEstadoCivil = request.getPersonaTCREARNATURALptpagrEstadoCivilInstance();
        EstadoPersona personaTCREARNATURALptEstadoPersona = request.getPersonaTCREARNATURALptEstadoPersonaInstance();
        TipoIdentificacion personaTCREARNATURALptpagrTipoIdentificacion = request.getPersonaTCREARNATURALptpagrTipoIdentificacionInstance();
        String personaTCREARNATURALptpatrNumIdentificacion = request.getPersonaTCREARNATURALptpatrNumIdentificacion();
        String personaTCREARNATURALptpatrPrimerNombre = request.getPersonaTCREARNATURALptpatrPrimerNombre();
        String personaTCREARNATURALptpatrSegundoNombre = request.getPersonaTCREARNATURALptpatrSegundoNombre();
        String personaTCREARNATURALptpatrPrimerApellido = request.getPersonaTCREARNATURALptpatrPrimerApellido();
        String personaTCREARNATURALptpatrSegundoApellido = request.getPersonaTCREARNATURALptpatrSegundoApellido();
        Date personaTCREARNATURALptpatrFechaNacimiento = request.getPersonaTCREARNATURALptpatrFechaNacimiento();
        String personaTCREARNATURALptpatrGenero = request.getPersonaTCREARNATURALptpatrGenero();
        Boolean personaTCREARNATURALptpatrIndicadorExtranjero = request.getPersonaTCREARNATURALptpatrIndicadorExtranjero();
        String personaTCREARNATURALptpatrTelefonoFijo = request.getPersonaTCREARNATURALptpatrTelefonoFijo();
        String personaTCREARNATURALptpatrTelefonoCelular = request.getPersonaTCREARNATURALptpatrTelefonoCelular();
        String personaTCREARNATURALptpatrCorreoElectronico = request.getPersonaTCREARNATURALptpatrCorreoElectronico();
        Long personaTCREARNATURALpCodigo = request.getPersonaTCREARNATURALpCodigo();
        Boolean personaTCREARNATURALptValidarDatos = request.getPersonaTCREARNATURALptValidarDatos();
        String personaTCREARNATURALptpatrDireccionCompleta = request.getPersonaTCREARNATURALptpatrDireccionCompleta();
        TipoDireccion personaTCREARNATURALptTipoDireccion = request.getPersonaTCREARNATURALptTipoDireccionInstance();
        Pais personaTCREARNATURALptpagrPais = request.getPersonaTCREARNATURALptpagrPaisInstance();
        Municipio personaTCREARNATURALptpagrMunicipio = request.getPersonaTCREARNATURALptpagrMunicipioInstance();
        Departamento personaTCREARNATURALptpagrDepartamento = request.getPersonaTCREARNATURALptpagrDepartamentoInstance();
        Boolean personaTCREARNATURALptpatrRural = request.getPersonaTCREARNATURALptpatrRural();
        String personaTCREARNATURALpDCDireccionCompleta = request.getPersonaTCREARNATURALpDCDireccionCompleta();
        TipoDireccion personaTCREARNATURALpDCTipoDireccion = request.getPersonaTCREARNATURALpDCTipoDireccionInstance();
        Pais personaTCREARNATURALpDCPais = request.getPersonaTCREARNATURALpDCPaisInstance();
        Municipio personaTCREARNATURALpDCMunicipio = request.getPersonaTCREARNATURALpDCMunicipioInstance();
        Departamento personaTCREARNATURALpDCDepartamento = request.getPersonaTCREARNATURALpDCDepartamentoInstance();
        Boolean personaTCREARNATURALpDCRural = request.getPersonaTCREARNATURALpDCRural();
        Solicitud personaTCREARNATURALptSolicitud = request.getPersonaTCREARNATURALptSolicitudInstance();

        request.checkArguments();
        Persona instance;

        com.keralty.aepersonas.viewmodel.persona.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.persona.siu.CrearRequest();
        step1Request.setPersonacrearpagrDepartamentoNacimientoInstance(personaTCREARNATURALptpagrDepartamentoNacimiento);
        step1Request.setPersonacrearpagrMunicipioNacimientoInstance(personaTCREARNATURALptpagrMunicipioNacimiento);
        step1Request.setPersonacrearpagrEstadoCivilInstance(personaTCREARNATURALptpagrEstadoCivil);
        step1Request.setPersonacrearpagrEstadoPersonaInstance(personaTCREARNATURALptEstadoPersona);
        step1Request.setPersonacrearpagrTipoIdentificacionInstance(personaTCREARNATURALptpagrTipoIdentificacion);
        step1Request.setPersonacrearpatrNumIdentificacion(personaTCREARNATURALptpatrNumIdentificacion);
        step1Request.setPersonacrearpatrTipoPersona("N");
        step1Request.setPersonacrearpatrPrimerNombre(personaTCREARNATURALptpatrPrimerNombre);
        step1Request.setPersonacrearpatrSegundoNombre(personaTCREARNATURALptpatrSegundoNombre);
        step1Request.setPersonacrearpatrPrimerApellido(personaTCREARNATURALptpatrPrimerApellido);
        step1Request.setPersonacrearpatrSegundoApellido(personaTCREARNATURALptpatrSegundoApellido);
        step1Request.setPersonacrearpatrRazonSocial(null);
        step1Request.setPersonacrearpatrFechaNacimiento(personaTCREARNATURALptpatrFechaNacimiento);
        step1Request.setPersonacrearpatrGenero(personaTCREARNATURALptpatrGenero);
        step1Request.setPersonacrearpatrIndicadorExtranjero(personaTCREARNATURALptpatrIndicadorExtranjero);
        step1Request.setPersonacrearpatrTelefonoFijo(personaTCREARNATURALptpatrTelefonoFijo);
        step1Request.setPersonacrearpatrTelefonoCelular(personaTCREARNATURALptpatrTelefonoCelular);
        step1Request.setPersonacrearpatrCorreoElectronico(personaTCREARNATURALptpatrCorreoElectronico);
        instance = (Persona) personaSrv.crearImplementation(step1Request).getInstance();

        /* Action 2: IF (pCodigo <> NULL) */
        boolean ifCondition2 = personaTCREARNATURALpCodigo != null;
        if (ifCondition2) {
            com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest step20Request = new com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest();
            step20Request.setPersonaindicarCodigoCOREpthisPersonaInstance(instance);
            step20Request.setPersonaindicarCodigoCOREpCodigo(personaTCREARNATURALpCodigo);
            personaSrv.indicarCodigoCOREImplementation(step20Request);
        }

        /* Action 3: IF (ptValidarDatos = true) */
        boolean ifCondition3 = personaTCREARNATURALptValidarDatos.equals(true);
        if (ifCondition3) {
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest step30Request = new com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest();
            step30Request.setPersonavalidarDatosRestrictivapthisPersonaInstance(instance);
            personaSrv.validarDatosRestrictivaImplementation(step30Request);
        }

        /* Action 4: IF (drvVieneDeCORE = false) */
        boolean ifCondition4 = instance.getPersonadrvVieneDeCORE().equals(false);
        if (ifCondition4) {
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest step40Request = new com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest();
            step40Request.setPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance(instance);
            personaSrv.validarDatosRestrictivaTipoIdImplementation(step40Request);
        }

        /* Action 5: IF (ptpatrDireccionCompleta <> NULL) */
        boolean ifCondition5 = personaTCREARNATURALptpatrDireccionCompleta != null;
        if (ifCondition5) {
            com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest step50Request = new com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest();
            step50Request.setDireccioncrearpagrPersonaInstance(instance);
            step50Request.setDireccioncrearpagrContratoInstance(null);
            step50Request.setDireccioncrearpagrTitularInstance(null);
            step50Request.setDireccioncrearpagrTipoDireccionInstance(personaTCREARNATURALptTipoDireccion);
            step50Request.setDireccioncrearpagrPaisInstance(personaTCREARNATURALptpagrPais);
            step50Request.setDireccioncrearpagrMunicipioInstance(personaTCREARNATURALptpagrMunicipio);
            step50Request.setDireccioncrearpagrDepartamentoInstance(personaTCREARNATURALptpagrDepartamento);
            step50Request.setDireccioncrearpatrDireccionCompleta(personaTCREARNATURALptpatrDireccionCompleta);
            step50Request.setDireccioncrearpatrRural(personaTCREARNATURALptpatrRural);
            direccionSrv.crearImplementation(step50Request);
            /* Action 51: IF (ptTipoDireccion.EsResidencia = false) */
            boolean ifCondition51 = personaTCREARNATURALptTipoDireccion.getTipoDireccionEsResidencia().equals(false);
            if (ifCondition51) {
                com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest step510Request = new com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest();
                step510Request.setDireccioncrearpagrPersonaInstance(instance);
                step510Request.setDireccioncrearpagrContratoInstance(null);
                step510Request.setDireccioncrearpagrTitularInstance(null);
                step510Request.setDireccioncrearpagrTipoDireccionInstance(userFunctionsSrv.fugetTipoDirResidencialFun());
                step510Request.setDireccioncrearpagrPaisInstance(personaTCREARNATURALptpagrPais);
                step510Request.setDireccioncrearpagrMunicipioInstance(personaTCREARNATURALptpagrMunicipio);
                step510Request.setDireccioncrearpagrDepartamentoInstance(personaTCREARNATURALptpagrDepartamento);
                step510Request.setDireccioncrearpatrDireccionCompleta(personaTCREARNATURALptpatrDireccionCompleta);
                step510Request.setDireccioncrearpatrRural(personaTCREARNATURALptpatrRural);
                direccionSrv.crearImplementation(step510Request);
            }
        }

        /* Action 6: IF (pDCDireccionCompleta <> NULL) */
        boolean ifCondition6 = personaTCREARNATURALpDCDireccionCompleta != null;
        if (ifCondition6) {
            com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest step60Request = new com.keralty.aepersonas.viewmodel.direccion.siu.CrearRequest();
            step60Request.setDireccioncrearpagrPersonaInstance(instance);
            step60Request.setDireccioncrearpagrContratoInstance(null);
            step60Request.setDireccioncrearpagrTitularInstance(null);
            step60Request.setDireccioncrearpagrTipoDireccionInstance(personaTCREARNATURALpDCTipoDireccion);
            step60Request.setDireccioncrearpagrPaisInstance(personaTCREARNATURALpDCPais);
            step60Request.setDireccioncrearpagrMunicipioInstance(personaTCREARNATURALpDCMunicipio);
            step60Request.setDireccioncrearpagrDepartamentoInstance(personaTCREARNATURALpDCDepartamento);
            step60Request.setDireccioncrearpatrDireccionCompleta(personaTCREARNATURALpDCDireccionCompleta);
            step60Request.setDireccioncrearpatrRural(personaTCREARNATURALpDCRural);
            direccionSrv.crearImplementation(step60Request);
        }

        /* Action 7: IF (drvVieneDeCORE = true) */
        boolean ifCondition7 = instance.getPersonadrvVieneDeCORE().equals(true);
        if (ifCondition7) {
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARDOCIDENTIFICACIONRequest step70Request = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARDOCIDENTIFICACIONRequest();
            step70Request.setPersonaTCREARDOCIDENTIFICACIONpthisPersonaInstance(instance);
            step70Request.setPersonaTCREARDOCIDENTIFICACIONptDatosDocumento(userFunctionsSrv.fuGetIdDocIdentidadEnGestorFun(personaTCREARNATURALptpatrNumIdentificacion, personaTCREARNATURALptSolicitud.getAesolicitudes().getAesolicitudesNumerosolicitud()));
            step70Request.setPersonaTCREARDOCIDENTIFICACIONptSolicitudInstance(personaTCREARNATURALptSolicitud);
            personaSrv.tCREARDOCIDENTIFICACIONImplementation(step70Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: TCREARJURIDICA

    /*
     * Entry point for service TCREARJURIDICA
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARJURIDICA(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARJURIDICARequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tCREARJURIDICATxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARJURIDICA
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARJURIDICATxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARJURIDICARequest request) throws ModelException {
        request.setPersonaTCREARJURIDICAptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonaTCREARJURIDICAptpagrTipoIdentificacion()));
        request.setPersonaTCREARJURIDICAptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTCREARJURIDICAptpagrPais()));
        request.setPersonaTCREARJURIDICAptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARJURIDICAptpagrDepartamento()));
        request.setPersonaTCREARJURIDICAptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARJURIDICAptpagrMunicipio()));
        return personaSrv.tCREARJURIDICAImplementation(request);
    }

    /*
     * Implements service TCREARJURIDICA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARJURIDICAImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARJURIDICARequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion personaTCREARJURIDICAptpagrTipoIdentificacion = request.getPersonaTCREARJURIDICAptpagrTipoIdentificacionInstance();
        String personaTCREARJURIDICAptpatrNumIdentificacion = request.getPersonaTCREARJURIDICAptpatrNumIdentificacion();
        String personaTCREARJURIDICAptpatrRazonSocial = request.getPersonaTCREARJURIDICAptpatrRazonSocial();
        Boolean personaTCREARJURIDICAptpatrIndicadorExtranjero = request.getPersonaTCREARJURIDICAptpatrIndicadorExtranjero();
        String personaTCREARJURIDICAptpatrTelefonoFijo = request.getPersonaTCREARJURIDICAptpatrTelefonoFijo();
        String personaTCREARJURIDICAptpatrTelefonoCelular = request.getPersonaTCREARJURIDICAptpatrTelefonoCelular();
        String personaTCREARJURIDICAptpatrCorreoElectronico = request.getPersonaTCREARJURIDICAptpatrCorreoElectronico();
        String personaTCREARJURIDICAptpatrDireccionCompleta = request.getPersonaTCREARJURIDICAptpatrDireccionCompleta();
        Municipio personaTCREARJURIDICAptpagrMunicipio = request.getPersonaTCREARJURIDICAptpagrMunicipioInstance();
        Departamento personaTCREARJURIDICAptpagrDepartamento = request.getPersonaTCREARJURIDICAptpagrDepartamentoInstance();
        Pais personaTCREARJURIDICAptpagrPais = request.getPersonaTCREARJURIDICAptpagrPaisInstance();
        Boolean personaTCREARJURIDICAptpatrRural = request.getPersonaTCREARJURIDICAptpatrRural();

        request.checkArguments();
        Persona instance;

        com.keralty.aepersonas.viewmodel.persona.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.persona.siu.CrearRequest();
        step1Request.setPersonacrearpagrDepartamentoNacimientoInstance(null);
        step1Request.setPersonacrearpagrMunicipioNacimientoInstance(null);
        step1Request.setPersonacrearpagrEstadoCivilInstance(null);
        step1Request.setPersonacrearpagrEstadoPersonaInstance(null);
        step1Request.setPersonacrearpagrTipoIdentificacionInstance(personaTCREARJURIDICAptpagrTipoIdentificacion);
        step1Request.setPersonacrearpatrNumIdentificacion(personaTCREARJURIDICAptpatrNumIdentificacion);
        step1Request.setPersonacrearpatrTipoPersona("J");
        step1Request.setPersonacrearpatrPrimerNombre(null);
        step1Request.setPersonacrearpatrSegundoNombre(null);
        step1Request.setPersonacrearpatrPrimerApellido(null);
        step1Request.setPersonacrearpatrSegundoApellido(null);
        step1Request.setPersonacrearpatrRazonSocial(personaTCREARJURIDICAptpatrRazonSocial);
        step1Request.setPersonacrearpatrFechaNacimiento(null);
        step1Request.setPersonacrearpatrGenero(null);
        step1Request.setPersonacrearpatrIndicadorExtranjero(personaTCREARJURIDICAptpatrIndicadorExtranjero);
        step1Request.setPersonacrearpatrTelefonoFijo(personaTCREARJURIDICAptpatrTelefonoFijo);
        step1Request.setPersonacrearpatrTelefonoCelular(personaTCREARJURIDICAptpatrTelefonoCelular);
        step1Request.setPersonacrearpatrCorreoElectronico(personaTCREARJURIDICAptpatrCorreoElectronico);
        instance = (Persona) personaSrv.crearImplementation(step1Request).getInstance();

        boolean guard2 = personaTCREARJURIDICAptpatrDireccionCompleta != null;

        if (guard2) {
            com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest step2Request = new com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest();
            step2Request.setDireccionTCREARptpagrPersonaInstance(instance);
            step2Request.setDireccionTCREARptpagrContratoInstance(null);
            step2Request.setDireccionTCREARptpagrTitularInstance(null);
            step2Request.setDireccionTCREARptpagrTipoDireccionInstance(userFunctionsSrv.fugetTipoDirCorrespondenciaFun());
            step2Request.setDireccionTCREARptpagrMunicipioInstance(personaTCREARJURIDICAptpagrMunicipio);
            step2Request.setDireccionTCREARptpagrDepartamentoInstance(personaTCREARJURIDICAptpagrDepartamento);
            step2Request.setDireccionTCREARptpagrPaisInstance(personaTCREARJURIDICAptpagrPais);
            step2Request.setDireccionTCREARptpatrDireccionCompleta(personaTCREARJURIDICAptpatrDireccionCompleta);
            step2Request.setDireccionTCREARptpatrRural(personaTCREARJURIDICAptpatrRural);
            direccionSrv.tCREARImplementation(step2Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: TCREARCONTRATANTE

    /*
     * Entry point for service TCREARCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTEResponse tCREARCONTRATANTE(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTERequest request) {
        com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTEResponse response = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTEResponse();
        try {
            response = personaSrv.tCREARCONTRATANTETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTEResponse tCREARCONTRATANTETxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTERequest request) throws ModelException, SystemException {
        request.setPersonaTCREARCONTRATANTEptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptpagrTipoIdentificacion()));
        request.setPersonaTCREARCONTRATANTEptpagrDepartamentoNacimientoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptpagrDepartamentoNacimiento()));
        request.setPersonaTCREARCONTRATANTEptpagrMunicipioNacimientoInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptpagrMunicipioNacimiento()));
        request.setPersonaTCREARCONTRATANTEptpagrEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptpagrEstadoCivil()));
        request.setPersonaTCREARCONTRATANTEptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptpagrDepartamento()));
        request.setPersonaTCREARCONTRATANTEptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptpagrMunicipio()));
        request.setPersonaTCREARCONTRATANTEptTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptTipoDireccion()));
        request.setPersonaTCREARCONTRATANTEptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptpagrPais()));
        request.setPersonaTCREARCONTRATANTEpDCDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEpDCDepartamento()));
        request.setPersonaTCREARCONTRATANTEpDCMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEpDCMunicipio()));
        request.setPersonaTCREARCONTRATANTEpDCTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEpDCTipoDireccion()));
        request.setPersonaTCREARCONTRATANTEpDCPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEpDCPais()));
        request.setPersonaTCREARCONTRATANTEptEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptEstadoPersona()));
        request.setPersonaTCREARCONTRATANTEptSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaTCREARCONTRATANTEptSolicitud()));
        return personaSrv.tCREARCONTRATANTEImplementation(request);
    }

    /*
     * Implements service TCREARCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTEResponse tCREARCONTRATANTEImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTERequest request) throws ModelException, SystemException {
        com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTEResponse response = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARCONTRATANTEResponse();
        TipoIdentificacion personaTCREARCONTRATANTEptpagrTipoIdentificacion = request.getPersonaTCREARCONTRATANTEptpagrTipoIdentificacionInstance();
        String personaTCREARCONTRATANTEptpatrNumIdentificacion = request.getPersonaTCREARCONTRATANTEptpatrNumIdentificacion();
        String personaTCREARCONTRATANTEptpatrRazonSocial = request.getPersonaTCREARCONTRATANTEptpatrRazonSocial();
        Boolean personaTCREARCONTRATANTEptpatrIndicadorExtranjero = request.getPersonaTCREARCONTRATANTEptpatrIndicadorExtranjero();
        String personaTCREARCONTRATANTEptpatrTelefonoFijo = request.getPersonaTCREARCONTRATANTEptpatrTelefonoFijo();
        String personaTCREARCONTRATANTEptpatrTelefonoCelular = request.getPersonaTCREARCONTRATANTEptpatrTelefonoCelular();
        String personaTCREARCONTRATANTEptpatrCorreoElectronico = request.getPersonaTCREARCONTRATANTEptpatrCorreoElectronico();
        Pais personaTCREARCONTRATANTEptpagrPais = request.getPersonaTCREARCONTRATANTEptpagrPaisInstance();
        Departamento personaTCREARCONTRATANTEptpagrDepartamento = request.getPersonaTCREARCONTRATANTEptpagrDepartamentoInstance();
        Municipio personaTCREARCONTRATANTEptpagrMunicipio = request.getPersonaTCREARCONTRATANTEptpagrMunicipioInstance();
        String personaTCREARCONTRATANTEptpatrDireccionCompleta = request.getPersonaTCREARCONTRATANTEptpatrDireccionCompleta();
        Boolean personaTCREARCONTRATANTEptpatrRural = request.getPersonaTCREARCONTRATANTEptpatrRural();
        Departamento personaTCREARCONTRATANTEptpagrDepartamentoNacimiento = request.getPersonaTCREARCONTRATANTEptpagrDepartamentoNacimientoInstance();
        Municipio personaTCREARCONTRATANTEptpagrMunicipioNacimiento = request.getPersonaTCREARCONTRATANTEptpagrMunicipioNacimientoInstance();
        EstadoCivil personaTCREARCONTRATANTEptpagrEstadoCivil = request.getPersonaTCREARCONTRATANTEptpagrEstadoCivilInstance();
        String personaTCREARCONTRATANTEptpatrPrimerNombre = request.getPersonaTCREARCONTRATANTEptpatrPrimerNombre();
        String personaTCREARCONTRATANTEptpatrSegundoNombre = request.getPersonaTCREARCONTRATANTEptpatrSegundoNombre();
        String personaTCREARCONTRATANTEptpatrPrimerApellido = request.getPersonaTCREARCONTRATANTEptpatrPrimerApellido();
        String personaTCREARCONTRATANTEptpatrSegundoApellido = request.getPersonaTCREARCONTRATANTEptpatrSegundoApellido();
        Date personaTCREARCONTRATANTEptpatrFechaNacimiento = request.getPersonaTCREARCONTRATANTEptpatrFechaNacimiento();
        String personaTCREARCONTRATANTEptpatrGenero = request.getPersonaTCREARCONTRATANTEptpatrGenero();
        TipoDireccion personaTCREARCONTRATANTEptTipoDireccion = request.getPersonaTCREARCONTRATANTEptTipoDireccionInstance();
        Long personaTCREARCONTRATANTEptpCodigo = request.getPersonaTCREARCONTRATANTEptpCodigo();
        String personaTCREARCONTRATANTEpDCDireccionCompleta = request.getPersonaTCREARCONTRATANTEpDCDireccionCompleta();
        Departamento personaTCREARCONTRATANTEpDCDepartamento = request.getPersonaTCREARCONTRATANTEpDCDepartamentoInstance();
        Municipio personaTCREARCONTRATANTEpDCMunicipio = request.getPersonaTCREARCONTRATANTEpDCMunicipioInstance();
        Boolean personaTCREARCONTRATANTEpDCRural = request.getPersonaTCREARCONTRATANTEpDCRural();
        String personaTCREARCONTRATANTEpDCTelefonoFijo = request.getPersonaTCREARCONTRATANTEpDCTelefonoFijo();
        String personaTCREARCONTRATANTEpDCTelefonoCelular = request.getPersonaTCREARCONTRATANTEpDCTelefonoCelular();
        TipoDireccion personaTCREARCONTRATANTEpDCTipoDireccion = request.getPersonaTCREARCONTRATANTEpDCTipoDireccionInstance();
        Pais personaTCREARCONTRATANTEpDCPais = request.getPersonaTCREARCONTRATANTEpDCPaisInstance();
        Boolean personaTCREARCONTRATANTEptValidarDatos = request.getPersonaTCREARCONTRATANTEptValidarDatos();
        EstadoPersona personaTCREARCONTRATANTEptEstadoPersona = request.getPersonaTCREARCONTRATANTEptEstadoPersonaInstance();
        Solicitud personaTCREARCONTRATANTEptSolicitud = request.getPersonaTCREARCONTRATANTEptSolicitudInstance();
        Boolean personaTCREARCONTRATANTEptpTieneEPSSanitas = request.getPersonaTCREARCONTRATANTEptpTieneEPSSanitas();
        String personaTCREARCONTRATANTEptpRechazadoAfiliacion = request.getPersonaTCREARCONTRATANTEptpRechazadoAfiliacion();

        request.checkArguments();
        Persona instance;

        /* Action 1: IF (ptpagrTipoIdentificacion.NIT = true) */
        boolean ifCondition1 = personaTCREARCONTRATANTEptpagrTipoIdentificacion.getTipoIdentificacionNIT().equals(true);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARJURIDICARequest step10Request = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARJURIDICARequest();
            step10Request.setPersonaTCREARJURIDICAptpagrTipoIdentificacionInstance(personaTCREARCONTRATANTEptpagrTipoIdentificacion);
            step10Request.setPersonaTCREARJURIDICAptpatrNumIdentificacion(personaTCREARCONTRATANTEptpatrNumIdentificacion);
            step10Request.setPersonaTCREARJURIDICAptpatrRazonSocial(personaTCREARCONTRATANTEptpatrRazonSocial);
            step10Request.setPersonaTCREARJURIDICAptpatrIndicadorExtranjero(personaTCREARCONTRATANTEptpatrIndicadorExtranjero);
            step10Request.setPersonaTCREARJURIDICAptpatrTelefonoFijo(personaTCREARCONTRATANTEptpatrTelefonoFijo);
            step10Request.setPersonaTCREARJURIDICAptpatrTelefonoCelular(personaTCREARCONTRATANTEptpatrTelefonoCelular);
            step10Request.setPersonaTCREARJURIDICAptpatrCorreoElectronico(personaTCREARCONTRATANTEptpatrCorreoElectronico);
            step10Request.setPersonaTCREARJURIDICAptpagrPaisInstance(personaTCREARCONTRATANTEptpagrPais);
            step10Request.setPersonaTCREARJURIDICAptpagrDepartamentoInstance(personaTCREARCONTRATANTEptpagrDepartamento);
            step10Request.setPersonaTCREARJURIDICAptpagrMunicipioInstance(personaTCREARCONTRATANTEptpagrMunicipio);
            step10Request.setPersonaTCREARJURIDICAptpatrDireccionCompleta(personaTCREARCONTRATANTEptpatrDireccionCompleta);
            step10Request.setPersonaTCREARJURIDICAptpatrRural(personaTCREARCONTRATANTEptpatrRural);
            instance = (Persona) personaSrv.tCREARJURIDICAImplementation(step10Request).getInstance();
        } else {
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARNATURALRequest step11Request = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARNATURALRequest();
            step11Request.setPersonaTCREARNATURALptpagrTipoIdentificacionInstance(personaTCREARCONTRATANTEptpagrTipoIdentificacion);
            step11Request.setPersonaTCREARNATURALptpagrDepartamentoNacimientoInstance(personaTCREARCONTRATANTEptpagrDepartamentoNacimiento);
            step11Request.setPersonaTCREARNATURALptpagrMunicipioNacimientoInstance(personaTCREARCONTRATANTEptpagrMunicipioNacimiento);
            step11Request.setPersonaTCREARNATURALptpagrEstadoCivilInstance(personaTCREARCONTRATANTEptpagrEstadoCivil);
            step11Request.setPersonaTCREARNATURALptpatrNumIdentificacion(personaTCREARCONTRATANTEptpatrNumIdentificacion);
            step11Request.setPersonaTCREARNATURALptpatrPrimerNombre(personaTCREARCONTRATANTEptpatrPrimerNombre);
            step11Request.setPersonaTCREARNATURALptpatrSegundoNombre(personaTCREARCONTRATANTEptpatrSegundoNombre);
            step11Request.setPersonaTCREARNATURALptpatrPrimerApellido(personaTCREARCONTRATANTEptpatrPrimerApellido);
            step11Request.setPersonaTCREARNATURALptpatrSegundoApellido(personaTCREARCONTRATANTEptpatrSegundoApellido);
            step11Request.setPersonaTCREARNATURALptpatrFechaNacimiento(personaTCREARCONTRATANTEptpatrFechaNacimiento);
            step11Request.setPersonaTCREARNATURALptpatrGenero(personaTCREARCONTRATANTEptpatrGenero);
            step11Request.setPersonaTCREARNATURALptpatrIndicadorExtranjero(personaTCREARCONTRATANTEptpatrIndicadorExtranjero);
            step11Request.setPersonaTCREARNATURALptpatrTelefonoFijo(personaTCREARCONTRATANTEptpatrTelefonoFijo);
            step11Request.setPersonaTCREARNATURALptpatrTelefonoCelular(personaTCREARCONTRATANTEptpatrTelefonoCelular);
            step11Request.setPersonaTCREARNATURALptpatrCorreoElectronico(personaTCREARCONTRATANTEptpatrCorreoElectronico);
            step11Request.setPersonaTCREARNATURALptpagrPaisInstance(personaTCREARCONTRATANTEptpagrPais);
            step11Request.setPersonaTCREARNATURALptpagrDepartamentoInstance(personaTCREARCONTRATANTEptpagrDepartamento);
            step11Request.setPersonaTCREARNATURALptpagrMunicipioInstance(personaTCREARCONTRATANTEptpagrMunicipio);
            step11Request.setPersonaTCREARNATURALptpatrDireccionCompleta(personaTCREARCONTRATANTEptpatrDireccionCompleta);
            step11Request.setPersonaTCREARNATURALptpatrRural(personaTCREARCONTRATANTEptpatrRural);
            step11Request.setPersonaTCREARNATURALptTipoDireccionInstance(personaTCREARCONTRATANTEptTipoDireccion);
            step11Request.setPersonaTCREARNATURALpCodigo(personaTCREARCONTRATANTEptpCodigo);
            step11Request.setPersonaTCREARNATURALpDCDireccionCompleta(personaTCREARCONTRATANTEpDCDireccionCompleta);
            step11Request.setPersonaTCREARNATURALpDCDepartamentoInstance(personaTCREARCONTRATANTEpDCDepartamento);
            step11Request.setPersonaTCREARNATURALpDCMunicipioInstance(personaTCREARCONTRATANTEpDCMunicipio);
            step11Request.setPersonaTCREARNATURALpDCRural(personaTCREARCONTRATANTEpDCRural);
            step11Request.setPersonaTCREARNATURALpDCTelefonoFijo(personaTCREARCONTRATANTEpDCTelefonoFijo);
            step11Request.setPersonaTCREARNATURALpDCTelefonoCelular(personaTCREARCONTRATANTEpDCTelefonoCelular);
            step11Request.setPersonaTCREARNATURALpDCTipoDireccionInstance(personaTCREARCONTRATANTEpDCTipoDireccion);
            step11Request.setPersonaTCREARNATURALpDCPaisInstance(personaTCREARCONTRATANTEpDCPais);
            step11Request.setPersonaTCREARNATURALptValidarDatos(personaTCREARCONTRATANTEptValidarDatos);
            step11Request.setPersonaTCREARNATURALptEstadoPersonaInstance(personaTCREARCONTRATANTEptEstadoPersona);
            step11Request.setPersonaTCREARNATURALptSolicitudInstance(personaTCREARCONTRATANTEptSolicitud);
            instance = (Persona) personaSrv.tCREARNATURALImplementation(step11Request).getInstance();
        }

        com.keralty.aepersonas.viewmodel.persona.siu.RegistrarDatosCORERequest step2Request = new com.keralty.aepersonas.viewmodel.persona.siu.RegistrarDatosCORERequest();
        step2Request.setPersonaregistrarDatosCOREpthisPersonaInstance(instance);
        step2Request.setPersonaregistrarDatosCOREpCodigo(personaTCREARCONTRATANTEptpCodigo);
        step2Request.setPersonaregistrarDatosCOREpTieneEPSSanitas(personaTCREARCONTRATANTEptpTieneEPSSanitas);
        step2Request.setPersonaregistrarDatosCOREpRechazadoAfiliacion(personaTCREARCONTRATANTEptpRechazadoAfiliacion);
        personaSrv.registrarDatosCOREImplementation(step2Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        // Value expressions for outgoing argument 'personaTCREARCONTRATANTEpsPersona'
        // DEFAULT  : THIS
        response.setPersonaTCREARCONTRATANTEpsPersonaInstance(instance);


        return response;
    }

    // Service: TMODCONTRATANTE

    /*
     * Entry point for service TMODCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tMODCONTRATANTE(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODCONTRATANTERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tMODCONTRATANTETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TMODCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tMODCONTRATANTETxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODCONTRATANTERequest request) throws ModelException, SystemException {
        request.setPersonaTMODCONTRATANTEpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEpthisPersona()));
        request.setPersonaTMODCONTRATANTEptpevcDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEptpevcDepartamentoNac()));
        request.setPersonaTMODCONTRATANTEptpevcMunicipioNacInstance(municipioSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEptpevcMunicipioNac()));
        request.setPersonaTMODCONTRATANTEptpevcEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEptpevcEstadoCivil()));
        request.setPersonaTMODCONTRATANTEptpevcTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEptpevcTipoDireccion()));
        request.setPersonaTMODCONTRATANTEptpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEptpevcDepartamento()));
        request.setPersonaTMODCONTRATANTEptpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEptpevcMunicipio()));
        request.setPersonaTMODCONTRATANTEptpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEptpevcTipoIdentificacion()));
        request.setPersonaTMODCONTRATANTEpDCDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEpDCDepartamento()));
        request.setPersonaTMODCONTRATANTEpDCMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEpDCMunicipio()));
        request.setPersonaTMODCONTRATANTEpDCTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEpDCTipoDireccion()));
        request.setPersonaTMODCONTRATANTEptEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEptEstadoPersona()));
        request.setPersonaTMODCONTRATANTEptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTMODCONTRATANTEptpagrPais()));
        return personaSrv.tMODCONTRATANTEImplementation(request);
    }

    /*
     * Implements service TMODCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tMODCONTRATANTEImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODCONTRATANTERequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Long personaTMODCONTRATANTEptpCodigo = request.getPersonaTMODCONTRATANTEptpCodigo();
        TipoIdentificacion personaTMODCONTRATANTEptpevcTipoIdentificacion = request.getPersonaTMODCONTRATANTEptpevcTipoIdentificacionInstance();
        String personaTMODCONTRATANTEptpNumIdentificacion = request.getPersonaTMODCONTRATANTEptpNumIdentificacion();
        String personaTMODCONTRATANTEptpPrimerNombre = request.getPersonaTMODCONTRATANTEptpPrimerNombre();
        String personaTMODCONTRATANTEptpSegundoNombre = request.getPersonaTMODCONTRATANTEptpSegundoNombre();
        String personaTMODCONTRATANTEptpPrimerApellido = request.getPersonaTMODCONTRATANTEptpPrimerApellido();
        String personaTMODCONTRATANTEptpSegundoApellido = request.getPersonaTMODCONTRATANTEptpSegundoApellido();
        Date personaTMODCONTRATANTEptpFechaNacimiento = request.getPersonaTMODCONTRATANTEptpFechaNacimiento();
        String personaTMODCONTRATANTEptpGenero = request.getPersonaTMODCONTRATANTEptpGenero();
        Boolean personaTMODCONTRATANTEptpIndicadorExtranjero = request.getPersonaTMODCONTRATANTEptpIndicadorExtranjero();
        Departamento personaTMODCONTRATANTEptpevcDepartamentoNac = request.getPersonaTMODCONTRATANTEptpevcDepartamentoNacInstance();
        Municipio personaTMODCONTRATANTEptpevcMunicipioNac = request.getPersonaTMODCONTRATANTEptpevcMunicipioNacInstance();
        String personaTMODCONTRATANTEpatrRazonSocial = request.getPersonaTMODCONTRATANTEpatrRazonSocial();
        String personaTMODCONTRATANTEptpTelefonoFijo = request.getPersonaTMODCONTRATANTEptpTelefonoFijo();
        String personaTMODCONTRATANTEptpTelefonoCelular = request.getPersonaTMODCONTRATANTEptpTelefonoCelular();
        String personaTMODCONTRATANTEptpCorreoElectronico = request.getPersonaTMODCONTRATANTEptpCorreoElectronico();
        Boolean personaTMODCONTRATANTEptpTieneEPSSanitas = request.getPersonaTMODCONTRATANTEptpTieneEPSSanitas();
        String personaTMODCONTRATANTEptpRechazadoAfiliacion = request.getPersonaTMODCONTRATANTEptpRechazadoAfiliacion();
        EstadoPersona personaTMODCONTRATANTEptEstadoPersona = request.getPersonaTMODCONTRATANTEptEstadoPersonaInstance();
        Boolean personaTMODCONTRATANTEptValidarDatos = request.getPersonaTMODCONTRATANTEptValidarDatos();
        EstadoCivil personaTMODCONTRATANTEptpevcEstadoCivil = request.getPersonaTMODCONTRATANTEptpevcEstadoCivilInstance();
        String personaTMODCONTRATANTEptpDireccionCompleta = request.getPersonaTMODCONTRATANTEptpDireccionCompleta();
        Boolean personaTMODCONTRATANTEptpRural = request.getPersonaTMODCONTRATANTEptpRural();
        Departamento personaTMODCONTRATANTEptpevcDepartamento = request.getPersonaTMODCONTRATANTEptpevcDepartamentoInstance();
        Municipio personaTMODCONTRATANTEptpevcMunicipio = request.getPersonaTMODCONTRATANTEptpevcMunicipioInstance();
        String personaTMODCONTRATANTEpDCDireccionCompleta = request.getPersonaTMODCONTRATANTEpDCDireccionCompleta();
        Departamento personaTMODCONTRATANTEpDCDepartamento = request.getPersonaTMODCONTRATANTEpDCDepartamentoInstance();
        Municipio personaTMODCONTRATANTEpDCMunicipio = request.getPersonaTMODCONTRATANTEpDCMunicipioInstance();
        Boolean personaTMODCONTRATANTEpDCRural = request.getPersonaTMODCONTRATANTEpDCRural();
        Pais personaTMODCONTRATANTEptpagrPais = request.getPersonaTMODCONTRATANTEptpagrPaisInstance();
        Persona personaTMODCONTRATANTEpthisPersona = request.getPersonaTMODCONTRATANTEpthisPersonaInstance();

        request.checkArguments();
        Persona instance = personaTMODCONTRATANTEpthisPersona;

        /* Action 1: IF (ptpCodigo <> NULL AND ptpevcTipoIdentificacion = TipoIdentificacion AND ptpNumIdentificacion = NumIdentificacion AND (ptpPrimerNombre <> PrimerNombre OR ptpSegundoNombre <> SegundoNombre OR ptpPrimerApellido <> PrimerApellido OR ptpSegundoApellido <> SegundoApellido OR ptpFechaNacimiento <> FechaNacimiento OR ptpGenero <> Genero OR ptpIndicadorExtranjero <> IndicadorExtranjero OR (ptpevcDepartamentoNac = NULL AND EXIST (DepartamentoNacimiento) = true) OR (ptpevcDepartamentoNac <> NULL AND EXIST (DepartamentoNacimiento) = false) OR (ptpevcDepartamentoNac <> NULL AND EXIST (DepartamentoNacimiento) = true AND ptpevcDepartamentoNac <> DepartamentoNacimiento) OR (ptpevcMunicipioNac = NULL AND EXIST (MunicipioNacimiento) = true) OR (ptpevcMunicipioNac <> NULL AND EXIST (MunicipioNacimiento) = false) OR (ptpevcMunicipioNac <> NULL AND EXIST (MunicipioNacimiento) = true AND ptpevcMunicipioNac <> MunicipioNacimiento))) */
        boolean ifCondition1 = personaTMODCONTRATANTEptpCodigo != null && personaTMODCONTRATANTEptpevcTipoIdentificacion.equalsObject(personaTMODCONTRATANTEpthisPersona.getTipoIdentificacion()) && (personaTMODCONTRATANTEptpNumIdentificacion).equals(personaTMODCONTRATANTEpthisPersona.getPersonaNumIdentificacion()) && (!STDFunctions.areEqual(personaTMODCONTRATANTEptpPrimerNombre,personaTMODCONTRATANTEpthisPersona.getPersonaPrimerNombre()) || !STDFunctions.areEqual(personaTMODCONTRATANTEptpSegundoNombre,personaTMODCONTRATANTEpthisPersona.getPersonaSegundoNombre()) || !STDFunctions.areEqual(personaTMODCONTRATANTEptpPrimerApellido,personaTMODCONTRATANTEpthisPersona.getPersonaPrimerApellido()) || !STDFunctions.areEqual(personaTMODCONTRATANTEptpSegundoApellido,personaTMODCONTRATANTEpthisPersona.getPersonaSegundoApellido()) || !STDFunctions.areEqual(personaTMODCONTRATANTEptpFechaNacimiento,personaTMODCONTRATANTEpthisPersona.getPersonaFechaNacimiento()) || !STDFunctions.areEqual(personaTMODCONTRATANTEptpGenero,personaTMODCONTRATANTEpthisPersona.getPersonaGenero()) || !STDFunctions.areEqual(personaTMODCONTRATANTEptpIndicadorExtranjero,personaTMODCONTRATANTEpthisPersona.getPersonaIndicadorExtranjero()) || ((personaTMODCONTRATANTEptpevcDepartamentoNac == null || personaTMODCONTRATANTEptpevcDepartamentoNac.isNull()) && repository.assocOperator024(personaTMODCONTRATANTEpthisPersona).equals(true)) || ((personaTMODCONTRATANTEptpevcDepartamentoNac != null && !personaTMODCONTRATANTEptpevcDepartamentoNac.isNull()) && repository.assocOperator025(personaTMODCONTRATANTEpthisPersona).equals(false)) || ((personaTMODCONTRATANTEptpevcDepartamentoNac != null && !personaTMODCONTRATANTEptpevcDepartamentoNac.isNull()) && repository.assocOperator026(personaTMODCONTRATANTEpthisPersona).equals(true) && !(personaTMODCONTRATANTEptpevcDepartamentoNac.equalsObject(personaTMODCONTRATANTEpthisPersona.getDepartamentoNacimiento()))) || ((personaTMODCONTRATANTEptpevcMunicipioNac == null || personaTMODCONTRATANTEptpevcMunicipioNac.isNull()) && repository.assocOperator027(personaTMODCONTRATANTEpthisPersona).equals(true)) || ((personaTMODCONTRATANTEptpevcMunicipioNac != null && !personaTMODCONTRATANTEptpevcMunicipioNac.isNull()) && repository.assocOperator028(personaTMODCONTRATANTEpthisPersona).equals(false)) || ((personaTMODCONTRATANTEptpevcMunicipioNac != null && !personaTMODCONTRATANTEptpevcMunicipioNac.isNull()) && repository.assocOperator029(personaTMODCONTRATANTEpthisPersona).equals(true) && !(personaTMODCONTRATANTEptpevcMunicipioNac.equalsObject(personaTMODCONTRATANTEpthisPersona.getMunicipioNacimiento()))));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.persona.siu.MarcarDatosBasicosModRequest step1000Request = new com.keralty.aepersonas.viewmodel.persona.siu.MarcarDatosBasicosModRequest();
            step1000Request.setPersonamarcarDatosBasicosModpthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step1000Request.setPersonamarcarDatosBasicosModpModificados(Boolean.TRUE);
            personaSrv.marcarDatosBasicosModImplementation(step1000Request);
        }

        com.keralty.aepersonas.viewmodel.persona.siu.ModificarRequest step2Request = new com.keralty.aepersonas.viewmodel.persona.siu.ModificarRequest();
        step2Request.setPersonamodificarpthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
        step2Request.setPersonamodificarpPrimerNombre(personaTMODCONTRATANTEptpPrimerNombre);
        step2Request.setPersonamodificarpSegundoNombre(personaTMODCONTRATANTEptpSegundoNombre);
        step2Request.setPersonamodificarpPrimerApellido(personaTMODCONTRATANTEptpPrimerApellido);
        step2Request.setPersonamodificarpSegundoApellido(personaTMODCONTRATANTEptpSegundoApellido);
        step2Request.setPersonamodificarpRazonSocial(personaTMODCONTRATANTEpatrRazonSocial);
        step2Request.setPersonamodificarpFechaNacimiento(personaTMODCONTRATANTEptpFechaNacimiento);
        step2Request.setPersonamodificarpGenero(personaTMODCONTRATANTEptpGenero);
        step2Request.setPersonamodificarpIndicadorExtranjero(personaTMODCONTRATANTEptpIndicadorExtranjero);
        step2Request.setPersonamodificarpTelefonoFijo(personaTMODCONTRATANTEptpTelefonoFijo);
        step2Request.setPersonamodificarpTelefonoCelular(personaTMODCONTRATANTEptpTelefonoCelular);
        step2Request.setPersonamodificarpCorreoElectronico(personaTMODCONTRATANTEptpCorreoElectronico);
        step2Request.setPersonamodificarpTieneEPSSanitas(personaTMODCONTRATANTEptpTieneEPSSanitas);
        step2Request.setPersonamodificarpRechazadoAfiliacion(personaTMODCONTRATANTEptpRechazadoAfiliacion);
        step2Request.setPersonamodificarpNumIdentificacion(personaTMODCONTRATANTEptpNumIdentificacion);
        personaSrv.modificarImplementation(step2Request);

        com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest step3Request = new com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest();
        step3Request.setPersonaindicarCodigoCOREpthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
        step3Request.setPersonaindicarCodigoCOREpCodigo(personaTMODCONTRATANTEptpCodigo);
        personaSrv.indicarCodigoCOREImplementation(step3Request);

        /* Action 4: IF (EXIST (EstadoPersona) = false) */
        boolean ifCondition4 = repository.assocOperator030(personaTMODCONTRATANTEpthisPersona).equals(false);
        if (ifCondition4) {
            /* Action 40: IF (ptEstadoPersona <> NULL) */
            boolean ifCondition40 = (personaTMODCONTRATANTEptEstadoPersona != null && !personaTMODCONTRATANTEptEstadoPersona.isNull());
            if (ifCondition40) {
                com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest step400Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest();
                step400Request.setPersonaInsEstadoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
                step400Request.setPersonaInsEstadoPersonapevcEstadoPersonaInstance(personaTMODCONTRATANTEptEstadoPersona);
                personaSrv.insEstadoPersonaImplementation(step400Request, true);
            }
        } else {
            /* Action 41: IF (ptEstadoPersona <> NULL) */
            boolean ifCondition41 = (personaTMODCONTRATANTEptEstadoPersona != null && !personaTMODCONTRATANTEptEstadoPersona.isNull());
            if (ifCondition41) {
                /* Action 410: IF (ptEstadoPersona <> EstadoPersona) */
                boolean ifCondition410 = !(personaTMODCONTRATANTEptEstadoPersona.equalsObject(personaTMODCONTRATANTEpthisPersona.getEstadoPersona()));
                if (ifCondition410) {
                    com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest step4100Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest();
                    step4100Request.setPersonaDelEstadoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
                    step4100Request.setPersonaDelEstadoPersonapevcEstadoPersonaInstance(personaTMODCONTRATANTEpthisPersona.getEstadoPersona());
                    personaSrv.delEstadoPersonaImplementation(step4100Request, true);
                    com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest step4101Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest();
                    step4101Request.setPersonaInsEstadoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
                    step4101Request.setPersonaInsEstadoPersonapevcEstadoPersonaInstance(personaTMODCONTRATANTEptEstadoPersona);
                    personaSrv.insEstadoPersonaImplementation(step4101Request, true);
                }
            } else {
                com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest step411Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest();
                step411Request.setPersonaDelEstadoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
                step411Request.setPersonaDelEstadoPersonapevcEstadoPersonaInstance(personaTMODCONTRATANTEpthisPersona.getEstadoPersona());
                personaSrv.delEstadoPersonaImplementation(step411Request, true);
            }
        }

        boolean guard5 = !(personaTMODCONTRATANTEptpevcTipoIdentificacion.equalsObject(personaTMODCONTRATANTEpthisPersona.getTipoIdentificacion()));

        if (guard5) {
            com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest step5Request = new com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest();
            step5Request.setPersonaCambTipoIdentificacionpthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step5Request.setPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance(personaTMODCONTRATANTEptpevcTipoIdentificacion);
            personaSrv.cambTipoIdentificacionImplementation(step5Request, true);
        }

        /* Action 6: IF (ptValidarDatos = true) */
        boolean ifCondition6 = personaTMODCONTRATANTEptValidarDatos.equals(true);
        if (ifCondition6) {
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest step60Request = new com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest();
            step60Request.setPersonavalidarDatosRestrictivapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            personaSrv.validarDatosRestrictivaImplementation(step60Request);
        }

        /* Action 7: IF (drvVieneDeCORE = false) */
        boolean ifCondition7 = personaTMODCONTRATANTEpthisPersona.getPersonadrvVieneDeCORE().equals(false);
        if (ifCondition7) {
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest step70Request = new com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest();
            step70Request.setPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            personaSrv.validarDatosRestrictivaTipoIdImplementation(step70Request);
        }

        boolean guard8 = repository.assocOperator015(personaTMODCONTRATANTEpthisPersona).equals(false) && (personaTMODCONTRATANTEptpevcDepartamentoNac != null && !personaTMODCONTRATANTEptpevcDepartamentoNac.isNull());

        if (guard8) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest step8Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest();
            step8Request.setPersonaInsDptoNacimientoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step8Request.setPersonaInsDptoNacimientoPersonapevcDepartamentoInstance(personaTMODCONTRATANTEptpevcDepartamentoNac);
            personaSrv.insDptoNacimientoPersonaImplementation(step8Request, true);
        }

        boolean guard9 = repository.assocOperator016(personaTMODCONTRATANTEpthisPersona).equals(true) && (personaTMODCONTRATANTEptpevcDepartamentoNac == null || personaTMODCONTRATANTEptpevcDepartamentoNac.isNull());

        if (guard9) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest step9Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest();
            step9Request.setPersonaDelDptoNacimientoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step9Request.setPersonaDelDptoNacimientoPersonapevcDepartamentoInstance(personaTMODCONTRATANTEpthisPersona.getDepartamentoNacimiento());
            personaSrv.delDptoNacimientoPersonaImplementation(step9Request, true);
        }

        /* Action 10: IF (EXIST (DepartamentoNacimiento) = true AND ptpevcDepartamentoNac <> NULL AND DepartamentoNacimiento <> ptpevcDepartamentoNac) */
        boolean ifCondition10 = repository.assocOperator031(personaTMODCONTRATANTEpthisPersona).equals(true) && (personaTMODCONTRATANTEptpevcDepartamentoNac != null && !personaTMODCONTRATANTEptpevcDepartamentoNac.isNull()) && !(personaTMODCONTRATANTEpthisPersona.getDepartamentoNacimiento().equalsObject(personaTMODCONTRATANTEptpevcDepartamentoNac));
        if (ifCondition10) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest step100Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest();
            step100Request.setPersonaDelDptoNacimientoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step100Request.setPersonaDelDptoNacimientoPersonapevcDepartamentoInstance(personaTMODCONTRATANTEpthisPersona.getDepartamentoNacimiento());
            personaSrv.delDptoNacimientoPersonaImplementation(step100Request, true);
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest step101Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest();
            step101Request.setPersonaInsDptoNacimientoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step101Request.setPersonaInsDptoNacimientoPersonapevcDepartamentoInstance(personaTMODCONTRATANTEptpevcDepartamentoNac);
            personaSrv.insDptoNacimientoPersonaImplementation(step101Request, true);
        }

        boolean guard11 = repository.assocOperator018(personaTMODCONTRATANTEpthisPersona).equals(false) && (personaTMODCONTRATANTEptpevcMunicipioNac != null && !personaTMODCONTRATANTEptpevcMunicipioNac.isNull());

        if (guard11) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest step11Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest();
            step11Request.setPersonaInsMunicipioNacimientoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step11Request.setPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODCONTRATANTEptpevcMunicipioNac);
            personaSrv.insMunicipioNacimientoPersonaImplementation(step11Request, true);
        }

        boolean guard12 = repository.assocOperator019(personaTMODCONTRATANTEpthisPersona).equals(true) && (personaTMODCONTRATANTEptpevcMunicipioNac == null || personaTMODCONTRATANTEptpevcMunicipioNac.isNull());

        if (guard12) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest step12Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest();
            step12Request.setPersonaDelMunicipioNacimientoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step12Request.setPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODCONTRATANTEpthisPersona.getMunicipioNacimiento());
            personaSrv.delMunicipioNacimientoPersonaImplementation(step12Request, true);
        }

        /* Action 13: IF (EXIST (MunicipioNacimiento) = true AND ptpevcMunicipioNac <> NULL AND MunicipioNacimiento <> ptpevcMunicipioNac) */
        boolean ifCondition13 = repository.assocOperator032(personaTMODCONTRATANTEpthisPersona).equals(true) && (personaTMODCONTRATANTEptpevcMunicipioNac != null && !personaTMODCONTRATANTEptpevcMunicipioNac.isNull()) && !(personaTMODCONTRATANTEpthisPersona.getMunicipioNacimiento().equalsObject(personaTMODCONTRATANTEptpevcMunicipioNac));
        if (ifCondition13) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest step130Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest();
            step130Request.setPersonaDelMunicipioNacimientoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step130Request.setPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODCONTRATANTEpthisPersona.getMunicipioNacimiento());
            personaSrv.delMunicipioNacimientoPersonaImplementation(step130Request, true);
            com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest step131Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest();
            step131Request.setPersonaInsMunicipioNacimientoPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step131Request.setPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODCONTRATANTEptpevcMunicipioNac);
            personaSrv.insMunicipioNacimientoPersonaImplementation(step131Request, true);
        }

        boolean guard14 = repository.assocOperator021(personaTMODCONTRATANTEpthisPersona).equals(false) && (personaTMODCONTRATANTEptpevcEstadoCivil != null && !personaTMODCONTRATANTEptpevcEstadoCivil.isNull());

        if (guard14) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest step14Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest();
            step14Request.setPersonaInsEstadoCivilPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step14Request.setPersonaInsEstadoCivilPersonapevcEstadoCivilInstance(personaTMODCONTRATANTEptpevcEstadoCivil);
            personaSrv.insEstadoCivilPersonaImplementation(step14Request, true);
        }

        boolean guard15 = repository.assocOperator022(personaTMODCONTRATANTEpthisPersona).equals(true) && (personaTMODCONTRATANTEptpevcEstadoCivil == null || personaTMODCONTRATANTEptpevcEstadoCivil.isNull());

        if (guard15) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest step15Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest();
            step15Request.setPersonaDelEstadoCivilPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step15Request.setPersonaDelEstadoCivilPersonapevcEstadoCivilInstance(personaTMODCONTRATANTEpthisPersona.getEstadoCivil());
            personaSrv.delEstadoCivilPersonaImplementation(step15Request, true);
        }

        /* Action 16: IF (EXIST (EstadoCivil) = true AND ptpevcEstadoCivil <> NULL AND EstadoCivil <> ptpevcEstadoCivil) */
        boolean ifCondition16 = repository.assocOperator033(personaTMODCONTRATANTEpthisPersona).equals(true) && (personaTMODCONTRATANTEptpevcEstadoCivil != null && !personaTMODCONTRATANTEptpevcEstadoCivil.isNull()) && !(personaTMODCONTRATANTEpthisPersona.getEstadoCivil().equalsObject(personaTMODCONTRATANTEptpevcEstadoCivil));
        if (ifCondition16) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest step160Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest();
            step160Request.setPersonaDelEstadoCivilPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step160Request.setPersonaDelEstadoCivilPersonapevcEstadoCivilInstance(personaTMODCONTRATANTEpthisPersona.getEstadoCivil());
            personaSrv.delEstadoCivilPersonaImplementation(step160Request, true);
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest step161Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest();
            step161Request.setPersonaInsEstadoCivilPersonapthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
            step161Request.setPersonaInsEstadoCivilPersonapevcEstadoCivilInstance(personaTMODCONTRATANTEptpevcEstadoCivil);
            personaSrv.insEstadoCivilPersonaImplementation(step161Request, true);
        }

        com.keralty.aepersonas.viewmodel.persona.siu.TMODDIRECCIONESRequest step17Request = new com.keralty.aepersonas.viewmodel.persona.siu.TMODDIRECCIONESRequest();
        step17Request.setPersonaTMODDIRECCIONESpthisPersonaInstance(personaTMODCONTRATANTEpthisPersona);
        step17Request.setPersonaTMODDIRECCIONESptpDireccionCompleta(personaTMODCONTRATANTEptpDireccionCompleta);
        step17Request.setPersonaTMODDIRECCIONESptpRural(personaTMODCONTRATANTEptpRural);
        step17Request.setPersonaTMODDIRECCIONESptpevcDepartamentoInstance(personaTMODCONTRATANTEptpevcDepartamento);
        step17Request.setPersonaTMODDIRECCIONESptpevcMunicipioInstance(personaTMODCONTRATANTEptpevcMunicipio);
        step17Request.setPersonaTMODDIRECCIONESpDCDireccionCompleta(personaTMODCONTRATANTEpDCDireccionCompleta);
        step17Request.setPersonaTMODDIRECCIONESpDCDepartamentoInstance(personaTMODCONTRATANTEpDCDepartamento);
        step17Request.setPersonaTMODDIRECCIONESpDCMunicipioInstance(personaTMODCONTRATANTEpDCMunicipio);
        step17Request.setPersonaTMODDIRECCIONESpDCRural(personaTMODCONTRATANTEpDCRural);
        step17Request.setPersonaTMODDIRECCIONESptpagrPaisInstance(personaTMODCONTRATANTEptpagrPais);
        step17Request.setPersonaTMODDIRECCIONESptpTelefonoFijo(personaTMODCONTRATANTEptpTelefonoFijo);
        step17Request.setPersonaTMODDIRECCIONESptpTelefonoCelular(personaTMODCONTRATANTEptpTelefonoCelular);
        personaSrv.tMODDIRECCIONESImplementation(step17Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
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
            com.keralty.aepersonas.viewmodel.persona.siu.TMODUSUARIORequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tMODUSUARIOTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.TMODUSUARIORequest request) throws ModelException, SystemException {
        request.setPersonaTMODUSUARIOpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaTMODUSUARIOpthisPersona()));
        request.setPersonaTMODUSUARIOptpevcDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTMODUSUARIOptpevcDepartamentoNac()));
        request.setPersonaTMODUSUARIOptpevcMunicipioNacInstance(municipioSrv.getByOIDWithHV(request.getPersonaTMODUSUARIOptpevcMunicipioNac()));
        request.setPersonaTMODUSUARIOptpevcEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaTMODUSUARIOptpevcEstadoCivil()));
        request.setPersonaTMODUSUARIOptpevcTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTMODUSUARIOptpevcTipoDireccion()));
        request.setPersonaTMODUSUARIOptpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTMODUSUARIOptpevcDepartamento()));
        request.setPersonaTMODUSUARIOptpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTMODUSUARIOptpevcMunicipio()));
        request.setPersonaTMODUSUARIOptpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonaTMODUSUARIOptpevcTipoIdentificacion()));
        request.setPersonaTMODUSUARIOptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTMODUSUARIOptpagrPais()));
        return personaSrv.tMODUSUARIOImplementation(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.TMODUSUARIORequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion personaTMODUSUARIOptpevcTipoIdentificacion = request.getPersonaTMODUSUARIOptpevcTipoIdentificacionInstance();
        String personaTMODUSUARIOptpNumIdentificacion = request.getPersonaTMODUSUARIOptpNumIdentificacion();
        String personaTMODUSUARIOptpPrimerNombre = request.getPersonaTMODUSUARIOptpPrimerNombre();
        String personaTMODUSUARIOptpSegundoNombre = request.getPersonaTMODUSUARIOptpSegundoNombre();
        String personaTMODUSUARIOptpPrimerApellido = request.getPersonaTMODUSUARIOptpPrimerApellido();
        String personaTMODUSUARIOptpSegundoApellido = request.getPersonaTMODUSUARIOptpSegundoApellido();
        Date personaTMODUSUARIOptpFechaNacimiento = request.getPersonaTMODUSUARIOptpFechaNacimiento();
        String personaTMODUSUARIOptpGenero = request.getPersonaTMODUSUARIOptpGenero();
        Boolean personaTMODUSUARIOptpIndicadorExtranjero = request.getPersonaTMODUSUARIOptpIndicadorExtranjero();
        Departamento personaTMODUSUARIOptpevcDepartamentoNac = request.getPersonaTMODUSUARIOptpevcDepartamentoNacInstance();
        Municipio personaTMODUSUARIOptpevcMunicipioNac = request.getPersonaTMODUSUARIOptpevcMunicipioNacInstance();
        String personaTMODUSUARIOptpTelefonoFijo = request.getPersonaTMODUSUARIOptpTelefonoFijo();
        String personaTMODUSUARIOptpTelefonoCelular = request.getPersonaTMODUSUARIOptpTelefonoCelular();
        String personaTMODUSUARIOptpCorreoElectronico = request.getPersonaTMODUSUARIOptpCorreoElectronico();
        EstadoCivil personaTMODUSUARIOptpevcEstadoCivil = request.getPersonaTMODUSUARIOptpevcEstadoCivilInstance();
        String personaTMODUSUARIOptpDireccionCompleta = request.getPersonaTMODUSUARIOptpDireccionCompleta();
        TipoDireccion personaTMODUSUARIOptpevcTipoDireccion = request.getPersonaTMODUSUARIOptpevcTipoDireccionInstance();
        Boolean personaTMODUSUARIOptpRural = request.getPersonaTMODUSUARIOptpRural();
        Departamento personaTMODUSUARIOptpevcDepartamento = request.getPersonaTMODUSUARIOptpevcDepartamentoInstance();
        Municipio personaTMODUSUARIOptpevcMunicipio = request.getPersonaTMODUSUARIOptpevcMunicipioInstance();
        Pais personaTMODUSUARIOptpagrPais = request.getPersonaTMODUSUARIOptpagrPaisInstance();
        Persona personaTMODUSUARIOpthisPersona = request.getPersonaTMODUSUARIOpthisPersonaInstance();

        request.checkArguments();

        tMODUSUARIOPreconditions(request);
        Persona instance = personaTMODUSUARIOpthisPersona;

        /* Action 1: IF (drvVieneDeCORE = true AND ptpevcTipoIdentificacion = TipoIdentificacion AND ptpNumIdentificacion = NumIdentificacion AND (ptpPrimerNombre <> PrimerNombre OR ptpSegundoNombre <> SegundoNombre OR ptpPrimerApellido <> PrimerApellido OR ptpSegundoApellido <> SegundoApellido OR ptpFechaNacimiento <> FechaNacimiento OR ptpGenero <> Genero OR ptpIndicadorExtranjero <> IndicadorExtranjero OR ptpevcDepartamentoNac <> DepartamentoNacimiento OR ptpevcMunicipioNac <> MunicipioNacimiento)) */
        boolean ifCondition1 = personaTMODUSUARIOpthisPersona.getPersonadrvVieneDeCORE().equals(true) && personaTMODUSUARIOptpevcTipoIdentificacion.equalsObject(personaTMODUSUARIOpthisPersona.getTipoIdentificacion()) && (personaTMODUSUARIOptpNumIdentificacion).equals(personaTMODUSUARIOpthisPersona.getPersonaNumIdentificacion()) && (!STDFunctions.areEqual(personaTMODUSUARIOptpPrimerNombre,personaTMODUSUARIOpthisPersona.getPersonaPrimerNombre()) || !STDFunctions.areEqual(personaTMODUSUARIOptpSegundoNombre,personaTMODUSUARIOpthisPersona.getPersonaSegundoNombre()) || !STDFunctions.areEqual(personaTMODUSUARIOptpPrimerApellido,personaTMODUSUARIOpthisPersona.getPersonaPrimerApellido()) || !STDFunctions.areEqual(personaTMODUSUARIOptpSegundoApellido,personaTMODUSUARIOpthisPersona.getPersonaSegundoApellido()) || !STDFunctions.areEqual(personaTMODUSUARIOptpFechaNacimiento,personaTMODUSUARIOpthisPersona.getPersonaFechaNacimiento()) || !STDFunctions.areEqual(personaTMODUSUARIOptpGenero,personaTMODUSUARIOpthisPersona.getPersonaGenero()) || !STDFunctions.areEqual(personaTMODUSUARIOptpIndicadorExtranjero,personaTMODUSUARIOpthisPersona.getPersonaIndicadorExtranjero()) || !(personaTMODUSUARIOptpevcDepartamentoNac.equalsObject(personaTMODUSUARIOpthisPersona.getDepartamentoNacimiento())) || !(personaTMODUSUARIOptpevcMunicipioNac.equalsObject(personaTMODUSUARIOpthisPersona.getMunicipioNacimiento())));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.persona.siu.MarcarDatosBasicosModRequest step1000Request = new com.keralty.aepersonas.viewmodel.persona.siu.MarcarDatosBasicosModRequest();
            step1000Request.setPersonamarcarDatosBasicosModpthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step1000Request.setPersonamarcarDatosBasicosModpModificados(Boolean.TRUE);
            personaSrv.marcarDatosBasicosModImplementation(step1000Request);
        }

        com.keralty.aepersonas.viewmodel.persona.siu.ModificarRequest step2Request = new com.keralty.aepersonas.viewmodel.persona.siu.ModificarRequest();
        step2Request.setPersonamodificarpthisPersonaInstance(personaTMODUSUARIOpthisPersona);
        step2Request.setPersonamodificarpPrimerNombre(personaTMODUSUARIOptpPrimerNombre);
        step2Request.setPersonamodificarpSegundoNombre(personaTMODUSUARIOptpSegundoNombre);
        step2Request.setPersonamodificarpPrimerApellido(personaTMODUSUARIOptpPrimerApellido);
        step2Request.setPersonamodificarpSegundoApellido(personaTMODUSUARIOptpSegundoApellido);
        step2Request.setPersonamodificarpRazonSocial(personaTMODUSUARIOpthisPersona.getPersonaRazonSocial());
        step2Request.setPersonamodificarpFechaNacimiento(personaTMODUSUARIOptpFechaNacimiento);
        step2Request.setPersonamodificarpGenero(personaTMODUSUARIOptpGenero);
        step2Request.setPersonamodificarpIndicadorExtranjero(personaTMODUSUARIOptpIndicadorExtranjero);
        step2Request.setPersonamodificarpTelefonoFijo(personaTMODUSUARIOptpTelefonoFijo);
        step2Request.setPersonamodificarpTelefonoCelular(personaTMODUSUARIOptpTelefonoCelular);
        step2Request.setPersonamodificarpCorreoElectronico(personaTMODUSUARIOptpCorreoElectronico);
        step2Request.setPersonamodificarpTieneEPSSanitas(personaTMODUSUARIOpthisPersona.getPersonaTieneEPSSanitas());
        step2Request.setPersonamodificarpRechazadoAfiliacion(personaTMODUSUARIOpthisPersona.getPersonaRechazadoAfiliacion());
        step2Request.setPersonamodificarpNumIdentificacion(personaTMODUSUARIOptpNumIdentificacion);
        personaSrv.modificarImplementation(step2Request);

        boolean guard3 = !(personaTMODUSUARIOptpevcTipoIdentificacion.equalsObject(personaTMODUSUARIOpthisPersona.getTipoIdentificacion()));

        if (guard3) {
            com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest step3Request = new com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest();
            step3Request.setPersonaCambTipoIdentificacionpthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step3Request.setPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance(personaTMODUSUARIOptpevcTipoIdentificacion);
            personaSrv.cambTipoIdentificacionImplementation(step3Request, true);
        }

        com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest step4Request = new com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest();
        step4Request.setPersonavalidarDatosRestrictivapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
        personaSrv.validarDatosRestrictivaImplementation(step4Request);

        /* Action 5: IF (drvVieneDeCORE = false) */
        boolean ifCondition5 = personaTMODUSUARIOpthisPersona.getPersonadrvVieneDeCORE().equals(false);
        if (ifCondition5) {
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest step50Request = new com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest();
            step50Request.setPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            personaSrv.validarDatosRestrictivaTipoIdImplementation(step50Request);
        }

        boolean guard6 = repository.assocOperator034(personaTMODUSUARIOpthisPersona).equals(false) && (personaTMODUSUARIOptpevcDepartamentoNac != null && !personaTMODUSUARIOptpevcDepartamentoNac.isNull());

        if (guard6) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest step6Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest();
            step6Request.setPersonaInsDptoNacimientoPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step6Request.setPersonaInsDptoNacimientoPersonapevcDepartamentoInstance(personaTMODUSUARIOptpevcDepartamentoNac);
            personaSrv.insDptoNacimientoPersonaImplementation(step6Request, true);
        }

        boolean guard7 = repository.assocOperator035(personaTMODUSUARIOpthisPersona).equals(true) && (personaTMODUSUARIOptpevcDepartamentoNac == null || personaTMODUSUARIOptpevcDepartamentoNac.isNull());

        if (guard7) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest step7Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest();
            step7Request.setPersonaDelDptoNacimientoPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step7Request.setPersonaDelDptoNacimientoPersonapevcDepartamentoInstance(personaTMODUSUARIOpthisPersona.getDepartamentoNacimiento());
            personaSrv.delDptoNacimientoPersonaImplementation(step7Request, true);
        }

        /* Action 8: IF (EXIST (DepartamentoNacimiento) = true AND ptpevcDepartamentoNac <> NULL AND DepartamentoNacimiento <> ptpevcDepartamentoNac) */
        boolean ifCondition8 = repository.assocOperator046(personaTMODUSUARIOpthisPersona).equals(true) && (personaTMODUSUARIOptpevcDepartamentoNac != null && !personaTMODUSUARIOptpevcDepartamentoNac.isNull()) && !(personaTMODUSUARIOpthisPersona.getDepartamentoNacimiento().equalsObject(personaTMODUSUARIOptpevcDepartamentoNac));
        if (ifCondition8) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest step80Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest();
            step80Request.setPersonaDelDptoNacimientoPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step80Request.setPersonaDelDptoNacimientoPersonapevcDepartamentoInstance(personaTMODUSUARIOpthisPersona.getDepartamentoNacimiento());
            personaSrv.delDptoNacimientoPersonaImplementation(step80Request, true);
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest step81Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest();
            step81Request.setPersonaInsDptoNacimientoPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step81Request.setPersonaInsDptoNacimientoPersonapevcDepartamentoInstance(personaTMODUSUARIOptpevcDepartamentoNac);
            personaSrv.insDptoNacimientoPersonaImplementation(step81Request, true);
        }

        boolean guard9 = repository.assocOperator037(personaTMODUSUARIOpthisPersona).equals(false) && (personaTMODUSUARIOptpevcMunicipioNac != null && !personaTMODUSUARIOptpevcMunicipioNac.isNull());

        if (guard9) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest step9Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest();
            step9Request.setPersonaInsMunicipioNacimientoPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step9Request.setPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODUSUARIOptpevcMunicipioNac);
            personaSrv.insMunicipioNacimientoPersonaImplementation(step9Request, true);
        }

        boolean guard10 = repository.assocOperator038(personaTMODUSUARIOpthisPersona).equals(true) && (personaTMODUSUARIOptpevcMunicipioNac == null || personaTMODUSUARIOptpevcMunicipioNac.isNull());

        if (guard10) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest step10Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest();
            step10Request.setPersonaDelMunicipioNacimientoPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step10Request.setPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODUSUARIOpthisPersona.getMunicipioNacimiento());
            personaSrv.delMunicipioNacimientoPersonaImplementation(step10Request, true);
        }

        /* Action 11: IF (EXIST (MunicipioNacimiento) = true AND ptpevcMunicipioNac <> NULL AND MunicipioNacimiento <> ptpevcMunicipioNac) */
        boolean ifCondition11 = repository.assocOperator047(personaTMODUSUARIOpthisPersona).equals(true) && (personaTMODUSUARIOptpevcMunicipioNac != null && !personaTMODUSUARIOptpevcMunicipioNac.isNull()) && !(personaTMODUSUARIOpthisPersona.getMunicipioNacimiento().equalsObject(personaTMODUSUARIOptpevcMunicipioNac));
        if (ifCondition11) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest step110Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest();
            step110Request.setPersonaDelMunicipioNacimientoPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step110Request.setPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODUSUARIOpthisPersona.getMunicipioNacimiento());
            personaSrv.delMunicipioNacimientoPersonaImplementation(step110Request, true);
            com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest step111Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest();
            step111Request.setPersonaInsMunicipioNacimientoPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step111Request.setPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODUSUARIOptpevcMunicipioNac);
            personaSrv.insMunicipioNacimientoPersonaImplementation(step111Request, true);
        }

        boolean guard12 = repository.assocOperator040(personaTMODUSUARIOpthisPersona).equals(false) && (personaTMODUSUARIOptpevcEstadoCivil != null && !personaTMODUSUARIOptpevcEstadoCivil.isNull());

        if (guard12) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest step12Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest();
            step12Request.setPersonaInsEstadoCivilPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step12Request.setPersonaInsEstadoCivilPersonapevcEstadoCivilInstance(personaTMODUSUARIOptpevcEstadoCivil);
            personaSrv.insEstadoCivilPersonaImplementation(step12Request, true);
        }

        boolean guard13 = repository.assocOperator041(personaTMODUSUARIOpthisPersona).equals(true) && (personaTMODUSUARIOptpevcEstadoCivil == null || personaTMODUSUARIOptpevcEstadoCivil.isNull());

        if (guard13) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest step13Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest();
            step13Request.setPersonaDelEstadoCivilPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step13Request.setPersonaDelEstadoCivilPersonapevcEstadoCivilInstance(personaTMODUSUARIOpthisPersona.getEstadoCivil());
            personaSrv.delEstadoCivilPersonaImplementation(step13Request, true);
        }

        /* Action 14: IF (EXIST (EstadoCivil) = true AND ptpevcEstadoCivil <> NULL AND EstadoCivil <> ptpevcEstadoCivil) */
        boolean ifCondition14 = repository.assocOperator048(personaTMODUSUARIOpthisPersona).equals(true) && (personaTMODUSUARIOptpevcEstadoCivil != null && !personaTMODUSUARIOptpevcEstadoCivil.isNull()) && !(personaTMODUSUARIOpthisPersona.getEstadoCivil().equalsObject(personaTMODUSUARIOptpevcEstadoCivil));
        if (ifCondition14) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest step140Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest();
            step140Request.setPersonaDelEstadoCivilPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step140Request.setPersonaDelEstadoCivilPersonapevcEstadoCivilInstance(personaTMODUSUARIOpthisPersona.getEstadoCivil());
            personaSrv.delEstadoCivilPersonaImplementation(step140Request, true);
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest step141Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest();
            step141Request.setPersonaInsEstadoCivilPersonapthisPersonaInstance(personaTMODUSUARIOpthisPersona);
            step141Request.setPersonaInsEstadoCivilPersonapevcEstadoCivilInstance(personaTMODUSUARIOptpevcEstadoCivil);
            personaSrv.insEstadoCivilPersonaImplementation(step141Request, true);
        }

        /* Action 15: IF (ptpDireccionCompleta <> NULL AND EXIST (Direcciones) WHERE (Direcciones.TipoDireccion = ptpevcTipoDireccion) = true) */
        boolean ifCondition15 = personaTMODUSUARIOptpDireccionCompleta != null && repository.assocOperator049(personaTMODUSUARIOpthisPersona, personaTMODUSUARIOptpevcTipoDireccion).equals(true);
        if (ifCondition15) {
            for(Direccion step1650Entity : repository.assocOperator044(personaTMODUSUARIOpthisPersona, personaTMODUSUARIOptpevcTipoDireccion)) {
                com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest step150Request = new com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest();
                step150Request.setDireccionTMODIFICARpthisDireccionInstance(step1650Entity);
                step150Request.setDireccionTMODIFICARptpDireccionCompleta(personaTMODUSUARIOptpDireccionCompleta);
                step150Request.setDireccionTMODIFICARptpRural(personaTMODUSUARIOptpRural);
                step150Request.setDireccionTMODIFICARptpevcDepartamentoInstance(personaTMODUSUARIOptpevcDepartamento);
                step150Request.setDireccionTMODIFICARptpevcMunicipioInstance(personaTMODUSUARIOptpevcMunicipio);
                step150Request.setDireccionTMODIFICARptpevcPaisInstance(personaTMODUSUARIOptpagrPais);
                step150Request.setDireccionTMODIFICARptpevcTipoDireccionInstance(personaTMODUSUARIOptpevcTipoDireccion);
                direccionSrv.tMODIFICARImplementation(step150Request);
            }
        }

        /* Action 16: IF (ptpDireccionCompleta <> NULL AND EXIST (Direcciones) WHERE (Direcciones.TipoDireccion = ptpevcTipoDireccion) = false) */
        boolean ifCondition16 = personaTMODUSUARIOptpDireccionCompleta != null && repository.assocOperator050(personaTMODUSUARIOpthisPersona, personaTMODUSUARIOptpevcTipoDireccion).equals(false);
        if (ifCondition16) {
            com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest step160Request = new com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest();
            step160Request.setDireccionTCREARptpagrPersonaInstance(personaTMODUSUARIOpthisPersona);
            step160Request.setDireccionTCREARptpagrContratoInstance(null);
            step160Request.setDireccionTCREARptpagrTitularInstance(null);
            step160Request.setDireccionTCREARptpagrTipoDireccionInstance(personaTMODUSUARIOptpevcTipoDireccion);
            step160Request.setDireccionTCREARptpagrMunicipioInstance(personaTMODUSUARIOptpevcMunicipio);
            step160Request.setDireccionTCREARptpagrDepartamentoInstance(personaTMODUSUARIOptpevcDepartamento);
            step160Request.setDireccionTCREARptpagrPaisInstance(null);
            step160Request.setDireccionTCREARptpatrDireccionCompleta(personaTMODUSUARIOptpDireccionCompleta);
            step160Request.setDireccionTCREARptpatrRural(personaTMODUSUARIOptpRural);
            direccionSrv.tCREARImplementation(step160Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    private void tMODUSUARIOPreconditions(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODUSUARIORequest request) 
            throws ModelException {
        checkClas1431886233600805Pre60(request);
    }

    private void checkClas1431886233600805Pre60 (
            com.keralty.aepersonas.viewmodel.persona.siu.TMODUSUARIORequest request) 
            throws ModelException {
        // EXIST( Usuarios.Eps ) = false OR Usuarios.Eps.EpsSanitas = false OR (ptpevcMunicipio = NULL OR (ptpevcMunicipio <> NULL AND ptpevcMunicipio.EsValidoEPS = true))

        Municipio personaTMODUSUARIOptpevcMunicipio = request.getPersonaTMODUSUARIOptpevcMunicipioInstance();
        Persona personaTMODUSUARIOpthisPersona = request.getPersonaTMODUSUARIOpthisPersonaInstance();
        try {
            boolean preconditionHolds = repository.assocOperator005(personaTMODUSUARIOpthisPersona).equals(false) || personaTMODUSUARIOpthisPersona.getUsuarios().getEps().getEpsEpsSanitas().equals(false) || ((personaTMODUSUARIOptpevcMunicipio == null || personaTMODUSUARIOptpevcMunicipio.isNull()) || ((personaTMODUSUARIOptpevcMunicipio != null && !personaTMODUSUARIOptpevcMunicipio.isNull()) && personaTMODUSUARIOptpevcMunicipio.getMunicipioEsValidoEPS().equals(true)));
            if (!preconditionHolds) throw new PreconditionException("El municipio seleccionado en los datos de contacto no es válido para EPS Sanitas");
        } catch (SystemException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    // Service: TCREARUSUARIO

    /*
     * Entry point for service TCREARUSUARIO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARUSUARIO(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tCREARUSUARIOTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARUSUARIO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARUSUARIOTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest request) throws ModelException, SystemException {
        request.setPersonaTCREARUSUARIOptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptpagrTipoIdentificacion()));
        request.setPersonaTCREARUSUARIOptpagrDepartamentoNacimientoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptpagrDepartamentoNacimiento()));
        request.setPersonaTCREARUSUARIOptpagrMunicipioNacimientoInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptpagrMunicipioNacimiento()));
        request.setPersonaTCREARUSUARIOptpagrEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptpagrEstadoCivil()));
        request.setPersonaTCREARUSUARIOptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptpagrDepartamento()));
        request.setPersonaTCREARUSUARIOptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptpagrMunicipio()));
        request.setPersonaTCREARUSUARIOptTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptTipoDireccion()));
        request.setPersonaTCREARUSUARIOptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptpagrPais()));
        request.setPersonaTCREARUSUARIOptEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptEstadoPersona()));
        request.setPersonaTCREARUSUARIOptSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaTCREARUSUARIOptSolicitud()));
        return personaSrv.tCREARUSUARIOImplementation(request);
    }

    /*
     * Implements service TCREARUSUARIO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARUSUARIOImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion personaTCREARUSUARIOptpagrTipoIdentificacion = request.getPersonaTCREARUSUARIOptpagrTipoIdentificacionInstance();
        Departamento personaTCREARUSUARIOptpagrDepartamentoNacimiento = request.getPersonaTCREARUSUARIOptpagrDepartamentoNacimientoInstance();
        Municipio personaTCREARUSUARIOptpagrMunicipioNacimiento = request.getPersonaTCREARUSUARIOptpagrMunicipioNacimientoInstance();
        EstadoCivil personaTCREARUSUARIOptpagrEstadoCivil = request.getPersonaTCREARUSUARIOptpagrEstadoCivilInstance();
        String personaTCREARUSUARIOptpatrNumIdentificacion = request.getPersonaTCREARUSUARIOptpatrNumIdentificacion();
        String personaTCREARUSUARIOptpatrPrimerNombre = request.getPersonaTCREARUSUARIOptpatrPrimerNombre();
        String personaTCREARUSUARIOptpatrSegundoNombre = request.getPersonaTCREARUSUARIOptpatrSegundoNombre();
        String personaTCREARUSUARIOptpatrPrimerApellido = request.getPersonaTCREARUSUARIOptpatrPrimerApellido();
        String personaTCREARUSUARIOptpatrSegundoApellido = request.getPersonaTCREARUSUARIOptpatrSegundoApellido();
        Date personaTCREARUSUARIOptpatrFechaNacimiento = request.getPersonaTCREARUSUARIOptpatrFechaNacimiento();
        String personaTCREARUSUARIOptpatrGenero = request.getPersonaTCREARUSUARIOptpatrGenero();
        Boolean personaTCREARUSUARIOptpatrIndicadorExtranjero = request.getPersonaTCREARUSUARIOptpatrIndicadorExtranjero();
        String personaTCREARUSUARIOptpatrTelefonoFijo = request.getPersonaTCREARUSUARIOptpatrTelefonoFijo();
        String personaTCREARUSUARIOptpatrTelefonoCelular = request.getPersonaTCREARUSUARIOptpatrTelefonoCelular();
        String personaTCREARUSUARIOptpatrCorreoElectronico = request.getPersonaTCREARUSUARIOptpatrCorreoElectronico();
        Pais personaTCREARUSUARIOptpagrPais = request.getPersonaTCREARUSUARIOptpagrPaisInstance();
        Departamento personaTCREARUSUARIOptpagrDepartamento = request.getPersonaTCREARUSUARIOptpagrDepartamentoInstance();
        Municipio personaTCREARUSUARIOptpagrMunicipio = request.getPersonaTCREARUSUARIOptpagrMunicipioInstance();
        String personaTCREARUSUARIOptpatrDireccionCompleta = request.getPersonaTCREARUSUARIOptpatrDireccionCompleta();
        Boolean personaTCREARUSUARIOptpatrRural = request.getPersonaTCREARUSUARIOptpatrRural();
        TipoDireccion personaTCREARUSUARIOptTipoDireccion = request.getPersonaTCREARUSUARIOptTipoDireccionInstance();
        Long personaTCREARUSUARIOptpCodigo = request.getPersonaTCREARUSUARIOptpCodigo();
        Boolean personaTCREARUSUARIOptValidarDatos = request.getPersonaTCREARUSUARIOptValidarDatos();
        EstadoPersona personaTCREARUSUARIOptEstadoPersona = request.getPersonaTCREARUSUARIOptEstadoPersonaInstance();
        Solicitud personaTCREARUSUARIOptSolicitud = request.getPersonaTCREARUSUARIOptSolicitudInstance();
        Boolean personaTCREARUSUARIOptpTieneEPSSanitas = request.getPersonaTCREARUSUARIOptpTieneEPSSanitas();
        String personaTCREARUSUARIOptpRechazadoAfiliacion = request.getPersonaTCREARUSUARIOptpRechazadoAfiliacion();

        request.checkArguments();

        tCREARUSUARIOPreconditions(request);
        Persona instance;

        com.keralty.aepersonas.viewmodel.persona.siu.TCREARNATURALRequest step1Request = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARNATURALRequest();
        step1Request.setPersonaTCREARNATURALptpagrTipoIdentificacionInstance(personaTCREARUSUARIOptpagrTipoIdentificacion);
        step1Request.setPersonaTCREARNATURALptpagrDepartamentoNacimientoInstance(personaTCREARUSUARIOptpagrDepartamentoNacimiento);
        step1Request.setPersonaTCREARNATURALptpagrMunicipioNacimientoInstance(personaTCREARUSUARIOptpagrMunicipioNacimiento);
        step1Request.setPersonaTCREARNATURALptpagrEstadoCivilInstance(personaTCREARUSUARIOptpagrEstadoCivil);
        step1Request.setPersonaTCREARNATURALptpatrNumIdentificacion(personaTCREARUSUARIOptpatrNumIdentificacion);
        step1Request.setPersonaTCREARNATURALptpatrPrimerNombre(personaTCREARUSUARIOptpatrPrimerNombre);
        step1Request.setPersonaTCREARNATURALptpatrSegundoNombre(personaTCREARUSUARIOptpatrSegundoNombre);
        step1Request.setPersonaTCREARNATURALptpatrPrimerApellido(personaTCREARUSUARIOptpatrPrimerApellido);
        step1Request.setPersonaTCREARNATURALptpatrSegundoApellido(personaTCREARUSUARIOptpatrSegundoApellido);
        step1Request.setPersonaTCREARNATURALptpatrFechaNacimiento(personaTCREARUSUARIOptpatrFechaNacimiento);
        step1Request.setPersonaTCREARNATURALptpatrGenero(personaTCREARUSUARIOptpatrGenero);
        step1Request.setPersonaTCREARNATURALptpatrIndicadorExtranjero(personaTCREARUSUARIOptpatrIndicadorExtranjero);
        step1Request.setPersonaTCREARNATURALptpatrTelefonoFijo(personaTCREARUSUARIOptpatrTelefonoFijo);
        step1Request.setPersonaTCREARNATURALptpatrTelefonoCelular(personaTCREARUSUARIOptpatrTelefonoCelular);
        step1Request.setPersonaTCREARNATURALptpatrCorreoElectronico(personaTCREARUSUARIOptpatrCorreoElectronico);
        step1Request.setPersonaTCREARNATURALptpagrPaisInstance(personaTCREARUSUARIOptpagrPais);
        step1Request.setPersonaTCREARNATURALptpagrDepartamentoInstance(personaTCREARUSUARIOptpagrDepartamento);
        step1Request.setPersonaTCREARNATURALptpagrMunicipioInstance(personaTCREARUSUARIOptpagrMunicipio);
        step1Request.setPersonaTCREARNATURALptpatrDireccionCompleta(personaTCREARUSUARIOptpatrDireccionCompleta);
        step1Request.setPersonaTCREARNATURALptpatrRural(personaTCREARUSUARIOptpatrRural);
        step1Request.setPersonaTCREARNATURALptTipoDireccionInstance(personaTCREARUSUARIOptTipoDireccion);
        step1Request.setPersonaTCREARNATURALpCodigo(personaTCREARUSUARIOptpCodigo);
        step1Request.setPersonaTCREARNATURALpDCDireccionCompleta(null);
        step1Request.setPersonaTCREARNATURALpDCDepartamentoInstance(null);
        step1Request.setPersonaTCREARNATURALpDCMunicipioInstance(null);
        step1Request.setPersonaTCREARNATURALpDCRural(null);
        step1Request.setPersonaTCREARNATURALpDCTelefonoFijo(null);
        step1Request.setPersonaTCREARNATURALpDCTelefonoCelular(null);
        step1Request.setPersonaTCREARNATURALpDCTipoDireccionInstance(null);
        step1Request.setPersonaTCREARNATURALpDCPaisInstance(null);
        step1Request.setPersonaTCREARNATURALptValidarDatos(personaTCREARUSUARIOptValidarDatos);
        step1Request.setPersonaTCREARNATURALptEstadoPersonaInstance(personaTCREARUSUARIOptEstadoPersona);
        step1Request.setPersonaTCREARNATURALptSolicitudInstance(personaTCREARUSUARIOptSolicitud);
        instance = (Persona) personaSrv.tCREARNATURALImplementation(step1Request).getInstance();

        com.keralty.aepersonas.viewmodel.persona.siu.RegistrarDatosCORERequest step2Request = new com.keralty.aepersonas.viewmodel.persona.siu.RegistrarDatosCORERequest();
        step2Request.setPersonaregistrarDatosCOREpthisPersonaInstance(instance);
        step2Request.setPersonaregistrarDatosCOREpCodigo(personaTCREARUSUARIOptpCodigo);
        step2Request.setPersonaregistrarDatosCOREpTieneEPSSanitas(personaTCREARUSUARIOptpTieneEPSSanitas);
        step2Request.setPersonaregistrarDatosCOREpRechazadoAfiliacion(personaTCREARUSUARIOptpRechazadoAfiliacion);
        personaSrv.registrarDatosCOREImplementation(step2Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    private void tCREARUSUARIOPreconditions(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest request) 
            throws ModelException {
        checkClas1431886233600805Pre81(request);
        checkClas1431886233600805Pre94(request);
    }

    private void checkClas1431886233600805Pre81 (
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest request) 
            throws ModelException {
        // ptCheckTipoRegimen = 0 OR ptCheckTipoRegimen <> 1

        Long personaTCREARUSUARIOptCheckTipoRegimen = request.getPersonaTCREARUSUARIOptCheckTipoRegimen();
        boolean preconditionHolds = (personaTCREARUSUARIOptCheckTipoRegimen).equals(Long.valueOf(0)) || !(personaTCREARUSUARIOptCheckTipoRegimen).equals(Long.valueOf(1));
        if (!preconditionHolds) throw new PreconditionException("El usuario corresponde a régimen subsidiado. No puede añadirse");
    }

    private void checkClas1431886233600805Pre94 (
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest request) 
            throws ModelException {
        // ptCheckTipoRegimen = 0 OR ptCheckTipoRegimen <> 2

        Long personaTCREARUSUARIOptCheckTipoRegimen = request.getPersonaTCREARUSUARIOptCheckTipoRegimen();
        boolean preconditionHolds = (personaTCREARUSUARIOptCheckTipoRegimen).equals(Long.valueOf(0)) || !(personaTCREARUSUARIOptCheckTipoRegimen).equals(Long.valueOf(2));
        if (!preconditionHolds) throw new PreconditionException("El usuario no se encuentra activo en un contrato de régimen contributivo. No puede añadirse");
    }

    // Service: TMODTITULAR

    /*
     * Entry point for service TMODTITULAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tMODTITULAR(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODTITULARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tMODTITULARTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TMODTITULAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tMODTITULARTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODTITULARRequest request) throws ModelException, SystemException {
        request.setPersonaTMODTITULARpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaTMODTITULARpthisPersona()));
        request.setPersonaTMODTITULARptpevcDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTMODTITULARptpevcDepartamentoNac()));
        request.setPersonaTMODTITULARptpevcMunicipioNacInstance(municipioSrv.getByOIDWithHV(request.getPersonaTMODTITULARptpevcMunicipioNac()));
        request.setPersonaTMODTITULARptpevcEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaTMODTITULARptpevcEstadoCivil()));
        request.setPersonaTMODTITULARptpevcTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTMODTITULARptpevcTipoDireccion()));
        request.setPersonaTMODTITULARptpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTMODTITULARptpevcDepartamento()));
        request.setPersonaTMODTITULARptpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTMODTITULARptpevcMunicipio()));
        request.setPersonaTMODTITULARptpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonaTMODTITULARptpevcTipoIdentificacion()));
        request.setPersonaTMODTITULARptEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaTMODTITULARptEstadoPersona()));
        request.setPersonaTMODTITULARptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTMODTITULARptpagrPais()));
        return personaSrv.tMODTITULARImplementation(request);
    }

    /*
     * Implements service TMODTITULAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tMODTITULARImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODTITULARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Long personaTMODTITULARptpCodigo = request.getPersonaTMODTITULARptpCodigo();
        TipoIdentificacion personaTMODTITULARptpevcTipoIdentificacion = request.getPersonaTMODTITULARptpevcTipoIdentificacionInstance();
        String personaTMODTITULARptpNumIdentificacion = request.getPersonaTMODTITULARptpNumIdentificacion();
        String personaTMODTITULARptpPrimerNombre = request.getPersonaTMODTITULARptpPrimerNombre();
        String personaTMODTITULARptpSegundoNombre = request.getPersonaTMODTITULARptpSegundoNombre();
        String personaTMODTITULARptpPrimerApellido = request.getPersonaTMODTITULARptpPrimerApellido();
        String personaTMODTITULARptpSegundoApellido = request.getPersonaTMODTITULARptpSegundoApellido();
        Date personaTMODTITULARptpFechaNacimiento = request.getPersonaTMODTITULARptpFechaNacimiento();
        String personaTMODTITULARptpGenero = request.getPersonaTMODTITULARptpGenero();
        Boolean personaTMODTITULARptpIndicadorExtranjero = request.getPersonaTMODTITULARptpIndicadorExtranjero();
        Departamento personaTMODTITULARptpevcDepartamentoNac = request.getPersonaTMODTITULARptpevcDepartamentoNacInstance();
        Municipio personaTMODTITULARptpevcMunicipioNac = request.getPersonaTMODTITULARptpevcMunicipioNacInstance();
        String personaTMODTITULARptRazonSocial = request.getPersonaTMODTITULARptRazonSocial();
        String personaTMODTITULARptpTelefonoFijo = request.getPersonaTMODTITULARptpTelefonoFijo();
        String personaTMODTITULARptpTelefonoCelular = request.getPersonaTMODTITULARptpTelefonoCelular();
        String personaTMODTITULARptpCorreoElectronico = request.getPersonaTMODTITULARptpCorreoElectronico();
        Boolean personaTMODTITULARptpTieneEPSSanitas = request.getPersonaTMODTITULARptpTieneEPSSanitas();
        String personaTMODTITULARptpRechazadoAfiliacion = request.getPersonaTMODTITULARptpRechazadoAfiliacion();
        EstadoPersona personaTMODTITULARptEstadoPersona = request.getPersonaTMODTITULARptEstadoPersonaInstance();
        Boolean personaTMODTITULARptValidarDatos = request.getPersonaTMODTITULARptValidarDatos();
        EstadoCivil personaTMODTITULARptpevcEstadoCivil = request.getPersonaTMODTITULARptpevcEstadoCivilInstance();
        Boolean personaTMODTITULARptTitularRecuperadoIncl = request.getPersonaTMODTITULARptTitularRecuperadoIncl();
        String personaTMODTITULARptpDireccionCompleta = request.getPersonaTMODTITULARptpDireccionCompleta();
        Boolean personaTMODTITULARptpRural = request.getPersonaTMODTITULARptpRural();
        Departamento personaTMODTITULARptpevcDepartamento = request.getPersonaTMODTITULARptpevcDepartamentoInstance();
        Municipio personaTMODTITULARptpevcMunicipio = request.getPersonaTMODTITULARptpevcMunicipioInstance();
        Pais personaTMODTITULARptpagrPais = request.getPersonaTMODTITULARptpagrPaisInstance();
        Persona personaTMODTITULARpthisPersona = request.getPersonaTMODTITULARpthisPersonaInstance();

        request.checkArguments();
        Persona instance = personaTMODTITULARpthisPersona;

        /* Action 1: IF (ptpCodigo <> NULL AND ptpevcTipoIdentificacion = TipoIdentificacion AND ptpNumIdentificacion = NumIdentificacion AND (ptpPrimerNombre <> PrimerNombre OR ptpSegundoNombre <> SegundoNombre OR ptpPrimerApellido <> PrimerApellido OR ptpSegundoApellido <> SegundoApellido OR ptpFechaNacimiento <> FechaNacimiento OR ptpGenero <> Genero OR ptpIndicadorExtranjero <> IndicadorExtranjero OR ptpevcDepartamentoNac <> DepartamentoNacimiento OR ptpevcMunicipioNac <> MunicipioNacimiento)) */
        boolean ifCondition1 = personaTMODTITULARptpCodigo != null && personaTMODTITULARptpevcTipoIdentificacion.equalsObject(personaTMODTITULARpthisPersona.getTipoIdentificacion()) && (personaTMODTITULARptpNumIdentificacion).equals(personaTMODTITULARpthisPersona.getPersonaNumIdentificacion()) && (!STDFunctions.areEqual(personaTMODTITULARptpPrimerNombre,personaTMODTITULARpthisPersona.getPersonaPrimerNombre()) || !STDFunctions.areEqual(personaTMODTITULARptpSegundoNombre,personaTMODTITULARpthisPersona.getPersonaSegundoNombre()) || !STDFunctions.areEqual(personaTMODTITULARptpPrimerApellido,personaTMODTITULARpthisPersona.getPersonaPrimerApellido()) || !STDFunctions.areEqual(personaTMODTITULARptpSegundoApellido,personaTMODTITULARpthisPersona.getPersonaSegundoApellido()) || !STDFunctions.areEqual(personaTMODTITULARptpFechaNacimiento,personaTMODTITULARpthisPersona.getPersonaFechaNacimiento()) || !STDFunctions.areEqual(personaTMODTITULARptpGenero,personaTMODTITULARpthisPersona.getPersonaGenero()) || !STDFunctions.areEqual(personaTMODTITULARptpIndicadorExtranjero,personaTMODTITULARpthisPersona.getPersonaIndicadorExtranjero()) || !(personaTMODTITULARptpevcDepartamentoNac.equalsObject(personaTMODTITULARpthisPersona.getDepartamentoNacimiento())) || !(personaTMODTITULARptpevcMunicipioNac.equalsObject(personaTMODTITULARpthisPersona.getMunicipioNacimiento())));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.persona.siu.MarcarDatosBasicosModRequest step1000Request = new com.keralty.aepersonas.viewmodel.persona.siu.MarcarDatosBasicosModRequest();
            step1000Request.setPersonamarcarDatosBasicosModpthisPersonaInstance(personaTMODTITULARpthisPersona);
            step1000Request.setPersonamarcarDatosBasicosModpModificados(Boolean.TRUE);
            personaSrv.marcarDatosBasicosModImplementation(step1000Request);
        }

        com.keralty.aepersonas.viewmodel.persona.siu.ModificarRequest step2Request = new com.keralty.aepersonas.viewmodel.persona.siu.ModificarRequest();
        step2Request.setPersonamodificarpthisPersonaInstance(personaTMODTITULARpthisPersona);
        step2Request.setPersonamodificarpPrimerNombre(personaTMODTITULARptpPrimerNombre);
        step2Request.setPersonamodificarpSegundoNombre(personaTMODTITULARptpSegundoNombre);
        step2Request.setPersonamodificarpPrimerApellido(personaTMODTITULARptpPrimerApellido);
        step2Request.setPersonamodificarpSegundoApellido(personaTMODTITULARptpSegundoApellido);
        step2Request.setPersonamodificarpRazonSocial(personaTMODTITULARptRazonSocial);
        step2Request.setPersonamodificarpFechaNacimiento(personaTMODTITULARptpFechaNacimiento);
        step2Request.setPersonamodificarpGenero(personaTMODTITULARptpGenero);
        step2Request.setPersonamodificarpIndicadorExtranjero(personaTMODTITULARptpIndicadorExtranjero);
        step2Request.setPersonamodificarpTelefonoFijo(personaTMODTITULARptpTelefonoFijo);
        step2Request.setPersonamodificarpTelefonoCelular(personaTMODTITULARptpTelefonoCelular);
        step2Request.setPersonamodificarpCorreoElectronico(personaTMODTITULARptpCorreoElectronico);
        step2Request.setPersonamodificarpTieneEPSSanitas(personaTMODTITULARptpTieneEPSSanitas);
        step2Request.setPersonamodificarpRechazadoAfiliacion(personaTMODTITULARptpRechazadoAfiliacion);
        step2Request.setPersonamodificarpNumIdentificacion(personaTMODTITULARptpNumIdentificacion);
        personaSrv.modificarImplementation(step2Request);

        com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest step3Request = new com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest();
        step3Request.setPersonaindicarCodigoCOREpthisPersonaInstance(personaTMODTITULARpthisPersona);
        step3Request.setPersonaindicarCodigoCOREpCodigo(personaTMODTITULARptpCodigo);
        personaSrv.indicarCodigoCOREImplementation(step3Request);

        /* Action 4: IF (EXIST (EstadoPersona) = false) */
        boolean ifCondition4 = repository.assocOperator061(personaTMODTITULARpthisPersona).equals(false);
        if (ifCondition4) {
            /* Action 40: IF (ptEstadoPersona <> NULL) */
            boolean ifCondition40 = (personaTMODTITULARptEstadoPersona != null && !personaTMODTITULARptEstadoPersona.isNull());
            if (ifCondition40) {
                com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest step400Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest();
                step400Request.setPersonaInsEstadoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
                step400Request.setPersonaInsEstadoPersonapevcEstadoPersonaInstance(personaTMODTITULARptEstadoPersona);
                personaSrv.insEstadoPersonaImplementation(step400Request, true);
            }
        } else {
            /* Action 41: IF (ptEstadoPersona <> EstadoPersona) */
            boolean ifCondition41 = !(personaTMODTITULARptEstadoPersona.equalsObject(personaTMODTITULARpthisPersona.getEstadoPersona()));
            if (ifCondition41) {
                com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest step410Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoPersonaRequest();
                step410Request.setPersonaDelEstadoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
                step410Request.setPersonaDelEstadoPersonapevcEstadoPersonaInstance(personaTMODTITULARpthisPersona.getEstadoPersona());
                personaSrv.delEstadoPersonaImplementation(step410Request, true);
                /* Action 411: IF (ptEstadoPersona <> NULL) */
                boolean ifCondition411 = (personaTMODTITULARptEstadoPersona != null && !personaTMODTITULARptEstadoPersona.isNull());
                if (ifCondition411) {
                    com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest step4110Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoPersonaRequest();
                    step4110Request.setPersonaInsEstadoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
                    step4110Request.setPersonaInsEstadoPersonapevcEstadoPersonaInstance(personaTMODTITULARptEstadoPersona);
                    personaSrv.insEstadoPersonaImplementation(step4110Request, true);
                }
            }
        }

        boolean guard5 = !(personaTMODTITULARptpevcTipoIdentificacion.equalsObject(personaTMODTITULARpthisPersona.getTipoIdentificacion()));

        if (guard5) {
            com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest step5Request = new com.keralty.aepersonas.viewmodel.persona.siu.CambTipoIdentificacionRequest();
            step5Request.setPersonaCambTipoIdentificacionpthisPersonaInstance(personaTMODTITULARpthisPersona);
            step5Request.setPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance(personaTMODTITULARptpevcTipoIdentificacion);
            personaSrv.cambTipoIdentificacionImplementation(step5Request, true);
        }

        /* Action 6: IF (ptValidarDatos = true) */
        boolean ifCondition6 = personaTMODTITULARptValidarDatos.equals(true);
        if (ifCondition6) {
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest step60Request = new com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaRequest();
            step60Request.setPersonavalidarDatosRestrictivapthisPersonaInstance(personaTMODTITULARpthisPersona);
            personaSrv.validarDatosRestrictivaImplementation(step60Request);
        }

        /* Action 7: IF (drvVieneDeCORE = false) */
        boolean ifCondition7 = personaTMODTITULARpthisPersona.getPersonadrvVieneDeCORE().equals(false);
        if (ifCondition7) {
            com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest step70Request = new com.keralty.aepersonas.viewmodel.persona.siu.ValidarDatosRestrictivaTipoIdRequest();
            step70Request.setPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance(personaTMODTITULARpthisPersona);
            personaSrv.validarDatosRestrictivaTipoIdImplementation(step70Request);
        }

        boolean guard8 = repository.assocOperator052(personaTMODTITULARpthisPersona).equals(false) && (personaTMODTITULARptpevcDepartamentoNac != null && !personaTMODTITULARptpevcDepartamentoNac.isNull());

        if (guard8) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest step8Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest();
            step8Request.setPersonaInsDptoNacimientoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step8Request.setPersonaInsDptoNacimientoPersonapevcDepartamentoInstance(personaTMODTITULARptpevcDepartamentoNac);
            personaSrv.insDptoNacimientoPersonaImplementation(step8Request, true);
        }

        boolean guard9 = repository.assocOperator053(personaTMODTITULARpthisPersona).equals(true) && (personaTMODTITULARptpevcDepartamentoNac == null || personaTMODTITULARptpevcDepartamentoNac.isNull());

        if (guard9) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest step9Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest();
            step9Request.setPersonaDelDptoNacimientoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step9Request.setPersonaDelDptoNacimientoPersonapevcDepartamentoInstance(personaTMODTITULARpthisPersona.getDepartamentoNacimiento());
            personaSrv.delDptoNacimientoPersonaImplementation(step9Request, true);
        }

        /* Action 10: IF (EXIST (DepartamentoNacimiento) = true AND ptpevcDepartamentoNac <> NULL AND DepartamentoNacimiento <> ptpevcDepartamentoNac) */
        boolean ifCondition10 = repository.assocOperator062(personaTMODTITULARpthisPersona).equals(true) && (personaTMODTITULARptpevcDepartamentoNac != null && !personaTMODTITULARptpevcDepartamentoNac.isNull()) && !(personaTMODTITULARpthisPersona.getDepartamentoNacimiento().equalsObject(personaTMODTITULARptpevcDepartamentoNac));
        if (ifCondition10) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest step100Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest();
            step100Request.setPersonaDelDptoNacimientoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step100Request.setPersonaDelDptoNacimientoPersonapevcDepartamentoInstance(personaTMODTITULARpthisPersona.getDepartamentoNacimiento());
            personaSrv.delDptoNacimientoPersonaImplementation(step100Request, true);
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest step101Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest();
            step101Request.setPersonaInsDptoNacimientoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step101Request.setPersonaInsDptoNacimientoPersonapevcDepartamentoInstance(personaTMODTITULARptpevcDepartamentoNac);
            personaSrv.insDptoNacimientoPersonaImplementation(step101Request, true);
        }

        boolean guard11 = repository.assocOperator055(personaTMODTITULARpthisPersona).equals(false) && (personaTMODTITULARptpevcMunicipioNac != null && !personaTMODTITULARptpevcMunicipioNac.isNull());

        if (guard11) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest step11Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest();
            step11Request.setPersonaInsMunicipioNacimientoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step11Request.setPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODTITULARptpevcMunicipioNac);
            personaSrv.insMunicipioNacimientoPersonaImplementation(step11Request, true);
        }

        boolean guard12 = repository.assocOperator056(personaTMODTITULARpthisPersona).equals(true) && (personaTMODTITULARptpevcMunicipioNac == null || personaTMODTITULARptpevcMunicipioNac.isNull());

        if (guard12) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest step12Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest();
            step12Request.setPersonaDelMunicipioNacimientoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step12Request.setPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODTITULARpthisPersona.getMunicipioNacimiento());
            personaSrv.delMunicipioNacimientoPersonaImplementation(step12Request, true);
        }

        /* Action 13: IF (EXIST (MunicipioNacimiento) = true AND ptpevcMunicipioNac <> NULL AND MunicipioNacimiento <> ptpevcMunicipioNac) */
        boolean ifCondition13 = repository.assocOperator063(personaTMODTITULARpthisPersona).equals(true) && (personaTMODTITULARptpevcMunicipioNac != null && !personaTMODTITULARptpevcMunicipioNac.isNull()) && !(personaTMODTITULARpthisPersona.getMunicipioNacimiento().equalsObject(personaTMODTITULARptpevcMunicipioNac));
        if (ifCondition13) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest step130Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelMunicipioNacimientoPersonaRequest();
            step130Request.setPersonaDelMunicipioNacimientoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step130Request.setPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODTITULARpthisPersona.getMunicipioNacimiento());
            personaSrv.delMunicipioNacimientoPersonaImplementation(step130Request, true);
            com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest step131Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsMunicipioNacimientoPersonaRequest();
            step131Request.setPersonaInsMunicipioNacimientoPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step131Request.setPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance(personaTMODTITULARptpevcMunicipioNac);
            personaSrv.insMunicipioNacimientoPersonaImplementation(step131Request, true);
        }

        boolean guard14 = repository.assocOperator058(personaTMODTITULARpthisPersona).equals(false) && (personaTMODTITULARptpevcEstadoCivil != null && !personaTMODTITULARptpevcEstadoCivil.isNull());

        if (guard14) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest step14Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest();
            step14Request.setPersonaInsEstadoCivilPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step14Request.setPersonaInsEstadoCivilPersonapevcEstadoCivilInstance(personaTMODTITULARptpevcEstadoCivil);
            personaSrv.insEstadoCivilPersonaImplementation(step14Request, true);
        }

        boolean guard15 = repository.assocOperator059(personaTMODTITULARpthisPersona).equals(true) && (personaTMODTITULARptpevcEstadoCivil == null || personaTMODTITULARptpevcEstadoCivil.isNull());

        if (guard15) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest step15Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest();
            step15Request.setPersonaDelEstadoCivilPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step15Request.setPersonaDelEstadoCivilPersonapevcEstadoCivilInstance(personaTMODTITULARpthisPersona.getEstadoCivil());
            personaSrv.delEstadoCivilPersonaImplementation(step15Request, true);
        }

        /* Action 16: IF (EXIST (EstadoCivil) = true AND ptpevcEstadoCivil <> NULL AND EstadoCivil <> ptpevcEstadoCivil) */
        boolean ifCondition16 = repository.assocOperator064(personaTMODTITULARpthisPersona).equals(true) && (personaTMODTITULARptpevcEstadoCivil != null && !personaTMODTITULARptpevcEstadoCivil.isNull()) && !(personaTMODTITULARpthisPersona.getEstadoCivil().equalsObject(personaTMODTITULARptpevcEstadoCivil));
        if (ifCondition16) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest step160Request = new com.keralty.aepersonas.viewmodel.persona.siu.DelEstadoCivilPersonaRequest();
            step160Request.setPersonaDelEstadoCivilPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step160Request.setPersonaDelEstadoCivilPersonapevcEstadoCivilInstance(personaTMODTITULARpthisPersona.getEstadoCivil());
            personaSrv.delEstadoCivilPersonaImplementation(step160Request, true);
            com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest step161Request = new com.keralty.aepersonas.viewmodel.persona.siu.InsEstadoCivilPersonaRequest();
            step161Request.setPersonaInsEstadoCivilPersonapthisPersonaInstance(personaTMODTITULARpthisPersona);
            step161Request.setPersonaInsEstadoCivilPersonapevcEstadoCivilInstance(personaTMODTITULARptpevcEstadoCivil);
            personaSrv.insEstadoCivilPersonaImplementation(step161Request, true);
        }

        /* Action 17: IF (ptTitularRecuperadoIncl = false) */
        boolean ifCondition17 = personaTMODTITULARptTitularRecuperadoIncl.equals(false);
        if (ifCondition17) {
            com.keralty.aepersonas.viewmodel.persona.siu.TMODDIRECCIONESRequest step170Request = new com.keralty.aepersonas.viewmodel.persona.siu.TMODDIRECCIONESRequest();
            step170Request.setPersonaTMODDIRECCIONESpthisPersonaInstance(personaTMODTITULARpthisPersona);
            step170Request.setPersonaTMODDIRECCIONESptpDireccionCompleta(personaTMODTITULARptpDireccionCompleta);
            step170Request.setPersonaTMODDIRECCIONESptpRural(personaTMODTITULARptpRural);
            step170Request.setPersonaTMODDIRECCIONESptpevcDepartamentoInstance(personaTMODTITULARptpevcDepartamento);
            step170Request.setPersonaTMODDIRECCIONESptpevcMunicipioInstance(personaTMODTITULARptpevcMunicipio);
            step170Request.setPersonaTMODDIRECCIONESpDCDireccionCompleta(null);
            step170Request.setPersonaTMODDIRECCIONESpDCDepartamentoInstance(null);
            step170Request.setPersonaTMODDIRECCIONESpDCMunicipioInstance(null);
            step170Request.setPersonaTMODDIRECCIONESpDCRural(null);
            step170Request.setPersonaTMODDIRECCIONESptpagrPaisInstance(personaTMODTITULARptpagrPais);
            step170Request.setPersonaTMODDIRECCIONESptpTelefonoFijo(personaTMODTITULARptpTelefonoFijo);
            step170Request.setPersonaTMODDIRECCIONESptpTelefonoCelular(personaTMODTITULARptpTelefonoCelular);
            personaSrv.tMODDIRECCIONESImplementation(step170Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: TCREARTITULAR

    /*
     * Entry point for service TCREARTITULAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARResponse tCREARTITULAR(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARRequest request) {
        com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARResponse response = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARResponse();
        try {
            response = personaSrv.tCREARTITULARTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARTITULAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARResponse tCREARTITULARTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARRequest request) throws ModelException, SystemException {
        request.setPersonaTCREARTITULARptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptpagrTipoIdentificacion()));
        request.setPersonaTCREARTITULARptpagrDepartamentoNacimientoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptpagrDepartamentoNacimiento()));
        request.setPersonaTCREARTITULARptpagrMunicipioNacimientoInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptpagrMunicipioNacimiento()));
        request.setPersonaTCREARTITULARptpagrEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptpagrEstadoCivil()));
        request.setPersonaTCREARTITULARptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptpagrDepartamento()));
        request.setPersonaTCREARTITULARptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptpagrMunicipio()));
        request.setPersonaTCREARTITULARptTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptTipoDireccion()));
        request.setPersonaTCREARTITULARptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptpagrPais()));
        request.setPersonaTCREARTITULARptEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptEstadoPersona()));
        request.setPersonaTCREARTITULARptSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaTCREARTITULARptSolicitud()));
        return personaSrv.tCREARTITULARImplementation(request);
    }

    /*
     * Implements service TCREARTITULAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARResponse tCREARTITULARImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARRequest request) throws ModelException, SystemException {
        com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARResponse response = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARTITULARResponse();
        TipoIdentificacion personaTCREARTITULARptpagrTipoIdentificacion = request.getPersonaTCREARTITULARptpagrTipoIdentificacionInstance();
        String personaTCREARTITULARptpatrNumIdentificacion = request.getPersonaTCREARTITULARptpatrNumIdentificacion();
        String personaTCREARTITULARptpatrRazonSocial = request.getPersonaTCREARTITULARptpatrRazonSocial();
        Boolean personaTCREARTITULARptpatrIndicadorExtranjero = request.getPersonaTCREARTITULARptpatrIndicadorExtranjero();
        String personaTCREARTITULARptpatrTelefonoFijo = request.getPersonaTCREARTITULARptpatrTelefonoFijo();
        String personaTCREARTITULARptpatrTelefonoCelular = request.getPersonaTCREARTITULARptpatrTelefonoCelular();
        String personaTCREARTITULARptpatrCorreoElectronico = request.getPersonaTCREARTITULARptpatrCorreoElectronico();
        Pais personaTCREARTITULARptpagrPais = request.getPersonaTCREARTITULARptpagrPaisInstance();
        Departamento personaTCREARTITULARptpagrDepartamento = request.getPersonaTCREARTITULARptpagrDepartamentoInstance();
        Municipio personaTCREARTITULARptpagrMunicipio = request.getPersonaTCREARTITULARptpagrMunicipioInstance();
        String personaTCREARTITULARptpatrDireccionCompleta = request.getPersonaTCREARTITULARptpatrDireccionCompleta();
        Boolean personaTCREARTITULARptpatrRural = request.getPersonaTCREARTITULARptpatrRural();
        Departamento personaTCREARTITULARptpagrDepartamentoNacimiento = request.getPersonaTCREARTITULARptpagrDepartamentoNacimientoInstance();
        Municipio personaTCREARTITULARptpagrMunicipioNacimiento = request.getPersonaTCREARTITULARptpagrMunicipioNacimientoInstance();
        EstadoCivil personaTCREARTITULARptpagrEstadoCivil = request.getPersonaTCREARTITULARptpagrEstadoCivilInstance();
        String personaTCREARTITULARptpatrPrimerNombre = request.getPersonaTCREARTITULARptpatrPrimerNombre();
        String personaTCREARTITULARptpatrSegundoNombre = request.getPersonaTCREARTITULARptpatrSegundoNombre();
        String personaTCREARTITULARptpatrPrimerApellido = request.getPersonaTCREARTITULARptpatrPrimerApellido();
        String personaTCREARTITULARptpatrSegundoApellido = request.getPersonaTCREARTITULARptpatrSegundoApellido();
        Date personaTCREARTITULARptpatrFechaNacimiento = request.getPersonaTCREARTITULARptpatrFechaNacimiento();
        String personaTCREARTITULARptpatrGenero = request.getPersonaTCREARTITULARptpatrGenero();
        TipoDireccion personaTCREARTITULARptTipoDireccion = request.getPersonaTCREARTITULARptTipoDireccionInstance();
        Long personaTCREARTITULARptpCodigo = request.getPersonaTCREARTITULARptpCodigo();
        Boolean personaTCREARTITULARptValidarDatos = request.getPersonaTCREARTITULARptValidarDatos();
        EstadoPersona personaTCREARTITULARptEstadoPersona = request.getPersonaTCREARTITULARptEstadoPersonaInstance();
        Solicitud personaTCREARTITULARptSolicitud = request.getPersonaTCREARTITULARptSolicitudInstance();
        Boolean personaTCREARTITULARptpTieneEPSSanitas = request.getPersonaTCREARTITULARptpTieneEPSSanitas();
        String personaTCREARTITULARptpRechazadoAfiliacion = request.getPersonaTCREARTITULARptpRechazadoAfiliacion();

        request.checkArguments();
        Persona instance;

        /* Action 1: IF (ptpagrTipoIdentificacion.NIT = true) */
        boolean ifCondition1 = personaTCREARTITULARptpagrTipoIdentificacion.getTipoIdentificacionNIT().equals(true);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARJURIDICARequest step10Request = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARJURIDICARequest();
            step10Request.setPersonaTCREARJURIDICAptpagrTipoIdentificacionInstance(personaTCREARTITULARptpagrTipoIdentificacion);
            step10Request.setPersonaTCREARJURIDICAptpatrNumIdentificacion(personaTCREARTITULARptpatrNumIdentificacion);
            step10Request.setPersonaTCREARJURIDICAptpatrRazonSocial(personaTCREARTITULARptpatrRazonSocial);
            step10Request.setPersonaTCREARJURIDICAptpatrIndicadorExtranjero(personaTCREARTITULARptpatrIndicadorExtranjero);
            step10Request.setPersonaTCREARJURIDICAptpatrTelefonoFijo(personaTCREARTITULARptpatrTelefonoFijo);
            step10Request.setPersonaTCREARJURIDICAptpatrTelefonoCelular(personaTCREARTITULARptpatrTelefonoCelular);
            step10Request.setPersonaTCREARJURIDICAptpatrCorreoElectronico(personaTCREARTITULARptpatrCorreoElectronico);
            step10Request.setPersonaTCREARJURIDICAptpagrPaisInstance(personaTCREARTITULARptpagrPais);
            step10Request.setPersonaTCREARJURIDICAptpagrDepartamentoInstance(personaTCREARTITULARptpagrDepartamento);
            step10Request.setPersonaTCREARJURIDICAptpagrMunicipioInstance(personaTCREARTITULARptpagrMunicipio);
            step10Request.setPersonaTCREARJURIDICAptpatrDireccionCompleta(personaTCREARTITULARptpatrDireccionCompleta);
            step10Request.setPersonaTCREARJURIDICAptpatrRural(personaTCREARTITULARptpatrRural);
            instance = (Persona) personaSrv.tCREARJURIDICAImplementation(step10Request).getInstance();
        } else {
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARNATURALRequest step11Request = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARNATURALRequest();
            step11Request.setPersonaTCREARNATURALptpagrTipoIdentificacionInstance(personaTCREARTITULARptpagrTipoIdentificacion);
            step11Request.setPersonaTCREARNATURALptpagrDepartamentoNacimientoInstance(personaTCREARTITULARptpagrDepartamentoNacimiento);
            step11Request.setPersonaTCREARNATURALptpagrMunicipioNacimientoInstance(personaTCREARTITULARptpagrMunicipioNacimiento);
            step11Request.setPersonaTCREARNATURALptpagrEstadoCivilInstance(personaTCREARTITULARptpagrEstadoCivil);
            step11Request.setPersonaTCREARNATURALptpatrNumIdentificacion(personaTCREARTITULARptpatrNumIdentificacion);
            step11Request.setPersonaTCREARNATURALptpatrPrimerNombre(personaTCREARTITULARptpatrPrimerNombre);
            step11Request.setPersonaTCREARNATURALptpatrSegundoNombre(personaTCREARTITULARptpatrSegundoNombre);
            step11Request.setPersonaTCREARNATURALptpatrPrimerApellido(personaTCREARTITULARptpatrPrimerApellido);
            step11Request.setPersonaTCREARNATURALptpatrSegundoApellido(personaTCREARTITULARptpatrSegundoApellido);
            step11Request.setPersonaTCREARNATURALptpatrFechaNacimiento(personaTCREARTITULARptpatrFechaNacimiento);
            step11Request.setPersonaTCREARNATURALptpatrGenero(personaTCREARTITULARptpatrGenero);
            step11Request.setPersonaTCREARNATURALptpatrIndicadorExtranjero(personaTCREARTITULARptpatrIndicadorExtranjero);
            step11Request.setPersonaTCREARNATURALptpatrTelefonoFijo(personaTCREARTITULARptpatrTelefonoFijo);
            step11Request.setPersonaTCREARNATURALptpatrTelefonoCelular(personaTCREARTITULARptpatrTelefonoCelular);
            step11Request.setPersonaTCREARNATURALptpatrCorreoElectronico(personaTCREARTITULARptpatrCorreoElectronico);
            step11Request.setPersonaTCREARNATURALptpagrPaisInstance(personaTCREARTITULARptpagrPais);
            step11Request.setPersonaTCREARNATURALptpagrDepartamentoInstance(personaTCREARTITULARptpagrDepartamento);
            step11Request.setPersonaTCREARNATURALptpagrMunicipioInstance(personaTCREARTITULARptpagrMunicipio);
            step11Request.setPersonaTCREARNATURALptpatrDireccionCompleta(personaTCREARTITULARptpatrDireccionCompleta);
            step11Request.setPersonaTCREARNATURALptpatrRural(personaTCREARTITULARptpatrRural);
            step11Request.setPersonaTCREARNATURALptTipoDireccionInstance(personaTCREARTITULARptTipoDireccion);
            step11Request.setPersonaTCREARNATURALpCodigo(personaTCREARTITULARptpCodigo);
            step11Request.setPersonaTCREARNATURALpDCDireccionCompleta(null);
            step11Request.setPersonaTCREARNATURALpDCDepartamentoInstance(null);
            step11Request.setPersonaTCREARNATURALpDCMunicipioInstance(null);
            step11Request.setPersonaTCREARNATURALpDCRural(null);
            step11Request.setPersonaTCREARNATURALpDCTelefonoFijo(null);
            step11Request.setPersonaTCREARNATURALpDCTelefonoCelular(null);
            step11Request.setPersonaTCREARNATURALpDCTipoDireccionInstance(null);
            step11Request.setPersonaTCREARNATURALpDCPaisInstance(null);
            step11Request.setPersonaTCREARNATURALptValidarDatos(personaTCREARTITULARptValidarDatos);
            step11Request.setPersonaTCREARNATURALptEstadoPersonaInstance(personaTCREARTITULARptEstadoPersona);
            step11Request.setPersonaTCREARNATURALptSolicitudInstance(personaTCREARTITULARptSolicitud);
            instance = (Persona) personaSrv.tCREARNATURALImplementation(step11Request).getInstance();
        }

        com.keralty.aepersonas.viewmodel.persona.siu.RegistrarDatosCORERequest step2Request = new com.keralty.aepersonas.viewmodel.persona.siu.RegistrarDatosCORERequest();
        step2Request.setPersonaregistrarDatosCOREpthisPersonaInstance(instance);
        step2Request.setPersonaregistrarDatosCOREpCodigo(personaTCREARTITULARptpCodigo);
        step2Request.setPersonaregistrarDatosCOREpTieneEPSSanitas(personaTCREARTITULARptpTieneEPSSanitas);
        step2Request.setPersonaregistrarDatosCOREpRechazadoAfiliacion(personaTCREARTITULARptpRechazadoAfiliacion);
        personaSrv.registrarDatosCOREImplementation(step2Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        // Value expressions for outgoing argument 'personaTCREARTITULARpsPersona'
        // DEFAULT  : THIS
        response.setPersonaTCREARTITULARpsPersonaInstance(instance);


        return response;
    }

    // Service: TADDUSUARIOASOL

    /*
     * Entry point for service TADDUSUARIOASOL
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tADDUSUARIOASOL(
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tADDUSUARIOASOLTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TADDUSUARIOASOL
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tADDUSUARIOASOLTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) throws ModelException, SystemException {
        request.setPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(new TipoIdentificacionOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrTipoIdentificacion())));
        request.setPersonaTADDUSUARIOASOLptpagrDepartamentoNacimientoInstance(departamentoSrv.getByOIDWithHV(new DepartamentoOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrDepartamentoNacimiento())));
        request.setPersonaTADDUSUARIOASOLptpagrMunicipioNacimientoInstance(municipioSrv.getByOIDWithHV(new MunicipioOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrMunicipioNacimiento())));
        request.setPersonaTADDUSUARIOASOLptpagrEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(new EstadoCivilOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrEstadoCivil())));
        request.setPersonaTADDUSUARIOASOLptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(new DepartamentoOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrDepartamento())));
        request.setPersonaTADDUSUARIOASOLptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(new MunicipioOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrMunicipio())));
        request.setPersonaTADDUSUARIOASOLptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTADDUSUARIOASOLptpagrPais()));
        request.setPersonaTADDUSUARIOASOLptSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaTADDUSUARIOASOLptSolicitud()));
        request.setPersonaTADDUSUARIOASOLptDireccionesTitularInstance(direccionSrv.getByOIDWithHV(new DireccionOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptDireccionesTitular())));
        request.setPersonaTADDUSUARIOASOLptEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaTADDUSUARIOASOLptEstadoPersona()));
        return personaSrv.tADDUSUARIOASOLImplementation(request);
    }

    /*
     * Implements service TADDUSUARIOASOL
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tADDUSUARIOASOLImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion = request.getPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance();
        Departamento personaTADDUSUARIOASOLptpagrDepartamentoNacimiento = request.getPersonaTADDUSUARIOASOLptpagrDepartamentoNacimientoInstance();
        Municipio personaTADDUSUARIOASOLptpagrMunicipioNacimiento = request.getPersonaTADDUSUARIOASOLptpagrMunicipioNacimientoInstance();
        EstadoCivil personaTADDUSUARIOASOLptpagrEstadoCivil = request.getPersonaTADDUSUARIOASOLptpagrEstadoCivilInstance();
        String personaTADDUSUARIOASOLptpatrNumIdentificacion = request.getPersonaTADDUSUARIOASOLptpatrNumIdentificacion();
        String personaTADDUSUARIOASOLptpatrPrimerNombre = request.getPersonaTADDUSUARIOASOLptpatrPrimerNombre();
        String personaTADDUSUARIOASOLptpatrSegundoNombre = request.getPersonaTADDUSUARIOASOLptpatrSegundoNombre();
        String personaTADDUSUARIOASOLptpatrPrimerApellido = request.getPersonaTADDUSUARIOASOLptpatrPrimerApellido();
        String personaTADDUSUARIOASOLptpatrSegundoApellido = request.getPersonaTADDUSUARIOASOLptpatrSegundoApellido();
        Date personaTADDUSUARIOASOLptpatrFechaNacimiento = request.getPersonaTADDUSUARIOASOLptpatrFechaNacimiento();
        String personaTADDUSUARIOASOLptpatrGenero = request.getPersonaTADDUSUARIOASOLptpatrGenero();
        Boolean personaTADDUSUARIOASOLptpatrIndicadorExtranjero = request.getPersonaTADDUSUARIOASOLptpatrIndicadorExtranjero();
        String personaTADDUSUARIOASOLptpatrTelefonoFijo = request.getPersonaTADDUSUARIOASOLptpatrTelefonoFijo();
        String personaTADDUSUARIOASOLptpatrTelefonoCelular = request.getPersonaTADDUSUARIOASOLptpatrTelefonoCelular();
        String personaTADDUSUARIOASOLptpatrCorreoElectronico = request.getPersonaTADDUSUARIOASOLptpatrCorreoElectronico();
        Departamento personaTADDUSUARIOASOLptpagrDepartamento = request.getPersonaTADDUSUARIOASOLptpagrDepartamentoInstance();
        Municipio personaTADDUSUARIOASOLptpagrMunicipio = request.getPersonaTADDUSUARIOASOLptpagrMunicipioInstance();
        String personaTADDUSUARIOASOLptpatrDireccionCompleta = request.getPersonaTADDUSUARIOASOLptpatrDireccionCompleta();
        Boolean personaTADDUSUARIOASOLptpatrRural = request.getPersonaTADDUSUARIOASOLptpatrRural();
        Long personaTADDUSUARIOASOLptpCodigo = request.getPersonaTADDUSUARIOASOLptpCodigo();
        Boolean personaTADDUSUARIOASOLptpTieneEPSSanitas = request.getPersonaTADDUSUARIOASOLptpTieneEPSSanitas();
        String personaTADDUSUARIOASOLptpRechazadoAfiliacion = request.getPersonaTADDUSUARIOASOLptpRechazadoAfiliacion();
        Pais personaTADDUSUARIOASOLptpagrPais = request.getPersonaTADDUSUARIOASOLptpagrPaisInstance();
        Solicitud personaTADDUSUARIOASOLptSolicitud = request.getPersonaTADDUSUARIOASOLptSolicitudInstance();
        EstadoPersona personaTADDUSUARIOASOLptEstadoPersona = request.getPersonaTADDUSUARIOASOLptEstadoPersonaInstance();

        request.checkArguments();

        tADDUSUARIOASOLPreconditions(request);
        Persona instance;

        com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest step1Request = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest();
        step1Request.setPersonaTCREARUSUARIOptpagrTipoIdentificacionInstance(personaTADDUSUARIOASOLptpagrTipoIdentificacion);
        step1Request.setPersonaTCREARUSUARIOptpagrDepartamentoNacimientoInstance(personaTADDUSUARIOASOLptpagrDepartamentoNacimiento);
        step1Request.setPersonaTCREARUSUARIOptpagrMunicipioNacimientoInstance(personaTADDUSUARIOASOLptpagrMunicipioNacimiento);
        step1Request.setPersonaTCREARUSUARIOptpagrEstadoCivilInstance(personaTADDUSUARIOASOLptpagrEstadoCivil);
        step1Request.setPersonaTCREARUSUARIOptpatrNumIdentificacion(personaTADDUSUARIOASOLptpatrNumIdentificacion);
        step1Request.setPersonaTCREARUSUARIOptpatrPrimerNombre(personaTADDUSUARIOASOLptpatrPrimerNombre);
        step1Request.setPersonaTCREARUSUARIOptpatrSegundoNombre(personaTADDUSUARIOASOLptpatrSegundoNombre);
        step1Request.setPersonaTCREARUSUARIOptpatrPrimerApellido(personaTADDUSUARIOASOLptpatrPrimerApellido);
        step1Request.setPersonaTCREARUSUARIOptpatrSegundoApellido(personaTADDUSUARIOASOLptpatrSegundoApellido);
        step1Request.setPersonaTCREARUSUARIOptpatrFechaNacimiento(personaTADDUSUARIOASOLptpatrFechaNacimiento);
        step1Request.setPersonaTCREARUSUARIOptpatrGenero(personaTADDUSUARIOASOLptpatrGenero);
        step1Request.setPersonaTCREARUSUARIOptpatrIndicadorExtranjero(personaTADDUSUARIOASOLptpatrIndicadorExtranjero);
        step1Request.setPersonaTCREARUSUARIOptpatrTelefonoFijo(personaTADDUSUARIOASOLptpatrTelefonoFijo);
        step1Request.setPersonaTCREARUSUARIOptpatrTelefonoCelular(personaTADDUSUARIOASOLptpatrTelefonoCelular);
        step1Request.setPersonaTCREARUSUARIOptpatrCorreoElectronico(personaTADDUSUARIOASOLptpatrCorreoElectronico);
        step1Request.setPersonaTCREARUSUARIOptpagrDepartamentoInstance(personaTADDUSUARIOASOLptpagrDepartamento);
        step1Request.setPersonaTCREARUSUARIOptpagrMunicipioInstance(personaTADDUSUARIOASOLptpagrMunicipio);
        step1Request.setPersonaTCREARUSUARIOptpatrDireccionCompleta(personaTADDUSUARIOASOLptpatrDireccionCompleta);
        step1Request.setPersonaTCREARUSUARIOptpatrRural(personaTADDUSUARIOASOLptpatrRural);
        step1Request.setPersonaTCREARUSUARIOptTipoDireccionInstance(userFunctionsSrv.fugetTipoDirResidencialFun());
        step1Request.setPersonaTCREARUSUARIOptpCodigo(personaTADDUSUARIOASOLptpCodigo);
        step1Request.setPersonaTCREARUSUARIOptpTieneEPSSanitas(personaTADDUSUARIOASOLptpTieneEPSSanitas);
        step1Request.setPersonaTCREARUSUARIOptpRechazadoAfiliacion(personaTADDUSUARIOASOLptpRechazadoAfiliacion);
        step1Request.setPersonaTCREARUSUARIOptpagrPaisInstance(personaTADDUSUARIOASOLptpagrPais);
        step1Request.setPersonaTCREARUSUARIOptCheckTipoRegimen(userFunctionsSrv.fuCheckRegimenSubsidiadoFun(personaTADDUSUARIOASOLptpagrTipoIdentificacion.getTipoIdentificacionNombreCorto(), personaTADDUSUARIOASOLptpatrNumIdentificacion, personaTADDUSUARIOASOLptSolicitud.getAesolicitudes().getAesolicitudesNumerosolicitud(), personaTADDUSUARIOASOLptSolicitud.getAesolicitudes().getPlanT().getPlanesEsVoluntario()));
        step1Request.setPersonaTCREARUSUARIOptValidarDatos(Boolean.TRUE);
        step1Request.setPersonaTCREARUSUARIOptEstadoPersonaInstance(personaTADDUSUARIOASOLptEstadoPersona);
        step1Request.setPersonaTCREARUSUARIOptSolicitudInstance(personaTADDUSUARIOASOLptSolicitud);
        instance = (Persona) personaSrv.tCREARUSUARIOImplementation(step1Request).getInstance();

        com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest step2Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest();
        step2Request.setUsuarioTCREARptpagrSolicitudInstance(personaTADDUSUARIOASOLptSolicitud);
        step2Request.setUsuarioTCREARptpagrUsuarioInstance(instance);
        step2Request.setUsuarioTCREARptpagrParentescoInstance(null);
        step2Request.setUsuarioTCREARptpatrCodigoTipoUsuario(Long.valueOf(1));
        step2Request.setUsuarioTCREARptpatrBebeGestante(Boolean.FALSE);
        step2Request.setUsuarioTCREARptpatrcodigoBancoRep(null);
        step2Request.setUsuarioTCREARptpatrUsuarioReplicado(Boolean.FALSE);
        usuarioSrv.tCREARImplementation(step2Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    /*
     * Checks service TADDUSUARIOASOL preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    public ServiceResponse tADDUSUARIOASOLCheckPreconditions(com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) {
        ServiceResponse response = new ServiceResponse();
        request.setPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(new TipoIdentificacionOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrTipoIdentificacion())));
        request.setPersonaTADDUSUARIOASOLptpagrDepartamentoNacimientoInstance(departamentoSrv.getByOIDWithHV(new DepartamentoOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrDepartamentoNacimiento())));
        request.setPersonaTADDUSUARIOASOLptpagrMunicipioNacimientoInstance(municipioSrv.getByOIDWithHV(new MunicipioOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrMunicipioNacimiento())));
        request.setPersonaTADDUSUARIOASOLptpagrEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(new EstadoCivilOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrEstadoCivil())));
        request.setPersonaTADDUSUARIOASOLptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(new DepartamentoOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrDepartamento())));
        request.setPersonaTADDUSUARIOASOLptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(new MunicipioOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptpagrMunicipio())));
        request.setPersonaTADDUSUARIOASOLptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTADDUSUARIOASOLptpagrPais()));
        request.setPersonaTADDUSUARIOASOLptSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaTADDUSUARIOASOLptSolicitud()));
        request.setPersonaTADDUSUARIOASOLptDireccionesTitularInstance(direccionSrv.getByOIDWithHV(new DireccionOid().fromJsonString(request.getPersonaTADDUSUARIOASOLptDireccionesTitular())));
        request.setPersonaTADDUSUARIOASOLptEstadoPersonaInstance(estadoPersonaSrv.getByOIDWithHV(request.getPersonaTADDUSUARIOASOLptEstadoPersona()));
        try {
            if("Clas_1431886233600805Pre_90".equals(request.getPreconditionId()))
                checkClas1431886233600805Pre90(request);
            if("Clas_1431886233600805Pre_82".equals(request.getPreconditionId()))
                checkClas1431886233600805Pre82(request);
            if("Clas_1431886233600805Pre_76".equals(request.getPreconditionId()))
                checkClas1431886233600805Pre76(request);
            if("Clas_1431886233600805Pre_77".equals(request.getPreconditionId()))
                checkClas1431886233600805Pre77(request);
            if("Clas_1431886233600805Pre_78".equals(request.getPreconditionId()))
                checkClas1431886233600805Pre78(request);
            if("Clas_1431886233600805Pre_85".equals(request.getPreconditionId()))
                checkClas1431886233600805Pre85(request);
            if("Clas_1431886233600805Pre_92".equals(request.getPreconditionId()))
                checkClas1431886233600805Pre92(request);
            if("Clas_1431886233600805Pre_95".equals(request.getPreconditionId()))
                checkClas1431886233600805Pre95(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void tADDUSUARIOASOLPreconditions(
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) 
            throws ModelException {
        checkClas1431886233600805Pre90(request);
        checkClas1431886233600805Pre82(request);
        checkClas1431886233600805Pre76(request);
        checkClas1431886233600805Pre77(request);
        checkClas1431886233600805Pre78(request);
        checkClas1431886233600805Pre85(request);
        checkClas1431886233600805Pre92(request);
        checkClas1431886233600805Pre95(request);
    }

    private void checkClas1431886233600805Pre90 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) 
            throws ModelException {
        // ptpagrTipoIdentificacion.NIT = true OR ptpatrIndicadorExtranjero = true OR (ptpagrDepartamentoNacimiento <> NULL AND ptpagrMunicipioNacimiento <> NULL)

        TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion = request.getPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance();
        Boolean personaTADDUSUARIOASOLptpatrIndicadorExtranjero = request.getPersonaTADDUSUARIOASOLptpatrIndicadorExtranjero();
        Departamento personaTADDUSUARIOASOLptpagrDepartamentoNacimiento = request.getPersonaTADDUSUARIOASOLptpagrDepartamentoNacimientoInstance();
        Municipio personaTADDUSUARIOASOLptpagrMunicipioNacimiento = request.getPersonaTADDUSUARIOASOLptpagrMunicipioNacimientoInstance();
        boolean preconditionHolds = personaTADDUSUARIOASOLptpagrTipoIdentificacion.getTipoIdentificacionNIT().equals(true) || personaTADDUSUARIOASOLptpatrIndicadorExtranjero.equals(true) || ((personaTADDUSUARIOASOLptpagrDepartamentoNacimiento != null && !personaTADDUSUARIOASOLptpagrDepartamentoNacimiento.isNull()) && (personaTADDUSUARIOASOLptpagrMunicipioNacimiento != null && !personaTADDUSUARIOASOLptpagrMunicipioNacimiento.isNull()));
        if (!preconditionHolds) throw new PreconditionException("Debe diligenciar el Departamento y Municipio de nacimiento");
    }

    private void checkClas1431886233600805Pre82 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) 
            throws ModelException {
        // ptSolicitud.drvPermiteRechazados = true OR ptpRechazadoAfiliacion = NULL OR ptpRechazadoAfiliacion = ""

        Solicitud personaTADDUSUARIOASOLptSolicitud = request.getPersonaTADDUSUARIOASOLptSolicitudInstance();
        String personaTADDUSUARIOASOLptpRechazadoAfiliacion = request.getPersonaTADDUSUARIOASOLptpRechazadoAfiliacion();
        boolean preconditionHolds = personaTADDUSUARIOASOLptSolicitud.getSolicituddrvPermiteRechazados().equals(true) || personaTADDUSUARIOASOLptpRechazadoAfiliacion == null || (personaTADDUSUARIOASOLptpRechazadoAfiliacion).length() == 0;
        if (!preconditionHolds) throw new PreconditionException("La persona seleccionada está rechazada en afiliación, no puede añadirse como usuario");
    }

    private void checkClas1431886233600805Pre76 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) 
            throws ModelException {
        // EXIST( ptSolicitud.Usuarios ) WHERE (ptSolicitud.Usuarios.TipoIdentificacion = ptpagrTipoIdentificacion AND ptSolicitud.Usuarios.NumIdentificacion = ptpatrNumIdentificacion) = false AND EXIST( ptSolicitud.UsuariosRegistrados ) WHERE (ptSolicitud.UsuariosRegistrados.TipoIdentificacion = ptpagrTipoIdentificacion.NombreCorto AND ptSolicitud.UsuariosRegistrados.NumIdentificacion = ptpatrNumIdentificacion AND (ptSolicitud.UsuariosRegistrados.EstadoBeneficiario.EsActivo = true OR ptSolicitud.UsuariosRegistrados.EstadoBeneficiario.EsError = true)) = false

        Solicitud personaTADDUSUARIOASOLptSolicitud = request.getPersonaTADDUSUARIOASOLptSolicitudInstance();
        TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion = request.getPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance();
        String personaTADDUSUARIOASOLptpatrNumIdentificacion = request.getPersonaTADDUSUARIOASOLptpatrNumIdentificacion();
        try {
            boolean preconditionHolds = repository.assocOperator006(personaTADDUSUARIOASOLptSolicitud, personaTADDUSUARIOASOLptpagrTipoIdentificacion, personaTADDUSUARIOASOLptpatrNumIdentificacion).equals(false) && repository.assocOperator007(personaTADDUSUARIOASOLptSolicitud, personaTADDUSUARIOASOLptpagrTipoIdentificacion, personaTADDUSUARIOASOLptpatrNumIdentificacion).equals(false);
            if (!preconditionHolds) throw new PreconditionException("La persona seleccionada ya está añadida como usuario");
        } catch (SystemException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    private void checkClas1431886233600805Pre77 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) 
            throws ModelException {
        // ptSolicitud.drvYaTieneContratante = true

        Solicitud personaTADDUSUARIOASOLptSolicitud = request.getPersonaTADDUSUARIOASOLptSolicitudInstance();
        boolean preconditionHolds = personaTADDUSUARIOASOLptSolicitud.getSolicituddrvYaTieneContratante().equals(true);
        if (!preconditionHolds) throw new PreconditionException("Debe indicar primero el contratante de la solicitud");
    }

    private void checkClas1431886233600805Pre78 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) 
            throws ModelException {
        // ptSolicitud.drvYaTieneTitular = true OR ptSolicitud.Tramite = 2

        Solicitud personaTADDUSUARIOASOLptSolicitud = request.getPersonaTADDUSUARIOASOLptSolicitudInstance();
        boolean preconditionHolds = personaTADDUSUARIOASOLptSolicitud.getSolicituddrvYaTieneTitular().equals(true) || (personaTADDUSUARIOASOLptSolicitud.getSolicitudTramite()).equals(Long.valueOf(2));
        if (!preconditionHolds) throw new PreconditionException("Debe indicar primero el titular de la solicitud");
    }

    private void checkClas1431886233600805Pre85 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) 
            throws ModelException {
        // ptEstadoPersona = NULL OR ptEstadoPersona.ProhibidoBeneficiarios = false

        EstadoPersona personaTADDUSUARIOASOLptEstadoPersona = request.getPersonaTADDUSUARIOASOLptEstadoPersonaInstance();
        boolean preconditionHolds = (personaTADDUSUARIOASOLptEstadoPersona == null || personaTADDUSUARIOASOLptEstadoPersona.isNull()) || personaTADDUSUARIOASOLptEstadoPersona.getEstadoPersonaProhibidoBeneficiarios().equals(false);
        if (!preconditionHolds) throw new PreconditionException("La persona seleccionada tiene un estado no válido para Beneficiario");
    }

    private void checkClas1431886233600805Pre92 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) 
            throws ModelException {
        // ptpTieneEPSSanitas = false OR ptpagrMunicipio.EsValidoEPS = true

        Boolean personaTADDUSUARIOASOLptpTieneEPSSanitas = request.getPersonaTADDUSUARIOASOLptpTieneEPSSanitas();
        Municipio personaTADDUSUARIOASOLptpagrMunicipio = request.getPersonaTADDUSUARIOASOLptpagrMunicipioInstance();
        boolean preconditionHolds = personaTADDUSUARIOASOLptpTieneEPSSanitas.equals(false) || personaTADDUSUARIOASOLptpagrMunicipio.getMunicipioEsValidoEPS().equals(true);
        if (!preconditionHolds) throw new PreconditionException("El municipio de residencia diligenciado no es válido para EPS Sanitas");
    }

    private void checkClas1431886233600805Pre95 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIOASOLRequest request) 
            throws ModelException {
        // fuValidarDominioIncompatibles(ptpagrTipoIdentificacion.NombreCorto, ptpatrNumIdentificacion, ptSolicitud.FInicioContrato, ptSolicitud) = true

        TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion = request.getPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance();
        String personaTADDUSUARIOASOLptpatrNumIdentificacion = request.getPersonaTADDUSUARIOASOLptpatrNumIdentificacion();
        Solicitud personaTADDUSUARIOASOLptSolicitud = request.getPersonaTADDUSUARIOASOLptSolicitudInstance();
        boolean preconditionHolds = userFunctionsSrv.fuValidarDominioIncompatiblesFun(personaTADDUSUARIOASOLptpagrTipoIdentificacion.getTipoIdentificacionNombreCorto(), personaTADDUSUARIOASOLptpatrNumIdentificacion, personaTADDUSUARIOASOLptSolicitud.getSolicitudFInicioContrato(), personaTADDUSUARIOASOLptSolicitud).equals(true);
        if (!preconditionHolds) throw new PreconditionException("El usuario actualmente se encuentra activo en este plan, por favor valida la fecha de ingreso o tramita la novedad correspondiente para continuar con el proceso de afiliación");
    }

    // Service: TADDUSUARIODECONTASOC

    /*
     * Entry point for service TADDUSUARIODECONTASOC
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tADDUSUARIODECONTASOC(
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tADDUSUARIODECONTASOCTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TADDUSUARIODECONTASOC
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tADDUSUARIODECONTASOCTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest request) throws ModelException, SystemException {
        request.setPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacion()));
        request.setPersonaTADDUSUARIODECONTASOCptpagrDepartamentoNacimientoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento()));
        request.setPersonaTADDUSUARIODECONTASOCptpagrMunicipioNacimientoInstance(municipioSrv.getByOIDWithHV(request.getPersonaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento()));
        request.setPersonaTADDUSUARIODECONTASOCptpagrEstadoCivilInstance(estadoCivilSrv.getByOIDWithHV(request.getPersonaTADDUSUARIODECONTASOCptpagrEstadoCivil()));
        request.setPersonaTADDUSUARIODECONTASOCptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTADDUSUARIODECONTASOCptpagrDepartamento()));
        request.setPersonaTADDUSUARIODECONTASOCptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTADDUSUARIODECONTASOCptpagrMunicipio()));
        request.setPersonaTADDUSUARIODECONTASOCptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTADDUSUARIODECONTASOCptpagrPais()));
        request.setPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaTADDUSUARIODECONTASOCptpagrSolicitud()));
        request.setPersonaTADDUSUARIODECONTASOCptpagrParentescoInstance(parentescoSrv.getByOIDWithHV(request.getPersonaTADDUSUARIODECONTASOCptpagrParentesco()));
        return personaSrv.tADDUSUARIODECONTASOCImplementation(request);
    }

    /*
     * Implements service TADDUSUARIODECONTASOC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tADDUSUARIODECONTASOCImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion = request.getPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance();
        Departamento personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento = request.getPersonaTADDUSUARIODECONTASOCptpagrDepartamentoNacimientoInstance();
        Municipio personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento = request.getPersonaTADDUSUARIODECONTASOCptpagrMunicipioNacimientoInstance();
        EstadoCivil personaTADDUSUARIODECONTASOCptpagrEstadoCivil = request.getPersonaTADDUSUARIODECONTASOCptpagrEstadoCivilInstance();
        String personaTADDUSUARIODECONTASOCptpatrNumIdentificacion = request.getPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion();
        String personaTADDUSUARIODECONTASOCptpatrPrimerNombre = request.getPersonaTADDUSUARIODECONTASOCptpatrPrimerNombre();
        String personaTADDUSUARIODECONTASOCptpatrSegundoNombre = request.getPersonaTADDUSUARIODECONTASOCptpatrSegundoNombre();
        String personaTADDUSUARIODECONTASOCptpatrPrimerApellido = request.getPersonaTADDUSUARIODECONTASOCptpatrPrimerApellido();
        String personaTADDUSUARIODECONTASOCptpatrSegundoApellido = request.getPersonaTADDUSUARIODECONTASOCptpatrSegundoApellido();
        Date personaTADDUSUARIODECONTASOCptpatrFechaNacimiento = request.getPersonaTADDUSUARIODECONTASOCptpatrFechaNacimiento();
        String personaTADDUSUARIODECONTASOCptpatrGenero = request.getPersonaTADDUSUARIODECONTASOCptpatrGenero();
        Boolean personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero = request.getPersonaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero();
        String personaTADDUSUARIODECONTASOCptpatrTelefonoFijo = request.getPersonaTADDUSUARIODECONTASOCptpatrTelefonoFijo();
        String personaTADDUSUARIODECONTASOCptpatrTelefonoCelular = request.getPersonaTADDUSUARIODECONTASOCptpatrTelefonoCelular();
        String personaTADDUSUARIODECONTASOCptpatrCorreoElectronico = request.getPersonaTADDUSUARIODECONTASOCptpatrCorreoElectronico();
        Departamento personaTADDUSUARIODECONTASOCptpagrDepartamento = request.getPersonaTADDUSUARIODECONTASOCptpagrDepartamentoInstance();
        Municipio personaTADDUSUARIODECONTASOCptpagrMunicipio = request.getPersonaTADDUSUARIODECONTASOCptpagrMunicipioInstance();
        String personaTADDUSUARIODECONTASOCptpatrDireccionCompleta = request.getPersonaTADDUSUARIODECONTASOCptpatrDireccionCompleta();
        Boolean personaTADDUSUARIODECONTASOCptpatrRural = request.getPersonaTADDUSUARIODECONTASOCptpatrRural();
        Long personaTADDUSUARIODECONTASOCptpCodigo = request.getPersonaTADDUSUARIODECONTASOCptpCodigo();
        Boolean personaTADDUSUARIODECONTASOCptpTieneEPSSanitas = request.getPersonaTADDUSUARIODECONTASOCptpTieneEPSSanitas();
        String personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion = request.getPersonaTADDUSUARIODECONTASOCptpRechazadoAfiliacion();
        Pais personaTADDUSUARIODECONTASOCptpagrPais = request.getPersonaTADDUSUARIODECONTASOCptpagrPaisInstance();
        Solicitud personaTADDUSUARIODECONTASOCptpagrSolicitud = request.getPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance();
        Parentesco personaTADDUSUARIODECONTASOCptpagrParentesco = request.getPersonaTADDUSUARIODECONTASOCptpagrParentescoInstance();
        Boolean personaTADDUSUARIODECONTASOCptpatrBebeGestante = request.getPersonaTADDUSUARIODECONTASOCptpatrBebeGestante();
        String personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep = request.getPersonaTADDUSUARIODECONTASOCptpatrcodigoBancoRep();

        request.checkArguments();

        tADDUSUARIODECONTASOCPreconditions(request);
        Persona instance;

        com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest step1Request = new com.keralty.aepersonas.viewmodel.persona.siu.TCREARUSUARIORequest();
        step1Request.setPersonaTCREARUSUARIOptpagrTipoIdentificacionInstance(personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion);
        step1Request.setPersonaTCREARUSUARIOptpagrDepartamentoNacimientoInstance(personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento);
        step1Request.setPersonaTCREARUSUARIOptpagrMunicipioNacimientoInstance(personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento);
        step1Request.setPersonaTCREARUSUARIOptpagrEstadoCivilInstance(personaTADDUSUARIODECONTASOCptpagrEstadoCivil);
        step1Request.setPersonaTCREARUSUARIOptpatrNumIdentificacion(personaTADDUSUARIODECONTASOCptpatrNumIdentificacion);
        step1Request.setPersonaTCREARUSUARIOptpatrPrimerNombre(personaTADDUSUARIODECONTASOCptpatrPrimerNombre);
        step1Request.setPersonaTCREARUSUARIOptpatrSegundoNombre(personaTADDUSUARIODECONTASOCptpatrSegundoNombre);
        step1Request.setPersonaTCREARUSUARIOptpatrPrimerApellido(personaTADDUSUARIODECONTASOCptpatrPrimerApellido);
        step1Request.setPersonaTCREARUSUARIOptpatrSegundoApellido(personaTADDUSUARIODECONTASOCptpatrSegundoApellido);
        step1Request.setPersonaTCREARUSUARIOptpatrFechaNacimiento(personaTADDUSUARIODECONTASOCptpatrFechaNacimiento);
        step1Request.setPersonaTCREARUSUARIOptpatrGenero(personaTADDUSUARIODECONTASOCptpatrGenero);
        step1Request.setPersonaTCREARUSUARIOptpatrIndicadorExtranjero(personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero);
        step1Request.setPersonaTCREARUSUARIOptpatrTelefonoFijo(personaTADDUSUARIODECONTASOCptpatrTelefonoFijo);
        step1Request.setPersonaTCREARUSUARIOptpatrTelefonoCelular(personaTADDUSUARIODECONTASOCptpatrTelefonoCelular);
        step1Request.setPersonaTCREARUSUARIOptpatrCorreoElectronico(personaTADDUSUARIODECONTASOCptpatrCorreoElectronico);
        step1Request.setPersonaTCREARUSUARIOptpagrDepartamentoInstance(personaTADDUSUARIODECONTASOCptpagrDepartamento);
        step1Request.setPersonaTCREARUSUARIOptpagrMunicipioInstance(personaTADDUSUARIODECONTASOCptpagrMunicipio);
        step1Request.setPersonaTCREARUSUARIOptpatrDireccionCompleta(personaTADDUSUARIODECONTASOCptpatrDireccionCompleta);
        step1Request.setPersonaTCREARUSUARIOptpatrRural(personaTADDUSUARIODECONTASOCptpatrRural);
        step1Request.setPersonaTCREARUSUARIOptTipoDireccionInstance(userFunctionsSrv.fugetTipoDirResidencialFun());
        step1Request.setPersonaTCREARUSUARIOptpCodigo(personaTADDUSUARIODECONTASOCptpCodigo);
        step1Request.setPersonaTCREARUSUARIOptpTieneEPSSanitas(personaTADDUSUARIODECONTASOCptpTieneEPSSanitas);
        step1Request.setPersonaTCREARUSUARIOptpRechazadoAfiliacion(personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion);
        step1Request.setPersonaTCREARUSUARIOptpagrPaisInstance(personaTADDUSUARIODECONTASOCptpagrPais);
        step1Request.setPersonaTCREARUSUARIOptCheckTipoRegimen(userFunctionsSrv.fuCheckRegimenSubsidiadoFun(personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion.getTipoIdentificacionNombreCorto(), personaTADDUSUARIODECONTASOCptpatrNumIdentificacion, personaTADDUSUARIODECONTASOCptpagrSolicitud.getAesolicitudes().getAesolicitudesNumerosolicitud(), personaTADDUSUARIODECONTASOCptpagrSolicitud.getAesolicitudes().getPlanT().getPlanesEsVoluntario()));
        step1Request.setPersonaTCREARUSUARIOptValidarDatos(Boolean.FALSE);
        step1Request.setPersonaTCREARUSUARIOptEstadoPersonaInstance(null);
        step1Request.setPersonaTCREARUSUARIOptSolicitudInstance(personaTADDUSUARIODECONTASOCptpagrSolicitud);
        instance = (Persona) personaSrv.tCREARUSUARIOImplementation(step1Request).getInstance();

        com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest step2Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TCREARRequest();
        step2Request.setUsuarioTCREARptpagrSolicitudInstance(personaTADDUSUARIODECONTASOCptpagrSolicitud);
        step2Request.setUsuarioTCREARptpagrUsuarioInstance(instance);
        step2Request.setUsuarioTCREARptpagrParentescoInstance(personaTADDUSUARIODECONTASOCptpagrParentesco);
        step2Request.setUsuarioTCREARptpatrCodigoTipoUsuario(Long.valueOf(1));
        step2Request.setUsuarioTCREARptpatrBebeGestante(personaTADDUSUARIODECONTASOCptpatrBebeGestante);
        step2Request.setUsuarioTCREARptpatrcodigoBancoRep(personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep);
        step2Request.setUsuarioTCREARptpatrUsuarioReplicado(Boolean.TRUE);
        usuarioSrv.tCREARImplementation(step2Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    private void tADDUSUARIODECONTASOCPreconditions(
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest request) 
            throws ModelException {
        checkClas1431886233600805Pre79(request);
        checkClas1431886233600805Pre80(request);
    }

    private void checkClas1431886233600805Pre79 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest request) 
            throws ModelException {
        // ptParaContratante = false OR ptpagrSolicitud.Contratante.TipoIdentificacion <> ptpagrTipoIdentificacion OR ptpagrSolicitud.Contratante.NumIdentificacion <> ptpatrNumIdentificacion

        Boolean personaTADDUSUARIODECONTASOCptParaContratante = request.getPersonaTADDUSUARIODECONTASOCptParaContratante();
        Solicitud personaTADDUSUARIODECONTASOCptpagrSolicitud = request.getPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance();
        TipoIdentificacion personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion = request.getPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance();
        String personaTADDUSUARIODECONTASOCptpatrNumIdentificacion = request.getPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion();
        boolean preconditionHolds = personaTADDUSUARIODECONTASOCptParaContratante.equals(false) || !(personaTADDUSUARIODECONTASOCptpagrSolicitud.getContratante().getTipoIdentificacion().equalsObject(personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion)) || !(personaTADDUSUARIODECONTASOCptpagrSolicitud.getContratante().getContratanteNumIdentificacion()).equals(personaTADDUSUARIODECONTASOCptpatrNumIdentificacion);
        if (!preconditionHolds) throw new PreconditionException("La persona seleccionada es el contratante de la solicitud");
    }

    private void checkClas1431886233600805Pre80 (
            com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest request) 
            throws ModelException {
        // ptParaContratante = true OR ptpagrSolicitud.Titular.TipoIdentificacion <> ptpagrTipoIdentificacion OR ptpagrSolicitud.Titular.NumIdentificacion <> ptpatrNumIdentificacion

        Boolean personaTADDUSUARIODECONTASOCptParaContratante = request.getPersonaTADDUSUARIODECONTASOCptParaContratante();
        Solicitud personaTADDUSUARIODECONTASOCptpagrSolicitud = request.getPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance();
        TipoIdentificacion personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion = request.getPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance();
        String personaTADDUSUARIODECONTASOCptpatrNumIdentificacion = request.getPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion();
        boolean preconditionHolds = personaTADDUSUARIODECONTASOCptParaContratante.equals(true) || !(personaTADDUSUARIODECONTASOCptpagrSolicitud.getTitular().getTipoIdentificacion().equalsObject(personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion)) || !(personaTADDUSUARIODECONTASOCptpagrSolicitud.getTitular().getTitularNumIdentificacion()).equals(personaTADDUSUARIODECONTASOCptpatrNumIdentificacion);
        if (!preconditionHolds) throw new PreconditionException("La persona seleccionada es el titular de la solicitud");
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
            com.keralty.aepersonas.viewmodel.persona.siu.TELIMINARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tELIMINARTxn(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.TELIMINARRequest request) throws ModelException, SystemException {
        request.setPersonaTELIMINARpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaTELIMINARpthisPersona()));
        request.setPersonaTELIMINARptUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getPersonaTELIMINARptUsuario()));
        return personaSrv.tELIMINARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.persona.siu.TELIMINARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Persona personaTELIMINARpthisPersona = request.getPersonaTELIMINARpthisPersonaInstance();

        request.checkArguments();

        tELIMINARPreconditions(request);
        Persona instance = personaTELIMINARpthisPersona;

        for(DocumentoG step1Entity : repository.assocOperator065(personaTELIMINARpthisPersona)) {
            com.keralty.aepersonas.viewmodel.documentog.siu.TELIMINARRequest step1Request = new com.keralty.aepersonas.viewmodel.documentog.siu.TELIMINARRequest();
            step1Request.setDocumentoGTELIMINARpthisDocumentoGInstance(step1Entity);
            documentoGSrv.tELIMINARImplementation(step1Request);
        }

        for(Usuario step2Entity : repository.assocOperator066(personaTELIMINARpthisPersona)) {
            com.keralty.aepersonas.viewmodel.usuario.siu.TELIMINARRequest step2Request = new com.keralty.aepersonas.viewmodel.usuario.siu.TELIMINARRequest();
            step2Request.setUsuarioTELIMINARpthisUsuarioInstance(step2Entity);
            usuarioSrv.tELIMINARImplementation(step2Request);
        }

        for(Direccion step3Entity : repository.assocOperator067(personaTELIMINARpthisPersona)) {
            com.keralty.aepersonas.viewmodel.direccion.siu.EliminarRequest step3Request = new com.keralty.aepersonas.viewmodel.direccion.siu.EliminarRequest();
            step3Request.setDireccioneliminarpthisDireccionInstance(step3Entity);
            direccionSrv.eliminarImplementation(step3Request);
        }

        com.keralty.aepersonas.viewmodel.persona.siu.EliminarRequest step4Request = new com.keralty.aepersonas.viewmodel.persona.siu.EliminarRequest();
        step4Request.setPersonaeliminarpthisPersonaInstance(personaTELIMINARpthisPersona);
        personaSrv.eliminarImplementation(step4Request);

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    /*
     * Checks service TELIMINAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    public ServiceResponse tELIMINARCheckPreconditions(com.keralty.aepersonas.viewmodel.persona.siu.TELIMINARRequest request) {
        ServiceResponse response = new ServiceResponse();
        request.setPersonaTELIMINARpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaTELIMINARpthisPersona()));
        request.setPersonaTELIMINARptUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getPersonaTELIMINARptUsuario()));
        try {
            if("Clas_1431886233600805Pre_96".equals(request.getPreconditionId()))
                checkClas1431886233600805Pre96(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void tELIMINARPreconditions(
            com.keralty.aepersonas.viewmodel.persona.siu.TELIMINARRequest request) 
            throws ModelException {
        checkClas1431886233600805Pre96(request);
    }

    private void checkClas1431886233600805Pre96 (
            com.keralty.aepersonas.viewmodel.persona.siu.TELIMINARRequest request) 
            throws ModelException {
        // Usuarios.Solicitud.drvTitularConBeneficios = FALSE OR Usuarios.drvEsElTitular = FALSE

        Persona personaTELIMINARpthisPersona = request.getPersonaTELIMINARpthisPersonaInstance();
        boolean preconditionHolds = personaTELIMINARpthisPersona.getUsuarios().getSolicitud().getSolicituddrvTitularConBeneficios().equals(false) || personaTELIMINARpthisPersona.getUsuarios().getUsuariodrvEsElTitular().equals(false);
        if (!preconditionHolds) throw new PreconditionException("No puede eliminar al titular porque se ha marcado 'Titular con beneficios'. Debe modificar el contratante de la solicitud");
    }

    // Service: TACTCODIGO

    /*
     * Entry point for service TACTCODIGO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tACTCODIGO(
            com.keralty.aepersonas.viewmodel.persona.siu.TACTCODIGORequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tACTCODIGOTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TACTCODIGO
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tACTCODIGOTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TACTCODIGORequest request) throws ModelException, SystemException {
        request.setPersonaTACTCODIGOpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaTACTCODIGOpthisPersona()));
        return personaSrv.tACTCODIGOImplementation(request);
    }

    /*
     * Implements service TACTCODIGO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tACTCODIGOImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TACTCODIGORequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Long personaTACTCODIGOptpCodigo = request.getPersonaTACTCODIGOptpCodigo();
        Persona personaTACTCODIGOpthisPersona = request.getPersonaTACTCODIGOpthisPersonaInstance();

        request.checkArguments();
        Persona instance = personaTACTCODIGOpthisPersona;

        com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest step1Request = new com.keralty.aepersonas.viewmodel.persona.siu.IndicarCodigoCORERequest();
        step1Request.setPersonaindicarCodigoCOREpthisPersonaInstance(personaTACTCODIGOpthisPersona);
        step1Request.setPersonaindicarCodigoCOREpCodigo(personaTACTCODIGOptpCodigo);
        personaSrv.indicarCodigoCOREImplementation(step1Request);

        for(Contratante step2Entity : repository.assocOperator068(personaTACTCODIGOpthisPersona)) {
            com.keralty.aepersonas.viewmodel.contratante.siu.ActualizarCodigoRequest step2Request = new com.keralty.aepersonas.viewmodel.contratante.siu.ActualizarCodigoRequest();
            step2Request.setContratanteactualizarCodigopthisContratanteInstance(step2Entity);
            step2Request.setContratanteactualizarCodigopCodigo(personaTACTCODIGOpthisPersona.getPersonaCodigo());
            contratanteSrv.actualizarCodigoImplementation(step2Request);
        }

        for(Titular step3Entity : repository.assocOperator069(personaTACTCODIGOpthisPersona)) {
            com.keralty.aepersonas.viewmodel.titular.siu.ActualizarCodigoRequest step3Request = new com.keralty.aepersonas.viewmodel.titular.siu.ActualizarCodigoRequest();
            step3Request.setTitularactualizarCodigopthisTitularInstance(step3Entity);
            step3Request.setTitularactualizarCodigopCodigo(personaTACTCODIGOpthisPersona.getPersonaCodigo());
            titularSrv.actualizarCodigoImplementation(step3Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: TMODDIRECCIONES

    /*
     * Entry point for service TMODDIRECCIONES
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tMODDIRECCIONES(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODDIRECCIONESRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tMODDIRECCIONESTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TMODDIRECCIONES
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tMODDIRECCIONESTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODDIRECCIONESRequest request) throws ModelException, SystemException {
        request.setPersonaTMODDIRECCIONESpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaTMODDIRECCIONESpthisPersona()));
        request.setPersonaTMODDIRECCIONESptpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTMODDIRECCIONESptpevcDepartamento()));
        request.setPersonaTMODDIRECCIONESptpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTMODDIRECCIONESptpevcMunicipio()));
        request.setPersonaTMODDIRECCIONESpDCDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getPersonaTMODDIRECCIONESpDCDepartamento()));
        request.setPersonaTMODDIRECCIONESpDCMunicipioInstance(municipioSrv.getByOIDWithHV(request.getPersonaTMODDIRECCIONESpDCMunicipio()));
        request.setPersonaTMODDIRECCIONESptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getPersonaTMODDIRECCIONESptpagrPais()));
        return personaSrv.tMODDIRECCIONESImplementation(request);
    }

    /*
     * Implements service TMODDIRECCIONES
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tMODDIRECCIONESImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TMODDIRECCIONESRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        String personaTMODDIRECCIONESptpTelefonoFijo = request.getPersonaTMODDIRECCIONESptpTelefonoFijo();
        String personaTMODDIRECCIONESptpTelefonoCelular = request.getPersonaTMODDIRECCIONESptpTelefonoCelular();
        String personaTMODDIRECCIONESptpDireccionCompleta = request.getPersonaTMODDIRECCIONESptpDireccionCompleta();
        Municipio personaTMODDIRECCIONESptpevcMunicipio = request.getPersonaTMODDIRECCIONESptpevcMunicipioInstance();
        Departamento personaTMODDIRECCIONESptpevcDepartamento = request.getPersonaTMODDIRECCIONESptpevcDepartamentoInstance();
        Pais personaTMODDIRECCIONESptpagrPais = request.getPersonaTMODDIRECCIONESptpagrPaisInstance();
        Boolean personaTMODDIRECCIONESptpRural = request.getPersonaTMODDIRECCIONESptpRural();
        String personaTMODDIRECCIONESpDCDireccionCompleta = request.getPersonaTMODDIRECCIONESpDCDireccionCompleta();
        Municipio personaTMODDIRECCIONESpDCMunicipio = request.getPersonaTMODDIRECCIONESpDCMunicipioInstance();
        Departamento personaTMODDIRECCIONESpDCDepartamento = request.getPersonaTMODDIRECCIONESpDCDepartamentoInstance();
        Boolean personaTMODDIRECCIONESpDCRural = request.getPersonaTMODDIRECCIONESpDCRural();
        Persona personaTMODDIRECCIONESpthisPersona = request.getPersonaTMODDIRECCIONESpthisPersonaInstance();

        request.checkArguments();
        Persona instance = personaTMODDIRECCIONESpthisPersona;

        com.keralty.aepersonas.viewmodel.persona.siu.CambiarTelefonosRequest step1Request = new com.keralty.aepersonas.viewmodel.persona.siu.CambiarTelefonosRequest();
        step1Request.setPersonacambiarTelefonospthisPersonaInstance(personaTMODDIRECCIONESpthisPersona);
        step1Request.setPersonacambiarTelefonospTelefonoFijo(personaTMODDIRECCIONESptpTelefonoFijo);
        step1Request.setPersonacambiarTelefonospTelefonoCelular(personaTMODDIRECCIONESptpTelefonoCelular);
        personaSrv.cambiarTelefonosImplementation(step1Request);

        /* Action 2: IF (ptpDireccionCompleta <> NULL) */
        boolean ifCondition2 = personaTMODDIRECCIONESptpDireccionCompleta != null;
        if (ifCondition2) {
            /* Action 20: IF (EXIST (Direcciones) WHERE (Direcciones.TipoDireccion.EsResidencia = true) = false) */
            boolean ifCondition20 = repository.assocOperator074(personaTMODDIRECCIONESpthisPersona).equals(false);
            if (ifCondition20) {
                com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest step200Request = new com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest();
                step200Request.setDireccionTCREARptpagrPersonaInstance(personaTMODDIRECCIONESpthisPersona);
                step200Request.setDireccionTCREARptpagrContratoInstance(null);
                step200Request.setDireccionTCREARptpagrTitularInstance(null);
                step200Request.setDireccionTCREARptpagrTipoDireccionInstance(userFunctionsSrv.fugetTipoDirResidencialFun());
                step200Request.setDireccionTCREARptpagrMunicipioInstance(personaTMODDIRECCIONESptpevcMunicipio);
                step200Request.setDireccionTCREARptpagrDepartamentoInstance(personaTMODDIRECCIONESptpevcDepartamento);
                step200Request.setDireccionTCREARptpagrPaisInstance(personaTMODDIRECCIONESptpagrPais);
                step200Request.setDireccionTCREARptpatrDireccionCompleta(personaTMODDIRECCIONESptpDireccionCompleta);
                step200Request.setDireccionTCREARptpatrRural(personaTMODDIRECCIONESptpRural);
                direccionSrv.tCREARImplementation(step200Request);
            } else {
                for(Direccion step2201Entity : repository.assocOperator071(personaTMODDIRECCIONESpthisPersona)) {
                    com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest step201Request = new com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest();
                    step201Request.setDireccionTMODIFICARpthisDireccionInstance(step2201Entity);
                    step201Request.setDireccionTMODIFICARptpDireccionCompleta(personaTMODDIRECCIONESptpDireccionCompleta);
                    step201Request.setDireccionTMODIFICARptpRural(personaTMODDIRECCIONESptpRural);
                    step201Request.setDireccionTMODIFICARptpevcDepartamentoInstance(personaTMODDIRECCIONESptpevcDepartamento);
                    step201Request.setDireccionTMODIFICARptpevcMunicipioInstance(personaTMODDIRECCIONESptpevcMunicipio);
                    step201Request.setDireccionTMODIFICARptpevcPaisInstance(personaTMODDIRECCIONESptpagrPais);
                    step201Request.setDireccionTMODIFICARptpevcTipoDireccionInstance(step2201Entity.getTipoDireccion());
                    direccionSrv.tMODIFICARImplementation(step201Request);
                }
            }
        }

        /* Action 3: IF (pDCDireccionCompleta <> NULL) */
        boolean ifCondition3 = personaTMODDIRECCIONESpDCDireccionCompleta != null;
        if (ifCondition3) {
            /* Action 30: IF (EXIST (Direcciones) WHERE (Direcciones.TipoDireccion.EsCorrespondencia = true) = false) */
            boolean ifCondition30 = repository.assocOperator075(personaTMODDIRECCIONESpthisPersona).equals(false);
            if (ifCondition30) {
                com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest step300Request = new com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest();
                step300Request.setDireccionTCREARptpagrPersonaInstance(personaTMODDIRECCIONESpthisPersona);
                step300Request.setDireccionTCREARptpagrContratoInstance(null);
                step300Request.setDireccionTCREARptpagrTitularInstance(null);
                step300Request.setDireccionTCREARptpagrTipoDireccionInstance(userFunctionsSrv.fugetTipoDirCorrespondenciaFun());
                step300Request.setDireccionTCREARptpagrMunicipioInstance(personaTMODDIRECCIONESpDCMunicipio);
                step300Request.setDireccionTCREARptpagrDepartamentoInstance(personaTMODDIRECCIONESpDCDepartamento);
                step300Request.setDireccionTCREARptpagrPaisInstance(personaTMODDIRECCIONESptpagrPais);
                step300Request.setDireccionTCREARptpatrDireccionCompleta(personaTMODDIRECCIONESpDCDireccionCompleta);
                step300Request.setDireccionTCREARptpatrRural(personaTMODDIRECCIONESpDCRural);
                direccionSrv.tCREARImplementation(step300Request);
            } else {
                for(Direccion step3301Entity : repository.assocOperator073(personaTMODDIRECCIONESpthisPersona)) {
                    com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest step301Request = new com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest();
                    step301Request.setDireccionTMODIFICARpthisDireccionInstance(step3301Entity);
                    step301Request.setDireccionTMODIFICARptpDireccionCompleta(personaTMODDIRECCIONESpDCDireccionCompleta);
                    step301Request.setDireccionTMODIFICARptpRural(personaTMODDIRECCIONESpDCRural);
                    step301Request.setDireccionTMODIFICARptpevcDepartamentoInstance(personaTMODDIRECCIONESpDCDepartamento);
                    step301Request.setDireccionTMODIFICARptpevcMunicipioInstance(personaTMODDIRECCIONESpDCMunicipio);
                    step301Request.setDireccionTMODIFICARptpevcPaisInstance(personaTMODDIRECCIONESptpagrPais);
                    step301Request.setDireccionTMODIFICARptpevcTipoDireccionInstance(step3301Entity.getTipoDireccion());
                    direccionSrv.tMODIFICARImplementation(step301Request);
                }
            }
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }

    // Service: TCREARDOCIDENTIFICACION

    /*
     * Entry point for service TCREARDOCIDENTIFICACION
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARDOCIDENTIFICACION(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARDOCIDENTIFICACIONRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = personaSrv.tCREARDOCIDENTIFICACIONTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARDOCIDENTIFICACION
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARDOCIDENTIFICACIONTxn(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARDOCIDENTIFICACIONRequest request) throws ModelException, SystemException {
        request.setPersonaTCREARDOCIDENTIFICACIONpthisPersonaInstance(personaSrv.getByOIDWithHV(request.getPersonaTCREARDOCIDENTIFICACIONpthisPersona()));
        request.setPersonaTCREARDOCIDENTIFICACIONptSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPersonaTCREARDOCIDENTIFICACIONptSolicitud()));
        return personaSrv.tCREARDOCIDENTIFICACIONImplementation(request);
    }

    /*
     * Implements service TCREARDOCIDENTIFICACION
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARDOCIDENTIFICACIONImplementation(
            com.keralty.aepersonas.viewmodel.persona.siu.TCREARDOCIDENTIFICACIONRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        String personaTCREARDOCIDENTIFICACIONptDatosDocumento = request.getPersonaTCREARDOCIDENTIFICACIONptDatosDocumento();
        Solicitud personaTCREARDOCIDENTIFICACIONptSolicitud = request.getPersonaTCREARDOCIDENTIFICACIONptSolicitudInstance();
        Persona personaTCREARDOCIDENTIFICACIONpthisPersona = request.getPersonaTCREARDOCIDENTIFICACIONpthisPersonaInstance();

        request.checkArguments();
        Persona instance = personaTCREARDOCIDENTIFICACIONpthisPersona;

        /* Action 1: IF (ptDatosDocumento <> NULL AND ptDatosDocumento <> "") */
        boolean ifCondition1 = personaTCREARDOCIDENTIFICACIONptDatosDocumento != null && (personaTCREARDOCIDENTIFICACIONptDatosDocumento).length() != 0;
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.documentog.siu.TCREARRequest step10Request = new com.keralty.aepersonas.viewmodel.documentog.siu.TCREARRequest();
            step10Request.setDocumentoGTCREARptpagrSolicitudInstance(personaTCREARDOCIDENTIFICACIONptSolicitud);
            step10Request.setDocumentoGTCREARptpagrPersonaInstance(personaTCREARDOCIDENTIFICACIONpthisPersona);
            step10Request.setDocumentoGTCREARptpatrDescripcion("Escaneo documento de identificación");
            step10Request.setDocumentoGTCREARptpatrTipo(Long.valueOf(1));
            step10Request.setDocumentoGTCREARptpatrEstado(Long.valueOf(1));
            step10Request.setDocumentoGTCREARptpatrFechaSubida(STDFunctions.systemDateTimeFun());
            step10Request.setDocumentoGTCREARptpatrIdDocEnGestor(STDFunctions.substringFun(personaTCREARDOCIDENTIFICACIONptDatosDocumento, Long.valueOf(1), STDFunctions.lastIndexOfFun(personaTCREARDOCIDENTIFICACIONptDatosDocumento, " ") - Long.valueOf(1)));
            step10Request.setDocumentoGTCREARptpNombre("DOCIDENTIFICACION" + personaTCREARDOCIDENTIFICACIONpthisPersona.getTipoIdentificacion().getTipoIdentificacionNombreCorto() + personaTCREARDOCIDENTIFICACIONpthisPersona.getPersonaNumIdentificacion());
            step10Request.setDocumentoGTCREARptpExtension(STDFunctions.rightSubstringFun(personaTCREARDOCIDENTIFICACIONptDatosDocumento, STDFunctions.lengthFun(personaTCREARDOCIDENTIFICACIONptDatosDocumento) - STDFunctions.lastIndexOfFun(personaTCREARDOCIDENTIFICACIONptDatosDocumento, " ")));
            documentoGSrv.tCREARImplementation(step10Request);
        }

        response.setInstance(getByOID(instance.getOid()));
        response.setInstanceSuppInfo(instance.buildICPersona());

        return response;
    }


    private void suppInfo4ICPersona(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION + "." + TipoIdentificacionConstants.ATTR_NAME_TIPOIDENTIFICACIONNOMBRECORTO, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison1);

            SQLWhereComparison comparison2 = new SQLWhereComparison(select);
            comparison2.setOperator("LIKE");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_NAME_PERSONANUMIDENTIFICACION, Constants.Type.STRING.getTypeName()));
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
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(PersonaConstants.CLASS_NAME, PersonaConstants.ATTR_FIELD_PERSONAIDENTIFICADOR, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildPersonaRelatedInstance(relatedInstanceJsonOid);
        }
        if (PersonaConstants.ROLE_NAME_SOLICITUDESCONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem) || PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_DOCUMENTOSG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4DocumentoG(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_ESTADOCIVIL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4EstadoCivil(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_ESTADOPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4EstadoPersona(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildPersonaRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPersonaRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPersonaRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPersonaRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPersonaRelatedInstance4DocumentoG(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new DocumentoG(mapper.readValue(relatedInstanceJsonOid, DocumentoGOid.class)): DocumentoG.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPersonaRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPersonaRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPersonaRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPersonaRelatedInstance4EstadoCivil(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new EstadoCivil(mapper.readValue(relatedInstanceJsonOid, EstadoCivilOid.class)): EstadoCivil.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPersonaRelatedInstance4EstadoPersona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new EstadoPersona(mapper.readValue(relatedInstanceJsonOid, EstadoPersonaOid.class)): EstadoPersona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            PersonaOid oid = new PersonaOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PersonaConstants.ATTR_FIELD_PERSONAIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPersonaIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(PersonaService.class).error(e.getMessage());
        }
    }

}
