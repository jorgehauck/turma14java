package lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int soma = 0;
		for (int i = 1; i <= 500; i++) {
			if (i % 2 != 0 && i % 3 == 0) {
				soma += i;
			}
		}
		System.out.print("A soma dos n�meros �mpares m�ltiplos de 3 � de: " + soma);

		leitor.close();

	}

}
