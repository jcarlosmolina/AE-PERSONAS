package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.NovedadConstants;
import com.keralty.aepersonas.global.TipoNovedadConstants;
import com.keralty.aepersonas.persistence.oid.CausaExclusionOid;
import com.keralty.aepersonas.persistence.oid.CausalOid;
import com.keralty.aepersonas.persistence.oid.ConfiguracionANSOid;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.NovedadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.TipoNovedadOid;
import com.keralty.aepersonas.repository.NovedadJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToMany;
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
 * Persistent representation of the <code>Novedad</code> model class.
 * <p>
 * Model Class: <code>Novedad</code><br>
 */
@Entity(name = NovedadConstants.CLASS_NAME)
@Table(name = NovedadConstants.TBL_NAME)
public class Novedad extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient NovedadJpaRepository novedadRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Novedad_Sequence")
    @SequenceGenerator(name="Novedad_Sequence", sequenceName="Novedad_Sequence", allocationSize=1)
    @Column(name = NovedadConstants.FLD_NOVEDADIDNOVEDAD )
    @JsonProperty(value="id_novedad")
    private Long novedadidNovedad;

    /** Class member attribute. */
    @Column(name = NovedadConstants.FLD_NOVEDADALIASNOVEDAD )
    @JsonProperty(value="aliasnovedad")
    private String novedadAliasNovedad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadAliasNovedad;

    /** Class member attribute. */
    @Column(name = NovedadConstants.FLD_NOVEDADNOMBRE )
    @JsonProperty(value="nombre")
    private String novedadNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadNombre;

    /** Class member attribute. */
    @Column(name = NovedadConstants.FLD_NOVEDADDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String novedadDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadDescripcion;

    /** Class member attribute. */
    @Column(name = NovedadConstants.FLD_NOVEDADCODIGOLEGAL )
    @JsonProperty(value="codigolegal")
    private String novedadCodigoLegal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCodigoLegal;

    /** Class member attribute. */
    @Column(name = NovedadConstants.FLD_NOVEDADREQDOCPERSONA )
    @JsonProperty(value="reqdocpersona")
    private Boolean novedadReqDocPersona;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadReqDocPersona;

    /** Class member attribute. */
    @Column(name = NovedadConstants.FLD_NOVEDADREQDOCSOLICITUD )
    @JsonProperty(value="reqdocsolicitud")
    private Boolean novedadReqDocSolicitud;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadReqDocSolicitud;

    /** Class member attribute. */
    @Column(name = NovedadConstants.FLD_NOVEDADVARIASFAMILIAS )
    @JsonProperty(value="variasfamilias")
    private Boolean novedadVariasFamilias;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadVariasFamilias;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienecausales")
    protected Boolean novedaddrvTieneCausales;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienecausasexcepcion")
    protected Boolean novedaddrvTieneCausasExcepcion;

    /** Class member attribute. */
    @Column(name = NovedadConstants.FLD_NOVEDADMINVALORMESES )
    @JsonProperty(value="minvalormeses")
    private Long novedadMinValorMeses;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadMinValorMeses;

    /** Class member attribute. */
    @Column(name = NovedadConstants.FLD_NOVEDADMAXVALORMESES )
    @JsonProperty(value="maxvalormeses")
    private Long novedadMaxValorMeses;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadMaxValorMeses;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtextomostrar")
    protected String novedadDrvTextoMostrar;

    /** Related Class. */
    @ManyToMany(mappedBy=NovedadConstants.ROLE_INVNAME_DOMINIOS)
    @JsonIgnore
    private Collection <Dominio> dominios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominios;

    /** Related Class. */
    @OneToMany(mappedBy = NovedadConstants.ROLE_INVNAME_CAUSALES)
    @JsonIgnore
    private Collection <Causal> causales;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCausales;

    /** Related Class. */
    @OneToMany(mappedBy = NovedadConstants.ROLE_INVNAME_SOLICITUDES)
    @JsonIgnore
    private Collection <SolicitudNovedad> solicitudes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudes;

    /** Related Class. */
    @OneToMany(mappedBy = NovedadConstants.ROLE_INVNAME_CAUSASEXCLUSION)
    @JsonIgnore
    private Collection <CausaExclusion> causasExclusion;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCausasExclusion;

    /** Related Class. */
    @OneToMany(mappedBy = NovedadConstants.ROLE_INVNAME_CONFIGURACIONESANS)
    @JsonIgnore
    private Collection <ConfiguracionANS> configuracionesANS;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionesANS;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadConstants.FLD_TIPONOVEDADTIPO, referencedColumnName=TipoNovedadConstants.FLD_TIPONOVEDADTIPO)
    })
    @JsonIgnore
    private TipoNovedad tipoNovedad;
    /** Related attribute. */
    @Column(name = NovedadConstants.FLD_TIPONOVEDADTIPO, insertable = false, updatable = false)
    private Long tipoNovedadTipo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoNovedad;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Novedad() {
        novedadidNovedad = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Novedad</code>.
     * @param oid Object Identifier of the instance of <code>Novedad</code> to be created.
     * @throws SystemException
     */
    public Novedad(NovedadOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            novedadidNovedad = oid.getNovedadidNovedad();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>novedadidNovedad</code> attribute<br>in class <code>Novedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Novedad</code>
     * @return The value of the <code>novedadidNovedad</code> attribute<br>in class <code>Novedad</code>.
     */
    public Long getNovedadidNovedad() {
        return novedadidNovedad;
    }

    /**
     * Sets the value of the <code>novedadidNovedad</code> attribute<br>in class <code>Novedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Novedad</code>
     * @param novedadidNovedad The new value of the <code>novedadidNovedad</code> attribute<br>in class <code>Novedad</code>.
     */
    public void setNovedadidNovedad(Long novedadidNovedad) {
        this.novedadidNovedad = novedadidNovedad;
    }

   /**
    * Returns the value of the <code>novedadAliasNovedad</code> attribute.<br>
    * Model Attribute: <code>novedadAliasNovedad</code>. Constant String Size=2<br>
    * Comments: <br>
    * @return The value of the <code>novedadAliasNovedad</code> attribute.
    */

    public String getNovedadAliasNovedad()  {
    	String value;
        value =  novedadAliasNovedad;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadAliasNovedad</code> attribute.<br>
    * Model Attribute: <code>novedadAliasNovedad</code>. Constant String Size=2<br>
    * Comments: <br>
    * @param novedadAliasNovedad The new value of the <code>novedadAliasNovedad</code> attribute.
    */
    public void setNovedadAliasNovedad (String novedadAliasNovedad) {
        modifiedNovedadAliasNovedad = true;
        this.novedadAliasNovedad = novedadAliasNovedad;
    }

   /**
    * Returns the value of the <code>modifiedNovedadAliasNovedad</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadAliasNovedad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadAliasNovedad() {
        return modifiedNovedadAliasNovedad;
    }

   /**
    * Sets the value of the <code>modifiedNovedadAliasNovedad</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadAliasNovedad</code>.
    */
    public void setModifiedNovedadAliasNovedad(boolean modified) {
        this.modifiedNovedadAliasNovedad = modified;
    }

   /**
    * Returns the value of the <code>novedadNombre</code> attribute.<br>
    * Model Attribute: <code>novedadNombre</code>. Variable String Size=50<br>
    * Comments: El nombre es el valor que se utilizará para mostrar al usuario de la aplicación cuando debe seleccionar o se muestre una novedad.<br>
    * @return The value of the <code>novedadNombre</code> attribute.
    */

    public String getNovedadNombre()  {
    	String value;
        value =  novedadNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadNombre</code> attribute.<br>
    * Model Attribute: <code>novedadNombre</code>. Variable String Size=50<br>
    * Comments: El nombre es el valor que se utilizará para mostrar al usuario de la aplicación cuando debe seleccionar o se muestre una novedad.<br>
    * @param novedadNombre The new value of the <code>novedadNombre</code> attribute.
    */
    public void setNovedadNombre (String novedadNombre) {
        modifiedNovedadNombre = true;
        this.novedadNombre = novedadNombre;
    }

   /**
    * Returns the value of the <code>modifiedNovedadNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadNombre() {
        return modifiedNovedadNombre;
    }

   /**
    * Sets the value of the <code>modifiedNovedadNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadNombre</code>.
    */
    public void setModifiedNovedadNombre(boolean modified) {
        this.modifiedNovedadNombre = modified;
    }

   /**
    * Returns the value of the <code>novedadDescripcion</code> attribute.<br>
    * Model Attribute: <code>novedadDescripcion</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>novedadDescripcion</code> attribute.
    */

    public String getNovedadDescripcion()  {
    	String value;
        value =  novedadDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadDescripcion</code> attribute.<br>
    * Model Attribute: <code>novedadDescripcion</code>. Variable String Size=200<br>
    * Comments: <br>
    * @param novedadDescripcion The new value of the <code>novedadDescripcion</code> attribute.
    */
    public void setNovedadDescripcion (String novedadDescripcion) {
        modifiedNovedadDescripcion = true;
        this.novedadDescripcion = novedadDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedNovedadDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadDescripcion() {
        return modifiedNovedadDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedNovedadDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadDescripcion</code>.
    */
    public void setModifiedNovedadDescripcion(boolean modified) {
        this.modifiedNovedadDescripcion = modified;
    }

   /**
    * Returns the value of the <code>novedadCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>novedadCodigoLegal</code>. Variable String Size=5<br>
    * Comments: Código legal que se utiliza para identificar el código asociado en BH<br>
    * @return The value of the <code>novedadCodigoLegal</code> attribute.
    */

    public String getNovedadCodigoLegal()  {
    	String value;
        value =  novedadCodigoLegal;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>novedadCodigoLegal</code>. Variable String Size=5<br>
    * Comments: Código legal que se utiliza para identificar el código asociado en BH<br>
    * @param novedadCodigoLegal The new value of the <code>novedadCodigoLegal</code> attribute.
    */
    public void setNovedadCodigoLegal (String novedadCodigoLegal) {
        modifiedNovedadCodigoLegal = true;
        this.novedadCodigoLegal = novedadCodigoLegal;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCodigoLegal</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCodigoLegal</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCodigoLegal() {
        return modifiedNovedadCodigoLegal;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCodigoLegal</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCodigoLegal</code>.
    */
    public void setModifiedNovedadCodigoLegal(boolean modified) {
        this.modifiedNovedadCodigoLegal = modified;
    }

   /**
    * Returns the value of the <code>novedadReqDocPersona</code> attribute.<br>
    * Model Attribute: <code>novedadReqDocPersona</code>. Variable Bool<br>
    * Comments: Una marca que indicará si esta novedad requiere de documentación adjunta asociada a la clase documental persona (identificación de la persona)
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>novedadReqDocPersona</code> attribute.
    */

    public Boolean getNovedadReqDocPersona()  {
    	Boolean value;
        value =  novedadReqDocPersona;
        return value;
    }

   /**
    * Sets the value of the <code>novedadReqDocPersona</code> attribute.<br>
    * Model Attribute: <code>novedadReqDocPersona</code>. Variable Bool<br>
    * Comments: Una marca que indicará si esta novedad requiere de documentación adjunta asociada a la clase documental persona (identificación de la persona)
<Options>
RADIO=1;
</Options><br>
    * @param novedadReqDocPersona The new value of the <code>novedadReqDocPersona</code> attribute.
    */
    public void setNovedadReqDocPersona (Boolean novedadReqDocPersona) {
        modifiedNovedadReqDocPersona = true;
        this.novedadReqDocPersona = novedadReqDocPersona;
    }

   /**
    * Returns the value of the <code>modifiedNovedadReqDocPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadReqDocPersona</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadReqDocPersona() {
        return modifiedNovedadReqDocPersona;
    }

   /**
    * Sets the value of the <code>modifiedNovedadReqDocPersona</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadReqDocPersona</code>.
    */
    public void setModifiedNovedadReqDocPersona(boolean modified) {
        this.modifiedNovedadReqDocPersona = modified;
    }

   /**
    * Returns the value of the <code>novedadReqDocSolicitud</code> attribute.<br>
    * Model Attribute: <code>novedadReqDocSolicitud</code>. Variable Bool<br>
    * Comments: Una marca que indicará si esta novedad requiere de documentación adjunta asociada a la clase documental solicitud
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>novedadReqDocSolicitud</code> attribute.
    */

    public Boolean getNovedadReqDocSolicitud()  {
    	Boolean value;
        value =  novedadReqDocSolicitud;
        return value;
    }

   /**
    * Sets the value of the <code>novedadReqDocSolicitud</code> attribute.<br>
    * Model Attribute: <code>novedadReqDocSolicitud</code>. Variable Bool<br>
    * Comments: Una marca que indicará si esta novedad requiere de documentación adjunta asociada a la clase documental solicitud
<Options>
RADIO=1;
</Options><br>
    * @param novedadReqDocSolicitud The new value of the <code>novedadReqDocSolicitud</code> attribute.
    */
    public void setNovedadReqDocSolicitud (Boolean novedadReqDocSolicitud) {
        modifiedNovedadReqDocSolicitud = true;
        this.novedadReqDocSolicitud = novedadReqDocSolicitud;
    }

   /**
    * Returns the value of the <code>modifiedNovedadReqDocSolicitud</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadReqDocSolicitud</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadReqDocSolicitud() {
        return modifiedNovedadReqDocSolicitud;
    }

   /**
    * Sets the value of the <code>modifiedNovedadReqDocSolicitud</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadReqDocSolicitud</code>.
    */
    public void setModifiedNovedadReqDocSolicitud(boolean modified) {
        this.modifiedNovedadReqDocSolicitud = modified;
    }

   /**
    * Returns the value of the <code>novedadVariasFamilias</code> attribute.<br>
    * Model Attribute: <code>novedadVariasFamilias</code>. Variable Bool<br>
    * Comments: Una marca que indicará si la novedad permite grabar novedades para distintas familias en un mismo contrato. No aplica a novedades de tipo contrato
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>novedadVariasFamilias</code> attribute.
    */

    public Boolean getNovedadVariasFamilias()  {
    	Boolean value;
        value =  novedadVariasFamilias;
        return value;
    }

   /**
    * Sets the value of the <code>novedadVariasFamilias</code> attribute.<br>
    * Model Attribute: <code>novedadVariasFamilias</code>. Variable Bool<br>
    * Comments: Una marca que indicará si la novedad permite grabar novedades para distintas familias en un mismo contrato. No aplica a novedades de tipo contrato
<Options>
RADIO=1;
</Options><br>
    * @param novedadVariasFamilias The new value of the <code>novedadVariasFamilias</code> attribute.
    */
    public void setNovedadVariasFamilias (Boolean novedadVariasFamilias) {
        modifiedNovedadVariasFamilias = true;
        this.novedadVariasFamilias = novedadVariasFamilias;
    }

   /**
    * Returns the value of the <code>modifiedNovedadVariasFamilias</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadVariasFamilias</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadVariasFamilias() {
        return modifiedNovedadVariasFamilias;
    }

   /**
    * Sets the value of the <code>modifiedNovedadVariasFamilias</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadVariasFamilias</code>.
    */
    public void setModifiedNovedadVariasFamilias(boolean modified) {
        this.modifiedNovedadVariasFamilias = modified;
    }

   /**
    * Returns the value of the <code>novedaddrvTieneCausales</code> attribute.<br>
    * Model Attribute: <code>novedaddrvTieneCausales</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>novedaddrvTieneCausales</code> attribute.
    */

    @JsonIgnore
    public Boolean getNovedaddrvTieneCausales()  {
    	Boolean value;
        try {
            value = novedaddrvTieneCausalesDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Novedad, Attribute: novedaddrvTieneCausales");
        }
        return value;
    }

   /**
    * Returns the value of the <code>novedaddrvTieneCausasExcepcion</code> attribute.<br>
    * Model Attribute: <code>novedaddrvTieneCausasExcepcion</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>novedaddrvTieneCausasExcepcion</code> attribute.
    */

    @JsonIgnore
    public Boolean getNovedaddrvTieneCausasExcepcion()  {
    	Boolean value;
        try {
            value = novedaddrvTieneCausasExcepcionDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Novedad, Attribute: novedaddrvTieneCausasExcepcion");
        }
        return value;
    }

   /**
    * Returns the value of the <code>novedadMinValorMeses</code> attribute.<br>
    * Model Attribute: <code>novedadMinValorMeses</code>. Variable Nat<br>
    * Comments: Para contratos de tipo SC el número de meses mínimo a validar<br>
    * @return The value of the <code>novedadMinValorMeses</code> attribute.
    */

    public Long getNovedadMinValorMeses()  {
    	Long value;
        value =  novedadMinValorMeses;
        return value;
    }

   /**
    * Sets the value of the <code>novedadMinValorMeses</code> attribute.<br>
    * Model Attribute: <code>novedadMinValorMeses</code>. Variable Nat<br>
    * Comments: Para contratos de tipo SC el número de meses mínimo a validar<br>
    * @param novedadMinValorMeses The new value of the <code>novedadMinValorMeses</code> attribute.
    */
    public void setNovedadMinValorMeses (Long novedadMinValorMeses) {
        modifiedNovedadMinValorMeses = true;
        this.novedadMinValorMeses = novedadMinValorMeses;
    }

   /**
    * Returns the value of the <code>modifiedNovedadMinValorMeses</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadMinValorMeses</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadMinValorMeses() {
        return modifiedNovedadMinValorMeses;
    }

   /**
    * Sets the value of the <code>modifiedNovedadMinValorMeses</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadMinValorMeses</code>.
    */
    public void setModifiedNovedadMinValorMeses(boolean modified) {
        this.modifiedNovedadMinValorMeses = modified;
    }

   /**
    * Returns the value of the <code>novedadMaxValorMeses</code> attribute.<br>
    * Model Attribute: <code>novedadMaxValorMeses</code>. Variable Nat<br>
    * Comments: Para contratos de tipo SC el número de meses máximo a validar<br>
    * @return The value of the <code>novedadMaxValorMeses</code> attribute.
    */

    public Long getNovedadMaxValorMeses()  {
    	Long value;
        value =  novedadMaxValorMeses;
        return value;
    }

   /**
    * Sets the value of the <code>novedadMaxValorMeses</code> attribute.<br>
    * Model Attribute: <code>novedadMaxValorMeses</code>. Variable Nat<br>
    * Comments: Para contratos de tipo SC el número de meses máximo a validar<br>
    * @param novedadMaxValorMeses The new value of the <code>novedadMaxValorMeses</code> attribute.
    */
    public void setNovedadMaxValorMeses (Long novedadMaxValorMeses) {
        modifiedNovedadMaxValorMeses = true;
        this.novedadMaxValorMeses = novedadMaxValorMeses;
    }

   /**
    * Returns the value of the <code>modifiedNovedadMaxValorMeses</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadMaxValorMeses</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadMaxValorMeses() {
        return modifiedNovedadMaxValorMeses;
    }

   /**
    * Sets the value of the <code>modifiedNovedadMaxValorMeses</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadMaxValorMeses</code>.
    */
    public void setModifiedNovedadMaxValorMeses(boolean modified) {
        this.modifiedNovedadMaxValorMeses = modified;
    }

   /**
    * Returns the value of the <code>novedadDrvTextoMostrar</code> attribute.<br>
    * Model Attribute: <code>novedadDrvTextoMostrar</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>novedadDrvTextoMostrar</code> attribute.
    */

    @JsonIgnore
    public String getNovedadDrvTextoMostrar()  {
    	String value;
        try {
            value = novedadDrvTextoMostrarDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Novedad, Attribute: novedadDrvTextoMostrar");
        }
        return (value == null ? null : value.trim());
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominios 0:M  ------ 0:M  Novedades [Novedad]</code>
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
     * Returns the instance of <code>Causal</code> related through the <code>Causales</code> role.
     * Model Relationship:
     * <code>[Causal] Causales 0:M  ------ 1:1  Novedad [Novedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Causal</code> related through the <code>Causales</code> role.
     */
    @JsonIgnore
    public Collection <Causal> getCausales() {
        return causales;
    }

    /**
     * Adds an instance of <code>Causal</code> related through the <code>Causales</code> role.
     * @param causales The instance to add to the <code>Causales</code> role.
     */
    public void add2Causales(Causal causales) {
        this.causales.add(causales);
    }
    /**
     * Removes an instance of <code>Causal</code> related through the <code>Causales</code> role.
     * @param causales The instance to be removed
     */
    public void removeFromCausales(Causal causales) {
    	this.causales.remove(causales);
    }
    /**
     * Sets instances of <code>Causal</code> related through the <code>Causales</code> role.
     * @param causales The new value for the <code>Causales</code> role.
     */
    public void setCausales(Collection < Causal > causales) {
        this.causales = causales;
    }

   /**
    * This method gets the attribute value <code>modifiedCausales</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedCausales</code> has been modified.
    */
    public boolean isModifiedCausales(){
        return modifiedCausales;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] Solicitudes 0:M  ------ 1:1  Novedad [Novedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Adds an instance of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to add to the <code>Solicitudes</code> role.
     */
    public void add2Solicitudes(SolicitudNovedad solicitudes) {
        this.solicitudes.add(solicitudes);
    }
    /**
     * Removes an instance of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to be removed
     */
    public void removeFromSolicitudes(SolicitudNovedad solicitudes) {
    	this.solicitudes.remove(solicitudes);
    }
    /**
     * Sets instances of <code>SolicitudNovedad</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The new value for the <code>Solicitudes</code> role.
     */
    public void setSolicitudes(Collection < SolicitudNovedad > solicitudes) {
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
     * Returns the instance of <code>CausaExclusion</code> related through the <code>CausasExclusion</code> role.
     * Model Relationship:
     * <code>[CausaExclusion] CausasExclusion 0:M  ------ 1:1  Novedad [Novedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>CausaExclusion</code> related through the <code>CausasExclusion</code> role.
     */
    @JsonIgnore
    public Collection <CausaExclusion> getCausasExclusion() {
        return causasExclusion;
    }

    /**
     * Adds an instance of <code>CausaExclusion</code> related through the <code>CausasExclusion</code> role.
     * @param causasExclusion The instance to add to the <code>CausasExclusion</code> role.
     */
    public void add2CausasExclusion(CausaExclusion causasExclusion) {
        this.causasExclusion.add(causasExclusion);
    }
    /**
     * Removes an instance of <code>CausaExclusion</code> related through the <code>CausasExclusion</code> role.
     * @param causasExclusion The instance to be removed
     */
    public void removeFromCausasExclusion(CausaExclusion causasExclusion) {
    	this.causasExclusion.remove(causasExclusion);
    }
    /**
     * Sets instances of <code>CausaExclusion</code> related through the <code>CausasExclusion</code> role.
     * @param causasExclusion The new value for the <code>CausasExclusion</code> role.
     */
    public void setCausasExclusion(Collection < CausaExclusion > causasExclusion) {
        this.causasExclusion = causasExclusion;
    }

   /**
    * This method gets the attribute value <code>modifiedCausasExclusion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedCausasExclusion</code> has been modified.
    */
    public boolean isModifiedCausasExclusion(){
        return modifiedCausasExclusion;
    }

    /**
     * Returns the instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     * Model Relationship:
     * <code>[ConfiguracionANS] ConfiguracionesANS 0:M  ------ 0:1  Novedad [Novedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     */
    @JsonIgnore
    public Collection <ConfiguracionANS> getConfiguracionesANS() {
        return configuracionesANS;
    }

    /**
     * Adds an instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     * @param configuracionesANS The instance to add to the <code>ConfiguracionesANS</code> role.
     */
    public void add2ConfiguracionesANS(ConfiguracionANS configuracionesANS) {
        this.configuracionesANS.add(configuracionesANS);
    }
    /**
     * Removes an instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     * @param configuracionesANS The instance to be removed
     */
    public void removeFromConfiguracionesANS(ConfiguracionANS configuracionesANS) {
    	this.configuracionesANS.remove(configuracionesANS);
    }
    /**
     * Sets instances of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     * @param configuracionesANS The new value for the <code>ConfiguracionesANS</code> role.
     */
    public void setConfiguracionesANS(Collection < ConfiguracionANS > configuracionesANS) {
        this.configuracionesANS = configuracionesANS;
    }

   /**
    * This method gets the attribute value <code>modifiedConfiguracionesANS</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedConfiguracionesANS</code> has been modified.
    */
    public boolean isModifiedConfiguracionesANS(){
        return modifiedConfiguracionesANS;
    }

    /**
     * Returns the instance of <code>TipoNovedad</code> related through the <code>TipoNovedad</code> role.
     * Model Relationship:
     * <code>[TipoNovedad] TipoNovedad 1:1  ------ 0:M  Novedades [Novedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoNovedad</code> related through the <code>TipoNovedad</code> role.
     */
    @JsonIgnore
    public TipoNovedad getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Adds an instance of <code>TipoNovedad</code> related through the <code>TipoNovedad</code> role.
     * @param tipoNovedad The instance to add to the <code>TipoNovedad</code> role.
     */
    public void add2TipoNovedad(TipoNovedad tipoNovedad) {
        if (tipoNovedad == null || tipoNovedad.isNull()) {
            this.modifiedTipoNovedad = true;
            this.tipoNovedadTipo = null;
        } else {
            this.tipoNovedadTipo = tipoNovedad.getTipoNovedadTipo();
        }
        this.tipoNovedad = (tipoNovedad == null  || tipoNovedad.isNull() ? null : tipoNovedad);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoNovedad</code> has been modified.
    */
    public boolean isModifiedTipoNovedad(){
        return modifiedTipoNovedad;
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
     * Computes the value of the <code>novedaddrvTieneCausales</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>novedaddrvTieneCausales</code> derived attribute.
     */
    public Boolean novedaddrvTieneCausalesDerivations() throws SystemException {

        novedaddrvTieneCausales = null;

        novedaddrvTieneCausalesDerivationsConditional1();
        novedaddrvTieneCausalesDerivationsDefault();
        return novedaddrvTieneCausales;
    }

    private void novedaddrvTieneCausalesDerivationsConditional1() throws SystemException {
        if (novedaddrvTieneCausales != null) return;
        // CONDITION: COUNT(Causales) > 0
        // EFFECT   : TRUE
        boolean novedaddrvTieneCausalesCond = getNovedadRepository().assocOperator000(this) > Long.valueOf(0);
        if (novedaddrvTieneCausalesCond) {
            novedaddrvTieneCausales = Boolean.TRUE;
        }
    }

    private void novedaddrvTieneCausalesDerivationsDefault() {
        if (novedaddrvTieneCausales != null) return;
        // Default derivation
        // EFFECT   : FALSE
        novedaddrvTieneCausales = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>novedaddrvTieneCausasExcepcion</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>novedaddrvTieneCausasExcepcion</code> derived attribute.
     */
    public Boolean novedaddrvTieneCausasExcepcionDerivations() throws SystemException {

        novedaddrvTieneCausasExcepcion = null;

        novedaddrvTieneCausasExcepcionDerivationsConditional1();
        novedaddrvTieneCausasExcepcionDerivationsDefault();
        return novedaddrvTieneCausasExcepcion;
    }

    private void novedaddrvTieneCausasExcepcionDerivationsConditional1() throws SystemException {
        if (novedaddrvTieneCausasExcepcion != null) return;
        // CONDITION: COUNT(CausasExclusion) > 0
        // EFFECT   : TRUE
        boolean novedaddrvTieneCausasExcepcionCond = getNovedadRepository().assocOperator001(this) > Long.valueOf(0);
        if (novedaddrvTieneCausasExcepcionCond) {
            novedaddrvTieneCausasExcepcion = Boolean.TRUE;
        }
    }

    private void novedaddrvTieneCausasExcepcionDerivationsDefault() {
        if (novedaddrvTieneCausasExcepcion != null) return;
        // Default derivation
        // EFFECT   : FALSE
        novedaddrvTieneCausasExcepcion = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>novedadDrvTextoMostrar</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>novedadDrvTextoMostrar</code> derived attribute.
     */
    public String novedadDrvTextoMostrarDerivations() {

        novedadDrvTextoMostrar = null;

        novedadDrvTextoMostrarDerivationsDefault();
        return novedadDrvTextoMostrar;
    }

    private void novedadDrvTextoMostrarDerivationsDefault() {
        if (novedadDrvTextoMostrar != null) return;
        // Default derivation
        // EFFECT   : AliasNovedad + \" \" + Nombre
        novedadDrvTextoMostrar = this.getNovedadAliasNovedad() + " " + this.getNovedadNombre();
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        novedadAliasNovedad = "";
        novedadNombre = "";
        novedadDescripcion = "";
        novedadCodigoLegal = "";
        novedadReqDocPersona = false;
        novedadReqDocSolicitud = false;
        novedadVariasFamilias = false;
        novedadMinValorMeses = null;
        novedadMaxValorMeses = null;
        dominios = null;
        causales = null;
        solicitudes = null;
        causasExclusion = null;
        configuracionesANS = null;
        tipoNovedad = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    public NovedadJpaRepository getNovedadRepository() {
        return Arc.container().select(NovedadJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Novedad.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return NovedadConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedNovedadAliasNovedad = false;
    	values.put("novedadAliasNovedad", getNovedadAliasNovedad());
    	modifiedNovedadNombre = false;
    	values.put("novedadNombre", getNovedadNombre());
    	modifiedNovedadDescripcion = false;
    	values.put("novedadDescripcion", getNovedadDescripcion());
    	modifiedNovedadCodigoLegal = false;
    	values.put("novedadCodigoLegal", getNovedadCodigoLegal());
    	modifiedNovedadReqDocPersona = false;
    	values.put("novedadReqDocPersona", getNovedadReqDocPersona());
    	modifiedNovedadReqDocSolicitud = false;
    	values.put("novedadReqDocSolicitud", getNovedadReqDocSolicitud());
    	modifiedNovedadVariasFamilias = false;
    	values.put("novedadVariasFamilias", getNovedadVariasFamilias());
    	modifiedNovedadMinValorMeses = false;
    	values.put("novedadMinValorMeses", getNovedadMinValorMeses());
    	modifiedNovedadMaxValorMeses = false;
    	values.put("novedadMaxValorMeses", getNovedadMaxValorMeses());
    	modifiedDominios = false;
    	modifiedCausales = false;
    	modifiedSolicitudes = false;
    	modifiedCausasExclusion = false;
    	modifiedConfiguracionesANS = false;
    	modifiedTipoNovedad = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            novedaddrvTieneCausales = null;
            novedaddrvTieneCausasExcepcion = null;
            novedadDrvTextoMostrar = null;
    }

    /**
     * Returns the <code>NovedadOid</code> object that identifies this instance of <code>Novedad</code>.
     * @return <code>NovedadOid </code> object that identifies this instance of <code>Novedad</code>
     */
	@Override
    public NovedadOid getOid() {
        return new NovedadOid(getNovedadidNovedad());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(NovedadConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(NovedadConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.NOVEDAD)) {
            // Add this class
            activeFacets.add(Constants.NOVEDAD);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (NovedadConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_CAUSALES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4Causal(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_CAUSASEXCLUSION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4CausaExclusion(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_CONFIGURACIONESANS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4ConfiguracionANS(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_TIPONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4TipoNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4Causal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Causal(mapper.readValue(relatedInstanceJsonOid, CausalOid.class)): Causal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4CausaExclusion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new CausaExclusion(mapper.readValue(relatedInstanceJsonOid, CausaExclusionOid.class)): CausaExclusion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4ConfiguracionANS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, ConfiguracionANSOid.class)): ConfiguracionANS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4TipoNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoNovedad(mapper.readValue(relatedInstanceJsonOid, TipoNovedadOid.class)): TipoNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
