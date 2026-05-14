package br.com.rcostab.erp.di;

public class Main {
	
	public static void main(String[] args) {
		Pedidos pedidos = new Pedidos();
		
		RelatorioService relatorioService = new RelatorioService(pedidos);
		
		
	}

}
