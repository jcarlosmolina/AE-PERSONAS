package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.AreaMedica;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.LogAsignaciones;
import com.keralty.aepersonas.persistence.LogEstado;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.persistence.UsuarioReg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudJpaRepository extends JpaRepository<Solicitud, Long>, SolicitudJpaRepositoryCustom {

    List<Solicitud> findByDireccion(Direccion direccion);

    List<Solicitud> findByUsuarios(Usuario usuarios);

    List<Solicitud> findByContratante(Contratante contratante);

    List<Solicitud> findByUsuariosRegistrados(UsuarioReg usuariosRegistrados);

    List<Solicitud> findByTitular(Titular titular);

    List<Solicitud> findByDocumentosGestor(DocumentoG documentosGestor);

    List<Solicitud> findByLogEstado(LogEstado logEstado);

    List<Solicitud> findByLogAsignaciones(LogAsignaciones logAsignaciones);

    List<Solicitud> findByContratantePersona(Persona contratantePersona);

    List<Solicitud> findByTitularPersona(Persona titularPersona);

    List<Solicitud> findByAgente(Funcionario agente);

    List<Solicitud> findByPeriodicidad(Periodicidad periodicidad);

    List<Solicitud> findByUsrAreaMedica(AreaMedica usrAreaMedica);

    List<Solicitud> findByUsrAfiliacion(Funcionario usrAfiliacion);
}
