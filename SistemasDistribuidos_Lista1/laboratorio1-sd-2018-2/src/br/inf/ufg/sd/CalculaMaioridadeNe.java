package br.inf.ufg.sd;

public class CalculaMaioridadeNe {
	
	public String verificaMaioridade(String sexo, int idade) {
		
		String mensagem="";
	
		if(sexo.equalsIgnoreCase("M") && idade >= 18) {
			mensagem="Usuario informado � maior de idade";
		} else if(sexo.equalsIgnoreCase("M") && idade < 18) {
			mensagem="Usuario informado n�o � maior de idade";
		} else if(sexo.equalsIgnoreCase("F")  && idade >= 21) {
			mensagem="Usuario informado � maior de idade";
		} else if(sexo.equalsIgnoreCase("F")  && idade < 21) {
			mensagem="Usuario informado n�o � maior de idade";
		} else {
			mensagem="Dados incorretos";
		}
		return mensagem;	
	}
	
}
