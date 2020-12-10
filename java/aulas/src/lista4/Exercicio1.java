package lista4;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valores[] = new int[5];
		int maior = -1;
		
		for(int i = 0; i<5; i++)
		{
		   System.out.print("Digite o "+(i+1)+"º valor: ");
		   valores[i] = leia.nextInt();
		}
		for(int i = 0; i<5; i++)
		{
			if(valores[i] > maior)
			{
				maior = valores[i];
			}
		}
		System.out.println();
		System.out.print("O maior número é de: "+maior);
		
		
		leia.close();

	}

}
