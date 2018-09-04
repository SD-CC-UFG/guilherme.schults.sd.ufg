package br.inf.ufg.sd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SalarioLiquidoCt")
public class SalarioLiquidoCt extends Controler{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String PAGINA_ACAO = "/SalarioLiquido.jsp";
			
		String nome =  request.getParameter("nome");
		String nivel = request.getParameter("nivel");
		double salarioBruto =  Double.parseDouble(request.getParameter("salarioBruto"));
		int dependentes = Integer.parseInt(request.getParameter("dependentes"));
		
		
		SalarioLiquidoNe resposta = new SalarioLiquidoNe();
		String resultado = resposta.calculaSalarioLiquido(nome, nivel, salarioBruto, dependentes);
		
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
