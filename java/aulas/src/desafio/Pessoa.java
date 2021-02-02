package desafio;

public class Pessoa {
	
	private int id;
	private String nome;
	private int idade;
	private double salario;
	private String telefone;
	
	
	public Pessoa(int id, String nome, int idade, double salario, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.telefone = telefone;
		
	}


	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public double reajustaSalario(double porcentagem)
	{
		return this.salario+= this.salario * porcentagem / 100.0;
	}
	
	
	@Override
	public String toString()
	{
		return "id: "+this.id+" nome: "+this.nome+" Salário novo: "+String.format("%.2f", this.salario)+" telefone: "+this.telefone;
	}

	
}
