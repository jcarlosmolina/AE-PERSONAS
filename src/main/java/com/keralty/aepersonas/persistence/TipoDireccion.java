package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.persistence.oid.DireccionCOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.repository.DireccionJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
 * Persistent representation of the <code>TipoDireccion</code> model class.
 * <p>
 * Model Class: <code>TipoDireccion</code><br>
 */
@Entity(name = TipoDireccionConstants.CLASS_NAME)
@Table(name = TipoDireccionConstants.TBL_NAME)
public class TipoDireccion extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient DireccionJpaRepository direccionRepository;

    /** Class identification function. */
    @Id
    @Column(name = TipoDireccionConstants.FLD_TIPODIRECCIONCODIGO )
    @JsonProperty(value="codigo")
    private Long tipoDireccionCodigo;

    /** Class member attribute. */
    @Column(name = TipoDireccionConstants.FLD_TIPODIRECCIONDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String tipoDireccionDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoDireccionDescripcion;

    /** Class member attribute. */
    @Column(name = TipoDireccionConstants.FLD_TIPODIRECCIONESRESIDENCIA )
    @JsonProperty(value="esresidencia")
    private Boolean tipoDireccionEsResidencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoDireccionEsResidencia;

    /** Class member attribute. */
    @Column(name = TipoDireccionConstants.FLD_TIPODIRECCIONESCORRESPONDENCIA )
    @JsonProperty(value="escorrespondencia")
    private Boolean tipoDireccionEsCorrespondencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoDireccionEsCorrespondencia;

    /** Related Class. */
    @OneToMany(mappedBy = TipoDireccionConstants.ROLE_INVNAME_DIRECCIONESC)
    @JsonIgnore
    private Collection <DireccionC> direccionesC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionesC;

    /** Related Class. */
    @OneToMany(mappedBy = TipoDireccionConstants.ROLE_INVNAME_DIRECCIONES)
    @JsonIgnore
    private Collection <Direccion> direcciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirecciones;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public TipoDireccion() {
        tipoDireccionCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TipoDireccion</code>.
     * @param oid Object Identifier of the instance of <code>TipoDireccion</code> to be created.
     * @throws SystemException
     */
    public TipoDireccion(TipoDireccionOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            tipoDireccionCodigo = oid.getTipoDireccionCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>tipoDireccionCodigo</code> attribute<br>in class <code>TipoDireccion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoDireccion</code>
     * @return The value of the <code>tipoDireccionCodigo</code> attribute<br>in class <code>TipoDireccion</code>.
     */
    public Long getTipoDireccionCodigo() {
        return tipoDireccionCodigo;
    }

    /**
     * Sets the value of the <code>tipoDireccionCodigo</code> attribute<br>in class <code>TipoDireccion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoDireccion</code>
     * @param tipoDireccionCodigo The new value of the <code>tipoDireccionCodigo</code> attribute<br>in class <code>TipoDireccion</code>.
     */
    public void setTipoDireccionCodigo(Long tipoDireccionCodigo) {
        this.tipoDireccionCodigo = tipoDireccionCodigo;
    }

   /**
    * Returns the value of the <code>tipoDireccionDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoDireccionDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>tipoDireccionDescripcion</code> attribute.
    */

    public String getTipoDireccionDescripcion()  {
    	String value;
        value =  tipoDireccionDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoDireccionDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoDireccionDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param tipoDireccionDescripcion The new value of the <code>tipoDireccionDescripcion</code> attribute.
    */
    public void setTipoDireccionDescripcion (String tipoDireccionDescripcion) {
        modifiedTipoDireccionDescripcion = true;
        this.tipoDireccionDescripcion = tipoDireccionDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedTipoDireccionDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoDireccionDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoDireccionDescripcion() {
        return modifiedTipoDireccionDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedTipoDireccionDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoDireccionDescripcion</code>.
    */
    public void setModifiedTipoDireccionDescripcion(boolean modified) {
        this.modifiedTipoDireccionDescripcion = modified;
    }

   /**
    * Returns the value of the <code>tipoDireccionEsResidencia</code> attribute.<br>
    * Model Attribute: <code>tipoDireccionEsResidencia</code>. Variable Bool<br>
    * Comments: Este check se marcará para la dirección de residencia. En Afiliación Electrónica, al crear o modificar los datos de una persona, si se modifican sus datos de contacto, la dirección que se modificará será la de residencia. Necesitamos saber qué tipo de dirección corresponde con la dirección de residencia, que es la que se puede modificar<br>
    * @return The value of the <code>tipoDireccionEsResidencia</code> attribute.
    */

    public Boolean getTipoDireccionEsResidencia()  {
    	Boolean value;
        value =  tipoDireccionEsResidencia;
        return value;
    }

   /**
    * Sets the value of the <code>tipoDireccionEsResidencia</code> attribute.<br>
    * Model Attribute: <code>tipoDireccionEsResidencia</code>. Variable Bool<br>
    * Comments: Este check se marcará para la dirección de residencia. En Afiliación Electrónica, al crear o modificar los datos de una persona, si se modifican sus datos de contacto, la dirección que se modificará será la de residencia. Necesitamos saber qué tipo de dirección corresponde con la dirección de residencia, que es la que se puede modificar<br>
    * @param tipoDireccionEsResidencia The new value of the <code>tipoDireccionEsResidencia</code> attribute.
    */
    public void setTipoDireccionEsResidencia (Boolean tipoDireccionEsResidencia) {
        modifiedTipoDireccionEsResidencia = true;
        this.tipoDireccionEsResidencia = tipoDireccionEsResidencia;
    }

   /**
    * Returns the value of the <code>modifiedTipoDireccionEsResidencia</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoDireccionEsResidencia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoDireccionEsResidencia() {
        return modifiedTipoDireccionEsResidencia;
    }

   /**
    * Sets the value of the <code>modifiedTipoDireccionEsResidencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoDireccionEsResidencia</code>.
    */
    public void setModifiedTipoDireccionEsResidencia(boolean modified) {
        this.modifiedTipoDireccionEsResidencia = modified;
    }

   /**
    * Returns the value of the <code>tipoDireccionEsCorrespondencia</code> attribute.<br>
    * Model Attribute: <code>tipoDireccionEsCorrespondencia</code>. Variable Bool<br>
    * Comments: Cuando se recuperan las direcciones de una persona, por defecto se debe visualizar la de correspondencia. Necesitamos saber cuál es el que corresponde con la dirección de correspondencia.<br>
    * @return The value of the <code>tipoDireccionEsCorrespondencia</code> attribute.
    */

    public Boolean getTipoDireccionEsCorrespondencia()  {
    	Boolean value;
        value =  tipoDireccionEsCorrespondencia;
        return value;
    }

   /**
    * Sets the value of the <code>tipoDireccionEsCorrespondencia</code> attribute.<br>
    * Model Attribute: <code>tipoDireccionEsCorrespondencia</code>. Variable Bool<br>
    * Comments: Cuando se recuperan las direcciones de una persona, por defecto se debe visualizar la de correspondencia. Necesitamos saber cuál es el que corresponde con la dirección de correspondencia.<br>
    * @param tipoDireccionEsCorrespondencia The new value of the <code>tipoDireccionEsCorrespondencia</code> attribute.
    */
    public void setTipoDireccionEsCorrespondencia (Boolean tipoDireccionEsCorrespondencia) {
        modifiedTipoDireccionEsCorrespondencia = true;
        this.tipoDireccionEsCorrespondencia = tipoDireccionEsCorrespondencia;
    }

   /**
    * Returns the value of the <code>modifiedTipoDireccionEsCorrespondencia</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoDireccionEsCorrespondencia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoDireccionEsCorrespondencia() {
        return modifiedTipoDireccionEsCorrespondencia;
    }

   /**
    * Sets the value of the <code>modifiedTipoDireccionEsCorrespondencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoDireccionEsCorrespondencia</code>.
    */
    public void setModifiedTipoDireccionEsCorrespondencia(boolean modified) {
        this.modifiedTipoDireccionEsCorrespondencia = modified;
    }

    /**
     * Returns the instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * Model Relationship:
     * <code>[DireccionC] DireccionesC 0:M  ------ 0:1  TipoDireccionC [TipoDireccion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     */
    @JsonIgnore
    public Collection <DireccionC> getDireccionesC() {
        return direccionesC;
    }

    /**
     * Adds an instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * @param direccionesC The instance to add to the <code>DireccionesC</code> role.
     */
    public void add2DireccionesC(DireccionC direccionesC) {
        this.direccionesC.add(direccionesC);
    }
    /**
     * Removes an instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * @param direccionesC The instance to be removed
     */
    public void removeFromDireccionesC(DireccionC direccionesC) {
    	this.direccionesC.remove(direccionesC);
    }
    /**
     * Sets instances of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * @param direccionesC The new value for the <code>DireccionesC</code> role.
     */
    public void setDireccionesC(Collection < DireccionC > direccionesC) {
        this.direccionesC = direccionesC;
    }

   /**
    * This method gets the attribute value <code>modifiedDireccionesC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDireccionesC</code> has been modified.
    */
    public boolean isModifiedDireccionesC(){
        return modifiedDireccionesC;
    }

    /**
     * Returns the instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * Model Relationship:
     * <code>[Direccion] Direcciones 0:M  ------ 0:1  TipoDireccion [TipoDireccion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     */
    @JsonIgnore
    public Collection <Direccion> getDirecciones() {
        return getDireccionRepository().findByTipoDireccion(this);
    }

    /**
     * Adds an instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * @param direcciones The instance to add to the <code>Direcciones</code> role.
     */
    public void add2Direcciones(Direccion direcciones) {
        this.direcciones.add(direcciones);
    }
    /**
     * Removes an instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * @param direcciones The instance to be removed
     */
    public void removeFromDirecciones(Direccion direcciones) {
    	this.direcciones.remove(direcciones);
    }
    /**
     * Sets instances of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * @param direcciones The new value for the <code>Direcciones</code> role.
     */
    public void setDirecciones(Collection < Direccion > direcciones) {
        this.direcciones = direcciones;
    }

   /**
    * This method gets the attribute value <code>modifiedDirecciones</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDirecciones</code> has been modified.
    */
    public boolean isModifiedDirecciones(){
        return modifiedDirecciones;
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
        tipoDireccionDescripcion = "";
        tipoDireccionEsResidencia = false;
        tipoDireccionEsCorrespondencia = false;
        direccionesC = null;
        direcciones = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public DireccionJpaRepository getDireccionRepository() {
        return Arc.container().select(DireccionJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return TipoDireccion.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TipoDireccionConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedTipoDireccionDescripcion = false;
    	values.put("tipoDireccionDescripcion", getTipoDireccionDescripcion());
    	modifiedTipoDireccionEsResidencia = false;
    	values.put("tipoDireccionEsResidencia", getTipoDireccionEsResidencia());
    	modifiedTipoDireccionEsCorrespondencia = false;
    	values.put("tipoDireccionEsCorrespondencia", getTipoDireccionEsCorrespondencia());
    	modifiedDireccionesC = false;
    	modifiedDirecciones = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>TipoDireccionOid</code> object that identifies this instance of <code>TipoDireccion</code>.
     * @return <code>TipoDireccionOid </code> object that identifies this instance of <code>TipoDireccion</code>
     */
	@Override
    public TipoDireccionOid getOid() {
        return new TipoDireccionOid(getTipoDireccionCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TipoDireccionConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TIPODIRECCION)) {
            // Add this class
            activeFacets.add(Constants.TIPODIRECCION);
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

    public String buildICTipoDireccion() {
        try {
            return getTipoDireccionDescripcion();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
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
            relatedInstance = buildTipoDireccionRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoDireccionConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoDireccionRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoDireccionConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoDireccionRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoDireccionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoDireccion(mapper.readValue(relatedInstanceJsonOid, TipoDireccionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoDireccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoDireccionRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoDireccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoDireccionRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoDireccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
