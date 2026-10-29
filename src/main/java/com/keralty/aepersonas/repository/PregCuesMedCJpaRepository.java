package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.oid.PregCuesMedCOid;
import com.keralty.aepersonas.persistence.PregCuesMedC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PregCuesMedCJpaRepository extends JpaRepository<PregCuesMedC, PregCuesMedCOid>, PregCuesMedCJpaRepositoryCustom {
}
