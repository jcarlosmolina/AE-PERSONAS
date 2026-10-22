package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoCivilJpaRepository extends JpaRepository<EstadoCivil, Long>, EstadoCivilJpaRepositoryCustom {

    List<EstadoCivil> findByPersonas(Persona personas);
}
