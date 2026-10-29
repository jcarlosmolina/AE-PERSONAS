package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.TipoIVAConstants;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.oid.TipoIVAOid;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>TipoIVA</code> model class.
 * <p>
 * Model Class: <code>TipoIVA</code><br>
 */
@Entity(name = TipoIVAConstants.CLASS_NAME)
@Table(name = TipoIVAConstants.TBL_NAME)
public class TipoIVA extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TipoIVA_Sequence")
    @SequenceGenerator(name="TipoIVA_Sequence", sequenceName="TipoIVA_Sequence", allocationSize=1)
    @Column(name = TipoIVAConstants.FLD_TIPOIVACODIGO )
    @JsonProperty(value="codigo")
    private Long tipoIVACodigo;

    /** Class member attribute. */
    @Column(name = TipoIVAConstants.FLD_TIPOIVADESCRIPCION )
    @JsonProperty(value="descripcion")
    private String tipoIVADescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIVADescripcion;

    /** Class member attribute. */
    @Column(name = TipoIVAConstants.FLD_TIPOIVAPORCENTAJE )
    @JsonProperty(value="porcentaje")
    private Double tipoIVAPorcentaje;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIVAPorcentaje;

    /** Class member attribute. */
    @Column(name = TipoIVAConstants.FLD_TIPOIVAFECHAINICIO )
    @JsonProperty(value="fechainicio")
    private Date tipoIVAFechaInicio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIVAFechaInicio;

    /** Class member attribute. */
    @Column(name = TipoIVAConstants.FLD_TIPOIVAFECHAFIN )
    @JsonProperty(value="fechafin")
    private Date tipoIVAFechaFin;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIVAFechaFin;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=TipoIVAConstants.FLD_PRODUCTOSPRODUCTO, referencedColumnName=ProductosConstants.FLD_PRODUCTOSPRODUCTO)
    })
    @JsonIgnore
    private Productos productoT;
    /** Related attribute. */
    @Column(name = TipoIVAConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false)
    private Long productosProducto;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProductoT;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=TipoIVAConstants.FLD_PLANESPLAN, referencedColumnName=PlanesConstants.FLD_PLANESPLAN)
    })
    @JsonIgnore
    private Planes planT;
    /** Related attribute. */
    @Column(name = TipoIVAConstants.FLD_PLANESPLAN, insertable = false, updatable = false)
    private Long planesPlan;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanT;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public TipoIVA() {
        tipoIVACodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TipoIVA</code>.
     * @param oid Object Identifier of the instance of <code>TipoIVA</code> to be created.
     * @throws SystemException
     */
    public TipoIVA(TipoIVAOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            tipoIVACodigo = oid.getTipoIVACodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>tipoIVACodigo</code> attribute<br>in class <code>TipoIVA</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoIVA</code>
     * @return The value of the <code>tipoIVACodigo</code> attribute<br>in class <code>TipoIVA</code>.
     */
    public Long getTipoIVACodigo() {
        return tipoIVACodigo;
    }

    /**
     * Sets the value of the <code>tipoIVACodigo</code> attribute<br>in class <code>TipoIVA</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoIVA</code>
     * @param tipoIVACodigo The new value of the <code>tipoIVACodigo</code> attribute<br>in class <code>TipoIVA</code>.
     */
    public void setTipoIVACodigo(Long tipoIVACodigo) {
        this.tipoIVACodigo = tipoIVACodigo;
    }

   /**
    * Returns the value of the <code>tipoIVADescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoIVADescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>tipoIVADescripcion</code> attribute.
    */

    public String getTipoIVADescripcion()  {
    	String value;
        value =  tipoIVADescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoIVADescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoIVADescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param tipoIVADescripcion The new value of the <code>tipoIVADescripcion</code> attribute.
    */
    public void setTipoIVADescripcion (String tipoIVADescripcion) {
        modifiedTipoIVADescripcion = true;
        this.tipoIVADescripcion = tipoIVADescripcion;
    }

   /**
    * Sets the value of the <code>modifiedTipoIVADescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIVADescripcion</code>.
    */
    public void setModifiedTipoIVADescripcion(boolean modified) {
        this.modifiedTipoIVADescripcion = modified;
    }

   /**
    * Returns the value of the <code>tipoIVAPorcentaje</code> attribute.<br>
    * Model Attribute: <code>tipoIVAPorcentaje</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>tipoIVAPorcentaje</code> attribute.
    */

    public Double getTipoIVAPorcentaje()  {
    	Double value;
        value =  tipoIVAPorcentaje;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIVAPorcentaje</code> attribute.<br>
    * Model Attribute: <code>tipoIVAPorcentaje</code>. Variable Real<br>
    * Comments: <br>
    * @param tipoIVAPorcentaje The new value of the <code>tipoIVAPorcentaje</code> attribute.
    */
    public void setTipoIVAPorcentaje (Double tipoIVAPorcentaje) {
        modifiedTipoIVAPorcentaje = true;
        this.tipoIVAPorcentaje = tipoIVAPorcentaje;
    }

   /**
    * Sets the value of the <code>modifiedTipoIVAPorcentaje</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIVAPorcentaje</code>.
    */
    public void setModifiedTipoIVAPorcentaje(boolean modified) {
        this.modifiedTipoIVAPorcentaje = modified;
    }

   /**
    * Returns the value of the <code>tipoIVAFechaInicio</code> attribute.<br>
    * Model Attribute: <code>tipoIVAFechaInicio</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>tipoIVAFechaInicio</code> attribute.
    */

    public Date getTipoIVAFechaInicio()  {
    	Date value;
        value =  tipoIVAFechaInicio;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIVAFechaInicio</code> attribute.<br>
    * Model Attribute: <code>tipoIVAFechaInicio</code>. Variable Date<br>
    * Comments: <br>
    * @param tipoIVAFechaInicio The new value of the <code>tipoIVAFechaInicio</code> attribute.
    */
    public void setTipoIVAFechaInicio (Date tipoIVAFechaInicio) {
        modifiedTipoIVAFechaInicio = true;
        this.tipoIVAFechaInicio = tipoIVAFechaInicio;
    }

   /**
    * Sets the value of the <code>modifiedTipoIVAFechaInicio</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIVAFechaInicio</code>.
    */
    public void setModifiedTipoIVAFechaInicio(boolean modified) {
        this.modifiedTipoIVAFechaInicio = modified;
    }

   /**
    * Returns the value of the <code>tipoIVAFechaFin</code> attribute.<br>
    * Model Attribute: <code>tipoIVAFechaFin</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>tipoIVAFechaFin</code> attribute.
    */

    public Date getTipoIVAFechaFin()  {
    	Date value;
        value =  tipoIVAFechaFin;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIVAFechaFin</code> attribute.<br>
    * Model Attribute: <code>tipoIVAFechaFin</code>. Variable Date<br>
    * Comments: <br>
    * @param tipoIVAFechaFin The new value of the <code>tipoIVAFechaFin</code> attribute.
    */
    public void setTipoIVAFechaFin (Date tipoIVAFechaFin) {
        modifiedTipoIVAFechaFin = true;
        this.tipoIVAFechaFin = tipoIVAFechaFin;
    }

   /**
    * Sets the value of the <code>modifiedTipoIVAFechaFin</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIVAFechaFin</code>.
    */
    public void setModifiedTipoIVAFechaFin(boolean modified) {
        this.modifiedTipoIVAFechaFin = modified;
    }

    /**
     * Returns the instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * Model Relationship:
     * <code>[Productos] ProductoT 1:1  ------ 0:M  TiposIVA [TipoIVA]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     */
    @JsonIgnore
    public Productos getProductoT() {
        return productoT;
    }

    /**
     * Adds an instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * @param productoT The instance to add to the <code>ProductoT</code> role.
     */
    public void add2ProductoT(Productos productoT) {
        if (productoT == null || productoT.isNull()) {
            this.modifiedProductoT = true;
            this.productosProducto = null;
        } else {
            this.productosProducto = productoT.getProductosProducto();
        }
        this.productoT = (productoT == null  || productoT.isNull() ? null : productoT);
    }

   /**
    * This method gets the attribute value <code>modifiedProductoT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedProductoT</code> has been modified.
    */
    public boolean isModifiedProductoT(){
        return modifiedProductoT;
    }

    /**
     * Returns the instance of <code>Planes</code> related through the <code>PlanT</code> role.
     * Model Relationship:
     * <code>[Planes] PlanT 1:1  ------ 0:M  TiposIVA [TipoIVA]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Planes</code> related through the <code>PlanT</code> role.
     */
    @JsonIgnore
    public Planes getPlanT() {
        return planT;
    }

    /**
     * Adds an instance of <code>Planes</code> related through the <code>PlanT</code> role.
     * @param planT The instance to add to the <code>PlanT</code> role.
     */
    public void add2PlanT(Planes planT) {
        if (planT == null || planT.isNull()) {
            this.modifiedPlanT = true;
            this.planesPlan = null;
        } else {
            this.planesPlan = planT.getPlanesPlan();
        }
        this.planT = (planT == null  || planT.isNull() ? null : planT);
    }

   /**
    * This method gets the attribute value <code>modifiedPlanT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPlanT</code> has been modified.
    */
    public boolean isModifiedPlanT(){
        return modifiedPlanT;
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
        tipoIVADescripcion = "";
        tipoIVAPorcentaje = Double.valueOf(0);
        tipoIVAFechaInicio = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        tipoIVAFechaFin = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        productoT = null;
        planT = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return TipoIVA.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TipoIVAConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedTipoIVADescripcion = false;
    	values.put("tipoIVADescripcion", getTipoIVADescripcion());
    	modifiedTipoIVAPorcentaje = false;
    	values.put("tipoIVAPorcentaje", getTipoIVAPorcentaje());
    	modifiedTipoIVAFechaInicio = false;
    	values.put("tipoIVAFechaInicio", getTipoIVAFechaInicio());
    	modifiedTipoIVAFechaFin = false;
    	values.put("tipoIVAFechaFin", getTipoIVAFechaFin());
    	modifiedProductoT = false;
    	modifiedPlanT = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>TipoIVAOid</code> object that identifies this instance of <code>TipoIVA</code>.
     * @return <code>TipoIVAOid </code> object that identifies this instance of <code>TipoIVA</code>
     */
	@Override
    public TipoIVAOid getOid() {
        return new TipoIVAOid(getTipoIVACodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TipoIVAConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(TipoIVAConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TIPOIVA)) {
            // Add this class
            activeFacets.add(Constants.TIPOIVA);
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
            relatedInstance = buildTipoIVARelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoIVAConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIVARelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIVAConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIVARelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoIVARelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoIVA(mapper.readValue(relatedInstanceJsonOid, TipoIVAOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIVA.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIVARelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIVA.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIVARelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIVA.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
