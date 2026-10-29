package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.DireccionC;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.TipoDireccion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionCJpaRepository extends JpaRepository<DireccionC, Long>, DireccionCJpaRepositoryCustom {

    List<DireccionC> findByTipoDireccionC(TipoDireccion tipoDireccionC);

    List<DireccionC> findByDepartamentoC(Departamento departamentoC);

    List<DireccionC> findByMunicipioC(Municipio municipioC);

    List<DireccionC> findByPaisC(Pais paisC);
}
