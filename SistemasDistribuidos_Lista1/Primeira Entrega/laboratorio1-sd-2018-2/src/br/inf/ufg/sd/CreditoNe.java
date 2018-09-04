package br.inf.ufg.sd;

import java.text.DecimalFormat;

public class CreditoNe {
	
	public String calculaCredito (double saldoAnterior) {
		double credito=0.0;
		String resultado="";
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
		
		
		if(saldoAnterior > 0 && saldoAnterior <= 200.0) {
			resultado="Seu saldo: "+saldoAnterior+", não concede crédito";
		} else if(saldoAnterior >= 201 && saldoAnterior <= 400) {
			credito = saldoAnterior * 0.2 + saldoAnterior;
			resultado="Saldo do cliente: "+saldoAnterior+".\nPercentual de credito especial disponível: 20%.\n Novo saldo:"+df.format(credito)+" ";
		} else if(saldoAnterior > 401 && saldoAnterior <= 601) {
			credito = saldoAnterior * 0.3 + saldoAnterior;
			resultado="Saldo do cliente: "+saldoAnterior+".\nPercentual de credito especial disponível: 30%.\nNovo saldo:"+df.format(credito)+"";
		} else if (saldoAnterior > 601){
			credito = (saldoAnterior * 0.4) + saldoAnterior;
			resultado="Saldo do cliente: "+saldoAnterior+".\nPercentual de credito especial disponível: 40%.\nNovo saldo:"+df.format(credito)+"";
		} else {
			resultado="Verifique os dados inseridos e tente novamente";
		}
		return resultado;
	}

}
