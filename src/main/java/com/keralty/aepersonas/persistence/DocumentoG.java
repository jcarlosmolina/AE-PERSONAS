package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DocumentoGConstants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.DocumentoGOid;
import com.keralty.aepersonas.persistence.oid.ObsEstadoOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.repository.ObsEstadoJpaRepository;
import com.keralty.aepersonas.repository.PersonaJpaRepository;
import com.keralty.aepersonas.repository.SolicitudJpaRepository;
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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>DocumentoG</code> model class.
 * <p>
 * Model Class: <code>DocumentoG</code><br>
 */
@Entity(name = DocumentoGConstants.CLASS_NAME)
@Table(name = DocumentoGConstants.TBL_NAME)
public class DocumentoG extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient ObsEstadoJpaRepository obsEstadoRepository;

    @JsonIgnore
    private transient SolicitudJpaRepository solicitudRepository;

    @JsonIgnore
    private transient PersonaJpaRepository personaRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DocumentoG_Sequence")
    @SequenceGenerator(name="DocumentoG_Sequence", sequenceName="DocumentoG_Sequence", allocationSize=1)
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long documentoGIdentificador;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String documentoGDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGDescripcion;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGTIPO )
    @JsonProperty(value="tipo")
    private Long documentoGTipo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGTipo;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGESTADO )
    @JsonProperty(value="estado")
    private Long documentoGEstado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGEstado;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGFECHASUBIDA )
    @JsonProperty(value="fechasubida")
    private Timestamp documentoGFechaSubida;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGFechaSubida;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGPATHCOMPLETO )
    @JsonProperty(value="pathcompleto")
    private String documentoGPathCompleto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGPathCompleto;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGEXTENSION )
    @JsonProperty(value="extension")
    private String documentoGExtension;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGExtension;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGNUMDESCARGAS )
    @JsonProperty(value="numdescargas")
    private Long documentoGNumDescargas;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGNumDescargas;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGEMAILENVIODEVUELTO )
    @JsonProperty(value="emailenviodevuelto")
    private String documentoGEmailEnvioDevuelto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGEmailEnvioDevuelto;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGRESULTADOSUBIDA )
    @JsonProperty(value="resultadosubida")
    private String documentoGResultadoSubida;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGResultadoSubida;

    @Transient
    @JsonIgnore
    public boolean documentoGResultadoSubidaInit = false;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGIDDOCENGESTOR )
    @JsonProperty(value="iddocengestor")
    private String documentoGIdDocEnGestor;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGIdDocEnGestor;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGNOMBRE )
    @JsonProperty(value="nombre")
    private String documentoGNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGNombre;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnumcontrato")
    protected String documentoGDrvNumContrato;

    /** Class member attribute. */
    @Column(name = DocumentoGConstants.FLD_DOCUMENTOGUSUARIOCREADOR )
    @JsonProperty(value="usuariocreador")
    private String documentoGUsuarioCreador;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoGUsuarioCreador;

    /** Related Class. */
    @OneToMany(mappedBy = DocumentoGConstants.ROLE_INVNAME_OBSESTADO)
    @JsonIgnore
    private Collection <ObsEstado> obsEstado;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedObsEstado;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DocumentoGConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=SolicitudConstants.FLD_AESOLICITUDESIDSOLICITUD)
    })
    @JsonIgnore
    private Solicitud solicitud;
    /** Related attribute. */
    @Column(name = DocumentoGConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
    private Long aesolicitudesidsolicitud;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitud;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DocumentoGConstants.FLD_PERSONAPERSONAIDENTIFICADOR, referencedColumnName=PersonaConstants.FLD_PERSONAIDENTIFICADOR)
    })
    @JsonIgnore
    private Persona persona;
    /** Related attribute. */
    @Column(name = DocumentoGConstants.FLD_PERSONAPERSONAIDENTIFICADOR, insertable = false, updatable = false)
    private Long personaPersonaIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersona;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public DocumentoG() {
        documentoGIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>DocumentoG</code>.
     * @param oid Object Identifier of the instance of <code>DocumentoG</code> to be created.
     * @throws SystemException
     */
    public DocumentoG(DocumentoGOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            documentoGIdentificador = oid.getDocumentoGIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>documentoGIdentificador</code> attribute<br>in class <code>DocumentoG</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DocumentoG</code>
     * @return The value of the <code>documentoGIdentificador</code> attribute<br>in class <code>DocumentoG</code>.
     */
    public Long getDocumentoGIdentificador() {
        return documentoGIdentificador;
    }

    /**
     * Sets the value of the <code>documentoGIdentificador</code> attribute<br>in class <code>DocumentoG</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DocumentoG</code>
     * @param documentoGIdentificador The new value of the <code>documentoGIdentificador</code> attribute<br>in class <code>DocumentoG</code>.
     */
    public void setDocumentoGIdentificador(Long documentoGIdentificador) {
        this.documentoGIdentificador = documentoGIdentificador;
    }

   /**
    * Returns the value of the <code>documentoGDescripcion</code> attribute.<br>
    * Model Attribute: <code>documentoGDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>documentoGDescripcion</code> attribute.
    */

    public String getDocumentoGDescripcion()  {
    	String value;
        value =  documentoGDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoGDescripcion</code> attribute.<br>
    * Model Attribute: <code>documentoGDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param documentoGDescripcion The new value of the <code>documentoGDescripcion</code> attribute.
    */
    public void setDocumentoGDescripcion (String documentoGDescripcion) {
        modifiedDocumentoGDescripcion = true;
        this.documentoGDescripcion = documentoGDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGDescripcion() {
        return modifiedDocumentoGDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGDescripcion</code>.
    */
    public void setModifiedDocumentoGDescripcion(boolean modified) {
        this.modifiedDocumentoGDescripcion = modified;
    }

   /**
    * Returns the value of the <code>documentoGTipo</code> attribute.<br>
    * Model Attribute: <code>documentoGTipo</code>. Variable Nat<br>
    * Comments: 1.- Escaneo documento de identificación 2.- Documentos de solicitud (Declaratoria de EPS, Certificado de antigüedad...)<br>
    * @return The value of the <code>documentoGTipo</code> attribute.
    */

    public Long getDocumentoGTipo()  {
    	Long value;
        value =  documentoGTipo;
        return value;
    }

   /**
    * Sets the value of the <code>documentoGTipo</code> attribute.<br>
    * Model Attribute: <code>documentoGTipo</code>. Variable Nat<br>
    * Comments: 1.- Escaneo documento de identificación 2.- Documentos de solicitud (Declaratoria de EPS, Certificado de antigüedad...)<br>
    * @param documentoGTipo The new value of the <code>documentoGTipo</code> attribute.
    */
    public void setDocumentoGTipo (Long documentoGTipo) {
        modifiedDocumentoGTipo = true;
        this.documentoGTipo = documentoGTipo;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGTipo</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGTipo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGTipo() {
        return modifiedDocumentoGTipo;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGTipo</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGTipo</code>.
    */
    public void setModifiedDocumentoGTipo(boolean modified) {
        this.modifiedDocumentoGTipo = modified;
    }

   /**
    * Returns the value of the <code>documentoGEstado</code> attribute.<br>
    * Model Attribute: <code>documentoGEstado</code>. Variable Nat<br>
    * Comments: <br>
    * @return The value of the <code>documentoGEstado</code> attribute.
    */

    public Long getDocumentoGEstado()  {
    	Long value;
        value =  documentoGEstado;
        return value;
    }

   /**
    * Sets the value of the <code>documentoGEstado</code> attribute.<br>
    * Model Attribute: <code>documentoGEstado</code>. Variable Nat<br>
    * Comments: <br>
    * @param documentoGEstado The new value of the <code>documentoGEstado</code> attribute.
    */
    public void setDocumentoGEstado (Long documentoGEstado) {
        modifiedDocumentoGEstado = true;
        this.documentoGEstado = documentoGEstado;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGEstado</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGEstado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGEstado() {
        return modifiedDocumentoGEstado;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGEstado</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGEstado</code>.
    */
    public void setModifiedDocumentoGEstado(boolean modified) {
        this.modifiedDocumentoGEstado = modified;
    }

   /**
    * Returns the value of the <code>documentoGFechaSubida</code> attribute.<br>
    * Model Attribute: <code>documentoGFechaSubida</code>. Variable DateTime<br>
    * Comments: <br>
    * @return The value of the <code>documentoGFechaSubida</code> attribute.
    */

    public Timestamp getDocumentoGFechaSubida()  {
    	Timestamp value;
        value =  documentoGFechaSubida;
        return value;
    }

   /**
    * Sets the value of the <code>documentoGFechaSubida</code> attribute.<br>
    * Model Attribute: <code>documentoGFechaSubida</code>. Variable DateTime<br>
    * Comments: <br>
    * @param documentoGFechaSubida The new value of the <code>documentoGFechaSubida</code> attribute.
    */
    public void setDocumentoGFechaSubida (Timestamp documentoGFechaSubida) {
        modifiedDocumentoGFechaSubida = true;
        this.documentoGFechaSubida = documentoGFechaSubida;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGFechaSubida</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGFechaSubida</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGFechaSubida() {
        return modifiedDocumentoGFechaSubida;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGFechaSubida</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGFechaSubida</code>.
    */
    public void setModifiedDocumentoGFechaSubida(boolean modified) {
        this.modifiedDocumentoGFechaSubida = modified;
    }

   /**
    * Returns the value of the <code>documentoGPathCompleto</code> attribute.<br>
    * Model Attribute: <code>documentoGPathCompleto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>documentoGPathCompleto</code> attribute.
    */

    public String getDocumentoGPathCompleto()  {
    	String value;
        value =  documentoGPathCompleto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoGPathCompleto</code> attribute.<br>
    * Model Attribute: <code>documentoGPathCompleto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @param documentoGPathCompleto The new value of the <code>documentoGPathCompleto</code> attribute.
    */
    public void setDocumentoGPathCompleto (String documentoGPathCompleto) {
        modifiedDocumentoGPathCompleto = true;
        this.documentoGPathCompleto = documentoGPathCompleto;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGPathCompleto</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGPathCompleto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGPathCompleto() {
        return modifiedDocumentoGPathCompleto;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGPathCompleto</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGPathCompleto</code>.
    */
    public void setModifiedDocumentoGPathCompleto(boolean modified) {
        this.modifiedDocumentoGPathCompleto = modified;
    }

   /**
    * Returns the value of the <code>documentoGExtension</code> attribute.<br>
    * Model Attribute: <code>documentoGExtension</code>. Variable String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>documentoGExtension</code> attribute.
    */

    public String getDocumentoGExtension()  {
    	String value;
        value =  documentoGExtension;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoGExtension</code> attribute.<br>
    * Model Attribute: <code>documentoGExtension</code>. Variable String Size=15<br>
    * Comments: <br>
    * @param documentoGExtension The new value of the <code>documentoGExtension</code> attribute.
    */
    public void setDocumentoGExtension (String documentoGExtension) {
        modifiedDocumentoGExtension = true;
        this.documentoGExtension = documentoGExtension;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGExtension</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGExtension</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGExtension() {
        return modifiedDocumentoGExtension;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGExtension</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGExtension</code>.
    */
    public void setModifiedDocumentoGExtension(boolean modified) {
        this.modifiedDocumentoGExtension = modified;
    }

   /**
    * Returns the value of the <code>documentoGNumDescargas</code> attribute.<br>
    * Model Attribute: <code>documentoGNumDescargas</code>. Variable Int<br>
    * Comments: <br>
    * @return The value of the <code>documentoGNumDescargas</code> attribute.
    */

    public Long getDocumentoGNumDescargas()  {
    	Long value;
        value =  documentoGNumDescargas;
        return value;
    }

   /**
    * Sets the value of the <code>documentoGNumDescargas</code> attribute.<br>
    * Model Attribute: <code>documentoGNumDescargas</code>. Variable Int<br>
    * Comments: <br>
    * @param documentoGNumDescargas The new value of the <code>documentoGNumDescargas</code> attribute.
    */
    public void setDocumentoGNumDescargas (Long documentoGNumDescargas) {
        modifiedDocumentoGNumDescargas = true;
        this.documentoGNumDescargas = documentoGNumDescargas;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGNumDescargas</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGNumDescargas</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGNumDescargas() {
        return modifiedDocumentoGNumDescargas;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGNumDescargas</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGNumDescargas</code>.
    */
    public void setModifiedDocumentoGNumDescargas(boolean modified) {
        this.modifiedDocumentoGNumDescargas = modified;
    }

   /**
    * Returns the value of the <code>documentoGEmailEnvioDevuelto</code> attribute.<br>
    * Model Attribute: <code>documentoGEmailEnvioDevuelto</code>. Variable String Size=255<br>
    * Comments: Se guardará el resultado del envío del email que se manda para avisar de que el documento ha sido devuelto<br>
    * @return The value of the <code>documentoGEmailEnvioDevuelto</code> attribute.
    */

    public String getDocumentoGEmailEnvioDevuelto()  {
    	String value;
        value =  documentoGEmailEnvioDevuelto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoGEmailEnvioDevuelto</code> attribute.<br>
    * Model Attribute: <code>documentoGEmailEnvioDevuelto</code>. Variable String Size=255<br>
    * Comments: Se guardará el resultado del envío del email que se manda para avisar de que el documento ha sido devuelto<br>
    * @param documentoGEmailEnvioDevuelto The new value of the <code>documentoGEmailEnvioDevuelto</code> attribute.
    */
    public void setDocumentoGEmailEnvioDevuelto (String documentoGEmailEnvioDevuelto) {
        modifiedDocumentoGEmailEnvioDevuelto = true;
        this.documentoGEmailEnvioDevuelto = documentoGEmailEnvioDevuelto;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGEmailEnvioDevuelto</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGEmailEnvioDevuelto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGEmailEnvioDevuelto() {
        return modifiedDocumentoGEmailEnvioDevuelto;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGEmailEnvioDevuelto</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGEmailEnvioDevuelto</code>.
    */
    public void setModifiedDocumentoGEmailEnvioDevuelto(boolean modified) {
        this.modifiedDocumentoGEmailEnvioDevuelto = modified;
    }

   /**
    * Returns the value of the <code>documentoGResultadoSubida</code> attribute.<br>
    * Model Attribute: <code>documentoGResultadoSubida</code>. Variable Text<br>
    * Comments: El resultado de subir el documento al gestor documental<br>
    * @return The value of the <code>documentoGResultadoSubida</code> attribute.
    */

    public String getDocumentoGResultadoSubida()  {
    	String value;
        value =  documentoGResultadoSubida;
        return value;
    }

   /**
    * Sets the value of the <code>documentoGResultadoSubida</code> attribute.<br>
    * Model Attribute: <code>documentoGResultadoSubida</code>. Variable Text<br>
    * Comments: El resultado de subir el documento al gestor documental<br>
    * @param documentoGResultadoSubida The new value of the <code>documentoGResultadoSubida</code> attribute.
    */
    public void setDocumentoGResultadoSubida (String documentoGResultadoSubida) {
        this.documentoGResultadoSubidaInit = true;
        modifiedDocumentoGResultadoSubida = true;
        this.documentoGResultadoSubida = documentoGResultadoSubida;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGResultadoSubida</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGResultadoSubida</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGResultadoSubida() {
        return modifiedDocumentoGResultadoSubida;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGResultadoSubida</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGResultadoSubida</code>.
    */
    public void setModifiedDocumentoGResultadoSubida(boolean modified) {
        this.modifiedDocumentoGResultadoSubida = modified;
    }

   /**
    * Returns the value of the <code>documentoGIdDocEnGestor</code> attribute.<br>
    * Model Attribute: <code>documentoGIdDocEnGestor</code>. Variable String Size=255<br>
    * Comments: Se tiene que hacer cambios manuales en las evaluaciones de subir al gestor para asignarle vaor a este atributo, ya que la función de subir al gestor devuelve una estructura.<br>
    * @return The value of the <code>documentoGIdDocEnGestor</code> attribute.
    */

    public String getDocumentoGIdDocEnGestor()  {
    	String value;
        value =  documentoGIdDocEnGestor;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoGIdDocEnGestor</code> attribute.<br>
    * Model Attribute: <code>documentoGIdDocEnGestor</code>. Variable String Size=255<br>
    * Comments: Se tiene que hacer cambios manuales en las evaluaciones de subir al gestor para asignarle vaor a este atributo, ya que la función de subir al gestor devuelve una estructura.<br>
    * @param documentoGIdDocEnGestor The new value of the <code>documentoGIdDocEnGestor</code> attribute.
    */
    public void setDocumentoGIdDocEnGestor (String documentoGIdDocEnGestor) {
        modifiedDocumentoGIdDocEnGestor = true;
        this.documentoGIdDocEnGestor = documentoGIdDocEnGestor;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGIdDocEnGestor</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGIdDocEnGestor</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGIdDocEnGestor() {
        return modifiedDocumentoGIdDocEnGestor;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGIdDocEnGestor</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGIdDocEnGestor</code>.
    */
    public void setModifiedDocumentoGIdDocEnGestor(boolean modified) {
        this.modifiedDocumentoGIdDocEnGestor = modified;
    }

   /**
    * Returns the value of the <code>documentoGNombre</code> attribute.<br>
    * Model Attribute: <code>documentoGNombre</code>. Variable String Size=255<br>
    * Comments: Nombre del documento<br>
    * @return The value of the <code>documentoGNombre</code> attribute.
    */

    public String getDocumentoGNombre()  {
    	String value;
        value =  documentoGNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoGNombre</code> attribute.<br>
    * Model Attribute: <code>documentoGNombre</code>. Variable String Size=255<br>
    * Comments: Nombre del documento<br>
    * @param documentoGNombre The new value of the <code>documentoGNombre</code> attribute.
    */
    public void setDocumentoGNombre (String documentoGNombre) {
        modifiedDocumentoGNombre = true;
        this.documentoGNombre = documentoGNombre;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGNombre() {
        return modifiedDocumentoGNombre;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGNombre</code>.
    */
    public void setModifiedDocumentoGNombre(boolean modified) {
        this.modifiedDocumentoGNombre = modified;
    }

   /**
    * Returns the value of the <code>documentoGDrvNumContrato</code> attribute.<br>
    * Model Attribute: <code>documentoGDrvNumContrato</code>. Variable String Size=50<br>
    * Comments: Devuelve el Nº de contrato de la solucitud (devuelto por el CORE) o el Nº de Contrato de inclusión, en función del trámite de la solicitud<br>
    * @return The value of the <code>documentoGDrvNumContrato</code> attribute.
    */

    @JsonIgnore
    public String getDocumentoGDrvNumContrato()  {
    	String value;
        try {
            value = documentoGDrvNumContratoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: DocumentoG, Attribute: documentoGDrvNumContrato");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>documentoGUsuarioCreador</code> attribute.<br>
    * Model Attribute: <code>documentoGUsuarioCreador</code>. Constant String Size=50<br>
    * Comments: GdC-36. Req: 8. Los asesores marcados como NO solamente pueden visualizar la documentación que se haya cargado con su propio LOGIN<br>
    * @return The value of the <code>documentoGUsuarioCreador</code> attribute.
    */

    public String getDocumentoGUsuarioCreador()  {
    	String value;
        value =  documentoGUsuarioCreador;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoGUsuarioCreador</code> attribute.<br>
    * Model Attribute: <code>documentoGUsuarioCreador</code>. Constant String Size=50<br>
    * Comments: GdC-36. Req: 8. Los asesores marcados como NO solamente pueden visualizar la documentación que se haya cargado con su propio LOGIN<br>
    * @param documentoGUsuarioCreador The new value of the <code>documentoGUsuarioCreador</code> attribute.
    */
    public void setDocumentoGUsuarioCreador (String documentoGUsuarioCreador) {
        modifiedDocumentoGUsuarioCreador = true;
        this.documentoGUsuarioCreador = documentoGUsuarioCreador;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoGUsuarioCreador</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoGUsuarioCreador</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoGUsuarioCreador() {
        return modifiedDocumentoGUsuarioCreador;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoGUsuarioCreador</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoGUsuarioCreador</code>.
    */
    public void setModifiedDocumentoGUsuarioCreador(boolean modified) {
        this.modifiedDocumentoGUsuarioCreador = modified;
    }

    /**
     * Returns the instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     * Model Relationship:
     * <code>[ObsEstado] ObsEstado 0:M  ------ 1:1  DocumentoG [DocumentoG]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     */
    @JsonIgnore
    public Collection <ObsEstado> getObsEstado() {
        return getObsEstadoRepository().findByDocumentoG(this);
    }

    /**
     * Adds an instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     * @param obsEstado The instance to add to the <code>ObsEstado</code> role.
     */
    public void add2ObsEstado(ObsEstado obsEstado) {
        this.obsEstado.add(obsEstado);
    }
    /**
     * Removes an instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     * @param obsEstado The instance to be removed
     */
    public void removeFromObsEstado(ObsEstado obsEstado) {
    	this.obsEstado.remove(obsEstado);
    }
    /**
     * Sets instances of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     * @param obsEstado The new value for the <code>ObsEstado</code> role.
     */
    public void setObsEstado(Collection < ObsEstado > obsEstado) {
        this.obsEstado = obsEstado;
    }

   /**
    * This method gets the attribute value <code>modifiedObsEstado</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedObsEstado</code> has been modified.
    */
    public boolean isModifiedObsEstado(){
        return modifiedObsEstado;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitud 1:1  ------ 0:M  DocumentosGestor [DocumentoG]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        try {
            if (solicitud != null && solicitud.isNull()) {
                solicitud = null;
            }
        } catch (Exception ex) {
            solicitud = null;
        }
        if (solicitud == null) {
            if (aesolicitudesidsolicitud != null) {
                solicitud = getSolicitudRepository().findById(aesolicitudesidsolicitud).orElse(null);
            } else {
                solicitud = null;
            }
        }
        return (solicitud == null ? new Solicitud(null) : solicitud);
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * @param solicitud The instance to add to the <code>Solicitud</code> role.
     */
    public void add2Solicitud(Solicitud solicitud) {
        if (solicitud == null || solicitud.isNull()) {
            this.modifiedSolicitud = true;
            this.aesolicitudesidsolicitud = null;
        } else {
            this.aesolicitudesidsolicitud = solicitud.getAesolicitudesidsolicitud();
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
     * Returns the instance of <code>Persona</code> related through the <code>Persona</code> role.
     * Model Relationship:
     * <code>[Persona] Persona 1:1  ------ 0:M  DocumentosG [DocumentoG]</code>
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
     * Returns a Map with the values of the attributes.
     * @return Map with the values of the attributes.
     */
    @JsonIgnore
	@Override
    public Map<String, Object> getValues() {
        return values;
    }

    /**
     * Computes the value of the <code>documentoGDrvNumContrato</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>documentoGDrvNumContrato</code> derived attribute.
     */
    public String documentoGDrvNumContratoDerivations() {

        documentoGDrvNumContrato = null;

        documentoGDrvNumContratoDerivationsConditional1();
        documentoGDrvNumContratoDerivationsDefault();
        return documentoGDrvNumContrato;
    }

    private void documentoGDrvNumContratoDerivationsConditional1() {
        if (documentoGDrvNumContrato != null) return;
        // CONDITION: Solicitud.Tramite = 1
        // EFFECT   : Solicitud.NumContrato
        boolean documentoGDrvNumContratoCond = (this.getSolicitud().getSolicitudTramite()).equals(Long.valueOf(1));
        if (documentoGDrvNumContratoCond) {
            documentoGDrvNumContrato = this.getSolicitud().getSolicitudNumContrato();
        }
    }

    private void documentoGDrvNumContratoDerivationsDefault() {
        if (documentoGDrvNumContrato != null) return;
        // Default derivation
        // EFFECT   : Solicitud.NumContratoInclusion
        documentoGDrvNumContrato = this.getSolicitud().getSolicitudNumContratoInclusion();
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        documentoGDescripcion = null;
        documentoGTipo = null;
        documentoGEstado = Long.valueOf(0);
        documentoGFechaSubida = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        documentoGPathCompleto = null;
        documentoGExtension = null;
        documentoGNumDescargas = Long.valueOf(0);
        documentoGEmailEnvioDevuelto = null;
        documentoGResultadoSubida = null;
        documentoGIdDocEnGestor = null;
        documentoGNombre = null;
        documentoGUsuarioCreador = "";
        obsEstado = null;
        solicitud = null;
        persona = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public ObsEstadoJpaRepository getObsEstadoRepository() {
        return Arc.container().select(ObsEstadoJpaRepository.class).get();
    }
    public SolicitudJpaRepository getSolicitudRepository() {
        return Arc.container().select(SolicitudJpaRepository.class).get();
    }
    public PersonaJpaRepository getPersonaRepository() {
        return Arc.container().select(PersonaJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return DocumentoG.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return DocumentoGConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedDocumentoGDescripcion = false;
    	values.put("documentoGDescripcion", getDocumentoGDescripcion());
    	modifiedDocumentoGTipo = false;
    	values.put("documentoGTipo", getDocumentoGTipo());
    	modifiedDocumentoGEstado = false;
    	values.put("documentoGEstado", getDocumentoGEstado());
    	modifiedDocumentoGFechaSubida = false;
    	values.put("documentoGFechaSubida", getDocumentoGFechaSubida());
    	modifiedDocumentoGPathCompleto = false;
    	values.put("documentoGPathCompleto", getDocumentoGPathCompleto());
    	modifiedDocumentoGExtension = false;
    	values.put("documentoGExtension", getDocumentoGExtension());
    	modifiedDocumentoGNumDescargas = false;
    	values.put("documentoGNumDescargas", getDocumentoGNumDescargas());
    	modifiedDocumentoGEmailEnvioDevuelto = false;
    	values.put("documentoGEmailEnvioDevuelto", getDocumentoGEmailEnvioDevuelto());
    	if (modifiedDocumentoGResultadoSubida) {
    		values.put("documentoGResultadoSubida", documentoGResultadoSubida);
    		modifiedDocumentoGResultadoSubida = false;
    	}
    	modifiedDocumentoGIdDocEnGestor = false;
    	values.put("documentoGIdDocEnGestor", getDocumentoGIdDocEnGestor());
    	modifiedDocumentoGNombre = false;
    	values.put("documentoGNombre", getDocumentoGNombre());
    	modifiedDocumentoGUsuarioCreador = false;
    	values.put("documentoGUsuarioCreador", getDocumentoGUsuarioCreador());
    	modifiedObsEstado = false;
    	modifiedSolicitud = false;
    	modifiedPersona = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            documentoGDrvNumContrato = null;
    }

    /**
     * Returns the <code>DocumentoGOid</code> object that identifies this instance of <code>DocumentoG</code>.
     * @return <code>DocumentoGOid </code> object that identifies this instance of <code>DocumentoG</code>
     */
	@Override
    public DocumentoGOid getOid() {
        return new DocumentoGOid(getDocumentoGIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(DocumentoGConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(DocumentoGConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.DOCUMENTOG)) {
            // Add this class
            activeFacets.add(Constants.DOCUMENTOG);
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


        if (getAgent().isFacetActive(Constants.AGENT_ASESOR)) {
            Asesor agentInstance = (Asesor) getAgent().getAgentInstance(Constants.ASESOR);

            // Check the HV formula.
            /* 
            Solicitud.Agente = agent OR Solicitud.Agente.CodJefe = Agent.Usuario
            */
            try {
                if (this.getSolicitud().getAgente().equalsObject(agentInstance) || (this.getSolicitud().getAgente().getFuncionarioCodJefe()).equals(agentInstance.getFuncionarioUsuario())) {
                    returnValue = true;
                }
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            	returnValue = false;
            }
        }
        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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

    public String buildDSDocumentoGPIU() {
        try {
            return getSolicitud().getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + getPersona().getPersonadrvTipoNumDoc() + " " + (getPersona().getPersonaTieneEPSSanitas() != null ? getPersona().getPersonaTieneEPSSanitas().toString() : "") + " " + (getDocumentoGFechaSubida() != null ? getDocumentoGFechaSubida().toString() : "") + " " + (getDocumentoGTipo() != null ? getDocumentoGTipo().toString() : "") + " " + getDocumentoGNombre() + " " + (getDocumentoGEstado() != null ? getDocumentoGEstado().toString() : "") + " " + getDocumentoGDescripcion() + " " + (getPersona().getPersonaDatosBasicosMod() != null ? getPersona().getPersonaDatosBasicosMod().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSDocumentoGIIU() {
        try {
            return getSolicitud().getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + getDocumentoGDrvNumContrato() + " " + getPersona().getPersonadrvTipoNumDoc() + " " + getPersona().getPersonadrvNombreCompleto() + " " + (getDocumentoGEstado() != null ? getDocumentoGEstado().toString() : "") + " " + (getDocumentoGTipo() != null ? getDocumentoGTipo().toString() : "") + " " + getDocumentoGDescripcion() + " " + (getDocumentoGFechaSubida() != null ? getDocumentoGFechaSubida().toString() : "") + " " + getDocumentoGIdDocEnGestor() + " " + getDocumentoGResultadoSubida() + " " + getDocumentoGEmailEnvioDevuelto() + " " + (getDocumentoGNumDescargas() != null ? getDocumentoGNumDescargas().toString() : "");
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
            relatedInstance = buildDocumentoGRelatedInstance(relatedInstanceJsonOid);
        }
        if (DocumentoGConstants.ROLE_NAME_OBSESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDocumentoGRelatedInstance4ObsEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (DocumentoGConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDocumentoGRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (DocumentoGConstants.ROLE_NAME_PERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDocumentoGRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDocumentoGRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new DocumentoG(mapper.readValue(relatedInstanceJsonOid, DocumentoGOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DocumentoG.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDocumentoGRelatedInstance4ObsEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ObsEstado(mapper.readValue(relatedInstanceJsonOid, ObsEstadoOid.class)): ObsEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DocumentoG.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDocumentoGRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DocumentoG.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDocumentoGRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DocumentoG.class).error(e.getMessage());
            return null;
        }
    }
}
