package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PreguntaConstants;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.global.SeccionPConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.repository.PreguntaJpaRepository;
import com.keralty.aepersonas.repository.SeccionPJpaRepository;
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
 * Persistent representation of the <code>PreguntaP</code> model class.
 * <p>
 * Model Class: <code>PreguntaP</code><br>
 */
@Entity(name = PreguntaPConstants.CLASS_NAME)
@Table(name = PreguntaPConstants.TBL_NAME)
public class PreguntaP extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient SeccionPJpaRepository seccionPRepository;

    @JsonIgnore
    private transient PreguntaJpaRepository preguntaRepository;

    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PreguntaP_Sequence")
    @SequenceGenerator(name="PreguntaP_Sequence", sequenceName="PreguntaP_Sequence", allocationSize=1)
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long preguntaPIdentificador;

    /** Class member attribute. */
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPNUMERO )
    @JsonProperty(value="numero")
    private Long preguntaPNumero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaPNumero;

    /** Class member attribute. */
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPNUMORDEN )
    @JsonProperty(value="numorden")
    private Long preguntaPNumOrden;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaPNumOrden;

    /** Class member attribute. */
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String preguntaPDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaPDescripcion;

    /** Class member attribute. */
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPSEENVIAACORE )
    @JsonProperty(value="seenviaacore")
    private Boolean preguntaPSeEnviaACORE;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaPSeEnviaACORE;

    /** Class member attribute. */
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPRESPUESTASINO )
    @JsonProperty(value="respuestasino")
    private Boolean preguntaPRespuestaSiNo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaPRespuestaSiNo;

    /** Class member attribute. */
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPRESPUESTAOBS )
    @JsonProperty(value="respuestaobs")
    private String preguntaPRespuestaObs;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaPRespuestaObs;

    /** Class member attribute. */
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPVIENEDECORE )
    @JsonProperty(value="vienedecore")
    private Boolean preguntaPVieneDeCORE;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaPVieneDeCORE;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvrespuesta")
    protected String preguntaPdrvRespuesta;

    /** Class member attribute. */
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPVALORESRESPUESTAS )
    @JsonProperty(value="valoresrespuestas")
    private String preguntaPValoresRespuestas;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaPValoresRespuestas;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvrespuestasino")
    protected Boolean preguntaPdrvRespuestaSiNo;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PreguntaPConstants.FLD_SECCIONPSECCIONIDENTIFICADOR, referencedColumnName=SeccionPConstants.FLD_SECCIONPIDENTIFICADOR)
    })
    @JsonIgnore
    private SeccionP seccion;
    /** Related attribute. */
    @Column(name = PreguntaPConstants.FLD_SECCIONPSECCIONIDENTIFICADOR, insertable = false, updatable = false)
    private Long seccionPSeccionIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSeccion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PreguntaPConstants.FLD_PREGUNTAPREGUNTANUMERO, referencedColumnName=PreguntaConstants.FLD_PREGUNTANUMERO)
    })
    @JsonIgnore
    private Pregunta pregunta;
    /** Related attribute. */
    @Column(name = PreguntaPConstants.FLD_PREGUNTAPREGUNTANUMERO, insertable = false, updatable = false)
    private Long preguntaPreguntaNumero;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPregunta;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public PreguntaP() {
        preguntaPIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>PreguntaP</code>.
     * @param oid Object Identifier of the instance of <code>PreguntaP</code> to be created.
     * @throws SystemException
     */
    public PreguntaP(PreguntaPOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            preguntaPIdentificador = oid.getPreguntaPIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>preguntaPIdentificador</code> attribute<br>in class <code>PreguntaP</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PreguntaP</code>
     * @return The value of the <code>preguntaPIdentificador</code> attribute<br>in class <code>PreguntaP</code>.
     */
    public Long getPreguntaPIdentificador() {
        return preguntaPIdentificador;
    }

    /**
     * Sets the value of the <code>preguntaPIdentificador</code> attribute<br>in class <code>PreguntaP</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PreguntaP</code>
     * @param preguntaPIdentificador The new value of the <code>preguntaPIdentificador</code> attribute<br>in class <code>PreguntaP</code>.
     */
    public void setPreguntaPIdentificador(Long preguntaPIdentificador) {
        this.preguntaPIdentificador = preguntaPIdentificador;
    }

   /**
    * Returns the value of the <code>preguntaPNumero</code> attribute.<br>
    * Model Attribute: <code>preguntaPNumero</code>. Constant Int<br>
    * Comments: <br>
    * @return The value of the <code>preguntaPNumero</code> attribute.
    */

    public Long getPreguntaPNumero()  {
    	Long value;
        value =  preguntaPNumero;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaPNumero</code> attribute.<br>
    * Model Attribute: <code>preguntaPNumero</code>. Constant Int<br>
    * Comments: <br>
    * @param preguntaPNumero The new value of the <code>preguntaPNumero</code> attribute.
    */
    public void setPreguntaPNumero (Long preguntaPNumero) {
        modifiedPreguntaPNumero = true;
        this.preguntaPNumero = preguntaPNumero;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaPNumero</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaPNumero</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaPNumero() {
        return modifiedPreguntaPNumero;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaPNumero</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaPNumero</code>.
    */
    public void setModifiedPreguntaPNumero(boolean modified) {
        this.modifiedPreguntaPNumero = modified;
    }

   /**
    * Returns the value of the <code>preguntaPNumOrden</code> attribute.<br>
    * Model Attribute: <code>preguntaPNumOrden</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>preguntaPNumOrden</code> attribute.
    */

    public Long getPreguntaPNumOrden()  {
    	Long value;
        value =  preguntaPNumOrden;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaPNumOrden</code> attribute.<br>
    * Model Attribute: <code>preguntaPNumOrden</code>. Constant Nat<br>
    * Comments: <br>
    * @param preguntaPNumOrden The new value of the <code>preguntaPNumOrden</code> attribute.
    */
    public void setPreguntaPNumOrden (Long preguntaPNumOrden) {
        modifiedPreguntaPNumOrden = true;
        this.preguntaPNumOrden = preguntaPNumOrden;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaPNumOrden</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaPNumOrden</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaPNumOrden() {
        return modifiedPreguntaPNumOrden;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaPNumOrden</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaPNumOrden</code>.
    */
    public void setModifiedPreguntaPNumOrden(boolean modified) {
        this.modifiedPreguntaPNumOrden = modified;
    }

   /**
    * Returns the value of the <code>preguntaPDescripcion</code> attribute.<br>
    * Model Attribute: <code>preguntaPDescripcion</code>. Constant String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>preguntaPDescripcion</code> attribute.
    */

    public String getPreguntaPDescripcion()  {
    	String value;
        value =  preguntaPDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>preguntaPDescripcion</code> attribute.<br>
    * Model Attribute: <code>preguntaPDescripcion</code>. Constant String Size=255<br>
    * Comments: <br>
    * @param preguntaPDescripcion The new value of the <code>preguntaPDescripcion</code> attribute.
    */
    public void setPreguntaPDescripcion (String preguntaPDescripcion) {
        modifiedPreguntaPDescripcion = true;
        this.preguntaPDescripcion = preguntaPDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaPDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaPDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaPDescripcion() {
        return modifiedPreguntaPDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaPDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaPDescripcion</code>.
    */
    public void setModifiedPreguntaPDescripcion(boolean modified) {
        this.modifiedPreguntaPDescripcion = modified;
    }

   /**
    * Returns the value of the <code>preguntaPSeEnviaACORE</code> attribute.<br>
    * Model Attribute: <code>preguntaPSeEnviaACORE</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>preguntaPSeEnviaACORE</code> attribute.
    */

    public Boolean getPreguntaPSeEnviaACORE()  {
    	Boolean value;
        value =  preguntaPSeEnviaACORE;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaPSeEnviaACORE</code> attribute.<br>
    * Model Attribute: <code>preguntaPSeEnviaACORE</code>. Constant Bool<br>
    * Comments: <br>
    * @param preguntaPSeEnviaACORE The new value of the <code>preguntaPSeEnviaACORE</code> attribute.
    */
    public void setPreguntaPSeEnviaACORE (Boolean preguntaPSeEnviaACORE) {
        modifiedPreguntaPSeEnviaACORE = true;
        this.preguntaPSeEnviaACORE = preguntaPSeEnviaACORE;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaPSeEnviaACORE</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaPSeEnviaACORE</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaPSeEnviaACORE() {
        return modifiedPreguntaPSeEnviaACORE;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaPSeEnviaACORE</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaPSeEnviaACORE</code>.
    */
    public void setModifiedPreguntaPSeEnviaACORE(boolean modified) {
        this.modifiedPreguntaPSeEnviaACORE = modified;
    }

   /**
    * Returns the value of the <code>preguntaPRespuestaSiNo</code> attribute.<br>
    * Model Attribute: <code>preguntaPRespuestaSiNo</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>preguntaPRespuestaSiNo</code> attribute.
    */

    public Boolean getPreguntaPRespuestaSiNo()  {
    	Boolean value;
        value =  preguntaPRespuestaSiNo;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaPRespuestaSiNo</code> attribute.<br>
    * Model Attribute: <code>preguntaPRespuestaSiNo</code>. Variable Bool<br>
    * Comments: <br>
    * @param preguntaPRespuestaSiNo The new value of the <code>preguntaPRespuestaSiNo</code> attribute.
    */
    public void setPreguntaPRespuestaSiNo (Boolean preguntaPRespuestaSiNo) {
        modifiedPreguntaPRespuestaSiNo = true;
        this.preguntaPRespuestaSiNo = preguntaPRespuestaSiNo;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaPRespuestaSiNo</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaPRespuestaSiNo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaPRespuestaSiNo() {
        return modifiedPreguntaPRespuestaSiNo;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaPRespuestaSiNo</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaPRespuestaSiNo</code>.
    */
    public void setModifiedPreguntaPRespuestaSiNo(boolean modified) {
        this.modifiedPreguntaPRespuestaSiNo = modified;
    }

   /**
    * Returns the value of the <code>preguntaPRespuestaObs</code> attribute.<br>
    * Model Attribute: <code>preguntaPRespuestaObs</code>. Variable String Size=999<br>
    * Comments: Cambiar tamaño a 2200, para dejar otros 300 a las posibles respuestas que están en el atributo ValoresRespuestas<br>
    * @return The value of the <code>preguntaPRespuestaObs</code> attribute.
    */

    public String getPreguntaPRespuestaObs()  {
    	String value;
        value =  preguntaPRespuestaObs;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>preguntaPRespuestaObs</code> attribute.<br>
    * Model Attribute: <code>preguntaPRespuestaObs</code>. Variable String Size=999<br>
    * Comments: Cambiar tamaño a 2200, para dejar otros 300 a las posibles respuestas que están en el atributo ValoresRespuestas<br>
    * @param preguntaPRespuestaObs The new value of the <code>preguntaPRespuestaObs</code> attribute.
    */
    public void setPreguntaPRespuestaObs (String preguntaPRespuestaObs) {
        modifiedPreguntaPRespuestaObs = true;
        this.preguntaPRespuestaObs = preguntaPRespuestaObs;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaPRespuestaObs</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaPRespuestaObs</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaPRespuestaObs() {
        return modifiedPreguntaPRespuestaObs;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaPRespuestaObs</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaPRespuestaObs</code>.
    */
    public void setModifiedPreguntaPRespuestaObs(boolean modified) {
        this.modifiedPreguntaPRespuestaObs = modified;
    }

   /**
    * Returns the value of the <code>preguntaPVieneDeCORE</code> attribute.<br>
    * Model Attribute: <code>preguntaPVieneDeCORE</code>. Variable Bool<br>
    * Comments: Si la respuesta ha esta pregunta ha sido devuelta por el CORE y la respuesta es SI, no se podrá modificar su valor<br>
    * @return The value of the <code>preguntaPVieneDeCORE</code> attribute.
    */

    public Boolean getPreguntaPVieneDeCORE()  {
    	Boolean value;
        value =  preguntaPVieneDeCORE;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaPVieneDeCORE</code> attribute.<br>
    * Model Attribute: <code>preguntaPVieneDeCORE</code>. Variable Bool<br>
    * Comments: Si la respuesta ha esta pregunta ha sido devuelta por el CORE y la respuesta es SI, no se podrá modificar su valor<br>
    * @param preguntaPVieneDeCORE The new value of the <code>preguntaPVieneDeCORE</code> attribute.
    */
    public void setPreguntaPVieneDeCORE (Boolean preguntaPVieneDeCORE) {
        modifiedPreguntaPVieneDeCORE = true;
        this.preguntaPVieneDeCORE = preguntaPVieneDeCORE;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaPVieneDeCORE</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaPVieneDeCORE</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaPVieneDeCORE() {
        return modifiedPreguntaPVieneDeCORE;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaPVieneDeCORE</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaPVieneDeCORE</code>.
    */
    public void setModifiedPreguntaPVieneDeCORE(boolean modified) {
        this.modifiedPreguntaPVieneDeCORE = modified;
    }

   /**
    * Returns the value of the <code>preguntaPdrvRespuesta</code> attribute.<br>
    * Model Attribute: <code>preguntaPdrvRespuesta</code>. Variable String Size=999<br>
    * Comments: Cambiar tamaño a 2500
Concatenar observaciones y posibles valores<br>
    * @return The value of the <code>preguntaPdrvRespuesta</code> attribute.
    */

    @JsonIgnore
    public String getPreguntaPdrvRespuesta()  {
    	String value;
        try {
            value = preguntaPdrvRespuestaDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: PreguntaP, Attribute: preguntaPdrvRespuesta");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>preguntaPValoresRespuestas</code> attribute.<br>
    * Model Attribute: <code>preguntaPValoresRespuestas</code>. Variable String Size=999<br>
    * Comments: Los posibles valores de la respuesta cuando su valor debe tomarlo de un conjunto determinado.
Utilizaremos el ; como separador para los distintos valores<br>
    * @return The value of the <code>preguntaPValoresRespuestas</code> attribute.
    */

    public String getPreguntaPValoresRespuestas()  {
    	String value;
        value =  preguntaPValoresRespuestas;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>preguntaPValoresRespuestas</code> attribute.<br>
    * Model Attribute: <code>preguntaPValoresRespuestas</code>. Variable String Size=999<br>
    * Comments: Los posibles valores de la respuesta cuando su valor debe tomarlo de un conjunto determinado.
Utilizaremos el ; como separador para los distintos valores<br>
    * @param preguntaPValoresRespuestas The new value of the <code>preguntaPValoresRespuestas</code> attribute.
    */
    public void setPreguntaPValoresRespuestas (String preguntaPValoresRespuestas) {
        modifiedPreguntaPValoresRespuestas = true;
        this.preguntaPValoresRespuestas = preguntaPValoresRespuestas;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaPValoresRespuestas</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaPValoresRespuestas</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaPValoresRespuestas() {
        return modifiedPreguntaPValoresRespuestas;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaPValoresRespuestas</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaPValoresRespuestas</code>.
    */
    public void setModifiedPreguntaPValoresRespuestas(boolean modified) {
        this.modifiedPreguntaPValoresRespuestas = modified;
    }

   /**
    * Returns the value of the <code>preguntaPdrvRespuestaSiNo</code> attribute.<br>
    * Model Attribute: <code>preguntaPdrvRespuestaSiNo</code>. Variable Bool<br>
    * Comments: Devuelve si se ha contestado o no a la pregunta. <br>
    * @return The value of the <code>preguntaPdrvRespuestaSiNo</code> attribute.
    */

    @JsonIgnore
    public Boolean getPreguntaPdrvRespuestaSiNo()  {
    	Boolean value;
        try {
            value = preguntaPdrvRespuestaSiNoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: PreguntaP, Attribute: preguntaPdrvRespuestaSiNo");
        }
        return value;
    }

    /**
     * Returns the instance of <code>SeccionP</code> related through the <code>Seccion</code> role.
     * Model Relationship:
     * <code>[SeccionP] Seccion 1:1  ------ 0:M  Preguntas [PreguntaP]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SeccionP</code> related through the <code>Seccion</code> role.
     */
    @JsonIgnore
    public SeccionP getSeccion() {
        try {
            if (seccion != null && seccion.isNull()) {
                seccion = null;
            }
        } catch (Exception ex) {
            seccion = null;
        }
        if (seccion == null) {
            if (seccionPSeccionIdentificador != null) {
                seccion = getSeccionPRepository().findById(seccionPSeccionIdentificador).orElse(null);
            } else {
                seccion = null;
            }
        }
        return (seccion == null ? new SeccionP(null) : seccion);
    }

    /**
     * Adds an instance of <code>SeccionP</code> related through the <code>Seccion</code> role.
     * @param seccion The instance to add to the <code>Seccion</code> role.
     */
    public void add2Seccion(SeccionP seccion) {
        if (seccion == null || seccion.isNull()) {
            this.modifiedSeccion = true;
            this.seccionPSeccionIdentificador = null;
        } else {
            this.seccionPSeccionIdentificador = seccion.getSeccionPIdentificador();
        }
        this.seccion = (seccion == null  || seccion.isNull() ? null : seccion);
    }

   /**
    * This method gets the attribute value <code>modifiedSeccion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSeccion</code> has been modified.
    */
    public boolean isModifiedSeccion(){
        return modifiedSeccion;
    }

    /**
     * Returns the instance of <code>Pregunta</code> related through the <code>Pregunta</code> role.
     * Model Relationship:
     * <code>[Pregunta] Pregunta 0:1  ------ 0:M  PreguntasPersona [PreguntaP]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Pregunta</code> related through the <code>Pregunta</code> role.
     */
    @JsonIgnore
    public Pregunta getPregunta() {
        try {
            if (pregunta != null && pregunta.isNull()) {
                pregunta = null;
            }
        } catch (Exception ex) {
            pregunta = null;
        }
        if (pregunta == null) {
            if (preguntaPreguntaNumero != null) {
                pregunta = getPreguntaRepository().findById(preguntaPreguntaNumero).orElse(null);
            } else {
                pregunta = null;
            }
        }
        return (pregunta == null ? new Pregunta(null) : pregunta);
    }

    /**
     * Adds an instance of <code>Pregunta</code> related through the <code>Pregunta</code> role.
     * @param pregunta The instance to add to the <code>Pregunta</code> role.
     */
    public void add2Pregunta(Pregunta pregunta) {
        if (pregunta == null || pregunta.isNull()) {
            this.modifiedPregunta = true;
            this.preguntaPreguntaNumero = null;
        } else {
            this.preguntaPreguntaNumero = pregunta.getPreguntaNumero();
        }
        this.pregunta = (pregunta == null  || pregunta.isNull() ? null : pregunta);
    }

   /**
    * This method gets the attribute value <code>modifiedPregunta</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPregunta</code> has been modified.
    */
    public boolean isModifiedPregunta(){
        return modifiedPregunta;
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
     * Computes the value of the <code>preguntaPdrvRespuesta</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>preguntaPdrvRespuesta</code> derived attribute.
     */
    public String preguntaPdrvRespuestaDerivations() {

        preguntaPdrvRespuesta = null;

        preguntaPdrvRespuestaDerivationsConditional1();
        preguntaPdrvRespuestaDerivationsConditional2();
        preguntaPdrvRespuestaDerivationsConditional3();
        preguntaPdrvRespuestaDerivationsDefault();
        return preguntaPdrvRespuesta;
    }

    private void preguntaPdrvRespuestaDerivationsConditional1() {
        if (preguntaPdrvRespuesta != null) return;
        // CONDITION: ValoresRespuestas <> NULL AND ValoresRespuestas <> \"\" AND RespuestaObs <> NULL AND RespuestaObs <> \"\"
        // EFFECT   : fuconcatenarConNulos(  ValoresRespuestas, RespuestaObs  )
        boolean preguntaPdrvRespuestaCond = this.getPreguntaPValoresRespuestas() != null && (this.getPreguntaPValoresRespuestas()).length() != 0 && this.getPreguntaPRespuestaObs() != null && (this.getPreguntaPRespuestaObs()).length() != 0;
        if (preguntaPdrvRespuestaCond) {
            preguntaPdrvRespuesta = userFunctionsSrv.fuconcatenarConNulosFun(this.getPreguntaPValoresRespuestas(), this.getPreguntaPRespuestaObs());
        }
    }

    private void preguntaPdrvRespuestaDerivationsConditional2() {
        if (preguntaPdrvRespuesta != null) return;
        // CONDITION: ValoresRespuestas <> NULL AND ValoresRespuestas <> \"\" 
        // EFFECT   : ValoresRespuestas
        boolean preguntaPdrvRespuestaCond = this.getPreguntaPValoresRespuestas() != null && (this.getPreguntaPValoresRespuestas()).length() != 0;
        if (preguntaPdrvRespuestaCond) {
            preguntaPdrvRespuesta = this.getPreguntaPValoresRespuestas();
        }
    }

    private void preguntaPdrvRespuestaDerivationsConditional3() {
        if (preguntaPdrvRespuesta != null) return;
        // CONDITION: RespuestaObs <> NULL AND RespuestaObs <> \"\"
        // EFFECT   : RespuestaObs
        boolean preguntaPdrvRespuestaCond = this.getPreguntaPRespuestaObs() != null && (this.getPreguntaPRespuestaObs()).length() != 0;
        if (preguntaPdrvRespuestaCond) {
            preguntaPdrvRespuesta = this.getPreguntaPRespuestaObs();
        }
    }

    private void preguntaPdrvRespuestaDerivationsDefault() {
        if (preguntaPdrvRespuesta != null) return;
        // Default derivation
        // EFFECT   : \"\"
        preguntaPdrvRespuesta = "";
    }

    /**
     * Computes the value of the <code>preguntaPdrvRespuestaSiNo</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>preguntaPdrvRespuestaSiNo</code> derived attribute.
     */
    public Boolean preguntaPdrvRespuestaSiNoDerivations() {

        preguntaPdrvRespuestaSiNo = null;

        preguntaPdrvRespuestaSiNoDerivationsConditional1();
        preguntaPdrvRespuestaSiNoDerivationsConditional2();
        preguntaPdrvRespuestaSiNoDerivationsDefault();
        return preguntaPdrvRespuestaSiNo;
    }

    private void preguntaPdrvRespuestaSiNoDerivationsConditional1() {
        if (preguntaPdrvRespuestaSiNo != null) return;
        // CONDITION: Pregunta.ValorSNObliga = TRUE
        // EFFECT   : RespuestaSiNo
        boolean preguntaPdrvRespuestaSiNoCond = this.getPregunta().getPreguntaValorSNObliga().equals(true);
        if (preguntaPdrvRespuestaSiNoCond) {
            preguntaPdrvRespuestaSiNo = this.getPreguntaPRespuestaSiNo();
        }
    }

    private void preguntaPdrvRespuestaSiNoDerivationsConditional2() {
        if (preguntaPdrvRespuestaSiNo != null) return;
        // CONDITION: Pregunta.EsNumero = TRUE
        // EFFECT   : RespuestaObs <> NULL AND RespuestaObs <> \"\"
        boolean preguntaPdrvRespuestaSiNoCond = this.getPregunta().getPreguntaEsNumero().equals(true);
        if (preguntaPdrvRespuestaSiNoCond) {
            preguntaPdrvRespuestaSiNo = this.getPreguntaPRespuestaObs() != null && (this.getPreguntaPRespuestaObs()).length() != 0;
        }
    }

    private void preguntaPdrvRespuestaSiNoDerivationsDefault() {
        if (preguntaPdrvRespuestaSiNo != null) return;
        // Default derivation
        // EFFECT   : ValoresRespuestas <> NULL AND ValoresRespuestas <> \"\"
        preguntaPdrvRespuestaSiNo = this.getPreguntaPValoresRespuestas() != null && (this.getPreguntaPValoresRespuestas()).length() != 0;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        preguntaPNumero = Long.valueOf(0);
        preguntaPNumOrden = Long.valueOf(0);
        preguntaPDescripcion = "";
        preguntaPSeEnviaACORE = false;
        preguntaPRespuestaSiNo = false;
        preguntaPRespuestaObs = null;
        preguntaPVieneDeCORE = false;
        preguntaPValoresRespuestas = null;
        seccion = null;
        pregunta = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
    }
    public SeccionPJpaRepository getSeccionPRepository() {
        return Arc.container().select(SeccionPJpaRepository.class).get();
    }
    public PreguntaJpaRepository getPreguntaRepository() {
        return Arc.container().select(PreguntaJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return PreguntaP.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PreguntaPConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPreguntaPNumero = false;
    	values.put("preguntaPNumero", getPreguntaPNumero());
    	modifiedPreguntaPNumOrden = false;
    	values.put("preguntaPNumOrden", getPreguntaPNumOrden());
    	modifiedPreguntaPDescripcion = false;
    	values.put("preguntaPDescripcion", getPreguntaPDescripcion());
    	modifiedPreguntaPSeEnviaACORE = false;
    	values.put("preguntaPSeEnviaACORE", getPreguntaPSeEnviaACORE());
    	modifiedPreguntaPRespuestaSiNo = false;
    	values.put("preguntaPRespuestaSiNo", getPreguntaPRespuestaSiNo());
    	modifiedPreguntaPRespuestaObs = false;
    	values.put("preguntaPRespuestaObs", getPreguntaPRespuestaObs());
    	modifiedPreguntaPVieneDeCORE = false;
    	values.put("preguntaPVieneDeCORE", getPreguntaPVieneDeCORE());
    	modifiedPreguntaPValoresRespuestas = false;
    	values.put("preguntaPValoresRespuestas", getPreguntaPValoresRespuestas());
    	modifiedSeccion = false;
    	modifiedPregunta = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            preguntaPdrvRespuesta = null;
            preguntaPdrvRespuestaSiNo = null;
    }

    /**
     * Returns the <code>PreguntaPOid</code> object that identifies this instance of <code>PreguntaP</code>.
     * @return <code>PreguntaPOid </code> object that identifies this instance of <code>PreguntaP</code>
     */
	@Override
    public PreguntaPOid getOid() {
        return new PreguntaPOid(getPreguntaPIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PreguntaPConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(PreguntaPConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PREGUNTAP)) {
            // Add this class
            activeFacets.add(Constants.PREGUNTAP);
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

    public String buildDSPreguntaPNull() {
        try {
            return (getPreguntaPIdentificador() != null ? getPreguntaPIdentificador().toString() : "");
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
            relatedInstance = buildPreguntaPRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreguntaPConstants.ROLE_NAME_SECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaPRelatedInstance4SeccionP(relatedInstanceJsonOid, remainingPath);
        }
        if (PreguntaPConstants.ROLE_NAME_PREGUNTA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaPRelatedInstance4Pregunta(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPreguntaPRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PreguntaP(mapper.readValue(relatedInstanceJsonOid, PreguntaPOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreguntaP.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPreguntaPRelatedInstance4SeccionP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SeccionP(mapper.readValue(relatedInstanceJsonOid, SeccionPOid.class)): SeccionP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreguntaP.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPreguntaPRelatedInstance4Pregunta(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class)): Pregunta.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreguntaP.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
