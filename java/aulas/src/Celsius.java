import java.util.Scanner;
public class Celsius {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double celsius, fahre;
		System.out.println("Informe a temperatura em Celsius: ");
		celsius = leitor.nextDouble();
		
		fahre = celsius * 9 / 5 + 32; 
		
		System.out.printf("A temperatura em Fahrenheit � de:%.2f ",fahre,"F�");
		
		leitor.close();

	}

}
