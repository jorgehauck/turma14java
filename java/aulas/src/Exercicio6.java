import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double x1, y1, x2, y2, d;
		System.out.println("Digite os valores de X1 e Y1: ");
		x1 = leia.nextDouble(); 
		y1 = leia.nextDouble();
		System.out.println("Digite os valores de X2 e Y2: ");
		x2 = leia.nextDouble();
		y2 = leia.nextDouble();
		
		d = Math.sqrt((Math.pow(x2 + x1, 2)) + Math.pow(y2 + y1,2));
		
		System.out.printf("A distância entre os pontos é de: %.2f",d);
		leia.close();

	}

}
