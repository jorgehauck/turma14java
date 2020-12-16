package exercicios2POO;
import java.util.Scanner;
public class TestaFornecedor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Fornecedor fornecedor = new Fornecedor("R.XPTO","11-55733954");
		System.out.println("Informe o valor do crédito: ");
		fornecedor.valorCredito = leia.nextDouble();
		fornecedor.setValorCredito(fornecedor.valorCredito);
		System.out.println("Informe o valor da dívida: ");
		fornecedor.valorDivida = leia.nextDouble();
		fornecedor.setValorDivida(fornecedor.valorDivida);
		
		System.out.printf("SALDO ATUAL: %.2f",fornecedor.obterSaldo(fornecedor.valorCredito, fornecedor.valorDivida));
		
		leia.close();

	}

}
