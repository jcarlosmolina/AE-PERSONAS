package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Titular;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipioJpaRepository extends JpaRepository<Municipio, Long>, MunicipioJpaRepositoryCustom {

    List<Municipio> findByPersonas(Persona personas);

    List<Municipio> findByDirecciones(Direccion direcciones);

    List<Municipio> findByContratantes(Contratante contratantes);

    List<Municipio> findByContratanteRes(Contratante contratanteRes);

    List<Municipio> findByTitulares(Titular titulares);

    List<Municipio> findByInstitucionMatNeo(InstitucionMatNeo institucionMatNeo);

    List<Municipio> findByDepartamento(Departamento departamento);
}
