package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.PlantillaEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantillaEmailJpaRepository extends JpaRepository<PlantillaEmail, Long>, PlantillaEmailJpaRepositoryCustom {
}
