package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.BeneficiarioCConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratoCConstants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.global.EstadoCivilConstants;
import com.keralty.aepersonas.global.EstadoPersonaConstants;
import com.keralty.aepersonas.global.FamiliaCConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.TipoEntidadCConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.TipoInstitucionCConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionCOid;
import com.keralty.aepersonas.persistence.oid.DirSucursalCOid;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
import com.keralty.aepersonas.persistence.oid.FamiliaCOid;
import com.keralty.aepersonas.persistence.oid.MarcaMedicaCOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PreexistenciaCOid;
import com.keralty.aepersonas.persistence.oid.PregCuesMedCOid;
import com.keralty.aepersonas.persistence.oid.ProteccionDatosCOid;
import com.keralty.aepersonas.persistence.oid.TipoEntidadCOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.TipoInstitucionCOid;
import com.keralty.aepersonas.repository.PersonaCJpaRepository;
import com.keralty.aepersonas.utils.Utilities;
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
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>PersonaC</code> model class.
 * <p>
 * Model Class: <code>PersonaC</code><br>
 */
@Entity(name = PersonaCConstants.CLASS_NAME)
@Table(name = PersonaCConstants.TBL_NAME)
public class PersonaC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient PersonaCJpaRepository personaCRepository;

    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PersonaC_Sequence")
    @SequenceGenerator(name="PersonaC_Sequence", sequenceName="PersonaC_Sequence", allocationSize=1)
    @Column(name = PersonaCConstants.FLD_PERSONACID )
    @JsonProperty(value="id")
    private Long personaCID;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACCODIGO )
    @JsonProperty(value="codigo")
    private Long personaCCodigo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCCodigo;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACNUMIDENTIFICACION )
    @JsonProperty(value="numidentificacion")
    private String personaCNumIdentificacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCNumIdentificacion;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACMAIL )
    @JsonProperty(value="mail")
    private String personaCMail;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCMail;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACPRIMERNOMBRE )
    @JsonProperty(value="primernombre")
    private String personaCPrimerNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCPrimerNombre;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACSEGUNDONOMBRE )
    @JsonProperty(value="segundonombre")
    private String personaCSegundoNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCSegundoNombre;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACPRIMERAPELLIDO )
    @JsonProperty(value="primerapellido")
    private String personaCPrimerApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCPrimerApellido;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACSEGUNDOAPELLIDO )
    @JsonProperty(value="segundoapellido")
    private String personaCSegundoApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCSegundoApellido;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACFECHANACIMIENTO )
    @JsonProperty(value="fechanacimiento")
    private Date personaCFechaNacimiento;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCFechaNacimiento;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACGENERO )
    @JsonProperty(value="genero")
    private String personaCGenero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCGenero;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACINDICADOREXTRANJERO )
    @JsonProperty(value="indicadorextranjero")
    private Boolean personaCIndicadorExtranjero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCIndicadorExtranjero;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACRAZONSOCIAL )
    @JsonProperty(value="razonsocial")
    private String personaCRazonSocial;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCRazonSocial;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtipopersona")
    protected String personaCdrvTipoPersona;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACTIENEEPSSANITAS )
    @JsonProperty(value="tieneepssanitas")
    private Boolean personaCTieneEPSSanitas;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCTieneEPSSanitas;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACRECHAZADOAFILIACION )
    @JsonProperty(value="rechazadoafiliacion")
    private String personaCRechazadoAfiliacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCRechazadoAfiliacion;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvrechazada")
    protected Boolean personaCdrvRechazada;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACNOMBRECOMPLETO )
    @JsonProperty(value="nombrecompleto")
    private String personaCNombreCompleto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCNombreCompleto;

    /** Class member attribute. */
    @Column(name = PersonaCConstants.FLD_PERSONACULTIMAACTUALIZACION )
    @JsonProperty(value="ultimaactualizacion")
    private Timestamp personaCUltimaActualizacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCUltimaActualizacion;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnombrecompleto")
    protected String personaCdrvNombreCompleto;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvdircorrespondencia")
    protected String personaCdrvDirCorrespondencia;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvciudadcorrespondencia")
    protected String personaCdrvCiudadCorrespondencia;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtiponumdoc")
    protected String personaCdrvTipoNumDoc;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvedad")
    protected Long personaCdrvEdad;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvobscontrato")
    protected String personaCdrvObsContrato;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvimc")
    protected Double personaCdrvIMC;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaCConstants.ROLE_INVNAME_DIRECCIONESC)
    @JsonIgnore
    private Collection <DireccionC> direccionesC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionesC;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaCConstants.ROLE_INVNAME_PROTECCIONESDATOSC)
    @JsonIgnore
    private Collection <ProteccionDatosC> proteccionesDatosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionesDatosC;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaCConstants.ROLE_INVNAME_PREGSCUESMEDC)
    @JsonIgnore
    private Collection <PregCuesMedC> pregsCuesMedC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPregsCuesMedC;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaCConstants.ROLE_INVNAME_DIRSUCURSALESC)
    @JsonIgnore
    private Collection <DirSucursalC> dirSucursalesC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalesC;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaCConstants.ROLE_INVNAME_PREEXISTENCIASC)
    @JsonIgnore
    private Collection <PreexistenciaC> preexistenciasC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreexistenciasC;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaCConstants.ROLE_INVNAME_MARCASMEDICASC)
    @JsonIgnore
    private Collection <MarcaMedicaC> marcasMedicasC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMarcasMedicasC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_TIPOINSTITUCIONCTIPOINSTITUCIONCCODIGO, referencedColumnName=TipoInstitucionCConstants.FLD_TIPOINSTITUCIONCCODIGO)
    })
    @JsonIgnore
    private TipoInstitucionC tipoInstitucionC;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_TIPOINSTITUCIONCTIPOINSTITUCIONCCODIGO, insertable = false, updatable = false)
    private Long tipoInstitucionCTipoInstitucionCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoInstitucionC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_TIPOENTIDADCTIPOENTIDADCCODIGO, referencedColumnName=TipoEntidadCConstants.FLD_TIPOENTIDADCCODIGO)
    })
    @JsonIgnore
    private TipoEntidadC tipoEntidadC;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_TIPOENTIDADCTIPOENTIDADCCODIGO, insertable = false, updatable = false)
    private Long tipoEntidadCTipoEntidadCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoEntidadC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_ESTADOCIVILESTADOCIVILCCODIGO, referencedColumnName=EstadoCivilConstants.FLD_ESTADOCIVILCODIGO)
    })
    @JsonIgnore
    private EstadoCivil estadoCivilC;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_ESTADOCIVILESTADOCIVILCCODIGO, insertable = false, updatable = false)
    private Long estadoCivilEstadoCivilCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoCivilC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_ESTADOPERSONAESTADOPERSONACCODIGO, referencedColumnName=EstadoPersonaConstants.FLD_ESTADOPERSONACODIGO)
    })
    @JsonIgnore
    private EstadoPersona estadoPersonaC;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_ESTADOPERSONAESTADOPERSONACCODIGO, insertable = false, updatable = false)
    private Long estadoPersonaEstadoPersonaCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoPersonaC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacionC;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionTipoIdentificacionCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_MUNICIPIOMUNICIPIOCNACCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipioCNac;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_MUNICIPIOMUNICIPIOCNACCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioCNacCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioCNac;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_DEPARTAMENTODEPARTAMENTOCNACCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamentoCNac;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_DEPARTAMENTODEPARTAMENTOCNACCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoCNacCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoCNac;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_CONTRATOCCONTRATOSCID, referencedColumnName=ContratoCConstants.FLD_CONTRATOCID)
    })
    @JsonIgnore
    private ContratoC contratosC;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_CONTRATOCCONTRATOSCID, insertable = false, updatable = false)
    private Long contratoCContratosCID;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratosC;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_CONTRATOCFAMILIASCID, referencedColumnName=FamiliaCConstants.FLD_CONTRATOCCONTRATOCID), 
        @JoinColumn(name=PersonaCConstants.FLD_FAMILIACFAMILIASCID1, referencedColumnName=FamiliaCConstants.FLD_FAMILIACID)
    })
    @JsonIgnore
    private FamiliaC familiasC;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_CONTRATOCFAMILIASCID, insertable = false, updatable = false)
    private Long contratoCFamiliasCID;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_FAMILIACFAMILIASCID1, insertable = false, updatable = false)
    private Long familiaCFamiliasCID1;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliasC;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaCConstants.FLD_CONTRATOCBENEFICIARIOSCID, referencedColumnName=BeneficiarioCConstants.FLD_CONTRATOCCONTRATOCID), 
        @JoinColumn(name=PersonaCConstants.FLD_BENEFICIARIOCBENEFICIARIOSCID1, referencedColumnName=BeneficiarioCConstants.FLD_BENEFICIARIOCID)
    })
    @JsonIgnore
    private BeneficiarioC beneficiariosC;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_CONTRATOCBENEFICIARIOSCID, insertable = false, updatable = false)
    private Long contratoCBeneficiariosCID;
    /** Related attribute. */
    @Column(name = PersonaCConstants.FLD_BENEFICIARIOCBENEFICIARIOSCID1, insertable = false, updatable = false)
    private Long beneficiarioCBeneficiariosCID1;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedBeneficiariosC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public PersonaC() {
        personaCID = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>PersonaC</code>.
     * @param oid Object Identifier of the instance of <code>PersonaC</code> to be created.
     * @throws SystemException
     */
    public PersonaC(PersonaCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            personaCID = oid.getPersonaCID();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PersonaC</code>
     * @return The value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code>.
     */
    public Long getPersonaCID() {
        return personaCID;
    }

    /**
     * Sets the value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PersonaC</code>
     * @param personaCID The new value of the <code>personaCID</code> attribute<br>in class <code>PersonaC</code>.
     */
    public void setPersonaCID(Long personaCID) {
        this.personaCID = personaCID;
    }

   /**
    * Returns the value of the <code>personaCCodigo</code> attribute.<br>
    * Model Attribute: <code>personaCCodigo</code>. Variable Int<br>
    * Comments: Consecutivo de la tabla de persona o institución. Tiene que ser variable porque si creamos la personaC nosotros para pasarla al CORE no sabemos este código y lo tenemos que modificar después. <br>
    * @return The value of the <code>personaCCodigo</code> attribute.
    */

    public Long getPersonaCCodigo()  {
    	Long value;
        value =  personaCCodigo;
        return value;
    }

   /**
    * Sets the value of the <code>personaCCodigo</code> attribute.<br>
    * Model Attribute: <code>personaCCodigo</code>. Variable Int<br>
    * Comments: Consecutivo de la tabla de persona o institución. Tiene que ser variable porque si creamos la personaC nosotros para pasarla al CORE no sabemos este código y lo tenemos que modificar después. <br>
    * @param personaCCodigo The new value of the <code>personaCCodigo</code> attribute.
    */
    public void setPersonaCCodigo (Long personaCCodigo) {
        modifiedPersonaCCodigo = true;
        this.personaCCodigo = personaCCodigo;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCCodigo</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCCodigo</code>.
    */
    public void setModifiedPersonaCCodigo(boolean modified) {
        this.modifiedPersonaCCodigo = modified;
    }

   /**
    * Returns the value of the <code>personaCNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>personaCNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>personaCNumIdentificacion</code> attribute.
    */

    public String getPersonaCNumIdentificacion()  {
    	String value;
        value =  personaCNumIdentificacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>personaCNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @param personaCNumIdentificacion The new value of the <code>personaCNumIdentificacion</code> attribute.
    */
    public void setPersonaCNumIdentificacion (String personaCNumIdentificacion) {
        modifiedPersonaCNumIdentificacion = true;
        this.personaCNumIdentificacion = personaCNumIdentificacion;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCNumIdentificacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCNumIdentificacion</code>.
    */
    public void setModifiedPersonaCNumIdentificacion(boolean modified) {
        this.modifiedPersonaCNumIdentificacion = modified;
    }

   /**
    * Returns the value of the <code>personaCMail</code> attribute.<br>
    * Model Attribute: <code>personaCMail</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>personaCMail</code> attribute.
    */

    public String getPersonaCMail()  {
    	String value;
        value =  personaCMail;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCMail</code> attribute.<br>
    * Model Attribute: <code>personaCMail</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param personaCMail The new value of the <code>personaCMail</code> attribute.
    */
    public void setPersonaCMail (String personaCMail) {
        modifiedPersonaCMail = true;
        this.personaCMail = personaCMail;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCMail</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCMail</code>.
    */
    public void setModifiedPersonaCMail(boolean modified) {
        this.modifiedPersonaCMail = modified;
    }

   /**
    * Returns the value of the <code>personaCPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>personaCPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>personaCPrimerNombre</code> attribute.
    */

    public String getPersonaCPrimerNombre()  {
    	String value;
        value =  personaCPrimerNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>personaCPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param personaCPrimerNombre The new value of the <code>personaCPrimerNombre</code> attribute.
    */
    public void setPersonaCPrimerNombre (String personaCPrimerNombre) {
        modifiedPersonaCPrimerNombre = true;
        this.personaCPrimerNombre = personaCPrimerNombre;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCPrimerNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCPrimerNombre</code>.
    */
    public void setModifiedPersonaCPrimerNombre(boolean modified) {
        this.modifiedPersonaCPrimerNombre = modified;
    }

   /**
    * Returns the value of the <code>personaCSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>personaCSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>personaCSegundoNombre</code> attribute.
    */

    public String getPersonaCSegundoNombre()  {
    	String value;
        value =  personaCSegundoNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>personaCSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param personaCSegundoNombre The new value of the <code>personaCSegundoNombre</code> attribute.
    */
    public void setPersonaCSegundoNombre (String personaCSegundoNombre) {
        modifiedPersonaCSegundoNombre = true;
        this.personaCSegundoNombre = personaCSegundoNombre;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCSegundoNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCSegundoNombre</code>.
    */
    public void setModifiedPersonaCSegundoNombre(boolean modified) {
        this.modifiedPersonaCSegundoNombre = modified;
    }

   /**
    * Returns the value of the <code>personaCPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>personaCPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>personaCPrimerApellido</code> attribute.
    */

    public String getPersonaCPrimerApellido()  {
    	String value;
        value =  personaCPrimerApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>personaCPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param personaCPrimerApellido The new value of the <code>personaCPrimerApellido</code> attribute.
    */
    public void setPersonaCPrimerApellido (String personaCPrimerApellido) {
        modifiedPersonaCPrimerApellido = true;
        this.personaCPrimerApellido = personaCPrimerApellido;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCPrimerApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCPrimerApellido</code>.
    */
    public void setModifiedPersonaCPrimerApellido(boolean modified) {
        this.modifiedPersonaCPrimerApellido = modified;
    }

   /**
    * Returns the value of the <code>personaCSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>personaCSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>personaCSegundoApellido</code> attribute.
    */

    public String getPersonaCSegundoApellido()  {
    	String value;
        value =  personaCSegundoApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>personaCSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param personaCSegundoApellido The new value of the <code>personaCSegundoApellido</code> attribute.
    */
    public void setPersonaCSegundoApellido (String personaCSegundoApellido) {
        modifiedPersonaCSegundoApellido = true;
        this.personaCSegundoApellido = personaCSegundoApellido;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCSegundoApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCSegundoApellido</code>.
    */
    public void setModifiedPersonaCSegundoApellido(boolean modified) {
        this.modifiedPersonaCSegundoApellido = modified;
    }

   /**
    * Returns the value of the <code>personaCFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>personaCFechaNacimiento</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>personaCFechaNacimiento</code> attribute.
    */

    public Date getPersonaCFechaNacimiento()  {
    	Date value;
        value =  personaCFechaNacimiento;
        return value;
    }

   /**
    * Sets the value of the <code>personaCFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>personaCFechaNacimiento</code>. Variable Date<br>
    * Comments: <br>
    * @param personaCFechaNacimiento The new value of the <code>personaCFechaNacimiento</code> attribute.
    */
    public void setPersonaCFechaNacimiento (Date personaCFechaNacimiento) {
        modifiedPersonaCFechaNacimiento = true;
        this.personaCFechaNacimiento = personaCFechaNacimiento;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCFechaNacimiento</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCFechaNacimiento</code>.
    */
    public void setModifiedPersonaCFechaNacimiento(boolean modified) {
        this.modifiedPersonaCFechaNacimiento = modified;
    }

   /**
    * Returns the value of the <code>personaCGenero</code> attribute.<br>
    * Model Attribute: <code>personaCGenero</code>. Variable String Size=1<br>
    * Comments: <br>
    * @return The value of the <code>personaCGenero</code> attribute.
    */

    public String getPersonaCGenero()  {
    	String value;
        value =  personaCGenero;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCGenero</code> attribute.<br>
    * Model Attribute: <code>personaCGenero</code>. Variable String Size=1<br>
    * Comments: <br>
    * @param personaCGenero The new value of the <code>personaCGenero</code> attribute.
    */
    public void setPersonaCGenero (String personaCGenero) {
        modifiedPersonaCGenero = true;
        this.personaCGenero = personaCGenero;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCGenero</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCGenero</code>.
    */
    public void setModifiedPersonaCGenero(boolean modified) {
        this.modifiedPersonaCGenero = modified;
    }

   /**
    * Returns the value of the <code>personaCIndicadorExtranjero</code> attribute.<br>
    * Model Attribute: <code>personaCIndicadorExtranjero</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>personaCIndicadorExtranjero</code> attribute.
    */

    public Boolean getPersonaCIndicadorExtranjero()  {
    	Boolean value;
        value =  personaCIndicadorExtranjero;
        return value;
    }

   /**
    * Sets the value of the <code>personaCIndicadorExtranjero</code> attribute.<br>
    * Model Attribute: <code>personaCIndicadorExtranjero</code>. Variable Bool<br>
    * Comments: <br>
    * @param personaCIndicadorExtranjero The new value of the <code>personaCIndicadorExtranjero</code> attribute.
    */
    public void setPersonaCIndicadorExtranjero (Boolean personaCIndicadorExtranjero) {
        modifiedPersonaCIndicadorExtranjero = true;
        this.personaCIndicadorExtranjero = personaCIndicadorExtranjero;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCIndicadorExtranjero</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCIndicadorExtranjero</code>.
    */
    public void setModifiedPersonaCIndicadorExtranjero(boolean modified) {
        this.modifiedPersonaCIndicadorExtranjero = modified;
    }

   /**
    * Returns the value of the <code>personaCRazonSocial</code> attribute.<br>
    * Model Attribute: <code>personaCRazonSocial</code>. Variable String Size=254<br>
    * Comments: <br>
    * @return The value of the <code>personaCRazonSocial</code> attribute.
    */

    public String getPersonaCRazonSocial()  {
    	String value;
        value =  personaCRazonSocial;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCRazonSocial</code> attribute.<br>
    * Model Attribute: <code>personaCRazonSocial</code>. Variable String Size=254<br>
    * Comments: <br>
    * @param personaCRazonSocial The new value of the <code>personaCRazonSocial</code> attribute.
    */
    public void setPersonaCRazonSocial (String personaCRazonSocial) {
        modifiedPersonaCRazonSocial = true;
        this.personaCRazonSocial = personaCRazonSocial;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCRazonSocial</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCRazonSocial</code>.
    */
    public void setModifiedPersonaCRazonSocial(boolean modified) {
        this.modifiedPersonaCRazonSocial = modified;
    }

   /**
    * Returns the value of the <code>personaCdrvTipoPersona</code> attribute.<br>
    * Model Attribute: <code>personaCdrvTipoPersona</code>. Variable String Size=1<br>
    * Comments: N - Natural, J - Jurídica<br>
    * @return The value of the <code>personaCdrvTipoPersona</code> attribute.
    */

    @JsonIgnore
    public String getPersonaCdrvTipoPersona()  {
    	String value;
        try {
            value = personaCdrvTipoPersonaDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: PersonaC, Attribute: personaCdrvTipoPersona");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>personaCTieneEPSSanitas</code> attribute.<br>
    * Model Attribute: <code>personaCTieneEPSSanitas</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>personaCTieneEPSSanitas</code> attribute.
    */

    public Boolean getPersonaCTieneEPSSanitas()  {
    	Boolean value;
        value =  personaCTieneEPSSanitas;
        return value;
    }

   /**
    * Sets the value of the <code>personaCTieneEPSSanitas</code> attribute.<br>
    * Model Attribute: <code>personaCTieneEPSSanitas</code>. Variable Bool<br>
    * Comments: <br>
    * @param personaCTieneEPSSanitas The new value of the <code>personaCTieneEPSSanitas</code> attribute.
    */
    public void setPersonaCTieneEPSSanitas (Boolean personaCTieneEPSSanitas) {
        modifiedPersonaCTieneEPSSanitas = true;
        this.personaCTieneEPSSanitas = personaCTieneEPSSanitas;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCTieneEPSSanitas</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCTieneEPSSanitas</code>.
    */
    public void setModifiedPersonaCTieneEPSSanitas(boolean modified) {
        this.modifiedPersonaCTieneEPSSanitas = modified;
    }

   /**
    * Returns the value of the <code>personaCRechazadoAfiliacion</code> attribute.<br>
    * Model Attribute: <code>personaCRechazadoAfiliacion</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>personaCRechazadoAfiliacion</code> attribute.
    */

    public String getPersonaCRechazadoAfiliacion()  {
    	String value;
        value =  personaCRechazadoAfiliacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCRechazadoAfiliacion</code> attribute.<br>
    * Model Attribute: <code>personaCRechazadoAfiliacion</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param personaCRechazadoAfiliacion The new value of the <code>personaCRechazadoAfiliacion</code> attribute.
    */
    public void setPersonaCRechazadoAfiliacion (String personaCRechazadoAfiliacion) {
        modifiedPersonaCRechazadoAfiliacion = true;
        this.personaCRechazadoAfiliacion = personaCRechazadoAfiliacion;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCRechazadoAfiliacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCRechazadoAfiliacion</code>.
    */
    public void setModifiedPersonaCRechazadoAfiliacion(boolean modified) {
        this.modifiedPersonaCRechazadoAfiliacion = modified;
    }

   /**
    * Returns the value of the <code>personaCdrvRechazada</code> attribute.<br>
    * Model Attribute: <code>personaCdrvRechazada</code>. Variable Bool<br>
    * Comments: Indica que la persona está rechazada. El valor de RechazadoAfiliación es un texto y necesitamos saber si está rechazada o no.<br>
    * @return The value of the <code>personaCdrvRechazada</code> attribute.
    */

    @JsonIgnore
    public Boolean getPersonaCdrvRechazada()  {
    	Boolean value;
        try {
            value = personaCdrvRechazadaDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: PersonaC, Attribute: personaCdrvRechazada");
        }
        return value;
    }

   /**
    * Returns the value of the <code>personaCNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>personaCNombreCompleto</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>personaCNombreCompleto</code> attribute.
    */

    public String getPersonaCNombreCompleto()  {
    	String value;
        value =  personaCNombreCompleto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>personaCNombreCompleto</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param personaCNombreCompleto The new value of the <code>personaCNombreCompleto</code> attribute.
    */
    public void setPersonaCNombreCompleto (String personaCNombreCompleto) {
        modifiedPersonaCNombreCompleto = true;
        this.personaCNombreCompleto = personaCNombreCompleto;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCNombreCompleto</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCNombreCompleto</code>.
    */
    public void setModifiedPersonaCNombreCompleto(boolean modified) {
        this.modifiedPersonaCNombreCompleto = modified;
    }

   /**
    * Returns the value of the <code>personaCUltimaActualizacion</code> attribute.<br>
    * Model Attribute: <code>personaCUltimaActualizacion</code>. Variable DateTime<br>
    * Comments: Timestamp de la última actualización de la instancia, para evitar estar trayéndola del CORE a cada poco.<br>
    * @return The value of the <code>personaCUltimaActualizacion</code> attribute.
    */

    public Timestamp getPersonaCUltimaActualizacion()  {
    	Timestamp value;
        value =  personaCUltimaActualizacion;
        return value;
    }

   /**
    * Sets the value of the <code>personaCUltimaActualizacion</code> attribute.<br>
    * Model Attribute: <code>personaCUltimaActualizacion</code>. Variable DateTime<br>
    * Comments: Timestamp de la última actualización de la instancia, para evitar estar trayéndola del CORE a cada poco.<br>
    * @param personaCUltimaActualizacion The new value of the <code>personaCUltimaActualizacion</code> attribute.
    */
    public void setPersonaCUltimaActualizacion (Timestamp personaCUltimaActualizacion) {
        modifiedPersonaCUltimaActualizacion = true;
        this.personaCUltimaActualizacion = personaCUltimaActualizacion;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCUltimaActualizacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCUltimaActualizacion</code>.
    */
    public void setModifiedPersonaCUltimaActualizacion(boolean modified) {
        this.modifiedPersonaCUltimaActualizacion = modified;
    }

   /**
    * Returns the value of the <code>personaCdrvNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>personaCdrvNombreCompleto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>personaCdrvNombreCompleto</code> attribute.
    */

    @JsonIgnore
    public String getPersonaCdrvNombreCompleto()  {
    	String value;
        try {
            value = personaCdrvNombreCompletoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: PersonaC, Attribute: personaCdrvNombreCompleto");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>personaCdrvDirCorrespondencia</code> attribute.<br>
    * Model Attribute: <code>personaCdrvDirCorrespondencia</code>. Variable String Size=999<br>
    * Comments: Si tiene dirección de correspondencia una persona natural o la dirección de la sucursal princiapal si es persona jurídica<br>
    * @return The value of the <code>personaCdrvDirCorrespondencia</code> attribute.
    */

    @JsonIgnore
    public String getPersonaCdrvDirCorrespondencia()  {
    	String value;
        try {
            value = personaCdrvDirCorrespondenciaDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: PersonaC, Attribute: personaCdrvDirCorrespondencia");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>personaCdrvCiudadCorrespondencia</code> attribute.<br>
    * Model Attribute: <code>personaCdrvCiudadCorrespondencia</code>. Variable String Size=150<br>
    * Comments: Si tiene dirección de correspondencia una persona natural o la dirección de la sucursal princiapal si es persona jurídica<br>
    * @return The value of the <code>personaCdrvCiudadCorrespondencia</code> attribute.
    */

    @JsonIgnore
    public String getPersonaCdrvCiudadCorrespondencia()  {
    	String value;
        try {
            value = personaCdrvCiudadCorrespondenciaDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: PersonaC, Attribute: personaCdrvCiudadCorrespondencia");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>personaCdrvTipoNumDoc</code> attribute.<br>
    * Model Attribute: <code>personaCdrvTipoNumDoc</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>personaCdrvTipoNumDoc</code> attribute.
    */

    @JsonIgnore
    public String getPersonaCdrvTipoNumDoc()  {
    	String value;
        try {
            value = personaCdrvTipoNumDocDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: PersonaC, Attribute: personaCdrvTipoNumDoc");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>personaCdrvEdad</code> attribute.<br>
    * Model Attribute: <code>personaCdrvEdad</code>. Variable Int<br>
    * Comments: <br>
    * @return The value of the <code>personaCdrvEdad</code> attribute.
    */

    @JsonIgnore
    public Long getPersonaCdrvEdad()  {
    	Long value;
        try {
            value = personaCdrvEdadDerivations();
        } catch (Exception e) {
            value = Long.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: PersonaC, Attribute: personaCdrvEdad");
        }
        return value;
    }

   /**
    * Returns the value of the <code>personaCdrvObsContrato</code> attribute.<br>
    * Model Attribute: <code>personaCdrvObsContrato</code>. Variable String Size=100<br>
    * Comments: Si el usuario tiene pre-existencias debe ir el texto “ ver carta de preexistencia”<br>
    * @return The value of the <code>personaCdrvObsContrato</code> attribute.
    */

    @JsonIgnore
    public String getPersonaCdrvObsContrato()  {
    	String value;
        try {
            value = personaCdrvObsContratoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: PersonaC, Attribute: personaCdrvObsContrato");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>personaCdrvIMC</code> attribute.<br>
    * Model Attribute: <code>personaCdrvIMC</code>. Variable Real<br>
    * Comments: Indice de masa corporal. Es el Peso (kg) dividido por el cuadrado de la talla (metros). Ambos son datos que están (o deberían estar) es las respuestas del cuestionario. Para saber cuales son los códigos de las preguntas se utilizan dos parametros de configuración (ParamConfig) PREGUNTAPESO y PREGUNTATALLA<br>
    * @return The value of the <code>personaCdrvIMC</code> attribute.
    */

    @JsonIgnore
    public Double getPersonaCdrvIMC()  {
    	Double value;
        try {
            value = personaCdrvIMCDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: PersonaC, Attribute: personaCdrvIMC");
        }
        return value;
    }

    /**
     * Returns the instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * Model Relationship:
     * <code>[DireccionC] DireccionesC 0:M  ------ 0:1  PersonaC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     */
    @JsonIgnore
    public Collection <DireccionC> getDireccionesC() {
        return direccionesC;
    }

    /**
     * Adds an instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * @param direccionesC The instance to add to the <code>DireccionesC</code> role.
     */
    public void add2DireccionesC(DireccionC direccionesC) {
        this.direccionesC.add(direccionesC);
    }
    /**
     * Removes an instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * @param direccionesC The instance to be removed
     */
    public void removeFromDireccionesC(DireccionC direccionesC) {
    	this.direccionesC.remove(direccionesC);
    }
    /**
     * Sets instances of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * @param direccionesC The new value for the <code>DireccionesC</code> role.
     */
    public void setDireccionesC(Collection < DireccionC > direccionesC) {
        this.direccionesC = direccionesC;
    }

   /**
    * This method gets the attribute value <code>modifiedDireccionesC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDireccionesC</code> has been modified.
    */
    public boolean isModifiedDireccionesC(){
        return modifiedDireccionesC;
    }

    /**
     * Returns the instance of <code>ProteccionDatosC</code> related through the <code>ProteccionesDatosC</code> role.
     * Model Relationship:
     * <code>[ProteccionDatosC] ProteccionesDatosC 0:M  ------ 1:1  PersonaC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ProteccionDatosC</code> related through the <code>ProteccionesDatosC</code> role.
     */
    @JsonIgnore
    public Collection <ProteccionDatosC> getProteccionesDatosC() {
        return proteccionesDatosC;
    }

    /**
     * Adds an instance of <code>ProteccionDatosC</code> related through the <code>ProteccionesDatosC</code> role.
     * @param proteccionesDatosC The instance to add to the <code>ProteccionesDatosC</code> role.
     */
    public void add2ProteccionesDatosC(ProteccionDatosC proteccionesDatosC) {
        this.proteccionesDatosC.add(proteccionesDatosC);
    }
    /**
     * Removes an instance of <code>ProteccionDatosC</code> related through the <code>ProteccionesDatosC</code> role.
     * @param proteccionesDatosC The instance to be removed
     */
    public void removeFromProteccionesDatosC(ProteccionDatosC proteccionesDatosC) {
    	this.proteccionesDatosC.remove(proteccionesDatosC);
    }
    /**
     * Sets instances of <code>ProteccionDatosC</code> related through the <code>ProteccionesDatosC</code> role.
     * @param proteccionesDatosC The new value for the <code>ProteccionesDatosC</code> role.
     */
    public void setProteccionesDatosC(Collection < ProteccionDatosC > proteccionesDatosC) {
        this.proteccionesDatosC = proteccionesDatosC;
    }

   /**
    * This method gets the attribute value <code>modifiedProteccionesDatosC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedProteccionesDatosC</code> has been modified.
    */
    public boolean isModifiedProteccionesDatosC(){
        return modifiedProteccionesDatosC;
    }

    /**
     * Returns the instance of <code>PregCuesMedC</code> related through the <code>PregsCuesMedC</code> role.
     * Model Relationship:
     * <code>[PregCuesMedC] PregsCuesMedC 0:M  ------ 1:1  PersonaC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PregCuesMedC</code> related through the <code>PregsCuesMedC</code> role.
     */
    @JsonIgnore
    public Collection <PregCuesMedC> getPregsCuesMedC() {
        return pregsCuesMedC;
    }

    /**
     * Adds an instance of <code>PregCuesMedC</code> related through the <code>PregsCuesMedC</code> role.
     * @param pregsCuesMedC The instance to add to the <code>PregsCuesMedC</code> role.
     */
    public void add2PregsCuesMedC(PregCuesMedC pregsCuesMedC) {
        this.pregsCuesMedC.add(pregsCuesMedC);
    }
    /**
     * Removes an instance of <code>PregCuesMedC</code> related through the <code>PregsCuesMedC</code> role.
     * @param pregsCuesMedC The instance to be removed
     */
    public void removeFromPregsCuesMedC(PregCuesMedC pregsCuesMedC) {
    	this.pregsCuesMedC.remove(pregsCuesMedC);
    }
    /**
     * Sets instances of <code>PregCuesMedC</code> related through the <code>PregsCuesMedC</code> role.
     * @param pregsCuesMedC The new value for the <code>PregsCuesMedC</code> role.
     */
    public void setPregsCuesMedC(Collection < PregCuesMedC > pregsCuesMedC) {
        this.pregsCuesMedC = pregsCuesMedC;
    }

   /**
    * This method gets the attribute value <code>modifiedPregsCuesMedC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPregsCuesMedC</code> has been modified.
    */
    public boolean isModifiedPregsCuesMedC(){
        return modifiedPregsCuesMedC;
    }

    /**
     * Returns the instance of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     * Model Relationship:
     * <code>[DirSucursalC] DirSucursalesC 0:M  ------ 1:1  PersonaC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalesC() {
        return dirSucursalesC;
    }

    /**
     * Adds an instance of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     * @param dirSucursalesC The instance to add to the <code>DirSucursalesC</code> role.
     */
    public void add2DirSucursalesC(DirSucursalC dirSucursalesC) {
        this.dirSucursalesC.add(dirSucursalesC);
    }
    /**
     * Removes an instance of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     * @param dirSucursalesC The instance to be removed
     */
    public void removeFromDirSucursalesC(DirSucursalC dirSucursalesC) {
    	this.dirSucursalesC.remove(dirSucursalesC);
    }
    /**
     * Sets instances of <code>DirSucursalC</code> related through the <code>DirSucursalesC</code> role.
     * @param dirSucursalesC The new value for the <code>DirSucursalesC</code> role.
     */
    public void setDirSucursalesC(Collection < DirSucursalC > dirSucursalesC) {
        this.dirSucursalesC = dirSucursalesC;
    }

   /**
    * This method gets the attribute value <code>modifiedDirSucursalesC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDirSucursalesC</code> has been modified.
    */
    public boolean isModifiedDirSucursalesC(){
        return modifiedDirSucursalesC;
    }

    /**
     * Returns the instance of <code>PreexistenciaC</code> related through the <code>PreexistenciasC</code> role.
     * Model Relationship:
     * <code>[PreexistenciaC] PreexistenciasC 0:M  ------ 1:1  PersonaC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PreexistenciaC</code> related through the <code>PreexistenciasC</code> role.
     */
    @JsonIgnore
    public Collection <PreexistenciaC> getPreexistenciasC() {
        return preexistenciasC;
    }

    /**
     * Adds an instance of <code>PreexistenciaC</code> related through the <code>PreexistenciasC</code> role.
     * @param preexistenciasC The instance to add to the <code>PreexistenciasC</code> role.
     */
    public void add2PreexistenciasC(PreexistenciaC preexistenciasC) {
        this.preexistenciasC.add(preexistenciasC);
    }
    /**
     * Removes an instance of <code>PreexistenciaC</code> related through the <code>PreexistenciasC</code> role.
     * @param preexistenciasC The instance to be removed
     */
    public void removeFromPreexistenciasC(PreexistenciaC preexistenciasC) {
    	this.preexistenciasC.remove(preexistenciasC);
    }
    /**
     * Sets instances of <code>PreexistenciaC</code> related through the <code>PreexistenciasC</code> role.
     * @param preexistenciasC The new value for the <code>PreexistenciasC</code> role.
     */
    public void setPreexistenciasC(Collection < PreexistenciaC > preexistenciasC) {
        this.preexistenciasC = preexistenciasC;
    }

   /**
    * This method gets the attribute value <code>modifiedPreexistenciasC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPreexistenciasC</code> has been modified.
    */
    public boolean isModifiedPreexistenciasC(){
        return modifiedPreexistenciasC;
    }

    /**
     * Returns the instance of <code>MarcaMedicaC</code> related through the <code>MarcasMedicasC</code> role.
     * Model Relationship:
     * <code>[MarcaMedicaC] MarcasMedicasC 0:M  ------ 1:1  PersonaC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>MarcaMedicaC</code> related through the <code>MarcasMedicasC</code> role.
     */
    @JsonIgnore
    public Collection <MarcaMedicaC> getMarcasMedicasC() {
        return marcasMedicasC;
    }

    /**
     * Adds an instance of <code>MarcaMedicaC</code> related through the <code>MarcasMedicasC</code> role.
     * @param marcasMedicasC The instance to add to the <code>MarcasMedicasC</code> role.
     */
    public void add2MarcasMedicasC(MarcaMedicaC marcasMedicasC) {
        this.marcasMedicasC.add(marcasMedicasC);
    }
    /**
     * Removes an instance of <code>MarcaMedicaC</code> related through the <code>MarcasMedicasC</code> role.
     * @param marcasMedicasC The instance to be removed
     */
    public void removeFromMarcasMedicasC(MarcaMedicaC marcasMedicasC) {
    	this.marcasMedicasC.remove(marcasMedicasC);
    }
    /**
     * Sets instances of <code>MarcaMedicaC</code> related through the <code>MarcasMedicasC</code> role.
     * @param marcasMedicasC The new value for the <code>MarcasMedicasC</code> role.
     */
    public void setMarcasMedicasC(Collection < MarcaMedicaC > marcasMedicasC) {
        this.marcasMedicasC = marcasMedicasC;
    }

   /**
    * This method gets the attribute value <code>modifiedMarcasMedicasC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMarcasMedicasC</code> has been modified.
    */
    public boolean isModifiedMarcasMedicasC(){
        return modifiedMarcasMedicasC;
    }

    /**
     * Returns the instance of <code>TipoInstitucionC</code> related through the <code>TipoInstitucionC</code> role.
     * Model Relationship:
     * <code>[TipoInstitucionC] TipoInstitucionC 0:1  ------ 0:M  PersonasC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoInstitucionC</code> related through the <code>TipoInstitucionC</code> role.
     */
    @JsonIgnore
    public TipoInstitucionC getTipoInstitucionC() {
        return tipoInstitucionC;
    }

    /**
     * Adds an instance of <code>TipoInstitucionC</code> related through the <code>TipoInstitucionC</code> role.
     * @param tipoInstitucionC The instance to add to the <code>TipoInstitucionC</code> role.
     */
    public void add2TipoInstitucionC(TipoInstitucionC tipoInstitucionC) {
        if (tipoInstitucionC == null || tipoInstitucionC.isNull()) {
            this.modifiedTipoInstitucionC = true;
            this.tipoInstitucionCTipoInstitucionCCodigo = null;
        } else {
            this.tipoInstitucionCTipoInstitucionCCodigo = tipoInstitucionC.getTipoInstitucionCCodigo();
        }
        this.tipoInstitucionC = (tipoInstitucionC == null  || tipoInstitucionC.isNull() ? null : tipoInstitucionC);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoInstitucionC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoInstitucionC</code> has been modified.
    */
    public boolean isModifiedTipoInstitucionC(){
        return modifiedTipoInstitucionC;
    }

    /**
     * Returns the instance of <code>TipoEntidadC</code> related through the <code>TipoEntidadC</code> role.
     * Model Relationship:
     * <code>[TipoEntidadC] TipoEntidadC 0:1  ------ 0:M  PersonasC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoEntidadC</code> related through the <code>TipoEntidadC</code> role.
     */
    @JsonIgnore
    public TipoEntidadC getTipoEntidadC() {
        return tipoEntidadC;
    }

    /**
     * Adds an instance of <code>TipoEntidadC</code> related through the <code>TipoEntidadC</code> role.
     * @param tipoEntidadC The instance to add to the <code>TipoEntidadC</code> role.
     */
    public void add2TipoEntidadC(TipoEntidadC tipoEntidadC) {
        if (tipoEntidadC == null || tipoEntidadC.isNull()) {
            this.modifiedTipoEntidadC = true;
            this.tipoEntidadCTipoEntidadCCodigo = null;
        } else {
            this.tipoEntidadCTipoEntidadCCodigo = tipoEntidadC.getTipoEntidadCCodigo();
        }
        this.tipoEntidadC = (tipoEntidadC == null  || tipoEntidadC.isNull() ? null : tipoEntidadC);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoEntidadC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoEntidadC</code> has been modified.
    */
    public boolean isModifiedTipoEntidadC(){
        return modifiedTipoEntidadC;
    }

    /**
     * Returns the instance of <code>EstadoCivil</code> related through the <code>EstadoCivilC</code> role.
     * Model Relationship:
     * <code>[EstadoCivil] EstadoCivilC 0:1  ------ 0:M  PersonasC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>EstadoCivil</code> related through the <code>EstadoCivilC</code> role.
     */
    @JsonIgnore
    public EstadoCivil getEstadoCivilC() {
        return estadoCivilC;
    }

    /**
     * Adds an instance of <code>EstadoCivil</code> related through the <code>EstadoCivilC</code> role.
     * @param estadoCivilC The instance to add to the <code>EstadoCivilC</code> role.
     */
    public void add2EstadoCivilC(EstadoCivil estadoCivilC) {
        if (estadoCivilC == null || estadoCivilC.isNull()) {
            this.modifiedEstadoCivilC = true;
            this.estadoCivilEstadoCivilCCodigo = null;
        } else {
            this.estadoCivilEstadoCivilCCodigo = estadoCivilC.getEstadoCivilCodigo();
        }
        this.estadoCivilC = (estadoCivilC == null  || estadoCivilC.isNull() ? null : estadoCivilC);
    }

   /**
    * This method gets the attribute value <code>modifiedEstadoCivilC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedEstadoCivilC</code> has been modified.
    */
    public boolean isModifiedEstadoCivilC(){
        return modifiedEstadoCivilC;
    }

    /**
     * Returns the instance of <code>EstadoPersona</code> related through the <code>EstadoPersonaC</code> role.
     * Model Relationship:
     * <code>[EstadoPersona] EstadoPersonaC 0:1  ------ 0:M  PersonasC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>EstadoPersona</code> related through the <code>EstadoPersonaC</code> role.
     */
    @JsonIgnore
    public EstadoPersona getEstadoPersonaC() {
        return estadoPersonaC;
    }

    /**
     * Adds an instance of <code>EstadoPersona</code> related through the <code>EstadoPersonaC</code> role.
     * @param estadoPersonaC The instance to add to the <code>EstadoPersonaC</code> role.
     */
    public void add2EstadoPersonaC(EstadoPersona estadoPersonaC) {
        if (estadoPersonaC == null || estadoPersonaC.isNull()) {
            this.modifiedEstadoPersonaC = true;
            this.estadoPersonaEstadoPersonaCCodigo = null;
        } else {
            this.estadoPersonaEstadoPersonaCCodigo = estadoPersonaC.getEstadoPersonaCodigo();
        }
        this.estadoPersonaC = (estadoPersonaC == null  || estadoPersonaC.isNull() ? null : estadoPersonaC);
    }

   /**
    * This method gets the attribute value <code>modifiedEstadoPersonaC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedEstadoPersonaC</code> has been modified.
    */
    public boolean isModifiedEstadoPersonaC(){
        return modifiedEstadoPersonaC;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacionC</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacionC 1:1  ------ 0:M  PersonasC [PersonaC]</code>
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
     * Returns the instance of <code>Municipio</code> related through the <code>MunicipioCNac</code> role.
     * Model Relationship:
     * <code>[Municipio] MunicipioCNac 0:1  ------ 0:M  PersonasC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>MunicipioCNac</code> role.
     */
    @JsonIgnore
    public Municipio getMunicipioCNac() {
        return municipioCNac;
    }

    /**
     * Adds an instance of <code>Municipio</code> related through the <code>MunicipioCNac</code> role.
     * @param municipioCNac The instance to add to the <code>MunicipioCNac</code> role.
     */
    public void add2MunicipioCNac(Municipio municipioCNac) {
        if (municipioCNac == null || municipioCNac.isNull()) {
            this.modifiedMunicipioCNac = true;
            this.municipioMunicipioCNacCodigo = null;
        } else {
            this.municipioMunicipioCNacCodigo = municipioCNac.getMunicipioCodigo();
        }
        this.municipioCNac = (municipioCNac == null  || municipioCNac.isNull() ? null : municipioCNac);
    }

   /**
    * This method gets the attribute value <code>modifiedMunicipioCNac</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMunicipioCNac</code> has been modified.
    */
    public boolean isModifiedMunicipioCNac(){
        return modifiedMunicipioCNac;
    }

    /**
     * Returns the instance of <code>Departamento</code> related through the <code>DepartamentoCNac</code> role.
     * Model Relationship:
     * <code>[Departamento] DepartamentoCNac 0:1  ------ 0:M  PersonasC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Departamento</code> related through the <code>DepartamentoCNac</code> role.
     */
    @JsonIgnore
    public Departamento getDepartamentoCNac() {
        return departamentoCNac;
    }

    /**
     * Adds an instance of <code>Departamento</code> related through the <code>DepartamentoCNac</code> role.
     * @param departamentoCNac The instance to add to the <code>DepartamentoCNac</code> role.
     */
    public void add2DepartamentoCNac(Departamento departamentoCNac) {
        if (departamentoCNac == null || departamentoCNac.isNull()) {
            this.modifiedDepartamentoCNac = true;
            this.departamentoDepartamentoCNacCodigo = null;
        } else {
            this.departamentoDepartamentoCNacCodigo = departamentoCNac.getDepartamentoCodigo();
        }
        this.departamentoCNac = (departamentoCNac == null  || departamentoCNac.isNull() ? null : departamentoCNac);
    }

   /**
    * This method gets the attribute value <code>modifiedDepartamentoCNac</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDepartamentoCNac</code> has been modified.
    */
    public boolean isModifiedDepartamentoCNac(){
        return modifiedDepartamentoCNac;
    }

    /**
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratosC 0:1  ------ 0:1  PersonaCContratante [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     */
    @JsonIgnore
    public ContratoC getContratosC() {
        return contratosC;
    }

    /**
     * Adds an instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * @param contratosC The instance to add to the <code>ContratosC</code> role.
     */
    public void add2ContratosC(ContratoC contratosC) {
        if (contratosC == null || contratosC.isNull()) {
            this.modifiedContratosC = true;
            this.contratoCContratosCID = null;
        } else {
            this.contratoCContratosCID = contratosC.getContratoCID();
        }
        this.contratosC = (contratosC == null  || contratosC.isNull() ? null : contratosC);
    }

   /**
    * This method gets the attribute value <code>modifiedContratosC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratosC</code> has been modified.
    */
    public boolean isModifiedContratosC(){
        return modifiedContratosC;
    }

    /**
     * Returns the instance of <code>FamiliaC</code> related through the <code>FamiliasC</code> role.
     * Model Relationship:
     * <code>[FamiliaC] FamiliasC 0:1  ------ 0:1  PersonaCTitular [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>FamiliaC</code> related through the <code>FamiliasC</code> role.
     */
    @JsonIgnore
    public FamiliaC getFamiliasC() {
        return familiasC;
    }

    /**
     * Adds an instance of <code>FamiliaC</code> related through the <code>FamiliasC</code> role.
     * @param familiasC The instance to add to the <code>FamiliasC</code> role.
     */
    public void add2FamiliasC(FamiliaC familiasC) {
        if (familiasC == null || familiasC.isNull()) {
            this.modifiedFamiliasC = true;
            this.contratoCFamiliasCID = null;
            this.familiaCFamiliasCID1 = null;
        } else {
            this.contratoCFamiliasCID = familiasC.getContratoCContratoCID();
            this.familiaCFamiliasCID1 = familiasC.getFamiliaCID();
        }
        this.familiasC = (familiasC == null  || familiasC.isNull() ? null : familiasC);
    }

   /**
    * This method gets the attribute value <code>modifiedFamiliasC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFamiliasC</code> has been modified.
    */
    public boolean isModifiedFamiliasC(){
        return modifiedFamiliasC;
    }

    /**
     * Returns the instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * Model Relationship:
     * <code>[BeneficiarioC] BeneficiariosC 0:1  ------ 0:1  PersonaC [PersonaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     */
    @JsonIgnore
    public BeneficiarioC getBeneficiariosC() {
        return beneficiariosC;
    }

    /**
     * Adds an instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * @param beneficiariosC The instance to add to the <code>BeneficiariosC</code> role.
     */
    public void add2BeneficiariosC(BeneficiarioC beneficiariosC) {
        if (beneficiariosC == null || beneficiariosC.isNull()) {
            this.modifiedBeneficiariosC = true;
            this.contratoCBeneficiariosCID = null;
            this.beneficiarioCBeneficiariosCID1 = null;
        } else {
            this.contratoCBeneficiariosCID = beneficiariosC.getContratoCContratoCID();
            this.beneficiarioCBeneficiariosCID1 = beneficiariosC.getBeneficiarioCID();
        }
        this.beneficiariosC = (beneficiariosC == null  || beneficiariosC.isNull() ? null : beneficiariosC);
    }

   /**
    * This method gets the attribute value <code>modifiedBeneficiariosC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedBeneficiariosC</code> has been modified.
    */
    public boolean isModifiedBeneficiariosC(){
        return modifiedBeneficiariosC;
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
     * Computes the value of the <code>personaCdrvTipoPersona</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personaCdrvTipoPersona</code> derived attribute.
     */
    public String personaCdrvTipoPersonaDerivations() {

        personaCdrvTipoPersona = null;

        personaCdrvTipoPersonaDerivationsConditional1();
        personaCdrvTipoPersonaDerivationsDefault();
        return personaCdrvTipoPersona;
    }

    private void personaCdrvTipoPersonaDerivationsConditional1() {
        if (personaCdrvTipoPersona != null) return;
        // CONDITION: TipoIdentificacionC.NombreCorto = \"NI\"
        // EFFECT   : \"J\"
        boolean personaCdrvTipoPersonaCond = (this.getTipoIdentificacionC().getTipoIdentificacionNombreCorto()).equals("NI");
        if (personaCdrvTipoPersonaCond) {
            personaCdrvTipoPersona = "J";
        }
    }

    private void personaCdrvTipoPersonaDerivationsDefault() {
        if (personaCdrvTipoPersona != null) return;
        // Default derivation
        // EFFECT   : \"N\"
        personaCdrvTipoPersona = "N";
    }

    /**
     * Computes the value of the <code>personaCdrvRechazada</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personaCdrvRechazada</code> derived attribute.
     */
    public Boolean personaCdrvRechazadaDerivations() {

        personaCdrvRechazada = null;

        personaCdrvRechazadaDerivationsConditional1();
        personaCdrvRechazadaDerivationsConditional2();
        personaCdrvRechazadaDerivationsDefault();
        return personaCdrvRechazada;
    }

    private void personaCdrvRechazadaDerivationsConditional1() {
        if (personaCdrvRechazada != null) return;
        // CONDITION: RechazadoAfiliacion = NULL
        // EFFECT   : FALSE
        boolean personaCdrvRechazadaCond = this.getPersonaCRechazadoAfiliacion() == null;
        if (personaCdrvRechazadaCond) {
            personaCdrvRechazada = Boolean.FALSE;
        }
    }

    private void personaCdrvRechazadaDerivationsConditional2() {
        if (personaCdrvRechazada != null) return;
        // CONDITION: RechazadoAfiliacion LIKE \"%\" + \"NO\" + \"%\" + \"RECHAZADO\" + \"%\"
        // EFFECT   : FALSE
        boolean personaCdrvRechazadaCond = Utilities.like(this.getPersonaCRechazadoAfiliacion(), "%" + "NO" + "%" + "RECHAZADO" + "%");
        if (personaCdrvRechazadaCond) {
            personaCdrvRechazada = Boolean.FALSE;
        }
    }

    private void personaCdrvRechazadaDerivationsDefault() {
        if (personaCdrvRechazada != null) return;
        // Default derivation
        // EFFECT   : TRUE
        personaCdrvRechazada = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>personaCdrvNombreCompleto</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personaCdrvNombreCompleto</code> derived attribute.
     */
    public String personaCdrvNombreCompletoDerivations() {

        personaCdrvNombreCompleto = null;

        personaCdrvNombreCompletoDerivationsConditional1();
        personaCdrvNombreCompletoDerivationsDefault();
        return personaCdrvNombreCompleto;
    }

    private void personaCdrvNombreCompletoDerivationsConditional1() {
        if (personaCdrvNombreCompleto != null) return;
        // CONDITION: drvTipoPersona = \"N\"
        // EFFECT   : fuconcatenarConNulos(\"\", PrimerNombre) + fuconcatenarConNulos(\" \", SegundoNombre) + fuconcatenarConNulos(\" \", PrimerApellido) + fuconcatenarConNulos(\" \", SegundoApellido)
        boolean personaCdrvNombreCompletoCond = (this.getPersonaCdrvTipoPersona()).equals("N");
        if (personaCdrvNombreCompletoCond) {
            personaCdrvNombreCompleto = userFunctionsSrv.fuconcatenarConNulosFun("", this.getPersonaCPrimerNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getPersonaCSegundoNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getPersonaCPrimerApellido()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getPersonaCSegundoApellido());
        }
    }

    private void personaCdrvNombreCompletoDerivationsDefault() {
        if (personaCdrvNombreCompleto != null) return;
        // Default derivation
        // EFFECT   : RazonSocial
        personaCdrvNombreCompleto = this.getPersonaCRazonSocial();
    }

    /**
     * Computes the value of the <code>personaCdrvDirCorrespondencia</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personaCdrvDirCorrespondencia</code> derived attribute.
     */
    public String personaCdrvDirCorrespondenciaDerivations() throws SystemException {

        personaCdrvDirCorrespondencia = null;

        personaCdrvDirCorrespondenciaDerivationsConditional1();
        personaCdrvDirCorrespondenciaDerivationsConditional2();
        personaCdrvDirCorrespondenciaDerivationsDefault();
        return personaCdrvDirCorrespondencia;
    }

    private void personaCdrvDirCorrespondenciaDerivationsConditional1() throws SystemException {
        if (personaCdrvDirCorrespondencia != null) return;
        // CONDITION: drvTipoPersona = \"N\" AND EXIST( DireccionesC ) WHERE (DireccionesC.TipoDireccionC.Descripcion LIKE \"CORR%\") = TRUE
        // EFFECT   : GETONE( DireccionesC.DireccionCompleta ) WHERE (DireccionesC.TipoDireccionC.Descripcion LIKE \"CORR%\")
        boolean personaCdrvDirCorrespondenciaCond = (this.getPersonaCdrvTipoPersona()).equals("N") && getPersonaCRepository().assocOperator000(this).equals(true);
        if (personaCdrvDirCorrespondenciaCond) {
            personaCdrvDirCorrespondencia = getPersonaCRepository().assocOperator001(this);
        }
    }

    private void personaCdrvDirCorrespondenciaDerivationsConditional2() throws SystemException {
        if (personaCdrvDirCorrespondencia != null) return;
        // CONDITION: drvTipoPersona <> \"N\" AND EXIST( DirSucursalesC ) WHERE (DirSucursalesC.EsPrincipal = true) = true
        // EFFECT   : GETONE( DirSucursalesC.Direccion ) WHERE (DirSucursalesC.EsPrincipal = true)
        boolean personaCdrvDirCorrespondenciaCond = !(this.getPersonaCdrvTipoPersona()).equals("N") && getPersonaCRepository().assocOperator002(this).equals(true);
        if (personaCdrvDirCorrespondenciaCond) {
            personaCdrvDirCorrespondencia = getPersonaCRepository().assocOperator003(this);
        }
    }

    private void personaCdrvDirCorrespondenciaDerivationsDefault() {
        if (personaCdrvDirCorrespondencia != null) return;
        // Default derivation
        // EFFECT   : \"\"
        personaCdrvDirCorrespondencia = "";
    }

    /**
     * Computes the value of the <code>personaCdrvCiudadCorrespondencia</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personaCdrvCiudadCorrespondencia</code> derived attribute.
     */
    public String personaCdrvCiudadCorrespondenciaDerivations() throws SystemException {

        personaCdrvCiudadCorrespondencia = null;

        personaCdrvCiudadCorrespondenciaDerivationsConditional1();
        personaCdrvCiudadCorrespondenciaDerivationsConditional2();
        personaCdrvCiudadCorrespondenciaDerivationsDefault();
        return personaCdrvCiudadCorrespondencia;
    }

    private void personaCdrvCiudadCorrespondenciaDerivationsConditional1() throws SystemException {
        if (personaCdrvCiudadCorrespondencia != null) return;
        // CONDITION: drvTipoPersona = \"N\" AND EXIST( DireccionesC ) WHERE (DireccionesC.TipoDireccionC.Descripcion LIKE \"CORR%\") = TRUE
        // EFFECT   : GETONE( DireccionesC.drvCiudad ) WHERE (DireccionesC.TipoDireccionC.Descripcion LIKE \"CORR%\")
        boolean personaCdrvCiudadCorrespondenciaCond = (this.getPersonaCdrvTipoPersona()).equals("N") && getPersonaCRepository().assocOperator004(this).equals(true);
        if (personaCdrvCiudadCorrespondenciaCond) {
            personaCdrvCiudadCorrespondencia = getPersonaCRepository().assocOperator005(this);
        }
    }

    private void personaCdrvCiudadCorrespondenciaDerivationsConditional2() throws SystemException {
        if (personaCdrvCiudadCorrespondencia != null) return;
        // CONDITION: drvTipoPersona <> \"N\" AND EXIST( DirSucursalesC ) WHERE (DirSucursalesC.EsPrincipal = true) = true
        // EFFECT   : GETONE( DirSucursalesC.drvCiudad ) WHERE (DirSucursalesC.EsPrincipal = true)
        boolean personaCdrvCiudadCorrespondenciaCond = !(this.getPersonaCdrvTipoPersona()).equals("N") && getPersonaCRepository().assocOperator006(this).equals(true);
        if (personaCdrvCiudadCorrespondenciaCond) {
            personaCdrvCiudadCorrespondencia = getPersonaCRepository().assocOperator007(this);
        }
    }

    private void personaCdrvCiudadCorrespondenciaDerivationsDefault() {
        if (personaCdrvCiudadCorrespondencia != null) return;
        // Default derivation
        // EFFECT   : \"\"
        personaCdrvCiudadCorrespondencia = "";
    }

    /**
     * Computes the value of the <code>personaCdrvTipoNumDoc</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personaCdrvTipoNumDoc</code> derived attribute.
     */
    public String personaCdrvTipoNumDocDerivations() {

        personaCdrvTipoNumDoc = null;

        personaCdrvTipoNumDocDerivationsDefault();
        return personaCdrvTipoNumDoc;
    }

    private void personaCdrvTipoNumDocDerivationsDefault() {
        if (personaCdrvTipoNumDoc != null) return;
        // Default derivation
        // EFFECT   : TipoIdentificacionC.NombreCorto + \" - \" + NumIdentificacion
        personaCdrvTipoNumDoc = this.getTipoIdentificacionC().getTipoIdentificacionNombreCorto() + " - " + this.getPersonaCNumIdentificacion();
    }

    /**
     * Computes the value of the <code>personaCdrvEdad</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personaCdrvEdad</code> derived attribute.
     */
    public Long personaCdrvEdadDerivations() {

        personaCdrvEdad = null;

        personaCdrvEdadDerivationsConditional1();
        personaCdrvEdadDerivationsConditional2();
        personaCdrvEdadDerivationsConditional3();
        personaCdrvEdadDerivationsDefault();
        return personaCdrvEdad;
    }

    private void personaCdrvEdadDerivationsConditional1() {
        if (personaCdrvEdad != null) return;
        // CONDITION: FechaNacimiento = NULL
        // EFFECT   : 0
        boolean personaCdrvEdadCond = this.getPersonaCFechaNacimiento() == null;
        if (personaCdrvEdadCond) {
            personaCdrvEdad = Long.valueOf(0);
        }
    }

    private void personaCdrvEdadDerivationsConditional2() {
        if (personaCdrvEdad != null) return;
        // CONDITION: FechaNacimiento >= systemDate()
        // EFFECT   : 0
        boolean personaCdrvEdadCond = (STDFunctions.dateAfterFun(this.getPersonaCFechaNacimiento(),STDFunctions.systemDateFun()) || STDFunctions.dateEqualsFun(this.getPersonaCFechaNacimiento(),STDFunctions.systemDateFun()));
        if (personaCdrvEdadCond) {
            personaCdrvEdad = Long.valueOf(0);
        }
    }

    private void personaCdrvEdadDerivationsConditional3() {
        if (personaCdrvEdad != null) return;
        // CONDITION: getMonth( systemDate() ) * 50 + getDay( systemDate() ) >= getMonth( FechaNacimiento ) * 50 + getDay( FechaNacimiento ) 
        // EFFECT   : getYear(systemDate()) - getYear( FechaNacimiento)
        boolean personaCdrvEdadCond = STDFunctions.getMonthFun(STDFunctions.systemDateFun()) * Long.valueOf(50) + STDFunctions.getDayFun(STDFunctions.systemDateFun()) >= STDFunctions.getMonthFun(this.getPersonaCFechaNacimiento()) * Long.valueOf(50) + STDFunctions.getDayFun(this.getPersonaCFechaNacimiento());
        if (personaCdrvEdadCond) {
            personaCdrvEdad = STDFunctions.getYearFun(STDFunctions.systemDateFun()) - STDFunctions.getYearFun(this.getPersonaCFechaNacimiento());
        }
    }

    private void personaCdrvEdadDerivationsDefault() {
        if (personaCdrvEdad != null) return;
        // Default derivation
        // EFFECT   : getYear(systemDate()) - getYear( FechaNacimiento) - 1
        personaCdrvEdad = STDFunctions.getYearFun(STDFunctions.systemDateFun()) - STDFunctions.getYearFun(this.getPersonaCFechaNacimiento()) - Long.valueOf(1);
    }

    /**
     * Computes the value of the <code>personaCdrvObsContrato</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personaCdrvObsContrato</code> derived attribute.
     */
    public String personaCdrvObsContratoDerivations() throws SystemException {

        personaCdrvObsContrato = null;

        personaCdrvObsContratoDerivationsConditional1();
        personaCdrvObsContratoDerivationsConditional2();
        personaCdrvObsContratoDerivationsConditional3();
        personaCdrvObsContratoDerivationsConditional4();
        personaCdrvObsContratoDerivationsDefault();
        return personaCdrvObsContrato;
    }

    private void personaCdrvObsContratoDerivationsConditional1() throws SystemException {
        if (personaCdrvObsContrato != null) return;
        // CONDITION: EXIST (PreexistenciasC) = FALSE 
        // EFFECT   : \"\"
        boolean personaCdrvObsContratoCond = getPersonaCRepository().assocOperator008(this).equals(false);
        if (personaCdrvObsContratoCond) {
            personaCdrvObsContrato = "";
        }
    }

    private void personaCdrvObsContratoDerivationsConditional2() throws SystemException {
        if (personaCdrvObsContrato != null) return;
        // CONDITION: EXIST (ContratosC) = TRUE AND ContratosC.drvMostrarPreEnRepCon = TRUE
        // EFFECT   : \"Ver carta de preexistencia\"
        boolean personaCdrvObsContratoCond = getPersonaCRepository().assocOperator009(this).equals(true) && this.getContratosC().getContratoCdrvMostrarPreEnRepCon().equals(true);
        if (personaCdrvObsContratoCond) {
            personaCdrvObsContrato = "Ver carta de preexistencia";
        }
    }

    private void personaCdrvObsContratoDerivationsConditional3() throws SystemException {
        if (personaCdrvObsContrato != null) return;
        // CONDITION: EXIST (FamiliasC) = TRUE AND FamiliasC.ContratoC.drvMostrarPreEnRepCon = TRUE
        // EFFECT   : \"Ver carta de preexistencia\"
        boolean personaCdrvObsContratoCond = getPersonaCRepository().assocOperator010(this).equals(true) && this.getFamiliasC().getContratoC().getContratoCdrvMostrarPreEnRepCon().equals(true);
        if (personaCdrvObsContratoCond) {
            personaCdrvObsContrato = "Ver carta de preexistencia";
        }
    }

    private void personaCdrvObsContratoDerivationsConditional4() throws SystemException {
        if (personaCdrvObsContrato != null) return;
        // CONDITION: EXIST (BeneficiariosC) = TRUE AND BeneficiariosC.ContratoC.drvMostrarPreEnRepCon = TRUE
        // EFFECT   : \"Ver carta de preexistencia\"
        boolean personaCdrvObsContratoCond = getPersonaCRepository().assocOperator011(this).equals(true) && this.getBeneficiariosC().getContratoC().getContratoCdrvMostrarPreEnRepCon().equals(true);
        if (personaCdrvObsContratoCond) {
            personaCdrvObsContrato = "Ver carta de preexistencia";
        }
    }

    private void personaCdrvObsContratoDerivationsDefault() {
        if (personaCdrvObsContrato != null) return;
        // Default derivation
        // EFFECT   : \"\"
        personaCdrvObsContrato = "";
    }

    /**
     * Computes the value of the <code>personaCdrvIMC</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personaCdrvIMC</code> derived attribute.
     */
    public Double personaCdrvIMCDerivations() {

        personaCdrvIMC = null;

        personaCdrvIMCDerivationsDefault();
        return personaCdrvIMC;
    }

    private void personaCdrvIMCDerivationsDefault() {
        if (personaCdrvIMC != null) return;
        // Default derivation
        // EFFECT   : fuCalcularIMC( THIS )
        personaCdrvIMC = userFunctionsSrv.fuCalcularIMCFun(this);
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        personaCCodigo = null;
        personaCNumIdentificacion = "";
        personaCMail = null;
        personaCPrimerNombre = null;
        personaCSegundoNombre = null;
        personaCPrimerApellido = null;
        personaCSegundoApellido = null;
        personaCFechaNacimiento = null;
        personaCGenero = null;
        personaCIndicadorExtranjero = null;
        personaCRazonSocial = null;
        personaCTieneEPSSanitas = null;
        personaCRechazadoAfiliacion = null;
        personaCNombreCompleto = null;
        personaCUltimaActualizacion = null;
        direccionesC = null;
        proteccionesDatosC = null;
        pregsCuesMedC = null;
        dirSucursalesC = null;
        preexistenciasC = null;
        marcasMedicasC = null;
        tipoInstitucionC = null;
        tipoEntidadC = null;
        estadoCivilC = null;
        estadoPersonaC = null;
        tipoIdentificacionC = null;
        municipioCNac = null;
        departamentoCNac = null;
        contratosC = null;
        familiasC = null;
        beneficiariosC = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
    }

    public PersonaCJpaRepository getPersonaCRepository() {
        return Arc.container().select(PersonaCJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return PersonaC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PersonaCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPersonaCCodigo = false;
    	values.put("personaCCodigo", getPersonaCCodigo());
    	modifiedPersonaCNumIdentificacion = false;
    	values.put("personaCNumIdentificacion", getPersonaCNumIdentificacion());
    	modifiedPersonaCMail = false;
    	values.put("personaCMail", getPersonaCMail());
    	modifiedPersonaCPrimerNombre = false;
    	values.put("personaCPrimerNombre", getPersonaCPrimerNombre());
    	modifiedPersonaCSegundoNombre = false;
    	values.put("personaCSegundoNombre", getPersonaCSegundoNombre());
    	modifiedPersonaCPrimerApellido = false;
    	values.put("personaCPrimerApellido", getPersonaCPrimerApellido());
    	modifiedPersonaCSegundoApellido = false;
    	values.put("personaCSegundoApellido", getPersonaCSegundoApellido());
    	modifiedPersonaCFechaNacimiento = false;
    	values.put("personaCFechaNacimiento", getPersonaCFechaNacimiento());
    	modifiedPersonaCGenero = false;
    	values.put("personaCGenero", getPersonaCGenero());
    	modifiedPersonaCIndicadorExtranjero = false;
    	values.put("personaCIndicadorExtranjero", getPersonaCIndicadorExtranjero());
    	modifiedPersonaCRazonSocial = false;
    	values.put("personaCRazonSocial", getPersonaCRazonSocial());
    	modifiedPersonaCTieneEPSSanitas = false;
    	values.put("personaCTieneEPSSanitas", getPersonaCTieneEPSSanitas());
    	modifiedPersonaCRechazadoAfiliacion = false;
    	values.put("personaCRechazadoAfiliacion", getPersonaCRechazadoAfiliacion());
    	modifiedPersonaCNombreCompleto = false;
    	values.put("personaCNombreCompleto", getPersonaCNombreCompleto());
    	modifiedPersonaCUltimaActualizacion = false;
    	values.put("personaCUltimaActualizacion", getPersonaCUltimaActualizacion());
    	modifiedDireccionesC = false;
    	modifiedProteccionesDatosC = false;
    	modifiedPregsCuesMedC = false;
    	modifiedDirSucursalesC = false;
    	modifiedPreexistenciasC = false;
    	modifiedMarcasMedicasC = false;
    	modifiedTipoInstitucionC = false;
    	modifiedTipoEntidadC = false;
    	modifiedEstadoCivilC = false;
    	modifiedEstadoPersonaC = false;
    	modifiedTipoIdentificacionC = false;
    	modifiedMunicipioCNac = false;
    	modifiedDepartamentoCNac = false;
    	modifiedContratosC = false;
    	modifiedFamiliasC = false;
    	modifiedBeneficiariosC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            personaCdrvTipoPersona = null;
            personaCdrvRechazada = null;
            personaCdrvNombreCompleto = null;
            personaCdrvDirCorrespondencia = null;
            personaCdrvCiudadCorrespondencia = null;
            personaCdrvTipoNumDoc = null;
            personaCdrvEdad = null;
            personaCdrvObsContrato = null;
            personaCdrvIMC = null;
    }

    /**
     * Returns the <code>PersonaCOid</code> object that identifies this instance of <code>PersonaC</code>.
     * @return <code>PersonaCOid </code> object that identifies this instance of <code>PersonaC</code>
     */
	@Override
    public PersonaCOid getOid() {
        return new PersonaCOid(getPersonaCID());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PersonaCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(PersonaCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PERSONAC)) {
            // Add this class
            activeFacets.add(Constants.PERSONAC);
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
            relatedInstance = buildPersonaCRelatedInstance(relatedInstanceJsonOid);
        }
        if (PersonaCConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_PROTECCIONESDATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4ProteccionDatosC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_PREGSCUESMEDC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4PregCuesMedC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_DIRSUCURSALESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_PREEXISTENCIASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4PreexistenciaC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_MARCASMEDICASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4MarcaMedicaC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_TIPOINSTITUCIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4TipoInstitucionC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_TIPOENTIDADC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4TipoEntidadC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_ESTADOCIVILC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4EstadoCivil(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_ESTADOPERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4EstadoPersona(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_TIPOIDENTIFICACIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_MUNICIPIOCNAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_DEPARTAMENTOCNAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_FAMILIASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4FamiliaC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPersonaCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4ProteccionDatosC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ProteccionDatosC(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosCOid.class)): ProteccionDatosC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4PregCuesMedC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PregCuesMedC(mapper.readValue(relatedInstanceJsonOid, PregCuesMedCOid.class)): PregCuesMedC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4PreexistenciaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PreexistenciaC(mapper.readValue(relatedInstanceJsonOid, PreexistenciaCOid.class)): PreexistenciaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4MarcaMedicaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new MarcaMedicaC(mapper.readValue(relatedInstanceJsonOid, MarcaMedicaCOid.class)): MarcaMedicaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4TipoInstitucionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoInstitucionC(mapper.readValue(relatedInstanceJsonOid, TipoInstitucionCOid.class)): TipoInstitucionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4TipoEntidadC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoEntidadC(mapper.readValue(relatedInstanceJsonOid, TipoEntidadCOid.class)): TipoEntidadC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4EstadoCivil(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoCivil(mapper.readValue(relatedInstanceJsonOid, EstadoCivilOid.class)): EstadoCivil.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4EstadoPersona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoPersona(mapper.readValue(relatedInstanceJsonOid, EstadoPersonaOid.class)): EstadoPersona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4FamiliaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaC(mapper.readValue(relatedInstanceJsonOid, FamiliaCOid.class)): FamiliaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
