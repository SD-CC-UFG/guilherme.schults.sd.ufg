package br.inf.ufg.sd;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreditoCt")
public class CreditoCt extends Controler{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String PAGINA_ACAO = "/Credito.jsp";
		
		String saldo1 = request.getParameter("saldo");
		double saldo = Double.parseDouble(saldo1);
		
		CreditoNe resposta = new CreditoNe();
		String resultado = resposta.calculaCredito(saldo);
		
		try {
			montaRetornoJSON(response, "{\"mensagem\": \"" + resultado + "\"}");
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
				
		// Finaliza o despacho para o jsp
	/*	request.setAttribute("resultado", resultado);
		RequestDispatcher dis = request.getRequestDispatcher(PAGINA_ACAO);
		dis.include(request, response);*/
		
	}
}