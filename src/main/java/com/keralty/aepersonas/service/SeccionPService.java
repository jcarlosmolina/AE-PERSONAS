package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.MinCardinalityException;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.SeccionPConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.oid.SeccionOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.PreguntaP;
import com.keralty.aepersonas.persistence.Seccion;
import com.keralty.aepersonas.persistence.SeccionP;
import com.keralty.aepersonas.repository.SeccionPJpaRepository;
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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class SeccionPService extends AbstractService {

    SeccionPJpaRepository repository;

    SeccionPService seccionPSrv;

    CuestionarioPService cuestionarioPSrv;

    SeccionService seccionSrv;

    PreguntaService preguntaSrv;

    PreguntaPService preguntaPSrv;

    UsuarioService usuarioSrv;

    @Inject
    public SeccionPService(
            SeccionPService seccionPSrv,
            CuestionarioPService cuestionarioPSrv,
            SeccionService seccionSrv,
            PreguntaService preguntaSrv,
            PreguntaPService preguntaPSrv,
            UsuarioService usuarioSrv,
            SeccionPJpaRepository repository) {
        this.seccionPSrv = seccionPSrv;
        this.cuestionarioPSrv = cuestionarioPSrv;
        this.seccionSrv = seccionSrv;
        this.preguntaSrv = preguntaSrv;
        this.preguntaPSrv = preguntaPSrv;
        this.usuarioSrv = usuarioSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, SeccionPConstants.CLASS_NAME);
    }

    private List<SeccionP> solveSeccionPTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, SeccionPConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveSeccionPTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, SeccionPConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class SeccionP
     *
     * @return Population of class SeccionP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<SeccionP> get() {
        List<SeccionP> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class SeccionP that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class SeccionP matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<SeccionP> get(QueryRequest queryRequest) {
        return solveSeccionPTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveSeccionPTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveSeccionPTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solveSeccionPTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of SeccionP by ID
     *
     * @param seccionPIdentificador Identification field seccionPIdentificador
     *
     * @return Instance of SeccionP
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public SeccionP getById(Long seccionPIdentificador) {
        return getByOID(new SeccionPOid(seccionPIdentificador));
    }
    
    /*
     * Returns an instance of SeccionP by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of SeccionP
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public SeccionP getByOID(SeccionPOid oid) {
        Optional<SeccionP> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of SeccionP by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of SeccionP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public SeccionP getByOIDWithHV(SeccionPOid oid) {
        Optional<SeccionP> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<SeccionP> getInstanceByOid(SeccionPOid oid) {
        return oid != null && oid.getSeccionPIdentificador() != null
               ? repository.findById(oid.getSeccionPIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of SeccionP by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of SeccionP
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public SeccionP getByJsonOid(String jsonOid) {
        SeccionPOid oid = new SeccionPOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of SeccionP related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of SeccionP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<SeccionP> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveSeccionPTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of SeccionP related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of SeccionP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<SeccionP> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of SeccionP
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of SeccionP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getSeccionPDynamic(SeccionPOid oid, String displaySetItems) {
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
    public String getSuppInfo(SeccionPOid oid, String dsName) {
        SeccionP instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(SeccionP instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIUSeccionPNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for SeccionP using displayset DSSeccionPNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.seccionp.ds.DSSeccionPNull> piuPIUSeccionPNull(QueryRequest queryRequest) {
        return solveSeccionPTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.seccionp.ds.DSSeccionPNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUSeccionPNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUSeccionPNull
     */
    public int getCount4PIUSeccionPNull(QueryRequest queryRequest) {
        return solveSeccionPTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.seccionp.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = seccionPSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.seccionp.siu.CrearRequest request) throws ModelException {
        request.setSeccionPcrearpagrCuestionarioInstance(cuestionarioPSrv.getByOIDWithHV(request.getSeccionPcrearpagrCuestionario()));
        return seccionPSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.seccionp.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        CuestionarioP seccionPcrearpagrCuestionario = request.getSeccionPcrearpagrCuestionarioInstance();
        String seccionPcrearpatrNombre = request.getSeccionPcrearpatrNombre();
        Long seccionPcrearpatrNumOrden = request.getSeccionPcrearpatrNumOrden();

        request.checkArguments();
        SeccionP instance = new SeccionP();
        instance.add2Cuestionario(seccionPcrearpagrCuestionario);

        instance.setSeccionPIdentificador(Long.valueOf(0));
        instance.setSeccionPNombre(seccionPcrearpatrNombre);
        instance.setSeccionPNumOrden(seccionPcrearpatrNumOrden);

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
            com.keralty.aepersonas.viewmodel.seccionp.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = seccionPSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.seccionp.siu.EliminarRequest request) throws ModelException {
        request.setSeccionPeliminarpthisSeccionPInstance(seccionPSrv.getByOIDWithHV(request.getSeccionPeliminarpthisSeccionP()));
        return seccionPSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.seccionp.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        SeccionP seccionPeliminarpthisSeccionP = request.getSeccionPeliminarpthisSeccionPInstance();

        request.checkArguments();
        SeccionP instance = seccionPeliminarpthisSeccionP;
        if(seccionPeliminarpthisSeccionP.getPreguntas().size() > 0) {
            throw new MinCardinalityException(SeccionPConstants.CLASS_ALIAS, SeccionPConstants.ROLE_ALIAS_PREGUNTAS);
        }


        repository.delete(instance);
        
        response.setInstance(instance);

        return response;
    }

    // Service: TCREARYPREGUNTAS

    /*
     * Entry point for service TCREARYPREGUNTAS
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARYPREGUNTAS(
            com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARYPREGUNTASRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = seccionPSrv.tCREARYPREGUNTASTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARYPREGUNTAS
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARYPREGUNTASTxn(
            com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARYPREGUNTASRequest request) throws ModelException, SystemException {
        request.setSeccionPTCREARYPREGUNTASptSeccionInstance(seccionSrv.getByOIDWithHV(request.getSeccionPTCREARYPREGUNTASptSeccion()));
        request.setSeccionPTCREARYPREGUNTASptCuestionarioPInstance(cuestionarioPSrv.getByOIDWithHV(request.getSeccionPTCREARYPREGUNTASptCuestionarioP()));
        return seccionPSrv.tCREARYPREGUNTASImplementation(request);
    }

    /*
     * Implements service TCREARYPREGUNTAS
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARYPREGUNTASImplementation(
            com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARYPREGUNTASRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        CuestionarioP seccionPTCREARYPREGUNTASptCuestionarioP = request.getSeccionPTCREARYPREGUNTASptCuestionarioPInstance();
        Seccion seccionPTCREARYPREGUNTASptSeccion = request.getSeccionPTCREARYPREGUNTASptSeccionInstance();

        request.checkArguments();
        SeccionP instance;

        com.keralty.aepersonas.viewmodel.seccionp.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.seccionp.siu.CrearRequest();
        step1Request.setSeccionPcrearpagrCuestionarioInstance(seccionPTCREARYPREGUNTASptCuestionarioP);
        step1Request.setSeccionPcrearpatrNombre(seccionPTCREARYPREGUNTASptSeccion.getSeccionNombre());
        step1Request.setSeccionPcrearpatrNumOrden(seccionPTCREARYPREGUNTASptSeccion.getSeccionNumOrden());
        instance = (SeccionP) seccionPSrv.crearImplementation(step1Request).getInstance();

        for(Pregunta step2Entity : repository.assocOperator000(seccionPTCREARYPREGUNTASptSeccion)) {
            com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARPREGUNTASITOCARequest step2Request = new com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARPREGUNTASITOCARequest();
            step2Request.setSeccionPTCREARPREGUNTASITOCApthisSeccionPInstance(instance);
            step2Request.setSeccionPTCREARPREGUNTASITOCApPreguntaInstance(step2Entity);
            seccionPSrv.tCREARPREGUNTASITOCAImplementation(step2Request);
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
            com.keralty.aepersonas.viewmodel.seccionp.siu.TELIMINARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = seccionPSrv.tELIMINARTxn(request);
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
            com.keralty.aepersonas.viewmodel.seccionp.siu.TELIMINARRequest request) throws ModelException, SystemException {
        request.setSeccionPTELIMINARpthisSeccionPInstance(seccionPSrv.getByOIDWithHV(request.getSeccionPTELIMINARpthisSeccionP()));
        return seccionPSrv.tELIMINARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.seccionp.siu.TELIMINARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        SeccionP seccionPTELIMINARpthisSeccionP = request.getSeccionPTELIMINARpthisSeccionPInstance();

        request.checkArguments();
        SeccionP instance = seccionPTELIMINARpthisSeccionP;

        for(PreguntaP step1Entity : repository.assocOperator001(seccionPTELIMINARpthisSeccionP)) {
            com.keralty.aepersonas.viewmodel.preguntap.siu.TELIMINARRequest step1Request = new com.keralty.aepersonas.viewmodel.preguntap.siu.TELIMINARRequest();
            step1Request.setPreguntaPTELIMINARpthisPreguntaPInstance(step1Entity);
            preguntaPSrv.tELIMINARImplementation(step1Request);
        }

        com.keralty.aepersonas.viewmodel.seccionp.siu.EliminarRequest step2Request = new com.keralty.aepersonas.viewmodel.seccionp.siu.EliminarRequest();
        step2Request.setSeccionPeliminarpthisSeccionPInstance(seccionPTELIMINARpthisSeccionP);
        seccionPSrv.eliminarImplementation(step2Request);

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    // Service: TCREARPREGUNTASITOCA

    /*
     * Entry point for service TCREARPREGUNTASITOCA
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREARPREGUNTASITOCA(
            com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARPREGUNTASITOCARequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = seccionPSrv.tCREARPREGUNTASITOCATxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREARPREGUNTASITOCA
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREARPREGUNTASITOCATxn(
            com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARPREGUNTASITOCARequest request) throws ModelException {
        request.setSeccionPTCREARPREGUNTASITOCApthisSeccionPInstance(seccionPSrv.getByOIDWithHV(request.getSeccionPTCREARPREGUNTASITOCApthisSeccionP()));
        request.setSeccionPTCREARPREGUNTASITOCApPreguntaInstance(preguntaSrv.getByOIDWithHV(request.getSeccionPTCREARPREGUNTASITOCApPregunta()));
        return seccionPSrv.tCREARPREGUNTASITOCAImplementation(request);
    }

    /*
     * Implements service TCREARPREGUNTASITOCA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREARPREGUNTASITOCAImplementation(
            com.keralty.aepersonas.viewmodel.seccionp.siu.TCREARPREGUNTASITOCARequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Pregunta seccionPTCREARPREGUNTASITOCApPregunta = request.getSeccionPTCREARPREGUNTASITOCApPreguntaInstance();
        SeccionP seccionPTCREARPREGUNTASITOCApthisSeccionP = request.getSeccionPTCREARPREGUNTASITOCApthisSeccionPInstance();

        request.checkArguments();
        SeccionP instance = seccionPTCREARPREGUNTASITOCApthisSeccionP;

        /* Action 1: IF ((pPregunta.SoloHombres = false OR drvUsuarioM = true) AND (pPregunta.SoloMujeres = false OR drvUsuarioF = true) AND (pPregunta.CondicionEdad = 0 OR (pPregunta.CondicionEdad = 1 AND Cuestionario.Usuario.drvEdad >= pPregunta.CondicionEdadAnyos) OR (pPregunta.CondicionEdad = 2 AND Cuestionario.Usuario.drvEdad <= pPregunta.CondicionEdadAnyos))) */
        boolean ifCondition1 = (seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaSoloHombres().equals(false) || seccionPTCREARPREGUNTASITOCApthisSeccionP.getSeccionPdrvUsuarioM().equals(true)) && (seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaSoloMujeres().equals(false) || seccionPTCREARPREGUNTASITOCApthisSeccionP.getSeccionPdrvUsuarioF().equals(true)) && ((seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaCondicionEdad()).equals(Long.valueOf(0)) || ((seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaCondicionEdad()).equals(Long.valueOf(1)) && seccionPTCREARPREGUNTASITOCApthisSeccionP.getCuestionario().getUsuario().getUsuariodrvEdad() >= seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaCondicionEdadAnyos()) || ((seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaCondicionEdad()).equals(Long.valueOf(2)) && seccionPTCREARPREGUNTASITOCApthisSeccionP.getCuestionario().getUsuario().getUsuariodrvEdad() <= seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaCondicionEdadAnyos()));
        if (ifCondition1) {
            com.keralty.aepersonas.viewmodel.preguntap.siu.TCREAR2Request step10Request = new com.keralty.aepersonas.viewmodel.preguntap.siu.TCREAR2Request();
            step10Request.setPreguntaPTCREAR2ptpagrSeccionInstance(seccionPTCREARPREGUNTASITOCApthisSeccionP);
            step10Request.setPreguntaPTCREAR2ptpagrPreguntaInstance(seccionPTCREARPREGUNTASITOCApPregunta);
            step10Request.setPreguntaPTCREAR2ptpatrNumero(seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaNumero());
            step10Request.setPreguntaPTCREAR2ptpatrNumOrden(seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaNumOrden());
            step10Request.setPreguntaPTCREAR2ptpatrDescripcion(seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaDescripcion());
            step10Request.setPreguntaPTCREAR2ptpatrSeEnviaACORE(seccionPTCREARPREGUNTASITOCApPregunta.getPreguntaSeEnviaAlCORE());
            preguntaPSrv.tCREAR2Implementation(step10Request);
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
        select.getOrderByPart().addItem(Constants.normalizePath(SeccionPConstants.CLASS_NAME, SeccionPConstants.ATTR_FIELD_SECCIONPIDENTIFICADOR, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildSeccionPRelatedInstance(relatedInstanceJsonOid);
        }
        if (SeccionPConstants.ROLE_NAME_PREGUNTAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionPRelatedInstance4PreguntaP(relatedInstanceJsonOid, remainingPath);
        }
        if (SeccionPConstants.ROLE_NAME_CUESTIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionPRelatedInstance4CuestionarioP(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildSeccionPRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new SeccionP(mapper.readValue(relatedInstanceJsonOid, SeccionPOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSeccionPRelatedInstance4PreguntaP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new PreguntaP(mapper.readValue(relatedInstanceJsonOid, PreguntaPOid.class)): PreguntaP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildSeccionPRelatedInstance4CuestionarioP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new CuestionarioP(mapper.readValue(relatedInstanceJsonOid, CuestionarioPOid.class)): CuestionarioP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            SeccionPOid oid = new SeccionPOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(SeccionPConstants.ATTR_FIELD_SECCIONPIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getSeccionPIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(SeccionPService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
