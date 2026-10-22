package com.keralty.aepersonas.api.globalservices;

import com.keralty.aepersonas.service.GlobalServicesService;
import com.keralty.aepersonas.utils.TokenUtilities;
import com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest;
import com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.jwt.JsonWebToken;

@Path("/api/GlobalServicesApi")
@RequestScoped
public class GlobalServicesApi {

    GlobalServicesService service;

    public GlobalServicesApi(GlobalServicesService service, JsonWebToken jwt) {
        this.service = service;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @POST
    @Path(value = "/TGSELECCONTRATOASOC")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tGSELECCONTRATOASOC(TGSELECCONTRATOASOCRequest request) {
        return service.tGSELECCONTRATOASOC(request);
    }

    @POST
    @Path(value = "/TGSELECCONTRATOASOCCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tGSELECCONTRATOASOCCheckPreconditions(TGSELECCONTRATOASOCRequest request) {
        return service.tGSELECCONTRATOASOCCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGSELECCONTRATOASOCTIT")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tGSELECCONTRATOASOCTIT(TGSELECCONTRATOASOCTITRequest request) {
        return service.tGSELECCONTRATOASOCTIT(request);
    }

    @POST
    @Path(value = "/TGSELECCONTRATOASOCTITCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tGSELECCONTRATOASOCTITCheckPreconditions(TGSELECCONTRATOASOCTITRequest request) {
        return service.tGSELECCONTRATOASOCTITCheckPreconditions(request);
    }
}
