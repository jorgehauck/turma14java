package objeto;

import java.util.Scanner;

public class TestaProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Produto vestido = new Produto();
		Produto blusa = new Produto();
		Produto camiseta = new Produto();
		Pessoa  cliente = new Pessoa();
		int produtoEscolhido = 0;
		
		vestido.valorUnitario = 100.00;
		blusa.valorUnitario = 50.00;
		camiseta.valorUnitario = 20.00;
		
		vestido.qtdeEstoque = 3;
		blusa.qtdeEstoque = 1;
		camiseta.qtdeEstoque = 20;
		
		
		System.out.println("Digite o seu nome: ");
		cliente.nome = leia.next();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		System.out.printf("PRODUTOS DISPONÍVEIS:", vestido.nomeProduto, blusa.nomeProduto, camiseta.nomeProduto);
	    
		System.out.println("VALOR");
		System.out.println("QUANTIDADE ESTOQUE");
		System.out.printf("PRODUTO");
		System.out.println("PRODUTO ESCOLHIDO: ");
		//if(produtoEscolhido <   )

		

	}

}
