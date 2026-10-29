package com.keralty.aepersonas.api.usuario;

import com.keralty.aepersonas.persistence.AbstractAppEntity;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.service.UsuarioService;
import com.keralty.aepersonas.utils.TokenUtilities;
import com.keralty.aepersonas.viewmodel.InstanceResponseViewModel;
import com.keralty.aepersonas.viewmodel.PopulationRequestViewModel;
import com.keralty.aepersonas.viewmodel.PopulationResponseViewModel;
import com.keralty.aepersonas.viewmodel.PreloadResponseViewModel;
import com.keralty.aepersonas.viewmodel.PreloadViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import com.keralty.aepersonas.viewmodel.usuario.piu.PIUUsuarioDePIUStatusSolResponse;
import com.keralty.aepersonas.viewmodel.usuario.piu.PIUUsuarioNullResponse;
import com.keralty.aepersonas.viewmodel.usuario.piu.PIUUsuariosDeContratoResponse;
import com.keralty.aepersonas.viewmodel.usuario.piu.PIUUsuariosPolInternacionalRequest;
import com.keralty.aepersonas.viewmodel.usuario.piu.PIUUsuariosPolInternacionalResponse;
import com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoRequest;
import com.keralty.aepersonas.viewmodel.usuario.siu.ShowCuesMedicoResponse;
import com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest;
import com.keralty.aepersonas.viewmodel.usuario.siu.TCREAROMODANEXONEORequest;
import com.keralty.aepersonas.viewmodel.usuario.siu.TELIMINARRequest;
import com.keralty.aepersonas.viewmodel.usuario.siu.TMODIFICARATTRRequest;
import com.keralty.aepersonas.viewmodel.usuario.siu.TMODUSUARIORequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;

@Path("/api/UsuarioApi")
@RequestScoped
public class UsuarioApi {

    UsuarioService service;

