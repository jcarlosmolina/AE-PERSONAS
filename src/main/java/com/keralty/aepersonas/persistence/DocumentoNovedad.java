package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DocumentoNovedadConstants;
import com.keralty.aepersonas.global.SolicitudNovedadConstants;
import com.keralty.aepersonas.global.UsuarioNovedadConstants;
import com.keralty.aepersonas.persistence.oid.DocumentoNovedadOid;
import com.keralty.aepersonas.persistence.oid.LogEstadoDocNovOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioNovedadOid;
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
 * Persistent representation of the <code>DocumentoNovedad</code> model class.
 * <p>
 * Model Class: <code>DocumentoNovedad</code><br>
 */
@Entity(name = DocumentoNovedadConstants.CLASS_NAME)
@Table(name = DocumentoNovedadConstants.TBL_NAME)
public class DocumentoNovedad extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DocumentoNovedad_Sequence")
    @SequenceGenerator(name="DocumentoNovedad_Sequence", sequenceName="DocumentoNovedad_Sequence", allocationSize=1)
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADIDDOCUMENTO )
    @JsonProperty(value="iddocumento")
    private Long documentoNovedadIdDocumento;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADTIPO )
    @JsonProperty(value="tipo")
    private Long documentoNovedadTipo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadTipo;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADFECHASUBIDA )
    @JsonProperty(value="fechasubida")
    private Timestamp documentoNovedadFechaSubida;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadFechaSubida;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String documentoNovedadDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadDescripcion;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADESTADO )
    @JsonProperty(value="estado")
    private Long documentoNovedadEstado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadEstado;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADPATHCOMPLETO )
    @JsonProperty(value="pathcompleto")
    private String documentoNovedadPathCompleto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadPathCompleto;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADEXTENSION )
    @JsonProperty(value="extension")
    private String documentoNovedadExtension;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadExtension;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADRESULTADOSUBIDA )
    @JsonProperty(value="resultadosubida")
    private String documentoNovedadResultadoSubida;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadResultadoSubida;

    @Transient
    @JsonIgnore
    public boolean documentoNovedadResultadoSubidaInit = false;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADIDDOCENGESTOR )
    @JsonProperty(value="iddocengestor")
    private String documentoNovedadIdDocEnGestor;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadIdDocEnGestor;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADNOMBRE )
    @JsonProperty(value="nombre")
    private String documentoNovedadNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadNombre;

    /** Class member attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADUSUARIOCREADOR )
    @JsonProperty(value="usuariocreador")
    private String documentoNovedadUsuarioCreador;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedadUsuarioCreador;

    /** Related Class. */
    @OneToMany(mappedBy = DocumentoNovedadConstants.ROLE_INVNAME_LOGESTADODOCNOV)
    @JsonIgnore
    private Collection <LogEstadoDocNov> logEstadoDocNov;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoDocNov;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DocumentoNovedadConstants.FLD_SOLICITUDNOVEDADID, referencedColumnName=SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADID)
    })
    @JsonIgnore
    private SolicitudNovedad solicitud;
    /** Related attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_SOLICITUDNOVEDADID, insertable = false, updatable = false)
    private Long solicitudNovedadId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitud;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DocumentoNovedadConstants.FLD_USUARIONOVEDADIDUSUARIONOVEDAD, referencedColumnName=UsuarioNovedadConstants.FLD_USUARIONOVEDADIDUSUARIONOVEDAD)
    })
    @JsonIgnore
    private UsuarioNovedad usuario;
    /** Related attribute. */
    @Column(name = DocumentoNovedadConstants.FLD_USUARIONOVEDADIDUSUARIONOVEDAD, insertable = false, updatable = false)
    private Long usuarioNovedadidUsuarioNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuario;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public DocumentoNovedad() {
        documentoNovedadIdDocumento = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>DocumentoNovedad</code>.
     * @param oid Object Identifier of the instance of <code>DocumentoNovedad</code> to be created.
     * @throws SystemException
     */
    public DocumentoNovedad(DocumentoNovedadOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            documentoNovedadIdDocumento = oid.getDocumentoNovedadIdDocumento();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>documentoNovedadIdDocumento</code> attribute<br>in class <code>DocumentoNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DocumentoNovedad</code>
     * @return The value of the <code>documentoNovedadIdDocumento</code> attribute<br>in class <code>DocumentoNovedad</code>.
     */
    public Long getDocumentoNovedadIdDocumento() {
        return documentoNovedadIdDocumento;
    }

    /**
     * Sets the value of the <code>documentoNovedadIdDocumento</code> attribute<br>in class <code>DocumentoNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>DocumentoNovedad</code>
     * @param documentoNovedadIdDocumento The new value of the <code>documentoNovedadIdDocumento</code> attribute<br>in class <code>DocumentoNovedad</code>.
     */
    public void setDocumentoNovedadIdDocumento(Long documentoNovedadIdDocumento) {
        this.documentoNovedadIdDocumento = documentoNovedadIdDocumento;
    }

   /**
    * Returns the value of the <code>documentoNovedadTipo</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadTipo</code>. Constant Nat<br>
    * Comments: 1.- Escaneo documento de identificación 2.- Documentos de solicitud (Declaratoria de EPS, Certificado de antigüedad...)
En el caso de novedad solo será documento de identificación. Lo mantenemos como en solicitud por coherencia<br>
    * @return The value of the <code>documentoNovedadTipo</code> attribute.
    */

    public Long getDocumentoNovedadTipo()  {
    	Long value;
        value =  documentoNovedadTipo;
        return value;
    }

   /**
    * Sets the value of the <code>documentoNovedadTipo</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadTipo</code>. Constant Nat<br>
    * Comments: 1.- Escaneo documento de identificación 2.- Documentos de solicitud (Declaratoria de EPS, Certificado de antigüedad...)
En el caso de novedad solo será documento de identificación. Lo mantenemos como en solicitud por coherencia<br>
    * @param documentoNovedadTipo The new value of the <code>documentoNovedadTipo</code> attribute.
    */
    public void setDocumentoNovedadTipo (Long documentoNovedadTipo) {
        modifiedDocumentoNovedadTipo = true;
        this.documentoNovedadTipo = documentoNovedadTipo;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadTipo</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadTipo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadTipo() {
        return modifiedDocumentoNovedadTipo;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadTipo</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadTipo</code>.
    */
    public void setModifiedDocumentoNovedadTipo(boolean modified) {
        this.modifiedDocumentoNovedadTipo = modified;
    }

   /**
    * Returns the value of the <code>documentoNovedadFechaSubida</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadFechaSubida</code>. Variable DateTime<br>
    * Comments: <br>
    * @return The value of the <code>documentoNovedadFechaSubida</code> attribute.
    */

    public Timestamp getDocumentoNovedadFechaSubida()  {
    	Timestamp value;
        value =  documentoNovedadFechaSubida;
        return value;
    }

   /**
    * Sets the value of the <code>documentoNovedadFechaSubida</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadFechaSubida</code>. Variable DateTime<br>
    * Comments: <br>
    * @param documentoNovedadFechaSubida The new value of the <code>documentoNovedadFechaSubida</code> attribute.
    */
    public void setDocumentoNovedadFechaSubida (Timestamp documentoNovedadFechaSubida) {
        modifiedDocumentoNovedadFechaSubida = true;
        this.documentoNovedadFechaSubida = documentoNovedadFechaSubida;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadFechaSubida</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadFechaSubida</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadFechaSubida() {
        return modifiedDocumentoNovedadFechaSubida;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadFechaSubida</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadFechaSubida</code>.
    */
    public void setModifiedDocumentoNovedadFechaSubida(boolean modified) {
        this.modifiedDocumentoNovedadFechaSubida = modified;
    }

   /**
    * Returns the value of the <code>documentoNovedadDescripcion</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>documentoNovedadDescripcion</code> attribute.
    */

    public String getDocumentoNovedadDescripcion()  {
    	String value;
        value =  documentoNovedadDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoNovedadDescripcion</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param documentoNovedadDescripcion The new value of the <code>documentoNovedadDescripcion</code> attribute.
    */
    public void setDocumentoNovedadDescripcion (String documentoNovedadDescripcion) {
        modifiedDocumentoNovedadDescripcion = true;
        this.documentoNovedadDescripcion = documentoNovedadDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadDescripcion() {
        return modifiedDocumentoNovedadDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadDescripcion</code>.
    */
    public void setModifiedDocumentoNovedadDescripcion(boolean modified) {
        this.modifiedDocumentoNovedadDescripcion = modified;
    }

   /**
    * Returns the value of the <code>documentoNovedadEstado</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadEstado</code>. Variable Nat<br>
    * Comments: <br>
    * @return The value of the <code>documentoNovedadEstado</code> attribute.
    */

    public Long getDocumentoNovedadEstado()  {
    	Long value;
        value =  documentoNovedadEstado;
        return value;
    }

   /**
    * Sets the value of the <code>documentoNovedadEstado</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadEstado</code>. Variable Nat<br>
    * Comments: <br>
    * @param documentoNovedadEstado The new value of the <code>documentoNovedadEstado</code> attribute.
    */
    public void setDocumentoNovedadEstado (Long documentoNovedadEstado) {
        modifiedDocumentoNovedadEstado = true;
        this.documentoNovedadEstado = documentoNovedadEstado;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadEstado</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadEstado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadEstado() {
        return modifiedDocumentoNovedadEstado;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadEstado</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadEstado</code>.
    */
    public void setModifiedDocumentoNovedadEstado(boolean modified) {
        this.modifiedDocumentoNovedadEstado = modified;
    }

   /**
    * Returns the value of the <code>documentoNovedadPathCompleto</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadPathCompleto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>documentoNovedadPathCompleto</code> attribute.
    */

    public String getDocumentoNovedadPathCompleto()  {
    	String value;
        value =  documentoNovedadPathCompleto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoNovedadPathCompleto</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadPathCompleto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @param documentoNovedadPathCompleto The new value of the <code>documentoNovedadPathCompleto</code> attribute.
    */
    public void setDocumentoNovedadPathCompleto (String documentoNovedadPathCompleto) {
        modifiedDocumentoNovedadPathCompleto = true;
        this.documentoNovedadPathCompleto = documentoNovedadPathCompleto;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadPathCompleto</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadPathCompleto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadPathCompleto() {
        return modifiedDocumentoNovedadPathCompleto;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadPathCompleto</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadPathCompleto</code>.
    */
    public void setModifiedDocumentoNovedadPathCompleto(boolean modified) {
        this.modifiedDocumentoNovedadPathCompleto = modified;
    }

   /**
    * Returns the value of the <code>documentoNovedadExtension</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadExtension</code>. Variable String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>documentoNovedadExtension</code> attribute.
    */

    public String getDocumentoNovedadExtension()  {
    	String value;
        value =  documentoNovedadExtension;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoNovedadExtension</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadExtension</code>. Variable String Size=15<br>
    * Comments: <br>
    * @param documentoNovedadExtension The new value of the <code>documentoNovedadExtension</code> attribute.
    */
    public void setDocumentoNovedadExtension (String documentoNovedadExtension) {
        modifiedDocumentoNovedadExtension = true;
        this.documentoNovedadExtension = documentoNovedadExtension;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadExtension</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadExtension</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadExtension() {
        return modifiedDocumentoNovedadExtension;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadExtension</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadExtension</code>.
    */
    public void setModifiedDocumentoNovedadExtension(boolean modified) {
        this.modifiedDocumentoNovedadExtension = modified;
    }

   /**
    * Returns the value of the <code>documentoNovedadResultadoSubida</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadResultadoSubida</code>. Variable Text<br>
    * Comments: El resultado de subir el documento al gestor documental<br>
    * @return The value of the <code>documentoNovedadResultadoSubida</code> attribute.
    */

    public String getDocumentoNovedadResultadoSubida()  {
    	String value;
        value =  documentoNovedadResultadoSubida;
        return value;
    }

   /**
    * Sets the value of the <code>documentoNovedadResultadoSubida</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadResultadoSubida</code>. Variable Text<br>
    * Comments: El resultado de subir el documento al gestor documental<br>
    * @param documentoNovedadResultadoSubida The new value of the <code>documentoNovedadResultadoSubida</code> attribute.
    */
    public void setDocumentoNovedadResultadoSubida (String documentoNovedadResultadoSubida) {
        this.documentoNovedadResultadoSubidaInit = true;
        modifiedDocumentoNovedadResultadoSubida = true;
        this.documentoNovedadResultadoSubida = documentoNovedadResultadoSubida;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadResultadoSubida</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadResultadoSubida</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadResultadoSubida() {
        return modifiedDocumentoNovedadResultadoSubida;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadResultadoSubida</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadResultadoSubida</code>.
    */
    public void setModifiedDocumentoNovedadResultadoSubida(boolean modified) {
        this.modifiedDocumentoNovedadResultadoSubida = modified;
    }

   /**
    * Returns the value of the <code>documentoNovedadIdDocEnGestor</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadIdDocEnGestor</code>. Variable String Size=255<br>
    * Comments: Se tiene que hacer cambios manuales en las evaluaciones de subir al gestor para asignarle valor a este atributo, ya que la función de subir al gestor devuelve una estructura.<br>
    * @return The value of the <code>documentoNovedadIdDocEnGestor</code> attribute.
    */

    public String getDocumentoNovedadIdDocEnGestor()  {
    	String value;
        value =  documentoNovedadIdDocEnGestor;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoNovedadIdDocEnGestor</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadIdDocEnGestor</code>. Variable String Size=255<br>
    * Comments: Se tiene que hacer cambios manuales en las evaluaciones de subir al gestor para asignarle valor a este atributo, ya que la función de subir al gestor devuelve una estructura.<br>
    * @param documentoNovedadIdDocEnGestor The new value of the <code>documentoNovedadIdDocEnGestor</code> attribute.
    */
    public void setDocumentoNovedadIdDocEnGestor (String documentoNovedadIdDocEnGestor) {
        modifiedDocumentoNovedadIdDocEnGestor = true;
        this.documentoNovedadIdDocEnGestor = documentoNovedadIdDocEnGestor;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadIdDocEnGestor</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadIdDocEnGestor</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadIdDocEnGestor() {
        return modifiedDocumentoNovedadIdDocEnGestor;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadIdDocEnGestor</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadIdDocEnGestor</code>.
    */
    public void setModifiedDocumentoNovedadIdDocEnGestor(boolean modified) {
        this.modifiedDocumentoNovedadIdDocEnGestor = modified;
    }

   /**
    * Returns the value of the <code>documentoNovedadNombre</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadNombre</code>. Variable String Size=255<br>
    * Comments: Nombre del documento<br>
    * @return The value of the <code>documentoNovedadNombre</code> attribute.
    */

    public String getDocumentoNovedadNombre()  {
    	String value;
        value =  documentoNovedadNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoNovedadNombre</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadNombre</code>. Variable String Size=255<br>
    * Comments: Nombre del documento<br>
    * @param documentoNovedadNombre The new value of the <code>documentoNovedadNombre</code> attribute.
    */
    public void setDocumentoNovedadNombre (String documentoNovedadNombre) {
        modifiedDocumentoNovedadNombre = true;
        this.documentoNovedadNombre = documentoNovedadNombre;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadNombre() {
        return modifiedDocumentoNovedadNombre;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadNombre</code>.
    */
    public void setModifiedDocumentoNovedadNombre(boolean modified) {
        this.modifiedDocumentoNovedadNombre = modified;
    }

   /**
    * Returns the value of the <code>documentoNovedadUsuarioCreador</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadUsuarioCreador</code>. Constant String Size=50<br>
    * Comments: GdC-36. Req: 8. Los asesores marcados como NO solamente pueden visualizar la documentación que se haya cargado con su propio LOGIN<br>
    * @return The value of the <code>documentoNovedadUsuarioCreador</code> attribute.
    */

    public String getDocumentoNovedadUsuarioCreador()  {
    	String value;
        value =  documentoNovedadUsuarioCreador;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>documentoNovedadUsuarioCreador</code> attribute.<br>
    * Model Attribute: <code>documentoNovedadUsuarioCreador</code>. Constant String Size=50<br>
    * Comments: GdC-36. Req: 8. Los asesores marcados como NO solamente pueden visualizar la documentación que se haya cargado con su propio LOGIN<br>
    * @param documentoNovedadUsuarioCreador The new value of the <code>documentoNovedadUsuarioCreador</code> attribute.
    */
    public void setDocumentoNovedadUsuarioCreador (String documentoNovedadUsuarioCreador) {
        modifiedDocumentoNovedadUsuarioCreador = true;
        this.documentoNovedadUsuarioCreador = documentoNovedadUsuarioCreador;
    }

   /**
    * Returns the value of the <code>modifiedDocumentoNovedadUsuarioCreador</code> class property.<br>
    *
    * @return The value of the <code>modifiedDocumentoNovedadUsuarioCreador</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedDocumentoNovedadUsuarioCreador() {
        return modifiedDocumentoNovedadUsuarioCreador;
    }

   /**
    * Sets the value of the <code>modifiedDocumentoNovedadUsuarioCreador</code> class property.<br>
    * @param modified The new value of the <code>modifiedDocumentoNovedadUsuarioCreador</code>.
    */
    public void setModifiedDocumentoNovedadUsuarioCreador(boolean modified) {
        this.modifiedDocumentoNovedadUsuarioCreador = modified;
    }

    /**
     * Returns the instance of <code>LogEstadoDocNov</code> related through the <code>LogEstadoDocNov</code> role.
     * Model Relationship:
     * <code>[LogEstadoDocNov] LogEstadoDocNov 0:M  ------ 1:1  DocumentoNovedad [DocumentoNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogEstadoDocNov</code> related through the <code>LogEstadoDocNov</code> role.
     */
    @JsonIgnore
    public Collection <LogEstadoDocNov> getLogEstadoDocNov() {
        return logEstadoDocNov;
    }

    /**
     * Adds an instance of <code>LogEstadoDocNov</code> related through the <code>LogEstadoDocNov</code> role.
     * @param logEstadoDocNov The instance to add to the <code>LogEstadoDocNov</code> role.
     */
    public void add2LogEstadoDocNov(LogEstadoDocNov logEstadoDocNov) {
        this.logEstadoDocNov.add(logEstadoDocNov);
    }
    /**
     * Removes an instance of <code>LogEstadoDocNov</code> related through the <code>LogEstadoDocNov</code> role.
     * @param logEstadoDocNov The instance to be removed
     */
    public void removeFromLogEstadoDocNov(LogEstadoDocNov logEstadoDocNov) {
    	this.logEstadoDocNov.remove(logEstadoDocNov);
    }
    /**
     * Sets instances of <code>LogEstadoDocNov</code> related through the <code>LogEstadoDocNov</code> role.
     * @param logEstadoDocNov The new value for the <code>LogEstadoDocNov</code> role.
     */
    public void setLogEstadoDocNov(Collection < LogEstadoDocNov > logEstadoDocNov) {
        this.logEstadoDocNov = logEstadoDocNov;
    }

   /**
    * This method gets the attribute value <code>modifiedLogEstadoDocNov</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogEstadoDocNov</code> has been modified.
    */
    public boolean isModifiedLogEstadoDocNov(){
        return modifiedLogEstadoDocNov;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>Solicitud</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] Solicitud 1:1  ------ 0:M  Documentos [DocumentoNovedad]</code>
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
     * Returns the instance of <code>UsuarioNovedad</code> related through the <code>Usuario</code> role.
     * Model Relationship:
     * <code>[UsuarioNovedad] Usuario 0:1  ------ 0:M  Documentos [DocumentoNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>UsuarioNovedad</code> related through the <code>Usuario</code> role.
     */
    @JsonIgnore
    public UsuarioNovedad getUsuario() {
        return usuario;
    }

    /**
     * Adds an instance of <code>UsuarioNovedad</code> related through the <code>Usuario</code> role.
     * @param usuario The instance to add to the <code>Usuario</code> role.
     */
    public void add2Usuario(UsuarioNovedad usuario) {
        if (usuario == null || usuario.isNull()) {
            this.modifiedUsuario = true;
            this.usuarioNovedadidUsuarioNovedad = null;
        } else {
            this.usuarioNovedadidUsuarioNovedad = usuario.getUsuarioNovedadidUsuarioNovedad();
        }
        this.usuario = (usuario == null  || usuario.isNull() ? null : usuario);
    }

   /**
    * This method gets the attribute value <code>modifiedUsuario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuario</code> has been modified.
    */
    public boolean isModifiedUsuario(){
        return modifiedUsuario;
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
        documentoNovedadTipo = Long.valueOf(0);
        documentoNovedadFechaSubida = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        documentoNovedadDescripcion = null;
        documentoNovedadEstado = Long.valueOf(0);
        documentoNovedadPathCompleto = null;
        documentoNovedadExtension = null;
        documentoNovedadResultadoSubida = null;
        documentoNovedadIdDocEnGestor = null;
        documentoNovedadNombre = null;
        documentoNovedadUsuarioCreador = "";
        logEstadoDocNov = null;
        solicitud = null;
        usuario = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return DocumentoNovedad.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return DocumentoNovedadConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedDocumentoNovedadTipo = false;
    	values.put("documentoNovedadTipo", getDocumentoNovedadTipo());
    	modifiedDocumentoNovedadFechaSubida = false;
    	values.put("documentoNovedadFechaSubida", getDocumentoNovedadFechaSubida());
    	modifiedDocumentoNovedadDescripcion = false;
    	values.put("documentoNovedadDescripcion", getDocumentoNovedadDescripcion());
    	modifiedDocumentoNovedadEstado = false;
    	values.put("documentoNovedadEstado", getDocumentoNovedadEstado());
    	modifiedDocumentoNovedadPathCompleto = false;
    	values.put("documentoNovedadPathCompleto", getDocumentoNovedadPathCompleto());
    	modifiedDocumentoNovedadExtension = false;
    	values.put("documentoNovedadExtension", getDocumentoNovedadExtension());
    	if (modifiedDocumentoNovedadResultadoSubida) {
    		values.put("documentoNovedadResultadoSubida", documentoNovedadResultadoSubida);
    		modifiedDocumentoNovedadResultadoSubida = false;
    	}
    	modifiedDocumentoNovedadIdDocEnGestor = false;
    	values.put("documentoNovedadIdDocEnGestor", getDocumentoNovedadIdDocEnGestor());
    	modifiedDocumentoNovedadNombre = false;
    	values.put("documentoNovedadNombre", getDocumentoNovedadNombre());
    	modifiedDocumentoNovedadUsuarioCreador = false;
    	values.put("documentoNovedadUsuarioCreador", getDocumentoNovedadUsuarioCreador());
    	modifiedLogEstadoDocNov = false;
    	modifiedSolicitud = false;
    	modifiedUsuario = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>DocumentoNovedadOid</code> object that identifies this instance of <code>DocumentoNovedad</code>.
     * @return <code>DocumentoNovedadOid </code> object that identifies this instance of <code>DocumentoNovedad</code>
     */
	@Override
    public DocumentoNovedadOid getOid() {
        return new DocumentoNovedadOid(getDocumentoNovedadIdDocumento());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(DocumentoNovedadConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(DocumentoNovedadConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.DOCUMENTONOVEDAD)) {
            // Add this class
            activeFacets.add(Constants.DOCUMENTONOVEDAD);
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
            relatedInstance = buildDocumentoNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (DocumentoNovedadConstants.ROLE_NAME_LOGESTADODOCNOV.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDocumentoNovedadRelatedInstance4LogEstadoDocNov(relatedInstanceJsonOid, remainingPath);
        }
        if (DocumentoNovedadConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDocumentoNovedadRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (DocumentoNovedadConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDocumentoNovedadRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDocumentoNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new DocumentoNovedad(mapper.readValue(relatedInstanceJsonOid, DocumentoNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DocumentoNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDocumentoNovedadRelatedInstance4LogEstadoDocNov(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogEstadoDocNov(mapper.readValue(relatedInstanceJsonOid, LogEstadoDocNovOid.class)): LogEstadoDocNov.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DocumentoNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDocumentoNovedadRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DocumentoNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDocumentoNovedadRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DocumentoNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
