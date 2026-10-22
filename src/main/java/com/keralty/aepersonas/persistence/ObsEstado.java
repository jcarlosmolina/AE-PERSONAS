package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DocumentoGConstants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.ObsEstadoConstants;
import com.keralty.aepersonas.persistence.oid.DocumentoGOid;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.ObsEstadoOid;
import com.keralty.aepersonas.repository.DocumentoGJpaRepository;
import com.keralty.aepersonas.repository.FuncionarioJpaRepository;
import com.keralty.aepersonas.utils.Utilities;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>ObsEstado</code> model class.
 * <p>
 * Model Class: <code>ObsEstado</code><br>
 */
@Entity(name = ObsEstadoConstants.CLASS_NAME)
@Table(name = ObsEstadoConstants.TBL_NAME)
public class ObsEstado extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient DocumentoGJpaRepository documentoGRepository;

    @JsonIgnore
    private transient FuncionarioJpaRepository funcionarioRepository;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private ObsEstadoOid oid;

    /** Class identification function. */
    @Column(name = ObsEstadoConstants.FLD_DOCUMENTOGIDENTIFICADOR, insertable = false, updatable = false )
    @JsonProperty(value="identificador")
    private Long documentoGIdentificador;

    /** Class identification function. */
    @Column(name = ObsEstadoConstants.FLD_OBSESTADOID, insertable = false, updatable = false )
    @JsonProperty(value="id")
    private Long obsEstadoId;

    /** Class member attribute. */
    @Column(name = ObsEstadoConstants.FLD_OBSESTADOOBSERVACIONS )
    @JsonProperty(value="observacions")
    private String obsEstadoObservacions;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedObsEstadoObservacions;

    /** Class member attribute. */
    @Column(name = ObsEstadoConstants.FLD_OBSESTADOESTADOANTERIOR )
    @JsonProperty(value="estadoanterior")
    private Long obsEstadoEstadoAnterior;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedObsEstadoEstadoAnterior;

    /** Class member attribute. */
    @Column(name = ObsEstadoConstants.FLD_OBSESTADOESTADONUEVO )
    @JsonProperty(value="estadonuevo")
    private Long obsEstadoEstadoNuevo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedObsEstadoEstadoNuevo;

    /** Class member attribute. */
    @Column(name = ObsEstadoConstants.FLD_OBSESTADOFECHA )
    @JsonProperty(value="fecha")
    private Timestamp obsEstadoFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedObsEstadoFecha;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ObsEstadoConstants.FLD_DOCUMENTOGIDENTIFICADOR, referencedColumnName=DocumentoGConstants.FLD_DOCUMENTOGIDENTIFICADOR, insertable = false, updatable = false)
    })
    @JsonIgnore
    private DocumentoG documentoG;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoG;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ObsEstadoConstants.FLD_FUNCIONARIOAGENTEID, referencedColumnName=FuncionarioConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Funcionario agente;
    /** Related attribute. */
    @Column(name = ObsEstadoConstants.FLD_FUNCIONARIOAGENTEID, insertable = false, updatable = false)
    private Long funcionarioAgenteId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAgente;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ObsEstado() {
        documentoGIdentificador = null;
        obsEstadoId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ObsEstado</code>.
     * @param oid Object Identifier of the instance of <code>ObsEstado</code> to be created.
     * @throws SystemException
     */
    public ObsEstado(ObsEstadoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            documentoGIdentificador = oid.getDocumentoGIdentificador();
            obsEstadoId = oid.getObsEstadoId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>documentoGIdentificador</code> attribute<br>in class <code>DocumentoG</code> through <code>DocumentoG</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DocumentoG</code>
     * @return The value of the <code>documentoGIdentificador</code> attribute<br>in class <code>DocumentoG</code> through <code>DocumentoG</code>.
     */
    public Long getDocumentoGIdentificador() {
        return (documentoG != null ? documentoG.getDocumentoGIdentificador() : documentoGIdentificador);
    }

    /**
     * Sets the value of the <code>documentoGIdentificador</code> attribute<br>in class <code>DocumentoG</code> through <code>DocumentoG</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DocumentoG</code>
     * @param documentoGIdentificador The new value of the <code>documentoGIdentificador</code> attribute<br>in class <code>DocumentoG</code> through <code>DocumentoG</code>.
     */
    public void setDocumentoGIdentificador(Long documentoGIdentificador) {
        this.documentoGIdentificador = documentoGIdentificador;
    }

    /**
     * Returns the value of the <code>obsEstadoId</code> attribute<br>in class <code>ObsEstado</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ObsEstado</code>
     * @return The value of the <code>obsEstadoId</code> attribute<br>in class <code>ObsEstado</code>.
     */
    public Long getObsEstadoId() {
        return obsEstadoId;
    }

    /**
     * Sets the value of the <code>obsEstadoId</code> attribute<br>in class <code>ObsEstado</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ObsEstado</code>
     * @param obsEstadoId The new value of the <code>obsEstadoId</code> attribute<br>in class <code>ObsEstado</code>.
     */
    public void setObsEstadoId(Long obsEstadoId) {
        this.obsEstadoId = obsEstadoId;
    }

   /**
    * Returns the value of the <code>obsEstadoObservacions</code> attribute.<br>
    * Model Attribute: <code>obsEstadoObservacions</code>. Variable String Size=999<br>
    * Comments: <br>
    * @return The value of the <code>obsEstadoObservacions</code> attribute.
    */

    public String getObsEstadoObservacions()  {
    	String value;
        value =  obsEstadoObservacions;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>obsEstadoObservacions</code> attribute.<br>
    * Model Attribute: <code>obsEstadoObservacions</code>. Variable String Size=999<br>
    * Comments: <br>
    * @param obsEstadoObservacions The new value of the <code>obsEstadoObservacions</code> attribute.
    */
    public void setObsEstadoObservacions (String obsEstadoObservacions) {
        modifiedObsEstadoObservacions = true;
        this.obsEstadoObservacions = obsEstadoObservacions;
    }

   /**
    * Returns the value of the <code>modifiedObsEstadoObservacions</code> class property.<br>
    *
    * @return The value of the <code>modifiedObsEstadoObservacions</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedObsEstadoObservacions() {
        return modifiedObsEstadoObservacions;
    }

   /**
    * Sets the value of the <code>modifiedObsEstadoObservacions</code> class property.<br>
    * @param modified The new value of the <code>modifiedObsEstadoObservacions</code>.
    */
    public void setModifiedObsEstadoObservacions(boolean modified) {
        this.modifiedObsEstadoObservacions = modified;
    }

   /**
    * Returns the value of the <code>obsEstadoEstadoAnterior</code> attribute.<br>
    * Model Attribute: <code>obsEstadoEstadoAnterior</code>. Constant Nat<br>
    * Comments: El estado en que estaba el documento antes del cambio<br>
    * @return The value of the <code>obsEstadoEstadoAnterior</code> attribute.
    */

    public Long getObsEstadoEstadoAnterior()  {
    	Long value;
        value =  obsEstadoEstadoAnterior;
        return value;
    }

   /**
    * Sets the value of the <code>obsEstadoEstadoAnterior</code> attribute.<br>
    * Model Attribute: <code>obsEstadoEstadoAnterior</code>. Constant Nat<br>
    * Comments: El estado en que estaba el documento antes del cambio<br>
    * @param obsEstadoEstadoAnterior The new value of the <code>obsEstadoEstadoAnterior</code> attribute.
    */
    public void setObsEstadoEstadoAnterior (Long obsEstadoEstadoAnterior) {
        modifiedObsEstadoEstadoAnterior = true;
        this.obsEstadoEstadoAnterior = obsEstadoEstadoAnterior;
    }

   /**
    * Returns the value of the <code>modifiedObsEstadoEstadoAnterior</code> class property.<br>
    *
    * @return The value of the <code>modifiedObsEstadoEstadoAnterior</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedObsEstadoEstadoAnterior() {
        return modifiedObsEstadoEstadoAnterior;
    }

   /**
    * Sets the value of the <code>modifiedObsEstadoEstadoAnterior</code> class property.<br>
    * @param modified The new value of the <code>modifiedObsEstadoEstadoAnterior</code>.
    */
    public void setModifiedObsEstadoEstadoAnterior(boolean modified) {
        this.modifiedObsEstadoEstadoAnterior = modified;
    }

   /**
    * Returns the value of the <code>obsEstadoEstadoNuevo</code> attribute.<br>
    * Model Attribute: <code>obsEstadoEstadoNuevo</code>. Constant Nat<br>
    * Comments: El estado en que queda el documento tras del cambio<br>
    * @return The value of the <code>obsEstadoEstadoNuevo</code> attribute.
    */

    public Long getObsEstadoEstadoNuevo()  {
    	Long value;
        value =  obsEstadoEstadoNuevo;
        return value;
    }

   /**
    * Sets the value of the <code>obsEstadoEstadoNuevo</code> attribute.<br>
    * Model Attribute: <code>obsEstadoEstadoNuevo</code>. Constant Nat<br>
    * Comments: El estado en que queda el documento tras del cambio<br>
    * @param obsEstadoEstadoNuevo The new value of the <code>obsEstadoEstadoNuevo</code> attribute.
    */
    public void setObsEstadoEstadoNuevo (Long obsEstadoEstadoNuevo) {
        modifiedObsEstadoEstadoNuevo = true;
        this.obsEstadoEstadoNuevo = obsEstadoEstadoNuevo;
    }

   /**
    * Returns the value of the <code>modifiedObsEstadoEstadoNuevo</code> class property.<br>
    *
    * @return The value of the <code>modifiedObsEstadoEstadoNuevo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedObsEstadoEstadoNuevo() {
        return modifiedObsEstadoEstadoNuevo;
    }

   /**
    * Sets the value of the <code>modifiedObsEstadoEstadoNuevo</code> class property.<br>
    * @param modified The new value of the <code>modifiedObsEstadoEstadoNuevo</code>.
    */
    public void setModifiedObsEstadoEstadoNuevo(boolean modified) {
        this.modifiedObsEstadoEstadoNuevo = modified;
    }

   /**
    * Returns the value of the <code>obsEstadoFecha</code> attribute.<br>
    * Model Attribute: <code>obsEstadoFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>obsEstadoFecha</code> attribute.
    */

    public Timestamp getObsEstadoFecha()  {
    	Timestamp value;
        value =  obsEstadoFecha;
        return value;
    }

   /**
    * Sets the value of the <code>obsEstadoFecha</code> attribute.<br>
    * Model Attribute: <code>obsEstadoFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param obsEstadoFecha The new value of the <code>obsEstadoFecha</code> attribute.
    */
    public void setObsEstadoFecha (Timestamp obsEstadoFecha) {
        modifiedObsEstadoFecha = true;
        this.obsEstadoFecha = obsEstadoFecha;
    }

   /**
    * Returns the value of the <code>modifiedObsEstadoFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedObsEstadoFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedObsEstadoFecha() {
        return modifiedObsEstadoFecha;
    }

   /**
    * Sets the value of the <code>modifiedObsEstadoFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedObsEstadoFecha</code>.
    */
    public void setModifiedObsEstadoFecha(boolean modified) {
        this.modifiedObsEstadoFecha = modified;
    }

    /**
     * Returns the instance of <code>DocumentoG</code> related through the <code>DocumentoG</code> role.
     * Model Relationship:
     * <code>[DocumentoG] DocumentoG 1:1  ------ 0:M  ObsEstado [ObsEstado]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DocumentoG</code> related through the <code>DocumentoG</code> role.
     */
    @JsonIgnore
    public DocumentoG getDocumentoG() {
        try {
            if (documentoG != null && documentoG.isNull()) {
                documentoG = null;
            }
        } catch (Exception ex) {
            documentoG = null;
        }
        if (documentoG == null) {
            if (documentoGIdentificador != null) {
                documentoG = getDocumentoGRepository().findById(documentoGIdentificador).orElse(null);
            } else {
                documentoG = null;
            }
        }
        return (documentoG == null ? new DocumentoG(null) : documentoG);
    }

    /**
     * Adds an instance of <code>DocumentoG</code> related through the <code>DocumentoG</code> role.
     * @param documentoG The instance to add to the <code>DocumentoG</code> role.
     */
    public void add2DocumentoG(DocumentoG documentoG) {
        if (documentoG == null || documentoG.isNull()) {
            this.modifiedDocumentoG = true;
            this.documentoGIdentificador = null;
        } else {
            this.documentoGIdentificador = documentoG.getDocumentoGIdentificador();
        }
        this.documentoG = (documentoG == null  || documentoG.isNull() ? null : documentoG);
    }

   /**
    * This method gets the attribute value <code>modifiedDocumentoG</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDocumentoG</code> has been modified.
    */
    public boolean isModifiedDocumentoG(){
        return modifiedDocumentoG;
    }

    /**
     * Returns the instance of <code>Funcionario</code> related through the <code>Agente</code> role.
     * Model Relationship:
     * <code>[Funcionario] Agente 1:1  ------ 0:M  ObsEstado [ObsEstado]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Funcionario</code> related through the <code>Agente</code> role.
     */
    @JsonIgnore
    public Funcionario getAgente() {
        try {
            if (agente != null && agente.isNull()) {
                agente = null;
            }
        } catch (Exception ex) {
            agente = null;
        }
        if (agente == null) {
            if (funcionarioAgenteId != null) {
                agente = getFuncionarioRepository().findById(funcionarioAgenteId).orElse(null);
            } else {
                agente = null;
            }
        }
        return (agente == null ? new Funcionario(null) : agente);
    }

    /**
     * Adds an instance of <code>Funcionario</code> related through the <code>Agente</code> role.
     * @param agente The instance to add to the <code>Agente</code> role.
     */
    public void add2Agente(Funcionario agente) {
        if (agente == null || agente.isNull()) {
            this.modifiedAgente = true;
            this.funcionarioAgenteId = null;
        } else {
            this.funcionarioAgenteId = agente.getFuncionarioId();
        }
        this.agente = (agente == null  || agente.isNull() ? null : agente);
    }

   /**
    * This method gets the attribute value <code>modifiedAgente</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAgente</code> has been modified.
    */
    public boolean isModifiedAgente(){
        return modifiedAgente;
    }

    /**
     * Returns a Map with the values of the attributes.
     * @return Map with the values of the attributes.
     */
    @JsonIgnore
	@Override
    public Map<String, Object> getValues() {
        return values;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        obsEstadoObservacions = null;
        obsEstadoEstadoAnterior = Long.valueOf(0);
        obsEstadoEstadoNuevo = Long.valueOf(0);
        obsEstadoFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        documentoG = null;
        agente = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public DocumentoGJpaRepository getDocumentoGRepository() {
        return Arc.container().select(DocumentoGJpaRepository.class).get();
    }
    public FuncionarioJpaRepository getFuncionarioRepository() {
        return Arc.container().select(FuncionarioJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return ObsEstado.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ObsEstadoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }

    /**
     * Returns the data type of the <code>attribute</code> defined in <code>role</code>.
     * @param role the owner class of the attribute.
     * @param attribute the attribute name whose data type name is to be returned.
     * @return the data type name of the given attribute or null if the attribute does not exist.
     */
    @Override
    public String getAttributeTypeRelated(String role, String attribute) {
        String returnedType = "";
        return returnedType;
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedObsEstadoObservacions = false;
    	values.put("obsEstadoObservacions", getObsEstadoObservacions());
    	modifiedObsEstadoEstadoAnterior = false;
    	values.put("obsEstadoEstadoAnterior", getObsEstadoEstadoAnterior());
    	modifiedObsEstadoEstadoNuevo = false;
    	values.put("obsEstadoEstadoNuevo", getObsEstadoEstadoNuevo());
    	modifiedObsEstadoFecha = false;
    	values.put("obsEstadoFecha", getObsEstadoFecha());
    	modifiedDocumentoG = false;
    	modifiedAgente = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ObsEstadoOid</code> object that identifies this instance of <code>ObsEstado</code>.
     * @return <code>ObsEstadoOid </code> object that identifies this instance of <code>ObsEstado</code>
     */
	@Override
    public ObsEstadoOid getOid() {
        return new ObsEstadoOid(getDocumentoGIdentificador(), getObsEstadoId());
    }

    /**
     * Sets the <code>ObsEstadoOid</code> object that identifies this instance of <code>ObsEstado</code>.
     */    
    public void setOid(ObsEstadoOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ObsEstadoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ObsEstadoConstants.ROLE_AGENTS.get(item.toUpperCase()));
    }

    /**
     * Gets the list of active facets.
     * @return the list of active facets.
     */
    @JsonIgnore
	@Override
    public List<String> getActiveFacets() {
        return this.getFacets();
    }

     /**
     * Gets the list of active facets recursively from the root of the inheritance net.
     * @return the list of active facets.
     */
    @JsonIgnore
    public List<String> getFacets() {
        List<String> activeFacets = new ArrayList<>();

        if (!activeFacets.contains(Constants.OBSESTADO)) {
            // Add this class
            activeFacets.add(Constants.OBSESTADO);
        }
        return activeFacets;
    }

    /**
     * Returns true if this instance can be observed by the connected agent.
     * @param agent Connected agent instance
     * @return TRUE if the connected agent can observe this instance. FALSE otherwise.
     */
    @Override
    public boolean checkHorizontalVisibility(IEntity agent) {
        boolean returnValue = (!this.isNull());

        if (agent == null) return returnValue;


        if (getAgent().isFacetActive(Constants.AGENT_ASESOR)) {
            Asesor agentInstance = (Asesor) getAgent().getAgentInstance(Constants.ASESOR);

            // Check the HV formula.
            /* 
            DocumentoG.Solicitud.Agente = agent OR DocumentoG.Solicitud.Agente.CodJefe = Agent.Usuario
            */
            try {
                if (Utilities.isEqual(this.getDocumentoG().getSolicitud().getAgente(), agentInstance) || (this.getDocumentoG().getSolicitud().getAgente().getFuncionarioCodJefe()).equals(agentInstance.getFuncionarioUsuario())) {
                    returnValue = true;
                }
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            	returnValue = false;
            }
        }
        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
            returnValue = true;
        }
        return returnValue;
    }

    /**
     * Checks Integrity Constraints defined in the class this entity is an instance of.
     * <p>
     * Raises an exception whenever an Integrity Constraint does not hold.
     * @throws IntegrityConstraintException if an integrity constraint isn't fulfilled.
     * @throws SystemException if there is any error on having checked integrity constraints.
     */
	@Override
    public void checkIntegrityConstraints() throws IntegrityConstraintException, SystemException {
        /* There are no Integrity Constraints defined in this class */
    }

    public String buildDSObsEstadoPIU() {
        try {
            return (getObsEstadoFecha() != null ? getObsEstadoFecha().toString() : "") + " " + (getObsEstadoEstadoAnterior() != null ? getObsEstadoEstadoAnterior().toString() : "") + " " + (getObsEstadoEstadoNuevo() != null ? getObsEstadoEstadoNuevo().toString() : "") + " " + getAgente().getFuncionariodrvNombreCompleto() + " " + getObsEstadoObservacions();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSObsEstadoNull() {
        try {
            return (getObsEstadoId() != null ? getObsEstadoId().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public static AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstanceJsonOid != null && relatedInstancePath != null) {
            List<String> relatedInstancePathItems = new ArrayList<>(Arrays.asList(relatedInstancePath.split("\\.")));
            String pathItem = relatedInstancePathItems.remove(0);
            String remainingPath = String.join(".", relatedInstancePathItems);
            relatedInstance = buildRelatedInstance(relatedInstanceJsonOid, pathItem, remainingPath);
        }
        return relatedInstance;
    }

    private static AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty() && remainingPath.isEmpty()) {
            relatedInstance = buildObsEstadoRelatedInstance(relatedInstanceJsonOid);
        }
        if (ObsEstadoConstants.ROLE_NAME_DOCUMENTOG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildObsEstadoRelatedInstance4DocumentoG(relatedInstanceJsonOid, remainingPath);
        }
        if (ObsEstadoConstants.ROLE_NAME_AGENTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildObsEstadoRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildObsEstadoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ObsEstado(mapper.readValue(relatedInstanceJsonOid, ObsEstadoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObsEstado.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildObsEstadoRelatedInstance4DocumentoG(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoG(mapper.readValue(relatedInstanceJsonOid, DocumentoGOid.class)): DocumentoG.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObsEstado.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildObsEstadoRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObsEstado.class).error(e.getMessage());
            return null;
        }
    }
}
