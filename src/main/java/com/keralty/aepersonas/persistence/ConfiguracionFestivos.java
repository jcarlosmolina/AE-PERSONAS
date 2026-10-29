package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.ConfiguracionFestivosConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.ConfiguracionFestivosOid;
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
 * Persistent representation of the <code>ConfiguracionFestivos</code> model class.
 * <p>
 * Model Class: <code>ConfiguracionFestivos</code><br>
 */
@Entity(name = ConfiguracionFestivosConstants.CLASS_NAME)
@Table(name = ConfiguracionFestivosConstants.TBL_NAME)
public class ConfiguracionFestivos extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ConfiguracionFestivos_Sequence")
    @SequenceGenerator(name="ConfiguracionFestivos_Sequence", sequenceName="ConfiguracionFestivos_Sequence", allocationSize=1)
    @Column(name = ConfiguracionFestivosConstants.FLD_CONFIGURACIONFESTIVOSID )
    @JsonProperty(value="id")
    private Long configuracionFestivosId;

    /** Class member attribute. */
    @Column(name = ConfiguracionFestivosConstants.FLD_CONFIGURACIONFESTIVOSDIAFESTIVO )
    @JsonProperty(value="diafestivo")
    private Date configuracionFestivosDiaFestivo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionFestivosDiaFestivo;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ConfiguracionFestivos() {
        configuracionFestivosId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ConfiguracionFestivos</code>.
     * @param oid Object Identifier of the instance of <code>ConfiguracionFestivos</code> to be created.
     * @throws SystemException
     */
    public ConfiguracionFestivos(ConfiguracionFestivosOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            configuracionFestivosId = oid.getConfiguracionFestivosId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>configuracionFestivosId</code> attribute<br>in class <code>ConfiguracionFestivos</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ConfiguracionFestivos</code>
     * @return The value of the <code>configuracionFestivosId</code> attribute<br>in class <code>ConfiguracionFestivos</code>.
     */
    public Long getConfiguracionFestivosId() {
        return configuracionFestivosId;
    }

    /**
     * Sets the value of the <code>configuracionFestivosId</code> attribute<br>in class <code>ConfiguracionFestivos</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ConfiguracionFestivos</code>
     * @param configuracionFestivosId The new value of the <code>configuracionFestivosId</code> attribute<br>in class <code>ConfiguracionFestivos</code>.
     */
    public void setConfiguracionFestivosId(Long configuracionFestivosId) {
        this.configuracionFestivosId = configuracionFestivosId;
    }

   /**
    * Returns the value of the <code>configuracionFestivosDiaFestivo</code> attribute.<br>
    * Model Attribute: <code>configuracionFestivosDiaFestivo</code>. Constant Date<br>
    * Comments: Este será el día que debe ser considerado festivo. Lo ponemos como Date, nos interesa el día, el mes y el año. Y así no hace falta poner en esta clase ningún atributo año ni nada por el estilo. Para búsquedas en esta clase siempre podremos usar funciones stándar sobre la fecha y recuerar el año o el mes o lo que sea. <br>
    * @return The value of the <code>configuracionFestivosDiaFestivo</code> attribute.
    */

    public Date getConfiguracionFestivosDiaFestivo()  {
    	Date value;
        value =  configuracionFestivosDiaFestivo;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionFestivosDiaFestivo</code> attribute.<br>
    * Model Attribute: <code>configuracionFestivosDiaFestivo</code>. Constant Date<br>
    * Comments: Este será el día que debe ser considerado festivo. Lo ponemos como Date, nos interesa el día, el mes y el año. Y así no hace falta poner en esta clase ningún atributo año ni nada por el estilo. Para búsquedas en esta clase siempre podremos usar funciones stándar sobre la fecha y recuerar el año o el mes o lo que sea. <br>
    * @param configuracionFestivosDiaFestivo The new value of the <code>configuracionFestivosDiaFestivo</code> attribute.
    */
    public void setConfiguracionFestivosDiaFestivo (Date configuracionFestivosDiaFestivo) {
        modifiedConfiguracionFestivosDiaFestivo = true;
        this.configuracionFestivosDiaFestivo = configuracionFestivosDiaFestivo;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionFestivosDiaFestivo</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionFestivosDiaFestivo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionFestivosDiaFestivo() {
        return modifiedConfiguracionFestivosDiaFestivo;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionFestivosDiaFestivo</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionFestivosDiaFestivo</code>.
    */
    public void setModifiedConfiguracionFestivosDiaFestivo(boolean modified) {
        this.modifiedConfiguracionFestivosDiaFestivo = modified;
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
        configuracionFestivosDiaFestivo = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ConfiguracionFestivos.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ConfiguracionFestivosConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedConfiguracionFestivosDiaFestivo = false;
    	values.put("configuracionFestivosDiaFestivo", getConfiguracionFestivosDiaFestivo());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ConfiguracionFestivosOid</code> object that identifies this instance of <code>ConfiguracionFestivos</code>.
     * @return <code>ConfiguracionFestivosOid </code> object that identifies this instance of <code>ConfiguracionFestivos</code>
     */
	@Override
    public ConfiguracionFestivosOid getOid() {
        return new ConfiguracionFestivosOid(getConfiguracionFestivosId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ConfiguracionFestivosConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CONFIGURACIONFESTIVOS)) {
            // Add this class
            activeFacets.add(Constants.CONFIGURACIONFESTIVOS);
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


        if (getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.GESTOR)) {
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
            relatedInstance = buildConfiguracionFestivosRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildConfiguracionFestivosRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ConfiguracionFestivos(mapper.readValue(relatedInstanceJsonOid, ConfiguracionFestivosOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionFestivos.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
