package com.keralty.integraciones.patient;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.integraciones.patient.basicdata.response.Coding;
import com.keralty.integraciones.patient.basicdata.response.Datum;
import com.keralty.integraciones.patient.basicdata.response.Extension;
import com.keralty.integraciones.patient.contact.response.Address;
import com.keralty.integraciones.patient.contact.response.PatientContactResponse;
import com.keralty.integraciones.patient.contact.response.Telecom;

public class ConsultarPersonaResponse {
    private Datum basicData;
    private PatientContactResponse contact;
    private String estadoPersona = null;
    private String rechazadoAfiliacion = null;

    private boolean exito = true;;
    private String textoError = null;


	@JsonProperty("basicData")
    public Datum getBasicData() { return basicData; }
	@JsonProperty("basicData")
	public void setBasicData(Datum basicData) { this.basicData = basicData; }

	@JsonProperty("contact")
	public PatientContactResponse getContact() { return contact; }
	@JsonProperty("contact")
	public void setContact(PatientContactResponse contact) { this.contact = contact; }
	
	@JsonProperty("exito")
    public boolean isExito() { return exito; }
    @JsonProperty("exito")
	public void setExito(boolean exito) { this.exito = exito; }
	
    @JsonProperty("textoError")
    public String getTextoError() { return textoError; }
    @JsonProperty("textoError")
	public void setTextoError(String textoError) { this.textoError = textoError; }

    @JsonProperty("estadoPersona")
    public String getEstadoPersona() { return estadoPersona; }
    @JsonProperty("estadoPersona")
	public void setEstadoPersona(String estadoPersona) { this.estadoPersona = estadoPersona; }
    
    @JsonProperty("rechazadoAfiliacion")
    public String getRechazadoAfiliacion() { return rechazadoAfiliacion; }
    @JsonProperty("rechazadoAfiliacion")
	public void setRechazadoAfiliacion(String rechazadoAfiliacion) { this.rechazadoAfiliacion = rechazadoAfiliacion; }
	
	
	/**
     * Comprueba si se ha producido algún error en la respuesta de BH y ajusta los valores de las variables 
     */
    public void checkError() {
    	// Empty method
	}
    
    private void anyadirTextoError(String texto) {
    	if (texto == null || texto.isEmpty()) {
    		return;
    	}
    	if (getTextoError() == null || getTextoError().isEmpty()) {
    		setTextoError(texto);
    	} else {
    		setTextoError(getTextoError() + " " + texto);
    	}
    }
    
    @JsonIgnore
    public String getMunicipioNacimiento() {
		if (getBasicData() != null && getBasicData().getExtension() != null &&
				!getBasicData().getExtension().isEmpty()) {
			Extension address = getBasicData().getExtension().get(0);
			if (address.getValueAddress() != null && address.getValueAddress().getCity() != null) {
				 return address.getValueAddress().getCity().getCode();
			}
		}
    	return null;
    }
    
    @JsonIgnore
	public String getDepartamentoNacimiento() {
		if (getBasicData() != null && getBasicData().getExtension() != null &&
				!getBasicData().getExtension().isEmpty()) {
			Extension address = getBasicData().getExtension().get(0);
			if (address.getValueAddress() != null && address.getValueAddress().getState() != null) {
				 return address.getValueAddress().getState().getCode();
			}
		}
    	return null;
    }
	
    @JsonIgnore
	public Long getEstadoCivil() {
		if (getBasicData() != null && getBasicData().getMaritalStatus() != null) {
			return getBasicData().getMaritalStatus().getCode();
		}
		return null;
	}
	
