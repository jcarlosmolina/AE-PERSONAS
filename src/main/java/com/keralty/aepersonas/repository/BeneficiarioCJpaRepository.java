package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.Parentesco;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiarioCJpaRepository extends JpaRepository<BeneficiarioC, BeneficiarioCOid>, BeneficiarioCJpaRepositoryCustom {

    List<BeneficiarioC> findByEPSC(Eps ePSC);

    List<BeneficiarioC> findByCompanyiaMPC(Companyia companyiaMPC);

    List<BeneficiarioC> findByParentescoC(Parentesco parentescoC);

    List<BeneficiarioC> findByEstadoBeneficiarioC(EstadoBeneficiario estadoBeneficiarioC);
}
