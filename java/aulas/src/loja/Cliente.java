package loja;

public class Cliente extends Pessoa {
	protected String cpf;

	
	
	
	public Cliente(String nome, char genero, int anoNascimento, String cpf)
	{
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}

	public void corrigeCPF(String CPF)
	{
		this.cpf = CPF;
	}


}
