package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.PreexistenciaCConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PreexistenciaCOid;
import com.keralty.aepersonas.service.PersonaCService;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.microprofile.rest.client.inject.RestClient;
/**
 * Persistent representation of the <code>PreexistenciaC</code> model class.
 * <p>
 * Model Class: <code>PreexistenciaC</code><br>
 */
@Entity(name = PreexistenciaCConstants.CLASS_NAME)
@Table(name = PreexistenciaCConstants.TBL_NAME)
public class PreexistenciaC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @RestClient
    private transient PersonaCService personaCService;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private PreexistenciaCOid oid;

    /** Class identification function. */
    @Column(name = PreexistenciaCConstants.FLD_PERSONACID, insertable = false, updatable = false )
    @JsonProperty(value="id")
    private Long personaCID;

    /** Class identification function. */
    @Column(name = PreexistenciaCConstants.FLD_PREEXISTENCIACIDENTIFICADOR, insertable = false, updatable = false )
    @JsonProperty(value="identificador")
    private Long preexistenciaCIdentificador;

    /** Class member attribute. */
    @Column(name = PreexistenciaCConstants.FLD_PREEXISTENCIACDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String preexistenciaCDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreexistenciaCDescripcion;

    /** Class member attribute. */
    @Column(name = PreexistenciaCConstants.FLD_PREEXISTENCIACFECINICIO )
    @JsonProperty(value="fecinicio")
    private Date preexistenciaCFecInicio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreexistenciaCFecInicio;

    /** Class member attribute. */
    @Column(name = PreexistenciaCConstants.FLD_PREEXISTENCIACFECFIN )
    @JsonProperty(value="fecfin")
    private Date preexistenciaCFecFin;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreexistenciaCFecFin;

    /** Class member attribute. */
    @Column(name = PreexistenciaCConstants.FLD_PREEXISTENCIACOBSERVACION )
    @JsonProperty(value="observacion")
    private String preexistenciaCObservacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreexistenciaCObservacion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PreexistenciaCConstants.FLD_PERSONACID, referencedColumnName=PersonaCConstants.FLD_PERSONACID, insertable = false, updatable = false)
    })
    @JsonIgnore
    private PersonaC personaC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public PreexistenciaC() {
        personaCID = null;
        preexistenciaCIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>PreexistenciaC</code>.
     * @param oid Object Identifier of the instance of <code>PreexistenciaC</code> to be created.
     * @throws SystemException
     */
    public PreexistenciaC(PreexistenciaCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            personaCID = oid.getPersonaCID();
            preexistenciaCIdentificador = oid.getPreexistenciaCIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code> through <code>PersonaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PersonaC</code>
     * @return The value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code> through <code>PersonaC</code>.
     */
    public Long getPersonaCID() {
        return (personaC != null ? personaC.getPersonaCID() : personaCID);
    }

    /**
     * Sets the value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code> through <code>PersonaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PersonaC</code>
     * @param personaCID The new value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code> through <code>PersonaC</code>.
     */
    public void setPersonaCID(Long personaCID) {
        this.personaCID = personaCID;
    }

    /**
     * Returns the value of the <code>preexistenciaCIdentificador</code> attribute<br>in class <code>PreexistenciaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PreexistenciaC</code>
     * @return The value of the <code>preexistenciaCIdentificador</code> attribute<br>in class <code>PreexistenciaC</code>.
     */
    public Long getPreexistenciaCIdentificador() {
        return preexistenciaCIdentificador;
    }

    /**
     * Sets the value of the <code>preexistenciaCIdentificador</code> attribute<br>in class <code>PreexistenciaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PreexistenciaC</code>
     * @param preexistenciaCIdentificador The new value of the <code>preexistenciaCIdentificador</code> attribute<br>in class <code>PreexistenciaC</code>.
     */
    public void setPreexistenciaCIdentificador(Long preexistenciaCIdentificador) {
        this.preexistenciaCIdentificador = preexistenciaCIdentificador;
    }

   /**
    * Returns the value of the <code>preexistenciaCDescripcion</code> attribute.<br>
    * Model Attribute: <code>preexistenciaCDescripcion</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>preexistenciaCDescripcion</code> attribute.
    */

    public String getPreexistenciaCDescripcion()  {
    	String value;
        value =  preexistenciaCDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>preexistenciaCDescripcion</code> attribute.<br>
    * Model Attribute: <code>preexistenciaCDescripcion</code>. Variable String Size=200<br>
    * Comments: <br>
    * @param preexistenciaCDescripcion The new value of the <code>preexistenciaCDescripcion</code> attribute.
    */
    public void setPreexistenciaCDescripcion (String preexistenciaCDescripcion) {
        modifiedPreexistenciaCDescripcion = true;
        this.preexistenciaCDescripcion = preexistenciaCDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedPreexistenciaCDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreexistenciaCDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreexistenciaCDescripcion() {
        return modifiedPreexistenciaCDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedPreexistenciaCDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreexistenciaCDescripcion</code>.
    */
    public void setModifiedPreexistenciaCDescripcion(boolean modified) {
        this.modifiedPreexistenciaCDescripcion = modified;
    }

   /**
    * Returns the value of the <code>preexistenciaCFecInicio</code> attribute.<br>
    * Model Attribute: <code>preexistenciaCFecInicio</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>preexistenciaCFecInicio</code> attribute.
    */

    public Date getPreexistenciaCFecInicio()  {
    	Date value;
        value =  preexistenciaCFecInicio;
        return value;
    }

   /**
    * Sets the value of the <code>preexistenciaCFecInicio</code> attribute.<br>
    * Model Attribute: <code>preexistenciaCFecInicio</code>. Variable Date<br>
    * Comments: <br>
    * @param preexistenciaCFecInicio The new value of the <code>preexistenciaCFecInicio</code> attribute.
    */
    public void setPreexistenciaCFecInicio (Date preexistenciaCFecInicio) {
        modifiedPreexistenciaCFecInicio = true;
        this.preexistenciaCFecInicio = preexistenciaCFecInicio;
    }

   /**
    * Returns the value of the <code>modifiedPreexistenciaCFecInicio</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreexistenciaCFecInicio</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreexistenciaCFecInicio() {
        return modifiedPreexistenciaCFecInicio;
    }

   /**
    * Sets the value of the <code>modifiedPreexistenciaCFecInicio</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreexistenciaCFecInicio</code>.
    */
    public void setModifiedPreexistenciaCFecInicio(boolean modified) {
        this.modifiedPreexistenciaCFecInicio = modified;
    }

   /**
    * Returns the value of the <code>preexistenciaCFecFin</code> attribute.<br>
    * Model Attribute: <code>preexistenciaCFecFin</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>preexistenciaCFecFin</code> attribute.
    */

    public Date getPreexistenciaCFecFin()  {
    	Date value;
        value =  preexistenciaCFecFin;
        return value;
    }

   /**
    * Sets the value of the <code>preexistenciaCFecFin</code> attribute.<br>
    * Model Attribute: <code>preexistenciaCFecFin</code>. Variable Date<br>
    * Comments: <br>
    * @param preexistenciaCFecFin The new value of the <code>preexistenciaCFecFin</code> attribute.
    */
    public void setPreexistenciaCFecFin (Date preexistenciaCFecFin) {
        modifiedPreexistenciaCFecFin = true;
        this.preexistenciaCFecFin = preexistenciaCFecFin;
    }

   /**
    * Returns the value of the <code>modifiedPreexistenciaCFecFin</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreexistenciaCFecFin</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreexistenciaCFecFin() {
        return modifiedPreexistenciaCFecFin;
    }

   /**
    * Sets the value of the <code>modifiedPreexistenciaCFecFin</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreexistenciaCFecFin</code>.
    */
    public void setModifiedPreexistenciaCFecFin(boolean modified) {
        this.modifiedPreexistenciaCFecFin = modified;
    }

   /**
    * Returns the value of the <code>preexistenciaCObservacion</code> attribute.<br>
    * Model Attribute: <code>preexistenciaCObservacion</code>. Variable String Size=500<br>
    * Comments: <br>
    * @return The value of the <code>preexistenciaCObservacion</code> attribute.
    */

    public String getPreexistenciaCObservacion()  {
    	String value;
        value =  preexistenciaCObservacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>preexistenciaCObservacion</code> attribute.<br>
    * Model Attribute: <code>preexistenciaCObservacion</code>. Variable String Size=500<br>
    * Comments: <br>
    * @param preexistenciaCObservacion The new value of the <code>preexistenciaCObservacion</code> attribute.
    */
    public void setPreexistenciaCObservacion (String preexistenciaCObservacion) {
        modifiedPreexistenciaCObservacion = true;
        this.preexistenciaCObservacion = preexistenciaCObservacion;
    }

   /**
    * Returns the value of the <code>modifiedPreexistenciaCObservacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreexistenciaCObservacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreexistenciaCObservacion() {
        return modifiedPreexistenciaCObservacion;
    }

   /**
    * Sets the value of the <code>modifiedPreexistenciaCObservacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreexistenciaCObservacion</code>.
    */
    public void setModifiedPreexistenciaCObservacion(boolean modified) {
        this.modifiedPreexistenciaCObservacion = modified;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonaC 1:1  ------ 0:M  PreexistenciasC [PreexistenciaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     */
    @JsonIgnore
    public PersonaC getPersonaC() {
        return personaC;
    }

    /**
     * Adds an instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     * @param personaC The instance to add to the <code>PersonaC</code> role.
     */
    public void add2PersonaC(PersonaC personaC) {
        if (personaC == null || personaC.isNull()) {
            this.modifiedPersonaC = true;
            this.personaCID = null;
        } else {
            this.personaCID = personaC.getPersonaCID();
        }
        this.personaC = (personaC == null  || personaC.isNull() ? null : personaC);
    }

   /**
    * This method gets the attribute value <code>modifiedPersonaC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPersonaC</code> has been modified.
    */
    public boolean isModifiedPersonaC(){
        return modifiedPersonaC;
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
        preexistenciaCDescripcion = "";
        preexistenciaCFecInicio = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        preexistenciaCFecFin = null;
        preexistenciaCObservacion = null;
        personaC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return PreexistenciaC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PreexistenciaCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPreexistenciaCDescripcion = false;
    	values.put("preexistenciaCDescripcion", getPreexistenciaCDescripcion());
    	modifiedPreexistenciaCFecInicio = false;
    	values.put("preexistenciaCFecInicio", getPreexistenciaCFecInicio());
    	modifiedPreexistenciaCFecFin = false;
    	values.put("preexistenciaCFecFin", getPreexistenciaCFecFin());
    	modifiedPreexistenciaCObservacion = false;
    	values.put("preexistenciaCObservacion", getPreexistenciaCObservacion());
    	modifiedPersonaC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>PreexistenciaCOid</code> object that identifies this instance of <code>PreexistenciaC</code>.
     * @return <code>PreexistenciaCOid </code> object that identifies this instance of <code>PreexistenciaC</code>
     */
	@Override
    public PreexistenciaCOid getOid() {
        return new PreexistenciaCOid(getPersonaCID(), getPreexistenciaCIdentificador());
    }

    /**
     * Sets the <code>PreexistenciaCOid</code> object that identifies this instance of <code>PreexistenciaC</code>.
     */    
    public void setOid(PreexistenciaCOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PreexistenciaCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(PreexistenciaCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PREEXISTENCIAC)) {
            // Add this class
            activeFacets.add(Constants.PREEXISTENCIAC);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildPreexistenciaCRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreexistenciaCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreexistenciaCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPreexistenciaCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PreexistenciaC(mapper.readValue(relatedInstanceJsonOid, PreexistenciaCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreexistenciaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPreexistenciaCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreexistenciaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
