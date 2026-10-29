package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.persistence.oid.AesolicitudesOid;
import com.keralty.aepersonas.persistence.oid.AfiliacionesOid;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsociadoOid;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.TarifaOid;
import com.keralty.aepersonas.persistence.oid.TipoIVAOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
 * Persistent representation of the <code>Planes</code> model class.
 * <p>
 * Model Class: <code>Planes</code><br>
 */
@Entity(name = PlanesConstants.CLASS_NAME)
@Table(name = PlanesConstants.TBL_NAME)
public class Planes extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = PlanesConstants.FLD_PLANESPLAN )
    @JsonProperty(value="plan")
    private Long planesPlan;

    /** Class member attribute. */
    @Column(name = PlanesConstants.FLD_PLANESNOMBRE )
    @JsonProperty(value="nombre")
    private String planesNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanesNombre;

    /** Class member attribute. */
    @Column(name = PlanesConstants.FLD_PLANESESBANCOREP )
    @JsonProperty(value="esbancorep")
    private Boolean planesEsBancoRep;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanesEsBancoRep;

    /** Class member attribute. */
    @Column(name = PlanesConstants.FLD_PLANESCODIGOLEGAL )
    @JsonProperty(value="codigolegal")
    private String planesCodigoLegal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanesCodigoLegal;

    /** Class member attribute. */
    @Column(name = PlanesConstants.FLD_PLANESACEPTAPREEXISTENCIAS )
    @JsonProperty(value="aceptapreexistencias")
    private Boolean planesAceptaPreexistencias;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanesAceptaPreexistencias;

    /** Class member attribute. */
    @Column(name = PlanesConstants.FLD_PLANESESVOLUNTARIO )
    @JsonProperty(value="esvoluntario")
    private Boolean planesEsVoluntario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanesEsVoluntario;

    /** Class member attribute. */
    @Column(name = PlanesConstants.FLD_PLANESINICIOCONTDIAUNO )
    @JsonProperty(value="iniciocontdiauno")
    private Boolean planesInicioContDiaUno;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanesInicioContDiaUno;

    /** Related Class. */
    @OneToMany(mappedBy = PlanesConstants.ROLE_INVNAME_DOMINIOS)
    @JsonIgnore
    private Collection <Dominio> dominios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominios;

    /** Related Class. */
    @OneToMany(mappedBy = PlanesConstants.ROLE_INVNAME_TARIFAS)
    @JsonIgnore
    private Collection <Tarifa> tarifas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTarifas;

    /** Related Class. */
    @OneToMany(mappedBy = PlanesConstants.ROLE_INVNAME_GRUPOSASOCIADOS)
    @JsonIgnore
    private Collection <GrupoAsociado> gruposAsociados;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGruposAsociados;

    /** Related Class. */
    @OneToMany(mappedBy = PlanesConstants.ROLE_INVNAME_TIPOSIVA)
    @JsonIgnore
    private Collection <TipoIVA> tiposIVA;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTiposIVA;

    /** Related Class. */
    @OneToMany(mappedBy = PlanesConstants.ROLE_INVNAME_AESOLICITUDES)
    @JsonIgnore
    private Collection <Aesolicitudes> aESOLICITUDES;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAESOLICITUDES;

    /** Related Class. */
    @OneToMany(mappedBy = PlanesConstants.ROLE_INVNAME_CONTRATOSC)
    @JsonIgnore
    private Collection <ContratoC> contratosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratosC;

    /** Related Class. */
    @ManyToMany(mappedBy=PlanesConstants.ROLE_INVNAME_AFILIACIONES)
    @JsonIgnore
    private Collection <Afiliaciones> afiliaciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAfiliaciones;

    /** Related Class. */
    @OneToMany(mappedBy = PlanesConstants.ROLE_INVNAME_SOLICITUDESNOVEDAD)
    @JsonIgnore
    private Collection <SolicitudNovedad> solicitudesNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudesNovedad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PlanesConstants.FLD_PRODUCTOSPRODUCTO, referencedColumnName=ProductosConstants.FLD_PRODUCTOSPRODUCTO)
    })
    @JsonIgnore
    private Productos productoT;
    /** Related attribute. */
    @Column(name = PlanesConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false)
    private Long productosProducto;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProductoT;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Planes() {
        planesPlan = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Planes</code>.
     * @param oid Object Identifier of the instance of <code>Planes</code> to be created.
     * @throws SystemException
     */
    public Planes(PlanesOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            planesPlan = oid.getPlanesPlan();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>planesPlan</code> attribute<br>in class <code>Planes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Planes</code>
     * @return The value of the <code>planesPlan</code> attribute<br>in class <code>Planes</code>.
     */
    public Long getPlanesPlan() {
        return planesPlan;
    }

    /**
     * Sets the value of the <code>planesPlan</code> attribute<br>in class <code>Planes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Planes</code>
     * @param planesPlan The new value of the <code>planesPlan</code> attribute<br>in class <code>Planes</code>.
     */
    public void setPlanesPlan(Long planesPlan) {
        this.planesPlan = planesPlan;
    }

   /**
    * Returns the value of the <code>planesNombre</code> attribute.<br>
    * Model Attribute: <code>planesNombre</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>planesNombre</code> attribute.
    */

    public String getPlanesNombre()  {
    	String value;
        value =  planesNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>planesNombre</code> attribute.<br>
    * Model Attribute: <code>planesNombre</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param planesNombre The new value of the <code>planesNombre</code> attribute.
    */
    public void setPlanesNombre (String planesNombre) {
        modifiedPlanesNombre = true;
        this.planesNombre = planesNombre;
    }

   /**
    * Sets the value of the <code>modifiedPlanesNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlanesNombre</code>.
    */
    public void setModifiedPlanesNombre(boolean modified) {
        this.modifiedPlanesNombre = modified;
    }

   /**
    * Returns the value of the <code>planesEsBancoRep</code> attribute.<br>
    * Model Attribute: <code>planesEsBancoRep</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>planesEsBancoRep</code> attribute.
    */

    public Boolean getPlanesEsBancoRep()  {
    	Boolean value;
        value =  planesEsBancoRep;
        return value;
    }

   /**
    * Sets the value of the <code>planesEsBancoRep</code> attribute.<br>
    * Model Attribute: <code>planesEsBancoRep</code>. Variable Bool<br>
    * Comments: <br>
    * @param planesEsBancoRep The new value of the <code>planesEsBancoRep</code> attribute.
    */
    public void setPlanesEsBancoRep (Boolean planesEsBancoRep) {
        modifiedPlanesEsBancoRep = true;
        this.planesEsBancoRep = planesEsBancoRep;
    }

   /**
    * Sets the value of the <code>modifiedPlanesEsBancoRep</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlanesEsBancoRep</code>.
    */
    public void setModifiedPlanesEsBancoRep(boolean modified) {
        this.modifiedPlanesEsBancoRep = modified;
    }

   /**
    * Returns the value of the <code>planesCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>planesCodigoLegal</code>. Variable String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>planesCodigoLegal</code> attribute.
    */

    public String getPlanesCodigoLegal()  {
    	String value;
        value =  planesCodigoLegal;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>planesCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>planesCodigoLegal</code>. Variable String Size=10<br>
    * Comments: <br>
    * @param planesCodigoLegal The new value of the <code>planesCodigoLegal</code> attribute.
    */
    public void setPlanesCodigoLegal (String planesCodigoLegal) {
        modifiedPlanesCodigoLegal = true;
        this.planesCodigoLegal = planesCodigoLegal;
    }

   /**
    * Sets the value of the <code>modifiedPlanesCodigoLegal</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlanesCodigoLegal</code>.
    */
    public void setModifiedPlanesCodigoLegal(boolean modified) {
        this.modifiedPlanesCodigoLegal = modified;
    }

   /**
    * Returns the value of the <code>planesAceptaPreexistencias</code> attribute.<br>
    * Model Attribute: <code>planesAceptaPreexistencias</code>. Variable Bool<br>
    * Comments: GC3: Unicamente los planes que pueden tener el estado tramitada con pre existencias debería llamar la capacidad consultar pre-existencias ya que el estado tramitada con pre existencias no aplica para los demás planes.<br>
    * @return The value of the <code>planesAceptaPreexistencias</code> attribute.
    */

    public Boolean getPlanesAceptaPreexistencias()  {
    	Boolean value;
        value =  planesAceptaPreexistencias;
        return value;
    }

   /**
    * Sets the value of the <code>planesAceptaPreexistencias</code> attribute.<br>
    * Model Attribute: <code>planesAceptaPreexistencias</code>. Variable Bool<br>
    * Comments: GC3: Unicamente los planes que pueden tener el estado tramitada con pre existencias debería llamar la capacidad consultar pre-existencias ya que el estado tramitada con pre existencias no aplica para los demás planes.<br>
    * @param planesAceptaPreexistencias The new value of the <code>planesAceptaPreexistencias</code> attribute.
    */
    public void setPlanesAceptaPreexistencias (Boolean planesAceptaPreexistencias) {
        modifiedPlanesAceptaPreexistencias = true;
        this.planesAceptaPreexistencias = planesAceptaPreexistencias;
    }

   /**
    * Sets the value of the <code>modifiedPlanesAceptaPreexistencias</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlanesAceptaPreexistencias</code>.
    */
    public void setModifiedPlanesAceptaPreexistencias(boolean modified) {
        this.modifiedPlanesAceptaPreexistencias = modified;
    }

   /**
    * Returns the value of the <code>planesEsVoluntario</code> attribute.<br>
    * Model Attribute: <code>planesEsVoluntario</code>. Variable Bool<br>
    * Comments: Req. 1: Identificación de plan voluntario
que no lo son. Para ello, se añadirá una nueva marca en la paramétrica ampliada “Planes”. Dicha nueva marca tendrá por nombre “Es Voluntario” y tomará valor booleano (si/no). El proceso de sincronización de planes asignará el valor “No” a esta nueva marca a todo nuevo plan que se sincronice desde BH. El resto de proceso de sincronización no se verá afectado.<br>
    * @return The value of the <code>planesEsVoluntario</code> attribute.
    */

    public Boolean getPlanesEsVoluntario()  {
    	Boolean value;
        value =  planesEsVoluntario;
        return value;
    }

   /**
    * Sets the value of the <code>planesEsVoluntario</code> attribute.<br>
    * Model Attribute: <code>planesEsVoluntario</code>. Variable Bool<br>
    * Comments: Req. 1: Identificación de plan voluntario
que no lo son. Para ello, se añadirá una nueva marca en la paramétrica ampliada “Planes”. Dicha nueva marca tendrá por nombre “Es Voluntario” y tomará valor booleano (si/no). El proceso de sincronización de planes asignará el valor “No” a esta nueva marca a todo nuevo plan que se sincronice desde BH. El resto de proceso de sincronización no se verá afectado.<br>
    * @param planesEsVoluntario The new value of the <code>planesEsVoluntario</code> attribute.
    */
    public void setPlanesEsVoluntario (Boolean planesEsVoluntario) {
        modifiedPlanesEsVoluntario = true;
        this.planesEsVoluntario = planesEsVoluntario;
    }

   /**
    * Sets the value of the <code>modifiedPlanesEsVoluntario</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlanesEsVoluntario</code>.
    */
    public void setModifiedPlanesEsVoluntario(boolean modified) {
        this.modifiedPlanesEsVoluntario = modified;
    }

   /**
    * Returns the value of the <code>planesInicioContDiaUno</code> attribute.<br>
    * Model Attribute: <code>planesInicioContDiaUno</code>. Variable Bool<br>
    * Comments: GdC-51 Req. 1: Inclusión de una nueva marca de configuración (toma valores Sí/No) a nivel de plan que indique que la fecha de inicio de contratación debe ser el día uno del mes en curso o el día uno del mes siguiente al mes en curso<br>
    * @return The value of the <code>planesInicioContDiaUno</code> attribute.
    */

    public Boolean getPlanesInicioContDiaUno()  {
    	Boolean value;
        value =  planesInicioContDiaUno;
        return value;
    }

   /**
    * Sets the value of the <code>planesInicioContDiaUno</code> attribute.<br>
    * Model Attribute: <code>planesInicioContDiaUno</code>. Variable Bool<br>
    * Comments: GdC-51 Req. 1: Inclusión de una nueva marca de configuración (toma valores Sí/No) a nivel de plan que indique que la fecha de inicio de contratación debe ser el día uno del mes en curso o el día uno del mes siguiente al mes en curso<br>
    * @param planesInicioContDiaUno The new value of the <code>planesInicioContDiaUno</code> attribute.
    */
    public void setPlanesInicioContDiaUno (Boolean planesInicioContDiaUno) {
        modifiedPlanesInicioContDiaUno = true;
        this.planesInicioContDiaUno = planesInicioContDiaUno;
    }

   /**
    * Sets the value of the <code>modifiedPlanesInicioContDiaUno</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlanesInicioContDiaUno</code>.
    */
    public void setModifiedPlanesInicioContDiaUno(boolean modified) {
        this.modifiedPlanesInicioContDiaUno = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominios 0:M  ------ 1:1  PlanT [Planes]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     */
    @JsonIgnore
    public Collection <Dominio> getDominios() {
        return dominios;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * @param dominios The instance to add to the <code>Dominios</code> role.
     */
    public void add2Dominios(Dominio dominios) {
        this.dominios.add(dominios);
    }
    /**
     * Removes an instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * @param dominios The instance to be removed
     */
    public void removeFromDominios(Dominio dominios) {
    	this.dominios.remove(dominios);
    }
    /**
     * Sets instances of <code>Dominio</code> related through the <code>Dominios</code> role.
     * @param dominios The new value for the <code>Dominios</code> role.
     */
    public void setDominios(Collection < Dominio > dominios) {
        this.dominios = dominios;
    }

   /**
    * This method gets the attribute value <code>modifiedDominios</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominios</code> has been modified.
    */
    public boolean isModifiedDominios(){
        return modifiedDominios;
    }

    /**
     * Returns the instance of <code>Tarifa</code> related through the <code>Tarifas</code> role.
     * Model Relationship:
     * <code>[Tarifa] Tarifas 0:M  ------ 1:1  PlanT [Planes]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Tarifa</code> related through the <code>Tarifas</code> role.
     */
    @JsonIgnore
    public Collection <Tarifa> getTarifas() {
        return tarifas;
    }

    /**
     * Adds an instance of <code>Tarifa</code> related through the <code>Tarifas</code> role.
     * @param tarifas The instance to add to the <code>Tarifas</code> role.
     */
    public void add2Tarifas(Tarifa tarifas) {
        this.tarifas.add(tarifas);
    }
    /**
     * Removes an instance of <code>Tarifa</code> related through the <code>Tarifas</code> role.
     * @param tarifas The instance to be removed
     */
    public void removeFromTarifas(Tarifa tarifas) {
    	this.tarifas.remove(tarifas);
    }
    /**
     * Sets instances of <code>Tarifa</code> related through the <code>Tarifas</code> role.
     * @param tarifas The new value for the <code>Tarifas</code> role.
     */
    public void setTarifas(Collection < Tarifa > tarifas) {
        this.tarifas = tarifas;
    }

   /**
    * This method gets the attribute value <code>modifiedTarifas</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTarifas</code> has been modified.
    */
    public boolean isModifiedTarifas(){
        return modifiedTarifas;
    }

    /**
     * Returns the instance of <code>GrupoAsociado</code> related through the <code>GruposAsociados</code> role.
     * Model Relationship:
     * <code>[GrupoAsociado] GruposAsociados 0:M  ------ 1:1  PlanT [Planes]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsociado</code> related through the <code>GruposAsociados</code> role.
     */
    @JsonIgnore
    public Collection <GrupoAsociado> getGruposAsociados() {
        return gruposAsociados;
    }

    /**
     * Adds an instance of <code>GrupoAsociado</code> related through the <code>GruposAsociados</code> role.
     * @param gruposAsociados The instance to add to the <code>GruposAsociados</code> role.
     */
    public void add2GruposAsociados(GrupoAsociado gruposAsociados) {
        this.gruposAsociados.add(gruposAsociados);
    }
    /**
     * Removes an instance of <code>GrupoAsociado</code> related through the <code>GruposAsociados</code> role.
     * @param gruposAsociados The instance to be removed
     */
    public void removeFromGruposAsociados(GrupoAsociado gruposAsociados) {
    	this.gruposAsociados.remove(gruposAsociados);
    }
    /**
     * Sets instances of <code>GrupoAsociado</code> related through the <code>GruposAsociados</code> role.
     * @param gruposAsociados The new value for the <code>GruposAsociados</code> role.
     */
    public void setGruposAsociados(Collection < GrupoAsociado > gruposAsociados) {
        this.gruposAsociados = gruposAsociados;
    }

   /**
    * This method gets the attribute value <code>modifiedGruposAsociados</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedGruposAsociados</code> has been modified.
    */
    public boolean isModifiedGruposAsociados(){
        return modifiedGruposAsociados;
    }

    /**
     * Returns the instance of <code>TipoIVA</code> related through the <code>TiposIVA</code> role.
     * Model Relationship:
     * <code>[TipoIVA] TiposIVA 0:M  ------ 1:1  PlanT [Planes]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIVA</code> related through the <code>TiposIVA</code> role.
     */
    @JsonIgnore
    public Collection <TipoIVA> getTiposIVA() {
        return tiposIVA;
    }

    /**
     * Adds an instance of <code>TipoIVA</code> related through the <code>TiposIVA</code> role.
     * @param tiposIVA The instance to add to the <code>TiposIVA</code> role.
     */
    public void add2TiposIVA(TipoIVA tiposIVA) {
        this.tiposIVA.add(tiposIVA);
    }
    /**
     * Removes an instance of <code>TipoIVA</code> related through the <code>TiposIVA</code> role.
     * @param tiposIVA The instance to be removed
     */
    public void removeFromTiposIVA(TipoIVA tiposIVA) {
    	this.tiposIVA.remove(tiposIVA);
    }
    /**
     * Sets instances of <code>TipoIVA</code> related through the <code>TiposIVA</code> role.
     * @param tiposIVA The new value for the <code>TiposIVA</code> role.
     */
    public void setTiposIVA(Collection < TipoIVA > tiposIVA) {
        this.tiposIVA = tiposIVA;
    }

   /**
    * This method gets the attribute value <code>modifiedTiposIVA</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTiposIVA</code> has been modified.
    */
    public boolean isModifiedTiposIVA(){
        return modifiedTiposIVA;
    }

    /**
     * Returns the instance of <code>Aesolicitudes</code> related through the <code>AESOLICITUDES</code> role.
     * Model Relationship:
     * <code>[Aesolicitudes] AESOLICITUDES 0:M  ------ 0:1  PlanT [Planes]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Aesolicitudes</code> related through the <code>AESOLICITUDES</code> role.
     */
    @JsonIgnore
    public Collection <Aesolicitudes> getAESOLICITUDES() {
        return aESOLICITUDES;
    }

    /**
     * Adds an instance of <code>Aesolicitudes</code> related through the <code>AESOLICITUDES</code> role.
     * @param aESOLICITUDES The instance to add to the <code>AESOLICITUDES</code> role.
     */
    public void add2AESOLICITUDES(Aesolicitudes aESOLICITUDES) {
        this.aESOLICITUDES.add(aESOLICITUDES);
    }
    /**
     * Removes an instance of <code>Aesolicitudes</code> related through the <code>AESOLICITUDES</code> role.
     * @param aESOLICITUDES The instance to be removed
     */
    public void removeFromAESOLICITUDES(Aesolicitudes aESOLICITUDES) {
    	this.aESOLICITUDES.remove(aESOLICITUDES);
    }
    /**
     * Sets instances of <code>Aesolicitudes</code> related through the <code>AESOLICITUDES</code> role.
     * @param aESOLICITUDES The new value for the <code>AESOLICITUDES</code> role.
     */
    public void setAESOLICITUDES(Collection < Aesolicitudes > aESOLICITUDES) {
        this.aESOLICITUDES = aESOLICITUDES;
    }

   /**
    * This method gets the attribute value <code>modifiedAESOLICITUDES</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAESOLICITUDES</code> has been modified.
    */
    public boolean isModifiedAESOLICITUDES(){
        return modifiedAESOLICITUDES;
    }

    /**
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratosC 0:M  ------ 1:1  PlanC [Planes]</code>
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
     * Returns the instance of <code>Afiliaciones</code> related through the <code>Afiliaciones</code> role.
     * Model Relationship:
     * <code>[Afiliaciones] Afiliaciones 0:M  ------ 0:M  Planes [Planes]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Afiliaciones</code> related through the <code>Afiliaciones</code> role.
     */
    @JsonIgnore
    public Collection <Afiliaciones> getAfiliaciones() {
        return afiliaciones;
    }

    /**
     * Adds an instance of <code>Afiliaciones</code> related through the <code>Afiliaciones</code> role.
     * @param afiliaciones The instance to add to the <code>Afiliaciones</code> role.
     */
    public void add2Afiliaciones(Afiliaciones afiliaciones) {
        this.afiliaciones.add(afiliaciones);
    }
    /**
     * Removes an instance of <code>Afiliaciones</code> related through the <code>Afiliaciones</code> role.
     * @param afiliaciones The instance to be removed
     */
    public void removeFromAfiliaciones(Afiliaciones afiliaciones) {
    	this.afiliaciones.remove(afiliaciones);
    }
    /**
     * Sets instances of <code>Afiliaciones</code> related through the <code>Afiliaciones</code> role.
     * @param afiliaciones The new value for the <code>Afiliaciones</code> role.
     */
    public void setAfiliaciones(Collection < Afiliaciones > afiliaciones) {
        this.afiliaciones = afiliaciones;
    }

   /**
    * This method gets the attribute value <code>modifiedAfiliaciones</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAfiliaciones</code> has been modified.
    */
    public boolean isModifiedAfiliaciones(){
        return modifiedAfiliaciones;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudesNovedad 0:M  ------ 1:1  PlanT [Planes]</code>
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
     * <code>[Productos] ProductoT 1:1  ------ 0:M  Planes [Planes]</code>
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
        planesNombre = "";
        planesEsBancoRep = false;
        planesCodigoLegal = "";
        planesAceptaPreexistencias = false;
        planesEsVoluntario = false;
        planesInicioContDiaUno = false;
        dominios = null;
        tarifas = null;
        gruposAsociados = null;
        tiposIVA = null;
        aESOLICITUDES = null;
        contratosC = null;
        afiliaciones = null;
        solicitudesNovedad = null;
        productoT = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return Planes.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PlanesConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPlanesNombre = false;
    	values.put("planesNombre", getPlanesNombre());
    	modifiedPlanesEsBancoRep = false;
    	values.put("planesEsBancoRep", getPlanesEsBancoRep());
    	modifiedPlanesCodigoLegal = false;
    	values.put("planesCodigoLegal", getPlanesCodigoLegal());
    	modifiedPlanesAceptaPreexistencias = false;
    	values.put("planesAceptaPreexistencias", getPlanesAceptaPreexistencias());
    	modifiedPlanesEsVoluntario = false;
    	values.put("planesEsVoluntario", getPlanesEsVoluntario());
    	modifiedPlanesInicioContDiaUno = false;
    	values.put("planesInicioContDiaUno", getPlanesInicioContDiaUno());
    	modifiedDominios = false;
    	modifiedTarifas = false;
    	modifiedGruposAsociados = false;
    	modifiedTiposIVA = false;
    	modifiedAESOLICITUDES = false;
    	modifiedContratosC = false;
    	modifiedAfiliaciones = false;
    	modifiedSolicitudesNovedad = false;
    	modifiedProductoT = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>PlanesOid</code> object that identifies this instance of <code>Planes</code>.
     * @return <code>PlanesOid </code> object that identifies this instance of <code>Planes</code>
     */
	@Override
    public PlanesOid getOid() {
        return new PlanesOid(getPlanesPlan());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PlanesConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(PlanesConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PLANES)) {
            // Add this class
            activeFacets.add(Constants.PLANES);
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


        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO) || getAgent().isFacetActive(Constants.USUARIOSISTEMAEXTERNO)) {
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
            relatedInstance = buildPlanesRelatedInstance(relatedInstanceJsonOid);
        }
        if (PlanesConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_TARIFAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Tarifa(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_GRUPOSASOCIADOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4GrupoAsociado(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_TIPOSIVA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4TipoIVA(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_AESOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Aesolicitudes(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_AFILIACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Afiliaciones(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPlanesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Tarifa(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Tarifa(mapper.readValue(relatedInstanceJsonOid, TarifaOid.class)): Tarifa.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4GrupoAsociado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class)): GrupoAsociado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4TipoIVA(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIVA(mapper.readValue(relatedInstanceJsonOid, TipoIVAOid.class)): TipoIVA.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Aesolicitudes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Aesolicitudes(mapper.readValue(relatedInstanceJsonOid, AesolicitudesOid.class)): Aesolicitudes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Afiliaciones(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Afiliaciones(mapper.readValue(relatedInstanceJsonOid, AfiliacionesOid.class)): Afiliaciones.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
