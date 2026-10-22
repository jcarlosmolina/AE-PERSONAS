package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.CausalConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.GrupoAsignacionConstants;
import com.keralty.aepersonas.global.GrupoAsignacionNovedadConstants;
import com.keralty.aepersonas.persistence.oid.CausalOid;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionNovedadOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionOid;
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
 * Persistent representation of the <code>GrupoAsignacionNovedad</code> model class.
 * <p>
 * Model Class: <code>GrupoAsignacionNovedad</code><br>
 */
@Entity(name = GrupoAsignacionNovedadConstants.CLASS_NAME)
@Table(name = GrupoAsignacionNovedadConstants.TBL_NAME)
public class GrupoAsignacionNovedad extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GrupoAsignacionNoveda_Sequence")
    @SequenceGenerator(name="GrupoAsignacionNoveda_Sequence", sequenceName="GrupoAsignacionNoveda_Sequence", allocationSize=1)
    @Column(name = GrupoAsignacionNovedadConstants.FLD_GRUPOASIGNACIONNOVEDADID )
    @JsonProperty(value="id")
    private Long grupoAsignacionNovedadId;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=GrupoAsignacionNovedadConstants.FLD_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
    })
    @JsonIgnore
    private Dominio dominio;
    /** Related attribute. */
    @Column(name = GrupoAsignacionNovedadConstants.FLD_DOMINIONUMERO, insertable = false, updatable = false)
    private Long dominioNumero;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominio;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=GrupoAsignacionNovedadConstants.FLD_CAUSALIDCAUSAL, referencedColumnName=CausalConstants.FLD_CAUSALIDCAUSAL)
    })
    @JsonIgnore
    private Causal causal;
    /** Related attribute. */
    @Column(name = GrupoAsignacionNovedadConstants.FLD_CAUSALIDCAUSAL, insertable = false, updatable = false)
    private Long causalidCausal;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCausal;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=GrupoAsignacionNovedadConstants.FLD_GRUPOASIGNACIONGRUPOUSUARIOSID, referencedColumnName=GrupoAsignacionConstants.FLD_GRUPOASIGNACIONID)
    })
    @JsonIgnore
    private GrupoAsignacion grupoUsuarios;
    /** Related attribute. */
    @Column(name = GrupoAsignacionNovedadConstants.FLD_GRUPOASIGNACIONGRUPOUSUARIOSID, insertable = false, updatable = false)
    private Long grupoAsignacionGrupoUsuariosId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoUsuarios;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public GrupoAsignacionNovedad() {
        grupoAsignacionNovedadId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>GrupoAsignacionNovedad</code>.
     * @param oid Object Identifier of the instance of <code>GrupoAsignacionNovedad</code> to be created.
     * @throws SystemException
     */
    public GrupoAsignacionNovedad(GrupoAsignacionNovedadOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            grupoAsignacionNovedadId = oid.getGrupoAsignacionNovedadId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>grupoAsignacionNovedadId</code> attribute<br>in class <code>GrupoAsignacionNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>GrupoAsignacionNovedad</code>
     * @return The value of the <code>grupoAsignacionNovedadId</code> attribute<br>in class <code>GrupoAsignacionNovedad</code>.
     */
    public Long getGrupoAsignacionNovedadId() {
        return grupoAsignacionNovedadId;
    }

    /**
     * Sets the value of the <code>grupoAsignacionNovedadId</code> attribute<br>in class <code>GrupoAsignacionNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>GrupoAsignacionNovedad</code>
     * @param grupoAsignacionNovedadId The new value of the <code>grupoAsignacionNovedadId</code> attribute<br>in class <code>GrupoAsignacionNovedad</code>.
     */
    public void setGrupoAsignacionNovedadId(Long grupoAsignacionNovedadId) {
        this.grupoAsignacionNovedadId = grupoAsignacionNovedadId;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominio 1:1  ------ 0:M  GrupoAsignacionNovedad [GrupoAsignacionNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * @param dominio The instance to add to the <code>Dominio</code> role.
     */
    public void add2Dominio(Dominio dominio) {
        if (dominio == null || dominio.isNull()) {
            this.modifiedDominio = true;
            this.dominioNumero = null;
        } else {
            this.dominioNumero = dominio.getDominioNumero();
        }
        this.dominio = (dominio == null  || dominio.isNull() ? null : dominio);
    }

   /**
    * This method gets the attribute value <code>modifiedDominio</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominio</code> has been modified.
    */
    public boolean isModifiedDominio(){
        return modifiedDominio;
    }

    /**
     * Returns the instance of <code>Causal</code> related through the <code>Causal</code> role.
     * Model Relationship:
     * <code>[Causal] Causal 1:1  ------ 0:M  GrupoAsignacionNovedad [GrupoAsignacionNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Causal</code> related through the <code>Causal</code> role.
     */
    @JsonIgnore
    public Causal getCausal() {
        return causal;
    }

    /**
     * Adds an instance of <code>Causal</code> related through the <code>Causal</code> role.
     * @param causal The instance to add to the <code>Causal</code> role.
     */
    public void add2Causal(Causal causal) {
        if (causal == null || causal.isNull()) {
            this.modifiedCausal = true;
            this.causalidCausal = null;
        } else {
            this.causalidCausal = causal.getCausalidCausal();
        }
        this.causal = (causal == null  || causal.isNull() ? null : causal);
    }

   /**
    * This method gets the attribute value <code>modifiedCausal</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedCausal</code> has been modified.
    */
    public boolean isModifiedCausal(){
        return modifiedCausal;
    }

    /**
     * Returns the instance of <code>GrupoAsignacion</code> related through the <code>GrupoUsuarios</code> role.
     * Model Relationship:
     * <code>[GrupoAsignacion] GrupoUsuarios 0:1  ------ 0:M  DominioCausalUsuario [GrupoAsignacionNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsignacion</code> related through the <code>GrupoUsuarios</code> role.
     */
    @JsonIgnore
    public GrupoAsignacion getGrupoUsuarios() {
        return grupoUsuarios;
    }

    /**
     * Adds an instance of <code>GrupoAsignacion</code> related through the <code>GrupoUsuarios</code> role.
     * @param grupoUsuarios The instance to add to the <code>GrupoUsuarios</code> role.
     */
    public void add2GrupoUsuarios(GrupoAsignacion grupoUsuarios) {
        if (grupoUsuarios == null || grupoUsuarios.isNull()) {
            this.modifiedGrupoUsuarios = true;
            this.grupoAsignacionGrupoUsuariosId = null;
        } else {
            this.grupoAsignacionGrupoUsuariosId = grupoUsuarios.getGrupoAsignacionId();
        }
        this.grupoUsuarios = (grupoUsuarios == null  || grupoUsuarios.isNull() ? null : grupoUsuarios);
    }

   /**
    * This method gets the attribute value <code>modifiedGrupoUsuarios</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedGrupoUsuarios</code> has been modified.
    */
    public boolean isModifiedGrupoUsuarios(){
        return modifiedGrupoUsuarios;
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
        dominio = null;
        causal = null;
        grupoUsuarios = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return GrupoAsignacionNovedad.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return GrupoAsignacionNovedadConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedDominio = false;
    	modifiedCausal = false;
    	modifiedGrupoUsuarios = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>GrupoAsignacionNovedadOid</code> object that identifies this instance of <code>GrupoAsignacionNovedad</code>.
     * @return <code>GrupoAsignacionNovedadOid </code> object that identifies this instance of <code>GrupoAsignacionNovedad</code>
     */
	@Override
    public GrupoAsignacionNovedadOid getOid() {
        return new GrupoAsignacionNovedadOid(getGrupoAsignacionNovedadId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(GrupoAsignacionNovedadConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(GrupoAsignacionNovedadConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.GRUPOASIGNACIONNOVEDAD)) {
            // Add this class
            activeFacets.add(Constants.GRUPOASIGNACIONNOVEDAD);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR)) {
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
            relatedInstance = buildGrupoAsignacionNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (GrupoAsignacionNovedadConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionNovedadRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionNovedadConstants.ROLE_NAME_CAUSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionNovedadRelatedInstance4Causal(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionNovedadConstants.ROLE_NAME_GRUPOUSUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionNovedadRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildGrupoAsignacionNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new GrupoAsignacionNovedad(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacionNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionNovedadRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacionNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionNovedadRelatedInstance4Causal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Causal(mapper.readValue(relatedInstanceJsonOid, CausalOid.class)): Causal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacionNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionNovedadRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacionNovedad.class).error(e.getMessage());
            return null;
        }
    }
}
