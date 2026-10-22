package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionCOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.DirSucursalCOid;
import com.keralty.aepersonas.persistence.oid.FamiliaCOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.NovedadCTOid;
import com.keralty.aepersonas.persistence.oid.NovedadMDOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.repository.ContratanteJpaRepository;
import com.keralty.aepersonas.repository.DepartamentoJpaRepository;
import com.keralty.aepersonas.repository.DireccionJpaRepository;
import com.keralty.aepersonas.repository.InstitucionMatNeoJpaRepository;
import com.keralty.aepersonas.repository.PersonaJpaRepository;
import com.keralty.aepersonas.repository.TitularJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
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
 * Persistent representation of the <code>Municipio</code> model class.
 * <p>
 * Model Class: <code>Municipio</code><br>
 */
@Entity(name = MunicipioConstants.CLASS_NAME)
@Table(name = MunicipioConstants.TBL_NAME)
public class Municipio extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient PersonaJpaRepository personaRepository;

    @JsonIgnore
    private transient DireccionJpaRepository direccionRepository;

    @JsonIgnore
    private transient ContratanteJpaRepository contratanteRepository;

    @JsonIgnore
    private transient TitularJpaRepository titularRepository;

    @JsonIgnore
    private transient InstitucionMatNeoJpaRepository institucionMatNeoRepository;

    @JsonIgnore
    private transient DepartamentoJpaRepository departamentoRepository;

    /** Class identification function. */
    @Id
    @Column(name = MunicipioConstants.FLD_MUNICIPIOCODIGO )
    @JsonProperty(value="codigo")
    private Long municipioCodigo;

    /** Class member attribute. */
    @Column(name = MunicipioConstants.FLD_MUNICIPIODESCRIPCION )
    @JsonProperty(value="descripcion")
    private String municipioDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioDescripcion;

    /** Class member attribute. */
    @Column(name = MunicipioConstants.FLD_MUNICIPIOCODIGOLEGAL )
    @JsonProperty(value="codigolegal")
    private String municipioCodigoLegal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioCodigoLegal;

    /** Class member attribute. */
    @Column(name = MunicipioConstants.FLD_MUNICIPIOESVALIDOEPS )
    @JsonProperty(value="esvalidoeps")
    private Boolean municipioEsValidoEPS;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioEsValidoEPS;

    /** Class member attribute. */
    @Column(name = MunicipioConstants.FLD_MUNICIPIOAPLICAIVA )
    @JsonProperty(value="aplicaiva")
    private Boolean municipioAplicaIVA;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioAplicaIVA;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_PERSONAS)
    @JsonIgnore
    private Collection <Persona> personas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonas;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_PERSONASC)
    @JsonIgnore
    private Collection <PersonaC> personasC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonasC;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_DIRECCIONESC)
    @JsonIgnore
    private Collection <DireccionC> direccionesC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionesC;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_DIRECCIONES)
    @JsonIgnore
    private Collection <Direccion> direcciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirecciones;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_CONTRATANTES)
    @JsonIgnore
    private Collection <Contratante> contratantes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratantes;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_CONTRATANTERES)
    @JsonIgnore
    private Collection <Contratante> contratanteRes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteRes;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_CONTRATOSC)
    @JsonIgnore
    private Collection <ContratoC> contratosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratosC;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_DIRSUCURSALC)
    @JsonIgnore
    private Collection <DirSucursalC> dirSucursalC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalC;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_FAMILIAC)
    @JsonIgnore
    private Collection <FamiliaC> familiaC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaC;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_TITULARES)
    @JsonIgnore
    private Collection <Titular> titulares;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTitulares;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_INSTITUCIONMATNEO)
    @JsonIgnore
    private Collection <InstitucionMatNeo> institucionMatNeo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedInstitucionMatNeo;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_NOVEDADCTNAC)
    @JsonIgnore
    private Collection <NovedadCT> novedadCTNac;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTNac;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_NOVEDADCTRES)
    @JsonIgnore
    private Collection <NovedadCT> novedadCTRes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTRes;

    /** Related Class. */
    @OneToMany(mappedBy = MunicipioConstants.ROLE_INVNAME_NOVEDADESMD)
    @JsonIgnore
    private Collection <NovedadMD> novedadesMD;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadesMD;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=MunicipioConstants.FLD_DEPARTAMENTODEPARTAMENTOCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamento;
    /** Related attribute. */
    @Column(name = MunicipioConstants.FLD_DEPARTAMENTODEPARTAMENTOCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamento;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Municipio() {
        municipioCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Municipio</code>.
     * @param oid Object Identifier of the instance of <code>Municipio</code> to be created.
     * @throws SystemException
     */
    public Municipio(MunicipioOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            municipioCodigo = oid.getMunicipioCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>municipioCodigo</code> attribute<br>in class <code>Municipio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Municipio</code>
     * @return The value of the <code>municipioCodigo</code> attribute<br>in class <code>Municipio</code>.
     */
    public Long getMunicipioCodigo() {
        return municipioCodigo;
    }

    /**
     * Sets the value of the <code>municipioCodigo</code> attribute<br>in class <code>Municipio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Municipio</code>
     * @param municipioCodigo The new value of the <code>municipioCodigo</code> attribute<br>in class <code>Municipio</code>.
     */
    public void setMunicipioCodigo(Long municipioCodigo) {
        this.municipioCodigo = municipioCodigo;
    }

   /**
    * Returns the value of the <code>municipioDescripcion</code> attribute.<br>
    * Model Attribute: <code>municipioDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>municipioDescripcion</code> attribute.
    */

    public String getMunicipioDescripcion()  {
    	String value;
        value =  municipioDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>municipioDescripcion</code> attribute.<br>
    * Model Attribute: <code>municipioDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param municipioDescripcion The new value of the <code>municipioDescripcion</code> attribute.
    */
    public void setMunicipioDescripcion (String municipioDescripcion) {
        modifiedMunicipioDescripcion = true;
        this.municipioDescripcion = municipioDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedMunicipioDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedMunicipioDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMunicipioDescripcion() {
        return modifiedMunicipioDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedMunicipioDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedMunicipioDescripcion</code>.
    */
    public void setModifiedMunicipioDescripcion(boolean modified) {
        this.modifiedMunicipioDescripcion = modified;
    }

   /**
    * Returns the value of the <code>municipioCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>municipioCodigoLegal</code>. Variable String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>municipioCodigoLegal</code> attribute.
    */

    public String getMunicipioCodigoLegal()  {
    	String value;
        value =  municipioCodigoLegal;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>municipioCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>municipioCodigoLegal</code>. Variable String Size=10<br>
    * Comments: <br>
    * @param municipioCodigoLegal The new value of the <code>municipioCodigoLegal</code> attribute.
    */
    public void setMunicipioCodigoLegal (String municipioCodigoLegal) {
        modifiedMunicipioCodigoLegal = true;
        this.municipioCodigoLegal = municipioCodigoLegal;
    }

   /**
    * Returns the value of the <code>modifiedMunicipioCodigoLegal</code> class property.<br>
    *
    * @return The value of the <code>modifiedMunicipioCodigoLegal</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMunicipioCodigoLegal() {
        return modifiedMunicipioCodigoLegal;
    }

   /**
    * Sets the value of the <code>modifiedMunicipioCodigoLegal</code> class property.<br>
    * @param modified The new value of the <code>modifiedMunicipioCodigoLegal</code>.
    */
    public void setModifiedMunicipioCodigoLegal(boolean modified) {
        this.modifiedMunicipioCodigoLegal = modified;
    }

   /**
    * Returns the value of the <code>municipioEsValidoEPS</code> attribute.<br>
    * Model Attribute: <code>municipioEsValidoEPS</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>municipioEsValidoEPS</code> attribute.
    */

    public Boolean getMunicipioEsValidoEPS()  {
    	Boolean value;
        value =  municipioEsValidoEPS;
        return value;
    }

   /**
    * Sets the value of the <code>municipioEsValidoEPS</code> attribute.<br>
    * Model Attribute: <code>municipioEsValidoEPS</code>. Variable Bool<br>
    * Comments: <br>
    * @param municipioEsValidoEPS The new value of the <code>municipioEsValidoEPS</code> attribute.
    */
    public void setMunicipioEsValidoEPS (Boolean municipioEsValidoEPS) {
        modifiedMunicipioEsValidoEPS = true;
        this.municipioEsValidoEPS = municipioEsValidoEPS;
    }

   /**
    * Returns the value of the <code>modifiedMunicipioEsValidoEPS</code> class property.<br>
    *
    * @return The value of the <code>modifiedMunicipioEsValidoEPS</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMunicipioEsValidoEPS() {
        return modifiedMunicipioEsValidoEPS;
    }

   /**
    * Sets the value of the <code>modifiedMunicipioEsValidoEPS</code> class property.<br>
    * @param modified The new value of the <code>modifiedMunicipioEsValidoEPS</code>.
    */
    public void setModifiedMunicipioEsValidoEPS(boolean modified) {
        this.modifiedMunicipioEsValidoEPS = modified;
    }

   /**
    * Returns the value of the <code>municipioAplicaIVA</code> attribute.<br>
    * Model Attribute: <code>municipioAplicaIVA</code>. Variable Bool<br>
    * Comments: Hay algunos municipios para los que no aplica IVA. Este dato no nos lo proporciona el CORE, por eso lo gestionaremos en Afiliación Electrónica<br>
    * @return The value of the <code>municipioAplicaIVA</code> attribute.
    */

    public Boolean getMunicipioAplicaIVA()  {
    	Boolean value;
        value =  municipioAplicaIVA;
        return value;
    }

   /**
    * Sets the value of the <code>municipioAplicaIVA</code> attribute.<br>
    * Model Attribute: <code>municipioAplicaIVA</code>. Variable Bool<br>
    * Comments: Hay algunos municipios para los que no aplica IVA. Este dato no nos lo proporciona el CORE, por eso lo gestionaremos en Afiliación Electrónica<br>
    * @param municipioAplicaIVA The new value of the <code>municipioAplicaIVA</code> attribute.
    */
    public void setMunicipioAplicaIVA (Boolean municipioAplicaIVA) {
        modifiedMunicipioAplicaIVA = true;
        this.municipioAplicaIVA = municipioAplicaIVA;
    }

   /**
    * Returns the value of the <code>modifiedMunicipioAplicaIVA</code> class property.<br>
    *
    * @return The value of the <code>modifiedMunicipioAplicaIVA</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMunicipioAplicaIVA() {
        return modifiedMunicipioAplicaIVA;
    }

   /**
    * Sets the value of the <code>modifiedMunicipioAplicaIVA</code> class property.<br>
    * @param modified The new value of the <code>modifiedMunicipioAplicaIVA</code>.
    */
    public void setModifiedMunicipioAplicaIVA(boolean modified) {
        this.modifiedMunicipioAplicaIVA = modified;
    }

    /**
     * Returns the instance of <code>Persona</code> related through the <code>Personas</code> role.
     * Model Relationship:
     * <code>[Persona] Personas 0:M  ------ 0:1  MunicipioNacimiento [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Persona</code> related through the <code>Personas</code> role.
     */
    @JsonIgnore
    public Collection <Persona> getPersonas() {
        return getPersonaRepository().findByMunicipioNacimiento(this);
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
     * <code>[PersonaC] PersonasC 0:M  ------ 0:1  MunicipioCNac [Municipio]</code>
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
     * Returns the instance of <code>DireccionC</code> related through the <code>DireccionesC</code> role.
     * Model Relationship:
     * <code>[DireccionC] DireccionesC 0:M  ------ 0:1  MunicipioC [Municipio]</code>
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
     * Returns the instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * Model Relationship:
     * <code>[Direccion] Direcciones 0:M  ------ 0:1  Municipio [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     */
    @JsonIgnore
    public Collection <Direccion> getDirecciones() {
        return getDireccionRepository().findByMunicipio(this);
    }

    /**
     * Adds an instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * @param direcciones The instance to add to the <code>Direcciones</code> role.
     */
    public void add2Direcciones(Direccion direcciones) {
        this.direcciones.add(direcciones);
    }
    /**
     * Removes an instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * @param direcciones The instance to be removed
     */
    public void removeFromDirecciones(Direccion direcciones) {
    	this.direcciones.remove(direcciones);
    }
    /**
     * Sets instances of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * @param direcciones The new value for the <code>Direcciones</code> role.
     */
    public void setDirecciones(Collection < Direccion > direcciones) {
        this.direcciones = direcciones;
    }

   /**
    * This method gets the attribute value <code>modifiedDirecciones</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDirecciones</code> has been modified.
    */
    public boolean isModifiedDirecciones(){
        return modifiedDirecciones;
    }

    /**
     * Returns the instance of <code>Contratante</code> related through the <code>Contratantes</code> role.
     * Model Relationship:
     * <code>[Contratante] Contratantes 0:M  ------ 0:1  MunicipioNac [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Contratante</code> related through the <code>Contratantes</code> role.
     */
    @JsonIgnore
    public Collection <Contratante> getContratantes() {
        return getContratanteRepository().findByMunicipioNac(this);
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
     * Returns the instance of <code>Contratante</code> related through the <code>ContratanteRes</code> role.
     * Model Relationship:
     * <code>[Contratante] ContratanteRes 0:M  ------ 0:1  MunicipioRes [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Contratante</code> related through the <code>ContratanteRes</code> role.
     */
    @JsonIgnore
    public Collection <Contratante> getContratanteRes() {
        return getContratanteRepository().findByMunicipioRes(this);
    }

    /**
     * Adds an instance of <code>Contratante</code> related through the <code>ContratanteRes</code> role.
     * @param contratanteRes The instance to add to the <code>ContratanteRes</code> role.
     */
    public void add2ContratanteRes(Contratante contratanteRes) {
        this.contratanteRes.add(contratanteRes);
    }
    /**
     * Removes an instance of <code>Contratante</code> related through the <code>ContratanteRes</code> role.
     * @param contratanteRes The instance to be removed
     */
    public void removeFromContratanteRes(Contratante contratanteRes) {
    	this.contratanteRes.remove(contratanteRes);
    }
    /**
     * Sets instances of <code>Contratante</code> related through the <code>ContratanteRes</code> role.
     * @param contratanteRes The new value for the <code>ContratanteRes</code> role.
     */
    public void setContratanteRes(Collection < Contratante > contratanteRes) {
        this.contratanteRes = contratanteRes;
    }

   /**
    * This method gets the attribute value <code>modifiedContratanteRes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratanteRes</code> has been modified.
    */
    public boolean isModifiedContratanteRes(){
        return modifiedContratanteRes;
    }

    /**
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratosC 0:M  ------ 0:1  MunicipioC [Municipio]</code>
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
     * Returns the instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * Model Relationship:
     * <code>[DirSucursalC] DirSucursalC 0:M  ------ 0:1  MunicipioC [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalC() {
        return dirSucursalC;
    }

    /**
     * Adds an instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * @param dirSucursalC The instance to add to the <code>DirSucursalC</code> role.
     */
    public void add2DirSucursalC(DirSucursalC dirSucursalC) {
        this.dirSucursalC.add(dirSucursalC);
    }
    /**
     * Removes an instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * @param dirSucursalC The instance to be removed
     */
    public void removeFromDirSucursalC(DirSucursalC dirSucursalC) {
    	this.dirSucursalC.remove(dirSucursalC);
    }
    /**
     * Sets instances of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * @param dirSucursalC The new value for the <code>DirSucursalC</code> role.
     */
    public void setDirSucursalC(Collection < DirSucursalC > dirSucursalC) {
        this.dirSucursalC = dirSucursalC;
    }

   /**
    * This method gets the attribute value <code>modifiedDirSucursalC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDirSucursalC</code> has been modified.
    */
    public boolean isModifiedDirSucursalC(){
        return modifiedDirSucursalC;
    }

    /**
     * Returns the instance of <code>FamiliaC</code> related through the <code>FamiliaC</code> role.
     * Model Relationship:
     * <code>[FamiliaC] FamiliaC 0:M  ------ 0:1  MunicipioC [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>FamiliaC</code> related through the <code>FamiliaC</code> role.
     */
    @JsonIgnore
    public Collection <FamiliaC> getFamiliaC() {
        return familiaC;
    }

    /**
     * Adds an instance of <code>FamiliaC</code> related through the <code>FamiliaC</code> role.
     * @param familiaC The instance to add to the <code>FamiliaC</code> role.
     */
    public void add2FamiliaC(FamiliaC familiaC) {
        this.familiaC.add(familiaC);
    }
    /**
     * Removes an instance of <code>FamiliaC</code> related through the <code>FamiliaC</code> role.
     * @param familiaC The instance to be removed
     */
    public void removeFromFamiliaC(FamiliaC familiaC) {
    	this.familiaC.remove(familiaC);
    }
    /**
     * Sets instances of <code>FamiliaC</code> related through the <code>FamiliaC</code> role.
     * @param familiaC The new value for the <code>FamiliaC</code> role.
     */
    public void setFamiliaC(Collection < FamiliaC > familiaC) {
        this.familiaC = familiaC;
    }

   /**
    * This method gets the attribute value <code>modifiedFamiliaC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFamiliaC</code> has been modified.
    */
    public boolean isModifiedFamiliaC(){
        return modifiedFamiliaC;
    }

    /**
     * Returns the instance of <code>Titular</code> related through the <code>Titulares</code> role.
     * Model Relationship:
     * <code>[Titular] Titulares 0:M  ------ 0:1  MunicipioNac [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Titular</code> related through the <code>Titulares</code> role.
     */
    @JsonIgnore
    public Collection <Titular> getTitulares() {
        return getTitularRepository().findByMunicipioNac(this);
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
     * <code>[InstitucionMatNeo] InstitucionMatNeo 0:M  ------ 1:1  Municipio [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>InstitucionMatNeo</code> related through the <code>InstitucionMatNeo</code> role.
     */
    @JsonIgnore
    public Collection <InstitucionMatNeo> getInstitucionMatNeo() {
        return getInstitucionMatNeoRepository().findByMunicipio(this);
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
     * Returns the instance of <code>NovedadCT</code> related through the <code>NovedadCTNac</code> role.
     * Model Relationship:
     * <code>[NovedadCT] NovedadCTNac 0:M  ------ 0:1  MunicipioNac [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>NovedadCT</code> related through the <code>NovedadCTNac</code> role.
     */
    @JsonIgnore
    public Collection <NovedadCT> getNovedadCTNac() {
        return novedadCTNac;
    }

    /**
     * Adds an instance of <code>NovedadCT</code> related through the <code>NovedadCTNac</code> role.
     * @param novedadCTNac The instance to add to the <code>NovedadCTNac</code> role.
     */
    public void add2NovedadCTNac(NovedadCT novedadCTNac) {
        this.novedadCTNac.add(novedadCTNac);
    }
    /**
     * Removes an instance of <code>NovedadCT</code> related through the <code>NovedadCTNac</code> role.
     * @param novedadCTNac The instance to be removed
     */
    public void removeFromNovedadCTNac(NovedadCT novedadCTNac) {
    	this.novedadCTNac.remove(novedadCTNac);
    }
    /**
     * Sets instances of <code>NovedadCT</code> related through the <code>NovedadCTNac</code> role.
     * @param novedadCTNac The new value for the <code>NovedadCTNac</code> role.
     */
    public void setNovedadCTNac(Collection < NovedadCT > novedadCTNac) {
        this.novedadCTNac = novedadCTNac;
    }

   /**
    * This method gets the attribute value <code>modifiedNovedadCTNac</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedadCTNac</code> has been modified.
    */
    public boolean isModifiedNovedadCTNac(){
        return modifiedNovedadCTNac;
    }

    /**
     * Returns the instance of <code>NovedadCT</code> related through the <code>NovedadCTRes</code> role.
     * Model Relationship:
     * <code>[NovedadCT] NovedadCTRes 0:M  ------ 0:1  MunicipioRes [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>NovedadCT</code> related through the <code>NovedadCTRes</code> role.
     */
    @JsonIgnore
    public Collection <NovedadCT> getNovedadCTRes() {
        return novedadCTRes;
    }

    /**
     * Adds an instance of <code>NovedadCT</code> related through the <code>NovedadCTRes</code> role.
     * @param novedadCTRes The instance to add to the <code>NovedadCTRes</code> role.
     */
    public void add2NovedadCTRes(NovedadCT novedadCTRes) {
        this.novedadCTRes.add(novedadCTRes);
    }
    /**
     * Removes an instance of <code>NovedadCT</code> related through the <code>NovedadCTRes</code> role.
     * @param novedadCTRes The instance to be removed
     */
    public void removeFromNovedadCTRes(NovedadCT novedadCTRes) {
    	this.novedadCTRes.remove(novedadCTRes);
    }
    /**
     * Sets instances of <code>NovedadCT</code> related through the <code>NovedadCTRes</code> role.
     * @param novedadCTRes The new value for the <code>NovedadCTRes</code> role.
     */
    public void setNovedadCTRes(Collection < NovedadCT > novedadCTRes) {
        this.novedadCTRes = novedadCTRes;
    }

   /**
    * This method gets the attribute value <code>modifiedNovedadCTRes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedadCTRes</code> has been modified.
    */
    public boolean isModifiedNovedadCTRes(){
        return modifiedNovedadCTRes;
    }

    /**
     * Returns the instance of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     * Model Relationship:
     * <code>[NovedadMD] NovedadesMD 0:M  ------ 0:1  Municipio [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     */
    @JsonIgnore
    public Collection <NovedadMD> getNovedadesMD() {
        return novedadesMD;
    }

    /**
     * Adds an instance of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     * @param novedadesMD The instance to add to the <code>NovedadesMD</code> role.
     */
    public void add2NovedadesMD(NovedadMD novedadesMD) {
        this.novedadesMD.add(novedadesMD);
    }
    /**
     * Removes an instance of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     * @param novedadesMD The instance to be removed
     */
    public void removeFromNovedadesMD(NovedadMD novedadesMD) {
    	this.novedadesMD.remove(novedadesMD);
    }
    /**
     * Sets instances of <code>NovedadMD</code> related through the <code>NovedadesMD</code> role.
     * @param novedadesMD The new value for the <code>NovedadesMD</code> role.
     */
    public void setNovedadesMD(Collection < NovedadMD > novedadesMD) {
        this.novedadesMD = novedadesMD;
    }

   /**
    * This method gets the attribute value <code>modifiedNovedadesMD</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedadesMD</code> has been modified.
    */
    public boolean isModifiedNovedadesMD(){
        return modifiedNovedadesMD;
    }

    /**
     * Returns the instance of <code>Departamento</code> related through the <code>Departamento</code> role.
     * Model Relationship:
     * <code>[Departamento] Departamento 0:1  ------ 0:M  Municipios [Municipio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Departamento</code> related through the <code>Departamento</code> role.
     */
    @JsonIgnore
    public Departamento getDepartamento() {
        try {
            if (departamento != null && departamento.isNull()) {
                departamento = null;
            }
        } catch (Exception ex) {
            departamento = null;
        }
        if (departamento == null) {
            if (departamentoDepartamentoCodigo != null) {
                departamento = getDepartamentoRepository().findById(departamentoDepartamentoCodigo).orElse(null);
            } else {
                departamento = null;
            }
        }
        return (departamento == null ? new Departamento(null) : departamento);
    }

    /**
     * Adds an instance of <code>Departamento</code> related through the <code>Departamento</code> role.
     * @param departamento The instance to add to the <code>Departamento</code> role.
     */
    public void add2Departamento(Departamento departamento) {
        if (departamento == null || departamento.isNull()) {
            this.modifiedDepartamento = true;
            this.departamentoDepartamentoCodigo = null;
        } else {
            this.departamentoDepartamentoCodigo = departamento.getDepartamentoCodigo();
        }
        this.departamento = (departamento == null  || departamento.isNull() ? null : departamento);
    }

   /**
    * This method gets the attribute value <code>modifiedDepartamento</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDepartamento</code> has been modified.
    */
    public boolean isModifiedDepartamento(){
        return modifiedDepartamento;
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
        municipioDescripcion = "";
        municipioCodigoLegal = "";
        municipioEsValidoEPS = false;
        municipioAplicaIVA = false;
        personas = null;
        personasC = null;
        direccionesC = null;
        direcciones = null;
        contratantes = null;
        contratanteRes = null;
        contratosC = null;
        dirSucursalC = null;
        familiaC = null;
        titulares = null;
        institucionMatNeo = null;
        novedadCTNac = null;
        novedadCTRes = null;
        novedadesMD = null;
        departamento = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public PersonaJpaRepository getPersonaRepository() {
        return Arc.container().select(PersonaJpaRepository.class).get();
    }
    public DireccionJpaRepository getDireccionRepository() {
        return Arc.container().select(DireccionJpaRepository.class).get();
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
    public DepartamentoJpaRepository getDepartamentoRepository() {
        return Arc.container().select(DepartamentoJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Municipio.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return MunicipioConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedMunicipioDescripcion = false;
    	values.put("municipioDescripcion", getMunicipioDescripcion());
    	modifiedMunicipioCodigoLegal = false;
    	values.put("municipioCodigoLegal", getMunicipioCodigoLegal());
    	modifiedMunicipioEsValidoEPS = false;
    	values.put("municipioEsValidoEPS", getMunicipioEsValidoEPS());
    	modifiedMunicipioAplicaIVA = false;
    	values.put("municipioAplicaIVA", getMunicipioAplicaIVA());
    	modifiedPersonas = false;
    	modifiedPersonasC = false;
    	modifiedDireccionesC = false;
    	modifiedDirecciones = false;
    	modifiedContratantes = false;
    	modifiedContratanteRes = false;
    	modifiedContratosC = false;
    	modifiedDirSucursalC = false;
    	modifiedFamiliaC = false;
    	modifiedTitulares = false;
    	modifiedInstitucionMatNeo = false;
    	modifiedNovedadCTNac = false;
    	modifiedNovedadCTRes = false;
    	modifiedNovedadesMD = false;
    	modifiedDepartamento = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>MunicipioOid</code> object that identifies this instance of <code>Municipio</code>.
     * @return <code>MunicipioOid </code> object that identifies this instance of <code>Municipio</code>
     */
	@Override
    public MunicipioOid getOid() {
        return new MunicipioOid(getMunicipioCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(MunicipioConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(MunicipioConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.MUNICIPIO)) {
            // Add this class
            activeFacets.add(Constants.MUNICIPIO);
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

    public String buildICMunicipio() {
        try {
            return getMunicipioDescripcion();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSMunicipioPIU() {
        try {
            return getDepartamento().getDepartamentoDescripcion() + " " + (getMunicipioCodigo() != null ? getMunicipioCodigo().toString() : "") + " " + getMunicipioCodigoLegal() + " " + getMunicipioDescripcion() + " " + (getMunicipioAplicaIVA() != null ? getMunicipioAplicaIVA().toString() : "") + " " + (getMunicipioEsValidoEPS() != null ? getMunicipioEsValidoEPS().toString() : "");
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
            relatedInstance = buildMunicipioRelatedInstance(relatedInstanceJsonOid);
        }
        if (MunicipioConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_CONTRATANTES.equalsIgnoreCase(relatedInstancePathFirstItem) || MunicipioConstants.ROLE_NAME_CONTRATANTERES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_DIRSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_FAMILIAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4FamiliaC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_TITULARES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_INSTITUCIONMATNEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_NOVEDADCTNAC.equalsIgnoreCase(relatedInstancePathFirstItem) || MunicipioConstants.ROLE_NAME_NOVEDADCTRES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_NOVEDADESMD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4NovedadMD(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_DEPARTAMENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildMunicipioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4FamiliaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaC(mapper.readValue(relatedInstanceJsonOid, FamiliaCOid.class)): FamiliaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4NovedadMD(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class)): NovedadMD.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }
}