    @JsonIgnore
	public boolean tieneDireccionDeUso(String uso) {
		if (getContact() != null && getContact().getAddress() != null) {
			for (Address dir : getContact().getAddress()) {
				if (uso.equalsIgnoreCase(dir.getUse())) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Develve la direccion o el codigo del municipio, departamento o pais de la primera dirección que tenga el uso indicado
	 * @param uso Uso de la dirección
	 * @param dato DIR = direccin MUN = Municipio, DEP = Departamento, PAIS = Pais
	 * @return El codigo del dato
	 */
	public String getDatoDeDireccionDeUso(String uso, String dato) {
		if (getContact() != null && getContact().getAddress() != null) {
			for (Address dir : getContact().getAddress()) {
				if (uso.equalsIgnoreCase(dir.getUse())) {
					if ("DIR".equalsIgnoreCase(dato)) {
						return dir.getText();
					}
					if ("MUN".equalsIgnoreCase(dato)) {
						return dir.getCity() != null ? dir.getCity().getCode() : null;
					}
					if ("DEP".equalsIgnoreCase(dato)) {
						return dir.getState() != null ? dir.getState().getCode() : null;
					}
					if ("PAIS".equalsIgnoreCase(dato)) {
						return dir.getCountry() != null ? dir.getCountry().getCode() : null;
					}
				}
			}
		}
    	return null;
    }
	
    @JsonIgnore
	public String getCorreoElectronico() {
    	Telecom info = getInfoCorreoElectronico();
    	return info != null ? info.getValue() : null;
    }
	
    @JsonIgnore
	public Date getFechaNacimiento() {
		if (getBasicData() != null) {
			return getBasicData().getBirthDate();		
		}
		return null;
	}
	
    @JsonIgnore
	public String getGenero() {
		if (getBasicData() != null) {
			return getBasicData().getGender();		
		}
		return null;
	}
	
    @JsonIgnore
	public String getPrimerApellido() {
		if (getBasicData() != null && getBasicData().getName() != null && getBasicData().getName().getName() != null) {
			return getBasicData().getName().getName().getFirstFamily();		
		}
		return null;
	}
    @JsonIgnore
	public String getSegundoApellido() {
		if (getBasicData() != null && getBasicData().getName() != null && getBasicData().getName().getName() != null) {
			return getBasicData().getName().getName().getSecondFamily();		
		}
		return null;
	}
    @JsonIgnore
	public String getPrimerNombre() {
		if (getBasicData() != null && getBasicData().getName() != null && getBasicData().getName().getName() != null) {
			return getBasicData().getName().getName().getFirstName();		
		}
		return null;
	}
    @JsonIgnore
	public String getSegundoNombre() {
		if (getBasicData() != null && getBasicData().getName() != null && getBasicData().getName().getName() != null) {
			return getBasicData().getName().getName().getSecondName();		
		}
		return null;
	}
	
    @JsonIgnore
	public Long getCodigo() {
		if (getBasicData() != null) {
			return Long.valueOf(getBasicData().getID());
		}
		return null;
	}

    @JsonIgnore
	public String getTelefonoFijoResidencia() {
    	Telecom info = getInfoTelefonoFijoResidencia();
    	return info != null ? info.getValue() : null;
    }
    @JsonIgnore
	public Telecom getInfoTelefonoFijoResidencia() {
		if (getContact() != null && getContact().getTelecom() != null) {
			for (Telecom tele : getContact().getTelecom()) {
				if ("TELEFONO_CONTACTO_PRINCIPAL".equalsIgnoreCase(tele.getSystem()) &&
						"RESIDENCIAL".equalsIgnoreCase(tele.getUse()) )  {
					return tele;
				}
			}
		}
    	return null;
    }
    @JsonIgnore
	public Telecom getInfoTelefonoFijoCorrespondencia() {
		if (getContact() != null && getContact().getTelecom() != null) {
			for (Telecom tele : getContact().getTelecom()) {
				if ("CORRESPONDENCIA".equalsIgnoreCase(tele.getUse()) &&
						tele.getValue() != null && tele.getValue().length() == 7)  {
					return tele;
				}
			}
		}
    	return null;
    }
    @JsonIgnore
	public Telecom getInfoTelefonoCelularResidencia() {
		if (getContact() != null && getContact().getTelecom() != null) {
			for (Telecom tele : getContact().getTelecom()) {
				if ("CELULAR_CONTACTO_PRINCIPAL".equalsIgnoreCase(tele.getSystem()) &&
						tele.getValue() != null)  {
					return tele;
				}
			}
		}
    	return null;
    }
    @JsonIgnore
	public Telecom getInfoTelefonoCelularCorrespondencia() {
		if (getContact() != null && getContact().getTelecom() != null) {
			for (Telecom tele : getContact().getTelecom()) {
				if ("CORRESPONDENCIA".equalsIgnoreCase(tele.getUse()) &&
						tele.getValue() != null && tele.getValue().length() == 10)  {
					return tele;
				}
			}
		}
    	return null;
    }

    @JsonIgnore
	public String getTelefonoCelular() {
    	Telecom info = getInfoTelefonoCelularResidencia();
    	return info != null ? info.getValue() : null;
    }

    @JsonIgnore
	public Telecom getInfoCorreoElectronico() {
		if (getContact() != null && getContact().getTelecom() != null) {
			for (Telecom tele : getContact().getTelecom()) {
				if ("CORREO_ELECTRONICO".equalsIgnoreCase(tele.getSystem()) && 
						tele.getValue() != null) {
					return tele;
				}
			}
		}
    	return null;
    }

    @JsonIgnore
    public Address getDireccionResidencia() {
    	return getDireccionPorUso("RESIDENCIAL");
    }
    @JsonIgnore
    public Address getDireccionCorrespondencia() {
    	return getDireccionPorUso("CORRESPONDENCIA");
    }
    @JsonIgnore
    public Address getDireccionPorUso(String uso) {
    	if (uso != null && getContact() != null && getContact().getAddress() != null) {
    		for (Address add: getContact().getAddress()) {
    			if (uso.equalsIgnoreCase(add.getUse())) {
    				return add;
    			}
    		}
    	}
    	return null;
    }
    @JsonIgnore
    public String getValueTelecomPorUso(String uso) {
    	if (uso != null && getContact() != null && getContact().getTelecom() != null) {
    		for (Telecom tele: getContact().getTelecom()) {
    			if (uso.equalsIgnoreCase(tele.getUse())) {
    				return tele.getValue();
    			}
    		}
    	}
    	return null;
    }
    @JsonIgnore
    public String getValueTelecomPorSystem(String system) {
    	if (system != null && getContact() != null && getContact().getTelecom() != null) {
    		for (Telecom tele: getContact().getTelecom()) {
    			if (system.equalsIgnoreCase(tele.getSystem())) {
    				return tele.getValue();
    			}
    		}
    	}
    	return null;
    }
    @JsonIgnore
    public String getValueTelecomPorUsoSystem(String uso, String system) {
    	if (uso != null && system != null && getContact() != null && getContact().getTelecom() != null) {
    		for (Telecom tele: getContact().getTelecom()) {
    			if (uso.equalsIgnoreCase(tele.getUse()) && system.equalsIgnoreCase(tele.getSystem())) {
    				return tele.getValue();
    			}
    		}
    	}
    	return null;
    }

    @JsonIgnore
    private String calcularRechazadoAfiliacion() {
//    	El campo se encuentra en el API de patient como:
//        "valueCodeableConcept": {
//            "coding": [
//                {
//                    "system": "BH/rechazoAfiliacion",
//                    "code": "1424",
//                    "display": "Decisión comité medico"
//                }
//            ]
//        },
//        "url": "https://www.minsalud.gov.co/ihc/fhir/StructureDefinition/co-patient-etnia"
    	
    	if (getBasicData() != null && getBasicData().getExtension() != null) {
    		for (Extension ext: getBasicData().getExtension()) {
    			if (ext.getValueCodeableConcept() != null && ext.getValueCodeableConcept().getCoding() != null) {
    				for (Coding coding: ext.getValueCodeableConcept().getCoding()) {
    					if ("BH/rechazoAfiliacion".equals(coding.getSystem())) {
    						return coding.getDisplay();
    					}
    				}
    			}
    		}
    	}
    	return "";
    }
    
    /**
     * Asigna vaor a los campos que se derivan de otros
     */
    @JsonIgnore
	public void calcularDerivados() {
		setRechazadoAfiliacion(calcularRechazadoAfiliacion());
	}
    
}
