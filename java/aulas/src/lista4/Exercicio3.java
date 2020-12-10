package lista4;
import java.util.Random;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random sorteio = new Random();
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		System.out.println("\nMATRIZ N1");
		for(int linha = 0; linha <4; linha++)
		{
			for(int coluna = 0; coluna < 6; coluna++)
			{   
				
				N1[linha][coluna] = sorteio.nextInt(10);
				
				
				System.out.print(N1[linha][coluna]+" ");
				
			}
			
			System.out.printf("\n","\t");
		}
		System.out.println("\nMATRIZ N2");
		for(int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6; coluna++)
			{
				N2[linha][coluna] = sorteio.nextInt(9);
				System.out.print(N2[linha][coluna]+" ");
			}
			
			System.out.printf("\n","\t");
			
		}
		System.out.println("\n");
		for(int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6; coluna++)
			{
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				System.out.print(M1[linha][coluna]+" ");
			}
			
			System.out.printf("\n","\t");
			
		}
		
		for(int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 4; coluna++)
			{
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
				System.out.print(M2[linha][coluna]+" ");
			}
			
			System.out.printf("\n","\t");
			
		}
		
		leitor.close();

	}

}
