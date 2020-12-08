package lista2;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner (System.in);
		double Peso;
		System.out.print("Digite o peso dos tomates: ");
		Peso = leitor.nextDouble();
		
		retornaPeso(Peso);
		
		
		
		leitor.close();

	}
	  static double retornaPeso(double Peso)
	{
		double E, M = 0.0;
		if(Peso > 50) {
			E = Peso - 50;
			M = E * 4.00;
			System.out.print("Sr. João, você passou do limite "
					+ "estabelecido dessa "
					+ "forma sua multa será de R$: "+M+" reais");
		}
		else {
			E = 0;
			M = 0;
			System.out.println(E);
			System.out.println(M);
		}
		
		return M;
		
	}

}
