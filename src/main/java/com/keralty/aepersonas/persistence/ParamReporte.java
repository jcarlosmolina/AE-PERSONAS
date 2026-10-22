package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ParamReporteConstants;
import com.keralty.aepersonas.global.ReportesProcAlmConstants;
import com.keralty.aepersonas.persistence.oid.ParamReporteOid;
import com.keralty.aepersonas.persistence.oid.ReportesProcAlmOid;
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
 * Persistent representation of the <code>ParamReporte</code> model class.
 * <p>
 * Model Class: <code>ParamReporte</code><br>
 */
@Entity(name = ParamReporteConstants.CLASS_NAME)
@Table(name = ParamReporteConstants.TBL_NAME)
public class ParamReporte extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ParamReporte_Sequence")
    @SequenceGenerator(name="ParamReporte_Sequence", sequenceName="ParamReporte_Sequence", allocationSize=1)
    @Column(name = ParamReporteConstants.FLD_PARAMREPORTEIDPARAMREPORTE )
    @JsonProperty(value="id_paramreporte")
    private Long paramReporteidParamReporte;

    /** Class member attribute. */
    @Column(name = ParamReporteConstants.FLD_PARAMREPORTETITULO )
    @JsonProperty(value="titulo")
    private String paramReporteTitulo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParamReporteTitulo;

    /** Class member attribute. */
    @Column(name = ParamReporteConstants.FLD_PARAMREPORTEDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String paramReporteDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParamReporteDescripcion;

    /** Class member attribute. */
    @Column(name = ParamReporteConstants.FLD_PARAMREPORTEESNUMERICO )
    @JsonProperty(value="esnumerico")
    private Boolean paramReporteEsNumerico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParamReporteEsNumerico;

    /** Class member attribute. */
    @Column(name = ParamReporteConstants.FLD_PARAMREPORTEORDEN )
    @JsonProperty(value="orden")
    private Long paramReporteOrden;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParamReporteOrden;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ParamReporteConstants.FLD_REPORTESPROCALMIDREPORTE, referencedColumnName=ReportesProcAlmConstants.FLD_REPORTESPROCALMIDREPORTE)
    })
    @JsonIgnore
    private ReportesProcAlm reporte;
    /** Related attribute. */
    @Column(name = ParamReporteConstants.FLD_REPORTESPROCALMIDREPORTE, insertable = false, updatable = false)
    private Long reportesProcAlmidReporte;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedReporte;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ParamReporte() {
        paramReporteidParamReporte = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ParamReporte</code>.
     * @param oid Object Identifier of the instance of <code>ParamReporte</code> to be created.
     * @throws SystemException
     */
    public ParamReporte(ParamReporteOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            paramReporteidParamReporte = oid.getParamReporteidParamReporte();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>paramReporteidParamReporte</code> attribute<br>in class <code>ParamReporte</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ParamReporte</code>
     * @return The value of the <code>paramReporteidParamReporte</code> attribute<br>in class <code>ParamReporte</code>.
     */
    public Long getParamReporteidParamReporte() {
        return paramReporteidParamReporte;
    }

    /**
     * Sets the value of the <code>paramReporteidParamReporte</code> attribute<br>in class <code>ParamReporte</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ParamReporte</code>
     * @param paramReporteidParamReporte The new value of the <code>paramReporteidParamReporte</code> attribute<br>in class <code>ParamReporte</code>.
     */
    public void setParamReporteidParamReporte(Long paramReporteidParamReporte) {
        this.paramReporteidParamReporte = paramReporteidParamReporte;
    }

   /**
    * Returns the value of the <code>paramReporteTitulo</code> attribute.<br>
    * Model Attribute: <code>paramReporteTitulo</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>paramReporteTitulo</code> attribute.
    */

    public String getParamReporteTitulo()  {
    	String value;
        value =  paramReporteTitulo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>paramReporteTitulo</code> attribute.<br>
    * Model Attribute: <code>paramReporteTitulo</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param paramReporteTitulo The new value of the <code>paramReporteTitulo</code> attribute.
    */
    public void setParamReporteTitulo (String paramReporteTitulo) {
        modifiedParamReporteTitulo = true;
        this.paramReporteTitulo = paramReporteTitulo;
    }

   /**
    * Returns the value of the <code>modifiedParamReporteTitulo</code> class property.<br>
    *
    * @return The value of the <code>modifiedParamReporteTitulo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParamReporteTitulo() {
        return modifiedParamReporteTitulo;
    }

   /**
    * Sets the value of the <code>modifiedParamReporteTitulo</code> class property.<br>
    * @param modified The new value of the <code>modifiedParamReporteTitulo</code>.
    */
    public void setModifiedParamReporteTitulo(boolean modified) {
        this.modifiedParamReporteTitulo = modified;
    }

   /**
    * Returns the value of the <code>paramReporteDescripcion</code> attribute.<br>
    * Model Attribute: <code>paramReporteDescripcion</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>paramReporteDescripcion</code> attribute.
    */

    public String getParamReporteDescripcion()  {
    	String value;
        value =  paramReporteDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>paramReporteDescripcion</code> attribute.<br>
    * Model Attribute: <code>paramReporteDescripcion</code>. Variable String Size=200<br>
    * Comments: <br>
    * @param paramReporteDescripcion The new value of the <code>paramReporteDescripcion</code> attribute.
    */
    public void setParamReporteDescripcion (String paramReporteDescripcion) {
        modifiedParamReporteDescripcion = true;
        this.paramReporteDescripcion = paramReporteDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedParamReporteDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedParamReporteDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParamReporteDescripcion() {
        return modifiedParamReporteDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedParamReporteDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedParamReporteDescripcion</code>.
    */
    public void setModifiedParamReporteDescripcion(boolean modified) {
        this.modifiedParamReporteDescripcion = modified;
    }

   /**
    * Returns the value of the <code>paramReporteEsNumerico</code> attribute.<br>
    * Model Attribute: <code>paramReporteEsNumerico</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>paramReporteEsNumerico</code> attribute.
    */

    public Boolean getParamReporteEsNumerico()  {
    	Boolean value;
        value =  paramReporteEsNumerico;
        return value;
    }

   /**
    * Sets the value of the <code>paramReporteEsNumerico</code> attribute.<br>
    * Model Attribute: <code>paramReporteEsNumerico</code>. Variable Bool<br>
    * Comments: <br>
    * @param paramReporteEsNumerico The new value of the <code>paramReporteEsNumerico</code> attribute.
    */
    public void setParamReporteEsNumerico (Boolean paramReporteEsNumerico) {
        modifiedParamReporteEsNumerico = true;
        this.paramReporteEsNumerico = paramReporteEsNumerico;
    }

   /**
    * Returns the value of the <code>modifiedParamReporteEsNumerico</code> class property.<br>
    *
    * @return The value of the <code>modifiedParamReporteEsNumerico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParamReporteEsNumerico() {
        return modifiedParamReporteEsNumerico;
    }

   /**
    * Sets the value of the <code>modifiedParamReporteEsNumerico</code> class property.<br>
    * @param modified The new value of the <code>modifiedParamReporteEsNumerico</code>.
    */
    public void setModifiedParamReporteEsNumerico(boolean modified) {
        this.modifiedParamReporteEsNumerico = modified;
    }

   /**
    * Returns the value of the <code>paramReporteOrden</code> attribute.<br>
    * Model Attribute: <code>paramReporteOrden</code>. Variable Nat<br>
    * Comments: <br>
    * @return The value of the <code>paramReporteOrden</code> attribute.
    */

    public Long getParamReporteOrden()  {
    	Long value;
        value =  paramReporteOrden;
        return value;
    }

   /**
    * Sets the value of the <code>paramReporteOrden</code> attribute.<br>
    * Model Attribute: <code>paramReporteOrden</code>. Variable Nat<br>
    * Comments: <br>
    * @param paramReporteOrden The new value of the <code>paramReporteOrden</code> attribute.
    */
    public void setParamReporteOrden (Long paramReporteOrden) {
        modifiedParamReporteOrden = true;
        this.paramReporteOrden = paramReporteOrden;
    }

   /**
    * Returns the value of the <code>modifiedParamReporteOrden</code> class property.<br>
    *
    * @return The value of the <code>modifiedParamReporteOrden</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParamReporteOrden() {
        return modifiedParamReporteOrden;
    }

   /**
    * Sets the value of the <code>modifiedParamReporteOrden</code> class property.<br>
    * @param modified The new value of the <code>modifiedParamReporteOrden</code>.
    */
    public void setModifiedParamReporteOrden(boolean modified) {
        this.modifiedParamReporteOrden = modified;
    }

    /**
     * Returns the instance of <code>ReportesProcAlm</code> related through the <code>Reporte</code> role.
     * Model Relationship:
     * <code>[ReportesProcAlm] Reporte 1:1  ------ 0:M  Parametros [ParamReporte]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ReportesProcAlm</code> related through the <code>Reporte</code> role.
     */
    @JsonIgnore
    public ReportesProcAlm getReporte() {
        return reporte;
    }

    /**
     * Adds an instance of <code>ReportesProcAlm</code> related through the <code>Reporte</code> role.
     * @param reporte The instance to add to the <code>Reporte</code> role.
     */
    public void add2Reporte(ReportesProcAlm reporte) {
        if (reporte == null || reporte.isNull()) {
            this.modifiedReporte = true;
            this.reportesProcAlmidReporte = null;
        } else {
            this.reportesProcAlmidReporte = reporte.getReportesProcAlmidReporte();
        }
        this.reporte = (reporte == null  || reporte.isNull() ? null : reporte);
    }

   /**
    * This method gets the attribute value <code>modifiedReporte</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedReporte</code> has been modified.
    */
    public boolean isModifiedReporte(){
        return modifiedReporte;
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
        paramReporteTitulo = "";
        paramReporteDescripcion = null;
        paramReporteEsNumerico = false;
        paramReporteOrden = null;
        reporte = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ParamReporte.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ParamReporteConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedParamReporteTitulo = false;
    	values.put("paramReporteTitulo", getParamReporteTitulo());
    	modifiedParamReporteDescripcion = false;
    	values.put("paramReporteDescripcion", getParamReporteDescripcion());
    	modifiedParamReporteEsNumerico = false;
    	values.put("paramReporteEsNumerico", getParamReporteEsNumerico());
    	modifiedParamReporteOrden = false;
    	values.put("paramReporteOrden", getParamReporteOrden());
    	modifiedReporte = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ParamReporteOid</code> object that identifies this instance of <code>ParamReporte</code>.
     * @return <code>ParamReporteOid </code> object that identifies this instance of <code>ParamReporte</code>
     */
	@Override
    public ParamReporteOid getOid() {
        return new ParamReporteOid(getParamReporteidParamReporte());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ParamReporteConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ParamReporteConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PARAMREPORTE)) {
            // Add this class
            activeFacets.add(Constants.PARAMREPORTE);
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
            relatedInstance = buildParamReporteRelatedInstance(relatedInstanceJsonOid);
        }
        if (ParamReporteConstants.ROLE_NAME_REPORTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParamReporteRelatedInstance4ReportesProcAlm(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildParamReporteRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ParamReporte(mapper.readValue(relatedInstanceJsonOid, ParamReporteOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParamReporte.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildParamReporteRelatedInstance4ReportesProcAlm(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ReportesProcAlm(mapper.readValue(relatedInstanceJsonOid, ReportesProcAlmOid.class)): ReportesProcAlm.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParamReporte.class).error(e.getMessage());
            return null;
        }
    }
}
