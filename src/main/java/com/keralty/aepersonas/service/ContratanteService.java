package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.repository.ContratanteJpaRepository;
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
public class ContratanteService extends AbstractService {

    ContratanteJpaRepository repository;

    ContratanteService contratanteSrv;

    DepartamentoService departamentoSrv;

    MunicipioService municipioSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    SolicitudService solicitudSrv;

    @Inject
    public ContratanteService(
            ContratanteService contratanteSrv,
            DepartamentoService departamentoSrv,
            MunicipioService municipioSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            SolicitudService solicitudSrv,
            ContratanteJpaRepository repository) {
        this.contratanteSrv = contratanteSrv;
        this.departamentoSrv = departamentoSrv;
        this.municipioSrv = municipioSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.solicitudSrv = solicitudSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, ContratanteConstants.CLASS_NAME);
    }

    private List<Contratante> solveContratanteTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, ContratanteConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveContratanteTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, ContratanteConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Contratante
     *
     * @return Population of class Contratante
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Contratante> get() {
        List<Contratante> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class Contratante that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Contratante matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Contratante> get(QueryRequest queryRequest) {
        return solveContratanteTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveContratanteTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveContratanteTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solveContratanteTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Contratante by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @return Instance of Contratante
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Contratante getById(Long aesolicitudesidsolicitud) {
        return getByOID(new ContratanteOid(aesolicitudesidsolicitud));
    }
    
    /*
     * Returns an instance of Contratante by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Contratante
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Contratante getByOID(ContratanteOid oid) {
        Optional<Contratante> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Contratante by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Contratante
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Contratante getByOIDWithHV(ContratanteOid oid) {
        Optional<Contratante> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Contratante> getInstanceByOid(ContratanteOid oid) {
        return oid != null && oid.getAesolicitudesidsolicitud() != null
               ? repository.findById(oid.getAesolicitudesidsolicitud())
               : Optional.empty();
    }

    /*
     * Returns an instance of Contratante by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Contratante
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Contratante getByJsonOid(String jsonOid) {
        ContratanteOid oid = new ContratanteOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Contratante related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Contratante
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Contratante> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveContratanteTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Contratante related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Contratante
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Contratante> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Contratante
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Contratante
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getContratanteDynamic(ContratanteOid oid, String displaySetItems) {
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
    public String getSuppInfo(ContratanteOid oid, String dsName) {
        Contratante instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Contratante instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIUContratanteNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Contratante using displayset DSContratanteNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.contratante.ds.DSContratanteNull> piuPIUContratanteNull(QueryRequest queryRequest) {
        return solveContratanteTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.contratante.ds.DSContratanteNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUContratanteNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUContratanteNull
     */
    public int getCount4PIUContratanteNull(QueryRequest queryRequest) {
        return solveContratanteTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.contratante.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.CrearRequest request) throws ModelException {
        request.setContratantecrearpagrDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(request.getContratantecrearpagrDepartamentoNac()));
        request.setContratantecrearpagrMunicipioNacInstance(municipioSrv.getByOIDWithHV(request.getContratantecrearpagrMunicipioNac()));
        request.setContratantecrearpagrDepartamentoResInstance(departamentoSrv.getByOIDWithHV(request.getContratantecrearpagrDepartamentoRes()));
        request.setContratantecrearpagrMunicipioResInstance(municipioSrv.getByOIDWithHV(request.getContratantecrearpagrMunicipioRes()));
        request.setContratantecrearpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getContratantecrearpagrTipoIdentificacion()));
        request.setContratantecrearpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getContratantecrearpagrSolicitud()));
        return contratanteSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento contratantecrearpagrDepartamentoNac = request.getContratantecrearpagrDepartamentoNacInstance();
        Municipio contratantecrearpagrMunicipioNac = request.getContratantecrearpagrMunicipioNacInstance();
        Departamento contratantecrearpagrDepartamentoRes = request.getContratantecrearpagrDepartamentoResInstance();
        Municipio contratantecrearpagrMunicipioRes = request.getContratantecrearpagrMunicipioResInstance();
        TipoIdentificacion contratantecrearpagrTipoIdentificacion = request.getContratantecrearpagrTipoIdentificacionInstance();
        Solicitud contratantecrearpagrSolicitud = request.getContratantecrearpagrSolicitudInstance();
        Long contratantecrearpatrCodigo = request.getContratantecrearpatrCodigo();
        String contratantecrearpatrNumIdentificacion = request.getContratantecrearpatrNumIdentificacion();
        String contratantecrearpatrTipoPersona = request.getContratantecrearpatrTipoPersona();
        String contratantecrearpatrPrimerNombre = request.getContratantecrearpatrPrimerNombre();
        String contratantecrearpatrSegundoNombre = request.getContratantecrearpatrSegundoNombre();
        String contratantecrearpatrPrimerApellido = request.getContratantecrearpatrPrimerApellido();
        String contratantecrearpatrSegundoApellido = request.getContratantecrearpatrSegundoApellido();
        String contratantecrearpatrRazonSocial = request.getContratantecrearpatrRazonSocial();
        Date contratantecrearpatrFechaNacimiento = request.getContratantecrearpatrFechaNacimiento();
        String contratantecrearpatrGenero = request.getContratantecrearpatrGenero();
        Boolean contratantecrearpatrIndicadorExtranjero = request.getContratantecrearpatrIndicadorExtranjero();
        String contratantecrearpatrTelefonoFijo = request.getContratantecrearpatrTelefonoFijo();
        String contratantecrearpatrTelefonoCelular = request.getContratantecrearpatrTelefonoCelular();
        String contratantecrearpatrCorreoElectronico = request.getContratantecrearpatrCorreoElectronico();
        Boolean contratantecrearpatrTitularConBeneficios = request.getContratantecrearpatrTitularConBeneficios();
        Boolean contratantecrearpatrDiplomatico = request.getContratantecrearpatrDiplomatico();
        String contratantecrearpatrDireccionRes = request.getContratantecrearpatrDireccionRes();
        String contratantecrearpatrTelefonoFijoRes = request.getContratantecrearpatrTelefonoFijoRes();
        String contratantecrearpatrTelefonoCelularRes = request.getContratantecrearpatrTelefonoCelularRes();
        Boolean contratantecrearpatrRuralDirRes = request.getContratantecrearpatrRuralDirRes();
        Boolean contratantecrearpatrTitularConBeneficiosCORE = request.getContratantecrearpatrTitularConBeneficiosCORE();

        request.checkArguments();
        Contratante instance = new Contratante();
        if (contratantecrearpagrDepartamentoNac != null && !contratantecrearpagrDepartamentoNac.isNull()) {
            instance.add2DepartamentoNac(contratantecrearpagrDepartamentoNac);
        }

        if (contratantecrearpagrMunicipioNac != null && !contratantecrearpagrMunicipioNac.isNull()) {
            instance.add2MunicipioNac(contratantecrearpagrMunicipioNac);
        }

        if (contratantecrearpagrDepartamentoRes != null && !contratantecrearpagrDepartamentoRes.isNull()) {
            instance.add2DepartamentoRes(contratantecrearpagrDepartamentoRes);
        }

        if (contratantecrearpagrMunicipioRes != null && !contratantecrearpagrMunicipioRes.isNull()) {
            instance.add2MunicipioRes(contratantecrearpagrMunicipioRes);
        }

        instance.add2TipoIdentificacion(contratantecrearpagrTipoIdentificacion);

        contratantecrearpagrSolicitud.add2Contratante(instance);
        instance.add2Solicitud(contratantecrearpagrSolicitud);

        instance.setContratanteDireccionesModificadas(Boolean.FALSE);
        instance.setContratanteCodigo(contratantecrearpatrCodigo);
        instance.setContratanteNumIdentificacion(contratantecrearpatrNumIdentificacion);
        instance.setContratanteTipoPersona(contratantecrearpatrTipoPersona);
        instance.setContratantePrimerNombre(contratantecrearpatrPrimerNombre);
        instance.setContratanteSegundoNombre(contratantecrearpatrSegundoNombre);
        instance.setContratantePrimerApellido(contratantecrearpatrPrimerApellido);
        instance.setContratanteSegundoApellido(contratantecrearpatrSegundoApellido);
        instance.setContratanteRazonSocial(contratantecrearpatrRazonSocial);
        instance.setContratanteFechaNacimiento(contratantecrearpatrFechaNacimiento);
        instance.setContratanteGenero(contratantecrearpatrGenero);
        instance.setContratanteIndicadorExtranjero(contratantecrearpatrIndicadorExtranjero);
        instance.setContratanteTelefonoFijo(contratantecrearpatrTelefonoFijo);
        instance.setContratanteTelefonoCelular(contratantecrearpatrTelefonoCelular);
        instance.setContratanteCorreoElectronico(contratantecrearpatrCorreoElectronico);
        instance.setContratanteTitularConBeneficios(contratantecrearpatrTitularConBeneficios);
        instance.setContratanteDiplomatico(contratantecrearpatrDiplomatico);
        instance.setContratanteDireccionRes(contratantecrearpatrDireccionRes);
        instance.setContratanteTelefonoFijoRes(contratantecrearpatrTelefonoFijoRes);
        instance.setContratanteTelefonoCelularRes(contratantecrearpatrTelefonoCelularRes);
        instance.setContratanteRuralDirRes(contratantecrearpatrRuralDirRes);
        instance.setContratanteTitularConBeneficiosCORE(contratantecrearpatrTitularConBeneficiosCORE);

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
            com.keralty.aepersonas.viewmodel.contratante.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.EliminarRequest request) throws ModelException {
        request.setContratanteeliminarpthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteeliminarpthisContratante()));
        return contratanteSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteeliminarpthisContratante = request.getContratanteeliminarpthisContratanteInstance();

        request.checkArguments();
        Contratante instance = contratanteeliminarpthisContratante;

        instance.getSolicitud().add2Contratante(null);

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
            com.keralty.aepersonas.viewmodel.contratante.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.modificarTxn(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.ModificarRequest request) throws ModelException {
        request.setContratantemodificarpthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratantemodificarpthisContratante()));
        return contratanteSrv.modificarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratantemodificarpthisContratante = request.getContratantemodificarpthisContratanteInstance();
        Long contratantemodificarpCodigo = request.getContratantemodificarpCodigo();
        String contratantemodificarpNumIdentificacion = request.getContratantemodificarpNumIdentificacion();
        String contratantemodificarpPrimerNombre = request.getContratantemodificarpPrimerNombre();
        String contratantemodificarpSegundoNombre = request.getContratantemodificarpSegundoNombre();
        String contratantemodificarpPrimerApellido = request.getContratantemodificarpPrimerApellido();
        String contratantemodificarpSegundoApellido = request.getContratantemodificarpSegundoApellido();
        String contratantemodificarpRazonSocial = request.getContratantemodificarpRazonSocial();
        Date contratantemodificarpFechaNacimiento = request.getContratantemodificarpFechaNacimiento();
        String contratantemodificarpGenero = request.getContratantemodificarpGenero();
        Boolean contratantemodificarpIndicadorExtranjero = request.getContratantemodificarpIndicadorExtranjero();
        String contratantemodificarpTelefonoFijo = request.getContratantemodificarpTelefonoFijo();
        String contratantemodificarpTelefonoCelular = request.getContratantemodificarpTelefonoCelular();
        String contratantemodificarpCorreoElectronico = request.getContratantemodificarpCorreoElectronico();
        Boolean contratantemodificarpDiplomatico = request.getContratantemodificarpDiplomatico();
        String contratantemodificarpTelefonoFijoRes = request.getContratantemodificarpTelefonoFijoRes();
        String contratantemodificarpTelefonoCelularRes = request.getContratantemodificarpTelefonoCelularRes();

        request.checkArguments();
        Contratante instance = contratantemodificarpthisContratante;
        instance.setContratanteCodigo(contratantemodificarpCodigo);
        instance.setContratanteNumIdentificacion(contratantemodificarpNumIdentificacion);
        instance.setContratantePrimerNombre(contratantemodificarpPrimerNombre);
        instance.setContratanteSegundoNombre(contratantemodificarpSegundoNombre);
        instance.setContratantePrimerApellido(contratantemodificarpPrimerApellido);
        instance.setContratanteSegundoApellido(contratantemodificarpSegundoApellido);
        instance.setContratanteRazonSocial(contratantemodificarpRazonSocial);
        instance.setContratanteFechaNacimiento(contratantemodificarpFechaNacimiento);
        instance.setContratanteGenero(contratantemodificarpGenero);
        instance.setContratanteIndicadorExtranjero(contratantemodificarpIndicadorExtranjero);
        instance.setContratanteTelefonoFijo(contratantemodificarpTelefonoFijo);
        instance.setContratanteTelefonoCelular(contratantemodificarpTelefonoCelular);
        instance.setContratanteCorreoElectronico(contratantemodificarpCorreoElectronico);
        instance.setContratanteDiplomatico(contratantemodificarpDiplomatico);
        instance.setContratanteTelefonoFijoRes(contratantemodificarpTelefonoFijoRes);
        instance.setContratanteTelefonoCelularRes(contratantemodificarpTelefonoCelularRes);


        response.setInstance(repository.save(instance));

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
            com.keralty.aepersonas.viewmodel.contratante.siu.CambTipoIdContratanteRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.cambTipoIdContratanteTxn(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.CambTipoIdContratanteRequest request) throws ModelException {
        request.setContratanteCambTipoIdContratantepthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteCambTipoIdContratantepthisContratante()));
        request.setContratanteCambTipoIdContratantepevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getContratanteCambTipoIdContratantepevcTipoIdentificacion()));
        return contratanteSrv.cambTipoIdContratanteImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.CambTipoIdContratanteRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteCambTipoIdContratantepthisContratante = request.getContratanteCambTipoIdContratantepthisContratanteInstance();
        TipoIdentificacion contratanteCambTipoIdContratantepevcTipoIdentificacion = request.getContratanteCambTipoIdContratantepevcTipoIdentificacionInstance();

        request.checkArguments();
        Contratante instance = contratanteCambTipoIdContratantepthisContratante;
        if (contratanteCambTipoIdContratantepevcTipoIdentificacion.getTipoIdentificacionNIT().equals(true)) {
            instance.setContratanteTipoPersona("J");
        } else {
            instance.setContratanteTipoPersona("N");
        }

        instance.add2TipoIdentificacion(contratanteCambTipoIdContratantepevcTipoIdentificacion);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdContratanteRequest relatedRequest = new com.keralty.aepersonas.viewmodel.tipoidentificacion.siu.CambTipoIdContratanteRequest();
            relatedRequest.setTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance(contratanteCambTipoIdContratantepevcTipoIdentificacion);
            relatedRequest.setTipoIdentificacionCambTipoIdContratantepevcContratanteInstance(contratanteCambTipoIdContratantepthisContratante);
            tipoIdentificacionSrv.cambTipoIdContratanteImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: InsDepartamentoNacContratante

    /*
     * Entry point for service InsDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDepartamentoNacContratante(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoNacContratanteRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.insDepartamentoNacContratanteTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDepartamentoNacContratanteTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoNacContratanteRequest request) throws ModelException {
        request.setContratanteInsDepartamentoNacContratantepthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteInsDepartamentoNacContratantepthisContratante()));
        request.setContratanteInsDepartamentoNacContratantepevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getContratanteInsDepartamentoNacContratantepevcDepartamento()));
        return contratanteSrv.insDepartamentoNacContratanteImplementation(request, true);
    }

    /*
     * Implements service InsDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDepartamentoNacContratanteImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoNacContratanteRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteInsDepartamentoNacContratantepthisContratante = request.getContratanteInsDepartamentoNacContratantepthisContratanteInstance();
        Departamento contratanteInsDepartamentoNacContratantepevcDepartamento = request.getContratanteInsDepartamentoNacContratantepevcDepartamentoInstance();

        request.checkArguments();
        Contratante instance = contratanteInsDepartamentoNacContratantepthisContratante;

        instance.add2DepartamentoNac(contratanteInsDepartamentoNacContratantepevcDepartamento);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacContratanteRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacContratanteRequest();
            relatedRequest.setDepartamentoInsDepartamentoNacContratantepthisDepartamentoInstance(contratanteInsDepartamentoNacContratantepevcDepartamento);
            relatedRequest.setDepartamentoInsDepartamentoNacContratantepevcContratanteInstance(contratanteInsDepartamentoNacContratantepthisContratante);
            departamentoSrv.insDepartamentoNacContratanteImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: DelDepartamentoNacContratante

    /*
     * Entry point for service DelDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDepartamentoNacContratante(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoNacContratanteRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.delDepartamentoNacContratanteTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDepartamentoNacContratanteTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoNacContratanteRequest request) throws ModelException {
        request.setContratanteDelDepartamentoNacContratantepthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteDelDepartamentoNacContratantepthisContratante()));
        request.setContratanteDelDepartamentoNacContratantepevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getContratanteDelDepartamentoNacContratantepevcDepartamento()));
        return contratanteSrv.delDepartamentoNacContratanteImplementation(request, true);
    }

    /*
     * Implements service DelDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDepartamentoNacContratanteImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoNacContratanteRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteDelDepartamentoNacContratantepthisContratante = request.getContratanteDelDepartamentoNacContratantepthisContratanteInstance();
        Departamento contratanteDelDepartamentoNacContratantepevcDepartamento = request.getContratanteDelDepartamentoNacContratantepevcDepartamentoInstance();

        request.checkArguments();
        Contratante instance = contratanteDelDepartamentoNacContratantepthisContratante;

        instance.add2DepartamentoNac(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacContratanteRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacContratanteRequest();
            relatedRequest.setDepartamentoDelDepartamentoNacContratantepthisDepartamentoInstance(contratanteDelDepartamentoNacContratantepevcDepartamento);
            relatedRequest.setDepartamentoDelDepartamentoNacContratantepevcContratanteInstance(contratanteDelDepartamentoNacContratantepthisContratante);
            departamentoSrv.delDepartamentoNacContratanteImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: InsMunicipioNacContratante

    /*
     * Entry point for service InsMunicipioNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insMunicipioNacContratante(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioNacContratanteRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.insMunicipioNacContratanteTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsMunicipioNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insMunicipioNacContratanteTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioNacContratanteRequest request) throws ModelException {
        request.setContratanteInsMunicipioNacContratantepthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteInsMunicipioNacContratantepthisContratante()));
        request.setContratanteInsMunicipioNacContratantepevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getContratanteInsMunicipioNacContratantepevcMunicipio()));
        return contratanteSrv.insMunicipioNacContratanteImplementation(request, true);
    }

    /*
     * Implements service InsMunicipioNacContratante
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insMunicipioNacContratanteImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioNacContratanteRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteInsMunicipioNacContratantepthisContratante = request.getContratanteInsMunicipioNacContratantepthisContratanteInstance();
        Municipio contratanteInsMunicipioNacContratantepevcMunicipio = request.getContratanteInsMunicipioNacContratantepevcMunicipioInstance();

        request.checkArguments();
        Contratante instance = contratanteInsMunicipioNacContratantepthisContratante;

        instance.add2MunicipioNac(contratanteInsMunicipioNacContratantepevcMunicipio);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioNacContratanteRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioNacContratanteRequest();
            relatedRequest.setMunicipioInsMunicipioNacContratantepthisMunicipioInstance(contratanteInsMunicipioNacContratantepevcMunicipio);
            relatedRequest.setMunicipioInsMunicipioNacContratantepevcContratanteInstance(contratanteInsMunicipioNacContratantepthisContratante);
            municipioSrv.insMunicipioNacContratanteImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: DelMunicipioNacContratante

    /*
     * Entry point for service DelMunicipioNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delMunicipioNacContratante(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioNacContratanteRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.delMunicipioNacContratanteTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelMunicipioNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delMunicipioNacContratanteTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioNacContratanteRequest request) throws ModelException {
        request.setContratanteDelMunicipioNacContratantepthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteDelMunicipioNacContratantepthisContratante()));
        request.setContratanteDelMunicipioNacContratantepevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getContratanteDelMunicipioNacContratantepevcMunicipio()));
        return contratanteSrv.delMunicipioNacContratanteImplementation(request, true);
    }

    /*
     * Implements service DelMunicipioNacContratante
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delMunicipioNacContratanteImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioNacContratanteRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteDelMunicipioNacContratantepthisContratante = request.getContratanteDelMunicipioNacContratantepthisContratanteInstance();
        Municipio contratanteDelMunicipioNacContratantepevcMunicipio = request.getContratanteDelMunicipioNacContratantepevcMunicipioInstance();

        request.checkArguments();
        Contratante instance = contratanteDelMunicipioNacContratantepthisContratante;

        instance.add2MunicipioNac(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioNacContratanteRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioNacContratanteRequest();
            relatedRequest.setMunicipioDelMunicipioNacContratantepthisMunicipioInstance(contratanteDelMunicipioNacContratantepevcMunicipio);
            relatedRequest.setMunicipioDelMunicipioNacContratantepevcContratanteInstance(contratanteDelMunicipioNacContratantepthisContratante);
            municipioSrv.delMunicipioNacContratanteImplementation(relatedRequest, false);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.FijarTitularConBeneficiosRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.fijarTitularConBeneficiosTxn(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.FijarTitularConBeneficiosRequest request) throws ModelException {
        request.setContratantefijarTitularConBeneficiospthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratantefijarTitularConBeneficiospthisContratante()));
        return contratanteSrv.fijarTitularConBeneficiosImplementation(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.FijarTitularConBeneficiosRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratantefijarTitularConBeneficiospthisContratante = request.getContratantefijarTitularConBeneficiospthisContratanteInstance();
        Boolean contratantefijarTitularConBeneficiospTitularConBeneficios = request.getContratantefijarTitularConBeneficiospTitularConBeneficios();

        request.checkArguments();
        Contratante instance = contratantefijarTitularConBeneficiospthisContratante;
        instance.setContratanteTitularConBeneficios(contratantefijarTitularConBeneficiospTitularConBeneficios);


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
            com.keralty.aepersonas.viewmodel.contratante.siu.ActualizarCodigoRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.actualizarCodigoTxn(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.ActualizarCodigoRequest request) throws ModelException {
        request.setContratanteactualizarCodigopthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteactualizarCodigopthisContratante()));
        return contratanteSrv.actualizarCodigoImplementation(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.ActualizarCodigoRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteactualizarCodigopthisContratante = request.getContratanteactualizarCodigopthisContratanteInstance();
        Long contratanteactualizarCodigopCodigo = request.getContratanteactualizarCodigopCodigo();

        request.checkArguments();
        Contratante instance = contratanteactualizarCodigopthisContratante;
        instance.setContratanteCodigo(contratanteactualizarCodigopCodigo);


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: InsDepartamentoRes

    /*
     * Entry point for service InsDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDepartamentoRes(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoResRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.insDepartamentoResTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDepartamentoResTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoResRequest request) throws ModelException {
        request.setContratanteInsDepartamentoRespthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteInsDepartamentoRespthisContratante()));
        request.setContratanteInsDepartamentoRespevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getContratanteInsDepartamentoRespevcDepartamento()));
        return contratanteSrv.insDepartamentoResImplementation(request, true);
    }

    /*
     * Implements service InsDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDepartamentoResImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoResRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteInsDepartamentoRespthisContratante = request.getContratanteInsDepartamentoRespthisContratanteInstance();
        Departamento contratanteInsDepartamentoRespevcDepartamento = request.getContratanteInsDepartamentoRespevcDepartamentoInstance();

        request.checkArguments();
        Contratante instance = contratanteInsDepartamentoRespthisContratante;

        instance.add2DepartamentoRes(contratanteInsDepartamentoRespevcDepartamento);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoResRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoResRequest();
            relatedRequest.setDepartamentoInsDepartamentoRespthisDepartamentoInstance(contratanteInsDepartamentoRespevcDepartamento);
            relatedRequest.setDepartamentoInsDepartamentoRespevcContratanteInstance(contratanteInsDepartamentoRespthisContratante);
            departamentoSrv.insDepartamentoResImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: DelDepartamentoRes

    /*
     * Entry point for service DelDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDepartamentoRes(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoResRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.delDepartamentoResTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDepartamentoResTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoResRequest request) throws ModelException {
        request.setContratanteDelDepartamentoRespthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteDelDepartamentoRespthisContratante()));
        request.setContratanteDelDepartamentoRespevcDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getContratanteDelDepartamentoRespevcDepartamento()));
        return contratanteSrv.delDepartamentoResImplementation(request, true);
    }

    /*
     * Implements service DelDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDepartamentoResImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoResRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteDelDepartamentoRespthisContratante = request.getContratanteDelDepartamentoRespthisContratanteInstance();
        Departamento contratanteDelDepartamentoRespevcDepartamento = request.getContratanteDelDepartamentoRespevcDepartamentoInstance();

        request.checkArguments();
        Contratante instance = contratanteDelDepartamentoRespthisContratante;

        instance.add2DepartamentoRes(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoResRequest relatedRequest = new com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoResRequest();
            relatedRequest.setDepartamentoDelDepartamentoRespthisDepartamentoInstance(contratanteDelDepartamentoRespevcDepartamento);
            relatedRequest.setDepartamentoDelDepartamentoRespevcContratanteInstance(contratanteDelDepartamentoRespthisContratante);
            departamentoSrv.delDepartamentoResImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: InsMunicipioRes

    /*
     * Entry point for service InsMunicipioRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insMunicipioRes(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioResRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.insMunicipioResTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsMunicipioRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insMunicipioResTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioResRequest request) throws ModelException {
        request.setContratanteInsMunicipioRespthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteInsMunicipioRespthisContratante()));
        request.setContratanteInsMunicipioRespevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getContratanteInsMunicipioRespevcMunicipio()));
        return contratanteSrv.insMunicipioResImplementation(request, true);
    }

    /*
     * Implements service InsMunicipioRes
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insMunicipioResImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioResRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteInsMunicipioRespthisContratante = request.getContratanteInsMunicipioRespthisContratanteInstance();
        Municipio contratanteInsMunicipioRespevcMunicipio = request.getContratanteInsMunicipioRespevcMunicipioInstance();

        request.checkArguments();
        Contratante instance = contratanteInsMunicipioRespthisContratante;

        instance.add2MunicipioRes(contratanteInsMunicipioRespevcMunicipio);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioResRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.InsMunicipioResRequest();
            relatedRequest.setMunicipioInsMunicipioRespthisMunicipioInstance(contratanteInsMunicipioRespevcMunicipio);
            relatedRequest.setMunicipioInsMunicipioRespevcContratanteInstance(contratanteInsMunicipioRespthisContratante);
            municipioSrv.insMunicipioResImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: DelMunicipioRes

    /*
     * Entry point for service DelMunicipioRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delMunicipioRes(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioResRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.delMunicipioResTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelMunicipioRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delMunicipioResTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioResRequest request) throws ModelException {
        request.setContratanteDelMunicipioRespthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteDelMunicipioRespthisContratante()));
        request.setContratanteDelMunicipioRespevcMunicipioInstance(municipioSrv.getByOIDWithHV(request.getContratanteDelMunicipioRespevcMunicipio()));
        return contratanteSrv.delMunicipioResImplementation(request, true);
    }

    /*
     * Implements service DelMunicipioRes
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delMunicipioResImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioResRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratanteDelMunicipioRespthisContratante = request.getContratanteDelMunicipioRespthisContratanteInstance();
        Municipio contratanteDelMunicipioRespevcMunicipio = request.getContratanteDelMunicipioRespevcMunicipioInstance();

        request.checkArguments();
        Contratante instance = contratanteDelMunicipioRespthisContratante;

        instance.add2MunicipioRes(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioResRequest relatedRequest = new com.keralty.aepersonas.viewmodel.municipio.siu.DelMunicipioResRequest();
            relatedRequest.setMunicipioDelMunicipioRespthisMunicipioInstance(contratanteDelMunicipioRespevcMunicipio);
            relatedRequest.setMunicipioDelMunicipioRespevcContratanteInstance(contratanteDelMunicipioRespthisContratante);
            municipioSrv.delMunicipioResImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: setDireccionRes

    /*
     * Entry point for service setDireccionRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse setDireccionRes(
            com.keralty.aepersonas.viewmodel.contratante.siu.SetDireccionResRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.setDireccionResTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service setDireccionRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse setDireccionResTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.SetDireccionResRequest request) throws ModelException {
        request.setContratantesetDireccionRespthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratantesetDireccionRespthisContratante()));
        return contratanteSrv.setDireccionResImplementation(request);
    }

    /*
     * Implements service setDireccionRes
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse setDireccionResImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.SetDireccionResRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratantesetDireccionRespthisContratante = request.getContratantesetDireccionRespthisContratanteInstance();
        String contratantesetDireccionResptDireccionRes = request.getContratantesetDireccionResptDireccionRes();
        Boolean contratantesetDireccionResptRural = request.getContratantesetDireccionResptRural();

        request.checkArguments();
        Contratante instance = contratantesetDireccionRespthisContratante;
        instance.setContratanteDireccionRes(contratantesetDireccionResptDireccionRes);
        instance.setContratanteRuralDirRes(contratantesetDireccionResptRural);


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
            com.keralty.aepersonas.viewmodel.contratante.siu.SetDirsModificadasRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.setDirsModificadasTxn(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.SetDirsModificadasRequest request) throws ModelException {
        request.setContratantesetDirsModificadaspthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratantesetDirsModificadaspthisContratante()));
        return contratanteSrv.setDirsModificadasImplementation(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.SetDirsModificadasRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Contratante contratantesetDirsModificadaspthisContratante = request.getContratantesetDirsModificadaspthisContratanteInstance();
        Boolean contratantesetDirsModificadasptMod = request.getContratantesetDirsModificadasptMod();

        request.checkArguments();
        Contratante instance = contratantesetDirsModificadaspthisContratante;
        instance.setContratanteDireccionesModificadas(contratantesetDirsModificadasptMod);


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
            com.keralty.aepersonas.viewmodel.contratante.siu.TMODIFICARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.tMODIFICARTxn(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.TMODIFICARRequest request) throws ModelException, SystemException {
        request.setContratanteTMODIFICARpthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteTMODIFICARpthisContratante()));
        request.setContratanteTMODIFICARptpevcTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getContratanteTMODIFICARptpevcTipoIdentificacion()));
        request.setContratanteTMODIFICARptDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(request.getContratanteTMODIFICARptDepartamentoNac()));
        request.setContratanteTMODIFICARptMunicipioNacInstance(municipioSrv.getByOIDWithHV(request.getContratanteTMODIFICARptMunicipioNac()));
        return contratanteSrv.tMODIFICARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.contratante.siu.TMODIFICARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        String contratanteTMODIFICARptpNumIdentificacion = request.getContratanteTMODIFICARptpNumIdentificacion();
        Long contratanteTMODIFICARptpCodigo = request.getContratanteTMODIFICARptpCodigo();
        String contratanteTMODIFICARptpPrimerNombre = request.getContratanteTMODIFICARptpPrimerNombre();
        String contratanteTMODIFICARptpPrimerApellido = request.getContratanteTMODIFICARptpPrimerApellido();
        String contratanteTMODIFICARptpSegundoApellido = request.getContratanteTMODIFICARptpSegundoApellido();
        String contratanteTMODIFICARptpRazonSocial = request.getContratanteTMODIFICARptpRazonSocial();
        Date contratanteTMODIFICARptpFechaNacimiento = request.getContratanteTMODIFICARptpFechaNacimiento();
        String contratanteTMODIFICARptpGenero = request.getContratanteTMODIFICARptpGenero();
        Boolean contratanteTMODIFICARptpIndicadorExtranjero = request.getContratanteTMODIFICARptpIndicadorExtranjero();
        String contratanteTMODIFICARptpTelefonoCelular = request.getContratanteTMODIFICARptpTelefonoCelular();
        String contratanteTMODIFICARptpCorreoElectronico = request.getContratanteTMODIFICARptpCorreoElectronico();
        Boolean contratanteTMODIFICARptpDiplomatico = request.getContratanteTMODIFICARptpDiplomatico();
        String contratanteTMODIFICARptpSegundoNombre = request.getContratanteTMODIFICARptpSegundoNombre();
        String contratanteTMODIFICARptpTelefonoFijo = request.getContratanteTMODIFICARptpTelefonoFijo();
        String contratanteTMODIFICARptTelefonoFijoRes = request.getContratanteTMODIFICARptTelefonoFijoRes();
        String contratanteTMODIFICARptTelefonoCelularRes = request.getContratanteTMODIFICARptTelefonoCelularRes();
        TipoIdentificacion contratanteTMODIFICARptpevcTipoIdentificacion = request.getContratanteTMODIFICARptpevcTipoIdentificacionInstance();
        Departamento contratanteTMODIFICARptDepartamentoNac = request.getContratanteTMODIFICARptDepartamentoNacInstance();
        Municipio contratanteTMODIFICARptMunicipioNac = request.getContratanteTMODIFICARptMunicipioNacInstance();
        Contratante contratanteTMODIFICARpthisContratante = request.getContratanteTMODIFICARpthisContratanteInstance();

        request.checkArguments();
        Contratante instance = contratanteTMODIFICARpthisContratante;

        com.keralty.aepersonas.viewmodel.contratante.siu.ModificarRequest step1Request = new com.keralty.aepersonas.viewmodel.contratante.siu.ModificarRequest();
        step1Request.setContratantemodificarpthisContratanteInstance(contratanteTMODIFICARpthisContratante);
        step1Request.setContratantemodificarpNumIdentificacion(contratanteTMODIFICARptpNumIdentificacion);
        step1Request.setContratantemodificarpCodigo(contratanteTMODIFICARptpCodigo);
        step1Request.setContratantemodificarpPrimerNombre(contratanteTMODIFICARptpPrimerNombre);
        step1Request.setContratantemodificarpPrimerApellido(contratanteTMODIFICARptpPrimerApellido);
        step1Request.setContratantemodificarpSegundoApellido(contratanteTMODIFICARptpSegundoApellido);
        step1Request.setContratantemodificarpRazonSocial(contratanteTMODIFICARptpRazonSocial);
        step1Request.setContratantemodificarpFechaNacimiento(contratanteTMODIFICARptpFechaNacimiento);
        step1Request.setContratantemodificarpGenero(contratanteTMODIFICARptpGenero);
        step1Request.setContratantemodificarpIndicadorExtranjero(contratanteTMODIFICARptpIndicadorExtranjero);
        step1Request.setContratantemodificarpTelefonoCelular(contratanteTMODIFICARptpTelefonoCelular);
        step1Request.setContratantemodificarpCorreoElectronico(contratanteTMODIFICARptpCorreoElectronico);
        step1Request.setContratantemodificarpDiplomatico(contratanteTMODIFICARptpDiplomatico);
        step1Request.setContratantemodificarpSegundoNombre(contratanteTMODIFICARptpSegundoNombre);
        step1Request.setContratantemodificarpTelefonoFijo(contratanteTMODIFICARptpTelefonoFijo);
        step1Request.setContratantemodificarpTelefonoFijoRes(contratanteTMODIFICARptTelefonoFijoRes);
        step1Request.setContratantemodificarpTelefonoCelularRes(contratanteTMODIFICARptTelefonoCelularRes);
        contratanteSrv.modificarImplementation(step1Request);

        boolean guard2 = !(contratanteTMODIFICARpthisContratante.getTipoIdentificacion().equalsObject(contratanteTMODIFICARptpevcTipoIdentificacion));

        if (guard2) {
            com.keralty.aepersonas.viewmodel.contratante.siu.CambTipoIdContratanteRequest step2Request = new com.keralty.aepersonas.viewmodel.contratante.siu.CambTipoIdContratanteRequest();
            step2Request.setContratanteCambTipoIdContratantepthisContratanteInstance(contratanteTMODIFICARpthisContratante);
            step2Request.setContratanteCambTipoIdContratantepevcTipoIdentificacionInstance(contratanteTMODIFICARptpevcTipoIdentificacion);
            contratanteSrv.cambTipoIdContratanteImplementation(step2Request, true);
        }

        boolean guard3 = repository.assocOperator000(contratanteTMODIFICARpthisContratante).equals(false) && (contratanteTMODIFICARptDepartamentoNac != null && !contratanteTMODIFICARptDepartamentoNac.isNull());

        if (guard3) {
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoNacContratanteRequest step3Request = new com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoNacContratanteRequest();
            step3Request.setContratanteInsDepartamentoNacContratantepthisContratanteInstance(contratanteTMODIFICARpthisContratante);
            step3Request.setContratanteInsDepartamentoNacContratantepevcDepartamentoInstance(contratanteTMODIFICARptDepartamentoNac);
            contratanteSrv.insDepartamentoNacContratanteImplementation(step3Request, true);
        }

        boolean guard4 = repository.assocOperator001(contratanteTMODIFICARpthisContratante).equals(true) && (contratanteTMODIFICARptDepartamentoNac == null || contratanteTMODIFICARptDepartamentoNac.isNull());

        if (guard4) {
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoNacContratanteRequest step4Request = new com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoNacContratanteRequest();
            step4Request.setContratanteDelDepartamentoNacContratantepthisContratanteInstance(contratanteTMODIFICARpthisContratante);
            step4Request.setContratanteDelDepartamentoNacContratantepevcDepartamentoInstance(contratanteTMODIFICARpthisContratante.getDepartamentoNac());
            contratanteSrv.delDepartamentoNacContratanteImplementation(step4Request, true);
        }

        /* Action 5: IF (EXIST (DepartamentoNac) = true AND ptDepartamentoNac <> NULL AND DepartamentoNac <> ptDepartamentoNac) */
        boolean ifCondition5 = repository.assocOperator006(contratanteTMODIFICARpthisContratante).equals(true) && (contratanteTMODIFICARptDepartamentoNac != null && !contratanteTMODIFICARptDepartamentoNac.isNull()) && !(contratanteTMODIFICARpthisContratante.getDepartamentoNac().equalsObject(contratanteTMODIFICARptDepartamentoNac));
        if (ifCondition5) {
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoNacContratanteRequest step50Request = new com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoNacContratanteRequest();
            step50Request.setContratanteDelDepartamentoNacContratantepthisContratanteInstance(contratanteTMODIFICARpthisContratante);
            step50Request.setContratanteDelDepartamentoNacContratantepevcDepartamentoInstance(contratanteTMODIFICARpthisContratante.getDepartamentoNac());
            contratanteSrv.delDepartamentoNacContratanteImplementation(step50Request, true);
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoNacContratanteRequest step51Request = new com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoNacContratanteRequest();
            step51Request.setContratanteInsDepartamentoNacContratantepthisContratanteInstance(contratanteTMODIFICARpthisContratante);
            step51Request.setContratanteInsDepartamentoNacContratantepevcDepartamentoInstance(contratanteTMODIFICARptDepartamentoNac);
            contratanteSrv.insDepartamentoNacContratanteImplementation(step51Request, true);
        }

        boolean guard6 = repository.assocOperator003(contratanteTMODIFICARpthisContratante).equals(false) && (contratanteTMODIFICARptMunicipioNac != null && !contratanteTMODIFICARptMunicipioNac.isNull());

        if (guard6) {
            com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioNacContratanteRequest step6Request = new com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioNacContratanteRequest();
            step6Request.setContratanteInsMunicipioNacContratantepthisContratanteInstance(contratanteTMODIFICARpthisContratante);
            step6Request.setContratanteInsMunicipioNacContratantepevcMunicipioInstance(contratanteTMODIFICARptMunicipioNac);
            contratanteSrv.insMunicipioNacContratanteImplementation(step6Request, true);
        }

        boolean guard7 = repository.assocOperator004(contratanteTMODIFICARpthisContratante).equals(true) && (contratanteTMODIFICARptMunicipioNac == null || contratanteTMODIFICARptMunicipioNac.isNull());

        if (guard7) {
            com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioNacContratanteRequest step7Request = new com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioNacContratanteRequest();
            step7Request.setContratanteDelMunicipioNacContratantepthisContratanteInstance(contratanteTMODIFICARpthisContratante);
            step7Request.setContratanteDelMunicipioNacContratantepevcMunicipioInstance(contratanteTMODIFICARpthisContratante.getMunicipioNac());
            contratanteSrv.delMunicipioNacContratanteImplementation(step7Request, true);
        }

        /* Action 8: IF (EXIST (MunicipioNac) = true AND ptMunicipioNac <> NULL AND MunicipioNac <> ptMunicipioNac) */
        boolean ifCondition8 = repository.assocOperator007(contratanteTMODIFICARpthisContratante).equals(true) && (contratanteTMODIFICARptMunicipioNac != null && !contratanteTMODIFICARptMunicipioNac.isNull()) && !(contratanteTMODIFICARpthisContratante.getMunicipioNac().equalsObject(contratanteTMODIFICARptMunicipioNac));
        if (ifCondition8) {
            com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioNacContratanteRequest step80Request = new com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioNacContratanteRequest();
            step80Request.setContratanteDelMunicipioNacContratantepthisContratanteInstance(contratanteTMODIFICARpthisContratante);
            step80Request.setContratanteDelMunicipioNacContratantepevcMunicipioInstance(contratanteTMODIFICARpthisContratante.getMunicipioNac());
            contratanteSrv.delMunicipioNacContratanteImplementation(step80Request, true);
            com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioNacContratanteRequest step81Request = new com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioNacContratanteRequest();
            step81Request.setContratanteInsMunicipioNacContratantepthisContratanteInstance(contratanteTMODIFICARpthisContratante);
            step81Request.setContratanteInsMunicipioNacContratantepevcMunicipioInstance(contratanteTMODIFICARptMunicipioNac);
            contratanteSrv.insMunicipioNacContratanteImplementation(step81Request, true);
        }

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    // Service: TSETDIRECCIONRES

    /*
     * Entry point for service TSETDIRECCIONRES
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tSETDIRECCIONRES(
            com.keralty.aepersonas.viewmodel.contratante.siu.TSETDIRECCIONRESRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.tSETDIRECCIONRESTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TSETDIRECCIONRES
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tSETDIRECCIONRESTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.TSETDIRECCIONRESRequest request) throws ModelException, SystemException {
        request.setContratanteTSETDIRECCIONRESpthisContratanteInstance(contratanteSrv.getByOIDWithHV(request.getContratanteTSETDIRECCIONRESpthisContratante()));
        request.setContratanteTSETDIRECCIONRESptDepartamentoResInstance(departamentoSrv.getByOIDWithHV(request.getContratanteTSETDIRECCIONRESptDepartamentoRes()));
        request.setContratanteTSETDIRECCIONRESptMunicipioResInstance(municipioSrv.getByOIDWithHV(request.getContratanteTSETDIRECCIONRESptMunicipioRes()));
        return contratanteSrv.tSETDIRECCIONRESImplementation(request);
    }

    /*
     * Implements service TSETDIRECCIONRES
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tSETDIRECCIONRESImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.TSETDIRECCIONRESRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        String contratanteTSETDIRECCIONRESptDireccionRes = request.getContratanteTSETDIRECCIONRESptDireccionRes();
        Boolean contratanteTSETDIRECCIONRESptRuralDirRes = request.getContratanteTSETDIRECCIONRESptRuralDirRes();
        Departamento contratanteTSETDIRECCIONRESptDepartamentoRes = request.getContratanteTSETDIRECCIONRESptDepartamentoResInstance();
        Municipio contratanteTSETDIRECCIONRESptMunicipioRes = request.getContratanteTSETDIRECCIONRESptMunicipioResInstance();
        Contratante contratanteTSETDIRECCIONRESpthisContratante = request.getContratanteTSETDIRECCIONRESpthisContratanteInstance();

        request.checkArguments();
        Contratante instance = contratanteTSETDIRECCIONRESpthisContratante;

        com.keralty.aepersonas.viewmodel.contratante.siu.SetDireccionResRequest step1Request = new com.keralty.aepersonas.viewmodel.contratante.siu.SetDireccionResRequest();
        step1Request.setContratantesetDireccionRespthisContratanteInstance(contratanteTSETDIRECCIONRESpthisContratante);
        step1Request.setContratantesetDireccionResptDireccionRes(contratanteTSETDIRECCIONRESptDireccionRes);
        step1Request.setContratantesetDireccionResptRural(contratanteTSETDIRECCIONRESptRuralDirRes);
        contratanteSrv.setDireccionResImplementation(step1Request);

        /* Action 2: IF (EXIST (DepartamentoRes) = false) */
        boolean ifCondition2 = repository.assocOperator010(contratanteTSETDIRECCIONRESpthisContratante).equals(false);
        if (ifCondition2) {
            /* Action 20: IF (ptDepartamentoRes <> NULL) */
            boolean ifCondition20 = (contratanteTSETDIRECCIONRESptDepartamentoRes != null && !contratanteTSETDIRECCIONRESptDepartamentoRes.isNull());
            if (ifCondition20) {
                com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoResRequest step200Request = new com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoResRequest();
                step200Request.setContratanteInsDepartamentoRespthisContratanteInstance(contratanteTSETDIRECCIONRESpthisContratante);
                step200Request.setContratanteInsDepartamentoRespevcDepartamentoInstance(contratanteTSETDIRECCIONRESptDepartamentoRes);
                contratanteSrv.insDepartamentoResImplementation(step200Request, true);
            }
        } else {
            /* Action 21: IF (DepartamentoRes <> ptDepartamentoRes) */
            boolean ifCondition21 = !(contratanteTSETDIRECCIONRESpthisContratante.getDepartamentoRes().equalsObject(contratanteTSETDIRECCIONRESptDepartamentoRes));
            if (ifCondition21) {
                com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoResRequest step210Request = new com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoResRequest();
                step210Request.setContratanteDelDepartamentoRespthisContratanteInstance(contratanteTSETDIRECCIONRESpthisContratante);
                step210Request.setContratanteDelDepartamentoRespevcDepartamentoInstance(contratanteTSETDIRECCIONRESpthisContratante.getDepartamentoRes());
                contratanteSrv.delDepartamentoResImplementation(step210Request, true);
                /* Action 211: IF (ptDepartamentoRes <> NULL) */
                boolean ifCondition211 = (contratanteTSETDIRECCIONRESptDepartamentoRes != null && !contratanteTSETDIRECCIONRESptDepartamentoRes.isNull());
                if (ifCondition211) {
                    com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoResRequest step2110Request = new com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoResRequest();
                    step2110Request.setContratanteInsDepartamentoRespthisContratanteInstance(contratanteTSETDIRECCIONRESpthisContratante);
                    step2110Request.setContratanteInsDepartamentoRespevcDepartamentoInstance(contratanteTSETDIRECCIONRESptDepartamentoRes);
                    contratanteSrv.insDepartamentoResImplementation(step2110Request, true);
                }
            }
        }

        /* Action 3: IF (EXIST (MunicipioRes) = false) */
        boolean ifCondition3 = repository.assocOperator011(contratanteTSETDIRECCIONRESpthisContratante).equals(false);
        if (ifCondition3) {
            /* Action 30: IF (ptMunicipioRes <> NULL) */
            boolean ifCondition30 = (contratanteTSETDIRECCIONRESptMunicipioRes != null && !contratanteTSETDIRECCIONRESptMunicipioRes.isNull());
            if (ifCondition30) {
                com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioResRequest step300Request = new com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioResRequest();
                step300Request.setContratanteInsMunicipioRespthisContratanteInstance(contratanteTSETDIRECCIONRESpthisContratante);
                step300Request.setContratanteInsMunicipioRespevcMunicipioInstance(contratanteTSETDIRECCIONRESptMunicipioRes);
                contratanteSrv.insMunicipioResImplementation(step300Request, true);
            }
        } else {
            /* Action 31: IF (MunicipioRes <> ptMunicipioRes) */
            boolean ifCondition31 = !(contratanteTSETDIRECCIONRESpthisContratante.getMunicipioRes().equalsObject(contratanteTSETDIRECCIONRESptMunicipioRes));
            if (ifCondition31) {
                com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioResRequest step310Request = new com.keralty.aepersonas.viewmodel.contratante.siu.DelMunicipioResRequest();
                step310Request.setContratanteDelMunicipioRespthisContratanteInstance(contratanteTSETDIRECCIONRESpthisContratante);
                step310Request.setContratanteDelMunicipioRespevcMunicipioInstance(contratanteTSETDIRECCIONRESpthisContratante.getMunicipioRes());
                contratanteSrv.delMunicipioResImplementation(step310Request, true);
                /* Action 311: IF (ptMunicipioRes <> NULL) */
                boolean ifCondition311 = (contratanteTSETDIRECCIONRESptMunicipioRes != null && !contratanteTSETDIRECCIONRESptMunicipioRes.isNull());
                if (ifCondition311) {
                    com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioResRequest step3110Request = new com.keralty.aepersonas.viewmodel.contratante.siu.InsMunicipioResRequest();
                    step3110Request.setContratanteInsMunicipioRespthisContratanteInstance(contratanteTSETDIRECCIONRESpthisContratante);
                    step3110Request.setContratanteInsMunicipioRespevcMunicipioInstance(contratanteTSETDIRECCIONRESptMunicipioRes);
                    contratanteSrv.insMunicipioResImplementation(step3110Request, true);
                }
            }
        }

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    // Service: TNEW

    /*
     * Entry point for service TNEW
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tNEW(
            com.keralty.aepersonas.viewmodel.contratante.siu.TNEWRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = contratanteSrv.tNEWTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TNEW
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tNEWTxn(
            com.keralty.aepersonas.viewmodel.contratante.siu.TNEWRequest request) throws ModelException {
        request.setContratanteTNEWptpagrSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getContratanteTNEWptpagrSolicitud()));
        request.setContratanteTNEWptpagrTipoIdentificacionInstance(tipoIdentificacionSrv.getByOIDWithHV(request.getContratanteTNEWptpagrTipoIdentificacion()));
        request.setContratanteTNEWptpagrDepartamentoNacInstance(departamentoSrv.getByOIDWithHV(request.getContratanteTNEWptpagrDepartamentoNac()));
        request.setContratanteTNEWptpagrMunicipioNacInstance(municipioSrv.getByOIDWithHV(request.getContratanteTNEWptpagrMunicipioNac()));
        return contratanteSrv.tNEWImplementation(request);
    }

    /*
     * Implements service TNEW
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tNEWImplementation(
            com.keralty.aepersonas.viewmodel.contratante.siu.TNEWRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento contratanteTNEWptpagrDepartamentoNac = request.getContratanteTNEWptpagrDepartamentoNacInstance();
        Municipio contratanteTNEWptpagrMunicipioNac = request.getContratanteTNEWptpagrMunicipioNacInstance();
        TipoIdentificacion contratanteTNEWptpagrTipoIdentificacion = request.getContratanteTNEWptpagrTipoIdentificacionInstance();
        Solicitud contratanteTNEWptpagrSolicitud = request.getContratanteTNEWptpagrSolicitudInstance();
        Long contratanteTNEWptpatrCodigo = request.getContratanteTNEWptpatrCodigo();
        String contratanteTNEWptpatrNumIdentificacion = request.getContratanteTNEWptpatrNumIdentificacion();
        String contratanteTNEWptpatrTipoPersona = request.getContratanteTNEWptpatrTipoPersona();
        String contratanteTNEWptpatrPrimerNombre = request.getContratanteTNEWptpatrPrimerNombre();
        String contratanteTNEWptpatrSegundoNombre = request.getContratanteTNEWptpatrSegundoNombre();
        String contratanteTNEWptpatrPrimerApellido = request.getContratanteTNEWptpatrPrimerApellido();
        String contratanteTNEWptpatrSegundoApellido = request.getContratanteTNEWptpatrSegundoApellido();
        String contratanteTNEWptpatrRazonSocial = request.getContratanteTNEWptpatrRazonSocial();
        Date contratanteTNEWptpatrFechaNacimiento = request.getContratanteTNEWptpatrFechaNacimiento();
        String contratanteTNEWptpatrGenero = request.getContratanteTNEWptpatrGenero();
        Boolean contratanteTNEWptpatrIndicadorExtranjero = request.getContratanteTNEWptpatrIndicadorExtranjero();
        String contratanteTNEWptpatrTelefonoFijo = request.getContratanteTNEWptpatrTelefonoFijo();
        String contratanteTNEWptpatrTelefonoCelular = request.getContratanteTNEWptpatrTelefonoCelular();
        String contratanteTNEWptpatrCorreoElectronico = request.getContratanteTNEWptpatrCorreoElectronico();
        Boolean contratanteTNEWptpatrTitularConBeneficios = request.getContratanteTNEWptpatrTitularConBeneficios();
        Boolean contratanteTNEWptpatrDiplomatico = request.getContratanteTNEWptpatrDiplomatico();
        String contratanteTNEWptpatrTelefonoFijoRes = request.getContratanteTNEWptpatrTelefonoFijoRes();
        String contratanteTNEWptpatrTelefonoCelularRes = request.getContratanteTNEWptpatrTelefonoCelularRes();
        Boolean contratanteTNEWptTitularConBeneficiosCORE = request.getContratanteTNEWptTitularConBeneficiosCORE();

        request.checkArguments();
        Contratante instance;

        com.keralty.aepersonas.viewmodel.contratante.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.contratante.siu.CrearRequest();
        step1Request.setContratantecrearpagrDepartamentoNacInstance(contratanteTNEWptpagrDepartamentoNac);
        step1Request.setContratantecrearpagrMunicipioNacInstance(contratanteTNEWptpagrMunicipioNac);
        step1Request.setContratantecrearpagrDepartamentoResInstance(null);
        step1Request.setContratantecrearpagrMunicipioResInstance(null);
        step1Request.setContratantecrearpagrTipoIdentificacionInstance(contratanteTNEWptpagrTipoIdentificacion);
        step1Request.setContratantecrearpagrSolicitudInstance(contratanteTNEWptpagrSolicitud);
        step1Request.setContratantecrearpatrCodigo(contratanteTNEWptpatrCodigo);
        step1Request.setContratantecrearpatrNumIdentificacion(contratanteTNEWptpatrNumIdentificacion);
        step1Request.setContratantecrearpatrTipoPersona(contratanteTNEWptpatrTipoPersona);
        step1Request.setContratantecrearpatrPrimerNombre(contratanteTNEWptpatrPrimerNombre);
        step1Request.setContratantecrearpatrSegundoNombre(contratanteTNEWptpatrSegundoNombre);
        step1Request.setContratantecrearpatrPrimerApellido(contratanteTNEWptpatrPrimerApellido);
        step1Request.setContratantecrearpatrSegundoApellido(contratanteTNEWptpatrSegundoApellido);
        step1Request.setContratantecrearpatrRazonSocial(contratanteTNEWptpatrRazonSocial);
        step1Request.setContratantecrearpatrFechaNacimiento(contratanteTNEWptpatrFechaNacimiento);
        step1Request.setContratantecrearpatrGenero(contratanteTNEWptpatrGenero);
        step1Request.setContratantecrearpatrIndicadorExtranjero(contratanteTNEWptpatrIndicadorExtranjero);
        step1Request.setContratantecrearpatrTelefonoFijo(contratanteTNEWptpatrTelefonoFijo);
        step1Request.setContratantecrearpatrTelefonoCelular(contratanteTNEWptpatrTelefonoCelular);
        step1Request.setContratantecrearpatrCorreoElectronico(contratanteTNEWptpatrCorreoElectronico);
        step1Request.setContratantecrearpatrTitularConBeneficios(contratanteTNEWptpatrTitularConBeneficios);
        step1Request.setContratantecrearpatrDiplomatico(contratanteTNEWptpatrDiplomatico);
        step1Request.setContratantecrearpatrDireccionRes(null);
        step1Request.setContratantecrearpatrTelefonoFijoRes(contratanteTNEWptpatrTelefonoFijoRes);
        step1Request.setContratantecrearpatrTelefonoCelularRes(contratanteTNEWptpatrTelefonoCelularRes);
        step1Request.setContratantecrearpatrRuralDirRes(null);
        step1Request.setContratantecrearpatrTitularConBeneficiosCORE(contratanteTNEWptTitularConBeneficiosCORE);
        instance = (Contratante) contratanteSrv.crearImplementation(step1Request).getInstance();

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
        select.getOrderByPart().addItem(Constants.normalizePath(ContratanteConstants.CLASS_NAME, ContratanteConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildContratanteRelatedInstance(relatedInstanceJsonOid);
        }
        if (ContratanteConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratanteConstants.ROLE_NAME_DEPARTAMENTONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || ContratanteConstants.ROLE_NAME_DEPARTAMENTORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratanteConstants.ROLE_NAME_MUNICIPIONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || ContratanteConstants.ROLE_NAME_MUNICIPIORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildContratanteRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildContratanteRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildContratanteRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildContratanteRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildContratanteRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
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
            ContratanteOid oid = new ContratanteOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(ContratanteConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAesolicitudesidsolicitud(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(ContratanteService.class).error(e.getMessage());
        }
    }

}
