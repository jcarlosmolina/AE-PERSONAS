package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.ParentescoDomOid;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.UsuarioNovedadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioRegOid;
import com.keralty.aepersonas.repository.UsuarioJpaRepository;
import com.keralty.aepersonas.repository.UsuarioRegJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
/**
 * Persistent representation of the <code>Parentesco</code> model class.
 * <p>
 * Model Class: <code>Parentesco</code><br>
 */
@Entity(name = ParentescoConstants.CLASS_NAME)
@Table(name = ParentescoConstants.TBL_NAME)
public class Parentesco extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient UsuarioJpaRepository usuarioRepository;

    @JsonIgnore
    private transient UsuarioRegJpaRepository usuarioRegRepository;

    /** Class identification function. */
    @Id
    @Column(name = ParentescoConstants.FLD_PARENTESCOCODIGO )
    @JsonProperty(value="codigo")
    private Long parentescoCodigo;

    /** Class member attribute. */
    @Column(name = ParentescoConstants.FLD_PARENTESCODESCRIPCION )
    @JsonProperty(value="descripcion")
    private String parentescoDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoDescripcion;

    /** Class member attribute. */
    @Column(name = ParentescoConstants.FLD_PARENTESCOESTITULAR )
    @JsonProperty(value="estitular")
    private Boolean parentescoEsTitular;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoEsTitular;

    /** Class member attribute. */
    @Column(name = ParentescoConstants.FLD_PARENTESCOESCONYUGE )
    @JsonProperty(value="esconyuge")
    private Boolean parentescoEsConyuge;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoEsConyuge;

    /** Class member attribute. */
    @Column(name = ParentescoConstants.FLD_PARENTESCOESPADRE )
    @JsonProperty(value="espadre")
    private Boolean parentescoEsPadre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoEsPadre;

    /** Class member attribute. */
    @Column(name = ParentescoConstants.FLD_PARENTESCOESHIJO )
    @JsonProperty(value="eshijo")
    private Boolean parentescoEsHijo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoEsHijo;

    /** Class member attribute. */
    @Column(name = ParentescoConstants.FLD_PARENTESCONOMBRECORTO )
    @JsonProperty(value="nombrecorto")
    private String parentescoNombreCorto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoNombreCorto;

    /** Related Class. */
    @OneToMany(mappedBy = ParentescoConstants.ROLE_INVNAME_ATRIBUTOSUSUARIO)
    @JsonIgnore
    private Collection <Usuario> atributosUsuario;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAtributosUsuario;

    /** Related Class. */
    @OneToMany(mappedBy = ParentescoConstants.ROLE_INVNAME_BENEFICIARIOSC)
    @JsonIgnore
    private Collection <BeneficiarioC> beneficiariosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedBeneficiariosC;

    /** Related Class. */
    @OneToMany(mappedBy = ParentescoConstants.ROLE_INVNAME_USUARIOSREG)
    @JsonIgnore
    private Collection <UsuarioReg> usuariosReg;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuariosReg;

    /** Related Class. */
    @OneToMany(mappedBy = ParentescoConstants.ROLE_INVNAME_PARENTESCOSDOM)
    @JsonIgnore
    private Collection <ParentescoDom> parentescosDom;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescosDom;

    /** Related Class. */
    @OneToMany(mappedBy = ParentescoConstants.ROLE_INVNAME_USUARIOSNOVEDAD)
    @JsonIgnore
    private Collection <UsuarioNovedad> usuariosNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuariosNovedad;

    /** Related Class. */
    @OneToMany(mappedBy = ParentescoConstants.ROLE_INVNAME_USUARIONOVEDAD)
    @JsonIgnore
    private Collection <UsuarioNovedad> usuarioNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedad;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Parentesco() {
        parentescoCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Parentesco</code>.
     * @param oid Object Identifier of the instance of <code>Parentesco</code> to be created.
     * @throws SystemException
     */
    public Parentesco(ParentescoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            parentescoCodigo = oid.getParentescoCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>parentescoCodigo</code> attribute<br>in class <code>Parentesco</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Parentesco</code>
     * @return The value of the <code>parentescoCodigo</code> attribute<br>in class <code>Parentesco</code>.
     */
    public Long getParentescoCodigo() {
        return parentescoCodigo;
    }

    /**
     * Sets the value of the <code>parentescoCodigo</code> attribute<br>in class <code>Parentesco</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Parentesco</code>
     * @param parentescoCodigo The new value of the <code>parentescoCodigo</code> attribute<br>in class <code>Parentesco</code>.
     */
    public void setParentescoCodigo(Long parentescoCodigo) {
        this.parentescoCodigo = parentescoCodigo;
    }

   /**
    * Returns the value of the <code>parentescoDescripcion</code> attribute.<br>
    * Model Attribute: <code>parentescoDescripcion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>parentescoDescripcion</code> attribute.
    */

    public String getParentescoDescripcion()  {
    	String value;
        value =  parentescoDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>parentescoDescripcion</code> attribute.<br>
    * Model Attribute: <code>parentescoDescripcion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param parentescoDescripcion The new value of the <code>parentescoDescripcion</code> attribute.
    */
    public void setParentescoDescripcion (String parentescoDescripcion) {
        modifiedParentescoDescripcion = true;
        this.parentescoDescripcion = parentescoDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedParentescoDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedParentescoDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParentescoDescripcion() {
        return modifiedParentescoDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedParentescoDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoDescripcion</code>.
    */
    public void setModifiedParentescoDescripcion(boolean modified) {
        this.modifiedParentescoDescripcion = modified;
    }

   /**
    * Returns the value of the <code>parentescoEsTitular</code> attribute.<br>
    * Model Attribute: <code>parentescoEsTitular</code>. Variable Bool<br>
    * Comments: En los atributos de usuario, para el titular, aparecerá como parentesco titular y no se podrá modificar. Necesitamos poder identificar qué parentesco corresponde con titular<br>
    * @return The value of the <code>parentescoEsTitular</code> attribute.
    */

    public Boolean getParentescoEsTitular()  {
    	Boolean value;
        value =  parentescoEsTitular;
        return value;
    }

   /**
    * Sets the value of the <code>parentescoEsTitular</code> attribute.<br>
    * Model Attribute: <code>parentescoEsTitular</code>. Variable Bool<br>
    * Comments: En los atributos de usuario, para el titular, aparecerá como parentesco titular y no se podrá modificar. Necesitamos poder identificar qué parentesco corresponde con titular<br>
    * @param parentescoEsTitular The new value of the <code>parentescoEsTitular</code> attribute.
    */
    public void setParentescoEsTitular (Boolean parentescoEsTitular) {
        modifiedParentescoEsTitular = true;
        this.parentescoEsTitular = parentescoEsTitular;
    }

   /**
    * Returns the value of the <code>modifiedParentescoEsTitular</code> class property.<br>
    *
    * @return The value of the <code>modifiedParentescoEsTitular</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParentescoEsTitular() {
        return modifiedParentescoEsTitular;
    }

   /**
    * Sets the value of the <code>modifiedParentescoEsTitular</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoEsTitular</code>.
    */
    public void setModifiedParentescoEsTitular(boolean modified) {
        this.modifiedParentescoEsTitular = modified;
    }

   /**
    * Returns the value of the <code>parentescoEsConyuge</code> attribute.<br>
    * Model Attribute: <code>parentescoEsConyuge</code>. Variable Bool<br>
    * Comments: Al recuperar contratos necesitamos saber aquellos en los que la persona sea titular o cónyuge. Es por ello que necesitamos saber qué parentesco corresponde con titular y qué parentesco corresponde con cónyuge<br>
    * @return The value of the <code>parentescoEsConyuge</code> attribute.
    */

    public Boolean getParentescoEsConyuge()  {
    	Boolean value;
        value =  parentescoEsConyuge;
        return value;
    }

   /**
    * Sets the value of the <code>parentescoEsConyuge</code> attribute.<br>
    * Model Attribute: <code>parentescoEsConyuge</code>. Variable Bool<br>
    * Comments: Al recuperar contratos necesitamos saber aquellos en los que la persona sea titular o cónyuge. Es por ello que necesitamos saber qué parentesco corresponde con titular y qué parentesco corresponde con cónyuge<br>
    * @param parentescoEsConyuge The new value of the <code>parentescoEsConyuge</code> attribute.
    */
    public void setParentescoEsConyuge (Boolean parentescoEsConyuge) {
        modifiedParentescoEsConyuge = true;
        this.parentescoEsConyuge = parentescoEsConyuge;
    }

   /**
    * Returns the value of the <code>modifiedParentescoEsConyuge</code> class property.<br>
    *
    * @return The value of the <code>modifiedParentescoEsConyuge</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParentescoEsConyuge() {
        return modifiedParentescoEsConyuge;
    }

   /**
    * Sets the value of the <code>modifiedParentescoEsConyuge</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoEsConyuge</code>.
    */
    public void setModifiedParentescoEsConyuge(boolean modified) {
        this.modifiedParentescoEsConyuge = modified;
    }

   /**
    * Returns the value of the <code>parentescoEsPadre</code> attribute.<br>
    * Model Attribute: <code>parentescoEsPadre</code>. Variable Bool<br>
    * Comments: Existen ciertas validaciones sobre beneficiarios que implican verificar que el parentesco sea “Padre”. Es por ello que necesitamos saber qué parentesco corresponde con padre<br>
    * @return The value of the <code>parentescoEsPadre</code> attribute.
    */

    public Boolean getParentescoEsPadre()  {
    	Boolean value;
        value =  parentescoEsPadre;
        return value;
    }

   /**
    * Sets the value of the <code>parentescoEsPadre</code> attribute.<br>
    * Model Attribute: <code>parentescoEsPadre</code>. Variable Bool<br>
    * Comments: Existen ciertas validaciones sobre beneficiarios que implican verificar que el parentesco sea “Padre”. Es por ello que necesitamos saber qué parentesco corresponde con padre<br>
    * @param parentescoEsPadre The new value of the <code>parentescoEsPadre</code> attribute.
    */
    public void setParentescoEsPadre (Boolean parentescoEsPadre) {
        modifiedParentescoEsPadre = true;
        this.parentescoEsPadre = parentescoEsPadre;
    }

   /**
    * Returns the value of the <code>modifiedParentescoEsPadre</code> class property.<br>
    *
    * @return The value of the <code>modifiedParentescoEsPadre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParentescoEsPadre() {
        return modifiedParentescoEsPadre;
    }

   /**
    * Sets the value of the <code>modifiedParentescoEsPadre</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoEsPadre</code>.
    */
    public void setModifiedParentescoEsPadre(boolean modified) {
        this.modifiedParentescoEsPadre = modified;
    }

   /**
    * Returns the value of the <code>parentescoEsHijo</code> attribute.<br>
    * Model Attribute: <code>parentescoEsHijo</code>. Variable Bool<br>
    * Comments: Existen ciertas validaciones sobre beneficiarios que implican verificar que el parentesco sea “Hijo”. Es por ello que necesitamos saber qué parentesco corresponde con hijo<br>
    * @return The value of the <code>parentescoEsHijo</code> attribute.
    */

    public Boolean getParentescoEsHijo()  {
    	Boolean value;
        value =  parentescoEsHijo;
        return value;
    }

   /**
    * Sets the value of the <code>parentescoEsHijo</code> attribute.<br>
    * Model Attribute: <code>parentescoEsHijo</code>. Variable Bool<br>
    * Comments: Existen ciertas validaciones sobre beneficiarios que implican verificar que el parentesco sea “Hijo”. Es por ello que necesitamos saber qué parentesco corresponde con hijo<br>
    * @param parentescoEsHijo The new value of the <code>parentescoEsHijo</code> attribute.
    */
    public void setParentescoEsHijo (Boolean parentescoEsHijo) {
        modifiedParentescoEsHijo = true;
        this.parentescoEsHijo = parentescoEsHijo;
    }

   /**
    * Returns the value of the <code>modifiedParentescoEsHijo</code> class property.<br>
    *
    * @return The value of the <code>modifiedParentescoEsHijo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParentescoEsHijo() {
        return modifiedParentescoEsHijo;
    }

   /**
    * Sets the value of the <code>modifiedParentescoEsHijo</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoEsHijo</code>.
    */
    public void setModifiedParentescoEsHijo(boolean modified) {
        this.modifiedParentescoEsHijo = modified;
    }

   /**
    * Returns the value of the <code>parentescoNombreCorto</code> attribute.<br>
    * Model Attribute: <code>parentescoNombreCorto</code>. Variable String Size=10<br>
    * Comments: <br>
    * @return The value of the <code>parentescoNombreCorto</code> attribute.
    */

    public String getParentescoNombreCorto()  {
    	String value;
        value =  parentescoNombreCorto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>parentescoNombreCorto</code> attribute.<br>
    * Model Attribute: <code>parentescoNombreCorto</code>. Variable String Size=10<br>
    * Comments: <br>
    * @param parentescoNombreCorto The new value of the <code>parentescoNombreCorto</code> attribute.
    */
    public void setParentescoNombreCorto (String parentescoNombreCorto) {
        modifiedParentescoNombreCorto = true;
        this.parentescoNombreCorto = parentescoNombreCorto;
    }

   /**
    * Returns the value of the <code>modifiedParentescoNombreCorto</code> class property.<br>
    *
    * @return The value of the <code>modifiedParentescoNombreCorto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParentescoNombreCorto() {
        return modifiedParentescoNombreCorto;
    }

   /**
    * Sets the value of the <code>modifiedParentescoNombreCorto</code> class property.<br>
    * @param modified The new value of the <code>modifiedParentescoNombreCorto</code>.
    */
    public void setModifiedParentescoNombreCorto(boolean modified) {
        this.modifiedParentescoNombreCorto = modified;
    }

    /**
     * Returns the instance of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     * Model Relationship:
     * <code>[Usuario] AtributosUsuario 0:M  ------ 0:1  Parentesco [Parentesco]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     */
    @JsonIgnore
    public Collection <Usuario> getAtributosUsuario() {
        return getUsuarioRepository().findByParentesco(this);
    }

    /**
     * Adds an instance of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     * @param atributosUsuario The instance to add to the <code>AtributosUsuario</code> role.
     */
    public void add2AtributosUsuario(Usuario atributosUsuario) {
        this.atributosUsuario.add(atributosUsuario);
    }
    /**
     * Removes an instance of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     * @param atributosUsuario The instance to be removed
     */
    public void removeFromAtributosUsuario(Usuario atributosUsuario) {
    	this.atributosUsuario.remove(atributosUsuario);
    }
    /**
     * Sets instances of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     * @param atributosUsuario The new value for the <code>AtributosUsuario</code> role.
     */
    public void setAtributosUsuario(Collection < Usuario > atributosUsuario) {
        this.atributosUsuario = atributosUsuario;
    }

   /**
    * This method gets the attribute value <code>modifiedAtributosUsuario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAtributosUsuario</code> has been modified.
    */
    public boolean isModifiedAtributosUsuario(){
        return modifiedAtributosUsuario;
    }

    /**
     * Returns the instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * Model Relationship:
     * <code>[BeneficiarioC] BeneficiariosC 0:M  ------ 1:1  ParentescoC [Parentesco]</code>
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
     * Returns the instance of <code>UsuarioReg</code> related through the <code>UsuariosReg</code> role.
     * Model Relationship:
     * <code>[UsuarioReg] UsuariosReg 0:M  ------ 0:1  Parentesco [Parentesco]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>UsuarioReg</code> related through the <code>UsuariosReg</code> role.
     */
    @JsonIgnore
    public Collection <UsuarioReg> getUsuariosReg() {
        return getUsuarioRegRepository().findByParentesco(this);
    }

    /**
     * Adds an instance of <code>UsuarioReg</code> related through the <code>UsuariosReg</code> role.
     * @param usuariosReg The instance to add to the <code>UsuariosReg</code> role.
     */
    public void add2UsuariosReg(UsuarioReg usuariosReg) {
        this.usuariosReg.add(usuariosReg);
    }
    /**
     * Removes an instance of <code>UsuarioReg</code> related through the <code>UsuariosReg</code> role.
     * @param usuariosReg The instance to be removed
     */
    public void removeFromUsuariosReg(UsuarioReg usuariosReg) {
    	this.usuariosReg.remove(usuariosReg);
    }
    /**
     * Sets instances of <code>UsuarioReg</code> related through the <code>UsuariosReg</code> role.
     * @param usuariosReg The new value for the <code>UsuariosReg</code> role.
     */
    public void setUsuariosReg(Collection < UsuarioReg > usuariosReg) {
        this.usuariosReg = usuariosReg;
    }

   /**
    * This method gets the attribute value <code>modifiedUsuariosReg</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuariosReg</code> has been modified.
    */
    public boolean isModifiedUsuariosReg(){
        return modifiedUsuariosReg;
    }

    /**
     * Returns the instance of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     * Model Relationship:
     * <code>[ParentescoDom] ParentescosDom 0:M  ------ 1:1  Parentesco [Parentesco]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     */
    @JsonIgnore
    public Collection <ParentescoDom> getParentescosDom() {
        return parentescosDom;
    }

    /**
     * Adds an instance of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     * @param parentescosDom The instance to add to the <code>ParentescosDom</code> role.
     */
    public void add2ParentescosDom(ParentescoDom parentescosDom) {
        this.parentescosDom.add(parentescosDom);
    }
    /**
     * Removes an instance of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     * @param parentescosDom The instance to be removed
     */
    public void removeFromParentescosDom(ParentescoDom parentescosDom) {
    	this.parentescosDom.remove(parentescosDom);
    }
    /**
     * Sets instances of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     * @param parentescosDom The new value for the <code>ParentescosDom</code> role.
     */
    public void setParentescosDom(Collection < ParentescoDom > parentescosDom) {
        this.parentescosDom = parentescosDom;
    }

   /**
    * This method gets the attribute value <code>modifiedParentescosDom</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedParentescosDom</code> has been modified.
    */
    public boolean isModifiedParentescosDom(){
        return modifiedParentescosDom;
    }

    /**
     * Returns the instance of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     * Model Relationship:
     * <code>[UsuarioNovedad] UsuariosNovedad 0:M  ------ 0:1  Parentesco [Parentesco]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     */
    @JsonIgnore
    public Collection <UsuarioNovedad> getUsuariosNovedad() {
        return usuariosNovedad;
    }

    /**
     * Adds an instance of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     * @param usuariosNovedad The instance to add to the <code>UsuariosNovedad</code> role.
     */
    public void add2UsuariosNovedad(UsuarioNovedad usuariosNovedad) {
        this.usuariosNovedad.add(usuariosNovedad);
    }
    /**
     * Removes an instance of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     * @param usuariosNovedad The instance to be removed
     */
    public void removeFromUsuariosNovedad(UsuarioNovedad usuariosNovedad) {
    	this.usuariosNovedad.remove(usuariosNovedad);
    }
    /**
     * Sets instances of <code>UsuarioNovedad</code> related through the <code>UsuariosNovedad</code> role.
     * @param usuariosNovedad The new value for the <code>UsuariosNovedad</code> role.
     */
    public void setUsuariosNovedad(Collection < UsuarioNovedad > usuariosNovedad) {
        this.usuariosNovedad = usuariosNovedad;
    }

   /**
    * This method gets the attribute value <code>modifiedUsuariosNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuariosNovedad</code> has been modified.
    */
    public boolean isModifiedUsuariosNovedad(){
        return modifiedUsuariosNovedad;
    }

    /**
     * Returns the instance of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     * Model Relationship:
     * <code>[UsuarioNovedad] UsuarioNovedad 0:M  ------ 0:1  ParentescoNuevo [Parentesco]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     */
    @JsonIgnore
    public Collection <UsuarioNovedad> getUsuarioNovedad() {
        return usuarioNovedad;
    }

    /**
     * Adds an instance of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     * @param usuarioNovedad The instance to add to the <code>UsuarioNovedad</code> role.
     */
    public void add2UsuarioNovedad(UsuarioNovedad usuarioNovedad) {
        this.usuarioNovedad.add(usuarioNovedad);
    }
    /**
     * Removes an instance of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     * @param usuarioNovedad The instance to be removed
     */
    public void removeFromUsuarioNovedad(UsuarioNovedad usuarioNovedad) {
    	this.usuarioNovedad.remove(usuarioNovedad);
    }
    /**
     * Sets instances of <code>UsuarioNovedad</code> related through the <code>UsuarioNovedad</code> role.
     * @param usuarioNovedad The new value for the <code>UsuarioNovedad</code> role.
     */
    public void setUsuarioNovedad(Collection < UsuarioNovedad > usuarioNovedad) {
        this.usuarioNovedad = usuarioNovedad;
    }

   /**
    * This method gets the attribute value <code>modifiedUsuarioNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuarioNovedad</code> has been modified.
    */
    public boolean isModifiedUsuarioNovedad(){
        return modifiedUsuarioNovedad;
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
        parentescoDescripcion = "";
        parentescoEsTitular = false;
        parentescoEsConyuge = false;
        parentescoEsPadre = false;
        parentescoEsHijo = false;
        parentescoNombreCorto = "";
        atributosUsuario = null;
        beneficiariosC = null;
        usuariosReg = null;
        parentescosDom = null;
        usuariosNovedad = null;
        usuarioNovedad = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public UsuarioJpaRepository getUsuarioRepository() {
        return Arc.container().select(UsuarioJpaRepository.class).get();
    }
    public UsuarioRegJpaRepository getUsuarioRegRepository() {
        return Arc.container().select(UsuarioRegJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Parentesco.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ParentescoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedParentescoDescripcion = false;
    	values.put("parentescoDescripcion", getParentescoDescripcion());
    	modifiedParentescoEsTitular = false;
    	values.put("parentescoEsTitular", getParentescoEsTitular());
    	modifiedParentescoEsConyuge = false;
    	values.put("parentescoEsConyuge", getParentescoEsConyuge());
    	modifiedParentescoEsPadre = false;
    	values.put("parentescoEsPadre", getParentescoEsPadre());
    	modifiedParentescoEsHijo = false;
    	values.put("parentescoEsHijo", getParentescoEsHijo());
    	modifiedParentescoNombreCorto = false;
    	values.put("parentescoNombreCorto", getParentescoNombreCorto());
    	modifiedAtributosUsuario = false;
    	modifiedBeneficiariosC = false;
    	modifiedUsuariosReg = false;
    	modifiedParentescosDom = false;
    	modifiedUsuariosNovedad = false;
    	modifiedUsuarioNovedad = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ParentescoOid</code> object that identifies this instance of <code>Parentesco</code>.
     * @return <code>ParentescoOid </code> object that identifies this instance of <code>Parentesco</code>
     */
	@Override
    public ParentescoOid getOid() {
        return new ParentescoOid(getParentescoCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ParentescoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PARENTESCO)) {
            // Add this class
            activeFacets.add(Constants.PARENTESCO);
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

    public String buildICParentesco() {
        try {
            return getParentescoDescripcion();
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
            relatedInstance = buildParentescoRelatedInstance(relatedInstanceJsonOid);
        }
        if (ParentescoConstants.ROLE_NAME_ATRIBUTOSUSUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_USUARIOSREG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4UsuarioReg(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_PARENTESCOSDOM.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4ParentescoDom(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_USUARIOSNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || ParentescoConstants.ROLE_NAME_USUARIONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildParentescoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4UsuarioReg(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class)): UsuarioReg.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4ParentescoDom(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ParentescoDom(mapper.readValue(relatedInstanceJsonOid, ParentescoDomOid.class)): ParentescoDom.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
