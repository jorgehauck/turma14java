import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int tempoDias, dias, mes, ano;
		System.out.println("Digite o tempo em dias: ");
		tempoDias = leia.nextInt();
		
		ano = (tempoDias / 365);
		mes = ((tempoDias % 365)/30);
		dias = ((tempoDias%365)%30);	
		
		System.out.println("Você viveu " + ano + " anos e " + mes + " meses e " + dias +  " dias.");
		
		
		leia.close();

	}

}
