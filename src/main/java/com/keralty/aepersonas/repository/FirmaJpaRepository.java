package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Firma;
import com.keralty.aepersonas.persistence.RespRegional;
import com.keralty.aepersonas.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirmaJpaRepository extends JpaRepository<Firma, Long>, FirmaJpaRepositoryCustom {

    List<Firma> findBySolicitud(Solicitud solicitud);

    List<Firma> findBySolicitudSegunda(Solicitud solicitudSegunda);

    List<Firma> findByRespRegional(RespRegional respRegional);

    List<Firma> findBySolicitudContratante(Solicitud solicitudContratante);
}