    public UsuarioApi(UsuarioService service, JsonWebToken jwt) {
        this.service = service;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{aesolicitudesidsolicitud}/{usuarioIdentificador}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Usuario getInstance(Long aesolicitudesidsolicitud, Long usuarioIdentificador) {
    	return service.getById(aesolicitudesidsolicitud, usuarioIdentificador);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Usuario> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @POST
    @Path(value = "/GetPreload")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<PreloadViewModel> getUsuarioPreload(QueryRequest queryRequest) {
        return service.getPreload(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Usuario getByOid(UsuarioOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Usuario getByOIDWithHV(UsuarioOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetUsuarioDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getUsuarioDynamic(QueryRequest request) {
        UsuarioOid oid = new UsuarioOid();
        oid.fromJsonString(request.getJsonOID());
        return service.getUsuarioDynamic(oid, request.getDisplaySetItems());
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getUsuarioWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getUsuarioPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getDynamic(request);
    }

    @POST
    @Path(value = "/showCuesMedico")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","MesaDeApoyo"})
    public ShowCuesMedicoResponse usuarioShowCuesMedico(ShowCuesMedicoRequest request) {
        return service.showCuesMedico(request);
    }
    

    @POST
    @Path(value = "/showCuesMedicoCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","MesaDeApoyo"})
    public ShowCuesMedicoResponse usuarioShowCuesMedicoCheckPreconditions(ShowCuesMedicoRequest request) {

        return service.showCuesMedicoCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODIFICARATTR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTMODIFICARATTR(TMODIFICARATTRRequest request) {
        return service.tMODIFICARATTR(request);
    }
    

    @POST
    @Path(value = "/TMODIFICARATTRCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTMODIFICARATTRCheckPreconditions(TMODIFICARATTRRequest request) {

        return service.tMODIFICARATTRCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODUSUARIO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTMODUSUARIO(TMODUSUARIORequest request) {
        return service.tMODUSUARIO(request);
    }
    

    @POST
    @Path(value = "/TMODUSUARIOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTMODUSUARIOCheckPreconditions(TMODUSUARIORequest request) {

        return service.tMODUSUARIOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    

    @POST
    @Path(value = "/TCREAROMODANEXOMAT")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTCREAROMODANEXOMAT(TCREAROMODANEXOMATRequest request) {
        return service.tCREAROMODANEXOMAT(request);
    }
    

    @POST
    @Path(value = "/TCREAROMODANEXOMATCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTCREAROMODANEXOMATCheckPreconditions(TCREAROMODANEXOMATRequest request) {

        return service.tCREAROMODANEXOMATCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCREAROMODANEXONEO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTCREAROMODANEXONEO(TCREAROMODANEXONEORequest request) {
        return service.tCREAROMODANEXONEO(request);
    }
    

    @POST
    @Path(value = "/TCREAROMODANEXONEOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTCREAROMODANEXONEOCheckPreconditions(TCREAROMODANEXONEORequest request) {

        return service.tCREAROMODANEXONEOCheckPreconditions(request);
    }


    @POST
    @Path(value = "/PIU_UsuariosDeContrato")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PIUUsuariosDeContratoResponse piuPIUUsuariosDeContrato(PopulationRequestViewModel request) {
        QueryRequest queryRequest = request.buildQueryRequest();
        PIUUsuariosDeContratoResponse response;
        try
        {
            response = new PIUUsuariosDeContratoResponse(service.piuPIUUsuariosDeContrato(queryRequest));
            if (queryRequest.getPageSize() > 0) {
                queryRequest.setPageSize(0);
                response.setTotalItems(service.getCount4PIUUsuariosDeContrato(queryRequest));
            }
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            response = new PIUUsuariosDeContratoResponse();
            response.setException(e);
        }
        return response;
    }

    @POST
    @Path(value = "/PIU_UsuarioDePIUStatusSol")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PIUUsuarioDePIUStatusSolResponse piuPIUUsuarioDePIUStatusSol(PopulationRequestViewModel request) {
        QueryRequest queryRequest = request.buildQueryRequest();
        PIUUsuarioDePIUStatusSolResponse response;
        try
        {
            response = new PIUUsuarioDePIUStatusSolResponse(service.piuPIUUsuarioDePIUStatusSol(queryRequest));
            if (queryRequest.getPageSize() > 0) {
                queryRequest.setPageSize(0);
                response.setTotalItems(service.getCount4PIUUsuarioDePIUStatusSol(queryRequest));
            }
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            response = new PIUUsuarioDePIUStatusSolResponse();
            response.setException(e);
        }
        return response;
    }

    @POST
    @Path(value = "/PIU_UsuariosPolInternacional")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PIUUsuariosPolInternacionalResponse piuPIUUsuariosPolInternacional(PIUUsuariosPolInternacionalRequest request) {
        QueryRequest queryRequest = request.buildQueryRequest();
        PIUUsuariosPolInternacionalResponse response;
        try
        {
            response = new PIUUsuariosPolInternacionalResponse(service.piuPIUUsuariosPolInternacional(queryRequest));
            if (queryRequest.getPageSize() > 0) {
                queryRequest.setPageSize(0);
                response.setTotalItems(service.getCount4PIUUsuariosPolInternacional(queryRequest));
            }
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            response = new PIUUsuariosPolInternacionalResponse();
            response.setException(e);
        }
        return response;
    }

    @POST
    @Path(value = "/PIU_Usuario_Null")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PIUUsuarioNullResponse piuPIUUsuarioNull(PopulationRequestViewModel request) {
        QueryRequest queryRequest = request.buildQueryRequest();
        PIUUsuarioNullResponse response;
        try
        {
            response = new PIUUsuarioNullResponse(service.piuPIUUsuarioNull(queryRequest));
            if (queryRequest.getPageSize() > 0) {
                queryRequest.setPageSize(0);
                response.setTotalItems(service.getCount4PIUUsuarioNull(queryRequest));
            }
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            response = new PIUUsuarioNullResponse();
            response.setException(e);
        }
        return response;
    }


    @GET
    @Path("buildRelatedInstance/{relatedInstanceJsonOid}/{relatedInstancePath}")
    @Operation(hidden = true)
    public AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePath) {
        return service.buildRelatedInstance(relatedInstanceJsonOid, relatedInstancePath);
    }
}
