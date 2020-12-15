package bancos;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("BANCO TESTE PARA USO");
	int conta;
	
	System.out.println("Digite o número da conta: ");
	conta = leia.nextInt();
	
	Conta processo1 = new Conta(conta);
	

	}

}
