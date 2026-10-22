package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.CuestionarioMedConstants;
import com.keralty.aepersonas.persistence.oid.CuestionarioMedOid;
import com.keralty.aepersonas.persistence.oid.SeccionOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
 * Persistent representation of the <code>CuestionarioMed</code> model class.
 * <p>
 * Model Class: <code>CuestionarioMed</code><br>
 */
@Entity(name = CuestionarioMedConstants.CLASS_NAME)
@Table(name = CuestionarioMedConstants.TBL_NAME)
public class CuestionarioMed extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CuestionarioMed_Sequence")
    @SequenceGenerator(name="CuestionarioMed_Sequence", sequenceName="CuestionarioMed_Sequence", allocationSize=1)
    @Column(name = CuestionarioMedConstants.FLD_CUESTIONARIOMEDNUMERO )
    @JsonProperty(value="numero")
    private Long cuestionarioMedNumero;

    /** Class member attribute. */
    @Column(name = CuestionarioMedConstants.FLD_CUESTIONARIOMEDNOMBRE )
    @JsonProperty(value="nombre")
    private String cuestionarioMedNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCuestionarioMedNombre;

    /** Related Class. */
    @OneToMany(mappedBy = CuestionarioMedConstants.ROLE_INVNAME_SECCIONES)
    @JsonIgnore
    private Collection <Seccion> secciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSecciones;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public CuestionarioMed() {
        cuestionarioMedNumero = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>CuestionarioMed</code>.
     * @param oid Object Identifier of the instance of <code>CuestionarioMed</code> to be created.
     * @throws SystemException
     */
    public CuestionarioMed(CuestionarioMedOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            cuestionarioMedNumero = oid.getCuestionarioMedNumero();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>cuestionarioMedNumero</code> attribute<br>in class <code>CuestionarioMed</code>.
     * This is part of the identification for this class, which depends on the identification of <code>CuestionarioMed</code>
     * @return The value of the <code>cuestionarioMedNumero</code> attribute<br>in class <code>CuestionarioMed</code>.
     */
    public Long getCuestionarioMedNumero() {
        return cuestionarioMedNumero;
    }

    /**
     * Sets the value of the <code>cuestionarioMedNumero</code> attribute<br>in class <code>CuestionarioMed</code>.
     * This is part of the identification for this class, which depends on the identification of <code>CuestionarioMed</code>
     * @param cuestionarioMedNumero The new value of the <code>cuestionarioMedNumero</code> attribute<br>in class <code>CuestionarioMed</code>.
     */
    public void setCuestionarioMedNumero(Long cuestionarioMedNumero) {
        this.cuestionarioMedNumero = cuestionarioMedNumero;
    }

   /**
    * Returns the value of the <code>cuestionarioMedNombre</code> attribute.<br>
    * Model Attribute: <code>cuestionarioMedNombre</code>. Constant String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>cuestionarioMedNombre</code> attribute.
    */

    public String getCuestionarioMedNombre()  {
    	String value;
        value =  cuestionarioMedNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>cuestionarioMedNombre</code> attribute.<br>
    * Model Attribute: <code>cuestionarioMedNombre</code>. Constant String Size=100<br>
    * Comments: <br>
    * @param cuestionarioMedNombre The new value of the <code>cuestionarioMedNombre</code> attribute.
    */
    public void setCuestionarioMedNombre (String cuestionarioMedNombre) {
        modifiedCuestionarioMedNombre = true;
        this.cuestionarioMedNombre = cuestionarioMedNombre;
    }

   /**
    * Sets the value of the <code>modifiedCuestionarioMedNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedCuestionarioMedNombre</code>.
    */
    public void setModifiedCuestionarioMedNombre(boolean modified) {
        this.modifiedCuestionarioMedNombre = modified;
    }

    /**
     * Returns the instance of <code>Seccion</code> related through the <code>Secciones</code> role.
     * Model Relationship:
     * <code>[Seccion] Secciones 0:M  ------ 1:1  Cuestionario [CuestionarioMed]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Seccion</code> related through the <code>Secciones</code> role.
     */
    @JsonIgnore
    public Collection <Seccion> getSecciones() {
        return secciones;
    }

    /**
     * Adds an instance of <code>Seccion</code> related through the <code>Secciones</code> role.
     * @param secciones The instance to add to the <code>Secciones</code> role.
     */
    public void add2Secciones(Seccion secciones) {
        this.secciones.add(secciones);
    }
    /**
     * Removes an instance of <code>Seccion</code> related through the <code>Secciones</code> role.
     * @param secciones The instance to be removed
     */
    public void removeFromSecciones(Seccion secciones) {
    	this.secciones.remove(secciones);
    }
    /**
     * Sets instances of <code>Seccion</code> related through the <code>Secciones</code> role.
     * @param secciones The new value for the <code>Secciones</code> role.
     */
    public void setSecciones(Collection < Seccion > secciones) {
        this.secciones = secciones;
    }

   /**
    * This method gets the attribute value <code>modifiedSecciones</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSecciones</code> has been modified.
    */
    public boolean isModifiedSecciones(){
        return modifiedSecciones;
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
        cuestionarioMedNombre = "";
        secciones = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return CuestionarioMed.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return CuestionarioMedConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedCuestionarioMedNombre = false;
    	values.put("cuestionarioMedNombre", getCuestionarioMedNombre());
    	modifiedSecciones = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>CuestionarioMedOid</code> object that identifies this instance of <code>CuestionarioMed</code>.
     * @return <code>CuestionarioMedOid </code> object that identifies this instance of <code>CuestionarioMed</code>
     */
	@Override
    public CuestionarioMedOid getOid() {
        return new CuestionarioMedOid(getCuestionarioMedNumero());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(CuestionarioMedConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CUESTIONARIOMED)) {
            // Add this class
            activeFacets.add(Constants.CUESTIONARIOMED);
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
            relatedInstance = buildCuestionarioMedRelatedInstance(relatedInstanceJsonOid);
        }
        if (CuestionarioMedConstants.ROLE_NAME_SECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCuestionarioMedRelatedInstance4Seccion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildCuestionarioMedRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new CuestionarioMed(mapper.readValue(relatedInstanceJsonOid, CuestionarioMedOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CuestionarioMed.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCuestionarioMedRelatedInstance4Seccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Seccion(mapper.readValue(relatedInstanceJsonOid, SeccionOid.class)): Seccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CuestionarioMed.class).error(e.getMessage());
            return null;
        }
    }
}
