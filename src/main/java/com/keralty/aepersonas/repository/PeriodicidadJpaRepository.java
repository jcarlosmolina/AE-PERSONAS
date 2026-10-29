package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodicidadJpaRepository extends JpaRepository<Periodicidad, Long>, PeriodicidadJpaRepositoryCustom {

    List<Periodicidad> findBySolicitudes(Solicitud solicitudes);

    List<Periodicidad> findByAnexosMat(AnexoMat anexosMat);

    List<Periodicidad> findByAnexosNeo(AnexoNeo anexosNeo);
}
