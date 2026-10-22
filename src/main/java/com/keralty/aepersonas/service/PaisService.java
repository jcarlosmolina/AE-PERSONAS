package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PaisConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.repository.PaisJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
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
public class PaisService extends AbstractService {

    PaisJpaRepository repository;

    PaisService paisSrv;

    DireccionService direccionSrv;

    @Inject
    public PaisService(
            PaisService paisSrv,
            DireccionService direccionSrv,
            PaisJpaRepository repository) {
        this.paisSrv = paisSrv;
        this.direccionSrv = direccionSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, PaisConstants.CLASS_NAME);
    }

    private List<Pais> solvePaisTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, PaisConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solvePaisTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, PaisConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Pais
     *
     * @return Population of class Pais
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Pais> get() {
        List<Pais> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Pais
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Pais
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Pais> instances = get(queryRequest);
        if(PaisConstants.DSICPAIS.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICPais())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Pais that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Pais matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Pais> get(QueryRequest queryRequest) {
        return solvePaisTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solvePaisTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solvePaisTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solvePaisTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solvePaisTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Pais by ID
     *
     * @param paisCodigo Identification field paisCodigo
     *
     * @return Instance of Pais
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Pais getById(String paisCodigo) {
        return getByOID(new PaisOid(paisCodigo));
    }
    
    /*
     * Returns an instance of Pais by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Pais
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Pais getByOID(PaisOid oid) {
        Optional<Pais> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Pais by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Pais
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Pais getByOIDWithHV(PaisOid oid) {
        Optional<Pais> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Pais> getInstanceByOid(PaisOid oid) {
        return oid != null && oid.getPaisCodigo() != null
               ? repository.findById(oid.getPaisCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of Pais by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Pais
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Pais getByJsonOid(String jsonOid) {
        PaisOid oid = new PaisOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Pais related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Pais
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Pais> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solvePaisTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Pais related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Pais
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Pais> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Pais
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Pais
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getPaisDynamic(PaisOid oid, String displaySetItems) {
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
    public String getSuppInfo(PaisOid oid, String dsName) {
        Pais instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Pais instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (PaisConstants.DSICPAIS.equals(dsName))
            return instance.buildICPais();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Pais instance, String dsName) {
        if (PaisConstants.DSICPAIS.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICPais());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (PaisConstants.FILTER_NAME_IFPAISCODIGO.equalsIgnoreCase(filterRequest.getName()))
            iFPaisCodigo(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_Pais".equals(filterRequest.getName()))
            suppInfo4ICPais(filterRequest.getFilterVariable("searchText").toString(), sql);
    }


    private void iFPaisCodigo(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vCodigo = filterRequest.hasFilterVariable(PaisConstants.VAR_NAME_IFPAISCODIGO_VCODIGO) ? (String) filterRequest.getFilterVariable(PaisConstants.VAR_NAME_IFPAISCODIGO_VCODIGO, FilterVariableRequest.STRING) : null;

        // Codigo = vCodigo
        if (vCodigo != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PaisConstants.ATTR_NAME_PAISCODIGO, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vCodigo, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUPais
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Pais using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.pais.ds.AutoDS> piuPIUPais(QueryRequest queryRequest) {
        return solvePaisTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.pais.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUPais
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUPais
     */
    public int getCount4PIUPais(QueryRequest queryRequest) {
        return solvePaisTypedQuery(queryRequest).size();
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
            com.keralty.aepersonas.viewmodel.pais.siu.InsPaisDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = paisSrv.insPaisDireccionTxn(request);
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
            com.keralty.aepersonas.viewmodel.pais.siu.InsPaisDireccionRequest request) throws ModelException {
        request.setPaisInsPaisDireccionpthisPaisInstance(paisSrv.getByOIDWithHV(request.getPaisInsPaisDireccionpthisPais()));
        request.setPaisInsPaisDireccionpevcDireccionInstance(direccionSrv.getByOIDWithHV(request.getPaisInsPaisDireccionpevcDireccion()));
        return paisSrv.insPaisDireccionImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.pais.siu.InsPaisDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Pais paisInsPaisDireccionpthisPais = request.getPaisInsPaisDireccionpthisPaisInstance();
        Direccion paisInsPaisDireccionpevcDireccion = request.getPaisInsPaisDireccionpevcDireccionInstance();

        request.checkArguments();
        Pais instance = paisInsPaisDireccionpthisPais;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.direccion.siu.InsPaisDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.direccion.siu.InsPaisDireccionRequest();
            relatedRequest.setDireccionInsPaisDireccionpthisDireccionInstance(paisInsPaisDireccionpevcDireccion);
            relatedRequest.setDireccionInsPaisDireccionpevcPaisInstance(paisInsPaisDireccionpthisPais);
            direccionSrv.insPaisDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPais());

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
            com.keralty.aepersonas.viewmodel.pais.siu.DelPaisDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = paisSrv.delPaisDireccionTxn(request);
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
            com.keralty.aepersonas.viewmodel.pais.siu.DelPaisDireccionRequest request) throws ModelException {
        request.setPaisDelPaisDireccionpthisPaisInstance(paisSrv.getByOIDWithHV(request.getPaisDelPaisDireccionpthisPais()));
        request.setPaisDelPaisDireccionpevcDireccionInstance(direccionSrv.getByOIDWithHV(request.getPaisDelPaisDireccionpevcDireccion()));
        return paisSrv.delPaisDireccionImplementation(request, true);
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
            com.keralty.aepersonas.viewmodel.pais.siu.DelPaisDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Pais paisDelPaisDireccionpthisPais = request.getPaisDelPaisDireccionpthisPaisInstance();
        Direccion paisDelPaisDireccionpevcDireccion = request.getPaisDelPaisDireccionpevcDireccionInstance();

        request.checkArguments();
        Pais instance = paisDelPaisDireccionpthisPais;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelPaisDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.direccion.siu.DelPaisDireccionRequest();
            relatedRequest.setDireccionDelPaisDireccionpthisDireccionInstance(paisDelPaisDireccionpevcDireccion);
            relatedRequest.setDireccionDelPaisDireccionpevcPaisInstance(paisDelPaisDireccionpthisPais);
            direccionSrv.delPaisDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICPais());

        return response;
    }


    private void suppInfo4ICPais(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PaisConstants.ATTR_NAME_PAISDESCRIPCION, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison1);

            SQLWhereConjunction conjunction = new SQLWhereConjunction();
            conjunction.addDisjunction(disjunction);
            select.addConjunction(conjunction);
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    @Override
    protected void applyOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        applyOCOCPais(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(PaisConstants.CLASS_NAME, PaisConstants.ATTR_FIELD_PAISCODIGO, false), true);
    }


    private void applyOCOCPais(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_Pais".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(PaisConstants.CLASS_NAME, PaisConstants.ATTR_NAME_PAISDESCRIPCION, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildPaisRelatedInstance(relatedInstanceJsonOid);
        }
        if (PaisConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildPaisRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildPaisRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            PaisOid oid = new PaisOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PaisConstants.ATTR_FIELD_PAISCODIGO, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPaisCodigo(), Constants.Type.STRING.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(PaisService.class).error(e.getMessage());
        }
    }

}
