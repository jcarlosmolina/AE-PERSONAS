package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.TipoDireccion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDireccionJpaRepository extends JpaRepository<TipoDireccion, Long>, TipoDireccionJpaRepositoryCustom {

    List<TipoDireccion> findByDirecciones(Direccion direcciones);
}
