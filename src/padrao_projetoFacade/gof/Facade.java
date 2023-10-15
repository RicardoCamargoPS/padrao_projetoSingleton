package padrao_projetoFacade.gof;

import subSistemaAPI.CepApi;
import subSistemaCRM.CrmService;

public class Facade {
	
	public void migrarClientes(String nome,String cep ) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
	}

}
