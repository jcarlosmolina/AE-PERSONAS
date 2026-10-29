package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.MotivoExcepcionSolNovConstants;
import com.keralty.aepersonas.persistence.oid.MotivoExcepcionSolNovOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
 * Persistent representation of the <code>MotivoExcepcionSolNov</code> model class.
 * <p>
 * Model Class: <code>MotivoExcepcionSolNov</code><br>
 */
@Entity(name = MotivoExcepcionSolNovConstants.CLASS_NAME)
@Table(name = MotivoExcepcionSolNovConstants.TBL_NAME)
public class MotivoExcepcionSolNov extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MotivoExcepcionSolNov_Sequence")
    @SequenceGenerator(name="MotivoExcepcionSolNov_Sequence", sequenceName="MotivoExcepcionSolNov_Sequence", allocationSize=1)
    @Column(name = MotivoExcepcionSolNovConstants.FLD_MOTIVOEXCEPCIONSOLNOVID )
    @JsonProperty(value="id")
    private Long motivoExcepcionSolNovId;

    /** Class member attribute. */
    @Column(name = MotivoExcepcionSolNovConstants.FLD_MOTIVOEXCEPCIONSOLNOVDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String motivoExcepcionSolNovDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMotivoExcepcionSolNovDescripcion;

    /** Related Class. */
    @OneToMany(mappedBy = MotivoExcepcionSolNovConstants.ROLE_INVNAME_SOLICITUDES)
    @JsonIgnore
    private Collection <SolicitudNovedad> solicitudes;
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
    public MotivoExcepcionSolNov() {
        motivoExcepcionSolNovId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>MotivoExcepcionSolNov</code>.
     * @param oid Object Identifier of the instance of <code>MotivoExcepcionSolNov</code> to be created.
     * @throws SystemException
     */
    public MotivoExcepcionSolNov(MotivoExcepcionSolNovOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            motivoExcepcionSolNovId = oid.getMotivoExcepcionSolNovId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>motivoExcepcionSolNovId</code> attribute<br>in class <code>MotivoExcepcionSolNov</code>.
     * This is part of the identification for this class, which depends on the identification of <code>MotivoExcepcionSolNov</code>
     * @return The value of the <code>motivoExcepcionSolNovId</code> attribute<br>in class <code>MotivoExcepcionSolNov</code>.
     */
    public Long getMotivoExcepcionSolNovId() {
        return motivoExcepcionSolNovId;
    }

    /**
     * Sets the value of the <code>motivoExcepcionSolNovId</code> attribute<br>in class <code>MotivoExcepcionSolNov</code>.
     * This is part of the identification for this class, which depends on the identification of <code>MotivoExcepcionSolNov</code>
     * @param motivoExcepcionSolNovId The new value of the <code>motivoExcepcionSolNovId</code> attribute<br>in class <code>MotivoExcepcionSolNov</code>.
     */
    public void setMotivoExcepcionSolNovId(Long motivoExcepcionSolNovId) {
        this.motivoExcepcionSolNovId = motivoExcepcionSolNovId;
    }

   /**
    * Returns the value of the <code>motivoExcepcionSolNovDescripcion</code> attribute.<br>
    * Model Attribute: <code>motivoExcepcionSolNovDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>motivoExcepcionSolNovDescripcion</code> attribute.
    */

    public String getMotivoExcepcionSolNovDescripcion()  {
    	String value;
        value =  motivoExcepcionSolNovDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>motivoExcepcionSolNovDescripcion</code> attribute.<br>
    * Model Attribute: <code>motivoExcepcionSolNovDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param motivoExcepcionSolNovDescripcion The new value of the <code>motivoExcepcionSolNovDescripcion</code> attribute.
    */
    public void setMotivoExcepcionSolNovDescripcion (String motivoExcepcionSolNovDescripcion) {
        modifiedMotivoExcepcionSolNovDescripcion = true;
        this.motivoExcepcionSolNovDescripcion = motivoExcepcionSolNovDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedMotivoExcepcionSolNovDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedMotivoExcepcionSolNovDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMotivoExcepcionSolNovDescripcion() {
        return modifiedMotivoExcepcionSolNovDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedMotivoExcepcionSolNovDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedMotivoExcepcionSolNovDescripcion</code>.
    */
    public void setModifiedMotivoExcepcionSolNovDescripcion(boolean modified) {
        this.modifiedMotivoExcepcionSolNovDescripcion = modified;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] Solicitudes 0:M  ------ 0:1  MotivoExcepcion [MotivoExcepcionSolNov]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Adds an instance of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to add to the <code>Solicitudes</code> role.
     */
    public void add2Solicitudes(SolicitudNovedad solicitudes) {
        this.solicitudes.add(solicitudes);
    }
    /**
     * Removes an instance of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to be removed
     */
    public void removeFromSolicitudes(SolicitudNovedad solicitudes) {
    	this.solicitudes.remove(solicitudes);
    }
    /**
     * Sets instances of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The new value for the <code>Solicitudes</code> role.
     */
    public void setSolicitudes(Collection < SolicitudNovedad > solicitudes) {
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
        motivoExcepcionSolNovDescripcion = "";
        solicitudes = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return MotivoExcepcionSolNov.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return MotivoExcepcionSolNovConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedMotivoExcepcionSolNovDescripcion = false;
    	values.put("motivoExcepcionSolNovDescripcion", getMotivoExcepcionSolNovDescripcion());
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
     * Returns the <code>MotivoExcepcionSolNovOid</code> object that identifies this instance of <code>MotivoExcepcionSolNov</code>.
     * @return <code>MotivoExcepcionSolNovOid </code> object that identifies this instance of <code>MotivoExcepcionSolNov</code>
     */
	@Override
    public MotivoExcepcionSolNovOid getOid() {
        return new MotivoExcepcionSolNovOid(getMotivoExcepcionSolNovId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(MotivoExcepcionSolNovConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.MOTIVOEXCEPCIONSOLNOV)) {
            // Add this class
            activeFacets.add(Constants.MOTIVOEXCEPCIONSOLNOV);
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
            relatedInstance = buildMotivoExcepcionSolNovRelatedInstance(relatedInstanceJsonOid);
        }
        if (MotivoExcepcionSolNovConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMotivoExcepcionSolNovRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildMotivoExcepcionSolNovRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new MotivoExcepcionSolNov(mapper.readValue(relatedInstanceJsonOid, MotivoExcepcionSolNovOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MotivoExcepcionSolNov.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMotivoExcepcionSolNovRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MotivoExcepcionSolNov.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
