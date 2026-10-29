package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnexoMatJpaRepository extends JpaRepository<AnexoMat, Long>, AnexoMatJpaRepositoryCustom {

    List<AnexoMat> findByUsuario(Usuario usuario);

    List<AnexoMat> findByPeriodicidad(Periodicidad periodicidad);

    List<AnexoMat> findByInstitucionMaternal(InstitucionMatNeo institucionMaternal);
}
