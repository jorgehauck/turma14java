package exemplos;

import java.util.Scanner;

public class TestaProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		double preco = 0;
		int quantidade;
		
		System.out.println("Digite o nome do produto: ");
		nome = sc.nextLine();
		System.out.println("Digite o preço: ");
		preco = sc.nextDouble();
		System.out.println("Digite a quantidade em estoque: ");
		quantidade = sc.nextInt();
		Produto prod = new Produto(nome, preco, quantidade);
		prod.valorTotal(preco);
		
		System.out.println("Nome: "+nome+" Preço: "+ prod.getPreco() +" Quantidade: "+ prod.getQuantidade());
		System.out.println("\nDigite a quantidade que deseja remover do estoque: ");
		quantidade = sc.nextInt();
		prod.removerProdutos(quantidade);
		System.out.println("Nome: "+nome+" Preço: "+ prod.getPreco() +" Quantidade: "+ prod.getQuantidade());
		
		System.out.println("Nome: "+nome+" Preço: "+ prod.valorTotal(preco) +" Quantidade: "+ prod.getQuantidade());
		
		

	}

}
