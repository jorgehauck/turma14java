import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double A, B, C, D, R, S;
		System.out.println("Digite o primeiro n�mero: ");
		A = leia.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		B = leia.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		C = leia.nextDouble();
		
		
		R = Math.pow(A + B, 2);
		S = Math.pow(B + C, 2);
		D = (R + S) / 2;
		
		System.out.printf("O valor de D �: %.2f ",D);
		
		
		
		
		leia.close();

	}

}
