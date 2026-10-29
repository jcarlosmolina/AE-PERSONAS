package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.PregCuesMedCConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PregCuesMedCOid;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.microprofile.rest.client.inject.RestClient;
/**
 * Persistent representation of the <code>PregCuesMedC</code> model class.
 * <p>
 * Model Class: <code>PregCuesMedC</code><br>
 */
@Entity(name = PregCuesMedCConstants.CLASS_NAME)
@Table(name = PregCuesMedCConstants.TBL_NAME)
public class PregCuesMedC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @RestClient
    private transient PersonaCService personaCService;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private PregCuesMedCOid oid;

    /** Class identification function. */
    @Column(name = PregCuesMedCConstants.FLD_PERSONACID, insertable = false, updatable = false )
    @JsonProperty(value="id")
    private Long personaCID;

    /** Class identification function. */
    @Column(name = PregCuesMedCConstants.FLD_PREGCUESMEDCCODPREGUNTA, insertable = false, updatable = false )
    @JsonProperty(value="codpregunta")
    private Long pregCuesMedCCodPregunta;

    /** Class member attribute. */
    @Column(name = PregCuesMedCConstants.FLD_PREGCUESMEDCRPTAPREGUNTA )
    @JsonProperty(value="rptapregunta")
    private Boolean pregCuesMedCRptaPregunta;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPregCuesMedCRptaPregunta;

    /** Class member attribute. */
    @Column(name = PregCuesMedCConstants.FLD_PREGCUESMEDCOBSERVACIONS )
    @JsonProperty(value="observacions")
    private String pregCuesMedCObservacions;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPregCuesMedCObservacions;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PregCuesMedCConstants.FLD_PERSONACID, referencedColumnName=PersonaCConstants.FLD_PERSONACID, insertable = false, updatable = false)
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
    public PregCuesMedC() {
        personaCID = null;
        pregCuesMedCCodPregunta = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>PregCuesMedC</code>.
     * @param oid Object Identifier of the instance of <code>PregCuesMedC</code> to be created.
     * @throws SystemException
     */
    public PregCuesMedC(PregCuesMedCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            personaCID = oid.getPersonaCID();
            pregCuesMedCCodPregunta = oid.getPregCuesMedCCodPregunta();
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
     * Returns the value of the <code>pregCuesMedCCodPregunta</code> attribute<br>in class <code>PregCuesMedC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PregCuesMedC</code>
     * @return The value of the <code>pregCuesMedCCodPregunta</code> attribute<br>in class <code>PregCuesMedC</code>.
     */
    public Long getPregCuesMedCCodPregunta() {
        return pregCuesMedCCodPregunta;
    }

    /**
     * Sets the value of the <code>pregCuesMedCCodPregunta</code> attribute<br>in class <code>PregCuesMedC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PregCuesMedC</code>
     * @param pregCuesMedCCodPregunta The new value of the <code>pregCuesMedCCodPregunta</code> attribute<br>in class <code>PregCuesMedC</code>.
     */
    public void setPregCuesMedCCodPregunta(Long pregCuesMedCCodPregunta) {
        this.pregCuesMedCCodPregunta = pregCuesMedCCodPregunta;
    }

   /**
    * Returns the value of the <code>pregCuesMedCRptaPregunta</code> attribute.<br>
    * Model Attribute: <code>pregCuesMedCRptaPregunta</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>pregCuesMedCRptaPregunta</code> attribute.
    */

    public Boolean getPregCuesMedCRptaPregunta()  {
    	Boolean value;
        value =  pregCuesMedCRptaPregunta;
        return value;
    }

   /**
    * Sets the value of the <code>pregCuesMedCRptaPregunta</code> attribute.<br>
    * Model Attribute: <code>pregCuesMedCRptaPregunta</code>. Variable Bool<br>
    * Comments: <br>
    * @param pregCuesMedCRptaPregunta The new value of the <code>pregCuesMedCRptaPregunta</code> attribute.
    */
    public void setPregCuesMedCRptaPregunta (Boolean pregCuesMedCRptaPregunta) {
        modifiedPregCuesMedCRptaPregunta = true;
        this.pregCuesMedCRptaPregunta = pregCuesMedCRptaPregunta;
    }

   /**
    * Returns the value of the <code>modifiedPregCuesMedCRptaPregunta</code> class property.<br>
    *
    * @return The value of the <code>modifiedPregCuesMedCRptaPregunta</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPregCuesMedCRptaPregunta() {
        return modifiedPregCuesMedCRptaPregunta;
    }

   /**
    * Sets the value of the <code>modifiedPregCuesMedCRptaPregunta</code> class property.<br>
    * @param modified The new value of the <code>modifiedPregCuesMedCRptaPregunta</code>.
    */
    public void setModifiedPregCuesMedCRptaPregunta(boolean modified) {
        this.modifiedPregCuesMedCRptaPregunta = modified;
    }

   /**
    * Returns the value of the <code>pregCuesMedCObservacions</code> attribute.<br>
    * Model Attribute: <code>pregCuesMedCObservacions</code>. Variable String Size=999<br>
    * Comments: Cambiar el tamaño a 2500<br>
    * @return The value of the <code>pregCuesMedCObservacions</code> attribute.
    */

    public String getPregCuesMedCObservacions()  {
    	String value;
        value =  pregCuesMedCObservacions;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>pregCuesMedCObservacions</code> attribute.<br>
    * Model Attribute: <code>pregCuesMedCObservacions</code>. Variable String Size=999<br>
    * Comments: Cambiar el tamaño a 2500<br>
    * @param pregCuesMedCObservacions The new value of the <code>pregCuesMedCObservacions</code> attribute.
    */
    public void setPregCuesMedCObservacions (String pregCuesMedCObservacions) {
        modifiedPregCuesMedCObservacions = true;
        this.pregCuesMedCObservacions = pregCuesMedCObservacions;
    }

   /**
    * Returns the value of the <code>modifiedPregCuesMedCObservacions</code> class property.<br>
    *
    * @return The value of the <code>modifiedPregCuesMedCObservacions</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPregCuesMedCObservacions() {
        return modifiedPregCuesMedCObservacions;
    }

   /**
    * Sets the value of the <code>modifiedPregCuesMedCObservacions</code> class property.<br>
    * @param modified The new value of the <code>modifiedPregCuesMedCObservacions</code>.
    */
    public void setModifiedPregCuesMedCObservacions(boolean modified) {
        this.modifiedPregCuesMedCObservacions = modified;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonaC 1:1  ------ 0:M  PregsCuesMedC [PregCuesMedC]</code>
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
        pregCuesMedCRptaPregunta = false;
        pregCuesMedCObservacions = null;
        personaC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return PregCuesMedC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PregCuesMedCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPregCuesMedCRptaPregunta = false;
    	values.put("pregCuesMedCRptaPregunta", getPregCuesMedCRptaPregunta());
    	modifiedPregCuesMedCObservacions = false;
    	values.put("pregCuesMedCObservacions", getPregCuesMedCObservacions());
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
     * Returns the <code>PregCuesMedCOid</code> object that identifies this instance of <code>PregCuesMedC</code>.
     * @return <code>PregCuesMedCOid </code> object that identifies this instance of <code>PregCuesMedC</code>
     */
	@Override
    public PregCuesMedCOid getOid() {
        return new PregCuesMedCOid(getPersonaCID(), getPregCuesMedCCodPregunta());
    }

    /**
     * Sets the <code>PregCuesMedCOid</code> object that identifies this instance of <code>PregCuesMedC</code>.
     */    
    public void setOid(PregCuesMedCOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PregCuesMedCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(PregCuesMedCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PREGCUESMEDC)) {
            // Add this class
            activeFacets.add(Constants.PREGCUESMEDC);
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
            relatedInstance = buildPregCuesMedCRelatedInstance(relatedInstanceJsonOid);
        }
        if (PregCuesMedCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPregCuesMedCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPregCuesMedCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PregCuesMedC(mapper.readValue(relatedInstanceJsonOid, PregCuesMedCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PregCuesMedC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPregCuesMedCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PregCuesMedC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
