package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlteraEmpresa
 */
@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeEmpresa = request.getParameter("nome");
		String paramId = request.getParameter("id");
		
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		banco.updateEmpresa(id, nomeEmpresa);
		List<Empresa> empresas = banco.getEmpresas();
		
		request.setAttribute("empresas", empresas);
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(request, response);
	}

}

//formulario.jsp -> alteraempresaSERVLET
//litagem -> mostraEmpresa.jsp formulario -> NovaEmpresaSERVLET