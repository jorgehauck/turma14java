package banco;

import java.util.Random;
import java.util.Scanner;

public class ContaPoupanca {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random sorteia = new Random();
		String cliente[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa", "Bárbara Liboni Guerra",
				"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
				"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
				"FERNANDA AGAPITO", "Fernanda Barbosa Ferraz", "Francisco José Pires", "Gabriel Enrique Cabral Silva",
				"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso", "GILSON AMORIM DE MATOS",
				"Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles", "HELOISA BEATRIZ DE OLIVEIRA COSTA",
				"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
				"José Jorge Hauck Júnior", "Juliana Santos André", "Kélven Cleiton de Araújo Brandão",
				"Laís Lima Santos", "Lucas anseloni barros", "Lucas Gonçalves da SIlva", "luis felipe da silva",
				"Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima",
				"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Verônica Navarro Almenara",
				"Vinicius Alves Miranda" };
		char genero[] = { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M',
				'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F',
				'M' };
		int[] conta = new int[40];
		int[] tipoConta = new int[40];
		double[] saldoConta = new double[40];
		double transacoes;
		int aniversario[] = new int[40]; // aniversario[] = sorteio.nextInt(31) + 1;
		final int DATA_ANIVERSARIO = 10;
		final int MAX_MOVIMENTACOES = 10;
		int diaUsuario;
		int decisao;
		int opcaoMenuPrincipal;
		int encontra = 0;
		int escolha = 0, clienteLocalizado;
		int status;
		int continua = 0;

		inicializaVetor(conta, tipoConta, saldoConta, aniversario);
		System.out.print("DIGITE O NÚMERO DA CONTA: ");
		clienteLocalizado = leia.nextInt();
		for (int x = 0; x < 40; x++) {
			if (clienteLocalizado == conta[x]) {
				escolha = x; // fazer essa obs
				encontra = 1;
			}
		}
		if (encontra == 0) {
			System.out.print("Cliente não localizado.");
		} else {
			// System.out.print("Gênero que se identifica: [M]Masculino - [F]Feminino -
			// [O]Outros: ");
			// genero = leia.next().toUpperCase().charAt(0);
			if (genero[escolha] == 'M') {
				System.out.println("Seja bem-vindo ao G4 Bank Sr. " + cliente[escolha] + ":)");
			} else if (genero[escolha] == 'F') {
				System.out.println("Seja bem-vinda ao G4 Bank Sra. " + cliente[escolha] + ":)");
			} else {
				System.out.println("Seja bem-vindx ao G4 Bank Srx. " + cliente[escolha] + ":)");
			}
		}
		if (tipoConta[escolha] == 1) {
			System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA POUPANÇA");
			linha();
			System.out.println("DIA DE ANIVERSÁRIO "+aniversario[escolha]);
			System.out.println("INFORME O DIA DE HOJE: ");
			diaUsuario = leia.nextInt();
			do {
				System.out.print("----------------------------------------------------\n");
				System.out.print("█	     BANCO DIGITAL G&4		 █\n");
				System.out.print("-----------------------------------------------------\n");
				System.out.print("\n------------ MENU INICIAL --------------\n\n");
				System.out.print("[1] - MOVIMENTAÇÃO\n");
				System.out.print("[2] - SALDO\n");
				System.out.print("[3] - SAIR\n");
				System.out.print("\nOpção: ");
				opcaoMenuPrincipal = leia.nextInt();

				if (opcaoMenuPrincipal == 1) {
					System.out.println("DESEJA INICIAR UMA MOVIMENTAÇÃO:[1] - SIM [2] - NÃO ");
					decisao = leia.nextInt();
					while (decisao == 1 && continua < MAX_MOVIMENTACOES) {
						continua++;
						if (saldoConta[escolha] == 0) {
							System.out.printf("\nSALDO INSUFICIENTE! R$:%.2f", saldoConta[escolha]);
							System.out.printf("\nDIGITE O VALOR DO DEPÓSITO: ");
							transacoes = leia.nextDouble();
							while (transacoes < 0) {
								System.out.printf("\nVALOR INCORRETO! DIGITE NOVAMENTE: ");
								transacoes = leia.nextDouble();
							}
							saldoConta[escolha] += transacoes;
							System.out.printf("SALDO ATUAL: R$ %.2f", saldoConta[escolha]);

						} else {
							System.out.printf("\n[1] - DEPÓSITO");
							System.out.printf("\n[2] - DÉBITAR");
							status = leia.nextInt();
							if (status == 1) {
								System.out.printf("\nDIGITE O VALOR DO DEPÓSITO: ");
								transacoes = leia.nextDouble();
								while (transacoes < 0) {
									System.out.printf("VALOR INCORRETO! DIGITE NOVAMENTE!");
									transacoes = leia.nextDouble();

								}

								saldoConta[escolha] += transacoes;
								System.out.printf("SALDO ATUAL: R$%.2f", saldoConta[escolha]);
							} else {
								System.out.printf("\nDIGITE O VALOR DO DÉBITO: ");
								transacoes = leia.nextDouble();
								while (transacoes < 0) {
									System.out.printf("VALOR INCORRETO! DIGITE NOVAMENTE!");
									transacoes = leia.nextDouble();

								}

								while (transacoes > saldoConta[escolha]) {
									System.out.printf("\nSALDO INSUFICIENTE! R$:%.2f", saldoConta[escolha]);
									System.out.printf("\nDIGITE O VALOR DO DÉBITO: ");
									transacoes = leia.nextDouble();

								}
								transacoes = -transacoes;
								saldoConta[escolha] += transacoes;
								System.out.printf("SALDO ATUAL: R$%.2f", saldoConta[escolha]);
							}
							System.out.print("\nDESEJA CONTINUAR A SUA OPERAÇÃO [1] - SIM [2] - NÃO");
							decisao = leia.nextInt();
							if (continua >= MAX_MOVIMENTACOES) {
								System.out.println("VOCÊ JÁ REALIZOU O MÁXIMO DE OPERAÇÕES!");
							}
						}

					}
					
					if(diaUsuario == aniversario[escolha])
					{
						saldoConta[escolha] = 1.005 * saldoConta[escolha];
						System.out.printf("SALDO ATUAL COM REAJUSTE: R$ %.2f\n",saldoConta[escolha]);
					}

				}
				if(opcaoMenuPrincipal == 2)
				{
					System.out.printf("SALDO ATUAL: R$ %.2f\n",saldoConta[escolha]);
				}

			} while (opcaoMenuPrincipal != 3);

		} else if (tipoConta[escolha] == 2) {
			System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA CORRENTE");
		} else if (tipoConta[escolha] == 3) {
			System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA ESPECIAL");
		} else {
			System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA EMPRESARIAL");
		}

		leia.close();

	}

	public static void linha() {
		System.out.println("════════════════════════════════════════════════════════");
	}

	public static void inicializaVetor(int[] conta, int[] tipoConta, double[] saldoConta, int[] aniversario) {
		Random sorteia = new Random();

		for (int x = 0; x < 40; x++) {
			conta[x] = (x + 1);
			tipoConta[x] = sorteia.nextInt(4) + 1;
			saldoConta[x] = 0.0;
			aniversario[x] = sorteia.nextInt(31) + 1;
		}
		tipoConta[0] = 1;
	}

}
