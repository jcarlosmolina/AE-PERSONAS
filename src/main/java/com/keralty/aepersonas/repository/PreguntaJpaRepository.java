package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.PreguntaP;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaJpaRepository extends JpaRepository<Pregunta, Long>, PreguntaJpaRepositoryCustom {

    List<Pregunta> findByPreguntasPersona(PreguntaP preguntasPersona);
}
