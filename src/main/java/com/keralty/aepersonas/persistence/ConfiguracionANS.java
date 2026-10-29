package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.CausalConstants;
import com.keralty.aepersonas.global.ConfiguracionANSConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.NovedadConstants;
import com.keralty.aepersonas.persistence.oid.CausalOid;
import com.keralty.aepersonas.persistence.oid.ConfiguracionANSOid;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.LogConfiguracionANSOid;
import com.keralty.aepersonas.persistence.oid.NovedadOid;
import com.keralty.aepersonas.repository.ConfiguracionANSJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
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
 * Persistent representation of the <code>ConfiguracionANS</code> model class.
 * <p>
 * Model Class: <code>ConfiguracionANS</code><br>
 */
@Entity(name = ConfiguracionANSConstants.CLASS_NAME)
@Table(name = ConfiguracionANSConstants.TBL_NAME)
public class ConfiguracionANS extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient ConfiguracionANSJpaRepository configuracionANSRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ConfiguracionANS_Sequence")
    @SequenceGenerator(name="ConfiguracionANS_Sequence", sequenceName="ConfiguracionANS_Sequence", allocationSize=1)
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSID )
    @JsonProperty(value="id")
    private Long configuracionANSId;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSTRAMITE )
    @JsonProperty(value="tramite")
    private Long configuracionANSTramite;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSTramite;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSANSAFILIACIONES )
    @JsonProperty(value="ansafiliaciones")
    private Long configuracionANSANSAfiliaciones;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSANSAfiliaciones;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSANSAREAMEDICA )
    @JsonProperty(value="ansareamedica")
    private Long configuracionANSANSAreaMedica;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSANSAreaMedica;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSHABILLUNES )
    @JsonProperty(value="habillunes")
    private Boolean configuracionANSHabilLunes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSHabilLunes;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSHABILMARTES )
    @JsonProperty(value="habilmartes")
    private Boolean configuracionANSHabilMartes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSHabilMartes;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSHABILMIERCOLES )
    @JsonProperty(value="habilmiercoles")
    private Boolean configuracionANSHabilMiercoles;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSHabilMiercoles;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSHABILJUEVES )
    @JsonProperty(value="habiljueves")
    private Boolean configuracionANSHabilJueves;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSHabilJueves;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSHABILVIERNES )
    @JsonProperty(value="habilviernes")
    private Boolean configuracionANSHabilViernes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSHabilViernes;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSHABILSABADO )
    @JsonProperty(value="habilsabado")
    private Boolean configuracionANSHabilSabado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSHabilSabado;

    /** Class member attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CONFIGURACIONANSHABILDOMINGO )
    @JsonProperty(value="habildomingo")
    private Boolean configuracionANSHabilDomingo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionANSHabilDomingo;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienecausal")
    protected Boolean configuracionANSdrvTieneCausal;

    /** Related Class. */
    @OneToMany(mappedBy = ConfiguracionANSConstants.ROLE_INVNAME_LOGCONFIGURACIONANS)
    @JsonIgnore
    private Collection <LogConfiguracionANS> logConfiguracionANS;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogConfiguracionANS;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ConfiguracionANSConstants.FLD_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
    })
    @JsonIgnore
    private Dominio dominio;
    /** Related attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_DOMINIONUMERO, insertable = false, updatable = false)
    private Long dominioNumero;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominio;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ConfiguracionANSConstants.FLD_NOVEDADIDNOVEDAD, referencedColumnName=NovedadConstants.FLD_NOVEDADIDNOVEDAD)
    })
    @JsonIgnore
    private Novedad novedad;
    /** Related attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_NOVEDADIDNOVEDAD, insertable = false, updatable = false)
    private Long novedadidNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ConfiguracionANSConstants.FLD_CAUSALIDCAUSAL, referencedColumnName=CausalConstants.FLD_CAUSALIDCAUSAL)
    })
    @JsonIgnore
    private Causal causal;
    /** Related attribute. */
    @Column(name = ConfiguracionANSConstants.FLD_CAUSALIDCAUSAL, insertable = false, updatable = false)
    private Long causalidCausal;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCausal;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ConfiguracionANS() {
        configuracionANSId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ConfiguracionANS</code>.
     * @param oid Object Identifier of the instance of <code>ConfiguracionANS</code> to be created.
     * @throws SystemException
     */
    public ConfiguracionANS(ConfiguracionANSOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            configuracionANSId = oid.getConfiguracionANSId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>configuracionANSId</code> attribute<br>in class <code>ConfiguracionANS</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ConfiguracionANS</code>
     * @return The value of the <code>configuracionANSId</code> attribute<br>in class <code>ConfiguracionANS</code>.
     */
    public Long getConfiguracionANSId() {
        return configuracionANSId;
    }

    /**
     * Sets the value of the <code>configuracionANSId</code> attribute<br>in class <code>ConfiguracionANS</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ConfiguracionANS</code>
     * @param configuracionANSId The new value of the <code>configuracionANSId</code> attribute<br>in class <code>ConfiguracionANS</code>.
     */
    public void setConfiguracionANSId(Long configuracionANSId) {
        this.configuracionANSId = configuracionANSId;
    }

   /**
    * Returns the value of the <code>configuracionANSTramite</code> attribute.<br>
    * Model Attribute: <code>configuracionANSTramite</code>. Constant Nat<br>
    * Comments: Tipo de trámite (Nueva Afiliación, Inclusión o Novedad)<br>
    * @return The value of the <code>configuracionANSTramite</code> attribute.
    */

    public Long getConfiguracionANSTramite()  {
    	Long value;
        value =  configuracionANSTramite;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSTramite</code> attribute.<br>
    * Model Attribute: <code>configuracionANSTramite</code>. Constant Nat<br>
    * Comments: Tipo de trámite (Nueva Afiliación, Inclusión o Novedad)<br>
    * @param configuracionANSTramite The new value of the <code>configuracionANSTramite</code> attribute.
    */
    public void setConfiguracionANSTramite (Long configuracionANSTramite) {
        modifiedConfiguracionANSTramite = true;
        this.configuracionANSTramite = configuracionANSTramite;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSTramite</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSTramite</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSTramite() {
        return modifiedConfiguracionANSTramite;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSTramite</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSTramite</code>.
    */
    public void setModifiedConfiguracionANSTramite(boolean modified) {
        this.modifiedConfiguracionANSTramite = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSANSAfiliaciones</code> attribute.<br>
    * Model Attribute: <code>configuracionANSANSAfiliaciones</code>. Variable Nat<br>
    * Comments: ANS afiliaciones, expresado en días.<br>
    * @return The value of the <code>configuracionANSANSAfiliaciones</code> attribute.
    */

    public Long getConfiguracionANSANSAfiliaciones()  {
    	Long value;
        value =  configuracionANSANSAfiliaciones;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSANSAfiliaciones</code> attribute.<br>
    * Model Attribute: <code>configuracionANSANSAfiliaciones</code>. Variable Nat<br>
    * Comments: ANS afiliaciones, expresado en días.<br>
    * @param configuracionANSANSAfiliaciones The new value of the <code>configuracionANSANSAfiliaciones</code> attribute.
    */
    public void setConfiguracionANSANSAfiliaciones (Long configuracionANSANSAfiliaciones) {
        modifiedConfiguracionANSANSAfiliaciones = true;
        this.configuracionANSANSAfiliaciones = configuracionANSANSAfiliaciones;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSANSAfiliaciones</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSANSAfiliaciones</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSANSAfiliaciones() {
        return modifiedConfiguracionANSANSAfiliaciones;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSANSAfiliaciones</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSANSAfiliaciones</code>.
    */
    public void setModifiedConfiguracionANSANSAfiliaciones(boolean modified) {
        this.modifiedConfiguracionANSANSAfiliaciones = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSANSAreaMedica</code> attribute.<br>
    * Model Attribute: <code>configuracionANSANSAreaMedica</code>. Variable Nat<br>
    * Comments: ANS área médicas, expresado en días.<br>
    * @return The value of the <code>configuracionANSANSAreaMedica</code> attribute.
    */

    public Long getConfiguracionANSANSAreaMedica()  {
    	Long value;
        value =  configuracionANSANSAreaMedica;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSANSAreaMedica</code> attribute.<br>
    * Model Attribute: <code>configuracionANSANSAreaMedica</code>. Variable Nat<br>
    * Comments: ANS área médicas, expresado en días.<br>
    * @param configuracionANSANSAreaMedica The new value of the <code>configuracionANSANSAreaMedica</code> attribute.
    */
    public void setConfiguracionANSANSAreaMedica (Long configuracionANSANSAreaMedica) {
        modifiedConfiguracionANSANSAreaMedica = true;
        this.configuracionANSANSAreaMedica = configuracionANSANSAreaMedica;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSANSAreaMedica</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSANSAreaMedica</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSANSAreaMedica() {
        return modifiedConfiguracionANSANSAreaMedica;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSANSAreaMedica</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSANSAreaMedica</code>.
    */
    public void setModifiedConfiguracionANSANSAreaMedica(boolean modified) {
        this.modifiedConfiguracionANSANSAreaMedica = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSHabilLunes</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilLunes</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>configuracionANSHabilLunes</code> attribute.
    */

    public Boolean getConfiguracionANSHabilLunes()  {
    	Boolean value;
        value =  configuracionANSHabilLunes;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSHabilLunes</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilLunes</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param configuracionANSHabilLunes The new value of the <code>configuracionANSHabilLunes</code> attribute.
    */
    public void setConfiguracionANSHabilLunes (Boolean configuracionANSHabilLunes) {
        modifiedConfiguracionANSHabilLunes = true;
        this.configuracionANSHabilLunes = configuracionANSHabilLunes;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSHabilLunes</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSHabilLunes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSHabilLunes() {
        return modifiedConfiguracionANSHabilLunes;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSHabilLunes</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSHabilLunes</code>.
    */
    public void setModifiedConfiguracionANSHabilLunes(boolean modified) {
        this.modifiedConfiguracionANSHabilLunes = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSHabilMartes</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilMartes</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>configuracionANSHabilMartes</code> attribute.
    */

    public Boolean getConfiguracionANSHabilMartes()  {
    	Boolean value;
        value =  configuracionANSHabilMartes;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSHabilMartes</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilMartes</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param configuracionANSHabilMartes The new value of the <code>configuracionANSHabilMartes</code> attribute.
    */
    public void setConfiguracionANSHabilMartes (Boolean configuracionANSHabilMartes) {
        modifiedConfiguracionANSHabilMartes = true;
        this.configuracionANSHabilMartes = configuracionANSHabilMartes;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSHabilMartes</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSHabilMartes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSHabilMartes() {
        return modifiedConfiguracionANSHabilMartes;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSHabilMartes</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSHabilMartes</code>.
    */
    public void setModifiedConfiguracionANSHabilMartes(boolean modified) {
        this.modifiedConfiguracionANSHabilMartes = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSHabilMiercoles</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilMiercoles</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>configuracionANSHabilMiercoles</code> attribute.
    */

    public Boolean getConfiguracionANSHabilMiercoles()  {
    	Boolean value;
        value =  configuracionANSHabilMiercoles;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSHabilMiercoles</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilMiercoles</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param configuracionANSHabilMiercoles The new value of the <code>configuracionANSHabilMiercoles</code> attribute.
    */
    public void setConfiguracionANSHabilMiercoles (Boolean configuracionANSHabilMiercoles) {
        modifiedConfiguracionANSHabilMiercoles = true;
        this.configuracionANSHabilMiercoles = configuracionANSHabilMiercoles;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSHabilMiercoles</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSHabilMiercoles</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSHabilMiercoles() {
        return modifiedConfiguracionANSHabilMiercoles;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSHabilMiercoles</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSHabilMiercoles</code>.
    */
    public void setModifiedConfiguracionANSHabilMiercoles(boolean modified) {
        this.modifiedConfiguracionANSHabilMiercoles = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSHabilJueves</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilJueves</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>configuracionANSHabilJueves</code> attribute.
    */

    public Boolean getConfiguracionANSHabilJueves()  {
    	Boolean value;
        value =  configuracionANSHabilJueves;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSHabilJueves</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilJueves</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param configuracionANSHabilJueves The new value of the <code>configuracionANSHabilJueves</code> attribute.
    */
    public void setConfiguracionANSHabilJueves (Boolean configuracionANSHabilJueves) {
        modifiedConfiguracionANSHabilJueves = true;
        this.configuracionANSHabilJueves = configuracionANSHabilJueves;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSHabilJueves</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSHabilJueves</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSHabilJueves() {
        return modifiedConfiguracionANSHabilJueves;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSHabilJueves</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSHabilJueves</code>.
    */
    public void setModifiedConfiguracionANSHabilJueves(boolean modified) {
        this.modifiedConfiguracionANSHabilJueves = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSHabilViernes</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilViernes</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>configuracionANSHabilViernes</code> attribute.
    */

    public Boolean getConfiguracionANSHabilViernes()  {
    	Boolean value;
        value =  configuracionANSHabilViernes;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSHabilViernes</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilViernes</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param configuracionANSHabilViernes The new value of the <code>configuracionANSHabilViernes</code> attribute.
    */
    public void setConfiguracionANSHabilViernes (Boolean configuracionANSHabilViernes) {
        modifiedConfiguracionANSHabilViernes = true;
        this.configuracionANSHabilViernes = configuracionANSHabilViernes;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSHabilViernes</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSHabilViernes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSHabilViernes() {
        return modifiedConfiguracionANSHabilViernes;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSHabilViernes</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSHabilViernes</code>.
    */
    public void setModifiedConfiguracionANSHabilViernes(boolean modified) {
        this.modifiedConfiguracionANSHabilViernes = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSHabilSabado</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilSabado</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>configuracionANSHabilSabado</code> attribute.
    */

    public Boolean getConfiguracionANSHabilSabado()  {
    	Boolean value;
        value =  configuracionANSHabilSabado;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSHabilSabado</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilSabado</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param configuracionANSHabilSabado The new value of the <code>configuracionANSHabilSabado</code> attribute.
    */
    public void setConfiguracionANSHabilSabado (Boolean configuracionANSHabilSabado) {
        modifiedConfiguracionANSHabilSabado = true;
        this.configuracionANSHabilSabado = configuracionANSHabilSabado;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSHabilSabado</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSHabilSabado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSHabilSabado() {
        return modifiedConfiguracionANSHabilSabado;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSHabilSabado</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSHabilSabado</code>.
    */
    public void setModifiedConfiguracionANSHabilSabado(boolean modified) {
        this.modifiedConfiguracionANSHabilSabado = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSHabilDomingo</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilDomingo</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>configuracionANSHabilDomingo</code> attribute.
    */

    public Boolean getConfiguracionANSHabilDomingo()  {
    	Boolean value;
        value =  configuracionANSHabilDomingo;
        return value;
    }

   /**
    * Sets the value of the <code>configuracionANSHabilDomingo</code> attribute.<br>
    * Model Attribute: <code>configuracionANSHabilDomingo</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param configuracionANSHabilDomingo The new value of the <code>configuracionANSHabilDomingo</code> attribute.
    */
    public void setConfiguracionANSHabilDomingo (Boolean configuracionANSHabilDomingo) {
        modifiedConfiguracionANSHabilDomingo = true;
        this.configuracionANSHabilDomingo = configuracionANSHabilDomingo;
    }

   /**
    * Returns the value of the <code>modifiedConfiguracionANSHabilDomingo</code> class property.<br>
    *
    * @return The value of the <code>modifiedConfiguracionANSHabilDomingo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConfiguracionANSHabilDomingo() {
        return modifiedConfiguracionANSHabilDomingo;
    }

   /**
    * Sets the value of the <code>modifiedConfiguracionANSHabilDomingo</code> class property.<br>
    * @param modified The new value of the <code>modifiedConfiguracionANSHabilDomingo</code>.
    */
    public void setModifiedConfiguracionANSHabilDomingo(boolean modified) {
        this.modifiedConfiguracionANSHabilDomingo = modified;
    }

   /**
    * Returns the value of the <code>configuracionANSdrvTieneCausal</code> attribute.<br>
    * Model Attribute: <code>configuracionANSdrvTieneCausal</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>configuracionANSdrvTieneCausal</code> attribute.
    */

    @JsonIgnore
    public Boolean getConfiguracionANSdrvTieneCausal()  {
    	Boolean value;
        try {
            value = configuracionANSdrvTieneCausalDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: ConfiguracionANS, Attribute: configuracionANSdrvTieneCausal");
        }
        return value;
    }

    /**
     * Returns the instance of <code>LogConfiguracionANS</code> related through the <code>LogConfiguracionANS</code> role.
     * Model Relationship:
     * <code>[LogConfiguracionANS] LogConfiguracionANS 0:M  ------ 1:1  ConfiguracionANS [ConfiguracionANS]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogConfiguracionANS</code> related through the <code>LogConfiguracionANS</code> role.
     */
    @JsonIgnore
    public Collection <LogConfiguracionANS> getLogConfiguracionANS() {
        return logConfiguracionANS;
    }

    /**
     * Adds an instance of <code>LogConfiguracionANS</code> related through the <code>LogConfiguracionANS</code> role.
     * @param logConfiguracionANS The instance to add to the <code>LogConfiguracionANS</code> role.
     */
    public void add2LogConfiguracionANS(LogConfiguracionANS logConfiguracionANS) {
        this.logConfiguracionANS.add(logConfiguracionANS);
    }
    /**
     * Removes an instance of <code>LogConfiguracionANS</code> related through the <code>LogConfiguracionANS</code> role.
     * @param logConfiguracionANS The instance to be removed
     */
    public void removeFromLogConfiguracionANS(LogConfiguracionANS logConfiguracionANS) {
    	this.logConfiguracionANS.remove(logConfiguracionANS);
    }
    /**
     * Sets instances of <code>LogConfiguracionANS</code> related through the <code>LogConfiguracionANS</code> role.
     * @param logConfiguracionANS The new value for the <code>LogConfiguracionANS</code> role.
     */
    public void setLogConfiguracionANS(Collection < LogConfiguracionANS > logConfiguracionANS) {
        this.logConfiguracionANS = logConfiguracionANS;
    }

   /**
    * This method gets the attribute value <code>modifiedLogConfiguracionANS</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogConfiguracionANS</code> has been modified.
    */
    public boolean isModifiedLogConfiguracionANS(){
        return modifiedLogConfiguracionANS;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominio 1:1  ------ 0:M  ConfiguracionesANS [ConfiguracionANS]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * @param dominio The instance to add to the <code>Dominio</code> role.
     */
    public void add2Dominio(Dominio dominio) {
        if (dominio == null || dominio.isNull()) {
            this.modifiedDominio = true;
            this.dominioNumero = null;
        } else {
            this.dominioNumero = dominio.getDominioNumero();
        }
        this.dominio = (dominio == null  || dominio.isNull() ? null : dominio);
    }

   /**
    * This method gets the attribute value <code>modifiedDominio</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominio</code> has been modified.
    */
    public boolean isModifiedDominio(){
        return modifiedDominio;
    }

    /**
     * Returns the instance of <code>Novedad</code> related through the <code>Novedad</code> role.
     * Model Relationship:
     * <code>[Novedad] Novedad 0:1  ------ 0:M  ConfiguracionesANS [ConfiguracionANS]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Novedad</code> related through the <code>Novedad</code> role.
     */
    @JsonIgnore
    public Novedad getNovedad() {
        return novedad;
    }

    /**
     * Adds an instance of <code>Novedad</code> related through the <code>Novedad</code> role.
     * @param novedad The instance to add to the <code>Novedad</code> role.
     */
    public void add2Novedad(Novedad novedad) {
        if (novedad == null || novedad.isNull()) {
            this.modifiedNovedad = true;
            this.novedadidNovedad = null;
        } else {
            this.novedadidNovedad = novedad.getNovedadidNovedad();
        }
        this.novedad = (novedad == null  || novedad.isNull() ? null : novedad);
    }

   /**
    * This method gets the attribute value <code>modifiedNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedad</code> has been modified.
    */
    public boolean isModifiedNovedad(){
        return modifiedNovedad;
    }

    /**
     * Returns the instance of <code>Causal</code> related through the <code>Causal</code> role.
     * Model Relationship:
     * <code>[Causal] Causal 0:1  ------ 0:M  ConfiguracionesANS [ConfiguracionANS]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Causal</code> related through the <code>Causal</code> role.
     */
    @JsonIgnore
    public Causal getCausal() {
        return causal;
    }

    /**
     * Adds an instance of <code>Causal</code> related through the <code>Causal</code> role.
     * @param causal The instance to add to the <code>Causal</code> role.
     */
    public void add2Causal(Causal causal) {
        if (causal == null || causal.isNull()) {
            this.modifiedCausal = true;
            this.causalidCausal = null;
        } else {
            this.causalidCausal = causal.getCausalidCausal();
        }
        this.causal = (causal == null  || causal.isNull() ? null : causal);
    }

   /**
    * This method gets the attribute value <code>modifiedCausal</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedCausal</code> has been modified.
    */
    public boolean isModifiedCausal(){
        return modifiedCausal;
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
     * Computes the value of the <code>configuracionANSdrvTieneCausal</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>configuracionANSdrvTieneCausal</code> derived attribute.
     */
    public Boolean configuracionANSdrvTieneCausalDerivations() throws SystemException {

        configuracionANSdrvTieneCausal = null;

        configuracionANSdrvTieneCausalDerivationsDefault();
        return configuracionANSdrvTieneCausal;
    }

    private void configuracionANSdrvTieneCausalDerivationsDefault() throws SystemException {
        if (configuracionANSdrvTieneCausal != null) return;
        // Default derivation
        // EFFECT   : EXIST(Causal)
        configuracionANSdrvTieneCausal = getConfiguracionANSRepository().assocOperator000(this);
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        configuracionANSTramite = Long.valueOf(0);
        configuracionANSANSAfiliaciones = Long.valueOf(0);
        configuracionANSANSAreaMedica = Long.valueOf(0);
        configuracionANSHabilLunes = false;
        configuracionANSHabilMartes = false;
        configuracionANSHabilMiercoles = false;
        configuracionANSHabilJueves = false;
        configuracionANSHabilViernes = false;
        configuracionANSHabilSabado = false;
        configuracionANSHabilDomingo = false;
        logConfiguracionANS = null;
        dominio = null;
        novedad = null;
        causal = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    public ConfiguracionANSJpaRepository getConfiguracionANSRepository() {
        return Arc.container().select(ConfiguracionANSJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return ConfiguracionANS.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ConfiguracionANSConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedConfiguracionANSTramite = false;
    	values.put("configuracionANSTramite", getConfiguracionANSTramite());
    	modifiedConfiguracionANSANSAfiliaciones = false;
    	values.put("configuracionANSANSAfiliaciones", getConfiguracionANSANSAfiliaciones());
    	modifiedConfiguracionANSANSAreaMedica = false;
    	values.put("configuracionANSANSAreaMedica", getConfiguracionANSANSAreaMedica());
    	modifiedConfiguracionANSHabilLunes = false;
    	values.put("configuracionANSHabilLunes", getConfiguracionANSHabilLunes());
    	modifiedConfiguracionANSHabilMartes = false;
    	values.put("configuracionANSHabilMartes", getConfiguracionANSHabilMartes());
    	modifiedConfiguracionANSHabilMiercoles = false;
    	values.put("configuracionANSHabilMiercoles", getConfiguracionANSHabilMiercoles());
    	modifiedConfiguracionANSHabilJueves = false;
    	values.put("configuracionANSHabilJueves", getConfiguracionANSHabilJueves());
    	modifiedConfiguracionANSHabilViernes = false;
    	values.put("configuracionANSHabilViernes", getConfiguracionANSHabilViernes());
    	modifiedConfiguracionANSHabilSabado = false;
    	values.put("configuracionANSHabilSabado", getConfiguracionANSHabilSabado());
    	modifiedConfiguracionANSHabilDomingo = false;
    	values.put("configuracionANSHabilDomingo", getConfiguracionANSHabilDomingo());
    	modifiedLogConfiguracionANS = false;
    	modifiedDominio = false;
    	modifiedNovedad = false;
    	modifiedCausal = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            configuracionANSdrvTieneCausal = null;
    }

    /**
     * Returns the <code>ConfiguracionANSOid</code> object that identifies this instance of <code>ConfiguracionANS</code>.
     * @return <code>ConfiguracionANSOid </code> object that identifies this instance of <code>ConfiguracionANS</code>
     */
	@Override
    public ConfiguracionANSOid getOid() {
        return new ConfiguracionANSOid(getConfiguracionANSId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ConfiguracionANSConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ConfiguracionANSConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CONFIGURACIONANS)) {
            // Add this class
            activeFacets.add(Constants.CONFIGURACIONANS);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.GESTOR)) {
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
            relatedInstance = buildConfiguracionANSRelatedInstance(relatedInstanceJsonOid);
        }
        if (ConfiguracionANSConstants.ROLE_NAME_LOGCONFIGURACIONANS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConfiguracionANSRelatedInstance4LogConfiguracionANS(relatedInstanceJsonOid, remainingPath);
        }
        if (ConfiguracionANSConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConfiguracionANSRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (ConfiguracionANSConstants.ROLE_NAME_NOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConfiguracionANSRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        if (ConfiguracionANSConstants.ROLE_NAME_CAUSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConfiguracionANSRelatedInstance4Causal(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildConfiguracionANSRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, ConfiguracionANSOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConfiguracionANSRelatedInstance4LogConfiguracionANS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, LogConfiguracionANSOid.class)): LogConfiguracionANS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConfiguracionANSRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConfiguracionANSRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConfiguracionANSRelatedInstance4Causal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Causal(mapper.readValue(relatedInstanceJsonOid, CausalOid.class)): Causal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
