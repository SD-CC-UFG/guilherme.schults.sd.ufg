package br.inf.ufg.sd;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VerificaAprovacaoCt")
public class VerificaAprovacaoCt extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String PAGINA_ACAO = "/VerificaAprovacao.jsp";
			
		String nome =  request.getParameter("nome");
		double nota1 = Double.parseDouble(request.getParameter("nota1"));
		double nota2 = Double.parseDouble(request.getParameter("nota2"));
		double nota3 = Double.parseDouble(request.getParameter("nota2"));
		
		VerificaAprovacaoNe resposta = new VerificaAprovacaoNe();
		String resultado = resposta.verificaAprovacaoAluno(nota1, nota2, nota3);
				
		// Finaliza o despacho para o jsp
		request.setAttribute("resultado", resultado);
		RequestDispatcher dis = request.getRequestDispatcher(PAGINA_ACAO);
		dis.include(request, response);
		
	}
}
