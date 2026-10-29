package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.global.DirSucursalCConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.PaisConstants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.RegionalConstants;
import com.keralty.aepersonas.global.TipoSucursalCConstants;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DirSucursalCOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.RegionalOid;
import com.keralty.aepersonas.persistence.oid.TelefonoCOid;
import com.keralty.aepersonas.persistence.oid.TipoSucursalCOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
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
 * Persistent representation of the <code>DirSucursalC</code> model class.
 * <p>
 * Model Class: <code>DirSucursalC</code><br>
 */
@Entity(name = DirSucursalCConstants.CLASS_NAME)
@Table(name = DirSucursalCConstants.TBL_NAME)
public class DirSucursalC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DirSucursalC_Sequence")
    @SequenceGenerator(name="DirSucursalC_Sequence", sequenceName="DirSucursalC_Sequence", allocationSize=1)
    @Column(name = DirSucursalCConstants.FLD_DIRSUCURSALCCODIGO )
    @JsonProperty(value="codigo")
    private Long dirSucursalCCodigo;

    /** Class member attribute. */
    @Column(name = DirSucursalCConstants.FLD_DIRSUCURSALCCODLEGALSUCURSAL )
    @JsonProperty(value="codlegalsucursal")
    private String dirSucursalCCodLegalSucursal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalCCodLegalSucursal;

    /** Class member attribute. */
    @Column(name = DirSucursalCConstants.FLD_DIRSUCURSALCNOMBRE )
    @JsonProperty(value="nombre")
    private String dirSucursalCNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalCNombre;

    /** Class member attribute. */
    @Column(name = DirSucursalCConstants.FLD_DIRSUCURSALCESPRINCIPAL )
    @JsonProperty(value="esprincipal")
    private Boolean dirSucursalCEsPrincipal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalCEsPrincipal;

    /** Class member attribute. */
    @Column(name = DirSucursalCConstants.FLD_DIRSUCURSALCACTIVA )
    @JsonProperty(value="activa")
    private Boolean dirSucursalCActiva;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalCActiva;

    /** Class member attribute. */
    @Column(name = DirSucursalCConstants.FLD_DIRSUCURSALCDIRECCION )
    @JsonProperty(value="direccion")
    private String dirSucursalCDireccion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalCDireccion;

    /** Class member attribute. */
    @Column(name = DirSucursalCConstants.FLD_DIRSUCURSALCMAIL )
    @JsonProperty(value="mail")
    private String dirSucursalCMail;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirSucursalCMail;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvciudad")
    protected String dirSucursalCdrvCiudad;

    /** Related Class. */
    @OneToMany(mappedBy = DirSucursalCConstants.ROLE_INVNAME_TELEFONOSC)
    @JsonIgnore
    private Collection <TelefonoC> telefonosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTelefonosC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DirSucursalCConstants.FLD_PERSONACID, referencedColumnName=PersonaCConstants.FLD_PERSONACID)
    })
    @JsonIgnore
    private PersonaC personaC;
    /** Related attribute. */
    @Column(name = DirSucursalCConstants.FLD_PERSONACID, insertable = false, updatable = false)
    private Long personaCID;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaC;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_DIRSUCURSALCTIPOSUCURSALC,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMDIRSUCURSALCTIPOSUCURSALC_DIRSUCURSALCCODIGO, referencedColumnName=DirSucursalCConstants.FLD_DIRSUCURSALCCODIGO)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMDIRSUCURSALCTIPOSUCURSALC_TIPOSUCURSALCTIPOSSUCURSALCCODIGO, referencedColumnName=TipoSucursalCConstants.FLD_TIPOSUCURSALCCODIGO)
    })
    @JsonIgnore
    private Collection <TipoSucursalC> tiposSucursalC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTiposSucursalC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DirSucursalCConstants.FLD_MUNICIPIOMUNICIPIOCCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipioC;
    /** Related attribute. */
    @Column(name = DirSucursalCConstants.FLD_MUNICIPIOMUNICIPIOCCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DirSucursalCConstants.FLD_DEPARTAMENTODEPARTAMENTOCCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamentoC;
    /** Related attribute. */
    @Column(name = DirSucursalCConstants.FLD_DEPARTAMENTODEPARTAMENTOCCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DirSucursalCConstants.FLD_PAISPAISCCODIGO, referencedColumnName=PaisConstants.FLD_PAISCODIGO)
    })
    @JsonIgnore
    private Pais paisC;
    /** Related attribute. */
    @Column(name = DirSucursalCConstants.FLD_PAISPAISCCODIGO, insertable = false, updatable = false)
    private String paisPaisCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPaisC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DirSucursalCConstants.FLD_REGIONALREGIONALCCODIGO, referencedColumnName=RegionalConstants.FLD_REGIONALCODIGO)
    })
    @JsonIgnore
    private Regional regionalC;
    /** Related attribute. */
    @Column(name = DirSucursalCConstants.FLD_REGIONALREGIONALCCODIGO, insertable = false, updatable = false)
    private Long regionalRegionalCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedRegionalC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public DirSucursalC() {
        dirSucursalCCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>DirSucursalC</code>.
     * @param oid Object Identifier of the instance of <code>DirSucursalC</code> to be created.
     * @throws SystemException
     */
    public DirSucursalC(DirSucursalCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            dirSucursalCCodigo = oid.getDirSucursalCCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>dirSucursalCCodigo</code> attribute<br>in class <code>DirSucursalC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DirSucursalC</code>
     * @return The value of the <code>dirSucursalCCodigo</code> attribute<br>in class <code>DirSucursalC</code>.
     */
    public Long getDirSucursalCCodigo() {
        return dirSucursalCCodigo;
    }

    /**
     * Sets the value of the <code>dirSucursalCCodigo</code> attribute<br>in class <code>DirSucursalC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DirSucursalC</code>
     * @param dirSucursalCCodigo The new value of the <code>dirSucursalCCodigo</code> attribute<br>in class <code>DirSucursalC</code>.
     */
    public void setDirSucursalCCodigo(Long dirSucursalCCodigo) {
        this.dirSucursalCCodigo = dirSucursalCCodigo;
    }

   /**
    * Returns the value of the <code>dirSucursalCCodLegalSucursal</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCCodLegalSucursal</code>. Variable String Size=9<br>
    * Comments: <br>
    * @return The value of the <code>dirSucursalCCodLegalSucursal</code> attribute.
    */

    public String getDirSucursalCCodLegalSucursal()  {
    	String value;
        value =  dirSucursalCCodLegalSucursal;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dirSucursalCCodLegalSucursal</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCCodLegalSucursal</code>. Variable String Size=9<br>
    * Comments: <br>
    * @param dirSucursalCCodLegalSucursal The new value of the <code>dirSucursalCCodLegalSucursal</code> attribute.
    */
    public void setDirSucursalCCodLegalSucursal (String dirSucursalCCodLegalSucursal) {
        modifiedDirSucursalCCodLegalSucursal = true;
        this.dirSucursalCCodLegalSucursal = dirSucursalCCodLegalSucursal;
    }

   /**
    * Returns the value of the <code>modifiedDirSucursalCCodLegalSucursal</code> class property.<br>
    *
    * @return The value of the <code>modifiedDirSucursalCCodLegalSucursal</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDirSucursalCCodLegalSucursal() {
        return modifiedDirSucursalCCodLegalSucursal;
    }

   /**
    * Sets the value of the <code>modifiedDirSucursalCCodLegalSucursal</code> class property.<br>
    * @param modified The new value of the <code>modifiedDirSucursalCCodLegalSucursal</code>.
    */
    public void setModifiedDirSucursalCCodLegalSucursal(boolean modified) {
        this.modifiedDirSucursalCCodLegalSucursal = modified;
    }

   /**
    * Returns the value of the <code>dirSucursalCNombre</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCNombre</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>dirSucursalCNombre</code> attribute.
    */

    public String getDirSucursalCNombre()  {
    	String value;
        value =  dirSucursalCNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dirSucursalCNombre</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCNombre</code>. Variable String Size=200<br>
    * Comments: <br>
    * @param dirSucursalCNombre The new value of the <code>dirSucursalCNombre</code> attribute.
    */
    public void setDirSucursalCNombre (String dirSucursalCNombre) {
        modifiedDirSucursalCNombre = true;
        this.dirSucursalCNombre = dirSucursalCNombre;
    }

   /**
    * Returns the value of the <code>modifiedDirSucursalCNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedDirSucursalCNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDirSucursalCNombre() {
        return modifiedDirSucursalCNombre;
    }

   /**
    * Sets the value of the <code>modifiedDirSucursalCNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedDirSucursalCNombre</code>.
    */
    public void setModifiedDirSucursalCNombre(boolean modified) {
        this.modifiedDirSucursalCNombre = modified;
    }

   /**
    * Returns the value of the <code>dirSucursalCEsPrincipal</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCEsPrincipal</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>dirSucursalCEsPrincipal</code> attribute.
    */

    public Boolean getDirSucursalCEsPrincipal()  {
    	Boolean value;
        value =  dirSucursalCEsPrincipal;
        return value;
    }

   /**
    * Sets the value of the <code>dirSucursalCEsPrincipal</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCEsPrincipal</code>. Variable Bool<br>
    * Comments: <br>
    * @param dirSucursalCEsPrincipal The new value of the <code>dirSucursalCEsPrincipal</code> attribute.
    */
    public void setDirSucursalCEsPrincipal (Boolean dirSucursalCEsPrincipal) {
        modifiedDirSucursalCEsPrincipal = true;
        this.dirSucursalCEsPrincipal = dirSucursalCEsPrincipal;
    }

   /**
    * Returns the value of the <code>modifiedDirSucursalCEsPrincipal</code> class property.<br>
    *
    * @return The value of the <code>modifiedDirSucursalCEsPrincipal</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDirSucursalCEsPrincipal() {
        return modifiedDirSucursalCEsPrincipal;
    }

   /**
    * Sets the value of the <code>modifiedDirSucursalCEsPrincipal</code> class property.<br>
    * @param modified The new value of the <code>modifiedDirSucursalCEsPrincipal</code>.
    */
    public void setModifiedDirSucursalCEsPrincipal(boolean modified) {
        this.modifiedDirSucursalCEsPrincipal = modified;
    }

   /**
    * Returns the value of the <code>dirSucursalCActiva</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCActiva</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>dirSucursalCActiva</code> attribute.
    */

    public Boolean getDirSucursalCActiva()  {
    	Boolean value;
        value =  dirSucursalCActiva;
        return value;
    }

   /**
    * Sets the value of the <code>dirSucursalCActiva</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCActiva</code>. Variable Bool<br>
    * Comments: <br>
    * @param dirSucursalCActiva The new value of the <code>dirSucursalCActiva</code> attribute.
    */
    public void setDirSucursalCActiva (Boolean dirSucursalCActiva) {
        modifiedDirSucursalCActiva = true;
        this.dirSucursalCActiva = dirSucursalCActiva;
    }

   /**
    * Returns the value of the <code>modifiedDirSucursalCActiva</code> class property.<br>
    *
    * @return The value of the <code>modifiedDirSucursalCActiva</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDirSucursalCActiva() {
        return modifiedDirSucursalCActiva;
    }

   /**
    * Sets the value of the <code>modifiedDirSucursalCActiva</code> class property.<br>
    * @param modified The new value of the <code>modifiedDirSucursalCActiva</code>.
    */
    public void setModifiedDirSucursalCActiva(boolean modified) {
        this.modifiedDirSucursalCActiva = modified;
    }

   /**
    * Returns the value of the <code>dirSucursalCDireccion</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCDireccion</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>dirSucursalCDireccion</code> attribute.
    */

    public String getDirSucursalCDireccion()  {
    	String value;
        value =  dirSucursalCDireccion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dirSucursalCDireccion</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCDireccion</code>. Variable String Size=255<br>
    * Comments: <br>
    * @param dirSucursalCDireccion The new value of the <code>dirSucursalCDireccion</code> attribute.
    */
    public void setDirSucursalCDireccion (String dirSucursalCDireccion) {
        modifiedDirSucursalCDireccion = true;
        this.dirSucursalCDireccion = dirSucursalCDireccion;
    }

   /**
    * Returns the value of the <code>modifiedDirSucursalCDireccion</code> class property.<br>
    *
    * @return The value of the <code>modifiedDirSucursalCDireccion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDirSucursalCDireccion() {
        return modifiedDirSucursalCDireccion;
    }

   /**
    * Sets the value of the <code>modifiedDirSucursalCDireccion</code> class property.<br>
    * @param modified The new value of the <code>modifiedDirSucursalCDireccion</code>.
    */
    public void setModifiedDirSucursalCDireccion(boolean modified) {
        this.modifiedDirSucursalCDireccion = modified;
    }

   /**
    * Returns the value of the <code>dirSucursalCMail</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCMail</code>. Variable String Size=500<br>
    * Comments: <br>
    * @return The value of the <code>dirSucursalCMail</code> attribute.
    */

    public String getDirSucursalCMail()  {
    	String value;
        value =  dirSucursalCMail;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dirSucursalCMail</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCMail</code>. Variable String Size=500<br>
    * Comments: <br>
    * @param dirSucursalCMail The new value of the <code>dirSucursalCMail</code> attribute.
    */
    public void setDirSucursalCMail (String dirSucursalCMail) {
        modifiedDirSucursalCMail = true;
        this.dirSucursalCMail = dirSucursalCMail;
    }

   /**
    * Returns the value of the <code>modifiedDirSucursalCMail</code> class property.<br>
    *
    * @return The value of the <code>modifiedDirSucursalCMail</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDirSucursalCMail() {
        return modifiedDirSucursalCMail;
    }

   /**
    * Sets the value of the <code>modifiedDirSucursalCMail</code> class property.<br>
    * @param modified The new value of the <code>modifiedDirSucursalCMail</code>.
    */
    public void setModifiedDirSucursalCMail(boolean modified) {
        this.modifiedDirSucursalCMail = modified;
    }

   /**
    * Returns the value of the <code>dirSucursalCdrvCiudad</code> attribute.<br>
    * Model Attribute: <code>dirSucursalCdrvCiudad</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>dirSucursalCdrvCiudad</code> attribute.
    */

    @JsonIgnore
    public String getDirSucursalCdrvCiudad()  {
    	String value;
        try {
            value = dirSucursalCdrvCiudadDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: DirSucursalC, Attribute: dirSucursalCdrvCiudad");
        }
        return (value == null ? null : value.trim());
    }

    /**
     * Returns the instance of <code>TelefonoC</code> related through the <code>TelefonosC</code> role.
     * Model Relationship:
     * <code>[TelefonoC] TelefonosC 0:M  ------ 0:1  DirSucursalC [DirSucursalC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TelefonoC</code> related through the <code>TelefonosC</code> role.
     */
    @JsonIgnore
    public Collection <TelefonoC> getTelefonosC() {
        return telefonosC;
    }

    /**
     * Adds an instance of <code>TelefonoC</code> related through the <code>TelefonosC</code> role.
     * @param telefonosC The instance to add to the <code>TelefonosC</code> role.
     */
    public void add2TelefonosC(TelefonoC telefonosC) {
        this.telefonosC.add(telefonosC);
    }
    /**
     * Removes an instance of <code>TelefonoC</code> related through the <code>TelefonosC</code> role.
     * @param telefonosC The instance to be removed
     */
    public void removeFromTelefonosC(TelefonoC telefonosC) {
    	this.telefonosC.remove(telefonosC);
    }
    /**
     * Sets instances of <code>TelefonoC</code> related through the <code>TelefonosC</code> role.
     * @param telefonosC The new value for the <code>TelefonosC</code> role.
     */
    public void setTelefonosC(Collection < TelefonoC > telefonosC) {
        this.telefonosC = telefonosC;
    }

   /**
    * This method gets the attribute value <code>modifiedTelefonosC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTelefonosC</code> has been modified.
    */
    public boolean isModifiedTelefonosC(){
        return modifiedTelefonosC;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonaC 1:1  ------ 0:M  DirSucursalesC [DirSucursalC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     */
    @JsonIgnore
    public PersonaC getPersonaC() {
        return personaC;
    }

    /**
     * Adds an instance of <code>PersonaC</code> related through the <code>PersonaC</code> role.
     * @param personaC The instance to add to the <code>PersonaC</code> role.
     */
    public void add2PersonaC(PersonaC personaC) {
        if (personaC == null || personaC.isNull()) {
            this.modifiedPersonaC = true;
            this.personaCID = null;
        } else {
            this.personaCID = personaC.getPersonaCID();
        }
        this.personaC = (personaC == null  || personaC.isNull() ? null : personaC);
    }

   /**
    * This method gets the attribute value <code>modifiedPersonaC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPersonaC</code> has been modified.
    */
    public boolean isModifiedPersonaC(){
        return modifiedPersonaC;
    }

    /**
     * Returns the instance of <code>TipoSucursalC</code> related through the <code>TiposSucursalC</code> role.
     * Model Relationship:
     * <code>[TipoSucursalC] TiposSucursalC 0:M  ------ 0:M  DirSucursalesC [DirSucursalC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoSucursalC</code> related through the <code>TiposSucursalC</code> role.
     */
    @JsonIgnore
    public Collection <TipoSucursalC> getTiposSucursalC() {
        return tiposSucursalC;
    }

    /**
     * Adds an instance of <code>TipoSucursalC</code> related through the <code>TiposSucursalC</code> role.
     * @param tiposSucursalC The instance to add to the <code>TiposSucursalC</code> role.
     */
    public void add2TiposSucursalC(TipoSucursalC tiposSucursalC) {
        this.tiposSucursalC.add(tiposSucursalC);
    }
    /**
     * Removes an instance of <code>TipoSucursalC</code> related through the <code>TiposSucursalC</code> role.
     * @param tiposSucursalC The instance to be removed
     */
    public void removeFromTiposSucursalC(TipoSucursalC tiposSucursalC) {
    	this.tiposSucursalC.remove(tiposSucursalC);
    }
    /**
     * Sets instances of <code>TipoSucursalC</code> related through the <code>TiposSucursalC</code> role.
     * @param tiposSucursalC The new value for the <code>TiposSucursalC</code> role.
     */
    public void setTiposSucursalC(Collection < TipoSucursalC > tiposSucursalC) {
        this.tiposSucursalC = tiposSucursalC;
    }

   /**
    * This method gets the attribute value <code>modifiedTiposSucursalC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTiposSucursalC</code> has been modified.
    */
    public boolean isModifiedTiposSucursalC(){
        return modifiedTiposSucursalC;
    }

    /**
     * Returns the instance of <code>Municipio</code> related through the <code>MunicipioC</code> role.
     * Model Relationship:
     * <code>[Municipio] MunicipioC 0:1  ------ 0:M  DirSucursalC [DirSucursalC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>MunicipioC</code> role.
     */
    @JsonIgnore
    public Municipio getMunicipioC() {
        return municipioC;
    }

    /**
     * Adds an instance of <code>Municipio</code> related through the <code>MunicipioC</code> role.
     * @param municipioC The instance to add to the <code>MunicipioC</code> role.
     */
    public void add2MunicipioC(Municipio municipioC) {
        if (municipioC == null || municipioC.isNull()) {
            this.modifiedMunicipioC = true;
            this.municipioMunicipioCCodigo = null;
        } else {
            this.municipioMunicipioCCodigo = municipioC.getMunicipioCodigo();
        }
        this.municipioC = (municipioC == null  || municipioC.isNull() ? null : municipioC);
    }

   /**
    * This method gets the attribute value <code>modifiedMunicipioC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMunicipioC</code> has been modified.
    */
    public boolean isModifiedMunicipioC(){
        return modifiedMunicipioC;
    }

    /**
     * Returns the instance of <code>Departamento</code> related through the <code>DepartamentoC</code> role.
     * Model Relationship:
     * <code>[Departamento] DepartamentoC 0:1  ------ 0:M  DirSucursalC [DirSucursalC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Departamento</code> related through the <code>DepartamentoC</code> role.
     */
    @JsonIgnore
    public Departamento getDepartamentoC() {
        return departamentoC;
    }

    /**
     * Adds an instance of <code>Departamento</code> related through the <code>DepartamentoC</code> role.
     * @param departamentoC The instance to add to the <code>DepartamentoC</code> role.
     */
    public void add2DepartamentoC(Departamento departamentoC) {
        if (departamentoC == null || departamentoC.isNull()) {
            this.modifiedDepartamentoC = true;
            this.departamentoDepartamentoCCodigo = null;
        } else {
            this.departamentoDepartamentoCCodigo = departamentoC.getDepartamentoCodigo();
        }
        this.departamentoC = (departamentoC == null  || departamentoC.isNull() ? null : departamentoC);
    }

   /**
    * This method gets the attribute value <code>modifiedDepartamentoC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDepartamentoC</code> has been modified.
    */
    public boolean isModifiedDepartamentoC(){
        return modifiedDepartamentoC;
    }

    /**
     * Returns the instance of <code>Pais</code> related through the <code>PaisC</code> role.
     * Model Relationship:
     * <code>[Pais] PaisC 0:1  ------ 0:M  DirSucursalC [DirSucursalC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Pais</code> related through the <code>PaisC</code> role.
     */
    @JsonIgnore
    public Pais getPaisC() {
        return paisC;
    }

    /**
     * Adds an instance of <code>Pais</code> related through the <code>PaisC</code> role.
     * @param paisC The instance to add to the <code>PaisC</code> role.
     */
    public void add2PaisC(Pais paisC) {
        if (paisC == null || paisC.isNull()) {
            this.modifiedPaisC = true;
            this.paisPaisCCodigo = null;
        } else {
            this.paisPaisCCodigo = paisC.getPaisCodigo();
        }
        this.paisC = (paisC == null  || paisC.isNull() ? null : paisC);
    }

   /**
    * This method gets the attribute value <code>modifiedPaisC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPaisC</code> has been modified.
    */
    public boolean isModifiedPaisC(){
        return modifiedPaisC;
    }

    /**
     * Returns the instance of <code>Regional</code> related through the <code>RegionalC</code> role.
     * Model Relationship:
     * <code>[Regional] RegionalC 0:1  ------ 0:M  DirSucursalC [DirSucursalC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Regional</code> related through the <code>RegionalC</code> role.
     */
    @JsonIgnore
    public Regional getRegionalC() {
        return regionalC;
    }

    /**
     * Adds an instance of <code>Regional</code> related through the <code>RegionalC</code> role.
     * @param regionalC The instance to add to the <code>RegionalC</code> role.
     */
    public void add2RegionalC(Regional regionalC) {
        if (regionalC == null || regionalC.isNull()) {
            this.modifiedRegionalC = true;
            this.regionalRegionalCCodigo = null;
        } else {
            this.regionalRegionalCCodigo = regionalC.getRegionalCodigo();
        }
        this.regionalC = (regionalC == null  || regionalC.isNull() ? null : regionalC);
    }

   /**
    * This method gets the attribute value <code>modifiedRegionalC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedRegionalC</code> has been modified.
    */
    public boolean isModifiedRegionalC(){
        return modifiedRegionalC;
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
     * Computes the value of the <code>dirSucursalCdrvCiudad</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>dirSucursalCdrvCiudad</code> derived attribute.
     */
    public String dirSucursalCdrvCiudadDerivations() {

        dirSucursalCdrvCiudad = null;

        dirSucursalCdrvCiudadDerivationsDefault();
        return dirSucursalCdrvCiudad;
    }

    private void dirSucursalCdrvCiudadDerivationsDefault() {
        if (dirSucursalCdrvCiudad != null) return;
        // Default derivation
        // EFFECT   : MunicipioC.Descripcion
        dirSucursalCdrvCiudad = this.getMunicipioC().getMunicipioDescripcion();
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        dirSucursalCCodLegalSucursal = null;
        dirSucursalCNombre = null;
        dirSucursalCEsPrincipal = false;
        dirSucursalCActiva = false;
        dirSucursalCDireccion = "";
        dirSucursalCMail = null;
        telefonosC = null;
        personaC = null;
        tiposSucursalC = null;
        municipioC = null;
        departamentoC = null;
        paisC = null;
        regionalC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return DirSucursalC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return DirSucursalCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedDirSucursalCCodLegalSucursal = false;
    	values.put("dirSucursalCCodLegalSucursal", getDirSucursalCCodLegalSucursal());
    	modifiedDirSucursalCNombre = false;
    	values.put("dirSucursalCNombre", getDirSucursalCNombre());
    	modifiedDirSucursalCEsPrincipal = false;
    	values.put("dirSucursalCEsPrincipal", getDirSucursalCEsPrincipal());
    	modifiedDirSucursalCActiva = false;
    	values.put("dirSucursalCActiva", getDirSucursalCActiva());
    	modifiedDirSucursalCDireccion = false;
    	values.put("dirSucursalCDireccion", getDirSucursalCDireccion());
    	modifiedDirSucursalCMail = false;
    	values.put("dirSucursalCMail", getDirSucursalCMail());
    	modifiedTelefonosC = false;
    	modifiedPersonaC = false;
    	modifiedTiposSucursalC = false;
    	modifiedMunicipioC = false;
    	modifiedDepartamentoC = false;
    	modifiedPaisC = false;
    	modifiedRegionalC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            dirSucursalCdrvCiudad = null;
    }

    /**
     * Returns the <code>DirSucursalCOid</code> object that identifies this instance of <code>DirSucursalC</code>.
     * @return <code>DirSucursalCOid </code> object that identifies this instance of <code>DirSucursalC</code>
     */
	@Override
    public DirSucursalCOid getOid() {
        return new DirSucursalCOid(getDirSucursalCCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(DirSucursalCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(DirSucursalCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.DIRSUCURSALC)) {
            // Add this class
            activeFacets.add(Constants.DIRSUCURSALC);
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
            relatedInstance = buildDirSucursalCRelatedInstance(relatedInstanceJsonOid);
        }
        if (DirSucursalCConstants.ROLE_NAME_TELEFONOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4TelefonoC(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_TIPOSSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4TipoSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_MUNICIPIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_DEPARTAMENTOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_PAISC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_REGIONALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4Regional(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDirSucursalCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4TelefonoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TelefonoC(mapper.readValue(relatedInstanceJsonOid, TelefonoCOid.class)): TelefonoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4TipoSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoSucursalC(mapper.readValue(relatedInstanceJsonOid, TipoSucursalCOid.class)): TipoSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4Regional(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Regional(mapper.readValue(relatedInstanceJsonOid, RegionalOid.class)): Regional.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
