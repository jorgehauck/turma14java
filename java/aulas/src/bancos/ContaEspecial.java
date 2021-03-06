package bancos;

public class ContaEspecial extends ContaCorrente {
	private double valorLimite;
	private double valorCadastroLimite;

	public ContaEspecial(int numeroConta, double valorLimite) {
		super(numeroConta);
		this.valorLimite = valorLimite;
		registraLimite();
	}

	public ContaEspecial(int numeroConta, String cpf, double valorLimite) {
		super(numeroConta, cpf);
		this.valorLimite = valorLimite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
		registraLimite();
	}

	public double getValorCadastroLimite() {
		return valorCadastroLimite;
	}

	@Override
	public boolean testarSaldo(double valor) {

		boolean teste;
		if (valor <= 0) {
			teste = false;
		}

		else if (valor <= super.getSaldo()) {
			teste = true;
		} else if (valor <= this.valorLimite + super.getSaldo()) {
			double valorCredito = valor - super.getSaldo();
			credito(valorCredito);
			this.valorLimite = this.valorLimite - valorCredito;
			System.out.println("limite atual � R$" + this.valorLimite);
			System.out.println("Saldo atual da conta � R$" + super.getSaldo());
			teste = true;
		}

		else {
			teste = false;
		}
		return teste;
	}

	public void registraLimite() {

		if (valorLimite < 0) {
			System.err.println("Valor zerado, impossivel realizar");
		} else {
			this.valorCadastroLimite = this.valorLimite;
		}
	}

	@Override
	public void credito(double valorCredito) {

		if (valorCredito <= 0) {
			System.out.println("Valor de cr�dito inv�lido!");
		} else if (this.valorLimite < this.valorCadastroLimite) {
			double diferenca = this.valorCadastroLimite - this.valorLimite;
			this.valorLimite += diferenca;
			this.saldo = this.saldo + valorCredito - diferenca;
			System.out.printf("Valor R$ %.2f creditado!\n", valorCredito);

		} else {
			this.saldo = this.saldo + valorCredito;
			System.out.printf("Valor R$ %.2f creditado!\n", valorCredito);

		}
	}

}