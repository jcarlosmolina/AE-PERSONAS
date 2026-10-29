package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.PreguntaP;
import com.keralty.aepersonas.persistence.SeccionP;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaPJpaRepository extends JpaRepository<PreguntaP, Long>, PreguntaPJpaRepositoryCustom {

    List<PreguntaP> findBySeccion(SeccionP seccion);

    List<PreguntaP> findByPregunta(Pregunta pregunta);
}
