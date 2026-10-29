package com.keralty.aepersonas.service;

import com.keralty.aepersonas.repository.BeneficiarioCJpaRepository;
import com.keralty.aepersonas.repository.ConfiguracionANSJpaRepository;
import com.keralty.aepersonas.repository.ContratoCJpaRepository;
import com.keralty.aepersonas.repository.DireccionCJpaRepository;
import com.keralty.aepersonas.repository.FamiliaNovedadJpaRepository;
import com.keralty.aepersonas.repository.NovedadJpaRepository;
import com.keralty.aepersonas.repository.PersonaCJpaRepository;
import com.keralty.aepersonas.repository.ReportesDominioJpaRepository;
import com.keralty.aepersonas.repository.SolicitudNovedadJpaRepository;
import com.keralty.aepersonas.repository.UsuarioNovedadJpaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class GenericService {

    private PersonaCJpaRepository personaCJpaRepository;

    private DireccionCJpaRepository direccionCJpaRepository;

    private ContratoCJpaRepository contratoCJpaRepository;

    private BeneficiarioCJpaRepository beneficiarioCJpaRepository;

    private NovedadJpaRepository novedadJpaRepository;

    private SolicitudNovedadJpaRepository solicitudNovedadJpaRepository;

    private FamiliaNovedadJpaRepository familiaNovedadJpaRepository;

    private UsuarioNovedadJpaRepository usuarioNovedadJpaRepository;

    private ConfiguracionANSJpaRepository configuracionANSJpaRepository;

    private ReportesDominioJpaRepository reportesDominioJpaRepository;
	
	@Inject
	public GenericService(
            PersonaCJpaRepository personaCJpaRepository,
            DireccionCJpaRepository direccionCJpaRepository,
            ContratoCJpaRepository contratoCJpaRepository,
            BeneficiarioCJpaRepository beneficiarioCJpaRepository,
            NovedadJpaRepository novedadJpaRepository,
            SolicitudNovedadJpaRepository solicitudNovedadJpaRepository,
            FamiliaNovedadJpaRepository familiaNovedadJpaRepository,
            UsuarioNovedadJpaRepository usuarioNovedadJpaRepository,
            ConfiguracionANSJpaRepository configuracionANSJpaRepository,
            ReportesDominioJpaRepository reportesDominioJpaRepository
			) {
        this.personaCJpaRepository = personaCJpaRepository;
        this.direccionCJpaRepository = direccionCJpaRepository;
        this.contratoCJpaRepository = contratoCJpaRepository;
        this.beneficiarioCJpaRepository = beneficiarioCJpaRepository;
        this.novedadJpaRepository = novedadJpaRepository;
        this.solicitudNovedadJpaRepository = solicitudNovedadJpaRepository;
        this.familiaNovedadJpaRepository = familiaNovedadJpaRepository;
        this.usuarioNovedadJpaRepository = usuarioNovedadJpaRepository;
        this.configuracionANSJpaRepository = configuracionANSJpaRepository;
        this.reportesDominioJpaRepository = reportesDominioJpaRepository;
	}

	public PersonaCJpaRepository getPersonaCJpaRepository() {
		return this.personaCJpaRepository;
	}
	public DireccionCJpaRepository getDireccionCJpaRepository() {
		return this.direccionCJpaRepository;
	}
	public ContratoCJpaRepository getContratoCJpaRepository() {
		return this.contratoCJpaRepository;
	}
	public BeneficiarioCJpaRepository getBeneficiarioCJpaRepository() {
		return this.beneficiarioCJpaRepository;
	}
	public NovedadJpaRepository getNovedadJpaRepository() {
		return this.novedadJpaRepository;
	}
	public SolicitudNovedadJpaRepository getSolicitudNovedadJpaRepository() {
		return this.solicitudNovedadJpaRepository;
	}
	public FamiliaNovedadJpaRepository getFamiliaNovedadJpaRepository() {
		return this.familiaNovedadJpaRepository;
	}
	public UsuarioNovedadJpaRepository getUsuarioNovedadJpaRepository() {
		return this.usuarioNovedadJpaRepository;
	}
	public ConfiguracionANSJpaRepository getConfiguracionANSJpaRepository() {
		return this.configuracionANSJpaRepository;
	}
	public ReportesDominioJpaRepository getReportesDominioJpaRepository() {
		return this.reportesDominioJpaRepository;
	}
}
