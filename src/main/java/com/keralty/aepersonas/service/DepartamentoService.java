package com.keralty.aepersonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.repository.DepartamentoJpaRepository;
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
public class DepartamentoService extends AbstractService {

    DepartamentoJpaRepository repository;

    DepartamentoService departamentoSrv;

    DireccionService direccionSrv;

    PersonaService personaSrv;

    ContratanteService contratanteSrv;

    TitularService titularSrv;

    MunicipioService municipioSrv;

    PersonaCService personaCSrv;

    @Inject
    public DepartamentoService(
            DepartamentoService departamentoSrv,
            DireccionService direccionSrv,
            PersonaService personaSrv,
            ContratanteService contratanteSrv,
            TitularService titularSrv,
            MunicipioService municipioSrv,
            PersonaCService personaCSrv,
            DepartamentoJpaRepository repository) {
        this.departamentoSrv = departamentoSrv;
        this.direccionSrv = direccionSrv;
        this.personaSrv = personaSrv;
        this.contratanteSrv = contratanteSrv;
        this.titularSrv = titularSrv;
        this.municipioSrv = municipioSrv;
        this.personaCSrv = personaCSrv;
        this.repository = repository;
    }

    public List<Map<String, Object>> solveQuery(QueryRequest request) {
        return solveGenericQuery(request, DepartamentoConstants.CLASS_NAME);
    }

    private List<Departamento> solveDepartamentoTypedQuery(QueryRequest request) {
        return repository.solveQuery(processQueryRequest(request, DepartamentoConstants.CLASS_NAME), request.getPageSize(), request.getPageNumber());
    }
    
    private int solveDepartamentoTypedCountQuery(QueryRequest request) {
        return repository.solveCountQuery(processCountQueryRequest(request, DepartamentoConstants.CLASS_NAME));
    }

