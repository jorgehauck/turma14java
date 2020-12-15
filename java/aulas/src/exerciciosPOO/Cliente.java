package exerciciosPOO;

import java.util.Scanner;

public class Cliente {
	public String nome;
	public char genero;
	public int senha;

	public void acessar(String nome, int senha, char decisao) {
		Scanner leia = new Scanner(System.in);
		String acesso;
		
		do {
			System.out.println("SENHA INCORRETA!\n DIGITE NOVAMENTE: ");
			senha = leia.nextInt();
			if (senha == 1997) { // considerar a senha 1997
				acesso = "Acesso permitido";
				System.out.println(acesso);
				break;
			} else {
				acesso = "Acesso negado!";
				System.out.println(acesso);

			}
		} while (acesso == "Acesso negado!");

	}

}
