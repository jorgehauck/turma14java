import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int segundosUsuario, horasResultado, minutosResultado, segundosResultado;
		System.out.println("Digite a quantidade de segundos do evento: ");
		segundosUsuario = sc.nextInt();
		
		horasResultado = segundosUsuario/3600;
		minutosResultado = (segundosUsuario%3600)/60;
		segundosResultado = (segundosUsuario%3600)%60;
		System.out.println("Você tem "+horasResultado+" hora(s)+ "+minutosResultado+" minuto(s) e "+segundosResultado+" segundo(s) do evento.");
		sc.close();
	}

}
