package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.MesaDeApoyoConstants;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionOid;
import com.keralty.aepersonas.persistence.oid.LogFuncionarioOid;
import com.keralty.aepersonas.persistence.oid.MesaDeApoyoOid;
import com.keralty.aepersonas.persistence.oid.ObsEstadoOid;
import com.keralty.aepersonas.persistence.oid.ReportesProcAlmOid;
import com.keralty.aepersonas.persistence.oid.RolOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.SucursalOid;
import com.keralty.aepersonas.repository.MesaDeApoyoJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;
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
 * Persistent representation of the <code>MesaDeApoyo</code> model class.
 * <p>
 * Model Class: <code>MesaDeApoyo</code><br>
 */
@Entity(name = MesaDeApoyoConstants.CLASS_NAME)
@Table(name = MesaDeApoyoConstants.TBL_NAME)
public class MesaDeApoyo extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient MesaDeApoyoJpaRepository mesaDeApoyoRepository;

    /** Class identification function. */
    @Id
    @Column(name = MesaDeApoyoConstants.FLD_FUNCIONARIOID, insertable = false, updatable = false )
    @JsonProperty(value="id")
    private Long funcionarioId;

    @Column(name = MesaDeApoyoConstants.FLD_P4SSW0RD )
    @JsonProperty(value="password")
    private String passWord;

    @Transient
    @JsonIgnore
    private boolean modifiedPassWord;

    /** Class member parent. */
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({
        @JoinColumn(name=MesaDeApoyoConstants.FLD_FUNCIONARIOID, referencedColumnName=FuncionarioConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Funcionario parentFuncionario;

    /** Class member parent initialized. */
    @Transient
    @JsonIgnore
    private boolean parentFuncionarioInitialized;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public MesaDeApoyo() {
        funcionarioId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>MesaDeApoyo</code>.
     * @param oid Object Identifier of the instance of <code>MesaDeApoyo</code> to be created.
     * @throws SystemException
     */
    public MesaDeApoyo(MesaDeApoyoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            funcionarioId = oid.getFuncionarioId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Funcionario</code>
     * @return The value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code>.
     */
    @JsonProperty(value="id")
    public Long getMesaDeApoyoId() {
        return getFuncionarioId();
    }

    @JsonIgnore
    public Long getFuncionarioId() {
        return funcionarioId;
    }

    /**
     * Sets the value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Funcionario</code>
     * @param funcionarioId The new value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code>.
     */
    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

   /**
    * Returns the value of the <code>funcionarioManual</code> attribute.<br>
    * Model Attribute: <code>funcionarioManual</code>. Constant Bool<br>
    * Comments: GC3: Indica si es manual o viene de la sincronización<br>
    * @return The value of the <code>funcionarioManual</code> attribute.
    */
    @JsonProperty(value="manual")
    public Boolean getMesaDeApoyoManual()  {
        return getFuncionarioManual();
    }

    @JsonIgnore
    public Boolean getFuncionarioManual()  {
    	Boolean value;
        value = getParentFuncionario().getFuncionarioManual();
        return value;
    }

   /**
    * Sets the value of the <code>funcionarioManual</code> attribute.<br>
    * Model Attribute: <code>funcionarioManual</code>. Constant Bool<br>
    * Comments: GC3: Indica si es manual o viene de la sincronización<br>
    * @param funcionarioManual The new value of the <code>funcionarioManual</code> attribute.
    */
    public void setFuncionarioManual (Boolean funcionarioManual) {
        getParentFuncionario().setFuncionarioManual(funcionarioManual);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioManual</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioManual</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioManual() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioManual();
    }

   /**
    * Returns the value of the <code>funcionarioUsuario</code> attribute.<br>
    * Model Attribute: <code>funcionarioUsuario</code>. Variable String Size=50<br>
    * Comments: Admin's identification function<br>
    * @return The value of the <code>funcionarioUsuario</code> attribute.
    */
    @JsonProperty(value="usuario")
    public String getMesaDeApoyoUsuario()  {
        return getFuncionarioUsuario();
    }

    @JsonIgnore
    public String getFuncionarioUsuario()  {
    	String value;
        value = getParentFuncionario().getFuncionarioUsuario();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioUsuario</code> attribute.<br>
    * Model Attribute: <code>funcionarioUsuario</code>. Variable String Size=50<br>
    * Comments: Admin's identification function<br>
    * @param funcionarioUsuario The new value of the <code>funcionarioUsuario</code> attribute.
    */
    public void setFuncionarioUsuario (String funcionarioUsuario) {
        getParentFuncionario().setFuncionarioUsuario(funcionarioUsuario);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioUsuario</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioUsuario() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioUsuario();
    }

   /**
    * Returns the value of the <code>funcionarioPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>funcionarioPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioPrimerNombre</code> attribute.
    */
    @JsonProperty(value="primernombre")
    public String getMesaDeApoyoPrimerNombre()  {
        return getFuncionarioPrimerNombre();
    }

    @JsonIgnore
    public String getFuncionarioPrimerNombre()  {
    	String value;
        value = getParentFuncionario().getFuncionarioPrimerNombre();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>funcionarioPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioPrimerNombre The new value of the <code>funcionarioPrimerNombre</code> attribute.
    */
    public void setFuncionarioPrimerNombre (String funcionarioPrimerNombre) {
        getParentFuncionario().setFuncionarioPrimerNombre(funcionarioPrimerNombre);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioPrimerNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioPrimerNombre</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioPrimerNombre() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioPrimerNombre();
    }

   /**
    * Returns the value of the <code>funcionarioSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>funcionarioSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioSegundoNombre</code> attribute.
    */
    @JsonProperty(value="segundonombre")
    public String getMesaDeApoyoSegundoNombre()  {
        return getFuncionarioSegundoNombre();
    }

    @JsonIgnore
    public String getFuncionarioSegundoNombre()  {
    	String value;
        value = getParentFuncionario().getFuncionarioSegundoNombre();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>funcionarioSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioSegundoNombre The new value of the <code>funcionarioSegundoNombre</code> attribute.
    */
    public void setFuncionarioSegundoNombre (String funcionarioSegundoNombre) {
        getParentFuncionario().setFuncionarioSegundoNombre(funcionarioSegundoNombre);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioSegundoNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioSegundoNombre</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioSegundoNombre() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioSegundoNombre();
    }

   /**
    * Returns the value of the <code>funcionarioPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>funcionarioPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioPrimerApellido</code> attribute.
    */
    @JsonProperty(value="primerapellido")
    public String getMesaDeApoyoPrimerApellido()  {
        return getFuncionarioPrimerApellido();
    }

    @JsonIgnore
    public String getFuncionarioPrimerApellido()  {
    	String value;
        value = getParentFuncionario().getFuncionarioPrimerApellido();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>funcionarioPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioPrimerApellido The new value of the <code>funcionarioPrimerApellido</code> attribute.
    */
    public void setFuncionarioPrimerApellido (String funcionarioPrimerApellido) {
        getParentFuncionario().setFuncionarioPrimerApellido(funcionarioPrimerApellido);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioPrimerApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioPrimerApellido</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioPrimerApellido() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioPrimerApellido();
    }

   /**
    * Returns the value of the <code>funcionarioSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>funcionarioSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioSegundoApellido</code> attribute.
    */
    @JsonProperty(value="segundoapellido")
    public String getMesaDeApoyoSegundoApellido()  {
        return getFuncionarioSegundoApellido();
    }

    @JsonIgnore
    public String getFuncionarioSegundoApellido()  {
    	String value;
        value = getParentFuncionario().getFuncionarioSegundoApellido();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>funcionarioSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioSegundoApellido The new value of the <code>funcionarioSegundoApellido</code> attribute.
    */
    public void setFuncionarioSegundoApellido (String funcionarioSegundoApellido) {
        getParentFuncionario().setFuncionarioSegundoApellido(funcionarioSegundoApellido);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioSegundoApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioSegundoApellido</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioSegundoApellido() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioSegundoApellido();
    }

   /**
    * Returns the value of the <code>funcionariodrvNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvNombreCompleto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>funcionariodrvNombreCompleto</code> attribute.
    */
    @JsonProperty(value="drvnombrecompleto")
    public String getMesaDeApoyoDrvNombreCompleto()  {
        return getFuncionariodrvNombreCompleto();
    }

    @JsonIgnore
    public String getFuncionariodrvNombreCompleto()  {
    	String value;
        value = getParentFuncionario().getFuncionariodrvNombreCompleto();
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>funcionarioUsuarioLDAP</code> attribute.<br>
    * Model Attribute: <code>funcionarioUsuarioLDAP</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioUsuarioLDAP</code> attribute.
    */
    @JsonProperty(value="usuarioldap")
    public String getMesaDeApoyoUsuarioLDAP()  {
        return getFuncionarioUsuarioLDAP();
    }

    @JsonIgnore
    public String getFuncionarioUsuarioLDAP()  {
    	String value;
        value = getParentFuncionario().getFuncionarioUsuarioLDAP();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioUsuarioLDAP</code> attribute.<br>
    * Model Attribute: <code>funcionarioUsuarioLDAP</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioUsuarioLDAP The new value of the <code>funcionarioUsuarioLDAP</code> attribute.
    */
    public void setFuncionarioUsuarioLDAP (String funcionarioUsuarioLDAP) {
        getParentFuncionario().setFuncionarioUsuarioLDAP(funcionarioUsuarioLDAP);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioUsuarioLDAP</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioUsuarioLDAP</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioUsuarioLDAP() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioUsuarioLDAP();
    }

   /**
    * Returns the value of the <code>funcionarioEmail</code> attribute.<br>
    * Model Attribute: <code>funcionarioEmail</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioEmail</code> attribute.
    */
    @JsonProperty(value="email")
    public String getMesaDeApoyoEmail()  {
        return getFuncionarioEmail();
    }

    @JsonIgnore
    public String getFuncionarioEmail()  {
    	String value;
        value = getParentFuncionario().getFuncionarioEmail();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioEmail</code> attribute.<br>
    * Model Attribute: <code>funcionarioEmail</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param funcionarioEmail The new value of the <code>funcionarioEmail</code> attribute.
    */
    public void setFuncionarioEmail (String funcionarioEmail) {
        getParentFuncionario().setFuncionarioEmail(funcionarioEmail);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioEmail</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioEmail</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioEmail() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioEmail();
    }

   /**
    * Returns the value of the <code>funcionarioCodJefe</code> attribute.<br>
    * Model Attribute: <code>funcionarioCodJefe</code>. Variable String Size=50<br>
    * Comments: Este atributo tomará valor si el agente es un Asesor que tiene responsable (JefeAsesores). En este caso, se le dará como valor el código de usuario del JefeAsesores. Se utilizará en fórmulas de VH de JefeAsesores.<br>
    * @return The value of the <code>funcionarioCodJefe</code> attribute.
    */
    @JsonProperty(value="codjefe")
    public String getMesaDeApoyoCodJefe()  {
        return getFuncionarioCodJefe();
    }

    @JsonIgnore
    public String getFuncionarioCodJefe()  {
    	String value;
        value = getParentFuncionario().getFuncionarioCodJefe();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioCodJefe</code> attribute.<br>
    * Model Attribute: <code>funcionarioCodJefe</code>. Variable String Size=50<br>
    * Comments: Este atributo tomará valor si el agente es un Asesor que tiene responsable (JefeAsesores). En este caso, se le dará como valor el código de usuario del JefeAsesores. Se utilizará en fórmulas de VH de JefeAsesores.<br>
    * @param funcionarioCodJefe The new value of the <code>funcionarioCodJefe</code> attribute.
    */
    public void setFuncionarioCodJefe (String funcionarioCodJefe) {
        getParentFuncionario().setFuncionarioCodJefe(funcionarioCodJefe);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioCodJefe</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioCodJefe</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioCodJefe() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioCodJefe();
    }

   /**
    * Returns the value of the <code>funcionariodrvNomJefe</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvNomJefe</code>. Variable String Size=255<br>
    * Comments: Este atributo tomará valor si el agente es un Asesor que tiene responsable (JefeAsesores). En CodJefe se tendrá el código y aquí el nombre. Se necesita para el report de Solicitud. <br>
    * @return The value of the <code>funcionariodrvNomJefe</code> attribute.
    */
    @JsonProperty(value="drvnomjefe")
    public String getMesaDeApoyoDrvNomJefe()  {
        return getFuncionariodrvNomJefe();
    }

    @JsonIgnore
    public String getFuncionariodrvNomJefe()  {
    	String value;
        value = getParentFuncionario().getFuncionariodrvNomJefe();
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>funcionariodrvNomAgencia</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvNomAgencia</code>. Variable String Size=255<br>
    * Comments: Unicamente para Asesores de Agencia (manuales) e indica el nombre de la AGencia (Jefe del asesor)<br>
    * @return The value of the <code>funcionariodrvNomAgencia</code> attribute.
    */
    @JsonProperty(value="drvnomagencia")
    public String getMesaDeApoyoDrvNomAgencia()  {
        return getFuncionariodrvNomAgencia();
    }

    @JsonIgnore
    public String getFuncionariodrvNomAgencia()  {
    	String value;
        value = getParentFuncionario().getFuncionariodrvNomAgencia();
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>funcionarioDisponible</code> attribute.<br>
    * Model Attribute: <code>funcionarioDisponible</code>. Variable Bool<br>
    * Comments: GdC-26 Req. 5: Marcación de usuarios no disponibles
Se requiere que sea posible marcar a los usuarios que no se encuentran disponibles. Por ejemplo, para usuarios que están de vacaciones, o que no han ido a trabajar por causa médica o porqué se encuentra en otro proceso, etc.
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>funcionarioDisponible</code> attribute.
    */
    @JsonProperty(value="disponible")
    public Boolean getMesaDeApoyoDisponible()  {
        return getFuncionarioDisponible();
    }

    @JsonIgnore
    public Boolean getFuncionarioDisponible()  {
    	Boolean value;
        value = getParentFuncionario().getFuncionarioDisponible();
        return value;
    }

   /**
    * Sets the value of the <code>funcionarioDisponible</code> attribute.<br>
    * Model Attribute: <code>funcionarioDisponible</code>. Variable Bool<br>
    * Comments: GdC-26 Req. 5: Marcación de usuarios no disponibles
Se requiere que sea posible marcar a los usuarios que no se encuentran disponibles. Por ejemplo, para usuarios que están de vacaciones, o que no han ido a trabajar por causa médica o porqué se encuentra en otro proceso, etc.
<Options>
RADIO=1;
</Options><br>
    * @param funcionarioDisponible The new value of the <code>funcionarioDisponible</code> attribute.
    */
    public void setFuncionarioDisponible (Boolean funcionarioDisponible) {
        getParentFuncionario().setFuncionarioDisponible(funcionarioDisponible);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioDisponible</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioDisponible</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioDisponible() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioDisponible();
    }

   /**
    * Returns the value of the <code>funcionarioNumSolNoTerminadas</code> attribute.<br>
    * Model Attribute: <code>funcionarioNumSolNoTerminadas</code>. Variable Nat<br>
    * Comments: GdC-26 Req. 6: Asignación automática de solicitudes
Indica el número de solicitudes no terminadas que tiene asignadas el usuario. Se utilizará en los procesos de asignación automática de usuarios a solicitudes<br>
    * @return The value of the <code>funcionarioNumSolNoTerminadas</code> attribute.
    */
    @JsonProperty(value="numsolnoterminadas")
    public Long getMesaDeApoyoNumSolNoTerminadas()  {
        return getFuncionarioNumSolNoTerminadas();
    }

    @JsonIgnore
    public Long getFuncionarioNumSolNoTerminadas()  {
    	Long value;
        value = getParentFuncionario().getFuncionarioNumSolNoTerminadas();
        return value;
    }

   /**
    * Sets the value of the <code>funcionarioNumSolNoTerminadas</code> attribute.<br>
    * Model Attribute: <code>funcionarioNumSolNoTerminadas</code>. Variable Nat<br>
    * Comments: GdC-26 Req. 6: Asignación automática de solicitudes
Indica el número de solicitudes no terminadas que tiene asignadas el usuario. Se utilizará en los procesos de asignación automática de usuarios a solicitudes<br>
    * @param funcionarioNumSolNoTerminadas The new value of the <code>funcionarioNumSolNoTerminadas</code> attribute.
    */
    public void setFuncionarioNumSolNoTerminadas (Long funcionarioNumSolNoTerminadas) {
        getParentFuncionario().setFuncionarioNumSolNoTerminadas(funcionarioNumSolNoTerminadas);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioNumSolNoTerminadas</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioNumSolNoTerminadas</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioNumSolNoTerminadas() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioNumSolNoTerminadas();
    }

   /**
    * Returns the value of the <code>funcionariodrvEsAsesorIntegral</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvEsAsesorIntegral</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>funcionariodrvEsAsesorIntegral</code> attribute.
    */
    @JsonProperty(value="drvesasesorintegral")
    public Boolean getMesaDeApoyoDrvEsAsesorIntegral()  {
        return getFuncionariodrvEsAsesorIntegral();
    }

    @JsonIgnore
    public Boolean getFuncionariodrvEsAsesorIntegral()  {
    	Boolean value;
        value = getParentFuncionario().getFuncionariodrvEsAsesorIntegral();
        return value;
    }

   /**
    * Returns the value of the <code>funcionariodrvEsAfiliacion</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvEsAfiliacion</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>funcionariodrvEsAfiliacion</code> attribute.
    */
    @JsonProperty(value="drvesafiliacion")
    public Boolean getMesaDeApoyoDrvEsAfiliacion()  {
        return getFuncionariodrvEsAfiliacion();
    }

    @JsonIgnore
    public Boolean getFuncionariodrvEsAfiliacion()  {
    	Boolean value;
        value = getParentFuncionario().getFuncionariodrvEsAfiliacion();
        return value;
    }

   /**
    * Returns the value of the <code>funcionarioIdSesion</code> attribute.<br>
    * Model Attribute: <code>funcionarioIdSesion</code>. Variable String Size=50<br>
    * Comments: Id de sesion para controlar la duplicidad de sesiones de usuario<br>
    * @return The value of the <code>funcionarioIdSesion</code> attribute.
    */
    @JsonProperty(value="idsesion")
    public String getMesaDeApoyoIdSesion()  {
        return getFuncionarioIdSesion();
    }

    @JsonIgnore
    public String getFuncionarioIdSesion()  {
    	String value;
        value = getParentFuncionario().getFuncionarioIdSesion();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioIdSesion</code> attribute.<br>
    * Model Attribute: <code>funcionarioIdSesion</code>. Variable String Size=50<br>
    * Comments: Id de sesion para controlar la duplicidad de sesiones de usuario<br>
    * @param funcionarioIdSesion The new value of the <code>funcionarioIdSesion</code> attribute.
    */
    public void setFuncionarioIdSesion (String funcionarioIdSesion) {
        getParentFuncionario().setFuncionarioIdSesion(funcionarioIdSesion);
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioIdSesion</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioIdSesion</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioIdSesion() throws SystemException {
        return getFuncionarioFacet().isModifiedFuncionarioIdSesion();
    }

   /**
    * Returns the value of the <code>asesorModDBasicosPersona</code> attribute.<br>
    * Model Attribute: <code>asesorModDBasicosPersona</code>. Variable Bool<br>
    * Comments: Parametrización propia de AE. Para registrar si un asesor puede modificar los datos básicos de persona o no. <br>
    * @return The value of the <code>asesorModDBasicosPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="moddbasicospersona")
    public Boolean getMesaDeApoyoModDBasicosPersona() throws SystemException  {
        return getAsesorModDBasicosPersona();
    }

    @JsonIgnore
    public Boolean getAsesorModDBasicosPersona() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorModDBasicosPersona();
        return value;
    }

   /**
    * Sets the value of the <code>asesorModDBasicosPersona</code> attribute.<br>
    * Model Attribute: <code>asesorModDBasicosPersona</code>. Variable Bool<br>
    * Comments: Parametrización propia de AE. Para registrar si un asesor puede modificar los datos básicos de persona o no. <br>
    * @param asesorModDBasicosPersona The new value of the <code>asesorModDBasicosPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorModDBasicosPersona (Boolean asesorModDBasicosPersona) throws SystemException {
        getAsesorFacet().setAsesorModDBasicosPersona(asesorModDBasicosPersona);
    }

   /**
    * Returns the value of the <code>modifiedAsesorModDBasicosPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorModDBasicosPersona</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorModDBasicosPersona() throws SystemException {
        return getAsesorFacet().isModifiedAsesorModDBasicosPersona();
    }

   /**
    * Returns the value of the <code>asesormodificaDirector</code> attribute.<br>
    * Model Attribute: <code>asesormodificaDirector</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>asesormodificaDirector</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="modificadirector")
    public Boolean getMesaDeApoyoModificaDirector() throws SystemException  {
        return getAsesormodificaDirector();
    }

    @JsonIgnore
    public Boolean getAsesormodificaDirector() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesormodificaDirector();
        return value;
    }

   /**
    * Sets the value of the <code>asesormodificaDirector</code> attribute.<br>
    * Model Attribute: <code>asesormodificaDirector</code>. Variable Bool<br>
    * Comments: <br>
    * @param asesormodificaDirector The new value of the <code>asesormodificaDirector</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesormodificaDirector (Boolean asesormodificaDirector) throws SystemException {
        getAsesorFacet().setAsesormodificaDirector(asesormodificaDirector);
    }

   /**
    * Returns the value of the <code>modifiedAsesormodificaDirector</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesormodificaDirector</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesormodificaDirector() throws SystemException {
        return getAsesorFacet().isModifiedAsesormodificaDirector();
    }

   /**
    * Returns the value of the <code>asesoresDirector</code> attribute.<br>
    * Model Attribute: <code>asesoresDirector</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>asesoresDirector</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="esdirector")
    public Boolean getMesaDeApoyoEsDirector() throws SystemException  {
        return getAsesoresDirector();
    }

    @JsonIgnore
    public Boolean getAsesoresDirector() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesoresDirector();
        return value;
    }

   /**
    * Sets the value of the <code>asesoresDirector</code> attribute.<br>
    * Model Attribute: <code>asesoresDirector</code>. Variable Bool<br>
    * Comments: <br>
    * @param asesoresDirector The new value of the <code>asesoresDirector</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesoresDirector (Boolean asesoresDirector) throws SystemException {
        getAsesorFacet().setAsesoresDirector(asesoresDirector);
    }

   /**
    * Returns the value of the <code>modifiedAsesoresDirector</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesoresDirector</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesoresDirector() throws SystemException {
        return getAsesorFacet().isModifiedAsesoresDirector();
    }

   /**
    * Returns the value of the <code>asesorNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>asesorNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>asesorNumIdentificacion</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="numidentificacion")
    public String getMesaDeApoyoNumIdentificacion() throws SystemException  {
        return getAsesorNumIdentificacion();
    }

    @JsonIgnore
    public String getAsesorNumIdentificacion() throws SystemException  {
    	String value;
        value = getAsesorFacet().getAsesorNumIdentificacion();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>asesorNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>asesorNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @param asesorNumIdentificacion The new value of the <code>asesorNumIdentificacion</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorNumIdentificacion (String asesorNumIdentificacion) throws SystemException {
        getAsesorFacet().setAsesorNumIdentificacion(asesorNumIdentificacion);
    }

   /**
    * Returns the value of the <code>modifiedAsesorNumIdentificacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorNumIdentificacion</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorNumIdentificacion() throws SystemException {
        return getAsesorFacet().isModifiedAsesorNumIdentificacion();
    }

   /**
    * Returns the value of the <code>asesorEsIntegral</code> attribute.<br>
    * Model Attribute: <code>asesorEsIntegral</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>asesorEsIntegral</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="esintegral")
    public Boolean getMesaDeApoyoEsIntegral() throws SystemException  {
        return getAsesorEsIntegral();
    }

    @JsonIgnore
    public Boolean getAsesorEsIntegral() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorEsIntegral();
        return value;
    }

   /**
    * Sets the value of the <code>asesorEsIntegral</code> attribute.<br>
    * Model Attribute: <code>asesorEsIntegral</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param asesorEsIntegral The new value of the <code>asesorEsIntegral</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorEsIntegral (Boolean asesorEsIntegral) throws SystemException {
        getAsesorFacet().setAsesorEsIntegral(asesorEsIntegral);
    }

   /**
    * Returns the value of the <code>modifiedAsesorEsIntegral</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorEsIntegral</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorEsIntegral() throws SystemException {
        return getAsesorFacet().isModifiedAsesorEsIntegral();
    }

   /**
    * Returns the value of the <code>asesorVerDBasicosPersona</code> attribute.<br>
    * Model Attribute: <code>asesorVerDBasicosPersona</code>. Variable Bool<br>
    * Comments: GdC-36: Req 5: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se puede visualizar los datos básicos de usuarios (Información del contratante o información de personas a afiliar) para inclusiones y nueva afiliación.<br>
    * @return The value of the <code>asesorVerDBasicosPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="verdbasicospersona")
    public Boolean getMesaDeApoyoVerDBasicosPersona() throws SystemException  {
        return getAsesorVerDBasicosPersona();
    }

    @JsonIgnore
    public Boolean getAsesorVerDBasicosPersona() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorVerDBasicosPersona();
        return value;
    }

   /**
    * Sets the value of the <code>asesorVerDBasicosPersona</code> attribute.<br>
    * Model Attribute: <code>asesorVerDBasicosPersona</code>. Variable Bool<br>
    * Comments: GdC-36: Req 5: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se puede visualizar los datos básicos de usuarios (Información del contratante o información de personas a afiliar) para inclusiones y nueva afiliación.<br>
    * @param asesorVerDBasicosPersona The new value of the <code>asesorVerDBasicosPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorVerDBasicosPersona (Boolean asesorVerDBasicosPersona) throws SystemException {
        getAsesorFacet().setAsesorVerDBasicosPersona(asesorVerDBasicosPersona);
    }

   /**
    * Returns the value of the <code>modifiedAsesorVerDBasicosPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorVerDBasicosPersona</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorVerDBasicosPersona() throws SystemException {
        return getAsesorFacet().isModifiedAsesorVerDBasicosPersona();
    }

   /**
    * Returns the value of the <code>asesorVerDocIdentificacionPersona</code> attribute.<br>
    * Model Attribute: <code>asesorVerDocIdentificacionPersona</code>. Variable Bool<br>
    * Comments: GdC-36: Req 8: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se pueden visualizar (abrir en otra pestaña del navegador o descargar) los documentos que se encuentran ya almacenados en el gestor documental (Información del contratante o información de personas a afiliar).<br>
    * @return The value of the <code>asesorVerDocIdentificacionPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="verdocidentificacionpersona")
    public Boolean getMesaDeApoyoVerDocIdentificacionPersona() throws SystemException  {
        return getAsesorVerDocIdentificacionPersona();
    }

    @JsonIgnore
    public Boolean getAsesorVerDocIdentificacionPersona() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorVerDocIdentificacionPersona();
        return value;
    }

   /**
    * Sets the value of the <code>asesorVerDocIdentificacionPersona</code> attribute.<br>
    * Model Attribute: <code>asesorVerDocIdentificacionPersona</code>. Variable Bool<br>
    * Comments: GdC-36: Req 8: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se pueden visualizar (abrir en otra pestaña del navegador o descargar) los documentos que se encuentran ya almacenados en el gestor documental (Información del contratante o información de personas a afiliar).<br>
    * @param asesorVerDocIdentificacionPersona The new value of the <code>asesorVerDocIdentificacionPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorVerDocIdentificacionPersona (Boolean asesorVerDocIdentificacionPersona) throws SystemException {
        getAsesorFacet().setAsesorVerDocIdentificacionPersona(asesorVerDocIdentificacionPersona);
    }

   /**
    * Returns the value of the <code>modifiedAsesorVerDocIdentificacionPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorVerDocIdentificacionPersona</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorVerDocIdentificacionPersona() throws SystemException {
        return getAsesorFacet().isModifiedAsesorVerDocIdentificacionPersona();
    }

   /**
    * Returns the value of the <code>asesorVerContratoNovedad</code> attribute.<br>
    * Model Attribute: <code>asesorVerContratoNovedad</code>. Variable Bool<br>
    * Comments: GdC-36: Req 9: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se puede visualizar la información correspondiente al contrato ingresado en la opción NOVEDADES (Ya sea Colectivo o Familiar)<br>
    * @return The value of the <code>asesorVerContratoNovedad</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="vercontratonovedad")
    public Boolean getMesaDeApoyoVerContratoNovedad() throws SystemException  {
        return getAsesorVerContratoNovedad();
    }

    @JsonIgnore
    public Boolean getAsesorVerContratoNovedad() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorVerContratoNovedad();
        return value;
    }

   /**
    * Sets the value of the <code>asesorVerContratoNovedad</code> attribute.<br>
    * Model Attribute: <code>asesorVerContratoNovedad</code>. Variable Bool<br>
    * Comments: GdC-36: Req 9: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se puede visualizar la información correspondiente al contrato ingresado en la opción NOVEDADES (Ya sea Colectivo o Familiar)<br>
    * @param asesorVerContratoNovedad The new value of the <code>asesorVerContratoNovedad</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorVerContratoNovedad (Boolean asesorVerContratoNovedad) throws SystemException {
        getAsesorFacet().setAsesorVerContratoNovedad(asesorVerContratoNovedad);
    }

   /**
    * Returns the value of the <code>modifiedAsesorVerContratoNovedad</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorVerContratoNovedad</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorVerContratoNovedad() throws SystemException {
        return getAsesorFacet().isModifiedAsesorVerContratoNovedad();
    }

   /**
    * Returns the value of the <code>asesorCanalComercial</code> attribute.<br>
    * Model Attribute: <code>asesorCanalComercial</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @return The value of the <code>asesorCanalComercial</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="canalcomercial")
    public String getMesaDeApoyoCanalComercial() throws SystemException  {
        return getAsesorCanalComercial();
    }

    @JsonIgnore
    public String getAsesorCanalComercial() throws SystemException  {
    	String value;
        value = getAsesorFacet().getAsesorCanalComercial();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>asesorCanalComercial</code> attribute.<br>
    * Model Attribute: <code>asesorCanalComercial</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @param asesorCanalComercial The new value of the <code>asesorCanalComercial</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorCanalComercial (String asesorCanalComercial) throws SystemException {
        getAsesorFacet().setAsesorCanalComercial(asesorCanalComercial);
    }

   /**
    * Returns the value of the <code>modifiedAsesorCanalComercial</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorCanalComercial</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorCanalComercial() throws SystemException {
        return getAsesorFacet().isModifiedAsesorCanalComercial();
    }

   /**
    * Returns the value of the <code>asesorCargo</code> attribute.<br>
    * Model Attribute: <code>asesorCargo</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @return The value of the <code>asesorCargo</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="cargo")
    public String getMesaDeApoyoCargo() throws SystemException  {
        return getAsesorCargo();
    }

    @JsonIgnore
    public String getAsesorCargo() throws SystemException  {
    	String value;
        value = getAsesorFacet().getAsesorCargo();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>asesorCargo</code> attribute.<br>
    * Model Attribute: <code>asesorCargo</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @param asesorCargo The new value of the <code>asesorCargo</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorCargo (String asesorCargo) throws SystemException {
        getAsesorFacet().setAsesorCargo(asesorCargo);
    }

   /**
    * Returns the value of the <code>modifiedAsesorCargo</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorCargo</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorCargo() throws SystemException {
        return getAsesorFacet().isModifiedAsesorCargo();
    }

   /**
    * Returns the value of the <code>asesorEstado</code> attribute.<br>
    * Model Attribute: <code>asesorEstado</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @return The value of the <code>asesorEstado</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="estado")
    public String getMesaDeApoyoEstado() throws SystemException  {
        return getAsesorEstado();
    }

    @JsonIgnore
    public String getAsesorEstado() throws SystemException  {
    	String value;
        value = getAsesorFacet().getAsesorEstado();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>asesorEstado</code> attribute.<br>
    * Model Attribute: <code>asesorEstado</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @param asesorEstado The new value of the <code>asesorEstado</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorEstado (String asesorEstado) throws SystemException {
        getAsesorFacet().setAsesorEstado(asesorEstado);
    }

   /**
    * Returns the value of the <code>modifiedAsesorEstado</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorEstado</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorEstado() throws SystemException {
        return getAsesorFacet().isModifiedAsesorEstado();
    }

   /**
    * Returns the value of the <code>asesorAccesoValidadorUsuarios</code> attribute.<br>
    * Model Attribute: <code>asesorAccesoValidadorUsuarios</code>. Variable Bool<br>
    * Comments: GdC-40 req 4: Configuración del 'Validador de Usuarios' para rol Asesor<br>
    * @return The value of the <code>asesorAccesoValidadorUsuarios</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="accesovalidadorusuarios")
    public Boolean getMesaDeApoyoAccesoValidadorUsuarios() throws SystemException  {
        return getAsesorAccesoValidadorUsuarios();
    }

    @JsonIgnore
    public Boolean getAsesorAccesoValidadorUsuarios() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorAccesoValidadorUsuarios();
        return value;
    }

   /**
    * Sets the value of the <code>asesorAccesoValidadorUsuarios</code> attribute.<br>
    * Model Attribute: <code>asesorAccesoValidadorUsuarios</code>. Variable Bool<br>
    * Comments: GdC-40 req 4: Configuración del 'Validador de Usuarios' para rol Asesor<br>
    * @param asesorAccesoValidadorUsuarios The new value of the <code>asesorAccesoValidadorUsuarios</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorAccesoValidadorUsuarios (Boolean asesorAccesoValidadorUsuarios) throws SystemException {
        getAsesorFacet().setAsesorAccesoValidadorUsuarios(asesorAccesoValidadorUsuarios);
    }

   /**
    * Returns the value of the <code>modifiedAsesorAccesoValidadorUsuarios</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorAccesoValidadorUsuarios</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorAccesoValidadorUsuarios() throws SystemException {
        return getAsesorFacet().isModifiedAsesorAccesoValidadorUsuarios();
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
        this.getParentFuncionario().setPassWord(passWord);
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
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitudes 0:M  ------ 1:1  Agente [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudes() {
        return (getParentFuncionario() != null ? getParentFuncionario().getSolicitudes() : null);
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>SolicitudesAfiliacion</code> role.
     * Model Relationship:
     * <code>[Solicitud] SolicitudesAfiliacion 0:M  ------ 0:1  UsrAfiliacion [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>SolicitudesAfiliacion</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesAfiliacion() {
        return (getParentFuncionario() != null ? getParentFuncionario().getSolicitudesAfiliacion() : null);
    }

    /**
     * Returns the instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     * Model Relationship:
     * <code>[ObsEstado] ObsEstado 0:M  ------ 1:1  Agente [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     */
    @JsonIgnore
    public Collection <ObsEstado> getObsEstado() {
        return (getParentFuncionario() != null ? getParentFuncionario().getObsEstado() : null);
    }

    /**
     * Returns the instance of <code>ReportesProcAlm</code> related through the <code>Reportes</code> role.
     * Model Relationship:
     * <code>[ReportesProcAlm] Reportes 0:M  ------ 0:M  Funcionarios [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ReportesProcAlm</code> related through the <code>Reportes</code> role.
     */
    @JsonIgnore
    public Collection <ReportesProcAlm> getReportes() {
        return (getParentFuncionario() != null ? getParentFuncionario().getReportes() : null);
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudesNovedad 0:M  ------ 1:1  Agente [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedad() {
        return (getParentFuncionario() != null ? getParentFuncionario().getSolicitudesNovedad() : null);
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolNovAifliaciones</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolNovAifliaciones 0:M  ------ 0:1  UsrAfiliacion [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>SolNovAifliaciones</code> role.
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolNovAifliaciones() {
        return (getParentFuncionario() != null ? getParentFuncionario().getSolNovAifliaciones() : null);
    }

    /**
     * Returns the instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     * Model Relationship:
     * <code>[GrupoAsignacion] GrupoAsignacion 0:M  ------ 0:M  Funcionario [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     */
    @JsonIgnore
    public Collection <GrupoAsignacion> getGrupoAsignacion() {
        return (getParentFuncionario() != null ? getParentFuncionario().getGrupoAsignacion() : null);
    }

    /**
     * Returns the instance of <code>LogFuncionario</code> related through the <code>LogFuncionario</code> role.
     * Model Relationship:
     * <code>[LogFuncionario] LogFuncionario 0:M  ------ 1:1  Funcionario [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogFuncionario</code> related through the <code>LogFuncionario</code> role.
     */
    @JsonIgnore
    public Collection <LogFuncionario> getLogFuncionario() {
        return (getParentFuncionario() != null ? getParentFuncionario().getLogFuncionario() : null);
    }

    /**
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratosC 0:M  ------ 0:1  AsesorC [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return (getParentFuncionario().getChildAsesor() != null ? getParentFuncionario().getChildAsesor().getContratosC() : null);
    }

    /**
     * Returns the instance of <code>AgentexProducto</code> related through the <code>AgentexProducto</code> role.
     * Model Relationship:
     * <code>[AgentexProducto] AgentexProducto 0:M  ------ 1:1  Asesor [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>AgentexProducto</code> related through the <code>AgentexProducto</code> role.
     */
    @JsonIgnore
    public Collection <AgentexProducto> getAgentexProducto() {
        return (getParentFuncionario().getChildAsesor() != null ? getParentFuncionario().getChildAsesor().getAgentexProducto() : null);
    }

    /**
     * Returns the instance of <code>LogInformacionAsesor</code> related through the <code>LogInformacionAsesor</code> role.
     * Model Relationship:
     * <code>[LogInformacionAsesor] LogInformacionAsesor 0:M  ------ 1:1  Asesor [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogInformacionAsesor</code> related through the <code>LogInformacionAsesor</code> role.
     */
    @JsonIgnore
    public Collection <LogInformacionAsesor> getLogInformacionAsesor() {
        return (getParentFuncionario().getChildAsesor() != null ? getParentFuncionario().getChildAsesor().getLogInformacionAsesor() : null);
    }

    /**
     * Returns the instance of <code>LogHistoricoPlanes</code> related through the <code>LogHistoricoPlanes</code> role.
     * Model Relationship:
     * <code>[LogHistoricoPlanes] LogHistoricoPlanes 0:M  ------ 1:1  Asesor [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogHistoricoPlanes</code> related through the <code>LogHistoricoPlanes</code> role.
     */
    @JsonIgnore
    public Collection <LogHistoricoPlanes> getLogHistoricoPlanes() {
        return (getParentFuncionario().getChildAsesor() != null ? getParentFuncionario().getChildAsesor().getLogHistoricoPlanes() : null);
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>SolicitudesArMe</code> role.
     * Model Relationship:
     * <code>[Solicitud] SolicitudesArMe 0:M  ------ 0:1  UsrAreaMedica [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>SolicitudesArMe</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesArMe() {
        return (getParentFuncionario().getChildAreaMedica() != null ? getParentFuncionario().getChildAreaMedica().getSolicitudesArMe() : null);
    }

    /**
     * Returns the instance of <code>Firma</code> related through the <code>Firma</code> role.
     * Model Relationship:
     * <code>[Firma] Firma 0:1  ------ 0:1  RespRegional [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Firma</code> related through the <code>Firma</code> role.
     */
    @JsonIgnore
    public Firma getFirma() {
        return (getParentFuncionario().getChildRespRegional() != null ? getParentFuncionario().getChildRespRegional().getFirma() : null);
    }

    /**
     * Returns the instance of <code>Rol</code> related through the <code>Rol</code> role.
     * Model Relationship:
     * <code>[Rol] Rol 1:1  ------ 0:M  Agentes [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Rol</code> related through the <code>Rol</code> role.
     */
    @JsonIgnore
    public Rol getRol() {
        return (getParentFuncionario() != null ? getParentFuncionario().getRol() : null);
    }

    /**
     * Returns the instance of <code>Sucursal</code> related through the <code>Sucursal</code> role.
     * Model Relationship:
     * <code>[Sucursal] Sucursal 1:1  ------ 0:M  Agentes [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Sucursal</code> related through the <code>Sucursal</code> role.
     */
    @JsonIgnore
    public Sucursal getSucursal() {
        return (getParentFuncionario() != null ? getParentFuncionario().getSucursal() : null);
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacion 0:1  ------ 0:M  Asesores [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return (getParentFuncionario().getChildAsesor() != null ? getParentFuncionario().getChildAsesor().getTipoIdentificacion() : null);
    }

    /**
     * Returns the instance of <code>Planes</code> related through the <code>Planes</code> role.
     * Model Relationship:
     * <code>[Planes] Planes 0:M  ------ 0:M  Afiliaciones [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Planes</code> related through the <code>Planes</code> role.
     */
    @JsonIgnore
    public Collection <Planes> getPlanes() {
        return (getParentFuncionario().getChildAfiliaciones() != null ? getParentFuncionario().getChildAfiliaciones().getPlanes() : null);
    }

    /**
     * Returns the instance of <code>Regional</code> related through the <code>Regional</code> role.
     * Model Relationship:
     * <code>[Regional] Regional 0:1  ------ 0:1  RespRegional [MesaDeApoyo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Regional</code> related through the <code>Regional</code> role.
     */
    @JsonIgnore
    public Regional getRegional() {
        return (getParentFuncionario().getChildRespRegional() != null ? getParentFuncionario().getChildRespRegional().getRegional() : null);
    }

    /**
     * Returns the parent <code>Funcionario</code> instance.
     * @return The parent <code>Funcionario</code> instance.
     */
    @JsonIgnore
    public Funcionario getParentFuncionario() {
        if (!parentFuncionarioInitialized) {
            setParentFuncionario(getMesaDeApoyoRepository().findParent(getFuncionarioId()));
        }
        return parentFuncionario;
    }

    /**
     * Sets the parent <code>Funcionario</code> instance.
     * @param parentFuncionario the parent of this object.
     */
    public void setParentFuncionario (Funcionario parentFuncionario) {
        this.parentFuncionario = parentFuncionario;
        this.parentFuncionarioInitialized = true;
    }

    /**
     * Returns The Facet <code>Funcionario</code> of this instance in an inheritance net.
     * @return the Facet of <code>Funcionario</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public Funcionario getFuncionarioFacet() {
            return getParentFuncionario();
    }

    /**
     * Returns The Facet <code>Admin</code> of this instance in an inheritance net.
     * @return the Facet of <code>Admin</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public Admin getAdminFacet() {
            return getParentFuncionario().getChildAdmin();
    }

    /**
     * Returns The Facet <code>SuperAdmin</code> of this instance in an inheritance net.
     * @return the Facet of <code>SuperAdmin</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public SuperAdmin getSuperAdminFacet() {
            return getParentFuncionario().getChildSuperAdmin();
    }

    /**
     * Returns The Facet <code>Asesor</code> of this instance in an inheritance net.
     * @return the Facet of <code>Asesor</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public Asesor getAsesorFacet() {
            return getParentFuncionario().getChildAsesor();
    }

    /**
     * Returns The Facet <code>AreaMedica</code> of this instance in an inheritance net.
     * @return the Facet of <code>AreaMedica</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public AreaMedica getAreaMedicaFacet() {
            return getParentFuncionario().getChildAreaMedica();
    }

    /**
     * Returns The Facet <code>Afiliaciones</code> of this instance in an inheritance net.
     * @return the Facet of <code>Afiliaciones</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public Afiliaciones getAfiliacionesFacet() {
            return getParentFuncionario().getChildAfiliaciones();
    }

    /**
     * Returns The Facet <code>RespRegional</code> of this instance in an inheritance net.
     * @return the Facet of <code>RespRegional</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public RespRegional getRespRegionalFacet() {
            return getParentFuncionario().getChildRespRegional();
    }

    /**
     * Returns The Facet <code>Gestor</code> of this instance in an inheritance net.
     * @return the Facet of <code>Gestor</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public Gestor getGestorFacet() {
            return getParentFuncionario().getChildGestor();
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
     * Computes the value of the <code>funcionariodrvNombreCompleto</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvNombreCompleto</code> derived attribute.
     */
    public String funcionariodrvNombreCompletoDerivations() {

        getParentFuncionario().funcionariodrvNombreCompleto = null;
        return getParentFuncionario().funcionariodrvNombreCompleto;
    }

    /**
     * Computes the value of the <code>funcionariodrvNomJefe</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvNomJefe</code> derived attribute.
     */
    public String funcionariodrvNomJefeDerivations() {

        getParentFuncionario().funcionariodrvNomJefe = null;
        return getParentFuncionario().funcionariodrvNomJefe;
    }

    /**
     * Computes the value of the <code>funcionariodrvNomAgencia</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvNomAgencia</code> derived attribute.
     */
    public String funcionariodrvNomAgenciaDerivations() {

        getParentFuncionario().funcionariodrvNomAgencia = null;
        return getParentFuncionario().funcionariodrvNomAgencia;
    }

    /**
     * Computes the value of the <code>funcionariodrvEsAsesorIntegral</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvEsAsesorIntegral</code> derived attribute.
     */
    public Boolean funcionariodrvEsAsesorIntegralDerivations() {

        getParentFuncionario().funcionariodrvEsAsesorIntegral = null;
        return getParentFuncionario().funcionariodrvEsAsesorIntegral;
    }

    /**
     * Computes the value of the <code>funcionariodrvEsAfiliacion</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvEsAfiliacion</code> derived attribute.
     */
    public Boolean funcionariodrvEsAfiliacionDerivations() {

        getParentFuncionario().funcionariodrvEsAfiliacion = null;
        return getParentFuncionario().funcionariodrvEsAfiliacion;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        parentFuncionario = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    public MesaDeApoyoJpaRepository getMesaDeApoyoRepository() {
        return Arc.container().select(MesaDeApoyoJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return MesaDeApoyo.class.getMethods();
    }


    /**
     * Provides the getter method name of the <code>inheritance</code> inheritance relationship.
     * @param inheritance the relationship name which getter method must be returned
     * @return the getter Method name for the given relationship or "" if the relationship does not exist
     */
    protected String getMethodNameInheritance(String inheritance) {
    	String getMethodName = "";
            if (inheritance.equalsIgnoreCase("parentFuncionario")) {
                getMethodName = "getParentFuncionario";
            }
            if (inheritance.equalsIgnoreCase("funcionariofacet")) {
                getMethodName = "getFuncionarioFacet";
            }
            if (inheritance.equalsIgnoreCase("adminfacet")) {
                getMethodName = "getAdminFacet";
            }
            if (inheritance.equalsIgnoreCase("superadminfacet")) {
                getMethodName = "getSuperAdminFacet";
            }
            if (inheritance.equalsIgnoreCase("asesorfacet")) {
                getMethodName = "getAsesorFacet";
            }
            if (inheritance.equalsIgnoreCase("areamedicafacet")) {
                getMethodName = "getAreaMedicaFacet";
            }
            if (inheritance.equalsIgnoreCase("afiliacionesfacet")) {
                getMethodName = "getAfiliacionesFacet";
            }
            if (inheritance.equalsIgnoreCase("respregionalfacet")) {
                getMethodName = "getRespRegionalFacet";
            }
            if (inheritance.equalsIgnoreCase("gestorfacet")) {
                getMethodName = "getGestorFacet";
            }
        return getMethodName; 
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return MesaDeApoyoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {





        getFuncionarioFacet().cleanDerivations();
    }

    /**
     * Returns the <code>MesaDeApoyoOid</code> object that identifies this instance of <code>MesaDeApoyo</code>.
     * @return <code>MesaDeApoyoOid </code> object that identifies this instance of <code>MesaDeApoyo</code>
     */
	@Override
    public MesaDeApoyoOid getOid() {
        return new MesaDeApoyoOid(getFuncionarioId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(MesaDeApoyoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(MesaDeApoyoConstants.ROLE_AGENTS.get(item.toUpperCase()));
    }

    /**
     * Gets the list of active facets.
     * @return the list of active facets.
     */
    @JsonIgnore
	@Override
    public List<String> getActiveFacets() {
        return this.getFuncionarioFacet().getFacets();
    }

     /**
     * Gets the list of active facets recursively from the root of the inheritance net.
     * @return the list of active facets.
     */
    @JsonIgnore
    public List<String> getFacets() {
        List<String> activeFacets = new ArrayList<>();

        if (!activeFacets.contains(Constants.MESADEAPOYO)) {
            // Add this class
            activeFacets.add(Constants.MESADEAPOYO);
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


        // Check inherited Horizontal Visibility Constraints
        if (!getParentFuncionario().checkHorizontalVisibility(agent)) {
            returnValue = false;
        }
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

    public String buildDSMesaDeApoyo() {
        try {
            return getFuncionarioUsuarioLDAP() + " " + getFuncionariodrvNombreCompleto() + " " + getFuncionarioEmail();
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
            relatedInstance = buildMesaDeApoyoRelatedInstance(relatedInstanceJsonOid);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLICITUDESAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMesaDeApoyoRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_OBSESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMesaDeApoyoRelatedInstance4ObsEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_REPORTES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMesaDeApoyoRelatedInstance4ReportesProcAlm(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLNOVAIFLIACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMesaDeApoyoRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_GRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMesaDeApoyoRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_LOGFUNCIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMesaDeApoyoRelatedInstance4LogFuncionario(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_ROL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMesaDeApoyoRelatedInstance4Rol(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SUCURSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMesaDeApoyoRelatedInstance4Sucursal(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildMesaDeApoyoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new MesaDeApoyo(mapper.readValue(relatedInstanceJsonOid, MesaDeApoyoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MesaDeApoyo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMesaDeApoyoRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MesaDeApoyo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMesaDeApoyoRelatedInstance4ObsEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ObsEstado(mapper.readValue(relatedInstanceJsonOid, ObsEstadoOid.class)): ObsEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MesaDeApoyo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMesaDeApoyoRelatedInstance4ReportesProcAlm(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ReportesProcAlm(mapper.readValue(relatedInstanceJsonOid, ReportesProcAlmOid.class)): ReportesProcAlm.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MesaDeApoyo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMesaDeApoyoRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MesaDeApoyo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMesaDeApoyoRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MesaDeApoyo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMesaDeApoyoRelatedInstance4LogFuncionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogFuncionario(mapper.readValue(relatedInstanceJsonOid, LogFuncionarioOid.class)): LogFuncionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MesaDeApoyo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMesaDeApoyoRelatedInstance4Rol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Rol(mapper.readValue(relatedInstanceJsonOid, RolOid.class)): Rol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MesaDeApoyo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildMesaDeApoyoRelatedInstance4Sucursal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Sucursal(mapper.readValue(relatedInstanceJsonOid, SucursalOid.class)): Sucursal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MesaDeApoyo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
