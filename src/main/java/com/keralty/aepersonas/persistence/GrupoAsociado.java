package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.GrupoAsociadoConstants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsociadoOid;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>GrupoAsociado</code> model class.
 * <p>
 * Model Class: <code>GrupoAsociado</code><br>
 */
@Entity(name = GrupoAsociadoConstants.CLASS_NAME)
@Table(name = GrupoAsociadoConstants.TBL_NAME)
public class GrupoAsociado extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = GrupoAsociadoConstants.FLD_GRUPOASOCIADOCODIGO )
    @JsonProperty(value="codigo")
    private Long grupoAsociadoCodigo;

    /** Class member attribute. */
    @Column(name = GrupoAsociadoConstants.FLD_GRUPOASOCIADOCODIGOLEGAL )
    @JsonProperty(value="codigolegal")
    private String grupoAsociadoCodigoLegal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsociadoCodigoLegal;

    /** Class member attribute. */
    @Column(name = GrupoAsociadoConstants.FLD_GRUPOASOCIADOCODTARIFACORE )
    @JsonProperty(value="codtarifacore")
    private String grupoAsociadoCodTarifaCORE;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsociadoCodTarifaCORE;

    /** Class member attribute. */
    @Column(name = GrupoAsociadoConstants.FLD_GRUPOASOCIADODESCRIPCION )
    @JsonProperty(value="descripcion")
    private String grupoAsociadoDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsociadoDescripcion;

    /** Class member attribute. */
    @Column(name = GrupoAsociadoConstants.FLD_GRUPOASOCIADOFINIVIGENCIA )
    @JsonProperty(value="finivigencia")
    private Date grupoAsociadoFIniVigencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsociadoFIniVigencia;

    /** Class member attribute. */
    @Column(name = GrupoAsociadoConstants.FLD_GRUPOASOCIADOFFINVIGENCIA )
    @JsonProperty(value="ffinvigencia")
    private Date grupoAsociadoFFinVigencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsociadoFFinVigencia;

    /** Class member attribute. */
    @Column(name = GrupoAsociadoConstants.FLD_GRUPOASOCIADOESTADO )
    @JsonProperty(value="estado")
    private Long grupoAsociadoEstado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsociadoEstado;

    /** Class member attribute. */
    @Column(name = GrupoAsociadoConstants.FLD_GRUPOASOCIADODISMINUCIONCARENCIA )
    @JsonProperty(value="disminucioncarencia")
    private Long grupoAsociadoDisminucionCarencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsociadoDisminucionCarencia;

    /** Related Class. */
    @OneToMany(mappedBy = GrupoAsociadoConstants.ROLE_INVNAME_SOLICITUDES)
    @JsonIgnore
    private Collection <Solicitud> solicitudes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudes;

    /** Related Class. */
    @OneToMany(mappedBy = GrupoAsociadoConstants.ROLE_INVNAME_CONTRATOSC)
    @JsonIgnore
    private Collection <ContratoC> contratosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratosC;

    /** Related Class. */
    @OneToMany(mappedBy = GrupoAsociadoConstants.ROLE_INVNAME_SOLICITUDESNOVEDAD)
    @JsonIgnore
    private Collection <SolicitudNovedad> solicitudesNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudesNovedad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=GrupoAsociadoConstants.FLD_PRODUCTOSPRODUCTO, referencedColumnName=ProductosConstants.FLD_PRODUCTOSPRODUCTO)
    })
    @JsonIgnore
    private Productos productoT;
    /** Related attribute. */
    @Column(name = GrupoAsociadoConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false)
    private Long productosProducto;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProductoT;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=GrupoAsociadoConstants.FLD_PLANESPLAN, referencedColumnName=PlanesConstants.FLD_PLANESPLAN)
    })
    @JsonIgnore
    private Planes planT;
    /** Related attribute. */
    @Column(name = GrupoAsociadoConstants.FLD_PLANESPLAN, insertable = false, updatable = false)
    private Long planesPlan;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanT;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public GrupoAsociado() {
        grupoAsociadoCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>GrupoAsociado</code>.
     * @param oid Object Identifier of the instance of <code>GrupoAsociado</code> to be created.
     * @throws SystemException
     */
    public GrupoAsociado(GrupoAsociadoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            grupoAsociadoCodigo = oid.getGrupoAsociadoCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>grupoAsociadoCodigo</code> attribute<br>in class <code>GrupoAsociado</code>.
     * This is part of the identification for this class, which depends on the identification of <code>GrupoAsociado</code>
     * @return The value of the <code>grupoAsociadoCodigo</code> attribute<br>in class <code>GrupoAsociado</code>.
     */
    public Long getGrupoAsociadoCodigo() {
        return grupoAsociadoCodigo;
    }

    /**
     * Sets the value of the <code>grupoAsociadoCodigo</code> attribute<br>in class <code>GrupoAsociado</code>.
     * This is part of the identification for this class, which depends on the identification of <code>GrupoAsociado</code>
     * @param grupoAsociadoCodigo The new value of the <code>grupoAsociadoCodigo</code> attribute<br>in class <code>GrupoAsociado</code>.
     */
    public void setGrupoAsociadoCodigo(Long grupoAsociadoCodigo) {
        this.grupoAsociadoCodigo = grupoAsociadoCodigo;
    }

   /**
    * Returns the value of the <code>grupoAsociadoCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoCodigoLegal</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>grupoAsociadoCodigoLegal</code> attribute.
    */

    public String getGrupoAsociadoCodigoLegal()  {
    	String value;
        value =  grupoAsociadoCodigoLegal;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>grupoAsociadoCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoCodigoLegal</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param grupoAsociadoCodigoLegal The new value of the <code>grupoAsociadoCodigoLegal</code> attribute.
    */
    public void setGrupoAsociadoCodigoLegal (String grupoAsociadoCodigoLegal) {
        modifiedGrupoAsociadoCodigoLegal = true;
        this.grupoAsociadoCodigoLegal = grupoAsociadoCodigoLegal;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsociadoCodigoLegal</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsociadoCodigoLegal</code>.
    */
    public void setModifiedGrupoAsociadoCodigoLegal(boolean modified) {
        this.modifiedGrupoAsociadoCodigoLegal = modified;
    }

   /**
    * Returns the value of the <code>grupoAsociadoCodTarifaCORE</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoCodTarifaCORE</code>. Variable String Size=50<br>
    * Comments: Defect 200: "Al tratar de soncronizar los grupos asociados esta generando un error por que la aplicación espera que el codigo de tarifa asociado al grupo asociado este en la tabla de tarifas y esta regla tampoco debe existir".
Nos guardamos en código de Tarifa enviado por el CORE, lo utilizaremos para localizar (si existe) esa tarifa<br>
    * @return The value of the <code>grupoAsociadoCodTarifaCORE</code> attribute.
    */

    public String getGrupoAsociadoCodTarifaCORE()  {
    	String value;
        value =  grupoAsociadoCodTarifaCORE;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>grupoAsociadoCodTarifaCORE</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoCodTarifaCORE</code>. Variable String Size=50<br>
    * Comments: Defect 200: "Al tratar de soncronizar los grupos asociados esta generando un error por que la aplicación espera que el codigo de tarifa asociado al grupo asociado este en la tabla de tarifas y esta regla tampoco debe existir".
Nos guardamos en código de Tarifa enviado por el CORE, lo utilizaremos para localizar (si existe) esa tarifa<br>
    * @param grupoAsociadoCodTarifaCORE The new value of the <code>grupoAsociadoCodTarifaCORE</code> attribute.
    */
    public void setGrupoAsociadoCodTarifaCORE (String grupoAsociadoCodTarifaCORE) {
        modifiedGrupoAsociadoCodTarifaCORE = true;
        this.grupoAsociadoCodTarifaCORE = grupoAsociadoCodTarifaCORE;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsociadoCodTarifaCORE</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsociadoCodTarifaCORE</code>.
    */
    public void setModifiedGrupoAsociadoCodTarifaCORE(boolean modified) {
        this.modifiedGrupoAsociadoCodTarifaCORE = modified;
    }

   /**
    * Returns the value of the <code>grupoAsociadoDescripcion</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>grupoAsociadoDescripcion</code> attribute.
    */

    public String getGrupoAsociadoDescripcion()  {
    	String value;
        value =  grupoAsociadoDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>grupoAsociadoDescripcion</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param grupoAsociadoDescripcion The new value of the <code>grupoAsociadoDescripcion</code> attribute.
    */
    public void setGrupoAsociadoDescripcion (String grupoAsociadoDescripcion) {
        modifiedGrupoAsociadoDescripcion = true;
        this.grupoAsociadoDescripcion = grupoAsociadoDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsociadoDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsociadoDescripcion</code>.
    */
    public void setModifiedGrupoAsociadoDescripcion(boolean modified) {
        this.modifiedGrupoAsociadoDescripcion = modified;
    }

   /**
    * Returns the value of the <code>grupoAsociadoFIniVigencia</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoFIniVigencia</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>grupoAsociadoFIniVigencia</code> attribute.
    */

    public Date getGrupoAsociadoFIniVigencia()  {
    	Date value;
        value =  grupoAsociadoFIniVigencia;
        return value;
    }

   /**
    * Sets the value of the <code>grupoAsociadoFIniVigencia</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoFIniVigencia</code>. Variable Date<br>
    * Comments: <br>
    * @param grupoAsociadoFIniVigencia The new value of the <code>grupoAsociadoFIniVigencia</code> attribute.
    */
    public void setGrupoAsociadoFIniVigencia (Date grupoAsociadoFIniVigencia) {
        modifiedGrupoAsociadoFIniVigencia = true;
        this.grupoAsociadoFIniVigencia = grupoAsociadoFIniVigencia;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsociadoFIniVigencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsociadoFIniVigencia</code>.
    */
    public void setModifiedGrupoAsociadoFIniVigencia(boolean modified) {
        this.modifiedGrupoAsociadoFIniVigencia = modified;
    }

   /**
    * Returns the value of the <code>grupoAsociadoFFinVigencia</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoFFinVigencia</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>grupoAsociadoFFinVigencia</code> attribute.
    */

    public Date getGrupoAsociadoFFinVigencia()  {
    	Date value;
        value =  grupoAsociadoFFinVigencia;
        return value;
    }

   /**
    * Sets the value of the <code>grupoAsociadoFFinVigencia</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoFFinVigencia</code>. Variable Date<br>
    * Comments: <br>
    * @param grupoAsociadoFFinVigencia The new value of the <code>grupoAsociadoFFinVigencia</code> attribute.
    */
    public void setGrupoAsociadoFFinVigencia (Date grupoAsociadoFFinVigencia) {
        modifiedGrupoAsociadoFFinVigencia = true;
        this.grupoAsociadoFFinVigencia = grupoAsociadoFFinVigencia;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsociadoFFinVigencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsociadoFFinVigencia</code>.
    */
    public void setModifiedGrupoAsociadoFFinVigencia(boolean modified) {
        this.modifiedGrupoAsociadoFFinVigencia = modified;
    }

   /**
    * Returns the value of the <code>grupoAsociadoEstado</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoEstado</code>. Variable Int<br>
    * Comments: <br>
    * @return The value of the <code>grupoAsociadoEstado</code> attribute.
    */

    public Long getGrupoAsociadoEstado()  {
    	Long value;
        value =  grupoAsociadoEstado;
        return value;
    }

   /**
    * Sets the value of the <code>grupoAsociadoEstado</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoEstado</code>. Variable Int<br>
    * Comments: <br>
    * @param grupoAsociadoEstado The new value of the <code>grupoAsociadoEstado</code> attribute.
    */
    public void setGrupoAsociadoEstado (Long grupoAsociadoEstado) {
        modifiedGrupoAsociadoEstado = true;
        this.grupoAsociadoEstado = grupoAsociadoEstado;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsociadoEstado</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsociadoEstado</code>.
    */
    public void setModifiedGrupoAsociadoEstado(boolean modified) {
        this.modifiedGrupoAsociadoEstado = modified;
    }

   /**
    * Returns the value of the <code>grupoAsociadoDisminucionCarencia</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoDisminucionCarencia</code>. Variable Nat<br>
    * Comments: En el momento de llamar la capacidad crear se debe enviar este dato como parte de la información de la caratula del contrato<br>
    * @return The value of the <code>grupoAsociadoDisminucionCarencia</code> attribute.
    */

    public Long getGrupoAsociadoDisminucionCarencia()  {
    	Long value;
        value =  grupoAsociadoDisminucionCarencia;
        return value;
    }

   /**
    * Sets the value of the <code>grupoAsociadoDisminucionCarencia</code> attribute.<br>
    * Model Attribute: <code>grupoAsociadoDisminucionCarencia</code>. Variable Nat<br>
    * Comments: En el momento de llamar la capacidad crear se debe enviar este dato como parte de la información de la caratula del contrato<br>
    * @param grupoAsociadoDisminucionCarencia The new value of the <code>grupoAsociadoDisminucionCarencia</code> attribute.
    */
    public void setGrupoAsociadoDisminucionCarencia (Long grupoAsociadoDisminucionCarencia) {
        modifiedGrupoAsociadoDisminucionCarencia = true;
        this.grupoAsociadoDisminucionCarencia = grupoAsociadoDisminucionCarencia;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsociadoDisminucionCarencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsociadoDisminucionCarencia</code>.
    */
    public void setModifiedGrupoAsociadoDisminucionCarencia(boolean modified) {
        this.modifiedGrupoAsociadoDisminucionCarencia = modified;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitudes 0:M  ------ 0:1  GrupoAsociado [GrupoAsociado]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to add to the <code>Solicitudes</code> role.
     */
    public void add2Solicitudes(Solicitud solicitudes) {
        this.solicitudes.add(solicitudes);
    }
    /**
     * Removes an instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to be removed
     */
    public void removeFromSolicitudes(Solicitud solicitudes) {
    	this.solicitudes.remove(solicitudes);
    }
    /**
     * Sets instances of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The new value for the <code>Solicitudes</code> role.
     */
    public void setSolicitudes(Collection < Solicitud > solicitudes) {
        this.solicitudes = solicitudes;
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudes</code> has been modified.
    */
    public boolean isModifiedSolicitudes(){
        return modifiedSolicitudes;
    }

    /**
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratosC 0:M  ------ 0:1  GrupoAsociadoC [GrupoAsociado]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Adds an instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * @param contratosC The instance to add to the <code>ContratosC</code> role.
     */
    public void add2ContratosC(ContratoC contratosC) {
        this.contratosC.add(contratosC);
    }
    /**
     * Removes an instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * @param contratosC The instance to be removed
     */
    public void removeFromContratosC(ContratoC contratosC) {
    	this.contratosC.remove(contratosC);
    }
    /**
     * Sets instances of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * @param contratosC The new value for the <code>ContratosC</code> role.
     */
    public void setContratosC(Collection < ContratoC > contratosC) {
        this.contratosC = contratosC;
    }

   /**
    * This method gets the attribute value <code>modifiedContratosC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratosC</code> has been modified.
    */
    public boolean isModifiedContratosC(){
        return modifiedContratosC;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudesNovedad 0:M  ------ 0:1  GrupoAsociado [GrupoAsociado]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedad() {
        return solicitudesNovedad;
    }

    /**
     * Adds an instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * @param solicitudesNovedad The instance to add to the <code>SolicitudesNovedad</code> role.
     */
    public void add2SolicitudesNovedad(SolicitudNovedad solicitudesNovedad) {
        this.solicitudesNovedad.add(solicitudesNovedad);
    }
    /**
     * Removes an instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * @param solicitudesNovedad The instance to be removed
     */
    public void removeFromSolicitudesNovedad(SolicitudNovedad solicitudesNovedad) {
    	this.solicitudesNovedad.remove(solicitudesNovedad);
    }
    /**
     * Sets instances of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * @param solicitudesNovedad The new value for the <code>SolicitudesNovedad</code> role.
     */
    public void setSolicitudesNovedad(Collection < SolicitudNovedad > solicitudesNovedad) {
        this.solicitudesNovedad = solicitudesNovedad;
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudesNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudesNovedad</code> has been modified.
    */
    public boolean isModifiedSolicitudesNovedad(){
        return modifiedSolicitudesNovedad;
    }

    /**
     * Returns the instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * Model Relationship:
     * <code>[Productos] ProductoT 1:1  ------ 0:M  GruposAsociados [GrupoAsociado]</code>
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
     * <code>[Planes] PlanT 1:1  ------ 0:M  GruposAsociados [GrupoAsociado]</code>
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
        grupoAsociadoCodigoLegal = "";
        grupoAsociadoCodTarifaCORE = null;
        grupoAsociadoDescripcion = "";
        grupoAsociadoFIniVigencia = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        grupoAsociadoFFinVigencia = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        grupoAsociadoEstado = Long.valueOf(0);
        grupoAsociadoDisminucionCarencia = Long.valueOf(0);
        solicitudes = null;
        contratosC = null;
        solicitudesNovedad = null;
        productoT = null;
        planT = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return GrupoAsociado.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return GrupoAsociadoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedGrupoAsociadoCodigoLegal = false;
    	values.put("grupoAsociadoCodigoLegal", getGrupoAsociadoCodigoLegal());
    	modifiedGrupoAsociadoCodTarifaCORE = false;
    	values.put("grupoAsociadoCodTarifaCORE", getGrupoAsociadoCodTarifaCORE());
    	modifiedGrupoAsociadoDescripcion = false;
    	values.put("grupoAsociadoDescripcion", getGrupoAsociadoDescripcion());
    	modifiedGrupoAsociadoFIniVigencia = false;
    	values.put("grupoAsociadoFIniVigencia", getGrupoAsociadoFIniVigencia());
    	modifiedGrupoAsociadoFFinVigencia = false;
    	values.put("grupoAsociadoFFinVigencia", getGrupoAsociadoFFinVigencia());
    	modifiedGrupoAsociadoEstado = false;
    	values.put("grupoAsociadoEstado", getGrupoAsociadoEstado());
    	modifiedGrupoAsociadoDisminucionCarencia = false;
    	values.put("grupoAsociadoDisminucionCarencia", getGrupoAsociadoDisminucionCarencia());
    	modifiedSolicitudes = false;
    	modifiedContratosC = false;
    	modifiedSolicitudesNovedad = false;
    	modifiedProductoT = false;
    	modifiedPlanT = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>GrupoAsociadoOid</code> object that identifies this instance of <code>GrupoAsociado</code>.
     * @return <code>GrupoAsociadoOid </code> object that identifies this instance of <code>GrupoAsociado</code>
     */
	@Override
    public GrupoAsociadoOid getOid() {
        return new GrupoAsociadoOid(getGrupoAsociadoCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(GrupoAsociadoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(GrupoAsociadoConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.GRUPOASOCIADO)) {
            // Add this class
            activeFacets.add(Constants.GRUPOASOCIADO);
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
            relatedInstance = buildGrupoAsociadoRelatedInstance(relatedInstanceJsonOid);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
