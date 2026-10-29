package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.ContratoC;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoCJpaRepository extends JpaRepository<ContratoC, Long>, ContratoCJpaRepositoryCustom {

    List<ContratoC> findBySolicitud(Solicitud solicitud);

    List<ContratoC> findByPeriodicidadC(Periodicidad periodicidadC);

    List<ContratoC> findByMunicipioC(Municipio municipioC);

    List<ContratoC> findByAsesorC(Asesor asesorC);
}
