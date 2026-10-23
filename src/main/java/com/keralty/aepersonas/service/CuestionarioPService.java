package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.MinCardinalityException;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.CuestionarioMed;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.oid.CuestionarioMedOid;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.PreguntaP;
import com.keralty.aepersonas.persistence.Seccion;
import com.keralty.aepersonas.persistence.SeccionP;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.repository.CuestionarioPJpaRepository;
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
import com.keralty.integraciones.patient.ConsultarCuestionarioMedicoResponse;
import com.keralty.integraciones.patient.ConsultarPersonaRequest;
import com.keralty.integraciones.patient.questionnaire.response.Entry;
import com.keralty.integraciones.patient.questionnaire.response.ItemAnswer;
import com.keralty.integraciones.patient.questionnaire.response.ItemItem;
import com.keralty.integraciones.patient.questionnaire.response.ResourceEntry;
import com.keralty.integraciones.patient.questionnaire.response.ResourceItem;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.LoggerFactory;


@Transactional
@ApplicationScoped
public class CuestionarioPService extends AbstractService {

    CuestionarioPJpaRepository repository;

    CuestionarioPService cuestionarioPSrv;

    UsuarioService usuarioSrv;

    CuestionarioMedService cuestionarioMedSrv;

    SeccionService seccionSrv;

    SeccionPService seccionPSrv;

    PreguntaPService preguntaPSrv;

    SolicitudService solicitudSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    UserFunctions userFunctionsSrv;

    @RestClient
    BhCallService bhCallService;
    
