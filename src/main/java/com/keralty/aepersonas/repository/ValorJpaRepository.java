package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.Valor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValorJpaRepository extends JpaRepository<Valor, Long>, ValorJpaRepositoryCustom {

    List<Valor> findByPreguntas(Pregunta preguntas);
}
