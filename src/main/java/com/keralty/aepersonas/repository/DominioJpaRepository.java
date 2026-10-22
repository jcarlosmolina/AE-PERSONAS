package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Dominio;
import com.keralty.aepersonas.persistence.Periodicidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DominioJpaRepository extends JpaRepository<Dominio, Long>, DominioJpaRepositoryCustom {

    List<Dominio> findByPeriodicidades(Periodicidad periodicidades);
}
