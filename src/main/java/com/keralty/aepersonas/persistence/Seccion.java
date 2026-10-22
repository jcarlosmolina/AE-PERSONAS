package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.CuestionarioMedConstants;
import com.keralty.aepersonas.global.SeccionConstants;
import com.keralty.aepersonas.persistence.oid.CuestionarioMedOid;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.SeccionOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
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
 * Persistent representation of the <code>Seccion</code> model class.
 * <p>
 * Model Class: <code>Seccion</code><br>
 */
@Entity(name = SeccionConstants.CLASS_NAME)
@Table(name = SeccionConstants.TBL_NAME)
public class Seccion extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Seccion_Sequence")
    @SequenceGenerator(name="Seccion_Sequence", sequenceName="Seccion_Sequence", allocationSize=1)
    @Column(name = SeccionConstants.FLD_SECCIONIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long seccionIdentificador;

    /** Class member attribute. */
    @Column(name = SeccionConstants.FLD_SECCIONNOMBRE )
    @JsonProperty(value="nombre")
    private String seccionNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSeccionNombre;

    /** Class member attribute. */
    @Column(name = SeccionConstants.FLD_SECCIONNUMORDEN )
    @JsonProperty(value="numorden")
    private Long seccionNumOrden;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSeccionNumOrden;

    /** Related Class. */
    @OneToMany(mappedBy = SeccionConstants.ROLE_INVNAME_PREGUNTAS)
    @JsonIgnore
    private Collection <Pregunta> preguntas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntas;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SeccionConstants.FLD_CUESTIONARIOMEDNUMERO, referencedColumnName=CuestionarioMedConstants.FLD_CUESTIONARIOMEDNUMERO)
    })
    @JsonIgnore
    private CuestionarioMed cuestionario;
    /** Related attribute. */
    @Column(name = SeccionConstants.FLD_CUESTIONARIOMEDNUMERO, insertable = false, updatable = false)
    private Long cuestionarioMedNumero;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCuestionario;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Seccion() {
        seccionIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Seccion</code>.
     * @param oid Object Identifier of the instance of <code>Seccion</code> to be created.
     * @throws SystemException
     */
    public Seccion(SeccionOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            seccionIdentificador = oid.getSeccionIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>seccionIdentificador</code> attribute<br>in class <code>Seccion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Seccion</code>
     * @return The value of the <code>seccionIdentificador</code> attribute<br>in class <code>Seccion</code>.
     */
    public Long getSeccionIdentificador() {
        return seccionIdentificador;
    }

    /**
     * Sets the value of the <code>seccionIdentificador</code> attribute<br>in class <code>Seccion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Seccion</code>
     * @param seccionIdentificador The new value of the <code>seccionIdentificador</code> attribute<br>in class <code>Seccion</code>.
     */
    public void setSeccionIdentificador(Long seccionIdentificador) {
        this.seccionIdentificador = seccionIdentificador;
    }

   /**
    * Returns the value of the <code>seccionNombre</code> attribute.<br>
    * Model Attribute: <code>seccionNombre</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>seccionNombre</code> attribute.
    */

    public String getSeccionNombre()  {
    	String value;
        value =  seccionNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>seccionNombre</code> attribute.<br>
    * Model Attribute: <code>seccionNombre</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param seccionNombre The new value of the <code>seccionNombre</code> attribute.
    */
    public void setSeccionNombre (String seccionNombre) {
        modifiedSeccionNombre = true;
        this.seccionNombre = seccionNombre;
    }

   /**
    * Sets the value of the <code>modifiedSeccionNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedSeccionNombre</code>.
    */
    public void setModifiedSeccionNombre(boolean modified) {
        this.modifiedSeccionNombre = modified;
    }

   /**
    * Returns the value of the <code>seccionNumOrden</code> attribute.<br>
    * Model Attribute: <code>seccionNumOrden</code>. Variable Nat<br>
    * Comments: En qué orden tiene que aparecer esta sección dentro del cuestionario<br>
    * @return The value of the <code>seccionNumOrden</code> attribute.
    */

    public Long getSeccionNumOrden()  {
    	Long value;
        value =  seccionNumOrden;
        return value;
    }

   /**
    * Sets the value of the <code>seccionNumOrden</code> attribute.<br>
    * Model Attribute: <code>seccionNumOrden</code>. Variable Nat<br>
    * Comments: En qué orden tiene que aparecer esta sección dentro del cuestionario<br>
    * @param seccionNumOrden The new value of the <code>seccionNumOrden</code> attribute.
    */
    public void setSeccionNumOrden (Long seccionNumOrden) {
        modifiedSeccionNumOrden = true;
        this.seccionNumOrden = seccionNumOrden;
    }

   /**
    * Sets the value of the <code>modifiedSeccionNumOrden</code> class property.<br>
    * @param modified The new value of the <code>modifiedSeccionNumOrden</code>.
    */
    public void setModifiedSeccionNumOrden(boolean modified) {
        this.modifiedSeccionNumOrden = modified;
    }

    /**
     * Returns the instance of <code>Pregunta</code> related through the <code>Preguntas</code> role.
     * Model Relationship:
     * <code>[Pregunta] Preguntas 0:M  ------ 1:1  Seccion [Seccion]</code>
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
     * Returns the instance of <code>CuestionarioMed</code> related through the <code>Cuestionario</code> role.
     * Model Relationship:
     * <code>[CuestionarioMed] Cuestionario 1:1  ------ 0:M  Secciones [Seccion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>CuestionarioMed</code> related through the <code>Cuestionario</code> role.
     */
    @JsonIgnore
    public CuestionarioMed getCuestionario() {
        return cuestionario;
    }

    /**
     * Adds an instance of <code>CuestionarioMed</code> related through the <code>Cuestionario</code> role.
     * @param cuestionario The instance to add to the <code>Cuestionario</code> role.
     */
    public void add2Cuestionario(CuestionarioMed cuestionario) {
        if (cuestionario == null || cuestionario.isNull()) {
            this.modifiedCuestionario = true;
            this.cuestionarioMedNumero = null;
        } else {
            this.cuestionarioMedNumero = cuestionario.getCuestionarioMedNumero();
        }
        this.cuestionario = (cuestionario == null  || cuestionario.isNull() ? null : cuestionario);
    }

   /**
    * This method gets the attribute value <code>modifiedCuestionario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedCuestionario</code> has been modified.
    */
    public boolean isModifiedCuestionario(){
        return modifiedCuestionario;
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
        seccionNombre = "";
        seccionNumOrden = Long.valueOf(0);
        preguntas = null;
        cuestionario = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return Seccion.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return SeccionConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedSeccionNombre = false;
    	values.put("seccionNombre", getSeccionNombre());
    	modifiedSeccionNumOrden = false;
    	values.put("seccionNumOrden", getSeccionNumOrden());
    	modifiedPreguntas = false;
    	modifiedCuestionario = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>SeccionOid</code> object that identifies this instance of <code>Seccion</code>.
     * @return <code>SeccionOid </code> object that identifies this instance of <code>Seccion</code>
     */
	@Override
    public SeccionOid getOid() {
        return new SeccionOid(getSeccionIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(SeccionConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(SeccionConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.SECCION)) {
            // Add this class
            activeFacets.add(Constants.SECCION);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildSeccionRelatedInstance(relatedInstanceJsonOid);
        }
        if (SeccionConstants.ROLE_NAME_PREGUNTAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionRelatedInstance4Pregunta(relatedInstanceJsonOid, remainingPath);
        }
        if (SeccionConstants.ROLE_NAME_CUESTIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionRelatedInstance4CuestionarioMed(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildSeccionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Seccion(mapper.readValue(relatedInstanceJsonOid, SeccionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Seccion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSeccionRelatedInstance4Pregunta(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class)): Pregunta.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Seccion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSeccionRelatedInstance4CuestionarioMed(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new CuestionarioMed(mapper.readValue(relatedInstanceJsonOid, CuestionarioMedOid.class)): CuestionarioMed.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Seccion.class).error(e.getMessage());
            return null;
        }
    }
}
