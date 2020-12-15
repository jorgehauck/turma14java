package exerciciosPOO;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cliente cliente = new Cliente();
		String nome = "";
		int senha = 0; //SENHA PARA ACESSO 1997
		char decisao = 0;
		System.out.println("Digite o seu nome: ");
		cliente.nome = leia.next();
		System.out.println("Digite a sua senha: ");
		senha = leia.nextInt();
		cliente.acessar(nome, senha, decisao);
		
		
		
		
        
	}

}
