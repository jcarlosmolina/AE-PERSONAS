package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.CuestionarioMed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuestionarioMedJpaRepository extends JpaRepository<CuestionarioMed, Long>, CuestionarioMedJpaRepositoryCustom {
}
