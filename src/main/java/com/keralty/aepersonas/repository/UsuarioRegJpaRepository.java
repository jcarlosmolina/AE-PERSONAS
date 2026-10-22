package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.UsuarioRegOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.UsuarioReg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRegJpaRepository extends JpaRepository<UsuarioReg, UsuarioRegOid>, UsuarioRegJpaRepositoryCustom {

    List<UsuarioReg> findBySolicitud(Solicitud solicitud);

    List<UsuarioReg> findByEstadoBeneficiario(EstadoBeneficiario estadoBeneficiario);

    List<UsuarioReg> findByParentesco(Parentesco parentesco);
}
