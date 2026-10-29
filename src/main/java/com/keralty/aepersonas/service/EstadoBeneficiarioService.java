package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioNovedadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioRegOid;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.persistence.UsuarioNovedad;
import com.keralty.aepersonas.persistence.UsuarioReg;
import com.keralty.aepersonas.repository.EstadoBeneficiarioJpaRepository;
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
public class EstadoBeneficiarioService extends AbstractService {

    EstadoBeneficiarioJpaRepository repository;

    EstadoBeneficiarioService estadoBeneficiarioSrv;

    UsuarioService usuarioSrv;

    BeneficiarioCService beneficiarioCSrv;

    UsuarioRegService usuarioRegSrv;

    UsuarioNovedadService usuarioNovedadSrv;

    @Inject
    public EstadoBeneficiarioService(
            EstadoBeneficiarioService estadoBeneficiarioSrv,
            UsuarioService usuarioSrv,
            BeneficiarioCService beneficiarioCSrv,
            UsuarioRegService usuarioRegSrv,
            UsuarioNovedadService usuarioNovedadSrv,
            EstadoBeneficiarioJpaRepository repository) {
        this.estadoBeneficiarioSrv = estadoBeneficiarioSrv;
        this.usuarioSrv = usuarioSrv;
        this.beneficiarioCSrv = beneficiarioCSrv;
        this.usuarioRegSrv = usuarioRegSrv;
        this.usuarioNovedadSrv = usuarioNovedadSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, EstadoBeneficiarioConstants.CLASS_NAME);
    }

    private List<EstadoBeneficiario> solveEstadoBeneficiarioTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, EstadoBeneficiarioConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveEstadoBeneficiarioTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, EstadoBeneficiarioConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class EstadoBeneficiario
     *
     * @return Population of class EstadoBeneficiario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoBeneficiario> get() {
        List<EstadoBeneficiario> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class EstadoBeneficiario
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class EstadoBeneficiario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<EstadoBeneficiario> instances = get(queryRequest);
        if(EstadoBeneficiarioConstants.DSICESTADOBENEFICIARIO.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICEstadoBeneficiario())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class EstadoBeneficiario that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class EstadoBeneficiario matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoBeneficiario> get(QueryRequest queryRequest) {
        return solveEstadoBeneficiarioTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveEstadoBeneficiarioTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveEstadoBeneficiarioTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveEstadoBeneficiarioTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveEstadoBeneficiarioTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of EstadoBeneficiario by ID
     *
     * @param estadoBeneficiarioCodigo Identification field estadoBeneficiarioCodigo
     *
     * @return Instance of EstadoBeneficiario
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public EstadoBeneficiario getById(Long estadoBeneficiarioCodigo) {
        return getByOID(new EstadoBeneficiarioOid(estadoBeneficiarioCodigo));
    }
    
    /*
     * Returns an instance of EstadoBeneficiario by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of EstadoBeneficiario
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public EstadoBeneficiario getByOID(EstadoBeneficiarioOid oid) {
        Optional<EstadoBeneficiario> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of EstadoBeneficiario by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of EstadoBeneficiario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoBeneficiario getByOIDWithHV(EstadoBeneficiarioOid oid) {
        Optional<EstadoBeneficiario> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<EstadoBeneficiario> getInstanceByOid(EstadoBeneficiarioOid oid) {
        return oid != null && oid.getEstadoBeneficiarioCodigo() != null
               ? repository.findById(oid.getEstadoBeneficiarioCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of EstadoBeneficiario by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of EstadoBeneficiario
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public EstadoBeneficiario getByJsonOid(String jsonOid) {
        EstadoBeneficiarioOid oid = new EstadoBeneficiarioOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of EstadoBeneficiario related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of EstadoBeneficiario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoBeneficiario> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveEstadoBeneficiarioTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of EstadoBeneficiario related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of EstadoBeneficiario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<EstadoBeneficiario> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of EstadoBeneficiario
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of EstadoBeneficiario
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getEstadoBeneficiarioDynamic(EstadoBeneficiarioOid oid, String displaySetItems) {
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
    public String getSuppInfo(EstadoBeneficiarioOid oid, String dsName) {
        EstadoBeneficiario instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(EstadoBeneficiario instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (EstadoBeneficiarioConstants.DSICESTADOBENEFICIARIO.equals(dsName))
            return instance.buildICEstadoBeneficiario();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(EstadoBeneficiario instance, String dsName) {
        if (EstadoBeneficiarioConstants.DSICESTADOBENEFICIARIO.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICEstadoBeneficiario());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (EstadoBeneficiarioConstants.FILTER_NAME_IFESTADOBENEFICIARIOCODIGO.equalsIgnoreCase(filterRequest.getName()))
            iFEstadoBeneficiarioCodigo(filterRequest, sql);
        if (EstadoBeneficiarioConstants.FILTER_NAME_ICESTADOBENEFICIARIOPORNOMBRE.equalsIgnoreCase(filterRequest.getName()))
            iCEstadoBeneficiarioPorNombre(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_EstadoBeneficiario".equals(filterRequest.getName()))
            suppInfo4ICEstadoBeneficiario(filterRequest.getFilterVariable("searchText").toString(), sql);
    }


    private void iFEstadoBeneficiarioCodigo(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Long vCodigo = filterRequest.hasFilterVariable(EstadoBeneficiarioConstants.VAR_NAME_IFESTADOBENEFICIARIOCODIGO_VCODIGO) ? (Long) filterRequest.getFilterVariable(EstadoBeneficiarioConstants.VAR_NAME_IFESTADOBENEFICIARIOCODIGO_VCODIGO, FilterVariableRequest.INT) : null;

        // Codigo = vCodigo
        if (vCodigo != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOCODIGO, Constants.Type.INT.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vCodigo, Constants.Type.INT.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void iCEstadoBeneficiarioPorNombre(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNombre = filterRequest.hasFilterVariable(EstadoBeneficiarioConstants.VAR_NAME_ICESTADOBENEFICIARIOPORNOMBRE_VNOMBRE) ? (String) filterRequest.getFilterVariable(EstadoBeneficiarioConstants.VAR_NAME_ICESTADOBENEFICIARIOPORNOMBRE_VNOMBRE, FilterVariableRequest.STRING) : null;

        // Descripcion = vNombre
        if (vNombre != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIODESCRIPCION, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vNombre, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUEstadoBeneficiario
     *
     * @param queryRequest Query request
     * @return List of viewmodels for EstadoBeneficiario using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.estadobeneficiario.ds.AutoDS> piuPIUEstadoBeneficiario(QueryRequest queryRequest) {
        return solveEstadoBeneficiarioTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.estadobeneficiario.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUEstadoBeneficiario
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUEstadoBeneficiario
     */
    public int getCount4PIUEstadoBeneficiario(QueryRequest queryRequest) {
        return solveEstadoBeneficiarioTypedQuery(queryRequest).size();
    }

    // Service: InsEstadoBeneficiarioCORE

    /*
     * Entry point for service InsEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insEstadoBeneficiarioCORE(
            com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.InsEstadoBeneficiarioCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = estadoBeneficiarioSrv.insEstadoBeneficiarioCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insEstadoBeneficiarioCORETxn(
            com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.InsEstadoBeneficiarioCORERequest request) throws ModelException {
        request.setEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance(estadoBeneficiarioSrv.getByOIDWithHV(request.getEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario()));
        request.setEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario()));
        return estadoBeneficiarioSrv.insEstadoBeneficiarioCOREImplementation(request, true);
    }

    /*
     * Implements service InsEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insEstadoBeneficiarioCOREImplementation(
            com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.InsEstadoBeneficiarioCORERequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        EstadoBeneficiario estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario = request.getEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance();
        Usuario estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario = request.getEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance();

        request.checkArguments();
        EstadoBeneficiario instance = estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest relatedRequest = new com.keralty.aepersonas.viewmodel.usuario.siu.InsEstadoBeneficiarioCORERequest();
            relatedRequest.setUsuarioInsEstadoBeneficiarioCOREpthisUsuarioInstance(estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario);
            relatedRequest.setUsuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario);
            usuarioSrv.insEstadoBeneficiarioCOREImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICEstadoBeneficiario());

        return response;
    }

    // Service: DelEstadoBeneficiarioCORE

    /*
     * Entry point for service DelEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delEstadoBeneficiarioCORE(
            com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.DelEstadoBeneficiarioCORERequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = estadoBeneficiarioSrv.delEstadoBeneficiarioCORETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delEstadoBeneficiarioCORETxn(
            com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.DelEstadoBeneficiarioCORERequest request) throws ModelException {
        request.setEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance(estadoBeneficiarioSrv.getByOIDWithHV(request.getEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario()));
        request.setEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario()));
        return estadoBeneficiarioSrv.delEstadoBeneficiarioCOREImplementation(request, true);
    }

    /*
     * Implements service DelEstadoBeneficiarioCORE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delEstadoBeneficiarioCOREImplementation(
            com.keralty.aepersonas.viewmodel.estadobeneficiario.siu.DelEstadoBeneficiarioCORERequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        EstadoBeneficiario estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario = request.getEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance();
        Usuario estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario = request.getEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance();

        request.checkArguments();
        EstadoBeneficiario instance = estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest relatedRequest = new com.keralty.aepersonas.viewmodel.usuario.siu.DelEstadoBeneficiarioCORERequest();
            relatedRequest.setUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance(estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario);
            relatedRequest.setUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario);
            usuarioSrv.delEstadoBeneficiarioCOREImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICEstadoBeneficiario());

        return response;
    }


    private void suppInfo4ICEstadoBeneficiario(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIODESCRIPCION, Constants.Type.STRING.getTypeName()));
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
        applyOCOCEstadoBeneficiario(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(EstadoBeneficiarioConstants.CLASS_NAME, EstadoBeneficiarioConstants.ATTR_FIELD_ESTADOBENEFICIARIOCODIGO, false), true);
    }


    private void applyOCOCEstadoBeneficiario(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_EstadoBeneficiario".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(EstadoBeneficiarioConstants.CLASS_NAME, EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIODESCRIPCION, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance(relatedInstanceJsonOid);
        }
        if (EstadoBeneficiarioConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoBeneficiarioConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoBeneficiarioConstants.ROLE_NAME_USUARIOSREG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance4UsuarioReg(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoBeneficiarioConstants.ROLE_NAME_USUARIOSNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildEstadoBeneficiarioRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildEstadoBeneficiarioRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildEstadoBeneficiarioRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildEstadoBeneficiarioRelatedInstance4UsuarioReg(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class)): UsuarioReg.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildEstadoBeneficiarioRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            EstadoBeneficiarioOid oid = new EstadoBeneficiarioOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(EstadoBeneficiarioConstants.ATTR_FIELD_ESTADOBENEFICIARIOCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getEstadoBeneficiarioCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(EstadoBeneficiarioService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
