package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.global.ParentescoDomConstants;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.ParentescoDomOid;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
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
/**
 * Persistent representation of the <code>ParentescoDom</code> model class.
 * <p>
 * Model Class: <code>ParentescoDom</code><br>
 */
@Entity(name = ParentescoDomConstants.CLASS_NAME)
@Table(name = ParentescoDomConstants.TBL_NAME)
public class ParentescoDom extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private ParentescoDomOid oid;

    /** Class identification function. */
    @Column(name = ParentescoDomConstants.FLD_DOMINIONUMERO, insertable = false, updatable = false )
    @JsonProperty(value="numero")
    private Long dominioNumero;

    /** Class identification function. */
    @Column(name = ParentescoDomConstants.FLD_PARENTESCODOMIDENTIFICADOR, insertable = false, updatable = false )
    @JsonProperty(value="identificador")
    private Long parentescoDomIdentificador;

    /** Class member attribute. */
    @Column(name = ParentescoDomConstants.FLD_PARENTESCODOMEDADMINIMAA )
    @JsonProperty(value="edadminimaa")
    private Long parentescoDomEdadMinimaA;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoDomEdadMinimaA;

    /** Class member attribute. */
    @Column(name = ParentescoDomConstants.FLD_PARENTESCODOMEDADMAXIMAA )
    @JsonProperty(value="edadmaximaa")
    private Long parentescoDomEdadMaximaA;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoDomEdadMaximaA;

    /** Class member attribute. */
    @Column(name = ParentescoDomConstants.FLD_PARENTESCODOMEDADMINIMAD )
    @JsonProperty(value="edadminimad")
    private Long parentescoDomEdadMinimaD;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoDomEdadMinimaD;

    /** Class member attribute. */
    @Column(name = ParentescoDomConstants.FLD_PARENTESCODOMEDADMAXIMAP )
    @JsonProperty(value="edadmaximap")
    private Long parentescoDomEdadMaximaP;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoDomEdadMaximaP;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ParentescoDomConstants.FLD_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO, insertable = false, updatable = false)
    })
    @JsonIgnore
    private Dominio dominio;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominio;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ParentescoDomConstants.FLD_PARENTESCOCODIGO, referencedColumnName=ParentescoConstants.FLD_PARENTESCOCODIGO)
    })
    @JsonIgnore
    private Parentesco parentesco;
    /** Related attribute. */
    @Column(name = ParentescoDomConstants.FLD_PARENTESCOCODIGO, insertable = false, updatable = false)
    private Long parentescoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentesco;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ParentescoDom() {
        dominioNumero = null;
        parentescoDomIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ParentescoDom</code>.
     * @param oid Object Identifier of the instance of <code>ParentescoDom</code> to be created.
     * @throws SystemException
     */
    public ParentescoDom(ParentescoDomOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            dominioNumero = oid.getDominioNumero();
            parentescoDomIdentificador = oid.getParentescoDomIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code> through <code>Dominio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Dominio</code>
     * @return The value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code> through <code>Dominio</code>.
     */
    public Long getDominioNumero() {
        return (dominio != null ? dominio.getDominioNumero() : dominioNumero);
    }

    /**
     * Sets the value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code> through <code>Dominio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Dominio</code>
     * @param dominioNumero The new value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code> through <code>Dominio</code>.
     */
    public void setDominioNumero(Long dominioNumero) {
        this.dominioNumero = dominioNumero;
    }

    /**
     * Returns the value of the <code>parentescoDomIdentificador</code> attribute<br>in class <code>ParentescoDom</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ParentescoDom</code>
     * @return The value of the <code>parentescoDomIdentificador</code> attribute<br>in class <code>ParentescoDom</code>.
     */
    public Long getParentescoDomIdentificador() {
        return parentescoDomIdentificador;
    }

    /**
     * Sets the value of the <code>parentescoDomIdentificador</code> attribute<br>in class <code>ParentescoDom</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ParentescoDom</code>
     * @param parentescoDomIdentificador The new value of the <code>parentescoDomIdentificador</code> attribute<br>in class <code>ParentescoDom</code>.
     */
    public void setParentescoDomIdentificador(Long parentescoDomIdentificador) {
        this.parentescoDomIdentificador = parentescoDomIdentificador;
    }

   /**
    * Returns the value of the <code>parentescoDomEdadMinimaA</code> attribute.<br>
    * Model Attribute: <code>parentescoDomEdadMinimaA</code>. Variable Int<br>
    * Comments: <br>
    * @return The value of the <code>parentescoDomEdadMinimaA</code> attribute.
    */

    public Long getParentescoDomEdadMinimaA()  {
    	Long value;
        value =  parentescoDomEdadMinimaA;
        return value;
    }

   /**
    * Sets the value of the <code>parentescoDomEdadMinimaA</code> attribute.<br>
    * Model Attribute: <code>parentescoDomEdadMinimaA</code>. Variable Int<br>
    * Comments: <br>
    * @param parentescoDomEdadMinimaA The new value of the <code>parentescoDomEdadMinimaA</code> attribute.
    */
    public void setParentescoDomEdadMinimaA (Long parentescoDomEdadMinimaA) {
        modifiedParentescoDomEdadMinimaA = true;
        this.parentescoDomEdadMinimaA = parentescoDomEdadMinimaA;
    }

   /**
    * Sets the value of the <code>modifiedParentescoDomEdadMinimaA</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoDomEdadMinimaA</code>.
    */
    public void setModifiedParentescoDomEdadMinimaA(boolean modified) {
        this.modifiedParentescoDomEdadMinimaA = modified;
    }

   /**
    * Returns the value of the <code>parentescoDomEdadMaximaA</code> attribute.<br>
    * Model Attribute: <code>parentescoDomEdadMaximaA</code>. Variable Int<br>
    * Comments: <br>
    * @return The value of the <code>parentescoDomEdadMaximaA</code> attribute.
    */

    public Long getParentescoDomEdadMaximaA()  {
    	Long value;
        value =  parentescoDomEdadMaximaA;
        return value;
    }

   /**
    * Sets the value of the <code>parentescoDomEdadMaximaA</code> attribute.<br>
    * Model Attribute: <code>parentescoDomEdadMaximaA</code>. Variable Int<br>
    * Comments: <br>
    * @param parentescoDomEdadMaximaA The new value of the <code>parentescoDomEdadMaximaA</code> attribute.
    */
    public void setParentescoDomEdadMaximaA (Long parentescoDomEdadMaximaA) {
        modifiedParentescoDomEdadMaximaA = true;
        this.parentescoDomEdadMaximaA = parentescoDomEdadMaximaA;
    }

   /**
    * Sets the value of the <code>modifiedParentescoDomEdadMaximaA</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoDomEdadMaximaA</code>.
    */
    public void setModifiedParentescoDomEdadMaximaA(boolean modified) {
        this.modifiedParentescoDomEdadMaximaA = modified;
    }

   /**
    * Returns the value of the <code>parentescoDomEdadMinimaD</code> attribute.<br>
    * Model Attribute: <code>parentescoDomEdadMinimaD</code>. Variable Int<br>
    * Comments: <br>
    * @return The value of the <code>parentescoDomEdadMinimaD</code> attribute.
    */

    public Long getParentescoDomEdadMinimaD()  {
    	Long value;
        value =  parentescoDomEdadMinimaD;
        return value;
    }

   /**
    * Sets the value of the <code>parentescoDomEdadMinimaD</code> attribute.<br>
    * Model Attribute: <code>parentescoDomEdadMinimaD</code>. Variable Int<br>
    * Comments: <br>
    * @param parentescoDomEdadMinimaD The new value of the <code>parentescoDomEdadMinimaD</code> attribute.
    */
    public void setParentescoDomEdadMinimaD (Long parentescoDomEdadMinimaD) {
        modifiedParentescoDomEdadMinimaD = true;
        this.parentescoDomEdadMinimaD = parentescoDomEdadMinimaD;
    }

   /**
    * Sets the value of the <code>modifiedParentescoDomEdadMinimaD</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoDomEdadMinimaD</code>.
    */
    public void setModifiedParentescoDomEdadMinimaD(boolean modified) {
        this.modifiedParentescoDomEdadMinimaD = modified;
    }

   /**
    * Returns the value of the <code>parentescoDomEdadMaximaP</code> attribute.<br>
    * Model Attribute: <code>parentescoDomEdadMaximaP</code>. Variable Int<br>
    * Comments: <br>
    * @return The value of the <code>parentescoDomEdadMaximaP</code> attribute.
    */

    public Long getParentescoDomEdadMaximaP()  {
    	Long value;
        value =  parentescoDomEdadMaximaP;
        return value;
    }

   /**
    * Sets the value of the <code>parentescoDomEdadMaximaP</code> attribute.<br>
    * Model Attribute: <code>parentescoDomEdadMaximaP</code>. Variable Int<br>
    * Comments: <br>
    * @param parentescoDomEdadMaximaP The new value of the <code>parentescoDomEdadMaximaP</code> attribute.
    */
    public void setParentescoDomEdadMaximaP (Long parentescoDomEdadMaximaP) {
        modifiedParentescoDomEdadMaximaP = true;
        this.parentescoDomEdadMaximaP = parentescoDomEdadMaximaP;
    }

   /**
    * Sets the value of the <code>modifiedParentescoDomEdadMaximaP</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoDomEdadMaximaP</code>.
    */
    public void setModifiedParentescoDomEdadMaximaP(boolean modified) {
        this.modifiedParentescoDomEdadMaximaP = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominio 1:1  ------ 0:M  ParentescosDom [ParentescoDom]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * @param dominio The instance to add to the <code>Dominio</code> role.
     */
    public void add2Dominio(Dominio dominio) {
        if (dominio == null || dominio.isNull()) {
            this.modifiedDominio = true;
            this.dominioNumero = null;
        } else {
            this.dominioNumero = dominio.getDominioNumero();
        }
        this.dominio = (dominio == null  || dominio.isNull() ? null : dominio);
    }

   /**
    * This method gets the attribute value <code>modifiedDominio</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominio</code> has been modified.
    */
    public boolean isModifiedDominio(){
        return modifiedDominio;
    }

    /**
     * Returns the instance of <code>Parentesco</code> related through the <code>Parentesco</code> role.
     * Model Relationship:
     * <code>[Parentesco] Parentesco 1:1  ------ 0:M  ParentescosDom [ParentescoDom]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Parentesco</code> related through the <code>Parentesco</code> role.
     */
    @JsonIgnore
    public Parentesco getParentesco() {
        return parentesco;
    }

    /**
     * Adds an instance of <code>Parentesco</code> related through the <code>Parentesco</code> role.
     * @param parentesco The instance to add to the <code>Parentesco</code> role.
     */
    public void add2Parentesco(Parentesco parentesco) {
        if (parentesco == null || parentesco.isNull()) {
            this.modifiedParentesco = true;
            this.parentescoCodigo = null;
        } else {
            this.parentescoCodigo = parentesco.getParentescoCodigo();
        }
        this.parentesco = (parentesco == null  || parentesco.isNull() ? null : parentesco);
    }

   /**
    * This method gets the attribute value <code>modifiedParentesco</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedParentesco</code> has been modified.
    */
    public boolean isModifiedParentesco(){
        return modifiedParentesco;
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
        parentescoDomEdadMinimaA = null;
        parentescoDomEdadMaximaA = null;
        parentescoDomEdadMinimaD = null;
        parentescoDomEdadMaximaP = null;
        dominio = null;
        parentesco = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ParentescoDom.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ParentescoDomConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedParentescoDomEdadMinimaA = false;
    	values.put("parentescoDomEdadMinimaA", getParentescoDomEdadMinimaA());
    	modifiedParentescoDomEdadMaximaA = false;
    	values.put("parentescoDomEdadMaximaA", getParentescoDomEdadMaximaA());
    	modifiedParentescoDomEdadMinimaD = false;
    	values.put("parentescoDomEdadMinimaD", getParentescoDomEdadMinimaD());
    	modifiedParentescoDomEdadMaximaP = false;
    	values.put("parentescoDomEdadMaximaP", getParentescoDomEdadMaximaP());
    	modifiedDominio = false;
    	modifiedParentesco = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ParentescoDomOid</code> object that identifies this instance of <code>ParentescoDom</code>.
     * @return <code>ParentescoDomOid </code> object that identifies this instance of <code>ParentescoDom</code>
     */
	@Override
    public ParentescoDomOid getOid() {
        return new ParentescoDomOid(getDominioNumero(), getParentescoDomIdentificador());
    }

    /**
     * Sets the <code>ParentescoDomOid</code> object that identifies this instance of <code>ParentescoDom</code>.
     */    
    public void setOid(ParentescoDomOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ParentescoDomConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ParentescoDomConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PARENTESCODOM)) {
            // Add this class
            activeFacets.add(Constants.PARENTESCODOM);
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
            relatedInstance = buildParentescoDomRelatedInstance(relatedInstanceJsonOid);
        }
        if (ParentescoDomConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoDomRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoDomConstants.ROLE_NAME_PARENTESCO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoDomRelatedInstance4Parentesco(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildParentescoDomRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ParentescoDom(mapper.readValue(relatedInstanceJsonOid, ParentescoDomOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParentescoDom.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildParentescoDomRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParentescoDom.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildParentescoDomRelatedInstance4Parentesco(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class)): Parentesco.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParentescoDom.class).error(e.getMessage());
            return null;
        }
    }
}
