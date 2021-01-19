import java.util.ArrayList;
import java.util.Scanner;

public class TestaCadastro {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n, idade;
		String nome, endereco;
		ArrayList<Cadastro> cadastros = new ArrayList<>();
		

		System.out.println("Quantas pessoas serão cadastradas? ");
		n = sc.nextInt();
		for(int x = 0; x<n; x++)
		{
			sc.nextLine();
			System.out.print("Nome da "+(x+1)+"° pessoa: ");
			nome = sc.nextLine();
			System.out.print("Informe a sua idade: ");
			idade = sc.nextInt();
			System.out.print("Informe o seu endereço: ");
			sc.nextLine();
			endereco = sc.nextLine();
			cadastros.add(new Cadastro(nome, idade, endereco));
		}
		System.out.println("Lista de Cadastros!");

		for(Cadastro cad : cadastros)
		{
			System.out.println(cad);
		}

		System.out.println("Informe pelo nome para remover");
		nome = sc.next();

		/*
		for(int i = 0; i < cadastros.size(); i++)
		{
			Cadastro p = cadastros.get(i);


			if(p.getNome().equals(nome))
			{

				cadastros.remove(cadastros.indexOf(p));
				break;
			}

		}
		*/
		for(Cadastro cad : cadastros)
		{
			if(cad.getNome().equals(nome))
			{
				cadastros.remove(cadastros.indexOf(cad));
				
			}
		}
		System.out.println("Cadastro Atualizado!");
		for(Cadastro cad: cadastros)
		{
			System.out.println(cad); 
		}

	}


}