    /*
     * Returns the population of class Departamento
     *
     * @return Population of class Departamento
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Departamento> get() {
        List<Departamento> results = new java.util.ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }
    
    /*
     * Gets the preloaded list of objects of class Departamento
     *
     * @param queryRequest Request object that dictates the search conditions to 
     * retrieve objects
     *
     * @return Preloaded list of objects of class Departamento
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<PreloadViewModel> getPreload(QueryRequest queryRequest) {
        List<PreloadViewModel> results = new ArrayList<>();
        List<Departamento> instances = get(queryRequest);
        if(DepartamentoConstants.DSICDEPARTAMENTO.equals(queryRequest.getDisplaySetName())) {
            results = instances.stream().map(x -> new PreloadViewModel(x.getOid().toJson(), x.buildICDepartamento())).collect(Collectors.toList());
        }
        return results;
    }
    /*
     * Returns the population of class Departamento that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Departamento matching the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Departamento> get(QueryRequest queryRequest) {
        return solveDepartamentoTypedQuery(queryRequest);
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
            return new PopulationResponseViewModel(solveDepartamentoTypedQuery(queryRequest).stream()
                    .map(instance -> buildDynamicObject(instance, queryRequest.getDisplaySetItems()))
                    .collect(Collectors.toList()), queryRequest.getPageSize() != 0 ? solveDepartamentoTypedCountQuery(queryRequest) : 0);
        } else {
            return new PreloadResponseViewModel(solveDepartamentoTypedQuery(queryRequest).stream()
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
        return new PopulationResponseViewModel(solveDepartamentoTypedQuery(queryRequest).stream()
                .map(instance -> buildDynamicObject(instance, displaySetItems))
                .collect(Collectors.toList()));
    }

    /*
     * Returns an instance of Departamento by ID
     *
     * @param departamentoCodigo Identification field departamentoCodigo
     *
     * @return Instance of Departamento
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Departamento getById(Long departamentoCodigo) {
        return getByOID(new DepartamentoOid(departamentoCodigo));
    }
    
    /*
     * Returns an instance of Departamento by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Departamento
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Departamento getByOID(DepartamentoOid oid) {
        Optional<Departamento> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Departamento by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Departamento
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Departamento getByOIDWithHV(DepartamentoOid oid) {
        Optional<Departamento> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Departamento> getInstanceByOid(DepartamentoOid oid) {
        return oid != null && oid.getDepartamentoCodigo() != null
               ? repository.findById(oid.getDepartamentoCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of Departamento by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Departamento
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Departamento getByJsonOid(String jsonOid) {
        DepartamentoOid oid = new DepartamentoOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }

    /*
     * Returns the list of instances of Departamento related to a given instance through 
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Departamento
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Departamento> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        QueryRequest queryRequest = new QueryRequest(new FilterRequest(Constants.FILTER_BY_RELATED,
                Arrays.asList(new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath),
                        new FilterVariableRequest(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstance.getOid().toJson()))));
        return solveDepartamentoTypedQuery(queryRequest);
    }

    /*
     * Returns the list of instances of Departamento related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Departamento
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Departamento> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath) {
        return getByRelated(relatedInstance, relatedInstancePath);
    }

    /*
     * Returns a set of displayset items for an instance of Departamento
     *
     * @param oid Object IDentifier
     *
     * @param displaySetItems List of comma-separated displayset items
     *
     * @return Set of displayset items for an instance of Departamento
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public InstanceResponseViewModel getDepartamentoDynamic(DepartamentoOid oid, String displaySetItems) {
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
    public String getSuppInfo(DepartamentoOid oid, String dsName) {
        Departamento instance = getByOIDWithHV(oid);
        return (instance != null ? getSuppInfo(instance, dsName): "");
    }

    private String getSuppInfo(Departamento instance, String dsName) {
        if (instance == null || instance.isNull()) return "";
        if (DepartamentoConstants.DSICDEPARTAMENTO.equals(dsName))
            return instance.buildICDepartamento();
        return dsName.isEmpty() ? instance.getOid().toJson() : "";
    }

    public static PreloadViewModel buildPreloadViewModel(Departamento instance, String dsName) {
        if (DepartamentoConstants.DSICDEPARTAMENTO.equals(dsName))
            return new PreloadViewModel(instance.getOid().toJson(), instance.buildICDepartamento());
        return new PreloadViewModel(instance.getOid().toJson(), "");
    }


    @Override
    protected void applyQueryFilters(FilterRequest filterRequest, SQLSelect sql) throws SystemException {
        if (DepartamentoConstants.FILTER_NAME_IFDEPARTAMENTOCODIGO.equalsIgnoreCase(filterRequest.getName()))
            iFDepartamentoCodigo(filterRequest, sql);
        if (DepartamentoConstants.FILTER_NAME_FDEPARTAMENTOCODIGOLEGAL.equalsIgnoreCase(filterRequest.getName()))
            fDepartamentoCodigoLegal(filterRequest, sql);
    }

    @Override
    protected void applyServiceSIFilters(FilterRequest filterRequest, SQLSelect sql) {
        if ("SuppInfo_IC_Departamento".equals(filterRequest.getName()))
            suppInfo4ICDepartamento(filterRequest.getFilterVariable("searchText").toString(), sql);
    }


    private void iFDepartamentoCodigo(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        Long vCodigo = filterRequest.hasFilterVariable(DepartamentoConstants.VAR_NAME_IFDEPARTAMENTOCODIGO_VCODIGO) ? (Long) filterRequest.getFilterVariable(DepartamentoConstants.VAR_NAME_IFDEPARTAMENTOCODIGO_VCODIGO, FilterVariableRequest.INT) : null;

        // Codigo = vCodigo
        if (vCodigo != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(DepartamentoConstants.ATTR_NAME_DEPARTAMENTOCODIGO, Constants.Type.INT.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vCodigo, Constants.Type.INT.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    private void fDepartamentoCodigoLegal(FilterRequest filterRequest, SQLSelect sql) {
        SQLWhereConjunction conjunction = new SQLWhereConjunction();
        String vfCodLegal = filterRequest.hasFilterVariable(DepartamentoConstants.VAR_NAME_FDEPARTAMENTOCODIGOLEGAL_VFCODLEGAL) ? (String) filterRequest.getFilterVariable(DepartamentoConstants.VAR_NAME_FDEPARTAMENTOCODIGOLEGAL_VFCODLEGAL, FilterVariableRequest.STRING) : null;

        // CodigoLegal = vfCodLegal
        if (vfCodLegal != null) {
            // '=' Comparison
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            
            // Operand 1
            SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(DepartamentoConstants.ATTR_NAME_DEPARTAMENTOCODIGOLEGAL, Constants.Type.STRING.getTypeName());
            comparison1.setFirstOperand(operand112);
            
            // Operand 2
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(vfCodLegal, Constants.Type.STRING.getTypeName()));
            conjunction.addOperand(comparison1);

        }        

        sql.addConjunction(conjunction);
    }

    // IIU Methods


    /*
     * Solves the query needed for PIUDepartamento
     *
     * @param queryRequest Query request
     * @return List of viewmodels for Departamento using displayset AutoDS that 
     * match the search criteria
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public List<com.keralty.aepersonas.viewmodel.departamento.ds.AutoDS> piuPIUDepartamento(QueryRequest queryRequest) {
        return solveDepartamentoTypedQuery(queryRequest).stream()
                .map(com.keralty.aepersonas.viewmodel.departamento.ds.AutoDS::new)
                .collect(Collectors.toList());
    }

    /*
     * Solves the COUNT query needed for PIUDepartamento
     *
     * @param queryRequest Query request
     * @returns Count of instances for PIUDepartamento
     */
    public int getCount4PIUDepartamento(QueryRequest queryRequest) {
        return solveDepartamentoTypedQuery(queryRequest).size();
    }

