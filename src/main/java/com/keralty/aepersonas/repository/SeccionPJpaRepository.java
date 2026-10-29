package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.PreguntaP;
import com.keralty.aepersonas.persistence.SeccionP;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeccionPJpaRepository extends JpaRepository<SeccionP, Long>, SeccionPJpaRepositoryCustom {

    List<SeccionP> findByPreguntas(PreguntaP preguntas);

    List<SeccionP> findByCuestionario(CuestionarioP cuestionario);
}
