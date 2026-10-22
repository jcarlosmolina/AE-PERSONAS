package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.global.FamiliaNovedadConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.NovedadMDConstants;
import com.keralty.aepersonas.global.PaisConstants;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.FamiliaNovedadOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.NovedadMDOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
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
 * Persistent representation of the <code>NovedadMD</code> model class.
 * <p>
 * Model Class: <code>NovedadMD</code><br>
 */
@Entity(name = NovedadMDConstants.CLASS_NAME)
@Table(name = NovedadMDConstants.TBL_NAME)
public class NovedadMD extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NovedadMD_Sequence")
    @SequenceGenerator(name="NovedadMD_Sequence", sequenceName="NovedadMD_Sequence", allocationSize=1)
    @Column(name = NovedadMDConstants.FLD_NOVEDADMDIDNOVEDADMD )
    @JsonProperty(value="id_novedadmd")
    private Long novedadMDidNovedadMD;

    /** Class member attribute. */
    @Column(name = NovedadMDConstants.FLD_NOVEDADMDDIRECCIONCOMPLETA )
    @JsonProperty(value="direccioncompleta")
    private String novedadMDDireccionCompleta;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadMDDireccionCompleta;

    /** Class member attribute. */
    @Column(name = NovedadMDConstants.FLD_NOVEDADMDRURAL )
    @JsonProperty(value="rural")
    private Boolean novedadMDRural;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadMDRural;

    /** Class member attribute. */
    @Column(name = NovedadMDConstants.FLD_NOVEDADMDTELEFONOFIJO )
    @JsonProperty(value="telefonofijo")
    private String novedadMDTelefonoFijo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadMDTelefonoFijo;

    /** Class member attribute. */
    @Column(name = NovedadMDConstants.FLD_NOVEDADMDTELEFONOCELULAR )
    @JsonProperty(value="telefonocelular")
    private String novedadMDTelefonoCelular;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadMDTelefonoCelular;

    /** Class member attribute. */
    @Column(name = NovedadMDConstants.FLD_NOVEDADMDCORREOELECTRONICO )
    @JsonProperty(value="correoelectronico")
    private String novedadMDCorreoElectronico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedadMDCorreoElectronico;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadMDConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD, referencedColumnName=FamiliaNovedadConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD)
    })
    @JsonIgnore
    private FamiliaNovedad familiaNovedad;
    /** Related attribute. */
    @Column(name = NovedadMDConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD, insertable = false, updatable = false)
    private Long familiaNovedadidFamiliaNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadMDConstants.FLD_PAISCODIGO, referencedColumnName=PaisConstants.FLD_PAISCODIGO)
    })
    @JsonIgnore
    private Pais pais;
    /** Related attribute. */
    @Column(name = NovedadMDConstants.FLD_PAISCODIGO, insertable = false, updatable = false)
    private String paisCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPais;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadMDConstants.FLD_DEPARTAMENTODEPARTAMENTOCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamento;
    /** Related attribute. */
    @Column(name = NovedadMDConstants.FLD_DEPARTAMENTODEPARTAMENTOCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamento;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=NovedadMDConstants.FLD_MUNICIPIOMUNICIPIOCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipio;
    /** Related attribute. */
    @Column(name = NovedadMDConstants.FLD_MUNICIPIOMUNICIPIOCODIGO, insertable = false, updatable = false)
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
    public NovedadMD() {
        novedadMDidNovedadMD = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>NovedadMD</code>.
     * @param oid Object Identifier of the instance of <code>NovedadMD</code> to be created.
     * @throws SystemException
     */
    public NovedadMD(NovedadMDOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            novedadMDidNovedadMD = oid.getNovedadMDidNovedadMD();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>novedadMDidNovedadMD</code> attribute<br>in class <code>NovedadMD</code>.
     * This is part of the identification for this class, which depends on the identification of <code>NovedadMD</code>
     * @return The value of the <code>novedadMDidNovedadMD</code> attribute<br>in class <code>NovedadMD</code>.
     */
    public Long getNovedadMDidNovedadMD() {
        return novedadMDidNovedadMD;
    }

    /**
     * Sets the value of the <code>novedadMDidNovedadMD</code> attribute<br>in class <code>NovedadMD</code>.
     * This is part of the identification for this class, which depends on the identification of <code>NovedadMD</code>
     * @param novedadMDidNovedadMD The new value of the <code>novedadMDidNovedadMD</code> attribute<br>in class <code>NovedadMD</code>.
     */
    public void setNovedadMDidNovedadMD(Long novedadMDidNovedadMD) {
        this.novedadMDidNovedadMD = novedadMDidNovedadMD;
    }

   /**
    * Returns the value of the <code>novedadMDDireccionCompleta</code> attribute.<br>
    * Model Attribute: <code>novedadMDDireccionCompleta</code>. Constant String Size=250<br>
    * Comments: <br>
    * @return The value of the <code>novedadMDDireccionCompleta</code> attribute.
    */

    public String getNovedadMDDireccionCompleta()  {
    	String value;
        value =  novedadMDDireccionCompleta;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadMDDireccionCompleta</code> attribute.<br>
    * Model Attribute: <code>novedadMDDireccionCompleta</code>. Constant String Size=250<br>
    * Comments: <br>
    * @param novedadMDDireccionCompleta The new value of the <code>novedadMDDireccionCompleta</code> attribute.
    */
    public void setNovedadMDDireccionCompleta (String novedadMDDireccionCompleta) {
        modifiedNovedadMDDireccionCompleta = true;
        this.novedadMDDireccionCompleta = novedadMDDireccionCompleta;
    }

   /**
    * Returns the value of the <code>modifiedNovedadMDDireccionCompleta</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadMDDireccionCompleta</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadMDDireccionCompleta() {
        return modifiedNovedadMDDireccionCompleta;
    }

   /**
    * Sets the value of the <code>modifiedNovedadMDDireccionCompleta</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadMDDireccionCompleta</code>.
    */
    public void setModifiedNovedadMDDireccionCompleta(boolean modified) {
        this.modifiedNovedadMDDireccionCompleta = modified;
    }

   /**
    * Returns the value of the <code>novedadMDRural</code> attribute.<br>
    * Model Attribute: <code>novedadMDRural</code>. Constant Bool<br>
    * Comments: <Options>
RADIO=1;
</Options>

Si la dirección es rural<br>
    * @return The value of the <code>novedadMDRural</code> attribute.
    */

    public Boolean getNovedadMDRural()  {
    	Boolean value;
        value =  novedadMDRural;
        return value;
    }

   /**
    * Sets the value of the <code>novedadMDRural</code> attribute.<br>
    * Model Attribute: <code>novedadMDRural</code>. Constant Bool<br>
    * Comments: <Options>
RADIO=1;
</Options>

Si la dirección es rural<br>
    * @param novedadMDRural The new value of the <code>novedadMDRural</code> attribute.
    */
    public void setNovedadMDRural (Boolean novedadMDRural) {
        modifiedNovedadMDRural = true;
        this.novedadMDRural = novedadMDRural;
    }

   /**
    * Returns the value of the <code>modifiedNovedadMDRural</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadMDRural</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadMDRural() {
        return modifiedNovedadMDRural;
    }

   /**
    * Sets the value of the <code>modifiedNovedadMDRural</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadMDRural</code>.
    */
    public void setModifiedNovedadMDRural(boolean modified) {
        this.modifiedNovedadMDRural = modified;
    }

   /**
    * Returns the value of the <code>novedadMDTelefonoFijo</code> attribute.<br>
    * Model Attribute: <code>novedadMDTelefonoFijo</code>. Constant String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>novedadMDTelefonoFijo</code> attribute.
    */

    public String getNovedadMDTelefonoFijo()  {
    	String value;
        value =  novedadMDTelefonoFijo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadMDTelefonoFijo</code> attribute.<br>
    * Model Attribute: <code>novedadMDTelefonoFijo</code>. Constant String Size=15<br>
    * Comments: <br>
    * @param novedadMDTelefonoFijo The new value of the <code>novedadMDTelefonoFijo</code> attribute.
    */
    public void setNovedadMDTelefonoFijo (String novedadMDTelefonoFijo) {
        modifiedNovedadMDTelefonoFijo = true;
        this.novedadMDTelefonoFijo = novedadMDTelefonoFijo;
    }

   /**
    * Returns the value of the <code>modifiedNovedadMDTelefonoFijo</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadMDTelefonoFijo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadMDTelefonoFijo() {
        return modifiedNovedadMDTelefonoFijo;
    }

   /**
    * Sets the value of the <code>modifiedNovedadMDTelefonoFijo</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadMDTelefonoFijo</code>.
    */
    public void setModifiedNovedadMDTelefonoFijo(boolean modified) {
        this.modifiedNovedadMDTelefonoFijo = modified;
    }

   /**
    * Returns the value of the <code>novedadMDTelefonoCelular</code> attribute.<br>
    * Model Attribute: <code>novedadMDTelefonoCelular</code>. Constant String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>novedadMDTelefonoCelular</code> attribute.
    */

    public String getNovedadMDTelefonoCelular()  {
    	String value;
        value =  novedadMDTelefonoCelular;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadMDTelefonoCelular</code> attribute.<br>
    * Model Attribute: <code>novedadMDTelefonoCelular</code>. Constant String Size=15<br>
    * Comments: <br>
    * @param novedadMDTelefonoCelular The new value of the <code>novedadMDTelefonoCelular</code> attribute.
    */
    public void setNovedadMDTelefonoCelular (String novedadMDTelefonoCelular) {
        modifiedNovedadMDTelefonoCelular = true;
        this.novedadMDTelefonoCelular = novedadMDTelefonoCelular;
    }

   /**
    * Returns the value of the <code>modifiedNovedadMDTelefonoCelular</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadMDTelefonoCelular</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadMDTelefonoCelular() {
        return modifiedNovedadMDTelefonoCelular;
    }

   /**
    * Sets the value of the <code>modifiedNovedadMDTelefonoCelular</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadMDTelefonoCelular</code>.
    */
    public void setModifiedNovedadMDTelefonoCelular(boolean modified) {
        this.modifiedNovedadMDTelefonoCelular = modified;
    }

   /**
    * Returns the value of the <code>novedadMDCorreoElectronico</code> attribute.<br>
    * Model Attribute: <code>novedadMDCorreoElectronico</code>. Constant String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>novedadMDCorreoElectronico</code> attribute.
    */

    public String getNovedadMDCorreoElectronico()  {
    	String value;
        value =  novedadMDCorreoElectronico;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>novedadMDCorreoElectronico</code> attribute.<br>
    * Model Attribute: <code>novedadMDCorreoElectronico</code>. Constant String Size=100<br>
    * Comments: <br>
    * @param novedadMDCorreoElectronico The new value of the <code>novedadMDCorreoElectronico</code> attribute.
    */
    public void setNovedadMDCorreoElectronico (String novedadMDCorreoElectronico) {
        modifiedNovedadMDCorreoElectronico = true;
        this.novedadMDCorreoElectronico = novedadMDCorreoElectronico;
    }

   /**
    * Returns the value of the <code>modifiedNovedadMDCorreoElectronico</code> class property.<br>
    *
    * @return The value of the <code>modifiedNovedadMDCorreoElectronico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedNovedadMDCorreoElectronico() {
        return modifiedNovedadMDCorreoElectronico;
    }

   /**
    * Sets the value of the <code>modifiedNovedadMDCorreoElectronico</code> class property.<br>
    * @param modified The new value of the <code>modifiedNovedadMDCorreoElectronico</code>.
    */
    public void setModifiedNovedadMDCorreoElectronico(boolean modified) {
        this.modifiedNovedadMDCorreoElectronico = modified;
    }

    /**
     * Returns the instance of <code>FamiliaNovedad</code> related through the <code>FamiliaNovedad</code> role.
     * Model Relationship:
     * <code>[FamiliaNovedad] FamiliaNovedad 1:1  ------ 0:1  NovedadMD [NovedadMD]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>FamiliaNovedad</code> related through the <code>FamiliaNovedad</code> role.
     */
    @JsonIgnore
    public FamiliaNovedad getFamiliaNovedad() {
        return familiaNovedad;
    }

    /**
     * Adds an instance of <code>FamiliaNovedad</code> related through the <code>FamiliaNovedad</code> role.
     * @param familiaNovedad The instance to add to the <code>FamiliaNovedad</code> role.
     */
    public void add2FamiliaNovedad(FamiliaNovedad familiaNovedad) {
        if (familiaNovedad == null || familiaNovedad.isNull()) {
            this.modifiedFamiliaNovedad = true;
            this.familiaNovedadidFamiliaNovedad = null;
        } else {
            this.familiaNovedadidFamiliaNovedad = familiaNovedad.getFamiliaNovedadidFamiliaNovedad();
        }
        this.familiaNovedad = (familiaNovedad == null  || familiaNovedad.isNull() ? null : familiaNovedad);
    }

   /**
    * This method gets the attribute value <code>modifiedFamiliaNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFamiliaNovedad</code> has been modified.
    */
    public boolean isModifiedFamiliaNovedad(){
        return modifiedFamiliaNovedad;
    }

    /**
     * Returns the instance of <code>Pais</code> related through the <code>Pais</code> role.
     * Model Relationship:
     * <code>[Pais] Pais 0:1  ------ 0:M  NovedadesMD [NovedadMD]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Pais</code> related through the <code>Pais</code> role.
     */
    @JsonIgnore
    public Pais getPais() {
        return pais;
    }

    /**
     * Adds an instance of <code>Pais</code> related through the <code>Pais</code> role.
     * @param pais The instance to add to the <code>Pais</code> role.
     */
    public void add2Pais(Pais pais) {
        if (pais == null || pais.isNull()) {
            this.modifiedPais = true;
            this.paisCodigo = null;
        } else {
            this.paisCodigo = pais.getPaisCodigo();
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
     * Returns the instance of <code>Departamento</code> related through the <code>Departamento</code> role.
     * Model Relationship:
     * <code>[Departamento] Departamento 0:1  ------ 0:M  NovedadesMD [NovedadMD]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Departamento</code> related through the <code>Departamento</code> role.
     */
    @JsonIgnore
    public Departamento getDepartamento() {
        return departamento;
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
     * Returns the instance of <code>Municipio</code> related through the <code>Municipio</code> role.
     * Model Relationship:
     * <code>[Municipio] Municipio 0:1  ------ 0:M  NovedadesMD [NovedadMD]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>Municipio</code> role.
     */
    @JsonIgnore
    public Municipio getMunicipio() {
        return municipio;
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
        novedadMDDireccionCompleta = null;
        novedadMDRural = null;
        novedadMDTelefonoFijo = null;
        novedadMDTelefonoCelular = null;
        novedadMDCorreoElectronico = null;
        familiaNovedad = null;
        pais = null;
        departamento = null;
        municipio = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return NovedadMD.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return NovedadMDConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedNovedadMDDireccionCompleta = false;
    	values.put("novedadMDDireccionCompleta", getNovedadMDDireccionCompleta());
    	modifiedNovedadMDRural = false;
    	values.put("novedadMDRural", getNovedadMDRural());
    	modifiedNovedadMDTelefonoFijo = false;
    	values.put("novedadMDTelefonoFijo", getNovedadMDTelefonoFijo());
    	modifiedNovedadMDTelefonoCelular = false;
    	values.put("novedadMDTelefonoCelular", getNovedadMDTelefonoCelular());
    	modifiedNovedadMDCorreoElectronico = false;
    	values.put("novedadMDCorreoElectronico", getNovedadMDCorreoElectronico());
    	modifiedFamiliaNovedad = false;
    	modifiedPais = false;
    	modifiedDepartamento = false;
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
     * Returns the <code>NovedadMDOid</code> object that identifies this instance of <code>NovedadMD</code>.
     * @return <code>NovedadMDOid </code> object that identifies this instance of <code>NovedadMD</code>
     */
	@Override
    public NovedadMDOid getOid() {
        return new NovedadMDOid(getNovedadMDidNovedadMD());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(NovedadMDConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(NovedadMDConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.NOVEDADMD)) {
            // Add this class
            activeFacets.add(Constants.NOVEDADMD);
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
            relatedInstance = buildNovedadMDRelatedInstance(relatedInstanceJsonOid);
        }
        if (NovedadMDConstants.ROLE_NAME_FAMILIANOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadMDRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadMDConstants.ROLE_NAME_PAIS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadMDRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadMDConstants.ROLE_NAME_DEPARTAMENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadMDRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadMDConstants.ROLE_NAME_MUNICIPIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadMDRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildNovedadMDRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadMDRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadMDRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadMDRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadMDRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }
}
