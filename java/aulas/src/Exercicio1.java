import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int temposAnos, ano, mes, dia;
		System.out.println("Digite o ano do seu nascimento: ");
		ano = leia.nextInt();
		System.out.println("Digite o mês do seu nascimento: ");
		mes = leia.nextInt();
		System.out.println("Digite o dia do seu nascimento: ");
		dia = leia.nextInt();
		
		temposAnos = (ano*365) + (mes*30) + dia;
		System.out.println("Você viveu "+temposAnos+" dias.");
		
		
		
		
		
		leia.close();

	}

}
