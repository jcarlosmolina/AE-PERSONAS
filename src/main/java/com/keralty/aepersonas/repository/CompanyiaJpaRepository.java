package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyiaJpaRepository extends JpaRepository<Companyia, Long>, CompanyiaJpaRepositoryCustom {

    List<Companyia> findByAtributosUsuario(Usuario atributosUsuario);
}
