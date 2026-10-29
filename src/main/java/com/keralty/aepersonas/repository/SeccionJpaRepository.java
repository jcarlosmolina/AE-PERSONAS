package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.Seccion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeccionJpaRepository extends JpaRepository<Seccion, Long>, SeccionJpaRepositoryCustom {

    List<Seccion> findByPreguntas(Pregunta preguntas);
}
