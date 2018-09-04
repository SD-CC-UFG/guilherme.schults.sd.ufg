package br.inf.ufg.sd;

public class CategoriaNadadorNe {
	
	public String verificaCategoriaNadador (int idade) {
		 
		String categoria="";
		
		if(idade >=5 && idade <= 7) {
			categoria = "Categoria infantil A";
		} else if (idade >=8 && idade <= 10) {
			categoria = "Categoria infantil B";
		} else if (idade >=11 && idade <= 13) {
			categoria = "Categoria juvenil A";
		} else if (idade >=14 && idade <= 17) {
			categoria = "Categoria juvenil B";
		} else {
			if(idade > 18) {
				categoria = "Categoria adulto";
			}
		}
		
		return categoria;
	}

}
