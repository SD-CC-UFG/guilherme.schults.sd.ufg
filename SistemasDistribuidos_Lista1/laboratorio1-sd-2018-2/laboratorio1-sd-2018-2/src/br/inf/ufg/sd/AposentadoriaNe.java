package br.inf.ufg.sd;

public class AposentadoriaNe {
	
	public String calculaAposentadoria (int idade, int tempoServico, String sexo) {
		
		String resultado="";
	
			if(sexo.equalsIgnoreCase("masculino")) {
				if(idade >= 65 && tempoServico >= 30) {
					resultado = " Trabalhador :"+idade+ " anos.\nTempo de Serviço: "+tempoServico+ "\nResultado: apto para aposentadoria";
				} else {
					resultado = " Trabalhador :"+idade+ " anos.\nTempo de Serviço: "+tempoServico+ "\nResultado: inapto para aposentadoria";
				}
			} else {
			
				if(sexo.equalsIgnoreCase("feminino")) {
					if(idade >= 60 && tempoServico >= 25) {
						resultado = " Trabalhadora :"+idade+ " anos.\nTempo de Serviço: "+tempoServico+ "\nResultado: apta para aposentadoria";
					} else {
						resultado = " Trabalhadora :"+idade+ " anos.\nTempo de Serviço: "+tempoServico+ "\nResultado: inapta para aposentadoria";
					}
				}
			}

		return resultado;
	
	}

}
