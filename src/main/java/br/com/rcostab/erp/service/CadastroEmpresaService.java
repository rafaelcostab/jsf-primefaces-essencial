package br.com.rcostab.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.rcostab.erp.model.Empresa;
import br.com.rcostab.erp.repository.Empresas;
import br.com.rcostab.erp.util.Transiacional;

public class CadastroEmpresaService implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Empresas empresas;
	
	@Transiacional
	public void salvar(Empresa empresa) {
		empresas.guardar(empresa);
	}
	
	@Transiacional
	public void excluir (Empresa empresa) {
		empresas.remover(empresa);
	}
	

}
