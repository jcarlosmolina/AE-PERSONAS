package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AgentexProductoConstants;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.persistence.oid.AgentexProductoOid;
import com.keralty.aepersonas.persistence.oid.AsesorOid;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.utils.Utilities;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
 * Persistent representation of the <code>AgentexProducto</code> model class.
 * <p>
 * Model Class: <code>AgentexProducto</code><br>
 */
@Entity(name = AgentexProductoConstants.CLASS_NAME)
@Table(name = AgentexProductoConstants.TBL_NAME)
public class AgentexProducto extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private AgentexProductoOid oid;

    /** Class identification function. */
    @Column(name = AgentexProductoConstants.FLD_FUNCIONARIOASESORID, insertable = false, updatable = false )
    @JsonProperty(value="asesor_id")
    private Long funcionarioAsesorId;

    /** Class identification function. */
    @Column(name = AgentexProductoConstants.FLD_AGENTEXPRODUCTOID, insertable = false, updatable = false )
    @JsonProperty(value="id")
    private Long agentexProductoId;

    /** Class member attribute. */
    @Column(name = AgentexProductoConstants.FLD_AGENTEXPRODUCTOCODIGO )
    @JsonProperty(value="codigo")
    private Long agentexProductoCodigo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAgentexProductoCodigo;

    /** Class member attribute. */
    @Column(name = AgentexProductoConstants.FLD_AGENTEXPRODUCTOFECHAINICIO )
    @JsonProperty(value="fechainicio")
    private Timestamp agentexProductoFechaInicio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAgentexProductoFechaInicio;

    /** Class member attribute. */
    @Column(name = AgentexProductoConstants.FLD_AGENTEXPRODUCTOFECHAFIN )
    @JsonProperty(value="fechafin")
    private Timestamp agentexProductoFechaFin;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAgentexProductoFechaFin;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvvigente")
    protected Boolean agentexProductodrvVigente;

    /** Class member attribute. */
    @Column(name = AgentexProductoConstants.FLD_AGENTEXPRODUCTOTODOSDOMINIOS )
    @JsonProperty(value="todosdominios")
    private Boolean agentexProductoTodosDominios;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAgentexProductoTodosDominios;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AgentexProductoConstants.FLD_PRODUCTOSPRODUCTO, referencedColumnName=ProductosConstants.FLD_PRODUCTOSPRODUCTO)
    })
    @JsonIgnore
    private Productos productoT;
    /** Related attribute. */
    @Column(name = AgentexProductoConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false)
    private Long productosProducto;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProductoT;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AgentexProductoConstants.FLD_FUNCIONARIOASESORID, referencedColumnName=AsesorConstants.FLD_FUNCIONARIOID, insertable = false, updatable = false)
    })
    @JsonIgnore
    private Asesor asesor;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAsesor;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_AGENTEXPRODUCTODOMINIO,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMAGENTEXPRODUCTODOMINIO_FUNCIONARIOID, referencedColumnName=AgentexProductoConstants.FLD_FUNCIONARIOASESORID)            , @JoinColumn(name=Constants.FLD_TMAGENTEXPRODUCTODOMINIO_AGENTEXPRODUCTOAGENTEXPRODUCTOID, referencedColumnName=AgentexProductoConstants.FLD_AGENTEXPRODUCTOID)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMAGENTEXPRODUCTODOMINIO_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
    })
    @JsonIgnore
    private Collection <Dominio> dominios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominios;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public AgentexProducto() {
        funcionarioAsesorId = null;
        agentexProductoId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>AgentexProducto</code>.
     * @param oid Object Identifier of the instance of <code>AgentexProducto</code> to be created.
     * @throws SystemException
     */
    public AgentexProducto(AgentexProductoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            funcionarioAsesorId = oid.getFuncionarioAsesorId();
            agentexProductoId = oid.getAgentexProductoId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code> through <code>Asesor</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Funcionario</code>
     * @return The value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code> through <code>Asesor</code>.
     */
    public Long getFuncionarioAsesorId() {
        return (asesor != null ? asesor.getFuncionarioId() : funcionarioAsesorId);
    }

    /**
     * Sets the value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code> through <code>Asesor</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Funcionario</code>
     * @param funcionarioAsesorId The new value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code> through <code>Asesor</code>.
     */
    public void setFuncionarioAsesorId(Long funcionarioAsesorId) {
        this.funcionarioAsesorId = funcionarioAsesorId;
    }

    /**
     * Returns the value of the <code>agentexProductoId</code> attribute<br>in class <code>AgentexProducto</code>.
     * This is part of the identification for this class, which depends on the identification of <code>AgentexProducto</code>
     * @return The value of the <code>agentexProductoId</code> attribute<br>in class <code>AgentexProducto</code>.
     */
    public Long getAgentexProductoId() {
        return agentexProductoId;
    }

    /**
     * Sets the value of the <code>agentexProductoId</code> attribute<br>in class <code>AgentexProducto</code>.
     * This is part of the identification for this class, which depends on the identification of <code>AgentexProducto</code>
     * @param agentexProductoId The new value of the <code>agentexProductoId</code> attribute<br>in class <code>AgentexProducto</code>.
     */
    public void setAgentexProductoId(Long agentexProductoId) {
        this.agentexProductoId = agentexProductoId;
    }

   /**
    * Returns the value of the <code>agentexProductoCodigo</code> attribute.<br>
    * Model Attribute: <code>agentexProductoCodigo</code>. Constant Int<br>
    * Comments: Código devuelto por el CORE que utilizarmos para identificar a la instancia en el proceso de sincronización<br>
    * @return The value of the <code>agentexProductoCodigo</code> attribute.
    */

    public Long getAgentexProductoCodigo()  {
    	Long value;
        value =  agentexProductoCodigo;
        return value;
    }

   /**
    * Sets the value of the <code>agentexProductoCodigo</code> attribute.<br>
    * Model Attribute: <code>agentexProductoCodigo</code>. Constant Int<br>
    * Comments: Código devuelto por el CORE que utilizarmos para identificar a la instancia en el proceso de sincronización<br>
    * @param agentexProductoCodigo The new value of the <code>agentexProductoCodigo</code> attribute.
    */
    public void setAgentexProductoCodigo (Long agentexProductoCodigo) {
        modifiedAgentexProductoCodigo = true;
        this.agentexProductoCodigo = agentexProductoCodigo;
    }

   /**
    * Returns the value of the <code>modifiedAgentexProductoCodigo</code> class property.<br>
    *
    * @return The value of the <code>modifiedAgentexProductoCodigo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAgentexProductoCodigo() {
        return modifiedAgentexProductoCodigo;
    }

   /**
    * Sets the value of the <code>modifiedAgentexProductoCodigo</code> class property.<br>
    * @param modified The new value of the <code>modifiedAgentexProductoCodigo</code>.
    */
    public void setModifiedAgentexProductoCodigo(boolean modified) {
        this.modifiedAgentexProductoCodigo = modified;
    }

   /**
    * Returns the value of the <code>agentexProductoFechaInicio</code> attribute.<br>
    * Model Attribute: <code>agentexProductoFechaInicio</code>. Variable DateTime<br>
    * Comments: <br>
    * @return The value of the <code>agentexProductoFechaInicio</code> attribute.
    */

    public Timestamp getAgentexProductoFechaInicio()  {
    	Timestamp value;
        value =  agentexProductoFechaInicio;
        return value;
    }

   /**
    * Sets the value of the <code>agentexProductoFechaInicio</code> attribute.<br>
    * Model Attribute: <code>agentexProductoFechaInicio</code>. Variable DateTime<br>
    * Comments: <br>
    * @param agentexProductoFechaInicio The new value of the <code>agentexProductoFechaInicio</code> attribute.
    */
    public void setAgentexProductoFechaInicio (Timestamp agentexProductoFechaInicio) {
        modifiedAgentexProductoFechaInicio = true;
        this.agentexProductoFechaInicio = agentexProductoFechaInicio;
    }

   /**
    * Returns the value of the <code>modifiedAgentexProductoFechaInicio</code> class property.<br>
    *
    * @return The value of the <code>modifiedAgentexProductoFechaInicio</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAgentexProductoFechaInicio() {
        return modifiedAgentexProductoFechaInicio;
    }

   /**
    * Sets the value of the <code>modifiedAgentexProductoFechaInicio</code> class property.<br>
    * @param modified The new value of the <code>modifiedAgentexProductoFechaInicio</code>.
    */
    public void setModifiedAgentexProductoFechaInicio(boolean modified) {
        this.modifiedAgentexProductoFechaInicio = modified;
    }

   /**
    * Returns the value of the <code>agentexProductoFechaFin</code> attribute.<br>
    * Model Attribute: <code>agentexProductoFechaFin</code>. Variable DateTime<br>
    * Comments: <br>
    * @return The value of the <code>agentexProductoFechaFin</code> attribute.
    */

    public Timestamp getAgentexProductoFechaFin()  {
    	Timestamp value;
        value =  agentexProductoFechaFin;
        return value;
    }

   /**
    * Sets the value of the <code>agentexProductoFechaFin</code> attribute.<br>
    * Model Attribute: <code>agentexProductoFechaFin</code>. Variable DateTime<br>
    * Comments: <br>
    * @param agentexProductoFechaFin The new value of the <code>agentexProductoFechaFin</code> attribute.
    */
    public void setAgentexProductoFechaFin (Timestamp agentexProductoFechaFin) {
        modifiedAgentexProductoFechaFin = true;
        this.agentexProductoFechaFin = agentexProductoFechaFin;
    }

   /**
    * Returns the value of the <code>modifiedAgentexProductoFechaFin</code> class property.<br>
    *
    * @return The value of the <code>modifiedAgentexProductoFechaFin</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAgentexProductoFechaFin() {
        return modifiedAgentexProductoFechaFin;
    }

   /**
    * Sets the value of the <code>modifiedAgentexProductoFechaFin</code> class property.<br>
    * @param modified The new value of the <code>modifiedAgentexProductoFechaFin</code>.
    */
    public void setModifiedAgentexProductoFechaFin(boolean modified) {
        this.modifiedAgentexProductoFechaFin = modified;
    }

   /**
    * Returns the value of the <code>agentexProductodrvVigente</code> attribute.<br>
    * Model Attribute: <code>agentexProductodrvVigente</code>. Variable Bool<br>
    * Comments: Indica que la fecha actual cae dentro del rango de Fecha Inicio - Fecha Fin<br>
    * @return The value of the <code>agentexProductodrvVigente</code> attribute.
    */

    @JsonIgnore
    public Boolean getAgentexProductodrvVigente()  {
    	Boolean value;
        try {
            value = agentexProductodrvVigenteDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: AgentexProducto, Attribute: agentexProductodrvVigente");
        }
        return value;
    }

   /**
    * Returns the value of the <code>agentexProductoTodosDominios</code> attribute.<br>
    * Model Attribute: <code>agentexProductoTodosDominios</code>. Variable Bool<br>
    * Comments: GdC-36. Req 12: Por defecto, todos los Asesores (incluidos los que aparezcan nuevos debido a la sincronización) deben tener asignados todos los Dominios de los productos que tiene relacionados. Para ello se añadirá una marca que indique “Todos los Dominios” en la paramétrica existente de “Asesor – Producto”<br>
    * @return The value of the <code>agentexProductoTodosDominios</code> attribute.
    */

    public Boolean getAgentexProductoTodosDominios()  {
    	Boolean value;
        value =  agentexProductoTodosDominios;
        return value;
    }

   /**
    * Sets the value of the <code>agentexProductoTodosDominios</code> attribute.<br>
    * Model Attribute: <code>agentexProductoTodosDominios</code>. Variable Bool<br>
    * Comments: GdC-36. Req 12: Por defecto, todos los Asesores (incluidos los que aparezcan nuevos debido a la sincronización) deben tener asignados todos los Dominios de los productos que tiene relacionados. Para ello se añadirá una marca que indique “Todos los Dominios” en la paramétrica existente de “Asesor – Producto”<br>
    * @param agentexProductoTodosDominios The new value of the <code>agentexProductoTodosDominios</code> attribute.
    */
    public void setAgentexProductoTodosDominios (Boolean agentexProductoTodosDominios) {
        modifiedAgentexProductoTodosDominios = true;
        this.agentexProductoTodosDominios = agentexProductoTodosDominios;
    }

   /**
    * Returns the value of the <code>modifiedAgentexProductoTodosDominios</code> class property.<br>
    *
    * @return The value of the <code>modifiedAgentexProductoTodosDominios</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAgentexProductoTodosDominios() {
        return modifiedAgentexProductoTodosDominios;
    }

   /**
    * Sets the value of the <code>modifiedAgentexProductoTodosDominios</code> class property.<br>
    * @param modified The new value of the <code>modifiedAgentexProductoTodosDominios</code>.
    */
    public void setModifiedAgentexProductoTodosDominios(boolean modified) {
        this.modifiedAgentexProductoTodosDominios = modified;
    }

    /**
     * Returns the instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * Model Relationship:
     * <code>[Productos] ProductoT 1:1  ------ 0:M  AgentexProducto [AgentexProducto]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     */
    @JsonIgnore
    public Productos getProductoT() {
        return productoT;
    }

    /**
     * Adds an instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * @param productoT The instance to add to the <code>ProductoT</code> role.
     */
    public void add2ProductoT(Productos productoT) {
        if (productoT == null || productoT.isNull()) {
            this.modifiedProductoT = true;
            this.productosProducto = null;
        } else {
            this.productosProducto = productoT.getProductosProducto();
        }
        this.productoT = (productoT == null  || productoT.isNull() ? null : productoT);
    }

   /**
    * This method gets the attribute value <code>modifiedProductoT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedProductoT</code> has been modified.
    */
    public boolean isModifiedProductoT(){
        return modifiedProductoT;
    }

    /**
     * Returns the instance of <code>Asesor</code> related through the <code>Asesor</code> role.
     * Model Relationship:
     * <code>[Asesor] Asesor 1:1  ------ 0:M  AgentexProducto [AgentexProducto]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Asesor</code> related through the <code>Asesor</code> role.
     */
    @JsonIgnore
    public Asesor getAsesor() {
        return asesor;
    }

    /**
     * Adds an instance of <code>Asesor</code> related through the <code>Asesor</code> role.
     * @param asesor The instance to add to the <code>Asesor</code> role.
     */
    public void add2Asesor(Asesor asesor) {
        if (asesor == null || asesor.isNull()) {
            this.modifiedAsesor = true;
            this.funcionarioAsesorId = null;
        } else {
            this.funcionarioAsesorId = asesor.getFuncionarioId();
        }
        this.asesor = (asesor == null  || asesor.isNull() ? null : asesor);
    }

   /**
    * This method gets the attribute value <code>modifiedAsesor</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAsesor</code> has been modified.
    */
    public boolean isModifiedAsesor(){
        return modifiedAsesor;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominios 0:M  ------ 0:M  AgentexProducto [AgentexProducto]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     */
    @JsonIgnore
    public Collection <Dominio> getDominios() {
        return dominios;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * @param dominios The instance to add to the <code>Dominios</code> role.
     */
    public void add2Dominios(Dominio dominios) {
        this.dominios.add(dominios);
    }
    /**
     * Removes an instance of <code>Dominio</code> related through the <code>Dominios</code> role.
     * @param dominios The instance to be removed
     */
    public void removeFromDominios(Dominio dominios) {
    	this.dominios.remove(dominios);
    }
    /**
     * Sets instances of <code>Dominio</code> related through the <code>Dominios</code> role.
     * @param dominios The new value for the <code>Dominios</code> role.
     */
    public void setDominios(Collection < Dominio > dominios) {
        this.dominios = dominios;
    }

   /**
    * This method gets the attribute value <code>modifiedDominios</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominios</code> has been modified.
    */
    public boolean isModifiedDominios(){
        return modifiedDominios;
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
     * Computes the value of the <code>agentexProductodrvVigente</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>agentexProductodrvVigente</code> derived attribute.
     */
    public Boolean agentexProductodrvVigenteDerivations() {

        agentexProductodrvVigente = null;

        agentexProductodrvVigenteDerivationsConditional1();
        agentexProductodrvVigenteDerivationsConditional2();
        agentexProductodrvVigenteDerivationsDefault();
        return agentexProductodrvVigente;
    }

    private void agentexProductodrvVigenteDerivationsConditional1() {
        if (agentexProductodrvVigente != null) return;
        // CONDITION: FechaInicio = NULL
        // EFFECT   : FALSE
        boolean agentexProductodrvVigenteCond = this.getAgentexProductoFechaInicio() == null;
        if (agentexProductodrvVigenteCond) {
            agentexProductodrvVigente = Boolean.FALSE;
        }
    }

    private void agentexProductodrvVigenteDerivationsConditional2() {
        if (agentexProductodrvVigente != null) return;
        // CONDITION: FechaInicio <> NULL AND FechaFin = NULL
        // EFFECT   : TRUE
        boolean agentexProductodrvVigenteCond = this.getAgentexProductoFechaInicio() != null && this.getAgentexProductoFechaFin() == null;
        if (agentexProductodrvVigenteCond) {
            agentexProductodrvVigente = Boolean.TRUE;
        }
    }

    private void agentexProductodrvVigenteDerivationsDefault() {
        if (agentexProductodrvVigente != null) return;
        // Default derivation
        // EFFECT   : FechaInicio <= systemDateTime(  ) AND systemDateTime(  ) <= FechaFin
        agentexProductodrvVigente = (STDFunctions.datetimeBeforeFun(this.getAgentexProductoFechaInicio(),STDFunctions.systemDateTimeFun()) || STDFunctions.datetimeEqualsFun(this.getAgentexProductoFechaInicio(), STDFunctions.systemDateTimeFun())) && (STDFunctions.datetimeBeforeFun(STDFunctions.systemDateTimeFun(),this.getAgentexProductoFechaFin()) || STDFunctions.datetimeEqualsFun(STDFunctions.systemDateTimeFun(), this.getAgentexProductoFechaFin()));
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        agentexProductoCodigo = Long.valueOf(0);
        agentexProductoFechaInicio = null;
        agentexProductoFechaFin = null;
        agentexProductoTodosDominios = false;
        productoT = null;
        asesor = null;
        dominios = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return AgentexProducto.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return AgentexProductoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedAgentexProductoCodigo = false;
    	values.put("agentexProductoCodigo", getAgentexProductoCodigo());
    	modifiedAgentexProductoFechaInicio = false;
    	values.put("agentexProductoFechaInicio", getAgentexProductoFechaInicio());
    	modifiedAgentexProductoFechaFin = false;
    	values.put("agentexProductoFechaFin", getAgentexProductoFechaFin());
    	modifiedAgentexProductoTodosDominios = false;
    	values.put("agentexProductoTodosDominios", getAgentexProductoTodosDominios());
    	modifiedProductoT = false;
    	modifiedAsesor = false;
    	modifiedDominios = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            agentexProductodrvVigente = null;
    }

    /**
     * Returns the <code>AgentexProductoOid</code> object that identifies this instance of <code>AgentexProducto</code>.
     * @return <code>AgentexProductoOid </code> object that identifies this instance of <code>AgentexProducto</code>
     */
	@Override
    public AgentexProductoOid getOid() {
        return new AgentexProductoOid(getFuncionarioAsesorId(), getAgentexProductoId());
    }

    /**
     * Sets the <code>AgentexProductoOid</code> object that identifies this instance of <code>AgentexProducto</code>.
     */    
    public void setOid(AgentexProductoOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(AgentexProductoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(AgentexProductoConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.AGENTEXPRODUCTO)) {
            // Add this class
            activeFacets.add(Constants.AGENTEXPRODUCTO);
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


        if (getAgent().isFacetActive(Constants.AGENT_ASESOR)) {
            Asesor agentInstance = (Asesor) getAgent().getAgentInstance(Constants.ASESOR);

            // Check the HV formula.
            /* 
            Asesor = agent OR Asesor.CodJefe = Agent.Usuario
            */
            try {
                if (Utilities.isEqual(this.getAsesor(), agentInstance) || (this.getAsesor().getFuncionarioCodJefe()).equals(agentInstance.getFuncionarioUsuario())) {
                    returnValue = true;
                }
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            	returnValue = false;
            }
        }
        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES)) {
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
            relatedInstance = buildAgentexProductoRelatedInstance(relatedInstanceJsonOid);
        }
        if (AgentexProductoConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAgentexProductoRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (AgentexProductoConstants.ROLE_NAME_ASESOR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAgentexProductoRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        if (AgentexProductoConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAgentexProductoRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAgentexProductoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new AgentexProducto(mapper.readValue(relatedInstanceJsonOid, AgentexProductoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AgentexProducto.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAgentexProductoRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AgentexProducto.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAgentexProductoRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AgentexProducto.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAgentexProductoRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AgentexProducto.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
