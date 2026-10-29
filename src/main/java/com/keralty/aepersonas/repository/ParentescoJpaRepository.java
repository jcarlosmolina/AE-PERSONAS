package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.persistence.UsuarioReg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentescoJpaRepository extends JpaRepository<Parentesco, Long>, ParentescoJpaRepositoryCustom {

    List<Parentesco> findByAtributosUsuario(Usuario atributosUsuario);

    List<Parentesco> findByUsuariosReg(UsuarioReg usuariosReg);
}
