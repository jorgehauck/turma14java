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
	   System.out.println("Informe o seu sal�rio: ");
	   salario = sc.nextDouble();
	   fun.setSalario(salario);
	   System.out.println("Informe o seu endere�o: ");
	   sc.nextLine();
	   endereco = sc.nextLine();
	   fun.setEndereco(endereco);
	   System.out.println("Insira a porcentagem para aumento de sal�rio: ");
	   porcentagem = sc.nextDouble();
	   fun.reajustarSalario(porcentagem);
	    System.out.println("Ol�, "+fun.getNome()+", seu novo sal�rio � de R$ "+fun.getSalario()+
			   ", endere�o: "+fun.getEndereco());
	   
	}

}
