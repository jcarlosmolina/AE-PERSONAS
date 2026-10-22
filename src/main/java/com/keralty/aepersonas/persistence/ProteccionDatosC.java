package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.ProteccionDatosCConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.oid.ProteccionDatosCOid;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>ProteccionDatosC</code> model class.
 * <p>
 * Model Class: <code>ProteccionDatosC</code><br>
 */
@Entity(name = ProteccionDatosCConstants.CLASS_NAME)
@Table(name = ProteccionDatosCConstants.TBL_NAME)
public class ProteccionDatosC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private ProteccionDatosCOid oid;

    /** Class identification function. */
    @Column(name = ProteccionDatosCConstants.FLD_PERSONACID, insertable = false, updatable = false )
    @JsonProperty(value="id")
    private Long personaCID;

    /** Class identification function. */
    @Column(name = ProteccionDatosCConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false )
    @JsonProperty(value="producto")
    private Long productosProducto;

    /** Class identification function. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCCODIGO, insertable = false, updatable = false )
    @JsonProperty(value="codigo")
    private Long proteccionDatosCCodigo;

    /** Class member attribute. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCCODROL )
    @JsonProperty(value="codrol")
    private String proteccionDatosCCodRol;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosCCodRol;

    /** Class member attribute. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCINFORMACIONSALUDSMS )
    @JsonProperty(value="informacionsaludsms")
    private Boolean proteccionDatosCInformacionSaludSMS;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosCInformacionSaludSMS;

    /** Class member attribute. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCINFORMACIONSALUDEMAIL )
    @JsonProperty(value="informacionsaludemail")
    private Boolean proteccionDatosCInformacionSaludEmail;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosCInformacionSaludEmail;

    /** Class member attribute. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCIINFORMACIONSALUDCORREO )
    @JsonProperty(value="iinformacionsaludcorreo")
    private Boolean proteccionDatosCIinformacionSaludCorreo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosCIinformacionSaludCorreo;

    /** Class member attribute. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCINFORMACIONPUBLICIDADSMS )
    @JsonProperty(value="informacionpublicidadsms")
    private Boolean proteccionDatosCInformacionPublicidadSMS;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosCInformacionPublicidadSMS;

    /** Class member attribute. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCINFORMACIONPUBLICIDADEMAIL )
    @JsonProperty(value="informacionpublicidademail")
    private Boolean proteccionDatosCInformacionPublicidadEmail;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosCInformacionPublicidadEmail;

    /** Class member attribute. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCINFORMACIONPUBLICIDADCORREO )
    @JsonProperty(value="informacionpublicidadcorreo")
    private Boolean proteccionDatosCInformacionPublicidadCorreo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosCInformacionPublicidadCorreo;

    /** Class member attribute. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCINFORMACIONTERCEROS )
    @JsonProperty(value="informacionterceros")
    private Boolean proteccionDatosCInformacionTerceros;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosCInformacionTerceros;

    /** Class member attribute. */
    @Column(name = ProteccionDatosCConstants.FLD_PROTECCIONDATOSCROL )
    @JsonProperty(value="rol")
    private String proteccionDatosCRol;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosCRol;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ProteccionDatosCConstants.FLD_PERSONACID, referencedColumnName=PersonaCConstants.FLD_PERSONACID, insertable = false, updatable = false)
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
        @JoinColumn(name=ProteccionDatosCConstants.FLD_PRODUCTOSPRODUCTO, referencedColumnName=ProductosConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false)
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
    public ProteccionDatosC() {
        personaCID = null;
        productosProducto = null;
        proteccionDatosCCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ProteccionDatosC</code>.
     * @param oid Object Identifier of the instance of <code>ProteccionDatosC</code> to be created.
     * @throws SystemException
     */
    public ProteccionDatosC(ProteccionDatosCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            personaCID = oid.getPersonaCID();
            productosProducto = oid.getProductosProducto();
            proteccionDatosCCodigo = oid.getProteccionDatosCCodigo();
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
     * Returns the value of the <code>proteccionDatosCCodigo</code> attribute<br>in class <code>ProteccionDatosC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ProteccionDatosC</code>
     * @return The value of the <code>proteccionDatosCCodigo</code> attribute<br>in class <code>ProteccionDatosC</code>.
     */
    public Long getProteccionDatosCCodigo() {
        return proteccionDatosCCodigo;
    }

    /**
     * Sets the value of the <code>proteccionDatosCCodigo</code> attribute<br>in class <code>ProteccionDatosC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ProteccionDatosC</code>
     * @param proteccionDatosCCodigo The new value of the <code>proteccionDatosCCodigo</code> attribute<br>in class <code>ProteccionDatosC</code>.
     */
    public void setProteccionDatosCCodigo(Long proteccionDatosCCodigo) {
        this.proteccionDatosCCodigo = proteccionDatosCCodigo;
    }

   /**
    * Returns the value of the <code>proteccionDatosCCodRol</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCCodRol</code>. Variable String Size=2<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosCCodRol</code> attribute.
    */

    public String getProteccionDatosCCodRol()  {
    	String value;
        value =  proteccionDatosCCodRol;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>proteccionDatosCCodRol</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCCodRol</code>. Variable String Size=2<br>
    * Comments: <br>
    * @param proteccionDatosCCodRol The new value of the <code>proteccionDatosCCodRol</code> attribute.
    */
    public void setProteccionDatosCCodRol (String proteccionDatosCCodRol) {
        modifiedProteccionDatosCCodRol = true;
        this.proteccionDatosCCodRol = proteccionDatosCCodRol;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosCCodRol</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosCCodRol</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosCCodRol() {
        return modifiedProteccionDatosCCodRol;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosCCodRol</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosCCodRol</code>.
    */
    public void setModifiedProteccionDatosCCodRol(boolean modified) {
        this.modifiedProteccionDatosCCodRol = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosCInformacionSaludSMS</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionSaludSMS</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosCInformacionSaludSMS</code> attribute.
    */

    public Boolean getProteccionDatosCInformacionSaludSMS()  {
    	Boolean value;
        value =  proteccionDatosCInformacionSaludSMS;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosCInformacionSaludSMS</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionSaludSMS</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosCInformacionSaludSMS The new value of the <code>proteccionDatosCInformacionSaludSMS</code> attribute.
    */
    public void setProteccionDatosCInformacionSaludSMS (Boolean proteccionDatosCInformacionSaludSMS) {
        modifiedProteccionDatosCInformacionSaludSMS = true;
        this.proteccionDatosCInformacionSaludSMS = proteccionDatosCInformacionSaludSMS;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosCInformacionSaludSMS</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosCInformacionSaludSMS</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosCInformacionSaludSMS() {
        return modifiedProteccionDatosCInformacionSaludSMS;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosCInformacionSaludSMS</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosCInformacionSaludSMS</code>.
    */
    public void setModifiedProteccionDatosCInformacionSaludSMS(boolean modified) {
        this.modifiedProteccionDatosCInformacionSaludSMS = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosCInformacionSaludEmail</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionSaludEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosCInformacionSaludEmail</code> attribute.
    */

    public Boolean getProteccionDatosCInformacionSaludEmail()  {
    	Boolean value;
        value =  proteccionDatosCInformacionSaludEmail;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosCInformacionSaludEmail</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionSaludEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosCInformacionSaludEmail The new value of the <code>proteccionDatosCInformacionSaludEmail</code> attribute.
    */
    public void setProteccionDatosCInformacionSaludEmail (Boolean proteccionDatosCInformacionSaludEmail) {
        modifiedProteccionDatosCInformacionSaludEmail = true;
        this.proteccionDatosCInformacionSaludEmail = proteccionDatosCInformacionSaludEmail;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosCInformacionSaludEmail</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosCInformacionSaludEmail</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosCInformacionSaludEmail() {
        return modifiedProteccionDatosCInformacionSaludEmail;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosCInformacionSaludEmail</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosCInformacionSaludEmail</code>.
    */
    public void setModifiedProteccionDatosCInformacionSaludEmail(boolean modified) {
        this.modifiedProteccionDatosCInformacionSaludEmail = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosCIinformacionSaludCorreo</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCIinformacionSaludCorreo</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosCIinformacionSaludCorreo</code> attribute.
    */

    public Boolean getProteccionDatosCIinformacionSaludCorreo()  {
    	Boolean value;
        value =  proteccionDatosCIinformacionSaludCorreo;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosCIinformacionSaludCorreo</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCIinformacionSaludCorreo</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosCIinformacionSaludCorreo The new value of the <code>proteccionDatosCIinformacionSaludCorreo</code> attribute.
    */
    public void setProteccionDatosCIinformacionSaludCorreo (Boolean proteccionDatosCIinformacionSaludCorreo) {
        modifiedProteccionDatosCIinformacionSaludCorreo = true;
        this.proteccionDatosCIinformacionSaludCorreo = proteccionDatosCIinformacionSaludCorreo;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosCIinformacionSaludCorreo</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosCIinformacionSaludCorreo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosCIinformacionSaludCorreo() {
        return modifiedProteccionDatosCIinformacionSaludCorreo;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosCIinformacionSaludCorreo</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosCIinformacionSaludCorreo</code>.
    */
    public void setModifiedProteccionDatosCIinformacionSaludCorreo(boolean modified) {
        this.modifiedProteccionDatosCIinformacionSaludCorreo = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosCInformacionPublicidadSMS</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionPublicidadSMS</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosCInformacionPublicidadSMS</code> attribute.
    */

    public Boolean getProteccionDatosCInformacionPublicidadSMS()  {
    	Boolean value;
        value =  proteccionDatosCInformacionPublicidadSMS;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosCInformacionPublicidadSMS</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionPublicidadSMS</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosCInformacionPublicidadSMS The new value of the <code>proteccionDatosCInformacionPublicidadSMS</code> attribute.
    */
    public void setProteccionDatosCInformacionPublicidadSMS (Boolean proteccionDatosCInformacionPublicidadSMS) {
        modifiedProteccionDatosCInformacionPublicidadSMS = true;
        this.proteccionDatosCInformacionPublicidadSMS = proteccionDatosCInformacionPublicidadSMS;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosCInformacionPublicidadSMS</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosCInformacionPublicidadSMS</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosCInformacionPublicidadSMS() {
        return modifiedProteccionDatosCInformacionPublicidadSMS;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosCInformacionPublicidadSMS</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosCInformacionPublicidadSMS</code>.
    */
    public void setModifiedProteccionDatosCInformacionPublicidadSMS(boolean modified) {
        this.modifiedProteccionDatosCInformacionPublicidadSMS = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosCInformacionPublicidadEmail</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionPublicidadEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosCInformacionPublicidadEmail</code> attribute.
    */

    public Boolean getProteccionDatosCInformacionPublicidadEmail()  {
    	Boolean value;
        value =  proteccionDatosCInformacionPublicidadEmail;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosCInformacionPublicidadEmail</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionPublicidadEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosCInformacionPublicidadEmail The new value of the <code>proteccionDatosCInformacionPublicidadEmail</code> attribute.
    */
    public void setProteccionDatosCInformacionPublicidadEmail (Boolean proteccionDatosCInformacionPublicidadEmail) {
        modifiedProteccionDatosCInformacionPublicidadEmail = true;
        this.proteccionDatosCInformacionPublicidadEmail = proteccionDatosCInformacionPublicidadEmail;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosCInformacionPublicidadEmail</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosCInformacionPublicidadEmail</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosCInformacionPublicidadEmail() {
        return modifiedProteccionDatosCInformacionPublicidadEmail;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosCInformacionPublicidadEmail</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosCInformacionPublicidadEmail</code>.
    */
    public void setModifiedProteccionDatosCInformacionPublicidadEmail(boolean modified) {
        this.modifiedProteccionDatosCInformacionPublicidadEmail = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosCInformacionPublicidadCorreo</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionPublicidadCorreo</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosCInformacionPublicidadCorreo</code> attribute.
    */

    public Boolean getProteccionDatosCInformacionPublicidadCorreo()  {
    	Boolean value;
        value =  proteccionDatosCInformacionPublicidadCorreo;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosCInformacionPublicidadCorreo</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionPublicidadCorreo</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosCInformacionPublicidadCorreo The new value of the <code>proteccionDatosCInformacionPublicidadCorreo</code> attribute.
    */
    public void setProteccionDatosCInformacionPublicidadCorreo (Boolean proteccionDatosCInformacionPublicidadCorreo) {
        modifiedProteccionDatosCInformacionPublicidadCorreo = true;
        this.proteccionDatosCInformacionPublicidadCorreo = proteccionDatosCInformacionPublicidadCorreo;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosCInformacionPublicidadCorreo</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosCInformacionPublicidadCorreo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosCInformacionPublicidadCorreo() {
        return modifiedProteccionDatosCInformacionPublicidadCorreo;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosCInformacionPublicidadCorreo</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosCInformacionPublicidadCorreo</code>.
    */
    public void setModifiedProteccionDatosCInformacionPublicidadCorreo(boolean modified) {
        this.modifiedProteccionDatosCInformacionPublicidadCorreo = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosCInformacionTerceros</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionTerceros</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosCInformacionTerceros</code> attribute.
    */

    public Boolean getProteccionDatosCInformacionTerceros()  {
    	Boolean value;
        value =  proteccionDatosCInformacionTerceros;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosCInformacionTerceros</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCInformacionTerceros</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosCInformacionTerceros The new value of the <code>proteccionDatosCInformacionTerceros</code> attribute.
    */
    public void setProteccionDatosCInformacionTerceros (Boolean proteccionDatosCInformacionTerceros) {
        modifiedProteccionDatosCInformacionTerceros = true;
        this.proteccionDatosCInformacionTerceros = proteccionDatosCInformacionTerceros;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosCInformacionTerceros</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosCInformacionTerceros</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosCInformacionTerceros() {
        return modifiedProteccionDatosCInformacionTerceros;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosCInformacionTerceros</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosCInformacionTerceros</code>.
    */
    public void setModifiedProteccionDatosCInformacionTerceros(boolean modified) {
        this.modifiedProteccionDatosCInformacionTerceros = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosCRol</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCRol</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosCRol</code> attribute.
    */

    public String getProteccionDatosCRol()  {
    	String value;
        value =  proteccionDatosCRol;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>proteccionDatosCRol</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosCRol</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param proteccionDatosCRol The new value of the <code>proteccionDatosCRol</code> attribute.
    */
    public void setProteccionDatosCRol (String proteccionDatosCRol) {
        modifiedProteccionDatosCRol = true;
        this.proteccionDatosCRol = proteccionDatosCRol;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosCRol</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosCRol</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosCRol() {
        return modifiedProteccionDatosCRol;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosCRol</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosCRol</code>.
    */
    public void setModifiedProteccionDatosCRol(boolean modified) {
        this.modifiedProteccionDatosCRol = modified;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonaC 1:1  ------ 0:M  ProteccionesDatosC [ProteccionDatosC]</code>
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
     * <code>[Productos] ProductoC 1:1  ------ 0:M  ProteccionDatosC [ProteccionDatosC]</code>
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
        proteccionDatosCCodRol = null;
        proteccionDatosCInformacionSaludSMS = null;
        proteccionDatosCInformacionSaludEmail = null;
        proteccionDatosCIinformacionSaludCorreo = null;
        proteccionDatosCInformacionPublicidadSMS = null;
        proteccionDatosCInformacionPublicidadEmail = null;
        proteccionDatosCInformacionPublicidadCorreo = null;
        proteccionDatosCInformacionTerceros = null;
        proteccionDatosCRol = null;
        personaC = null;
        productoC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ProteccionDatosC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ProteccionDatosCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedProteccionDatosCCodRol = false;
    	values.put("proteccionDatosCCodRol", getProteccionDatosCCodRol());
    	modifiedProteccionDatosCInformacionSaludSMS = false;
    	values.put("proteccionDatosCInformacionSaludSMS", getProteccionDatosCInformacionSaludSMS());
    	modifiedProteccionDatosCInformacionSaludEmail = false;
    	values.put("proteccionDatosCInformacionSaludEmail", getProteccionDatosCInformacionSaludEmail());
    	modifiedProteccionDatosCIinformacionSaludCorreo = false;
    	values.put("proteccionDatosCIinformacionSaludCorreo", getProteccionDatosCIinformacionSaludCorreo());
    	modifiedProteccionDatosCInformacionPublicidadSMS = false;
    	values.put("proteccionDatosCInformacionPublicidadSMS", getProteccionDatosCInformacionPublicidadSMS());
    	modifiedProteccionDatosCInformacionPublicidadEmail = false;
    	values.put("proteccionDatosCInformacionPublicidadEmail", getProteccionDatosCInformacionPublicidadEmail());
    	modifiedProteccionDatosCInformacionPublicidadCorreo = false;
    	values.put("proteccionDatosCInformacionPublicidadCorreo", getProteccionDatosCInformacionPublicidadCorreo());
    	modifiedProteccionDatosCInformacionTerceros = false;
    	values.put("proteccionDatosCInformacionTerceros", getProteccionDatosCInformacionTerceros());
    	modifiedProteccionDatosCRol = false;
    	values.put("proteccionDatosCRol", getProteccionDatosCRol());
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
     * Returns the <code>ProteccionDatosCOid</code> object that identifies this instance of <code>ProteccionDatosC</code>.
     * @return <code>ProteccionDatosCOid </code> object that identifies this instance of <code>ProteccionDatosC</code>
     */
	@Override
    public ProteccionDatosCOid getOid() {
        return new ProteccionDatosCOid(getPersonaCID(), getProductosProducto(), getProteccionDatosCCodigo());
    }

    /**
     * Sets the <code>ProteccionDatosCOid</code> object that identifies this instance of <code>ProteccionDatosC</code>.
     */    
    public void setOid(ProteccionDatosCOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ProteccionDatosCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ProteccionDatosCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PROTECCIONDATOSC)) {
            // Add this class
            activeFacets.add(Constants.PROTECCIONDATOSC);
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
            relatedInstance = buildProteccionDatosCRelatedInstance(relatedInstanceJsonOid);
        }
        if (ProteccionDatosCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (ProteccionDatosCConstants.ROLE_NAME_PRODUCTOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosCRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildProteccionDatosCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ProteccionDatosC(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatosC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProteccionDatosCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatosC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProteccionDatosCRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatosC.class).error(e.getMessage());
            return null;
        }
    }
}
