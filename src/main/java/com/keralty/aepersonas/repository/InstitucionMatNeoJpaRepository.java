package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitucionMatNeoJpaRepository extends JpaRepository<InstitucionMatNeo, String>, InstitucionMatNeoJpaRepositoryCustom {

    List<InstitucionMatNeo> findByAnexoMat(AnexoMat anexoMat);

    List<InstitucionMatNeo> findByAnexoNeo(AnexoNeo anexoNeo);

    List<InstitucionMatNeo> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<InstitucionMatNeo> findByMunicipio(Municipio municipio);
}
