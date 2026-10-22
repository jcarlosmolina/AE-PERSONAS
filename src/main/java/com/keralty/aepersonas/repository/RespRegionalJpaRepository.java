package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.RespRegional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespRegionalJpaRepository extends JpaRepository<RespRegional, Long>, RespRegionalJpaRepositoryCustom {
}
