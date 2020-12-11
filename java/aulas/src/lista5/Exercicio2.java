package lista5;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    double IMC, peso, altura;
	    
	    System.out.println("Informe a seu peso: ");
	    peso = leia.nextDouble();
	    System.out.println("Informe a sua altura: ");
	    altura = leia.nextDouble();
	    
	    IMC = peso / Math.pow(altura, 2);
	   
	    
	    if(IMC < 18.5)
	    {
	    	System.out.println("Abaixo do peso");
	    }
	    else if(IMC > 18.5 || IMC <=25)
	    {
	    	System.out.println("Peso normal");
	    }
	    else if(IMC > 25 || IMC <=30)
	    {
	    	System.out.println("Acima do peso");
	    }
	    else
	    {
	    	System.out.println("Obeso");
	    }
	    
	    leia.close();

	}

}
