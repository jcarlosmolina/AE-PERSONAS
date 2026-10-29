package com.keralty.aepersonas.viewmodel.funcionario.piu;

import com.keralty.aepersonas.viewmodel.PopulationRequestViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.funcionario.filter.FFuncionarioPorNombre;

public class PIUFuncionarioGrupoUsuariosRequest extends PopulationRequestViewModel{

    private FFuncionarioPorNombre fFuncionarioPorNombre;
    
    public void setFFuncionarioPorNombre(FFuncionarioPorNombre fFuncionarioPorNombre) {
        this.fFuncionarioPorNombre = fFuncionarioPorNombre;
    }
    
    public FFuncionarioPorNombre getFFuncionarioPorNombre() {
        return fFuncionarioPorNombre;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fFuncionarioPorNombre != null)
            queryRequest.addFilterRequest(fFuncionarioPorNombre.buildFilterRequest());
        return queryRequest;
    }
}
