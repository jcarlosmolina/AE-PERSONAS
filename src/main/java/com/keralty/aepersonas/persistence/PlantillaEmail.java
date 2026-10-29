package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PlantillaEmailConstants;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.PlantillaEmailOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
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
 * Persistent representation of the <code>PlantillaEmail</code> model class.
 * <p>
 * Model Class: <code>PlantillaEmail</code><br>
 */
@Entity(name = PlantillaEmailConstants.CLASS_NAME)
@Table(name = PlantillaEmailConstants.TBL_NAME)
public class PlantillaEmail extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PlantillaEmail_Sequence")
    @SequenceGenerator(name="PlantillaEmail_Sequence", sequenceName="PlantillaEmail_Sequence", allocationSize=1)
    @Column(name = PlantillaEmailConstants.FLD_PLANTILLAEMAILIDPLANTILLA )
    @JsonProperty(value="idplantilla")
    private Long plantillaEmailIdPlantilla;

    /** Class member attribute. */
    @Column(name = PlantillaEmailConstants.FLD_PLANTILLAEMAILCODIGO )
    @JsonProperty(value="codigo")
    private Long plantillaEmailCodigo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaEmailCodigo;

    /** Class member attribute. */
    @Column(name = PlantillaEmailConstants.FLD_PLANTILLAEMAILDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String plantillaEmailDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaEmailDescripcion;

    /** Class member attribute. */
    @Column(name = PlantillaEmailConstants.FLD_PLANTILLAEMAILASUNTO )
    @JsonProperty(value="asunto")
    private String plantillaEmailAsunto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaEmailAsunto;

    /** Class member attribute. */
    @Column(name = PlantillaEmailConstants.FLD_PLANTILLAEMAILTEXTOMENSAJE )
    @JsonProperty(value="textomensaje")
    private String plantillaEmailTextoMensaje;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaEmailTextoMensaje;

    @Transient
    @JsonIgnore
    public boolean plantillaEmailTextoMensajeInit = false;

    /** Class member attribute. */
    @Column(name = PlantillaEmailConstants.FLD_PLANTILLAEMAILEMAILCONF )
    @JsonProperty(value="emailconf")
    private String plantillaEmailEmailConf;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaEmailEmailConf;

    /** Related Class. */
    @ManyToMany(mappedBy=PlantillaEmailConstants.ROLE_INVNAME_DOMINIOS)
    @JsonIgnore
    private Collection <Dominio> dominios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominios;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public PlantillaEmail() {
        plantillaEmailIdPlantilla = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>PlantillaEmail</code>.
     * @param oid Object Identifier of the instance of <code>PlantillaEmail</code> to be created.
     * @throws SystemException
     */
    public PlantillaEmail(PlantillaEmailOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            plantillaEmailIdPlantilla = oid.getPlantillaEmailIdPlantilla();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>plantillaEmailIdPlantilla</code> attribute<br>in class <code>PlantillaEmail</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PlantillaEmail</code>
     * @return The value of the <code>plantillaEmailIdPlantilla</code> attribute<br>in class <code>PlantillaEmail</code>.
     */
    public Long getPlantillaEmailIdPlantilla() {
        return plantillaEmailIdPlantilla;
    }

    /**
     * Sets the value of the <code>plantillaEmailIdPlantilla</code> attribute<br>in class <code>PlantillaEmail</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PlantillaEmail</code>
     * @param plantillaEmailIdPlantilla The new value of the <code>plantillaEmailIdPlantilla</code> attribute<br>in class <code>PlantillaEmail</code>.
     */
    public void setPlantillaEmailIdPlantilla(Long plantillaEmailIdPlantilla) {
        this.plantillaEmailIdPlantilla = plantillaEmailIdPlantilla;
    }

   /**
    * Returns the value of the <code>plantillaEmailCodigo</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailCodigo</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>plantillaEmailCodigo</code> attribute.
    */

    public Long getPlantillaEmailCodigo()  {
    	Long value;
        value =  plantillaEmailCodigo;
        return value;
    }

   /**
    * Sets the value of the <code>plantillaEmailCodigo</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailCodigo</code>. Constant Nat<br>
    * Comments: <br>
    * @param plantillaEmailCodigo The new value of the <code>plantillaEmailCodigo</code> attribute.
    */
    public void setPlantillaEmailCodigo (Long plantillaEmailCodigo) {
        modifiedPlantillaEmailCodigo = true;
        this.plantillaEmailCodigo = plantillaEmailCodigo;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaEmailCodigo</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaEmailCodigo</code>.
    */
    public void setModifiedPlantillaEmailCodigo(boolean modified) {
        this.modifiedPlantillaEmailCodigo = modified;
    }

   /**
    * Returns the value of the <code>plantillaEmailDescripcion</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailDescripcion</code>. Constant String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>plantillaEmailDescripcion</code> attribute.
    */

    public String getPlantillaEmailDescripcion()  {
    	String value;
        value =  plantillaEmailDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>plantillaEmailDescripcion</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailDescripcion</code>. Constant String Size=255<br>
    * Comments: <br>
    * @param plantillaEmailDescripcion The new value of the <code>plantillaEmailDescripcion</code> attribute.
    */
    public void setPlantillaEmailDescripcion (String plantillaEmailDescripcion) {
        modifiedPlantillaEmailDescripcion = true;
        this.plantillaEmailDescripcion = plantillaEmailDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaEmailDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaEmailDescripcion</code>.
    */
    public void setModifiedPlantillaEmailDescripcion(boolean modified) {
        this.modifiedPlantillaEmailDescripcion = modified;
    }

   /**
    * Returns the value of the <code>plantillaEmailAsunto</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailAsunto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>plantillaEmailAsunto</code> attribute.
    */

    public String getPlantillaEmailAsunto()  {
    	String value;
        value =  plantillaEmailAsunto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>plantillaEmailAsunto</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailAsunto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @param plantillaEmailAsunto The new value of the <code>plantillaEmailAsunto</code> attribute.
    */
    public void setPlantillaEmailAsunto (String plantillaEmailAsunto) {
        modifiedPlantillaEmailAsunto = true;
        this.plantillaEmailAsunto = plantillaEmailAsunto;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaEmailAsunto</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaEmailAsunto</code>.
    */
    public void setModifiedPlantillaEmailAsunto(boolean modified) {
        this.modifiedPlantillaEmailAsunto = modified;
    }

   /**
    * Returns the value of the <code>plantillaEmailTextoMensaje</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailTextoMensaje</code>. Variable Text<br>
    * Comments: <br>
    * @return The value of the <code>plantillaEmailTextoMensaje</code> attribute.
    */

    public String getPlantillaEmailTextoMensaje()  {
    	String value;
        value =  plantillaEmailTextoMensaje;
        return value;
    }

   /**
    * Sets the value of the <code>plantillaEmailTextoMensaje</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailTextoMensaje</code>. Variable Text<br>
    * Comments: <br>
    * @param plantillaEmailTextoMensaje The new value of the <code>plantillaEmailTextoMensaje</code> attribute.
    */
    public void setPlantillaEmailTextoMensaje (String plantillaEmailTextoMensaje) {
        this.plantillaEmailTextoMensajeInit = true;
        modifiedPlantillaEmailTextoMensaje = true;
        this.plantillaEmailTextoMensaje = plantillaEmailTextoMensaje;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaEmailTextoMensaje</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaEmailTextoMensaje</code>.
    */
    public void setModifiedPlantillaEmailTextoMensaje(boolean modified) {
        this.modifiedPlantillaEmailTextoMensaje = modified;
    }

   /**
    * Returns the value of the <code>plantillaEmailEmailConf</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailEmailConf</code>. Variable String Size=100<br>
    * Comments: Dirección de correo electrónico del destinatario del mensaje de confirmación o error en la entrega del mensaje<br>
    * @return The value of the <code>plantillaEmailEmailConf</code> attribute.
    */

    public String getPlantillaEmailEmailConf()  {
    	String value;
        value =  plantillaEmailEmailConf;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>plantillaEmailEmailConf</code> attribute.<br>
    * Model Attribute: <code>plantillaEmailEmailConf</code>. Variable String Size=100<br>
    * Comments: Dirección de correo electrónico del destinatario del mensaje de confirmación o error en la entrega del mensaje<br>
    * @param plantillaEmailEmailConf The new value of the <code>plantillaEmailEmailConf</code> attribute.
    */
    public void setPlantillaEmailEmailConf (String plantillaEmailEmailConf) {
        modifiedPlantillaEmailEmailConf = true;
        this.plantillaEmailEmailConf = plantillaEmailEmailConf;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaEmailEmailConf</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaEmailEmailConf</code>.
    */
    public void setModifiedPlantillaEmailEmailConf(boolean modified) {
        this.modifiedPlantillaEmailEmailConf = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominios 0:M  ------ 0:M  Plantillas [PlantillaEmail]</code>
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
        plantillaEmailCodigo = Long.valueOf(0);
        plantillaEmailDescripcion = "";
        plantillaEmailAsunto = null;
        plantillaEmailTextoMensaje = "";
        plantillaEmailEmailConf = null;
        dominios = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return PlantillaEmail.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PlantillaEmailConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPlantillaEmailCodigo = false;
    	values.put("plantillaEmailCodigo", getPlantillaEmailCodigo());
    	modifiedPlantillaEmailDescripcion = false;
    	values.put("plantillaEmailDescripcion", getPlantillaEmailDescripcion());
    	modifiedPlantillaEmailAsunto = false;
    	values.put("plantillaEmailAsunto", getPlantillaEmailAsunto());
    	if (modifiedPlantillaEmailTextoMensaje) {
    		values.put("plantillaEmailTextoMensaje", plantillaEmailTextoMensaje);
    		modifiedPlantillaEmailTextoMensaje = false;
    	}
    	modifiedPlantillaEmailEmailConf = false;
    	values.put("plantillaEmailEmailConf", getPlantillaEmailEmailConf());
    	modifiedDominios = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>PlantillaEmailOid</code> object that identifies this instance of <code>PlantillaEmail</code>.
     * @return <code>PlantillaEmailOid </code> object that identifies this instance of <code>PlantillaEmail</code>
     */
	@Override
    public PlantillaEmailOid getOid() {
        return new PlantillaEmailOid(getPlantillaEmailIdPlantilla());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PlantillaEmailConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PLANTILLAEMAIL)) {
            // Add this class
            activeFacets.add(Constants.PLANTILLAEMAIL);
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
            relatedInstance = buildPlantillaEmailRelatedInstance(relatedInstanceJsonOid);
        }
        if (PlantillaEmailConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlantillaEmailRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPlantillaEmailRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PlantillaEmail(mapper.readValue(relatedInstanceJsonOid, PlantillaEmailOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PlantillaEmail.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlantillaEmailRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PlantillaEmail.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
