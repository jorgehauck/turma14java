import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Digite o coeficiente A:");
		a = leia.nextDouble();
		System.out.println("Digite o coeficiente B:");
		b = leia.nextDouble();
		System.out.println("Digite o coeficiente C:");
		c = leia.nextDouble();
		System.out.println("Digite o coeficiente D:");
		d = leia.nextDouble();
		System.out.println("Digite o coeficiente E:");
		e = leia.nextDouble();
		System.out.println("Digite o coeficiente F:");
		f = leia.nextDouble();
		
		x = (c*e) - (b*f) / (a*e) - (b*d);
		y = (a*f) - (c*d) / (a*e) - (b*d);
		
		System.out.printf("Valor de X:%.2f",x);
		System.out.printf("\nValor de Y:%.2f",y);
		
		
		
		
		
		leia.close();

	}

}
