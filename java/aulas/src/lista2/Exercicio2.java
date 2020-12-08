package lista2;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int codigo;
		int N;
		System.out.print("Informe o seu código: ");
		codigo = leitor.nextInt();
		System.out.print("Informe o número de horas trabalhadas: ");
		N = leitor.nextInt();
		
		retornaSalario(N);
		
		
		leitor.close();

	}
	
	static double retornaSalario(int N)
	{
		double horasTrabalhadas = 10.00, horasExcedente = 20.00, salarioTotal = 0.0, E, total = 0.0;
		if(N <= 50)
		{
		   	salarioTotal = horasTrabalhadas * N;
		   	System.out.printf("O seu salário é de: R$ %.2f ",salarioTotal);
		}
		else if(N > 50)
		{
			E = N - 50;
			salarioTotal = E * horasExcedente;
			total = 500 + salarioTotal;
			System.out.printf("O seu salário é de: R$%.2f",total);
		}
		return N;
	}

}
