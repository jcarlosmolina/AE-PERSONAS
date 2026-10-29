package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.persistence.UsuarioReg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoBeneficiarioJpaRepository extends JpaRepository<EstadoBeneficiario, Long>, EstadoBeneficiarioJpaRepositoryCustom {

    List<EstadoBeneficiario> findByUsuarioS(Usuario usuarioS);

    List<EstadoBeneficiario> findByUsuariosReg(UsuarioReg usuariosReg);
}
