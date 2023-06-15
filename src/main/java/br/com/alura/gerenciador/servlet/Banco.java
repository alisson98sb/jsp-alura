package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

//simula um banco de dados
public class Banco {
	
	//private pois vai tratar os dados da lista apenas aqui no contexto da classe Banco
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Adidas");
		
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		System.out.println("Empresa " + empresa + " cadastrada com sucesso! ");
	}
	
	//Publica, pois vai ser o metodo que retorna as informações de list a quem quiser importar.
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}