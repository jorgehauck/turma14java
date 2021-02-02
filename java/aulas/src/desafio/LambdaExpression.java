package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.println("Digite quantos funcionários serão cadastrados");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			System.out.println("Informe o ID: ");
			int id = sc.nextInt();
			System.out.println((i+1)+"º funcionário");
			sc.nextLine();
			System.out.println("Digite o seu nome");
			String nome = sc.nextLine();
			System.out.println("Digite a sua idade: ");
			int idade = sc.nextInt();
			System.out.println("Informe o seu salário: ");
			double salario = sc.nextDouble();
			System.out.println("Informe o seu telefone: ");
			String telefone = sc.next();
			lista.add(new Pessoa(id, nome, idade, salario, telefone));
			
		}
		System.out.println("Informe o id do funcionário que terá reajuste");
		int id = sc.nextInt();
		
		Pessoa p = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(p == null)
		{
			System.out.println("Id não existe!");
		}
		
		else
		{
			System.out.println("Entre com a porcentagem do salario");
			double porcentagem = sc.nextDouble();
			p.reajustaSalario(porcentagem);
		}
	
		System.out.println("Lista dos funcionários");
		for(Pessoa o: lista)
		{
			System.out.println(o);
		}
		sc.close();

	}

}
