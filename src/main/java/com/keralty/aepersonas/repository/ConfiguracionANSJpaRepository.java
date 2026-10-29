package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.ConfiguracionANS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfiguracionANSJpaRepository extends JpaRepository<ConfiguracionANS, Long>, ConfiguracionANSJpaRepositoryCustom {
}
