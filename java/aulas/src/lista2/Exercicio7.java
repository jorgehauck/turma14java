package lista2;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base, altura;
		System.out.print("Digite a base do tri�ngulo: ");
		base = leia.nextDouble();
		System.out.printf("Digite a altura do tri�ngulo: ");
		altura = leia.nextDouble();
		retornaAreaTriangulo(base,altura);
		
		
		
		
		leia.close();

	}
	
	static double retornaAreaTriangulo(double base, double altura)
	{
		double area;
		area = base * altura / 2.0;
		if(base < 0 || altura < 0)
		{
			System.out.print("VALORES INCORRETOS!");
		}
		else
		{
			System.out.printf("A �rea do tri�ngulo �: %.2f",area);
		}
		return area;
	}

}