    @Inject
    public CuestionarioPService(
            CuestionarioPService cuestionarioPSrv,
            UsuarioService usuarioSrv,
            CuestionarioMedService cuestionarioMedSrv,
            SeccionService seccionSrv,
            SeccionPService seccionPSrv,
            PreguntaPService preguntaPSrv,
            SolicitudService solicitudSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            UserFunctions userFunctionsSrv,
            CuestionarioPJpaRepository repository) {
        this.cuestionarioPSrv = cuestionarioPSrv;
        this.usuarioSrv = usuarioSrv;
        this.cuestionarioMedSrv = cuestionarioMedSrv;
        this.seccionSrv = seccionSrv;
        this.seccionPSrv = seccionPSrv;
        this.preguntaPSrv = preguntaPSrv;
        this.solicitudSrv = solicitudSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.userFunctionsSrv = userFunctionsSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, CuestionarioPConstants.CLASS_NAME);
    }

    private List<CuestionarioP> solveCuestionarioPTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, CuestionarioPConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveCuestionarioPTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, CuestionarioPConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class CuestionarioP
     *
     * @return Population of class CuestionarioP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<CuestionarioP> get() {
        List<CuestionarioP> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class CuestionarioP that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class CuestionarioP matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<CuestionarioP> get(QueryRequest queryRequest) {
        return solveCuestionarioPTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveCuestionarioPTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveCuestionarioPTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solveCuestionarioPTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of CuestionarioP by ID
     *
     * @param cuestionarioPNumero Identification field cuestionarioPNumero
     *
     * @return Instance of CuestionarioP
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public CuestionarioP getById(Long cuestionarioPNumero) {
        return getByOID(new CuestionarioPOid(cuestionarioPNumero));
    }
    
    /*
     * Returns an instance of CuestionarioP by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of CuestionarioP
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public CuestionarioP getByOID(CuestionarioPOid oid) {
        Optional<CuestionarioP> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of CuestionarioP by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of CuestionarioP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public CuestionarioP getByOIDWithHV(CuestionarioPOid oid) {
        Optional<CuestionarioP> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<CuestionarioP> getInstanceByOid(CuestionarioPOid oid) {
        return oid != null && oid.getCuestionarioPNumero() != null
               ? repository.findById(oid.getCuestionarioPNumero())
               : Optional.empty();
    }

    /*
     * Returns an instance of CuestionarioP by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of CuestionarioP
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public CuestionarioP getByJsonOid(String jsonOid) {
        CuestionarioPOid oid = new CuestionarioPOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of CuestionarioP related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of CuestionarioP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<CuestionarioP> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveCuestionarioPTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of CuestionarioP related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of CuestionarioP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<CuestionarioP> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of CuestionarioP
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of CuestionarioP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getCuestionarioPDynamic(CuestionarioPOid oid, String displaySetItems) {
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
    public String getSuppInfo(CuestionarioPOid oid, String dsName) {
        CuestionarioP instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(CuestionarioP instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods

    /*
     * Returns a viewmodel for class CuestionarioP with displayset DSCuestionarioPIIU for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class CuestionarioP with displayset DSCuestionarioPIIU
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.cuestionariop.ds.DSCuestionarioPIIU iIUCuestionario(CuestionarioPOid oid) {
        return new com.keralty.aepersonas.viewmodel.cuestionariop.ds.DSCuestionarioPIIU(getByOIDWithHV(oid));
    }


    /*
     * Solves the query needed for PIUCuestionarioPNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for CuestionarioP using displayset DSCuestionarioPNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.cuestionariop.ds.DSCuestionarioPNull> piuPIUCuestionarioPNull(QueryRequest queryRequest) {
        return solveCuestionarioPTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.cuestionariop.ds.DSCuestionarioPNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUCuestionarioPNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUCuestionarioPNull
     */
    public int getCount4PIUCuestionarioPNull(QueryRequest queryRequest) {
        return solveCuestionarioPTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = cuestionarioPSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.CrearRequest request) throws ModelException {
        request.setCuestionarioPcrearpagrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getCuestionarioPcrearpagrUsuario()));
        return cuestionarioPSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario cuestionarioPcrearpagrUsuario = request.getCuestionarioPcrearpagrUsuarioInstance();
        String cuestionarioPcrearpatrNombre = request.getCuestionarioPcrearpatrNombre();

        request.checkArguments();
        CuestionarioP instance = new CuestionarioP();
        cuestionarioPcrearpagrUsuario.add2CuestionarioP(instance);
        instance.add2Usuario(cuestionarioPcrearpagrUsuario);

        instance.setCuestionarioPNumero(Long.valueOf(0));
        instance.setCuestionarioPYaDiligenciado(Boolean.FALSE);
        instance.setCuestionarioPNombre(cuestionarioPcrearpatrNombre);

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
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = cuestionarioPSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.EliminarRequest request) throws ModelException {
        request.setCuestionarioPeliminarpthisCuestionarioPInstance(cuestionarioPSrv.getByOIDWithHV(request.getCuestionarioPeliminarpthisCuestionarioP()));
        return cuestionarioPSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        CuestionarioP cuestionarioPeliminarpthisCuestionarioP = request.getCuestionarioPeliminarpthisCuestionarioPInstance();

        request.checkArguments();
        CuestionarioP instance = cuestionarioPeliminarpthisCuestionarioP;
        if(cuestionarioPeliminarpthisCuestionarioP.getSecciones().size() > 0) {
            throw new MinCardinalityException(CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ROLE_ALIAS_SECCIONES);
        }

        instance.getUsuario().add2CuestionarioP(null);

        repository.delete(instance);
        
        response.setInstance(instance);

        return response;
    }

    // Service: cerrar

    /*
     * Entry point for service cerrar
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cerrar(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.CerrarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = cuestionarioPSrv.cerrarTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service cerrar
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cerrarTxn(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.CerrarRequest request) throws ModelException {
        request.setCuestionarioPcerrarpthisCuestionarioPInstance(cuestionarioPSrv.getByOIDWithHV(request.getCuestionarioPcerrarpthisCuestionarioP()));
        return cuestionarioPSrv.cerrarImplementation(request);
    }

    /*
     * Implements service cerrar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cerrarImplementation(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.CerrarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        CuestionarioP cuestionarioPcerrarpthisCuestionarioP = request.getCuestionarioPcerrarpthisCuestionarioPInstance();

        request.checkArguments();
        CuestionarioP instance = cuestionarioPcerrarpthisCuestionarioP;
        instance.setCuestionarioPYaDiligenciado(Boolean.TRUE);


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: TCREARYSECCIONES

    /*
     * Entry point for service TCREARYSECCIONES
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARYSECCIONES(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCREARYSECCIONESRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = cuestionarioPSrv.tCREARYSECCIONESTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARYSECCIONES
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARYSECCIONESTxn(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCREARYSECCIONESRequest request) throws ModelException, SystemException {
        request.setCuestionarioPTCREARYSECCIONESptUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getCuestionarioPTCREARYSECCIONESptUsuario()));
        request.setCuestionarioPTCREARYSECCIONESptCuestionarioInstance(cuestionarioMedSrv.getByOIDWithHV(request.getCuestionarioPTCREARYSECCIONESptCuestionario()));
        return cuestionarioPSrv.tCREARYSECCIONESImplementation(request);
    }

    /*
     * Implements service TCREARYSECCIONES
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARYSECCIONESImplementation(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCREARYSECCIONESRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Usuario cuestionarioPTCREARYSECCIONESptUsuario = request.getCuestionarioPTCREARYSECCIONESptUsuarioInstance();
        CuestionarioMed cuestionarioPTCREARYSECCIONESptCuestionario = request.getCuestionarioPTCREARYSECCIONESptCuestionarioInstance();

        request.checkArguments();
        CuestionarioP instance;

        com.keralty.aepersonas.viewmodel.cuestionariop.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.cuestionariop.siu.CrearRequest();
        step1Request.setCuestionarioPcrearpagrUsuarioInstance(cuestionarioPTCREARYSECCIONESptUsuario);
        step1Request.setCuestionarioPcrearpatrNombre(cuestionarioPTCREARYSECCIONESptCuestionario.getCuestionarioMedNombre());
        instance = (CuestionarioP) cuestionarioPSrv.crearImplementation(step1Request).getInstance();

        for(Seccion step2Entity : repository.assocOperator000(cuestionarioPTCREARYSECCIONESptCuestionario)) {
            com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARYPREGUNTASRequest step2Request = new com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARYPREGUNTASRequest();
            step2Request.setSeccionPTCREARYPREGUNTASptSeccionInstance(step2Entity);
            step2Request.setSeccionPTCREARYPREGUNTASptCuestionarioPInstance(instance);
            seccionPSrv.tCREARYPREGUNTASImplementation(step2Request);
        }

        for(SeccionP step3Entity : repository.assocOperator001(instance)) {
            com.keralty.aepersonas.viewmodel.seccionp.siu.TELIMINARRequest step3Request = new com.keralty.aepersonas.viewmodel.seccionp.siu.TELIMINARRequest();
            step3Request.setSeccionPTELIMINARpthisSeccionPInstance(step3Entity);
            seccionPSrv.tELIMINARImplementation(step3Request);
        }

        // Consultamos el cuestionario medico de la persona

        ConsultarPersonaRequest requestQuestionario = new ConsultarPersonaRequest();
        requestQuestionario.setNumSolicitud(cuestionarioPTCREARYSECCIONESptUsuario.getSolicitud().getSolicitudNumRadicado().toString());
        requestQuestionario.setTipoIdentificacion(cuestionarioPTCREARYSECCIONESptUsuario.getTipoIdentificacion().getTipoIdentificacionNombreCorto());
        requestQuestionario.setNumeroIdentificacion(cuestionarioPTCREARYSECCIONESptUsuario.getUsuarioNumIdentificacion());
		ConsultarCuestionarioMedicoResponse respuestaCuestionario = bhCallService.consultarCuestionarioMedico(requestQuestionario );

		// Si hemos ercibido los datos del cuestionario, asignamos valor a las respuestas. 
		if (respuestaCuestionario != null && respuestaCuestionario.isExito() && respuestaCuestionario.getQuestionnaireResponse() != null &&
				respuestaCuestionario.getQuestionnaireResponse().getEntry() != null) {

			for (Entry entry : respuestaCuestionario.getQuestionnaireResponse().getEntry()) {
				if (entry.getResource() != null && entry.getResource().getEntry() != null) {
					for (ResourceEntry entry2 : entry.getResource().getEntry()) {
						if (entry2.getResource() != null && entry2.getResource().getItem() != null) {
							for (ResourceItem item : entry2.getResource().getItem()) {
								for (ItemItem item2 : item.getItem()) {
									String numpregunta = item2.getLinkID();
									
									
									if (numpregunta != null && item2.getAnswer() != null && !item2.getAnswer().isEmpty()) {
										ItemAnswer respuesta = item2.getAnswer().get(0);
										boolean respuestaSiNo = respuesta.getValueBoolean() != null ? respuesta.getValueBoolean() : false;
										String textoRespuesta = "";
										if (respuestaSiNo) {
											if (respuesta.getItem() != null && !respuesta.getItem().isEmpty() && 
													respuesta.getItem().get(0).getAnswer() != null && 
													!respuesta.getItem().get(0).getAnswer().isEmpty() ) {
												textoRespuesta = respuesta.getItem().get(0).getAnswer().get(0).getValueString();
											}
										}

										// Llamamos al servicio
								        com.keralty.aepersonas.viewmodel.cuestionariop.siu.TMARCARDATOSPREGUNTACORERequest step4Request = new com.keralty.aepersonas.viewmodel.cuestionariop.siu.TMARCARDATOSPREGUNTACORERequest();
								        step4Request.setCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance(instance);
								        step4Request.setCuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo(respuestaSiNo);
								        step4Request.setCuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs(textoRespuesta);
								        try {
								        	step4Request.setCuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta(Long.valueOf(numpregunta));
								        } catch (NumberFormatException e) {
								        	throw new ModelException("Valor incorrecto para NumPregunta");
								        }
								        cuestionarioPSrv.tMARCARDATOSPREGUNTACOREImplementation(step4Request);
									}
								}
							}
						}
					}
				}
			}
			
		}        

        response.setInstance(getByOID(instance.getOid()));

        return response;
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
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TELIMINARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = cuestionarioPSrv.tELIMINARTxn(request);
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
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TELIMINARRequest request) throws ModelException, SystemException {
        request.setCuestionarioPTELIMINARpthisCuestionarioPInstance(cuestionarioPSrv.getByOIDWithHV(request.getCuestionarioPTELIMINARpthisCuestionarioP()));
        return cuestionarioPSrv.tELIMINARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TELIMINARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        CuestionarioP cuestionarioPTELIMINARpthisCuestionarioP = request.getCuestionarioPTELIMINARpthisCuestionarioPInstance();

        request.checkArguments();
        CuestionarioP instance = cuestionarioPTELIMINARpthisCuestionarioP;

        for(SeccionP step1Entity : repository.assocOperator003(cuestionarioPTELIMINARpthisCuestionarioP)) {
            com.keralty.aepersonas.viewmodel.seccionp.siu.TELIMINARRequest step1Request = new com.keralty.aepersonas.viewmodel.seccionp.siu.TELIMINARRequest();
            step1Request.setSeccionPTELIMINARpthisSeccionPInstance(step1Entity);
            seccionPSrv.tELIMINARImplementation(step1Request);
        }

        com.keralty.aepersonas.viewmodel.cuestionariop.siu.EliminarRequest step2Request = new com.keralty.aepersonas.viewmodel.cuestionariop.siu.EliminarRequest();
        step2Request.setCuestionarioPeliminarpthisCuestionarioPInstance(cuestionarioPTELIMINARpthisCuestionarioP);
        cuestionarioPSrv.eliminarImplementation(step2Request);

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    // Service: TCERRAR

    /*
     * Entry point for service TCERRAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCERRAR(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCERRARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = cuestionarioPSrv.tCERRARTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCERRAR
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCERRARTxn(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCERRARRequest request) throws ModelException, SystemException {
        request.setCuestionarioPTCERRARpthisCuestionarioPInstance(cuestionarioPSrv.getByOIDWithHV(request.getCuestionarioPTCERRARpthisCuestionarioP()));
        return cuestionarioPSrv.tCERRARImplementation(request);
    }

    /*
     * Implements service TCERRAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCERRARImplementation(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCERRARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        CuestionarioP cuestionarioPTCERRARpthisCuestionarioP = request.getCuestionarioPTCERRARpthisCuestionarioPInstance();

        request.checkArguments();
        CuestionarioP instance = cuestionarioPTCERRARpthisCuestionarioP;

        /* Action 1: IF ((Usuario.Solicitud.EsTraslado = false AND Usuario.drvTieneEPSSanitas = true AND fugetValorParametroConf("CONTROLPREGUNTA108") = "1" AND EXIST (Secciones.Preguntas) WHERE (Secciones.Preguntas.Numero = 108 AND Secciones.Preguntas.RespuestaSiNo = false) = true) OR (Usuario.TipoIdentificacion.MenorSinIdentificar = true)) */
        boolean ifCondition1 = (cuestionarioPTCERRARpthisCuestionarioP.getUsuario().getSolicitud().getSolicitudEsTraslado().equals(false) && cuestionarioPTCERRARpthisCuestionarioP.getUsuario().getUsuariodrvTieneEPSSanitas().equals(true) && (userFunctionsSrv.fugetValorParametroConfFun("CONTROLPREGUNTA108")).equals("1") && repository.assocOperator006(cuestionarioPTCERRARpthisCuestionarioP).equals(true)) || (cuestionarioPTCERRARpthisCuestionarioP.getUsuario().getTipoIdentificacion().getTipoIdentificacionMenorSinIdentificar().equals(true));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCAMBIARPREGUNTA108Request step10Request = new com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCAMBIARPREGUNTA108Request();
            step10Request.setCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance(cuestionarioPTCERRARpthisCuestionarioP);
            cuestionarioPSrv.tCAMBIARPREGUNTA108Implementation(step10Request);
        }

        for(PreguntaP step2Entity : repository.assocOperator005(cuestionarioPTCERRARpthisCuestionarioP)) {
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyPrecondicionesRespuestaRequest step2Request = new com.keralty.aepersonas.viewmodel.preguntap.siu.DummyPrecondicionesRespuestaRequest();
            step2Request.setPreguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance(step2Entity);
            preguntaPSrv.dummyPrecondicionesRespuestaImplementation(step2Request);
        }

        com.keralty.aepersonas.viewmodel.cuestionariop.siu.CerrarRequest step3Request = new com.keralty.aepersonas.viewmodel.cuestionariop.siu.CerrarRequest();
        step3Request.setCuestionarioPcerrarpthisCuestionarioPInstance(cuestionarioPTCERRARpthisCuestionarioP);
        cuestionarioPSrv.cerrarImplementation(step3Request);

        com.keralty.aepersonas.viewmodel.usuario.siu.CalcularIMCRequest step4Request = new com.keralty.aepersonas.viewmodel.usuario.siu.CalcularIMCRequest();
        step4Request.setUsuariocalcularIMCpthisUsuarioInstance(cuestionarioPTCERRARpthisCuestionarioP.getUsuario());
        usuarioSrv.calcularIMCImplementation(step4Request);

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    // Service: TMARCARDATOSPREGUNTACORE

    /*
     * Entry point for service TMARCARDATOSPREGUNTACORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tMARCARDATOSPREGUNTACORE(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TMARCARDATOSPREGUNTACORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = cuestionarioPSrv.tMARCARDATOSPREGUNTACORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TMARCARDATOSPREGUNTACORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tMARCARDATOSPREGUNTACORETxn(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TMARCARDATOSPREGUNTACORERequest request) throws ModelException, SystemException {
        request.setCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance(cuestionarioPSrv.getByOIDWithHV(request.getCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP()));
        return cuestionarioPSrv.tMARCARDATOSPREGUNTACOREImplementation(request);
    }

    /*
     * Implements service TMARCARDATOSPREGUNTACORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tMARCARDATOSPREGUNTACOREImplementation(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TMARCARDATOSPREGUNTACORERequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        Long cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta = request.getCuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta();
        Boolean cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo = request.getCuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo();
        String cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs = request.getCuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs();
        CuestionarioP cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP = request.getCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance();

        request.checkArguments();
        CuestionarioP instance = cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP;

        for(PreguntaP step1Entity : repository.assocOperator007(cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP, cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta)) {
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarDatosCORERequest step1Request = new com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarDatosCORERequest();
            step1Request.setPreguntaPmarcarDatosCOREpthisPreguntaPInstance(step1Entity);
            step1Request.setPreguntaPmarcarDatosCOREpRespuestaSiNo(cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo);
            step1Request.setPreguntaPmarcarDatosCOREpRespuestaObs(cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs);
            preguntaPSrv.marcarDatosCOREImplementation(step1Request);
        }

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    // Service: TCAMBIARPREGUNTA108

    /*
     * Entry point for service TCAMBIARPREGUNTA108
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCAMBIARPREGUNTA108(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCAMBIARPREGUNTA108Request request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = cuestionarioPSrv.tCAMBIARPREGUNTA108Txn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCAMBIARPREGUNTA108
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCAMBIARPREGUNTA108Txn(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCAMBIARPREGUNTA108Request request) throws ModelException, SystemException {
        request.setCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance(cuestionarioPSrv.getByOIDWithHV(request.getCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP()));
        return cuestionarioPSrv.tCAMBIARPREGUNTA108Implementation(request);
    }

    /*
     * Implements service TCAMBIARPREGUNTA108
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCAMBIARPREGUNTA108Implementation(
            com.keralty.aepersonas.viewmodel.cuestionariop.siu.TCAMBIARPREGUNTA108Request request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        CuestionarioP cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP = request.getCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance();

        request.checkArguments();
        CuestionarioP instance = cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP;

        for(PreguntaP step1Entity : repository.assocOperator008(cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP)) {
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarRespuestaRequest step1Request = new com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarRespuestaRequest();
            step1Request.setPreguntaPmarcarRespuestapthisPreguntaPInstance(step1Entity);
            step1Request.setPreguntaPmarcarRespuestapRespuestaSiNo(Boolean.TRUE);
            step1Request.setPreguntaPmarcarRespuestapRespuestaObs(userFunctionsSrv.fugetValorParametroConfFun("COMENTARIOSPREGUNTA108"));
            step1Request.setPreguntaPmarcarRespuestapeValoresRespuestas("");
            preguntaPSrv.marcarRespuestaImplementation(step1Request);
        }

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
        select.getOrderByPart().addItem(Constants.normalizePath(CuestionarioPConstants.CLASS_NAME, CuestionarioPConstants.ATTR_FIELD_CUESTIONARIOPNUMERO, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildCuestionarioPRelatedInstance(relatedInstanceJsonOid);
        }
        if (CuestionarioPConstants.ROLE_NAME_SECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCuestionarioPRelatedInstance4SeccionP(relatedInstanceJsonOid, remainingPath);
        }
        if (CuestionarioPConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCuestionarioPRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildCuestionarioPRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new CuestionarioP(mapper.readValue(relatedInstanceJsonOid, CuestionarioPOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildCuestionarioPRelatedInstance4SeccionP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new SeccionP(mapper.readValue(relatedInstanceJsonOid, SeccionPOid.class)): SeccionP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildCuestionarioPRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            CuestionarioPOid oid = new CuestionarioPOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(CuestionarioPConstants.ATTR_FIELD_CUESTIONARIOPNUMERO, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getCuestionarioPNumero(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(CuestionarioPService.class).error(e.getMessage());
        }
    }

}
