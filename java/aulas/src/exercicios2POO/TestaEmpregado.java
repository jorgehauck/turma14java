package exercicios2POO;
import java.util.Scanner;
public class TestaEmpregado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		System.out.println("Informe o seu endereço: ");
		empregado.endereco = leia.next();
		
		System.out.println("Digite o seu nome: ");
		empregado.nome = leia.next();
		empregado.setNome(empregado.nome);
		
		System.out.println("Informe o seu código: ");
		empregado.codigoSetor = leia.nextInt();
		
		empregado.setCodigoSetor(empregado.codigoSetor);
		System.out.println("Informe o seu salário base: ");
		empregado.salarioBase = leia.nextDouble();
		
		empregado.setSalarioBase(empregado.salarioBase);
		System.out.println("Informe a alíquota do imposto: ");
		empregado.imposto = leia.nextDouble();
		empregado.setImposto(empregado.imposto);
		System.out.println("\nOlá, "+empregado.getNome());
		System.out.printf("Seu novo salário líquido após retenção de impostos é de R$ %.2f",empregado.calcularSalario(empregado.getSalarioBase(), empregado.getImposto()));
		System.out.println("\nEndereço: "+empregado.getEndereco());
		
		
		leia.close();
	}

}
