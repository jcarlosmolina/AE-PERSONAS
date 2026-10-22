package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.InstitucionMatNeoConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.TarifaConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.TarifaOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.repository.AnexoMatJpaRepository;
import com.keralty.aepersonas.repository.AnexoNeoJpaRepository;
import com.keralty.aepersonas.repository.MunicipioJpaRepository;
import com.keralty.aepersonas.repository.TipoIdentificacionJpaRepository;
import com.keralty.aepersonas.service.TarifaService;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.microprofile.rest.client.inject.RestClient;
/**
 * Persistent representation of the <code>InstitucionMatNeo</code> model class.
 * <p>
 * Model Class: <code>InstitucionMatNeo</code><br>
 */
@Entity(name = InstitucionMatNeoConstants.CLASS_NAME)
@Table(name = InstitucionMatNeoConstants.TBL_NAME)
public class InstitucionMatNeo extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient AnexoMatJpaRepository anexoMatRepository;

    @JsonIgnore
    private transient AnexoNeoJpaRepository anexoNeoRepository;

    @JsonIgnore
    private transient TipoIdentificacionJpaRepository tipoIdentificacionRepository;

    @RestClient
    private transient TarifaService tarifaService;

    @JsonIgnore
    private transient MunicipioJpaRepository municipioRepository;

    /** Class identification function. */
    @Id
    @Column(name = InstitucionMatNeoConstants.FLD_INSTITUCIONMATNEOCODIGO )
    @JsonProperty(value="codigo")
    private String institucionMatNeoCodigo;

    /** Class member attribute. */
    @Column(name = InstitucionMatNeoConstants.FLD_INSTITUCIONMATNEONUMIDENTIFICACION )
    @JsonProperty(value="numidentificacion")
    private String institucionMatNeoNumIdentificacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedInstitucionMatNeoNumIdentificacion;

    /** Class member attribute. */
    @Column(name = InstitucionMatNeoConstants.FLD_INSTITUCIONMATNEONOMBRE )
    @JsonProperty(value="nombre")
    private String institucionMatNeoNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedInstitucionMatNeoNombre;

    /** Class member attribute. */
    @Column(name = InstitucionMatNeoConstants.FLD_INSTITUCIONMATNEOPARAMATERNIDAD )
    @JsonProperty(value="paramaternidad")
    private Boolean institucionMatNeoParaMaternidad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedInstitucionMatNeoParaMaternidad;

    /** Class member attribute. */
    @Column(name = InstitucionMatNeoConstants.FLD_INSTITUCIONMATNEOPARANEONATAL )
    @JsonProperty(value="paraneonatal")
    private Boolean institucionMatNeoParaNeonatal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedInstitucionMatNeoParaNeonatal;

    /** Class member attribute. */
    @Column(name = InstitucionMatNeoConstants.FLD_INSTITUCIONMATNEOFECHAINICIAL )
    @JsonProperty(value="fechainicial")
    private Date institucionMatNeoFechaInicial;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedInstitucionMatNeoFechaInicial;

    /** Class member attribute. */
    @Column(name = InstitucionMatNeoConstants.FLD_INSTITUCIONMATNEOFECHAFINAL )
    @JsonProperty(value="fechafinal")
    private Date institucionMatNeoFechaFinal;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedInstitucionMatNeoFechaFinal;

    /** Related Class. */
    @OneToMany(mappedBy = InstitucionMatNeoConstants.ROLE_INVNAME_ANEXOMAT)
    @JsonIgnore
    private Collection <AnexoMat> anexoMat;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoMat;

    /** Related Class. */
    @OneToMany(mappedBy = InstitucionMatNeoConstants.ROLE_INVNAME_ANEXONEO)
    @JsonIgnore
    private Collection <AnexoNeo> anexoNeo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoNeo;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=InstitucionMatNeoConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacion;
    /** Related attribute. */
    @Column(name = InstitucionMatNeoConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionTipoIdentificacionCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=InstitucionMatNeoConstants.FLD_TARIFAID, referencedColumnName=TarifaConstants.FLD_TARIFAID)
    })
    @JsonIgnore
    private Tarifa tarifa;
    /** Related attribute. */
    @Column(name = InstitucionMatNeoConstants.FLD_TARIFAID, insertable = false, updatable = false)
    private Long tarifaId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTarifa;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=InstitucionMatNeoConstants.FLD_MUNICIPIOMUNICIPIOCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipio;
    /** Related attribute. */
    @Column(name = InstitucionMatNeoConstants.FLD_MUNICIPIOMUNICIPIOCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipio;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public InstitucionMatNeo() {
        institucionMatNeoCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>InstitucionMatNeo</code>.
     * @param oid Object Identifier of the instance of <code>InstitucionMatNeo</code> to be created.
     * @throws SystemException
     */
    public InstitucionMatNeo(InstitucionMatNeoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            institucionMatNeoCodigo = oid.getInstitucionMatNeoCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>institucionMatNeoCodigo</code> attribute<br>in class <code>InstitucionMatNeo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>InstitucionMatNeo</code>
     * @return The value of the <code>institucionMatNeoCodigo</code> attribute<br>in class <code>InstitucionMatNeo</code>.
     */
    public String getInstitucionMatNeoCodigo() {
        return (institucionMatNeoCodigo == null ? institucionMatNeoCodigo : institucionMatNeoCodigo.trim());
    }

    /**
     * Sets the value of the <code>institucionMatNeoCodigo</code> attribute<br>in class <code>InstitucionMatNeo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>InstitucionMatNeo</code>
     * @param institucionMatNeoCodigo The new value of the <code>institucionMatNeoCodigo</code> attribute<br>in class <code>InstitucionMatNeo</code>.
     */
    public void setInstitucionMatNeoCodigo(String institucionMatNeoCodigo) {
        this.institucionMatNeoCodigo = institucionMatNeoCodigo;
    }

   /**
    * Returns the value of the <code>institucionMatNeoNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>institucionMatNeoNumIdentificacion</code> attribute.
    */

    public String getInstitucionMatNeoNumIdentificacion()  {
    	String value;
        value =  institucionMatNeoNumIdentificacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>institucionMatNeoNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @param institucionMatNeoNumIdentificacion The new value of the <code>institucionMatNeoNumIdentificacion</code> attribute.
    */
    public void setInstitucionMatNeoNumIdentificacion (String institucionMatNeoNumIdentificacion) {
        modifiedInstitucionMatNeoNumIdentificacion = true;
        this.institucionMatNeoNumIdentificacion = institucionMatNeoNumIdentificacion;
    }

   /**
    * Returns the value of the <code>modifiedInstitucionMatNeoNumIdentificacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedInstitucionMatNeoNumIdentificacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedInstitucionMatNeoNumIdentificacion() {
        return modifiedInstitucionMatNeoNumIdentificacion;
    }

   /**
    * Sets the value of the <code>modifiedInstitucionMatNeoNumIdentificacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedInstitucionMatNeoNumIdentificacion</code>.
    */
    public void setModifiedInstitucionMatNeoNumIdentificacion(boolean modified) {
        this.modifiedInstitucionMatNeoNumIdentificacion = modified;
    }

   /**
    * Returns the value of the <code>institucionMatNeoNombre</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoNombre</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>institucionMatNeoNombre</code> attribute.
    */

    public String getInstitucionMatNeoNombre()  {
    	String value;
        value =  institucionMatNeoNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>institucionMatNeoNombre</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoNombre</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param institucionMatNeoNombre The new value of the <code>institucionMatNeoNombre</code> attribute.
    */
    public void setInstitucionMatNeoNombre (String institucionMatNeoNombre) {
        modifiedInstitucionMatNeoNombre = true;
        this.institucionMatNeoNombre = institucionMatNeoNombre;
    }

   /**
    * Returns the value of the <code>modifiedInstitucionMatNeoNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedInstitucionMatNeoNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedInstitucionMatNeoNombre() {
        return modifiedInstitucionMatNeoNombre;
    }

   /**
    * Sets the value of the <code>modifiedInstitucionMatNeoNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedInstitucionMatNeoNombre</code>.
    */
    public void setModifiedInstitucionMatNeoNombre(boolean modified) {
        this.modifiedInstitucionMatNeoNombre = modified;
    }

   /**
    * Returns the value of the <code>institucionMatNeoParaMaternidad</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoParaMaternidad</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>institucionMatNeoParaMaternidad</code> attribute.
    */

    public Boolean getInstitucionMatNeoParaMaternidad()  {
    	Boolean value;
        value =  institucionMatNeoParaMaternidad;
        return value;
    }

   /**
    * Sets the value of the <code>institucionMatNeoParaMaternidad</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoParaMaternidad</code>. Variable Bool<br>
    * Comments: <br>
    * @param institucionMatNeoParaMaternidad The new value of the <code>institucionMatNeoParaMaternidad</code> attribute.
    */
    public void setInstitucionMatNeoParaMaternidad (Boolean institucionMatNeoParaMaternidad) {
        modifiedInstitucionMatNeoParaMaternidad = true;
        this.institucionMatNeoParaMaternidad = institucionMatNeoParaMaternidad;
    }

   /**
    * Returns the value of the <code>modifiedInstitucionMatNeoParaMaternidad</code> class property.<br>
    *
    * @return The value of the <code>modifiedInstitucionMatNeoParaMaternidad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedInstitucionMatNeoParaMaternidad() {
        return modifiedInstitucionMatNeoParaMaternidad;
    }

   /**
    * Sets the value of the <code>modifiedInstitucionMatNeoParaMaternidad</code> class property.<br>
    * @param modified The new value of the <code>modifiedInstitucionMatNeoParaMaternidad</code>.
    */
    public void setModifiedInstitucionMatNeoParaMaternidad(boolean modified) {
        this.modifiedInstitucionMatNeoParaMaternidad = modified;
    }

   /**
    * Returns the value of the <code>institucionMatNeoParaNeonatal</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoParaNeonatal</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>institucionMatNeoParaNeonatal</code> attribute.
    */

    public Boolean getInstitucionMatNeoParaNeonatal()  {
    	Boolean value;
        value =  institucionMatNeoParaNeonatal;
        return value;
    }

   /**
    * Sets the value of the <code>institucionMatNeoParaNeonatal</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoParaNeonatal</code>. Variable Bool<br>
    * Comments: <br>
    * @param institucionMatNeoParaNeonatal The new value of the <code>institucionMatNeoParaNeonatal</code> attribute.
    */
    public void setInstitucionMatNeoParaNeonatal (Boolean institucionMatNeoParaNeonatal) {
        modifiedInstitucionMatNeoParaNeonatal = true;
        this.institucionMatNeoParaNeonatal = institucionMatNeoParaNeonatal;
    }

   /**
    * Returns the value of the <code>modifiedInstitucionMatNeoParaNeonatal</code> class property.<br>
    *
    * @return The value of the <code>modifiedInstitucionMatNeoParaNeonatal</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedInstitucionMatNeoParaNeonatal() {
        return modifiedInstitucionMatNeoParaNeonatal;
    }

   /**
    * Sets the value of the <code>modifiedInstitucionMatNeoParaNeonatal</code> class property.<br>
    * @param modified The new value of the <code>modifiedInstitucionMatNeoParaNeonatal</code>.
    */
    public void setModifiedInstitucionMatNeoParaNeonatal(boolean modified) {
        this.modifiedInstitucionMatNeoParaNeonatal = modified;
    }

   /**
    * Returns the value of the <code>institucionMatNeoFechaInicial</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoFechaInicial</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>institucionMatNeoFechaInicial</code> attribute.
    */

    public Date getInstitucionMatNeoFechaInicial()  {
    	Date value;
        value =  institucionMatNeoFechaInicial;
        return value;
    }

   /**
    * Sets the value of the <code>institucionMatNeoFechaInicial</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoFechaInicial</code>. Variable Date<br>
    * Comments: <br>
    * @param institucionMatNeoFechaInicial The new value of the <code>institucionMatNeoFechaInicial</code> attribute.
    */
    public void setInstitucionMatNeoFechaInicial (Date institucionMatNeoFechaInicial) {
        modifiedInstitucionMatNeoFechaInicial = true;
        this.institucionMatNeoFechaInicial = institucionMatNeoFechaInicial;
    }

   /**
    * Returns the value of the <code>modifiedInstitucionMatNeoFechaInicial</code> class property.<br>
    *
    * @return The value of the <code>modifiedInstitucionMatNeoFechaInicial</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedInstitucionMatNeoFechaInicial() {
        return modifiedInstitucionMatNeoFechaInicial;
    }

   /**
    * Sets the value of the <code>modifiedInstitucionMatNeoFechaInicial</code> class property.<br>
    * @param modified The new value of the <code>modifiedInstitucionMatNeoFechaInicial</code>.
    */
    public void setModifiedInstitucionMatNeoFechaInicial(boolean modified) {
        this.modifiedInstitucionMatNeoFechaInicial = modified;
    }

   /**
    * Returns the value of the <code>institucionMatNeoFechaFinal</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoFechaFinal</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>institucionMatNeoFechaFinal</code> attribute.
    */

    public Date getInstitucionMatNeoFechaFinal()  {
    	Date value;
        value =  institucionMatNeoFechaFinal;
        return value;
    }

   /**
    * Sets the value of the <code>institucionMatNeoFechaFinal</code> attribute.<br>
    * Model Attribute: <code>institucionMatNeoFechaFinal</code>. Variable Date<br>
    * Comments: <br>
    * @param institucionMatNeoFechaFinal The new value of the <code>institucionMatNeoFechaFinal</code> attribute.
    */
    public void setInstitucionMatNeoFechaFinal (Date institucionMatNeoFechaFinal) {
        modifiedInstitucionMatNeoFechaFinal = true;
        this.institucionMatNeoFechaFinal = institucionMatNeoFechaFinal;
    }

   /**
    * Returns the value of the <code>modifiedInstitucionMatNeoFechaFinal</code> class property.<br>
    *
    * @return The value of the <code>modifiedInstitucionMatNeoFechaFinal</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedInstitucionMatNeoFechaFinal() {
        return modifiedInstitucionMatNeoFechaFinal;
    }

   /**
    * Sets the value of the <code>modifiedInstitucionMatNeoFechaFinal</code> class property.<br>
    * @param modified The new value of the <code>modifiedInstitucionMatNeoFechaFinal</code>.
    */
    public void setModifiedInstitucionMatNeoFechaFinal(boolean modified) {
        this.modifiedInstitucionMatNeoFechaFinal = modified;
    }

    /**
     * Returns the instance of <code>AnexoMat</code> related through the <code>AnexoMat</code> role.
     * Model Relationship:
     * <code>[AnexoMat] AnexoMat 0:M  ------ 1:1  InstitucionMaternal [InstitucionMatNeo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>AnexoMat</code> related through the <code>AnexoMat</code> role.
     */
    @JsonIgnore
    public Collection <AnexoMat> getAnexoMat() {
        return getAnexoMatRepository().findByInstitucionMaternal(this);
    }

    /**
     * Adds an instance of <code>AnexoMat</code> related through the <code>AnexoMat</code> role.
     * @param anexoMat The instance to add to the <code>AnexoMat</code> role.
     */
    public void add2AnexoMat(AnexoMat anexoMat) {
        this.anexoMat.add(anexoMat);
    }
    /**
     * Removes an instance of <code>AnexoMat</code> related through the <code>AnexoMat</code> role.
     * @param anexoMat The instance to be removed
     */
    public void removeFromAnexoMat(AnexoMat anexoMat) {
    	this.anexoMat.remove(anexoMat);
    }
    /**
     * Sets instances of <code>AnexoMat</code> related through the <code>AnexoMat</code> role.
     * @param anexoMat The new value for the <code>AnexoMat</code> role.
     */
    public void setAnexoMat(Collection < AnexoMat > anexoMat) {
        this.anexoMat = anexoMat;
    }

   /**
    * This method gets the attribute value <code>modifiedAnexoMat</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAnexoMat</code> has been modified.
    */
    public boolean isModifiedAnexoMat(){
        return modifiedAnexoMat;
    }

    /**
     * Returns the instance of <code>AnexoNeo</code> related through the <code>AnexoNeo</code> role.
     * Model Relationship:
     * <code>[AnexoNeo] AnexoNeo 0:M  ------ 1:1  InstitucionNeonatal [InstitucionMatNeo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>AnexoNeo</code> related through the <code>AnexoNeo</code> role.
     */
    @JsonIgnore
    public Collection <AnexoNeo> getAnexoNeo() {
        return getAnexoNeoRepository().findByInstitucionNeonatal(this);
    }

    /**
     * Adds an instance of <code>AnexoNeo</code> related through the <code>AnexoNeo</code> role.
     * @param anexoNeo The instance to add to the <code>AnexoNeo</code> role.
     */
    public void add2AnexoNeo(AnexoNeo anexoNeo) {
        this.anexoNeo.add(anexoNeo);
    }
    /**
     * Removes an instance of <code>AnexoNeo</code> related through the <code>AnexoNeo</code> role.
     * @param anexoNeo The instance to be removed
     */
    public void removeFromAnexoNeo(AnexoNeo anexoNeo) {
    	this.anexoNeo.remove(anexoNeo);
    }
    /**
     * Sets instances of <code>AnexoNeo</code> related through the <code>AnexoNeo</code> role.
     * @param anexoNeo The new value for the <code>AnexoNeo</code> role.
     */
    public void setAnexoNeo(Collection < AnexoNeo > anexoNeo) {
        this.anexoNeo = anexoNeo;
    }

   /**
    * This method gets the attribute value <code>modifiedAnexoNeo</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAnexoNeo</code> has been modified.
    */
    public boolean isModifiedAnexoNeo(){
        return modifiedAnexoNeo;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacion 1:1  ------ 0:M  InstitucionMatNeo [InstitucionMatNeo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        try {
            if (tipoIdentificacion != null && tipoIdentificacion.isNull()) {
                tipoIdentificacion = null;
            }
        } catch (Exception ex) {
            tipoIdentificacion = null;
        }
        if (tipoIdentificacion == null) {
            if (tipoIdentificacionTipoIdentificacionCodigo != null) {
                tipoIdentificacion = getTipoIdentificacionRepository().findById(tipoIdentificacionTipoIdentificacionCodigo).orElse(null);
            } else {
                tipoIdentificacion = null;
            }
        }
        return (tipoIdentificacion == null ? new TipoIdentificacion(null) : tipoIdentificacion);
    }

    /**
     * Adds an instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * @param tipoIdentificacion The instance to add to the <code>TipoIdentificacion</code> role.
     */
    public void add2TipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        if (tipoIdentificacion == null || tipoIdentificacion.isNull()) {
            this.modifiedTipoIdentificacion = true;
            this.tipoIdentificacionTipoIdentificacionCodigo = null;
        } else {
            this.tipoIdentificacionTipoIdentificacionCodigo = tipoIdentificacion.getTipoIdentificacionCodigo();
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
     * Returns the instance of <code>Tarifa</code> related through the <code>Tarifa</code> role.
     * Model Relationship:
     * <code>[Tarifa] Tarifa 1:1  ------ 0:M  InstitucionMatNeo [InstitucionMatNeo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Tarifa</code> related through the <code>Tarifa</code> role.
     */
    @JsonIgnore
    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * Adds an instance of <code>Tarifa</code> related through the <code>Tarifa</code> role.
     * @param tarifa The instance to add to the <code>Tarifa</code> role.
     */
    public void add2Tarifa(Tarifa tarifa) {
        if (tarifa == null || tarifa.isNull()) {
            this.modifiedTarifa = true;
            this.tarifaId = null;
        } else {
            this.tarifaId = tarifa.getTarifaId();
        }
        this.tarifa = (tarifa == null  || tarifa.isNull() ? null : tarifa);
    }

   /**
    * This method gets the attribute value <code>modifiedTarifa</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTarifa</code> has been modified.
    */
    public boolean isModifiedTarifa(){
        return modifiedTarifa;
    }

    /**
     * Returns the instance of <code>Municipio</code> related through the <code>Municipio</code> role.
     * Model Relationship:
     * <code>[Municipio] Municipio 1:1  ------ 0:M  InstitucionMatNeo [InstitucionMatNeo]</code>
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
        institucionMatNeoNumIdentificacion = "";
        institucionMatNeoNombre = "";
        institucionMatNeoParaMaternidad = false;
        institucionMatNeoParaNeonatal = false;
        institucionMatNeoFechaInicial = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        institucionMatNeoFechaFinal = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        anexoMat = null;
        anexoNeo = null;
        tipoIdentificacion = null;
        tarifa = null;
        municipio = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public AnexoMatJpaRepository getAnexoMatRepository() {
        return Arc.container().select(AnexoMatJpaRepository.class).get();
    }
    public AnexoNeoJpaRepository getAnexoNeoRepository() {
        return Arc.container().select(AnexoNeoJpaRepository.class).get();
    }
    public TipoIdentificacionJpaRepository getTipoIdentificacionRepository() {
        return Arc.container().select(TipoIdentificacionJpaRepository.class).get();
    }
    public MunicipioJpaRepository getMunicipioRepository() {
        return Arc.container().select(MunicipioJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return InstitucionMatNeo.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return InstitucionMatNeoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedInstitucionMatNeoNumIdentificacion = false;
    	values.put("institucionMatNeoNumIdentificacion", getInstitucionMatNeoNumIdentificacion());
    	modifiedInstitucionMatNeoNombre = false;
    	values.put("institucionMatNeoNombre", getInstitucionMatNeoNombre());
    	modifiedInstitucionMatNeoParaMaternidad = false;
    	values.put("institucionMatNeoParaMaternidad", getInstitucionMatNeoParaMaternidad());
    	modifiedInstitucionMatNeoParaNeonatal = false;
    	values.put("institucionMatNeoParaNeonatal", getInstitucionMatNeoParaNeonatal());
    	modifiedInstitucionMatNeoFechaInicial = false;
    	values.put("institucionMatNeoFechaInicial", getInstitucionMatNeoFechaInicial());
    	modifiedInstitucionMatNeoFechaFinal = false;
    	values.put("institucionMatNeoFechaFinal", getInstitucionMatNeoFechaFinal());
    	modifiedAnexoMat = false;
    	modifiedAnexoNeo = false;
    	modifiedTipoIdentificacion = false;
    	modifiedTarifa = false;
    	modifiedMunicipio = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>InstitucionMatNeoOid</code> object that identifies this instance of <code>InstitucionMatNeo</code>.
     * @return <code>InstitucionMatNeoOid </code> object that identifies this instance of <code>InstitucionMatNeo</code>
     */
	@Override
    public InstitucionMatNeoOid getOid() {
        return new InstitucionMatNeoOid(getInstitucionMatNeoCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(InstitucionMatNeoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(InstitucionMatNeoConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.INSTITUCIONMATNEO)) {
            // Add this class
            activeFacets.add(Constants.INSTITUCIONMATNEO);
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

    public String buildDSInstitucionMatNeo() {
        try {
            return getTarifa().getProductoT().getProductosDescripcion() + " " + getTarifa().getTarifaCodigo() + " " + getInstitucionMatNeoCodigo() + " " + getTipoIdentificacion().getTipoIdentificacionNombreCorto() + " " + getInstitucionMatNeoNumIdentificacion() + " " + getInstitucionMatNeoNombre() + " " + (getInstitucionMatNeoParaMaternidad() != null ? getInstitucionMatNeoParaMaternidad().toString() : "") + " " + (getInstitucionMatNeoParaNeonatal() != null ? getInstitucionMatNeoParaNeonatal().toString() : "") + " " + (getInstitucionMatNeoFechaInicial() != null ? getInstitucionMatNeoFechaInicial().toString() : "") + " " + (getInstitucionMatNeoFechaFinal() != null ? getInstitucionMatNeoFechaFinal().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildICInstitucionMatNeo() {
        try {
            return getInstitucionMatNeoNombre();
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
            relatedInstance = buildInstitucionMatNeoRelatedInstance(relatedInstanceJsonOid);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_ANEXOMAT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4AnexoMat(relatedInstanceJsonOid, remainingPath);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_ANEXONEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4AnexoNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_TARIFA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4Tarifa(relatedInstanceJsonOid, remainingPath);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_MUNICIPIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4AnexoMat(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoMat(mapper.readValue(relatedInstanceJsonOid, AnexoMatOid.class)): AnexoMat.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4AnexoNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class)): AnexoNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4Tarifa(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Tarifa(mapper.readValue(relatedInstanceJsonOid, TarifaOid.class)): Tarifa.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }
}
