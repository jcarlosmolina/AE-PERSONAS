package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FrecuenciaActConstants;
import com.keralty.aepersonas.persistence.oid.FrecuenciaActOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>FrecuenciaAct</code> model class.
 * <p>
 * Model Class: <code>FrecuenciaAct</code><br>
 */
@Entity(name = FrecuenciaActConstants.CLASS_NAME)
@Table(name = FrecuenciaActConstants.TBL_NAME)
public class FrecuenciaAct extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FrecuenciaAct_Sequence")
    @SequenceGenerator(name="FrecuenciaAct_Sequence", sequenceName="FrecuenciaAct_Sequence", allocationSize=1)
    @Column(name = FrecuenciaActConstants.FLD_FRECUENCIAACTCODIGO )
    @JsonProperty(value="codigo")
    private Long frecuenciaActCodigo;

    /** Class member attribute. */
    @Column(name = FrecuenciaActConstants.FLD_FRECUENCIAACTPARAMETRICA )
    @JsonProperty(value="parametrica")
    private Long frecuenciaActParametrica;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFrecuenciaActParametrica;

    /** Class member attribute. */
    @Column(name = FrecuenciaActConstants.FLD_FRECUENCIAACTFRECUENCIA )
    @JsonProperty(value="frecuencia")
    private Long frecuenciaActFrecuencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFrecuenciaActFrecuencia;

    /** Class member attribute. */
    @Column(name = FrecuenciaActConstants.FLD_FRECUENCIAACTFECHAULTIMASINC )
    @JsonProperty(value="fechaultimasinc")
    private Date frecuenciaActFechaUltimaSinc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFrecuenciaActFechaUltimaSinc;

    /** Class member attribute. */
    @Column(name = FrecuenciaActConstants.FLD_FRECUENCIAACTRESULTADOSINC )
    @JsonProperty(value="resultadosinc")
    private String frecuenciaActResultadoSinc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFrecuenciaActResultadoSinc;

    /** Class member attribute. */
    @Column(name = FrecuenciaActConstants.FLD_FRECUENCIAACTUSUARIO )
    @JsonProperty(value="usuario")
    private String frecuenciaActUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFrecuenciaActUsuario;

    /** Class member attribute. */
    @Column(name = FrecuenciaActConstants.FLD_FRECUENCIAACTNOMBREUSUARIO )
    @JsonProperty(value="nombreusuario")
    private String frecuenciaActNombreUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFrecuenciaActNombreUsuario;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnombreparametrica")
    protected String frecuenciaActdrvNombreParametrica;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public FrecuenciaAct() {
        frecuenciaActCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>FrecuenciaAct</code>.
     * @param oid Object Identifier of the instance of <code>FrecuenciaAct</code> to be created.
     * @throws SystemException
     */
    public FrecuenciaAct(FrecuenciaActOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            frecuenciaActCodigo = oid.getFrecuenciaActCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>frecuenciaActCodigo</code> attribute<br>in class <code>FrecuenciaAct</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FrecuenciaAct</code>
     * @return The value of the <code>frecuenciaActCodigo</code> attribute<br>in class <code>FrecuenciaAct</code>.
     */
    public Long getFrecuenciaActCodigo() {
        return frecuenciaActCodigo;
    }

    /**
     * Sets the value of the <code>frecuenciaActCodigo</code> attribute<br>in class <code>FrecuenciaAct</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FrecuenciaAct</code>
     * @param frecuenciaActCodigo The new value of the <code>frecuenciaActCodigo</code> attribute<br>in class <code>FrecuenciaAct</code>.
     */
    public void setFrecuenciaActCodigo(Long frecuenciaActCodigo) {
        this.frecuenciaActCodigo = frecuenciaActCodigo;
    }

   /**
    * Returns the value of the <code>frecuenciaActParametrica</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActParametrica</code>. Constant Nat<br>
    * Comments: El nombre de la paramétrica a actualizar. Se muestra con selección definida<br>
    * @return The value of the <code>frecuenciaActParametrica</code> attribute.
    */

    public Long getFrecuenciaActParametrica()  {
    	Long value;
        value =  frecuenciaActParametrica;
        return value;
    }

   /**
    * Sets the value of the <code>frecuenciaActParametrica</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActParametrica</code>. Constant Nat<br>
    * Comments: El nombre de la paramétrica a actualizar. Se muestra con selección definida<br>
    * @param frecuenciaActParametrica The new value of the <code>frecuenciaActParametrica</code> attribute.
    */
    public void setFrecuenciaActParametrica (Long frecuenciaActParametrica) {
        modifiedFrecuenciaActParametrica = true;
        this.frecuenciaActParametrica = frecuenciaActParametrica;
    }

   /**
    * Returns the value of the <code>modifiedFrecuenciaActParametrica</code> class property.<br>
    *
    * @return The value of the <code>modifiedFrecuenciaActParametrica</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFrecuenciaActParametrica() {
        return modifiedFrecuenciaActParametrica;
    }

   /**
    * Sets the value of the <code>modifiedFrecuenciaActParametrica</code> class property.<br>
    * @param modified The new value of the <code>modifiedFrecuenciaActParametrica</code>.
    */
    public void setModifiedFrecuenciaActParametrica(boolean modified) {
        this.modifiedFrecuenciaActParametrica = modified;
    }

   /**
    * Returns the value of the <code>frecuenciaActFrecuencia</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActFrecuencia</code>. Variable Int<br>
    * Comments: Es el número de días que pueden pasar sin volver a actualizar esta tablas paramétrica<br>
    * @return The value of the <code>frecuenciaActFrecuencia</code> attribute.
    */

    public Long getFrecuenciaActFrecuencia()  {
    	Long value;
        value =  frecuenciaActFrecuencia;
        return value;
    }

   /**
    * Sets the value of the <code>frecuenciaActFrecuencia</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActFrecuencia</code>. Variable Int<br>
    * Comments: Es el número de días que pueden pasar sin volver a actualizar esta tablas paramétrica<br>
    * @param frecuenciaActFrecuencia The new value of the <code>frecuenciaActFrecuencia</code> attribute.
    */
    public void setFrecuenciaActFrecuencia (Long frecuenciaActFrecuencia) {
        modifiedFrecuenciaActFrecuencia = true;
        this.frecuenciaActFrecuencia = frecuenciaActFrecuencia;
    }

   /**
    * Returns the value of the <code>modifiedFrecuenciaActFrecuencia</code> class property.<br>
    *
    * @return The value of the <code>modifiedFrecuenciaActFrecuencia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFrecuenciaActFrecuencia() {
        return modifiedFrecuenciaActFrecuencia;
    }

   /**
    * Sets the value of the <code>modifiedFrecuenciaActFrecuencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedFrecuenciaActFrecuencia</code>.
    */
    public void setModifiedFrecuenciaActFrecuencia(boolean modified) {
        this.modifiedFrecuenciaActFrecuencia = modified;
    }

   /**
    * Returns the value of the <code>frecuenciaActFechaUltimaSinc</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActFechaUltimaSinc</code>. Variable Date<br>
    * Comments: Fecha de la última sincronización<br>
    * @return The value of the <code>frecuenciaActFechaUltimaSinc</code> attribute.
    */

    public Date getFrecuenciaActFechaUltimaSinc()  {
    	Date value;
        value =  frecuenciaActFechaUltimaSinc;
        return value;
    }

   /**
    * Sets the value of the <code>frecuenciaActFechaUltimaSinc</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActFechaUltimaSinc</code>. Variable Date<br>
    * Comments: Fecha de la última sincronización<br>
    * @param frecuenciaActFechaUltimaSinc The new value of the <code>frecuenciaActFechaUltimaSinc</code> attribute.
    */
    public void setFrecuenciaActFechaUltimaSinc (Date frecuenciaActFechaUltimaSinc) {
        modifiedFrecuenciaActFechaUltimaSinc = true;
        this.frecuenciaActFechaUltimaSinc = frecuenciaActFechaUltimaSinc;
    }

   /**
    * Returns the value of the <code>modifiedFrecuenciaActFechaUltimaSinc</code> class property.<br>
    *
    * @return The value of the <code>modifiedFrecuenciaActFechaUltimaSinc</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFrecuenciaActFechaUltimaSinc() {
        return modifiedFrecuenciaActFechaUltimaSinc;
    }

   /**
    * Sets the value of the <code>modifiedFrecuenciaActFechaUltimaSinc</code> class property.<br>
    * @param modified The new value of the <code>modifiedFrecuenciaActFechaUltimaSinc</code>.
    */
    public void setModifiedFrecuenciaActFechaUltimaSinc(boolean modified) {
        this.modifiedFrecuenciaActFechaUltimaSinc = modified;
    }

   /**
    * Returns the value of the <code>frecuenciaActResultadoSinc</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActResultadoSinc</code>. Variable String Size=255<br>
    * Comments: El texto del error si ha habido o todo OK si no.<br>
    * @return The value of the <code>frecuenciaActResultadoSinc</code> attribute.
    */

    public String getFrecuenciaActResultadoSinc()  {
    	String value;
        value =  frecuenciaActResultadoSinc;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>frecuenciaActResultadoSinc</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActResultadoSinc</code>. Variable String Size=255<br>
    * Comments: El texto del error si ha habido o todo OK si no.<br>
    * @param frecuenciaActResultadoSinc The new value of the <code>frecuenciaActResultadoSinc</code> attribute.
    */
    public void setFrecuenciaActResultadoSinc (String frecuenciaActResultadoSinc) {
        modifiedFrecuenciaActResultadoSinc = true;
        this.frecuenciaActResultadoSinc = frecuenciaActResultadoSinc;
    }

   /**
    * Returns the value of the <code>modifiedFrecuenciaActResultadoSinc</code> class property.<br>
    *
    * @return The value of the <code>modifiedFrecuenciaActResultadoSinc</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFrecuenciaActResultadoSinc() {
        return modifiedFrecuenciaActResultadoSinc;
    }

   /**
    * Sets the value of the <code>modifiedFrecuenciaActResultadoSinc</code> class property.<br>
    * @param modified The new value of the <code>modifiedFrecuenciaActResultadoSinc</code>.
    */
    public void setModifiedFrecuenciaActResultadoSinc(boolean modified) {
        this.modifiedFrecuenciaActResultadoSinc = modified;
    }

   /**
    * Returns the value of the <code>frecuenciaActUsuario</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActUsuario</code>. Variable String Size=50<br>
    * Comments: Por si la última sincronización se hizo bajo demanda, registraría el usuario que la solicitó.<br>
    * @return The value of the <code>frecuenciaActUsuario</code> attribute.
    */

    public String getFrecuenciaActUsuario()  {
    	String value;
        value =  frecuenciaActUsuario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>frecuenciaActUsuario</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActUsuario</code>. Variable String Size=50<br>
    * Comments: Por si la última sincronización se hizo bajo demanda, registraría el usuario que la solicitó.<br>
    * @param frecuenciaActUsuario The new value of the <code>frecuenciaActUsuario</code> attribute.
    */
    public void setFrecuenciaActUsuario (String frecuenciaActUsuario) {
        modifiedFrecuenciaActUsuario = true;
        this.frecuenciaActUsuario = frecuenciaActUsuario;
    }

   /**
    * Returns the value of the <code>modifiedFrecuenciaActUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedFrecuenciaActUsuario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFrecuenciaActUsuario() {
        return modifiedFrecuenciaActUsuario;
    }

   /**
    * Sets the value of the <code>modifiedFrecuenciaActUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedFrecuenciaActUsuario</code>.
    */
    public void setModifiedFrecuenciaActUsuario(boolean modified) {
        this.modifiedFrecuenciaActUsuario = modified;
    }

   /**
    * Returns the value of the <code>frecuenciaActNombreUsuario</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActNombreUsuario</code>. Variable String Size=255<br>
    * Comments: Por si la última sincronización se hizo bajo demanda, registraría el nombre del usuario que la solicitó.<br>
    * @return The value of the <code>frecuenciaActNombreUsuario</code> attribute.
    */

    public String getFrecuenciaActNombreUsuario()  {
    	String value;
        value =  frecuenciaActNombreUsuario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>frecuenciaActNombreUsuario</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActNombreUsuario</code>. Variable String Size=255<br>
    * Comments: Por si la última sincronización se hizo bajo demanda, registraría el nombre del usuario que la solicitó.<br>
    * @param frecuenciaActNombreUsuario The new value of the <code>frecuenciaActNombreUsuario</code> attribute.
    */
    public void setFrecuenciaActNombreUsuario (String frecuenciaActNombreUsuario) {
        modifiedFrecuenciaActNombreUsuario = true;
        this.frecuenciaActNombreUsuario = frecuenciaActNombreUsuario;
    }

   /**
    * Returns the value of the <code>modifiedFrecuenciaActNombreUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedFrecuenciaActNombreUsuario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFrecuenciaActNombreUsuario() {
        return modifiedFrecuenciaActNombreUsuario;
    }

   /**
    * Sets the value of the <code>modifiedFrecuenciaActNombreUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedFrecuenciaActNombreUsuario</code>.
    */
    public void setModifiedFrecuenciaActNombreUsuario(boolean modified) {
        this.modifiedFrecuenciaActNombreUsuario = modified;
    }

   /**
    * Returns the value of the <code>frecuenciaActdrvNombreParametrica</code> attribute.<br>
    * Model Attribute: <code>frecuenciaActdrvNombreParametrica</code>. Variable String Size=100<br>
    * Comments: Atributo a borrar cuando la información complementaria muestre el valor de la selección definida en vez del código. Sólo se usará para la IC<br>
    * @return The value of the <code>frecuenciaActdrvNombreParametrica</code> attribute.
    */

    @JsonIgnore
    public String getFrecuenciaActdrvNombreParametrica()  {
    	String value;
        try {
            value = frecuenciaActdrvNombreParametricaDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: FrecuenciaAct, Attribute: frecuenciaActdrvNombreParametrica");
        }
        return (value == null ? null : value.trim());
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
     * Computes the value of the <code>frecuenciaActdrvNombreParametrica</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>frecuenciaActdrvNombreParametrica</code> derived attribute.
     */
    public String frecuenciaActdrvNombreParametricaDerivations() {

        frecuenciaActdrvNombreParametrica = null;

        frecuenciaActdrvNombreParametricaDerivationsConditional1();
        frecuenciaActdrvNombreParametricaDerivationsConditional2();
        frecuenciaActdrvNombreParametricaDerivationsConditional3();
        frecuenciaActdrvNombreParametricaDerivationsConditional4();
        frecuenciaActdrvNombreParametricaDerivationsConditional5();
        frecuenciaActdrvNombreParametricaDerivationsConditional6();
        frecuenciaActdrvNombreParametricaDerivationsConditional7();
        frecuenciaActdrvNombreParametricaDerivationsConditional8();
        frecuenciaActdrvNombreParametricaDerivationsConditional9();
        frecuenciaActdrvNombreParametricaDerivationsConditional10();
        frecuenciaActdrvNombreParametricaDerivationsConditional11();
        frecuenciaActdrvNombreParametricaDerivationsConditional12();
        frecuenciaActdrvNombreParametricaDerivationsConditional13();
        frecuenciaActdrvNombreParametricaDerivationsConditional14();
        frecuenciaActdrvNombreParametricaDerivationsConditional15();
        frecuenciaActdrvNombreParametricaDerivationsConditional16();
        frecuenciaActdrvNombreParametricaDerivationsConditional17();
        frecuenciaActdrvNombreParametricaDerivationsConditional18();
        frecuenciaActdrvNombreParametricaDerivationsConditional19();
        frecuenciaActdrvNombreParametricaDerivationsConditional20();
        frecuenciaActdrvNombreParametricaDerivationsConditional21();
        frecuenciaActdrvNombreParametricaDerivationsConditional22();
        frecuenciaActdrvNombreParametricaDerivationsConditional23();
        frecuenciaActdrvNombreParametricaDerivationsConditional24();
        frecuenciaActdrvNombreParametricaDerivationsConditional25();
        frecuenciaActdrvNombreParametricaDerivationsConditional26();
        frecuenciaActdrvNombreParametricaDerivationsConditional27();
        frecuenciaActdrvNombreParametricaDerivationsConditional28();
        frecuenciaActdrvNombreParametricaDerivationsDefault();
        return frecuenciaActdrvNombreParametrica;
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional1() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 1
        // EFFECT   : \"Plan\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(1));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Plan";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional2() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 2
        // EFFECT   : \"Producto\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(2));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Producto";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional3() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 3
        // EFFECT   : \"Grupo asociado\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(3));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Grupo asociado";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional4() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 4
        // EFFECT   : \"Asesor\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(4));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Asesor";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional5() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 5
        // EFFECT   : \"Departamento\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(5));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Departamento";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional6() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 6
        // EFFECT   : \"Municipio\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(6));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Municipio";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional7() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 7
        // EFFECT   : \"Estado civil\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(7));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Estado civil";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional8() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 8
        // EFFECT   : \"Localización\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(8));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Localización";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional9() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 9
        // EFFECT   : \"EPS\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(9));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "EPS";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional10() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 10
        // EFFECT   : \"Parentesco\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(10));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Parentesco";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional11() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 11
        // EFFECT   : \"Empresa\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(11));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Empresa";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional12() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 12
        // EFFECT   : \"Periodicidad de pago\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(12));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Periodicidad de pago";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional13() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 13
        // EFFECT   : \"Tarifas\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(13));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Tarifas";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional14() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 14
        // EFFECT   : \"Tipos de IVA\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(14));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Tipos de IVA";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional15() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 15
        // EFFECT   : \"Forma de pago\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(15));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Forma de pago";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional16() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 16
        // EFFECT   : \"Sucursal\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(16));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Sucursal";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional17() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 17
        // EFFECT   : \"Estados de contrato\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(17));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Estados de contrato";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional18() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 18
        // EFFECT   : \"Tipos de dirección\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(18));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Tipos de dirección";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional19() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 19
        // EFFECT   : \"Tipos de identificación\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(19));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Tipos de identificación";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional20() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 20
        // EFFECT   : \"Estados del beneficiario\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(20));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Estados del beneficiario";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional21() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 21
        // EFFECT   : \"Regional\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(21));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Regional";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional22() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 22
        // EFFECT   : \"Estados persona\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(22));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Estados persona";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional23() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 23
        // EFFECT   : \"País\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(23));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "País";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional24() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 24
        // EFFECT   : \"Entidades financieras\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(24));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Entidades financieras";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional25() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 25
        // EFFECT   : \"Tipos de entidades\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(25));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Tipos de entidades";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional26() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 26
        // EFFECT   : \"Tipos de institución\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(26));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Tipos de institución";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional27() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 27
        // EFFECT   : \"Tipos de sucursal\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(27));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Tipos de sucursal";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsConditional28() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // CONDITION: Parametrica = 28
        // EFFECT   : \"Agentes x Producto\"
        boolean frecuenciaActdrvNombreParametricaCond = (this.getFrecuenciaActParametrica()).equals(Long.valueOf(28));
        if (frecuenciaActdrvNombreParametricaCond) {
            frecuenciaActdrvNombreParametrica = "Agentes x Producto";
        }
    }

    private void frecuenciaActdrvNombreParametricaDerivationsDefault() {
        if (frecuenciaActdrvNombreParametrica != null) return;
        // Default derivation
        // EFFECT   : \"Desconocido\"
        frecuenciaActdrvNombreParametrica = "Desconocido";
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        frecuenciaActParametrica = Long.valueOf(0);
        frecuenciaActFrecuencia = Long.valueOf(0);
        frecuenciaActFechaUltimaSinc = null;
        frecuenciaActResultadoSinc = null;
        frecuenciaActUsuario = null;
        frecuenciaActNombreUsuario = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return FrecuenciaAct.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return FrecuenciaActConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedFrecuenciaActParametrica = false;
    	values.put("frecuenciaActParametrica", getFrecuenciaActParametrica());
    	modifiedFrecuenciaActFrecuencia = false;
    	values.put("frecuenciaActFrecuencia", getFrecuenciaActFrecuencia());
    	modifiedFrecuenciaActFechaUltimaSinc = false;
    	values.put("frecuenciaActFechaUltimaSinc", getFrecuenciaActFechaUltimaSinc());
    	modifiedFrecuenciaActResultadoSinc = false;
    	values.put("frecuenciaActResultadoSinc", getFrecuenciaActResultadoSinc());
    	modifiedFrecuenciaActUsuario = false;
    	values.put("frecuenciaActUsuario", getFrecuenciaActUsuario());
    	modifiedFrecuenciaActNombreUsuario = false;
    	values.put("frecuenciaActNombreUsuario", getFrecuenciaActNombreUsuario());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            frecuenciaActdrvNombreParametrica = null;
    }

    /**
     * Returns the <code>FrecuenciaActOid</code> object that identifies this instance of <code>FrecuenciaAct</code>.
     * @return <code>FrecuenciaActOid </code> object that identifies this instance of <code>FrecuenciaAct</code>
     */
	@Override
    public FrecuenciaActOid getOid() {
        return new FrecuenciaActOid(getFrecuenciaActCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(FrecuenciaActConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.FRECUENCIAACT)) {
            // Add this class
            activeFacets.add(Constants.FRECUENCIAACT);
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
            relatedInstance = buildFrecuenciaActRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFrecuenciaActRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FrecuenciaAct(mapper.readValue(relatedInstanceJsonOid, FrecuenciaActOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FrecuenciaAct.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
