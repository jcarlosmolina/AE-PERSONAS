package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AfiliacionesConstants;
import com.keralty.aepersonas.global.AreaMedicaConstants;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.RespRegionalConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.ContratoC;
import com.keralty.aepersonas.persistence.Firma;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.GrupoAsignacion;
import com.keralty.aepersonas.persistence.ObsEstado;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.FirmaOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionOid;
import com.keralty.aepersonas.persistence.oid.ObsEstadoOid;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.RegionalOid;
import com.keralty.aepersonas.persistence.oid.RespRegionalOid;
import com.keralty.aepersonas.persistence.oid.RolOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.SucursalOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Planes;
import com.keralty.aepersonas.persistence.Regional;
import com.keralty.aepersonas.persistence.RespRegional;
import com.keralty.aepersonas.persistence.Rol;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.SolicitudNovedad;
import com.keralty.aepersonas.persistence.Sucursal;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.repository.RespRegionalJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandThis;
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
public class RespRegionalService extends AbstractService {

    RespRegionalJpaRepository repository;

    FirmaService firmaSrv;

    SolicitudService solicitudSrv;

    ObsEstadoService obsEstadoSrv;

    SolicitudNovedadService solicitudNovedadSrv;

    GrupoAsignacionService grupoAsignacionSrv;

    ContratoCService contratoCSrv;

    RegionalService regionalSrv;

    RolService rolSrv;

    SucursalService sucursalSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    PlanesService planesSrv;

