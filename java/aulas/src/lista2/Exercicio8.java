package lista2;
import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int N;
        System.out.print("Digite um número: ");
        N = leia.nextInt();
        retornaMaior(N);
        
        leia.close();
	}
	
	static int retornaMaior(int N)
	{
		if(N > 100)
		{
		    System.out.print(N);	
		}
		else
		{
			N = 0;
			System.out.print(N);
		}
		return N;
	}

}
