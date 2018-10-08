package br.inf.ufg.sd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PesoIdealCt")
public class PesoIdealCt extends Controler{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String PAGINA_ACAO = "/PesoIdeal.jsp";
			
		String altura =  request.getParameter("altura");
		String sexo =  request.getParameter("sexo");		
		
		PesoIdealNe resposta = new PesoIdealNe();
		String resultado="";
		String mensagem="";
		
		if(request.getParameter("sexo").equalsIgnoreCase("masculino") && request.getParameter("sexo") != null) {
			resultado = resposta.calculaPesoIdeal(altura, sexo);
		} else if(request.getParameter("sexo").equalsIgnoreCase("feminino") && request.getParameter("sexo") != null) {
			resultado = resposta.calculaPesoIdeal(altura, sexo);
		} else {
			mensagem="Sexo informado é inválido";
		}
				
		// Finaliza o despacho para o jsp
		request.setAttribute("resultado", resultado);
		RequestDispatcher dis = request.getRequestDispatcher(PAGINA_ACAO);
		dis.include(request, response);
		
	}
}