    @Inject
    public RespRegionalService(
            FirmaService firmaSrv,
            SolicitudService solicitudSrv,
            ObsEstadoService obsEstadoSrv,
            SolicitudNovedadService solicitudNovedadSrv,
            GrupoAsignacionService grupoAsignacionSrv,
            ContratoCService contratoCSrv,
            RegionalService regionalSrv,
            RolService rolSrv,
            SucursalService sucursalSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            PlanesService planesSrv,
            RespRegionalJpaRepository repository) {
        this.firmaSrv = firmaSrv;
        this.solicitudSrv = solicitudSrv;
        this.obsEstadoSrv = obsEstadoSrv;
        this.solicitudNovedadSrv = solicitudNovedadSrv;
        this.grupoAsignacionSrv = grupoAsignacionSrv;
        this.contratoCSrv = contratoCSrv;
        this.regionalSrv = regionalSrv;
        this.rolSrv = rolSrv;
        this.sucursalSrv = sucursalSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.planesSrv = planesSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, RespRegionalConstants.CLASS_NAME);
    }

    private List<RespRegional> solveRespRegionalTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, RespRegionalConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveRespRegionalTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, RespRegionalConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class RespRegional
     *
     * @return Population of class RespRegional
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<RespRegional> get() {
        List<RespRegional> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class RespRegional
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class RespRegional
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<RespRegional> instances = get(queryRequest);
        if(RespRegionalConstants.DSICRESPREGIONAL.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICRespRegional())).collect(Collectors.toList());
        }
        if(RespRegionalConstants.DSDSRESPREGIONALPIU.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSRespRegionalPIU())).collect(Collectors.toList());
        }
        if(RespRegionalConstants.DSICRESPREGIONALNOMAPE.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICRespRegionalNomApe())).collect(Collectors.toList());
        }
        if(RespRegionalConstants.DSDSRESPREGIONALFIRMA.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildDSRespRegionalFirma())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class RespRegional that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class RespRegional matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<RespRegional> get(QueryRequest queryRequest) {
        return solveRespRegionalTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveRespRegionalTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveRespRegionalTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveRespRegionalTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveRespRegionalTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of RespRegional by ID
     *
     * @param funcionarioId Identification field funcionarioId
     *
     * @return Instance of RespRegional
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public RespRegional getById(Long funcionarioId) {
        return getByOID(new RespRegionalOid(funcionarioId));
    }
    
    /*
     * Returns an instance of RespRegional by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of RespRegional
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public RespRegional getByOID(RespRegionalOid oid) {
        Optional<RespRegional> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of RespRegional by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of RespRegional
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public RespRegional getByOIDWithHV(RespRegionalOid oid) {
        Optional<RespRegional> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<RespRegional> getInstanceByOid(RespRegionalOid oid) {
        return oid != null && oid.getFuncionarioId() != null
               ? repository.findById(oid.getFuncionarioId())
               : Optional.empty();
    }

    /*
     * Returns an instance of RespRegional by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of RespRegional
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public RespRegional getByJsonOid(String jsonOid) {
        RespRegionalOid oid = new RespRegionalOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of RespRegional related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of RespRegional
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<RespRegional> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveRespRegionalTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of RespRegional related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of RespRegional
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<RespRegional> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of RespRegional
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of RespRegional
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getRespRegionalDynamic(RespRegionalOid oid, String displaySetItems) {
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
    public String getSuppInfo(RespRegionalOid oid, String dsName) {
        RespRegional instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(RespRegional instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (RespRegionalConstants.DSICRESPREGIONALNOMAPE.equals(dsName))
            return instance.buildICRespRegionalNomApe();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(RespRegional instance, String dsName) {
        if (RespRegionalConstants.DSICRESPREGIONAL.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICRespRegional());
        if (RespRegionalConstants.DSDSRESPREGIONALPIU.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSRespRegionalPIU());
        if (RespRegionalConstants.DSICRESPREGIONALNOMAPE.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICRespRegionalNomApe());
        if (RespRegionalConstants.DSDSRESPREGIONALFIRMA.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildDSRespRegionalFirma());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_RespRegionalNomApe".equals(filterRequest.getName()))
            suppInfo4ICRespRegionalNomApe(filterRequest.getFilterVariable("searchText").toString(), sql);
    }



    // IIU Methods

    /*
     * Returns a viewmodel for class RespRegional with displayset DSRespRegionalFirma for the instance with a given OID
     * @param oid Class oid
     * @return Viewmodel for class class RespRegional with displayset DSRespRegionalFirma
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public com.keralty.aepersonas.viewmodel.respregional.ds.DSRespRegionalFirma iIURespRegionalFirma(RespRegionalOid oid) {
        return new com.keralty.aepersonas.viewmodel.respregional.ds.DSRespRegionalFirma(getByOIDWithHV(oid));
    }


    /*
     * Solves the query needed for PIURespRegional
     *
     * @param queryRequest Query request
     * @return List of viewmodels for RespRegional using displayset DSRespRegionalPIU that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.respregional.ds.DSRespRegionalPIU> piuPIURespRegional(QueryRequest queryRequest) {
        return solveRespRegionalTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.respregional.ds.DSRespRegionalPIU::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIURespRegional
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIURespRegional
     */
    public int getCount4PIURespRegional(QueryRequest queryRequest) {
        return solveRespRegionalTypedQuery(queryRequest).size();
    }


    @Override
    protected void applyHVFilter(SQLSelect sql) throws SystemException {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        SQLWhereDisjunction disjunction = new SQLWhereDisjunction();
        if (getAgentRoles().contains(RespRegionalConstants.CLASS_NAME)) applyHVFilter4RespRegional(sql, disjunction);
        conjunction.addDisjunction(disjunction);
        sql.addConjunction(conjunction);
    }

    private void applyHVFilter4RespRegional(SQLSelect sql, SQLWhereDisjunction disjunction) {
        // agent = this
        RespRegional agentInstance = getAgentRespRegional();
        // '=' Comparison
        SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
        comparison1.setOperator("=");
        
        // Operand 1
        SQLWhereOperandOVParameter operand112 = new SQLWhereOperandOVParameter(Constants.AGENTKEYWORD, RespRegionalConstants.CLASS_NAME, RespRegionalConstants.CLASS_NAME, agentInstance.getOid(), Constants.AGENTKEYWORD);
        comparison1.setFirstOperand(operand112);
        
        // Operand 2
        SQLWhereOperandThis operand223 = new SQLWhereOperandThis();
        comparison1.setSecondOperand(operand223);
        disjunction.addOperand(comparison1);

    }


    private void suppInfo4ICRespRegionalNomApe(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERNOMBRE, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison1);

            SQLWhereComparison comparison2 = new SQLWhereComparison(select);
            comparison2.setOperator("LIKE");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE, Constants.Type.STRING.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison2);

            SQLWhereComparison comparison3 = new SQLWhereComparison(select);
            comparison3.setOperator("LIKE");
            comparison3.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO, Constants.Type.STRING.getTypeName()));
            comparison3.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison3);

            SQLWhereComparison comparison4 = new SQLWhereComparison(select);
            comparison4.setOperator("LIKE");
            comparison4.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO, Constants.Type.STRING.getTypeName()));
            comparison4.setSecondOperand(new SQLWhereOperandLiteral(searchText, Constants.Type.STRING.getTypeName()));
            disjunction.addComparison(comparison4);

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
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(RespRegionalConstants.CLASS_NAME, FuncionarioConstants.ATTR_FIELD_FUNCIONARIOID, false), true);
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildRespRegionalRelatedInstance(relatedInstanceJsonOid);
        }
        if (RespRegionalConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLICITUDESAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem) || AreaMedicaConstants.ROLE_NAME_SOLICITUDESARME.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_OBSESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4ObsEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLNOVAIFLIACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_GRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        if (AsesorConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (RespRegionalConstants.ROLE_NAME_REGIONAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4Regional(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_ROL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4Rol(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SUCURSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4Sucursal(relatedInstanceJsonOid, remainingPath);
        }
        if (AsesorConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (AfiliacionesConstants.ROLE_NAME_PLANES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRespRegionalRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildRespRegionalRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new RespRegional(mapper.readValue(relatedInstanceJsonOid, RespRegionalOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4ObsEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new ObsEstado(mapper.readValue(relatedInstanceJsonOid, ObsEstadoOid.class)): ObsEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4Regional(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Regional(mapper.readValue(relatedInstanceJsonOid, RegionalOid.class)): Regional.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4Rol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Rol(mapper.readValue(relatedInstanceJsonOid, RolOid.class)): Rol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4Sucursal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Sucursal(mapper.readValue(relatedInstanceJsonOid, SucursalOid.class)): Sucursal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildRespRegionalRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            RespRegionalOid oid = new RespRegionalOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(FuncionarioConstants.ATTR_FIELD_FUNCIONARIOID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getFuncionarioId(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(RespRegionalService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
