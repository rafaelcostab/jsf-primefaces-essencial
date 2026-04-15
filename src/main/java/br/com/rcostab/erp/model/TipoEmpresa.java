package br.com.rcostab.erp.model;

public enum TipoEmpresa {
	
	MEI("Micro empreendedor Individual"),
	EIRELI("Empresa individual de Responsabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anônima");
	
	private String descricao;
	
	TipoEmpresa(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
