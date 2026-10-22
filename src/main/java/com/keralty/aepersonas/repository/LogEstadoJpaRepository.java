package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.LogEstado;
import com.keralty.aepersonas.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogEstadoJpaRepository extends JpaRepository<LogEstado, Long>, LogEstadoJpaRepositoryCustom {

    List<LogEstado> findBySolicitud(Solicitud solicitud);
}
