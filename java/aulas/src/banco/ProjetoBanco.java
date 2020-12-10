package banco;

import java.util.Scanner;

public class ProjetoBanco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao, numeroConta;
	    double saldo = 0, debito = 0, credito = 0;

		do {
			System.out.println("█	     BANCO DIGITAL G&4		 █");
			// linha();
			// pula();
			linha();
			System.out.println("█\t   SERVIÇOS DISPONÍVEIS		 █");
			linha();
			System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬ MENU ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
			System.out.print("[1] - Conta Poupança\n");
			System.out.print("[2] - Conta Corrente\n");
			System.out.print("[3] - Conta Especial\n");
			System.out.print("[4] - Conta Empresa\n");
			System.out.print("[5] - Conta Universitária\n");
			System.out.print("[6] - Sair do banco\n");
			pula();
			System.out.print("Opção: ");
			opcao = scan.nextInt();

			if (opcao == 1) {
				linha();
				System.out.println("\t\tCONTA POUPANÇA");
				linha();
				System.out.println("SALDO ATUAL R$: "+saldo);
				System.out.println("[1] - DEPÓSITO");
				System.out.println("[2] - DÉBITO");
				opcao = scan.nextInt();
			    //poupanca();

			} else if (opcao == 2) {
				/// CHAMA FUNCAO CORRENTE
			} else if (opcao == 3) {
				/// CHAMA FUNCAO ESPECIAL
			} else if (opcao == 4) {
				/// CHAMA FUNCAO EMPRESA
			} else if (opcao == 5) {
				/// CHAMA FUNCAO UNIVERSITARIA
			} else {
				System.out.println("Opção inválida, tente novamente");
			}

		} while (opcao != 6);

	}

	public static double poupanca(double saldo, double credito, double debito, int opcao) 
	{
		//Scanner leitor = new Scanner(System.in);
		double saldoConta = 0;
		if(opcao == 1)
		{
			System.out.println("Informe o valor do depósito: ");
			//credito = leitor.nextDouble();
			credito+= saldoConta;
		    System.out.printf("SALDO ATUAL: %.2f",saldoConta);
		}
		else if(opcao == 2)
		{
			System.out.println("Informe os seus débitos: ");
			//debito = leitor.nextDouble();
			debito-= saldoConta;
			System.out.printf("SALDO ATUAL: %.2f",debito);
		}
		
		return saldo;
	}
    
	public static void pula()
	{
		System.out.print("\n");
	}

	public static void linha() 
	{
		System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");

	}
}
