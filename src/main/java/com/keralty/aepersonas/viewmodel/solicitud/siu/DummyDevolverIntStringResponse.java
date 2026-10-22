package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class DummyDevolverIntStringResponse extends ServiceResponse {

    @JsonProperty("psbool")
    private Boolean solicituddummyDevolverIntStringpsBool;

    @JsonProperty("psestadosolicitud")
    private Long solicituddummyDevolverIntStringpsEstadoSolicitud;

    public DummyDevolverIntStringResponse() {
        super();
    }

    @JsonIgnore
    public Boolean getSolicituddummyDevolverIntStringpsBool() {
        return this.solicituddummyDevolverIntStringpsBool;
    }
    
    public void setSolicituddummyDevolverIntStringpsBool(Boolean solicituddummyDevolverIntStringpsBool) {
        this.solicituddummyDevolverIntStringpsBool = solicituddummyDevolverIntStringpsBool;
    }

    @JsonIgnore
    public Long getSolicituddummyDevolverIntStringpsEstadoSolicitud() {
        return this.solicituddummyDevolverIntStringpsEstadoSolicitud;
    }
    
    public void setSolicituddummyDevolverIntStringpsEstadoSolicitud(Long solicituddummyDevolverIntStringpsEstadoSolicitud) {
        this.solicituddummyDevolverIntStringpsEstadoSolicitud = solicituddummyDevolverIntStringpsEstadoSolicitud;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("solicituddummyDevolverIntStringpsBool", solicituddummyDevolverIntStringpsBool);
        outArgs.put("solicituddummyDevolverIntStringpsEstadoSolicitud", solicituddummyDevolverIntStringpsEstadoSolicitud);
        return outArgs;
    }
}
