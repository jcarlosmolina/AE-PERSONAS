package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PaisConstants;
import com.keralty.aepersonas.persistence.oid.DireccionCOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.DirSucursalCOid;
import com.keralty.aepersonas.persistence.oid.NovedadCTOid;
import com.keralty.aepersonas.persistence.oid.NovedadMDOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
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
 * Persistent representation of the <code>Pais</code> model class.
 * <p>
 * Model Class: <code>Pais</code><br>
 */
@Entity(name = PaisConstants.CLASS_NAME)
@Table(name = PaisConstants.TBL_NAME)
public class Pais extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient DireccionJpaRepository direccionRepository;

    /** Class identification function. */
    @Id
    @Column(name = PaisConstants.FLD_PAISCODIGO )
    @JsonProperty(value="codigo")
    private String paisCodigo;

    /** Class member attribute. */
    @Column(name = PaisConstants.FLD_PAISDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String paisDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPaisDescripcion;

    /** Related Class. */
    @OneToMany(mappedBy = PaisConstants.ROLE_INVNAME_DIRECCIONESC)
    @JsonIgnore
    private Collection <DireccionC> direccionesC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionesC;

    /** Related Class. */
    @OneToMany(mappedBy = PaisConstants.ROLE_INVNAME_DIRECCIONES)
    @JsonIgnore
    private Collection <Direccion> direcciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirecciones;

    /** Related Class. */
    @OneToMany(mappedBy = PaisConstants.ROLE_INVNAME_DIRSUCURSALC)
    @JsonIgnore
    private Collection <DirSucursalC> dirSucursalC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalC;

    /** Related Class. */
    @OneToMany(mappedBy = PaisConstants.ROLE_INVNAME_NOVEDADCT)
    @JsonIgnore
    private Collection <NovedadCT> novedadCT;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCT;

    /** Related Class. */
    @OneToMany(mappedBy = PaisConstants.ROLE_INVNAME_NOVEDADESMD)
    @JsonIgnore
    private Collection <NovedadMD> novedadesMD;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadesMD;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Pais() {
        paisCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Pais</code>.
     * @param oid Object Identifier of the instance of <code>Pais</code> to be created.
     * @throws SystemException
     */
    public Pais(PaisOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            paisCodigo = oid.getPaisCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>paisCodigo</code> attribute<br>in class <code>Pais</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Pais</code>
     * @return The value of the <code>paisCodigo</code> attribute<br>in class <code>Pais</code>.
     */
    public String getPaisCodigo() {
        return (paisCodigo == null ? paisCodigo : paisCodigo.trim());
    }

    /**
     * Sets the value of the <code>paisCodigo</code> attribute<br>in class <code>Pais</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Pais</code>
     * @param paisCodigo The new value of the <code>paisCodigo</code> attribute<br>in class <code>Pais</code>.
     */
    public void setPaisCodigo(String paisCodigo) {
        this.paisCodigo = paisCodigo;
    }

   /**
    * Returns the value of the <code>paisDescripcion</code> attribute.<br>
    * Model Attribute: <code>paisDescripcion</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>paisDescripcion</code> attribute.
    */

    public String getPaisDescripcion()  {
    	String value;
        value =  paisDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>paisDescripcion</code> attribute.<br>
    * Model Attribute: <code>paisDescripcion</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param paisDescripcion The new value of the <code>paisDescripcion</code> attribute.
    */
    public void setPaisDescripcion (String paisDescripcion) {
        modifiedPaisDescripcion = true;
        this.paisDescripcion = paisDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedPaisDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedPaisDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPaisDescripcion() {
        return modifiedPaisDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedPaisDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPaisDescripcion</code>.
    */
    public void setModifiedPaisDescripcion(boolean modified) {
        this.modifiedPaisDescripcion = modified;
    }

    /**
     * Returns the instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * Model Relationship:
     * <code>[DireccionC] DireccionesC 0:M  ------ 0:1  PaisC [Pais]</code>
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
     * <code>[Direccion] Direcciones 0:M  ------ 0:1  Pais [Pais]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     */
    @JsonIgnore
    public Collection <Direccion> getDirecciones() {
        return getDireccionRepository().findByPais(this);
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
     * Returns the instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * Model Relationship:
     * <code>[DirSucursalC] DirSucursalC 0:M  ------ 0:1  PaisC [Pais]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalC() {
        return dirSucursalC;
    }

    /**
     * Adds an instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * @param dirSucursalC The instance to add to the <code>DirSucursalC</code> role.
     */
    public void add2DirSucursalC(DirSucursalC dirSucursalC) {
        this.dirSucursalC.add(dirSucursalC);
    }
    /**
     * Removes an instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * @param dirSucursalC The instance to be removed
     */
    public void removeFromDirSucursalC(DirSucursalC dirSucursalC) {
    	this.dirSucursalC.remove(dirSucursalC);
    }
    /**
     * Sets instances of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * @param dirSucursalC The new value for the <code>DirSucursalC</code> role.
     */
    public void setDirSucursalC(Collection < DirSucursalC > dirSucursalC) {
        this.dirSucursalC = dirSucursalC;
    }

   /**
    * This method gets the attribute value <code>modifiedDirSucursalC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDirSucursalC</code> has been modified.
    */
    public boolean isModifiedDirSucursalC(){
        return modifiedDirSucursalC;
    }

    /**
     * Returns the instance of <code>NovedadCT</code> related through the <code>NovedadCT</code> role.
     * Model Relationship:
     * <code>[NovedadCT] NovedadCT 0:M  ------ 0:1  Pais [Pais]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>NovedadCT</code> related through the <code>NovedadCT</code> role.
     */
    @JsonIgnore
    public Collection <NovedadCT> getNovedadCT() {
        return novedadCT;
    }

    /**
     * Adds an instance of <code>NovedadCT</code> related through the <code>NovedadCT</code> role.
     * @param novedadCT The instance to add to the <code>NovedadCT</code> role.
     */
    public void add2NovedadCT(NovedadCT novedadCT) {
        this.novedadCT.add(novedadCT);
    }
    /**
     * Removes an instance of <code>NovedadCT</code> related through the <code>NovedadCT</code> role.
     * @param novedadCT The instance to be removed
     */
    public void removeFromNovedadCT(NovedadCT novedadCT) {
    	this.novedadCT.remove(novedadCT);
    }
    /**
     * Sets instances of <code>NovedadCT</code> related through the <code>NovedadCT</code> role.
     * @param novedadCT The new value for the <code>NovedadCT</code> role.
     */
    public void setNovedadCT(Collection < NovedadCT > novedadCT) {
        this.novedadCT = novedadCT;
    }

   /**
    * This method gets the attribute value <code>modifiedNovedadCT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedadCT</code> has been modified.
    */
    public boolean isModifiedNovedadCT(){
        return modifiedNovedadCT;
    }

    /**
     * Returns the instance of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     * Model Relationship:
     * <code>[NovedadMD] NovedadesMD 0:M  ------ 0:1  Pais [Pais]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     */
    @JsonIgnore
    public Collection <NovedadMD> getNovedadesMD() {
        return novedadesMD;
    }

    /**
     * Adds an instance of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     * @param novedadesMD The instance to add to the <code>NovedadesMD</code> role.
     */
    public void add2NovedadesMD(NovedadMD novedadesMD) {
        this.novedadesMD.add(novedadesMD);
    }
    /**
     * Removes an instance of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     * @param novedadesMD The instance to be removed
     */
    public void removeFromNovedadesMD(NovedadMD novedadesMD) {
    	this.novedadesMD.remove(novedadesMD);
    }
    /**
     * Sets instances of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     * @param novedadesMD The new value for the <code>NovedadesMD</code> role.
     */
    public void setNovedadesMD(Collection < NovedadMD > novedadesMD) {
        this.novedadesMD = novedadesMD;
    }

   /**
    * This method gets the attribute value <code>modifiedNovedadesMD</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedadesMD</code> has been modified.
    */
    public boolean isModifiedNovedadesMD(){
        return modifiedNovedadesMD;
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
        paisDescripcion = null;
        direccionesC = null;
        direcciones = null;
        dirSucursalC = null;
        novedadCT = null;
        novedadesMD = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public DireccionJpaRepository getDireccionRepository() {
        return Arc.container().select(DireccionJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Pais.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PaisConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPaisDescripcion = false;
    	values.put("paisDescripcion", getPaisDescripcion());
    	modifiedDireccionesC = false;
    	modifiedDirecciones = false;
    	modifiedDirSucursalC = false;
    	modifiedNovedadCT = false;
    	modifiedNovedadesMD = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>PaisOid</code> object that identifies this instance of <code>Pais</code>.
     * @return <code>PaisOid </code> object that identifies this instance of <code>Pais</code>
     */
	@Override
    public PaisOid getOid() {
        return new PaisOid(getPaisCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PaisConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PAIS)) {
            // Add this class
            activeFacets.add(Constants.PAIS);
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

    public String buildICPais() {
        try {
            return getPaisDescripcion();
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
            relatedInstance = buildPaisRelatedInstance(relatedInstanceJsonOid);
        }
        if (PaisConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (PaisConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (PaisConstants.ROLE_NAME_DIRSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (PaisConstants.ROLE_NAME_NOVEDADCT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        if (PaisConstants.ROLE_NAME_NOVEDADESMD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4NovedadMD(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPaisRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4NovedadMD(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class)): NovedadMD.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
