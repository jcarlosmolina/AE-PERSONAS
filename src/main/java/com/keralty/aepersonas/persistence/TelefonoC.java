package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DireccionCConstants;
import com.keralty.aepersonas.global.DirSucursalCConstants;
import com.keralty.aepersonas.global.TelefonoCConstants;
import com.keralty.aepersonas.persistence.oid.DireccionCOid;
import com.keralty.aepersonas.persistence.oid.DirSucursalCOid;
import com.keralty.aepersonas.persistence.oid.TelefonoCOid;
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
 * Persistent representation of the <code>TelefonoC</code> model class.
 * <p>
 * Model Class: <code>TelefonoC</code><br>
 */
@Entity(name = TelefonoCConstants.CLASS_NAME)
@Table(name = TelefonoCConstants.TBL_NAME)
public class TelefonoC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TelefonoC_Sequence")
    @SequenceGenerator(name="TelefonoC_Sequence", sequenceName="TelefonoC_Sequence", allocationSize=1)
    @Column(name = TelefonoCConstants.FLD_TELEFONOCID )
    @JsonProperty(value="id")
    private Long telefonoCID;

    /** Class member attribute. */
    @Column(name = TelefonoCConstants.FLD_TELEFONOCCODIGO )
    @JsonProperty(value="codigo")
    private Long telefonoCCodigo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTelefonoCCodigo;

    /** Class member attribute. */
    @Column(name = TelefonoCConstants.FLD_TELEFONOCTELEFONO )
    @JsonProperty(value="telefono")
    private String telefonoCTelefono;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTelefonoCTelefono;

    /** Class member attribute. */
    @Column(name = TelefonoCConstants.FLD_TELEFONOCINDICATIVOPAIS )
    @JsonProperty(value="indicativopais")
    private String telefonoCIndicativoPais;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTelefonoCIndicativoPais;

    /** Class member attribute. */
    @Column(name = TelefonoCConstants.FLD_TELEFONOCCODIGOAREA )
    @JsonProperty(value="codigoarea")
    private String telefonoCCodigoArea;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTelefonoCCodigoArea;

    /** Class member attribute. */
    @Column(name = TelefonoCConstants.FLD_TELEFONOCEXT )
    @JsonProperty(value="ext")
    private String telefonoCExt;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTelefonoCExt;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=TelefonoCConstants.FLD_DIRSUCURSALCDIRSUCURSALCCODIGO, referencedColumnName=DirSucursalCConstants.FLD_DIRSUCURSALCCODIGO)
    })
    @JsonIgnore
    private DirSucursalC dirSucursalC;
    /** Related attribute. */
    @Column(name = TelefonoCConstants.FLD_DIRSUCURSALCDIRSUCURSALCCODIGO, insertable = false, updatable = false)
    private Long dirSucursalCDirSucursalCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=TelefonoCConstants.FLD_DIRECCIONCDIRECCIONCCODIGO, referencedColumnName=DireccionCConstants.FLD_DIRECCIONCCODIGO)
    })
    @JsonIgnore
    private DireccionC direccionC;
    /** Related attribute. */
    @Column(name = TelefonoCConstants.FLD_DIRECCIONCDIRECCIONCCODIGO, insertable = false, updatable = false)
    private Long direccionCDireccionCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public TelefonoC() {
        telefonoCID = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TelefonoC</code>.
     * @param oid Object Identifier of the instance of <code>TelefonoC</code> to be created.
     * @throws SystemException
     */
    public TelefonoC(TelefonoCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            telefonoCID = oid.getTelefonoCID();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>telefonoCID</code> attribute<br>in class <code>TelefonoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TelefonoC</code>
     * @return The value of the <code>telefonoCID</code> attribute<br>in class <code>TelefonoC</code>.
     */
    public Long getTelefonoCID() {
        return telefonoCID;
    }

    /**
     * Sets the value of the <code>telefonoCID</code> attribute<br>in class <code>TelefonoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TelefonoC</code>
     * @param telefonoCID The new value of the <code>telefonoCID</code> attribute<br>in class <code>TelefonoC</code>.
     */
    public void setTelefonoCID(Long telefonoCID) {
        this.telefonoCID = telefonoCID;
    }

   /**
    * Returns the value of the <code>telefonoCCodigo</code> attribute.<br>
    * Model Attribute: <code>telefonoCCodigo</code>. Constant Int<br>
    * Comments: consecutivo de la tabla de telefonos<br>
    * @return The value of the <code>telefonoCCodigo</code> attribute.
    */

    public Long getTelefonoCCodigo()  {
    	Long value;
        value =  telefonoCCodigo;
        return value;
    }

   /**
    * Sets the value of the <code>telefonoCCodigo</code> attribute.<br>
    * Model Attribute: <code>telefonoCCodigo</code>. Constant Int<br>
    * Comments: consecutivo de la tabla de telefonos<br>
    * @param telefonoCCodigo The new value of the <code>telefonoCCodigo</code> attribute.
    */
    public void setTelefonoCCodigo (Long telefonoCCodigo) {
        modifiedTelefonoCCodigo = true;
        this.telefonoCCodigo = telefonoCCodigo;
    }

   /**
    * Returns the value of the <code>modifiedTelefonoCCodigo</code> class property.<br>
    *
    * @return The value of the <code>modifiedTelefonoCCodigo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTelefonoCCodigo() {
        return modifiedTelefonoCCodigo;
    }

   /**
    * Sets the value of the <code>modifiedTelefonoCCodigo</code> class property.<br>
    * @param modified The new value of the <code>modifiedTelefonoCCodigo</code>.
    */
    public void setModifiedTelefonoCCodigo(boolean modified) {
        this.modifiedTelefonoCCodigo = modified;
    }

   /**
    * Returns the value of the <code>telefonoCTelefono</code> attribute.<br>
    * Model Attribute: <code>telefonoCTelefono</code>. Variable String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>telefonoCTelefono</code> attribute.
    */

    public String getTelefonoCTelefono()  {
    	String value;
        value =  telefonoCTelefono;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>telefonoCTelefono</code> attribute.<br>
    * Model Attribute: <code>telefonoCTelefono</code>. Variable String Size=15<br>
    * Comments: <br>
    * @param telefonoCTelefono The new value of the <code>telefonoCTelefono</code> attribute.
    */
    public void setTelefonoCTelefono (String telefonoCTelefono) {
        modifiedTelefonoCTelefono = true;
        this.telefonoCTelefono = telefonoCTelefono;
    }

   /**
    * Returns the value of the <code>modifiedTelefonoCTelefono</code> class property.<br>
    *
    * @return The value of the <code>modifiedTelefonoCTelefono</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTelefonoCTelefono() {
        return modifiedTelefonoCTelefono;
    }

   /**
    * Sets the value of the <code>modifiedTelefonoCTelefono</code> class property.<br>
    * @param modified The new value of the <code>modifiedTelefonoCTelefono</code>.
    */
    public void setModifiedTelefonoCTelefono(boolean modified) {
        this.modifiedTelefonoCTelefono = modified;
    }

   /**
    * Returns the value of the <code>telefonoCIndicativoPais</code> attribute.<br>
    * Model Attribute: <code>telefonoCIndicativoPais</code>. Variable String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>telefonoCIndicativoPais</code> attribute.
    */

    public String getTelefonoCIndicativoPais()  {
    	String value;
        value =  telefonoCIndicativoPais;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>telefonoCIndicativoPais</code> attribute.<br>
    * Model Attribute: <code>telefonoCIndicativoPais</code>. Variable String Size=10<br>
    * Comments: <br>
    * @param telefonoCIndicativoPais The new value of the <code>telefonoCIndicativoPais</code> attribute.
    */
    public void setTelefonoCIndicativoPais (String telefonoCIndicativoPais) {
        modifiedTelefonoCIndicativoPais = true;
        this.telefonoCIndicativoPais = telefonoCIndicativoPais;
    }

   /**
    * Returns the value of the <code>modifiedTelefonoCIndicativoPais</code> class property.<br>
    *
    * @return The value of the <code>modifiedTelefonoCIndicativoPais</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTelefonoCIndicativoPais() {
        return modifiedTelefonoCIndicativoPais;
    }

   /**
    * Sets the value of the <code>modifiedTelefonoCIndicativoPais</code> class property.<br>
    * @param modified The new value of the <code>modifiedTelefonoCIndicativoPais</code>.
    */
    public void setModifiedTelefonoCIndicativoPais(boolean modified) {
        this.modifiedTelefonoCIndicativoPais = modified;
    }

   /**
    * Returns the value of the <code>telefonoCCodigoArea</code> attribute.<br>
    * Model Attribute: <code>telefonoCCodigoArea</code>. Variable String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>telefonoCCodigoArea</code> attribute.
    */

    public String getTelefonoCCodigoArea()  {
    	String value;
        value =  telefonoCCodigoArea;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>telefonoCCodigoArea</code> attribute.<br>
    * Model Attribute: <code>telefonoCCodigoArea</code>. Variable String Size=10<br>
    * Comments: <br>
    * @param telefonoCCodigoArea The new value of the <code>telefonoCCodigoArea</code> attribute.
    */
    public void setTelefonoCCodigoArea (String telefonoCCodigoArea) {
        modifiedTelefonoCCodigoArea = true;
        this.telefonoCCodigoArea = telefonoCCodigoArea;
    }

   /**
    * Returns the value of the <code>modifiedTelefonoCCodigoArea</code> class property.<br>
    *
    * @return The value of the <code>modifiedTelefonoCCodigoArea</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTelefonoCCodigoArea() {
        return modifiedTelefonoCCodigoArea;
    }

   /**
    * Sets the value of the <code>modifiedTelefonoCCodigoArea</code> class property.<br>
    * @param modified The new value of the <code>modifiedTelefonoCCodigoArea</code>.
    */
    public void setModifiedTelefonoCCodigoArea(boolean modified) {
        this.modifiedTelefonoCCodigoArea = modified;
    }

   /**
    * Returns the value of the <code>telefonoCExt</code> attribute.<br>
    * Model Attribute: <code>telefonoCExt</code>. Variable String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>telefonoCExt</code> attribute.
    */

    public String getTelefonoCExt()  {
    	String value;
        value =  telefonoCExt;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>telefonoCExt</code> attribute.<br>
    * Model Attribute: <code>telefonoCExt</code>. Variable String Size=10<br>
    * Comments: <br>
    * @param telefonoCExt The new value of the <code>telefonoCExt</code> attribute.
    */
    public void setTelefonoCExt (String telefonoCExt) {
        modifiedTelefonoCExt = true;
        this.telefonoCExt = telefonoCExt;
    }

   /**
    * Returns the value of the <code>modifiedTelefonoCExt</code> class property.<br>
    *
    * @return The value of the <code>modifiedTelefonoCExt</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTelefonoCExt() {
        return modifiedTelefonoCExt;
    }

   /**
    * Sets the value of the <code>modifiedTelefonoCExt</code> class property.<br>
    * @param modified The new value of the <code>modifiedTelefonoCExt</code>.
    */
    public void setModifiedTelefonoCExt(boolean modified) {
        this.modifiedTelefonoCExt = modified;
    }

    /**
     * Returns the instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * Model Relationship:
     * <code>[DirSucursalC] DirSucursalC 0:1  ------ 0:M  TelefonosC [TelefonoC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     */
    @JsonIgnore
    public DirSucursalC getDirSucursalC() {
        return dirSucursalC;
    }

    /**
     * Adds an instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * @param dirSucursalC The instance to add to the <code>DirSucursalC</code> role.
     */
    public void add2DirSucursalC(DirSucursalC dirSucursalC) {
        if (dirSucursalC == null || dirSucursalC.isNull()) {
            this.modifiedDirSucursalC = true;
            this.dirSucursalCDirSucursalCCodigo = null;
        } else {
            this.dirSucursalCDirSucursalCCodigo = dirSucursalC.getDirSucursalCCodigo();
        }
        this.dirSucursalC = (dirSucursalC == null  || dirSucursalC.isNull() ? null : dirSucursalC);
    }

   /**
    * This method gets the attribute value <code>modifiedDirSucursalC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDirSucursalC</code> has been modified.
    */
    public boolean isModifiedDirSucursalC(){
        return modifiedDirSucursalC;
    }

    /**
     * Returns the instance of <code>DireccionC</code> related through the <code>DireccionC</code> role.
     * Model Relationship:
     * <code>[DireccionC] DireccionC 0:1  ------ 0:M  TelefonosC [TelefonoC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DireccionC</code> related through the <code>DireccionC</code> role.
     */
    @JsonIgnore
    public DireccionC getDireccionC() {
        return direccionC;
    }

    /**
     * Adds an instance of <code>DireccionC</code> related through the <code>DireccionC</code> role.
     * @param direccionC The instance to add to the <code>DireccionC</code> role.
     */
    public void add2DireccionC(DireccionC direccionC) {
        if (direccionC == null || direccionC.isNull()) {
            this.modifiedDireccionC = true;
            this.direccionCDireccionCCodigo = null;
        } else {
            this.direccionCDireccionCCodigo = direccionC.getDireccionCCodigo();
        }
        this.direccionC = (direccionC == null  || direccionC.isNull() ? null : direccionC);
    }

   /**
    * This method gets the attribute value <code>modifiedDireccionC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDireccionC</code> has been modified.
    */
    public boolean isModifiedDireccionC(){
        return modifiedDireccionC;
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
        telefonoCCodigo = Long.valueOf(0);
        telefonoCTelefono = null;
        telefonoCIndicativoPais = null;
        telefonoCCodigoArea = null;
        telefonoCExt = null;
        dirSucursalC = null;
        direccionC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return TelefonoC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TelefonoCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedTelefonoCCodigo = false;
    	values.put("telefonoCCodigo", getTelefonoCCodigo());
    	modifiedTelefonoCTelefono = false;
    	values.put("telefonoCTelefono", getTelefonoCTelefono());
    	modifiedTelefonoCIndicativoPais = false;
    	values.put("telefonoCIndicativoPais", getTelefonoCIndicativoPais());
    	modifiedTelefonoCCodigoArea = false;
    	values.put("telefonoCCodigoArea", getTelefonoCCodigoArea());
    	modifiedTelefonoCExt = false;
    	values.put("telefonoCExt", getTelefonoCExt());
    	modifiedDirSucursalC = false;
    	modifiedDireccionC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>TelefonoCOid</code> object that identifies this instance of <code>TelefonoC</code>.
     * @return <code>TelefonoCOid </code> object that identifies this instance of <code>TelefonoC</code>
     */
	@Override
    public TelefonoCOid getOid() {
        return new TelefonoCOid(getTelefonoCID());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TelefonoCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(TelefonoCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TELEFONOC)) {
            // Add this class
            activeFacets.add(Constants.TELEFONOC);
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
            relatedInstance = buildTelefonoCRelatedInstance(relatedInstanceJsonOid);
        }
        if (TelefonoCConstants.ROLE_NAME_DIRSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTelefonoCRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (TelefonoCConstants.ROLE_NAME_DIRECCIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTelefonoCRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTelefonoCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TelefonoC(mapper.readValue(relatedInstanceJsonOid, TelefonoCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TelefonoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTelefonoCRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TelefonoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTelefonoCRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TelefonoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
