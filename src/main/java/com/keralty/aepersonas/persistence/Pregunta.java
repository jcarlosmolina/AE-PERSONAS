package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PreguntaConstants;
import com.keralty.aepersonas.global.SeccionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.oid.SeccionOid;
import com.keralty.aepersonas.persistence.oid.ValorOid;
import com.keralty.aepersonas.repository.PreguntaPJpaRepository;
import com.keralty.aepersonas.service.SeccionService;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToMany;
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
import org.eclipse.microprofile.rest.client.inject.RestClient;
/**
 * Persistent representation of the <code>Pregunta</code> model class.
 * <p>
 * Model Class: <code>Pregunta</code><br>
 */
@Entity(name = PreguntaConstants.CLASS_NAME)
@Table(name = PreguntaConstants.TBL_NAME)
public class Pregunta extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient PreguntaPJpaRepository preguntaPRepository;

    @RestClient
    private transient SeccionService seccionService;

    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @Column(name = PreguntaConstants.FLD_PREGUNTANUMERO )
    @JsonProperty(value="numero")
    private Long preguntaNumero;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTANUMORDEN )
    @JsonProperty(value="numorden")
    private Long preguntaNumOrden;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaNumOrden;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTADESCRIPCION )
    @JsonProperty(value="descripcion")
    private String preguntaDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaDescripcion;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTAVALORSNOBLIGA )
    @JsonProperty(value="valorsnobliga")
    private Boolean preguntaValorSNObliga;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaValorSNObliga;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTAOBSOBLIG )
    @JsonProperty(value="obsoblig")
    private Boolean preguntaObsOblig;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaObsOblig;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTAESNUMERO )
    @JsonProperty(value="esnumero")
    private Boolean preguntaEsNumero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaEsNumero;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTAVALORMAX )
    @JsonProperty(value="valormax")
    private Double preguntaValorMax;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaValorMax;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTAVALORMIN )
    @JsonProperty(value="valormin")
    private Double preguntaValorMin;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaValorMin;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTASOLOHOMBRES )
    @JsonProperty(value="solohombres")
    private Boolean preguntaSoloHombres;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaSoloHombres;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTASOLOMUJERES )
    @JsonProperty(value="solomujeres")
    private Boolean preguntaSoloMujeres;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaSoloMujeres;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTARESPMULTIPLE )
    @JsonProperty(value="respmultiple")
    private Boolean preguntaRespMultiple;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaRespMultiple;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvvaloresposibles")
    protected String preguntadrvValoresPosibles;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTASEENVIAALCORE )
    @JsonProperty(value="seenviaalcore")
    private Boolean preguntaSeEnviaAlCORE;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaSeEnviaAlCORE;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTACONDICIONEDAD )
    @JsonProperty(value="condicionedad")
    private Long preguntaCondicionEdad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaCondicionEdad;

    /** Class member attribute. */
    @Column(name = PreguntaConstants.FLD_PREGUNTACONDICIONEDADANYOS )
    @JsonProperty(value="condicionedadanyos")
    private Long preguntaCondicionEdadAnyos;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntaCondicionEdadAnyos;

    /** Related Class. */
    @ManyToMany(mappedBy=PreguntaConstants.ROLE_INVNAME_VALORES)
    @JsonIgnore
    private Collection <Valor> valores;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedValores;

    /** Related Class. */
    @OneToMany(mappedBy = PreguntaConstants.ROLE_INVNAME_PREGUNTASPERSONA)
    @JsonIgnore
    private Collection <PreguntaP> preguntasPersona;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntasPersona;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PreguntaConstants.FLD_SECCIONIDENTIFICADOR, referencedColumnName=SeccionConstants.FLD_SECCIONIDENTIFICADOR)
    })
    @JsonIgnore
    private Seccion seccion;
    /** Related attribute. */
    @Column(name = PreguntaConstants.FLD_SECCIONIDENTIFICADOR, insertable = false, updatable = false)
    private Long seccionIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSeccion;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Pregunta() {
        preguntaNumero = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Pregunta</code>.
     * @param oid Object Identifier of the instance of <code>Pregunta</code> to be created.
     * @throws SystemException
     */
    public Pregunta(PreguntaOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            preguntaNumero = oid.getPreguntaNumero();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>preguntaNumero</code> attribute<br>in class <code>Pregunta</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Pregunta</code>
     * @return The value of the <code>preguntaNumero</code> attribute<br>in class <code>Pregunta</code>.
     */
    public Long getPreguntaNumero() {
        return preguntaNumero;
    }

    /**
     * Sets the value of the <code>preguntaNumero</code> attribute<br>in class <code>Pregunta</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Pregunta</code>
     * @param preguntaNumero The new value of the <code>preguntaNumero</code> attribute<br>in class <code>Pregunta</code>.
     */
    public void setPreguntaNumero(Long preguntaNumero) {
        this.preguntaNumero = preguntaNumero;
    }

   /**
    * Returns the value of the <code>preguntaNumOrden</code> attribute.<br>
    * Model Attribute: <code>preguntaNumOrden</code>. Variable Nat<br>
    * Comments: En qué orden dentro de la sección tiene que aparecer esta pregunta<br>
    * @return The value of the <code>preguntaNumOrden</code> attribute.
    */

    public Long getPreguntaNumOrden()  {
    	Long value;
        value =  preguntaNumOrden;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaNumOrden</code> attribute.<br>
    * Model Attribute: <code>preguntaNumOrden</code>. Variable Nat<br>
    * Comments: En qué orden dentro de la sección tiene que aparecer esta pregunta<br>
    * @param preguntaNumOrden The new value of the <code>preguntaNumOrden</code> attribute.
    */
    public void setPreguntaNumOrden (Long preguntaNumOrden) {
        modifiedPreguntaNumOrden = true;
        this.preguntaNumOrden = preguntaNumOrden;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaNumOrden</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaNumOrden</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaNumOrden() {
        return modifiedPreguntaNumOrden;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaNumOrden</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaNumOrden</code>.
    */
    public void setModifiedPreguntaNumOrden(boolean modified) {
        this.modifiedPreguntaNumOrden = modified;
    }

   /**
    * Returns the value of the <code>preguntaDescripcion</code> attribute.<br>
    * Model Attribute: <code>preguntaDescripcion</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>preguntaDescripcion</code> attribute.
    */

    public String getPreguntaDescripcion()  {
    	String value;
        value =  preguntaDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>preguntaDescripcion</code> attribute.<br>
    * Model Attribute: <code>preguntaDescripcion</code>. Variable String Size=255<br>
    * Comments: <br>
    * @param preguntaDescripcion The new value of the <code>preguntaDescripcion</code> attribute.
    */
    public void setPreguntaDescripcion (String preguntaDescripcion) {
        modifiedPreguntaDescripcion = true;
        this.preguntaDescripcion = preguntaDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaDescripcion() {
        return modifiedPreguntaDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaDescripcion</code>.
    */
    public void setModifiedPreguntaDescripcion(boolean modified) {
        this.modifiedPreguntaDescripcion = modified;
    }

   /**
    * Returns the value of the <code>preguntaValorSNObliga</code> attribute.<br>
    * Model Attribute: <code>preguntaValorSNObliga</code>. Variable Bool<br>
    * Comments: Indica si para esta pregunta se tiene que solicitar Si No como valores. Esto será para casi todas las preguntas, excepto por ejemplo para Peso y Estatura, donde sólo tendrán que proporcionar un valor y no marcar Si No. <br>
    * @return The value of the <code>preguntaValorSNObliga</code> attribute.
    */

    public Boolean getPreguntaValorSNObliga()  {
    	Boolean value;
        value =  preguntaValorSNObliga;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaValorSNObliga</code> attribute.<br>
    * Model Attribute: <code>preguntaValorSNObliga</code>. Variable Bool<br>
    * Comments: Indica si para esta pregunta se tiene que solicitar Si No como valores. Esto será para casi todas las preguntas, excepto por ejemplo para Peso y Estatura, donde sólo tendrán que proporcionar un valor y no marcar Si No. <br>
    * @param preguntaValorSNObliga The new value of the <code>preguntaValorSNObliga</code> attribute.
    */
    public void setPreguntaValorSNObliga (Boolean preguntaValorSNObliga) {
        modifiedPreguntaValorSNObliga = true;
        this.preguntaValorSNObliga = preguntaValorSNObliga;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaValorSNObliga</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaValorSNObliga</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaValorSNObliga() {
        return modifiedPreguntaValorSNObliga;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaValorSNObliga</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaValorSNObliga</code>.
    */
    public void setModifiedPreguntaValorSNObliga(boolean modified) {
        this.modifiedPreguntaValorSNObliga = modified;
    }

   /**
    * Returns the value of the <code>preguntaObsOblig</code> attribute.<br>
    * Model Attribute: <code>preguntaObsOblig</code>. Variable Bool<br>
    * Comments: Indica si para esta pregunta es obligatorio proporcionar una observación. <br>
    * @return The value of the <code>preguntaObsOblig</code> attribute.
    */

    public Boolean getPreguntaObsOblig()  {
    	Boolean value;
        value =  preguntaObsOblig;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaObsOblig</code> attribute.<br>
    * Model Attribute: <code>preguntaObsOblig</code>. Variable Bool<br>
    * Comments: Indica si para esta pregunta es obligatorio proporcionar una observación. <br>
    * @param preguntaObsOblig The new value of the <code>preguntaObsOblig</code> attribute.
    */
    public void setPreguntaObsOblig (Boolean preguntaObsOblig) {
        modifiedPreguntaObsOblig = true;
        this.preguntaObsOblig = preguntaObsOblig;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaObsOblig</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaObsOblig</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaObsOblig() {
        return modifiedPreguntaObsOblig;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaObsOblig</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaObsOblig</code>.
    */
    public void setModifiedPreguntaObsOblig(boolean modified) {
        this.modifiedPreguntaObsOblig = modified;
    }

   /**
    * Returns the value of the <code>preguntaEsNumero</code> attribute.<br>
    * Model Attribute: <code>preguntaEsNumero</code>. Variable Bool<br>
    * Comments: Indica si para esta pregunta, la observación a diligenciar tiene que ser un número.<br>
    * @return The value of the <code>preguntaEsNumero</code> attribute.
    */

    public Boolean getPreguntaEsNumero()  {
    	Boolean value;
        value =  preguntaEsNumero;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaEsNumero</code> attribute.<br>
    * Model Attribute: <code>preguntaEsNumero</code>. Variable Bool<br>
    * Comments: Indica si para esta pregunta, la observación a diligenciar tiene que ser un número.<br>
    * @param preguntaEsNumero The new value of the <code>preguntaEsNumero</code> attribute.
    */
    public void setPreguntaEsNumero (Boolean preguntaEsNumero) {
        modifiedPreguntaEsNumero = true;
        this.preguntaEsNumero = preguntaEsNumero;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaEsNumero</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaEsNumero</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaEsNumero() {
        return modifiedPreguntaEsNumero;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaEsNumero</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaEsNumero</code>.
    */
    public void setModifiedPreguntaEsNumero(boolean modified) {
        this.modifiedPreguntaEsNumero = modified;
    }

   /**
    * Returns the value of the <code>preguntaValorMax</code> attribute.<br>
    * Model Attribute: <code>preguntaValorMax</code>. Variable Real<br>
    * Comments: En el caso de que se deba diligenciar un valor numérico para esta pregunta (por ejemplo, en peso) si hay algún tope al valor a introducir<br>
    * @return The value of the <code>preguntaValorMax</code> attribute.
    */

    public Double getPreguntaValorMax()  {
    	Double value;
        value =  preguntaValorMax;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaValorMax</code> attribute.<br>
    * Model Attribute: <code>preguntaValorMax</code>. Variable Real<br>
    * Comments: En el caso de que se deba diligenciar un valor numérico para esta pregunta (por ejemplo, en peso) si hay algún tope al valor a introducir<br>
    * @param preguntaValorMax The new value of the <code>preguntaValorMax</code> attribute.
    */
    public void setPreguntaValorMax (Double preguntaValorMax) {
        modifiedPreguntaValorMax = true;
        this.preguntaValorMax = preguntaValorMax;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaValorMax</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaValorMax</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaValorMax() {
        return modifiedPreguntaValorMax;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaValorMax</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaValorMax</code>.
    */
    public void setModifiedPreguntaValorMax(boolean modified) {
        this.modifiedPreguntaValorMax = modified;
    }

   /**
    * Returns the value of the <code>preguntaValorMin</code> attribute.<br>
    * Model Attribute: <code>preguntaValorMin</code>. Variable Real<br>
    * Comments: En el caso de que se deba diligenciar un valor numérico para esta pregunta (por ejemplo, en semanas de embarazo) si hay algún valor mínimo a introducir.<br>
    * @return The value of the <code>preguntaValorMin</code> attribute.
    */

    public Double getPreguntaValorMin()  {
    	Double value;
        value =  preguntaValorMin;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaValorMin</code> attribute.<br>
    * Model Attribute: <code>preguntaValorMin</code>. Variable Real<br>
    * Comments: En el caso de que se deba diligenciar un valor numérico para esta pregunta (por ejemplo, en semanas de embarazo) si hay algún valor mínimo a introducir.<br>
    * @param preguntaValorMin The new value of the <code>preguntaValorMin</code> attribute.
    */
    public void setPreguntaValorMin (Double preguntaValorMin) {
        modifiedPreguntaValorMin = true;
        this.preguntaValorMin = preguntaValorMin;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaValorMin</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaValorMin</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaValorMin() {
        return modifiedPreguntaValorMin;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaValorMin</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaValorMin</code>.
    */
    public void setModifiedPreguntaValorMin(boolean modified) {
        this.modifiedPreguntaValorMin = modified;
    }

   /**
    * Returns the value of the <code>preguntaSoloHombres</code> attribute.<br>
    * Model Attribute: <code>preguntaSoloHombres</code>. Variable Bool<br>
    * Comments: Indica que esta pregunta sólo se tiene que formular a hombres. <br>
    * @return The value of the <code>preguntaSoloHombres</code> attribute.
    */

    public Boolean getPreguntaSoloHombres()  {
    	Boolean value;
        value =  preguntaSoloHombres;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaSoloHombres</code> attribute.<br>
    * Model Attribute: <code>preguntaSoloHombres</code>. Variable Bool<br>
    * Comments: Indica que esta pregunta sólo se tiene que formular a hombres. <br>
    * @param preguntaSoloHombres The new value of the <code>preguntaSoloHombres</code> attribute.
    */
    public void setPreguntaSoloHombres (Boolean preguntaSoloHombres) {
        modifiedPreguntaSoloHombres = true;
        this.preguntaSoloHombres = preguntaSoloHombres;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaSoloHombres</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaSoloHombres</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaSoloHombres() {
        return modifiedPreguntaSoloHombres;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaSoloHombres</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaSoloHombres</code>.
    */
    public void setModifiedPreguntaSoloHombres(boolean modified) {
        this.modifiedPreguntaSoloHombres = modified;
    }

   /**
    * Returns the value of the <code>preguntaSoloMujeres</code> attribute.<br>
    * Model Attribute: <code>preguntaSoloMujeres</code>. Variable Bool<br>
    * Comments: Indica que esta pregunta sólo se tiene que formular a mujeres. <br>
    * @return The value of the <code>preguntaSoloMujeres</code> attribute.
    */

    public Boolean getPreguntaSoloMujeres()  {
    	Boolean value;
        value =  preguntaSoloMujeres;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaSoloMujeres</code> attribute.<br>
    * Model Attribute: <code>preguntaSoloMujeres</code>. Variable Bool<br>
    * Comments: Indica que esta pregunta sólo se tiene que formular a mujeres. <br>
    * @param preguntaSoloMujeres The new value of the <code>preguntaSoloMujeres</code> attribute.
    */
    public void setPreguntaSoloMujeres (Boolean preguntaSoloMujeres) {
        modifiedPreguntaSoloMujeres = true;
        this.preguntaSoloMujeres = preguntaSoloMujeres;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaSoloMujeres</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaSoloMujeres</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaSoloMujeres() {
        return modifiedPreguntaSoloMujeres;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaSoloMujeres</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaSoloMujeres</code>.
    */
    public void setModifiedPreguntaSoloMujeres(boolean modified) {
        this.modifiedPreguntaSoloMujeres = modified;
    }

   /**
    * Returns the value of the <code>preguntaRespMultiple</code> attribute.<br>
    * Model Attribute: <code>preguntaRespMultiple</code>. Variable Bool<br>
    * Comments: Indica i se puede marcar más de una respuesta (por ejemplo para hernia discal se podría marcar más de un valor: cervical, dorsal, lumbar) o no (por ejemplo en hernia inguinal sólo se puede marcar un valor: derecha, izquierda o bilateral). <br>
    * @return The value of the <code>preguntaRespMultiple</code> attribute.
    */

    public Boolean getPreguntaRespMultiple()  {
    	Boolean value;
        value =  preguntaRespMultiple;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaRespMultiple</code> attribute.<br>
    * Model Attribute: <code>preguntaRespMultiple</code>. Variable Bool<br>
    * Comments: Indica i se puede marcar más de una respuesta (por ejemplo para hernia discal se podría marcar más de un valor: cervical, dorsal, lumbar) o no (por ejemplo en hernia inguinal sólo se puede marcar un valor: derecha, izquierda o bilateral). <br>
    * @param preguntaRespMultiple The new value of the <code>preguntaRespMultiple</code> attribute.
    */
    public void setPreguntaRespMultiple (Boolean preguntaRespMultiple) {
        modifiedPreguntaRespMultiple = true;
        this.preguntaRespMultiple = preguntaRespMultiple;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaRespMultiple</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaRespMultiple</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaRespMultiple() {
        return modifiedPreguntaRespMultiple;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaRespMultiple</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaRespMultiple</code>.
    */
    public void setModifiedPreguntaRespMultiple(boolean modified) {
        this.modifiedPreguntaRespMultiple = modified;
    }

   /**
    * Returns the value of the <code>preguntadrvValoresPosibles</code> attribute.<br>
    * Model Attribute: <code>preguntadrvValoresPosibles</code>. Variable String Size=255<br>
    * Comments: Comalista de los posibles valores que puede tomar esta pregunta<br>
    * @return The value of the <code>preguntadrvValoresPosibles</code> attribute.
    */

    @JsonIgnore
    public String getPreguntadrvValoresPosibles()  {
    	String value;
        try {
            value = preguntadrvValoresPosiblesDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: Pregunta, Attribute: preguntadrvValoresPosibles");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>preguntaSeEnviaAlCORE</code> attribute.<br>
    * Model Attribute: <code>preguntaSeEnviaAlCORE</code>. Variable Bool<br>
    * Comments: Se va a permitir crear preguntas en AE. Por tanto se debe indicar si esa pregunta se enviará al CORE o no. <br>
    * @return The value of the <code>preguntaSeEnviaAlCORE</code> attribute.
    */

    public Boolean getPreguntaSeEnviaAlCORE()  {
    	Boolean value;
        value =  preguntaSeEnviaAlCORE;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaSeEnviaAlCORE</code> attribute.<br>
    * Model Attribute: <code>preguntaSeEnviaAlCORE</code>. Variable Bool<br>
    * Comments: Se va a permitir crear preguntas en AE. Por tanto se debe indicar si esa pregunta se enviará al CORE o no. <br>
    * @param preguntaSeEnviaAlCORE The new value of the <code>preguntaSeEnviaAlCORE</code> attribute.
    */
    public void setPreguntaSeEnviaAlCORE (Boolean preguntaSeEnviaAlCORE) {
        modifiedPreguntaSeEnviaAlCORE = true;
        this.preguntaSeEnviaAlCORE = preguntaSeEnviaAlCORE;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaSeEnviaAlCORE</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaSeEnviaAlCORE</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaSeEnviaAlCORE() {
        return modifiedPreguntaSeEnviaAlCORE;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaSeEnviaAlCORE</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaSeEnviaAlCORE</code>.
    */
    public void setModifiedPreguntaSeEnviaAlCORE(boolean modified) {
        this.modifiedPreguntaSeEnviaAlCORE = modified;
    }

   /**
    * Returns the value of the <code>preguntaCondicionEdad</code> attribute.<br>
    * Model Attribute: <code>preguntaCondicionEdad</code>. Variable Nat<br>
    * Comments: GdC-14: Req 8
Indica si la pregunta está condicionada a la edad, podrá tener tres posibles valores: “No condicionada”, “Mayor o igual a” y “Menor o igual a”. 
Si se selecciona “No condicionada”, no será obligatorio diligenciar el dato “Nº de años”, en caso contrario será obligatorio.<br>
    * @return The value of the <code>preguntaCondicionEdad</code> attribute.
    */

    public Long getPreguntaCondicionEdad()  {
    	Long value;
        value =  preguntaCondicionEdad;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaCondicionEdad</code> attribute.<br>
    * Model Attribute: <code>preguntaCondicionEdad</code>. Variable Nat<br>
    * Comments: GdC-14: Req 8
Indica si la pregunta está condicionada a la edad, podrá tener tres posibles valores: “No condicionada”, “Mayor o igual a” y “Menor o igual a”. 
Si se selecciona “No condicionada”, no será obligatorio diligenciar el dato “Nº de años”, en caso contrario será obligatorio.<br>
    * @param preguntaCondicionEdad The new value of the <code>preguntaCondicionEdad</code> attribute.
    */
    public void setPreguntaCondicionEdad (Long preguntaCondicionEdad) {
        modifiedPreguntaCondicionEdad = true;
        this.preguntaCondicionEdad = preguntaCondicionEdad;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaCondicionEdad</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaCondicionEdad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaCondicionEdad() {
        return modifiedPreguntaCondicionEdad;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaCondicionEdad</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaCondicionEdad</code>.
    */
    public void setModifiedPreguntaCondicionEdad(boolean modified) {
        this.modifiedPreguntaCondicionEdad = modified;
    }

   /**
    * Returns the value of the <code>preguntaCondicionEdadAnyos</code> attribute.<br>
    * Model Attribute: <code>preguntaCondicionEdadAnyos</code>. Variable Nat<br>
    * Comments: Número de años en caso de estar condicionada por la edad del usuario<br>
    * @return The value of the <code>preguntaCondicionEdadAnyos</code> attribute.
    */

    public Long getPreguntaCondicionEdadAnyos()  {
    	Long value;
        value =  preguntaCondicionEdadAnyos;
        return value;
    }

   /**
    * Sets the value of the <code>preguntaCondicionEdadAnyos</code> attribute.<br>
    * Model Attribute: <code>preguntaCondicionEdadAnyos</code>. Variable Nat<br>
    * Comments: Número de años en caso de estar condicionada por la edad del usuario<br>
    * @param preguntaCondicionEdadAnyos The new value of the <code>preguntaCondicionEdadAnyos</code> attribute.
    */
    public void setPreguntaCondicionEdadAnyos (Long preguntaCondicionEdadAnyos) {
        modifiedPreguntaCondicionEdadAnyos = true;
        this.preguntaCondicionEdadAnyos = preguntaCondicionEdadAnyos;
    }

   /**
    * Returns the value of the <code>modifiedPreguntaCondicionEdadAnyos</code> class property.<br>
    *
    * @return The value of the <code>modifiedPreguntaCondicionEdadAnyos</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPreguntaCondicionEdadAnyos() {
        return modifiedPreguntaCondicionEdadAnyos;
    }

   /**
    * Sets the value of the <code>modifiedPreguntaCondicionEdadAnyos</code> class property.<br>
    * @param modified The new value of the <code>modifiedPreguntaCondicionEdadAnyos</code>.
    */
    public void setModifiedPreguntaCondicionEdadAnyos(boolean modified) {
        this.modifiedPreguntaCondicionEdadAnyos = modified;
    }

    /**
     * Returns the instance of <code>Valor</code> related through the <code>Valores</code> role.
     * Model Relationship:
     * <code>[Valor] Valores 0:M  ------ 0:M  Preguntas [Pregunta]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Valor</code> related through the <code>Valores</code> role.
     */
    @JsonIgnore
    public Collection <Valor> getValores() {
        return valores;
    }

    /**
     * Adds an instance of <code>Valor</code> related through the <code>Valores</code> role.
     * @param valores The instance to add to the <code>Valores</code> role.
     */
    public void add2Valores(Valor valores) {
        this.valores.add(valores);
    }
    /**
     * Removes an instance of <code>Valor</code> related through the <code>Valores</code> role.
     * @param valores The instance to be removed
     */
    public void removeFromValores(Valor valores) {
    	this.valores.remove(valores);
    }
    /**
     * Sets instances of <code>Valor</code> related through the <code>Valores</code> role.
     * @param valores The new value for the <code>Valores</code> role.
     */
    public void setValores(Collection < Valor > valores) {
        this.valores = valores;
    }

   /**
    * This method gets the attribute value <code>modifiedValores</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedValores</code> has been modified.
    */
    public boolean isModifiedValores(){
        return modifiedValores;
    }

    /**
     * Returns the instance of <code>PreguntaP</code> related through the <code>PreguntasPersona</code> role.
     * Model Relationship:
     * <code>[PreguntaP] PreguntasPersona 0:M  ------ 0:1  Pregunta [Pregunta]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PreguntaP</code> related through the <code>PreguntasPersona</code> role.
     */
    @JsonIgnore
    public Collection <PreguntaP> getPreguntasPersona() {
        return getPreguntaPRepository().findByPregunta(this);
    }

    /**
     * Adds an instance of <code>PreguntaP</code> related through the <code>PreguntasPersona</code> role.
     * @param preguntasPersona The instance to add to the <code>PreguntasPersona</code> role.
     */
    public void add2PreguntasPersona(PreguntaP preguntasPersona) {
        this.preguntasPersona.add(preguntasPersona);
    }
    /**
     * Removes an instance of <code>PreguntaP</code> related through the <code>PreguntasPersona</code> role.
     * @param preguntasPersona The instance to be removed
     */
    public void removeFromPreguntasPersona(PreguntaP preguntasPersona) {
    	this.preguntasPersona.remove(preguntasPersona);
    }
    /**
     * Sets instances of <code>PreguntaP</code> related through the <code>PreguntasPersona</code> role.
     * @param preguntasPersona The new value for the <code>PreguntasPersona</code> role.
     */
    public void setPreguntasPersona(Collection < PreguntaP > preguntasPersona) {
        this.preguntasPersona = preguntasPersona;
    }

   /**
    * This method gets the attribute value <code>modifiedPreguntasPersona</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPreguntasPersona</code> has been modified.
    */
    public boolean isModifiedPreguntasPersona(){
        return modifiedPreguntasPersona;
    }

    /**
     * Returns the instance of <code>Seccion</code> related through the <code>Seccion</code> role.
     * Model Relationship:
     * <code>[Seccion] Seccion 1:1  ------ 0:M  Preguntas [Pregunta]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Seccion</code> related through the <code>Seccion</code> role.
     */
    @JsonIgnore
    public Seccion getSeccion() {
        return seccion;
    }

    /**
     * Adds an instance of <code>Seccion</code> related through the <code>Seccion</code> role.
     * @param seccion The instance to add to the <code>Seccion</code> role.
     */
    public void add2Seccion(Seccion seccion) {
        if (seccion == null || seccion.isNull()) {
            this.modifiedSeccion = true;
            this.seccionIdentificador = null;
        } else {
            this.seccionIdentificador = seccion.getSeccionIdentificador();
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
     * Returns a Map with the values of the attributes.
     * @return Map with the values of the attributes.
     */
    @JsonIgnore
	@Override
    public Map<String, Object> getValues() {
        return values;
    }

    /**
     * Computes the value of the <code>preguntadrvValoresPosibles</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>preguntadrvValoresPosibles</code> derived attribute.
     */
    public String preguntadrvValoresPosiblesDerivations() {

        preguntadrvValoresPosibles = null;

        preguntadrvValoresPosiblesDerivationsDefault();
        return preguntadrvValoresPosibles;
    }

    private void preguntadrvValoresPosiblesDerivationsDefault() {
        if (preguntadrvValoresPosibles != null) return;
        // Default derivation
        // EFFECT   : fuformarListaValoresPregunta( THIS )
        preguntadrvValoresPosibles = userFunctionsSrv.fuformarListaValoresPreguntaFun(this);
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        preguntaNumOrden = Long.valueOf(0);
        preguntaDescripcion = "";
        preguntaValorSNObliga = false;
        preguntaObsOblig = false;
        preguntaEsNumero = false;
        preguntaValorMax = null;
        preguntaValorMin = null;
        preguntaSoloHombres = false;
        preguntaSoloMujeres = false;
        preguntaRespMultiple = false;
        preguntaSeEnviaAlCORE = false;
        preguntaCondicionEdad = Long.valueOf(0);
        preguntaCondicionEdadAnyos = null;
        valores = null;
        preguntasPersona = null;
        seccion = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
    }
    public PreguntaPJpaRepository getPreguntaPRepository() {
        return Arc.container().select(PreguntaPJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Pregunta.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PreguntaConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPreguntaNumOrden = false;
    	values.put("preguntaNumOrden", getPreguntaNumOrden());
    	modifiedPreguntaDescripcion = false;
    	values.put("preguntaDescripcion", getPreguntaDescripcion());
    	modifiedPreguntaValorSNObliga = false;
    	values.put("preguntaValorSNObliga", getPreguntaValorSNObliga());
    	modifiedPreguntaObsOblig = false;
    	values.put("preguntaObsOblig", getPreguntaObsOblig());
    	modifiedPreguntaEsNumero = false;
    	values.put("preguntaEsNumero", getPreguntaEsNumero());
    	modifiedPreguntaValorMax = false;
    	values.put("preguntaValorMax", getPreguntaValorMax());
    	modifiedPreguntaValorMin = false;
    	values.put("preguntaValorMin", getPreguntaValorMin());
    	modifiedPreguntaSoloHombres = false;
    	values.put("preguntaSoloHombres", getPreguntaSoloHombres());
    	modifiedPreguntaSoloMujeres = false;
    	values.put("preguntaSoloMujeres", getPreguntaSoloMujeres());
    	modifiedPreguntaRespMultiple = false;
    	values.put("preguntaRespMultiple", getPreguntaRespMultiple());
    	modifiedPreguntaSeEnviaAlCORE = false;
    	values.put("preguntaSeEnviaAlCORE", getPreguntaSeEnviaAlCORE());
    	modifiedPreguntaCondicionEdad = false;
    	values.put("preguntaCondicionEdad", getPreguntaCondicionEdad());
    	modifiedPreguntaCondicionEdadAnyos = false;
    	values.put("preguntaCondicionEdadAnyos", getPreguntaCondicionEdadAnyos());
    	modifiedValores = false;
    	modifiedPreguntasPersona = false;
    	modifiedSeccion = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            preguntadrvValoresPosibles = null;
    }

    /**
     * Returns the <code>PreguntaOid</code> object that identifies this instance of <code>Pregunta</code>.
     * @return <code>PreguntaOid </code> object that identifies this instance of <code>Pregunta</code>
     */
	@Override
    public PreguntaOid getOid() {
        return new PreguntaOid(getPreguntaNumero());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PreguntaConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(PreguntaConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PREGUNTA)) {
            // Add this class
            activeFacets.add(Constants.PREGUNTA);
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

    public String buildDSPreguntaIIU() {
        try {
            return getSeccion().getSeccionNombre() + " " + (getPreguntaNumero() != null ? getPreguntaNumero().toString() : "") + " " + (getPreguntaNumOrden() != null ? getPreguntaNumOrden().toString() : "") + " " + getPreguntaDescripcion() + " " + (getPreguntaValorSNObliga() != null ? getPreguntaValorSNObliga().toString() : "") + " " + (getPreguntaObsOblig() != null ? getPreguntaObsOblig().toString() : "") + " " + (getPreguntaEsNumero() != null ? getPreguntaEsNumero().toString() : "") + " " + (getPreguntaValorMin() != null ? getPreguntaValorMin().toString() : "") + " " + (getPreguntaValorMax() != null ? getPreguntaValorMax().toString() : "") + " " + (getPreguntaSoloHombres() != null ? getPreguntaSoloHombres().toString() : "") + " " + (getPreguntaSoloMujeres() != null ? getPreguntaSoloMujeres().toString() : "") + " " + (getPreguntaRespMultiple() != null ? getPreguntaRespMultiple().toString() : "") + " " + (getPreguntaCondicionEdad() != null ? getPreguntaCondicionEdad().toString() : "") + " " + (getPreguntaCondicionEdadAnyos() != null ? getPreguntaCondicionEdadAnyos().toString() : "") + " " + getPreguntadrvValoresPosibles();
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
            relatedInstance = buildPreguntaRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreguntaConstants.ROLE_NAME_VALORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaRelatedInstance4Valor(relatedInstanceJsonOid, remainingPath);
        }
        if (PreguntaConstants.ROLE_NAME_PREGUNTASPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaRelatedInstance4PreguntaP(relatedInstanceJsonOid, remainingPath);
        }
        if (PreguntaConstants.ROLE_NAME_SECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaRelatedInstance4Seccion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPreguntaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pregunta.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPreguntaRelatedInstance4Valor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Valor(mapper.readValue(relatedInstanceJsonOid, ValorOid.class)): Valor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pregunta.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPreguntaRelatedInstance4PreguntaP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PreguntaP(mapper.readValue(relatedInstanceJsonOid, PreguntaPOid.class)): PreguntaP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pregunta.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPreguntaRelatedInstance4Seccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Seccion(mapper.readValue(relatedInstanceJsonOid, SeccionOid.class)): Seccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pregunta.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
