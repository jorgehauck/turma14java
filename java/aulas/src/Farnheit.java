import java.util.Scanner;
public class Farnheit {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double Fahrenheit;
		System.out.println("Informe a temperatura em Fahrenheit Fº: ");
		Fahrenheit = leitor.nextDouble();
		Fahrenheit = (Fahrenheit - 32) / 1.8;
		
		System.out.printf("A temperatura em Celsius é de:%.2f",Fahrenheit,"Cº");
		
		
		
		
		
		leitor.close();

	}

}
