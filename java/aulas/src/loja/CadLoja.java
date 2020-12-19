package loja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class CadLoja {

	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    String nome = "";
	    char genero = 0;
	    int anoNascimento = 0,cpf;
	    String codigo;
	    int qtde;
	    int formaPagamento;
	    double precoTotal = 0;
	    double parcelas = 0;
		Collection<Produto> produto = new ArrayList<>();
		produto.add(new Produto("JJ-01","NOTEBOOK      ",1500,10));
		produto.add(new Produto("JJ-02","CARREGADOR    ",1500,10));
		produto.add(new Produto("JJ-03","WEBCAM        ",1500,10));
		produto.add(new Produto("JJ-04","IMPRESSORA    ",1500,10));
		produto.add(new Produto("JJ-05","PLACA MÃE     ",1500,10));
		produto.add(new Produto("JJ-06","PLACE DE VIDEO",1500,10));
		produto.add(new Produto("JJ-08","MOUSE         ",1500,10));
		produto.add(new Produto("JJ-09","PENDRIVE 32GB ",1500,10));
		produto.add(new Produto("JJ-10","HD SSD 240GB  ",1500,10));
		
		System.out.println("════════════════════════════════════════════════");
		System.out.println("\t\tJJ INFORMÁTICA");
		System.out.println("════════════════════════════════════════════════");
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite o seu CPF: ");
		cpf = leia.nextInt();
		System.out.println("Informe o seu sexo: [M/F]");
		genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Informe o seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		Cliente c = new Cliente(nome,genero,anoNascimento);
		System.out.println("Idade: "+c.voltaIdade(2020));
		System.out.printf("CÓDIGO\tPRODUTO\t\t\tPREÇO\t\tQTDE\n");
		for(Produto prod: produto)
		{
			
			System.out.printf("%s \t %s \t %.2f \t %d \t \n",prod.getCodigo(),prod.getNomeProduto(),prod.getPrecoUnitario(),prod.getQtdeProdutoEstoque());
		}

		System.out.println("INFORME O CÓDIGO DO PRODUTO: ");
		codigo = leia.next().toUpperCase();
		System.out.println("DESEJA QUANTAS UNIDADES?");
		qtde = leia.nextInt();
		
		for(Produto prod : produto)
		{
			if(codigo.equals(prod.getCodigo()))
			{
				
				System.out.print(prod.getNomeProduto());
				System.out.printf("  %.2f",prod.getPrecoUnitario());
				precoTotal = prod.getPrecoUnitario() * qtde;
				System.out.printf("PREÇO TOTAL R$ %.2f",precoTotal);	
			}
		}
	    
		System.out.println("[1] - PAGAMENTO A VISTA - 10%");
		System.out.println("[2] - DEBITO - VALOR SIMPLES");
		System.out.println("[3] - CREDITO COM 5% A MAIS");
		System.out.println("[4] - CREDITO [ATÉ 3 VEZES] COM JUROS DE 10%");
		formaPagamento = leia.nextInt();
		
		if(formaPagamento == 1)
		{
			precoTotal -= precoTotal * 0.10;
			System.out.printf("PAGAMENTO À VISTA");
			System.out.printf("PREÇO TOTAL R$ %.2f\n",precoTotal);
		}
		else if(formaPagamento == 2)
		{
			precoTotal = precoTotal;
			System.out.println("DEBITO - VALOR SIMPLES");
			System.out.printf("PREÇO TOTAL R$ %.2f\n",precoTotal);
		}
		else if(formaPagamento == 3)
		{
			precoTotal = precoTotal * 1.05;
			System.out.println("CREDITO COM 5% A MAIS");
			System.out.printf("PREÇO TOTAL R$ %.2f\n",precoTotal);
		}
		else if(formaPagamento == 4)
		{
			precoTotal+= precoTotal * 0.10;
			parcelas = precoTotal / 3;
			System.out.println("CREDITO [ATÉ 3 VEZES] COM JUROS DE 10%");
			System.out.printf("PREÇO TOTAL DAS PARCELAS R$ %.2f\n",parcelas);
			
		}
		System.out.println("VALOR DOS IMPOSTOS: "+precoTotal * 0.09);

	}
}
