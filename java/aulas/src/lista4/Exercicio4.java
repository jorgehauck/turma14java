package lista4;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		
		for(int linha = 0; linha < 3; linha++)
		{
			for(int coluna = 0; coluna < 3; coluna++)
			{
				System.out.println("Digite os elementos da Matriz: ["+linha+"]"+"["+coluna+"]");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		for(int linha = 0; linha < 3; linha++)
		{
			for(int coluna = 0; coluna < 3; coluna++)
			{
				if(linha == coluna)
				{
					System.out.println(matriz[linha][coluna]);
				}
			}
			System.out.println();
		}
		
		leia.close();

	}

}
