package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionCOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.DirSucursalCOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.NovedadCTOid;
import com.keralty.aepersonas.persistence.oid.NovedadMDOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.repository.ContratanteJpaRepository;
import com.keralty.aepersonas.repository.DireccionJpaRepository;
import com.keralty.aepersonas.repository.MunicipioJpaRepository;
import com.keralty.aepersonas.repository.PersonaJpaRepository;
import com.keralty.aepersonas.repository.TitularJpaRepository;
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
 * Persistent representation of the <code>Departamento</code> model class.
 * <p>
 * Model Class: <code>Departamento</code><br>
 */
@Entity(name = DepartamentoConstants.CLASS_NAME)
@Table(name = DepartamentoConstants.TBL_NAME)
public class Departamento extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient PersonaJpaRepository personaRepository;

    @JsonIgnore
    private transient MunicipioJpaRepository municipioRepository;

    @JsonIgnore
    private transient DireccionJpaRepository direccionRepository;

    @JsonIgnore
    private transient ContratanteJpaRepository contratanteRepository;

    @JsonIgnore
    private transient TitularJpaRepository titularRepository;

    /** Class identification function. */
    @Id
    @Column(name = DepartamentoConstants.FLD_DEPARTAMENTOCODIGO )
    @JsonProperty(value="codigo")
    private Long departamentoCodigo;

    /** Class member attribute. */
    @Column(name = DepartamentoConstants.FLD_DEPARTAMENTODESCRIPCION )
    @JsonProperty(value="descripcion")
    private String departamentoDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoDescripcion;

    /** Class member attribute. */
    @Column(name = DepartamentoConstants.FLD_DEPARTAMENTOCODIGOLEGAL )
    @JsonProperty(value="codigolegal")
    private String departamentoCodigoLegal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoCodigoLegal;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_PERSONAS)
    @JsonIgnore
    private Collection <Persona> personas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonas;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_MUNICIPIOS)
    @JsonIgnore
    private Collection <Municipio> municipios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipios;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_PERSONASC)
    @JsonIgnore
    private Collection <PersonaC> personasC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonasC;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_DIRECCIONESC)
    @JsonIgnore
    private Collection <DireccionC> direccionesC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionesC;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_DIRECCIONES)
    @JsonIgnore
    private Collection <Direccion> direcciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirecciones;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_CONTRATANTES)
    @JsonIgnore
    private Collection <Contratante> contratantes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratantes;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_CONTRATANTESRES)
    @JsonIgnore
    private Collection <Contratante> contratantesRes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratantesRes;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_DIRSUCURSALC)
    @JsonIgnore
    private Collection <DirSucursalC> dirSucursalC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalC;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_TITULARES)
    @JsonIgnore
    private Collection <Titular> titulares;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTitulares;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_NOVEDADCTNAC)
    @JsonIgnore
    private Collection <NovedadCT> novedadCTNac;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTNac;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_NOVEDADCTRES)
    @JsonIgnore
    private Collection <NovedadCT> novedadCTRes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadCTRes;

    /** Related Class. */
    @OneToMany(mappedBy = DepartamentoConstants.ROLE_INVNAME_NOVEDADESMD)
    @JsonIgnore
    private Collection <NovedadMD> novedadesMD;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadesMD;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Departamento() {
        departamentoCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Departamento</code>.
     * @param oid Object Identifier of the instance of <code>Departamento</code> to be created.
     * @throws SystemException
     */
    public Departamento(DepartamentoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            departamentoCodigo = oid.getDepartamentoCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>departamentoCodigo</code> attribute<br>in class <code>Departamento</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Departamento</code>
     * @return The value of the <code>departamentoCodigo</code> attribute<br>in class <code>Departamento</code>.
     */
    public Long getDepartamentoCodigo() {
        return departamentoCodigo;
    }

    /**
     * Sets the value of the <code>departamentoCodigo</code> attribute<br>in class <code>Departamento</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Departamento</code>
     * @param departamentoCodigo The new value of the <code>departamentoCodigo</code> attribute<br>in class <code>Departamento</code>.
     */
    public void setDepartamentoCodigo(Long departamentoCodigo) {
        this.departamentoCodigo = departamentoCodigo;
    }

   /**
    * Returns the value of the <code>departamentoDescripcion</code> attribute.<br>
    * Model Attribute: <code>departamentoDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>departamentoDescripcion</code> attribute.
    */

    public String getDepartamentoDescripcion()  {
    	String value;
        value =  departamentoDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>departamentoDescripcion</code> attribute.<br>
    * Model Attribute: <code>departamentoDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param departamentoDescripcion The new value of the <code>departamentoDescripcion</code> attribute.
    */
    public void setDepartamentoDescripcion (String departamentoDescripcion) {
        modifiedDepartamentoDescripcion = true;
        this.departamentoDescripcion = departamentoDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedDepartamentoDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedDepartamentoDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDepartamentoDescripcion() {
        return modifiedDepartamentoDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedDepartamentoDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedDepartamentoDescripcion</code>.
    */
    public void setModifiedDepartamentoDescripcion(boolean modified) {
        this.modifiedDepartamentoDescripcion = modified;
    }

   /**
    * Returns the value of the <code>departamentoCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>departamentoCodigoLegal</code>. Constant String Size=5<br>
    * Comments: <br>
    * @return The value of the <code>departamentoCodigoLegal</code> attribute.
    */

    public String getDepartamentoCodigoLegal()  {
    	String value;
        value =  departamentoCodigoLegal;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>departamentoCodigoLegal</code> attribute.<br>
    * Model Attribute: <code>departamentoCodigoLegal</code>. Constant String Size=5<br>
    * Comments: <br>
    * @param departamentoCodigoLegal The new value of the <code>departamentoCodigoLegal</code> attribute.
    */
    public void setDepartamentoCodigoLegal (String departamentoCodigoLegal) {
        modifiedDepartamentoCodigoLegal = true;
        this.departamentoCodigoLegal = departamentoCodigoLegal;
    }

   /**
    * Returns the value of the <code>modifiedDepartamentoCodigoLegal</code> class property.<br>
    *
    * @return The value of the <code>modifiedDepartamentoCodigoLegal</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDepartamentoCodigoLegal() {
        return modifiedDepartamentoCodigoLegal;
    }

   /**
    * Sets the value of the <code>modifiedDepartamentoCodigoLegal</code> class property.<br>
    * @param modified The new value of the <code>modifiedDepartamentoCodigoLegal</code>.
    */
    public void setModifiedDepartamentoCodigoLegal(boolean modified) {
        this.modifiedDepartamentoCodigoLegal = modified;
    }

    /**
     * Returns the instance of <code>Persona</code> related through the <code>Personas</code> role.
     * Model Relationship:
     * <code>[Persona] Personas 0:M  ------ 0:1  DepartamentoNacimiento [Departamento]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Persona</code> related through the <code>Personas</code> role.
     */
    @JsonIgnore
    public Collection <Persona> getPersonas() {
        return getPersonaRepository().findByDepartamentoNacimiento(this);
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
     * Returns the instance of <code>Municipio</code> related through the <code>Municipios</code> role.
     * Model Relationship:
     * <code>[Municipio] Municipios 0:M  ------ 0:1  Departamento [Departamento]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>Municipios</code> role.
     */
    @JsonIgnore
    public Collection <Municipio> getMunicipios() {
        return getMunicipioRepository().findByDepartamento(this);
    }

    /**
     * Adds an instance of <code>Municipio</code> related through the <code>Municipios</code> role.
     * @param municipios The instance to add to the <code>Municipios</code> role.
     */
    public void add2Municipios(Municipio municipios) {
        this.municipios.add(municipios);
    }
    /**
     * Removes an instance of <code>Municipio</code> related through the <code>Municipios</code> role.
     * @param municipios The instance to be removed
     */
    public void removeFromMunicipios(Municipio municipios) {
    	this.municipios.remove(municipios);
    }
    /**
     * Sets instances of <code>Municipio</code> related through the <code>Municipios</code> role.
     * @param municipios The new value for the <code>Municipios</code> role.
     */
    public void setMunicipios(Collection < Municipio > municipios) {
        this.municipios = municipios;
    }

   /**
    * This method gets the attribute value <code>modifiedMunicipios</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMunicipios</code> has been modified.
    */
    public boolean isModifiedMunicipios(){
        return modifiedMunicipios;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonasC 0:M  ------ 0:1  DepartamentoCNac [Departamento]</code>
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
     * <code>[DireccionC] DireccionesC 0:M  ------ 0:1  DepartamentoC [Departamento]</code>
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
     * <code>[Direccion] Direcciones 0:M  ------ 0:1  Departamento [Departamento]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     */
    @JsonIgnore
    public Collection <Direccion> getDirecciones() {
        return getDireccionRepository().findByDepartamento(this);
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
     * <code>[Contratante] Contratantes 0:M  ------ 0:1  DepartamentoNac [Departamento]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Contratante</code> related through the <code>Contratantes</code> role.
     */
    @JsonIgnore
    public Collection <Contratante> getContratantes() {
        return getContratanteRepository().findByDepartamentoNac(this);
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
     * Returns the instance of <code>Contratante</code> related through the <code>ContratantesRes</code> role.
     * Model Relationship:
     * <code>[Contratante] ContratantesRes 0:M  ------ 0:1  DepartamentoRes [Departamento]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Contratante</code> related through the <code>ContratantesRes</code> role.
     */
    @JsonIgnore
    public Collection <Contratante> getContratantesRes() {
        return getContratanteRepository().findByDepartamentoRes(this);
    }

    /**
     * Adds an instance of <code>Contratante</code> related through the <code>ContratantesRes</code> role.
     * @param contratantesRes The instance to add to the <code>ContratantesRes</code> role.
     */
    public void add2ContratantesRes(Contratante contratantesRes) {
        this.contratantesRes.add(contratantesRes);
    }
    /**
     * Removes an instance of <code>Contratante</code> related through the <code>ContratantesRes</code> role.
     * @param contratantesRes The instance to be removed
     */
    public void removeFromContratantesRes(Contratante contratantesRes) {
    	this.contratantesRes.remove(contratantesRes);
    }
    /**
     * Sets instances of <code>Contratante</code> related through the <code>ContratantesRes</code> role.
     * @param contratantesRes The new value for the <code>ContratantesRes</code> role.
     */
    public void setContratantesRes(Collection < Contratante > contratantesRes) {
        this.contratantesRes = contratantesRes;
    }

   /**
    * This method gets the attribute value <code>modifiedContratantesRes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratantesRes</code> has been modified.
    */
    public boolean isModifiedContratantesRes(){
        return modifiedContratantesRes;
    }

    /**
     * Returns the instance of <code>DirSucursalC</code> related through the <code>DirSucursalC</code> role.
     * Model Relationship:
     * <code>[DirSucursalC] DirSucursalC 0:M  ------ 0:1  DepartamentoC [Departamento]</code>
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
     * Returns the instance of <code>Titular</code> related through the <code>Titulares</code> role.
     * Model Relationship:
     * <code>[Titular] Titulares 0:M  ------ 0:1  DepartamentoNac [Departamento]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Titular</code> related through the <code>Titulares</code> role.
     */
    @JsonIgnore
    public Collection <Titular> getTitulares() {
        return getTitularRepository().findByDepartamentoNac(this);
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
     * Returns the instance of <code>NovedadCT</code> related through the <code>NovedadCTNac</code> role.
     * Model Relationship:
     * <code>[NovedadCT] NovedadCTNac 0:M  ------ 0:1  DepartamentoNac [Departamento]</code>
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
     * <code>[NovedadCT] NovedadCTRes 0:M  ------ 0:1  DepartamentoRes [Departamento]</code>
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
     * <code>[NovedadMD] NovedadesMD 0:M  ------ 0:1  Departamento [Departamento]</code>
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
        departamentoDescripcion = "";
        departamentoCodigoLegal = "";
        personas = null;
        municipios = null;
        personasC = null;
        direccionesC = null;
        direcciones = null;
        contratantes = null;
        contratantesRes = null;
        dirSucursalC = null;
        titulares = null;
        novedadCTNac = null;
        novedadCTRes = null;
        novedadesMD = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public PersonaJpaRepository getPersonaRepository() {
        return Arc.container().select(PersonaJpaRepository.class).get();
    }
    public MunicipioJpaRepository getMunicipioRepository() {
        return Arc.container().select(MunicipioJpaRepository.class).get();
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

    @Override
    protected Method[] getMethods() {
    	return Departamento.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return DepartamentoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedDepartamentoDescripcion = false;
    	values.put("departamentoDescripcion", getDepartamentoDescripcion());
    	modifiedDepartamentoCodigoLegal = false;
    	values.put("departamentoCodigoLegal", getDepartamentoCodigoLegal());
    	modifiedPersonas = false;
    	modifiedMunicipios = false;
    	modifiedPersonasC = false;
    	modifiedDireccionesC = false;
    	modifiedDirecciones = false;
    	modifiedContratantes = false;
    	modifiedContratantesRes = false;
    	modifiedDirSucursalC = false;
    	modifiedTitulares = false;
    	modifiedNovedadCTNac = false;
    	modifiedNovedadCTRes = false;
    	modifiedNovedadesMD = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>DepartamentoOid</code> object that identifies this instance of <code>Departamento</code>.
     * @return <code>DepartamentoOid </code> object that identifies this instance of <code>Departamento</code>
     */
	@Override
    public DepartamentoOid getOid() {
        return new DepartamentoOid(getDepartamentoCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(DepartamentoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.DEPARTAMENTO)) {
            // Add this class
            activeFacets.add(Constants.DEPARTAMENTO);
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

    public String buildICDepartamento() {
        try {
            return getDepartamentoDescripcion();
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
            relatedInstance = buildDepartamentoRelatedInstance(relatedInstanceJsonOid);
        }
        if (DepartamentoConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_MUNICIPIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_CONTRATANTES.equalsIgnoreCase(relatedInstancePathFirstItem) || DepartamentoConstants.ROLE_NAME_CONTRATANTESRES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_DIRSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_TITULARES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_NOVEDADCTNAC.equalsIgnoreCase(relatedInstancePathFirstItem) || DepartamentoConstants.ROLE_NAME_NOVEDADCTRES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_NOVEDADESMD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4NovedadMD(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDepartamentoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4NovedadMD(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class)): NovedadMD.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }
}
