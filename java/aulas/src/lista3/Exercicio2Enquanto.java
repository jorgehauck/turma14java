package lista3;

import java.util.Scanner;

public class Exercicio2Enquanto {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um valor: ");
		numero = leitor.nextInt();
		System.out.print("\n"+numero+"\n");
		
		while(numero < 100)
		{
			numero = numero * 3;
			System.out.print(numero+"\n");
		}
		leitor.close();
	}

}
