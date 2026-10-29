package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.TipoIVA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoIVAJpaRepository extends JpaRepository<TipoIVA, Long>, TipoIVAJpaRepositoryCustom {
}
