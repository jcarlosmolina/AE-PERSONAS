package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.PaisConstants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.repository.DepartamentoJpaRepository;
import com.keralty.aepersonas.repository.MunicipioJpaRepository;
import com.keralty.aepersonas.repository.PaisJpaRepository;
import com.keralty.aepersonas.repository.PersonaJpaRepository;
import com.keralty.aepersonas.repository.SolicitudJpaRepository;
import com.keralty.aepersonas.repository.TipoDireccionJpaRepository;
import com.keralty.aepersonas.repository.TitularJpaRepository;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>Direccion</code> model class.
 * <p>
 * Model Class: <code>Direccion</code><br>
 */
@Entity(name = DireccionConstants.CLASS_NAME)
@Table(name = DireccionConstants.TBL_NAME)
public class Direccion extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient PersonaJpaRepository personaRepository;

    @JsonIgnore
    private transient TipoDireccionJpaRepository tipoDireccionRepository;

    @JsonIgnore
    private transient MunicipioJpaRepository municipioRepository;

    @JsonIgnore
    private transient DepartamentoJpaRepository departamentoRepository;

    @JsonIgnore
    private transient PaisJpaRepository paisRepository;

    @JsonIgnore
    private transient SolicitudJpaRepository solicitudRepository;

    @JsonIgnore
    private transient TitularJpaRepository titularRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Direccion_Sequence")
    @SequenceGenerator(name="Direccion_Sequence", sequenceName="Direccion_Sequence", allocationSize=1)
    @Column(name = DireccionConstants.FLD_DIRECCIONIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long direccionIdentificador;

    /** Class member attribute. */
    @Column(name = DireccionConstants.FLD_DIRECCIONCODIGO )
    @JsonProperty(value="codigo")
    private Long direccionCodigo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionCodigo;

    /** Class member attribute. */
    @Column(name = DireccionConstants.FLD_DIRECCIONDIRECCIONCOMPLETA )
    @JsonProperty(value="direccioncompleta")
    private String direccionDireccionCompleta;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionDireccionCompleta;

    /** Class member attribute. */
    @Column(name = DireccionConstants.FLD_DIRECCIONRURAL )
    @JsonProperty(value="rural")
    private Boolean direccionRural;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccionRural;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionConstants.FLD_PERSONAPERSONAIDENTIFICADOR, referencedColumnName=PersonaConstants.FLD_PERSONAIDENTIFICADOR)
    })
    @JsonIgnore
    private Persona persona;
    /** Related attribute. */
    @Column(name = DireccionConstants.FLD_PERSONAPERSONAIDENTIFICADOR, insertable = false, updatable = false)
    private Long personaPersonaIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersona;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionConstants.FLD_TIPODIRECCIONTIPODIRECCIONCODIGO, referencedColumnName=TipoDireccionConstants.FLD_TIPODIRECCIONCODIGO)
    })
    @JsonIgnore
    private TipoDireccion tipoDireccion;
    /** Related attribute. */
    @Column(name = DireccionConstants.FLD_TIPODIRECCIONTIPODIRECCIONCODIGO, insertable = false, updatable = false)
    private Long tipoDireccionTipoDireccionCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoDireccion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionConstants.FLD_MUNICIPIOMUNICIPIOCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipio;
    /** Related attribute. */
    @Column(name = DireccionConstants.FLD_MUNICIPIOMUNICIPIOCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipio;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionConstants.FLD_DEPARTAMENTODEPARTAMENTOCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamento;
    /** Related attribute. */
    @Column(name = DireccionConstants.FLD_DEPARTAMENTODEPARTAMENTOCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamento;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionConstants.FLD_PAISPAISCODIGO, referencedColumnName=PaisConstants.FLD_PAISCODIGO)
    })
    @JsonIgnore
    private Pais pais;
    /** Related attribute. */
    @Column(name = DireccionConstants.FLD_PAISPAISCODIGO, insertable = false, updatable = false)
    private String paisPaisCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPais;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=SolicitudConstants.FLD_AESOLICITUDESIDSOLICITUD)
    })
    @JsonIgnore
    private Solicitud contrato;
    /** Related attribute. */
    @Column(name = DireccionConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
    private Long aesolicitudesidsolicitud;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContrato;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DireccionConstants.FLD_AESOLICITUDESTITULARIDSOLICITUD, referencedColumnName=TitularConstants.FLD_AESOLICITUDESIDSOLICITUD)
    })
    @JsonIgnore
    private Titular titular;
    /** Related attribute. */
    @Column(name = DireccionConstants.FLD_AESOLICITUDESTITULARIDSOLICITUD, insertable = false, updatable = false)
    private Long aesolicitudesTitularidsolicitud;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTitular;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Direccion() {
        direccionIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Direccion</code>.
     * @param oid Object Identifier of the instance of <code>Direccion</code> to be created.
     * @throws SystemException
     */
    public Direccion(DireccionOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            direccionIdentificador = oid.getDireccionIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>direccionIdentificador</code> attribute<br>in class <code>Direccion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Direccion</code>
     * @return The value of the <code>direccionIdentificador</code> attribute<br>in class <code>Direccion</code>.
     */
    public Long getDireccionIdentificador() {
        return direccionIdentificador;
    }

    /**
     * Sets the value of the <code>direccionIdentificador</code> attribute<br>in class <code>Direccion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Direccion</code>
     * @param direccionIdentificador The new value of the <code>direccionIdentificador</code> attribute<br>in class <code>Direccion</code>.
     */
    public void setDireccionIdentificador(Long direccionIdentificador) {
        this.direccionIdentificador = direccionIdentificador;
    }

   /**
    * Returns the value of the <code>direccionCodigo</code> attribute.<br>
    * Model Attribute: <code>direccionCodigo</code>. Variable Int<br>
    * Comments: Este es el consecutivo que le asigna el CORE. Cuando recogemos los datos de la dirección en local este dato no lo sabemos. <br>
    * @return The value of the <code>direccionCodigo</code> attribute.
    */

    public Long getDireccionCodigo()  {
    	Long value;
        value =  direccionCodigo;
        return value;
    }

   /**
    * Sets the value of the <code>direccionCodigo</code> attribute.<br>
    * Model Attribute: <code>direccionCodigo</code>. Variable Int<br>
    * Comments: Este es el consecutivo que le asigna el CORE. Cuando recogemos los datos de la dirección en local este dato no lo sabemos. <br>
    * @param direccionCodigo The new value of the <code>direccionCodigo</code> attribute.
    */
    public void setDireccionCodigo (Long direccionCodigo) {
        modifiedDireccionCodigo = true;
        this.direccionCodigo = direccionCodigo;
    }

   /**
    * Returns the value of the <code>modifiedDireccionCodigo</code> class property.<br>
    *
    * @return The value of the <code>modifiedDireccionCodigo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDireccionCodigo() {
        return modifiedDireccionCodigo;
    }

   /**
    * Sets the value of the <code>modifiedDireccionCodigo</code> class property.<br>
    * @param modified The new value of the <code>modifiedDireccionCodigo</code>.
    */
    public void setModifiedDireccionCodigo(boolean modified) {
        this.modifiedDireccionCodigo = modified;
    }

   /**
    * Returns the value of the <code>direccionDireccionCompleta</code> attribute.<br>
    * Model Attribute: <code>direccionDireccionCompleta</code>. Variable String Size=250<br>
    * Comments: <br>
    * @return The value of the <code>direccionDireccionCompleta</code> attribute.
    */

    public String getDireccionDireccionCompleta()  {
    	String value;
        value =  direccionDireccionCompleta;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>direccionDireccionCompleta</code> attribute.<br>
    * Model Attribute: <code>direccionDireccionCompleta</code>. Variable String Size=250<br>
    * Comments: <br>
    * @param direccionDireccionCompleta The new value of the <code>direccionDireccionCompleta</code> attribute.
    */
    public void setDireccionDireccionCompleta (String direccionDireccionCompleta) {
        modifiedDireccionDireccionCompleta = true;
        this.direccionDireccionCompleta = direccionDireccionCompleta;
    }

   /**
    * Returns the value of the <code>modifiedDireccionDireccionCompleta</code> class property.<br>
    *
    * @return The value of the <code>modifiedDireccionDireccionCompleta</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDireccionDireccionCompleta() {
        return modifiedDireccionDireccionCompleta;
    }

   /**
    * Sets the value of the <code>modifiedDireccionDireccionCompleta</code> class property.<br>
    * @param modified The new value of the <code>modifiedDireccionDireccionCompleta</code>.
    */
    public void setModifiedDireccionDireccionCompleta(boolean modified) {
        this.modifiedDireccionDireccionCompleta = modified;
    }

   /**
    * Returns the value of the <code>direccionRural</code> attribute.<br>
    * Model Attribute: <code>direccionRural</code>. Variable Bool<br>
    * Comments: Si la dirección es rural <br>
    * @return The value of the <code>direccionRural</code> attribute.
    */

    public Boolean getDireccionRural()  {
    	Boolean value;
        value =  direccionRural;
        return value;
    }

   /**
    * Sets the value of the <code>direccionRural</code> attribute.<br>
    * Model Attribute: <code>direccionRural</code>. Variable Bool<br>
    * Comments: Si la dirección es rural <br>
    * @param direccionRural The new value of the <code>direccionRural</code> attribute.
    */
    public void setDireccionRural (Boolean direccionRural) {
        modifiedDireccionRural = true;
        this.direccionRural = direccionRural;
    }

   /**
    * Returns the value of the <code>modifiedDireccionRural</code> class property.<br>
    *
    * @return The value of the <code>modifiedDireccionRural</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDireccionRural() {
        return modifiedDireccionRural;
    }

   /**
    * Sets the value of the <code>modifiedDireccionRural</code> class property.<br>
    * @param modified The new value of the <code>modifiedDireccionRural</code>.
    */
    public void setModifiedDireccionRural(boolean modified) {
        this.modifiedDireccionRural = modified;
    }

    /**
     * Returns the instance of <code>Persona</code> related through the <code>Persona</code> role.
     * Model Relationship:
     * <code>[Persona] Persona 0:1  ------ 0:M  Direcciones [Direccion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Persona</code> related through the <code>Persona</code> role.
     */
    @JsonIgnore
    public Persona getPersona() {
        try {
            if (persona != null && persona.isNull()) {
                persona = null;
            }
        } catch (Exception ex) {
            persona = null;
        }
        if (persona == null) {
            if (personaPersonaIdentificador != null) {
                persona = getPersonaRepository().findById(personaPersonaIdentificador).orElse(null);
            } else {
                persona = null;
            }
        }
        return (persona == null ? new Persona(null) : persona);
    }

    /**
     * Adds an instance of <code>Persona</code> related through the <code>Persona</code> role.
     * @param persona The instance to add to the <code>Persona</code> role.
     */
    public void add2Persona(Persona persona) {
        if (persona == null || persona.isNull()) {
            this.modifiedPersona = true;
            this.personaPersonaIdentificador = null;
        } else {
            this.personaPersonaIdentificador = persona.getPersonaIdentificador();
        }
        this.persona = (persona == null  || persona.isNull() ? null : persona);
    }

   /**
    * This method gets the attribute value <code>modifiedPersona</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPersona</code> has been modified.
    */
    public boolean isModifiedPersona(){
        return modifiedPersona;
    }

    /**
     * Returns the instance of <code>TipoDireccion</code> related through the <code>TipoDireccion</code> role.
     * Model Relationship:
     * <code>[TipoDireccion] TipoDireccion 0:1  ------ 0:M  Direcciones [Direccion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoDireccion</code> related through the <code>TipoDireccion</code> role.
     */
    @JsonIgnore
    public TipoDireccion getTipoDireccion() {
        try {
            if (tipoDireccion != null && tipoDireccion.isNull()) {
                tipoDireccion = null;
            }
        } catch (Exception ex) {
            tipoDireccion = null;
        }
        if (tipoDireccion == null) {
            if (tipoDireccionTipoDireccionCodigo != null) {
                tipoDireccion = getTipoDireccionRepository().findById(tipoDireccionTipoDireccionCodigo).orElse(null);
            } else {
                tipoDireccion = null;
            }
        }
        return (tipoDireccion == null ? new TipoDireccion(null) : tipoDireccion);
    }

    /**
     * Adds an instance of <code>TipoDireccion</code> related through the <code>TipoDireccion</code> role.
     * @param tipoDireccion The instance to add to the <code>TipoDireccion</code> role.
     */
    public void add2TipoDireccion(TipoDireccion tipoDireccion) {
        if (tipoDireccion == null || tipoDireccion.isNull()) {
            this.modifiedTipoDireccion = true;
            this.tipoDireccionTipoDireccionCodigo = null;
        } else {
            this.tipoDireccionTipoDireccionCodigo = tipoDireccion.getTipoDireccionCodigo();
        }
        this.tipoDireccion = (tipoDireccion == null  || tipoDireccion.isNull() ? null : tipoDireccion);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoDireccion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoDireccion</code> has been modified.
    */
    public boolean isModifiedTipoDireccion(){
        return modifiedTipoDireccion;
    }

    /**
     * Returns the instance of <code>Municipio</code> related through the <code>Municipio</code> role.
     * Model Relationship:
     * <code>[Municipio] Municipio 0:1  ------ 0:M  Direcciones [Direccion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>Municipio</code> role.
     */
    @JsonIgnore
    public Municipio getMunicipio() {
        try {
            if (municipio != null && municipio.isNull()) {
                municipio = null;
            }
        } catch (Exception ex) {
            municipio = null;
        }
        if (municipio == null) {
            if (municipioMunicipioCodigo != null) {
                municipio = getMunicipioRepository().findById(municipioMunicipioCodigo).orElse(null);
            } else {
                municipio = null;
            }
        }
        return (municipio == null ? new Municipio(null) : municipio);
    }

    /**
     * Adds an instance of <code>Municipio</code> related through the <code>Municipio</code> role.
     * @param municipio The instance to add to the <code>Municipio</code> role.
     */
    public void add2Municipio(Municipio municipio) {
        if (municipio == null || municipio.isNull()) {
            this.modifiedMunicipio = true;
            this.municipioMunicipioCodigo = null;
        } else {
            this.municipioMunicipioCodigo = municipio.getMunicipioCodigo();
        }
        this.municipio = (municipio == null  || municipio.isNull() ? null : municipio);
    }

   /**
    * This method gets the attribute value <code>modifiedMunicipio</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMunicipio</code> has been modified.
    */
    public boolean isModifiedMunicipio(){
        return modifiedMunicipio;
    }

    /**
     * Returns the instance of <code>Departamento</code> related through the <code>Departamento</code> role.
     * Model Relationship:
     * <code>[Departamento] Departamento 0:1  ------ 0:M  Direcciones [Direccion]</code>
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
     * Returns the instance of <code>Pais</code> related through the <code>Pais</code> role.
     * Model Relationship:
     * <code>[Pais] Pais 0:1  ------ 0:M  Direcciones [Direccion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Pais</code> related through the <code>Pais</code> role.
     */
    @JsonIgnore
    public Pais getPais() {
        try {
            if (pais != null && pais.isNull()) {
                pais = null;
            }
        } catch (Exception ex) {
            pais = null;
        }
        if (pais == null) {
            if (paisPaisCodigo != null) {
                pais = getPaisRepository().findById(paisPaisCodigo).orElse(null);
            } else {
                pais = null;
            }
        }
        return (pais == null ? new Pais(null) : pais);
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
     * Returns the instance of <code>Solicitud</code> related through the <code>Contrato</code> role.
     * Model Relationship:
     * <code>[Solicitud] Contrato 0:1  ------ 0:1  Direccion [Direccion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Contrato</code> role.
     */
    @JsonIgnore
    public Solicitud getContrato() {
        try {
            if (contrato != null && contrato.isNull()) {
                contrato = null;
            }
        } catch (Exception ex) {
            contrato = null;
        }
        if (contrato == null) {
            if (aesolicitudesidsolicitud != null) {
                contrato = getSolicitudRepository().findById(aesolicitudesidsolicitud).orElse(null);
            } else {
                contrato = null;
            }
        }
        return (contrato == null ? new Solicitud(null) : contrato);
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>Contrato</code> role.
     * @param contrato The instance to add to the <code>Contrato</code> role.
     */
    public void add2Contrato(Solicitud contrato) {
        if (contrato == null || contrato.isNull()) {
            this.modifiedContrato = true;
            this.aesolicitudesidsolicitud = null;
        } else {
            this.aesolicitudesidsolicitud = contrato.getAesolicitudesidsolicitud();
        }
        this.contrato = (contrato == null  || contrato.isNull() ? null : contrato);
    }

   /**
    * This method gets the attribute value <code>modifiedContrato</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContrato</code> has been modified.
    */
    public boolean isModifiedContrato(){
        return modifiedContrato;
    }

    /**
     * Returns the instance of <code>Titular</code> related through the <code>Titular</code> role.
     * Model Relationship:
     * <code>[Titular] Titular 0:1  ------ 0:1  Direccion [Direccion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Titular</code> related through the <code>Titular</code> role.
     */
    @JsonIgnore
    public Titular getTitular() {
        try {
            if (titular != null && titular.isNull()) {
                titular = null;
            }
        } catch (Exception ex) {
            titular = null;
        }
        if (titular == null) {
            if (aesolicitudesTitularidsolicitud != null) {
                titular = getTitularRepository().findById(aesolicitudesTitularidsolicitud).orElse(null);
            } else {
                titular = null;
            }
        }
        return (titular == null ? new Titular(null) : titular);
    }

    /**
     * Adds an instance of <code>Titular</code> related through the <code>Titular</code> role.
     * @param titular The instance to add to the <code>Titular</code> role.
     */
    public void add2Titular(Titular titular) {
        if (titular == null || titular.isNull()) {
            this.modifiedTitular = true;
            this.aesolicitudesTitularidsolicitud = null;
        } else {
            this.aesolicitudesTitularidsolicitud = titular.getAesolicitudesidsolicitud();
        }
        this.titular = (titular == null  || titular.isNull() ? null : titular);
    }

   /**
    * This method gets the attribute value <code>modifiedTitular</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTitular</code> has been modified.
    */
    public boolean isModifiedTitular(){
        return modifiedTitular;
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
        direccionCodigo = null;
        direccionDireccionCompleta = null;
        direccionRural = null;
        persona = null;
        tipoDireccion = null;
        municipio = null;
        departamento = null;
        pais = null;
        contrato = null;
        titular = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public PersonaJpaRepository getPersonaRepository() {
        return Arc.container().select(PersonaJpaRepository.class).get();
    }
    public TipoDireccionJpaRepository getTipoDireccionRepository() {
        return Arc.container().select(TipoDireccionJpaRepository.class).get();
    }
    public MunicipioJpaRepository getMunicipioRepository() {
        return Arc.container().select(MunicipioJpaRepository.class).get();
    }
    public DepartamentoJpaRepository getDepartamentoRepository() {
        return Arc.container().select(DepartamentoJpaRepository.class).get();
    }
    public PaisJpaRepository getPaisRepository() {
        return Arc.container().select(PaisJpaRepository.class).get();
    }
    public SolicitudJpaRepository getSolicitudRepository() {
        return Arc.container().select(SolicitudJpaRepository.class).get();
    }
    public TitularJpaRepository getTitularRepository() {
        return Arc.container().select(TitularJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Direccion.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return DireccionConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedDireccionCodigo = false;
    	values.put("direccionCodigo", getDireccionCodigo());
    	modifiedDireccionDireccionCompleta = false;
    	values.put("direccionDireccionCompleta", getDireccionDireccionCompleta());
    	modifiedDireccionRural = false;
    	values.put("direccionRural", getDireccionRural());
    	modifiedPersona = false;
    	modifiedTipoDireccion = false;
    	modifiedMunicipio = false;
    	modifiedDepartamento = false;
    	modifiedPais = false;
    	modifiedContrato = false;
    	modifiedTitular = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>DireccionOid</code> object that identifies this instance of <code>Direccion</code>.
     * @return <code>DireccionOid </code> object that identifies this instance of <code>Direccion</code>
     */
	@Override
    public DireccionOid getOid() {
        return new DireccionOid(getDireccionIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(DireccionConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(DireccionConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.DIRECCION)) {
            // Add this class
            activeFacets.add(Constants.DIRECCION);
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

    public String buildICDireccion() {
        try {
            return getDireccionDireccionCompleta() + " " + getTipoDireccion().getTipoDireccionDescripcion();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSDireccionNull() {
        try {
            return (getDireccionCodigo() != null ? getDireccionCodigo().toString() : "");
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
            relatedInstance = buildDireccionRelatedInstance(relatedInstanceJsonOid);
        }
        if (DireccionConstants.ROLE_NAME_PERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_TIPODIRECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4TipoDireccion(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_MUNICIPIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_DEPARTAMENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_PAIS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_CONTRATO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_TITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDireccionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4TipoDireccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoDireccion(mapper.readValue(relatedInstanceJsonOid, TipoDireccionOid.class)): TipoDireccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            return null;
        }
    }
}
