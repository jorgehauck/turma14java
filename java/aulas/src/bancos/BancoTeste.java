package bancos;
import java.util.Scanner;
public class BancoTeste {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);

		char op;//visivel em todo o programa - escopo
		char saida;
		int numeroConta=0; //escopo global

		System.out.println("BANCO DO ED!!!");
		do
		{
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = leia.next().charAt(0);
			if (op == '1')
			{
				System.out.println("1 - Conta Poupança");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua opção: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				switch (opconta)
				{
				case '1':
				{
					System.out.println("Digite a data de aniversario da conta: ");
					int dataAniversario = leia.nextInt();
					ContaPoupanca poupanca = new ContaPoupanca(numeroConta,cpfConta,dataAniversario);
				}
				break;	


				case '2':
					System.out.println("Digite o número da conta: ");
					numeroConta = leia.nextInt();
					ContaCorrente corrente = new ContaCorrente(numeroConta);
					break;

				case '3': 
					System.out.println("Digite o número da conta: ");
					numeroConta = leia.nextInt();
					ContaEspecial especial = new ContaEspecial(numeroConta);
					break;
				case '4':
					System.out.println("Digite o número da conta: ");
					numeroConta = leia.nextInt();
					ContaEmpresa empresa = new ContaEmpresa(numeroConta);
					break;
				case '5':
					System.out.println("Digite o número da conta: ");
					numeroConta = leia.nextInt();
					ContaUniversitaria universitaria = new ContaUniversitaria(numeroConta,"123.678.675-67");
					break;
				}



			}
			else if (op == '2')
			{
				System.out.println("wip");
			}
			else
			{

			}
			System.out.println("Continua S/N");
			saida = leia.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				break;
			}

		} while(true);

	}
}