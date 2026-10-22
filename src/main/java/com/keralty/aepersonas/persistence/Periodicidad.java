package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.persistence.oid.AnexoCOid;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.repository.AnexoMatJpaRepository;
import com.keralty.aepersonas.repository.AnexoNeoJpaRepository;
import com.keralty.aepersonas.repository.SolicitudJpaRepository;
import com.keralty.aepersonas.utils.Utilities;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
 * Persistent representation of the <code>Periodicidad</code> model class.
 * <p>
 * Model Class: <code>Periodicidad</code><br>
 */
@Entity(name = PeriodicidadConstants.CLASS_NAME)
@Table(name = PeriodicidadConstants.TBL_NAME)
public class Periodicidad extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient SolicitudJpaRepository solicitudRepository;

    @JsonIgnore
    private transient AnexoMatJpaRepository anexoMatRepository;

    @JsonIgnore
    private transient AnexoNeoJpaRepository anexoNeoRepository;

    /** Class identification function. */
    @Id
    @Column(name = PeriodicidadConstants.FLD_PERIODICIDADCODIGO )
    @JsonProperty(value="codigo")
    private Long periodicidadCodigo;

    /** Class member attribute. */
    @Column(name = PeriodicidadConstants.FLD_PERIODICIDADDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String periodicidadDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPeriodicidadDescripcion;

    /** Class member attribute. */
    @Column(name = PeriodicidadConstants.FLD_PERIODICIDADESMENSUAL )
    @JsonProperty(value="esmensual")
    private Boolean periodicidadEsMensual;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPeriodicidadEsMensual;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnumpagos")
    protected Long periodicidaddrvNumPagos;

    /** Related Class. */
    @ManyToMany(mappedBy=PeriodicidadConstants.ROLE_INVNAME_DOMINIOS)
    @JsonIgnore
    private Collection <Dominio> dominios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominios;

    /** Related Class. */
    @OneToMany(mappedBy = PeriodicidadConstants.ROLE_INVNAME_SOLICITUDES)
    @JsonIgnore
    private Collection <Solicitud> solicitudes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudes;

    /** Related Class. */
    @OneToMany(mappedBy = PeriodicidadConstants.ROLE_INVNAME_ANEXOSMAT)
    @JsonIgnore
    private Collection <AnexoMat> anexosMat;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexosMat;

    /** Related Class. */
    @OneToMany(mappedBy = PeriodicidadConstants.ROLE_INVNAME_ANEXOSNEO)
    @JsonIgnore
    private Collection <AnexoNeo> anexosNeo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexosNeo;

    /** Related Class. */
    @OneToMany(mappedBy = PeriodicidadConstants.ROLE_INVNAME_CONTRATOSC)
    @JsonIgnore
    private Collection <ContratoC> contratosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratosC;

    /** Related Class. */
    @OneToMany(mappedBy = PeriodicidadConstants.ROLE_INVNAME_ANEXOSC)
    @JsonIgnore
    private Collection <AnexoC> anexosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexosC;

    /** Related Class. */
    @OneToMany(mappedBy = PeriodicidadConstants.ROLE_INVNAME_SOLICITUDESNOVEDAD)
    @JsonIgnore
    private Collection <SolicitudNovedad> solicitudesNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudesNovedad;

    /** Related Class. */
    @OneToMany(mappedBy = PeriodicidadConstants.ROLE_INVNAME_SOLICITUDESNOVEDADNUEVA)
    @JsonIgnore
    private Collection <SolicitudNovedad> solicitudesNovedadNueva;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudesNovedadNueva;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Periodicidad() {
        periodicidadCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Periodicidad</code>.
     * @param oid Object Identifier of the instance of <code>Periodicidad</code> to be created.
     * @throws SystemException
     */
    public Periodicidad(PeriodicidadOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            periodicidadCodigo = oid.getPeriodicidadCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>periodicidadCodigo</code> attribute<br>in class <code>Periodicidad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Periodicidad</code>
     * @return The value of the <code>periodicidadCodigo</code> attribute<br>in class <code>Periodicidad</code>.
     */
    public Long getPeriodicidadCodigo() {
        return periodicidadCodigo;
    }

    /**
     * Sets the value of the <code>periodicidadCodigo</code> attribute<br>in class <code>Periodicidad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Periodicidad</code>
     * @param periodicidadCodigo The new value of the <code>periodicidadCodigo</code> attribute<br>in class <code>Periodicidad</code>.
     */
    public void setPeriodicidadCodigo(Long periodicidadCodigo) {
        this.periodicidadCodigo = periodicidadCodigo;
    }

   /**
    * Returns the value of the <code>periodicidadDescripcion</code> attribute.<br>
    * Model Attribute: <code>periodicidadDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>periodicidadDescripcion</code> attribute.
    */

    public String getPeriodicidadDescripcion()  {
    	String value;
        value =  periodicidadDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>periodicidadDescripcion</code> attribute.<br>
    * Model Attribute: <code>periodicidadDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param periodicidadDescripcion The new value of the <code>periodicidadDescripcion</code> attribute.
    */
    public void setPeriodicidadDescripcion (String periodicidadDescripcion) {
        modifiedPeriodicidadDescripcion = true;
        this.periodicidadDescripcion = periodicidadDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedPeriodicidadDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedPeriodicidadDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPeriodicidadDescripcion() {
        return modifiedPeriodicidadDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedPeriodicidadDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPeriodicidadDescripcion</code>.
    */
    public void setModifiedPeriodicidadDescripcion(boolean modified) {
        this.modifiedPeriodicidadDescripcion = modified;
    }

   /**
    * Returns the value of the <code>periodicidadEsMensual</code> attribute.<br>
    * Model Attribute: <code>periodicidadEsMensual</code>. Variable Bool<br>
    * Comments: Necesitamos identificar la periodicidad mensual porque cambia la lógica de los datos de pago de la solicitud<br>
    * @return The value of the <code>periodicidadEsMensual</code> attribute.
    */

    public Boolean getPeriodicidadEsMensual()  {
    	Boolean value;
        value =  periodicidadEsMensual;
        return value;
    }

   /**
    * Sets the value of the <code>periodicidadEsMensual</code> attribute.<br>
    * Model Attribute: <code>periodicidadEsMensual</code>. Variable Bool<br>
    * Comments: Necesitamos identificar la periodicidad mensual porque cambia la lógica de los datos de pago de la solicitud<br>
    * @param periodicidadEsMensual The new value of the <code>periodicidadEsMensual</code> attribute.
    */
    public void setPeriodicidadEsMensual (Boolean periodicidadEsMensual) {
        modifiedPeriodicidadEsMensual = true;
        this.periodicidadEsMensual = periodicidadEsMensual;
    }

   /**
    * Returns the value of the <code>modifiedPeriodicidadEsMensual</code> class property.<br>
    *
    * @return The value of the <code>modifiedPeriodicidadEsMensual</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPeriodicidadEsMensual() {
        return modifiedPeriodicidadEsMensual;
    }

   /**
    * Sets the value of the <code>modifiedPeriodicidadEsMensual</code> class property.<br>
    * @param modified The new value of the <code>modifiedPeriodicidadEsMensual</code>.
    */
    public void setModifiedPeriodicidadEsMensual(boolean modified) {
        this.modifiedPeriodicidadEsMensual = modified;
    }

   /**
    * Returns the value of the <code>periodicidaddrvNumPagos</code> attribute.<br>
    * Model Attribute: <code>periodicidaddrvNumPagos</code>. Variable Nat<br>
    * Comments: <br>
    * @return The value of the <code>periodicidaddrvNumPagos</code> attribute.
    */

    @JsonIgnore
    public Long getPeriodicidaddrvNumPagos()  {
    	Long value;
        try {
            value = periodicidaddrvNumPagosDerivations();
        } catch (Exception e) {
            value = Long.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Periodicidad, Attribute: periodicidaddrvNumPagos");
        }
        return value;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominios 0:M  ------ 0:M  Periodicidades [Periodicidad]</code>
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
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitudes 0:M  ------ 0:1  Periodicidad [Periodicidad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudes() {
        return getSolicitudRepository().findByPeriodicidad(this);
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
     * Returns the instance of <code>AnexoMat</code> related through the <code>AnexosMat</code> role.
     * Model Relationship:
     * <code>[AnexoMat] AnexosMat 0:M  ------ 1:1  Periodicidad [Periodicidad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>AnexoMat</code> related through the <code>AnexosMat</code> role.
     */
    @JsonIgnore
    public Collection <AnexoMat> getAnexosMat() {
        return getAnexoMatRepository().findByPeriodicidad(this);
    }

    /**
     * Adds an instance of <code>AnexoMat</code> related through the <code>AnexosMat</code> role.
     * @param anexosMat The instance to add to the <code>AnexosMat</code> role.
     */
    public void add2AnexosMat(AnexoMat anexosMat) {
        this.anexosMat.add(anexosMat);
    }
    /**
     * Removes an instance of <code>AnexoMat</code> related through the <code>AnexosMat</code> role.
     * @param anexosMat The instance to be removed
     */
    public void removeFromAnexosMat(AnexoMat anexosMat) {
    	this.anexosMat.remove(anexosMat);
    }
    /**
     * Sets instances of <code>AnexoMat</code> related through the <code>AnexosMat</code> role.
     * @param anexosMat The new value for the <code>AnexosMat</code> role.
     */
    public void setAnexosMat(Collection < AnexoMat > anexosMat) {
        this.anexosMat = anexosMat;
    }

   /**
    * This method gets the attribute value <code>modifiedAnexosMat</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAnexosMat</code> has been modified.
    */
    public boolean isModifiedAnexosMat(){
        return modifiedAnexosMat;
    }

    /**
     * Returns the instance of <code>AnexoNeo</code> related through the <code>AnexosNeo</code> role.
     * Model Relationship:
     * <code>[AnexoNeo] AnexosNeo 0:M  ------ 1:1  Periodicidad [Periodicidad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>AnexoNeo</code> related through the <code>AnexosNeo</code> role.
     */
    @JsonIgnore
    public Collection <AnexoNeo> getAnexosNeo() {
        return getAnexoNeoRepository().findByPeriodicidad(this);
    }

    /**
     * Adds an instance of <code>AnexoNeo</code> related through the <code>AnexosNeo</code> role.
     * @param anexosNeo The instance to add to the <code>AnexosNeo</code> role.
     */
    public void add2AnexosNeo(AnexoNeo anexosNeo) {
        this.anexosNeo.add(anexosNeo);
    }
    /**
     * Removes an instance of <code>AnexoNeo</code> related through the <code>AnexosNeo</code> role.
     * @param anexosNeo The instance to be removed
     */
    public void removeFromAnexosNeo(AnexoNeo anexosNeo) {
    	this.anexosNeo.remove(anexosNeo);
    }
    /**
     * Sets instances of <code>AnexoNeo</code> related through the <code>AnexosNeo</code> role.
     * @param anexosNeo The new value for the <code>AnexosNeo</code> role.
     */
    public void setAnexosNeo(Collection < AnexoNeo > anexosNeo) {
        this.anexosNeo = anexosNeo;
    }

   /**
    * This method gets the attribute value <code>modifiedAnexosNeo</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAnexosNeo</code> has been modified.
    */
    public boolean isModifiedAnexosNeo(){
        return modifiedAnexosNeo;
    }

    /**
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratosC 0:M  ------ 0:1  PeriodicidadC [Periodicidad]</code>
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
     * Returns the instance of <code>AnexoC</code> related through the <code>AnexosC</code> role.
     * Model Relationship:
     * <code>[AnexoC] AnexosC 0:M  ------ 0:1  PeriodicidadC [Periodicidad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>AnexoC</code> related through the <code>AnexosC</code> role.
     */
    @JsonIgnore
    public Collection <AnexoC> getAnexosC() {
        return anexosC;
    }

    /**
     * Adds an instance of <code>AnexoC</code> related through the <code>AnexosC</code> role.
     * @param anexosC The instance to add to the <code>AnexosC</code> role.
     */
    public void add2AnexosC(AnexoC anexosC) {
        this.anexosC.add(anexosC);
    }
    /**
     * Removes an instance of <code>AnexoC</code> related through the <code>AnexosC</code> role.
     * @param anexosC The instance to be removed
     */
    public void removeFromAnexosC(AnexoC anexosC) {
    	this.anexosC.remove(anexosC);
    }
    /**
     * Sets instances of <code>AnexoC</code> related through the <code>AnexosC</code> role.
     * @param anexosC The new value for the <code>AnexosC</code> role.
     */
    public void setAnexosC(Collection < AnexoC > anexosC) {
        this.anexosC = anexosC;
    }

   /**
    * This method gets the attribute value <code>modifiedAnexosC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAnexosC</code> has been modified.
    */
    public boolean isModifiedAnexosC(){
        return modifiedAnexosC;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudesNovedad 0:M  ------ 0:1  Periodicidad [Periodicidad]</code>
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
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedadNueva</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudesNovedadNueva 0:M  ------ 0:1  PeriodicidadNueva [Periodicidad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedadNueva</code> role.
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedadNueva() {
        return solicitudesNovedadNueva;
    }

    /**
     * Adds an instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedadNueva</code> role.
     * @param solicitudesNovedadNueva The instance to add to the <code>SolicitudesNovedadNueva</code> role.
     */
    public void add2SolicitudesNovedadNueva(SolicitudNovedad solicitudesNovedadNueva) {
        this.solicitudesNovedadNueva.add(solicitudesNovedadNueva);
    }
    /**
     * Removes an instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedadNueva</code> role.
     * @param solicitudesNovedadNueva The instance to be removed
     */
    public void removeFromSolicitudesNovedadNueva(SolicitudNovedad solicitudesNovedadNueva) {
    	this.solicitudesNovedadNueva.remove(solicitudesNovedadNueva);
    }
    /**
     * Sets instances of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedadNueva</code> role.
     * @param solicitudesNovedadNueva The new value for the <code>SolicitudesNovedadNueva</code> role.
     */
    public void setSolicitudesNovedadNueva(Collection < SolicitudNovedad > solicitudesNovedadNueva) {
        this.solicitudesNovedadNueva = solicitudesNovedadNueva;
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudesNovedadNueva</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudesNovedadNueva</code> has been modified.
    */
    public boolean isModifiedSolicitudesNovedadNueva(){
        return modifiedSolicitudesNovedadNueva;
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
     * Computes the value of the <code>periodicidaddrvNumPagos</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>periodicidaddrvNumPagos</code> derived attribute.
     */
    public Long periodicidaddrvNumPagosDerivations() {

        periodicidaddrvNumPagos = null;

        periodicidaddrvNumPagosDerivationsConditional1();
        periodicidaddrvNumPagosDerivationsConditional2();
        periodicidaddrvNumPagosDerivationsConditional3();
        periodicidaddrvNumPagosDerivationsConditional4();
        periodicidaddrvNumPagosDerivationsConditional5();
        periodicidaddrvNumPagosDerivationsDefault();
        return periodicidaddrvNumPagos;
    }

    private void periodicidaddrvNumPagosDerivationsConditional1() {
        if (periodicidaddrvNumPagos != null) return;
        // CONDITION: Descripcion LIKE \"%BI%\"
        // EFFECT   : 6
        boolean periodicidaddrvNumPagosCond = Utilities.like(this.getPeriodicidadDescripcion(), "%BI%");
        if (periodicidaddrvNumPagosCond) {
            periodicidaddrvNumPagos = Long.valueOf(6);
        }
    }

    private void periodicidaddrvNumPagosDerivationsConditional2() {
        if (periodicidaddrvNumPagos != null) return;
        // CONDITION: Descripcion LIKE \"%MENSUAL%\"
        // EFFECT   : 12
        boolean periodicidaddrvNumPagosCond = Utilities.like(this.getPeriodicidadDescripcion(), "%MENSUAL%");
        if (periodicidaddrvNumPagosCond) {
            periodicidaddrvNumPagos = Long.valueOf(12);
        }
    }

    private void periodicidaddrvNumPagosDerivationsConditional3() {
        if (periodicidaddrvNumPagos != null) return;
        // CONDITION: Descripcion LIKE \"%CU%\"
        // EFFECT   : 3
        boolean periodicidaddrvNumPagosCond = Utilities.like(this.getPeriodicidadDescripcion(), "%CU%");
        if (periodicidaddrvNumPagosCond) {
            periodicidaddrvNumPagos = Long.valueOf(3);
        }
    }

    private void periodicidaddrvNumPagosDerivationsConditional4() {
        if (periodicidaddrvNumPagos != null) return;
        // CONDITION: Descripcion LIKE \"%TRI%\"
        // EFFECT   : 4
        boolean periodicidaddrvNumPagosCond = Utilities.like(this.getPeriodicidadDescripcion(), "%TRI%");
        if (periodicidaddrvNumPagosCond) {
            periodicidaddrvNumPagos = Long.valueOf(4);
        }
    }

    private void periodicidaddrvNumPagosDerivationsConditional5() {
        if (periodicidaddrvNumPagos != null) return;
        // CONDITION: Descripcion LIKE \"%SE%\"
        // EFFECT   : 2
        boolean periodicidaddrvNumPagosCond = Utilities.like(this.getPeriodicidadDescripcion(), "%SE%");
        if (periodicidaddrvNumPagosCond) {
            periodicidaddrvNumPagos = Long.valueOf(2);
        }
    }

    private void periodicidaddrvNumPagosDerivationsDefault() {
        if (periodicidaddrvNumPagos != null) return;
        // Default derivation
        // EFFECT   : 1
        periodicidaddrvNumPagos = Long.valueOf(1);
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        periodicidadDescripcion = "";
        periodicidadEsMensual = false;
        dominios = null;
        solicitudes = null;
        anexosMat = null;
        anexosNeo = null;
        contratosC = null;
        anexosC = null;
        solicitudesNovedad = null;
        solicitudesNovedadNueva = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public SolicitudJpaRepository getSolicitudRepository() {
        return Arc.container().select(SolicitudJpaRepository.class).get();
    }
    public AnexoMatJpaRepository getAnexoMatRepository() {
        return Arc.container().select(AnexoMatJpaRepository.class).get();
    }
    public AnexoNeoJpaRepository getAnexoNeoRepository() {
        return Arc.container().select(AnexoNeoJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Periodicidad.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PeriodicidadConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPeriodicidadDescripcion = false;
    	values.put("periodicidadDescripcion", getPeriodicidadDescripcion());
    	modifiedPeriodicidadEsMensual = false;
    	values.put("periodicidadEsMensual", getPeriodicidadEsMensual());
    	modifiedDominios = false;
    	modifiedSolicitudes = false;
    	modifiedAnexosMat = false;
    	modifiedAnexosNeo = false;
    	modifiedContratosC = false;
    	modifiedAnexosC = false;
    	modifiedSolicitudesNovedad = false;
    	modifiedSolicitudesNovedadNueva = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            periodicidaddrvNumPagos = null;
    }

    /**
     * Returns the <code>PeriodicidadOid</code> object that identifies this instance of <code>Periodicidad</code>.
     * @return <code>PeriodicidadOid </code> object that identifies this instance of <code>Periodicidad</code>
     */
	@Override
    public PeriodicidadOid getOid() {
        return new PeriodicidadOid(getPeriodicidadCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PeriodicidadConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PERIODICIDAD)) {
            // Add this class
            activeFacets.add(Constants.PERIODICIDAD);
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

    public String buildICPeriodicidad() {
        try {
            return getPeriodicidadDescripcion();
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
            relatedInstance = buildPeriodicidadRelatedInstance(relatedInstanceJsonOid);
        }
        if (PeriodicidadConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_ANEXOSMAT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4AnexoMat(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_ANEXOSNEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4AnexoNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_ANEXOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4AnexoC(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || PeriodicidadConstants.ROLE_NAME_SOLICITUDESNOVEDADNUEVA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPeriodicidadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4AnexoMat(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoMat(mapper.readValue(relatedInstanceJsonOid, AnexoMatOid.class)): AnexoMat.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4AnexoNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class)): AnexoNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4AnexoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoC(mapper.readValue(relatedInstanceJsonOid, AnexoCOid.class)): AnexoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }
}
