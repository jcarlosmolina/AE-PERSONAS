package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalServicesJpaRepository {

    Boolean assocOperator095(Solicitud tGADDUSUARIODECONTptpagrSolicitud, TipoIdentificacion tGADDUSUARIODECONTptpagrTipoIdentificacion, String tGADDUSUARIODECONTptpatrNumIdentificacion) throws SystemException;

    void refreshEntity(Object object);
}
