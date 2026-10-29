package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.MarcaMedicaCConstants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.persistence.oid.MarcaMedicaCOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
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
 * Persistent representation of the <code>MarcaMedicaC</code> model class.
 * <p>
 * Model Class: <code>MarcaMedicaC</code><br>
 */
@Entity(name = MarcaMedicaCConstants.CLASS_NAME)
@Table(name = MarcaMedicaCConstants.TBL_NAME)
public class MarcaMedicaC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private MarcaMedicaCOid oid;

    /** Class identification function. */
    @Column(name = MarcaMedicaCConstants.FLD_PERSONACID, insertable = false, updatable = false )
    @JsonProperty(value="id")
    private Long personaCID;

    /** Class identification function. */
    @Column(name = MarcaMedicaCConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false )
    @JsonProperty(value="producto")
    private Long productosProducto;

    /** Class identification function. */
    @Column(name = MarcaMedicaCConstants.FLD_MARCAMEDICACCODIGO, insertable = false, updatable = false )
    @JsonProperty(value="codigo")
    private String marcaMedicaCCodigo;

    /** Class member attribute. */
    @Column(name = MarcaMedicaCConstants.FLD_MARCAMEDICACDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String marcaMedicaCDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMarcaMedicaCDescripcion;

    /** Class member attribute. */
    @Column(name = MarcaMedicaCConstants.FLD_MARCAMEDICACTIPOMARCACION )
    @JsonProperty(value="tipomarcacion")
    private String marcaMedicaCTipoMarcacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMarcaMedicaCTipoMarcacion;

    /** Class member attribute. */
    @Column(name = MarcaMedicaCConstants.FLD_MARCAMEDICACEXIMEPAGOPRESTACION )
    @JsonProperty(value="eximepagoprestacion")
    private Boolean marcaMedicaCEximePagoPrestacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMarcaMedicaCEximePagoPrestacion;

    /** Class member attribute. */
    @Column(name = MarcaMedicaCConstants.FLD_MARCAMEDICACESTADOMARCACIONMEDICA )
    @JsonProperty(value="estadomarcacionmedica")
    private String marcaMedicaCEstadoMarcacionMedica;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMarcaMedicaCEstadoMarcacionMedica;

    /** Class member attribute. */
    @Column(name = MarcaMedicaCConstants.FLD_MARCAMEDICACFECHAINICIO )
    @JsonProperty(value="fechainicio")
    private Date marcaMedicaCFechaInicio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMarcaMedicaCFechaInicio;

    /** Class member attribute. */
    @Column(name = MarcaMedicaCConstants.FLD_MARCAMEDICACFECHAFIN )
    @JsonProperty(value="fechafin")
    private Date marcaMedicaCFechaFin;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMarcaMedicaCFechaFin;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=MarcaMedicaCConstants.FLD_PERSONACID, referencedColumnName=PersonaCConstants.FLD_PERSONACID, insertable = false, updatable = false)
    })
    @JsonIgnore
    private PersonaC personaC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=MarcaMedicaCConstants.FLD_PRODUCTOSPRODUCTO, referencedColumnName=ProductosConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false)
    })
    @JsonIgnore
    private Productos productoC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProductoC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public MarcaMedicaC() {
        personaCID = null;
        productosProducto = null;
        marcaMedicaCCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>MarcaMedicaC</code>.
     * @param oid Object Identifier of the instance of <code>MarcaMedicaC</code> to be created.
     * @throws SystemException
     */
    public MarcaMedicaC(MarcaMedicaCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            personaCID = oid.getPersonaCID();
            productosProducto = oid.getProductosProducto();
            marcaMedicaCCodigo = oid.getMarcaMedicaCCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code> through <code>PersonaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PersonaC</code>
     * @return The value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code> through <code>PersonaC</code>.
     */
    public Long getPersonaCID() {
        return (personaC != null ? personaC.getPersonaCID() : personaCID);
    }

    /**
     * Sets the value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code> through <code>PersonaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PersonaC</code>
     * @param personaCID The new value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code> through <code>PersonaC</code>.
     */
    public void setPersonaCID(Long personaCID) {
        this.personaCID = personaCID;
    }

    /**
     * Returns the value of the <code>productosProducto</code> attribute<br>in class <code>Productos</code> through <code>ProductoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Productos</code>
     * @return The value of the <code>productosProducto</code> attribute<br>in class <code>Productos</code> through <code>ProductoC</code>.
     */
    public Long getProductosProducto() {
        return (productoC != null ? productoC.getProductosProducto() : productosProducto);
    }

    /**
     * Sets the value of the <code>productosProducto</code> attribute<br>in class <code>Productos</code> through <code>ProductoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Productos</code>
     * @param productosProducto The new value of the <code>productosProducto</code> attribute<br>in class <code>Productos</code> through <code>ProductoC</code>.
     */
    public void setProductosProducto(Long productosProducto) {
        this.productosProducto = productosProducto;
    }

    /**
     * Returns the value of the <code>marcaMedicaCCodigo</code> attribute<br>in class <code>MarcaMedicaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>MarcaMedicaC</code>
     * @return The value of the <code>marcaMedicaCCodigo</code> attribute<br>in class <code>MarcaMedicaC</code>.
     */
    public String getMarcaMedicaCCodigo() {
        return (marcaMedicaCCodigo == null ? marcaMedicaCCodigo : marcaMedicaCCodigo.trim());
    }

    /**
     * Sets the value of the <code>marcaMedicaCCodigo</code> attribute<br>in class <code>MarcaMedicaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>MarcaMedicaC</code>
     * @param marcaMedicaCCodigo The new value of the <code>marcaMedicaCCodigo</code> attribute<br>in class <code>MarcaMedicaC</code>.
     */
    public void setMarcaMedicaCCodigo(String marcaMedicaCCodigo) {
        this.marcaMedicaCCodigo = marcaMedicaCCodigo;
    }

   /**
    * Returns the value of the <code>marcaMedicaCDescripcion</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCDescripcion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>marcaMedicaCDescripcion</code> attribute.
    */

    public String getMarcaMedicaCDescripcion()  {
    	String value;
        value =  marcaMedicaCDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>marcaMedicaCDescripcion</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCDescripcion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param marcaMedicaCDescripcion The new value of the <code>marcaMedicaCDescripcion</code> attribute.
    */
    public void setMarcaMedicaCDescripcion (String marcaMedicaCDescripcion) {
        modifiedMarcaMedicaCDescripcion = true;
        this.marcaMedicaCDescripcion = marcaMedicaCDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedMarcaMedicaCDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedMarcaMedicaCDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMarcaMedicaCDescripcion() {
        return modifiedMarcaMedicaCDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedMarcaMedicaCDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedMarcaMedicaCDescripcion</code>.
    */
    public void setModifiedMarcaMedicaCDescripcion(boolean modified) {
        this.modifiedMarcaMedicaCDescripcion = modified;
    }

   /**
    * Returns the value of the <code>marcaMedicaCTipoMarcacion</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCTipoMarcacion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>marcaMedicaCTipoMarcacion</code> attribute.
    */

    public String getMarcaMedicaCTipoMarcacion()  {
    	String value;
        value =  marcaMedicaCTipoMarcacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>marcaMedicaCTipoMarcacion</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCTipoMarcacion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param marcaMedicaCTipoMarcacion The new value of the <code>marcaMedicaCTipoMarcacion</code> attribute.
    */
    public void setMarcaMedicaCTipoMarcacion (String marcaMedicaCTipoMarcacion) {
        modifiedMarcaMedicaCTipoMarcacion = true;
        this.marcaMedicaCTipoMarcacion = marcaMedicaCTipoMarcacion;
    }

   /**
    * Returns the value of the <code>modifiedMarcaMedicaCTipoMarcacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedMarcaMedicaCTipoMarcacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMarcaMedicaCTipoMarcacion() {
        return modifiedMarcaMedicaCTipoMarcacion;
    }

   /**
    * Sets the value of the <code>modifiedMarcaMedicaCTipoMarcacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedMarcaMedicaCTipoMarcacion</code>.
    */
    public void setModifiedMarcaMedicaCTipoMarcacion(boolean modified) {
        this.modifiedMarcaMedicaCTipoMarcacion = modified;
    }

   /**
    * Returns the value of the <code>marcaMedicaCEximePagoPrestacion</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCEximePagoPrestacion</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>marcaMedicaCEximePagoPrestacion</code> attribute.
    */

    public Boolean getMarcaMedicaCEximePagoPrestacion()  {
    	Boolean value;
        value =  marcaMedicaCEximePagoPrestacion;
        return value;
    }

   /**
    * Sets the value of the <code>marcaMedicaCEximePagoPrestacion</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCEximePagoPrestacion</code>. Variable Bool<br>
    * Comments: <br>
    * @param marcaMedicaCEximePagoPrestacion The new value of the <code>marcaMedicaCEximePagoPrestacion</code> attribute.
    */
    public void setMarcaMedicaCEximePagoPrestacion (Boolean marcaMedicaCEximePagoPrestacion) {
        modifiedMarcaMedicaCEximePagoPrestacion = true;
        this.marcaMedicaCEximePagoPrestacion = marcaMedicaCEximePagoPrestacion;
    }

   /**
    * Returns the value of the <code>modifiedMarcaMedicaCEximePagoPrestacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedMarcaMedicaCEximePagoPrestacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMarcaMedicaCEximePagoPrestacion() {
        return modifiedMarcaMedicaCEximePagoPrestacion;
    }

   /**
    * Sets the value of the <code>modifiedMarcaMedicaCEximePagoPrestacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedMarcaMedicaCEximePagoPrestacion</code>.
    */
    public void setModifiedMarcaMedicaCEximePagoPrestacion(boolean modified) {
        this.modifiedMarcaMedicaCEximePagoPrestacion = modified;
    }

   /**
    * Returns the value of the <code>marcaMedicaCEstadoMarcacionMedica</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCEstadoMarcacionMedica</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>marcaMedicaCEstadoMarcacionMedica</code> attribute.
    */

    public String getMarcaMedicaCEstadoMarcacionMedica()  {
    	String value;
        value =  marcaMedicaCEstadoMarcacionMedica;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>marcaMedicaCEstadoMarcacionMedica</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCEstadoMarcacionMedica</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param marcaMedicaCEstadoMarcacionMedica The new value of the <code>marcaMedicaCEstadoMarcacionMedica</code> attribute.
    */
    public void setMarcaMedicaCEstadoMarcacionMedica (String marcaMedicaCEstadoMarcacionMedica) {
        modifiedMarcaMedicaCEstadoMarcacionMedica = true;
        this.marcaMedicaCEstadoMarcacionMedica = marcaMedicaCEstadoMarcacionMedica;
    }

   /**
    * Returns the value of the <code>modifiedMarcaMedicaCEstadoMarcacionMedica</code> class property.<br>
    *
    * @return The value of the <code>modifiedMarcaMedicaCEstadoMarcacionMedica</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMarcaMedicaCEstadoMarcacionMedica() {
        return modifiedMarcaMedicaCEstadoMarcacionMedica;
    }

   /**
    * Sets the value of the <code>modifiedMarcaMedicaCEstadoMarcacionMedica</code> class property.<br>
    * @param modified The new value of the <code>modifiedMarcaMedicaCEstadoMarcacionMedica</code>.
    */
    public void setModifiedMarcaMedicaCEstadoMarcacionMedica(boolean modified) {
        this.modifiedMarcaMedicaCEstadoMarcacionMedica = modified;
    }

   /**
    * Returns the value of the <code>marcaMedicaCFechaInicio</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCFechaInicio</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>marcaMedicaCFechaInicio</code> attribute.
    */

    public Date getMarcaMedicaCFechaInicio()  {
    	Date value;
        value =  marcaMedicaCFechaInicio;
        return value;
    }

   /**
    * Sets the value of the <code>marcaMedicaCFechaInicio</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCFechaInicio</code>. Variable Date<br>
    * Comments: <br>
    * @param marcaMedicaCFechaInicio The new value of the <code>marcaMedicaCFechaInicio</code> attribute.
    */
    public void setMarcaMedicaCFechaInicio (Date marcaMedicaCFechaInicio) {
        modifiedMarcaMedicaCFechaInicio = true;
        this.marcaMedicaCFechaInicio = marcaMedicaCFechaInicio;
    }

   /**
    * Returns the value of the <code>modifiedMarcaMedicaCFechaInicio</code> class property.<br>
    *
    * @return The value of the <code>modifiedMarcaMedicaCFechaInicio</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMarcaMedicaCFechaInicio() {
        return modifiedMarcaMedicaCFechaInicio;
    }

   /**
    * Sets the value of the <code>modifiedMarcaMedicaCFechaInicio</code> class property.<br>
    * @param modified The new value of the <code>modifiedMarcaMedicaCFechaInicio</code>.
    */
    public void setModifiedMarcaMedicaCFechaInicio(boolean modified) {
        this.modifiedMarcaMedicaCFechaInicio = modified;
    }

   /**
    * Returns the value of the <code>marcaMedicaCFechaFin</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCFechaFin</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>marcaMedicaCFechaFin</code> attribute.
    */

    public Date getMarcaMedicaCFechaFin()  {
    	Date value;
        value =  marcaMedicaCFechaFin;
        return value;
    }

   /**
    * Sets the value of the <code>marcaMedicaCFechaFin</code> attribute.<br>
    * Model Attribute: <code>marcaMedicaCFechaFin</code>. Variable Date<br>
    * Comments: <br>
    * @param marcaMedicaCFechaFin The new value of the <code>marcaMedicaCFechaFin</code> attribute.
    */
    public void setMarcaMedicaCFechaFin (Date marcaMedicaCFechaFin) {
        modifiedMarcaMedicaCFechaFin = true;
        this.marcaMedicaCFechaFin = marcaMedicaCFechaFin;
    }

   /**
    * Returns the value of the <code>modifiedMarcaMedicaCFechaFin</code> class property.<br>
    *
    * @return The value of the <code>modifiedMarcaMedicaCFechaFin</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMarcaMedicaCFechaFin() {
        return modifiedMarcaMedicaCFechaFin;
    }

   /**
    * Sets the value of the <code>modifiedMarcaMedicaCFechaFin</code> class property.<br>
    * @param modified The new value of the <code>modifiedMarcaMedicaCFechaFin</code>.
    */
    public void setModifiedMarcaMedicaCFechaFin(boolean modified) {
        this.modifiedMarcaMedicaCFechaFin = modified;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonaC 1:1  ------ 0:M  MarcasMedicasC [MarcaMedicaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     */
    @JsonIgnore
    public PersonaC getPersonaC() {
        return personaC;
    }

    /**
     * Adds an instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     * @param personaC The instance to add to the <code>PersonaC</code> role.
     */
    public void add2PersonaC(PersonaC personaC) {
        if (personaC == null || personaC.isNull()) {
            this.modifiedPersonaC = true;
            this.personaCID = null;
        } else {
            this.personaCID = personaC.getPersonaCID();
        }
        this.personaC = (personaC == null  || personaC.isNull() ? null : personaC);
    }

   /**
    * This method gets the attribute value <code>modifiedPersonaC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPersonaC</code> has been modified.
    */
    public boolean isModifiedPersonaC(){
        return modifiedPersonaC;
    }

    /**
     * Returns the instance of <code>Productos</code> related through the <code>ProductoC</code> role.
     * Model Relationship:
     * <code>[Productos] ProductoC 1:1  ------ 0:M  MarcaMedicaC [MarcaMedicaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Productos</code> related through the <code>ProductoC</code> role.
     */
    @JsonIgnore
    public Productos getProductoC() {
        return productoC;
    }

    /**
     * Adds an instance of <code>Productos</code> related through the <code>ProductoC</code> role.
     * @param productoC The instance to add to the <code>ProductoC</code> role.
     */
    public void add2ProductoC(Productos productoC) {
        if (productoC == null || productoC.isNull()) {
            this.modifiedProductoC = true;
            this.productosProducto = null;
        } else {
            this.productosProducto = productoC.getProductosProducto();
        }
        this.productoC = (productoC == null  || productoC.isNull() ? null : productoC);
    }

   /**
    * This method gets the attribute value <code>modifiedProductoC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedProductoC</code> has been modified.
    */
    public boolean isModifiedProductoC(){
        return modifiedProductoC;
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
        marcaMedicaCDescripcion = null;
        marcaMedicaCTipoMarcacion = null;
        marcaMedicaCEximePagoPrestacion = null;
        marcaMedicaCEstadoMarcacionMedica = null;
        marcaMedicaCFechaInicio = null;
        marcaMedicaCFechaFin = null;
        personaC = null;
        productoC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return MarcaMedicaC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return MarcaMedicaCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedMarcaMedicaCDescripcion = false;
    	values.put("marcaMedicaCDescripcion", getMarcaMedicaCDescripcion());
    	modifiedMarcaMedicaCTipoMarcacion = false;
    	values.put("marcaMedicaCTipoMarcacion", getMarcaMedicaCTipoMarcacion());
    	modifiedMarcaMedicaCEximePagoPrestacion = false;
    	values.put("marcaMedicaCEximePagoPrestacion", getMarcaMedicaCEximePagoPrestacion());
    	modifiedMarcaMedicaCEstadoMarcacionMedica = false;
    	values.put("marcaMedicaCEstadoMarcacionMedica", getMarcaMedicaCEstadoMarcacionMedica());
    	modifiedMarcaMedicaCFechaInicio = false;
    	values.put("marcaMedicaCFechaInicio", getMarcaMedicaCFechaInicio());
    	modifiedMarcaMedicaCFechaFin = false;
    	values.put("marcaMedicaCFechaFin", getMarcaMedicaCFechaFin());
    	modifiedPersonaC = false;
    	modifiedProductoC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>MarcaMedicaCOid</code> object that identifies this instance of <code>MarcaMedicaC</code>.
     * @return <code>MarcaMedicaCOid </code> object that identifies this instance of <code>MarcaMedicaC</code>
     */
	@Override
    public MarcaMedicaCOid getOid() {
        return new MarcaMedicaCOid(getPersonaCID(), getProductosProducto(), getMarcaMedicaCCodigo());
    }

    /**
     * Sets the <code>MarcaMedicaCOid</code> object that identifies this instance of <code>MarcaMedicaC</code>.
     */    
    public void setOid(MarcaMedicaCOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(MarcaMedicaCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(MarcaMedicaCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.MARCAMEDICAC)) {
            // Add this class
            activeFacets.add(Constants.MARCAMEDICAC);
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
            relatedInstance = buildMarcaMedicaCRelatedInstance(relatedInstanceJsonOid);
        }
        if (MarcaMedicaCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMarcaMedicaCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (MarcaMedicaCConstants.ROLE_NAME_PRODUCTOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMarcaMedicaCRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildMarcaMedicaCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new MarcaMedicaC(mapper.readValue(relatedInstanceJsonOid, MarcaMedicaCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MarcaMedicaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMarcaMedicaCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MarcaMedicaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMarcaMedicaCRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MarcaMedicaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
