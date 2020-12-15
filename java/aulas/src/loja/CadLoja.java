package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nomeCliente;
		String codigos[] = new String[10];
		String produtos[] = { "NOTEBOOK", "CARREGADOR PARA CELULAR", "MOUSE SEM FIO", "TECLADO", "IMPRESSORA",
				"MONITOR", "CAIXAS DE SOM", "WEBCAM", "PLACA MÃE", "PLACA DE VIDEO" };
		double precoUnitarios[] = { 2500, 45, 49, 35, 780, 950, 67, 100, 2350, 3950 };
		int estoque[] = new int[10];
		int escolhido = 0;
		String escolha = "";
		int genero;
		int opcao;
		int quantidade;
		char decisao;
		do
		{
		linha();
		System.out.println("                JJ Informática LTDA®                        ");
		linha();

		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		opcao = leitor.nextInt();

		if (opcao == 1) {
			leitor.nextLine(); // Limpar o Buffer
			System.out.print("NOME DO CLIENTE: ");
			nomeCliente = leitor.nextLine().toUpperCase();

			System.out.print("GENERO DO CLIENTE [1] Masculino [2] Feminino: ");
			genero = leitor.nextInt();

			retornaSexo(nomeCliente, genero);
			System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");

			for (int x = 0; x < 10; x++) {
				estoque[x] = 10;
				codigos[x] = (x < 9) ? "JJ-00" + (x + 1) : "JJ-0" + (x + 1);
				System.out.printf("%s\t\t%.2f\t\t%d\t%s\n", codigos[x], precoUnitarios[x], estoque[x], produtos[x]);
			}
		}

		System.out.println("Selecione pelo código um produto: ");
		escolha = leitor.next().toUpperCase();

		for (int x = 0; x < 10; x++) {
			if (codigos[x].equals(escolha)) {
				escolhido = x;
				
			}
		}

		
        System.out.println("Quantas unidade você deseja: ");
        quantidade = leitor.nextInt();
        
        linha();
        System.out.printf("R$%.2f\t %d\t %s\n", precoUnitarios[escolhido]*quantidade, quantidade, produtos[escolhido]);
		linha();
		System.out.println("DESEJA CONTINUAR? [S/N]");
		decisao = leitor.next().toUpperCase().charAt(0);
		
		}while(decisao == 'S' && decisao !='N');
		 System.out.println("OBRIGADO POR VISITAR A NOSSA LOJA, VOLTE SEMPRE!!!");
		leitor.close();
	}

	public static String retornaSexo(String nomeCliente, int genero) {
		String sexo = "";
		if (genero == 1) {
			System.out.print("Seja bem-vindo " + nomeCliente);
		} else if (genero == 2) {
			System.out.print("Seja bem-vinda " + nomeCliente);
		}
		return sexo;
	}

	public static void linha() {
		System.out.println("═════════════════════════════════════════════════════");
	}

}
