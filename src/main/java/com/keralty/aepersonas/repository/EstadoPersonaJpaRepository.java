package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.persistence.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoPersonaJpaRepository extends JpaRepository<EstadoPersona, Long>, EstadoPersonaJpaRepositoryCustom {

    List<EstadoPersona> findByPersonas(Persona personas);
}
