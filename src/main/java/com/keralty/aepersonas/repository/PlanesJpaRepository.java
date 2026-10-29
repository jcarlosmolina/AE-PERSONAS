package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Afiliaciones;
import com.keralty.aepersonas.persistence.Planes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanesJpaRepository extends JpaRepository<Planes, Long>, PlanesJpaRepositoryCustom {

    List<Planes> findByAfiliaciones(Afiliaciones afiliaciones);
}
