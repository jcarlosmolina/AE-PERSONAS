package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.PreconditionException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AnexoMatConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.repository.AnexoMatJpaRepository;
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
public class AnexoMatService extends AbstractService {

    AnexoMatJpaRepository repository;

    AnexoMatService anexoMatSrv;

    UsuarioService usuarioSrv;

    InstitucionMatNeoService institucionMatNeoSrv;

    PeriodicidadService periodicidadSrv;

    @Inject
    public AnexoMatService(
            AnexoMatService anexoMatSrv,
            UsuarioService usuarioSrv,
            InstitucionMatNeoService institucionMatNeoSrv,
            PeriodicidadService periodicidadSrv,
            AnexoMatJpaRepository repository) {
        this.anexoMatSrv = anexoMatSrv;
        this.usuarioSrv = usuarioSrv;
        this.institucionMatNeoSrv = institucionMatNeoSrv;
        this.periodicidadSrv = periodicidadSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, AnexoMatConstants.CLASS_NAME);
    }

    private List<AnexoMat> solveAnexoMatTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, AnexoMatConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveAnexoMatTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, AnexoMatConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class AnexoMat
     *
     * @return Population of class AnexoMat
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<AnexoMat> get() {
        List<AnexoMat> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class AnexoMat that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class AnexoMat matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<AnexoMat> get(QueryRequest queryRequest) {
        return solveAnexoMatTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveAnexoMatTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveAnexoMatTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solveAnexoMatTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of AnexoMat by ID
     *
     * @param anexoMatIdentificador Identification field anexoMatIdentificador
     *
     * @return Instance of AnexoMat
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public AnexoMat getById(Long anexoMatIdentificador) {
        return getByOID(new AnexoMatOid(anexoMatIdentificador));
    }
    
    /*
     * Returns an instance of AnexoMat by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of AnexoMat
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public AnexoMat getByOID(AnexoMatOid oid) {
        Optional<AnexoMat> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of AnexoMat by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of AnexoMat
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public AnexoMat getByOIDWithHV(AnexoMatOid oid) {
        Optional<AnexoMat> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<AnexoMat> getInstanceByOid(AnexoMatOid oid) {
        return oid != null && oid.getAnexoMatIdentificador() != null
               ? repository.findById(oid.getAnexoMatIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of AnexoMat by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of AnexoMat
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public AnexoMat getByJsonOid(String jsonOid) {
        AnexoMatOid oid = new AnexoMatOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of AnexoMat related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of AnexoMat
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<AnexoMat> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveAnexoMatTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of AnexoMat related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of AnexoMat
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<AnexoMat> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of AnexoMat
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of AnexoMat
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getAnexoMatDynamic(AnexoMatOid oid, String displaySetItems) {
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
    public String getSuppInfo(AnexoMatOid oid, String dsName) {
        AnexoMat instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(AnexoMat instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIUAnexoMatNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for AnexoMat using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.anexomat.ds.AutoDS> piuPIUAnexoMatNull(QueryRequest queryRequest) {
        return solveAnexoMatTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.anexomat.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUAnexoMatNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUAnexoMatNull
     */
    public int getCount4PIUAnexoMatNull(QueryRequest queryRequest) {
        return solveAnexoMatTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoMatSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.CrearRequest request) throws ModelException {
        request.setAnexoMatcrearpagrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getAnexoMatcrearpagrUsuario()));
        request.setAnexoMatcrearpagrInstitucionMaternalInstance(institucionMatNeoSrv.getByOIDWithHV(request.getAnexoMatcrearpagrInstitucionMaternal()));
        request.setAnexoMatcrearpagrPeriodicidadInstance(periodicidadSrv.getByOIDWithHV(request.getAnexoMatcrearpagrPeriodicidad()));
        return anexoMatSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario anexoMatcrearpagrUsuario = request.getAnexoMatcrearpagrUsuarioInstance();
        InstitucionMatNeo anexoMatcrearpagrInstitucionMaternal = request.getAnexoMatcrearpagrInstitucionMaternalInstance();
        Periodicidad anexoMatcrearpagrPeriodicidad = request.getAnexoMatcrearpagrPeriodicidadInstance();
        Date anexoMatcrearpatrFechaUltRegla = request.getAnexoMatcrearpatrFechaUltRegla();
        Long anexoMatcrearpatrNumCuotas = request.getAnexoMatcrearpatrNumCuotas();

        request.checkArguments();

        crearPreconditions(request);
        AnexoMat instance = new AnexoMat();
        anexoMatcrearpagrUsuario.add2AnexoMat(instance);
        instance.add2Usuario(anexoMatcrearpagrUsuario);

        instance.add2InstitucionMaternal(anexoMatcrearpagrInstitucionMaternal);

        instance.add2Periodicidad(anexoMatcrearpagrPeriodicidad);

        instance.setAnexoMatIdentificador(Long.valueOf(0));
        instance.setAnexoMatFechaUltRegla(anexoMatcrearpatrFechaUltRegla);
        instance.setAnexoMatNumCuotas(anexoMatcrearpatrNumCuotas);

        response.setInstance(repository.save(instance));

        return response;
    }

    private void crearPreconditions(
            com.keralty.aepersonas.viewmodel.anexomat.siu.CrearRequest request) 
            throws ModelException {
        checkClas1432915542016062Pre1(request);
        checkClas1432915542016062Pre5(request);
        checkClas1432915542016062Pre6(request);
    }

    private void checkClas1432915542016062Pre1 (
            com.keralty.aepersonas.viewmodel.anexomat.siu.CrearRequest request) 
            throws ModelException {
        // patrNumCuotas >= 1 AND patrNumCuotas <= 4

        Long anexoMatcrearpatrNumCuotas = request.getAnexoMatcrearpatrNumCuotas();
        boolean preconditionHolds = anexoMatcrearpatrNumCuotas >= Long.valueOf(1) && anexoMatcrearpatrNumCuotas <= Long.valueOf(4);
        if (!preconditionHolds) throw new PreconditionException("El número de cuotas no puede ser inferior a 1 ni mayor que 4");
    }

    private void checkClas1432915542016062Pre5 (
            com.keralty.aepersonas.viewmodel.anexomat.siu.CrearRequest request) 
            throws ModelException {
        // patrFechaUltRegla <= systemDate(  )  

        Date anexoMatcrearpatrFechaUltRegla = request.getAnexoMatcrearpatrFechaUltRegla();
        boolean preconditionHolds = (STDFunctions.dateBeforeFun(anexoMatcrearpatrFechaUltRegla,STDFunctions.systemDateFun()) || STDFunctions.dateEqualsFun(anexoMatcrearpatrFechaUltRegla, STDFunctions.systemDateFun()));
        if (!preconditionHolds) throw new PreconditionException("La fecha de última regla no puede ser superior a la de diligenciamiento");
    }

    private void checkClas1432915542016062Pre6 (
            com.keralty.aepersonas.viewmodel.anexomat.siu.CrearRequest request) 
            throws ModelException {
        // patrFechaUltRegla > dateAdd( "m", -9, systemDate() )
        // 

        Date anexoMatcrearpatrFechaUltRegla = request.getAnexoMatcrearpatrFechaUltRegla();
        boolean preconditionHolds = STDFunctions.dateAfterFun(anexoMatcrearpatrFechaUltRegla,STDFunctions.dateAddFun("m", Long.valueOf(-9), STDFunctions.systemDateFun()));
        if (!preconditionHolds) throw new PreconditionException("La fecha de última regla no puede ser menor en nueve meses a la de diligenciamiento");
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoMatSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.EliminarRequest request) throws ModelException {
        request.setAnexoMateliminarpthisAnexoMatInstance(anexoMatSrv.getByOIDWithHV(request.getAnexoMateliminarpthisAnexoMat()));
        return anexoMatSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AnexoMat anexoMateliminarpthisAnexoMat = request.getAnexoMateliminarpthisAnexoMatInstance();

        request.checkArguments();
        AnexoMat instance = anexoMateliminarpthisAnexoMat;

        instance.getUsuario().add2AnexoMat(null);

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
            com.keralty.aepersonas.viewmodel.anexomat.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoMatSrv.modificarTxn(request);
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.ModificarRequest request) throws ModelException {
        request.setAnexoMatmodificarpthisAnexoMatInstance(anexoMatSrv.getByOIDWithHV(request.getAnexoMatmodificarpthisAnexoMat()));
        return anexoMatSrv.modificarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AnexoMat anexoMatmodificarpthisAnexoMat = request.getAnexoMatmodificarpthisAnexoMatInstance();
        Date anexoMatmodificarpFechaUltRegla = request.getAnexoMatmodificarpFechaUltRegla();
        Long anexoMatmodificarpNumCuotas = request.getAnexoMatmodificarpNumCuotas();

        request.checkArguments();
        AnexoMat instance = anexoMatmodificarpthisAnexoMat;
        instance.setAnexoMatFechaUltRegla(anexoMatmodificarpFechaUltRegla);
        instance.setAnexoMatNumCuotas(anexoMatmodificarpNumCuotas);


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: CambPeriodicidadAnexoMat

    /*
     * Entry point for service CambPeriodicidadAnexoMat
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambPeriodicidadAnexoMat(
            com.keralty.aepersonas.viewmodel.anexomat.siu.CambPeriodicidadAnexoMatRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoMatSrv.cambPeriodicidadAnexoMatTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service CambPeriodicidadAnexoMat
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambPeriodicidadAnexoMatTxn(
            com.keralty.aepersonas.viewmodel.anexomat.siu.CambPeriodicidadAnexoMatRequest request) throws ModelException {
        request.setAnexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance(anexoMatSrv.getByOIDWithHV(request.getAnexoMatCambPeriodicidadAnexoMatpthisAnexoMat()));
        request.setAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance(periodicidadSrv.getByOIDWithHV(request.getAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidad()));
        return anexoMatSrv.cambPeriodicidadAnexoMatImplementation(request, true);
    }

    /*
     * Implements service CambPeriodicidadAnexoMat
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambPeriodicidadAnexoMatImplementation(
            com.keralty.aepersonas.viewmodel.anexomat.siu.CambPeriodicidadAnexoMatRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AnexoMat anexoMatCambPeriodicidadAnexoMatpthisAnexoMat = request.getAnexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance();
        Periodicidad anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad = request.getAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance();

        request.checkArguments();
        AnexoMat instance = anexoMatCambPeriodicidadAnexoMatpthisAnexoMat;

        instance.add2Periodicidad(anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoMatRequest relatedRequest = new com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoMatRequest();
            relatedRequest.setPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance(anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad);
            relatedRequest.setPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance(anexoMatCambPeriodicidadAnexoMatpthisAnexoMat);
            periodicidadSrv.cambPeriodicidadAnexoMatImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: CambiarInsInstitucionMaternal

    /*
     * Entry point for service CambiarInsInstitucionMaternal
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambiarInsInstitucionMaternal(
            com.keralty.aepersonas.viewmodel.anexomat.siu.CambiarInsInstitucionMaternalRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoMatSrv.cambiarInsInstitucionMaternalTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service CambiarInsInstitucionMaternal
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambiarInsInstitucionMaternalTxn(
            com.keralty.aepersonas.viewmodel.anexomat.siu.CambiarInsInstitucionMaternalRequest request) throws ModelException {
        request.setAnexoMatCambiarInsInstitucionMaternalpthisAnexoMatInstance(anexoMatSrv.getByOIDWithHV(request.getAnexoMatCambiarInsInstitucionMaternalpthisAnexoMat()));
        request.setAnexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeoInstance(institucionMatNeoSrv.getByOIDWithHV(request.getAnexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeo()));
        return anexoMatSrv.cambiarInsInstitucionMaternalImplementation(request, true);
    }

    /*
     * Implements service CambiarInsInstitucionMaternal
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambiarInsInstitucionMaternalImplementation(
            com.keralty.aepersonas.viewmodel.anexomat.siu.CambiarInsInstitucionMaternalRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AnexoMat anexoMatCambiarInsInstitucionMaternalpthisAnexoMat = request.getAnexoMatCambiarInsInstitucionMaternalpthisAnexoMatInstance();
        InstitucionMatNeo anexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeo = request.getAnexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeoInstance();

        request.checkArguments();
        AnexoMat instance = anexoMatCambiarInsInstitucionMaternalpthisAnexoMat;

        instance.add2InstitucionMaternal(anexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeo);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.institucionmatneo.siu.CambiarInsInstitucionMaternalRequest relatedRequest = new com.keralty.aepersonas.viewmodel.institucionmatneo.siu.CambiarInsInstitucionMaternalRequest();
            relatedRequest.setInstitucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeoInstance(anexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeo);
            relatedRequest.setInstitucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMatInstance(anexoMatCambiarInsInstitucionMaternalpthisAnexoMat);
            institucionMatNeoSrv.cambiarInsInstitucionMaternalImplementation(relatedRequest, false);
        }


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
            com.keralty.aepersonas.viewmodel.anexomat.siu.TMODIFICARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoMatSrv.tMODIFICARTxn(request);
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.TMODIFICARRequest request) throws ModelException {
        request.setAnexoMatTMODIFICARpthisAnexoMatInstance(anexoMatSrv.getByOIDWithHV(request.getAnexoMatTMODIFICARpthisAnexoMat()));
        request.setAnexoMatTMODIFICARptInstitucionMatInstance(institucionMatNeoSrv.getByOIDWithHV(request.getAnexoMatTMODIFICARptInstitucionMat()));
        return anexoMatSrv.tMODIFICARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.anexomat.siu.TMODIFICARRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Date anexoMatTMODIFICARptpFechaUltRegla = request.getAnexoMatTMODIFICARptpFechaUltRegla();
        Long anexoMatTMODIFICARptpNumCuotas = request.getAnexoMatTMODIFICARptpNumCuotas();
        InstitucionMatNeo anexoMatTMODIFICARptInstitucionMat = request.getAnexoMatTMODIFICARptInstitucionMatInstance();
        AnexoMat anexoMatTMODIFICARpthisAnexoMat = request.getAnexoMatTMODIFICARpthisAnexoMatInstance();

        request.checkArguments();

        tMODIFICARPreconditions(request);
        AnexoMat instance = anexoMatTMODIFICARpthisAnexoMat;

        com.keralty.aepersonas.viewmodel.anexomat.siu.ModificarRequest step1Request = new com.keralty.aepersonas.viewmodel.anexomat.siu.ModificarRequest();
        step1Request.setAnexoMatmodificarpthisAnexoMatInstance(anexoMatTMODIFICARpthisAnexoMat);
        step1Request.setAnexoMatmodificarpFechaUltRegla(anexoMatTMODIFICARptpFechaUltRegla);
        step1Request.setAnexoMatmodificarpNumCuotas(anexoMatTMODIFICARptpNumCuotas);
        anexoMatSrv.modificarImplementation(step1Request);

        boolean guard2 = !Utilities.isEqual(anexoMatTMODIFICARpthisAnexoMat.getInstitucionMaternal(), anexoMatTMODIFICARptInstitucionMat);

        if (guard2) {
            com.keralty.aepersonas.viewmodel.anexomat.siu.CambiarInsInstitucionMaternalRequest step2Request = new com.keralty.aepersonas.viewmodel.anexomat.siu.CambiarInsInstitucionMaternalRequest();
            step2Request.setAnexoMatCambiarInsInstitucionMaternalpthisAnexoMatInstance(anexoMatTMODIFICARpthisAnexoMat);
            step2Request.setAnexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeoInstance(anexoMatTMODIFICARptInstitucionMat);
            anexoMatSrv.cambiarInsInstitucionMaternalImplementation(step2Request, true);
        }

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    private void tMODIFICARPreconditions(
            com.keralty.aepersonas.viewmodel.anexomat.siu.TMODIFICARRequest request) 
            throws ModelException {
        checkClas1432915542016062Pre2(request);
        checkClas1432915542016062Pre3(request);
        checkClas1432915542016062Pre4(request);
    }

    private void checkClas1432915542016062Pre2 (
            com.keralty.aepersonas.viewmodel.anexomat.siu.TMODIFICARRequest request) 
            throws ModelException {
        // ptpNumCuotas >= 1 AND ptpNumCuotas <= 4

        Long anexoMatTMODIFICARptpNumCuotas = request.getAnexoMatTMODIFICARptpNumCuotas();
        boolean preconditionHolds = anexoMatTMODIFICARptpNumCuotas >= Long.valueOf(1) && anexoMatTMODIFICARptpNumCuotas <= Long.valueOf(4);
        if (!preconditionHolds) throw new PreconditionException("El número de cuotas no puede ser inferior a 1 ni mayor que 4");
    }

    private void checkClas1432915542016062Pre3 (
            com.keralty.aepersonas.viewmodel.anexomat.siu.TMODIFICARRequest request) 
            throws ModelException {
        // ptpFechaUltRegla <= systemDate(  )  

        Date anexoMatTMODIFICARptpFechaUltRegla = request.getAnexoMatTMODIFICARptpFechaUltRegla();
        boolean preconditionHolds = (STDFunctions.dateBeforeFun(anexoMatTMODIFICARptpFechaUltRegla,STDFunctions.systemDateFun()) || STDFunctions.dateEqualsFun(anexoMatTMODIFICARptpFechaUltRegla, STDFunctions.systemDateFun()));
        if (!preconditionHolds) throw new PreconditionException("La fecha de última regla no puede ser superior a la de diligenciamiento");
    }

    private void checkClas1432915542016062Pre4 (
            com.keralty.aepersonas.viewmodel.anexomat.siu.TMODIFICARRequest request) 
            throws ModelException {
        // ptpFechaUltRegla > dateAdd( "m", -9, systemDate() )
        // 

        Date anexoMatTMODIFICARptpFechaUltRegla = request.getAnexoMatTMODIFICARptpFechaUltRegla();
        boolean preconditionHolds = STDFunctions.dateAfterFun(anexoMatTMODIFICARptpFechaUltRegla,STDFunctions.dateAddFun("m", Long.valueOf(-9), STDFunctions.systemDateFun()));
        if (!preconditionHolds) throw new PreconditionException("La fecha de última regla no puede ser menor en nueve meses a la de diligenciamiento");
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
        select.getOrderByPart().addItem(Constants.normalizePath(AnexoMatConstants.CLASS_NAME, AnexoMatConstants.ATTR_FIELD_ANEXOMATIDENTIFICADOR, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildAnexoMatRelatedInstance(relatedInstanceJsonOid);
        }
        if (AnexoMatConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoMatRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoMatConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoMatRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoMatConstants.ROLE_NAME_INSTITUCIONMATERNAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoMatRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildAnexoMatRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new AnexoMat(mapper.readValue(relatedInstanceJsonOid, AnexoMatOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAnexoMatRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAnexoMatRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildAnexoMatRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            AnexoMatOid oid = new AnexoMatOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(AnexoMatConstants.ATTR_FIELD_ANEXOMATIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAnexoMatIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(AnexoMatService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
