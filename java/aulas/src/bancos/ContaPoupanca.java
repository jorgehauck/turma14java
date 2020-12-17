package bancos;

public class ContaPoupanca extends Conta {
	
	private int dataAniversarioConta;
	
	
	public ContaPoupanca(int numeroConta, String cpf, int dataAniversario)
	{
		this.numeroConta = numeroConta;
		this.dataAniversarioConta = dataAniversario;
		this.cpf = cpf;
	}

	public int getDataAniversarioConta() {
		return dataAniversarioConta;
	}

	public void setDataAniversarioConta(int dataAniversarioConta) {
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
      public void correcaoPoupanca(int dataAtual) {
		
		if (dataAtual == this.dataAniversarioConta) {
			super.credito((super.getSaldo()*0.005));
			
			
			
		}
	}
   
   
      
      
}
