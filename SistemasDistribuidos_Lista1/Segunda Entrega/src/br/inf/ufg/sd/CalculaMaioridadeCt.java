package br.inf.ufg.sd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.inf.ufg.sd.CalculaMaioridadeNe;

@WebServlet("/CalculaMaioridadeCt")
public class CalculaMaioridadeCt extends Controler {

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String PAGINA_ACAO = "/CalculaMaioridade.jsp";
		String mensagem = "";
		
		
		String nome = request.getParameter("nome");
		String sexo = request.getParameter("sexo");
		String idade = request.getParameter("idade");
		int idadeUsuario = Integer.parseInt(idade);
		
		CalculaMaioridadeNe calcula = new CalculaMaioridadeNe();
		
		String resultado="";
		
		if(request.getParameter("sexo").equalsIgnoreCase("M") && request.getParameter("sexo") != null) {
			resultado = calcula.verificaMaioridade(sexo, idadeUsuario);
		} else if(request.getParameter("sexo").equalsIgnoreCase("F") && request.getParameter("sexo") != null) {
			resultado = calcula.verificaMaioridade(sexo, idadeUsuario);
		} else {
			mensagem="Sexo informado é inválido";
			
		}
		
		try {
			montaRetornoJSON(response, "{\"mensagem\": \"" + resultado + "\"}");
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		
		// Finaliza o despacho para o jsp
		/*request.setAttribute("resultado", resultado);
		RequestDispatcher dis = request.getRequestDispatcher(PAGINA_ACAO);
		dis.include(request, response);*/
	}

}
