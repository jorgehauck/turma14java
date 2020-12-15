package exerciciosPOO;

import java.util.Scanner;

public class TestaEletronico {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		ProdutoEletronico produtoEletronico = new ProdutoEletronico();
	    
		System.out.println("Digite a quantidade desejada: ");
		produtoEletronico.quantidade = leia.nextInt();
		System.out.println("Informe o preço do produto: ");
		produtoEletronico.preco = leia.nextDouble();
		
		produtoEletronico.retornarTotalCompra(produtoEletronico.quantidade, produtoEletronico.preco);
		
		
		
		

	}
	
	
	public void linha()
	{
		System.out.println("═════════════════════════════════════════════════════════");
	}

}
