package exemplos;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int numero;
		int somatorio = 0;

		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();

		for (numero = 1; numero <= 500; numero++) {
			if ((numero % 2 == 1) && (numero % 3 == 0)) {
				somatorio = somatorio + numero;
			}
		}
		System.out.println(somatorio);

	}

}
