package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Pais;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisJpaRepository extends JpaRepository<Pais, String>, PaisJpaRepositoryCustom {

    List<Pais> findByDirecciones(Direccion direcciones);
}
