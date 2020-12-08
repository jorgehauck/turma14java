package desafio;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int dataNascimento;
		System.out.println("Digite o seu ano de nascimento: ");
		dataNascimento = leia.nextInt();
		System.out.println("A sua idade é de: "+idade(dataNascimento)+" anos.");
		
		
		leia.close();
	}
	
	static int idade(int dataNascimento) {
		 int calculo;
		 calculo = 2020 - dataNascimento;
		 return calculo;
	}

}
