package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Preexistencia;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, UsuarioOid>, UsuarioJpaRepositoryCustom {

    List<Usuario> findByCuestionarioP(CuestionarioP cuestionarioP);

    List<Usuario> findByAnexoMat(AnexoMat anexoMat);

    List<Usuario> findByAnexoNeo(AnexoNeo anexoNeo);

    List<Usuario> findByPreexistencias(Preexistencia preexistencias);

    List<Usuario> findBySolicitud(Solicitud solicitud);

    List<Usuario> findByUsuarioPersona(Persona usuarioPersona);

    List<Usuario> findByEps(Eps eps);

    List<Usuario> findByParentesco(Parentesco parentesco);

    List<Usuario> findByCompanyia(Companyia companyia);

    List<Usuario> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<Usuario> findByEstadoBeneficiario(EstadoBeneficiario estadoBeneficiario);
}
