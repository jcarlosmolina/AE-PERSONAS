package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.SolicitudNovedad;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudNovedadJpaRepository extends JpaRepository<SolicitudNovedad, Long>, SolicitudNovedadJpaRepositoryCustom {

    List<SolicitudNovedad> findByTipoIdentContratante(TipoIdentificacion tipoIdentContratante);

    List<SolicitudNovedad> findByPeriodicidad(Periodicidad periodicidad);

    List<SolicitudNovedad> findByAgente(Funcionario agente);

    List<SolicitudNovedad> findByPeriodicidadNueva(Periodicidad periodicidadNueva);

    List<SolicitudNovedad> findByUsrAfiliacion(Funcionario usrAfiliacion);
}
