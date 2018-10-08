package lista.rmi.questoes;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.UnmarshalException;
import java.util.Scanner;

import org.json.JSONException;
/**
*
* @author Guilherme Ferreira Schults
*/
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	private static Scanner dados;

	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException, JSONException, UnmarshalException {
		
		dados = new Scanner(System.in);	
		RemoteProcedures procedures;
		String nome,
			   cargo,
			   sexo,
			   altura,
			   nivel;
		double n1,
			   n2,
			   n3,
			   salario,
			   saldoAnterior;
		int idade,
			dependentes,
			tempoServico,
			opcao = 0;
		
		do {
		menu();
		opcao = dados.nextInt();
		switch (opcao) {
		case 1:
			questao1();
			dados.nextLine();
			System.out.println("Informe a nota N1 do aluno");
			n1 = Double.parseDouble(dados.nextLine());
			System.out.println("Informe a nota N2 do aluno");
			n2 = Double.parseDouble(dados.nextLine());
			System.out.println("Informe a nota N3 do aluno");
			n3 = Double.parseDouble(dados.nextLine());
		
			try 
			{
				procedures = (RemoteProcedures) Naming.lookup(Constantes.RMI_ID_LOCALHOST);
				System.out.println("Servidor responde: \nResultado: " + procedures.AprovacaoAlunoJson(n1, n2, n3));
				
			} catch (MalformedURLException e) {
				System.out.println("Erro:" + e.toString());
				e.printStackTrace();
			} catch (RemoteException e) {
				System.out.println("Erro:" + e.toString());
				e.printStackTrace();
			} catch (NotBoundException e) {
				System.out.println("Erro:" + e.toString());
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Entrada Inválida:" + e.toString());
				System.exit(-1);
			}
			break;
		case 2:
			questao2();
			dados.nextLine();
			System.out.println("Informe o nome:");
			nome = dados.nextLine();
			System.out.println("Informe o cargo:");
			cargo = dados.nextLine();
			System.out.println("informe o salario:");
			salario = Double.parseDouble(dados.nextLine());
			
			switch(cargo) {
			
			case "operador":
				procedures = (RemoteProcedures) Naming.lookup(Constantes.RMI_ID_LOCALHOST);
				System.out.println("Servidor responde: \nResultado: " + procedures.calcularReajusteJson(nome, cargo, salario));
				break;
			case "programador":
				procedures = (RemoteProcedures) Naming.lookup(Constantes.RMI_ID_LOCALHOST);
				System.out.println("Servidor responde: \nResultado: " + procedures.calcularReajusteJson(nome, cargo, salario));
				break;
			}
			break;
		case 3:
			questao3();
			dados.nextLine();
			System.out.println("Informe o sexo - (M) ou (F):");
			sexo = dados.nextLine();
			System.out.println("Informe a idade:");
			idade = dados.nextInt();
			
			procedures = (RemoteProcedures) Naming.lookup(Constantes.RMI_ID_LOCALHOST);
			System.out.println("Servidor responde: \nResultado: " + procedures.verificaMaioridadeJson(sexo, idade));
			break;
		
		case 4:
		questao4();
		dados.nextLine();
		System.out.println("Informe a altura");
		altura = dados.nextLine();
		System.out.println("Informe o sexo - (Masculino) ou (Feminino):");
		sexo = dados.nextLine();
		
		procedures = (RemoteProcedures) Naming.lookup(Constantes.RMI_ID_LOCALHOST);
		System.out.println("Servidor responde: \nResultado: " + procedures.calculaPesoIdealJson(altura, sexo));
		
		break;
		
		case 5:
		questao5();
		
		System.out.println("Informe a idade:");
		idade = dados.nextInt();
			
		procedures = (RemoteProcedures) Naming.lookup(Constantes.RMI_ID_LOCALHOST);
		System.out.println("Servidor responde: \nResultado: " + procedures.verificaCategoriaNadadorJson(idade));
			
		break;
		
		case 6:
			questao6();
			dados.nextLine();
			System.out.println("Informe o nome:");
			nome = dados.nextLine();
			System.out.println("Informe nivel - (A), (B), (C) ou (D) :");
			nivel = dados.nextLine();
			System.out.println("Informe o salario:");
			salario = dados.nextDouble();
			System.out.println("Informe a quantidade de dependentes:");
			dependentes = dados.nextInt();
			
			procedures = (RemoteProcedures) Naming.lookup(Constantes.RMI_ID_LOCALHOST);
			System.out.println("Servidor responde: \nResultado: " + procedures.calculaSalarioLiquidoJson(nome, nivel, salario, dependentes));

		break;
		
		case 7:
			questao7();
			dados.nextLine();
			
			System.out.println("Informe o saldo conta:");
			saldoAnterior = dados.nextDouble();
			
			procedures = (RemoteProcedures) Naming.lookup(Constantes.RMI_ID_LOCALHOST);
			System.out.println("Servidor responde: \nResultado: " + procedures.calculaCreditoJson(saldoAnterior));
		break;
		
		case 8:
			questao8();
					
			System.out.println("Informe a idade:");
			idade = dados.nextInt();
			System.out.println("Informe o tempo de serviço:");
			tempoServico = dados.nextInt();
			dados.nextLine();
			System.out.println("Informe o sexo - (Masculino) ou (Feminino):");
			sexo = dados.nextLine();
			
			procedures = (RemoteProcedures) Naming.lookup(Constantes.RMI_ID_LOCALHOST);
			System.out.println("Servidor responde: \nResultado: " + procedures.calculaAposentadoriaJson(idade, tempoServico, sexo));
			
		break;
		
		default:
            System.out.println("Programa encerrado.");
			}
		
		}while(opcao != 0);
	}
	
	
	  public static void menu(){    
	        System.out.println("\nSistemas Distribuídos - INF UFG - Lista 1 usando RMI\n");
            System.out.println(" Questão 1 - Calcular Aprovação de Aluno");
            System.out.println(" Questão 2 - Calcular Reajuste de Salário de Funcionário");
            System.out.println(" Questão 3 - Calcular Maioridade");
            System.out.println(" Questão 4 - Calcular Peso Ideal");
            System.out.println(" Questão 5 - Calcular Categoria Nadador");
            System.out.println(" Questão 6 - Calcular Salário Líquido Funcionário");
            System.out.println(" Questão 7 - Calcular Crédito Disponível para cliente");
            System.out.println(" Questão 8 - Calcular Aposentadoria");
            System.out.println(" Digite 0 para sair do programa.\n");
	    }
	  
	    public static void questao1(){
	        System.out.println("Você esta na questão 1.\n");
	    }	    
	    public static void questao2(){
	        System.out.println("Você esta na questão 2.\n");
	    }    
	    public static void questao3(){
	        System.out.println("Você esta na questão 3.\n");
	    }   
	    public static void questao4(){
	        System.out.println("Você esta na questão 4.\n");
	    }
	    public static void questao5(){
	        System.out.println("Você esta na questão 5.\n");
	    }
	    public static void questao6(){
	        System.out.println("Você esta na questão 6.\n");
	    }
	    public static void questao7(){
	        System.out.println("Você esta na questão 7.\n");
	    }
	    public static void questao8(){
	        System.out.println("Você esta na questão 8.\n");
	    }

}
