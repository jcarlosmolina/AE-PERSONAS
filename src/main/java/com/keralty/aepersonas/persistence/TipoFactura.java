package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TipoFacturaConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoFacturaOid;
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
 * Persistent representation of the <code>TipoFactura</code> model class.
 * <p>
 * Model Class: <code>TipoFactura</code><br>
 */
@Entity(name = TipoFacturaConstants.CLASS_NAME)
@Table(name = TipoFacturaConstants.TBL_NAME)
public class TipoFactura extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = TipoFacturaConstants.FLD_TIPOFACTURACODIGO )
    @JsonProperty(value="codigo")
    private String tipoFacturaCodigo;

    /** Class member attribute. */
    @Column(name = TipoFacturaConstants.FLD_TIPOFACTURADESCRIPCION )
    @JsonProperty(value="descripcion")
    private String tipoFacturaDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoFacturaDescripcion;

    /** Class member attribute. */
    @Column(name = TipoFacturaConstants.FLD_TIPOFACTURAESEMAIL )
    @JsonProperty(value="esemail")
    private Boolean tipoFacturaEsEmail;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoFacturaEsEmail;

    /** Class member attribute. */
    @Column(name = TipoFacturaConstants.FLD_TIPOFACTURAESCELULAR )
    @JsonProperty(value="escelular")
    private Boolean tipoFacturaEsCelular;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoFacturaEsCelular;

    /** Class member attribute. */
    @Column(name = TipoFacturaConstants.FLD_TIPOFACTURAACTIVO )
    @JsonProperty(value="activo")
    private Boolean tipoFacturaActivo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoFacturaActivo;

    /** Related Class. */
    @OneToMany(mappedBy = TipoFacturaConstants.ROLE_INVNAME_SOLICITUDES)
    @JsonIgnore
    private Collection <Solicitud> solicitudes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudes;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public TipoFactura() {
        tipoFacturaCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TipoFactura</code>.
     * @param oid Object Identifier of the instance of <code>TipoFactura</code> to be created.
     * @throws SystemException
     */
    public TipoFactura(TipoFacturaOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            tipoFacturaCodigo = oid.getTipoFacturaCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>tipoFacturaCodigo</code> attribute<br>in class <code>TipoFactura</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoFactura</code>
     * @return The value of the <code>tipoFacturaCodigo</code> attribute<br>in class <code>TipoFactura</code>.
     */
    public String getTipoFacturaCodigo() {
        return (tipoFacturaCodigo == null ? tipoFacturaCodigo : tipoFacturaCodigo.trim());
    }

    /**
     * Sets the value of the <code>tipoFacturaCodigo</code> attribute<br>in class <code>TipoFactura</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoFactura</code>
     * @param tipoFacturaCodigo The new value of the <code>tipoFacturaCodigo</code> attribute<br>in class <code>TipoFactura</code>.
     */
    public void setTipoFacturaCodigo(String tipoFacturaCodigo) {
        this.tipoFacturaCodigo = tipoFacturaCodigo;
    }

   /**
    * Returns the value of the <code>tipoFacturaDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoFacturaDescripcion</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>tipoFacturaDescripcion</code> attribute.
    */

    public String getTipoFacturaDescripcion()  {
    	String value;
        value =  tipoFacturaDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoFacturaDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoFacturaDescripcion</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param tipoFacturaDescripcion The new value of the <code>tipoFacturaDescripcion</code> attribute.
    */
    public void setTipoFacturaDescripcion (String tipoFacturaDescripcion) {
        modifiedTipoFacturaDescripcion = true;
        this.tipoFacturaDescripcion = tipoFacturaDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedTipoFacturaDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoFacturaDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoFacturaDescripcion() {
        return modifiedTipoFacturaDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedTipoFacturaDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoFacturaDescripcion</code>.
    */
    public void setModifiedTipoFacturaDescripcion(boolean modified) {
        this.modifiedTipoFacturaDescripcion = modified;
    }

   /**
    * Returns the value of the <code>tipoFacturaEsEmail</code> attribute.<br>
    * Model Attribute: <code>tipoFacturaEsEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>tipoFacturaEsEmail</code> attribute.
    */

    public Boolean getTipoFacturaEsEmail()  {
    	Boolean value;
        value =  tipoFacturaEsEmail;
        return value;
    }

   /**
    * Sets the value of the <code>tipoFacturaEsEmail</code> attribute.<br>
    * Model Attribute: <code>tipoFacturaEsEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @param tipoFacturaEsEmail The new value of the <code>tipoFacturaEsEmail</code> attribute.
    */
    public void setTipoFacturaEsEmail (Boolean tipoFacturaEsEmail) {
        modifiedTipoFacturaEsEmail = true;
        this.tipoFacturaEsEmail = tipoFacturaEsEmail;
    }

   /**
    * Returns the value of the <code>modifiedTipoFacturaEsEmail</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoFacturaEsEmail</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoFacturaEsEmail() {
        return modifiedTipoFacturaEsEmail;
    }

   /**
    * Sets the value of the <code>modifiedTipoFacturaEsEmail</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoFacturaEsEmail</code>.
    */
    public void setModifiedTipoFacturaEsEmail(boolean modified) {
        this.modifiedTipoFacturaEsEmail = modified;
    }

   /**
    * Returns the value of the <code>tipoFacturaEsCelular</code> attribute.<br>
    * Model Attribute: <code>tipoFacturaEsCelular</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>tipoFacturaEsCelular</code> attribute.
    */

    public Boolean getTipoFacturaEsCelular()  {
    	Boolean value;
        value =  tipoFacturaEsCelular;
        return value;
    }

   /**
    * Sets the value of the <code>tipoFacturaEsCelular</code> attribute.<br>
    * Model Attribute: <code>tipoFacturaEsCelular</code>. Variable Bool<br>
    * Comments: <br>
    * @param tipoFacturaEsCelular The new value of the <code>tipoFacturaEsCelular</code> attribute.
    */
    public void setTipoFacturaEsCelular (Boolean tipoFacturaEsCelular) {
        modifiedTipoFacturaEsCelular = true;
        this.tipoFacturaEsCelular = tipoFacturaEsCelular;
    }

   /**
    * Returns the value of the <code>modifiedTipoFacturaEsCelular</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoFacturaEsCelular</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoFacturaEsCelular() {
        return modifiedTipoFacturaEsCelular;
    }

   /**
    * Sets the value of the <code>modifiedTipoFacturaEsCelular</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoFacturaEsCelular</code>.
    */
    public void setModifiedTipoFacturaEsCelular(boolean modified) {
        this.modifiedTipoFacturaEsCelular = modified;
    }

   /**
    * Returns the value of the <code>tipoFacturaActivo</code> attribute.<br>
    * Model Attribute: <code>tipoFacturaActivo</code>. Variable Bool<br>
    * Comments: Indica si el tipo está activo o no, es decir si puede utilizarse el valor o no en un argumento, por ejemplo<br>
    * @return The value of the <code>tipoFacturaActivo</code> attribute.
    */

    public Boolean getTipoFacturaActivo()  {
    	Boolean value;
        value =  tipoFacturaActivo;
        return value;
    }

   /**
    * Sets the value of the <code>tipoFacturaActivo</code> attribute.<br>
    * Model Attribute: <code>tipoFacturaActivo</code>. Variable Bool<br>
    * Comments: Indica si el tipo está activo o no, es decir si puede utilizarse el valor o no en un argumento, por ejemplo<br>
    * @param tipoFacturaActivo The new value of the <code>tipoFacturaActivo</code> attribute.
    */
    public void setTipoFacturaActivo (Boolean tipoFacturaActivo) {
        modifiedTipoFacturaActivo = true;
        this.tipoFacturaActivo = tipoFacturaActivo;
    }

   /**
    * Returns the value of the <code>modifiedTipoFacturaActivo</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoFacturaActivo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoFacturaActivo() {
        return modifiedTipoFacturaActivo;
    }

   /**
    * Sets the value of the <code>modifiedTipoFacturaActivo</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoFacturaActivo</code>.
    */
    public void setModifiedTipoFacturaActivo(boolean modified) {
        this.modifiedTipoFacturaActivo = modified;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitudes 0:M  ------ 0:1  TipoFactura [TipoFactura]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to add to the <code>Solicitudes</code> role.
     */
    public void add2Solicitudes(Solicitud solicitudes) {
        this.solicitudes.add(solicitudes);
    }
    /**
     * Removes an instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to be removed
     */
    public void removeFromSolicitudes(Solicitud solicitudes) {
    	this.solicitudes.remove(solicitudes);
    }
    /**
     * Sets instances of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The new value for the <code>Solicitudes</code> role.
     */
    public void setSolicitudes(Collection < Solicitud > solicitudes) {
        this.solicitudes = solicitudes;
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudes</code> has been modified.
    */
    public boolean isModifiedSolicitudes(){
        return modifiedSolicitudes;
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
        tipoFacturaDescripcion = "";
        tipoFacturaEsEmail = false;
        tipoFacturaEsCelular = false;
        tipoFacturaActivo = false;
        solicitudes = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return TipoFactura.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TipoFacturaConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedTipoFacturaDescripcion = false;
    	values.put("tipoFacturaDescripcion", getTipoFacturaDescripcion());
    	modifiedTipoFacturaEsEmail = false;
    	values.put("tipoFacturaEsEmail", getTipoFacturaEsEmail());
    	modifiedTipoFacturaEsCelular = false;
    	values.put("tipoFacturaEsCelular", getTipoFacturaEsCelular());
    	modifiedTipoFacturaActivo = false;
    	values.put("tipoFacturaActivo", getTipoFacturaActivo());
    	modifiedSolicitudes = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>TipoFacturaOid</code> object that identifies this instance of <code>TipoFactura</code>.
     * @return <code>TipoFacturaOid </code> object that identifies this instance of <code>TipoFactura</code>
     */
	@Override
    public TipoFacturaOid getOid() {
        return new TipoFacturaOid(getTipoFacturaCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TipoFacturaConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TIPOFACTURA)) {
            // Add this class
            activeFacets.add(Constants.TIPOFACTURA);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildTipoFacturaRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoFacturaConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoFacturaRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoFacturaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoFactura(mapper.readValue(relatedInstanceJsonOid, TipoFacturaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoFactura.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTipoFacturaRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoFactura.class).error(e.getMessage());
            return null;
        }
    }
}
