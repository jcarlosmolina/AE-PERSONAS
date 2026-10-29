package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoContratoConstants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.persistence.oid.AesolicitudesOid;
import com.keralty.aepersonas.persistence.oid.EstadoContratoOid;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>Aesolicitudes</code> model class.
 * <p>
 * Model Class: <code>Aesolicitudes</code><br>
 */
@Entity(name = AesolicitudesConstants.CLASS_NAME)
@Table(name = AesolicitudesConstants.TBL_NAME)
public class Aesolicitudes extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Ae_solicitudes_Sequence")
    @SequenceGenerator(name="Ae_solicitudes_Sequence", sequenceName="Ae_solicitudes_Sequence", allocationSize=1)
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESIDSOLICITUD )
    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    /** Class member attribute. */
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESNUMEROSOLICITUD )
    @JsonProperty(value="numero_solicitud")
    private String aesolicitudesNumerosolicitud;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudesNumerosolicitud;

    /** Class member attribute. */
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESSWESTADO )
    @JsonProperty(value="sw_estado")
    private String aesolicitudesSwestado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudesSwestado;

    /** Class member attribute. */
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESFECHAASIGNACION )
    @JsonProperty(value="fecha_asignacion")
    private Date aesolicitudesFechaasignacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudesFechaasignacion;

    /** Class member attribute. */
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESCDMOTANU )
    @JsonProperty(value="cdmotanu")
    private String aesolicitudesCdmotanu;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudesCdmotanu;

    /** Class member attribute. */
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESCDMOTDEV )
    @JsonProperty(value="cdmotdev")
    private String aesolicitudesCdmotdev;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudesCdmotdev;

    /** Class member attribute. */
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESFESOLICI )
    @JsonProperty(value="fesolici")
    private Date aesolicitudesFesolici;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudesFesolici;

    /** Class member attribute. */
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESLOGIN )
    @JsonProperty(value="login")
    private String aesolicitudesLogin;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudesLogin;

    /** Class member attribute. */
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESOBSERVACION )
    @JsonProperty(value="observacion")
    private String aesolicitudesObservacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudesObservacion;

    /** Class member attribute. */
    @Column(name = AesolicitudesConstants.FLD_AESOLICITUDESTIPOSOLICITUD )
    @JsonProperty(value="tipo_solicitud")
    private String aesolicitudesTiposolicitud;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudesTiposolicitud;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = AesolicitudesConstants.ROLE_INVNAME_SOLICITUD)
    @JsonIgnore
    private Solicitud solicitud;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitud;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AesolicitudesConstants.FLD_PRODUCTOSPRODUCTO, referencedColumnName=ProductosConstants.FLD_PRODUCTOSPRODUCTO)
    })
    @JsonIgnore
    private Productos productoT;
    /** Related attribute. */
    @Column(name = AesolicitudesConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false)
    private Long productosProducto;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProductoT;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AesolicitudesConstants.FLD_PLANESPLAN, referencedColumnName=PlanesConstants.FLD_PLANESPLAN)
    })
    @JsonIgnore
    private Planes planT;
    /** Related attribute. */
    @Column(name = AesolicitudesConstants.FLD_PLANESPLAN, insertable = false, updatable = false)
    private Long planesPlan;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanT;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AesolicitudesConstants.FLD_ESTADOCONTRATOCODIGO, referencedColumnName=EstadoContratoConstants.FLD_ESTADOCONTRATOCODIGO)
    })
    @JsonIgnore
    private EstadoContrato eSTADOSOLICITUD;
    /** Related attribute. */
    @Column(name = AesolicitudesConstants.FLD_ESTADOCONTRATOCODIGO, insertable = false, updatable = false)
    private Long estadoContratoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedESTADOSOLICITUD;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Aesolicitudes() {
        aesolicitudesidsolicitud = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Aesolicitudes</code>.
     * @param oid Object Identifier of the instance of <code>Aesolicitudes</code> to be created.
     * @throws SystemException
     */
    public Aesolicitudes(AesolicitudesOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Aesolicitudes</code>
     * @return The value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code>.
     */
    public Long getAesolicitudesidsolicitud() {
        return aesolicitudesidsolicitud;
    }

    /**
     * Sets the value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Aesolicitudes</code>
     * @param aesolicitudesidsolicitud The new value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code>.
     */
    public void setAesolicitudesidsolicitud(Long aesolicitudesidsolicitud) {
        this.aesolicitudesidsolicitud = aesolicitudesidsolicitud;
    }

   /**
    * Returns the value of the <code>aesolicitudesNumerosolicitud</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesNumerosolicitud</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>aesolicitudesNumerosolicitud</code> attribute.
    */

    public String getAesolicitudesNumerosolicitud()  {
    	String value;
        value =  aesolicitudesNumerosolicitud;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>aesolicitudesNumerosolicitud</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesNumerosolicitud</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param aesolicitudesNumerosolicitud The new value of the <code>aesolicitudesNumerosolicitud</code> attribute.
    */
    public void setAesolicitudesNumerosolicitud (String aesolicitudesNumerosolicitud) {
        modifiedAesolicitudesNumerosolicitud = true;
        this.aesolicitudesNumerosolicitud = aesolicitudesNumerosolicitud;
    }

   /**
    * Sets the value of the <code>modifiedAesolicitudesNumerosolicitud</code> class property.<br>
    * @param modified The new value of the <code>modifiedAesolicitudesNumerosolicitud</code>.
    */
    public void setModifiedAesolicitudesNumerosolicitud(boolean modified) {
        this.modifiedAesolicitudesNumerosolicitud = modified;
    }

   /**
    * Returns the value of the <code>aesolicitudesSwestado</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesSwestado</code>. Variable String Size=2<br>
    * Comments: Habilitada( S) o no habiliatda (N)<br>
    * @return The value of the <code>aesolicitudesSwestado</code> attribute.
    */

    public String getAesolicitudesSwestado()  {
    	String value;
        value =  aesolicitudesSwestado;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>aesolicitudesSwestado</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesSwestado</code>. Variable String Size=2<br>
    * Comments: Habilitada( S) o no habiliatda (N)<br>
    * @param aesolicitudesSwestado The new value of the <code>aesolicitudesSwestado</code> attribute.
    */
    public void setAesolicitudesSwestado (String aesolicitudesSwestado) {
        modifiedAesolicitudesSwestado = true;
        this.aesolicitudesSwestado = aesolicitudesSwestado;
    }

   /**
    * Sets the value of the <code>modifiedAesolicitudesSwestado</code> class property.<br>
    * @param modified The new value of the <code>modifiedAesolicitudesSwestado</code>.
    */
    public void setModifiedAesolicitudesSwestado(boolean modified) {
        this.modifiedAesolicitudesSwestado = modified;
    }

   /**
    * Returns the value of the <code>aesolicitudesFechaasignacion</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesFechaasignacion</code>. Variable Date<br>
    * Comments: Fecha en que se actualiza el estado de la solicitud<br>
    * @return The value of the <code>aesolicitudesFechaasignacion</code> attribute.
    */

    public Date getAesolicitudesFechaasignacion()  {
    	Date value;
        value =  aesolicitudesFechaasignacion;
        return value;
    }

   /**
    * Sets the value of the <code>aesolicitudesFechaasignacion</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesFechaasignacion</code>. Variable Date<br>
    * Comments: Fecha en que se actualiza el estado de la solicitud<br>
    * @param aesolicitudesFechaasignacion The new value of the <code>aesolicitudesFechaasignacion</code> attribute.
    */
    public void setAesolicitudesFechaasignacion (Date aesolicitudesFechaasignacion) {
        modifiedAesolicitudesFechaasignacion = true;
        this.aesolicitudesFechaasignacion = aesolicitudesFechaasignacion;
    }

   /**
    * Sets the value of the <code>modifiedAesolicitudesFechaasignacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedAesolicitudesFechaasignacion</code>.
    */
    public void setModifiedAesolicitudesFechaasignacion(boolean modified) {
        this.modifiedAesolicitudesFechaasignacion = modified;
    }

   /**
    * Returns the value of the <code>aesolicitudesCdmotanu</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesCdmotanu</code>. Variable String Size=250<br>
    * Comments: Descipción de la anulación<br>
    * @return The value of the <code>aesolicitudesCdmotanu</code> attribute.
    */

    public String getAesolicitudesCdmotanu()  {
    	String value;
        value =  aesolicitudesCdmotanu;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>aesolicitudesCdmotanu</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesCdmotanu</code>. Variable String Size=250<br>
    * Comments: Descipción de la anulación<br>
    * @param aesolicitudesCdmotanu The new value of the <code>aesolicitudesCdmotanu</code> attribute.
    */
    public void setAesolicitudesCdmotanu (String aesolicitudesCdmotanu) {
        modifiedAesolicitudesCdmotanu = true;
        this.aesolicitudesCdmotanu = aesolicitudesCdmotanu;
    }

   /**
    * Sets the value of the <code>modifiedAesolicitudesCdmotanu</code> class property.<br>
    * @param modified The new value of the <code>modifiedAesolicitudesCdmotanu</code>.
    */
    public void setModifiedAesolicitudesCdmotanu(boolean modified) {
        this.modifiedAesolicitudesCdmotanu = modified;
    }

   /**
    * Returns the value of the <code>aesolicitudesCdmotdev</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesCdmotdev</code>. Variable String Size=250<br>
    * Comments: Descripcion de la devolución<br>
    * @return The value of the <code>aesolicitudesCdmotdev</code> attribute.
    */

    public String getAesolicitudesCdmotdev()  {
    	String value;
        value =  aesolicitudesCdmotdev;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>aesolicitudesCdmotdev</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesCdmotdev</code>. Variable String Size=250<br>
    * Comments: Descripcion de la devolución<br>
    * @param aesolicitudesCdmotdev The new value of the <code>aesolicitudesCdmotdev</code> attribute.
    */
    public void setAesolicitudesCdmotdev (String aesolicitudesCdmotdev) {
        modifiedAesolicitudesCdmotdev = true;
        this.aesolicitudesCdmotdev = aesolicitudesCdmotdev;
    }

   /**
    * Sets the value of the <code>modifiedAesolicitudesCdmotdev</code> class property.<br>
    * @param modified The new value of the <code>modifiedAesolicitudesCdmotdev</code>.
    */
    public void setModifiedAesolicitudesCdmotdev(boolean modified) {
        this.modifiedAesolicitudesCdmotdev = modified;
    }

   /**
    * Returns the value of the <code>aesolicitudesFesolici</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesFesolici</code>. Variable Date<br>
    * Comments: Fecha en que nace la solicitud<br>
    * @return The value of the <code>aesolicitudesFesolici</code> attribute.
    */

    public Date getAesolicitudesFesolici()  {
    	Date value;
        value =  aesolicitudesFesolici;
        return value;
    }

   /**
    * Sets the value of the <code>aesolicitudesFesolici</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesFesolici</code>. Variable Date<br>
    * Comments: Fecha en que nace la solicitud<br>
    * @param aesolicitudesFesolici The new value of the <code>aesolicitudesFesolici</code> attribute.
    */
    public void setAesolicitudesFesolici (Date aesolicitudesFesolici) {
        modifiedAesolicitudesFesolici = true;
        this.aesolicitudesFesolici = aesolicitudesFesolici;
    }

   /**
    * Sets the value of the <code>modifiedAesolicitudesFesolici</code> class property.<br>
    * @param modified The new value of the <code>modifiedAesolicitudesFesolici</code>.
    */
    public void setModifiedAesolicitudesFesolici(boolean modified) {
        this.modifiedAesolicitudesFesolici = modified;
    }

   /**
    * Returns the value of the <code>aesolicitudesLogin</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesLogin</code>. Variable String Size=50<br>
    * Comments: Usuario que realiza la operacion<br>
    * @return The value of the <code>aesolicitudesLogin</code> attribute.
    */

    public String getAesolicitudesLogin()  {
    	String value;
        value =  aesolicitudesLogin;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>aesolicitudesLogin</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesLogin</code>. Variable String Size=50<br>
    * Comments: Usuario que realiza la operacion<br>
    * @param aesolicitudesLogin The new value of the <code>aesolicitudesLogin</code> attribute.
    */
    public void setAesolicitudesLogin (String aesolicitudesLogin) {
        modifiedAesolicitudesLogin = true;
        this.aesolicitudesLogin = aesolicitudesLogin;
    }

   /**
    * Sets the value of the <code>modifiedAesolicitudesLogin</code> class property.<br>
    * @param modified The new value of the <code>modifiedAesolicitudesLogin</code>.
    */
    public void setModifiedAesolicitudesLogin(boolean modified) {
        this.modifiedAesolicitudesLogin = modified;
    }

   /**
    * Returns the value of the <code>aesolicitudesObservacion</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesObservacion</code>. Variable String Size=500<br>
    * Comments: Observaciones a la solicitud<br>
    * @return The value of the <code>aesolicitudesObservacion</code> attribute.
    */

    public String getAesolicitudesObservacion()  {
    	String value;
        value =  aesolicitudesObservacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>aesolicitudesObservacion</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesObservacion</code>. Variable String Size=500<br>
    * Comments: Observaciones a la solicitud<br>
    * @param aesolicitudesObservacion The new value of the <code>aesolicitudesObservacion</code> attribute.
    */
    public void setAesolicitudesObservacion (String aesolicitudesObservacion) {
        modifiedAesolicitudesObservacion = true;
        this.aesolicitudesObservacion = aesolicitudesObservacion;
    }

   /**
    * Sets the value of the <code>modifiedAesolicitudesObservacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedAesolicitudesObservacion</code>.
    */
    public void setModifiedAesolicitudesObservacion(boolean modified) {
        this.modifiedAesolicitudesObservacion = modified;
    }

   /**
    * Returns the value of the <code>aesolicitudesTiposolicitud</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesTiposolicitud</code>. Variable String Size=1<br>
    * Comments: F ( fisica) E ( electronica)<br>
    * @return The value of the <code>aesolicitudesTiposolicitud</code> attribute.
    */

    public String getAesolicitudesTiposolicitud()  {
    	String value;
        value =  aesolicitudesTiposolicitud;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>aesolicitudesTiposolicitud</code> attribute.<br>
    * Model Attribute: <code>aesolicitudesTiposolicitud</code>. Variable String Size=1<br>
    * Comments: F ( fisica) E ( electronica)<br>
    * @param aesolicitudesTiposolicitud The new value of the <code>aesolicitudesTiposolicitud</code> attribute.
    */
    public void setAesolicitudesTiposolicitud (String aesolicitudesTiposolicitud) {
        modifiedAesolicitudesTiposolicitud = true;
        this.aesolicitudesTiposolicitud = aesolicitudesTiposolicitud;
    }

   /**
    * Sets the value of the <code>modifiedAesolicitudesTiposolicitud</code> class property.<br>
    * @param modified The new value of the <code>modifiedAesolicitudesTiposolicitud</code>.
    */
    public void setModifiedAesolicitudesTiposolicitud(boolean modified) {
        this.modifiedAesolicitudesTiposolicitud = modified;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitud 0:1  ------ 1:1  Aesolicitudes [Aesolicitudes]</code>
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
     * Returns the instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * Model Relationship:
     * <code>[Productos] ProductoT 1:1  ------ 0:M  AESOLICITUDES [Aesolicitudes]</code>
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
     * Returns the instance of <code>Planes</code> related through the <code>PlanT</code> role.
     * Model Relationship:
     * <code>[Planes] PlanT 0:1  ------ 0:M  AESOLICITUDES [Aesolicitudes]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Planes</code> related through the <code>PlanT</code> role.
     */
    @JsonIgnore
    public Planes getPlanT() {
        return planT;
    }

    /**
     * Adds an instance of <code>Planes</code> related through the <code>PlanT</code> role.
     * @param planT The instance to add to the <code>PlanT</code> role.
     */
    public void add2PlanT(Planes planT) {
        if (planT == null || planT.isNull()) {
            this.modifiedPlanT = true;
            this.planesPlan = null;
        } else {
            this.planesPlan = planT.getPlanesPlan();
        }
        this.planT = (planT == null  || planT.isNull() ? null : planT);
    }

   /**
    * This method gets the attribute value <code>modifiedPlanT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPlanT</code> has been modified.
    */
    public boolean isModifiedPlanT(){
        return modifiedPlanT;
    }

    /**
     * Returns the instance of <code>EstadoContrato</code> related through the <code>ESTADOSOLICITUD</code> role.
     * Model Relationship:
     * <code>[EstadoContrato] ESTADOSOLICITUD 0:1  ------ 0:M  AESOLICITUDES [Aesolicitudes]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>EstadoContrato</code> related through the <code>ESTADOSOLICITUD</code> role.
     */
    @JsonIgnore
    public EstadoContrato getESTADOSOLICITUD() {
        return eSTADOSOLICITUD;
    }

    /**
     * Adds an instance of <code>EstadoContrato</code> related through the <code>ESTADOSOLICITUD</code> role.
     * @param eSTADOSOLICITUD The instance to add to the <code>ESTADOSOLICITUD</code> role.
     */
    public void add2ESTADOSOLICITUD(EstadoContrato eSTADOSOLICITUD) {
        if (eSTADOSOLICITUD == null || eSTADOSOLICITUD.isNull()) {
            this.modifiedESTADOSOLICITUD = true;
            this.estadoContratoCodigo = null;
        } else {
            this.estadoContratoCodigo = eSTADOSOLICITUD.getEstadoContratoCodigo();
        }
        this.eSTADOSOLICITUD = (eSTADOSOLICITUD == null  || eSTADOSOLICITUD.isNull() ? null : eSTADOSOLICITUD);
    }

   /**
    * This method gets the attribute value <code>modifiedESTADOSOLICITUD</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedESTADOSOLICITUD</code> has been modified.
    */
    public boolean isModifiedESTADOSOLICITUD(){
        return modifiedESTADOSOLICITUD;
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
        aesolicitudesNumerosolicitud = null;
        aesolicitudesSwestado = null;
        aesolicitudesFechaasignacion = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        aesolicitudesCdmotanu = null;
        aesolicitudesCdmotdev = null;
        aesolicitudesFesolici = null;
        aesolicitudesLogin = null;
        aesolicitudesObservacion = null;
        aesolicitudesTiposolicitud = null;
        solicitud = null;
        productoT = null;
        planT = null;
        eSTADOSOLICITUD = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return Aesolicitudes.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return AesolicitudesConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedAesolicitudesNumerosolicitud = false;
    	values.put("aesolicitudesNumerosolicitud", getAesolicitudesNumerosolicitud());
    	modifiedAesolicitudesSwestado = false;
    	values.put("aesolicitudesSwestado", getAesolicitudesSwestado());
    	modifiedAesolicitudesFechaasignacion = false;
    	values.put("aesolicitudesFechaasignacion", getAesolicitudesFechaasignacion());
    	modifiedAesolicitudesCdmotanu = false;
    	values.put("aesolicitudesCdmotanu", getAesolicitudesCdmotanu());
    	modifiedAesolicitudesCdmotdev = false;
    	values.put("aesolicitudesCdmotdev", getAesolicitudesCdmotdev());
    	modifiedAesolicitudesFesolici = false;
    	values.put("aesolicitudesFesolici", getAesolicitudesFesolici());
    	modifiedAesolicitudesLogin = false;
    	values.put("aesolicitudesLogin", getAesolicitudesLogin());
    	modifiedAesolicitudesObservacion = false;
    	values.put("aesolicitudesObservacion", getAesolicitudesObservacion());
    	modifiedAesolicitudesTiposolicitud = false;
    	values.put("aesolicitudesTiposolicitud", getAesolicitudesTiposolicitud());
    	modifiedSolicitud = false;
    	modifiedProductoT = false;
    	modifiedPlanT = false;
    	modifiedESTADOSOLICITUD = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>AesolicitudesOid</code> object that identifies this instance of <code>Aesolicitudes</code>.
     * @return <code>AesolicitudesOid </code> object that identifies this instance of <code>Aesolicitudes</code>
     */
	@Override
    public AesolicitudesOid getOid() {
        return new AesolicitudesOid(getAesolicitudesidsolicitud());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(AesolicitudesConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(AesolicitudesConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.AESOLICITUDES)) {
            // Add this class
            activeFacets.add(Constants.AESOLICITUDES);
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


        if (getAgent().isFacetActive(Constants.AGENT_ASESOR)) {
            returnValue = true;
        }
        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildAesolicitudesRelatedInstance(relatedInstanceJsonOid);
        }
        if (AesolicitudesConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAesolicitudesRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (AesolicitudesConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAesolicitudesRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (AesolicitudesConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAesolicitudesRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (AesolicitudesConstants.ROLE_NAME_ESTADOSOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAesolicitudesRelatedInstance4EstadoContrato(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAesolicitudesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Aesolicitudes(mapper.readValue(relatedInstanceJsonOid, AesolicitudesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAesolicitudesRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAesolicitudesRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAesolicitudesRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAesolicitudesRelatedInstance4EstadoContrato(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoContrato(mapper.readValue(relatedInstanceJsonOid, EstadoContratoOid.class)): EstadoContrato.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
