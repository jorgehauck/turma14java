package exerciciosPOO;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o seu nome: ");
		funcionario.nome = leia.next();
		System.out.println("Olá, "+funcionario.nome+"informe o seu salário:" );
		funcionario.salario = leia.nextDouble();
		
		funcionario.recebeSalario(funcionario.salario);

	}

}
