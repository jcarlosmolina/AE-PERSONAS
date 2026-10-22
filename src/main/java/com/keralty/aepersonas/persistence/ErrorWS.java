package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ErrorWSConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.ErrorWSOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>ErrorWS</code> model class.
 * <p>
 * Model Class: <code>ErrorWS</code><br>
 */
@Entity(name = ErrorWSConstants.CLASS_NAME)
@Table(name = ErrorWSConstants.TBL_NAME)
public class ErrorWS extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ErrorWS_Sequence")
    @SequenceGenerator(name="ErrorWS_Sequence", sequenceName="ErrorWS_Sequence", allocationSize=1)
    @Column(name = ErrorWSConstants.FLD_ERRORWSIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long errorWSIdentificador;

    /** Class member attribute. */
    @Column(name = ErrorWSConstants.FLD_ERRORWSDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String errorWSDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedErrorWSDescripcion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ErrorWSConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=SolicitudConstants.FLD_AESOLICITUDESIDSOLICITUD)
    })
    @JsonIgnore
    private Solicitud solicitud;
    /** Related attribute. */
    @Column(name = ErrorWSConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
    private Long aesolicitudesidsolicitud;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitud;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ErrorWS() {
        errorWSIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ErrorWS</code>.
     * @param oid Object Identifier of the instance of <code>ErrorWS</code> to be created.
     * @throws SystemException
     */
    public ErrorWS(ErrorWSOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            errorWSIdentificador = oid.getErrorWSIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>errorWSIdentificador</code> attribute<br>in class <code>ErrorWS</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ErrorWS</code>
     * @return The value of the <code>errorWSIdentificador</code> attribute<br>in class <code>ErrorWS</code>.
     */
    public Long getErrorWSIdentificador() {
        return errorWSIdentificador;
    }

    /**
     * Sets the value of the <code>errorWSIdentificador</code> attribute<br>in class <code>ErrorWS</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ErrorWS</code>
     * @param errorWSIdentificador The new value of the <code>errorWSIdentificador</code> attribute<br>in class <code>ErrorWS</code>.
     */
    public void setErrorWSIdentificador(Long errorWSIdentificador) {
        this.errorWSIdentificador = errorWSIdentificador;
    }

   /**
    * Returns the value of the <code>errorWSDescripcion</code> attribute.<br>
    * Model Attribute: <code>errorWSDescripcion</code>. Constant String Size=999<br>
    * Comments: <br>
    * @return The value of the <code>errorWSDescripcion</code> attribute.
    */

    public String getErrorWSDescripcion()  {
    	String value;
        value =  errorWSDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>errorWSDescripcion</code> attribute.<br>
    * Model Attribute: <code>errorWSDescripcion</code>. Constant String Size=999<br>
    * Comments: <br>
    * @param errorWSDescripcion The new value of the <code>errorWSDescripcion</code> attribute.
    */
    public void setErrorWSDescripcion (String errorWSDescripcion) {
        modifiedErrorWSDescripcion = true;
        this.errorWSDescripcion = errorWSDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedErrorWSDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedErrorWSDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedErrorWSDescripcion() {
        return modifiedErrorWSDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedErrorWSDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedErrorWSDescripcion</code>.
    */
    public void setModifiedErrorWSDescripcion(boolean modified) {
        this.modifiedErrorWSDescripcion = modified;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitud 1:1  ------ 0:M  ErroresWS [ErrorWS]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * @param solicitud The instance to add to the <code>Solicitud</code> role.
     */
    public void add2Solicitud(Solicitud solicitud) {
        if (solicitud == null || solicitud.isNull()) {
            this.modifiedSolicitud = true;
            this.aesolicitudesidsolicitud = null;
        } else {
            this.aesolicitudesidsolicitud = solicitud.getAesolicitudesidsolicitud();
        }
        this.solicitud = (solicitud == null  || solicitud.isNull() ? null : solicitud);
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitud</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitud</code> has been modified.
    */
    public boolean isModifiedSolicitud(){
        return modifiedSolicitud;
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
        errorWSDescripcion = "";
        solicitud = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ErrorWS.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ErrorWSConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedErrorWSDescripcion = false;
    	values.put("errorWSDescripcion", getErrorWSDescripcion());
    	modifiedSolicitud = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ErrorWSOid</code> object that identifies this instance of <code>ErrorWS</code>.
     * @return <code>ErrorWSOid </code> object that identifies this instance of <code>ErrorWS</code>
     */
	@Override
    public ErrorWSOid getOid() {
        return new ErrorWSOid(getErrorWSIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ErrorWSConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ErrorWSConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.ERRORWS)) {
            // Add this class
            activeFacets.add(Constants.ERRORWS);
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
            Solicitud.Agente = agent OR Solicitud.Agente.CodJefe = Agent.Usuario
            */
            try {
                if (this.getSolicitud().getAgente().equalsObject(agentInstance) || (this.getSolicitud().getAgente().getFuncionarioCodJefe()).equals(agentInstance.getFuncionarioUsuario())) {
                    returnValue = true;
                }
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            	returnValue = false;
            }
        }
        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildErrorWSRelatedInstance(relatedInstanceJsonOid);
        }
        if (ErrorWSConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildErrorWSRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildErrorWSRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ErrorWS(mapper.readValue(relatedInstanceJsonOid, ErrorWSOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ErrorWS.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildErrorWSRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ErrorWS.class).error(e.getMessage());
            return null;
        }
    }
}
