package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PriorizacionSolicitudesConstants;
import com.keralty.aepersonas.persistence.oid.LogPriorizacionSolOid;
import com.keralty.aepersonas.persistence.oid.PriorizacionSolicitudesOid;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
 * Persistent representation of the <code>PriorizacionSolicitudes</code> model class.
 * <p>
 * Model Class: <code>PriorizacionSolicitudes</code><br>
 */
@Entity(name = PriorizacionSolicitudesConstants.CLASS_NAME)
@Table(name = PriorizacionSolicitudesConstants.TBL_NAME)
public class PriorizacionSolicitudes extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private PriorizacionSolicitudesOid oid;

    /** Class identification function. */
    @Column(name = PriorizacionSolicitudesConstants.FLD_PRIORIZACIONSOLICITUDESESTADOSOLICITUD, insertable = false, updatable = false )
    @JsonProperty(value="estadosolicitud")
    private Long priorizacionSolicitudesEstadoSolicitud;

    /** Class identification function. */
    @Column(name = PriorizacionSolicitudesConstants.FLD_PRIORIZACIONSOLICITUDESESTADODOC, insertable = false, updatable = false )
    @JsonProperty(value="estadodoc")
    private Long priorizacionSolicitudesEstadoDoc;

    /** Class member attribute. */
    @Column(name = PriorizacionSolicitudesConstants.FLD_PRIORIZACIONSOLICITUDESPRIORIDAD )
    @JsonProperty(value="prioridad")
    private Long priorizacionSolicitudesPrioridad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPriorizacionSolicitudesPrioridad;

    /** Related Class. */
    @OneToMany(mappedBy = PriorizacionSolicitudesConstants.ROLE_INVNAME_LOGPRIORIZACIONSOL)
    @JsonIgnore
    private Collection <LogPriorizacionSol> logPriorizacionSol;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogPriorizacionSol;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public PriorizacionSolicitudes() {
        priorizacionSolicitudesEstadoSolicitud = null;
        priorizacionSolicitudesEstadoDoc = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>PriorizacionSolicitudes</code>.
     * @param oid Object Identifier of the instance of <code>PriorizacionSolicitudes</code> to be created.
     * @throws SystemException
     */
    public PriorizacionSolicitudes(PriorizacionSolicitudesOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            priorizacionSolicitudesEstadoSolicitud = oid.getPriorizacionSolicitudesEstadoSolicitud();
            priorizacionSolicitudesEstadoDoc = oid.getPriorizacionSolicitudesEstadoDoc();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>priorizacionSolicitudesEstadoSolicitud</code> attribute<br>in class <code>PriorizacionSolicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PriorizacionSolicitudes</code>
     * @return The value of the <code>priorizacionSolicitudesEstadoSolicitud</code> attribute<br>in class <code>PriorizacionSolicitudes</code>.
     */
    public Long getPriorizacionSolicitudesEstadoSolicitud() {
        return priorizacionSolicitudesEstadoSolicitud;
    }

    /**
     * Sets the value of the <code>priorizacionSolicitudesEstadoSolicitud</code> attribute<br>in class <code>PriorizacionSolicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PriorizacionSolicitudes</code>
     * @param priorizacionSolicitudesEstadoSolicitud The new value of the <code>priorizacionSolicitudesEstadoSolicitud</code> attribute<br>in class <code>PriorizacionSolicitudes</code>.
     */
    public void setPriorizacionSolicitudesEstadoSolicitud(Long priorizacionSolicitudesEstadoSolicitud) {
        this.priorizacionSolicitudesEstadoSolicitud = priorizacionSolicitudesEstadoSolicitud;
    }

    /**
     * Returns the value of the <code>priorizacionSolicitudesEstadoDoc</code> attribute<br>in class <code>PriorizacionSolicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PriorizacionSolicitudes</code>
     * @return The value of the <code>priorizacionSolicitudesEstadoDoc</code> attribute<br>in class <code>PriorizacionSolicitudes</code>.
     */
    public Long getPriorizacionSolicitudesEstadoDoc() {
        return priorizacionSolicitudesEstadoDoc;
    }

    /**
     * Sets the value of the <code>priorizacionSolicitudesEstadoDoc</code> attribute<br>in class <code>PriorizacionSolicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PriorizacionSolicitudes</code>
     * @param priorizacionSolicitudesEstadoDoc The new value of the <code>priorizacionSolicitudesEstadoDoc</code> attribute<br>in class <code>PriorizacionSolicitudes</code>.
     */
    public void setPriorizacionSolicitudesEstadoDoc(Long priorizacionSolicitudesEstadoDoc) {
        this.priorizacionSolicitudesEstadoDoc = priorizacionSolicitudesEstadoDoc;
    }

   /**
    * Returns the value of the <code>priorizacionSolicitudesPrioridad</code> attribute.<br>
    * Model Attribute: <code>priorizacionSolicitudesPrioridad</code>. Variable Nat<br>
    * Comments: <br>
    * @return The value of the <code>priorizacionSolicitudesPrioridad</code> attribute.
    */

    public Long getPriorizacionSolicitudesPrioridad()  {
    	Long value;
        value =  priorizacionSolicitudesPrioridad;
        return value;
    }

   /**
    * Sets the value of the <code>priorizacionSolicitudesPrioridad</code> attribute.<br>
    * Model Attribute: <code>priorizacionSolicitudesPrioridad</code>. Variable Nat<br>
    * Comments: <br>
    * @param priorizacionSolicitudesPrioridad The new value of the <code>priorizacionSolicitudesPrioridad</code> attribute.
    */
    public void setPriorizacionSolicitudesPrioridad (Long priorizacionSolicitudesPrioridad) {
        modifiedPriorizacionSolicitudesPrioridad = true;
        this.priorizacionSolicitudesPrioridad = priorizacionSolicitudesPrioridad;
    }

   /**
    * Returns the value of the <code>modifiedPriorizacionSolicitudesPrioridad</code> class property.<br>
    *
    * @return The value of the <code>modifiedPriorizacionSolicitudesPrioridad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPriorizacionSolicitudesPrioridad() {
        return modifiedPriorizacionSolicitudesPrioridad;
    }

   /**
    * Sets the value of the <code>modifiedPriorizacionSolicitudesPrioridad</code> class property.<br>
    * @param modified The new value of the <code>modifiedPriorizacionSolicitudesPrioridad</code>.
    */
    public void setModifiedPriorizacionSolicitudesPrioridad(boolean modified) {
        this.modifiedPriorizacionSolicitudesPrioridad = modified;
    }

    /**
     * Returns the instance of <code>LogPriorizacionSol</code> related through the <code>LogPriorizacionSol</code> role.
     * Model Relationship:
     * <code>[LogPriorizacionSol] LogPriorizacionSol 0:M  ------ 0:1  PriSolicitud [PriorizacionSolicitudes]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogPriorizacionSol</code> related through the <code>LogPriorizacionSol</code> role.
     */
    @JsonIgnore
    public Collection <LogPriorizacionSol> getLogPriorizacionSol() {
        return logPriorizacionSol;
    }

    /**
     * Adds an instance of <code>LogPriorizacionSol</code> related through the <code>LogPriorizacionSol</code> role.
     * @param logPriorizacionSol The instance to add to the <code>LogPriorizacionSol</code> role.
     */
    public void add2LogPriorizacionSol(LogPriorizacionSol logPriorizacionSol) {
        this.logPriorizacionSol.add(logPriorizacionSol);
    }
    /**
     * Removes an instance of <code>LogPriorizacionSol</code> related through the <code>LogPriorizacionSol</code> role.
     * @param logPriorizacionSol The instance to be removed
     */
    public void removeFromLogPriorizacionSol(LogPriorizacionSol logPriorizacionSol) {
    	this.logPriorizacionSol.remove(logPriorizacionSol);
    }
    /**
     * Sets instances of <code>LogPriorizacionSol</code> related through the <code>LogPriorizacionSol</code> role.
     * @param logPriorizacionSol The new value for the <code>LogPriorizacionSol</code> role.
     */
    public void setLogPriorizacionSol(Collection < LogPriorizacionSol > logPriorizacionSol) {
        this.logPriorizacionSol = logPriorizacionSol;
    }

   /**
    * This method gets the attribute value <code>modifiedLogPriorizacionSol</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogPriorizacionSol</code> has been modified.
    */
    public boolean isModifiedLogPriorizacionSol(){
        return modifiedLogPriorizacionSol;
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
        priorizacionSolicitudesPrioridad = Long.valueOf(0);
        logPriorizacionSol = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return PriorizacionSolicitudes.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PriorizacionSolicitudesConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPriorizacionSolicitudesPrioridad = false;
    	values.put("priorizacionSolicitudesPrioridad", getPriorizacionSolicitudesPrioridad());
    	modifiedLogPriorizacionSol = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>PriorizacionSolicitudesOid</code> object that identifies this instance of <code>PriorizacionSolicitudes</code>.
     * @return <code>PriorizacionSolicitudesOid </code> object that identifies this instance of <code>PriorizacionSolicitudes</code>
     */
	@Override
    public PriorizacionSolicitudesOid getOid() {
        return new PriorizacionSolicitudesOid(getPriorizacionSolicitudesEstadoSolicitud(), getPriorizacionSolicitudesEstadoDoc());
    }

    /**
     * Sets the <code>PriorizacionSolicitudesOid</code> object that identifies this instance of <code>PriorizacionSolicitudes</code>.
     */    
    public void setOid(PriorizacionSolicitudesOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PriorizacionSolicitudesConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PRIORIZACIONSOLICITUDES)) {
            // Add this class
            activeFacets.add(Constants.PRIORIZACIONSOLICITUDES);
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


        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO) || getAgent().isFacetActive(Constants.USUARIOSISTEMAEXTERNO)) {
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
            relatedInstance = buildPriorizacionSolicitudesRelatedInstance(relatedInstanceJsonOid);
        }
        if (PriorizacionSolicitudesConstants.ROLE_NAME_LOGPRIORIZACIONSOL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPriorizacionSolicitudesRelatedInstance4LogPriorizacionSol(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPriorizacionSolicitudesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PriorizacionSolicitudes(mapper.readValue(relatedInstanceJsonOid, PriorizacionSolicitudesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PriorizacionSolicitudes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPriorizacionSolicitudesRelatedInstance4LogPriorizacionSol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogPriorizacionSol(mapper.readValue(relatedInstanceJsonOid, LogPriorizacionSolOid.class)): LogPriorizacionSol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PriorizacionSolicitudes.class).error(e.getMessage());
            return null;
        }
    }
}
