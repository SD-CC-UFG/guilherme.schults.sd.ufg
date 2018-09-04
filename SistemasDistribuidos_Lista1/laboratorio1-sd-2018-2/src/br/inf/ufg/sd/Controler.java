package br.inf.ufg.sd;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

abstract public class Controler extends HttpServlet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void montaRetornoJSON(HttpServletResponse response, String conteudoJSON) throws IOException, JSONException {
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		PrintWriter writer = response.getWriter();
		writer.append(conteudoJSON);
		writer.flush();
	}
}
