package br.inf.ufg.sd;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculaReajusteCt")
public class CalculaReajusteCt extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String PAGINA_ACAO = "/ReajusteSalario.jsp";
			
		String nome =  request.getParameter("nome");
		String cargo =  request.getParameter("cargo");
		double salario = Double.parseDouble(request.getParameter("salario"));
		
		CalculaReajusteNe resposta = new CalculaReajusteNe();
		String resultado = resposta.calcularReajuste(nome, cargo, salario);
				
		// Finaliza o despacho para o jsp
		request.setAttribute("resultado", resultado);
		RequestDispatcher dis = request.getRequestDispatcher(PAGINA_ACAO);
		dis.include(request, response);
		
	}
}
