package br.inf.ufg.sd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AposentadoriaCt")
public class AposentadoriaCt extends Controler{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String PAGINA_ACAO = "/Aposentadoria.jsp";
			
		String sexo =  request.getParameter("sexo");
		int idade = Integer.parseInt(request.getParameter("idade"));
		int tempoServico = Integer.parseInt(request.getParameter("tempoServico"));
		
		
		AposentadoriaNe resposta = new AposentadoriaNe();
		String resultado = resposta.calculaAposentadoria(idade, tempoServico, sexo);
		
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
