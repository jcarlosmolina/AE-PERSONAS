package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.SolicitudNovedadConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.ContratoC;
import com.keralty.aepersonas.persistence.Dominio;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.SolicitudNovedad;
import com.keralty.aepersonas.repository.PeriodicidadJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereNegation;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandSubQuery;
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
public class PeriodicidadService extends AbstractService {

    PeriodicidadJpaRepository repository;

    PeriodicidadService periodicidadSrv;

    AnexoMatService anexoMatSrv;

    AnexoNeoService anexoNeoSrv;

    DominioService dominioSrv;

    SolicitudService solicitudSrv;

    SolicitudNovedadService solicitudNovedadSrv;

    ContratoCService contratoCSrv;

    @Inject
    public PeriodicidadService(
            PeriodicidadService periodicidadSrv,
            AnexoMatService anexoMatSrv,
            AnexoNeoService anexoNeoSrv,
            DominioService dominioSrv,
            SolicitudService solicitudSrv,
            SolicitudNovedadService solicitudNovedadSrv,
            ContratoCService contratoCSrv,
            PeriodicidadJpaRepository repository) {
        this.periodicidadSrv = periodicidadSrv;
        this.anexoMatSrv = anexoMatSrv;
        this.anexoNeoSrv = anexoNeoSrv;
        this.dominioSrv = dominioSrv;
        this.solicitudSrv = solicitudSrv;
        this.solicitudNovedadSrv = solicitudNovedadSrv;
        this.contratoCSrv = contratoCSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, PeriodicidadConstants.CLASS_NAME);
    }

    private List<Periodicidad> solvePeriodicidadTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, PeriodicidadConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solvePeriodicidadTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, PeriodicidadConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Periodicidad
     *
     * @return Population of class Periodicidad
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Periodicidad> get() {
        List<Periodicidad> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Periodicidad
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Periodicidad
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Periodicidad> instances = get(queryRequest);
        if(PeriodicidadConstants.DSICPERIODICIDAD.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICPeriodicidad())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Periodicidad that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Periodicidad matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Periodicidad> get(QueryRequest queryRequest) {
        return solvePeriodicidadTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solvePeriodicidadTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solvePeriodicidadTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solvePeriodicidadTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solvePeriodicidadTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Periodicidad by ID
     *
     * @param periodicidadCodigo Identification field periodicidadCodigo
     *
     * @return Instance of Periodicidad
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Periodicidad getById(Long periodicidadCodigo) {
        return getByOID(new PeriodicidadOid(periodicidadCodigo));
    }
    
    /*
     * Returns an instance of Periodicidad by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Periodicidad
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Periodicidad getByOID(PeriodicidadOid oid) {
        Optional<Periodicidad> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Periodicidad by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Periodicidad
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Periodicidad getByOIDWithHV(PeriodicidadOid oid) {
        Optional<Periodicidad> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Periodicidad> getInstanceByOid(PeriodicidadOid oid) {
        return oid != null && oid.getPeriodicidadCodigo() != null
               ? repository.findById(oid.getPeriodicidadCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of Periodicidad by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Periodicidad
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Periodicidad getByJsonOid(String jsonOid) {
        PeriodicidadOid oid = new PeriodicidadOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Periodicidad related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Periodicidad
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Periodicidad> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solvePeriodicidadTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Periodicidad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Periodicidad
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Periodicidad> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Periodicidad
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Periodicidad
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getPeriodicidadDynamic(PeriodicidadOid oid, String displaySetItems) {
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
    public String getSuppInfo(PeriodicidadOid oid, String dsName) {
        Periodicidad instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Periodicidad instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (PeriodicidadConstants.DSICPERIODICIDAD.equals(dsName))
            return instance.buildICPeriodicidad();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Periodicidad instance, String dsName) {
        if (PeriodicidadConstants.DSICPERIODICIDAD.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICPeriodicidad());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (PeriodicidadConstants.FILTER_NAME_IFPERIODICIDADMENSUAL.equalsIgnoreCase(filterRequest.getName()))
            iFPeriodicidadMensual(sql);
    }

    @Override
    protected void applyNavigationalFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if ("Dominio_InsPeriodicidadDominio_p_evcPeriodicidad_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431701422080423FiltNav4(filterRequest, sql);
        if ("Dominio_DelPeriodicidadDominio_p_evcPeriodicidad_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431701422080423FiltNav7(filterRequest, sql);
        if ("Solicitud_TMODIFICARINFOPAGO_pt_p_evcPeriodicidad_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1431957012480960FiltNav5(filterRequest, sql);
        if ("SolicitudNovedad_TCHGNUEVAPERIODICIDAD_ptPeriodicidad_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1581421428736234FiltNav22(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_Periodicidad".equals(filterRequest.getName()))
            suppInfo4ICPeriodicidad(filterRequest.getFilterVariable("searchText").toString(), sql);
    }


    private void iFPeriodicidadMensual(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // EsMensual = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PeriodicidadConstants.ATTR_NAME_PERIODICIDADESMENSUAL, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        sql.addConjunction(conjunction);
    }

    private void clas1431701422080423FiltNav4(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Dominio dominioInsPeriodicidadDominiopthisDominio = filterRequest.hasFilterVariable(DominioConstants.ARG_NAME_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPTHISDOMINIO) ? dominioSrv.getByOID(new DominioOid().fromJsonString(toJson(filterRequest.getFilterVariable(DominioConstants.ARG_NAME_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPTHISDOMINIO)))) : null;

        // EXIST (Dominios) WHERE (Dominios = pthisDominio) = false
        if (dominioInsPeriodicidadDominiopthisDominio != null) {
        {
            // 'not' Logical operator
            SQLWhereNegation comparison1 = new SQLWhereNegation(sql);
        
            // Operand 1
            // 'exist' Association operator
            SQLWhereOperandSubQuery operandSubQueryAssocOperator001 = new SQLWhereOperandSubQuery(repository.assocOperator001Range1Query(dominioInsPeriodicidadDominiopthisDominio, sql));
            comparison1.addOperand(operandSubQueryAssocOperator001);
            
            conjunction.addOperand(comparison1);
        }

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1431701422080423FiltNav7(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Dominio dominioDelPeriodicidadDominiopthisDominio = filterRequest.hasFilterVariable(DominioConstants.ARG_NAME_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPTHISDOMINIO) ? dominioSrv.getByOID(new DominioOid().fromJsonString(toJson(filterRequest.getFilterVariable(DominioConstants.ARG_NAME_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPTHISDOMINIO)))) : null;

        // EXIST (Dominios) WHERE (Dominios = pthisDominio) = true
        if (dominioDelPeriodicidadDominiopthisDominio != null) {
    // 'exist' Association operator
    SQLWhereOperandSubQuery operandSubQueryAssocOperator002 = new SQLWhereOperandSubQuery(repository.assocOperator002Range1Query(dominioDelPeriodicidadDominiopthisDominio, sql));
    conjunction.addOperand(operandSubQueryAssocOperator002);

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1431957012480960FiltNav5(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Solicitud solicitudTMODIFICARINFOPAGOpthisSolicitud = filterRequest.hasFilterVariable(SolicitudConstants.ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTHISSOLICITUD) ? solicitudSrv.getByOID(new SolicitudOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudConstants.ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTHISSOLICITUD)))) : null;

        // EXIST (Dominios) WHERE (Dominios.ProductoT = pthisSolicitud.Aesolicitudes.ProductoT AND Dominios.PlanT = pthisSolicitud.Aesolicitudes.PlanT) = true
        if (solicitudTMODIFICARINFOPAGOpthisSolicitud != null) {
    // 'exist' Association operator
    SQLWhereOperandSubQuery operandSubQueryAssocOperator003 = new SQLWhereOperandSubQuery(repository.assocOperator003Range1Query(solicitudTMODIFICARINFOPAGOpthisSolicitud, sql));
    conjunction.addOperand(operandSubQueryAssocOperator003);

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1581421428736234FiltNav22(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        SolicitudNovedad solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad = filterRequest.hasFilterVariable(SolicitudNovedadConstants.ARG_NAME_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTHISSOLICITUDNOVEDAD) ? solicitudNovedadSrv.getByOID(new SolicitudNovedadOid().fromJsonString(toJson(filterRequest.getFilterVariable(SolicitudNovedadConstants.ARG_NAME_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTHISSOLICITUDNOVEDAD)))) : null;

        // EXIST (Dominios) WHERE (Dominios.ProductoT = pthisSolicitudNovedad.PlanT.ProductoT AND Dominios.PlanT = pthisSolicitudNovedad.PlanT) = true
        if (solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad != null) {
    // 'exist' Association operator
    SQLWhereOperandSubQuery operandSubQueryAssocOperator004 = new SQLWhereOperandSubQuery(repository.assocOperator004Range1Query(solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad, sql));
    conjunction.addOperand(operandSubQueryAssocOperator004);

        }        
        sql.addConjunction(conjunction);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUPeriodicidad
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Periodicidad using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.periodicidad.ds.AutoDS> piuPIUPeriodicidad(QueryRequest queryRequest) {
        return solvePeriodicidadTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.periodicidad.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUPeriodicidad
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUPeriodicidad
     */
    public int getCount4PIUPeriodicidad(QueryRequest queryRequest) {
        return solvePeriodicidadTypedQuery(queryRequest).size();
    }

    /*
     * Solves the query needed for PIUPeriodicidadDetDominio
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Periodicidad using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.periodicidad.ds.AutoDS> piuPIUPeriodicidadDetDominio(QueryRequest queryRequest) {
        return solvePeriodicidadTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.periodicidad.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUPeriodicidadDetDominio
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUPeriodicidadDetDominio
     */
    public int getCount4PIUPeriodicidadDetDominio(QueryRequest queryRequest) {
        return solvePeriodicidadTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoMatRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = periodicidadSrv.cambPeriodicidadAnexoMatTxn(request);
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
            com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoMatRequest request) throws ModelException {
        request.setPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance(periodicidadSrv.getByOIDWithHV(request.getPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidad()));
        request.setPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance(anexoMatSrv.getByOIDWithHV(request.getPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMat()));
        return periodicidadSrv.cambPeriodicidadAnexoMatImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoMatRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Periodicidad periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad = request.getPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance();
        AnexoMat periodicidadCambPeriodicidadAnexoMatpevcAnexoMat = request.getPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance();

        request.checkArguments();
        Periodicidad instance = periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.anexomat.siu.CambPeriodicidadAnexoMatRequest relatedRequest = new com.keralty.aepersonas.viewmodel.anexomat.siu.CambPeriodicidadAnexoMatRequest();
            relatedRequest.setAnexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance(periodicidadCambPeriodicidadAnexoMatpevcAnexoMat);
            relatedRequest.setAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance(periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad);
            anexoMatSrv.cambPeriodicidadAnexoMatImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPeriodicidad());

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
            com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoNeoRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = periodicidadSrv.cambPeriodicidadAnexoNeoTxn(request);
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
            com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoNeoRequest request) throws ModelException {
        request.setPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance(periodicidadSrv.getByOIDWithHV(request.getPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidad()));
        request.setPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance(anexoNeoSrv.getByOIDWithHV(request.getPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeo()));
        return periodicidadSrv.cambPeriodicidadAnexoNeoImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.periodicidad.siu.CambPeriodicidadAnexoNeoRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Periodicidad periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad = request.getPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance();
        AnexoNeo periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo = request.getPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance();

        request.checkArguments();
        Periodicidad instance = periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.anexoneo.siu.CambPeriodicidadAnexoNeoRequest relatedRequest = new com.keralty.aepersonas.viewmodel.anexoneo.siu.CambPeriodicidadAnexoNeoRequest();
            relatedRequest.setAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance(periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo);
            relatedRequest.setAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance(periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad);
            anexoNeoSrv.cambPeriodicidadAnexoNeoImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPeriodicidad());

        return response;
    }


    private void suppInfo4ICPeriodicidad(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PeriodicidadConstants.ATTR_NAME_PERIODICIDADDESCRIPCION, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison1);

            SQLWhereConjunction conjunction = new SQLWhereConjunction();
            conjunction.addDisjunction(disjunction);
            select.addConjunction(conjunction);
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    @Override
    protected void applyOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        applyOCOCPeriodicidad(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(PeriodicidadConstants.CLASS_NAME, PeriodicidadConstants.ATTR_FIELD_PERIODICIDADCODIGO, false), true);
    }


    private void applyOCOCPeriodicidad(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_Periodicidad".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(PeriodicidadConstants.CLASS_NAME, PeriodicidadConstants.ATTR_NAME_PERIODICIDADDESCRIPCION, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildPeriodicidadRelatedInstance(relatedInstanceJsonOid);
        }
        if (PeriodicidadConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_ANEXOSMAT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4AnexoMat(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_ANEXOSNEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4AnexoNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || PeriodicidadConstants.ROLE_NAME_SOLICITUDESNOVEDADNUEVA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildPeriodicidadRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildPeriodicidadRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildPeriodicidadRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildPeriodicidadRelatedInstance4AnexoMat(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new AnexoMat(mapper.readValue(relatedInstanceJsonOid, AnexoMatOid.class)): AnexoMat.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildPeriodicidadRelatedInstance4AnexoNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class)): AnexoNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildPeriodicidadRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildPeriodicidadRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            PeriodicidadOid oid = new PeriodicidadOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PeriodicidadConstants.ATTR_FIELD_PERIODICIDADCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPeriodicidadCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(PeriodicidadService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
