package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratoCConstants;
import com.keralty.aepersonas.global.FamiliaCConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.FamiliaCOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
/**
 * Persistent representation of the <code>FamiliaC</code> model class.
 * <p>
 * Model Class: <code>FamiliaC</code><br>
 */
@Entity(name = FamiliaCConstants.CLASS_NAME)
@Table(name = FamiliaCConstants.TBL_NAME)
public class FamiliaC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private FamiliaCOid oid;

    /** Class identification function. */
    @Column(name = FamiliaCConstants.FLD_CONTRATOCCONTRATOCID, insertable = false, updatable = false )
    @JsonProperty(value="contratoc_id")
    private Long contratoCContratoCID;

    /** Class identification function. */
    @Column(name = FamiliaCConstants.FLD_FAMILIACID, insertable = false, updatable = false )
    @JsonProperty(value="id")
    private Long familiaCID;

    /** Class member attribute. */
    @Column(name = FamiliaCConstants.FLD_FAMILIACNUMFAMILIA )
    @JsonProperty(value="numfamilia")
    private String familiaCNumFamilia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaCNumFamilia;

    /** Class member attribute. */
    @Column(name = FamiliaCConstants.FLD_FAMILIACTITULARCONBENEFICIOS )
    @JsonProperty(value="titularconbeneficios")
    private Boolean familiaCTitularConBeneficios;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaCTitularConBeneficios;

    /** Class member attribute. */
    @Column(name = FamiliaCConstants.FLD_FAMILIACESTADOTITULARFAMILIA )
    @JsonProperty(value="estadotitularfamilia")
    private String familiaCEstadoTitularFamilia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaCEstadoTitularFamilia;

    /** Class member attribute. */
    @Column(name = FamiliaCConstants.FLD_FAMILIACFECHAFINVIGENCIA )
    @JsonProperty(value="fechafinvigencia")
    private Date familiaCFechaFinVigencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaCFechaFinVigencia;

    /** Class member attribute. */
    @Column(name = FamiliaCConstants.FLD_FAMILIACDIRECCIONCORRESPONDENCIA )
    @JsonProperty(value="direccioncorrespondencia")
    private String familiaCdireccionCorrespondencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaCdireccionCorrespondencia;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = FamiliaCConstants.ROLE_INVNAME_PERSONACTITULAR)
    @JsonIgnore
    private PersonaC personaCTitular;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCTitular;

    /** Related Class. */
    @OneToMany(mappedBy = FamiliaCConstants.ROLE_INVNAME_BENEFICIARIOSC)
    @JsonIgnore
    private Collection <BeneficiarioC> beneficiariosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedBeneficiariosC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=FamiliaCConstants.FLD_CONTRATOCCONTRATOCID, referencedColumnName=ContratoCConstants.FLD_CONTRATOCID, insertable = false, updatable = false)
    })
    @JsonIgnore
    private ContratoC contratoC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratoC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=FamiliaCConstants.FLD_MUNICIPIOCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipioC;
    /** Related attribute. */
    @Column(name = FamiliaCConstants.FLD_MUNICIPIOCODIGO, insertable = false, updatable = false)
    private Long municipioCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public FamiliaC() {
        contratoCContratoCID = null;
        familiaCID = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>FamiliaC</code>.
     * @param oid Object Identifier of the instance of <code>FamiliaC</code> to be created.
     * @throws SystemException
     */
    public FamiliaC(FamiliaCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            contratoCContratoCID = oid.getContratoCContratoCID();
            familiaCID = oid.getFamiliaCID();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>contratoCID</code> attribute<br>in class <code>ContratoC</code> through <code>ContratoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ContratoC</code>
     * @return The value of the <code>contratoCID</code> attribute<br>in class <code>ContratoC</code> through <code>ContratoC</code>.
     */
    public Long getContratoCContratoCID() {
        return (contratoC != null ? contratoC.getContratoCID() : contratoCContratoCID);
    }

    /**
     * Sets the value of the <code>contratoCID</code> attribute<br>in class <code>ContratoC</code> through <code>ContratoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ContratoC</code>
     * @param contratoCContratoCID The new value of the <code>contratoCID</code> attribute<br>in class <code>ContratoC</code> through <code>ContratoC</code>.
     */
    public void setContratoCContratoCID(Long contratoCContratoCID) {
        this.contratoCContratoCID = contratoCContratoCID;
    }

    /**
     * Returns the value of the <code>familiaCID</code> attribute<br>in class <code>FamiliaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FamiliaC</code>
     * @return The value of the <code>familiaCID</code> attribute<br>in class <code>FamiliaC</code>.
     */
    public Long getFamiliaCID() {
        return familiaCID;
    }

    /**
     * Sets the value of the <code>familiaCID</code> attribute<br>in class <code>FamiliaC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>FamiliaC</code>
     * @param familiaCID The new value of the <code>familiaCID</code> attribute<br>in class <code>FamiliaC</code>.
     */
    public void setFamiliaCID(Long familiaCID) {
        this.familiaCID = familiaCID;
    }

   /**
    * Returns the value of the <code>familiaCNumFamilia</code> attribute.<br>
    * Model Attribute: <code>familiaCNumFamilia</code>. Variable String Size=20<br>
    * Comments: <br>
    * @return The value of the <code>familiaCNumFamilia</code> attribute.
    */

    public String getFamiliaCNumFamilia()  {
    	String value;
        value =  familiaCNumFamilia;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>familiaCNumFamilia</code> attribute.<br>
    * Model Attribute: <code>familiaCNumFamilia</code>. Variable String Size=20<br>
    * Comments: <br>
    * @param familiaCNumFamilia The new value of the <code>familiaCNumFamilia</code> attribute.
    */
    public void setFamiliaCNumFamilia (String familiaCNumFamilia) {
        modifiedFamiliaCNumFamilia = true;
        this.familiaCNumFamilia = familiaCNumFamilia;
    }

   /**
    * Returns the value of the <code>modifiedFamiliaCNumFamilia</code> class property.<br>
    *
    * @return The value of the <code>modifiedFamiliaCNumFamilia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFamiliaCNumFamilia() {
        return modifiedFamiliaCNumFamilia;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaCNumFamilia</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaCNumFamilia</code>.
    */
    public void setModifiedFamiliaCNumFamilia(boolean modified) {
        this.modifiedFamiliaCNumFamilia = modified;
    }

   /**
    * Returns the value of the <code>familiaCTitularConBeneficios</code> attribute.<br>
    * Model Attribute: <code>familiaCTitularConBeneficios</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>familiaCTitularConBeneficios</code> attribute.
    */

    public Boolean getFamiliaCTitularConBeneficios()  {
    	Boolean value;
        value =  familiaCTitularConBeneficios;
        return value;
    }

   /**
    * Sets the value of the <code>familiaCTitularConBeneficios</code> attribute.<br>
    * Model Attribute: <code>familiaCTitularConBeneficios</code>. Variable Bool<br>
    * Comments: <br>
    * @param familiaCTitularConBeneficios The new value of the <code>familiaCTitularConBeneficios</code> attribute.
    */
    public void setFamiliaCTitularConBeneficios (Boolean familiaCTitularConBeneficios) {
        modifiedFamiliaCTitularConBeneficios = true;
        this.familiaCTitularConBeneficios = familiaCTitularConBeneficios;
    }

   /**
    * Returns the value of the <code>modifiedFamiliaCTitularConBeneficios</code> class property.<br>
    *
    * @return The value of the <code>modifiedFamiliaCTitularConBeneficios</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFamiliaCTitularConBeneficios() {
        return modifiedFamiliaCTitularConBeneficios;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaCTitularConBeneficios</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaCTitularConBeneficios</code>.
    */
    public void setModifiedFamiliaCTitularConBeneficios(boolean modified) {
        this.modifiedFamiliaCTitularConBeneficios = modified;
    }

   /**
    * Returns the value of the <code>familiaCEstadoTitularFamilia</code> attribute.<br>
    * Model Attribute: <code>familiaCEstadoTitularFamilia</code>. Variable String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>familiaCEstadoTitularFamilia</code> attribute.
    */

    public String getFamiliaCEstadoTitularFamilia()  {
    	String value;
        value =  familiaCEstadoTitularFamilia;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>familiaCEstadoTitularFamilia</code> attribute.<br>
    * Model Attribute: <code>familiaCEstadoTitularFamilia</code>. Variable String Size=10<br>
    * Comments: <br>
    * @param familiaCEstadoTitularFamilia The new value of the <code>familiaCEstadoTitularFamilia</code> attribute.
    */
    public void setFamiliaCEstadoTitularFamilia (String familiaCEstadoTitularFamilia) {
        modifiedFamiliaCEstadoTitularFamilia = true;
        this.familiaCEstadoTitularFamilia = familiaCEstadoTitularFamilia;
    }

   /**
    * Returns the value of the <code>modifiedFamiliaCEstadoTitularFamilia</code> class property.<br>
    *
    * @return The value of the <code>modifiedFamiliaCEstadoTitularFamilia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFamiliaCEstadoTitularFamilia() {
        return modifiedFamiliaCEstadoTitularFamilia;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaCEstadoTitularFamilia</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaCEstadoTitularFamilia</code>.
    */
    public void setModifiedFamiliaCEstadoTitularFamilia(boolean modified) {
        this.modifiedFamiliaCEstadoTitularFamilia = modified;
    }

   /**
    * Returns the value of the <code>familiaCFechaFinVigencia</code> attribute.<br>
    * Model Attribute: <code>familiaCFechaFinVigencia</code>. Variable Date<br>
    * Comments: Corresponde a la fecha de fin de vigencia de una familia dentro de un contrato colectivo.<br>
    * @return The value of the <code>familiaCFechaFinVigencia</code> attribute.
    */

    public Date getFamiliaCFechaFinVigencia()  {
    	Date value;
        value =  familiaCFechaFinVigencia;
        return value;
    }

   /**
    * Sets the value of the <code>familiaCFechaFinVigencia</code> attribute.<br>
    * Model Attribute: <code>familiaCFechaFinVigencia</code>. Variable Date<br>
    * Comments: Corresponde a la fecha de fin de vigencia de una familia dentro de un contrato colectivo.<br>
    * @param familiaCFechaFinVigencia The new value of the <code>familiaCFechaFinVigencia</code> attribute.
    */
    public void setFamiliaCFechaFinVigencia (Date familiaCFechaFinVigencia) {
        modifiedFamiliaCFechaFinVigencia = true;
        this.familiaCFechaFinVigencia = familiaCFechaFinVigencia;
    }

   /**
    * Returns the value of the <code>modifiedFamiliaCFechaFinVigencia</code> class property.<br>
    *
    * @return The value of the <code>modifiedFamiliaCFechaFinVigencia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFamiliaCFechaFinVigencia() {
        return modifiedFamiliaCFechaFinVigencia;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaCFechaFinVigencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaCFechaFinVigencia</code>.
    */
    public void setModifiedFamiliaCFechaFinVigencia(boolean modified) {
        this.modifiedFamiliaCFechaFinVigencia = modified;
    }

   /**
    * Returns the value of the <code>familiaCdireccionCorrespondencia</code> attribute.<br>
    * Model Attribute: <code>familiaCdireccionCorrespondencia</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>familiaCdireccionCorrespondencia</code> attribute.
    */

    public String getFamiliaCdireccionCorrespondencia()  {
    	String value;
        value =  familiaCdireccionCorrespondencia;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>familiaCdireccionCorrespondencia</code> attribute.<br>
    * Model Attribute: <code>familiaCdireccionCorrespondencia</code>. Variable String Size=255<br>
    * Comments: <br>
    * @param familiaCdireccionCorrespondencia The new value of the <code>familiaCdireccionCorrespondencia</code> attribute.
    */
    public void setFamiliaCdireccionCorrespondencia (String familiaCdireccionCorrespondencia) {
        modifiedFamiliaCdireccionCorrespondencia = true;
        this.familiaCdireccionCorrespondencia = familiaCdireccionCorrespondencia;
    }

   /**
    * Returns the value of the <code>modifiedFamiliaCdireccionCorrespondencia</code> class property.<br>
    *
    * @return The value of the <code>modifiedFamiliaCdireccionCorrespondencia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFamiliaCdireccionCorrespondencia() {
        return modifiedFamiliaCdireccionCorrespondencia;
    }

   /**
    * Sets the value of the <code>modifiedFamiliaCdireccionCorrespondencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedFamiliaCdireccionCorrespondencia</code>.
    */
    public void setModifiedFamiliaCdireccionCorrespondencia(boolean modified) {
        this.modifiedFamiliaCdireccionCorrespondencia = modified;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonaCTitular</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonaCTitular 0:1  ------ 0:1  FamiliasC [FamiliaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PersonaC</code> related through the <code>PersonaCTitular</code> role.
     */
    @JsonIgnore
    public PersonaC getPersonaCTitular() {
        return personaCTitular;
    }

    /**
     * Adds an instance of <code>PersonaC</code> related through the <code>PersonaCTitular</code> role.
     * @param personaCTitular The instance to add to the <code>PersonaCTitular</code> role.
     */
    public void add2PersonaCTitular(PersonaC personaCTitular) {
        this.personaCTitular = (personaCTitular == null  || personaCTitular.isNull() ? null : personaCTitular);
    }

   /**
    * This method gets the attribute value <code>modifiedPersonaCTitular</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPersonaCTitular</code> has been modified.
    */
    public boolean isModifiedPersonaCTitular(){
        return modifiedPersonaCTitular;
    }

    /**
     * Returns the instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * Model Relationship:
     * <code>[BeneficiarioC] BeneficiariosC 0:M  ------ 1:1  FamiliasC [FamiliaC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     */
    @JsonIgnore
    public Collection <BeneficiarioC> getBeneficiariosC() {
        return beneficiariosC;
    }

    /**
     * Adds an instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * @param beneficiariosC The instance to add to the <code>BeneficiariosC</code> role.
     */
    public void add2BeneficiariosC(BeneficiarioC beneficiariosC) {
        this.beneficiariosC.add(beneficiariosC);
    }
    /**
     * Removes an instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * @param beneficiariosC The instance to be removed
     */
    public void removeFromBeneficiariosC(BeneficiarioC beneficiariosC) {
    	this.beneficiariosC.remove(beneficiariosC);
    }
    /**
     * Sets instances of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * @param beneficiariosC The new value for the <code>BeneficiariosC</code> role.
     */
    public void setBeneficiariosC(Collection < BeneficiarioC > beneficiariosC) {
        this.beneficiariosC = beneficiariosC;
    }

   /**
    * This method gets the attribute value <code>modifiedBeneficiariosC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedBeneficiariosC</code> has been modified.
    */
    public boolean isModifiedBeneficiariosC(){
        return modifiedBeneficiariosC;
    }

    /**
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratoC 1:1  ------ 0:M  FamiliasC [FamiliaC]</code>
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
     * Returns the instance of <code>Municipio</code> related through the <code>MunicipioC</code> role.
     * Model Relationship:
     * <code>[Municipio] MunicipioC 0:1  ------ 0:M  FamiliaC [FamiliaC]</code>
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
            this.municipioCodigo = null;
        } else {
            this.municipioCodigo = municipioC.getMunicipioCodigo();
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
        familiaCNumFamilia = null;
        familiaCTitularConBeneficios = null;
        familiaCEstadoTitularFamilia = null;
        familiaCFechaFinVigencia = null;
        familiaCdireccionCorrespondencia = null;
        personaCTitular = null;
        beneficiariosC = null;
        contratoC = null;
        municipioC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return FamiliaC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return FamiliaCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedFamiliaCNumFamilia = false;
    	values.put("familiaCNumFamilia", getFamiliaCNumFamilia());
    	modifiedFamiliaCTitularConBeneficios = false;
    	values.put("familiaCTitularConBeneficios", getFamiliaCTitularConBeneficios());
    	modifiedFamiliaCEstadoTitularFamilia = false;
    	values.put("familiaCEstadoTitularFamilia", getFamiliaCEstadoTitularFamilia());
    	modifiedFamiliaCFechaFinVigencia = false;
    	values.put("familiaCFechaFinVigencia", getFamiliaCFechaFinVigencia());
    	modifiedFamiliaCdireccionCorrespondencia = false;
    	values.put("familiaCdireccionCorrespondencia", getFamiliaCdireccionCorrespondencia());
    	modifiedPersonaCTitular = false;
    	modifiedBeneficiariosC = false;
    	modifiedContratoC = false;
    	modifiedMunicipioC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>FamiliaCOid</code> object that identifies this instance of <code>FamiliaC</code>.
     * @return <code>FamiliaCOid </code> object that identifies this instance of <code>FamiliaC</code>
     */
	@Override
    public FamiliaCOid getOid() {
        return new FamiliaCOid(getContratoCContratoCID(), getFamiliaCID());
    }

    /**
     * Sets the <code>FamiliaCOid</code> object that identifies this instance of <code>FamiliaC</code>.
     */    
    public void setOid(FamiliaCOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(FamiliaCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(FamiliaCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.FAMILIAC)) {
            // Add this class
            activeFacets.add(Constants.FAMILIAC);
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
            relatedInstance = buildFamiliaCRelatedInstance(relatedInstanceJsonOid);
        }
        if (FamiliaCConstants.ROLE_NAME_PERSONACTITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaCConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaCRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaCConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaCRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaCConstants.ROLE_NAME_MUNICIPIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaCRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFamiliaCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FamiliaC(mapper.readValue(relatedInstanceJsonOid, FamiliaCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaCRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaCRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaCRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }
}
