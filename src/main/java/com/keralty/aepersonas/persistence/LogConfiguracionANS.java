package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.ConfiguracionANSConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogConfiguracionANSConstants;
import com.keralty.aepersonas.persistence.oid.ConfiguracionANSOid;
import com.keralty.aepersonas.persistence.oid.LogConfiguracionANSOid;
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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>LogConfiguracionANS</code> model class.
 * <p>
 * Model Class: <code>LogConfiguracionANS</code><br>
 */
@Entity(name = LogConfiguracionANSConstants.CLASS_NAME)
@Table(name = LogConfiguracionANSConstants.TBL_NAME)
public class LogConfiguracionANS extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogConfiguracionANS_Sequence")
    @SequenceGenerator(name="LogConfiguracionANS_Sequence", sequenceName="LogConfiguracionANS_Sequence", allocationSize=1)
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSID )
    @JsonProperty(value="id")
    private Long logConfiguracionANSId;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logConfiguracionANSFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSFecha;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logConfiguracionANSLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSANSAFILIACIONES )
    @JsonProperty(value="ansafiliaciones")
    private Long logConfiguracionANSANSAfiliaciones;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSANSAfiliaciones;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSANSAREAMEDICA )
    @JsonProperty(value="ansareamedica")
    private Long logConfiguracionANSANSAreaMedica;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSANSAreaMedica;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSHABILLUNES )
    @JsonProperty(value="habillunes")
    private Boolean logConfiguracionANSHabilLunes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSHabilLunes;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSHABILMARTES )
    @JsonProperty(value="habilmartes")
    private Boolean logConfiguracionANSHabilMartes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSHabilMartes;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSHABILMIERCOLES )
    @JsonProperty(value="habilmiercoles")
    private Boolean logConfiguracionANSHabilMiercoles;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSHabilMiercoles;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSHABILJUEVES )
    @JsonProperty(value="habiljueves")
    private Boolean logConfiguracionANSHabilJueves;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSHabilJueves;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSHABILVIERNES )
    @JsonProperty(value="habilviernes")
    private Boolean logConfiguracionANSHabilViernes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSHabilViernes;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSHABILSABADO )
    @JsonProperty(value="habilsabado")
    private Boolean logConfiguracionANSHabilSabado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSHabilSabado;

    /** Class member attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_LOGCONFIGURACIONANSHABILDOMINGO )
    @JsonProperty(value="habildomingo")
    private Boolean logConfiguracionANSHabilDomingo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANSHabilDomingo;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogConfiguracionANSConstants.FLD_CONFIGURACIONANSCONFIGURACIONANSID, referencedColumnName=ConfiguracionANSConstants.FLD_CONFIGURACIONANSID)
    })
    @JsonIgnore
    private ConfiguracionANS configuracionANS;
    /** Related attribute. */
    @Column(name = LogConfiguracionANSConstants.FLD_CONFIGURACIONANSCONFIGURACIONANSID, insertable = false, updatable = false)
    private Long configuracionANSConfiguracionANSId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANS;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogConfiguracionANS() {
        logConfiguracionANSId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogConfiguracionANS</code>.
     * @param oid Object Identifier of the instance of <code>LogConfiguracionANS</code> to be created.
     * @throws SystemException
     */
    public LogConfiguracionANS(LogConfiguracionANSOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logConfiguracionANSId = oid.getLogConfiguracionANSId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logConfiguracionANSId</code> attribute<br>in class <code>LogConfiguracionANS</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogConfiguracionANS</code>
     * @return The value of the <code>logConfiguracionANSId</code> attribute<br>in class <code>LogConfiguracionANS</code>.
     */
    public Long getLogConfiguracionANSId() {
        return logConfiguracionANSId;
    }

    /**
     * Sets the value of the <code>logConfiguracionANSId</code> attribute<br>in class <code>LogConfiguracionANS</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogConfiguracionANS</code>
     * @param logConfiguracionANSId The new value of the <code>logConfiguracionANSId</code> attribute<br>in class <code>LogConfiguracionANS</code>.
     */
    public void setLogConfiguracionANSId(Long logConfiguracionANSId) {
        this.logConfiguracionANSId = logConfiguracionANSId;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSFecha</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSFecha</code> attribute.
    */

    public Timestamp getLogConfiguracionANSFecha()  {
    	Timestamp value;
        value =  logConfiguracionANSFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSFecha</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logConfiguracionANSFecha The new value of the <code>logConfiguracionANSFecha</code> attribute.
    */
    public void setLogConfiguracionANSFecha (Timestamp logConfiguracionANSFecha) {
        modifiedLogConfiguracionANSFecha = true;
        this.logConfiguracionANSFecha = logConfiguracionANSFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSFecha() {
        return modifiedLogConfiguracionANSFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSFecha</code>.
    */
    public void setModifiedLogConfiguracionANSFecha(boolean modified) {
        this.modifiedLogConfiguracionANSFecha = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSLoginFuncionario</code> attribute.
    */

    public String getLogConfiguracionANSLoginFuncionario()  {
    	String value;
        value =  logConfiguracionANSLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logConfiguracionANSLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logConfiguracionANSLoginFuncionario The new value of the <code>logConfiguracionANSLoginFuncionario</code> attribute.
    */
    public void setLogConfiguracionANSLoginFuncionario (String logConfiguracionANSLoginFuncionario) {
        modifiedLogConfiguracionANSLoginFuncionario = true;
        this.logConfiguracionANSLoginFuncionario = logConfiguracionANSLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSLoginFuncionario() {
        return modifiedLogConfiguracionANSLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSLoginFuncionario</code>.
    */
    public void setModifiedLogConfiguracionANSLoginFuncionario(boolean modified) {
        this.modifiedLogConfiguracionANSLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSANSAfiliaciones</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSANSAfiliaciones</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSANSAfiliaciones</code> attribute.
    */

    public Long getLogConfiguracionANSANSAfiliaciones()  {
    	Long value;
        value =  logConfiguracionANSANSAfiliaciones;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSANSAfiliaciones</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSANSAfiliaciones</code>. Constant Nat<br>
    * Comments: <br>
    * @param logConfiguracionANSANSAfiliaciones The new value of the <code>logConfiguracionANSANSAfiliaciones</code> attribute.
    */
    public void setLogConfiguracionANSANSAfiliaciones (Long logConfiguracionANSANSAfiliaciones) {
        modifiedLogConfiguracionANSANSAfiliaciones = true;
        this.logConfiguracionANSANSAfiliaciones = logConfiguracionANSANSAfiliaciones;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSANSAfiliaciones</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSANSAfiliaciones</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSANSAfiliaciones() {
        return modifiedLogConfiguracionANSANSAfiliaciones;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSANSAfiliaciones</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSANSAfiliaciones</code>.
    */
    public void setModifiedLogConfiguracionANSANSAfiliaciones(boolean modified) {
        this.modifiedLogConfiguracionANSANSAfiliaciones = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSANSAreaMedica</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSANSAreaMedica</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSANSAreaMedica</code> attribute.
    */

    public Long getLogConfiguracionANSANSAreaMedica()  {
    	Long value;
        value =  logConfiguracionANSANSAreaMedica;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSANSAreaMedica</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSANSAreaMedica</code>. Constant Nat<br>
    * Comments: <br>
    * @param logConfiguracionANSANSAreaMedica The new value of the <code>logConfiguracionANSANSAreaMedica</code> attribute.
    */
    public void setLogConfiguracionANSANSAreaMedica (Long logConfiguracionANSANSAreaMedica) {
        modifiedLogConfiguracionANSANSAreaMedica = true;
        this.logConfiguracionANSANSAreaMedica = logConfiguracionANSANSAreaMedica;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSANSAreaMedica</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSANSAreaMedica</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSANSAreaMedica() {
        return modifiedLogConfiguracionANSANSAreaMedica;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSANSAreaMedica</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSANSAreaMedica</code>.
    */
    public void setModifiedLogConfiguracionANSANSAreaMedica(boolean modified) {
        this.modifiedLogConfiguracionANSANSAreaMedica = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSHabilLunes</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilLunes</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSHabilLunes</code> attribute.
    */

    public Boolean getLogConfiguracionANSHabilLunes()  {
    	Boolean value;
        value =  logConfiguracionANSHabilLunes;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSHabilLunes</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilLunes</code>. Constant Bool<br>
    * Comments: <br>
    * @param logConfiguracionANSHabilLunes The new value of the <code>logConfiguracionANSHabilLunes</code> attribute.
    */
    public void setLogConfiguracionANSHabilLunes (Boolean logConfiguracionANSHabilLunes) {
        modifiedLogConfiguracionANSHabilLunes = true;
        this.logConfiguracionANSHabilLunes = logConfiguracionANSHabilLunes;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSHabilLunes</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSHabilLunes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSHabilLunes() {
        return modifiedLogConfiguracionANSHabilLunes;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSHabilLunes</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSHabilLunes</code>.
    */
    public void setModifiedLogConfiguracionANSHabilLunes(boolean modified) {
        this.modifiedLogConfiguracionANSHabilLunes = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSHabilMartes</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilMartes</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSHabilMartes</code> attribute.
    */

    public Boolean getLogConfiguracionANSHabilMartes()  {
    	Boolean value;
        value =  logConfiguracionANSHabilMartes;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSHabilMartes</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilMartes</code>. Constant Bool<br>
    * Comments: <br>
    * @param logConfiguracionANSHabilMartes The new value of the <code>logConfiguracionANSHabilMartes</code> attribute.
    */
    public void setLogConfiguracionANSHabilMartes (Boolean logConfiguracionANSHabilMartes) {
        modifiedLogConfiguracionANSHabilMartes = true;
        this.logConfiguracionANSHabilMartes = logConfiguracionANSHabilMartes;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSHabilMartes</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSHabilMartes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSHabilMartes() {
        return modifiedLogConfiguracionANSHabilMartes;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSHabilMartes</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSHabilMartes</code>.
    */
    public void setModifiedLogConfiguracionANSHabilMartes(boolean modified) {
        this.modifiedLogConfiguracionANSHabilMartes = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSHabilMiercoles</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilMiercoles</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSHabilMiercoles</code> attribute.
    */

    public Boolean getLogConfiguracionANSHabilMiercoles()  {
    	Boolean value;
        value =  logConfiguracionANSHabilMiercoles;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSHabilMiercoles</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilMiercoles</code>. Constant Bool<br>
    * Comments: <br>
    * @param logConfiguracionANSHabilMiercoles The new value of the <code>logConfiguracionANSHabilMiercoles</code> attribute.
    */
    public void setLogConfiguracionANSHabilMiercoles (Boolean logConfiguracionANSHabilMiercoles) {
        modifiedLogConfiguracionANSHabilMiercoles = true;
        this.logConfiguracionANSHabilMiercoles = logConfiguracionANSHabilMiercoles;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSHabilMiercoles</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSHabilMiercoles</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSHabilMiercoles() {
        return modifiedLogConfiguracionANSHabilMiercoles;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSHabilMiercoles</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSHabilMiercoles</code>.
    */
    public void setModifiedLogConfiguracionANSHabilMiercoles(boolean modified) {
        this.modifiedLogConfiguracionANSHabilMiercoles = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSHabilJueves</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilJueves</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSHabilJueves</code> attribute.
    */

    public Boolean getLogConfiguracionANSHabilJueves()  {
    	Boolean value;
        value =  logConfiguracionANSHabilJueves;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSHabilJueves</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilJueves</code>. Constant Bool<br>
    * Comments: <br>
    * @param logConfiguracionANSHabilJueves The new value of the <code>logConfiguracionANSHabilJueves</code> attribute.
    */
    public void setLogConfiguracionANSHabilJueves (Boolean logConfiguracionANSHabilJueves) {
        modifiedLogConfiguracionANSHabilJueves = true;
        this.logConfiguracionANSHabilJueves = logConfiguracionANSHabilJueves;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSHabilJueves</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSHabilJueves</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSHabilJueves() {
        return modifiedLogConfiguracionANSHabilJueves;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSHabilJueves</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSHabilJueves</code>.
    */
    public void setModifiedLogConfiguracionANSHabilJueves(boolean modified) {
        this.modifiedLogConfiguracionANSHabilJueves = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSHabilViernes</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilViernes</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSHabilViernes</code> attribute.
    */

    public Boolean getLogConfiguracionANSHabilViernes()  {
    	Boolean value;
        value =  logConfiguracionANSHabilViernes;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSHabilViernes</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilViernes</code>. Constant Bool<br>
    * Comments: <br>
    * @param logConfiguracionANSHabilViernes The new value of the <code>logConfiguracionANSHabilViernes</code> attribute.
    */
    public void setLogConfiguracionANSHabilViernes (Boolean logConfiguracionANSHabilViernes) {
        modifiedLogConfiguracionANSHabilViernes = true;
        this.logConfiguracionANSHabilViernes = logConfiguracionANSHabilViernes;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSHabilViernes</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSHabilViernes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSHabilViernes() {
        return modifiedLogConfiguracionANSHabilViernes;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSHabilViernes</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSHabilViernes</code>.
    */
    public void setModifiedLogConfiguracionANSHabilViernes(boolean modified) {
        this.modifiedLogConfiguracionANSHabilViernes = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSHabilSabado</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilSabado</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSHabilSabado</code> attribute.
    */

    public Boolean getLogConfiguracionANSHabilSabado()  {
    	Boolean value;
        value =  logConfiguracionANSHabilSabado;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSHabilSabado</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilSabado</code>. Constant Bool<br>
    * Comments: <br>
    * @param logConfiguracionANSHabilSabado The new value of the <code>logConfiguracionANSHabilSabado</code> attribute.
    */
    public void setLogConfiguracionANSHabilSabado (Boolean logConfiguracionANSHabilSabado) {
        modifiedLogConfiguracionANSHabilSabado = true;
        this.logConfiguracionANSHabilSabado = logConfiguracionANSHabilSabado;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSHabilSabado</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSHabilSabado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSHabilSabado() {
        return modifiedLogConfiguracionANSHabilSabado;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSHabilSabado</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSHabilSabado</code>.
    */
    public void setModifiedLogConfiguracionANSHabilSabado(boolean modified) {
        this.modifiedLogConfiguracionANSHabilSabado = modified;
    }

   /**
    * Returns the value of the <code>logConfiguracionANSHabilDomingo</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilDomingo</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logConfiguracionANSHabilDomingo</code> attribute.
    */

    public Boolean getLogConfiguracionANSHabilDomingo()  {
    	Boolean value;
        value =  logConfiguracionANSHabilDomingo;
        return value;
    }

   /**
    * Sets the value of the <code>logConfiguracionANSHabilDomingo</code> attribute.<br>
    * Model Attribute: <code>logConfiguracionANSHabilDomingo</code>. Constant Bool<br>
    * Comments: <br>
    * @param logConfiguracionANSHabilDomingo The new value of the <code>logConfiguracionANSHabilDomingo</code> attribute.
    */
    public void setLogConfiguracionANSHabilDomingo (Boolean logConfiguracionANSHabilDomingo) {
        modifiedLogConfiguracionANSHabilDomingo = true;
        this.logConfiguracionANSHabilDomingo = logConfiguracionANSHabilDomingo;
    }

   /**
    * Returns the value of the <code>modifiedLogConfiguracionANSHabilDomingo</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogConfiguracionANSHabilDomingo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogConfiguracionANSHabilDomingo() {
        return modifiedLogConfiguracionANSHabilDomingo;
    }

   /**
    * Sets the value of the <code>modifiedLogConfiguracionANSHabilDomingo</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogConfiguracionANSHabilDomingo</code>.
    */
    public void setModifiedLogConfiguracionANSHabilDomingo(boolean modified) {
        this.modifiedLogConfiguracionANSHabilDomingo = modified;
    }

    /**
     * Returns the instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionANS</code> role.
     * Model Relationship:
     * <code>[ConfiguracionANS] ConfiguracionANS 1:1  ------ 0:M  LogConfiguracionANS [LogConfiguracionANS]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionANS</code> role.
     */
    @JsonIgnore
    public ConfiguracionANS getConfiguracionANS() {
        return configuracionANS;
    }

    /**
     * Adds an instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionANS</code> role.
     * @param configuracionANS The instance to add to the <code>ConfiguracionANS</code> role.
     */
    public void add2ConfiguracionANS(ConfiguracionANS configuracionANS) {
        if (configuracionANS == null || configuracionANS.isNull()) {
            this.modifiedConfiguracionANS = true;
            this.configuracionANSConfiguracionANSId = null;
        } else {
            this.configuracionANSConfiguracionANSId = configuracionANS.getConfiguracionANSId();
        }
        this.configuracionANS = (configuracionANS == null  || configuracionANS.isNull() ? null : configuracionANS);
    }

   /**
    * This method gets the attribute value <code>modifiedConfiguracionANS</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedConfiguracionANS</code> has been modified.
    */
    public boolean isModifiedConfiguracionANS(){
        return modifiedConfiguracionANS;
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
        logConfiguracionANSFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logConfiguracionANSLoginFuncionario = "";
        logConfiguracionANSANSAfiliaciones = Long.valueOf(0);
        logConfiguracionANSANSAreaMedica = Long.valueOf(0);
        logConfiguracionANSHabilLunes = false;
        logConfiguracionANSHabilMartes = false;
        logConfiguracionANSHabilMiercoles = false;
        logConfiguracionANSHabilJueves = false;
        logConfiguracionANSHabilViernes = false;
        logConfiguracionANSHabilSabado = false;
        logConfiguracionANSHabilDomingo = false;
        configuracionANS = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogConfiguracionANS.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogConfiguracionANSConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogConfiguracionANSFecha = false;
    	values.put("logConfiguracionANSFecha", getLogConfiguracionANSFecha());
    	modifiedLogConfiguracionANSLoginFuncionario = false;
    	values.put("logConfiguracionANSLoginFuncionario", getLogConfiguracionANSLoginFuncionario());
    	modifiedLogConfiguracionANSANSAfiliaciones = false;
    	values.put("logConfiguracionANSANSAfiliaciones", getLogConfiguracionANSANSAfiliaciones());
    	modifiedLogConfiguracionANSANSAreaMedica = false;
    	values.put("logConfiguracionANSANSAreaMedica", getLogConfiguracionANSANSAreaMedica());
    	modifiedLogConfiguracionANSHabilLunes = false;
    	values.put("logConfiguracionANSHabilLunes", getLogConfiguracionANSHabilLunes());
    	modifiedLogConfiguracionANSHabilMartes = false;
    	values.put("logConfiguracionANSHabilMartes", getLogConfiguracionANSHabilMartes());
    	modifiedLogConfiguracionANSHabilMiercoles = false;
    	values.put("logConfiguracionANSHabilMiercoles", getLogConfiguracionANSHabilMiercoles());
    	modifiedLogConfiguracionANSHabilJueves = false;
    	values.put("logConfiguracionANSHabilJueves", getLogConfiguracionANSHabilJueves());
    	modifiedLogConfiguracionANSHabilViernes = false;
    	values.put("logConfiguracionANSHabilViernes", getLogConfiguracionANSHabilViernes());
    	modifiedLogConfiguracionANSHabilSabado = false;
    	values.put("logConfiguracionANSHabilSabado", getLogConfiguracionANSHabilSabado());
    	modifiedLogConfiguracionANSHabilDomingo = false;
    	values.put("logConfiguracionANSHabilDomingo", getLogConfiguracionANSHabilDomingo());
    	modifiedConfiguracionANS = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogConfiguracionANSOid</code> object that identifies this instance of <code>LogConfiguracionANS</code>.
     * @return <code>LogConfiguracionANSOid </code> object that identifies this instance of <code>LogConfiguracionANS</code>
     */
	@Override
    public LogConfiguracionANSOid getOid() {
        return new LogConfiguracionANSOid(getLogConfiguracionANSId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogConfiguracionANSConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogConfiguracionANSConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGCONFIGURACIONANS)) {
            // Add this class
            activeFacets.add(Constants.LOGCONFIGURACIONANS);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN)) {
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
            relatedInstance = buildLogConfiguracionANSRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogConfiguracionANSConstants.ROLE_NAME_CONFIGURACIONANS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogConfiguracionANSRelatedInstance4ConfiguracionANS(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogConfiguracionANSRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, LogConfiguracionANSOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogConfiguracionANS.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogConfiguracionANSRelatedInstance4ConfiguracionANS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, ConfiguracionANSOid.class)): ConfiguracionANS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogConfiguracionANS.class).error(e.getMessage());
            return null;
        }
    }
}
