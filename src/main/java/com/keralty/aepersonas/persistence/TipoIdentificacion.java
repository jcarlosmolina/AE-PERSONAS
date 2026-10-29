package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.persistence.oid.AnexoCOid;
import com.keralty.aepersonas.persistence.oid.AsesorOid;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.FamiliaNovedadOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.persistence.oid.NovedadCTOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.oid.UsuarioNovedadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.repository.AsesorJpaRepository;
import com.keralty.aepersonas.repository.ContratanteJpaRepository;
import com.keralty.aepersonas.repository.InstitucionMatNeoJpaRepository;
import com.keralty.aepersonas.repository.PersonaJpaRepository;
import com.keralty.aepersonas.repository.TitularJpaRepository;
import com.keralty.aepersonas.repository.UsuarioJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
 * Persistent representation of the <code>TipoIdentificacion</code> model class.
 * <p>
 * Model Class: <code>TipoIdentificacion</code><br>
 */
@Entity(name = TipoIdentificacionConstants.CLASS_NAME)
@Table(name = TipoIdentificacionConstants.TBL_NAME)
public class TipoIdentificacion extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient AsesorJpaRepository asesorRepository;

    @JsonIgnore
    private transient PersonaJpaRepository personaRepository;

    @JsonIgnore
    private transient UsuarioJpaRepository usuarioRepository;

    @JsonIgnore
    private transient ContratanteJpaRepository contratanteRepository;

    @JsonIgnore
    private transient TitularJpaRepository titularRepository;

    @JsonIgnore
    private transient InstitucionMatNeoJpaRepository institucionMatNeoRepository;

    /** Class identification function. */
    @Id
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO )
    @JsonProperty(value="codigo")
    private Long tipoIdentificacionCodigo;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String tipoIdentificacionDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionDescripcion;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONNOMBRECORTO )
    @JsonProperty(value="nombrecorto")
    private String tipoIdentificacionNombreCorto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionNombreCorto;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONVALIDOCONTRATANTE )
    @JsonProperty(value="validocontratante")
    private Boolean tipoIdentificacionValidoContratante;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionValidoContratante;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONVALIDOTITULAR )
    @JsonProperty(value="validotitular")
    private Boolean tipoIdentificacionValidoTitular;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionValidoTitular;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONDIPLOMATICO )
    @JsonProperty(value="diplomatico")
    private Boolean tipoIdentificacionDiplomatico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionDiplomatico;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONNIT )
    @JsonProperty(value="nit")
    private Boolean tipoIdentificacionNIT;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionNIT;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONHIJODE )
    @JsonProperty(value="hijode")
    private Boolean tipoIdentificacionHijoDe;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionHijoDe;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONREQUIEREEPS )
    @JsonProperty(value="requiereeps")
    private Boolean tipoIdentificacionRequiereEPS;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionRequiereEPS;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONMENORSINIDENTIFICAR )
    @JsonProperty(value="menorsinidentificar")
    private Boolean tipoIdentificacionMenorSinIdentificar;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionMenorSinIdentificar;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONESPASAPORTE )
    @JsonProperty(value="espasaporte")
    private Boolean tipoIdentificacionEsPasaporte;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionEsPasaporte;

    /** Class member attribute. */
    @Column(name = TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONVISIBLEVALIDADORUSU )
    @JsonProperty(value="visiblevalidadorusu")
    private Boolean tipoIdentificacionVisibleValidadorUsu;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionVisibleValidadorUsu;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_ASESORES)
    @JsonIgnore
    private Collection <Asesor> asesores;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAsesores;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_PERSONAS)
    @JsonIgnore
    private Collection <Persona> personas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonas;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_PERSONASC)
    @JsonIgnore
    private Collection <PersonaC> personasC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonasC;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_USUARIOS)
    @JsonIgnore
    private Collection <Usuario> usuarioS;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioS;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_CONTRATANTES)
    @JsonIgnore
    private Collection <Contratante> contratantes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratantes;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_ANEXOSC)
    @JsonIgnore
    private Collection <AnexoC> anexosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexosC;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_TITULARES)
    @JsonIgnore
    private Collection <Titular> titulares;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTitulares;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_INSTITUCIONMATNEO)
    @JsonIgnore
    private Collection <InstitucionMatNeo> institucionMatNeo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedInstitucionMatNeo;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_SOLICITUDESNOVEDAD)
    @JsonIgnore
    private Collection <SolicitudNovedad> solicitudesNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudesNovedad;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_FAMILIASNOVEDAD)
    @JsonIgnore
    private Collection <FamiliaNovedad> familiasNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliasNovedad;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_USUARIOSNOVEDAD)
    @JsonIgnore
    private Collection <UsuarioNovedad> usuariosNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuariosNovedad;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_USUARIONOVEDAD)
    @JsonIgnore
    private Collection <UsuarioNovedad> usuarioNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedad;

    /** Related Class. */
    @OneToMany(mappedBy = TipoIdentificacionConstants.ROLE_INVNAME_NOVEDADESCT)
    @JsonIgnore
    private Collection <NovedadCT> novedadesCT;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadesCT;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public TipoIdentificacion() {
        tipoIdentificacionCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TipoIdentificacion</code>.
     * @param oid Object Identifier of the instance of <code>TipoIdentificacion</code> to be created.
     * @throws SystemException
     */
    public TipoIdentificacion(TipoIdentificacionOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            tipoIdentificacionCodigo = oid.getTipoIdentificacionCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>tipoIdentificacionCodigo</code> attribute<br>in class <code>TipoIdentificacion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoIdentificacion</code>
     * @return The value of the <code>tipoIdentificacionCodigo</code> attribute<br>in class <code>TipoIdentificacion</code>.
     */
    public Long getTipoIdentificacionCodigo() {
        return tipoIdentificacionCodigo;
    }

    /**
     * Sets the value of the <code>tipoIdentificacionCodigo</code> attribute<br>in class <code>TipoIdentificacion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoIdentificacion</code>
     * @param tipoIdentificacionCodigo The new value of the <code>tipoIdentificacionCodigo</code> attribute<br>in class <code>TipoIdentificacion</code>.
     */
    public void setTipoIdentificacionCodigo(Long tipoIdentificacionCodigo) {
        this.tipoIdentificacionCodigo = tipoIdentificacionCodigo;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>tipoIdentificacionDescripcion</code> attribute.
    */

    public String getTipoIdentificacionDescripcion()  {
    	String value;
        value =  tipoIdentificacionDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoIdentificacionDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param tipoIdentificacionDescripcion The new value of the <code>tipoIdentificacionDescripcion</code> attribute.
    */
    public void setTipoIdentificacionDescripcion (String tipoIdentificacionDescripcion) {
        modifiedTipoIdentificacionDescripcion = true;
        this.tipoIdentificacionDescripcion = tipoIdentificacionDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionDescripcion() {
        return modifiedTipoIdentificacionDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionDescripcion</code>.
    */
    public void setModifiedTipoIdentificacionDescripcion(boolean modified) {
        this.modifiedTipoIdentificacionDescripcion = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionNombreCorto</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionNombreCorto</code>. Variable String Size=20<br>
    * Comments: <br>
    * @return The value of the <code>tipoIdentificacionNombreCorto</code> attribute.
    */

    public String getTipoIdentificacionNombreCorto()  {
    	String value;
        value =  tipoIdentificacionNombreCorto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoIdentificacionNombreCorto</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionNombreCorto</code>. Variable String Size=20<br>
    * Comments: <br>
    * @param tipoIdentificacionNombreCorto The new value of the <code>tipoIdentificacionNombreCorto</code> attribute.
    */
    public void setTipoIdentificacionNombreCorto (String tipoIdentificacionNombreCorto) {
        modifiedTipoIdentificacionNombreCorto = true;
        this.tipoIdentificacionNombreCorto = tipoIdentificacionNombreCorto;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionNombreCorto</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionNombreCorto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionNombreCorto() {
        return modifiedTipoIdentificacionNombreCorto;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionNombreCorto</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionNombreCorto</code>.
    */
    public void setModifiedTipoIdentificacionNombreCorto(boolean modified) {
        this.modifiedTipoIdentificacionNombreCorto = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionValidoContratante</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionValidoContratante</code>. Variable Bool<br>
    * Comments: Si es uno de los tipos de identificación permitidos para contratantes. Los que no lo sean no se permitirá su selección. Según la regla definida, el sistema no permitirá seleccionar como tipo de documento del contratante MS, TI ni RC. Estos tres tipo tendrían valor NO para este campo.<br>
    * @return The value of the <code>tipoIdentificacionValidoContratante</code> attribute.
    */

    public Boolean getTipoIdentificacionValidoContratante()  {
    	Boolean value;
        value =  tipoIdentificacionValidoContratante;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIdentificacionValidoContratante</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionValidoContratante</code>. Variable Bool<br>
    * Comments: Si es uno de los tipos de identificación permitidos para contratantes. Los que no lo sean no se permitirá su selección. Según la regla definida, el sistema no permitirá seleccionar como tipo de documento del contratante MS, TI ni RC. Estos tres tipo tendrían valor NO para este campo.<br>
    * @param tipoIdentificacionValidoContratante The new value of the <code>tipoIdentificacionValidoContratante</code> attribute.
    */
    public void setTipoIdentificacionValidoContratante (Boolean tipoIdentificacionValidoContratante) {
        modifiedTipoIdentificacionValidoContratante = true;
        this.tipoIdentificacionValidoContratante = tipoIdentificacionValidoContratante;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionValidoContratante</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionValidoContratante</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionValidoContratante() {
        return modifiedTipoIdentificacionValidoContratante;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionValidoContratante</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionValidoContratante</code>.
    */
    public void setModifiedTipoIdentificacionValidoContratante(boolean modified) {
        this.modifiedTipoIdentificacionValidoContratante = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionValidoTitular</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionValidoTitular</code>. Variable Bool<br>
    * Comments: Si es uno de los tipos de identificación permitidos para titulares. Los que no lo sean no se permitirá su selección<br>
    * @return The value of the <code>tipoIdentificacionValidoTitular</code> attribute.
    */

    public Boolean getTipoIdentificacionValidoTitular()  {
    	Boolean value;
        value =  tipoIdentificacionValidoTitular;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIdentificacionValidoTitular</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionValidoTitular</code>. Variable Bool<br>
    * Comments: Si es uno de los tipos de identificación permitidos para titulares. Los que no lo sean no se permitirá su selección<br>
    * @param tipoIdentificacionValidoTitular The new value of the <code>tipoIdentificacionValidoTitular</code> attribute.
    */
    public void setTipoIdentificacionValidoTitular (Boolean tipoIdentificacionValidoTitular) {
        modifiedTipoIdentificacionValidoTitular = true;
        this.tipoIdentificacionValidoTitular = tipoIdentificacionValidoTitular;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionValidoTitular</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionValidoTitular</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionValidoTitular() {
        return modifiedTipoIdentificacionValidoTitular;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionValidoTitular</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionValidoTitular</code>.
    */
    public void setModifiedTipoIdentificacionValidoTitular(boolean modified) {
        this.modifiedTipoIdentificacionValidoTitular = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionDiplomatico</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionDiplomatico</code>. Variable Bool<br>
    * Comments: Si es diplomático le aplican unas reglas especiales, por ejemplo, debe aparecer marcado el check de diplomático en la información del contratante y no aplica IVA<br>
    * @return The value of the <code>tipoIdentificacionDiplomatico</code> attribute.
    */

    public Boolean getTipoIdentificacionDiplomatico()  {
    	Boolean value;
        value =  tipoIdentificacionDiplomatico;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIdentificacionDiplomatico</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionDiplomatico</code>. Variable Bool<br>
    * Comments: Si es diplomático le aplican unas reglas especiales, por ejemplo, debe aparecer marcado el check de diplomático en la información del contratante y no aplica IVA<br>
    * @param tipoIdentificacionDiplomatico The new value of the <code>tipoIdentificacionDiplomatico</code> attribute.
    */
    public void setTipoIdentificacionDiplomatico (Boolean tipoIdentificacionDiplomatico) {
        modifiedTipoIdentificacionDiplomatico = true;
        this.tipoIdentificacionDiplomatico = tipoIdentificacionDiplomatico;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionDiplomatico</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionDiplomatico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionDiplomatico() {
        return modifiedTipoIdentificacionDiplomatico;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionDiplomatico</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionDiplomatico</code>.
    */
    public void setModifiedTipoIdentificacionDiplomatico(boolean modified) {
        this.modifiedTipoIdentificacionDiplomatico = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionNIT</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionNIT</code>. Variable Bool<br>
    * Comments: Si es NIT se deben mostrar más campos en la información del contratante (código entidad financiera, tipo de entidad y estado), además una persona con tipo de identificación NIT no podrá seleccionarse como titular de un contrato (en inclusión). <br>
    * @return The value of the <code>tipoIdentificacionNIT</code> attribute.
    */

    public Boolean getTipoIdentificacionNIT()  {
    	Boolean value;
        value =  tipoIdentificacionNIT;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIdentificacionNIT</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionNIT</code>. Variable Bool<br>
    * Comments: Si es NIT se deben mostrar más campos en la información del contratante (código entidad financiera, tipo de entidad y estado), además una persona con tipo de identificación NIT no podrá seleccionarse como titular de un contrato (en inclusión). <br>
    * @param tipoIdentificacionNIT The new value of the <code>tipoIdentificacionNIT</code> attribute.
    */
    public void setTipoIdentificacionNIT (Boolean tipoIdentificacionNIT) {
        modifiedTipoIdentificacionNIT = true;
        this.tipoIdentificacionNIT = tipoIdentificacionNIT;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionNIT</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionNIT</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionNIT() {
        return modifiedTipoIdentificacionNIT;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionNIT</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionNIT</code>.
    */
    public void setModifiedTipoIdentificacionNIT(boolean modified) {
        this.modifiedTipoIdentificacionNIT = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionHijoDe</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionHijoDe</code>. Variable Bool<br>
    * Comments: Si se marca, cuando se cree una persona de este tipo en el campo primer nombre por defecto debe aparecer “HIJODE” y la fecha de nacimiento debe aparecer como fecha del día<br>
    * @return The value of the <code>tipoIdentificacionHijoDe</code> attribute.
    */

    public Boolean getTipoIdentificacionHijoDe()  {
    	Boolean value;
        value =  tipoIdentificacionHijoDe;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIdentificacionHijoDe</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionHijoDe</code>. Variable Bool<br>
    * Comments: Si se marca, cuando se cree una persona de este tipo en el campo primer nombre por defecto debe aparecer “HIJODE” y la fecha de nacimiento debe aparecer como fecha del día<br>
    * @param tipoIdentificacionHijoDe The new value of the <code>tipoIdentificacionHijoDe</code> attribute.
    */
    public void setTipoIdentificacionHijoDe (Boolean tipoIdentificacionHijoDe) {
        modifiedTipoIdentificacionHijoDe = true;
        this.tipoIdentificacionHijoDe = tipoIdentificacionHijoDe;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionHijoDe</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionHijoDe</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionHijoDe() {
        return modifiedTipoIdentificacionHijoDe;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionHijoDe</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionHijoDe</code>.
    */
    public void setModifiedTipoIdentificacionHijoDe(boolean modified) {
        this.modifiedTipoIdentificacionHijoDe = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionRequiereEPS</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionRequiereEPS</code>. Variable Bool<br>
    * Comments: GC - Fase 1<br>
    * @return The value of the <code>tipoIdentificacionRequiereEPS</code> attribute.
    */

    public Boolean getTipoIdentificacionRequiereEPS()  {
    	Boolean value;
        value =  tipoIdentificacionRequiereEPS;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIdentificacionRequiereEPS</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionRequiereEPS</code>. Variable Bool<br>
    * Comments: GC - Fase 1<br>
    * @param tipoIdentificacionRequiereEPS The new value of the <code>tipoIdentificacionRequiereEPS</code> attribute.
    */
    public void setTipoIdentificacionRequiereEPS (Boolean tipoIdentificacionRequiereEPS) {
        modifiedTipoIdentificacionRequiereEPS = true;
        this.tipoIdentificacionRequiereEPS = tipoIdentificacionRequiereEPS;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionRequiereEPS</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionRequiereEPS</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionRequiereEPS() {
        return modifiedTipoIdentificacionRequiereEPS;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionRequiereEPS</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionRequiereEPS</code>.
    */
    public void setModifiedTipoIdentificacionRequiereEPS(boolean modified) {
        this.modifiedTipoIdentificacionRequiereEPS = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionMenorSinIdentificar</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionMenorSinIdentificar</code>. Variable Bool<br>
    * Comments: GC - Fase 2: Los usuarios que no tienen EPS Sanitas con tipos de identificación diferentes a menor sin identificar, la EPS sanitas no se debe visualizar en la lista de EPS a seleccionar.<br>
    * @return The value of the <code>tipoIdentificacionMenorSinIdentificar</code> attribute.
    */

    public Boolean getTipoIdentificacionMenorSinIdentificar()  {
    	Boolean value;
        value =  tipoIdentificacionMenorSinIdentificar;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIdentificacionMenorSinIdentificar</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionMenorSinIdentificar</code>. Variable Bool<br>
    * Comments: GC - Fase 2: Los usuarios que no tienen EPS Sanitas con tipos de identificación diferentes a menor sin identificar, la EPS sanitas no se debe visualizar en la lista de EPS a seleccionar.<br>
    * @param tipoIdentificacionMenorSinIdentificar The new value of the <code>tipoIdentificacionMenorSinIdentificar</code> attribute.
    */
    public void setTipoIdentificacionMenorSinIdentificar (Boolean tipoIdentificacionMenorSinIdentificar) {
        modifiedTipoIdentificacionMenorSinIdentificar = true;
        this.tipoIdentificacionMenorSinIdentificar = tipoIdentificacionMenorSinIdentificar;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionMenorSinIdentificar</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionMenorSinIdentificar</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionMenorSinIdentificar() {
        return modifiedTipoIdentificacionMenorSinIdentificar;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionMenorSinIdentificar</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionMenorSinIdentificar</code>.
    */
    public void setModifiedTipoIdentificacionMenorSinIdentificar(boolean modified) {
        this.modifiedTipoIdentificacionMenorSinIdentificar = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionEsPasaporte</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionEsPasaporte</code>. Variable Bool<br>
    * Comments: Indica que el tipo de identificación es Pasaporte<br>
    * @return The value of the <code>tipoIdentificacionEsPasaporte</code> attribute.
    */

    public Boolean getTipoIdentificacionEsPasaporte()  {
    	Boolean value;
        value =  tipoIdentificacionEsPasaporte;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIdentificacionEsPasaporte</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionEsPasaporte</code>. Variable Bool<br>
    * Comments: Indica que el tipo de identificación es Pasaporte<br>
    * @param tipoIdentificacionEsPasaporte The new value of the <code>tipoIdentificacionEsPasaporte</code> attribute.
    */
    public void setTipoIdentificacionEsPasaporte (Boolean tipoIdentificacionEsPasaporte) {
        modifiedTipoIdentificacionEsPasaporte = true;
        this.tipoIdentificacionEsPasaporte = tipoIdentificacionEsPasaporte;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionEsPasaporte</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionEsPasaporte</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionEsPasaporte() {
        return modifiedTipoIdentificacionEsPasaporte;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionEsPasaporte</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionEsPasaporte</code>.
    */
    public void setModifiedTipoIdentificacionEsPasaporte(boolean modified) {
        this.modifiedTipoIdentificacionEsPasaporte = modified;
    }

   /**
    * Returns the value of the <code>tipoIdentificacionVisibleValidadorUsu</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionVisibleValidadorUsu</code>. Variable Bool<br>
    * Comments: GdC-40 Req 3: -	Tipo de documento del usuario a consultar: Debe utilizar los tipos de documento que se utilizan en la paramétrica ampliada “Tipo de documento” pero con la posibilidad de que alguno de los tipos no sea visible en esta funcionalidad. Para ello, se añadirá una marca llamada “Visible en validador de usuarios” a la paramétrica ampliada “Tipo de documento” que tomará los valores “Sí” (será visible) o “No” (no será una opción disponible en el validador). Por defecto, todos los tipos de documento será visibles en el validado<br>
    * @return The value of the <code>tipoIdentificacionVisibleValidadorUsu</code> attribute.
    */

    public Boolean getTipoIdentificacionVisibleValidadorUsu()  {
    	Boolean value;
        value =  tipoIdentificacionVisibleValidadorUsu;
        return value;
    }

   /**
    * Sets the value of the <code>tipoIdentificacionVisibleValidadorUsu</code> attribute.<br>
    * Model Attribute: <code>tipoIdentificacionVisibleValidadorUsu</code>. Variable Bool<br>
    * Comments: GdC-40 Req 3: -	Tipo de documento del usuario a consultar: Debe utilizar los tipos de documento que se utilizan en la paramétrica ampliada “Tipo de documento” pero con la posibilidad de que alguno de los tipos no sea visible en esta funcionalidad. Para ello, se añadirá una marca llamada “Visible en validador de usuarios” a la paramétrica ampliada “Tipo de documento” que tomará los valores “Sí” (será visible) o “No” (no será una opción disponible en el validador). Por defecto, todos los tipos de documento será visibles en el validado<br>
    * @param tipoIdentificacionVisibleValidadorUsu The new value of the <code>tipoIdentificacionVisibleValidadorUsu</code> attribute.
    */
    public void setTipoIdentificacionVisibleValidadorUsu (Boolean tipoIdentificacionVisibleValidadorUsu) {
        modifiedTipoIdentificacionVisibleValidadorUsu = true;
        this.tipoIdentificacionVisibleValidadorUsu = tipoIdentificacionVisibleValidadorUsu;
    }

   /**
    * Returns the value of the <code>modifiedTipoIdentificacionVisibleValidadorUsu</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoIdentificacionVisibleValidadorUsu</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoIdentificacionVisibleValidadorUsu() {
        return modifiedTipoIdentificacionVisibleValidadorUsu;
    }

   /**
    * Sets the value of the <code>modifiedTipoIdentificacionVisibleValidadorUsu</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoIdentificacionVisibleValidadorUsu</code>.
    */
    public void setModifiedTipoIdentificacionVisibleValidadorUsu(boolean modified) {
        this.modifiedTipoIdentificacionVisibleValidadorUsu = modified;
    }

    /**
     * Returns the instance of <code>Asesor</code> related through the <code>Asesores</code> role.
     * Model Relationship:
     * <code>[Asesor] Asesores 0:M  ------ 0:1  TipoIdentificacion [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Asesor</code> related through the <code>Asesores</code> role.
     */
    @JsonIgnore
    public Collection <Asesor> getAsesores() {
        return getAsesorRepository().findByTipoIdentificacion(this);
    }

    /**
     * Adds an instance of <code>Asesor</code> related through the <code>Asesores</code> role.
     * @param asesores The instance to add to the <code>Asesores</code> role.
     */
    public void add2Asesores(Asesor asesores) {
        this.asesores.add(asesores);
    }
    /**
     * Removes an instance of <code>Asesor</code> related through the <code>Asesores</code> role.
     * @param asesores The instance to be removed
     */
    public void removeFromAsesores(Asesor asesores) {
    	this.asesores.remove(asesores);
    }
    /**
     * Sets instances of <code>Asesor</code> related through the <code>Asesores</code> role.
     * @param asesores The new value for the <code>Asesores</code> role.
     */
    public void setAsesores(Collection < Asesor > asesores) {
        this.asesores = asesores;
    }

   /**
    * This method gets the attribute value <code>modifiedAsesores</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAsesores</code> has been modified.
    */
    public boolean isModifiedAsesores(){
        return modifiedAsesores;
    }

    /**
     * Returns the instance of <code>Persona</code> related through the <code>Personas</code> role.
     * Model Relationship:
     * <code>[Persona] Personas 0:M  ------ 1:1  TipoIdentificacion [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Persona</code> related through the <code>Personas</code> role.
     */
    @JsonIgnore
    public Collection <Persona> getPersonas() {
        return getPersonaRepository().findByTipoIdentificacion(this);
    }

    /**
     * Adds an instance of <code>Persona</code> related through the <code>Personas</code> role.
     * @param personas The instance to add to the <code>Personas</code> role.
     */
    public void add2Personas(Persona personas) {
        this.personas.add(personas);
    }
    /**
     * Removes an instance of <code>Persona</code> related through the <code>Personas</code> role.
     * @param personas The instance to be removed
     */
    public void removeFromPersonas(Persona personas) {
    	this.personas.remove(personas);
    }
    /**
     * Sets instances of <code>Persona</code> related through the <code>Personas</code> role.
     * @param personas The new value for the <code>Personas</code> role.
     */
    public void setPersonas(Collection < Persona > personas) {
        this.personas = personas;
    }

   /**
    * This method gets the attribute value <code>modifiedPersonas</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPersonas</code> has been modified.
    */
    public boolean isModifiedPersonas(){
        return modifiedPersonas;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonasC 0:M  ------ 1:1  TipoIdentificacionC [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     */
    @JsonIgnore
    public Collection <PersonaC> getPersonasC() {
        return personasC;
    }

    /**
     * Adds an instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * @param personasC The instance to add to the <code>PersonasC</code> role.
     */
    public void add2PersonasC(PersonaC personasC) {
        this.personasC.add(personasC);
    }
    /**
     * Removes an instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * @param personasC The instance to be removed
     */
    public void removeFromPersonasC(PersonaC personasC) {
    	this.personasC.remove(personasC);
    }
    /**
     * Sets instances of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * @param personasC The new value for the <code>PersonasC</code> role.
     */
    public void setPersonasC(Collection < PersonaC > personasC) {
        this.personasC = personasC;
    }

   /**
    * This method gets the attribute value <code>modifiedPersonasC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPersonasC</code> has been modified.
    */
    public boolean isModifiedPersonasC(){
        return modifiedPersonasC;
    }

    /**
     * Returns the instance of <code>Usuario</code> related through the <code>UsuarioS</code> role.
     * Model Relationship:
     * <code>[Usuario] UsuarioS 0:M  ------ 1:1  TipoIdentificacion [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Usuario</code> related through the <code>UsuarioS</code> role.
     */
    @JsonIgnore
    public Collection <Usuario> getUsuarioS() {
        return getUsuarioRepository().findByTipoIdentificacion(this);
    }

    /**
     * Adds an instance of <code>Usuario</code> related through the <code>UsuarioS</code> role.
     * @param usuarioS The instance to add to the <code>UsuarioS</code> role.
     */
    public void add2UsuarioS(Usuario usuarioS) {
        this.usuarioS.add(usuarioS);
    }
    /**
     * Removes an instance of <code>Usuario</code> related through the <code>UsuarioS</code> role.
     * @param usuarioS The instance to be removed
     */
    public void removeFromUsuarioS(Usuario usuarioS) {
    	this.usuarioS.remove(usuarioS);
    }
    /**
     * Sets instances of <code>Usuario</code> related through the <code>UsuarioS</code> role.
     * @param usuarioS The new value for the <code>UsuarioS</code> role.
     */
    public void setUsuarioS(Collection < Usuario > usuarioS) {
        this.usuarioS = usuarioS;
    }

   /**
    * This method gets the attribute value <code>modifiedUsuarioS</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuarioS</code> has been modified.
    */
    public boolean isModifiedUsuarioS(){
        return modifiedUsuarioS;
    }

    /**
     * Returns the instance of <code>Contratante</code> related through the <code>Contratantes</code> role.
     * Model Relationship:
     * <code>[Contratante] Contratantes 0:M  ------ 1:1  TipoIdentificacion [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Contratante</code> related through the <code>Contratantes</code> role.
     */
    @JsonIgnore
    public Collection <Contratante> getContratantes() {
        return getContratanteRepository().findByTipoIdentificacion(this);
    }

    /**
     * Adds an instance of <code>Contratante</code> related through the <code>Contratantes</code> role.
     * @param contratantes The instance to add to the <code>Contratantes</code> role.
     */
    public void add2Contratantes(Contratante contratantes) {
        this.contratantes.add(contratantes);
    }
    /**
     * Removes an instance of <code>Contratante</code> related through the <code>Contratantes</code> role.
     * @param contratantes The instance to be removed
     */
    public void removeFromContratantes(Contratante contratantes) {
    	this.contratantes.remove(contratantes);
    }
    /**
     * Sets instances of <code>Contratante</code> related through the <code>Contratantes</code> role.
     * @param contratantes The new value for the <code>Contratantes</code> role.
     */
    public void setContratantes(Collection < Contratante > contratantes) {
        this.contratantes = contratantes;
    }

   /**
    * This method gets the attribute value <code>modifiedContratantes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratantes</code> has been modified.
    */
    public boolean isModifiedContratantes(){
        return modifiedContratantes;
    }

    /**
     * Returns the instance of <code>AnexoC</code> related through the <code>AnexosC</code> role.
     * Model Relationship:
     * <code>[AnexoC] AnexosC 0:M  ------ 0:1  TipoIdentificacionC [TipoIdentificacion]</code>
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
     * Returns the instance of <code>Titular</code> related through the <code>Titulares</code> role.
     * Model Relationship:
     * <code>[Titular] Titulares 0:M  ------ 1:1  TipoIdentificacion [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Titular</code> related through the <code>Titulares</code> role.
     */
    @JsonIgnore
    public Collection <Titular> getTitulares() {
        return getTitularRepository().findByTipoIdentificacion(this);
    }

    /**
     * Adds an instance of <code>Titular</code> related through the <code>Titulares</code> role.
     * @param titulares The instance to add to the <code>Titulares</code> role.
     */
    public void add2Titulares(Titular titulares) {
        this.titulares.add(titulares);
    }
    /**
     * Removes an instance of <code>Titular</code> related through the <code>Titulares</code> role.
     * @param titulares The instance to be removed
     */
    public void removeFromTitulares(Titular titulares) {
    	this.titulares.remove(titulares);
    }
    /**
     * Sets instances of <code>Titular</code> related through the <code>Titulares</code> role.
     * @param titulares The new value for the <code>Titulares</code> role.
     */
    public void setTitulares(Collection < Titular > titulares) {
        this.titulares = titulares;
    }

   /**
    * This method gets the attribute value <code>modifiedTitulares</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTitulares</code> has been modified.
    */
    public boolean isModifiedTitulares(){
        return modifiedTitulares;
    }

    /**
     * Returns the instance of <code>InstitucionMatNeo</code> related through the <code>InstitucionMatNeo</code> role.
     * Model Relationship:
     * <code>[InstitucionMatNeo] InstitucionMatNeo 0:M  ------ 1:1  TipoIdentificacion [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>InstitucionMatNeo</code> related through the <code>InstitucionMatNeo</code> role.
     */
    @JsonIgnore
    public Collection <InstitucionMatNeo> getInstitucionMatNeo() {
        return getInstitucionMatNeoRepository().findByTipoIdentificacion(this);
    }

    /**
     * Adds an instance of <code>InstitucionMatNeo</code> related through the <code>InstitucionMatNeo</code> role.
     * @param institucionMatNeo The instance to add to the <code>InstitucionMatNeo</code> role.
     */
    public void add2InstitucionMatNeo(InstitucionMatNeo institucionMatNeo) {
        this.institucionMatNeo.add(institucionMatNeo);
    }
    /**
     * Removes an instance of <code>InstitucionMatNeo</code> related through the <code>InstitucionMatNeo</code> role.
     * @param institucionMatNeo The instance to be removed
     */
    public void removeFromInstitucionMatNeo(InstitucionMatNeo institucionMatNeo) {
    	this.institucionMatNeo.remove(institucionMatNeo);
    }
    /**
     * Sets instances of <code>InstitucionMatNeo</code> related through the <code>InstitucionMatNeo</code> role.
     * @param institucionMatNeo The new value for the <code>InstitucionMatNeo</code> role.
     */
    public void setInstitucionMatNeo(Collection < InstitucionMatNeo > institucionMatNeo) {
        this.institucionMatNeo = institucionMatNeo;
    }

   /**
    * This method gets the attribute value <code>modifiedInstitucionMatNeo</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedInstitucionMatNeo</code> has been modified.
    */
    public boolean isModifiedInstitucionMatNeo(){
        return modifiedInstitucionMatNeo;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudesNovedad 0:M  ------ 0:1  TipoIdentContratante [TipoIdentificacion]</code>
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
     * Returns the instance of <code>FamiliaNovedad</code> related through the <code>FamiliasNovedad</code> role.
     * Model Relationship:
     * <code>[FamiliaNovedad] FamiliasNovedad 0:M  ------ 0:1  TipoIdentificacion [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>FamiliaNovedad</code> related through the <code>FamiliasNovedad</code> role.
     */
    @JsonIgnore
    public Collection <FamiliaNovedad> getFamiliasNovedad() {
        return familiasNovedad;
    }

    /**
     * Adds an instance of <code>FamiliaNovedad</code> related through the <code>FamiliasNovedad</code> role.
     * @param familiasNovedad The instance to add to the <code>FamiliasNovedad</code> role.
     */
    public void add2FamiliasNovedad(FamiliaNovedad familiasNovedad) {
        this.familiasNovedad.add(familiasNovedad);
    }
    /**
     * Removes an instance of <code>FamiliaNovedad</code> related through the <code>FamiliasNovedad</code> role.
     * @param familiasNovedad The instance to be removed
     */
    public void removeFromFamiliasNovedad(FamiliaNovedad familiasNovedad) {
    	this.familiasNovedad.remove(familiasNovedad);
    }
    /**
     * Sets instances of <code>FamiliaNovedad</code> related through the <code>FamiliasNovedad</code> role.
     * @param familiasNovedad The new value for the <code>FamiliasNovedad</code> role.
     */
    public void setFamiliasNovedad(Collection < FamiliaNovedad > familiasNovedad) {
        this.familiasNovedad = familiasNovedad;
    }

   /**
    * This method gets the attribute value <code>modifiedFamiliasNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFamiliasNovedad</code> has been modified.
    */
    public boolean isModifiedFamiliasNovedad(){
        return modifiedFamiliasNovedad;
    }

    /**
     * Returns the instance of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     * Model Relationship:
     * <code>[UsuarioNovedad] UsuariosNovedad 0:M  ------ 0:1  TipoIdentificacion [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     */
    @JsonIgnore
    public Collection <UsuarioNovedad> getUsuariosNovedad() {
        return usuariosNovedad;
    }

    /**
     * Adds an instance of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     * @param usuariosNovedad The instance to add to the <code>UsuariosNovedad</code> role.
     */
    public void add2UsuariosNovedad(UsuarioNovedad usuariosNovedad) {
        this.usuariosNovedad.add(usuariosNovedad);
    }
    /**
     * Removes an instance of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     * @param usuariosNovedad The instance to be removed
     */
    public void removeFromUsuariosNovedad(UsuarioNovedad usuariosNovedad) {
    	this.usuariosNovedad.remove(usuariosNovedad);
    }
    /**
     * Sets instances of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     * @param usuariosNovedad The new value for the <code>UsuariosNovedad</code> role.
     */
    public void setUsuariosNovedad(Collection < UsuarioNovedad > usuariosNovedad) {
        this.usuariosNovedad = usuariosNovedad;
    }

   /**
    * This method gets the attribute value <code>modifiedUsuariosNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuariosNovedad</code> has been modified.
    */
    public boolean isModifiedUsuariosNovedad(){
        return modifiedUsuariosNovedad;
    }

    /**
     * Returns the instance of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     * Model Relationship:
     * <code>[UsuarioNovedad] UsuarioNovedad 0:M  ------ 0:1  TipoIdentificacionCD [TipoIdentificacion]</code>
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
     * Returns the instance of <code>NovedadCT</code> related through the <code>NovedadesCT</code> role.
     * Model Relationship:
     * <code>[NovedadCT] NovedadesCT 0:M  ------ 1:1  TipoIdentificacion [TipoIdentificacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>NovedadCT</code> related through the <code>NovedadesCT</code> role.
     */
    @JsonIgnore
    public Collection <NovedadCT> getNovedadesCT() {
        return novedadesCT;
    }

    /**
     * Adds an instance of <code>NovedadCT</code> related through the <code>NovedadesCT</code> role.
     * @param novedadesCT The instance to add to the <code>NovedadesCT</code> role.
     */
    public void add2NovedadesCT(NovedadCT novedadesCT) {
        this.novedadesCT.add(novedadesCT);
    }
    /**
     * Removes an instance of <code>NovedadCT</code> related through the <code>NovedadesCT</code> role.
     * @param novedadesCT The instance to be removed
     */
    public void removeFromNovedadesCT(NovedadCT novedadesCT) {
    	this.novedadesCT.remove(novedadesCT);
    }
    /**
     * Sets instances of <code>NovedadCT</code> related through the <code>NovedadesCT</code> role.
     * @param novedadesCT The new value for the <code>NovedadesCT</code> role.
     */
    public void setNovedadesCT(Collection < NovedadCT > novedadesCT) {
        this.novedadesCT = novedadesCT;
    }

   /**
    * This method gets the attribute value <code>modifiedNovedadesCT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedadesCT</code> has been modified.
    */
    public boolean isModifiedNovedadesCT(){
        return modifiedNovedadesCT;
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
        tipoIdentificacionDescripcion = "";
        tipoIdentificacionNombreCorto = "";
        tipoIdentificacionValidoContratante = false;
        tipoIdentificacionValidoTitular = false;
        tipoIdentificacionDiplomatico = false;
        tipoIdentificacionNIT = false;
        tipoIdentificacionHijoDe = false;
        tipoIdentificacionRequiereEPS = false;
        tipoIdentificacionMenorSinIdentificar = false;
        tipoIdentificacionEsPasaporte = false;
        tipoIdentificacionVisibleValidadorUsu = false;
        asesores = null;
        personas = null;
        personasC = null;
        usuarioS = null;
        contratantes = null;
        anexosC = null;
        titulares = null;
        institucionMatNeo = null;
        solicitudesNovedad = null;
        familiasNovedad = null;
        usuariosNovedad = null;
        usuarioNovedad = null;
        novedadesCT = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public AsesorJpaRepository getAsesorRepository() {
        return Arc.container().select(AsesorJpaRepository.class).get();
    }
    public PersonaJpaRepository getPersonaRepository() {
        return Arc.container().select(PersonaJpaRepository.class).get();
    }
    public UsuarioJpaRepository getUsuarioRepository() {
        return Arc.container().select(UsuarioJpaRepository.class).get();
    }
    public ContratanteJpaRepository getContratanteRepository() {
        return Arc.container().select(ContratanteJpaRepository.class).get();
    }
    public TitularJpaRepository getTitularRepository() {
        return Arc.container().select(TitularJpaRepository.class).get();
    }
    public InstitucionMatNeoJpaRepository getInstitucionMatNeoRepository() {
        return Arc.container().select(InstitucionMatNeoJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return TipoIdentificacion.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TipoIdentificacionConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedTipoIdentificacionDescripcion = false;
    	values.put("tipoIdentificacionDescripcion", getTipoIdentificacionDescripcion());
    	modifiedTipoIdentificacionNombreCorto = false;
    	values.put("tipoIdentificacionNombreCorto", getTipoIdentificacionNombreCorto());
    	modifiedTipoIdentificacionValidoContratante = false;
    	values.put("tipoIdentificacionValidoContratante", getTipoIdentificacionValidoContratante());
    	modifiedTipoIdentificacionValidoTitular = false;
    	values.put("tipoIdentificacionValidoTitular", getTipoIdentificacionValidoTitular());
    	modifiedTipoIdentificacionDiplomatico = false;
    	values.put("tipoIdentificacionDiplomatico", getTipoIdentificacionDiplomatico());
    	modifiedTipoIdentificacionNIT = false;
    	values.put("tipoIdentificacionNIT", getTipoIdentificacionNIT());
    	modifiedTipoIdentificacionHijoDe = false;
    	values.put("tipoIdentificacionHijoDe", getTipoIdentificacionHijoDe());
    	modifiedTipoIdentificacionRequiereEPS = false;
    	values.put("tipoIdentificacionRequiereEPS", getTipoIdentificacionRequiereEPS());
    	modifiedTipoIdentificacionMenorSinIdentificar = false;
    	values.put("tipoIdentificacionMenorSinIdentificar", getTipoIdentificacionMenorSinIdentificar());
    	modifiedTipoIdentificacionEsPasaporte = false;
    	values.put("tipoIdentificacionEsPasaporte", getTipoIdentificacionEsPasaporte());
    	modifiedTipoIdentificacionVisibleValidadorUsu = false;
    	values.put("tipoIdentificacionVisibleValidadorUsu", getTipoIdentificacionVisibleValidadorUsu());
    	modifiedAsesores = false;
    	modifiedPersonas = false;
    	modifiedPersonasC = false;
    	modifiedUsuarioS = false;
    	modifiedContratantes = false;
    	modifiedAnexosC = false;
    	modifiedTitulares = false;
    	modifiedInstitucionMatNeo = false;
    	modifiedSolicitudesNovedad = false;
    	modifiedFamiliasNovedad = false;
    	modifiedUsuariosNovedad = false;
    	modifiedUsuarioNovedad = false;
    	modifiedNovedadesCT = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>TipoIdentificacionOid</code> object that identifies this instance of <code>TipoIdentificacion</code>.
     * @return <code>TipoIdentificacionOid </code> object that identifies this instance of <code>TipoIdentificacion</code>
     */
	@Override
    public TipoIdentificacionOid getOid() {
        return new TipoIdentificacionOid(getTipoIdentificacionCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TipoIdentificacionConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TIPOIDENTIFICACION)) {
            // Add this class
            activeFacets.add(Constants.TIPOIDENTIFICACION);
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

    public String buildICTipoIdentificacion() {
        try {
            return getTipoIdentificacionNombreCorto() + " " + getTipoIdentificacionDescripcion();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSTipoIdentificacionNull() {
        try {
            return (getTipoIdentificacionCodigo() != null ? getTipoIdentificacionCodigo().toString() : "");
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
            relatedInstance = buildTipoIdentificacionRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_ASESORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_CONTRATANTES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_ANEXOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4AnexoC(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_TITULARES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_INSTITUCIONMATNEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_FAMILIASNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_USUARIOSNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || TipoIdentificacionConstants.ROLE_NAME_USUARIONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_NOVEDADESCT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4AnexoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoC(mapper.readValue(relatedInstanceJsonOid, AnexoCOid.class)): AnexoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
