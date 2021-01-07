package exemplos;

public class Funcionario {
	private String nome;
	private double salario;
	private String endereco;

	public Funcionario(){
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void reajustarSalario(double porcentagem)
	{
		this.salario+= this.salario * porcentagem / 100;
	}


}

