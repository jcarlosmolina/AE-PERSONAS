package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TipoSucursalCConstants;
import com.keralty.aepersonas.persistence.oid.DirSucursalCOid;
import com.keralty.aepersonas.persistence.oid.TipoSucursalCOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
 * Persistent representation of the <code>TipoSucursalC</code> model class.
 * <p>
 * Model Class: <code>TipoSucursalC</code><br>
 */
@Entity(name = TipoSucursalCConstants.CLASS_NAME)
@Table(name = TipoSucursalCConstants.TBL_NAME)
public class TipoSucursalC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = TipoSucursalCConstants.FLD_TIPOSUCURSALCCODIGO )
    @JsonProperty(value="codigo")
    private Long tipoSucursalCCodigo;

    /** Class member attribute. */
    @Column(name = TipoSucursalCConstants.FLD_TIPOSUCURSALCDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String tipoSucursalCDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoSucursalCDescripcion;

    /** Related Class. */
    @ManyToMany(mappedBy=TipoSucursalCConstants.ROLE_INVNAME_DIRSUCURSALESC)
    @JsonIgnore
    private Collection <DirSucursalC> dirSucursalesC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalesC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public TipoSucursalC() {
        tipoSucursalCCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TipoSucursalC</code>.
     * @param oid Object Identifier of the instance of <code>TipoSucursalC</code> to be created.
     * @throws SystemException
     */
    public TipoSucursalC(TipoSucursalCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            tipoSucursalCCodigo = oid.getTipoSucursalCCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>tipoSucursalCCodigo</code> attribute<br>in class <code>TipoSucursalC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoSucursalC</code>
     * @return The value of the <code>tipoSucursalCCodigo</code> attribute<br>in class <code>TipoSucursalC</code>.
     */
    public Long getTipoSucursalCCodigo() {
        return tipoSucursalCCodigo;
    }

    /**
     * Sets the value of the <code>tipoSucursalCCodigo</code> attribute<br>in class <code>TipoSucursalC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoSucursalC</code>
     * @param tipoSucursalCCodigo The new value of the <code>tipoSucursalCCodigo</code> attribute<br>in class <code>TipoSucursalC</code>.
     */
    public void setTipoSucursalCCodigo(Long tipoSucursalCCodigo) {
        this.tipoSucursalCCodigo = tipoSucursalCCodigo;
    }

   /**
    * Returns the value of the <code>tipoSucursalCDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoSucursalCDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>tipoSucursalCDescripcion</code> attribute.
    */

    public String getTipoSucursalCDescripcion()  {
    	String value;
        value =  tipoSucursalCDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoSucursalCDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoSucursalCDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param tipoSucursalCDescripcion The new value of the <code>tipoSucursalCDescripcion</code> attribute.
    */
    public void setTipoSucursalCDescripcion (String tipoSucursalCDescripcion) {
        modifiedTipoSucursalCDescripcion = true;
        this.tipoSucursalCDescripcion = tipoSucursalCDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedTipoSucursalCDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoSucursalCDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoSucursalCDescripcion() {
        return modifiedTipoSucursalCDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedTipoSucursalCDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoSucursalCDescripcion</code>.
    */
    public void setModifiedTipoSucursalCDescripcion(boolean modified) {
        this.modifiedTipoSucursalCDescripcion = modified;
    }

    /**
     * Returns the instance of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     * Model Relationship:
     * <code>[DirSucursalC] DirSucursalesC 0:M  ------ 0:M  TiposSucursalC [TipoSucursalC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalesC() {
        return dirSucursalesC;
    }

    /**
     * Adds an instance of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     * @param dirSucursalesC The instance to add to the <code>DirSucursalesC</code> role.
     */
    public void add2DirSucursalesC(DirSucursalC dirSucursalesC) {
        this.dirSucursalesC.add(dirSucursalesC);
    }
    /**
     * Removes an instance of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     * @param dirSucursalesC The instance to be removed
     */
    public void removeFromDirSucursalesC(DirSucursalC dirSucursalesC) {
    	this.dirSucursalesC.remove(dirSucursalesC);
    }
    /**
     * Sets instances of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     * @param dirSucursalesC The new value for the <code>DirSucursalesC</code> role.
     */
    public void setDirSucursalesC(Collection < DirSucursalC > dirSucursalesC) {
        this.dirSucursalesC = dirSucursalesC;
    }

   /**
    * This method gets the attribute value <code>modifiedDirSucursalesC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDirSucursalesC</code> has been modified.
    */
    public boolean isModifiedDirSucursalesC(){
        return modifiedDirSucursalesC;
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
        tipoSucursalCDescripcion = "";
        dirSucursalesC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return TipoSucursalC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TipoSucursalCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedTipoSucursalCDescripcion = false;
    	values.put("tipoSucursalCDescripcion", getTipoSucursalCDescripcion());
    	modifiedDirSucursalesC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>TipoSucursalCOid</code> object that identifies this instance of <code>TipoSucursalC</code>.
     * @return <code>TipoSucursalCOid </code> object that identifies this instance of <code>TipoSucursalC</code>
     */
	@Override
    public TipoSucursalCOid getOid() {
        return new TipoSucursalCOid(getTipoSucursalCCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TipoSucursalCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TIPOSUCURSALC)) {
            // Add this class
            activeFacets.add(Constants.TIPOSUCURSALC);
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
            relatedInstance = buildTipoSucursalCRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoSucursalCConstants.ROLE_NAME_DIRSUCURSALESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoSucursalCRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoSucursalCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoSucursalC(mapper.readValue(relatedInstanceJsonOid, TipoSucursalCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoSucursalCRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
