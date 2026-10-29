package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.DetalleTarifa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleTarifaJpaRepository extends JpaRepository<DetalleTarifa, Long>, DetalleTarifaJpaRepositoryCustom {
}
