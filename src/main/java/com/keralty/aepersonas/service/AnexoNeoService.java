package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.PreconditionException;
import com.keralty.aepersonas.global.AnexoNeoConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.repository.AnexoNeoJpaRepository;
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
public class AnexoNeoService extends AbstractService {

    AnexoNeoJpaRepository repository;

    AnexoNeoService anexoNeoSrv;

    UsuarioService usuarioSrv;

    InstitucionMatNeoService institucionMatNeoSrv;

    PeriodicidadService periodicidadSrv;

    @Inject
    public AnexoNeoService(
            AnexoNeoService anexoNeoSrv,
            UsuarioService usuarioSrv,
            InstitucionMatNeoService institucionMatNeoSrv,
            PeriodicidadService periodicidadSrv,
            AnexoNeoJpaRepository repository) {
        this.anexoNeoSrv = anexoNeoSrv;
        this.usuarioSrv = usuarioSrv;
        this.institucionMatNeoSrv = institucionMatNeoSrv;
        this.periodicidadSrv = periodicidadSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, AnexoNeoConstants.CLASS_NAME);
    }

    private List<AnexoNeo> solveAnexoNeoTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, AnexoNeoConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveAnexoNeoTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, AnexoNeoConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class AnexoNeo
     *
     * @return Population of class AnexoNeo
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<AnexoNeo> get() {
        List<AnexoNeo> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    /*
     * Returns the population of class AnexoNeo that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class AnexoNeo matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<AnexoNeo> get(QueryRequest queryRequest) {
        return solveAnexoNeoTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveAnexoNeoTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveAnexoNeoTypedCountQuery(queryRequest) : 0);
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
        return new PopulationResponseViewModel(solveAnexoNeoTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of AnexoNeo by ID
     *
     * @param anexoNeoIdentificador Identification field anexoNeoIdentificador
     *
     * @return Instance of AnexoNeo
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public AnexoNeo getById(Long anexoNeoIdentificador) {
        return getByOID(new AnexoNeoOid(anexoNeoIdentificador));
    }
    
    /*
     * Returns an instance of AnexoNeo by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of AnexoNeo
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public AnexoNeo getByOID(AnexoNeoOid oid) {
        Optional<AnexoNeo> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of AnexoNeo by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of AnexoNeo
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public AnexoNeo getByOIDWithHV(AnexoNeoOid oid) {
        Optional<AnexoNeo> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<AnexoNeo> getInstanceByOid(AnexoNeoOid oid) {
        return oid != null && oid.getAnexoNeoIdentificador() != null
               ? repository.findById(oid.getAnexoNeoIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of AnexoNeo by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of AnexoNeo
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public AnexoNeo getByJsonOid(String jsonOid) {
        AnexoNeoOid oid = new AnexoNeoOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of AnexoNeo related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of AnexoNeo
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<AnexoNeo> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveAnexoNeoTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of AnexoNeo related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of AnexoNeo
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<AnexoNeo> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of AnexoNeo
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of AnexoNeo
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getAnexoNeoDynamic(AnexoNeoOid oid, String displaySetItems) {
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
    public String getSuppInfo(AnexoNeoOid oid, String dsName) {
        AnexoNeo instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(AnexoNeo instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }




    // IIU Methods


    /*
     * Solves the query needed for PIUAnexoNeoNull
     *
     * @param queryRequest Query request
     * @return List of viewmodels for AnexoNeo using displayset DSAnexoNeoNull that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.anexoneo.ds.DSAnexoNeoNull> piuPIUAnexoNeoNull(QueryRequest queryRequest) {
        return solveAnexoNeoTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.anexoneo.ds.DSAnexoNeoNull::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUAnexoNeoNull
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUAnexoNeoNull
     */
    public int getCount4PIUAnexoNeoNull(QueryRequest queryRequest) {
        return solveAnexoNeoTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CrearRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoNeoSrv.crearTxn(request);
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CrearRequest request) throws ModelException {
        request.setAnexoNeocrearpagrUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getAnexoNeocrearpagrUsuario()));
        request.setAnexoNeocrearpagrInstitucionNeonatalInstance(institucionMatNeoSrv.getByOIDWithHV(request.getAnexoNeocrearpagrInstitucionNeonatal()));
        request.setAnexoNeocrearpagrPeriodicidadInstance(periodicidadSrv.getByOIDWithHV(request.getAnexoNeocrearpagrPeriodicidad()));
        return anexoNeoSrv.crearImplementation(request);
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CrearRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Usuario anexoNeocrearpagrUsuario = request.getAnexoNeocrearpagrUsuarioInstance();
        InstitucionMatNeo anexoNeocrearpagrInstitucionNeonatal = request.getAnexoNeocrearpagrInstitucionNeonatalInstance();
        Periodicidad anexoNeocrearpagrPeriodicidad = request.getAnexoNeocrearpagrPeriodicidadInstance();
        Date anexoNeocrearpatrFechaUltRegla = request.getAnexoNeocrearpatrFechaUltRegla();
        Long anexoNeocrearpatrNumHijos = request.getAnexoNeocrearpatrNumHijos();
        Long anexoNeocrearpatrNumCuotas = request.getAnexoNeocrearpatrNumCuotas();

        request.checkArguments();

        crearPreconditions(request);
        AnexoNeo instance = new AnexoNeo();
        anexoNeocrearpagrUsuario.add2AnexoNeo(instance);
        instance.add2Usuario(anexoNeocrearpagrUsuario);

        instance.add2InstitucionNeonatal(anexoNeocrearpagrInstitucionNeonatal);

        instance.add2Periodicidad(anexoNeocrearpagrPeriodicidad);

        instance.setAnexoNeoIdentificador(Long.valueOf(0));
        instance.setAnexoNeoFechaUltRegla(anexoNeocrearpatrFechaUltRegla);
        instance.setAnexoNeoNumHijos(anexoNeocrearpatrNumHijos);
        instance.setAnexoNeoNumCuotas(anexoNeocrearpatrNumCuotas);

        response.setInstance(repository.save(instance));

        return response;
    }

    private void crearPreconditions(
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CrearRequest request) 
            throws ModelException {
        checkClas1432919998464445Pre1(request);
    }

    private void checkClas1432919998464445Pre1 (
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CrearRequest request) 
            throws ModelException {
        // patrNumCuotas >= 1 AND patrNumCuotas <= 4

        Long anexoNeocrearpatrNumCuotas = request.getAnexoNeocrearpatrNumCuotas();
        boolean preconditionHolds = anexoNeocrearpatrNumCuotas >= Long.valueOf(1) && anexoNeocrearpatrNumCuotas <= Long.valueOf(4);
        if (!preconditionHolds) throw new PreconditionException("El número de cuotas no puede ser inferior a 1 ni mayor que 4");
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.EliminarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoNeoSrv.eliminarTxn(request);
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.EliminarRequest request) throws ModelException {
        request.setAnexoNeoeliminarpthisAnexoNeoInstance(anexoNeoSrv.getByOIDWithHV(request.getAnexoNeoeliminarpthisAnexoNeo()));
        return anexoNeoSrv.eliminarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.EliminarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AnexoNeo anexoNeoeliminarpthisAnexoNeo = request.getAnexoNeoeliminarpthisAnexoNeoInstance();

        request.checkArguments();
        AnexoNeo instance = anexoNeoeliminarpthisAnexoNeo;

        instance.getUsuario().add2AnexoNeo(null);

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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.ModificarRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoNeoSrv.modificarTxn(request);
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.ModificarRequest request) throws ModelException {
        request.setAnexoNeomodificarpthisAnexoNeoInstance(anexoNeoSrv.getByOIDWithHV(request.getAnexoNeomodificarpthisAnexoNeo()));
        return anexoNeoSrv.modificarImplementation(request);
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.ModificarRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AnexoNeo anexoNeomodificarpthisAnexoNeo = request.getAnexoNeomodificarpthisAnexoNeoInstance();
        Date anexoNeomodificarpFechaUltRegla = request.getAnexoNeomodificarpFechaUltRegla();
        Long anexoNeomodificarpNumHijos = request.getAnexoNeomodificarpNumHijos();
        Long anexoNeomodificarpNumCuotas = request.getAnexoNeomodificarpNumCuotas();

        request.checkArguments();
        AnexoNeo instance = anexoNeomodificarpthisAnexoNeo;
        instance.setAnexoNeoFechaUltRegla(anexoNeomodificarpFechaUltRegla);
        instance.setAnexoNeoNumHijos(anexoNeomodificarpNumHijos);
        instance.setAnexoNeoNumCuotas(anexoNeomodificarpNumCuotas);


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: CambPeriodicidadAnexoNeo

    /*
     * Entry point for service CambPeriodicidadAnexoNeo
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambPeriodicidadAnexoNeo(
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CambPeriodicidadAnexoNeoRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoNeoSrv.cambPeriodicidadAnexoNeoTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service CambPeriodicidadAnexoNeo
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambPeriodicidadAnexoNeoTxn(
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CambPeriodicidadAnexoNeoRequest request) throws ModelException {
        request.setAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance(anexoNeoSrv.getByOIDWithHV(request.getAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo()));
        request.setAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance(periodicidadSrv.getByOIDWithHV(request.getAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad()));
        return anexoNeoSrv.cambPeriodicidadAnexoNeoImplementation(request, true);
    }

    /*
     * Implements service CambPeriodicidadAnexoNeo
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambPeriodicidadAnexoNeoImplementation(
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CambPeriodicidadAnexoNeoRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AnexoNeo anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo = request.getAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance();
        Periodicidad anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad = request.getAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance();

        request.checkArguments();
        AnexoNeo instance = anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo;

        instance.add2Periodicidad(anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoNeoRequest relatedRequest = new com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoNeoRequest();
            relatedRequest.setPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance(anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad);
            relatedRequest.setPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance(anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo);
            periodicidadSrv.cambPeriodicidadAnexoNeoImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));

        return response;
    }

    // Service: CambiarInsInstitucionNeonatal

    /*
     * Entry point for service CambiarInsInstitucionNeonatal
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse cambiarInsInstitucionNeonatal(
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CambiarInsInstitucionNeonatalRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoNeoSrv.cambiarInsInstitucionNeonatalTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service CambiarInsInstitucionNeonatal
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse cambiarInsInstitucionNeonatalTxn(
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CambiarInsInstitucionNeonatalRequest request) throws ModelException {
        request.setAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance(anexoNeoSrv.getByOIDWithHV(request.getAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo()));
        request.setAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance(institucionMatNeoSrv.getByOIDWithHV(request.getAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo()));
        return anexoNeoSrv.cambiarInsInstitucionNeonatalImplementation(request, true);
    }

    /*
     * Implements service CambiarInsInstitucionNeonatal
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse cambiarInsInstitucionNeonatalImplementation(
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CambiarInsInstitucionNeonatalRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        AnexoNeo anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo = request.getAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance();
        InstitucionMatNeo anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo = request.getAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance();

        request.checkArguments();
        AnexoNeo instance = anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo;

        instance.add2InstitucionNeonatal(anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo);
        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.institucionmatneo.siu.CambiarInsInstitucionNeonatalRequest relatedRequest = new com.keralty.aepersonas.viewmodel.institucionmatneo.siu.CambiarInsInstitucionNeonatalRequest();
            relatedRequest.setInstitucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeoInstance(anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo);
            relatedRequest.setInstitucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeoInstance(anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo);
            institucionMatNeoSrv.cambiarInsInstitucionNeonatalImplementation(relatedRequest, false);
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.TMODIFICARRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = anexoNeoSrv.tMODIFICARTxn(request);
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.TMODIFICARRequest request) throws ModelException {
        request.setAnexoNeoTMODIFICARpthisAnexoNeoInstance(anexoNeoSrv.getByOIDWithHV(request.getAnexoNeoTMODIFICARpthisAnexoNeo()));
        request.setAnexoNeoTMODIFICARptInstitucionNeoInstance(institucionMatNeoSrv.getByOIDWithHV(request.getAnexoNeoTMODIFICARptInstitucionNeo()));
        return anexoNeoSrv.tMODIFICARImplementation(request);
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
            com.keralty.aepersonas.viewmodel.anexoneo.siu.TMODIFICARRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Date anexoNeoTMODIFICARptpFechaUltRegla = request.getAnexoNeoTMODIFICARptpFechaUltRegla();
        Long anexoNeoTMODIFICARptpNumHijos = request.getAnexoNeoTMODIFICARptpNumHijos();
        Long anexoNeoTMODIFICARptpNumCuotas = request.getAnexoNeoTMODIFICARptpNumCuotas();
        InstitucionMatNeo anexoNeoTMODIFICARptInstitucionNeo = request.getAnexoNeoTMODIFICARptInstitucionNeoInstance();
        AnexoNeo anexoNeoTMODIFICARpthisAnexoNeo = request.getAnexoNeoTMODIFICARpthisAnexoNeoInstance();

        request.checkArguments();

        tMODIFICARPreconditions(request);
        AnexoNeo instance = anexoNeoTMODIFICARpthisAnexoNeo;

        com.keralty.aepersonas.viewmodel.anexoneo.siu.ModificarRequest step1Request = new com.keralty.aepersonas.viewmodel.anexoneo.siu.ModificarRequest();
        step1Request.setAnexoNeomodificarpthisAnexoNeoInstance(anexoNeoTMODIFICARpthisAnexoNeo);
        step1Request.setAnexoNeomodificarpFechaUltRegla(anexoNeoTMODIFICARptpFechaUltRegla);
        step1Request.setAnexoNeomodificarpNumHijos(anexoNeoTMODIFICARptpNumHijos);
        step1Request.setAnexoNeomodificarpNumCuotas(anexoNeoTMODIFICARptpNumCuotas);
        anexoNeoSrv.modificarImplementation(step1Request);

        boolean guard2 = !(anexoNeoTMODIFICARpthisAnexoNeo.getInstitucionNeonatal().equalsObject(anexoNeoTMODIFICARptInstitucionNeo));

        if (guard2) {
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CambiarInsInstitucionNeonatalRequest step2Request = new com.keralty.aepersonas.viewmodel.anexoneo.siu.CambiarInsInstitucionNeonatalRequest();
            step2Request.setAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance(anexoNeoTMODIFICARpthisAnexoNeo);
            step2Request.setAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance(anexoNeoTMODIFICARptInstitucionNeo);
            anexoNeoSrv.cambiarInsInstitucionNeonatalImplementation(step2Request, true);
        }

        response.setInstance(getByOID(instance.getOid()));

        return response;
    }

    private void tMODIFICARPreconditions(
            com.keralty.aepersonas.viewmodel.anexoneo.siu.TMODIFICARRequest request) 
            throws ModelException {
        checkClas1432919998464445Pre2(request);
    }

    private void checkClas1432919998464445Pre2 (
            com.keralty.aepersonas.viewmodel.anexoneo.siu.TMODIFICARRequest request) 
            throws ModelException {
        // ptpNumCuotas >= 1 AND ptpNumCuotas <= 4

        Long anexoNeoTMODIFICARptpNumCuotas = request.getAnexoNeoTMODIFICARptpNumCuotas();
        boolean preconditionHolds = anexoNeoTMODIFICARptpNumCuotas >= Long.valueOf(1) && anexoNeoTMODIFICARptpNumCuotas <= Long.valueOf(4);
        if (!preconditionHolds) throw new PreconditionException("El número de cuotas no puede ser inferior a 1 ni mayor que 4");
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
        select.getOrderByPart().addItem(Constants.normalizePath(AnexoNeoConstants.CLASS_NAME, AnexoNeoConstants.ATTR_FIELD_ANEXONEOIDENTIFICADOR, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildAnexoNeoRelatedInstance(relatedInstanceJsonOid);
        }
        if (AnexoNeoConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoNeoRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoNeoConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoNeoRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoNeoConstants.ROLE_NAME_INSTITUCIONNEONATAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoNeoRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildAnexoNeoRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildAnexoNeoRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildAnexoNeoRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildAnexoNeoRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            AnexoNeoOid oid = new AnexoNeoOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(AnexoNeoConstants.ATTR_FIELD_ANEXONEOIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAnexoNeoIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(AnexoNeoService.class).error(e.getMessage());
        }
    }

}
