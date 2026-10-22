package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Regional;
import com.keralty.aepersonas.persistence.RespRegional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionalJpaRepository extends JpaRepository<Regional, Long>, RegionalJpaRepositoryCustom {

    List<Regional> findByRespRegional(RespRegional respRegional);
}
