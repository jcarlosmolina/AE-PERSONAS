package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJpaRepository extends JpaRepository<Admin, Long>, AdminJpaRepositoryCustom {
}
