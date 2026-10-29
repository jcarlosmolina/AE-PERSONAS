package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AnexoCConstants;
import com.keralty.aepersonas.global.BeneficiarioCConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.persistence.oid.AnexoCOid;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
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
 * Persistent representation of the <code>AnexoC</code> model class.
 * <p>
 * Model Class: <code>AnexoC</code><br>
 */
@Entity(name = AnexoCConstants.CLASS_NAME)
@Table(name = AnexoCConstants.TBL_NAME)
public class AnexoC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AnexoC_Sequence")
    @SequenceGenerator(name="AnexoC_Sequence", sequenceName="AnexoC_Sequence", allocationSize=1)
    @Column(name = AnexoCConstants.FLD_ANEXOCIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long anexoCIdentificador;

    /** Class member attribute. */
    @Column(name = AnexoCConstants.FLD_ANEXOCCODIGOPLANANEXO )
    @JsonProperty(value="codigoplananexo")
    private String anexoCCodigoPlanAnexo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoCCodigoPlanAnexo;

    /** Class member attribute. */
    @Column(name = AnexoCConstants.FLD_ANEXOCCODIGOTARIFA )
    @JsonProperty(value="codigotarifa")
    private String anexoCCodigoTarifa;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoCCodigoTarifa;

    /** Class member attribute. */
    @Column(name = AnexoCConstants.FLD_ANEXOCFECHAINICIOVIGENCIA )
    @JsonProperty(value="fechainiciovigencia")
    private Date anexoCFechaInicioVigencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoCFechaInicioVigencia;

    /** Class member attribute. */
    @Column(name = AnexoCConstants.FLD_ANEXOCFECHAULTIMAREGLA )
    @JsonProperty(value="fechaultimaregla")
    private Date anexoCFechaUltimaRegla;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoCFechaUltimaRegla;

    /** Class member attribute. */
    @Column(name = AnexoCConstants.FLD_ANEXOCNUMCUOTASPAGO )
    @JsonProperty(value="numcuotaspago")
    private Long anexoCNumCuotasPago;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoCNumCuotasPago;

    /** Class member attribute. */
    @Column(name = AnexoCConstants.FLD_ANEXOCNUMIDENTIFICACION )
    @JsonProperty(value="numidentificacion")
    private String anexoCNumIdentificacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoCNumIdentificacion;

    /** Class member attribute. */
    @Column(name = AnexoCConstants.FLD_ANEXOCCODSUCURSAL )
    @JsonProperty(value="codsucursal")
    private String anexoCCodSucursal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoCCodSucursal;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AnexoCConstants.FLD_CONTRATOCID, referencedColumnName=BeneficiarioCConstants.FLD_CONTRATOCCONTRATOCID), 
        @JoinColumn(name=AnexoCConstants.FLD_BENEFICIARIOCBENEFICIARIOCID, referencedColumnName=BeneficiarioCConstants.FLD_BENEFICIARIOCID)
    })
    @JsonIgnore
    private BeneficiarioC beneficiarioC;
    /** Related attribute. */
    @Column(name = AnexoCConstants.FLD_CONTRATOCID, insertable = false, updatable = false)
    private Long contratoCID;
    /** Related attribute. */
    @Column(name = AnexoCConstants.FLD_BENEFICIARIOCBENEFICIARIOCID, insertable = false, updatable = false)
    private Long beneficiarioCBeneficiarioCID;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedBeneficiarioC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AnexoCConstants.FLD_PERIODICIDADCODIGO, referencedColumnName=PeriodicidadConstants.FLD_PERIODICIDADCODIGO)
    })
    @JsonIgnore
    private Periodicidad periodicidadC;
    /** Related attribute. */
    @Column(name = AnexoCConstants.FLD_PERIODICIDADCODIGO, insertable = false, updatable = false)
    private Long periodicidadCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPeriodicidadC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AnexoCConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacionC;
    /** Related attribute. */
    @Column(name = AnexoCConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionTipoIdentificacionCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public AnexoC() {
        anexoCIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>AnexoC</code>.
     * @param oid Object Identifier of the instance of <code>AnexoC</code> to be created.
     * @throws SystemException
     */
    public AnexoC(AnexoCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            anexoCIdentificador = oid.getAnexoCIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>anexoCIdentificador</code> attribute<br>in class <code>AnexoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>AnexoC</code>
     * @return The value of the <code>anexoCIdentificador</code> attribute<br>in class <code>AnexoC</code>.
     */
    public Long getAnexoCIdentificador() {
        return anexoCIdentificador;
    }

    /**
     * Sets the value of the <code>anexoCIdentificador</code> attribute<br>in class <code>AnexoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>AnexoC</code>
     * @param anexoCIdentificador The new value of the <code>anexoCIdentificador</code> attribute<br>in class <code>AnexoC</code>.
     */
    public void setAnexoCIdentificador(Long anexoCIdentificador) {
        this.anexoCIdentificador = anexoCIdentificador;
    }

   /**
    * Returns the value of the <code>anexoCCodigoPlanAnexo</code> attribute.<br>
    * Model Attribute: <code>anexoCCodigoPlanAnexo</code>. Constant String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>anexoCCodigoPlanAnexo</code> attribute.
    */

    public String getAnexoCCodigoPlanAnexo()  {
    	String value;
        value =  anexoCCodigoPlanAnexo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>anexoCCodigoPlanAnexo</code> attribute.<br>
    * Model Attribute: <code>anexoCCodigoPlanAnexo</code>. Constant String Size=10<br>
    * Comments: <br>
    * @param anexoCCodigoPlanAnexo The new value of the <code>anexoCCodigoPlanAnexo</code> attribute.
    */
    public void setAnexoCCodigoPlanAnexo (String anexoCCodigoPlanAnexo) {
        modifiedAnexoCCodigoPlanAnexo = true;
        this.anexoCCodigoPlanAnexo = anexoCCodigoPlanAnexo;
    }

   /**
    * Returns the value of the <code>modifiedAnexoCCodigoPlanAnexo</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoCCodigoPlanAnexo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoCCodigoPlanAnexo() {
        return modifiedAnexoCCodigoPlanAnexo;
    }

   /**
    * Sets the value of the <code>modifiedAnexoCCodigoPlanAnexo</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoCCodigoPlanAnexo</code>.
    */
    public void setModifiedAnexoCCodigoPlanAnexo(boolean modified) {
        this.modifiedAnexoCCodigoPlanAnexo = modified;
    }

   /**
    * Returns the value of the <code>anexoCCodigoTarifa</code> attribute.<br>
    * Model Attribute: <code>anexoCCodigoTarifa</code>. Constant String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>anexoCCodigoTarifa</code> attribute.
    */

    public String getAnexoCCodigoTarifa()  {
    	String value;
        value =  anexoCCodigoTarifa;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>anexoCCodigoTarifa</code> attribute.<br>
    * Model Attribute: <code>anexoCCodigoTarifa</code>. Constant String Size=10<br>
    * Comments: <br>
    * @param anexoCCodigoTarifa The new value of the <code>anexoCCodigoTarifa</code> attribute.
    */
    public void setAnexoCCodigoTarifa (String anexoCCodigoTarifa) {
        modifiedAnexoCCodigoTarifa = true;
        this.anexoCCodigoTarifa = anexoCCodigoTarifa;
    }

   /**
    * Returns the value of the <code>modifiedAnexoCCodigoTarifa</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoCCodigoTarifa</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoCCodigoTarifa() {
        return modifiedAnexoCCodigoTarifa;
    }

   /**
    * Sets the value of the <code>modifiedAnexoCCodigoTarifa</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoCCodigoTarifa</code>.
    */
    public void setModifiedAnexoCCodigoTarifa(boolean modified) {
        this.modifiedAnexoCCodigoTarifa = modified;
    }

   /**
    * Returns the value of the <code>anexoCFechaInicioVigencia</code> attribute.<br>
    * Model Attribute: <code>anexoCFechaInicioVigencia</code>. Constant Date<br>
    * Comments: <br>
    * @return The value of the <code>anexoCFechaInicioVigencia</code> attribute.
    */

    public Date getAnexoCFechaInicioVigencia()  {
    	Date value;
        value =  anexoCFechaInicioVigencia;
        return value;
    }

   /**
    * Sets the value of the <code>anexoCFechaInicioVigencia</code> attribute.<br>
    * Model Attribute: <code>anexoCFechaInicioVigencia</code>. Constant Date<br>
    * Comments: <br>
    * @param anexoCFechaInicioVigencia The new value of the <code>anexoCFechaInicioVigencia</code> attribute.
    */
    public void setAnexoCFechaInicioVigencia (Date anexoCFechaInicioVigencia) {
        modifiedAnexoCFechaInicioVigencia = true;
        this.anexoCFechaInicioVigencia = anexoCFechaInicioVigencia;
    }

   /**
    * Returns the value of the <code>modifiedAnexoCFechaInicioVigencia</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoCFechaInicioVigencia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoCFechaInicioVigencia() {
        return modifiedAnexoCFechaInicioVigencia;
    }

   /**
    * Sets the value of the <code>modifiedAnexoCFechaInicioVigencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoCFechaInicioVigencia</code>.
    */
    public void setModifiedAnexoCFechaInicioVigencia(boolean modified) {
        this.modifiedAnexoCFechaInicioVigencia = modified;
    }

   /**
    * Returns the value of the <code>anexoCFechaUltimaRegla</code> attribute.<br>
    * Model Attribute: <code>anexoCFechaUltimaRegla</code>. Constant Date<br>
    * Comments: <br>
    * @return The value of the <code>anexoCFechaUltimaRegla</code> attribute.
    */

    public Date getAnexoCFechaUltimaRegla()  {
    	Date value;
        value =  anexoCFechaUltimaRegla;
        return value;
    }

   /**
    * Sets the value of the <code>anexoCFechaUltimaRegla</code> attribute.<br>
    * Model Attribute: <code>anexoCFechaUltimaRegla</code>. Constant Date<br>
    * Comments: <br>
    * @param anexoCFechaUltimaRegla The new value of the <code>anexoCFechaUltimaRegla</code> attribute.
    */
    public void setAnexoCFechaUltimaRegla (Date anexoCFechaUltimaRegla) {
        modifiedAnexoCFechaUltimaRegla = true;
        this.anexoCFechaUltimaRegla = anexoCFechaUltimaRegla;
    }

   /**
    * Returns the value of the <code>modifiedAnexoCFechaUltimaRegla</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoCFechaUltimaRegla</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoCFechaUltimaRegla() {
        return modifiedAnexoCFechaUltimaRegla;
    }

   /**
    * Sets the value of the <code>modifiedAnexoCFechaUltimaRegla</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoCFechaUltimaRegla</code>.
    */
    public void setModifiedAnexoCFechaUltimaRegla(boolean modified) {
        this.modifiedAnexoCFechaUltimaRegla = modified;
    }

   /**
    * Returns the value of the <code>anexoCNumCuotasPago</code> attribute.<br>
    * Model Attribute: <code>anexoCNumCuotasPago</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>anexoCNumCuotasPago</code> attribute.
    */

    public Long getAnexoCNumCuotasPago()  {
    	Long value;
        value =  anexoCNumCuotasPago;
        return value;
    }

   /**
    * Sets the value of the <code>anexoCNumCuotasPago</code> attribute.<br>
    * Model Attribute: <code>anexoCNumCuotasPago</code>. Constant Nat<br>
    * Comments: <br>
    * @param anexoCNumCuotasPago The new value of the <code>anexoCNumCuotasPago</code> attribute.
    */
    public void setAnexoCNumCuotasPago (Long anexoCNumCuotasPago) {
        modifiedAnexoCNumCuotasPago = true;
        this.anexoCNumCuotasPago = anexoCNumCuotasPago;
    }

   /**
    * Returns the value of the <code>modifiedAnexoCNumCuotasPago</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoCNumCuotasPago</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoCNumCuotasPago() {
        return modifiedAnexoCNumCuotasPago;
    }

   /**
    * Sets the value of the <code>modifiedAnexoCNumCuotasPago</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoCNumCuotasPago</code>.
    */
    public void setModifiedAnexoCNumCuotasPago(boolean modified) {
        this.modifiedAnexoCNumCuotasPago = modified;
    }

   /**
    * Returns the value of the <code>anexoCNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>anexoCNumIdentificacion</code>. Constant String Size=60<br>
    * Comments: Los datos que van a  viajar hacia el core en la sección anexos del beneficiario son: tipo de identificación, número de identificación, código de la sucursal y código de tarifa asociada. 
<br>
    * @return The value of the <code>anexoCNumIdentificacion</code> attribute.
    */

    public String getAnexoCNumIdentificacion()  {
    	String value;
        value =  anexoCNumIdentificacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>anexoCNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>anexoCNumIdentificacion</code>. Constant String Size=60<br>
    * Comments: Los datos que van a  viajar hacia el core en la sección anexos del beneficiario son: tipo de identificación, número de identificación, código de la sucursal y código de tarifa asociada. 
<br>
    * @param anexoCNumIdentificacion The new value of the <code>anexoCNumIdentificacion</code> attribute.
    */
    public void setAnexoCNumIdentificacion (String anexoCNumIdentificacion) {
        modifiedAnexoCNumIdentificacion = true;
        this.anexoCNumIdentificacion = anexoCNumIdentificacion;
    }

   /**
    * Returns the value of the <code>modifiedAnexoCNumIdentificacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoCNumIdentificacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoCNumIdentificacion() {
        return modifiedAnexoCNumIdentificacion;
    }

   /**
    * Sets the value of the <code>modifiedAnexoCNumIdentificacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoCNumIdentificacion</code>.
    */
    public void setModifiedAnexoCNumIdentificacion(boolean modified) {
        this.modifiedAnexoCNumIdentificacion = modified;
    }

   /**
    * Returns the value of the <code>anexoCCodSucursal</code> attribute.<br>
    * Model Attribute: <code>anexoCCodSucursal</code>. Constant String Size=20<br>
    * Comments: Los datos que van a  viajar hacia el core en la sección anexos del beneficiario son: tipo de identificación, número de identificación, código de la sucursal y código de tarifa asociada. 
<br>
    * @return The value of the <code>anexoCCodSucursal</code> attribute.
    */

    public String getAnexoCCodSucursal()  {
    	String value;
        value =  anexoCCodSucursal;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>anexoCCodSucursal</code> attribute.<br>
    * Model Attribute: <code>anexoCCodSucursal</code>. Constant String Size=20<br>
    * Comments: Los datos que van a  viajar hacia el core en la sección anexos del beneficiario son: tipo de identificación, número de identificación, código de la sucursal y código de tarifa asociada. 
<br>
    * @param anexoCCodSucursal The new value of the <code>anexoCCodSucursal</code> attribute.
    */
    public void setAnexoCCodSucursal (String anexoCCodSucursal) {
        modifiedAnexoCCodSucursal = true;
        this.anexoCCodSucursal = anexoCCodSucursal;
    }

   /**
    * Returns the value of the <code>modifiedAnexoCCodSucursal</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoCCodSucursal</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoCCodSucursal() {
        return modifiedAnexoCCodSucursal;
    }

   /**
    * Sets the value of the <code>modifiedAnexoCCodSucursal</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoCCodSucursal</code>.
    */
    public void setModifiedAnexoCCodSucursal(boolean modified) {
        this.modifiedAnexoCCodSucursal = modified;
    }

    /**
     * Returns the instance of <code>BeneficiarioC</code> related through the <code>BeneficiarioC</code> role.
     * Model Relationship:
     * <code>[BeneficiarioC] BeneficiarioC 1:1  ------ 0:M  AnexosC [AnexoC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>BeneficiarioC</code> related through the <code>BeneficiarioC</code> role.
     */
    @JsonIgnore
    public BeneficiarioC getBeneficiarioC() {
        return beneficiarioC;
    }

    /**
     * Adds an instance of <code>BeneficiarioC</code> related through the <code>BeneficiarioC</code> role.
     * @param beneficiarioC The instance to add to the <code>BeneficiarioC</code> role.
     */
    public void add2BeneficiarioC(BeneficiarioC beneficiarioC) {
        if (beneficiarioC == null || beneficiarioC.isNull()) {
            this.modifiedBeneficiarioC = true;
            this.contratoCID = null;
            this.beneficiarioCBeneficiarioCID = null;
        } else {
            this.contratoCID = beneficiarioC.getContratoCContratoCID();
            this.beneficiarioCBeneficiarioCID = beneficiarioC.getBeneficiarioCID();
        }
        this.beneficiarioC = (beneficiarioC == null  || beneficiarioC.isNull() ? null : beneficiarioC);
    }

   /**
    * This method gets the attribute value <code>modifiedBeneficiarioC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedBeneficiarioC</code> has been modified.
    */
    public boolean isModifiedBeneficiarioC(){
        return modifiedBeneficiarioC;
    }

    /**
     * Returns the instance of <code>Periodicidad</code> related through the <code>PeriodicidadC</code> role.
     * Model Relationship:
     * <code>[Periodicidad] PeriodicidadC 0:1  ------ 0:M  AnexosC [AnexoC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Periodicidad</code> related through the <code>PeriodicidadC</code> role.
     */
    @JsonIgnore
    public Periodicidad getPeriodicidadC() {
        return periodicidadC;
    }

    /**
     * Adds an instance of <code>Periodicidad</code> related through the <code>PeriodicidadC</code> role.
     * @param periodicidadC The instance to add to the <code>PeriodicidadC</code> role.
     */
    public void add2PeriodicidadC(Periodicidad periodicidadC) {
        if (periodicidadC == null || periodicidadC.isNull()) {
            this.modifiedPeriodicidadC = true;
            this.periodicidadCodigo = null;
        } else {
            this.periodicidadCodigo = periodicidadC.getPeriodicidadCodigo();
        }
        this.periodicidadC = (periodicidadC == null  || periodicidadC.isNull() ? null : periodicidadC);
    }

   /**
    * This method gets the attribute value <code>modifiedPeriodicidadC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPeriodicidadC</code> has been modified.
    */
    public boolean isModifiedPeriodicidadC(){
        return modifiedPeriodicidadC;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacionC</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacionC 0:1  ------ 0:M  AnexosC [AnexoC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacionC</code> role.
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacionC() {
        return tipoIdentificacionC;
    }

    /**
     * Adds an instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacionC</code> role.
     * @param tipoIdentificacionC The instance to add to the <code>TipoIdentificacionC</code> role.
     */
    public void add2TipoIdentificacionC(TipoIdentificacion tipoIdentificacionC) {
        if (tipoIdentificacionC == null || tipoIdentificacionC.isNull()) {
            this.modifiedTipoIdentificacionC = true;
            this.tipoIdentificacionTipoIdentificacionCCodigo = null;
        } else {
            this.tipoIdentificacionTipoIdentificacionCCodigo = tipoIdentificacionC.getTipoIdentificacionCodigo();
        }
        this.tipoIdentificacionC = (tipoIdentificacionC == null  || tipoIdentificacionC.isNull() ? null : tipoIdentificacionC);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoIdentificacionC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoIdentificacionC</code> has been modified.
    */
    public boolean isModifiedTipoIdentificacionC(){
        return modifiedTipoIdentificacionC;
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
        anexoCCodigoPlanAnexo = null;
        anexoCCodigoTarifa = null;
        anexoCFechaInicioVigencia = null;
        anexoCFechaUltimaRegla = null;
        anexoCNumCuotasPago = null;
        anexoCNumIdentificacion = null;
        anexoCCodSucursal = null;
        beneficiarioC = null;
        periodicidadC = null;
        tipoIdentificacionC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return AnexoC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return AnexoCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedAnexoCCodigoPlanAnexo = false;
    	values.put("anexoCCodigoPlanAnexo", getAnexoCCodigoPlanAnexo());
    	modifiedAnexoCCodigoTarifa = false;
    	values.put("anexoCCodigoTarifa", getAnexoCCodigoTarifa());
    	modifiedAnexoCFechaInicioVigencia = false;
    	values.put("anexoCFechaInicioVigencia", getAnexoCFechaInicioVigencia());
    	modifiedAnexoCFechaUltimaRegla = false;
    	values.put("anexoCFechaUltimaRegla", getAnexoCFechaUltimaRegla());
    	modifiedAnexoCNumCuotasPago = false;
    	values.put("anexoCNumCuotasPago", getAnexoCNumCuotasPago());
    	modifiedAnexoCNumIdentificacion = false;
    	values.put("anexoCNumIdentificacion", getAnexoCNumIdentificacion());
    	modifiedAnexoCCodSucursal = false;
    	values.put("anexoCCodSucursal", getAnexoCCodSucursal());
    	modifiedBeneficiarioC = false;
    	modifiedPeriodicidadC = false;
    	modifiedTipoIdentificacionC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>AnexoCOid</code> object that identifies this instance of <code>AnexoC</code>.
     * @return <code>AnexoCOid </code> object that identifies this instance of <code>AnexoC</code>
     */
	@Override
    public AnexoCOid getOid() {
        return new AnexoCOid(getAnexoCIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(AnexoCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(AnexoCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.ANEXOC)) {
            // Add this class
            activeFacets.add(Constants.ANEXOC);
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
            relatedInstance = buildAnexoCRelatedInstance(relatedInstanceJsonOid);
        }
        if (AnexoCConstants.ROLE_NAME_BENEFICIARIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoCRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoCConstants.ROLE_NAME_PERIODICIDADC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoCRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoCConstants.ROLE_NAME_TIPOIDENTIFICACIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoCRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAnexoCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new AnexoC(mapper.readValue(relatedInstanceJsonOid, AnexoCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAnexoCRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAnexoCRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAnexoCRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
