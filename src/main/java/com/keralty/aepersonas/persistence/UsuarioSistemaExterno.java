package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.UsuarioSistemaExternoConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioSistemaExternoOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>UsuarioSistemaExterno</code> model class.
 * <p>
 * Model Class: <code>UsuarioSistemaExterno</code><br>
 */
@Entity(name = UsuarioSistemaExternoConstants.CLASS_NAME)
@Table(name = UsuarioSistemaExternoConstants.TBL_NAME)
public class UsuarioSistemaExterno extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = UsuarioSistemaExternoConstants.FLD_USUARIOSISTEMAEXTERNOLOGIN )
    @JsonProperty(value="login")
    private String usuarioSistemaExternoLogin;

    /** Class member attribute. */
    @Column(name = UsuarioSistemaExternoConstants.FLD_USUARIOSISTEMAEXTERNODESCRIPCION )
    @JsonProperty(value="descripcion")
    private String usuarioSistemaExternoDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioSistemaExternoDescripcion;

    @Column(name = UsuarioSistemaExternoConstants.FLD_P4SSW0RD )
    @JsonProperty(value="password")
    private String passWord;

    @Transient
    @JsonIgnore
    private boolean modifiedPassWord;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public UsuarioSistemaExterno() {
        usuarioSistemaExternoLogin = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>UsuarioSistemaExterno</code>.
     * @param oid Object Identifier of the instance of <code>UsuarioSistemaExterno</code> to be created.
     * @throws SystemException
     */
    public UsuarioSistemaExterno(UsuarioSistemaExternoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            usuarioSistemaExternoLogin = oid.getUsuarioSistemaExternoLogin();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>usuarioSistemaExternoLogin</code> attribute<br>in class <code>UsuarioSistemaExterno</code>.
     * This is part of the identification for this class, which depends on the identification of <code>UsuarioSistemaExterno</code>
     * @return The value of the <code>usuarioSistemaExternoLogin</code> attribute<br>in class <code>UsuarioSistemaExterno</code>.
     */
    public String getUsuarioSistemaExternoLogin() {
        return (usuarioSistemaExternoLogin == null ? usuarioSistemaExternoLogin : usuarioSistemaExternoLogin.trim());
    }

    /**
     * Sets the value of the <code>usuarioSistemaExternoLogin</code> attribute<br>in class <code>UsuarioSistemaExterno</code>.
     * This is part of the identification for this class, which depends on the identification of <code>UsuarioSistemaExterno</code>
     * @param usuarioSistemaExternoLogin The new value of the <code>usuarioSistemaExternoLogin</code> attribute<br>in class <code>UsuarioSistemaExterno</code>.
     */
    public void setUsuarioSistemaExternoLogin(String usuarioSistemaExternoLogin) {
        this.usuarioSistemaExternoLogin = usuarioSistemaExternoLogin;
    }

   /**
    * Returns the value of the <code>usuarioSistemaExternoDescripcion</code> attribute.<br>
    * Model Attribute: <code>usuarioSistemaExternoDescripcion</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>usuarioSistemaExternoDescripcion</code> attribute.
    */

    public String getUsuarioSistemaExternoDescripcion()  {
    	String value;
        value =  usuarioSistemaExternoDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>usuarioSistemaExternoDescripcion</code> attribute.<br>
    * Model Attribute: <code>usuarioSistemaExternoDescripcion</code>. Variable String Size=255<br>
    * Comments: <br>
    * @param usuarioSistemaExternoDescripcion The new value of the <code>usuarioSistemaExternoDescripcion</code> attribute.
    */
    public void setUsuarioSistemaExternoDescripcion (String usuarioSistemaExternoDescripcion) {
        modifiedUsuarioSistemaExternoDescripcion = true;
        this.usuarioSistemaExternoDescripcion = usuarioSistemaExternoDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioSistemaExternoDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioSistemaExternoDescripcion</code>.
    */
    public void setModifiedUsuarioSistemaExternoDescripcion(boolean modified) {
        this.modifiedUsuarioSistemaExternoDescripcion = modified;
    }

   /**
    * Returns the password of this agent entity.
    * @return password of this agent entity
    */
    public String getPassWord() {
        return passWord;
    }

   /**
    * Sets the password of this agent entity.
    * @param passWord Password of this agent entity
    */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
        this.modifiedPassWord = true;
    }

    /**
     * Returns the value of the <code>modifiedPassWord</code> class property.<br>
     * @return The value of the <code>modifiedPassWord</code> class property.
     */
    @JsonIgnore
    public boolean isModifiedPassWord() {
        return modifiedPassWord;
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
        usuarioSistemaExternoDescripcion = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return UsuarioSistemaExterno.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return UsuarioSistemaExternoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedUsuarioSistemaExternoDescripcion = false;
    	values.put("usuarioSistemaExternoDescripcion", getUsuarioSistemaExternoDescripcion());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>UsuarioSistemaExternoOid</code> object that identifies this instance of <code>UsuarioSistemaExterno</code>.
     * @return <code>UsuarioSistemaExternoOid </code> object that identifies this instance of <code>UsuarioSistemaExterno</code>
     */
	@Override
    public UsuarioSistemaExternoOid getOid() {
        return new UsuarioSistemaExternoOid(getUsuarioSistemaExternoLogin());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(UsuarioSistemaExternoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.USUARIOSISTEMAEXTERNO)) {
            // Add this class
            activeFacets.add(Constants.USUARIOSISTEMAEXTERNO);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.USUARIOSISTEMAEXTERNO)) {
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
            relatedInstance = buildUsuarioSistemaExternoRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildUsuarioSistemaExternoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new UsuarioSistemaExterno(mapper.readValue(relatedInstanceJsonOid, UsuarioSistemaExternoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioSistemaExterno.class).error(e.getMessage());
            return null;
        }
    }
}
