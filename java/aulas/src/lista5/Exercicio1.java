package lista5;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double precoEtiqueta, precoReajustado, calculo;
		int condicaoPagamento;
		System.out.println("Informe o pre�o de etiqueta do produto: ");
		precoEtiqueta = leia.nextDouble();
		System.out.println("SELECIONE A FORMA DE PAGAMENTO");
		System.out.println("[1] - � vista em dinheiro ou cheque, recebe 20% de desconto");
		System.out.println("[2] - � vista no cart�o de cr�dito, recebe 15% de desconto");
		System.out.println("[3] - Em duas vezes, pre�o normal de etiqueta sem juros");
		System.out.println("[4] - Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%");
		condicaoPagamento = leia.nextInt();
		switch(condicaoPagamento)
		{
		case 1:
			precoReajustado = precoEtiqueta * 0.20;
			calculo = precoEtiqueta - precoReajustado;
			System.out.printf("Total da compra � vista R$:%.2f ",calculo);
			break;
		case 2:
			precoReajustado = precoEtiqueta * 0.15;
			calculo = precoEtiqueta - precoReajustado;
			System.out.printf("Total da compra � vista no cart�o de cr�dito R$:%.2f",calculo);
			break;
		case 3:
			calculo = precoEtiqueta  / 2;
			System.out.printf("Total da compra em parcelas de 2x: R$%.2f",calculo);
			break;
		case 4:
			precoReajustado = precoEtiqueta * 0.10;
			calculo = (precoReajustado + precoEtiqueta) / 2;
			System.out.printf("Total da compra em parcelas de 3x: R$%.2f",calculo);
			break;
		}
		
		
		leia.close();

	}

}
