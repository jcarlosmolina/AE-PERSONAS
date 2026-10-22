package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Titular;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitularJpaRepository extends JpaRepository<Titular, Long>, TitularJpaRepositoryCustom {

    List<Titular> findByDireccion(Direccion direccion);

    List<Titular> findBySolicitud(Solicitud solicitud);

    List<Titular> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<Titular> findByDepartamentoNac(Departamento departamentoNac);

    List<Titular> findByMunicipioNac(Municipio municipioNac);
}
