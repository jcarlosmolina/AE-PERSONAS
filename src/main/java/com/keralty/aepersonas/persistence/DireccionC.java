package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratoCConstants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.global.DireccionCConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.PaisConstants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionCOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.TelefonoCOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.repository.DireccionCJpaRepository;
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
 * Persistent representation of the <code>DireccionC</code> model class.
 * <p>
 * Model Class: <code>DireccionC</code><br>
 */
@Entity(name = DireccionCConstants.CLASS_NAME)
@Table(name = DireccionCConstants.TBL_NAME)
public class DireccionC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient DireccionCJpaRepository direccionCRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DireccionC_Sequence")
    @SequenceGenerator(name="DireccionC_Sequence", sequenceName="DireccionC_Sequence", allocationSize=1)
    @Column(name = DireccionCConstants.FLD_DIRECCIONCCODIGO )
    @JsonProperty(value="codigo")
    private Long direccionCCodigo;

    /** Class member attribute. */
    @Column(name = DireccionCConstants.FLD_DIRECCIONCDIRECCIONCOMPLETA )
    @JsonProperty(value="direccioncompleta")
    private String direccionCDireccionCompleta;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionCDireccionCompleta;

    /** Class member attribute. */
    @Column(name = DireccionCConstants.FLD_DIRECCIONCLOCALIDAD )
    @JsonProperty(value="localidad")
    private String direccionCLocalidad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionCLocalidad;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvciudad")
    protected String direccionCdrvCiudad;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienedepartamento")
    protected Boolean direccionCdrvTieneDepartamento;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienemunicipio")
    protected Boolean direccionCdrvTieneMunicipio;

    /** Related Class. */
    @OneToMany(mappedBy = DireccionCConstants.ROLE_INVNAME_TELEFONOSC)
    @JsonIgnore
    private Collection <TelefonoC> telefonosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTelefonosC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionCConstants.FLD_PERSONACID, referencedColumnName=PersonaCConstants.FLD_PERSONACID)
    })
    @JsonIgnore
    private PersonaC personaC;
    /** Related attribute. */
    @Column(name = DireccionCConstants.FLD_PERSONACID, insertable = false, updatable = false)
    private Long personaCID;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionCConstants.FLD_CONTRATOCCONTRATOCID, referencedColumnName=ContratoCConstants.FLD_CONTRATOCID)
    })
    @JsonIgnore
    private ContratoC contratoC;
    /** Related attribute. */
    @Column(name = DireccionCConstants.FLD_CONTRATOCCONTRATOCID, insertable = false, updatable = false)
    private Long contratoCContratoCID;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratoC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionCConstants.FLD_TIPODIRECCIONTIPODIRECCIONCCODIGO, referencedColumnName=TipoDireccionConstants.FLD_TIPODIRECCIONCODIGO)
    })
    @JsonIgnore
    private TipoDireccion tipoDireccionC;
    /** Related attribute. */
    @Column(name = DireccionCConstants.FLD_TIPODIRECCIONTIPODIRECCIONCCODIGO, insertable = false, updatable = false)
    private Long tipoDireccionTipoDireccionCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoDireccionC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionCConstants.FLD_DEPARTAMENTODEPARTAMENTOCCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamentoC;
    /** Related attribute. */
    @Column(name = DireccionCConstants.FLD_DEPARTAMENTODEPARTAMENTOCCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionCConstants.FLD_MUNICIPIOMUNICIPIOCCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipioC;
    /** Related attribute. */
    @Column(name = DireccionCConstants.FLD_MUNICIPIOMUNICIPIOCCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionCConstants.FLD_PAISPAISCCODIGO, referencedColumnName=PaisConstants.FLD_PAISCODIGO)
    })
    @JsonIgnore
    private Pais paisC;
    /** Related attribute. */
    @Column(name = DireccionCConstants.FLD_PAISPAISCCODIGO, insertable = false, updatable = false)
    private String paisPaisCCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPaisC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public DireccionC() {
        direccionCCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>DireccionC</code>.
     * @param oid Object Identifier of the instance of <code>DireccionC</code> to be created.
     * @throws SystemException
     */
    public DireccionC(DireccionCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            direccionCCodigo = oid.getDireccionCCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>direccionCCodigo</code> attribute<br>in class <code>DireccionC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DireccionC</code>
     * @return The value of the <code>direccionCCodigo</code> attribute<br>in class <code>DireccionC</code>.
     */
    public Long getDireccionCCodigo() {
        return direccionCCodigo;
    }

    /**
     * Sets the value of the <code>direccionCCodigo</code> attribute<br>in class <code>DireccionC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DireccionC</code>
     * @param direccionCCodigo The new value of the <code>direccionCCodigo</code> attribute<br>in class <code>DireccionC</code>.
     */
    public void setDireccionCCodigo(Long direccionCCodigo) {
        this.direccionCCodigo = direccionCCodigo;
    }

   /**
    * Returns the value of the <code>direccionCDireccionCompleta</code> attribute.<br>
    * Model Attribute: <code>direccionCDireccionCompleta</code>. Variable String Size=250<br>
    * Comments: <br>
    * @return The value of the <code>direccionCDireccionCompleta</code> attribute.
    */

    public String getDireccionCDireccionCompleta()  {
    	String value;
        value =  direccionCDireccionCompleta;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>direccionCDireccionCompleta</code> attribute.<br>
    * Model Attribute: <code>direccionCDireccionCompleta</code>. Variable String Size=250<br>
    * Comments: <br>
    * @param direccionCDireccionCompleta The new value of the <code>direccionCDireccionCompleta</code> attribute.
    */
    public void setDireccionCDireccionCompleta (String direccionCDireccionCompleta) {
        modifiedDireccionCDireccionCompleta = true;
        this.direccionCDireccionCompleta = direccionCDireccionCompleta;
    }

   /**
    * Returns the value of the <code>modifiedDireccionCDireccionCompleta</code> class property.<br>
    *
    * @return The value of the <code>modifiedDireccionCDireccionCompleta</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDireccionCDireccionCompleta() {
        return modifiedDireccionCDireccionCompleta;
    }

   /**
    * Sets the value of the <code>modifiedDireccionCDireccionCompleta</code> class property.<br>
    * @param modified The new value of the <code>modifiedDireccionCDireccionCompleta</code>.
    */
    public void setModifiedDireccionCDireccionCompleta(boolean modified) {
        this.modifiedDireccionCDireccionCompleta = modified;
    }

   /**
    * Returns the value of the <code>direccionCLocalidad</code> attribute.<br>
    * Model Attribute: <code>direccionCLocalidad</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>direccionCLocalidad</code> attribute.
    */

    public String getDireccionCLocalidad()  {
    	String value;
        value =  direccionCLocalidad;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>direccionCLocalidad</code> attribute.<br>
    * Model Attribute: <code>direccionCLocalidad</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param direccionCLocalidad The new value of the <code>direccionCLocalidad</code> attribute.
    */
    public void setDireccionCLocalidad (String direccionCLocalidad) {
        modifiedDireccionCLocalidad = true;
        this.direccionCLocalidad = direccionCLocalidad;
    }

   /**
    * Returns the value of the <code>modifiedDireccionCLocalidad</code> class property.<br>
    *
    * @return The value of the <code>modifiedDireccionCLocalidad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDireccionCLocalidad() {
        return modifiedDireccionCLocalidad;
    }

   /**
    * Sets the value of the <code>modifiedDireccionCLocalidad</code> class property.<br>
    * @param modified The new value of the <code>modifiedDireccionCLocalidad</code>.
    */
    public void setModifiedDireccionCLocalidad(boolean modified) {
        this.modifiedDireccionCLocalidad = modified;
    }

   /**
    * Returns the value of the <code>direccionCdrvCiudad</code> attribute.<br>
    * Model Attribute: <code>direccionCdrvCiudad</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>direccionCdrvCiudad</code> attribute.
    */

    @JsonIgnore
    public String getDireccionCdrvCiudad()  {
    	String value;
        try {
            value = direccionCdrvCiudadDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: DireccionC, Attribute: direccionCdrvCiudad");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>direccionCdrvTieneDepartamento</code> attribute.<br>
    * Model Attribute: <code>direccionCdrvTieneDepartamento</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>direccionCdrvTieneDepartamento</code> attribute.
    */

    @JsonIgnore
    public Boolean getDireccionCdrvTieneDepartamento()  {
    	Boolean value;
        try {
            value = direccionCdrvTieneDepartamentoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: DireccionC, Attribute: direccionCdrvTieneDepartamento");
        }
        return value;
    }

   /**
    * Returns the value of the <code>direccionCdrvTieneMunicipio</code> attribute.<br>
    * Model Attribute: <code>direccionCdrvTieneMunicipio</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>direccionCdrvTieneMunicipio</code> attribute.
    */

    @JsonIgnore
    public Boolean getDireccionCdrvTieneMunicipio()  {
    	Boolean value;
        try {
            value = direccionCdrvTieneMunicipioDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: DireccionC, Attribute: direccionCdrvTieneMunicipio");
        }
        return value;
    }

    /**
     * Returns the instance of <code>TelefonoC</code> related through the <code>TelefonosC</code> role.
     * Model Relationship:
     * <code>[TelefonoC] TelefonosC 0:M  ------ 0:1  DireccionC [DireccionC]</code>
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
     * <code>[PersonaC] PersonaC 0:1  ------ 0:M  DireccionesC [DireccionC]</code>
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
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratoC 0:1  ------ 0:M  DireccionesC [DireccionC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     */
    @JsonIgnore
    public ContratoC getContratoC() {
        return contratoC;
    }

    /**
     * Adds an instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     * @param contratoC The instance to add to the <code>ContratoC</code> role.
     */
    public void add2ContratoC(ContratoC contratoC) {
        if (contratoC == null || contratoC.isNull()) {
            this.modifiedContratoC = true;
            this.contratoCContratoCID = null;
        } else {
            this.contratoCContratoCID = contratoC.getContratoCID();
        }
        this.contratoC = (contratoC == null  || contratoC.isNull() ? null : contratoC);
    }

   /**
    * This method gets the attribute value <code>modifiedContratoC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratoC</code> has been modified.
    */
    public boolean isModifiedContratoC(){
        return modifiedContratoC;
    }

    /**
     * Returns the instance of <code>TipoDireccion</code> related through the <code>TipoDireccionC</code> role.
     * Model Relationship:
     * <code>[TipoDireccion] TipoDireccionC 0:1  ------ 0:M  DireccionesC [DireccionC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoDireccion</code> related through the <code>TipoDireccionC</code> role.
     */
    @JsonIgnore
    public TipoDireccion getTipoDireccionC() {
        return tipoDireccionC;
    }

    /**
     * Adds an instance of <code>TipoDireccion</code> related through the <code>TipoDireccionC</code> role.
     * @param tipoDireccionC The instance to add to the <code>TipoDireccionC</code> role.
     */
    public void add2TipoDireccionC(TipoDireccion tipoDireccionC) {
        if (tipoDireccionC == null || tipoDireccionC.isNull()) {
            this.modifiedTipoDireccionC = true;
            this.tipoDireccionTipoDireccionCCodigo = null;
        } else {
            this.tipoDireccionTipoDireccionCCodigo = tipoDireccionC.getTipoDireccionCodigo();
        }
        this.tipoDireccionC = (tipoDireccionC == null  || tipoDireccionC.isNull() ? null : tipoDireccionC);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoDireccionC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoDireccionC</code> has been modified.
    */
    public boolean isModifiedTipoDireccionC(){
        return modifiedTipoDireccionC;
    }

    /**
     * Returns the instance of <code>Departamento</code> related through the <code>DepartamentoC</code> role.
     * Model Relationship:
     * <code>[Departamento] DepartamentoC 0:1  ------ 0:M  DireccionesC [DireccionC]</code>
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
     * Returns the instance of <code>Municipio</code> related through the <code>MunicipioC</code> role.
     * Model Relationship:
     * <code>[Municipio] MunicipioC 0:1  ------ 0:M  DireccionesC [DireccionC]</code>
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
     * Returns the instance of <code>Pais</code> related through the <code>PaisC</code> role.
     * Model Relationship:
     * <code>[Pais] PaisC 0:1  ------ 0:M  DireccionesC [DireccionC]</code>
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
     * Returns a Map with the values of the attributes.
     * @return Map with the values of the attributes.
     */
    @JsonIgnore
	@Override
    public Map<String, Object> getValues() {
        return values;
    }

    /**
     * Computes the value of the <code>direccionCdrvCiudad</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>direccionCdrvCiudad</code> derived attribute.
     */
    public String direccionCdrvCiudadDerivations() {

        direccionCdrvCiudad = null;

        direccionCdrvCiudadDerivationsDefault();
        return direccionCdrvCiudad;
    }

    private void direccionCdrvCiudadDerivationsDefault() {
        if (direccionCdrvCiudad != null) return;
        // Default derivation
        // EFFECT   : MunicipioC.Descripcion
        direccionCdrvCiudad = this.getMunicipioC().getMunicipioDescripcion();
    }

    /**
     * Computes the value of the <code>direccionCdrvTieneDepartamento</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>direccionCdrvTieneDepartamento</code> derived attribute.
     */
    public Boolean direccionCdrvTieneDepartamentoDerivations() throws SystemException {

        direccionCdrvTieneDepartamento = null;

        direccionCdrvTieneDepartamentoDerivationsDefault();
        return direccionCdrvTieneDepartamento;
    }

    private void direccionCdrvTieneDepartamentoDerivationsDefault() throws SystemException {
        if (direccionCdrvTieneDepartamento != null) return;
        // Default derivation
        // EFFECT   : EXIST( DepartamentoC ) = true
        direccionCdrvTieneDepartamento = getDireccionCRepository().assocOperator000(this).equals(true);
    }

    /**
     * Computes the value of the <code>direccionCdrvTieneMunicipio</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>direccionCdrvTieneMunicipio</code> derived attribute.
     */
    public Boolean direccionCdrvTieneMunicipioDerivations() throws SystemException {

        direccionCdrvTieneMunicipio = null;

        direccionCdrvTieneMunicipioDerivationsDefault();
        return direccionCdrvTieneMunicipio;
    }

    private void direccionCdrvTieneMunicipioDerivationsDefault() throws SystemException {
        if (direccionCdrvTieneMunicipio != null) return;
        // Default derivation
        // EFFECT   : EXIST( MunicipioC ) = true
        direccionCdrvTieneMunicipio = getDireccionCRepository().assocOperator001(this).equals(true);
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        direccionCDireccionCompleta = null;
        direccionCLocalidad = null;
        telefonosC = null;
        personaC = null;
        contratoC = null;
        tipoDireccionC = null;
        departamentoC = null;
        municipioC = null;
        paisC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    public DireccionCJpaRepository getDireccionCRepository() {
        return Arc.container().select(DireccionCJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return DireccionC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return DireccionCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedDireccionCDireccionCompleta = false;
    	values.put("direccionCDireccionCompleta", getDireccionCDireccionCompleta());
    	modifiedDireccionCLocalidad = false;
    	values.put("direccionCLocalidad", getDireccionCLocalidad());
    	modifiedTelefonosC = false;
    	modifiedPersonaC = false;
    	modifiedContratoC = false;
    	modifiedTipoDireccionC = false;
    	modifiedDepartamentoC = false;
    	modifiedMunicipioC = false;
    	modifiedPaisC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            direccionCdrvCiudad = null;
            direccionCdrvTieneDepartamento = null;
            direccionCdrvTieneMunicipio = null;
    }

    /**
     * Returns the <code>DireccionCOid</code> object that identifies this instance of <code>DireccionC</code>.
     * @return <code>DireccionCOid </code> object that identifies this instance of <code>DireccionC</code>
     */
	@Override
    public DireccionCOid getOid() {
        return new DireccionCOid(getDireccionCCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(DireccionCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(DireccionCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.DIRECCIONC)) {
            // Add this class
            activeFacets.add(Constants.DIRECCIONC);
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
            relatedInstance = buildDireccionCRelatedInstance(relatedInstanceJsonOid);
        }
        if (DireccionCConstants.ROLE_NAME_TELEFONOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4TelefonoC(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_TIPODIRECCIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4TipoDireccion(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_DEPARTAMENTOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_MUNICIPIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_PAISC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDireccionCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4TelefonoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TelefonoC(mapper.readValue(relatedInstanceJsonOid, TelefonoCOid.class)): TelefonoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4TipoDireccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoDireccion(mapper.readValue(relatedInstanceJsonOid, TipoDireccionOid.class)): TipoDireccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
