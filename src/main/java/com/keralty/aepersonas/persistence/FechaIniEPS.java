package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FechaIniEPSConstants;
import com.keralty.aepersonas.persistence.oid.FechaIniEPSOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
 * Persistent representation of the <code>FechaIniEPS</code> model class.
 * <p>
 * Model Class: <code>FechaIniEPS</code><br>
 */
@Entity(name = FechaIniEPSConstants.CLASS_NAME)
@Table(name = FechaIniEPSConstants.TBL_NAME)
public class FechaIniEPS extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FechaIniEPS_Sequence")
    @SequenceGenerator(name="FechaIniEPS_Sequence", sequenceName="FechaIniEPS_Sequence", allocationSize=1)
    @Column(name = FechaIniEPSConstants.FLD_FECHAINIEPSID )
    @JsonProperty(value="id")
    private Long fechaIniEPSId;

    /** Class member attribute. */
    @Column(name = FechaIniEPSConstants.FLD_FECHAINIEPSTRAMITE )
    @JsonProperty(value="tramite")
    private Long fechaIniEPSTramite;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFechaIniEPSTramite;

    /** Class member attribute. */
    @Column(name = FechaIniEPSConstants.FLD_FECHAINIEPSTIPOCONTRATO )
    @JsonProperty(value="tipocontrato")
    private Long fechaIniEPSTipoContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFechaIniEPSTipoContrato;

    /** Class member attribute. */
    @Column(name = FechaIniEPSConstants.FLD_FECHAINIEPSDESDE )
    @JsonProperty(value="desde")
    private Date fechaIniEPSDesde;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFechaIniEPSDesde;

    /** Class member attribute. */
    @Column(name = FechaIniEPSConstants.FLD_FECHAINIEPSHASTA )
    @JsonProperty(value="hasta")
    private Date fechaIniEPSHasta;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFechaIniEPSHasta;

    /** Class member attribute. */
    @Column(name = FechaIniEPSConstants.FLD_FECHAINIEPSFECHAINICIOAPLICAR )
    @JsonProperty(value="fechainicioaplicar")
    private Date fechaIniEPSFechaInicioAplicar;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFechaIniEPSFechaInicioAplicar;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public FechaIniEPS() {
        fechaIniEPSId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>FechaIniEPS</code>.
     * @param oid Object Identifier of the instance of <code>FechaIniEPS</code> to be created.
     * @throws SystemException
     */
    public FechaIniEPS(FechaIniEPSOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            fechaIniEPSId = oid.getFechaIniEPSId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>fechaIniEPSId</code> attribute<br>in class <code>FechaIniEPS</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FechaIniEPS</code>
     * @return The value of the <code>fechaIniEPSId</code> attribute<br>in class <code>FechaIniEPS</code>.
     */
    public Long getFechaIniEPSId() {
        return fechaIniEPSId;
    }

    /**
     * Sets the value of the <code>fechaIniEPSId</code> attribute<br>in class <code>FechaIniEPS</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FechaIniEPS</code>
     * @param fechaIniEPSId The new value of the <code>fechaIniEPSId</code> attribute<br>in class <code>FechaIniEPS</code>.
     */
    public void setFechaIniEPSId(Long fechaIniEPSId) {
        this.fechaIniEPSId = fechaIniEPSId;
    }

   /**
    * Returns the value of the <code>fechaIniEPSTramite</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSTramite</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>fechaIniEPSTramite</code> attribute.
    */

    public Long getFechaIniEPSTramite()  {
    	Long value;
        value =  fechaIniEPSTramite;
        return value;
    }

   /**
    * Sets the value of the <code>fechaIniEPSTramite</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSTramite</code>. Constant Nat<br>
    * Comments: <br>
    * @param fechaIniEPSTramite The new value of the <code>fechaIniEPSTramite</code> attribute.
    */
    public void setFechaIniEPSTramite (Long fechaIniEPSTramite) {
        modifiedFechaIniEPSTramite = true;
        this.fechaIniEPSTramite = fechaIniEPSTramite;
    }

   /**
    * Returns the value of the <code>modifiedFechaIniEPSTramite</code> class property.<br>
    *
    * @return The value of the <code>modifiedFechaIniEPSTramite</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFechaIniEPSTramite() {
        return modifiedFechaIniEPSTramite;
    }

   /**
    * Sets the value of the <code>modifiedFechaIniEPSTramite</code> class property.<br>
    * @param modified The new value of the <code>modifiedFechaIniEPSTramite</code>.
    */
    public void setModifiedFechaIniEPSTramite(boolean modified) {
        this.modifiedFechaIniEPSTramite = modified;
    }

   /**
    * Returns the value of the <code>fechaIniEPSTipoContrato</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSTipoContrato</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>fechaIniEPSTipoContrato</code> attribute.
    */

    public Long getFechaIniEPSTipoContrato()  {
    	Long value;
        value =  fechaIniEPSTipoContrato;
        return value;
    }

   /**
    * Sets the value of the <code>fechaIniEPSTipoContrato</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSTipoContrato</code>. Constant Nat<br>
    * Comments: <br>
    * @param fechaIniEPSTipoContrato The new value of the <code>fechaIniEPSTipoContrato</code> attribute.
    */
    public void setFechaIniEPSTipoContrato (Long fechaIniEPSTipoContrato) {
        modifiedFechaIniEPSTipoContrato = true;
        this.fechaIniEPSTipoContrato = fechaIniEPSTipoContrato;
    }

   /**
    * Returns the value of the <code>modifiedFechaIniEPSTipoContrato</code> class property.<br>
    *
    * @return The value of the <code>modifiedFechaIniEPSTipoContrato</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFechaIniEPSTipoContrato() {
        return modifiedFechaIniEPSTipoContrato;
    }

   /**
    * Sets the value of the <code>modifiedFechaIniEPSTipoContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedFechaIniEPSTipoContrato</code>.
    */
    public void setModifiedFechaIniEPSTipoContrato(boolean modified) {
        this.modifiedFechaIniEPSTipoContrato = modified;
    }

   /**
    * Returns the value of the <code>fechaIniEPSDesde</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSDesde</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>fechaIniEPSDesde</code> attribute.
    */

    public Date getFechaIniEPSDesde()  {
    	Date value;
        value =  fechaIniEPSDesde;
        return value;
    }

   /**
    * Sets the value of the <code>fechaIniEPSDesde</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSDesde</code>. Variable Date<br>
    * Comments: <br>
    * @param fechaIniEPSDesde The new value of the <code>fechaIniEPSDesde</code> attribute.
    */
    public void setFechaIniEPSDesde (Date fechaIniEPSDesde) {
        modifiedFechaIniEPSDesde = true;
        this.fechaIniEPSDesde = fechaIniEPSDesde;
    }

   /**
    * Returns the value of the <code>modifiedFechaIniEPSDesde</code> class property.<br>
    *
    * @return The value of the <code>modifiedFechaIniEPSDesde</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFechaIniEPSDesde() {
        return modifiedFechaIniEPSDesde;
    }

   /**
    * Sets the value of the <code>modifiedFechaIniEPSDesde</code> class property.<br>
    * @param modified The new value of the <code>modifiedFechaIniEPSDesde</code>.
    */
    public void setModifiedFechaIniEPSDesde(boolean modified) {
        this.modifiedFechaIniEPSDesde = modified;
    }

   /**
    * Returns the value of the <code>fechaIniEPSHasta</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSHasta</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>fechaIniEPSHasta</code> attribute.
    */

    public Date getFechaIniEPSHasta()  {
    	Date value;
        value =  fechaIniEPSHasta;
        return value;
    }

   /**
    * Sets the value of the <code>fechaIniEPSHasta</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSHasta</code>. Variable Date<br>
    * Comments: <br>
    * @param fechaIniEPSHasta The new value of the <code>fechaIniEPSHasta</code> attribute.
    */
    public void setFechaIniEPSHasta (Date fechaIniEPSHasta) {
        modifiedFechaIniEPSHasta = true;
        this.fechaIniEPSHasta = fechaIniEPSHasta;
    }

   /**
    * Returns the value of the <code>modifiedFechaIniEPSHasta</code> class property.<br>
    *
    * @return The value of the <code>modifiedFechaIniEPSHasta</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFechaIniEPSHasta() {
        return modifiedFechaIniEPSHasta;
    }

   /**
    * Sets the value of the <code>modifiedFechaIniEPSHasta</code> class property.<br>
    * @param modified The new value of the <code>modifiedFechaIniEPSHasta</code>.
    */
    public void setModifiedFechaIniEPSHasta(boolean modified) {
        this.modifiedFechaIniEPSHasta = modified;
    }

   /**
    * Returns the value of the <code>fechaIniEPSFechaInicioAplicar</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSFechaInicioAplicar</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>fechaIniEPSFechaInicioAplicar</code> attribute.
    */

    public Date getFechaIniEPSFechaInicioAplicar()  {
    	Date value;
        value =  fechaIniEPSFechaInicioAplicar;
        return value;
    }

   /**
    * Sets the value of the <code>fechaIniEPSFechaInicioAplicar</code> attribute.<br>
    * Model Attribute: <code>fechaIniEPSFechaInicioAplicar</code>. Variable Date<br>
    * Comments: <br>
    * @param fechaIniEPSFechaInicioAplicar The new value of the <code>fechaIniEPSFechaInicioAplicar</code> attribute.
    */
    public void setFechaIniEPSFechaInicioAplicar (Date fechaIniEPSFechaInicioAplicar) {
        modifiedFechaIniEPSFechaInicioAplicar = true;
        this.fechaIniEPSFechaInicioAplicar = fechaIniEPSFechaInicioAplicar;
    }

   /**
    * Returns the value of the <code>modifiedFechaIniEPSFechaInicioAplicar</code> class property.<br>
    *
    * @return The value of the <code>modifiedFechaIniEPSFechaInicioAplicar</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFechaIniEPSFechaInicioAplicar() {
        return modifiedFechaIniEPSFechaInicioAplicar;
    }

   /**
    * Sets the value of the <code>modifiedFechaIniEPSFechaInicioAplicar</code> class property.<br>
    * @param modified The new value of the <code>modifiedFechaIniEPSFechaInicioAplicar</code>.
    */
    public void setModifiedFechaIniEPSFechaInicioAplicar(boolean modified) {
        this.modifiedFechaIniEPSFechaInicioAplicar = modified;
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
        fechaIniEPSTramite = Long.valueOf(0);
        fechaIniEPSTipoContrato = Long.valueOf(0);
        fechaIniEPSDesde = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        fechaIniEPSHasta = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        fechaIniEPSFechaInicioAplicar = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return FechaIniEPS.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return FechaIniEPSConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedFechaIniEPSTramite = false;
    	values.put("fechaIniEPSTramite", getFechaIniEPSTramite());
    	modifiedFechaIniEPSTipoContrato = false;
    	values.put("fechaIniEPSTipoContrato", getFechaIniEPSTipoContrato());
    	modifiedFechaIniEPSDesde = false;
    	values.put("fechaIniEPSDesde", getFechaIniEPSDesde());
    	modifiedFechaIniEPSHasta = false;
    	values.put("fechaIniEPSHasta", getFechaIniEPSHasta());
    	modifiedFechaIniEPSFechaInicioAplicar = false;
    	values.put("fechaIniEPSFechaInicioAplicar", getFechaIniEPSFechaInicioAplicar());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>FechaIniEPSOid</code> object that identifies this instance of <code>FechaIniEPS</code>.
     * @return <code>FechaIniEPSOid </code> object that identifies this instance of <code>FechaIniEPS</code>
     */
	@Override
    public FechaIniEPSOid getOid() {
        return new FechaIniEPSOid(getFechaIniEPSId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(FechaIniEPSConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.FECHAINIEPS)) {
            // Add this class
            activeFacets.add(Constants.FECHAINIEPS);
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
            relatedInstance = buildFechaIniEPSRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFechaIniEPSRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FechaIniEPS(mapper.readValue(relatedInstanceJsonOid, FechaIniEPSOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FechaIniEPS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
