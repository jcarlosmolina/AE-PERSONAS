package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class ModificarRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personamodificarpthisPersona;
    
    @JsonIgnore
    private Persona personamodificarpthisPersonaInstance;

    @JsonProperty("p_primernombre")
    private String personamodificarpPrimerNombre;

    @JsonProperty("p_segundonombre")
    private String personamodificarpSegundoNombre;

    @JsonProperty("p_primerapellido")
    private String personamodificarpPrimerApellido;

    @JsonProperty("p_segundoapellido")
    private String personamodificarpSegundoApellido;

    @JsonProperty("p_razonsocial")
    private String personamodificarpRazonSocial;

    @JsonProperty("p_fechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personamodificarpFechaNacimiento;

    @JsonProperty("p_genero")
    private String personamodificarpGenero;

    @JsonProperty("p_indicadorextranjero")
    private Boolean personamodificarpIndicadorExtranjero;

    @JsonProperty("p_telefonofijo")
    private String personamodificarpTelefonoFijo;

    @JsonProperty("p_telefonocelular")
    private String personamodificarpTelefonoCelular;

    @JsonProperty("p_correoelectronico")
    private String personamodificarpCorreoElectronico;

    @JsonProperty("p_tieneepssanitas")
    private Boolean personamodificarpTieneEPSSanitas;

    @JsonProperty("p_rechazadoafiliacion")
    private String personamodificarpRechazadoAfiliacion;

    @JsonProperty("p_numidentificacion")
    private String personamodificarpNumIdentificacion;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonamodificarpthisPersona();
        checkPersonamodificarpNumIdentificacion();
    }

    @JsonIgnore
    public PersonaOid getPersonamodificarpthisPersona() {
        return this.personamodificarpthisPersona;
    }
    
    public void setPersonamodificarpthisPersona(PersonaOid personamodificarpthisPersona) {
        this.personamodificarpthisPersona = personamodificarpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonamodificarpthisPersonaInstance() {
        return this.personamodificarpthisPersonaInstance;
    }
    
    public void setPersonamodificarpthisPersonaInstance(Persona personamodificarpthisPersona) {
        this.personamodificarpthisPersonaInstance = personamodificarpthisPersona;
        this.personamodificarpthisPersona = personamodificarpthisPersona != null ? personamodificarpthisPersona.getOid() : null;
    }

    private void checkPersonamodificarpthisPersona() throws NotNullArgumentException {
        if(this.getPersonamodificarpthisPersonaInstance() == null || this.getPersonamodificarpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_MODIFICAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_MODIFICAR_PERSONAMODIFICARPTHISPERSONA, PersonaConstants.SERV_ALIAS_MODIFICAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPTHISPERSONA);
        }
    }

    @JsonIgnore
    public String getPersonamodificarpPrimerNombre() {
        return this.personamodificarpPrimerNombre;
    }
    
    public void setPersonamodificarpPrimerNombre(String personamodificarpPrimerNombre) {
        this.personamodificarpPrimerNombre = personamodificarpPrimerNombre;
    }

    @JsonIgnore
    public String getPersonamodificarpSegundoNombre() {
        return this.personamodificarpSegundoNombre;
    }
    
    public void setPersonamodificarpSegundoNombre(String personamodificarpSegundoNombre) {
        this.personamodificarpSegundoNombre = personamodificarpSegundoNombre;
    }

    @JsonIgnore
    public String getPersonamodificarpPrimerApellido() {
        return this.personamodificarpPrimerApellido;
    }
    
    public void setPersonamodificarpPrimerApellido(String personamodificarpPrimerApellido) {
        this.personamodificarpPrimerApellido = personamodificarpPrimerApellido;
    }

    @JsonIgnore
    public String getPersonamodificarpSegundoApellido() {
        return this.personamodificarpSegundoApellido;
    }
    
    public void setPersonamodificarpSegundoApellido(String personamodificarpSegundoApellido) {
        this.personamodificarpSegundoApellido = personamodificarpSegundoApellido;
    }

    @JsonIgnore
    public String getPersonamodificarpRazonSocial() {
        return this.personamodificarpRazonSocial;
    }
    
    public void setPersonamodificarpRazonSocial(String personamodificarpRazonSocial) {
        this.personamodificarpRazonSocial = personamodificarpRazonSocial;
    }

    @JsonIgnore
    public Date getPersonamodificarpFechaNacimiento() {
        return this.personamodificarpFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonamodificarpFechaNacimiento(Date personamodificarpFechaNacimiento) {
        this.personamodificarpFechaNacimiento = personamodificarpFechaNacimiento;
    }

    @JsonIgnore
    public String getPersonamodificarpGenero() {
        return this.personamodificarpGenero;
    }
    
    public void setPersonamodificarpGenero(String personamodificarpGenero) {
        this.personamodificarpGenero = personamodificarpGenero;
    }

    @JsonIgnore
    public Boolean getPersonamodificarpIndicadorExtranjero() {
        return this.personamodificarpIndicadorExtranjero;
    }
    
    public void setPersonamodificarpIndicadorExtranjero(Boolean personamodificarpIndicadorExtranjero) {
        this.personamodificarpIndicadorExtranjero = personamodificarpIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonamodificarpTelefonoFijo() {
        return this.personamodificarpTelefonoFijo;
    }
    
    public void setPersonamodificarpTelefonoFijo(String personamodificarpTelefonoFijo) {
        this.personamodificarpTelefonoFijo = personamodificarpTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonamodificarpTelefonoCelular() {
        return this.personamodificarpTelefonoCelular;
    }
    
    public void setPersonamodificarpTelefonoCelular(String personamodificarpTelefonoCelular) {
        this.personamodificarpTelefonoCelular = personamodificarpTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonamodificarpCorreoElectronico() {
        return this.personamodificarpCorreoElectronico;
    }
    
    public void setPersonamodificarpCorreoElectronico(String personamodificarpCorreoElectronico) {
        this.personamodificarpCorreoElectronico = personamodificarpCorreoElectronico;
    }

    @JsonIgnore
    public Boolean getPersonamodificarpTieneEPSSanitas() {
        return this.personamodificarpTieneEPSSanitas;
    }
    
    public void setPersonamodificarpTieneEPSSanitas(Boolean personamodificarpTieneEPSSanitas) {
        this.personamodificarpTieneEPSSanitas = personamodificarpTieneEPSSanitas;
    }

    @JsonIgnore
    public String getPersonamodificarpRechazadoAfiliacion() {
        return this.personamodificarpRechazadoAfiliacion;
    }
    
    public void setPersonamodificarpRechazadoAfiliacion(String personamodificarpRechazadoAfiliacion) {
        this.personamodificarpRechazadoAfiliacion = personamodificarpRechazadoAfiliacion;
    }

    @JsonIgnore
    public String getPersonamodificarpNumIdentificacion() {
        return this.personamodificarpNumIdentificacion;
    }
    
    public void setPersonamodificarpNumIdentificacion(String personamodificarpNumIdentificacion) {
        this.personamodificarpNumIdentificacion = personamodificarpNumIdentificacion;
    }

    private void checkPersonamodificarpNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonamodificarpNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_MODIFICAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_MODIFICAR_PERSONAMODIFICARPNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_MODIFICAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPNUMIDENTIFICACION);
        }
    }
}
