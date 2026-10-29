package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsesorJpaRepository extends JpaRepository<Asesor, Long>, AsesorJpaRepositoryCustom {

    List<Asesor> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);
}
