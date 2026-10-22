package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PreguntaConstants;
import com.keralty.aepersonas.global.ValorConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.ValorOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
 * Persistent representation of the <code>Valor</code> model class.
 * <p>
 * Model Class: <code>Valor</code><br>
 */
@Entity(name = ValorConstants.CLASS_NAME)
@Table(name = ValorConstants.TBL_NAME)
public class Valor extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Valor_Sequence")
    @SequenceGenerator(name="Valor_Sequence", sequenceName="Valor_Sequence", allocationSize=1)
    @Column(name = ValorConstants.FLD_VALORIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long valorIdentificador;

    /** Class member attribute. */
    @Column(name = ValorConstants.FLD_VALORVALORPOSIBLE )
    @JsonProperty(value="valorposible")
    private String valorValorPosible;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedValorValorPosible;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_VALORPREGUNTA,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMVALORPREGUNTA_VALORIDENTIFICADOR, referencedColumnName=ValorConstants.FLD_VALORIDENTIFICADOR)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMVALORPREGUNTA_PREGUNTANUMERO, referencedColumnName=PreguntaConstants.FLD_PREGUNTANUMERO)
    })
    @JsonIgnore
    private Collection <Pregunta> preguntas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntas;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Valor() {
        valorIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Valor</code>.
     * @param oid Object Identifier of the instance of <code>Valor</code> to be created.
     * @throws SystemException
     */
    public Valor(ValorOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            valorIdentificador = oid.getValorIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>valorIdentificador</code> attribute<br>in class <code>Valor</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Valor</code>
     * @return The value of the <code>valorIdentificador</code> attribute<br>in class <code>Valor</code>.
     */
    public Long getValorIdentificador() {
        return valorIdentificador;
    }

    /**
     * Sets the value of the <code>valorIdentificador</code> attribute<br>in class <code>Valor</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Valor</code>
     * @param valorIdentificador The new value of the <code>valorIdentificador</code> attribute<br>in class <code>Valor</code>.
     */
    public void setValorIdentificador(Long valorIdentificador) {
        this.valorIdentificador = valorIdentificador;
    }

   /**
    * Returns the value of the <code>valorValorPosible</code> attribute.<br>
    * Model Attribute: <code>valorValorPosible</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>valorValorPosible</code> attribute.
    */

    public String getValorValorPosible()  {
    	String value;
        value =  valorValorPosible;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>valorValorPosible</code> attribute.<br>
    * Model Attribute: <code>valorValorPosible</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param valorValorPosible The new value of the <code>valorValorPosible</code> attribute.
    */
    public void setValorValorPosible (String valorValorPosible) {
        modifiedValorValorPosible = true;
        this.valorValorPosible = valorValorPosible;
    }

   /**
    * Sets the value of the <code>modifiedValorValorPosible</code> class property.<br>
    * @param modified The new value of the <code>modifiedValorValorPosible</code>.
    */
    public void setModifiedValorValorPosible(boolean modified) {
        this.modifiedValorValorPosible = modified;
    }

    /**
     * Returns the instance of <code>Pregunta</code> related through the <code>Preguntas</code> role.
     * Model Relationship:
     * <code>[Pregunta] Preguntas 0:M  ------ 0:M  Valores [Valor]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Pregunta</code> related through the <code>Preguntas</code> role.
     */
    @JsonIgnore
    public Collection <Pregunta> getPreguntas() {
        return preguntas;
    }

    /**
     * Adds an instance of <code>Pregunta</code> related through the <code>Preguntas</code> role.
     * @param preguntas The instance to add to the <code>Preguntas</code> role.
     */
    public void add2Preguntas(Pregunta preguntas) {
        this.preguntas.add(preguntas);
    }
    /**
     * Removes an instance of <code>Pregunta</code> related through the <code>Preguntas</code> role.
     * @param preguntas The instance to be removed
     */
    public void removeFromPreguntas(Pregunta preguntas) {
    	this.preguntas.remove(preguntas);
    }
    /**
     * Sets instances of <code>Pregunta</code> related through the <code>Preguntas</code> role.
     * @param preguntas The new value for the <code>Preguntas</code> role.
     */
    public void setPreguntas(Collection < Pregunta > preguntas) {
        this.preguntas = preguntas;
    }

   /**
    * This method gets the attribute value <code>modifiedPreguntas</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPreguntas</code> has been modified.
    */
    public boolean isModifiedPreguntas(){
        return modifiedPreguntas;
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
        valorValorPosible = "";
        preguntas = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return Valor.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ValorConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedValorValorPosible = false;
    	values.put("valorValorPosible", getValorValorPosible());
    	modifiedPreguntas = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ValorOid</code> object that identifies this instance of <code>Valor</code>.
     * @return <code>ValorOid </code> object that identifies this instance of <code>Valor</code>
     */
	@Override
    public ValorOid getOid() {
        return new ValorOid(getValorIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ValorConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.VALOR)) {
            // Add this class
            activeFacets.add(Constants.VALOR);
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
            relatedInstance = buildValorRelatedInstance(relatedInstanceJsonOid);
        }
        if (ValorConstants.ROLE_NAME_PREGUNTAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildValorRelatedInstance4Pregunta(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildValorRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Valor(mapper.readValue(relatedInstanceJsonOid, ValorOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Valor.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildValorRelatedInstance4Pregunta(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class)): Pregunta.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Valor.class).error(e.getMessage());
            return null;
        }
    }
}
