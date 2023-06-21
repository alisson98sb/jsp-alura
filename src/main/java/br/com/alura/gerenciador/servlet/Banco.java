package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//simula um banco de dados
public class Banco {
	
	//private pois vai tratar os dados da lista apenas aqui no contexto da classe Banco
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer id = 1;

	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		empresa.setId(id++);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Adidas");
		empresa2.setId(id++);
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		empresa.setId(id++);
	
	}
	
	//Publica, pois vai ser o metodo que retorna as informações de list a quem quiser importar.
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}


	public void removeEmpresa(Integer empresaId) {
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == empresaId) {
				it.remove();
			}
		}
		
	}

	public Empresa getEmpresa(Integer empresaId) {
		for(Empresa empresa : lista) {
			if(empresa.getId() == empresaId) {
				return empresa;
			}
		}
		return null;
	}

	public Empresa updateEmpresa(Integer empresaId, String empresaNome) {
		Empresa empresa = this.getEmpresa(empresaId);
		empresa.setNome(empresaNome);
		return empresa;
	}

}