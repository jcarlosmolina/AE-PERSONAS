package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Aesolicitudes;
import com.keralty.aepersonas.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AesolicitudesJpaRepository extends JpaRepository<Aesolicitudes, Long>, AesolicitudesJpaRepositoryCustom {

    List<Aesolicitudes> findBySolicitud(Solicitud solicitud);
}
