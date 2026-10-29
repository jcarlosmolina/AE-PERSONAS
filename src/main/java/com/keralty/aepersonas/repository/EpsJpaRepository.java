package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpsJpaRepository extends JpaRepository<Eps, Long>, EpsJpaRepositoryCustom {

    List<Eps> findByAtributosUsuario(Usuario atributosUsuario);
}
