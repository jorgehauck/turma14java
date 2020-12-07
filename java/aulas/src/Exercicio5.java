import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double n1, n2, n3, media;
		
		System.out.printf("Informe a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.printf("Informe a segunda nota: ");
		n2 = leia.nextDouble();
		System.out.printf("Informe a terceira nota: ");
		n3 = leia.nextDouble();
		
		media = (n1 * 2) + (n2 * 3) + (n3 * 5) / 10;
		System.out.printf("O valor da média ponderada: %.2f ",media);
		
		
		
		leia.close();

	}

}
