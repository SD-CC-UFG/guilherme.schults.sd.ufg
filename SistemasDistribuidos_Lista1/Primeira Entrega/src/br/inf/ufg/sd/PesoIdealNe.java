package br.inf.ufg.sd;

import java.text.DecimalFormat;

public class PesoIdealNe {
	
	public String calculaPesoIdeal (String altura, String sexo) {
		String resultado="";
		
		double altura1;
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("#.##");
		
		if(sexo.equalsIgnoreCase("masculino")) {
			altura1 = (72.7 * Double.parseDouble(altura)) - 58;
			resultado = "Seu peso ideal é:   " +df.format(altura1);
		} else if(sexo.equalsIgnoreCase("feminino")) {
			altura1 = (62.2 * Double.parseDouble(altura)) - 44.7;
			resultado = "Seu peso ideal é:   " +df.format(altura1);
		}
		
		return resultado;
	}

}
