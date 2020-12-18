package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;



public class ListaProdutos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char op, decisaoAdicionar, decisaoRemover, decisaoSair;
		do
		{
		System.out.println("===============================");
    	System.out.println("[1] - Armazenar");
    	System.out.println("[2] - Remover ");
    	System.out.println("[3] - Exibir dados");
    	System.out.println("===============================");
		op = leia.next().toUpperCase().charAt(0);
		
		Collection<String> lista = new ArrayList();
		lista.add("Camisa");
		lista.add("Bon�");
		lista.add("T�nis");
		lista.add("�culos");
		lista.add("Terno");
		lista.add("Rel�gio");
		lista.add("L�pis");
		
		if(op == '1')
		{
			do
			{
				System.out.println("Digite os nomes dos produtos que deseja adicionar: ");
				lista.add(leia.next());
				System.out.println("Deseja continuar? [S/N]");
				decisaoAdicionar = leia.next().toUpperCase().charAt(0);
				System.out.printf("Produtos adicionados com sucesso!\n");
				System.out.println(lista);
			}while(decisaoAdicionar == 'S' && decisaoAdicionar != 'N');
		}
		
		else if(op == '2')
		{
			do
			{
			System.out.println(lista);
			System.out.println("Digite os produtos que deseja remover: \n");
			lista.remove(leia.next());
			System.out.println("\nProdutos removidos com sucesso!");
			System.out.println(lista);
			System.out.println("Deseja continuar? [S/N]");
			decisaoRemover = leia.next().toUpperCase().charAt(0);
			}while(decisaoRemover == 'S' && decisaoRemover != 'N');
		}
		
		else
		{
			System.out.println("Produtos dispon�veis: "+lista+"\n");	
		}
		System.out.println("Deseja retornar ao menu principal? [S/N]");
		decisaoSair = leia.next().toUpperCase().charAt(0);
		}while(decisaoSair =='S' && decisaoSair != 'N');
		
		
		
		
		

		leia.close();

	}

}
