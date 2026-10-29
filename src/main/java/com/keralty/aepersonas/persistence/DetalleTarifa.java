package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DetalleTarifaConstants;
import com.keralty.aepersonas.global.TarifaConstants;
import com.keralty.aepersonas.persistence.oid.DetalleTarifaOid;
import com.keralty.aepersonas.persistence.oid.TarifaOid;
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
 * Persistent representation of the <code>DetalleTarifa</code> model class.
 * <p>
 * Model Class: <code>DetalleTarifa</code><br>
 */
@Entity(name = DetalleTarifaConstants.CLASS_NAME)
@Table(name = DetalleTarifaConstants.TBL_NAME)
public class DetalleTarifa extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DetalleTarifa_Sequence")
    @SequenceGenerator(name="DetalleTarifa_Sequence", sequenceName="DetalleTarifa_Sequence", allocationSize=1)
    @Column(name = DetalleTarifaConstants.FLD_DETALLETARIFAIDDETALLETARIFA )
    @JsonProperty(value="id_detalletarifa")
    private Long detalleTarifaidDetalleTarifa;

    /** Class member attribute. */
    @Column(name = DetalleTarifaConstants.FLD_DETALLETARIFAANYO )
    @JsonProperty(value="anyo")
    private Long detalleTarifaAnyo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDetalleTarifaAnyo;

    /** Class member attribute. */
    @Column(name = DetalleTarifaConstants.FLD_DETALLETARIFALIMINFERIOREDAD )
    @JsonProperty(value="liminferioredad")
    private Long detalleTarifaLimInferiorEdad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDetalleTarifaLimInferiorEdad;

    /** Class member attribute. */
    @Column(name = DetalleTarifaConstants.FLD_DETALLETARIFALIMSUPERIOREDAD )
    @JsonProperty(value="limsuperioredad")
    private Long detalleTarifaLimSuperiorEdad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDetalleTarifaLimSuperiorEdad;

    /** Class member attribute. */
    @Column(name = DetalleTarifaConstants.FLD_DETALLETARIFAVALOR )
    @JsonProperty(value="valor")
    private Double detalleTarifaValor;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDetalleTarifaValor;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DetalleTarifaConstants.FLD_TARIFAID, referencedColumnName=TarifaConstants.FLD_TARIFAID)
    })
    @JsonIgnore
    private Tarifa tarifa;
    /** Related attribute. */
    @Column(name = DetalleTarifaConstants.FLD_TARIFAID, insertable = false, updatable = false)
    private Long tarifaId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTarifa;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public DetalleTarifa() {
        detalleTarifaidDetalleTarifa = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>DetalleTarifa</code>.
     * @param oid Object Identifier of the instance of <code>DetalleTarifa</code> to be created.
     * @throws SystemException
     */
    public DetalleTarifa(DetalleTarifaOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            detalleTarifaidDetalleTarifa = oid.getDetalleTarifaidDetalleTarifa();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>detalleTarifaidDetalleTarifa</code> attribute<br>in class <code>DetalleTarifa</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DetalleTarifa</code>
     * @return The value of the <code>detalleTarifaidDetalleTarifa</code> attribute<br>in class <code>DetalleTarifa</code>.
     */
    public Long getDetalleTarifaidDetalleTarifa() {
        return detalleTarifaidDetalleTarifa;
    }

    /**
     * Sets the value of the <code>detalleTarifaidDetalleTarifa</code> attribute<br>in class <code>DetalleTarifa</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DetalleTarifa</code>
     * @param detalleTarifaidDetalleTarifa The new value of the <code>detalleTarifaidDetalleTarifa</code> attribute<br>in class <code>DetalleTarifa</code>.
     */
    public void setDetalleTarifaidDetalleTarifa(Long detalleTarifaidDetalleTarifa) {
        this.detalleTarifaidDetalleTarifa = detalleTarifaidDetalleTarifa;
    }

   /**
    * Returns the value of the <code>detalleTarifaAnyo</code> attribute.<br>
    * Model Attribute: <code>detalleTarifaAnyo</code>. Variable Int<br>
    * Comments: <br>
    * @return The value of the <code>detalleTarifaAnyo</code> attribute.
    */

    public Long getDetalleTarifaAnyo()  {
    	Long value;
        value =  detalleTarifaAnyo;
        return value;
    }

   /**
    * Sets the value of the <code>detalleTarifaAnyo</code> attribute.<br>
    * Model Attribute: <code>detalleTarifaAnyo</code>. Variable Int<br>
    * Comments: <br>
    * @param detalleTarifaAnyo The new value of the <code>detalleTarifaAnyo</code> attribute.
    */
    public void setDetalleTarifaAnyo (Long detalleTarifaAnyo) {
        modifiedDetalleTarifaAnyo = true;
        this.detalleTarifaAnyo = detalleTarifaAnyo;
    }

   /**
    * Sets the value of the <code>modifiedDetalleTarifaAnyo</code> class property.<br>
    * @param modified The new value of the <code>modifiedDetalleTarifaAnyo</code>.
    */
    public void setModifiedDetalleTarifaAnyo(boolean modified) {
        this.modifiedDetalleTarifaAnyo = modified;
    }

   /**
    * Returns the value of the <code>detalleTarifaLimInferiorEdad</code> attribute.<br>
    * Model Attribute: <code>detalleTarifaLimInferiorEdad</code>. Variable Int<br>
    * Comments: Para el cálculo de cuotas de inscripción en la información del pago. Si la edad del usuario está en ese rango, se toma el valor. Al tratar este tema se nos indicó que la tarifa indicaba un rango, imaginamos que será con dos valores, el inferior y el superior<br>
    * @return The value of the <code>detalleTarifaLimInferiorEdad</code> attribute.
    */

    public Long getDetalleTarifaLimInferiorEdad()  {
    	Long value;
        value =  detalleTarifaLimInferiorEdad;
        return value;
    }

   /**
    * Sets the value of the <code>detalleTarifaLimInferiorEdad</code> attribute.<br>
    * Model Attribute: <code>detalleTarifaLimInferiorEdad</code>. Variable Int<br>
    * Comments: Para el cálculo de cuotas de inscripción en la información del pago. Si la edad del usuario está en ese rango, se toma el valor. Al tratar este tema se nos indicó que la tarifa indicaba un rango, imaginamos que será con dos valores, el inferior y el superior<br>
    * @param detalleTarifaLimInferiorEdad The new value of the <code>detalleTarifaLimInferiorEdad</code> attribute.
    */
    public void setDetalleTarifaLimInferiorEdad (Long detalleTarifaLimInferiorEdad) {
        modifiedDetalleTarifaLimInferiorEdad = true;
        this.detalleTarifaLimInferiorEdad = detalleTarifaLimInferiorEdad;
    }

   /**
    * Sets the value of the <code>modifiedDetalleTarifaLimInferiorEdad</code> class property.<br>
    * @param modified The new value of the <code>modifiedDetalleTarifaLimInferiorEdad</code>.
    */
    public void setModifiedDetalleTarifaLimInferiorEdad(boolean modified) {
        this.modifiedDetalleTarifaLimInferiorEdad = modified;
    }

   /**
    * Returns the value of the <code>detalleTarifaLimSuperiorEdad</code> attribute.<br>
    * Model Attribute: <code>detalleTarifaLimSuperiorEdad</code>. Variable Int<br>
    * Comments: Para el cálculo de cuotas de inscripción en la información del pago. Si la edad del usuario está en ese rango, se toma el valor. Al tratar este tema se nos indicó que la tarifa indicaba un rango, imaginamos que será con dos valores, el inferior y el superior<br>
    * @return The value of the <code>detalleTarifaLimSuperiorEdad</code> attribute.
    */

    public Long getDetalleTarifaLimSuperiorEdad()  {
    	Long value;
        value =  detalleTarifaLimSuperiorEdad;
        return value;
    }

   /**
    * Sets the value of the <code>detalleTarifaLimSuperiorEdad</code> attribute.<br>
    * Model Attribute: <code>detalleTarifaLimSuperiorEdad</code>. Variable Int<br>
    * Comments: Para el cálculo de cuotas de inscripción en la información del pago. Si la edad del usuario está en ese rango, se toma el valor. Al tratar este tema se nos indicó que la tarifa indicaba un rango, imaginamos que será con dos valores, el inferior y el superior<br>
    * @param detalleTarifaLimSuperiorEdad The new value of the <code>detalleTarifaLimSuperiorEdad</code> attribute.
    */
    public void setDetalleTarifaLimSuperiorEdad (Long detalleTarifaLimSuperiorEdad) {
        modifiedDetalleTarifaLimSuperiorEdad = true;
        this.detalleTarifaLimSuperiorEdad = detalleTarifaLimSuperiorEdad;
    }

   /**
    * Sets the value of the <code>modifiedDetalleTarifaLimSuperiorEdad</code> class property.<br>
    * @param modified The new value of the <code>modifiedDetalleTarifaLimSuperiorEdad</code>.
    */
    public void setModifiedDetalleTarifaLimSuperiorEdad(boolean modified) {
        this.modifiedDetalleTarifaLimSuperiorEdad = modified;
    }

   /**
    * Returns the value of the <code>detalleTarifaValor</code> attribute.<br>
    * Model Attribute: <code>detalleTarifaValor</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>detalleTarifaValor</code> attribute.
    */

    public Double getDetalleTarifaValor()  {
    	Double value;
        value =  detalleTarifaValor;
        return value;
    }

   /**
    * Sets the value of the <code>detalleTarifaValor</code> attribute.<br>
    * Model Attribute: <code>detalleTarifaValor</code>. Variable Real<br>
    * Comments: <br>
    * @param detalleTarifaValor The new value of the <code>detalleTarifaValor</code> attribute.
    */
    public void setDetalleTarifaValor (Double detalleTarifaValor) {
        modifiedDetalleTarifaValor = true;
        this.detalleTarifaValor = detalleTarifaValor;
    }

   /**
    * Sets the value of the <code>modifiedDetalleTarifaValor</code> class property.<br>
    * @param modified The new value of the <code>modifiedDetalleTarifaValor</code>.
    */
    public void setModifiedDetalleTarifaValor(boolean modified) {
        this.modifiedDetalleTarifaValor = modified;
    }

    /**
     * Returns the instance of <code>Tarifa</code> related through the <code>Tarifa</code> role.
     * Model Relationship:
     * <code>[Tarifa] Tarifa 1:1  ------ 0:M  DetallesTarifa [DetalleTarifa]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Tarifa</code> related through the <code>Tarifa</code> role.
     */
    @JsonIgnore
    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * Adds an instance of <code>Tarifa</code> related through the <code>Tarifa</code> role.
     * @param tarifa The instance to add to the <code>Tarifa</code> role.
     */
    public void add2Tarifa(Tarifa tarifa) {
        if (tarifa == null || tarifa.isNull()) {
            this.modifiedTarifa = true;
            this.tarifaId = null;
        } else {
            this.tarifaId = tarifa.getTarifaId();
        }
        this.tarifa = (tarifa == null  || tarifa.isNull() ? null : tarifa);
    }

   /**
    * This method gets the attribute value <code>modifiedTarifa</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTarifa</code> has been modified.
    */
    public boolean isModifiedTarifa(){
        return modifiedTarifa;
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
        detalleTarifaAnyo = Long.valueOf(0);
        detalleTarifaLimInferiorEdad = Long.valueOf(0);
        detalleTarifaLimSuperiorEdad = Long.valueOf(0);
        detalleTarifaValor = Double.valueOf(0);
        tarifa = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return DetalleTarifa.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return DetalleTarifaConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedDetalleTarifaAnyo = false;
    	values.put("detalleTarifaAnyo", getDetalleTarifaAnyo());
    	modifiedDetalleTarifaLimInferiorEdad = false;
    	values.put("detalleTarifaLimInferiorEdad", getDetalleTarifaLimInferiorEdad());
    	modifiedDetalleTarifaLimSuperiorEdad = false;
    	values.put("detalleTarifaLimSuperiorEdad", getDetalleTarifaLimSuperiorEdad());
    	modifiedDetalleTarifaValor = false;
    	values.put("detalleTarifaValor", getDetalleTarifaValor());
    	modifiedTarifa = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>DetalleTarifaOid</code> object that identifies this instance of <code>DetalleTarifa</code>.
     * @return <code>DetalleTarifaOid </code> object that identifies this instance of <code>DetalleTarifa</code>
     */
	@Override
    public DetalleTarifaOid getOid() {
        return new DetalleTarifaOid(getDetalleTarifaidDetalleTarifa());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(DetalleTarifaConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(DetalleTarifaConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.DETALLETARIFA)) {
            // Add this class
            activeFacets.add(Constants.DETALLETARIFA);
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
            relatedInstance = buildDetalleTarifaRelatedInstance(relatedInstanceJsonOid);
        }
        if (DetalleTarifaConstants.ROLE_NAME_TARIFA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDetalleTarifaRelatedInstance4Tarifa(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDetalleTarifaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new DetalleTarifa(mapper.readValue(relatedInstanceJsonOid, DetalleTarifaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DetalleTarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDetalleTarifaRelatedInstance4Tarifa(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Tarifa(mapper.readValue(relatedInstanceJsonOid, TarifaOid.class)): Tarifa.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DetalleTarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
