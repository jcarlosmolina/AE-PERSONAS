package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.MinCardinalityException;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoDireccion;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.repository.TitularJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.utils.Utilities;
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
public class TitularService extends AbstractService {

    TitularJpaRepository repository;

    TitularService titularSrv;

    DepartamentoService departamentoSrv;

    MunicipioService municipioSrv;

    DireccionService direccionSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    SolicitudService solicitudSrv;

    TipoDireccionService tipoDireccionSrv;

    PaisService paisSrv;

    @Inject
    public TitularService(
            TitularService titularSrv,
            DepartamentoService departamentoSrv,
            MunicipioService municipioSrv,
            DireccionService direccionSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            SolicitudService solicitudSrv,
            TipoDireccionService tipoDireccionSrv,
            PaisService paisSrv,
            TitularJpaRepository repository) {
        this.titularSrv = titularSrv;
        this.departamentoSrv = departamentoSrv;
        this.municipioSrv = municipioSrv;
        this.direccionSrv = direccionSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.solicitudSrv = solicitudSrv;
        this.tipoDireccionSrv = tipoDireccionSrv;
        this.paisSrv = paisSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, TitularConstants.CLASS_NAME);
    }

    private List<Titular> solveTitularTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, TitularConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveTitularTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, TitularConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Titular
     *
     * @return Population of class Titular
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Titular> get() {
        List<Titular> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class Titular that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Titular matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Titular> get(QueryRequest queryRequest) {
        return solveTitularTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveTitularTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveTitularTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solveTitularTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Titular by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @return Instance of Titular
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Titular getById(Long aesolicitudesidsolicitud) {
        return getByOID(new TitularOid(aesolicitudesidsolicitud));
    }
    
    /*
     * Returns an instance of Titular by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Titular
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Titular getByOID(TitularOid oid) {
        Optional<Titular> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Titular by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Titular
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Titular getByOIDWithHV(TitularOid oid) {
        Optional<Titular> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Titular> getInstanceByOid(TitularOid oid) {
        return oid != null && oid.getAesolicitudesidsolicitud() != null
               ? repository.findById(oid.getAesolicitudesidsolicitud())
               : Optional.empty();
    }

    /*
     * Returns an instance of Titular by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Titular
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Titular getByJsonOid(String jsonOid) {
        TitularOid oid = new TitularOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Titular related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Titular
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Titular> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveTitularTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Titular related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Titular
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Titular> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Titular
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Titular
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getTitularDynamic(TitularOid oid, String displaySetItems) {
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
    public String getSuppInfo(TitularOid oid, String dsName) {
        Titular instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Titular instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIUTitularNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Titular using displayset DSTitularNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.titular.ds.DSTitularNull> piuPIUTitularNull(QueryRequest queryRequest) {
        return solveTitularTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.titular.ds.DSTitularNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUTitularNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUTitularNull
     */
    public int getCount4PIUTitularNull(QueryRequest queryRequest) {
        return solveTitularTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.titular.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.CrearRequest request) throws ModelException {
        request.setTitularcrearpagrDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(request.getTitularcrearpagrDepartamentoNac()));
        request.setTitularcrearpagrMunicipioNacInstance(municipioSrv.getByOIDWithHV(request.getTitularcrearpagrMunicipioNac()));
        request.setTitularcrearpagrDireccionInstance(direccionSrv.getByOIDWithHV(request.getTitularcrearpagrDireccion()));
        request.setTitularcrearpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getTitularcrearpagrTipoIdentificacion()));
        request.setTitularcrearpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getTitularcrearpagrSolicitud()));
        return titularSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento titularcrearpagrDepartamentoNac = request.getTitularcrearpagrDepartamentoNacInstance();
        Municipio titularcrearpagrMunicipioNac = request.getTitularcrearpagrMunicipioNacInstance();
        TipoIdentificacion titularcrearpagrTipoIdentificacion = request.getTitularcrearpagrTipoIdentificacionInstance();
        Solicitud titularcrearpagrSolicitud = request.getTitularcrearpagrSolicitudInstance();
        Long titularcrearpatrCodigo = request.getTitularcrearpatrCodigo();
        String titularcrearpatrNumIdentificacion = request.getTitularcrearpatrNumIdentificacion();
        String titularcrearpatrTipoPersona = request.getTitularcrearpatrTipoPersona();
        String titularcrearpatrPrimerNombre = request.getTitularcrearpatrPrimerNombre();
        String titularcrearpatrSegundoNombre = request.getTitularcrearpatrSegundoNombre();
        String titularcrearpatrPrimerApellido = request.getTitularcrearpatrPrimerApellido();
        String titularcrearpatrSegundoApellido = request.getTitularcrearpatrSegundoApellido();
        Date titularcrearpatrFechaNacimiento = request.getTitularcrearpatrFechaNacimiento();
        String titularcrearpatrGenero = request.getTitularcrearpatrGenero();
        Boolean titularcrearpatrIndicadorExtranjero = request.getTitularcrearpatrIndicadorExtranjero();
        String titularcrearpatrTelefonoFijo = request.getTitularcrearpatrTelefonoFijo();
        String titularcrearpatrTelefonoCelular = request.getTitularcrearpatrTelefonoCelular();
        String titularcrearpatrCorreoElectronico = request.getTitularcrearpatrCorreoElectronico();
        Boolean titularcrearpatrTitularConBeneficios = request.getTitularcrearpatrTitularConBeneficios();
        Boolean titularcrearpatrTitularRecuperadoInc = request.getTitularcrearpatrTitularRecuperadoInc();
        String titularcrearpatrTelefonoFijoDC = request.getTitularcrearpatrTelefonoFijoDC();
        String titularcrearpatrTelefonoCelularDC = request.getTitularcrearpatrTelefonoCelularDC();
        Boolean titularcrearpatrTitularConBeneficiosCORE = request.getTitularcrearpatrTitularConBeneficiosCORE();
        String titularcrearpatrRazonSocial = request.getTitularcrearpatrRazonSocial();

        request.checkArguments();
        Titular instance = new Titular();
        if (titularcrearpagrDepartamentoNac != null && !titularcrearpagrDepartamentoNac.isNull()) {
            instance.add2DepartamentoNac(titularcrearpagrDepartamentoNac);
        }

        if (titularcrearpagrMunicipioNac != null && !titularcrearpagrMunicipioNac.isNull()) {
            instance.add2MunicipioNac(titularcrearpagrMunicipioNac);
        }


        instance.add2TipoIdentificacion(titularcrearpagrTipoIdentificacion);

        titularcrearpagrSolicitud.add2Titular(instance);
        instance.add2Solicitud(titularcrearpagrSolicitud);

        instance.setTitularDireccionesModificadas(false);
        instance.setTitularCodigo(titularcrearpatrCodigo);
        instance.setTitularNumIdentificacion(titularcrearpatrNumIdentificacion);
        instance.setTitularTipoPersona(titularcrearpatrTipoPersona);
        instance.setTitularPrimerNombre(titularcrearpatrPrimerNombre);
        instance.setTitularSegundoNombre(titularcrearpatrSegundoNombre);
        instance.setTitularPrimerApellido(titularcrearpatrPrimerApellido);
        instance.setTitularSegundoApellido(titularcrearpatrSegundoApellido);
        instance.setTitularFechaNacimiento(titularcrearpatrFechaNacimiento);
        instance.setTitularGenero(titularcrearpatrGenero);
        instance.setTitularIndicadorExtranjero(titularcrearpatrIndicadorExtranjero);
        instance.setTitularTelefonoFijo(titularcrearpatrTelefonoFijo);
        instance.setTitularTelefonoCelular(titularcrearpatrTelefonoCelular);
        instance.setTitularCorreoElectronico(titularcrearpatrCorreoElectronico);
        instance.setTitularTitularConBeneficios(titularcrearpatrTitularConBeneficios);
        instance.setTitularTitularRecuperadoInc(titularcrearpatrTitularRecuperadoInc);
        instance.setTitularTelefonoFijoDC(titularcrearpatrTelefonoFijoDC);
        instance.setTitularTelefonoCelularDC(titularcrearpatrTelefonoCelularDC);
        instance.setTitularTitularConBeneficiosCORE(titularcrearpatrTitularConBeneficiosCORE);
        instance.setTitularRazonSocial(titularcrearpatrRazonSocial);

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
            com.keralty.aepersonas.viewmodel.titular.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.EliminarRequest request) throws ModelException {
        request.setTitulareliminarpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitulareliminarpthisTitular()));
        return titularSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titulareliminarpthisTitular = request.getTitulareliminarpthisTitularInstance();

        request.checkArguments();
        Titular instance = titulareliminarpthisTitular;
        if(titulareliminarpthisTitular.getDireccion() != null && !titulareliminarpthisTitular.getDireccion().isNull()) {
            throw new MinCardinalityException(TitularConstants.CLASS_ALIAS, TitularConstants.ROLE_ALIAS_DIRECCION);
        }

        instance.getSolicitud().add2Titular(null);

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
            com.keralty.aepersonas.viewmodel.titular.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.modificarTxn(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.ModificarRequest request) throws ModelException {
        request.setTitularmodificarpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularmodificarpthisTitular()));
        return titularSrv.modificarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularmodificarpthisTitular = request.getTitularmodificarpthisTitularInstance();
        Long titularmodificarpCodigo = request.getTitularmodificarpCodigo();
        String titularmodificarpNumIdentificacion = request.getTitularmodificarpNumIdentificacion();
        String titularmodificarpPrimerNombre = request.getTitularmodificarpPrimerNombre();
        String titularmodificarpSegundoNombre = request.getTitularmodificarpSegundoNombre();
        String titularmodificarpPrimerApellido = request.getTitularmodificarpPrimerApellido();
        String titularmodificarpSegundoApellido = request.getTitularmodificarpSegundoApellido();
        Date titularmodificarpFechaNacimiento = request.getTitularmodificarpFechaNacimiento();
        String titularmodificarpGenero = request.getTitularmodificarpGenero();
        Boolean titularmodificarpIndicadorExtranjero = request.getTitularmodificarpIndicadorExtranjero();
        String titularmodificarpTelefonoFijo = request.getTitularmodificarpTelefonoFijo();
        String titularmodificarpTelefonoCelular = request.getTitularmodificarpTelefonoCelular();
        String titularmodificarpCorreoElectronico = request.getTitularmodificarpCorreoElectronico();
        String titularmodificarpTelefonoFijoDC = request.getTitularmodificarpTelefonoFijoDC();
        String titularmodificarpTelefonoCelularDC = request.getTitularmodificarpTelefonoCelularDC();
        String titularmodificarpRazonSocial = request.getTitularmodificarpRazonSocial();

        request.checkArguments();
        Titular instance = titularmodificarpthisTitular;
        instance.setTitularCodigo(titularmodificarpCodigo);
        instance.setTitularNumIdentificacion(titularmodificarpNumIdentificacion);
        instance.setTitularPrimerNombre(titularmodificarpPrimerNombre);
        instance.setTitularSegundoNombre(titularmodificarpSegundoNombre);
        instance.setTitularPrimerApellido(titularmodificarpPrimerApellido);
        instance.setTitularSegundoApellido(titularmodificarpSegundoApellido);
        instance.setTitularFechaNacimiento(titularmodificarpFechaNacimiento);
        instance.setTitularGenero(titularmodificarpGenero);
        instance.setTitularIndicadorExtranjero(titularmodificarpIndicadorExtranjero);
        instance.setTitularTelefonoFijo(titularmodificarpTelefonoFijo);
        instance.setTitularTelefonoCelular(titularmodificarpTelefonoCelular);
        instance.setTitularCorreoElectronico(titularmodificarpCorreoElectronico);
        instance.setTitularTelefonoFijoDC(titularmodificarpTelefonoFijoDC);
        instance.setTitularTelefonoCelularDC(titularmodificarpTelefonoCelularDC);
        instance.setTitularRazonSocial(titularmodificarpRazonSocial);


        response.setInstance(repository.save(instance));

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
            com.keralty.aepersonas.viewmodel.titular.siu.CambTipoIdentificacionTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.cambTipoIdentificacionTitularTxn(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.CambTipoIdentificacionTitularRequest request) throws ModelException {
        request.setTitularCambTipoIdentificacionTitularpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularCambTipoIdentificacionTitularpthisTitular()));
        request.setTitularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getTitularCambTipoIdentificacionTitularpevcTipoIdentificacion()));
        return titularSrv.cambTipoIdentificacionTitularImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.titular.siu.CambTipoIdentificacionTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularCambTipoIdentificacionTitularpthisTitular = request.getTitularCambTipoIdentificacionTitularpthisTitularInstance();
        TipoIdentificacion titularCambTipoIdentificacionTitularpevcTipoIdentificacion = request.getTitularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance();

        request.checkArguments();
        Titular instance = titularCambTipoIdentificacionTitularpthisTitular;
        if (titularCambTipoIdentificacionTitularpevcTipoIdentificacion.getTipoIdentificacionNIT().equals(true)) {
            instance.setTitularTipoPersona("J");
        } else {
            instance.setTitularTipoPersona("N");
        }

        instance.add2TipoIdentificacion(titularCambTipoIdentificacionTitularpevcTipoIdentificacion);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdentificacionTitularRequest();
            relatedRequest.setTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance(titularCambTipoIdentificacionTitularpevcTipoIdentificacion);
            relatedRequest.setTipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance(titularCambTipoIdentificacionTitularpthisTitular);
            tipoIdentificacionSrv.cambTipoIdentificacionTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: InsDepartamentoNacTitular

    /*
     * Entry point for service InsDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDepartamentoNacTitular(
            com.keralty.aepersonas.viewmodel.titular.siu.InsDepartamentoNacTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.insDepartamentoNacTitularTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDepartamentoNacTitularTxn(
            com.keralty.aepersonas.viewmodel.titular.siu.InsDepartamentoNacTitularRequest request) throws ModelException {
        request.setTitularInsDepartamentoNacTitularpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularInsDepartamentoNacTitularpthisTitular()));
        request.setTitularInsDepartamentoNacTitularpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getTitularInsDepartamentoNacTitularpevcDepartamento()));
        return titularSrv.insDepartamentoNacTitularImplementation(request, true);
    }

    /*
     * Implements service InsDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDepartamentoNacTitularImplementation(
            com.keralty.aepersonas.viewmodel.titular.siu.InsDepartamentoNacTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularInsDepartamentoNacTitularpthisTitular = request.getTitularInsDepartamentoNacTitularpthisTitularInstance();
        Departamento titularInsDepartamentoNacTitularpevcDepartamento = request.getTitularInsDepartamentoNacTitularpevcDepartamentoInstance();

        request.checkArguments();
        Titular instance = titularInsDepartamentoNacTitularpthisTitular;

        instance.add2DepartamentoNac(titularInsDepartamentoNacTitularpevcDepartamento);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacTitularRequest();
            relatedRequest.setDepartamentoInsDepartamentoNacTitularpthisDepartamentoInstance(titularInsDepartamentoNacTitularpevcDepartamento);
            relatedRequest.setDepartamentoInsDepartamentoNacTitularpevcTitularInstance(titularInsDepartamentoNacTitularpthisTitular);
            departamentoSrv.insDepartamentoNacTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: DelDepartamentoNacTitular

    /*
     * Entry point for service DelDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDepartamentoNacTitular(
            com.keralty.aepersonas.viewmodel.titular.siu.DelDepartamentoNacTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.delDepartamentoNacTitularTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDepartamentoNacTitularTxn(
            com.keralty.aepersonas.viewmodel.titular.siu.DelDepartamentoNacTitularRequest request) throws ModelException {
        request.setTitularDelDepartamentoNacTitularpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularDelDepartamentoNacTitularpthisTitular()));
        request.setTitularDelDepartamentoNacTitularpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getTitularDelDepartamentoNacTitularpevcDepartamento()));
        return titularSrv.delDepartamentoNacTitularImplementation(request, true);
    }

    /*
     * Implements service DelDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDepartamentoNacTitularImplementation(
            com.keralty.aepersonas.viewmodel.titular.siu.DelDepartamentoNacTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularDelDepartamentoNacTitularpthisTitular = request.getTitularDelDepartamentoNacTitularpthisTitularInstance();
        Departamento titularDelDepartamentoNacTitularpevcDepartamento = request.getTitularDelDepartamentoNacTitularpevcDepartamentoInstance();

        request.checkArguments();
        Titular instance = titularDelDepartamentoNacTitularpthisTitular;

        instance.add2DepartamentoNac(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacTitularRequest();
            relatedRequest.setDepartamentoDelDepartamentoNacTitularpthisDepartamentoInstance(titularDelDepartamentoNacTitularpevcDepartamento);
            relatedRequest.setDepartamentoDelDepartamentoNacTitularpevcTitularInstance(titularDelDepartamentoNacTitularpthisTitular);
            departamentoSrv.delDepartamentoNacTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: InsMunicipioNacTitular

    /*
     * Entry point for service InsMunicipioNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insMunicipioNacTitular(
            com.keralty.aepersonas.viewmodel.titular.siu.InsMunicipioNacTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.insMunicipioNacTitularTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsMunicipioNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insMunicipioNacTitularTxn(
            com.keralty.aepersonas.viewmodel.titular.siu.InsMunicipioNacTitularRequest request) throws ModelException {
        request.setTitularInsMunicipioNacTitularpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularInsMunicipioNacTitularpthisTitular()));
        request.setTitularInsMunicipioNacTitularpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getTitularInsMunicipioNacTitularpevcMunicipio()));
        return titularSrv.insMunicipioNacTitularImplementation(request, true);
    }

    /*
     * Implements service InsMunicipioNacTitular
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insMunicipioNacTitularImplementation(
            com.keralty.aepersonas.viewmodel.titular.siu.InsMunicipioNacTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularInsMunicipioNacTitularpthisTitular = request.getTitularInsMunicipioNacTitularpthisTitularInstance();
        Municipio titularInsMunicipioNacTitularpevcMunicipio = request.getTitularInsMunicipioNacTitularpevcMunicipioInstance();

        request.checkArguments();
        Titular instance = titularInsMunicipioNacTitularpthisTitular;

        instance.add2MunicipioNac(titularInsMunicipioNacTitularpevcMunicipio);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioNacTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioNacTitularRequest();
            relatedRequest.setMunicipioInsMunicipioNacTitularpthisMunicipioInstance(titularInsMunicipioNacTitularpevcMunicipio);
            relatedRequest.setMunicipioInsMunicipioNacTitularpevcTitularInstance(titularInsMunicipioNacTitularpthisTitular);
            municipioSrv.insMunicipioNacTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: DelMunicipioNacTitular

    /*
     * Entry point for service DelMunicipioNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delMunicipioNacTitular(
            com.keralty.aepersonas.viewmodel.titular.siu.DelMunicipioNacTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.delMunicipioNacTitularTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelMunicipioNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delMunicipioNacTitularTxn(
            com.keralty.aepersonas.viewmodel.titular.siu.DelMunicipioNacTitularRequest request) throws ModelException {
        request.setTitularDelMunicipioNacTitularpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularDelMunicipioNacTitularpthisTitular()));
        request.setTitularDelMunicipioNacTitularpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getTitularDelMunicipioNacTitularpevcMunicipio()));
        return titularSrv.delMunicipioNacTitularImplementation(request, true);
    }

    /*
     * Implements service DelMunicipioNacTitular
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delMunicipioNacTitularImplementation(
            com.keralty.aepersonas.viewmodel.titular.siu.DelMunicipioNacTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularDelMunicipioNacTitularpthisTitular = request.getTitularDelMunicipioNacTitularpthisTitularInstance();
        Municipio titularDelMunicipioNacTitularpevcMunicipio = request.getTitularDelMunicipioNacTitularpevcMunicipioInstance();

        request.checkArguments();
        Titular instance = titularDelMunicipioNacTitularpthisTitular;

        instance.add2MunicipioNac(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioNacTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioNacTitularRequest();
            relatedRequest.setMunicipioDelMunicipioNacTitularpthisMunicipioInstance(titularDelMunicipioNacTitularpevcMunicipio);
            relatedRequest.setMunicipioDelMunicipioNacTitularpevcTitularInstance(titularDelMunicipioNacTitularpthisTitular);
            municipioSrv.delMunicipioNacTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: fijarTitularConBeneficios

    /*
     * Entry point for service fijarTitularConBeneficios
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse fijarTitularConBeneficios(
            com.keralty.aepersonas.viewmodel.titular.siu.FijarTitularConBeneficiosRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.fijarTitularConBeneficiosTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service fijarTitularConBeneficios
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse fijarTitularConBeneficiosTxn(
            com.keralty.aepersonas.viewmodel.titular.siu.FijarTitularConBeneficiosRequest request) throws ModelException {
        request.setTitularfijarTitularConBeneficiospthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularfijarTitularConBeneficiospthisTitular()));
        return titularSrv.fijarTitularConBeneficiosImplementation(request);
    }

    /*
     * Implements service fijarTitularConBeneficios
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse fijarTitularConBeneficiosImplementation(
            com.keralty.aepersonas.viewmodel.titular.siu.FijarTitularConBeneficiosRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularfijarTitularConBeneficiospthisTitular = request.getTitularfijarTitularConBeneficiospthisTitularInstance();
        Boolean titularfijarTitularConBeneficiospTitularConBeneficios = request.getTitularfijarTitularConBeneficiospTitularConBeneficios();

        request.checkArguments();
        Titular instance = titularfijarTitularConBeneficiospthisTitular;
        instance.setTitularTitularConBeneficios(titularfijarTitularConBeneficiospTitularConBeneficios);


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: actualizarCodigo

    /*
     * Entry point for service actualizarCodigo
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse actualizarCodigo(
            com.keralty.aepersonas.viewmodel.titular.siu.ActualizarCodigoRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.actualizarCodigoTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service actualizarCodigo
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse actualizarCodigoTxn(
            com.keralty.aepersonas.viewmodel.titular.siu.ActualizarCodigoRequest request) throws ModelException {
        request.setTitularactualizarCodigopthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularactualizarCodigopthisTitular()));
        return titularSrv.actualizarCodigoImplementation(request);
    }

    /*
     * Implements service actualizarCodigo
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse actualizarCodigoImplementation(
            com.keralty.aepersonas.viewmodel.titular.siu.ActualizarCodigoRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularactualizarCodigopthisTitular = request.getTitularactualizarCodigopthisTitularInstance();
        Long titularactualizarCodigopCodigo = request.getTitularactualizarCodigopCodigo();

        request.checkArguments();
        Titular instance = titularactualizarCodigopthisTitular;
        instance.setTitularCodigo(titularactualizarCodigopCodigo);


        response.setInstance(repository.save(instance));

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
            com.keralty.aepersonas.viewmodel.titular.siu.InsDirTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.insDirTitularTxn(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.InsDirTitularRequest request) throws ModelException {
        request.setTitularInsDirTitularpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularInsDirTitularpthisTitular()));
        request.setTitularInsDirTitularpevcDireccionInstance(direccionSrv.getByOIDWithHV(request.getTitularInsDirTitularpevcDireccion()));
        return titularSrv.insDirTitularImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.titular.siu.InsDirTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularInsDirTitularpthisTitular = request.getTitularInsDirTitularpthisTitularInstance();
        Direccion titularInsDirTitularpevcDireccion = request.getTitularInsDirTitularpevcDireccionInstance();

        request.checkArguments();
        Titular instance = titularInsDirTitularpthisTitular;

        instance.add2Direccion(titularInsDirTitularpevcDireccion);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDirTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.direccion.siu.InsDirTitularRequest();
            relatedRequest.setDireccionInsDirTitularpthisDireccionInstance(titularInsDirTitularpevcDireccion);
            relatedRequest.setDireccionInsDirTitularpevcTitularInstance(titularInsDirTitularpthisTitular);
            direccionSrv.insDirTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

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
            com.keralty.aepersonas.viewmodel.titular.siu.DelDirTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.delDirTitularTxn(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.DelDirTitularRequest request) throws ModelException {
        request.setTitularDelDirTitularpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularDelDirTitularpthisTitular()));
        request.setTitularDelDirTitularpevcDireccionInstance(direccionSrv.getByOIDWithHV(request.getTitularDelDirTitularpevcDireccion()));
        return titularSrv.delDirTitularImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.titular.siu.DelDirTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularDelDirTitularpthisTitular = request.getTitularDelDirTitularpthisTitularInstance();
        Direccion titularDelDirTitularpevcDireccion = request.getTitularDelDirTitularpevcDireccionInstance();

        request.checkArguments();
        Titular instance = titularDelDirTitularpthisTitular;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDirTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.direccion.siu.DelDirTitularRequest();
            relatedRequest.setDireccionDelDirTitularpthisDireccionInstance(titularDelDirTitularpevcDireccion);
            relatedRequest.setDireccionDelDirTitularpevcTitularInstance(titularDelDirTitularpthisTitular);
            direccionSrv.delDirTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: setDirsModificadas

    /*
     * Entry point for service setDirsModificadas
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse setDirsModificadas(
            com.keralty.aepersonas.viewmodel.titular.siu.SetDirsModificadasRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.setDirsModificadasTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service setDirsModificadas
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse setDirsModificadasTxn(
            com.keralty.aepersonas.viewmodel.titular.siu.SetDirsModificadasRequest request) throws ModelException {
        request.setTitularsetDirsModificadaspthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularsetDirsModificadaspthisTitular()));
        return titularSrv.setDirsModificadasImplementation(request);
    }

    /*
     * Implements service setDirsModificadas
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse setDirsModificadasImplementation(
            com.keralty.aepersonas.viewmodel.titular.siu.SetDirsModificadasRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Titular titularsetDirsModificadaspthisTitular = request.getTitularsetDirsModificadaspthisTitularInstance();
        Boolean titularsetDirsModificadaspdMod = request.getTitularsetDirsModificadaspdMod();

        request.checkArguments();
        Titular instance = titularsetDirsModificadaspthisTitular;
        instance.setTitularDireccionesModificadas(titularsetDirsModificadaspdMod);


        response.setInstance(repository.save(instance));

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
            com.keralty.aepersonas.viewmodel.titular.siu.TMODIFICARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.tMODIFICARTxn(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.TMODIFICARRequest request) throws ModelException, SystemException {
        request.setTitularTMODIFICARpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularTMODIFICARpthisTitular()));
        request.setTitularTMODIFICARptpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getTitularTMODIFICARptpevcTipoIdentificacion()));
        request.setTitularTMODIFICARptpevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getTitularTMODIFICARptpevcDepartamento()));
        request.setTitularTMODIFICARptpevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getTitularTMODIFICARptpevcMunicipio()));
        return titularSrv.tMODIFICARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.TMODIFICARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Long titularTMODIFICARptpCodigo = request.getTitularTMODIFICARptpCodigo();
        String titularTMODIFICARptpNumIdentificacion = request.getTitularTMODIFICARptpNumIdentificacion();
        String titularTMODIFICARptpPrimerNombre = request.getTitularTMODIFICARptpPrimerNombre();
        String titularTMODIFICARptpSegundoNombre = request.getTitularTMODIFICARptpSegundoNombre();
        String titularTMODIFICARptpPrimerApellido = request.getTitularTMODIFICARptpPrimerApellido();
        String titularTMODIFICARptpSegundoApellido = request.getTitularTMODIFICARptpSegundoApellido();
        Date titularTMODIFICARptpFechaNacimiento = request.getTitularTMODIFICARptpFechaNacimiento();
        String titularTMODIFICARptpGenero = request.getTitularTMODIFICARptpGenero();
        Boolean titularTMODIFICARptpIndicadorExtranjero = request.getTitularTMODIFICARptpIndicadorExtranjero();
        String titularTMODIFICARptpTelefonoFijo = request.getTitularTMODIFICARptpTelefonoFijo();
        String titularTMODIFICARptpTelefonoCelular = request.getTitularTMODIFICARptpTelefonoCelular();
        String titularTMODIFICARptpCorreoElectronico = request.getTitularTMODIFICARptpCorreoElectronico();
        String titularTMODIFICARptpTelefonoFijoDC = request.getTitularTMODIFICARptpTelefonoFijoDC();
        String titularTMODIFICARptpTelefonoCelularDC = request.getTitularTMODIFICARptpTelefonoCelularDC();
        String titularTMODIFICARptpRazonSocial = request.getTitularTMODIFICARptpRazonSocial();
        TipoIdentificacion titularTMODIFICARptpevcTipoIdentificacion = request.getTitularTMODIFICARptpevcTipoIdentificacionInstance();
        Departamento titularTMODIFICARptpevcDepartamento = request.getTitularTMODIFICARptpevcDepartamentoInstance();
        Municipio titularTMODIFICARptpevcMunicipio = request.getTitularTMODIFICARptpevcMunicipioInstance();
        Boolean titularTMODIFICARptpTitularConBeneficios = request.getTitularTMODIFICARptpTitularConBeneficios();
        Titular titularTMODIFICARpthisTitular = request.getTitularTMODIFICARpthisTitularInstance();

        request.checkArguments();
        Titular instance = titularTMODIFICARpthisTitular;

        com.keralty.aepersonas.viewmodel.titular.siu.ModificarRequest step1Request = new com.keralty.aepersonas.viewmodel.titular.siu.ModificarRequest();
        step1Request.setTitularmodificarpthisTitularInstance(titularTMODIFICARpthisTitular);
        step1Request.setTitularmodificarpCodigo(titularTMODIFICARptpCodigo);
        step1Request.setTitularmodificarpNumIdentificacion(titularTMODIFICARptpNumIdentificacion);
        step1Request.setTitularmodificarpPrimerNombre(titularTMODIFICARptpPrimerNombre);
        step1Request.setTitularmodificarpSegundoNombre(titularTMODIFICARptpSegundoNombre);
        step1Request.setTitularmodificarpPrimerApellido(titularTMODIFICARptpPrimerApellido);
        step1Request.setTitularmodificarpSegundoApellido(titularTMODIFICARptpSegundoApellido);
        step1Request.setTitularmodificarpFechaNacimiento(titularTMODIFICARptpFechaNacimiento);
        step1Request.setTitularmodificarpGenero(titularTMODIFICARptpGenero);
        step1Request.setTitularmodificarpIndicadorExtranjero(titularTMODIFICARptpIndicadorExtranjero);
        step1Request.setTitularmodificarpTelefonoFijo(titularTMODIFICARptpTelefonoFijo);
        step1Request.setTitularmodificarpTelefonoCelular(titularTMODIFICARptpTelefonoCelular);
        step1Request.setTitularmodificarpCorreoElectronico(titularTMODIFICARptpCorreoElectronico);
        step1Request.setTitularmodificarpTelefonoFijoDC(titularTMODIFICARptpTelefonoFijoDC);
        step1Request.setTitularmodificarpTelefonoCelularDC(titularTMODIFICARptpTelefonoCelularDC);
        step1Request.setTitularmodificarpRazonSocial(titularTMODIFICARptpRazonSocial);
        titularSrv.modificarImplementation(step1Request);

        boolean guard2 = !Utilities.isEqual(titularTMODIFICARpthisTitular.getTipoIdentificacion(), titularTMODIFICARptpevcTipoIdentificacion);

        if (guard2) {
            com.keralty.aepersonas.viewmodel.titular.siu.CambTipoIdentificacionTitularRequest step2Request = new com.keralty.aepersonas.viewmodel.titular.siu.CambTipoIdentificacionTitularRequest();
            step2Request.setTitularCambTipoIdentificacionTitularpthisTitularInstance(titularTMODIFICARpthisTitular);
            step2Request.setTitularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance(titularTMODIFICARptpevcTipoIdentificacion);
            titularSrv.cambTipoIdentificacionTitularImplementation(step2Request, true);
        }

        boolean guard3 = repository.assocOperator000(titularTMODIFICARpthisTitular).equals(false) && (titularTMODIFICARptpevcDepartamento != null && !titularTMODIFICARptpevcDepartamento.isNull());

        if (guard3) {
            com.keralty.aepersonas.viewmodel.titular.siu.InsDepartamentoNacTitularRequest step3Request = new com.keralty.aepersonas.viewmodel.titular.siu.InsDepartamentoNacTitularRequest();
            step3Request.setTitularInsDepartamentoNacTitularpthisTitularInstance(titularTMODIFICARpthisTitular);
            step3Request.setTitularInsDepartamentoNacTitularpevcDepartamentoInstance(titularTMODIFICARptpevcDepartamento);
            titularSrv.insDepartamentoNacTitularImplementation(step3Request, true);
        }

        boolean guard4 = repository.assocOperator001(titularTMODIFICARpthisTitular).equals(true) && (titularTMODIFICARptpevcDepartamento == null || titularTMODIFICARptpevcDepartamento.isNull());

        if (guard4) {
            com.keralty.aepersonas.viewmodel.titular.siu.DelDepartamentoNacTitularRequest step4Request = new com.keralty.aepersonas.viewmodel.titular.siu.DelDepartamentoNacTitularRequest();
            step4Request.setTitularDelDepartamentoNacTitularpthisTitularInstance(titularTMODIFICARpthisTitular);
            step4Request.setTitularDelDepartamentoNacTitularpevcDepartamentoInstance(titularTMODIFICARpthisTitular.getDepartamentoNac());
            titularSrv.delDepartamentoNacTitularImplementation(step4Request, true);
        }

        /* Action 5: IF (EXIST (DepartamentoNac) = true AND ptpevcDepartamento <> NULL AND DepartamentoNac <> ptpevcDepartamento) */
        boolean ifCondition5 = repository.assocOperator006(titularTMODIFICARpthisTitular).equals(true) && (titularTMODIFICARptpevcDepartamento != null && !titularTMODIFICARptpevcDepartamento.isNull()) && !Utilities.isEqual(titularTMODIFICARpthisTitular.getDepartamentoNac(), titularTMODIFICARptpevcDepartamento);
        if (ifCondition5) {
            com.keralty.aepersonas.viewmodel.titular.siu.DelDepartamentoNacTitularRequest step50Request = new com.keralty.aepersonas.viewmodel.titular.siu.DelDepartamentoNacTitularRequest();
            step50Request.setTitularDelDepartamentoNacTitularpthisTitularInstance(titularTMODIFICARpthisTitular);
            step50Request.setTitularDelDepartamentoNacTitularpevcDepartamentoInstance(titularTMODIFICARpthisTitular.getDepartamentoNac());
            titularSrv.delDepartamentoNacTitularImplementation(step50Request, true);
            com.keralty.aepersonas.viewmodel.titular.siu.InsDepartamentoNacTitularRequest step51Request = new com.keralty.aepersonas.viewmodel.titular.siu.InsDepartamentoNacTitularRequest();
            step51Request.setTitularInsDepartamentoNacTitularpthisTitularInstance(titularTMODIFICARpthisTitular);
            step51Request.setTitularInsDepartamentoNacTitularpevcDepartamentoInstance(titularTMODIFICARptpevcDepartamento);
            titularSrv.insDepartamentoNacTitularImplementation(step51Request, true);
        }

        boolean guard6 = repository.assocOperator003(titularTMODIFICARpthisTitular).equals(false) && (titularTMODIFICARptpevcMunicipio != null && !titularTMODIFICARptpevcMunicipio.isNull());

        if (guard6) {
            com.keralty.aepersonas.viewmodel.titular.siu.InsMunicipioNacTitularRequest step6Request = new com.keralty.aepersonas.viewmodel.titular.siu.InsMunicipioNacTitularRequest();
            step6Request.setTitularInsMunicipioNacTitularpthisTitularInstance(titularTMODIFICARpthisTitular);
            step6Request.setTitularInsMunicipioNacTitularpevcMunicipioInstance(titularTMODIFICARptpevcMunicipio);
            titularSrv.insMunicipioNacTitularImplementation(step6Request, true);
        }

        boolean guard7 = repository.assocOperator004(titularTMODIFICARpthisTitular).equals(true) && (titularTMODIFICARptpevcMunicipio == null || titularTMODIFICARptpevcMunicipio.isNull());

        if (guard7) {
            com.keralty.aepersonas.viewmodel.titular.siu.DelMunicipioNacTitularRequest step7Request = new com.keralty.aepersonas.viewmodel.titular.siu.DelMunicipioNacTitularRequest();
            step7Request.setTitularDelMunicipioNacTitularpthisTitularInstance(titularTMODIFICARpthisTitular);
            step7Request.setTitularDelMunicipioNacTitularpevcMunicipioInstance(titularTMODIFICARpthisTitular.getMunicipioNac());
            titularSrv.delMunicipioNacTitularImplementation(step7Request, true);
        }

        /* Action 8: IF (EXIST (MunicipioNac) = true AND ptpevcMunicipio <> NULL AND MunicipioNac <> ptpevcMunicipio) */
        boolean ifCondition8 = repository.assocOperator007(titularTMODIFICARpthisTitular).equals(true) && (titularTMODIFICARptpevcMunicipio != null && !titularTMODIFICARptpevcMunicipio.isNull()) && !Utilities.isEqual(titularTMODIFICARpthisTitular.getMunicipioNac(), titularTMODIFICARptpevcMunicipio);
        if (ifCondition8) {
            com.keralty.aepersonas.viewmodel.titular.siu.DelMunicipioNacTitularRequest step80Request = new com.keralty.aepersonas.viewmodel.titular.siu.DelMunicipioNacTitularRequest();
            step80Request.setTitularDelMunicipioNacTitularpthisTitularInstance(titularTMODIFICARpthisTitular);
            step80Request.setTitularDelMunicipioNacTitularpevcMunicipioInstance(titularTMODIFICARpthisTitular.getMunicipioNac());
            titularSrv.delMunicipioNacTitularImplementation(step80Request, true);
            com.keralty.aepersonas.viewmodel.titular.siu.InsMunicipioNacTitularRequest step81Request = new com.keralty.aepersonas.viewmodel.titular.siu.InsMunicipioNacTitularRequest();
            step81Request.setTitularInsMunicipioNacTitularpthisTitularInstance(titularTMODIFICARpthisTitular);
            step81Request.setTitularInsMunicipioNacTitularpevcMunicipioInstance(titularTMODIFICARptpevcMunicipio);
            titularSrv.insMunicipioNacTitularImplementation(step81Request, true);
        }

        com.keralty.aepersonas.viewmodel.titular.siu.FijarTitularConBeneficiosRequest step9Request = new com.keralty.aepersonas.viewmodel.titular.siu.FijarTitularConBeneficiosRequest();
        step9Request.setTitularfijarTitularConBeneficiospthisTitularInstance(titularTMODIFICARpthisTitular);
        step9Request.setTitularfijarTitularConBeneficiospTitularConBeneficios(titularTMODIFICARptpTitularConBeneficios);
        titularSrv.fijarTitularConBeneficiosImplementation(step9Request);

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    // Service: TCREAROMODDIRECCION

    /*
     * Entry point for service TCREAROMODDIRECCION
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREAROMODDIRECCION(
            com.keralty.aepersonas.viewmodel.titular.siu.TCREAROMODDIRECCIONRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.tCREAROMODDIRECCIONTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREAROMODDIRECCION
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREAROMODDIRECCIONTxn(
            com.keralty.aepersonas.viewmodel.titular.siu.TCREAROMODDIRECCIONRequest request) throws ModelException, SystemException {
        request.setTitularTCREAROMODDIRECCIONpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularTCREAROMODDIRECCIONpthisTitular()));
        request.setTitularTCREAROMODDIRECCIONptpagrTipoDireccionInstance(tipoDireccionSrv.getByOIDWithHV(request.getTitularTCREAROMODDIRECCIONptpagrTipoDireccion()));
        request.setTitularTCREAROMODDIRECCIONptpagrPaisInstance(paisSrv.getByOIDWithHV(request.getTitularTCREAROMODDIRECCIONptpagrPais()));
        request.setTitularTCREAROMODDIRECCIONptpagrDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getTitularTCREAROMODDIRECCIONptpagrDepartamento()));
        request.setTitularTCREAROMODDIRECCIONptpagrMunicipioInstance(municipioSrv.getByOIDWithHV(request.getTitularTCREAROMODDIRECCIONptpagrMunicipio()));
        return titularSrv.tCREAROMODDIRECCIONImplementation(request);
    }

    /*
     * Implements service TCREAROMODDIRECCION
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREAROMODDIRECCIONImplementation(
            com.keralty.aepersonas.viewmodel.titular.siu.TCREAROMODDIRECCIONRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        TipoDireccion titularTCREAROMODDIRECCIONptpagrTipoDireccion = request.getTitularTCREAROMODDIRECCIONptpagrTipoDireccionInstance();
        Municipio titularTCREAROMODDIRECCIONptpagrMunicipio = request.getTitularTCREAROMODDIRECCIONptpagrMunicipioInstance();
        Departamento titularTCREAROMODDIRECCIONptpagrDepartamento = request.getTitularTCREAROMODDIRECCIONptpagrDepartamentoInstance();
        Pais titularTCREAROMODDIRECCIONptpagrPais = request.getTitularTCREAROMODDIRECCIONptpagrPaisInstance();
        String titularTCREAROMODDIRECCIONptpatrDireccionCompleta = request.getTitularTCREAROMODDIRECCIONptpatrDireccionCompleta();
        Boolean titularTCREAROMODDIRECCIONptpatrRural = request.getTitularTCREAROMODDIRECCIONptpatrRural();
        Titular titularTCREAROMODDIRECCIONpthisTitular = request.getTitularTCREAROMODDIRECCIONpthisTitularInstance();

        request.checkArguments();
        Titular instance = titularTCREAROMODDIRECCIONpthisTitular;

        /* Action 1: IF (EXIST (Direccion) = false) */
        boolean ifCondition1 = repository.assocOperator009(titularTCREAROMODDIRECCIONpthisTitular).equals(false);
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest step10Request = new com.keralty.aepersonas.viewmodel.direccion.siu.TCREARRequest();
            step10Request.setDireccionTCREARptpagrPersonaInstance(null);
            step10Request.setDireccionTCREARptpagrContratoInstance(null);
            step10Request.setDireccionTCREARptpagrTitularInstance(titularTCREAROMODDIRECCIONpthisTitular);
            step10Request.setDireccionTCREARptpagrTipoDireccionInstance(titularTCREAROMODDIRECCIONptpagrTipoDireccion);
            step10Request.setDireccionTCREARptpagrMunicipioInstance(titularTCREAROMODDIRECCIONptpagrMunicipio);
            step10Request.setDireccionTCREARptpagrDepartamentoInstance(titularTCREAROMODDIRECCIONptpagrDepartamento);
            step10Request.setDireccionTCREARptpagrPaisInstance(titularTCREAROMODDIRECCIONptpagrPais);
            step10Request.setDireccionTCREARptpatrDireccionCompleta(titularTCREAROMODDIRECCIONptpatrDireccionCompleta);
            step10Request.setDireccionTCREARptpatrRural(titularTCREAROMODDIRECCIONptpatrRural);
            direccionSrv.tCREARImplementation(step10Request);
        } else {
            com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest step11Request = new com.keralty.aepersonas.viewmodel.direccion.siu.TMODIFICARRequest();
            step11Request.setDireccionTMODIFICARpthisDireccionInstance(titularTCREAROMODDIRECCIONpthisTitular.getDireccion());
            step11Request.setDireccionTMODIFICARptpDireccionCompleta(titularTCREAROMODDIRECCIONptpatrDireccionCompleta);
            step11Request.setDireccionTMODIFICARptpRural(titularTCREAROMODDIRECCIONptpatrRural);
            step11Request.setDireccionTMODIFICARptpevcDepartamentoInstance(titularTCREAROMODDIRECCIONptpagrDepartamento);
            step11Request.setDireccionTMODIFICARptpevcMunicipioInstance(titularTCREAROMODDIRECCIONptpagrMunicipio);
            step11Request.setDireccionTMODIFICARptpevcPaisInstance(titularTCREAROMODDIRECCIONptpagrPais);
            step11Request.setDireccionTMODIFICARptpevcTipoDireccionInstance(titularTCREAROMODDIRECCIONptpagrTipoDireccion);
            direccionSrv.tMODIFICARImplementation(step11Request);
        }

        response.setInstance(getByOID(instance.getOid()));

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
            com.keralty.aepersonas.viewmodel.titular.siu.TCREARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.tCREARTxn(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.TCREARRequest request) throws ModelException {
        request.setTitularTCREARptpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getTitularTCREARptpagrSolicitud()));
        request.setTitularTCREARptpagrDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(request.getTitularTCREARptpagrDepartamentoNac()));
        request.setTitularTCREARptpagrMunicipioNacInstance(municipioSrv.getByOIDWithHV(request.getTitularTCREARptpagrMunicipioNac()));
        request.setTitularTCREARptpagrDireccionInstance(direccionSrv.getByOIDWithHV(request.getTitularTCREARptpagrDireccion()));
        request.setTitularTCREARptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getTitularTCREARptpagrTipoIdentificacion()));
        return titularSrv.tCREARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.titular.siu.TCREARRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento titularTCREARptpagrDepartamentoNac = request.getTitularTCREARptpagrDepartamentoNacInstance();
        Municipio titularTCREARptpagrMunicipioNac = request.getTitularTCREARptpagrMunicipioNacInstance();
        Direccion titularTCREARptpagrDireccion = request.getTitularTCREARptpagrDireccionInstance();
        TipoIdentificacion titularTCREARptpagrTipoIdentificacion = request.getTitularTCREARptpagrTipoIdentificacionInstance();
        Solicitud titularTCREARptpagrSolicitud = request.getTitularTCREARptpagrSolicitudInstance();
        Long titularTCREARptpatrCodigo = request.getTitularTCREARptpatrCodigo();
        String titularTCREARptpatrNumIdentificacion = request.getTitularTCREARptpatrNumIdentificacion();
        String titularTCREARptpatrTipoPersona = request.getTitularTCREARptpatrTipoPersona();
        String titularTCREARptpatrPrimerNombre = request.getTitularTCREARptpatrPrimerNombre();
        String titularTCREARptpatrSegundoNombre = request.getTitularTCREARptpatrSegundoNombre();
        String titularTCREARptpatrPrimerApellido = request.getTitularTCREARptpatrPrimerApellido();
        String titularTCREARptpatrSegundoApellido = request.getTitularTCREARptpatrSegundoApellido();
        Date titularTCREARptpatrFechaNacimiento = request.getTitularTCREARptpatrFechaNacimiento();
        String titularTCREARptpatrGenero = request.getTitularTCREARptpatrGenero();
        Boolean titularTCREARptpatrIndicadorExtranjero = request.getTitularTCREARptpatrIndicadorExtranjero();
        String titularTCREARptpatrTelefonoFijo = request.getTitularTCREARptpatrTelefonoFijo();
        String titularTCREARptpatrTelefonoCelular = request.getTitularTCREARptpatrTelefonoCelular();
        String titularTCREARptpatrCorreoElectronico = request.getTitularTCREARptpatrCorreoElectronico();
        Boolean titularTCREARptpatrTitularConBeneficios = request.getTitularTCREARptpatrTitularConBeneficios();
        Boolean titularTCREARptpatrTitularRecuperadoInc = request.getTitularTCREARptpatrTitularRecuperadoInc();
        String titularTCREARptpatrTelefonoFijoDC = request.getTitularTCREARptpatrTelefonoFijoDC();
        String titularTCREARptpatrTelefonoCelularDC = request.getTitularTCREARptpatrTelefonoCelularDC();
        Boolean titularTCREARptpatrTitularConBeneficiosCO = request.getTitularTCREARptpatrTitularConBeneficiosCO();
        String titularTCREARptpatrRazonSocial = request.getTitularTCREARptpatrRazonSocial();

        request.checkArguments();
        Titular instance;

        com.keralty.aepersonas.viewmodel.titular.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.titular.siu.CrearRequest();
        step1Request.setTitularcrearpagrDepartamentoNacInstance(titularTCREARptpagrDepartamentoNac);
        step1Request.setTitularcrearpagrMunicipioNacInstance(titularTCREARptpagrMunicipioNac);
        step1Request.setTitularcrearpagrDireccionInstance(titularTCREARptpagrDireccion);
        step1Request.setTitularcrearpagrTipoIdentificacionInstance(titularTCREARptpagrTipoIdentificacion);
        step1Request.setTitularcrearpagrSolicitudInstance(titularTCREARptpagrSolicitud);
        step1Request.setTitularcrearpatrCodigo(titularTCREARptpatrCodigo);
        step1Request.setTitularcrearpatrNumIdentificacion(titularTCREARptpatrNumIdentificacion);
        step1Request.setTitularcrearpatrTipoPersona(titularTCREARptpatrTipoPersona);
        step1Request.setTitularcrearpatrPrimerNombre(titularTCREARptpatrPrimerNombre);
        step1Request.setTitularcrearpatrSegundoNombre(titularTCREARptpatrSegundoNombre);
        step1Request.setTitularcrearpatrPrimerApellido(titularTCREARptpatrPrimerApellido);
        step1Request.setTitularcrearpatrSegundoApellido(titularTCREARptpatrSegundoApellido);
        step1Request.setTitularcrearpatrFechaNacimiento(titularTCREARptpatrFechaNacimiento);
        step1Request.setTitularcrearpatrGenero(titularTCREARptpatrGenero);
        step1Request.setTitularcrearpatrIndicadorExtranjero(titularTCREARptpatrIndicadorExtranjero);
        step1Request.setTitularcrearpatrTelefonoFijo(titularTCREARptpatrTelefonoFijo);
        step1Request.setTitularcrearpatrTelefonoCelular(titularTCREARptpatrTelefonoCelular);
        step1Request.setTitularcrearpatrCorreoElectronico(titularTCREARptpatrCorreoElectronico);
        step1Request.setTitularcrearpatrTitularConBeneficios(titularTCREARptpatrTitularConBeneficios);
        step1Request.setTitularcrearpatrTitularRecuperadoInc(titularTCREARptpatrTitularRecuperadoInc);
        step1Request.setTitularcrearpatrTelefonoFijoDC(titularTCREARptpatrTelefonoFijoDC);
        step1Request.setTitularcrearpatrTelefonoCelularDC(titularTCREARptpatrTelefonoCelularDC);
        step1Request.setTitularcrearpatrTitularConBeneficiosCORE(titularTCREARptpatrTitularConBeneficiosCO);
        step1Request.setTitularcrearpatrRazonSocial(titularTCREARptpatrRazonSocial);
        instance = (Titular) titularSrv.crearImplementation(step1Request).getInstance();

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    // Service: TBORRAR

    /*
     * Entry point for service TBORRAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tBORRAR(
            com.keralty.aepersonas.viewmodel.titular.siu.TBORRARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = titularSrv.tBORRARTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TBORRAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tBORRARTxn(
            com.keralty.aepersonas.viewmodel.titular.siu.TBORRARRequest request) throws ModelException, SystemException {
        request.setTitularTBORRARpthisTitularInstance(titularSrv.getByOIDWithHV(request.getTitularTBORRARpthisTitular()));
        return titularSrv.tBORRARImplementation(request);
    }

    /*
     * Implements service TBORRAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tBORRARImplementation(
            com.keralty.aepersonas.viewmodel.titular.siu.TBORRARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Titular titularTBORRARpthisTitular = request.getTitularTBORRARpthisTitularInstance();

        request.checkArguments();
        Titular instance = titularTBORRARpthisTitular;

        boolean guard1 = repository.assocOperator010(titularTBORRARpthisTitular).equals(true);

        if (guard1) {
            com.keralty.aepersonas.viewmodel.direccion.siu.EliminarRequest step1Request = new com.keralty.aepersonas.viewmodel.direccion.siu.EliminarRequest();
            step1Request.setDireccioneliminarpthisDireccionInstance(titularTBORRARpthisTitular.getDireccion());
            direccionSrv.eliminarImplementation(step1Request);
        }

        com.keralty.aepersonas.viewmodel.titular.siu.EliminarRequest step2Request = new com.keralty.aepersonas.viewmodel.titular.siu.EliminarRequest();
        step2Request.setTitulareliminarpthisTitularInstance(titularTBORRARpthisTitular);
        titularSrv.eliminarImplementation(step2Request);

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
        select.getOrderByPart().addItem(Constants.normalizePath(TitularConstants.CLASS_NAME, TitularConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildTitularRelatedInstance(relatedInstanceJsonOid);
        }
        if (TitularConstants.ROLE_NAME_DIRECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (TitularConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (TitularConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (TitularConstants.ROLE_NAME_DEPARTAMENTONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (TitularConstants.ROLE_NAME_MUNICIPIONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildTitularRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTitularRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTitularRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTitularRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTitularRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildTitularRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            TitularOid oid = new TitularOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(TitularConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAesolicitudesidsolicitud(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(TitularService.class).error(e.getMessage());
        }
    }

}
