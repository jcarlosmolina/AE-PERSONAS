package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.oid.ReportesDominioOid;
import com.keralty.aepersonas.persistence.ReportesDominio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportesDominioJpaRepository extends JpaRepository<ReportesDominio, ReportesDominioOid>, ReportesDominioJpaRepositoryCustom {
}
