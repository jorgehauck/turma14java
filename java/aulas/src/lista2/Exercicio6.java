package lista2;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.print("Informe a sua idade para a classifica��o: ");
		idade = leia.nextInt();
		classificacao(idade);
		
		
		
		leia.close();

	}
	static void classificacao(int idade)
	{
		if(idade < 5) {
	        System.out.print("Infelizmente voc� ainda n�o pode participar!");
		}
		else if(idade <= 5 || idade <= 7) {
			System.out.print("Infantil A");
		}
		else if(idade <= 8 || idade <=11) {
			System.out.print("Infantil B");
		}
		else if(idade <=12 || idade <=13) {
			System.out.print("Juvenil A");
		}
		else if(idade <=14 || idade <=17) {
			System.out.println("Juvenil B");
		}
		else {
			System.out.println("Adultos");
		}
		
	}

}
