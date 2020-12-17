package bancos;

public abstract class Conta {
   protected int numeroConta;
   protected double saldo;
   protected String cpf;
   
   public Conta()
   {
	   
   }
   public Conta(int numeroConta)
   {
	   this.numeroConta = numeroConta;
   }
   public Conta(int numeroConta, String cpf)
   {
	   this.numeroConta = numeroConta;
	   this.cpf = cpf;
   }
   
   public int getNumeroConta() {
		return numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	//METODOS
	public void debito(double valorDebito) 
	{
		if (testarSaldo(valorDebito))  
		{
			this.saldo = this.saldo - valorDebito;
		} 
		else
		{
			System.out.println("SALDO INDISPONIVEL");
		}
		
	}



	public void credito (double valorCredito) 
	{
		this.saldo = this.saldo + valorCredito;
	}

   
	
	
	public boolean testarSaldo(double valor)
   {
	   boolean teste;
	   if(valor <= this.saldo)
	   {
		   teste = true;
	   }
	   else
	   {
		   teste = false;
	   }
		   
	   return teste;
   }
   
}
