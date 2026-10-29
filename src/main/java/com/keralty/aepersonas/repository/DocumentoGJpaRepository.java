package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.ObsEstado;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoGJpaRepository extends JpaRepository<DocumentoG, Long>, DocumentoGJpaRepositoryCustom {

    List<DocumentoG> findByObsEstado(ObsEstado obsEstado);

    List<DocumentoG> findBySolicitud(Solicitud solicitud);

    List<DocumentoG> findByPersona(Persona persona);
}
