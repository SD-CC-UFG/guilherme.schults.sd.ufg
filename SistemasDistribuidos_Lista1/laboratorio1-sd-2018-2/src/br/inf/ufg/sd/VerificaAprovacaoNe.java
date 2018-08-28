package br.inf.ufg.sd;

public class VerificaAprovacaoNe {
	
	public String verificaAprovacaoAluno (double n1, double n2, double n3) {
		
		double resultadoMedia= (n1 + n2) / 2;
		double resultadoMedia2 = resultadoMedia + n3 / 2;
		String aprovadoReprovado="";
		String resultado="";
		
		
		if(resultadoMedia >= 7.0 ) {
			aprovadoReprovado = String.valueOf(resultadoMedia);
			resultado = "O aluno esta aprovado. Nota: "+aprovadoReprovado+"";
		} else if(resultadoMedia > 3.0 && resultadoMedia < 7.0) {
			aprovadoReprovado = String.valueOf(resultadoMedia);
			resultado = "O aluno deverá realizar a N3. Nota: "+aprovadoReprovado+"";
		} else if(resultadoMedia2 >= 5.0) {
			aprovadoReprovado = String.valueOf(resultadoMedia2);
			resultado = "Aprovado. Nota: "+aprovadoReprovado+"";
		}
		
		return resultado;
		
	}

}
