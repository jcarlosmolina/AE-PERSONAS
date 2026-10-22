package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.PreconditionException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.global.SeccionPConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.PregCuesMedC;
import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.PreguntaP;
import com.keralty.aepersonas.persistence.SeccionP;
import com.keralty.aepersonas.repository.PreguntaPJpaRepository;
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
public class PreguntaPService extends AbstractService {

    PreguntaPJpaRepository repository;

    PreguntaPService preguntaPSrv;

    SeccionPService seccionPSrv;

    PreguntaService preguntaSrv;

    PersonaCService personaCSrv;

    PregCuesMedCService pregCuesMedCSrv;

    @Inject
    public PreguntaPService(
            PreguntaPService preguntaPSrv,
            SeccionPService seccionPSrv,
            PreguntaService preguntaSrv,
            PersonaCService personaCSrv,
            PregCuesMedCService pregCuesMedCSrv,
            PreguntaPJpaRepository repository) {
        this.preguntaPSrv = preguntaPSrv;
        this.seccionPSrv = seccionPSrv;
        this.preguntaSrv = preguntaSrv;
        this.personaCSrv = personaCSrv;
        this.pregCuesMedCSrv = pregCuesMedCSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, PreguntaPConstants.CLASS_NAME);
    }

    private List<PreguntaP> solvePreguntaPTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, PreguntaPConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solvePreguntaPTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, PreguntaPConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class PreguntaP
     *
     * @return Population of class PreguntaP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreguntaP> get() {
        List<PreguntaP> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class PreguntaP that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class PreguntaP matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreguntaP> get(QueryRequest queryRequest) {
        return solvePreguntaPTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solvePreguntaPTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solvePreguntaPTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solvePreguntaPTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of PreguntaP by ID
     *
     * @param preguntaPIdentificador Identification field preguntaPIdentificador
     *
     * @return Instance of PreguntaP
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PreguntaP getById(Long preguntaPIdentificador) {
        return getByOID(new PreguntaPOid(preguntaPIdentificador));
    }
    
    /*
     * Returns an instance of PreguntaP by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PreguntaP
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PreguntaP getByOID(PreguntaPOid oid) {
        Optional<PreguntaP> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of PreguntaP by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PreguntaP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public PreguntaP getByOIDWithHV(PreguntaPOid oid) {
        Optional<PreguntaP> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<PreguntaP> getInstanceByOid(PreguntaPOid oid) {
        return oid != null && oid.getPreguntaPIdentificador() != null
               ? repository.findById(oid.getPreguntaPIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of PreguntaP by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of PreguntaP
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public PreguntaP getByJsonOid(String jsonOid) {
        PreguntaPOid oid = new PreguntaPOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of PreguntaP related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PreguntaP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreguntaP> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solvePreguntaPTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of PreguntaP related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PreguntaP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreguntaP> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of PreguntaP
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of PreguntaP
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getPreguntaPDynamic(PreguntaPOid oid, String displaySetItems) {
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
    public String getSuppInfo(PreguntaPOid oid, String dsName) {
        PreguntaP instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(PreguntaP instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIUPreguntaPNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for PreguntaP using displayset DSPreguntaPNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.preguntap.ds.DSPreguntaPNull> piuPIUPreguntaPNull(QueryRequest queryRequest) {
        return solvePreguntaPTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.preguntap.ds.DSPreguntaPNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUPreguntaPNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUPreguntaPNull
     */
    public int getCount4PIUPreguntaPNull(QueryRequest queryRequest) {
        return solvePreguntaPTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.preguntap.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.preguntap.siu.CrearRequest request) throws ModelException {
        request.setPreguntaPcrearpagrSeccionInstance(seccionPSrv.getByOIDWithHV(request.getPreguntaPcrearpagrSeccion()));
        request.setPreguntaPcrearpagrPreguntaInstance(preguntaSrv.getByOIDWithHV(request.getPreguntaPcrearpagrPregunta()));
        return preguntaPSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.preguntap.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        SeccionP preguntaPcrearpagrSeccion = request.getPreguntaPcrearpagrSeccionInstance();
        Pregunta preguntaPcrearpagrPregunta = request.getPreguntaPcrearpagrPreguntaInstance();
        Long preguntaPcrearpatrNumero = request.getPreguntaPcrearpatrNumero();
        Long preguntaPcrearpatrNumOrden = request.getPreguntaPcrearpatrNumOrden();
        String preguntaPcrearpatrDescripcion = request.getPreguntaPcrearpatrDescripcion();
        Boolean preguntaPcrearpatrSeEnviaACORE = request.getPreguntaPcrearpatrSeEnviaACORE();

        request.checkArguments();
        PreguntaP instance = new PreguntaP();
        instance.add2Seccion(preguntaPcrearpagrSeccion);

        if (preguntaPcrearpagrPregunta != null && !preguntaPcrearpagrPregunta.isNull()) {
            instance.add2Pregunta(preguntaPcrearpagrPregunta);
        }

        instance.setPreguntaPIdentificador(Long.valueOf(0));
        instance.setPreguntaPRespuestaSiNo(Boolean.FALSE);
        instance.setPreguntaPVieneDeCORE(Boolean.FALSE);
        instance.setPreguntaPValoresRespuestas(null);
        instance.setPreguntaPNumero(preguntaPcrearpatrNumero);
        instance.setPreguntaPNumOrden(preguntaPcrearpatrNumOrden);
        instance.setPreguntaPDescripcion(preguntaPcrearpatrDescripcion);
        instance.setPreguntaPSeEnviaACORE(preguntaPcrearpatrSeEnviaACORE);

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
            com.keralty.aepersonas.viewmodel.preguntap.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.preguntap.siu.EliminarRequest request) throws ModelException {
        request.setPreguntaPeliminarpthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPeliminarpthisPreguntaP()));
        return preguntaPSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.preguntap.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPeliminarpthisPreguntaP = request.getPreguntaPeliminarpthisPreguntaPInstance();

        request.checkArguments();
        PreguntaP instance = preguntaPeliminarpthisPreguntaP;


        repository.delete(instance);
        
        response.setInstance(instance);

        return response;
    }

    // Service: InsPreguntaAPersona

    /*
     * Entry point for service InsPreguntaAPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insPreguntaAPersona(
            com.keralty.aepersonas.viewmodel.preguntap.siu.InsPreguntaAPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.insPreguntaAPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsPreguntaAPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insPreguntaAPersonaTxn(
            com.keralty.aepersonas.viewmodel.preguntap.siu.InsPreguntaAPersonaRequest request) throws ModelException {
        request.setPreguntaPInsPreguntaAPersonapthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPInsPreguntaAPersonapthisPreguntaP()));
        request.setPreguntaPInsPreguntaAPersonapevcPreguntaInstance(preguntaSrv.getByOIDWithHV(request.getPreguntaPInsPreguntaAPersonapevcPregunta()));
        return preguntaPSrv.insPreguntaAPersonaImplementation(request, true);
    }

    /*
     * Implements service InsPreguntaAPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insPreguntaAPersonaImplementation(
            com.keralty.aepersonas.viewmodel.preguntap.siu.InsPreguntaAPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPInsPreguntaAPersonapthisPreguntaP = request.getPreguntaPInsPreguntaAPersonapthisPreguntaPInstance();
        Pregunta preguntaPInsPreguntaAPersonapevcPregunta = request.getPreguntaPInsPreguntaAPersonapevcPreguntaInstance();

        request.checkArguments();
        PreguntaP instance = preguntaPInsPreguntaAPersonapthisPreguntaP;

        instance.add2Pregunta(preguntaPInsPreguntaAPersonapevcPregunta);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.pregunta.siu.InsPreguntaAPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.pregunta.siu.InsPreguntaAPersonaRequest();
            relatedRequest.setPreguntaInsPreguntaAPersonapthisPreguntaInstance(preguntaPInsPreguntaAPersonapevcPregunta);
            relatedRequest.setPreguntaInsPreguntaAPersonapevcPreguntaPInstance(preguntaPInsPreguntaAPersonapthisPreguntaP);
            preguntaSrv.insPreguntaAPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: DelPreguntaDePersona

    /*
     * Entry point for service DelPreguntaDePersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delPreguntaDePersona(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DelPreguntaDePersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.delPreguntaDePersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelPreguntaDePersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delPreguntaDePersonaTxn(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DelPreguntaDePersonaRequest request) throws ModelException {
        request.setPreguntaPDelPreguntaDePersonapthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPDelPreguntaDePersonapthisPreguntaP()));
        request.setPreguntaPDelPreguntaDePersonapevcPreguntaInstance(preguntaSrv.getByOIDWithHV(request.getPreguntaPDelPreguntaDePersonapevcPregunta()));
        return preguntaPSrv.delPreguntaDePersonaImplementation(request, true);
    }

    /*
     * Implements service DelPreguntaDePersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delPreguntaDePersonaImplementation(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DelPreguntaDePersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPDelPreguntaDePersonapthisPreguntaP = request.getPreguntaPDelPreguntaDePersonapthisPreguntaPInstance();
        Pregunta preguntaPDelPreguntaDePersonapevcPregunta = request.getPreguntaPDelPreguntaDePersonapevcPreguntaInstance();

        request.checkArguments();
        PreguntaP instance = preguntaPDelPreguntaDePersonapthisPreguntaP;

        instance.add2Pregunta(null);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.pregunta.siu.DelPreguntaDePersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.pregunta.siu.DelPreguntaDePersonaRequest();
            relatedRequest.setPreguntaDelPreguntaDePersonapthisPreguntaInstance(preguntaPDelPreguntaDePersonapevcPregunta);
            relatedRequest.setPreguntaDelPreguntaDePersonapevcPreguntaPInstance(preguntaPDelPreguntaDePersonapthisPreguntaP);
            preguntaSrv.delPreguntaDePersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: marcarRespuesta

    /*
     * Entry point for service marcarRespuesta
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse marcarRespuesta(
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarRespuestaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.marcarRespuestaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service marcarRespuesta
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse marcarRespuestaTxn(
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarRespuestaRequest request) throws ModelException {
        request.setPreguntaPmarcarRespuestapthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPmarcarRespuestapthisPreguntaP()));
        return preguntaPSrv.marcarRespuestaImplementation(request);
    }

    /*
     * Implements service marcarRespuesta
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse marcarRespuestaImplementation(
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarRespuestaRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPmarcarRespuestapthisPreguntaP = request.getPreguntaPmarcarRespuestapthisPreguntaPInstance();
        String preguntaPmarcarRespuestapRespuestaObs = request.getPreguntaPmarcarRespuestapRespuestaObs();
        String preguntaPmarcarRespuestapeValoresRespuestas = request.getPreguntaPmarcarRespuestapeValoresRespuestas();
        Boolean preguntaPmarcarRespuestapRespuestaSiNo = request.getPreguntaPmarcarRespuestapRespuestaSiNo();

        request.checkArguments();
        PreguntaP instance = preguntaPmarcarRespuestapthisPreguntaP;
        if ((preguntaPmarcarRespuestapRespuestaObs != null && (preguntaPmarcarRespuestapRespuestaObs).length() != 0) || (preguntaPmarcarRespuestapeValoresRespuestas != null && (preguntaPmarcarRespuestapeValoresRespuestas).length() != 0)) {
            instance.setPreguntaPRespuestaSiNo(Boolean.TRUE);
        } else {
            instance.setPreguntaPRespuestaSiNo(preguntaPmarcarRespuestapRespuestaSiNo);
        }
        instance.setPreguntaPRespuestaObs(preguntaPmarcarRespuestapRespuestaObs);
        instance.setPreguntaPValoresRespuestas(preguntaPmarcarRespuestapeValoresRespuestas);


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: marcarRespuestaDeCORE

    /*
     * Entry point for service marcarRespuestaDeCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse marcarRespuestaDeCORE(
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarRespuestaDeCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.marcarRespuestaDeCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service marcarRespuestaDeCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse marcarRespuestaDeCORETxn(
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarRespuestaDeCORERequest request) throws ModelException {
        request.setPreguntaPmarcarRespuestaDeCOREpthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPmarcarRespuestaDeCOREpthisPreguntaP()));
        return preguntaPSrv.marcarRespuestaDeCOREImplementation(request);
    }

    /*
     * Implements service marcarRespuestaDeCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse marcarRespuestaDeCOREImplementation(
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarRespuestaDeCORERequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPmarcarRespuestaDeCOREpthisPreguntaP = request.getPreguntaPmarcarRespuestaDeCOREpthisPreguntaPInstance();
        Boolean preguntaPmarcarRespuestaDeCOREpRespuestaSiNo = request.getPreguntaPmarcarRespuestaDeCOREpRespuestaSiNo();

        request.checkArguments();
        PreguntaP instance = preguntaPmarcarRespuestaDeCOREpthisPreguntaP;
        instance.setPreguntaPRespuestaSiNo(preguntaPmarcarRespuestaDeCOREpRespuestaSiNo);
        instance.setPreguntaPVieneDeCORE(Boolean.TRUE);


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: cambiarVieneDeCore

    /*
     * Entry point for service cambiarVieneDeCore
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambiarVieneDeCore(
            com.keralty.aepersonas.viewmodel.preguntap.siu.CambiarVieneDeCoreRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.cambiarVieneDeCoreTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service cambiarVieneDeCore
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambiarVieneDeCoreTxn(
            com.keralty.aepersonas.viewmodel.preguntap.siu.CambiarVieneDeCoreRequest request) throws ModelException {
        request.setPreguntaPcambiarVieneDeCorepthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPcambiarVieneDeCorepthisPreguntaP()));
        return preguntaPSrv.cambiarVieneDeCoreImplementation(request);
    }

    /*
     * Implements service cambiarVieneDeCore
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambiarVieneDeCoreImplementation(
            com.keralty.aepersonas.viewmodel.preguntap.siu.CambiarVieneDeCoreRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPcambiarVieneDeCorepthisPreguntaP = request.getPreguntaPcambiarVieneDeCorepthisPreguntaPInstance();
        Boolean preguntaPcambiarVieneDeCorepeViene = request.getPreguntaPcambiarVieneDeCorepeViene();

        request.checkArguments();
        PreguntaP instance = preguntaPcambiarVieneDeCorepthisPreguntaP;
        instance.setPreguntaPVieneDeCORE(preguntaPcambiarVieneDeCorepeViene);


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: marcarDatosCORE

    /*
     * Entry point for service marcarDatosCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse marcarDatosCORE(
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarDatosCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.marcarDatosCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service marcarDatosCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse marcarDatosCORETxn(
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarDatosCORERequest request) throws ModelException {
        request.setPreguntaPmarcarDatosCOREpthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPmarcarDatosCOREpthisPreguntaP()));
        return preguntaPSrv.marcarDatosCOREImplementation(request);
    }

    /*
     * Implements service marcarDatosCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse marcarDatosCOREImplementation(
            com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarDatosCORERequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPmarcarDatosCOREpthisPreguntaP = request.getPreguntaPmarcarDatosCOREpthisPreguntaPInstance();
        Boolean preguntaPmarcarDatosCOREpRespuestaSiNo = request.getPreguntaPmarcarDatosCOREpRespuestaSiNo();
        String preguntaPmarcarDatosCOREpRespuestaObs = request.getPreguntaPmarcarDatosCOREpRespuestaObs();

        request.checkArguments();
        PreguntaP instance = preguntaPmarcarDatosCOREpthisPreguntaP;
        instance.setPreguntaPRespuestaSiNo(preguntaPmarcarDatosCOREpRespuestaSiNo);
        if (preguntaPmarcarDatosCOREpthisPreguntaP.getPregunta().getPreguntaEsNumero().equals(false) && (preguntaPmarcarDatosCOREpthisPreguntaP.getPregunta().getPreguntadrvValoresPosibles()).length() == 0) {
            instance.setPreguntaPRespuestaObs(preguntaPmarcarDatosCOREpRespuestaObs);
        } else {
            instance.setPreguntaPRespuestaObs(null);
        }
        if (preguntaPmarcarDatosCOREpRespuestaSiNo.equals(true)) {
            instance.setPreguntaPVieneDeCORE(Boolean.TRUE);
        } else {
            instance.setPreguntaPVieneDeCORE(Boolean.FALSE);
        }
        if (preguntaPmarcarDatosCOREpthisPreguntaP.getPregunta().getPreguntaEsNumero().equals(true)) {
            instance.setPreguntaPValoresRespuestas(preguntaPmarcarDatosCOREpRespuestaObs);
        } else if ((preguntaPmarcarDatosCOREpthisPreguntaP.getPregunta().getPreguntadrvValoresPosibles()).length() != 0) {
            instance.setPreguntaPValoresRespuestas(preguntaPmarcarDatosCOREpRespuestaObs);
        } else {
            instance.setPreguntaPValoresRespuestas(preguntaPmarcarDatosCOREpthisPreguntaP.getPreguntaPValoresRespuestas());
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: dummyPrecondicionesRespuesta

    /*
     * Entry point for service dummyPrecondicionesRespuesta
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse dummyPrecondicionesRespuesta(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyPrecondicionesRespuestaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.dummyPrecondicionesRespuestaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service dummyPrecondicionesRespuesta
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse dummyPrecondicionesRespuestaTxn(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyPrecondicionesRespuestaRequest request) throws ModelException {
        request.setPreguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPdummyPrecondicionesRespuestapthisPreguntaP()));
        return preguntaPSrv.dummyPrecondicionesRespuestaImplementation(request);
    }

    /*
     * Implements service dummyPrecondicionesRespuesta
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse dummyPrecondicionesRespuestaImplementation(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyPrecondicionesRespuestaRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPdummyPrecondicionesRespuestapthisPreguntaP = request.getPreguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance();

        request.checkArguments();

        dummyPrecondicionesRespuestaPreconditions(request);
        PreguntaP instance = preguntaPdummyPrecondicionesRespuestapthisPreguntaP;
        instance.setPreguntaPRespuestaObs(preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPreguntaPRespuestaObs());


        response.setInstance(repository.save(instance));

        return response;
    }

    private void dummyPrecondicionesRespuestaPreconditions(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyPrecondicionesRespuestaRequest request) 
            throws ModelException {
        checkClas1432647499776120Pre2(request);
        checkClas1432647499776120Pre3(request);
    }

    private void checkClas1432647499776120Pre2 (
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyPrecondicionesRespuestaRequest request) 
            throws ModelException {
        // (RespuestaSiNo = false) OR (Pregunta.ObsOblig = true AND ((Pregunta.EsNumero = true AND ValoresRespuestas <> NULL) OR (Pregunta.EsNumero = false AND RespuestaObs <> NULL))) OR (Pregunta.ObsOblig = false)

        PreguntaP preguntaPdummyPrecondicionesRespuestapthisPreguntaP = request.getPreguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance();
        boolean preconditionHolds = (preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPreguntaPRespuestaSiNo().equals(false)) || (preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPregunta().getPreguntaObsOblig().equals(true) && ((preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPregunta().getPreguntaEsNumero().equals(true) && preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPreguntaPValoresRespuestas() != null) || (preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPregunta().getPreguntaEsNumero().equals(false) && preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPreguntaPRespuestaObs() != null))) || (preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPregunta().getPreguntaObsOblig().equals(false));
        if (!preconditionHolds) throw new PreconditionException("La pregunta : " + STDFunctions.intToStrFun(preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPreguntaPNumero()) + " debe tener observaciones obligatoriamente");
    }

    private void checkClas1432647499776120Pre3 (
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyPrecondicionesRespuestaRequest request) 
            throws ModelException {
        // EXIST(Pregunta.Valores) = FALSE OR 
        // (
        //      RespuestaSiNo = FALSE OR 
        //      ValoresRespuestas <> NULL
        // )

        PreguntaP preguntaPdummyPrecondicionesRespuestapthisPreguntaP = request.getPreguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance();
        try {
            boolean preconditionHolds = repository.assocOperator000(preguntaPdummyPrecondicionesRespuestapthisPreguntaP).equals(false) || (preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPreguntaPRespuestaSiNo().equals(false) || preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPreguntaPValoresRespuestas() != null);
            if (!preconditionHolds) throw new PreconditionException("La pregunta : " + STDFunctions.intToStrFun(preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getPreguntaPNumero()) + " está marcada como Si y por tanto debe seleccionar el valor correspondiente");
        } catch (SystemException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    // Service: dummyTraerCuestMedico

    /*
     * Entry point for service dummyTraerCuestMedico
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse dummyTraerCuestMedico(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyTraerCuestMedicoRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.dummyTraerCuestMedicoTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service dummyTraerCuestMedico
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse dummyTraerCuestMedicoTxn(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyTraerCuestMedicoRequest request) throws ModelException {
        request.setPreguntaPdummyTraerCuestMedicopthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPdummyTraerCuestMedicopthisPreguntaP()));
        return preguntaPSrv.dummyTraerCuestMedicoImplementation(request);
    }

    /*
     * Implements service dummyTraerCuestMedico
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse dummyTraerCuestMedicoImplementation(
            com.keralty.aepersonas.viewmodel.preguntap.siu.DummyTraerCuestMedicoRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPdummyTraerCuestMedicopthisPreguntaP = request.getPreguntaPdummyTraerCuestMedicopthisPreguntaPInstance();

        request.checkArguments();
        PreguntaP instance = preguntaPdummyTraerCuestMedicopthisPreguntaP;


        response.setInstance(repository.save(instance));

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
            com.keralty.aepersonas.viewmodel.preguntap.siu.TELIMINARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.tELIMINARTxn(request);
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
            com.keralty.aepersonas.viewmodel.preguntap.siu.TELIMINARRequest request) throws ModelException {
        request.setPreguntaPTELIMINARpthisPreguntaPInstance(preguntaPSrv.getByOIDWithHV(request.getPreguntaPTELIMINARpthisPreguntaP()));
        return preguntaPSrv.tELIMINARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.preguntap.siu.TELIMINARRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        PreguntaP preguntaPTELIMINARpthisPreguntaP = request.getPreguntaPTELIMINARpthisPreguntaPInstance();

        request.checkArguments();
        PreguntaP instance = preguntaPTELIMINARpthisPreguntaP;

        com.keralty.aepersonas.viewmodel.preguntap.siu.EliminarRequest step1Request = new com.keralty.aepersonas.viewmodel.preguntap.siu.EliminarRequest();
        step1Request.setPreguntaPeliminarpthisPreguntaPInstance(preguntaPTELIMINARpthisPreguntaP);
        preguntaPSrv.eliminarImplementation(step1Request);

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
            com.keralty.aepersonas.viewmodel.preguntap.siu.TCREARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.tCREARTxn(request);
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
            com.keralty.aepersonas.viewmodel.preguntap.siu.TCREARRequest request) throws ModelException, SystemException {
        request.setPreguntaPTCREARptpagrSeccionInstance(seccionPSrv.getByOIDWithHV(request.getPreguntaPTCREARptpagrSeccion()));
        request.setPreguntaPTCREARptpagrPreguntaInstance(preguntaSrv.getByOIDWithHV(request.getPreguntaPTCREARptpagrPregunta()));
        request.setPreguntaPTCREARpPersonaCInstance(personaCSrv.getByOIDWithHV(request.getPreguntaPTCREARpPersonaC()));
        return preguntaPSrv.tCREARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.preguntap.siu.TCREARRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        SeccionP preguntaPTCREARptpagrSeccion = request.getPreguntaPTCREARptpagrSeccionInstance();
        Pregunta preguntaPTCREARptpagrPregunta = request.getPreguntaPTCREARptpagrPreguntaInstance();
        Long preguntaPTCREARptpatrNumero = request.getPreguntaPTCREARptpatrNumero();
        Long preguntaPTCREARptpatrNumOrden = request.getPreguntaPTCREARptpatrNumOrden();
        String preguntaPTCREARptpatrDescripcion = request.getPreguntaPTCREARptpatrDescripcion();
        Boolean preguntaPTCREARptpatrSeEnviaACORE = request.getPreguntaPTCREARptpatrSeEnviaACORE();
        PersonaC preguntaPTCREARpPersonaC = request.getPreguntaPTCREARpPersonaCInstance();

        request.checkArguments();
        PreguntaP instance;

        com.keralty.aepersonas.viewmodel.preguntap.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.preguntap.siu.CrearRequest();
        step1Request.setPreguntaPcrearpagrSeccionInstance(preguntaPTCREARptpagrSeccion);
        step1Request.setPreguntaPcrearpagrPreguntaInstance(preguntaPTCREARptpagrPregunta);
        step1Request.setPreguntaPcrearpatrNumero(preguntaPTCREARptpatrNumero);
        step1Request.setPreguntaPcrearpatrNumOrden(preguntaPTCREARptpatrNumOrden);
        step1Request.setPreguntaPcrearpatrDescripcion(preguntaPTCREARptpatrDescripcion);
        step1Request.setPreguntaPcrearpatrSeEnviaACORE(preguntaPTCREARptpatrSeEnviaACORE);
        instance = (PreguntaP) preguntaPSrv.crearImplementation(step1Request).getInstance();

        /* Action 2: IF (pPersonaC <> NULL) */
        boolean ifCondition2 = (preguntaPTCREARpPersonaC != null && !preguntaPTCREARpPersonaC.isNull());
        if (ifCondition2) {
            for(PregCuesMedC step220Entity : repository.assocOperator001(instance, preguntaPTCREARpPersonaC)) {
                com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarDatosCORERequest step20Request = new com.keralty.aepersonas.viewmodel.preguntap.siu.MarcarDatosCORERequest();
                step20Request.setPreguntaPmarcarDatosCOREpthisPreguntaPInstance(instance);
                step20Request.setPreguntaPmarcarDatosCOREpRespuestaSiNo(step220Entity.getPregCuesMedCRptaPregunta());
                step20Request.setPreguntaPmarcarDatosCOREpRespuestaObs(step220Entity.getPregCuesMedCObservacions());
                preguntaPSrv.marcarDatosCOREImplementation(step20Request);
            }
        }

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    // Service: TCREAR2

    /*
     * Entry point for service TCREAR2
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tCREAR2(
            com.keralty.aepersonas.viewmodel.preguntap.siu.TCREAR2Request request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = preguntaPSrv.tCREAR2Txn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service TCREAR2
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tCREAR2Txn(
            com.keralty.aepersonas.viewmodel.preguntap.siu.TCREAR2Request request) throws ModelException {
        request.setPreguntaPTCREAR2ptpagrSeccionInstance(seccionPSrv.getByOIDWithHV(request.getPreguntaPTCREAR2ptpagrSeccion()));
        request.setPreguntaPTCREAR2ptpagrPreguntaInstance(preguntaSrv.getByOIDWithHV(request.getPreguntaPTCREAR2ptpagrPregunta()));
        return preguntaPSrv.tCREAR2Implementation(request);
    }

    /*
     * Implements service TCREAR2
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tCREAR2Implementation(
            com.keralty.aepersonas.viewmodel.preguntap.siu.TCREAR2Request request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        SeccionP preguntaPTCREAR2ptpagrSeccion = request.getPreguntaPTCREAR2ptpagrSeccionInstance();
        Pregunta preguntaPTCREAR2ptpagrPregunta = request.getPreguntaPTCREAR2ptpagrPreguntaInstance();
        Long preguntaPTCREAR2ptpatrNumero = request.getPreguntaPTCREAR2ptpatrNumero();
        Long preguntaPTCREAR2ptpatrNumOrden = request.getPreguntaPTCREAR2ptpatrNumOrden();
        String preguntaPTCREAR2ptpatrDescripcion = request.getPreguntaPTCREAR2ptpatrDescripcion();
        Boolean preguntaPTCREAR2ptpatrSeEnviaACORE = request.getPreguntaPTCREAR2ptpatrSeEnviaACORE();

        request.checkArguments();
        PreguntaP instance;

        com.keralty.aepersonas.viewmodel.preguntap.siu.CrearRequest step1Request = new com.keralty.aepersonas.viewmodel.preguntap.siu.CrearRequest();
        step1Request.setPreguntaPcrearpagrSeccionInstance(preguntaPTCREAR2ptpagrSeccion);
        step1Request.setPreguntaPcrearpagrPreguntaInstance(preguntaPTCREAR2ptpagrPregunta);
        step1Request.setPreguntaPcrearpatrNumero(preguntaPTCREAR2ptpatrNumero);
        step1Request.setPreguntaPcrearpatrNumOrden(preguntaPTCREAR2ptpatrNumOrden);
        step1Request.setPreguntaPcrearpatrDescripcion(preguntaPTCREAR2ptpatrDescripcion);
        step1Request.setPreguntaPcrearpatrSeEnviaACORE(preguntaPTCREAR2ptpatrSeEnviaACORE);
        instance = (PreguntaP) preguntaPSrv.crearImplementation(step1Request).getInstance();

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    @Override
    protected void applyOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        applyOCOCPreguntaP(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(PreguntaPConstants.CLASS_NAME, PreguntaPConstants.ATTR_FIELD_PREGUNTAPIDENTIFICADOR, false), true);
    }


    private void applyOCOCPreguntaP(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_PreguntaP".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(PreguntaPConstants.CLASS_NAME, PreguntaPConstants.ROLE_NAME_SECCION + "." + SeccionPConstants.ATTR_NAME_SECCIONPNUMORDEN, false), true);
            select.getOrderByPart().addItem(Constants.normalizePath(PreguntaPConstants.CLASS_NAME, PreguntaPConstants.ATTR_NAME_PREGUNTAPNUMORDEN, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildPreguntaPRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreguntaPConstants.ROLE_NAME_SECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaPRelatedInstance4SeccionP(relatedInstanceJsonOid, remainingPath);
        }
        if (PreguntaPConstants.ROLE_NAME_PREGUNTA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaPRelatedInstance4Pregunta(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildPreguntaPRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new PreguntaP(mapper.readValue(relatedInstanceJsonOid, PreguntaPOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPreguntaPRelatedInstance4SeccionP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new SeccionP(mapper.readValue(relatedInstanceJsonOid, SeccionPOid.class)): SeccionP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPreguntaPRelatedInstance4Pregunta(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class)): Pregunta.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            PreguntaPOid oid = new PreguntaPOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PreguntaPConstants.ATTR_FIELD_PREGUNTAPIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPreguntaPIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(PreguntaPService.class).error(e.getMessage());
        }
    }

}
