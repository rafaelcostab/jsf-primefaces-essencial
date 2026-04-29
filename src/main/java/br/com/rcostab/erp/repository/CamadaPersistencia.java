package br.com.rcostab.erp.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.rcostab.erp.model.Empresa;
import br.com.rcostab.erp.model.RamoAtividade;
import br.com.rcostab.erp.model.TipoEmpresa;

public class CamadaPersistencia {
	
	public static void main (String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("RcostabPU");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		RamoAtividades ramoAtividades = new RamoAtividades(em);
		Empresas empresas = new Empresas(em);
		
		List<RamoAtividade> listaRamoAtividades = ramoAtividades.pesquisar("");
		List<Empresa> listaDeEmpresas = empresas.pesquisar("");
		System.out.println(listaDeEmpresas);
		
		Empresa empresa = new Empresa();
		empresa.setNomeFantasia("João da Silva");
		empresa.setCnpj("41.952.519/0001-57");
		empresa.setRazaoSocial("João da Silva 41952519000157");
		empresa.setTipo(TipoEmpresa.MEI);
		empresa.setDataFundacao(new Date());
		empresa.setRamoAtividade(listaRamoAtividades.get(0));
		
		empresas.guardar(empresa);
		
		em.getTransaction().commit();
		
		List<Empresa> listaEmpresas2 = empresas.pesquisar("");
		System.out.println(listaEmpresas2);
		
		em.close();
		emf.close();
		
	}

}
