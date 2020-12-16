package exercicios2POO;

import java.util.Scanner;

public class TestaVendedor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Vendedor vendedor = new Vendedor();
		System.out.println("Olá, digite o seu nome: ");
		vendedor.nome = leia.next();
		vendedor.setNome(vendedor.nome);
		System.out.println("Informe o valor de vendas: ");
		vendedor.valorVendas = leia.nextDouble();
		vendedor.setValorVendas(vendedor.valorVendas);
		System.out.println("Informe a sua comissão: ");
		vendedor.comissao = leia.nextDouble();
		vendedor.setComissao(vendedor.comissao);
		
		System.out.printf("Salário com comissão: R$ %.2f",vendedor.retornaComissao(vendedor.getValorVendas(), vendedor.getComissao()));
		
		
		
		leia.close();

	}

}
