package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.oid.PreexistenciaCOid;
import com.keralty.aepersonas.persistence.PreexistenciaC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreexistenciaCJpaRepository extends JpaRepository<PreexistenciaC, PreexistenciaCOid>, PreexistenciaCJpaRepositoryCustom {
}
