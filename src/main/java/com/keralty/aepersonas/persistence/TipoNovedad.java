package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TipoNovedadConstants;
import com.keralty.aepersonas.persistence.oid.NovedadOid;
import com.keralty.aepersonas.persistence.oid.TipoNovedadOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>TipoNovedad</code> model class.
 * <p>
 * Model Class: <code>TipoNovedad</code><br>
 */
@Entity(name = TipoNovedadConstants.CLASS_NAME)
@Table(name = TipoNovedadConstants.TBL_NAME)
public class TipoNovedad extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = TipoNovedadConstants.FLD_TIPONOVEDADTIPO )
    @JsonProperty(value="tipo")
    private Long tipoNovedadTipo;

    /** Class member attribute. */
    @Column(name = TipoNovedadConstants.FLD_TIPONOVEDADALIASTIPO )
    @JsonProperty(value="aliastipo")
    private String tipoNovedadAliasTipo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoNovedadAliasTipo;

    /** Class member attribute. */
    @Column(name = TipoNovedadConstants.FLD_TIPONOVEDADNOMBRE )
    @JsonProperty(value="nombre")
    private String tipoNovedadNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoNovedadNombre;

    /** Class member attribute. */
    @Column(name = TipoNovedadConstants.FLD_TIPONOVEDADDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String tipoNovedadDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoNovedadDescripcion;

    /** Class member attribute. */
    @Column(name = TipoNovedadConstants.FLD_TIPONOVEDADCODIGOLEGAL )
    @JsonProperty(value="codigolegal")
    private String tipoNovedadCodigoLegal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoNovedadCodigoLegal;

    /** Related Class. */
    @OneToMany(mappedBy = TipoNovedadConstants.ROLE_INVNAME_NOVEDADES)
    @JsonIgnore
    private Collection <Novedad> novedades;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedades;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public TipoNovedad() {
        tipoNovedadTipo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TipoNovedad</code>.
     * @param oid Object Identifier of the instance of <code>TipoNovedad</code> to be created.
     * @throws SystemException
     */
    public TipoNovedad(TipoNovedadOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            tipoNovedadTipo = oid.getTipoNovedadTipo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>tipoNovedadTipo</code> attribute<br>in class <code>TipoNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoNovedad</code>
     * @return The value of the <code>tipoNovedadTipo</code> attribute<br>in class <code>TipoNovedad</code>.
     */
    public Long getTipoNovedadTipo() {
        return tipoNovedadTipo;
    }

    /**
     * Sets the value of the <code>tipoNovedadTipo</code> attribute<br>in class <code>TipoNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoNovedad</code>
     * @param tipoNovedadTipo The new value of the <code>tipoNovedadTipo</code> attribute<br>in class <code>TipoNovedad</code>.
     */
    public void setTipoNovedadTipo(Long tipoNovedadTipo) {
        this.tipoNovedadTipo = tipoNovedadTipo;
    }

   /**
    * Returns the value of the <code>tipoNovedadAliasTipo</code> attribute.<br>
    * Model Attribute: <code>tipoNovedadAliasTipo</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>tipoNovedadAliasTipo</code> attribute.
    */

    public String getTipoNovedadAliasTipo()  {
    	String value;
        value =  tipoNovedadAliasTipo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoNovedadAliasTipo</code> attribute.<br>
    * Model Attribute: <code>tipoNovedadAliasTipo</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param tipoNovedadAliasTipo The new value of the <code>tipoNovedadAliasTipo</code> attribute.
    */
    public void setTipoNovedadAliasTipo (String tipoNovedadAliasTipo) {
        modifiedTipoNovedadAliasTipo = true;
        this.tipoNovedadAliasTipo = tipoNovedadAliasTipo;
    }

   /**
    * Returns the value of the <code>modifiedTipoNovedadAliasTipo</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoNovedadAliasTipo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoNovedadAliasTipo() {
        return modifiedTipoNovedadAliasTipo;
    }

   /**
    * Sets the value of the <code>modifiedTipoNovedadAliasTipo</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoNovedadAliasTipo</code>.
    */
    public void setModifiedTipoNovedadAliasTipo(boolean modified) {
        this.modifiedTipoNovedadAliasTipo = modified;
    }

   /**
    * Returns the value of the <code>tipoNovedadNombre</code> attribute.<br>
    * Model Attribute: <code>tipoNovedadNombre</code>. Variable String Size=50<br>
    * Comments: El nombre es el valor que se utilizará para mostrar al usuario de la aplicación cuando debe seleccionar un tipo de novedad.<br>
    * @return The value of the <code>tipoNovedadNombre</code> attribute.
    */

    public String getTipoNovedadNombre()  {
    	String value;
        value =  tipoNovedadNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoNovedadNombre</code> attribute.<br>
    * Model Attribute: <code>tipoNovedadNombre</code>. Variable String Size=50<br>
    * Comments: El nombre es el valor que se utilizará para mostrar al usuario de la aplicación cuando debe seleccionar un tipo de novedad.<br>
    * @param tipoNovedadNombre The new value of the <code>tipoNovedadNombre</code> attribute.
    */
    public void setTipoNovedadNombre (String tipoNovedadNombre) {
        modifiedTipoNovedadNombre = true;
        this.tipoNovedadNombre = tipoNovedadNombre;
    }

   /**
    * Returns the value of the <code>modifiedTipoNovedadNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoNovedadNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoNovedadNombre() {
        return modifiedTipoNovedadNombre;
    }

   /**
    * Sets the value of the <code>modifiedTipoNovedadNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoNovedadNombre</code>.
    */
    public void setModifiedTipoNovedadNombre(boolean modified) {
        this.modifiedTipoNovedadNombre = modified;
    }

   /**
    * Returns the value of the <code>tipoNovedadDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoNovedadDescripcion</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>tipoNovedadDescripcion</code> attribute.
    */

    public String getTipoNovedadDescripcion()  {
    	String value;
        value =  tipoNovedadDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoNovedadDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoNovedadDescripcion</code>. Variable String Size=200<br>
    * Comments: <br>
    * @param tipoNovedadDescripcion The new value of the <code>tipoNovedadDescripcion</code> attribute.
    */
    public void setTipoNovedadDescripcion (String tipoNovedadDescripcion) {
        modifiedTipoNovedadDescripcion = true;
        this.tipoNovedadDescripcion = tipoNovedadDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedTipoNovedadDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoNovedadDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoNovedadDescripcion() {
        return modifiedTipoNovedadDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedTipoNovedadDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoNovedadDescripcion</code>.
    */
    public void setModifiedTipoNovedadDescripcion(boolean modified) {
        this.modifiedTipoNovedadDescripcion = modified;
    }

   /**
    * Returns the value of the <code>tipoNovedadCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>tipoNovedadCodigoLegal</code>. Variable String Size=5<br>
    * Comments: Código legal que se utiliza para identificar el código asociado en BH<br>
    * @return The value of the <code>tipoNovedadCodigoLegal</code> attribute.
    */

    public String getTipoNovedadCodigoLegal()  {
    	String value;
        value =  tipoNovedadCodigoLegal;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoNovedadCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>tipoNovedadCodigoLegal</code>. Variable String Size=5<br>
    * Comments: Código legal que se utiliza para identificar el código asociado en BH<br>
    * @param tipoNovedadCodigoLegal The new value of the <code>tipoNovedadCodigoLegal</code> attribute.
    */
    public void setTipoNovedadCodigoLegal (String tipoNovedadCodigoLegal) {
        modifiedTipoNovedadCodigoLegal = true;
        this.tipoNovedadCodigoLegal = tipoNovedadCodigoLegal;
    }

   /**
    * Returns the value of the <code>modifiedTipoNovedadCodigoLegal</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoNovedadCodigoLegal</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoNovedadCodigoLegal() {
        return modifiedTipoNovedadCodigoLegal;
    }

   /**
    * Sets the value of the <code>modifiedTipoNovedadCodigoLegal</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoNovedadCodigoLegal</code>.
    */
    public void setModifiedTipoNovedadCodigoLegal(boolean modified) {
        this.modifiedTipoNovedadCodigoLegal = modified;
    }

    /**
     * Returns the instance of <code>Novedad</code> related through the <code>Novedades</code> role.
     * Model Relationship:
     * <code>[Novedad] Novedades 0:M  ------ 1:1  TipoNovedad [TipoNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Novedad</code> related through the <code>Novedades</code> role.
     */
    @JsonIgnore
    public Collection <Novedad> getNovedades() {
        return novedades;
    }

    /**
     * Adds an instance of <code>Novedad</code> related through the <code>Novedades</code> role.
     * @param novedades The instance to add to the <code>Novedades</code> role.
     */
    public void add2Novedades(Novedad novedades) {
        this.novedades.add(novedades);
    }
    /**
     * Removes an instance of <code>Novedad</code> related through the <code>Novedades</code> role.
     * @param novedades The instance to be removed
     */
    public void removeFromNovedades(Novedad novedades) {
    	this.novedades.remove(novedades);
    }
    /**
     * Sets instances of <code>Novedad</code> related through the <code>Novedades</code> role.
     * @param novedades The new value for the <code>Novedades</code> role.
     */
    public void setNovedades(Collection < Novedad > novedades) {
        this.novedades = novedades;
    }

   /**
    * This method gets the attribute value <code>modifiedNovedades</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedades</code> has been modified.
    */
    public boolean isModifiedNovedades(){
        return modifiedNovedades;
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
        tipoNovedadAliasTipo = "";
        tipoNovedadNombre = "";
        tipoNovedadDescripcion = "";
        tipoNovedadCodigoLegal = "";
        novedades = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return TipoNovedad.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TipoNovedadConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedTipoNovedadAliasTipo = false;
    	values.put("tipoNovedadAliasTipo", getTipoNovedadAliasTipo());
    	modifiedTipoNovedadNombre = false;
    	values.put("tipoNovedadNombre", getTipoNovedadNombre());
    	modifiedTipoNovedadDescripcion = false;
    	values.put("tipoNovedadDescripcion", getTipoNovedadDescripcion());
    	modifiedTipoNovedadCodigoLegal = false;
    	values.put("tipoNovedadCodigoLegal", getTipoNovedadCodigoLegal());
    	modifiedNovedades = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>TipoNovedadOid</code> object that identifies this instance of <code>TipoNovedad</code>.
     * @return <code>TipoNovedadOid </code> object that identifies this instance of <code>TipoNovedad</code>
     */
	@Override
    public TipoNovedadOid getOid() {
        return new TipoNovedadOid(getTipoNovedadTipo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TipoNovedadConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TIPONOVEDAD)) {
            // Add this class
            activeFacets.add(Constants.TIPONOVEDAD);
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
            relatedInstance = buildTipoNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoNovedadConstants.ROLE_NAME_NOVEDADES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoNovedadRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoNovedad(mapper.readValue(relatedInstanceJsonOid, TipoNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTipoNovedadRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoNovedad.class).error(e.getMessage());
            return null;
        }
    }
}
