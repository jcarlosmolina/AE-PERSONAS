package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Titular;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoJpaRepository extends JpaRepository<Departamento, Long>, DepartamentoJpaRepositoryCustom {

    List<Departamento> findByPersonas(Persona personas);

    List<Departamento> findByMunicipios(Municipio municipios);

    List<Departamento> findByDirecciones(Direccion direcciones);

    List<Departamento> findByContratantes(Contratante contratantes);

    List<Departamento> findByContratantesRes(Contratante contratantesRes);

    List<Departamento> findByTitulares(Titular titulares);
}
