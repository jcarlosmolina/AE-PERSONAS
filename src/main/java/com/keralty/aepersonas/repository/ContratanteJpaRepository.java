package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratanteJpaRepository extends JpaRepository<Contratante, Long>, ContratanteJpaRepositoryCustom {

    List<Contratante> findBySolicitud(Solicitud solicitud);

    List<Contratante> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<Contratante> findByDepartamentoNac(Departamento departamentoNac);

    List<Contratante> findByMunicipioNac(Municipio municipioNac);

    List<Contratante> findByDepartamentoRes(Departamento departamentoRes);

    List<Contratante> findByMunicipioRes(Municipio municipioRes);
}
