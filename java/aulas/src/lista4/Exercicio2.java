package lista4;
import java.util.Random;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random sorteio = new Random();
		
		int lancamento[] = new int[10];
		double media = 0.0, soma = 0.0;
		int maiorPosicao = 0, maior = 0;
		
		for(int i = 0; i<10; i++)
		{
			lancamento[i] = sorteio.nextInt(6)+1;
			System.out.print("\nLançamento: "+lancamento[i]);
			
			soma = lancamento[i] + soma;
			if(lancamento[i] > maior)
			{
				maior = lancamento[i];
			}
		}
		
		for(int i=0; i<10; i++)
		{
			if(lancamento[i] == maior)
			{
				maiorPosicao++;
			}
		}
		System.out.print("\nA média das jogadas foi de: "+soma/10);
		System.out.print("\nO maior número foi: "+maior);
		System.out.print("\nA quantidade de vezes foi de: "+maiorPosicao);
		
		
		leia.close();

	}

}
