package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.LogAsignaciones;
import com.keralty.aepersonas.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogAsignacionesJpaRepository extends JpaRepository<LogAsignaciones, Long>, LogAsignacionesJpaRepositoryCustom {

    List<LogAsignaciones> findBySolicitud(Solicitud solicitud);
}
