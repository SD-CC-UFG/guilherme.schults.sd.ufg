package br.inf.ufg.sd;

import java.text.DecimalFormat;

public class SalarioLiquidoNe {
	
	public String calculaSalarioLiquido(String nome, String nivel, double salario, int dependentes) {
		
		
		String resultado="";
		double salarioLiquido=0.0;
		double calculaDesconto=0.0;
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
	
		if(nivel.equalsIgnoreCase("A") && dependentes == 0) {
			calculaDesconto = (salario * 0.03);
			salarioLiquido = salario - calculaDesconto;
			//resultado =  " Funcionario:"+nome+ "Nível: "+nivel+ " Novo Salário: "+String.valueOf(salarioLiquido)+" ";
			resultado = String.valueOf(salarioLiquido);
		} else if (nivel.equalsIgnoreCase("A") && dependentes > 0) {
			calculaDesconto = (salario * 0.08);
			salarioLiquido = salario - calculaDesconto;
			resultado = String.valueOf(salarioLiquido);
		} else if(nivel.equalsIgnoreCase("B") && dependentes == 0) {
			calculaDesconto = (salario * 0.05);
			salarioLiquido = salario - calculaDesconto;
			resultado = String.valueOf(salarioLiquido);
		} else if(nivel.equalsIgnoreCase("B") && dependentes > 0) {
			calculaDesconto = (salario * 0.10);
			salarioLiquido = salario - calculaDesconto;
			resultado = String.valueOf(salarioLiquido);
		} else if(nivel.equalsIgnoreCase("C") && dependentes == 0) {
			calculaDesconto = (salario * 0.08);
			salarioLiquido = salario - calculaDesconto;
			resultado = String.valueOf(salarioLiquido);
		} else if(nivel.equalsIgnoreCase("C") && dependentes > 0) {
			calculaDesconto = (salario * 0.15);
			salarioLiquido = salario - calculaDesconto;
			resultado = String.valueOf(salarioLiquido);
		} else if(nivel.equalsIgnoreCase("D") && dependentes == 0) {
			calculaDesconto = (salario * 0.10);
			salarioLiquido = salario - calculaDesconto;
			resultado = String.valueOf(salarioLiquido);
		} else if(nivel.equalsIgnoreCase("D") && dependentes > 0) {
			calculaDesconto = (salario * 0.17);
			salarioLiquido = salario - calculaDesconto;
			resultado = String.valueOf(salarioLiquido);
		} else {
			resultado =  " Por favor insira os dados e tente novamente.";
		}
		
		
		
		return resultado =  "Funcionario:"+nome+ "\nNível: "+nivel+ "\nNovo Salário: "+df.format(salarioLiquido)+" ";
		
	}

}
