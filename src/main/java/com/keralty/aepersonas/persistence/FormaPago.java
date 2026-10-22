package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FormaPagoConstants;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.FormaPagoOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
 * Persistent representation of the <code>FormaPago</code> model class.
 * <p>
 * Model Class: <code>FormaPago</code><br>
 */
@Entity(name = FormaPagoConstants.CLASS_NAME)
@Table(name = FormaPagoConstants.TBL_NAME)
public class FormaPago extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = FormaPagoConstants.FLD_FORMAPAGOCODIGO )
    @JsonProperty(value="codigo")
    private Long formaPagoCodigo;

    /** Class member attribute. */
    @Column(name = FormaPagoConstants.FLD_FORMAPAGODESCRIPCION )
    @JsonProperty(value="descripcion")
    private String formaPagoDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFormaPagoDescripcion;

    /** Class member attribute. */
    @Column(name = FormaPagoConstants.FLD_FORMAPAGOABRIRURL )
    @JsonProperty(value="abrirurl")
    private Boolean formaPagoAbrirURL;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFormaPagoAbrirURL;

    /** Class member attribute. */
    @Column(name = FormaPagoConstants.FLD_FORMAPAGOESVISIBLE )
    @JsonProperty(value="esvisible")
    private Boolean formaPagoEsVisible;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFormaPagoEsVisible;

    /** Related Class. */
    @ManyToMany(mappedBy=FormaPagoConstants.ROLE_INVNAME_DOMINIOS)
    @JsonIgnore
    private Collection <Dominio> dominios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominios;

    /** Related Class. */
    @OneToMany(mappedBy = FormaPagoConstants.ROLE_INVNAME_SOLICITUDES)
    @JsonIgnore
    private Collection <Solicitud> solicitudes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudes;

    /** Related Class. */
    @OneToMany(mappedBy = FormaPagoConstants.ROLE_INVNAME_CONTRATOSC)
    @JsonIgnore
    private Collection <ContratoC> contratosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratosC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public FormaPago() {
        formaPagoCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>FormaPago</code>.
     * @param oid Object Identifier of the instance of <code>FormaPago</code> to be created.
     * @throws SystemException
     */
    public FormaPago(FormaPagoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            formaPagoCodigo = oid.getFormaPagoCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>formaPagoCodigo</code> attribute<br>in class <code>FormaPago</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FormaPago</code>
     * @return The value of the <code>formaPagoCodigo</code> attribute<br>in class <code>FormaPago</code>.
     */
    public Long getFormaPagoCodigo() {
        return formaPagoCodigo;
    }

    /**
     * Sets the value of the <code>formaPagoCodigo</code> attribute<br>in class <code>FormaPago</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FormaPago</code>
     * @param formaPagoCodigo The new value of the <code>formaPagoCodigo</code> attribute<br>in class <code>FormaPago</code>.
     */
    public void setFormaPagoCodigo(Long formaPagoCodigo) {
        this.formaPagoCodigo = formaPagoCodigo;
    }

   /**
    * Returns the value of the <code>formaPagoDescripcion</code> attribute.<br>
    * Model Attribute: <code>formaPagoDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>formaPagoDescripcion</code> attribute.
    */

    public String getFormaPagoDescripcion()  {
    	String value;
        value =  formaPagoDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>formaPagoDescripcion</code> attribute.<br>
    * Model Attribute: <code>formaPagoDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param formaPagoDescripcion The new value of the <code>formaPagoDescripcion</code> attribute.
    */
    public void setFormaPagoDescripcion (String formaPagoDescripcion) {
        modifiedFormaPagoDescripcion = true;
        this.formaPagoDescripcion = formaPagoDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedFormaPagoDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedFormaPagoDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFormaPagoDescripcion() {
        return modifiedFormaPagoDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedFormaPagoDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedFormaPagoDescripcion</code>.
    */
    public void setModifiedFormaPagoDescripcion(boolean modified) {
        this.modifiedFormaPagoDescripcion = modified;
    }

   /**
    * Returns the value of the <code>formaPagoAbrirURL</code> attribute.<br>
    * Model Attribute: <code>formaPagoAbrirURL</code>. Variable Bool<br>
    * Comments: Por ejemplo para PSE y tarjeta de crédito<br>
    * @return The value of the <code>formaPagoAbrirURL</code> attribute.
    */

    public Boolean getFormaPagoAbrirURL()  {
    	Boolean value;
        value =  formaPagoAbrirURL;
        return value;
    }

   /**
    * Sets the value of the <code>formaPagoAbrirURL</code> attribute.<br>
    * Model Attribute: <code>formaPagoAbrirURL</code>. Variable Bool<br>
    * Comments: Por ejemplo para PSE y tarjeta de crédito<br>
    * @param formaPagoAbrirURL The new value of the <code>formaPagoAbrirURL</code> attribute.
    */
    public void setFormaPagoAbrirURL (Boolean formaPagoAbrirURL) {
        modifiedFormaPagoAbrirURL = true;
        this.formaPagoAbrirURL = formaPagoAbrirURL;
    }

   /**
    * Returns the value of the <code>modifiedFormaPagoAbrirURL</code> class property.<br>
    *
    * @return The value of the <code>modifiedFormaPagoAbrirURL</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFormaPagoAbrirURL() {
        return modifiedFormaPagoAbrirURL;
    }

   /**
    * Sets the value of the <code>modifiedFormaPagoAbrirURL</code> class property.<br>
    * @param modified The new value of the <code>modifiedFormaPagoAbrirURL</code>.
    */
    public void setModifiedFormaPagoAbrirURL(boolean modified) {
        this.modifiedFormaPagoAbrirURL = modified;
    }

   /**
    * Returns the value of the <code>formaPagoEsVisible</code> attribute.<br>
    * Model Attribute: <code>formaPagoEsVisible</code>. Variable Bool<br>
    * Comments: El CORE mandará todas, pero solo podemos ver algunas<br>
    * @return The value of the <code>formaPagoEsVisible</code> attribute.
    */

    public Boolean getFormaPagoEsVisible()  {
    	Boolean value;
        value =  formaPagoEsVisible;
        return value;
    }

   /**
    * Sets the value of the <code>formaPagoEsVisible</code> attribute.<br>
    * Model Attribute: <code>formaPagoEsVisible</code>. Variable Bool<br>
    * Comments: El CORE mandará todas, pero solo podemos ver algunas<br>
    * @param formaPagoEsVisible The new value of the <code>formaPagoEsVisible</code> attribute.
    */
    public void setFormaPagoEsVisible (Boolean formaPagoEsVisible) {
        modifiedFormaPagoEsVisible = true;
        this.formaPagoEsVisible = formaPagoEsVisible;
    }

   /**
    * Returns the value of the <code>modifiedFormaPagoEsVisible</code> class property.<br>
    *
    * @return The value of the <code>modifiedFormaPagoEsVisible</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFormaPagoEsVisible() {
        return modifiedFormaPagoEsVisible;
    }

   /**
    * Sets the value of the <code>modifiedFormaPagoEsVisible</code> class property.<br>
    * @param modified The new value of the <code>modifiedFormaPagoEsVisible</code>.
    */
    public void setModifiedFormaPagoEsVisible(boolean modified) {
        this.modifiedFormaPagoEsVisible = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominios 0:M  ------ 0:M  FormasPago [FormaPago]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     */
    @JsonIgnore
    public Collection <Dominio> getDominios() {
        return dominios;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * @param dominios The instance to add to the <code>Dominios</code> role.
     */
    public void add2Dominios(Dominio dominios) {
        this.dominios.add(dominios);
    }
    /**
     * Removes an instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * @param dominios The instance to be removed
     */
    public void removeFromDominios(Dominio dominios) {
    	this.dominios.remove(dominios);
    }
    /**
     * Sets instances of <code>Dominio</code> related through the <code>Dominios</code> role.
     * @param dominios The new value for the <code>Dominios</code> role.
     */
    public void setDominios(Collection < Dominio > dominios) {
        this.dominios = dominios;
    }

   /**
    * This method gets the attribute value <code>modifiedDominios</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominios</code> has been modified.
    */
    public boolean isModifiedDominios(){
        return modifiedDominios;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitudes 0:M  ------ 0:1  FormaPago [FormaPago]</code>
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
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratosC 0:M  ------ 0:1  FormaPagoC [FormaPago]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Adds an instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * @param contratosC The instance to add to the <code>ContratosC</code> role.
     */
    public void add2ContratosC(ContratoC contratosC) {
        this.contratosC.add(contratosC);
    }
    /**
     * Removes an instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * @param contratosC The instance to be removed
     */
    public void removeFromContratosC(ContratoC contratosC) {
    	this.contratosC.remove(contratosC);
    }
    /**
     * Sets instances of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * @param contratosC The new value for the <code>ContratosC</code> role.
     */
    public void setContratosC(Collection < ContratoC > contratosC) {
        this.contratosC = contratosC;
    }

   /**
    * This method gets the attribute value <code>modifiedContratosC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratosC</code> has been modified.
    */
    public boolean isModifiedContratosC(){
        return modifiedContratosC;
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
        formaPagoDescripcion = "";
        formaPagoAbrirURL = false;
        formaPagoEsVisible = false;
        dominios = null;
        solicitudes = null;
        contratosC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return FormaPago.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return FormaPagoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedFormaPagoDescripcion = false;
    	values.put("formaPagoDescripcion", getFormaPagoDescripcion());
    	modifiedFormaPagoAbrirURL = false;
    	values.put("formaPagoAbrirURL", getFormaPagoAbrirURL());
    	modifiedFormaPagoEsVisible = false;
    	values.put("formaPagoEsVisible", getFormaPagoEsVisible());
    	modifiedDominios = false;
    	modifiedSolicitudes = false;
    	modifiedContratosC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>FormaPagoOid</code> object that identifies this instance of <code>FormaPago</code>.
     * @return <code>FormaPagoOid </code> object that identifies this instance of <code>FormaPago</code>
     */
	@Override
    public FormaPagoOid getOid() {
        return new FormaPagoOid(getFormaPagoCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(FormaPagoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.FORMAPAGO)) {
            // Add this class
            activeFacets.add(Constants.FORMAPAGO);
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
            relatedInstance = buildFormaPagoRelatedInstance(relatedInstanceJsonOid);
        }
        if (FormaPagoConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFormaPagoRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (FormaPagoConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFormaPagoRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (FormaPagoConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFormaPagoRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFormaPagoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FormaPago(mapper.readValue(relatedInstanceJsonOid, FormaPagoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FormaPago.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFormaPagoRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FormaPago.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFormaPagoRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FormaPago.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFormaPagoRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FormaPago.class).error(e.getMessage());
            return null;
        }
    }
}
