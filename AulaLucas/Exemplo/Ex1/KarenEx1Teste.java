package KarenListaHeranca;


import java.io.Console;
import java.util.Scanner;
public class KarenEx1Teste {
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);
		String nome, matricula, turno;
		int escolheCadastro;
		double salario, bonus;
		System.out.print("1- Para Funcionário\n2- Para Assistente\n3- Para Assistente Técnico\n4- Para Assistente Administrativo");
		escolheCadastro= input.nextInt();
		switch (escolheCadastro) {
		case 1:
		  //Teste da classe funcionario 
		  System.out.print("Digite o Nome do Funcionário:");
		  nome= input.next();
		  System.out.print("Digite o Salário do Funcionário:");
		  salario= input.nextDouble();
		  KarenEx1Funcionario objFuncionario= new KarenEx1Funcionario(nome,salario);
		  System.out.println("*****Informações de Funcionário*****");
		  objFuncionario.exibeDados();
		  objFuncionario.addAumento(1000);
		  System.out.println("*****Informações de Funcionário*****");
		  objFuncionario.exibeDados();
		break;
		case 2: 
			//Teste da classe assistente 
			System.out.print("Digite o Nome do Assistente:");
			nome= input.next();
			System.out.print("Digite o Salario do Assistente:");
			salario= input.nextDouble();
			System.out.print("Digite a Matrícula do Assistente:");
			matricula= input.next();
			KarenEx1Assistente objAssistente= new KarenEx1Assistente(matricula, nome, salario);
			System.out.println("*****Informações de Assistente*****");
			objAssistente.exibeDados();
			System.out.print("Digite Novamente o Nome do Assistente");
			nome= input.next();
			objAssistente.addAumento(1000);
			objAssistente.setNome(nome);
			System.out.println("*****Informações de Assistente*****");
			objAssistente.exibeDados();
		break;
		case 3: 
			//Teste da classe assistente 
			System.out.print("Digite o Nome do Assistente Técnico:");
			nome= input.next();
			System.out.print("Digite o Salario do Assistente Técnico:");
			salario= input.nextDouble();
			System.out.print("Digite a Matrícula do Assistente Técnico:");
			matricula= input.next();
			System.out.print("Digite o bônus do Assistente Técnico:");
			bonus= input.nextDouble();
			KarenEx1Assistente objAssistenteTecnico= new KarenEx1AssistenteTecnico(bonus, matricula, nome, salario);
			objAssistenteTecnico.exibeDados();
		break;
		case 4: 
			//Teste da classe assistente 
			System.out.print("Digite o Nome do Assistente Adm:");
			nome= input.next();
			System.out.print("Digite o Salario do Assistente Adm:");
			salario= input.nextDouble();
			System.out.print("Digite a Matrícula do Assistente Adm:");
			matricula= input.next();
			System.out.print("Digite o turno do Assistente Adm:");
			turno= input.next();
			System.out.print("Digite o adicional Noturno do Assistente Adm:");
			bonus= input.nextDouble();
			KarenEx1Assistente objAssistenteAdm= new KarenEx1AssistenteAdm(turno, bonus, matricula, nome, salario);
			objAssistenteAdm.exibeDados();
		break;		
		default:
			System.out.println("Opção inválida");
		}//fim switch
	}//fim do main

}