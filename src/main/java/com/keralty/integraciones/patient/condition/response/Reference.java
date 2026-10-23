package com.keralty.integraciones.patient.condition.response;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Reference {
    PATIENT_CC10009275;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PATIENT_CC10009275: return "Patient/CC10009275";
        }
        return null;
    }

    @JsonCreator
    public static Reference forValue(String value) throws IOException {
        if (value.equals("Patient/CC10009275")) return PATIENT_CC10009275;
        throw new IOException("Cannot deserialize Reference");
    }
}
