package com.keralty.aepersonas.viewmodel.funcionario.piu;

import com.keralty.aepersonas.viewmodel.PopulationRequestViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.funcionario.filter.FFuncionarioPorNombreNoAseso;

public class PIUUsuariosRequest extends PopulationRequestViewModel{

    private FFuncionarioPorNombreNoAseso fFuncionarioPorNombreNoAseso;
    
    public void setFFuncionarioPorNombreNoAseso(FFuncionarioPorNombreNoAseso fFuncionarioPorNombreNoAseso) {
        this.fFuncionarioPorNombreNoAseso = fFuncionarioPorNombreNoAseso;
    }
    
    public FFuncionarioPorNombreNoAseso getFFuncionarioPorNombreNoAseso() {
        return fFuncionarioPorNombreNoAseso;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fFuncionarioPorNombreNoAseso != null)
            queryRequest.addFilterRequest(fFuncionarioPorNombreNoAseso.buildFilterRequest());
        return queryRequest;
    }
}
