package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nomeCliente;
		int genero;
		int opcao;
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
		}

		leitor.close();
	}

	public static String retornaSexo(String nomeCliente, int genero) {
		String sexo = "";
		if(genero == 1) {
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
