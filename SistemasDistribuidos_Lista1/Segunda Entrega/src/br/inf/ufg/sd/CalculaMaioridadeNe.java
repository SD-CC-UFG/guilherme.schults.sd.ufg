package br.inf.ufg.sd;

public class CalculaMaioridadeNe {
	
	public String verificaMaioridade(String sexo, int idade) {
		
		String mensagem="";
	
		if(sexo.equalsIgnoreCase("M") && idade >= 18) {
			mensagem="Usuario informado é maior de idade";
		} else if(sexo.equalsIgnoreCase("M") && idade < 18) {
			mensagem="Usuario informado não é maior de idade";
		} else if(sexo.equalsIgnoreCase("F")  && idade >= 21) {
			mensagem="Usuario informado é maior de idade";
		} else if(sexo.equalsIgnoreCase("F")  && idade < 21) {
			mensagem="Usuario informado não é maior de idade";
		} else {
			mensagem="Dados incorretos";
		}
		return mensagem;	
	}
	
}
