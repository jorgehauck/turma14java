package lista5;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double precoEtiqueta, precoReajustado, calculo;
		int condicaoPagamento;
		System.out.println("Informe o preço de etiqueta do produto: ");
		precoEtiqueta = leia.nextDouble();
		System.out.println("SELECIONE A FORMA DE PAGAMENTO");
		System.out.println("[1] - À vista em dinheiro ou cheque, recebe 20% de desconto");
		System.out.println("[2] - À vista no cartão de crédito, recebe 15% de desconto");
		System.out.println("[3] - Em duas vezes, preço normal de etiqueta sem juros");
		System.out.println("[4] - Em três vezes, preço normal de etiqueta mais juros de 10%");
		condicaoPagamento = leia.nextInt();
		switch(condicaoPagamento)
		{
		case 1:
			precoReajustado = precoEtiqueta * 0.20;
			calculo = precoEtiqueta - precoReajustado;
			System.out.printf("Total da compra á vista R$:%.2f ",calculo);
			break;
		case 2:
			precoReajustado = precoEtiqueta * 0.15;
			calculo = precoEtiqueta - precoReajustado;
			System.out.printf("Total da compra á vista no cartão de crédito R$:%.2f",calculo);
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
