package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.CausaExclusionConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.NovedadConstants;
import com.keralty.aepersonas.persistence.oid.CausaExclusionOid;
import com.keralty.aepersonas.persistence.oid.NovedadOid;
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
 * Persistent representation of the <code>CausaExclusion</code> model class.
 * <p>
 * Model Class: <code>CausaExclusion</code><br>
 */
@Entity(name = CausaExclusionConstants.CLASS_NAME)
@Table(name = CausaExclusionConstants.TBL_NAME)
public class CausaExclusion extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CausaExclusion_Sequence")
    @SequenceGenerator(name="CausaExclusion_Sequence", sequenceName="CausaExclusion_Sequence", allocationSize=1)
    @Column(name = CausaExclusionConstants.FLD_CAUSAEXCLUSIONIDCAUSAEXCLUSION )
    @JsonProperty(value="id_causaexclusion")
    private Long causaExclusionidCausaExclusion;

    /** Class member attribute. */
    @Column(name = CausaExclusionConstants.FLD_CAUSAEXCLUSIONALIASCAUSA )
    @JsonProperty(value="aliascausa")
    private String causaExclusionAliasCausa;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCausaExclusionAliasCausa;

    /** Class member attribute. */
    @Column(name = CausaExclusionConstants.FLD_CAUSAEXCLUSIONDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String causaExclusionDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCausaExclusionDescripcion;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtextomostrar")
    protected String causaExclusionDrvTextoMostrar;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=CausaExclusionConstants.FLD_NOVEDADIDNOVEDAD, referencedColumnName=NovedadConstants.FLD_NOVEDADIDNOVEDAD)
    })
    @JsonIgnore
    private Novedad novedad;
    /** Related attribute. */
    @Column(name = CausaExclusionConstants.FLD_NOVEDADIDNOVEDAD, insertable = false, updatable = false)
    private Long novedadidNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedad;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public CausaExclusion() {
        causaExclusionidCausaExclusion = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>CausaExclusion</code>.
     * @param oid Object Identifier of the instance of <code>CausaExclusion</code> to be created.
     * @throws SystemException
     */
    public CausaExclusion(CausaExclusionOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            causaExclusionidCausaExclusion = oid.getCausaExclusionidCausaExclusion();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>causaExclusionidCausaExclusion</code> attribute<br>in class <code>CausaExclusion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>CausaExclusion</code>
     * @return The value of the <code>causaExclusionidCausaExclusion</code> attribute<br>in class <code>CausaExclusion</code>.
     */
    public Long getCausaExclusionidCausaExclusion() {
        return causaExclusionidCausaExclusion;
    }

    /**
     * Sets the value of the <code>causaExclusionidCausaExclusion</code> attribute<br>in class <code>CausaExclusion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>CausaExclusion</code>
     * @param causaExclusionidCausaExclusion The new value of the <code>causaExclusionidCausaExclusion</code> attribute<br>in class <code>CausaExclusion</code>.
     */
    public void setCausaExclusionidCausaExclusion(Long causaExclusionidCausaExclusion) {
        this.causaExclusionidCausaExclusion = causaExclusionidCausaExclusion;
    }

   /**
    * Returns the value of the <code>causaExclusionAliasCausa</code> attribute.<br>
    * Model Attribute: <code>causaExclusionAliasCausa</code>. Variable String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>causaExclusionAliasCausa</code> attribute.
    */

    public String getCausaExclusionAliasCausa()  {
    	String value;
        value =  causaExclusionAliasCausa;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>causaExclusionAliasCausa</code> attribute.<br>
    * Model Attribute: <code>causaExclusionAliasCausa</code>. Variable String Size=10<br>
    * Comments: <br>
    * @param causaExclusionAliasCausa The new value of the <code>causaExclusionAliasCausa</code> attribute.
    */
    public void setCausaExclusionAliasCausa (String causaExclusionAliasCausa) {
        modifiedCausaExclusionAliasCausa = true;
        this.causaExclusionAliasCausa = causaExclusionAliasCausa;
    }

   /**
    * Returns the value of the <code>modifiedCausaExclusionAliasCausa</code> class property.<br>
    *
    * @return The value of the <code>modifiedCausaExclusionAliasCausa</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedCausaExclusionAliasCausa() {
        return modifiedCausaExclusionAliasCausa;
    }

   /**
    * Sets the value of the <code>modifiedCausaExclusionAliasCausa</code> class property.<br>
    * @param modified The new value of the <code>modifiedCausaExclusionAliasCausa</code>.
    */
    public void setModifiedCausaExclusionAliasCausa(boolean modified) {
        this.modifiedCausaExclusionAliasCausa = modified;
    }

   /**
    * Returns the value of the <code>causaExclusionDescripcion</code> attribute.<br>
    * Model Attribute: <code>causaExclusionDescripcion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>causaExclusionDescripcion</code> attribute.
    */

    public String getCausaExclusionDescripcion()  {
    	String value;
        value =  causaExclusionDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>causaExclusionDescripcion</code> attribute.<br>
    * Model Attribute: <code>causaExclusionDescripcion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param causaExclusionDescripcion The new value of the <code>causaExclusionDescripcion</code> attribute.
    */
    public void setCausaExclusionDescripcion (String causaExclusionDescripcion) {
        modifiedCausaExclusionDescripcion = true;
        this.causaExclusionDescripcion = causaExclusionDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedCausaExclusionDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedCausaExclusionDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedCausaExclusionDescripcion() {
        return modifiedCausaExclusionDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedCausaExclusionDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedCausaExclusionDescripcion</code>.
    */
    public void setModifiedCausaExclusionDescripcion(boolean modified) {
        this.modifiedCausaExclusionDescripcion = modified;
    }

   /**
    * Returns the value of the <code>causaExclusionDrvTextoMostrar</code> attribute.<br>
    * Model Attribute: <code>causaExclusionDrvTextoMostrar</code>. Variable String Size=120<br>
    * Comments: <br>
    * @return The value of the <code>causaExclusionDrvTextoMostrar</code> attribute.
    */

    @JsonIgnore
    public String getCausaExclusionDrvTextoMostrar()  {
    	String value;
        try {
            value = causaExclusionDrvTextoMostrarDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: CausaExclusion, Attribute: causaExclusionDrvTextoMostrar");
        }
        return (value == null ? null : value.trim());
    }

    /**
     * Returns the instance of <code>Novedad</code> related through the <code>Novedad</code> role.
     * Model Relationship:
     * <code>[Novedad] Novedad 1:1  ------ 0:M  CausasExclusion [CausaExclusion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Novedad</code> related through the <code>Novedad</code> role.
     */
    @JsonIgnore
    public Novedad getNovedad() {
        return novedad;
    }

    /**
     * Adds an instance of <code>Novedad</code> related through the <code>Novedad</code> role.
     * @param novedad The instance to add to the <code>Novedad</code> role.
     */
    public void add2Novedad(Novedad novedad) {
        if (novedad == null || novedad.isNull()) {
            this.modifiedNovedad = true;
            this.novedadidNovedad = null;
        } else {
            this.novedadidNovedad = novedad.getNovedadidNovedad();
        }
        this.novedad = (novedad == null  || novedad.isNull() ? null : novedad);
    }

   /**
    * This method gets the attribute value <code>modifiedNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedad</code> has been modified.
    */
    public boolean isModifiedNovedad(){
        return modifiedNovedad;
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
     * Computes the value of the <code>causaExclusionDrvTextoMostrar</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>causaExclusionDrvTextoMostrar</code> derived attribute.
     */
    public String causaExclusionDrvTextoMostrarDerivations() {

        causaExclusionDrvTextoMostrar = null;

        causaExclusionDrvTextoMostrarDerivationsDefault();
        return causaExclusionDrvTextoMostrar;
    }

    private void causaExclusionDrvTextoMostrarDerivationsDefault() {
        if (causaExclusionDrvTextoMostrar != null) return;
        // Default derivation
        // EFFECT   : AliasCausa + \" \" + Descripcion
        causaExclusionDrvTextoMostrar = this.getCausaExclusionAliasCausa() + " " + this.getCausaExclusionDescripcion();
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        causaExclusionAliasCausa = "";
        causaExclusionDescripcion = "";
        novedad = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return CausaExclusion.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return CausaExclusionConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedCausaExclusionAliasCausa = false;
    	values.put("causaExclusionAliasCausa", getCausaExclusionAliasCausa());
    	modifiedCausaExclusionDescripcion = false;
    	values.put("causaExclusionDescripcion", getCausaExclusionDescripcion());
    	modifiedNovedad = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            causaExclusionDrvTextoMostrar = null;
    }

    /**
     * Returns the <code>CausaExclusionOid</code> object that identifies this instance of <code>CausaExclusion</code>.
     * @return <code>CausaExclusionOid </code> object that identifies this instance of <code>CausaExclusion</code>
     */
	@Override
    public CausaExclusionOid getOid() {
        return new CausaExclusionOid(getCausaExclusionidCausaExclusion());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(CausaExclusionConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(CausaExclusionConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CAUSAEXCLUSION)) {
            // Add this class
            activeFacets.add(Constants.CAUSAEXCLUSION);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildCausaExclusionRelatedInstance(relatedInstanceJsonOid);
        }
        if (CausaExclusionConstants.ROLE_NAME_NOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCausaExclusionRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildCausaExclusionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new CausaExclusion(mapper.readValue(relatedInstanceJsonOid, CausaExclusionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CausaExclusion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildCausaExclusionRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CausaExclusion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
