package exercicios2POO;
import java.util.Scanner;
public class TestaEmpregado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		System.out.println("Informe o seu endere�o: ");
		empregado.endereco = leia.next();
		
		System.out.println("Digite o seu nome: ");
		empregado.nome = leia.next();
		empregado.setNome(empregado.nome);
		
		System.out.println("Informe o seu c�digo: ");
		empregado.codigoSetor = leia.nextInt();
		
		empregado.setCodigoSetor(empregado.codigoSetor);
		System.out.println("Informe o seu sal�rio base: ");
		empregado.salarioBase = leia.nextDouble();
		
		empregado.setSalarioBase(empregado.salarioBase);
		System.out.println("Informe a al�quota do imposto: ");
		empregado.imposto = leia.nextDouble();
		empregado.setImposto(empregado.imposto);
		System.out.println("\nOl�, "+empregado.getNome());
		System.out.printf("Seu novo sal�rio l�quido ap�s reten��o de impostos � de R$ %.2f",empregado.calcularSalario(empregado.getSalarioBase(), empregado.getImposto()));
		System.out.println("\nEndere�o: "+empregado.getEndereco());
		
		
		leia.close();
	}

}
