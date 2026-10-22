package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnexoNeoJpaRepository extends JpaRepository<AnexoNeo, Long>, AnexoNeoJpaRepositoryCustom {

    List<AnexoNeo> findByUsuario(Usuario usuario);

    List<AnexoNeo> findByPeriodicidad(Periodicidad periodicidad);

    List<AnexoNeo> findByInstitucionNeonatal(InstitucionMatNeo institucionNeonatal);
}
