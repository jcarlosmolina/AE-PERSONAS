package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.global.FamiliaNovedadConstants;
import com.keralty.aepersonas.global.FirmaConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.NovedadCTConstants;
import com.keralty.aepersonas.global.PaisConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.FamiliaNovedadOid;
import com.keralty.aepersonas.persistence.oid.FirmaOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.NovedadCTOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
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
 * Persistent representation of the <code>NovedadCT</code> model class.
 * <p>
 * Model Class: <code>NovedadCT</code><br>
 */
@Entity(name = NovedadCTConstants.CLASS_NAME)
@Table(name = NovedadCTConstants.TBL_NAME)
public class NovedadCT extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NovedadCT_Sequence")
    @SequenceGenerator(name="NovedadCT_Sequence", sequenceName="NovedadCT_Sequence", allocationSize=1)
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTIDNOVEDADCT )
    @JsonProperty(value="id_novedadct")
    private Long novedadCTidNovedadCT;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTTITNUMIDENTIFICACION )
    @JsonProperty(value="titnumidentificacion")
    private String novedadCTTitNumidentificacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTTitNumidentificacion;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTTITPRIMERNOMBRE )
    @JsonProperty(value="titprimernombre")
    private String novedadCTTitPrimerNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTTitPrimerNombre;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTTITSEGUNDONOMBRE )
    @JsonProperty(value="titsegundonombre")
    private String novedadCTTitSegundoNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTTitSegundoNombre;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTTITPRIMERAPELLIDO )
    @JsonProperty(value="titprimerapellido")
    private String novedadCTTitPrimerApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTTitPrimerApellido;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTTITSEGUNDOAPELLIDO )
    @JsonProperty(value="titsegundoapellido")
    private String novedadCTTitSegundoApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTTitSegundoApellido;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTTITRAZONSOCIAL )
    @JsonProperty(value="titrazonsocial")
    private String novedadCTTitRazonSocial;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTTitRazonSocial;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTTITTIENEBENEFICIOS )
    @JsonProperty(value="tittienebeneficios")
    private Boolean novedadCTTitTieneBeneficios;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTTitTieneBeneficios;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTFECHANACIMIENTO )
    @JsonProperty(value="fechanacimiento")
    private Date novedadCTFechaNacimiento;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTFechaNacimiento;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTGENERO )
    @JsonProperty(value="genero")
    private String novedadCTGenero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTGenero;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTINDICADOREXTRANJERO )
    @JsonProperty(value="indicadorextranjero")
    private Boolean novedadCTIndicadorExtranjero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTIndicadorExtranjero;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTTELEFONOFIJO )
    @JsonProperty(value="telefonofijo")
    private String novedadCTTelefonoFijo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTTelefonoFijo;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTTELEFONOCELULAR )
    @JsonProperty(value="telefonocelular")
    private String novedadCTTelefonoCelular;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTTelefonoCelular;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTCORREOELECTRONICO )
    @JsonProperty(value="correoelectronico")
    private String novedadCTCorreoElectronico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTCorreoElectronico;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTDIRECCIONCOMPLETA )
    @JsonProperty(value="direccioncompleta")
    private String novedadCTDireccionCompleta;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTDireccionCompleta;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTRURAL )
    @JsonProperty(value="rural")
    private Boolean novedadCTRural;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTRural;

    /** Class member attribute. */
    @Column(name = NovedadCTConstants.FLD_NOVEDADCTCODIGOCORE )
    @JsonProperty(value="codigocore")
    private Long novedadCTCodigoCORE;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTCodigoCORE;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadCTConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD, referencedColumnName=FamiliaNovedadConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD)
    })
    @JsonIgnore
    private FamiliaNovedad familiaNovedad;
    /** Related attribute. */
    @Column(name = NovedadCTConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD, insertable = false, updatable = false)
    private Long familiaNovedadidFamiliaNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadCTConstants.FLD_TIPOIDENTIFICACIONCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacion;
    /** Related attribute. */
    @Column(name = NovedadCTConstants.FLD_TIPOIDENTIFICACIONCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacion;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadCTConstants.FLD_FIRMAIDENTIFICADOR, referencedColumnName=FirmaConstants.FLD_FIRMAIDENTIFICADOR)
    })
    @JsonIgnore
    private Firma firma;
    /** Related attribute. */
    @Column(name = NovedadCTConstants.FLD_FIRMAIDENTIFICADOR, insertable = false, updatable = false)
    private Long firmaIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFirma;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadCTConstants.FLD_MUNICIPIOMUNICIPIONACCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipioNac;
    /** Related attribute. */
    @Column(name = NovedadCTConstants.FLD_MUNICIPIOMUNICIPIONACCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioNacCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioNac;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadCTConstants.FLD_MUNICIPIOMUNICIPIORESCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipioRes;
    /** Related attribute. */
    @Column(name = NovedadCTConstants.FLD_MUNICIPIOMUNICIPIORESCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioResCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioRes;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadCTConstants.FLD_DEPARTAMENTODEPARTAMENTONACCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamentoNac;
    /** Related attribute. */
    @Column(name = NovedadCTConstants.FLD_DEPARTAMENTODEPARTAMENTONACCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoNacCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoNac;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadCTConstants.FLD_DEPARTAMENTODEPARTAMENTORESCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamentoRes;
    /** Related attribute. */
    @Column(name = NovedadCTConstants.FLD_DEPARTAMENTODEPARTAMENTORESCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoResCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoRes;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadCTConstants.FLD_PAISPAISCODIGO, referencedColumnName=PaisConstants.FLD_PAISCODIGO)
    })
    @JsonIgnore
    private Pais pais;
    /** Related attribute. */
    @Column(name = NovedadCTConstants.FLD_PAISPAISCODIGO, insertable = false, updatable = false)
    private String paisPaisCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPais;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public NovedadCT() {
        novedadCTidNovedadCT = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>NovedadCT</code>.
     * @param oid Object Identifier of the instance of <code>NovedadCT</code> to be created.
     * @throws SystemException
     */
    public NovedadCT(NovedadCTOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            novedadCTidNovedadCT = oid.getNovedadCTidNovedadCT();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>novedadCTidNovedadCT</code> attribute<br>in class <code>NovedadCT</code>.
     * This is part of the identification for this class, which depends on the identification of <code>NovedadCT</code>
     * @return The value of the <code>novedadCTidNovedadCT</code> attribute<br>in class <code>NovedadCT</code>.
     */
    public Long getNovedadCTidNovedadCT() {
        return novedadCTidNovedadCT;
    }

    /**
     * Sets the value of the <code>novedadCTidNovedadCT</code> attribute<br>in class <code>NovedadCT</code>.
     * This is part of the identification for this class, which depends on the identification of <code>NovedadCT</code>
     * @param novedadCTidNovedadCT The new value of the <code>novedadCTidNovedadCT</code> attribute<br>in class <code>NovedadCT</code>.
     */
    public void setNovedadCTidNovedadCT(Long novedadCTidNovedadCT) {
        this.novedadCTidNovedadCT = novedadCTidNovedadCT;
    }

   /**
    * Returns the value of the <code>novedadCTTitNumidentificacion</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitNumidentificacion</code>. Constant String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTTitNumidentificacion</code> attribute.
    */

    public String getNovedadCTTitNumidentificacion()  {
    	String value;
        value =  novedadCTTitNumidentificacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTTitNumidentificacion</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitNumidentificacion</code>. Constant String Size=60<br>
    * Comments: <br>
    * @param novedadCTTitNumidentificacion The new value of the <code>novedadCTTitNumidentificacion</code> attribute.
    */
    public void setNovedadCTTitNumidentificacion (String novedadCTTitNumidentificacion) {
        modifiedNovedadCTTitNumidentificacion = true;
        this.novedadCTTitNumidentificacion = novedadCTTitNumidentificacion;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTTitNumidentificacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTTitNumidentificacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTTitNumidentificacion() {
        return modifiedNovedadCTTitNumidentificacion;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTTitNumidentificacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTTitNumidentificacion</code>.
    */
    public void setModifiedNovedadCTTitNumidentificacion(boolean modified) {
        this.modifiedNovedadCTTitNumidentificacion = modified;
    }

   /**
    * Returns the value of the <code>novedadCTTitPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitPrimerNombre</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTTitPrimerNombre</code> attribute.
    */

    public String getNovedadCTTitPrimerNombre()  {
    	String value;
        value =  novedadCTTitPrimerNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTTitPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitPrimerNombre</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param novedadCTTitPrimerNombre The new value of the <code>novedadCTTitPrimerNombre</code> attribute.
    */
    public void setNovedadCTTitPrimerNombre (String novedadCTTitPrimerNombre) {
        modifiedNovedadCTTitPrimerNombre = true;
        this.novedadCTTitPrimerNombre = novedadCTTitPrimerNombre;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTTitPrimerNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTTitPrimerNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTTitPrimerNombre() {
        return modifiedNovedadCTTitPrimerNombre;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTTitPrimerNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTTitPrimerNombre</code>.
    */
    public void setModifiedNovedadCTTitPrimerNombre(boolean modified) {
        this.modifiedNovedadCTTitPrimerNombre = modified;
    }

   /**
    * Returns the value of the <code>novedadCTTitSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitSegundoNombre</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTTitSegundoNombre</code> attribute.
    */

    public String getNovedadCTTitSegundoNombre()  {
    	String value;
        value =  novedadCTTitSegundoNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTTitSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitSegundoNombre</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param novedadCTTitSegundoNombre The new value of the <code>novedadCTTitSegundoNombre</code> attribute.
    */
    public void setNovedadCTTitSegundoNombre (String novedadCTTitSegundoNombre) {
        modifiedNovedadCTTitSegundoNombre = true;
        this.novedadCTTitSegundoNombre = novedadCTTitSegundoNombre;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTTitSegundoNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTTitSegundoNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTTitSegundoNombre() {
        return modifiedNovedadCTTitSegundoNombre;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTTitSegundoNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTTitSegundoNombre</code>.
    */
    public void setModifiedNovedadCTTitSegundoNombre(boolean modified) {
        this.modifiedNovedadCTTitSegundoNombre = modified;
    }

   /**
    * Returns the value of the <code>novedadCTTitPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitPrimerApellido</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTTitPrimerApellido</code> attribute.
    */

    public String getNovedadCTTitPrimerApellido()  {
    	String value;
        value =  novedadCTTitPrimerApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTTitPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitPrimerApellido</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param novedadCTTitPrimerApellido The new value of the <code>novedadCTTitPrimerApellido</code> attribute.
    */
    public void setNovedadCTTitPrimerApellido (String novedadCTTitPrimerApellido) {
        modifiedNovedadCTTitPrimerApellido = true;
        this.novedadCTTitPrimerApellido = novedadCTTitPrimerApellido;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTTitPrimerApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTTitPrimerApellido</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTTitPrimerApellido() {
        return modifiedNovedadCTTitPrimerApellido;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTTitPrimerApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTTitPrimerApellido</code>.
    */
    public void setModifiedNovedadCTTitPrimerApellido(boolean modified) {
        this.modifiedNovedadCTTitPrimerApellido = modified;
    }

   /**
    * Returns the value of the <code>novedadCTTitSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitSegundoApellido</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTTitSegundoApellido</code> attribute.
    */

    public String getNovedadCTTitSegundoApellido()  {
    	String value;
        value =  novedadCTTitSegundoApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTTitSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitSegundoApellido</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param novedadCTTitSegundoApellido The new value of the <code>novedadCTTitSegundoApellido</code> attribute.
    */
    public void setNovedadCTTitSegundoApellido (String novedadCTTitSegundoApellido) {
        modifiedNovedadCTTitSegundoApellido = true;
        this.novedadCTTitSegundoApellido = novedadCTTitSegundoApellido;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTTitSegundoApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTTitSegundoApellido</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTTitSegundoApellido() {
        return modifiedNovedadCTTitSegundoApellido;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTTitSegundoApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTTitSegundoApellido</code>.
    */
    public void setModifiedNovedadCTTitSegundoApellido(boolean modified) {
        this.modifiedNovedadCTTitSegundoApellido = modified;
    }

   /**
    * Returns the value of the <code>novedadCTTitRazonSocial</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitRazonSocial</code>. Constant String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTTitRazonSocial</code> attribute.
    */

    public String getNovedadCTTitRazonSocial()  {
    	String value;
        value =  novedadCTTitRazonSocial;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTTitRazonSocial</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitRazonSocial</code>. Constant String Size=200<br>
    * Comments: <br>
    * @param novedadCTTitRazonSocial The new value of the <code>novedadCTTitRazonSocial</code> attribute.
    */
    public void setNovedadCTTitRazonSocial (String novedadCTTitRazonSocial) {
        modifiedNovedadCTTitRazonSocial = true;
        this.novedadCTTitRazonSocial = novedadCTTitRazonSocial;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTTitRazonSocial</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTTitRazonSocial</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTTitRazonSocial() {
        return modifiedNovedadCTTitRazonSocial;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTTitRazonSocial</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTTitRazonSocial</code>.
    */
    public void setModifiedNovedadCTTitRazonSocial(boolean modified) {
        this.modifiedNovedadCTTitRazonSocial = modified;
    }

   /**
    * Returns the value of the <code>novedadCTTitTieneBeneficios</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitTieneBeneficios</code>. Constant Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>novedadCTTitTieneBeneficios</code> attribute.
    */

    public Boolean getNovedadCTTitTieneBeneficios()  {
    	Boolean value;
        value =  novedadCTTitTieneBeneficios;
        return value;
    }

   /**
    * Sets the value of the <code>novedadCTTitTieneBeneficios</code> attribute.<br>
    * Model Attribute: <code>novedadCTTitTieneBeneficios</code>. Constant Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param novedadCTTitTieneBeneficios The new value of the <code>novedadCTTitTieneBeneficios</code> attribute.
    */
    public void setNovedadCTTitTieneBeneficios (Boolean novedadCTTitTieneBeneficios) {
        modifiedNovedadCTTitTieneBeneficios = true;
        this.novedadCTTitTieneBeneficios = novedadCTTitTieneBeneficios;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTTitTieneBeneficios</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTTitTieneBeneficios</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTTitTieneBeneficios() {
        return modifiedNovedadCTTitTieneBeneficios;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTTitTieneBeneficios</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTTitTieneBeneficios</code>.
    */
    public void setModifiedNovedadCTTitTieneBeneficios(boolean modified) {
        this.modifiedNovedadCTTitTieneBeneficios = modified;
    }

   /**
    * Returns the value of the <code>novedadCTFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>novedadCTFechaNacimiento</code>. Constant Date<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTFechaNacimiento</code> attribute.
    */

    public Date getNovedadCTFechaNacimiento()  {
    	Date value;
        value =  novedadCTFechaNacimiento;
        return value;
    }

   /**
    * Sets the value of the <code>novedadCTFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>novedadCTFechaNacimiento</code>. Constant Date<br>
    * Comments: <br>
    * @param novedadCTFechaNacimiento The new value of the <code>novedadCTFechaNacimiento</code> attribute.
    */
    public void setNovedadCTFechaNacimiento (Date novedadCTFechaNacimiento) {
        modifiedNovedadCTFechaNacimiento = true;
        this.novedadCTFechaNacimiento = novedadCTFechaNacimiento;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTFechaNacimiento</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTFechaNacimiento</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTFechaNacimiento() {
        return modifiedNovedadCTFechaNacimiento;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTFechaNacimiento</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTFechaNacimiento</code>.
    */
    public void setModifiedNovedadCTFechaNacimiento(boolean modified) {
        this.modifiedNovedadCTFechaNacimiento = modified;
    }

   /**
    * Returns the value of the <code>novedadCTGenero</code> attribute.<br>
    * Model Attribute: <code>novedadCTGenero</code>. Constant String Size=1<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTGenero</code> attribute.
    */

    public String getNovedadCTGenero()  {
    	String value;
        value =  novedadCTGenero;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTGenero</code> attribute.<br>
    * Model Attribute: <code>novedadCTGenero</code>. Constant String Size=1<br>
    * Comments: <br>
    * @param novedadCTGenero The new value of the <code>novedadCTGenero</code> attribute.
    */
    public void setNovedadCTGenero (String novedadCTGenero) {
        modifiedNovedadCTGenero = true;
        this.novedadCTGenero = novedadCTGenero;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTGenero</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTGenero</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTGenero() {
        return modifiedNovedadCTGenero;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTGenero</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTGenero</code>.
    */
    public void setModifiedNovedadCTGenero(boolean modified) {
        this.modifiedNovedadCTGenero = modified;
    }

   /**
    * Returns the value of the <code>novedadCTIndicadorExtranjero</code> attribute.<br>
    * Model Attribute: <code>novedadCTIndicadorExtranjero</code>. Constant Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>novedadCTIndicadorExtranjero</code> attribute.
    */

    public Boolean getNovedadCTIndicadorExtranjero()  {
    	Boolean value;
        value =  novedadCTIndicadorExtranjero;
        return value;
    }

   /**
    * Sets the value of the <code>novedadCTIndicadorExtranjero</code> attribute.<br>
    * Model Attribute: <code>novedadCTIndicadorExtranjero</code>. Constant Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param novedadCTIndicadorExtranjero The new value of the <code>novedadCTIndicadorExtranjero</code> attribute.
    */
    public void setNovedadCTIndicadorExtranjero (Boolean novedadCTIndicadorExtranjero) {
        modifiedNovedadCTIndicadorExtranjero = true;
        this.novedadCTIndicadorExtranjero = novedadCTIndicadorExtranjero;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTIndicadorExtranjero</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTIndicadorExtranjero</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTIndicadorExtranjero() {
        return modifiedNovedadCTIndicadorExtranjero;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTIndicadorExtranjero</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTIndicadorExtranjero</code>.
    */
    public void setModifiedNovedadCTIndicadorExtranjero(boolean modified) {
        this.modifiedNovedadCTIndicadorExtranjero = modified;
    }

   /**
    * Returns the value of the <code>novedadCTTelefonoFijo</code> attribute.<br>
    * Model Attribute: <code>novedadCTTelefonoFijo</code>. Constant String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTTelefonoFijo</code> attribute.
    */

    public String getNovedadCTTelefonoFijo()  {
    	String value;
        value =  novedadCTTelefonoFijo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTTelefonoFijo</code> attribute.<br>
    * Model Attribute: <code>novedadCTTelefonoFijo</code>. Constant String Size=15<br>
    * Comments: <br>
    * @param novedadCTTelefonoFijo The new value of the <code>novedadCTTelefonoFijo</code> attribute.
    */
    public void setNovedadCTTelefonoFijo (String novedadCTTelefonoFijo) {
        modifiedNovedadCTTelefonoFijo = true;
        this.novedadCTTelefonoFijo = novedadCTTelefonoFijo;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTTelefonoFijo</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTTelefonoFijo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTTelefonoFijo() {
        return modifiedNovedadCTTelefonoFijo;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTTelefonoFijo</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTTelefonoFijo</code>.
    */
    public void setModifiedNovedadCTTelefonoFijo(boolean modified) {
        this.modifiedNovedadCTTelefonoFijo = modified;
    }

   /**
    * Returns the value of the <code>novedadCTTelefonoCelular</code> attribute.<br>
    * Model Attribute: <code>novedadCTTelefonoCelular</code>. Constant String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTTelefonoCelular</code> attribute.
    */

    public String getNovedadCTTelefonoCelular()  {
    	String value;
        value =  novedadCTTelefonoCelular;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTTelefonoCelular</code> attribute.<br>
    * Model Attribute: <code>novedadCTTelefonoCelular</code>. Constant String Size=15<br>
    * Comments: <br>
    * @param novedadCTTelefonoCelular The new value of the <code>novedadCTTelefonoCelular</code> attribute.
    */
    public void setNovedadCTTelefonoCelular (String novedadCTTelefonoCelular) {
        modifiedNovedadCTTelefonoCelular = true;
        this.novedadCTTelefonoCelular = novedadCTTelefonoCelular;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTTelefonoCelular</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTTelefonoCelular</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTTelefonoCelular() {
        return modifiedNovedadCTTelefonoCelular;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTTelefonoCelular</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTTelefonoCelular</code>.
    */
    public void setModifiedNovedadCTTelefonoCelular(boolean modified) {
        this.modifiedNovedadCTTelefonoCelular = modified;
    }

   /**
    * Returns the value of the <code>novedadCTCorreoElectronico</code> attribute.<br>
    * Model Attribute: <code>novedadCTCorreoElectronico</code>. Constant String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTCorreoElectronico</code> attribute.
    */

    public String getNovedadCTCorreoElectronico()  {
    	String value;
        value =  novedadCTCorreoElectronico;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTCorreoElectronico</code> attribute.<br>
    * Model Attribute: <code>novedadCTCorreoElectronico</code>. Constant String Size=100<br>
    * Comments: <br>
    * @param novedadCTCorreoElectronico The new value of the <code>novedadCTCorreoElectronico</code> attribute.
    */
    public void setNovedadCTCorreoElectronico (String novedadCTCorreoElectronico) {
        modifiedNovedadCTCorreoElectronico = true;
        this.novedadCTCorreoElectronico = novedadCTCorreoElectronico;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTCorreoElectronico</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTCorreoElectronico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTCorreoElectronico() {
        return modifiedNovedadCTCorreoElectronico;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTCorreoElectronico</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTCorreoElectronico</code>.
    */
    public void setModifiedNovedadCTCorreoElectronico(boolean modified) {
        this.modifiedNovedadCTCorreoElectronico = modified;
    }

   /**
    * Returns the value of the <code>novedadCTDireccionCompleta</code> attribute.<br>
    * Model Attribute: <code>novedadCTDireccionCompleta</code>. Constant String Size=250<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTDireccionCompleta</code> attribute.
    */

    public String getNovedadCTDireccionCompleta()  {
    	String value;
        value =  novedadCTDireccionCompleta;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadCTDireccionCompleta</code> attribute.<br>
    * Model Attribute: <code>novedadCTDireccionCompleta</code>. Constant String Size=250<br>
    * Comments: <br>
    * @param novedadCTDireccionCompleta The new value of the <code>novedadCTDireccionCompleta</code> attribute.
    */
    public void setNovedadCTDireccionCompleta (String novedadCTDireccionCompleta) {
        modifiedNovedadCTDireccionCompleta = true;
        this.novedadCTDireccionCompleta = novedadCTDireccionCompleta;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTDireccionCompleta</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTDireccionCompleta</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTDireccionCompleta() {
        return modifiedNovedadCTDireccionCompleta;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTDireccionCompleta</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTDireccionCompleta</code>.
    */
    public void setModifiedNovedadCTDireccionCompleta(boolean modified) {
        this.modifiedNovedadCTDireccionCompleta = modified;
    }

   /**
    * Returns the value of the <code>novedadCTRural</code> attribute.<br>
    * Model Attribute: <code>novedadCTRural</code>. Constant Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>novedadCTRural</code> attribute.
    */

    public Boolean getNovedadCTRural()  {
    	Boolean value;
        value =  novedadCTRural;
        return value;
    }

   /**
    * Sets the value of the <code>novedadCTRural</code> attribute.<br>
    * Model Attribute: <code>novedadCTRural</code>. Constant Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param novedadCTRural The new value of the <code>novedadCTRural</code> attribute.
    */
    public void setNovedadCTRural (Boolean novedadCTRural) {
        modifiedNovedadCTRural = true;
        this.novedadCTRural = novedadCTRural;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTRural</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTRural</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTRural() {
        return modifiedNovedadCTRural;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTRural</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTRural</code>.
    */
    public void setModifiedNovedadCTRural(boolean modified) {
        this.modifiedNovedadCTRural = modified;
    }

   /**
    * Returns the value of the <code>novedadCTCodigoCORE</code> attribute.<br>
    * Model Attribute: <code>novedadCTCodigoCORE</code>. Constant Int<br>
    * Comments: <br>
    * @return The value of the <code>novedadCTCodigoCORE</code> attribute.
    */

    public Long getNovedadCTCodigoCORE()  {
    	Long value;
        value =  novedadCTCodigoCORE;
        return value;
    }

   /**
    * Sets the value of the <code>novedadCTCodigoCORE</code> attribute.<br>
    * Model Attribute: <code>novedadCTCodigoCORE</code>. Constant Int<br>
    * Comments: <br>
    * @param novedadCTCodigoCORE The new value of the <code>novedadCTCodigoCORE</code> attribute.
    */
    public void setNovedadCTCodigoCORE (Long novedadCTCodigoCORE) {
        modifiedNovedadCTCodigoCORE = true;
        this.novedadCTCodigoCORE = novedadCTCodigoCORE;
    }

   /**
    * Returns the value of the <code>modifiedNovedadCTCodigoCORE</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadCTCodigoCORE</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadCTCodigoCORE() {
        return modifiedNovedadCTCodigoCORE;
    }

   /**
    * Sets the value of the <code>modifiedNovedadCTCodigoCORE</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadCTCodigoCORE</code>.
    */
    public void setModifiedNovedadCTCodigoCORE(boolean modified) {
        this.modifiedNovedadCTCodigoCORE = modified;
    }

    /**
     * Returns the instance of <code>FamiliaNovedad</code> related through the <code>FamiliaNovedad</code> role.
     * Model Relationship:
     * <code>[FamiliaNovedad] FamiliaNovedad 1:1  ------ 0:1  NovedadCT [NovedadCT]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>FamiliaNovedad</code> related through the <code>FamiliaNovedad</code> role.
     */
    @JsonIgnore
    public FamiliaNovedad getFamiliaNovedad() {
        return familiaNovedad;
    }

    /**
     * Adds an instance of <code>FamiliaNovedad</code> related through the <code>FamiliaNovedad</code> role.
     * @param familiaNovedad The instance to add to the <code>FamiliaNovedad</code> role.
     */
    public void add2FamiliaNovedad(FamiliaNovedad familiaNovedad) {
        if (familiaNovedad == null || familiaNovedad.isNull()) {
            this.modifiedFamiliaNovedad = true;
            this.familiaNovedadidFamiliaNovedad = null;
        } else {
            this.familiaNovedadidFamiliaNovedad = familiaNovedad.getFamiliaNovedadidFamiliaNovedad();
        }
        this.familiaNovedad = (familiaNovedad == null  || familiaNovedad.isNull() ? null : familiaNovedad);
    }

   /**
    * This method gets the attribute value <code>modifiedFamiliaNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFamiliaNovedad</code> has been modified.
    */
    public boolean isModifiedFamiliaNovedad(){
        return modifiedFamiliaNovedad;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacion 1:1  ------ 0:M  NovedadesCT [NovedadCT]</code>
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
     * <code>[Firma] Firma 0:1  ------ 0:1  NovedadesCT [NovedadCT]</code>
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
     * Returns the instance of <code>Municipio</code> related through the <code>MunicipioNac</code> role.
     * Model Relationship:
     * <code>[Municipio] MunicipioNac 0:1  ------ 0:M  NovedadCTNac [NovedadCT]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>MunicipioNac</code> role.
     */
    @JsonIgnore
    public Municipio getMunicipioNac() {
        return municipioNac;
    }

    /**
     * Adds an instance of <code>Municipio</code> related through the <code>MunicipioNac</code> role.
     * @param municipioNac The instance to add to the <code>MunicipioNac</code> role.
     */
    public void add2MunicipioNac(Municipio municipioNac) {
        if (municipioNac == null || municipioNac.isNull()) {
            this.modifiedMunicipioNac = true;
            this.municipioMunicipioNacCodigo = null;
        } else {
            this.municipioMunicipioNacCodigo = municipioNac.getMunicipioCodigo();
        }
        this.municipioNac = (municipioNac == null  || municipioNac.isNull() ? null : municipioNac);
    }

   /**
    * This method gets the attribute value <code>modifiedMunicipioNac</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMunicipioNac</code> has been modified.
    */
    public boolean isModifiedMunicipioNac(){
        return modifiedMunicipioNac;
    }

    /**
     * Returns the instance of <code>Municipio</code> related through the <code>MunicipioRes</code> role.
     * Model Relationship:
     * <code>[Municipio] MunicipioRes 0:1  ------ 0:M  NovedadCTRes [NovedadCT]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>MunicipioRes</code> role.
     */
    @JsonIgnore
    public Municipio getMunicipioRes() {
        return municipioRes;
    }

    /**
     * Adds an instance of <code>Municipio</code> related through the <code>MunicipioRes</code> role.
     * @param municipioRes The instance to add to the <code>MunicipioRes</code> role.
     */
    public void add2MunicipioRes(Municipio municipioRes) {
        if (municipioRes == null || municipioRes.isNull()) {
            this.modifiedMunicipioRes = true;
            this.municipioMunicipioResCodigo = null;
        } else {
            this.municipioMunicipioResCodigo = municipioRes.getMunicipioCodigo();
        }
        this.municipioRes = (municipioRes == null  || municipioRes.isNull() ? null : municipioRes);
    }

   /**
    * This method gets the attribute value <code>modifiedMunicipioRes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMunicipioRes</code> has been modified.
    */
    public boolean isModifiedMunicipioRes(){
        return modifiedMunicipioRes;
    }

    /**
     * Returns the instance of <code>Departamento</code> related through the <code>DepartamentoNac</code> role.
     * Model Relationship:
     * <code>[Departamento] DepartamentoNac 0:1  ------ 0:M  NovedadCTNac [NovedadCT]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Departamento</code> related through the <code>DepartamentoNac</code> role.
     */
    @JsonIgnore
    public Departamento getDepartamentoNac() {
        return departamentoNac;
    }

    /**
     * Adds an instance of <code>Departamento</code> related through the <code>DepartamentoNac</code> role.
     * @param departamentoNac The instance to add to the <code>DepartamentoNac</code> role.
     */
    public void add2DepartamentoNac(Departamento departamentoNac) {
        if (departamentoNac == null || departamentoNac.isNull()) {
            this.modifiedDepartamentoNac = true;
            this.departamentoDepartamentoNacCodigo = null;
        } else {
            this.departamentoDepartamentoNacCodigo = departamentoNac.getDepartamentoCodigo();
        }
        this.departamentoNac = (departamentoNac == null  || departamentoNac.isNull() ? null : departamentoNac);
    }

   /**
    * This method gets the attribute value <code>modifiedDepartamentoNac</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDepartamentoNac</code> has been modified.
    */
    public boolean isModifiedDepartamentoNac(){
        return modifiedDepartamentoNac;
    }

    /**
     * Returns the instance of <code>Departamento</code> related through the <code>DepartamentoRes</code> role.
     * Model Relationship:
     * <code>[Departamento] DepartamentoRes 0:1  ------ 0:M  NovedadCTRes [NovedadCT]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Departamento</code> related through the <code>DepartamentoRes</code> role.
     */
    @JsonIgnore
    public Departamento getDepartamentoRes() {
        return departamentoRes;
    }

    /**
     * Adds an instance of <code>Departamento</code> related through the <code>DepartamentoRes</code> role.
     * @param departamentoRes The instance to add to the <code>DepartamentoRes</code> role.
     */
    public void add2DepartamentoRes(Departamento departamentoRes) {
        if (departamentoRes == null || departamentoRes.isNull()) {
            this.modifiedDepartamentoRes = true;
            this.departamentoDepartamentoResCodigo = null;
        } else {
            this.departamentoDepartamentoResCodigo = departamentoRes.getDepartamentoCodigo();
        }
        this.departamentoRes = (departamentoRes == null  || departamentoRes.isNull() ? null : departamentoRes);
    }

   /**
    * This method gets the attribute value <code>modifiedDepartamentoRes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDepartamentoRes</code> has been modified.
    */
    public boolean isModifiedDepartamentoRes(){
        return modifiedDepartamentoRes;
    }

    /**
     * Returns the instance of <code>Pais</code> related through the <code>Pais</code> role.
     * Model Relationship:
     * <code>[Pais] Pais 0:1  ------ 0:M  NovedadCT [NovedadCT]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Pais</code> related through the <code>Pais</code> role.
     */
    @JsonIgnore
    public Pais getPais() {
        return pais;
    }

    /**
     * Adds an instance of <code>Pais</code> related through the <code>Pais</code> role.
     * @param pais The instance to add to the <code>Pais</code> role.
     */
    public void add2Pais(Pais pais) {
        if (pais == null || pais.isNull()) {
            this.modifiedPais = true;
            this.paisPaisCodigo = null;
        } else {
            this.paisPaisCodigo = pais.getPaisCodigo();
        }
        this.pais = (pais == null  || pais.isNull() ? null : pais);
    }

   /**
    * This method gets the attribute value <code>modifiedPais</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPais</code> has been modified.
    */
    public boolean isModifiedPais(){
        return modifiedPais;
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
        novedadCTTitNumidentificacion = "";
        novedadCTTitPrimerNombre = null;
        novedadCTTitSegundoNombre = null;
        novedadCTTitPrimerApellido = null;
        novedadCTTitSegundoApellido = null;
        novedadCTTitRazonSocial = null;
        novedadCTTitTieneBeneficios = false;
        novedadCTFechaNacimiento = null;
        novedadCTGenero = null;
        novedadCTIndicadorExtranjero = null;
        novedadCTTelefonoFijo = null;
        novedadCTTelefonoCelular = null;
        novedadCTCorreoElectronico = null;
        novedadCTDireccionCompleta = null;
        novedadCTRural = null;
        novedadCTCodigoCORE = null;
        familiaNovedad = null;
        tipoIdentificacion = null;
        firma = null;
        municipioNac = null;
        municipioRes = null;
        departamentoNac = null;
        departamentoRes = null;
        pais = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return NovedadCT.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return NovedadCTConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedNovedadCTTitNumidentificacion = false;
    	values.put("novedadCTTitNumidentificacion", getNovedadCTTitNumidentificacion());
    	modifiedNovedadCTTitPrimerNombre = false;
    	values.put("novedadCTTitPrimerNombre", getNovedadCTTitPrimerNombre());
    	modifiedNovedadCTTitSegundoNombre = false;
    	values.put("novedadCTTitSegundoNombre", getNovedadCTTitSegundoNombre());
    	modifiedNovedadCTTitPrimerApellido = false;
    	values.put("novedadCTTitPrimerApellido", getNovedadCTTitPrimerApellido());
    	modifiedNovedadCTTitSegundoApellido = false;
    	values.put("novedadCTTitSegundoApellido", getNovedadCTTitSegundoApellido());
    	modifiedNovedadCTTitRazonSocial = false;
    	values.put("novedadCTTitRazonSocial", getNovedadCTTitRazonSocial());
    	modifiedNovedadCTTitTieneBeneficios = false;
    	values.put("novedadCTTitTieneBeneficios", getNovedadCTTitTieneBeneficios());
    	modifiedNovedadCTFechaNacimiento = false;
    	values.put("novedadCTFechaNacimiento", getNovedadCTFechaNacimiento());
    	modifiedNovedadCTGenero = false;
    	values.put("novedadCTGenero", getNovedadCTGenero());
    	modifiedNovedadCTIndicadorExtranjero = false;
    	values.put("novedadCTIndicadorExtranjero", getNovedadCTIndicadorExtranjero());
    	modifiedNovedadCTTelefonoFijo = false;
    	values.put("novedadCTTelefonoFijo", getNovedadCTTelefonoFijo());
    	modifiedNovedadCTTelefonoCelular = false;
    	values.put("novedadCTTelefonoCelular", getNovedadCTTelefonoCelular());
    	modifiedNovedadCTCorreoElectronico = false;
    	values.put("novedadCTCorreoElectronico", getNovedadCTCorreoElectronico());
    	modifiedNovedadCTDireccionCompleta = false;
    	values.put("novedadCTDireccionCompleta", getNovedadCTDireccionCompleta());
    	modifiedNovedadCTRural = false;
    	values.put("novedadCTRural", getNovedadCTRural());
    	modifiedNovedadCTCodigoCORE = false;
    	values.put("novedadCTCodigoCORE", getNovedadCTCodigoCORE());
    	modifiedFamiliaNovedad = false;
    	modifiedTipoIdentificacion = false;
    	modifiedFirma = false;
    	modifiedMunicipioNac = false;
    	modifiedMunicipioRes = false;
    	modifiedDepartamentoNac = false;
    	modifiedDepartamentoRes = false;
    	modifiedPais = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>NovedadCTOid</code> object that identifies this instance of <code>NovedadCT</code>.
     * @return <code>NovedadCTOid </code> object that identifies this instance of <code>NovedadCT</code>
     */
	@Override
    public NovedadCTOid getOid() {
        return new NovedadCTOid(getNovedadCTidNovedadCT());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(NovedadCTConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(NovedadCTConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.NOVEDADCT)) {
            // Add this class
            activeFacets.add(Constants.NOVEDADCT);
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
            relatedInstance = buildNovedadCTRelatedInstance(relatedInstanceJsonOid);
        }
        if (NovedadCTConstants.ROLE_NAME_FAMILIANOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_MUNICIPIONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || NovedadCTConstants.ROLE_NAME_MUNICIPIORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_DEPARTAMENTONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || NovedadCTConstants.ROLE_NAME_DEPARTAMENTORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_PAIS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildNovedadCTRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
