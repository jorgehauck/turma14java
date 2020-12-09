package lista3;

import java.util.Scanner;

public class Exercicio2FacaEnquanto {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int numero, acumulador = 0, soma = 0;
		System.out.println("Informe um número: ");
		numero = leitor.nextInt();
		
		do 
		{
		  acumulador++;
		  soma = soma + acumulador;
		}while(acumulador < numero);
		 System.out.println(soma);
		leitor.close();

	}

}
