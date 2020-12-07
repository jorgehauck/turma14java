import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double custoFabrica, custoDistribuidor, custoImposto, custoConsumidor;
		System.out.println("Informe o custo de fábrica do carro: ");
		custoFabrica = leia.nextDouble();
		
		custoDistribuidor = 0.28 * custoFabrica;
		custoImposto = 0.45 * custoFabrica;
		custoConsumidor = custoFabrica + custoDistribuidor + custoImposto;
		System.out.printf("O custo total do seu carro é de: %.2f",custoConsumidor);
		
		
		leia.close();

	}

}
