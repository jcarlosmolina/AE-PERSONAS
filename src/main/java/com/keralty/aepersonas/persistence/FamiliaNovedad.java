package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FamiliaNovedadConstants;
import com.keralty.aepersonas.global.FirmaConstants;
import com.keralty.aepersonas.global.SolicitudNovedadConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.oid.FamiliaNovedadOid;
import com.keralty.aepersonas.persistence.oid.FirmaOid;
import com.keralty.aepersonas.persistence.oid.NovedadCTOid;
import com.keralty.aepersonas.persistence.oid.NovedadMDOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.UsuarioNovedadOid;
import com.keralty.aepersonas.repository.FamiliaNovedadJpaRepository;
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
import jakarta.persistence.OneToOne;
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
 * Persistent representation of the <code>FamiliaNovedad</code> model class.
 * <p>
 * Model Class: <code>FamiliaNovedad</code><br>
 */
@Entity(name = FamiliaNovedadConstants.CLASS_NAME)
@Table(name = FamiliaNovedadConstants.TBL_NAME)
public class FamiliaNovedad extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient FamiliaNovedadJpaRepository familiaNovedadRepository;

    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FamiliaNovedad_Sequence")
    @SequenceGenerator(name="FamiliaNovedad_Sequence", sequenceName="FamiliaNovedad_Sequence", allocationSize=1)
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD )
    @JsonProperty(value="id_familianovedad")
    private Long familiaNovedadidFamiliaNovedad;

    /** Class member attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADNUMFAMILIA )
    @JsonProperty(value="numfamilia")
    private Long familiaNovedadNumFamilia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedadNumFamilia;

    /** Class member attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADTITNUMIDENTIFICACION )
    @JsonProperty(value="titnumidentificacion")
    private String familiaNovedadTitNumidentificacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedadTitNumidentificacion;

    /** Class member attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADTITPRIMERNOMBRE )
    @JsonProperty(value="titprimernombre")
    private String familiaNovedadTitPrimerNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedadTitPrimerNombre;

    /** Class member attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADTITSEGUNDONOMBRE )
    @JsonProperty(value="titsegundonombre")
    private String familiaNovedadTitSegundoNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedadTitSegundoNombre;

    /** Class member attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADTITPRIMERAPELLIDO )
    @JsonProperty(value="titprimerapellido")
    private String familiaNovedadTitPrimerApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedadTitPrimerApellido;

    /** Class member attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADTITSEGUNDOAPELLIDO )
    @JsonProperty(value="titsegundoapellido")
    private String familiaNovedadTitSegundoApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedadTitSegundoApellido;

    /** Class member attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADTITRAZONSOCIAL )
    @JsonProperty(value="titrazonsocial")
    private String familiaNovedadTitRazonSocial;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedadTitRazonSocial;

    /** Class member attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADTITTIENEBENEFICIOS )
    @JsonProperty(value="tittienebeneficios")
    private Boolean familiaNovedadTitTieneBeneficios;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedadTitTieneBeneficios;

    /** Class member attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FAMILIANOVEDADFAMACTIVA )
    @JsonProperty(value="famactiva")
    private Boolean familiaNovedadFamActiva;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedadFamActiva;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtieneusuarioactivo")
    protected Boolean familiaNovedaddrvTieneUsuarioActivo;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnumtitulares")
    protected Long familiaNovedaddrvNumTitulares;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienenuevotitular")
    protected Boolean familiaNovedaddrvTieneNuevoTitular;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="titdrvnombrecompleto")
    protected String familiaNovedadTitDrvNombreCompleto;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="titdrvidentificacion")
    protected String familiaNovedadTitDrvIdentificacion;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="titdrvnombreanterior")
    protected String familiaNovedadTitDrvNombreAnterior;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienenuevadir")
    protected Boolean familiaNovedadDrvTieneNuevaDir;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienefirmatit")
    protected Boolean familiaNovedadDrvTieneFirmaTit;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienefirmanuevotit")
    protected Boolean familiaNovedadDrvTieneFirmaNuevoTit;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvvalidarcp1")
    protected Boolean familiaNovedadDrvValidarCP1;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvvalidarct1")
    protected Boolean familiaNovedadDrvValidarCT1;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvedadusutitular")
    protected Long familiaNovedaddrvEdadUsuTitular;

    /** Related Class. */
    @OneToMany(mappedBy = FamiliaNovedadConstants.ROLE_INVNAME_USUARIONOVEDAD)
    @JsonIgnore
    private Collection <UsuarioNovedad> usuarioNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedad;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = FamiliaNovedadConstants.ROLE_INVNAME_NOVEDADCT)
    @JsonIgnore
    private NovedadCT novedadCT;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCT;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = FamiliaNovedadConstants.ROLE_INVNAME_NOVEDADMD)
    @JsonIgnore
    private NovedadMD novedadMD;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadMD;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=FamiliaNovedadConstants.FLD_SOLICITUDNOVEDADID, referencedColumnName=SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADID)
    })
    @JsonIgnore
    private SolicitudNovedad solicitud;
    /** Related attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_SOLICITUDNOVEDADID, insertable = false, updatable = false)
    private Long solicitudNovedadId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitud;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=FamiliaNovedadConstants.FLD_TIPOIDENTIFICACIONCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacion;
    /** Related attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_TIPOIDENTIFICACIONCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacion;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=FamiliaNovedadConstants.FLD_FIRMAIDENTIFICADOR, referencedColumnName=FirmaConstants.FLD_FIRMAIDENTIFICADOR)
    })
    @JsonIgnore
    private Firma firma;
    /** Related attribute. */
    @Column(name = FamiliaNovedadConstants.FLD_FIRMAIDENTIFICADOR, insertable = false, updatable = false)
    private Long firmaIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFirma;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public FamiliaNovedad() {
        familiaNovedadidFamiliaNovedad = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>FamiliaNovedad</code>.
     * @param oid Object Identifier of the instance of <code>FamiliaNovedad</code> to be created.
     * @throws SystemException
     */
    public FamiliaNovedad(FamiliaNovedadOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            familiaNovedadidFamiliaNovedad = oid.getFamiliaNovedadidFamiliaNovedad();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>familiaNovedadidFamiliaNovedad</code> attribute<br>in class <code>FamiliaNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FamiliaNovedad</code>
     * @return The value of the <code>familiaNovedadidFamiliaNovedad</code> attribute<br>in class <code>FamiliaNovedad</code>.
     */
    public Long getFamiliaNovedadidFamiliaNovedad() {
        return familiaNovedadidFamiliaNovedad;
    }

    /**
     * Sets the value of the <code>familiaNovedadidFamiliaNovedad</code> attribute<br>in class <code>FamiliaNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FamiliaNovedad</code>
     * @param familiaNovedadidFamiliaNovedad The new value of the <code>familiaNovedadidFamiliaNovedad</code> attribute<br>in class <code>FamiliaNovedad</code>.
     */
    public void setFamiliaNovedadidFamiliaNovedad(Long familiaNovedadidFamiliaNovedad) {
        this.familiaNovedadidFamiliaNovedad = familiaNovedadidFamiliaNovedad;
    }

   /**
    * Returns the value of the <code>familiaNovedadNumFamilia</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadNumFamilia</code>. Variable Nat<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadNumFamilia</code> attribute.
    */

    public Long getFamiliaNovedadNumFamilia()  {
    	Long value;
        value =  familiaNovedadNumFamilia;
        return value;
    }

   /**
    * Sets the value of the <code>familiaNovedadNumFamilia</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadNumFamilia</code>. Variable Nat<br>
    * Comments: <br>
    * @param familiaNovedadNumFamilia The new value of the <code>familiaNovedadNumFamilia</code> attribute.
    */
    public void setFamiliaNovedadNumFamilia (Long familiaNovedadNumFamilia) {
        modifiedFamiliaNovedadNumFamilia = true;
        this.familiaNovedadNumFamilia = familiaNovedadNumFamilia;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaNovedadNumFamilia</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaNovedadNumFamilia</code>.
    */
    public void setModifiedFamiliaNovedadNumFamilia(boolean modified) {
        this.modifiedFamiliaNovedadNumFamilia = modified;
    }

   /**
    * Returns the value of the <code>familiaNovedadTitNumidentificacion</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitNumidentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitNumidentificacion</code> attribute.
    */

    public String getFamiliaNovedadTitNumidentificacion()  {
    	String value;
        value =  familiaNovedadTitNumidentificacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>familiaNovedadTitNumidentificacion</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitNumidentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @param familiaNovedadTitNumidentificacion The new value of the <code>familiaNovedadTitNumidentificacion</code> attribute.
    */
    public void setFamiliaNovedadTitNumidentificacion (String familiaNovedadTitNumidentificacion) {
        modifiedFamiliaNovedadTitNumidentificacion = true;
        this.familiaNovedadTitNumidentificacion = familiaNovedadTitNumidentificacion;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaNovedadTitNumidentificacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaNovedadTitNumidentificacion</code>.
    */
    public void setModifiedFamiliaNovedadTitNumidentificacion(boolean modified) {
        this.modifiedFamiliaNovedadTitNumidentificacion = modified;
    }

   /**
    * Returns the value of the <code>familiaNovedadTitPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitPrimerNombre</code> attribute.
    */

    public String getFamiliaNovedadTitPrimerNombre()  {
    	String value;
        value =  familiaNovedadTitPrimerNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>familiaNovedadTitPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param familiaNovedadTitPrimerNombre The new value of the <code>familiaNovedadTitPrimerNombre</code> attribute.
    */
    public void setFamiliaNovedadTitPrimerNombre (String familiaNovedadTitPrimerNombre) {
        modifiedFamiliaNovedadTitPrimerNombre = true;
        this.familiaNovedadTitPrimerNombre = familiaNovedadTitPrimerNombre;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaNovedadTitPrimerNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaNovedadTitPrimerNombre</code>.
    */
    public void setModifiedFamiliaNovedadTitPrimerNombre(boolean modified) {
        this.modifiedFamiliaNovedadTitPrimerNombre = modified;
    }

   /**
    * Returns the value of the <code>familiaNovedadTitSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitSegundoNombre</code> attribute.
    */

    public String getFamiliaNovedadTitSegundoNombre()  {
    	String value;
        value =  familiaNovedadTitSegundoNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>familiaNovedadTitSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param familiaNovedadTitSegundoNombre The new value of the <code>familiaNovedadTitSegundoNombre</code> attribute.
    */
    public void setFamiliaNovedadTitSegundoNombre (String familiaNovedadTitSegundoNombre) {
        modifiedFamiliaNovedadTitSegundoNombre = true;
        this.familiaNovedadTitSegundoNombre = familiaNovedadTitSegundoNombre;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaNovedadTitSegundoNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaNovedadTitSegundoNombre</code>.
    */
    public void setModifiedFamiliaNovedadTitSegundoNombre(boolean modified) {
        this.modifiedFamiliaNovedadTitSegundoNombre = modified;
    }

   /**
    * Returns the value of the <code>familiaNovedadTitPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitPrimerApellido</code> attribute.
    */

    public String getFamiliaNovedadTitPrimerApellido()  {
    	String value;
        value =  familiaNovedadTitPrimerApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>familiaNovedadTitPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param familiaNovedadTitPrimerApellido The new value of the <code>familiaNovedadTitPrimerApellido</code> attribute.
    */
    public void setFamiliaNovedadTitPrimerApellido (String familiaNovedadTitPrimerApellido) {
        modifiedFamiliaNovedadTitPrimerApellido = true;
        this.familiaNovedadTitPrimerApellido = familiaNovedadTitPrimerApellido;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaNovedadTitPrimerApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaNovedadTitPrimerApellido</code>.
    */
    public void setModifiedFamiliaNovedadTitPrimerApellido(boolean modified) {
        this.modifiedFamiliaNovedadTitPrimerApellido = modified;
    }

   /**
    * Returns the value of the <code>familiaNovedadTitSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitSegundoApellido</code> attribute.
    */

    public String getFamiliaNovedadTitSegundoApellido()  {
    	String value;
        value =  familiaNovedadTitSegundoApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>familiaNovedadTitSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param familiaNovedadTitSegundoApellido The new value of the <code>familiaNovedadTitSegundoApellido</code> attribute.
    */
    public void setFamiliaNovedadTitSegundoApellido (String familiaNovedadTitSegundoApellido) {
        modifiedFamiliaNovedadTitSegundoApellido = true;
        this.familiaNovedadTitSegundoApellido = familiaNovedadTitSegundoApellido;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaNovedadTitSegundoApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaNovedadTitSegundoApellido</code>.
    */
    public void setModifiedFamiliaNovedadTitSegundoApellido(boolean modified) {
        this.modifiedFamiliaNovedadTitSegundoApellido = modified;
    }

   /**
    * Returns the value of the <code>familiaNovedadTitRazonSocial</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitRazonSocial</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitRazonSocial</code> attribute.
    */

    public String getFamiliaNovedadTitRazonSocial()  {
    	String value;
        value =  familiaNovedadTitRazonSocial;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>familiaNovedadTitRazonSocial</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitRazonSocial</code>. Variable String Size=200<br>
    * Comments: <br>
    * @param familiaNovedadTitRazonSocial The new value of the <code>familiaNovedadTitRazonSocial</code> attribute.
    */
    public void setFamiliaNovedadTitRazonSocial (String familiaNovedadTitRazonSocial) {
        modifiedFamiliaNovedadTitRazonSocial = true;
        this.familiaNovedadTitRazonSocial = familiaNovedadTitRazonSocial;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaNovedadTitRazonSocial</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaNovedadTitRazonSocial</code>.
    */
    public void setModifiedFamiliaNovedadTitRazonSocial(boolean modified) {
        this.modifiedFamiliaNovedadTitRazonSocial = modified;
    }

   /**
    * Returns the value of the <code>familiaNovedadTitTieneBeneficios</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitTieneBeneficios</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitTieneBeneficios</code> attribute.
    */

    public Boolean getFamiliaNovedadTitTieneBeneficios()  {
    	Boolean value;
        value =  familiaNovedadTitTieneBeneficios;
        return value;
    }

   /**
    * Sets the value of the <code>familiaNovedadTitTieneBeneficios</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitTieneBeneficios</code>. Constant Bool<br>
    * Comments: <br>
    * @param familiaNovedadTitTieneBeneficios The new value of the <code>familiaNovedadTitTieneBeneficios</code> attribute.
    */
    public void setFamiliaNovedadTitTieneBeneficios (Boolean familiaNovedadTitTieneBeneficios) {
        modifiedFamiliaNovedadTitTieneBeneficios = true;
        this.familiaNovedadTitTieneBeneficios = familiaNovedadTitTieneBeneficios;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaNovedadTitTieneBeneficios</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaNovedadTitTieneBeneficios</code>.
    */
    public void setModifiedFamiliaNovedadTitTieneBeneficios(boolean modified) {
        this.modifiedFamiliaNovedadTitTieneBeneficios = modified;
    }

   /**
    * Returns the value of the <code>familiaNovedadFamActiva</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadFamActiva</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadFamActiva</code> attribute.
    */

    public Boolean getFamiliaNovedadFamActiva()  {
    	Boolean value;
        value =  familiaNovedadFamActiva;
        return value;
    }

   /**
    * Sets the value of the <code>familiaNovedadFamActiva</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadFamActiva</code>. Constant Bool<br>
    * Comments: <br>
    * @param familiaNovedadFamActiva The new value of the <code>familiaNovedadFamActiva</code> attribute.
    */
    public void setFamiliaNovedadFamActiva (Boolean familiaNovedadFamActiva) {
        modifiedFamiliaNovedadFamActiva = true;
        this.familiaNovedadFamActiva = familiaNovedadFamActiva;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaNovedadFamActiva</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaNovedadFamActiva</code>.
    */
    public void setModifiedFamiliaNovedadFamActiva(boolean modified) {
        this.modifiedFamiliaNovedadFamActiva = modified;
    }

   /**
    * Returns the value of the <code>familiaNovedaddrvTieneUsuarioActivo</code> attribute.<br>
    * Model Attribute: <code>familiaNovedaddrvTieneUsuarioActivo</code>. Variable Bool<br>
    * Comments: Indica que al menos un usuario de esta familia está activo<br>
    * @return The value of the <code>familiaNovedaddrvTieneUsuarioActivo</code> attribute.
    */

    @JsonIgnore
    public Boolean getFamiliaNovedaddrvTieneUsuarioActivo()  {
    	Boolean value;
        try {
            value = familiaNovedaddrvTieneUsuarioActivoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedaddrvTieneUsuarioActivo");
        }
        return value;
    }

   /**
    * Returns the value of the <code>familiaNovedaddrvNumTitulares</code> attribute.<br>
    * Model Attribute: <code>familiaNovedaddrvNumTitulares</code>. Variable Int<br>
    * Comments: Indica el número de usuarios que son titulares en la familia<br>
    * @return The value of the <code>familiaNovedaddrvNumTitulares</code> attribute.
    */

    @JsonIgnore
    public Long getFamiliaNovedaddrvNumTitulares()  {
    	Long value;
        try {
            value = familiaNovedaddrvNumTitularesDerivations();
        } catch (Exception e) {
            value = Long.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedaddrvNumTitulares");
        }
        return value;
    }

   /**
    * Returns the value of the <code>familiaNovedaddrvTieneNuevoTitular</code> attribute.<br>
    * Model Attribute: <code>familiaNovedaddrvTieneNuevoTitular</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedaddrvTieneNuevoTitular</code> attribute.
    */

    @JsonIgnore
    public Boolean getFamiliaNovedaddrvTieneNuevoTitular()  {
    	Boolean value;
        try {
            value = familiaNovedaddrvTieneNuevoTitularDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedaddrvTieneNuevoTitular");
        }
        return value;
    }

   /**
    * Returns the value of the <code>familiaNovedadTitDrvNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitDrvNombreCompleto</code>. Variable String Size=210<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitDrvNombreCompleto</code> attribute.
    */

    @JsonIgnore
    public String getFamiliaNovedadTitDrvNombreCompleto()  {
    	String value;
        try {
            value = familiaNovedadTitDrvNombreCompletoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedadTitDrvNombreCompleto");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>familiaNovedadTitDrvIdentificacion</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitDrvIdentificacion</code>. Variable String Size=70<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitDrvIdentificacion</code> attribute.
    */

    @JsonIgnore
    public String getFamiliaNovedadTitDrvIdentificacion()  {
    	String value;
        try {
            value = familiaNovedadTitDrvIdentificacionDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedadTitDrvIdentificacion");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>familiaNovedadTitDrvNombreAnterior</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadTitDrvNombreAnterior</code>. Variable String Size=210<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadTitDrvNombreAnterior</code> attribute.
    */

    @JsonIgnore
    public String getFamiliaNovedadTitDrvNombreAnterior()  {
    	String value;
        try {
            value = familiaNovedadTitDrvNombreAnteriorDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedadTitDrvNombreAnterior");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>familiaNovedadDrvTieneNuevaDir</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadDrvTieneNuevaDir</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadDrvTieneNuevaDir</code> attribute.
    */

    @JsonIgnore
    public Boolean getFamiliaNovedadDrvTieneNuevaDir()  {
    	Boolean value;
        try {
            value = familiaNovedadDrvTieneNuevaDirDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedadDrvTieneNuevaDir");
        }
        return value;
    }

   /**
    * Returns the value of the <code>familiaNovedadDrvTieneFirmaTit</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadDrvTieneFirmaTit</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadDrvTieneFirmaTit</code> attribute.
    */

    @JsonIgnore
    public Boolean getFamiliaNovedadDrvTieneFirmaTit()  {
    	Boolean value;
        try {
            value = familiaNovedadDrvTieneFirmaTitDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedadDrvTieneFirmaTit");
        }
        return value;
    }

   /**
    * Returns the value of the <code>familiaNovedadDrvTieneFirmaNuevoTit</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadDrvTieneFirmaNuevoTit</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>familiaNovedadDrvTieneFirmaNuevoTit</code> attribute.
    */

    @JsonIgnore
    public Boolean getFamiliaNovedadDrvTieneFirmaNuevoTit()  {
    	Boolean value;
        try {
            value = familiaNovedadDrvTieneFirmaNuevoTitDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedadDrvTieneFirmaNuevoTit");
        }
        return value;
    }

   /**
    * Returns the value of the <code>familiaNovedadDrvValidarCP1</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadDrvValidarCP1</code>. Variable Bool<br>
    * Comments: Validacion de Cambio de parentesco: "Los contratos con contratante Jurídico deben tener al menos un beneficiario con parentesco TITULAR activo"<br>
    * @return The value of the <code>familiaNovedadDrvValidarCP1</code> attribute.
    */

    @JsonIgnore
    public Boolean getFamiliaNovedadDrvValidarCP1()  {
    	Boolean value;
        try {
            value = familiaNovedadDrvValidarCP1Derivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedadDrvValidarCP1");
        }
        return value;
    }

   /**
    * Returns the value of the <code>familiaNovedadDrvValidarCT1</code> attribute.<br>
    * Model Attribute: <code>familiaNovedadDrvValidarCT1</code>. Variable Bool<br>
    * Comments: Validacion de Cambio de Titular: ""El nuevo titular de la familia no puede ser persona jurídica""<br>
    * @return The value of the <code>familiaNovedadDrvValidarCT1</code> attribute.
    */

    @JsonIgnore
    public Boolean getFamiliaNovedadDrvValidarCT1()  {
    	Boolean value;
        try {
            value = familiaNovedadDrvValidarCT1Derivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedadDrvValidarCT1");
        }
        return value;
    }

   /**
    * Returns the value of the <code>familiaNovedaddrvEdadUsuTitular</code> attribute.<br>
    * Model Attribute: <code>familiaNovedaddrvEdadUsuTitular</code>. Variable Int<br>
    * Comments: Devuelve la edad del usuario titular<br>
    * @return The value of the <code>familiaNovedaddrvEdadUsuTitular</code> attribute.
    */

    @JsonIgnore
    public Long getFamiliaNovedaddrvEdadUsuTitular()  {
    	Long value;
        try {
            value = familiaNovedaddrvEdadUsuTitularDerivations();
        } catch (Exception e) {
            value = Long.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FamiliaNovedad, Attribute: familiaNovedaddrvEdadUsuTitular");
        }
        return value;
    }

    /**
     * Returns the instance of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     * Model Relationship:
     * <code>[UsuarioNovedad] UsuarioNovedad 0:M  ------ 1:1  FamiliaNovedad [FamiliaNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     */
    @JsonIgnore
    public Collection <UsuarioNovedad> getUsuarioNovedad() {
        return usuarioNovedad;
    }

    /**
     * Adds an instance of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     * @param usuarioNovedad The instance to add to the <code>UsuarioNovedad</code> role.
     */
    public void add2UsuarioNovedad(UsuarioNovedad usuarioNovedad) {
        this.usuarioNovedad.add(usuarioNovedad);
    }
    /**
     * Removes an instance of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     * @param usuarioNovedad The instance to be removed
     */
    public void removeFromUsuarioNovedad(UsuarioNovedad usuarioNovedad) {
    	this.usuarioNovedad.remove(usuarioNovedad);
    }
    /**
     * Sets instances of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     * @param usuarioNovedad The new value for the <code>UsuarioNovedad</code> role.
     */
    public void setUsuarioNovedad(Collection < UsuarioNovedad > usuarioNovedad) {
        this.usuarioNovedad = usuarioNovedad;
    }

   /**
    * This method gets the attribute value <code>modifiedUsuarioNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuarioNovedad</code> has been modified.
    */
    public boolean isModifiedUsuarioNovedad(){
        return modifiedUsuarioNovedad;
    }

    /**
     * Returns the instance of <code>NovedadCT</code> related through the <code>NovedadCT</code> role.
     * Model Relationship:
     * <code>[NovedadCT] NovedadCT 0:1  ------ 1:1  FamiliaNovedad [FamiliaNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>NovedadCT</code> related through the <code>NovedadCT</code> role.
     */
    @JsonIgnore
    public NovedadCT getNovedadCT() {
        return novedadCT;
    }

    /**
     * Adds an instance of <code>NovedadCT</code> related through the <code>NovedadCT</code> role.
     * @param novedadCT The instance to add to the <code>NovedadCT</code> role.
     */
    public void add2NovedadCT(NovedadCT novedadCT) {
        this.novedadCT = (novedadCT == null  || novedadCT.isNull() ? null : novedadCT);
    }

   /**
    * This method gets the attribute value <code>modifiedNovedadCT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedadCT</code> has been modified.
    */
    public boolean isModifiedNovedadCT(){
        return modifiedNovedadCT;
    }

    /**
     * Returns the instance of <code>NovedadMD</code> related through the <code>NovedadMD</code> role.
     * Model Relationship:
     * <code>[NovedadMD] NovedadMD 0:1  ------ 1:1  FamiliaNovedad [FamiliaNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>NovedadMD</code> related through the <code>NovedadMD</code> role.
     */
    @JsonIgnore
    public NovedadMD getNovedadMD() {
        return novedadMD;
    }

    /**
     * Adds an instance of <code>NovedadMD</code> related through the <code>NovedadMD</code> role.
     * @param novedadMD The instance to add to the <code>NovedadMD</code> role.
     */
    public void add2NovedadMD(NovedadMD novedadMD) {
        this.novedadMD = (novedadMD == null  || novedadMD.isNull() ? null : novedadMD);
    }

   /**
    * This method gets the attribute value <code>modifiedNovedadMD</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedadMD</code> has been modified.
    */
    public boolean isModifiedNovedadMD(){
        return modifiedNovedadMD;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>Solicitud</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] Solicitud 1:1  ------ 0:M  Familias [FamiliaNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>Solicitud</code> role.
     */
    @JsonIgnore
    public SolicitudNovedad getSolicitud() {
        return solicitud;
    }

    /**
     * Adds an instance of <code>SolicitudNovedad</code> related through the <code>Solicitud</code> role.
     * @param solicitud The instance to add to the <code>Solicitud</code> role.
     */
    public void add2Solicitud(SolicitudNovedad solicitud) {
        if (solicitud == null || solicitud.isNull()) {
            this.modifiedSolicitud = true;
            this.solicitudNovedadId = null;
        } else {
            this.solicitudNovedadId = solicitud.getSolicitudNovedadId();
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
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacion 0:1  ------ 0:M  FamiliasNovedad [FamiliaNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Adds an instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * @param tipoIdentificacion The instance to add to the <code>TipoIdentificacion</code> role.
     */
    public void add2TipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        if (tipoIdentificacion == null || tipoIdentificacion.isNull()) {
            this.modifiedTipoIdentificacion = true;
            this.tipoIdentificacionCodigo = null;
        } else {
            this.tipoIdentificacionCodigo = tipoIdentificacion.getTipoIdentificacionCodigo();
        }
        this.tipoIdentificacion = (tipoIdentificacion == null  || tipoIdentificacion.isNull() ? null : tipoIdentificacion);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoIdentificacion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoIdentificacion</code> has been modified.
    */
    public boolean isModifiedTipoIdentificacion(){
        return modifiedTipoIdentificacion;
    }

    /**
     * Returns the instance of <code>Firma</code> related through the <code>Firma</code> role.
     * Model Relationship:
     * <code>[Firma] Firma 0:1  ------ 0:1  FamiliaNovedad [FamiliaNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Firma</code> related through the <code>Firma</code> role.
     */
    @JsonIgnore
    public Firma getFirma() {
        return firma;
    }

    /**
     * Adds an instance of <code>Firma</code> related through the <code>Firma</code> role.
     * @param firma The instance to add to the <code>Firma</code> role.
     */
    public void add2Firma(Firma firma) {
        if (firma == null || firma.isNull()) {
            this.modifiedFirma = true;
            this.firmaIdentificador = null;
        } else {
            this.firmaIdentificador = firma.getFirmaIdentificador();
        }
        this.firma = (firma == null  || firma.isNull() ? null : firma);
    }

   /**
    * This method gets the attribute value <code>modifiedFirma</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFirma</code> has been modified.
    */
    public boolean isModifiedFirma(){
        return modifiedFirma;
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
     * Computes the value of the <code>familiaNovedaddrvTieneUsuarioActivo</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedaddrvTieneUsuarioActivo</code> derived attribute.
     */
    public Boolean familiaNovedaddrvTieneUsuarioActivoDerivations() throws SystemException {

        familiaNovedaddrvTieneUsuarioActivo = null;

        familiaNovedaddrvTieneUsuarioActivoDerivationsConditional1();
        familiaNovedaddrvTieneUsuarioActivoDerivationsDefault();
        return familiaNovedaddrvTieneUsuarioActivo;
    }

    private void familiaNovedaddrvTieneUsuarioActivoDerivationsConditional1() throws SystemException {
        if (familiaNovedaddrvTieneUsuarioActivo != null) return;
        // CONDITION: EXIST( UsuarioNovedad ) WHERE (UsuarioNovedad.EstadoBeneficiario.EsActivo = true) = true
        // EFFECT   : TRUE
        boolean familiaNovedaddrvTieneUsuarioActivoCond = getFamiliaNovedadRepository().assocOperator000(this).equals(true);
        if (familiaNovedaddrvTieneUsuarioActivoCond) {
            familiaNovedaddrvTieneUsuarioActivo = Boolean.TRUE;
        }
    }

    private void familiaNovedaddrvTieneUsuarioActivoDerivationsDefault() {
        if (familiaNovedaddrvTieneUsuarioActivo != null) return;
        // Default derivation
        // EFFECT   : FALSE
        familiaNovedaddrvTieneUsuarioActivo = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>familiaNovedaddrvNumTitulares</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedaddrvNumTitulares</code> derived attribute.
     */
    public Long familiaNovedaddrvNumTitularesDerivations() throws SystemException {

        familiaNovedaddrvNumTitulares = null;

        familiaNovedaddrvNumTitularesDerivationsConditional1();
        familiaNovedaddrvNumTitularesDerivationsDefault();
        return familiaNovedaddrvNumTitulares;
    }

    private void familiaNovedaddrvNumTitularesDerivationsConditional1() throws SystemException {
        if (familiaNovedaddrvNumTitulares != null) return;
        // CONDITION: EXIST( NovedadCT ) = true
        // EFFECT   : COUNT( UsuarioNovedad ) WHERE (UsuarioNovedad.drvEsTitular = true AND UsuarioNovedad.EstadoBeneficiario.EsActivo = true AND (EXIST( UsuarioNovedad.TipoIdentificacionCD ) = false AND UsuarioNovedad.TipoIdentificacion.Codigo <> NovedadCT.TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacion <> NovedadCT.TitNumidentificacion) OR (EXIST( UsuarioNovedad.TipoIdentificacionCD ) = true AND UsuarioNovedad.TipoIdentificacionCD.Codigo <> NovedadCT.TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacionCD <> NovedadCT.TitNumidentificacion))
        boolean familiaNovedaddrvNumTitularesCond = getFamiliaNovedadRepository().assocOperator001(this).equals(true);
        if (familiaNovedaddrvNumTitularesCond) {
            familiaNovedaddrvNumTitulares = getFamiliaNovedadRepository().assocOperator002(this);
        }
    }

    private void familiaNovedaddrvNumTitularesDerivationsDefault() throws SystemException {
        if (familiaNovedaddrvNumTitulares != null) return;
        // Default derivation
        // EFFECT   : COUNT( UsuarioNovedad ) WHERE (UsuarioNovedad.drvEsTitular = true AND UsuarioNovedad.EstadoBeneficiario.EsActivo = true AND (EXIST( UsuarioNovedad.TipoIdentificacionCD ) = false AND UsuarioNovedad.TipoIdentificacion.Codigo <> TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacion <> TitNumidentificacion) OR (EXIST( UsuarioNovedad.TipoIdentificacionCD ) = true AND UsuarioNovedad.TipoIdentificacionCD.Codigo <> TipoIdentificacion.Codigo AND UsuarioNovedad.NumIdentificacionCD <> TitNumidentificacion))
        familiaNovedaddrvNumTitulares = getFamiliaNovedadRepository().assocOperator005(this);
    }

    /**
     * Computes the value of the <code>familiaNovedaddrvTieneNuevoTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedaddrvTieneNuevoTitular</code> derived attribute.
     */
    public Boolean familiaNovedaddrvTieneNuevoTitularDerivations() throws SystemException {

        familiaNovedaddrvTieneNuevoTitular = null;

        familiaNovedaddrvTieneNuevoTitularDerivationsDefault();
        return familiaNovedaddrvTieneNuevoTitular;
    }

    private void familiaNovedaddrvTieneNuevoTitularDerivationsDefault() throws SystemException {
        if (familiaNovedaddrvTieneNuevoTitular != null) return;
        // Default derivation
        // EFFECT   : EXIST(NovedadCT)
        familiaNovedaddrvTieneNuevoTitular = getFamiliaNovedadRepository().assocOperator008(this);
    }

    /**
     * Computes the value of the <code>familiaNovedadTitDrvNombreCompleto</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedadTitDrvNombreCompleto</code> derived attribute.
     */
    public String familiaNovedadTitDrvNombreCompletoDerivations() throws SystemException {

        familiaNovedadTitDrvNombreCompleto = null;

        familiaNovedadTitDrvNombreCompletoDerivationsConditional1();
        familiaNovedadTitDrvNombreCompletoDerivationsConditional2();
        familiaNovedadTitDrvNombreCompletoDerivationsConditional3();
        familiaNovedadTitDrvNombreCompletoDerivationsDefault();
        return familiaNovedadTitDrvNombreCompleto;
    }

    private void familiaNovedadTitDrvNombreCompletoDerivationsConditional1() throws SystemException {
        if (familiaNovedadTitDrvNombreCompleto != null) return;
        // CONDITION: EXIST( NovedadCT ) = false AND TipoIdentificacion.NIT = false
        // EFFECT   : fuconcatenarConNulos(\"\", TitPrimerNombre) + fuconcatenarConNulos(\" \", TitSegundoNombre) + fuconcatenarConNulos(\" \", TitPrimerApellido) + fuconcatenarConNulos(\" \", TitSegundoApellido)
        boolean familiaNovedadTitDrvNombreCompletoCond = getFamiliaNovedadRepository().assocOperator009(this).equals(false) && this.getTipoIdentificacion().getTipoIdentificacionNIT().equals(false);
        if (familiaNovedadTitDrvNombreCompletoCond) {
            familiaNovedadTitDrvNombreCompleto = userFunctionsSrv.fuconcatenarConNulosFun("", this.getFamiliaNovedadTitPrimerNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFamiliaNovedadTitSegundoNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFamiliaNovedadTitPrimerApellido()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFamiliaNovedadTitSegundoApellido());
        }
    }

    private void familiaNovedadTitDrvNombreCompletoDerivationsConditional2() throws SystemException {
        if (familiaNovedadTitDrvNombreCompleto != null) return;
        // CONDITION: EXIST( NovedadCT ) = false AND TipoIdentificacion.NIT = true
        // EFFECT   : TitRazonSocial
        boolean familiaNovedadTitDrvNombreCompletoCond = getFamiliaNovedadRepository().assocOperator010(this).equals(false) && this.getTipoIdentificacion().getTipoIdentificacionNIT().equals(true);
        if (familiaNovedadTitDrvNombreCompletoCond) {
            familiaNovedadTitDrvNombreCompleto = this.getFamiliaNovedadTitRazonSocial();
        }
    }

    private void familiaNovedadTitDrvNombreCompletoDerivationsConditional3() throws SystemException {
        if (familiaNovedadTitDrvNombreCompleto != null) return;
        // CONDITION: EXIST( NovedadCT ) = true AND TipoIdentificacion.NIT = false
        // EFFECT   : fuconcatenarConNulos(\"\", NovedadCT.TitPrimerNombre) + fuconcatenarConNulos(\" \", NovedadCT.TitSegundoNombre) + fuconcatenarConNulos(\" \", NovedadCT.TitPrimerApellido) + fuconcatenarConNulos(\" \", NovedadCT.TitSegundoApellido)
        boolean familiaNovedadTitDrvNombreCompletoCond = getFamiliaNovedadRepository().assocOperator011(this).equals(true) && this.getTipoIdentificacion().getTipoIdentificacionNIT().equals(false);
        if (familiaNovedadTitDrvNombreCompletoCond) {
            familiaNovedadTitDrvNombreCompleto = userFunctionsSrv.fuconcatenarConNulosFun("", this.getNovedadCT().getNovedadCTTitPrimerNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getNovedadCT().getNovedadCTTitSegundoNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getNovedadCT().getNovedadCTTitPrimerApellido()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getNovedadCT().getNovedadCTTitSegundoApellido());
        }
    }

    private void familiaNovedadTitDrvNombreCompletoDerivationsDefault() {
        if (familiaNovedadTitDrvNombreCompleto != null) return;
        // Default derivation
        // EFFECT   : NovedadCT.TitRazonSocial
        familiaNovedadTitDrvNombreCompleto = this.getNovedadCT().getNovedadCTTitRazonSocial();
    }

    /**
     * Computes the value of the <code>familiaNovedadTitDrvIdentificacion</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedadTitDrvIdentificacion</code> derived attribute.
     */
    public String familiaNovedadTitDrvIdentificacionDerivations() throws SystemException {

        familiaNovedadTitDrvIdentificacion = null;

        familiaNovedadTitDrvIdentificacionDerivationsConditional1();
        familiaNovedadTitDrvIdentificacionDerivationsDefault();
        return familiaNovedadTitDrvIdentificacion;
    }

    private void familiaNovedadTitDrvIdentificacionDerivationsConditional1() throws SystemException {
        if (familiaNovedadTitDrvIdentificacion != null) return;
        // CONDITION: EXIST(NovedadCT) = FALSE
        // EFFECT   : fuconcatenarConNulos(\"\", TipoIdentificacion.NombreCorto) + fuconcatenarConNulos(\" \", TitNumidentificacion)
        boolean familiaNovedadTitDrvIdentificacionCond = getFamiliaNovedadRepository().assocOperator012(this).equals(false);
        if (familiaNovedadTitDrvIdentificacionCond) {
            familiaNovedadTitDrvIdentificacion = userFunctionsSrv.fuconcatenarConNulosFun("", this.getTipoIdentificacion().getTipoIdentificacionNombreCorto()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFamiliaNovedadTitNumidentificacion());
        }
    }

    private void familiaNovedadTitDrvIdentificacionDerivationsDefault() {
        if (familiaNovedadTitDrvIdentificacion != null) return;
        // Default derivation
        // EFFECT   : fuconcatenarConNulos(\"\", NovedadCT.TipoIdentificacion.NombreCorto) + fuconcatenarConNulos(\" \", NovedadCT.TitNumidentificacion)
        familiaNovedadTitDrvIdentificacion = userFunctionsSrv.fuconcatenarConNulosFun("", this.getNovedadCT().getTipoIdentificacion().getTipoIdentificacionNombreCorto()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getNovedadCT().getNovedadCTTitNumidentificacion());
    }

    /**
     * Computes the value of the <code>familiaNovedadTitDrvNombreAnterior</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedadTitDrvNombreAnterior</code> derived attribute.
     */
    public String familiaNovedadTitDrvNombreAnteriorDerivations() {

        familiaNovedadTitDrvNombreAnterior = null;

        familiaNovedadTitDrvNombreAnteriorDerivationsConditional1();
        familiaNovedadTitDrvNombreAnteriorDerivationsDefault();
        return familiaNovedadTitDrvNombreAnterior;
    }

    private void familiaNovedadTitDrvNombreAnteriorDerivationsConditional1() {
        if (familiaNovedadTitDrvNombreAnterior != null) return;
        // CONDITION: TipoIdentificacion.NIT = false
        // EFFECT   : fuconcatenarConNulos(\"\", TitPrimerNombre) + fuconcatenarConNulos(\" \", TitSegundoNombre) + fuconcatenarConNulos(\" \", TitPrimerApellido) + fuconcatenarConNulos(\" \", TitSegundoApellido)
        boolean familiaNovedadTitDrvNombreAnteriorCond = this.getTipoIdentificacion().getTipoIdentificacionNIT().equals(false);
        if (familiaNovedadTitDrvNombreAnteriorCond) {
            familiaNovedadTitDrvNombreAnterior = userFunctionsSrv.fuconcatenarConNulosFun("", this.getFamiliaNovedadTitPrimerNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFamiliaNovedadTitSegundoNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFamiliaNovedadTitPrimerApellido()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFamiliaNovedadTitSegundoApellido());
        }
    }

    private void familiaNovedadTitDrvNombreAnteriorDerivationsDefault() {
        if (familiaNovedadTitDrvNombreAnterior != null) return;
        // Default derivation
        // EFFECT   : TitRazonSocial
        familiaNovedadTitDrvNombreAnterior = this.getFamiliaNovedadTitRazonSocial();
    }

    /**
     * Computes the value of the <code>familiaNovedadDrvTieneNuevaDir</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedadDrvTieneNuevaDir</code> derived attribute.
     */
    public Boolean familiaNovedadDrvTieneNuevaDirDerivations() throws SystemException {

        familiaNovedadDrvTieneNuevaDir = null;

        familiaNovedadDrvTieneNuevaDirDerivationsDefault();
        return familiaNovedadDrvTieneNuevaDir;
    }

    private void familiaNovedadDrvTieneNuevaDirDerivationsDefault() throws SystemException {
        if (familiaNovedadDrvTieneNuevaDir != null) return;
        // Default derivation
        // EFFECT   : EXIST(NovedadMD)
        familiaNovedadDrvTieneNuevaDir = getFamiliaNovedadRepository().assocOperator013(this);
    }

    /**
     * Computes the value of the <code>familiaNovedadDrvTieneFirmaTit</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedadDrvTieneFirmaTit</code> derived attribute.
     */
    public Boolean familiaNovedadDrvTieneFirmaTitDerivations() throws SystemException {

        familiaNovedadDrvTieneFirmaTit = null;

        familiaNovedadDrvTieneFirmaTitDerivationsDefault();
        return familiaNovedadDrvTieneFirmaTit;
    }

    private void familiaNovedadDrvTieneFirmaTitDerivationsDefault() throws SystemException {
        if (familiaNovedadDrvTieneFirmaTit != null) return;
        // Default derivation
        // EFFECT   : EXIST(Firma)
        familiaNovedadDrvTieneFirmaTit = getFamiliaNovedadRepository().assocOperator014(this);
    }

    /**
     * Computes the value of the <code>familiaNovedadDrvTieneFirmaNuevoTit</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedadDrvTieneFirmaNuevoTit</code> derived attribute.
     */
    public Boolean familiaNovedadDrvTieneFirmaNuevoTitDerivations() throws SystemException {

        familiaNovedadDrvTieneFirmaNuevoTit = null;

        familiaNovedadDrvTieneFirmaNuevoTitDerivationsDefault();
        return familiaNovedadDrvTieneFirmaNuevoTit;
    }

    private void familiaNovedadDrvTieneFirmaNuevoTitDerivationsDefault() throws SystemException {
        if (familiaNovedadDrvTieneFirmaNuevoTit != null) return;
        // Default derivation
        // EFFECT   : EXIST(NovedadCT.Firma)
        familiaNovedadDrvTieneFirmaNuevoTit = getFamiliaNovedadRepository().assocOperator015(this);
    }

    /**
     * Computes the value of the <code>familiaNovedadDrvValidarCP1</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedadDrvValidarCP1</code> derived attribute.
     */
    public Boolean familiaNovedadDrvValidarCP1Derivations() throws SystemException {

        familiaNovedadDrvValidarCP1 = null;

        familiaNovedadDrvValidarCP1DerivationsConditional1();
        familiaNovedadDrvValidarCP1DerivationsConditional2();
        familiaNovedadDrvValidarCP1DerivationsDefault();
        return familiaNovedadDrvValidarCP1;
    }

    private void familiaNovedadDrvValidarCP1DerivationsConditional1() {
        if (familiaNovedadDrvValidarCP1 != null) return;
        // CONDITION: Solicitud.ContraTipoPersona = \"N\"
        // EFFECT   : TRUE
        boolean familiaNovedadDrvValidarCP1Cond = (this.getSolicitud().getSolicitudNovedadContraTipoPersona()).equals("N");
        if (familiaNovedadDrvValidarCP1Cond) {
            familiaNovedadDrvValidarCP1 = Boolean.TRUE;
        }
    }

    private void familiaNovedadDrvValidarCP1DerivationsConditional2() throws SystemException {
        if (familiaNovedadDrvValidarCP1 != null) return;
        // CONDITION: COUNT( UsuarioNovedad ) WHERE (UsuarioNovedad.Parentesco.EsTitular = TRUE AND UsuarioNovedad.drvEstaActivo = TRUE) >= 1
        // EFFECT   : TRUE
        boolean familiaNovedadDrvValidarCP1Cond = getFamiliaNovedadRepository().assocOperator016(this) >= Long.valueOf(1);
        if (familiaNovedadDrvValidarCP1Cond) {
            familiaNovedadDrvValidarCP1 = Boolean.TRUE;
        }
    }

    private void familiaNovedadDrvValidarCP1DerivationsDefault() {
        if (familiaNovedadDrvValidarCP1 != null) return;
        // Default derivation
        // EFFECT   : FALSE
        familiaNovedadDrvValidarCP1 = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>familiaNovedadDrvValidarCT1</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedadDrvValidarCT1</code> derived attribute.
     */
    public Boolean familiaNovedadDrvValidarCT1Derivations() throws SystemException {

        familiaNovedadDrvValidarCT1 = null;

        familiaNovedadDrvValidarCT1DerivationsConditional1();
        familiaNovedadDrvValidarCT1DerivationsConditional2();
        familiaNovedadDrvValidarCT1DerivationsDefault();
        return familiaNovedadDrvValidarCT1;
    }

    private void familiaNovedadDrvValidarCT1DerivationsConditional1() {
        if (familiaNovedadDrvValidarCT1 != null) return;
        // CONDITION: Solicitud.CtrTipoContrato <> 1 
        // EFFECT   : TRUE
        boolean familiaNovedadDrvValidarCT1Cond = !(this.getSolicitud().getSolicitudNovedadCtrTipoContrato()).equals(Long.valueOf(1));
        if (familiaNovedadDrvValidarCT1Cond) {
            familiaNovedadDrvValidarCT1 = Boolean.TRUE;
        }
    }

    private void familiaNovedadDrvValidarCT1DerivationsConditional2() throws SystemException {
        if (familiaNovedadDrvValidarCT1 != null) return;
        // CONDITION: EXIST( NovedadCT ) WHERE (NovedadCT.TipoIdentificacion.NIT = true) = false
        // EFFECT   : TRUE
        boolean familiaNovedadDrvValidarCT1Cond = getFamiliaNovedadRepository().assocOperator017(this).equals(false);
        if (familiaNovedadDrvValidarCT1Cond) {
            familiaNovedadDrvValidarCT1 = Boolean.TRUE;
        }
    }

    private void familiaNovedadDrvValidarCT1DerivationsDefault() {
        if (familiaNovedadDrvValidarCT1 != null) return;
        // Default derivation
        // EFFECT   : FALSE
        familiaNovedadDrvValidarCT1 = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>familiaNovedaddrvEdadUsuTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>familiaNovedaddrvEdadUsuTitular</code> derived attribute.
     */
    public Long familiaNovedaddrvEdadUsuTitularDerivations() throws SystemException {

        familiaNovedaddrvEdadUsuTitular = null;

        familiaNovedaddrvEdadUsuTitularDerivationsDefault();
        return familiaNovedaddrvEdadUsuTitular;
    }

    private void familiaNovedaddrvEdadUsuTitularDerivationsDefault() throws SystemException {
        if (familiaNovedaddrvEdadUsuTitular != null) return;
        // Default derivation
        // EFFECT   : SUM ( UsuarioNovedad.drvEdad ) WHERE (UsuarioNovedad.drvEsTitular = TRUE)
        familiaNovedaddrvEdadUsuTitular = getFamiliaNovedadRepository().assocOperator018(this);
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        familiaNovedadNumFamilia = Long.valueOf(0);
        familiaNovedadTitNumidentificacion = "";
        familiaNovedadTitPrimerNombre = null;
        familiaNovedadTitSegundoNombre = null;
        familiaNovedadTitPrimerApellido = null;
        familiaNovedadTitSegundoApellido = null;
        familiaNovedadTitRazonSocial = null;
        familiaNovedadTitTieneBeneficios = false;
        familiaNovedadFamActiva = false;
        usuarioNovedad = null;
        novedadCT = null;
        novedadMD = null;
        solicitud = null;
        tipoIdentificacion = null;
        firma = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
    }

    public FamiliaNovedadJpaRepository getFamiliaNovedadRepository() {
        return Arc.container().select(FamiliaNovedadJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return FamiliaNovedad.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return FamiliaNovedadConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedFamiliaNovedadNumFamilia = false;
    	values.put("familiaNovedadNumFamilia", getFamiliaNovedadNumFamilia());
    	modifiedFamiliaNovedadTitNumidentificacion = false;
    	values.put("familiaNovedadTitNumidentificacion", getFamiliaNovedadTitNumidentificacion());
    	modifiedFamiliaNovedadTitPrimerNombre = false;
    	values.put("familiaNovedadTitPrimerNombre", getFamiliaNovedadTitPrimerNombre());
    	modifiedFamiliaNovedadTitSegundoNombre = false;
    	values.put("familiaNovedadTitSegundoNombre", getFamiliaNovedadTitSegundoNombre());
    	modifiedFamiliaNovedadTitPrimerApellido = false;
    	values.put("familiaNovedadTitPrimerApellido", getFamiliaNovedadTitPrimerApellido());
    	modifiedFamiliaNovedadTitSegundoApellido = false;
    	values.put("familiaNovedadTitSegundoApellido", getFamiliaNovedadTitSegundoApellido());
    	modifiedFamiliaNovedadTitRazonSocial = false;
    	values.put("familiaNovedadTitRazonSocial", getFamiliaNovedadTitRazonSocial());
    	modifiedFamiliaNovedadTitTieneBeneficios = false;
    	values.put("familiaNovedadTitTieneBeneficios", getFamiliaNovedadTitTieneBeneficios());
    	modifiedFamiliaNovedadFamActiva = false;
    	values.put("familiaNovedadFamActiva", getFamiliaNovedadFamActiva());
    	modifiedUsuarioNovedad = false;
    	modifiedNovedadCT = false;
    	modifiedNovedadMD = false;
    	modifiedSolicitud = false;
    	modifiedTipoIdentificacion = false;
    	modifiedFirma = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            familiaNovedaddrvTieneUsuarioActivo = null;
            familiaNovedaddrvNumTitulares = null;
            familiaNovedaddrvTieneNuevoTitular = null;
            familiaNovedadTitDrvNombreCompleto = null;
            familiaNovedadTitDrvIdentificacion = null;
            familiaNovedadTitDrvNombreAnterior = null;
            familiaNovedadDrvTieneNuevaDir = null;
            familiaNovedadDrvTieneFirmaTit = null;
            familiaNovedadDrvTieneFirmaNuevoTit = null;
            familiaNovedadDrvValidarCP1 = null;
            familiaNovedadDrvValidarCT1 = null;
            familiaNovedaddrvEdadUsuTitular = null;
    }

    /**
     * Returns the <code>FamiliaNovedadOid</code> object that identifies this instance of <code>FamiliaNovedad</code>.
     * @return <code>FamiliaNovedadOid </code> object that identifies this instance of <code>FamiliaNovedad</code>
     */
	@Override
    public FamiliaNovedadOid getOid() {
        return new FamiliaNovedadOid(getFamiliaNovedadidFamiliaNovedad());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(FamiliaNovedadConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(FamiliaNovedadConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.FAMILIANOVEDAD)) {
            // Add this class
            activeFacets.add(Constants.FAMILIANOVEDAD);
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
            relatedInstance = buildFamiliaNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_NOVEDADMD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4NovedadMD(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4NovedadMD(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class)): NovedadMD.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
