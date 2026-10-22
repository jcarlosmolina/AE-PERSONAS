package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Novedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NovedadJpaRepository extends JpaRepository<Novedad, Long>, NovedadJpaRepositoryCustom {
}