    // Service: InsDepartamentoDireccion

    /*
     * Entry point for service InsDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDepartamentoDireccion(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.insDepartamentoDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDepartamentoDireccionTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoDireccionRequest request) throws ModelException {
        request.setDepartamentoInsDepartamentoDireccionpthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoInsDepartamentoDireccionpthisDepartamento()));
        request.setDepartamentoInsDepartamentoDireccionpevcDireccionInstance(direccionSrv.getByOIDWithHV(request.getDepartamentoInsDepartamentoDireccionpevcDireccion()));
        return departamentoSrv.insDepartamentoDireccionImplementation(request, true);
    }

    /*
     * Implements service InsDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDepartamentoDireccionImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoInsDepartamentoDireccionpthisDepartamento = request.getDepartamentoInsDepartamentoDireccionpthisDepartamentoInstance();
        Direccion departamentoInsDepartamentoDireccionpevcDireccion = request.getDepartamentoInsDepartamentoDireccionpevcDireccionInstance();

        request.checkArguments();
        Departamento instance = departamentoInsDepartamentoDireccionpthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.direccion.siu.InsDepartamentoDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.direccion.siu.InsDepartamentoDireccionRequest();
            relatedRequest.setDireccionInsDepartamentoDireccionpthisDireccionInstance(departamentoInsDepartamentoDireccionpevcDireccion);
            relatedRequest.setDireccionInsDepartamentoDireccionpevcDepartamentoInstance(departamentoInsDepartamentoDireccionpthisDepartamento);
            direccionSrv.insDepartamentoDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }

    // Service: DelDepartamentoDireccion

    /*
     * Entry point for service DelDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDepartamentoDireccion(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoDireccionRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.delDepartamentoDireccionTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDepartamentoDireccionTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoDireccionRequest request) throws ModelException {
        request.setDepartamentoDelDepartamentoDireccionpthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoDelDepartamentoDireccionpthisDepartamento()));
        request.setDepartamentoDelDepartamentoDireccionpevcDireccionInstance(direccionSrv.getByOIDWithHV(request.getDepartamentoDelDepartamentoDireccionpevcDireccion()));
        return departamentoSrv.delDepartamentoDireccionImplementation(request, true);
    }

    /*
     * Implements service DelDepartamentoDireccion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDepartamentoDireccionImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoDireccionRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoDelDepartamentoDireccionpthisDepartamento = request.getDepartamentoDelDepartamentoDireccionpthisDepartamentoInstance();
        Direccion departamentoDelDepartamentoDireccionpevcDireccion = request.getDepartamentoDelDepartamentoDireccionpevcDireccionInstance();

        request.checkArguments();
        Departamento instance = departamentoDelDepartamentoDireccionpthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.direccion.siu.DelDepartamentoDireccionRequest relatedRequest = new com.keralty.aepersonas.viewmodel.direccion.siu.DelDepartamentoDireccionRequest();
            relatedRequest.setDireccionDelDepartamentoDireccionpthisDireccionInstance(departamentoDelDepartamentoDireccionpevcDireccion);
            relatedRequest.setDireccionDelDepartamentoDireccionpevcDepartamentoInstance(departamentoDelDepartamentoDireccionpthisDepartamento);
            direccionSrv.delDepartamentoDireccionImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }

    // Service: InsDptoNacimientoPersona

    /*
     * Entry point for service InsDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDptoNacimientoPersona(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDptoNacimientoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.insDptoNacimientoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDptoNacimientoPersonaTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDptoNacimientoPersonaRequest request) throws ModelException {
        request.setDepartamentoInsDptoNacimientoPersonapthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoInsDptoNacimientoPersonapthisDepartamento()));
        request.setDepartamentoInsDptoNacimientoPersonapevcPersonaInstance(personaSrv.getByOIDWithHV(request.getDepartamentoInsDptoNacimientoPersonapevcPersona()));
        return departamentoSrv.insDptoNacimientoPersonaImplementation(request, true);
    }

    /*
     * Implements service InsDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDptoNacimientoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDptoNacimientoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoInsDptoNacimientoPersonapthisDepartamento = request.getDepartamentoInsDptoNacimientoPersonapthisDepartamentoInstance();
        Persona departamentoInsDptoNacimientoPersonapevcPersona = request.getDepartamentoInsDptoNacimientoPersonapevcPersonaInstance();

        request.checkArguments();
        Departamento instance = departamentoInsDptoNacimientoPersonapthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.InsDptoNacimientoPersonaRequest();
            relatedRequest.setPersonaInsDptoNacimientoPersonapthisPersonaInstance(departamentoInsDptoNacimientoPersonapevcPersona);
            relatedRequest.setPersonaInsDptoNacimientoPersonapevcDepartamentoInstance(departamentoInsDptoNacimientoPersonapthisDepartamento);
            personaSrv.insDptoNacimientoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }

    // Service: DelDptoNacimientoPersona

    /*
     * Entry point for service DelDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDptoNacimientoPersona(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDptoNacimientoPersonaRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.delDptoNacimientoPersonaTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDptoNacimientoPersonaTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDptoNacimientoPersonaRequest request) throws ModelException {
        request.setDepartamentoDelDptoNacimientoPersonapthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoDelDptoNacimientoPersonapthisDepartamento()));
        request.setDepartamentoDelDptoNacimientoPersonapevcPersonaInstance(personaSrv.getByOIDWithHV(request.getDepartamentoDelDptoNacimientoPersonapevcPersona()));
        return departamentoSrv.delDptoNacimientoPersonaImplementation(request, true);
    }

    /*
     * Implements service DelDptoNacimientoPersona
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDptoNacimientoPersonaImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDptoNacimientoPersonaRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoDelDptoNacimientoPersonapthisDepartamento = request.getDepartamentoDelDptoNacimientoPersonapthisDepartamentoInstance();
        Persona departamentoDelDptoNacimientoPersonapevcPersona = request.getDepartamentoDelDptoNacimientoPersonapevcPersonaInstance();

        request.checkArguments();
        Departamento instance = departamentoDelDptoNacimientoPersonapthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest relatedRequest = new com.keralty.aepersonas.viewmodel.persona.siu.DelDptoNacimientoPersonaRequest();
            relatedRequest.setPersonaDelDptoNacimientoPersonapthisPersonaInstance(departamentoDelDptoNacimientoPersonapevcPersona);
            relatedRequest.setPersonaDelDptoNacimientoPersonapevcDepartamentoInstance(departamentoDelDptoNacimientoPersonapthisDepartamento);
            personaSrv.delDptoNacimientoPersonaImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }

    // Service: InsDepartamentoNacContratante

    /*
     * Entry point for service InsDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDepartamentoNacContratante(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacContratanteRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.insDepartamentoNacContratanteTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDepartamentoNacContratanteTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacContratanteRequest request) throws ModelException {
        request.setDepartamentoInsDepartamentoNacContratantepthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoInsDepartamentoNacContratantepthisDepartamento()));
        request.setDepartamentoInsDepartamentoNacContratantepevcContratanteInstance(contratanteSrv.getByOIDWithHV(request.getDepartamentoInsDepartamentoNacContratantepevcContratante()));
        return departamentoSrv.insDepartamentoNacContratanteImplementation(request, true);
    }

    /*
     * Implements service InsDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDepartamentoNacContratanteImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacContratanteRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoInsDepartamentoNacContratantepthisDepartamento = request.getDepartamentoInsDepartamentoNacContratantepthisDepartamentoInstance();
        Contratante departamentoInsDepartamentoNacContratantepevcContratante = request.getDepartamentoInsDepartamentoNacContratantepevcContratanteInstance();

        request.checkArguments();
        Departamento instance = departamentoInsDepartamentoNacContratantepthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoNacContratanteRequest relatedRequest = new com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoNacContratanteRequest();
            relatedRequest.setContratanteInsDepartamentoNacContratantepthisContratanteInstance(departamentoInsDepartamentoNacContratantepevcContratante);
            relatedRequest.setContratanteInsDepartamentoNacContratantepevcDepartamentoInstance(departamentoInsDepartamentoNacContratantepthisDepartamento);
            contratanteSrv.insDepartamentoNacContratanteImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }

    // Service: DelDepartamentoNacContratante

    /*
     * Entry point for service DelDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDepartamentoNacContratante(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacContratanteRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.delDepartamentoNacContratanteTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDepartamentoNacContratanteTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacContratanteRequest request) throws ModelException {
        request.setDepartamentoDelDepartamentoNacContratantepthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoDelDepartamentoNacContratantepthisDepartamento()));
        request.setDepartamentoDelDepartamentoNacContratantepevcContratanteInstance(contratanteSrv.getByOIDWithHV(request.getDepartamentoDelDepartamentoNacContratantepevcContratante()));
        return departamentoSrv.delDepartamentoNacContratanteImplementation(request, true);
    }

    /*
     * Implements service DelDepartamentoNacContratante
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDepartamentoNacContratanteImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacContratanteRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoDelDepartamentoNacContratantepthisDepartamento = request.getDepartamentoDelDepartamentoNacContratantepthisDepartamentoInstance();
        Contratante departamentoDelDepartamentoNacContratantepevcContratante = request.getDepartamentoDelDepartamentoNacContratantepevcContratanteInstance();

        request.checkArguments();
        Departamento instance = departamentoDelDepartamentoNacContratantepthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoNacContratanteRequest relatedRequest = new com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoNacContratanteRequest();
            relatedRequest.setContratanteDelDepartamentoNacContratantepthisContratanteInstance(departamentoDelDepartamentoNacContratantepevcContratante);
            relatedRequest.setContratanteDelDepartamentoNacContratantepevcDepartamentoInstance(departamentoDelDepartamentoNacContratantepthisDepartamento);
            contratanteSrv.delDepartamentoNacContratanteImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }

    // Service: InsDepartamentoNacTitular

    /*
     * Entry point for service InsDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDepartamentoNacTitular(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.insDepartamentoNacTitularTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDepartamentoNacTitularTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacTitularRequest request) throws ModelException {
        request.setDepartamentoInsDepartamentoNacTitularpthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoInsDepartamentoNacTitularpthisDepartamento()));
        request.setDepartamentoInsDepartamentoNacTitularpevcTitularInstance(titularSrv.getByOIDWithHV(request.getDepartamentoInsDepartamentoNacTitularpevcTitular()));
        return departamentoSrv.insDepartamentoNacTitularImplementation(request, true);
    }

    /*
     * Implements service InsDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDepartamentoNacTitularImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoNacTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoInsDepartamentoNacTitularpthisDepartamento = request.getDepartamentoInsDepartamentoNacTitularpthisDepartamentoInstance();
        Titular departamentoInsDepartamentoNacTitularpevcTitular = request.getDepartamentoInsDepartamentoNacTitularpevcTitularInstance();

        request.checkArguments();
        Departamento instance = departamentoInsDepartamentoNacTitularpthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.titular.siu.InsDepartamentoNacTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.titular.siu.InsDepartamentoNacTitularRequest();
            relatedRequest.setTitularInsDepartamentoNacTitularpthisTitularInstance(departamentoInsDepartamentoNacTitularpevcTitular);
            relatedRequest.setTitularInsDepartamentoNacTitularpevcDepartamentoInstance(departamentoInsDepartamentoNacTitularpthisDepartamento);
            titularSrv.insDepartamentoNacTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }

    // Service: DelDepartamentoNacTitular

    /*
     * Entry point for service DelDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDepartamentoNacTitular(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacTitularRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.delDepartamentoNacTitularTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDepartamentoNacTitularTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacTitularRequest request) throws ModelException {
        request.setDepartamentoDelDepartamentoNacTitularpthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoDelDepartamentoNacTitularpthisDepartamento()));
        request.setDepartamentoDelDepartamentoNacTitularpevcTitularInstance(titularSrv.getByOIDWithHV(request.getDepartamentoDelDepartamentoNacTitularpevcTitular()));
        return departamentoSrv.delDepartamentoNacTitularImplementation(request, true);
    }

    /*
     * Implements service DelDepartamentoNacTitular
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDepartamentoNacTitularImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoNacTitularRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoDelDepartamentoNacTitularpthisDepartamento = request.getDepartamentoDelDepartamentoNacTitularpthisDepartamentoInstance();
        Titular departamentoDelDepartamentoNacTitularpevcTitular = request.getDepartamentoDelDepartamentoNacTitularpevcTitularInstance();

        request.checkArguments();
        Departamento instance = departamentoDelDepartamentoNacTitularpthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.titular.siu.DelDepartamentoNacTitularRequest relatedRequest = new com.keralty.aepersonas.viewmodel.titular.siu.DelDepartamentoNacTitularRequest();
            relatedRequest.setTitularDelDepartamentoNacTitularpthisTitularInstance(departamentoDelDepartamentoNacTitularpevcTitular);
            relatedRequest.setTitularDelDepartamentoNacTitularpevcDepartamentoInstance(departamentoDelDepartamentoNacTitularpthisDepartamento);
            titularSrv.delDepartamentoNacTitularImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }

    // Service: InsDepartamentoRes

    /*
     * Entry point for service InsDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse insDepartamentoRes(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoResRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.insDepartamentoResTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service InsDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse insDepartamentoResTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoResRequest request) throws ModelException {
        request.setDepartamentoInsDepartamentoRespthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoInsDepartamentoRespthisDepartamento()));
        request.setDepartamentoInsDepartamentoRespevcContratanteInstance(contratanteSrv.getByOIDWithHV(request.getDepartamentoInsDepartamentoRespevcContratante()));
        return departamentoSrv.insDepartamentoResImplementation(request, true);
    }

    /*
     * Implements service InsDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse insDepartamentoResImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.InsDepartamentoResRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoInsDepartamentoRespthisDepartamento = request.getDepartamentoInsDepartamentoRespthisDepartamentoInstance();
        Contratante departamentoInsDepartamentoRespevcContratante = request.getDepartamentoInsDepartamentoRespevcContratanteInstance();

        request.checkArguments();
        Departamento instance = departamentoInsDepartamentoRespthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoResRequest relatedRequest = new com.keralty.aepersonas.viewmodel.contratante.siu.InsDepartamentoResRequest();
            relatedRequest.setContratanteInsDepartamentoRespthisContratanteInstance(departamentoInsDepartamentoRespevcContratante);
            relatedRequest.setContratanteInsDepartamentoRespevcDepartamentoInstance(departamentoInsDepartamentoRespthisDepartamento);
            contratanteSrv.insDepartamentoResImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }

    // Service: DelDepartamentoRes

    /*
     * Entry point for service DelDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse delDepartamentoRes(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoResRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = departamentoSrv.delDepartamentoResTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for service DelDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @returns Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse delDepartamentoResTxn(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoResRequest request) throws ModelException {
        request.setDepartamentoDelDepartamentoRespthisDepartamentoInstance(departamentoSrv.getByOIDWithHV(request.getDepartamentoDelDepartamentoRespthisDepartamento()));
        request.setDepartamentoDelDepartamentoRespevcContratanteInstance(contratanteSrv.getByOIDWithHV(request.getDepartamentoDelDepartamentoRespevcContratante()));
        return departamentoSrv.delDepartamentoResImplementation(request, true);
    }

    /*
     * Implements service DelDepartamentoRes
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse delDepartamentoResImplementation(
            com.keralty.aepersonas.viewmodel.departamento.siu.DelDepartamentoResRequest request, boolean isEntryPoint) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Departamento departamentoDelDepartamentoRespthisDepartamento = request.getDepartamentoDelDepartamentoRespthisDepartamentoInstance();
        Contratante departamentoDelDepartamentoRespevcContratante = request.getDepartamentoDelDepartamentoRespevcContratanteInstance();

        request.checkArguments();
        Departamento instance = departamentoDelDepartamentoRespthisDepartamento;

        if (isEntryPoint) {
            com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoResRequest relatedRequest = new com.keralty.aepersonas.viewmodel.contratante.siu.DelDepartamentoResRequest();
            relatedRequest.setContratanteDelDepartamentoRespthisContratanteInstance(departamentoDelDepartamentoRespevcContratante);
            relatedRequest.setContratanteDelDepartamentoRespevcDepartamentoInstance(departamentoDelDepartamentoRespthisDepartamento);
            contratanteSrv.delDepartamentoResImplementation(relatedRequest, false);
        }


        response.setInstance(repository.save(instance));
        response.setInstanceSuppInfo(instance.buildICDepartamento());

        return response;
    }


    private void suppInfo4ICDepartamento(String searchText, SQLSelect select) {
        try {
            SQLWhereDisjunction disjunction = new SQLWhereDisjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(select);
            comparison1.setOperator("LIKE");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(DepartamentoConstants.ATTR_NAME_DEPARTAMENTODESCRIPCION, Constants.Type.STRING.getTypeName()));
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
        applyOCOCDepartamento(queryRequest, select);
        applyDSItemSort(queryRequest, select);
        applyDefaultOrderCriteria(queryRequest, select);
    }

    private void applyDefaultOrderCriteria(QueryRequest queryRequest, SQLSelect select) {
        if (queryRequest.getOrderCriteriaName() != null && !queryRequest.getOrderCriteriaName().isBlank())
            return;
        if (queryRequest.getDsItemSort() != null && !queryRequest.getDsItemSort().isBlank())
            return;
        select.getOrderByPart().addItem(Constants.normalizePath(DepartamentoConstants.CLASS_NAME, DepartamentoConstants.ATTR_FIELD_DEPARTAMENTOCODIGO, false), true);
    }


    private void applyOCOCDepartamento(QueryRequest queryRequest, SQLSelect select) {
        if ("OC_Departamento".equalsIgnoreCase(queryRequest.getOrderCriteriaName())) {
            select.getOrderByPart().addItem(Constants.normalizePath(DepartamentoConstants.CLASS_NAME, DepartamentoConstants.ATTR_NAME_DEPARTAMENTODESCRIPCION, false), true);
        }
    }
    
    @Override
    protected AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty()) {
            relatedInstance = buildDepartamentoRelatedInstance(relatedInstanceJsonOid);
        }
        if (DepartamentoConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_MUNICIPIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_CONTRATANTES.equalsIgnoreCase(relatedInstancePathFirstItem) || DepartamentoConstants.ROLE_NAME_CONTRATANTESRES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_TITULARES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private AbstractAppEntity buildDepartamentoRelatedInstance(String relatedInstanceJsonOid) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		return new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildDepartamentoRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildDepartamentoRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildDepartamentoRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildDepartamentoRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildDepartamentoRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    private AbstractAppEntity buildDepartamentoRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
    	try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
    	} catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            throw new SystemException(e.getMessage());
    	}
    }

    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            DepartamentoOid oid = new DepartamentoOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(DepartamentoConstants.ATTR_FIELD_DEPARTAMENTOCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getDepartamentoCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(DepartamentoService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
