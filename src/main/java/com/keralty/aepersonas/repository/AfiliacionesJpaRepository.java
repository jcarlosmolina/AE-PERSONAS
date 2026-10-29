package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Afiliaciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AfiliacionesJpaRepository extends JpaRepository<Afiliaciones, Long>, AfiliacionesJpaRepositoryCustom {
}
