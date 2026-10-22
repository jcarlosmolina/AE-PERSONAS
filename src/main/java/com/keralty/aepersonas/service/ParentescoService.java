package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.global.UsuarioNovedadConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.ParentescoDomOid;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.UsuarioNovedadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioRegOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.ParentescoDom;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.persistence.UsuarioNovedad;
import com.keralty.aepersonas.persistence.UsuarioReg;
import com.keralty.aepersonas.repository.ParentescoJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
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
public class ParentescoService extends AbstractService {

    ParentescoJpaRepository repository;

    ParentescoService parentescoSrv;

    UsuarioService usuarioSrv;

    UsuarioNovedadService usuarioNovedadSrv;

    BeneficiarioCService beneficiarioCSrv;

    UsuarioRegService usuarioRegSrv;

    ParentescoDomService parentescoDomSrv;

    @Inject
    public ParentescoService(
            ParentescoService parentescoSrv,
            UsuarioService usuarioSrv,
            UsuarioNovedadService usuarioNovedadSrv,
            BeneficiarioCService beneficiarioCSrv,
            UsuarioRegService usuarioRegSrv,
            ParentescoDomService parentescoDomSrv,
            ParentescoJpaRepository repository) {
        this.parentescoSrv = parentescoSrv;
        this.usuarioSrv = usuarioSrv;
        this.usuarioNovedadSrv = usuarioNovedadSrv;
        this.beneficiarioCSrv = beneficiarioCSrv;
        this.usuarioRegSrv = usuarioRegSrv;
        this.parentescoDomSrv = parentescoDomSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, ParentescoConstants.CLASS_NAME);
    }

    private List<Parentesco> solveParentescoTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, ParentescoConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveParentescoTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, ParentescoConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Parentesco
     *
     * @return Population of class Parentesco
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Parentesco> get() {
        List<Parentesco> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Parentesco
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Parentesco
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Parentesco> instances = get(queryRequest);
        if(ParentescoConstants.DSICPARENTESCO.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICParentesco())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Parentesco that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Parentesco matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Parentesco> get(QueryRequest queryRequest) {
        return solveParentescoTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveParentescoTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveParentescoTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveParentescoTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveParentescoTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Parentesco by ID
     *
     * @param parentescoCodigo Identification field parentescoCodigo
     *
     * @return Instance of Parentesco
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Parentesco getById(Long parentescoCodigo) {
        return getByOID(new ParentescoOid(parentescoCodigo));
    }
    
    /*
     * Returns an instance of Parentesco by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Parentesco
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Parentesco getByOID(ParentescoOid oid) {
        Optional<Parentesco> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Parentesco by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Parentesco
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Parentesco getByOIDWithHV(ParentescoOid oid) {
        Optional<Parentesco> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Parentesco> getInstanceByOid(ParentescoOid oid) {
        return oid != null && oid.getParentescoCodigo() != null
               ? repository.findById(oid.getParentescoCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of Parentesco by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Parentesco
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Parentesco getByJsonOid(String jsonOid) {
        ParentescoOid oid = new ParentescoOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Parentesco related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Parentesco
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Parentesco> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveParentescoTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Parentesco related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Parentesco
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Parentesco> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Parentesco
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Parentesco
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getParentescoDynamic(ParentescoOid oid, String displaySetItems) {
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
    public String getSuppInfo(ParentescoOid oid, String dsName) {
        Parentesco instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Parentesco instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (ParentescoConstants.DSICPARENTESCO.equals(dsName))
            return instance.buildICParentesco();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Parentesco instance, String dsName) {
        if (ParentescoConstants.DSICPARENTESCO.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICParentesco());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (ParentescoConstants.FILTER_NAME_IFPARENTESCOTITULAR.equalsIgnoreCase(filterRequest.getName()))
            iFParentescoTitular(sql);
        if (ParentescoConstants.FILTER_NAME_IFPARENTESCOCONYUGE.equalsIgnoreCase(filterRequest.getName()))
            iFParentescoConyuge(sql);
        if (ParentescoConstants.FILTER_NAME_IFPARENTESCOCODIGO.equalsIgnoreCase(filterRequest.getName()))
            iFParentescoCodigo(filterRequest, sql);
        if (ParentescoConstants.FILTER_NAME_IFPARENTESCONOMBRECORTO.equalsIgnoreCase(filterRequest.getName()))
            iFParentescoNombreCorto(filterRequest, sql);
    }

    @Override
    protected void applyNavigationalFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if ("Usuario_TMODIFICARATTR_pt_p_evcParentesco_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1432633737216826FiltNav7(filterRequest, sql);
        if ("Usuario_TMODIFICARATTR_pt_p_evcParentesco_NavFilter1".equalsIgnoreCase(filterRequest.getName()))
            clas1432633737216826FiltNav12(filterRequest, sql);
        if ("UsuarioNovedad_TCAMBIARPARENTESCO_pt_p_evcParentesco_NavFilter0".equalsIgnoreCase(filterRequest.getName()))
            clas1581442138112529FiltNav3(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_Parentesco".equals(filterRequest.getName()))
            suppInfo4ICParentesco(filterRequest.getFilterVariable("searchText").toString(), sql);
    }


    private void iFParentescoTitular(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // EsTitular = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        sql.addConjunction(conjunction);
    }

    private void iFParentescoConyuge(SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        // EsConyuge = true
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(ParentescoConstants.ATTR_NAME_PARENTESCOESCONYUGE, Constants.Type.BOOL.getTypeName());
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
        conjunction.addOperand(comparison1);


        sql.addConjunction(conjunction);
    }

    private void iFParentescoCodigo(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Long vCodigo = filterRequest.hasFilterVariable(ParentescoConstants.VAR_NAME_IFPARENTESCOCODIGO_VCODIGO) ? (Long) filterRequest.getFilterVariable(ParentescoConstants.VAR_NAME_IFPARENTESCOCODIGO_VCODIGO, FilterVariableRequest.INT) : null;

        // Codigo = vCodigo
        if (vCodigo != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(ParentescoConstants.ATTR_NAME_PARENTESCOCODIGO, Constants.Type.INT.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vCodigo, Constants.Type.INT.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void iFParentescoNombreCorto(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vNomCorto = filterRequest.hasFilterVariable(ParentescoConstants.VAR_NAME_IFPARENTESCONOMBRECORTO_VNOMCORTO) ? (String) filterRequest.getFilterVariable(ParentescoConstants.VAR_NAME_IFPARENTESCONOMBRECORTO_VNOMCORTO, FilterVariableRequest.STRING) : null;

        // NombreCorto = vNomCorto
        if (vNomCorto != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(ParentescoConstants.ATTR_NAME_PARENTESCONOMBRECORTO, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vNomCorto, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void clas1432633737216826FiltNav7(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Usuario usuarioTMODIFICARATTRpthisAttrUsuario = filterRequest.hasFilterVariable(UsuarioConstants.ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTHISATTRUSUARIO) ? usuarioSrv.getByOID(new UsuarioOid().fromJsonString(toJson(filterRequest.getFilterVariable(UsuarioConstants.ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTHISATTRUSUARIO)))) : null;

        // EXIST (ParentescosDom) WHERE (ParentescosDom.Dominio.ProductoT = pthisAttrUsuario.Solicitud.Aesolicitudes.ProductoT AND ParentescosDom.Dominio.PlanT = pthisAttrUsuario.Solicitud.Aesolicitudes.PlanT) = true
        if (usuarioTMODIFICARATTRpthisAttrUsuario != null) {
    // 'exist' Association operator
    SQLWhereOperandSubQuery operandSubQueryAssocOperator001 = new SQLWhereOperandSubQuery(repository.assocOperator001Range1Query(usuarioTMODIFICARATTRpthisAttrUsuario, sql));
    conjunction.addOperand(operandSubQueryAssocOperator001);

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1432633737216826FiltNav12(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Usuario usuarioTMODIFICARATTRpthisAttrUsuario = filterRequest.hasFilterVariable(UsuarioConstants.ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTHISATTRUSUARIO) ? usuarioSrv.getByOID(new UsuarioOid().fromJsonString(toJson(filterRequest.getFilterVariable(UsuarioConstants.ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTHISATTRUSUARIO)))) : null;

        // EsTitular = false OR pthisAttrUsuario.drvPuedeSerTitular = true
        if (usuarioTMODIFICARATTRpthisAttrUsuario != null) {
        {
            // 'or' Logical operator
            SQLWhereDisjunction comparison1 = new SQLWhereDisjunction();
        
            // Operand 1
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.FALSE, Constants.Type.BOOL.getTypeName()));
                    comparison1.addOperand(comparison2);
        
            // Operand 2
                    // '=' Comparison
                    SQLWhereComparison comparison5 = new SQLWhereComparison(sql);
                    comparison5.setOperator("=");
                    
                    // Operand 1
                    comparison5.setFirstOperand(new SQLWhereOperandLiteral(usuarioTMODIFICARATTRpthisAttrUsuario.getUsuariodrvPuedeSerTitular(), Constants.Type.BOOL.getTypeName()));
                    
                    // Operand 2
                    comparison5.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    comparison1.addOperand(comparison5);
            
            conjunction.addOperand(comparison1);
        }

        }        
        sql.addConjunction(conjunction);
    }

    private void clas1581442138112529FiltNav3(FilterRequest filterRequest, SQLSelect sql) throws SystemException{
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        UsuarioNovedad usuarioNovedadTCAMBIARPARENTESCOpthisUsuarioNovedad = filterRequest.hasFilterVariable(UsuarioNovedadConstants.ARG_NAME_TCAMBIARPARENTESCO_USUARIONOVEDADTCAMBIARPARENTESCOPTHISUSUARIONOVEDAD) ? usuarioNovedadSrv.getByOID(new UsuarioNovedadOid().fromJsonString(toJson(filterRequest.getFilterVariable(UsuarioNovedadConstants.ARG_NAME_TCAMBIARPARENTESCO_USUARIONOVEDADTCAMBIARPARENTESCOPTHISUSUARIONOVEDAD)))) : null;

        // EXIST (ParentescosDom.Dominio.PlanT) WHERE (ParentescosDom.Dominio.PlanT = pthisUsuarioNovedad.FamiliaNovedad.Solicitud.PlanT) = true
        if (usuarioNovedadTCAMBIARPARENTESCOpthisUsuarioNovedad != null) {
    // 'exist' Association operator
    SQLWhereOperandSubQuery operandSubQueryAssocOperator002 = new SQLWhereOperandSubQuery(repository.assocOperator002Range1Query(usuarioNovedadTCAMBIARPARENTESCOpthisUsuarioNovedad, sql));
    conjunction.addOperand(operandSubQueryAssocOperator002);

        }        
        sql.addConjunction(conjunction);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUParentesco
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Parentesco using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.parentesco.ds.AutoDS> piuPIUParentesco(QueryRequest queryRequest) {
        return solveParentescoTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.parentesco.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUParentesco
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUParentesco
     */
    public int getCount4PIUParentesco(QueryRequest queryRequest) {
        return solveParentescoTypedQuery(queryRequest).size();
    }

    // Service: InsParentescoUsuario

    /*
     * Entry point for service InsParentescoUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insParentescoUsuario(
            com.keralty.aepersonas.viewmodel.parentesco.siu.InsParentescoUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = parentescoSrv.insParentescoUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsParentescoUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insParentescoUsuarioTxn(
            com.keralty.aepersonas.viewmodel.parentesco.siu.InsParentescoUsuarioRequest request) throws ModelException {
        request.setParentescoInsParentescoUsuariopthisParentescoInstance(parentescoSrv.getByOIDWithHV(request.getParentescoInsParentescoUsuariopthisParentesco()));
        request.setParentescoInsParentescoUsuariopevcUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getParentescoInsParentescoUsuariopevcUsuario()));
        return parentescoSrv.insParentescoUsuarioImplementation(request, true);
    }

    /*
     * Implements service InsParentescoUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insParentescoUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.parentesco.siu.InsParentescoUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Parentesco parentescoInsParentescoUsuariopthisParentesco = request.getParentescoInsParentescoUsuariopthisParentescoInstance();
        Usuario parentescoInsParentescoUsuariopevcUsuario = request.getParentescoInsParentescoUsuariopevcUsuarioInstance();

        request.checkArguments();
        Parentesco instance = parentescoInsParentescoUsuariopthisParentesco;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.usuario.siu.InsParentescoUsuarioRequest();
            relatedRequest.setUsuarioInsParentescoUsuariopthisAttrUsuarioInstance(parentescoInsParentescoUsuariopevcUsuario);
            relatedRequest.setUsuarioInsParentescoUsuariopevcParentescoInstance(parentescoInsParentescoUsuariopthisParentesco);
            usuarioSrv.insParentescoUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICParentesco());

        return response;
    }

    // Service: DelParentescorUsuario

    /*
     * Entry point for service DelParentescorUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delParentescorUsuario(
            com.keralty.aepersonas.viewmodel.parentesco.siu.DelParentescorUsuarioRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = parentescoSrv.delParentescorUsuarioTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelParentescorUsuario
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delParentescorUsuarioTxn(
            com.keralty.aepersonas.viewmodel.parentesco.siu.DelParentescorUsuarioRequest request) throws ModelException {
        request.setParentescoDelParentescorUsuariopthisParentescoInstance(parentescoSrv.getByOIDWithHV(request.getParentescoDelParentescorUsuariopthisParentesco()));
        request.setParentescoDelParentescorUsuariopevcUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getParentescoDelParentescorUsuariopevcUsuario()));
        return parentescoSrv.delParentescorUsuarioImplementation(request, true);
    }

    /*
     * Implements service DelParentescorUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delParentescorUsuarioImplementation(
            com.keralty.aepersonas.viewmodel.parentesco.siu.DelParentescorUsuarioRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Parentesco parentescoDelParentescorUsuariopthisParentesco = request.getParentescoDelParentescorUsuariopthisParentescoInstance();
        Usuario parentescoDelParentescorUsuariopevcUsuario = request.getParentescoDelParentescorUsuariopevcUsuarioInstance();

        request.checkArguments();
        Parentesco instance = parentescoDelParentescorUsuariopthisParentesco;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.usuario.siu.DelParentescorUsuarioRequest relatedRequest = new com.keralty.aepersonas.viewmodel.usuario.siu.DelParentescorUsuarioRequest();
            relatedRequest.setUsuarioDelParentescorUsuariopthisAttrUsuarioInstance(parentescoDelParentescorUsuariopevcUsuario);
            relatedRequest.setUsuarioDelParentescorUsuariopevcParentescoInstance(parentescoDelParentescorUsuariopthisParentesco);
            usuarioSrv.delParentescorUsuarioImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICParentesco());

        return response;
    }


    private void suppInfo4ICParentesco(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(ParentescoConstants.ATTR_NAME_PARENTESCODESCRIPCION, Constants.Type.STRING.getTypeName()));
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
        applyOCOCParentesco(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(ParentescoConstants.CLASS_NAME, ParentescoConstants.ATTR_FIELD_PARENTESCOCODIGO, false), true);
    }


    private void applyOCOCParentesco(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_Parentesco".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(ParentescoConstants.CLASS_NAME, ParentescoConstants.ATTR_NAME_PARENTESCODESCRIPCION, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildParentescoRelatedInstance(relatedInstanceJsonOid);
        }
        if (ParentescoConstants.ROLE_NAME_ATRIBUTOSUSUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_USUARIOSREG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4UsuarioReg(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_PARENTESCOSDOM.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4ParentescoDom(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_USUARIOSNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || ParentescoConstants.ROLE_NAME_USUARIONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildParentescoRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildParentescoRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildParentescoRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildParentescoRelatedInstance4UsuarioReg(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class)): UsuarioReg.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildParentescoRelatedInstance4ParentescoDom(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new ParentescoDom(mapper.readValue(relatedInstanceJsonOid, ParentescoDomOid.class)): ParentescoDom.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    private AbstractAppEntity buildParentescoRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
    		return null;
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            ParentescoOid oid = new ParentescoOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(ParentescoConstants.ATTR_FIELD_PARENTESCOCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getParentescoCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(ParentescoService.class).error(e.getMessage());
        }
    }

}
