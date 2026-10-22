package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.PreexistenciaC;
import com.keralty.aepersonas.persistence.PregCuesMedC;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaCJpaRepository extends JpaRepository<PersonaC, Long>, PersonaCJpaRepositoryCustom {

    List<PersonaC> findByPregsCuesMedC(PregCuesMedC pregsCuesMedC);

    List<PersonaC> findByPreexistenciasC(PreexistenciaC preexistenciasC);

    List<PersonaC> findByEstadoCivilC(EstadoCivil estadoCivilC);

    List<PersonaC> findByEstadoPersonaC(EstadoPersona estadoPersonaC);

    List<PersonaC> findByTipoIdentificacionC(TipoIdentificacion tipoIdentificacionC);

    List<PersonaC> findByMunicipioCNac(Municipio municipioCNac);

    List<PersonaC> findByDepartamentoCNac(Departamento departamentoCNac);
}
