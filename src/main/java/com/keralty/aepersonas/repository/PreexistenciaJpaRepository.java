package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.oid.PreexistenciaOid;
import com.keralty.aepersonas.persistence.Preexistencia;
import com.keralty.aepersonas.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreexistenciaJpaRepository extends JpaRepository<Preexistencia, PreexistenciaOid>, PreexistenciaJpaRepositoryCustom {

    List<Preexistencia> findByUsuario(Usuario usuario);
}
