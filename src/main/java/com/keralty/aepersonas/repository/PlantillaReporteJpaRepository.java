package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.PlantillaReporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantillaReporteJpaRepository extends JpaRepository<PlantillaReporte, Long>, PlantillaReporteJpaRepositoryCustom {
}
