package br.inf.ufg.sd;

import java.text.DecimalFormat;

public class CalculaReajusteNe {
	
	public String calcularReajuste(String nome, String cargo, double salario) {
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
		
		
		String resultado="";
		String mensagem="";
		double porcentagemOperador,
			   porcentagemProgramador;
		
		if(nome != null && cargo != null & salario > 0) {
			if(cargo.equalsIgnoreCase("operador")) {		
				porcentagemOperador = salario * 0.20;
				salario +=porcentagemOperador;
				mensagem = String.valueOf(df.format(salario));
			} else if(cargo.equalsIgnoreCase("programador")) {			
				porcentagemProgramador = salario * 0.20;
				salario += porcentagemProgramador;				
				mensagem = String.valueOf(df.format(salario));
			}
			return resultado = "Novo salario do funcionario é: " +mensagem;
		}	
		return resultado;
	}

}
