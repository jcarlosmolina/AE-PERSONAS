package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.ObsEstado;
import com.keralty.aepersonas.persistence.oid.ObsEstadoOid;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObsEstadoJpaRepository extends JpaRepository<ObsEstado, ObsEstadoOid>, ObsEstadoJpaRepositoryCustom {

    List<ObsEstado> findByDocumentoG(DocumentoG documentoG);

    List<ObsEstado> findByAgente(Funcionario agente);
}
