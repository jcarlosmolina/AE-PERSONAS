package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosJpaRepository extends JpaRepository<Productos, Long>, ProductosJpaRepositoryCustom {
}
