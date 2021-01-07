package exemplos;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    Funcionario fun = new Funcionario();
	    String nome, endereco;
	    double salario, porcentagem, calculo;
	   
	   System.out.println("Digite o seu nome: ");
	   nome = sc.nextLine();
	   fun.setNome(nome);
	   System.out.println("Informe o seu salário: ");
	   salario = sc.nextDouble();
	   fun.setSalario(salario);
	   System.out.println("Informe o seu endereço: ");
	   sc.nextLine();
	   endereco = sc.nextLine();
	   fun.setEndereco(endereco);
	   System.out.println("Insira a porcentagem para aumento de salário: ");
	   porcentagem = sc.nextDouble();
	   fun.reajustarSalario(porcentagem);
	    System.out.println("Olá, "+fun.getNome()+", seu novo salário é de R$ "+fun.getSalario()+
			   ", endereço: "+fun.getEndereco());
	   
	}

}
