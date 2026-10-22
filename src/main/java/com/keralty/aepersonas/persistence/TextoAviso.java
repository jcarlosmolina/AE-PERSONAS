package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TextoAvisoConstants;
import com.keralty.aepersonas.persistence.oid.TextoAvisoOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>TextoAviso</code> model class.
 * <p>
 * Model Class: <code>TextoAviso</code><br>
 */
@Entity(name = TextoAvisoConstants.CLASS_NAME)
@Table(name = TextoAvisoConstants.TBL_NAME)
public class TextoAviso extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = TextoAvisoConstants.FLD_TEXTOAVISOIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private String textoAvisoIdentificador;

    /** Class member attribute. */
    @Column(name = TextoAvisoConstants.FLD_TEXTOAVISODESCRIPCION )
    @JsonProperty(value="descripcion")
    private String textoAvisoDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTextoAvisoDescripcion;

    /** Class member attribute. */
    @Column(name = TextoAvisoConstants.FLD_TEXTOAVISOVALOR )
    @JsonProperty(value="valor")
    private String textoAvisoValor;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTextoAvisoValor;

    @Transient
    @JsonIgnore
    public boolean textoAvisoValorInit = false;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public TextoAviso() {
        textoAvisoIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TextoAviso</code>.
     * @param oid Object Identifier of the instance of <code>TextoAviso</code> to be created.
     * @throws SystemException
     */
    public TextoAviso(TextoAvisoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            textoAvisoIdentificador = oid.getTextoAvisoIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>textoAvisoIdentificador</code> attribute<br>in class <code>TextoAviso</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TextoAviso</code>
     * @return The value of the <code>textoAvisoIdentificador</code> attribute<br>in class <code>TextoAviso</code>.
     */
    public String getTextoAvisoIdentificador() {
        return (textoAvisoIdentificador == null ? textoAvisoIdentificador : textoAvisoIdentificador.trim());
    }

    /**
     * Sets the value of the <code>textoAvisoIdentificador</code> attribute<br>in class <code>TextoAviso</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TextoAviso</code>
     * @param textoAvisoIdentificador The new value of the <code>textoAvisoIdentificador</code> attribute<br>in class <code>TextoAviso</code>.
     */
    public void setTextoAvisoIdentificador(String textoAvisoIdentificador) {
        this.textoAvisoIdentificador = textoAvisoIdentificador;
    }

   /**
    * Returns the value of the <code>textoAvisoDescripcion</code> attribute.<br>
    * Model Attribute: <code>textoAvisoDescripcion</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>textoAvisoDescripcion</code> attribute.
    */

    public String getTextoAvisoDescripcion()  {
    	String value;
        value =  textoAvisoDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>textoAvisoDescripcion</code> attribute.<br>
    * Model Attribute: <code>textoAvisoDescripcion</code>. Variable String Size=255<br>
    * Comments: <br>
    * @param textoAvisoDescripcion The new value of the <code>textoAvisoDescripcion</code> attribute.
    */
    public void setTextoAvisoDescripcion (String textoAvisoDescripcion) {
        modifiedTextoAvisoDescripcion = true;
        this.textoAvisoDescripcion = textoAvisoDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedTextoAvisoDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedTextoAvisoDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTextoAvisoDescripcion() {
        return modifiedTextoAvisoDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedTextoAvisoDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedTextoAvisoDescripcion</code>.
    */
    public void setModifiedTextoAvisoDescripcion(boolean modified) {
        this.modifiedTextoAvisoDescripcion = modified;
    }

   /**
    * Returns the value of the <code>textoAvisoValor</code> attribute.<br>
    * Model Attribute: <code>textoAvisoValor</code>. Variable Text<br>
    * Comments: <br>
    * @return The value of the <code>textoAvisoValor</code> attribute.
    */

    public String getTextoAvisoValor()  {
    	String value;
        value =  textoAvisoValor;
        return value;
    }

   /**
    * Sets the value of the <code>textoAvisoValor</code> attribute.<br>
    * Model Attribute: <code>textoAvisoValor</code>. Variable Text<br>
    * Comments: <br>
    * @param textoAvisoValor The new value of the <code>textoAvisoValor</code> attribute.
    */
    public void setTextoAvisoValor (String textoAvisoValor) {
        this.textoAvisoValorInit = true;
        modifiedTextoAvisoValor = true;
        this.textoAvisoValor = textoAvisoValor;
    }

   /**
    * Returns the value of the <code>modifiedTextoAvisoValor</code> class property.<br>
    *
    * @return The value of the <code>modifiedTextoAvisoValor</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTextoAvisoValor() {
        return modifiedTextoAvisoValor;
    }

   /**
    * Sets the value of the <code>modifiedTextoAvisoValor</code> class property.<br>
    * @param modified The new value of the <code>modifiedTextoAvisoValor</code>.
    */
    public void setModifiedTextoAvisoValor(boolean modified) {
        this.modifiedTextoAvisoValor = modified;
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
        textoAvisoDescripcion = null;
        textoAvisoValor = "";
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return TextoAviso.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TextoAvisoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedTextoAvisoDescripcion = false;
    	values.put("textoAvisoDescripcion", getTextoAvisoDescripcion());
    	if (modifiedTextoAvisoValor) {
    		values.put("textoAvisoValor", textoAvisoValor);
    		modifiedTextoAvisoValor = false;
    	}
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>TextoAvisoOid</code> object that identifies this instance of <code>TextoAviso</code>.
     * @return <code>TextoAvisoOid </code> object that identifies this instance of <code>TextoAviso</code>
     */
	@Override
    public TextoAvisoOid getOid() {
        return new TextoAvisoOid(getTextoAvisoIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TextoAvisoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TEXTOAVISO)) {
            // Add this class
            activeFacets.add(Constants.TEXTOAVISO);
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


        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildTextoAvisoRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTextoAvisoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TextoAviso(mapper.readValue(relatedInstanceJsonOid, TextoAvisoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TextoAviso.class).error(e.getMessage());
            return null;
        }
    }
}
