package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.ProteccionDatosConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.oid.ProteccionDatosOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
 * Persistent representation of the <code>ProteccionDatos</code> model class.
 * <p>
 * Model Class: <code>ProteccionDatos</code><br>
 */
@Entity(name = ProteccionDatosConstants.CLASS_NAME)
@Table(name = ProteccionDatosConstants.TBL_NAME)
public class ProteccionDatos extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ProteccionDatos_Sequence")
    @SequenceGenerator(name="ProteccionDatos_Sequence", sequenceName="ProteccionDatos_Sequence", allocationSize=1)
    @Column(name = ProteccionDatosConstants.FLD_PROTECCIONDATOSIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long proteccionDatosIdentificador;

    /** Class member attribute. */
    @Column(name = ProteccionDatosConstants.FLD_PROTECCIONDATOSROL )
    @JsonProperty(value="rol")
    private String proteccionDatosRol;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosRol;

    /** Class member attribute. */
    @Column(name = ProteccionDatosConstants.FLD_PROTECCIONDATOSSALUDSMS )
    @JsonProperty(value="saludsms")
    private Boolean proteccionDatosSaludSMS;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosSaludSMS;

    /** Class member attribute. */
    @Column(name = ProteccionDatosConstants.FLD_PROTECCIONDATOSSALUDEMAIL )
    @JsonProperty(value="saludemail")
    private Boolean proteccionDatosSaludEmail;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosSaludEmail;

    /** Class member attribute. */
    @Column(name = ProteccionDatosConstants.FLD_PROTECCIONDATOSSALUDCORREO )
    @JsonProperty(value="saludcorreo")
    private Boolean proteccionDatosSaludCorreo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosSaludCorreo;

    /** Class member attribute. */
    @Column(name = ProteccionDatosConstants.FLD_PROTECCIONDATOSPUBLICIDADSMS )
    @JsonProperty(value="publicidadsms")
    private Boolean proteccionDatosPublicidadSMS;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosPublicidadSMS;

    /** Class member attribute. */
    @Column(name = ProteccionDatosConstants.FLD_PROTECCIONDATOSPUBLICIDADEMAIL )
    @JsonProperty(value="publicidademail")
    private Boolean proteccionDatosPublicidadEmail;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosPublicidadEmail;

    /** Class member attribute. */
    @Column(name = ProteccionDatosConstants.FLD_PROTECCIONDATOSPUBLICIDADCORREO )
    @JsonProperty(value="publicidadcorreo")
    private Boolean proteccionDatosPublicidadCorreo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosPublicidadCorreo;

    /** Class member attribute. */
    @Column(name = ProteccionDatosConstants.FLD_PROTECCIONDATOSINFOTERCEROS )
    @JsonProperty(value="infoterceros")
    private Boolean proteccionDatosInfoTerceros;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatosInfoTerceros;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = ProteccionDatosConstants.ROLE_INVNAME_SOLICITUDNOVEDAD)
    @JsonIgnore
    private SolicitudNovedad solicitudNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ProteccionDatosConstants.FLD_PRODUCTOSPRODUCTO, referencedColumnName=ProductosConstants.FLD_PRODUCTOSPRODUCTO)
    })
    @JsonIgnore
    private Productos productoT;
    /** Related attribute. */
    @Column(name = ProteccionDatosConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false)
    private Long productosProducto;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProductoT;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ProteccionDatosConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=SolicitudConstants.FLD_AESOLICITUDESIDSOLICITUD)
    })
    @JsonIgnore
    private Solicitud solicitud;
    /** Related attribute. */
    @Column(name = ProteccionDatosConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
    private Long aesolicitudesidsolicitud;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitud;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ProteccionDatos() {
        proteccionDatosIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ProteccionDatos</code>.
     * @param oid Object Identifier of the instance of <code>ProteccionDatos</code> to be created.
     * @throws SystemException
     */
    public ProteccionDatos(ProteccionDatosOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            proteccionDatosIdentificador = oid.getProteccionDatosIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>proteccionDatosIdentificador</code> attribute<br>in class <code>ProteccionDatos</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ProteccionDatos</code>
     * @return The value of the <code>proteccionDatosIdentificador</code> attribute<br>in class <code>ProteccionDatos</code>.
     */
    public Long getProteccionDatosIdentificador() {
        return proteccionDatosIdentificador;
    }

    /**
     * Sets the value of the <code>proteccionDatosIdentificador</code> attribute<br>in class <code>ProteccionDatos</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ProteccionDatos</code>
     * @param proteccionDatosIdentificador The new value of the <code>proteccionDatosIdentificador</code> attribute<br>in class <code>ProteccionDatos</code>.
     */
    public void setProteccionDatosIdentificador(Long proteccionDatosIdentificador) {
        this.proteccionDatosIdentificador = proteccionDatosIdentificador;
    }

   /**
    * Returns the value of the <code>proteccionDatosRol</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosRol</code>. Variable String Size=2<br>
    * Comments: 01 - Afiliado, 02 - Prestador<br>
    * @return The value of the <code>proteccionDatosRol</code> attribute.
    */

    public String getProteccionDatosRol()  {
    	String value;
        value =  proteccionDatosRol;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>proteccionDatosRol</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosRol</code>. Variable String Size=2<br>
    * Comments: 01 - Afiliado, 02 - Prestador<br>
    * @param proteccionDatosRol The new value of the <code>proteccionDatosRol</code> attribute.
    */
    public void setProteccionDatosRol (String proteccionDatosRol) {
        modifiedProteccionDatosRol = true;
        this.proteccionDatosRol = proteccionDatosRol;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosRol</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosRol</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosRol() {
        return modifiedProteccionDatosRol;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosRol</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosRol</code>.
    */
    public void setModifiedProteccionDatosRol(boolean modified) {
        this.modifiedProteccionDatosRol = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosSaludSMS</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosSaludSMS</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosSaludSMS</code> attribute.
    */

    public Boolean getProteccionDatosSaludSMS()  {
    	Boolean value;
        value =  proteccionDatosSaludSMS;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosSaludSMS</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosSaludSMS</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosSaludSMS The new value of the <code>proteccionDatosSaludSMS</code> attribute.
    */
    public void setProteccionDatosSaludSMS (Boolean proteccionDatosSaludSMS) {
        modifiedProteccionDatosSaludSMS = true;
        this.proteccionDatosSaludSMS = proteccionDatosSaludSMS;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosSaludSMS</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosSaludSMS</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosSaludSMS() {
        return modifiedProteccionDatosSaludSMS;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosSaludSMS</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosSaludSMS</code>.
    */
    public void setModifiedProteccionDatosSaludSMS(boolean modified) {
        this.modifiedProteccionDatosSaludSMS = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosSaludEmail</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosSaludEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosSaludEmail</code> attribute.
    */

    public Boolean getProteccionDatosSaludEmail()  {
    	Boolean value;
        value =  proteccionDatosSaludEmail;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosSaludEmail</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosSaludEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosSaludEmail The new value of the <code>proteccionDatosSaludEmail</code> attribute.
    */
    public void setProteccionDatosSaludEmail (Boolean proteccionDatosSaludEmail) {
        modifiedProteccionDatosSaludEmail = true;
        this.proteccionDatosSaludEmail = proteccionDatosSaludEmail;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosSaludEmail</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosSaludEmail</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosSaludEmail() {
        return modifiedProteccionDatosSaludEmail;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosSaludEmail</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosSaludEmail</code>.
    */
    public void setModifiedProteccionDatosSaludEmail(boolean modified) {
        this.modifiedProteccionDatosSaludEmail = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosSaludCorreo</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosSaludCorreo</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosSaludCorreo</code> attribute.
    */

    public Boolean getProteccionDatosSaludCorreo()  {
    	Boolean value;
        value =  proteccionDatosSaludCorreo;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosSaludCorreo</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosSaludCorreo</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosSaludCorreo The new value of the <code>proteccionDatosSaludCorreo</code> attribute.
    */
    public void setProteccionDatosSaludCorreo (Boolean proteccionDatosSaludCorreo) {
        modifiedProteccionDatosSaludCorreo = true;
        this.proteccionDatosSaludCorreo = proteccionDatosSaludCorreo;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosSaludCorreo</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosSaludCorreo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosSaludCorreo() {
        return modifiedProteccionDatosSaludCorreo;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosSaludCorreo</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosSaludCorreo</code>.
    */
    public void setModifiedProteccionDatosSaludCorreo(boolean modified) {
        this.modifiedProteccionDatosSaludCorreo = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosPublicidadSMS</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosPublicidadSMS</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosPublicidadSMS</code> attribute.
    */

    public Boolean getProteccionDatosPublicidadSMS()  {
    	Boolean value;
        value =  proteccionDatosPublicidadSMS;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosPublicidadSMS</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosPublicidadSMS</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosPublicidadSMS The new value of the <code>proteccionDatosPublicidadSMS</code> attribute.
    */
    public void setProteccionDatosPublicidadSMS (Boolean proteccionDatosPublicidadSMS) {
        modifiedProteccionDatosPublicidadSMS = true;
        this.proteccionDatosPublicidadSMS = proteccionDatosPublicidadSMS;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosPublicidadSMS</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosPublicidadSMS</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosPublicidadSMS() {
        return modifiedProteccionDatosPublicidadSMS;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosPublicidadSMS</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosPublicidadSMS</code>.
    */
    public void setModifiedProteccionDatosPublicidadSMS(boolean modified) {
        this.modifiedProteccionDatosPublicidadSMS = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosPublicidadEmail</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosPublicidadEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosPublicidadEmail</code> attribute.
    */

    public Boolean getProteccionDatosPublicidadEmail()  {
    	Boolean value;
        value =  proteccionDatosPublicidadEmail;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosPublicidadEmail</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosPublicidadEmail</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosPublicidadEmail The new value of the <code>proteccionDatosPublicidadEmail</code> attribute.
    */
    public void setProteccionDatosPublicidadEmail (Boolean proteccionDatosPublicidadEmail) {
        modifiedProteccionDatosPublicidadEmail = true;
        this.proteccionDatosPublicidadEmail = proteccionDatosPublicidadEmail;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosPublicidadEmail</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosPublicidadEmail</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosPublicidadEmail() {
        return modifiedProteccionDatosPublicidadEmail;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosPublicidadEmail</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosPublicidadEmail</code>.
    */
    public void setModifiedProteccionDatosPublicidadEmail(boolean modified) {
        this.modifiedProteccionDatosPublicidadEmail = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosPublicidadCorreo</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosPublicidadCorreo</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosPublicidadCorreo</code> attribute.
    */

    public Boolean getProteccionDatosPublicidadCorreo()  {
    	Boolean value;
        value =  proteccionDatosPublicidadCorreo;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosPublicidadCorreo</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosPublicidadCorreo</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosPublicidadCorreo The new value of the <code>proteccionDatosPublicidadCorreo</code> attribute.
    */
    public void setProteccionDatosPublicidadCorreo (Boolean proteccionDatosPublicidadCorreo) {
        modifiedProteccionDatosPublicidadCorreo = true;
        this.proteccionDatosPublicidadCorreo = proteccionDatosPublicidadCorreo;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosPublicidadCorreo</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosPublicidadCorreo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosPublicidadCorreo() {
        return modifiedProteccionDatosPublicidadCorreo;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosPublicidadCorreo</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosPublicidadCorreo</code>.
    */
    public void setModifiedProteccionDatosPublicidadCorreo(boolean modified) {
        this.modifiedProteccionDatosPublicidadCorreo = modified;
    }

   /**
    * Returns the value of the <code>proteccionDatosInfoTerceros</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosInfoTerceros</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>proteccionDatosInfoTerceros</code> attribute.
    */

    public Boolean getProteccionDatosInfoTerceros()  {
    	Boolean value;
        value =  proteccionDatosInfoTerceros;
        return value;
    }

   /**
    * Sets the value of the <code>proteccionDatosInfoTerceros</code> attribute.<br>
    * Model Attribute: <code>proteccionDatosInfoTerceros</code>. Variable Bool<br>
    * Comments: <br>
    * @param proteccionDatosInfoTerceros The new value of the <code>proteccionDatosInfoTerceros</code> attribute.
    */
    public void setProteccionDatosInfoTerceros (Boolean proteccionDatosInfoTerceros) {
        modifiedProteccionDatosInfoTerceros = true;
        this.proteccionDatosInfoTerceros = proteccionDatosInfoTerceros;
    }

   /**
    * Returns the value of the <code>modifiedProteccionDatosInfoTerceros</code> class property.<br>
    *
    * @return The value of the <code>modifiedProteccionDatosInfoTerceros</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProteccionDatosInfoTerceros() {
        return modifiedProteccionDatosInfoTerceros;
    }

   /**
    * Sets the value of the <code>modifiedProteccionDatosInfoTerceros</code> class property.<br>
    * @param modified The new value of the <code>modifiedProteccionDatosInfoTerceros</code>.
    */
    public void setModifiedProteccionDatosInfoTerceros(boolean modified) {
        this.modifiedProteccionDatosInfoTerceros = modified;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudNovedad</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudNovedad 0:1  ------ 0:1  ProteccionDatos [ProteccionDatos]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>SolicitudNovedad</code> role.
     */
    @JsonIgnore
    public SolicitudNovedad getSolicitudNovedad() {
        return solicitudNovedad;
    }

    /**
     * Adds an instance of <code>SolicitudNovedad</code> related through the <code>SolicitudNovedad</code> role.
     * @param solicitudNovedad The instance to add to the <code>SolicitudNovedad</code> role.
     */
    public void add2SolicitudNovedad(SolicitudNovedad solicitudNovedad) {
        this.solicitudNovedad = (solicitudNovedad == null  || solicitudNovedad.isNull() ? null : solicitudNovedad);
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudNovedad</code> has been modified.
    */
    public boolean isModifiedSolicitudNovedad(){
        return modifiedSolicitudNovedad;
    }

    /**
     * Returns the instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * Model Relationship:
     * <code>[Productos] ProductoT 0:1  ------ 0:M  ProteccionesDatos [ProteccionDatos]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     */
    @JsonIgnore
    public Productos getProductoT() {
        return productoT;
    }

    /**
     * Adds an instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * @param productoT The instance to add to the <code>ProductoT</code> role.
     */
    public void add2ProductoT(Productos productoT) {
        if (productoT == null || productoT.isNull()) {
            this.modifiedProductoT = true;
            this.productosProducto = null;
        } else {
            this.productosProducto = productoT.getProductosProducto();
        }
        this.productoT = (productoT == null  || productoT.isNull() ? null : productoT);
    }

   /**
    * This method gets the attribute value <code>modifiedProductoT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedProductoT</code> has been modified.
    */
    public boolean isModifiedProductoT(){
        return modifiedProductoT;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitud 0:1  ------ 0:1  ProteccionDatos [ProteccionDatos]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * @param solicitud The instance to add to the <code>Solicitud</code> role.
     */
    public void add2Solicitud(Solicitud solicitud) {
        if (solicitud == null || solicitud.isNull()) {
            this.modifiedSolicitud = true;
            this.aesolicitudesidsolicitud = null;
        } else {
            this.aesolicitudesidsolicitud = solicitud.getAesolicitudesidsolicitud();
        }
        this.solicitud = (solicitud == null  || solicitud.isNull() ? null : solicitud);
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitud</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitud</code> has been modified.
    */
    public boolean isModifiedSolicitud(){
        return modifiedSolicitud;
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
        proteccionDatosRol = null;
        proteccionDatosSaludSMS = null;
        proteccionDatosSaludEmail = null;
        proteccionDatosSaludCorreo = null;
        proteccionDatosPublicidadSMS = null;
        proteccionDatosPublicidadEmail = null;
        proteccionDatosPublicidadCorreo = null;
        proteccionDatosInfoTerceros = null;
        solicitudNovedad = null;
        productoT = null;
        solicitud = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ProteccionDatos.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ProteccionDatosConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedProteccionDatosRol = false;
    	values.put("proteccionDatosRol", getProteccionDatosRol());
    	modifiedProteccionDatosSaludSMS = false;
    	values.put("proteccionDatosSaludSMS", getProteccionDatosSaludSMS());
    	modifiedProteccionDatosSaludEmail = false;
    	values.put("proteccionDatosSaludEmail", getProteccionDatosSaludEmail());
    	modifiedProteccionDatosSaludCorreo = false;
    	values.put("proteccionDatosSaludCorreo", getProteccionDatosSaludCorreo());
    	modifiedProteccionDatosPublicidadSMS = false;
    	values.put("proteccionDatosPublicidadSMS", getProteccionDatosPublicidadSMS());
    	modifiedProteccionDatosPublicidadEmail = false;
    	values.put("proteccionDatosPublicidadEmail", getProteccionDatosPublicidadEmail());
    	modifiedProteccionDatosPublicidadCorreo = false;
    	values.put("proteccionDatosPublicidadCorreo", getProteccionDatosPublicidadCorreo());
    	modifiedProteccionDatosInfoTerceros = false;
    	values.put("proteccionDatosInfoTerceros", getProteccionDatosInfoTerceros());
    	modifiedSolicitudNovedad = false;
    	modifiedProductoT = false;
    	modifiedSolicitud = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ProteccionDatosOid</code> object that identifies this instance of <code>ProteccionDatos</code>.
     * @return <code>ProteccionDatosOid </code> object that identifies this instance of <code>ProteccionDatos</code>
     */
	@Override
    public ProteccionDatosOid getOid() {
        return new ProteccionDatosOid(getProteccionDatosIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ProteccionDatosConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ProteccionDatosConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PROTECCIONDATOS)) {
            // Add this class
            activeFacets.add(Constants.PROTECCIONDATOS);
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
            relatedInstance = buildProteccionDatosRelatedInstance(relatedInstanceJsonOid);
        }
        if (ProteccionDatosConstants.ROLE_NAME_SOLICITUDNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (ProteccionDatosConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (ProteccionDatosConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildProteccionDatosRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ProteccionDatos(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatos.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildProteccionDatosRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatos.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildProteccionDatosRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatos.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildProteccionDatosRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatos.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
