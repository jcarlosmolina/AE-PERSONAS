package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.SeccionP;
import com.keralty.aepersonas.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuestionarioPJpaRepository extends JpaRepository<CuestionarioP, Long>, CuestionarioPJpaRepositoryCustom {

    List<CuestionarioP> findBySecciones(SeccionP secciones);

    List<CuestionarioP> findByUsuario(Usuario usuario);
}
