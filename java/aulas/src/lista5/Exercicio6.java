package lista5;
import java.util.Random;
public class Exercicio6
{
	public static void main(String[] args)
	{
		/*
		 * Fa�a um programa que l� um vetor de 3 elementos e uma matriz de 3 x 3
		 * elementos. Em seguida o programa deve fazer a multiplica��o do vetor pelas
		   colunas da matriz.
		 */
		Random rand = new Random();
		int vetor[] = new int[3];
		int matriz[][] = new int [3][3];
		int mult;
		//s� o vetor
		System.out.println("Vetor");
		for (int indice=0; indice<3;indice++)
		{
			vetor[indice]=rand.nextInt(9)+1;
			System.out.print(" | "+vetor[indice]+" | ");
		}
		
		//matriz
		System.out.println();
		System.out.println("Matriz");
		for (int linha=0;linha<3; linha++)
		{
			for (int coluna=0; coluna<3; coluna++)
			{
				matriz[linha][coluna]= rand.nextInt(9)+1;
				System.out.print(" | "+matriz[linha][coluna]+" | ");
			}
			System.out.println();
		}
		System.out.println("CALCULO");
		for (int linha=0;linha<3; linha++)
		{
			for (int coluna=0; coluna<3; coluna++)
			{
				mult = vetor[coluna]*matriz[linha][coluna];
				System.out.print(" | "+mult+" | ");
				
			}
			System.out.println();
		}
		
	}
}
