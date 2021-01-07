package udemy;

public class Employee {
	private Integer id;
	private String nome;
	private Double salario;
	
	
	public Employee(Integer id, String nome, Double salario)
	{
		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return nome;
	}


	public void setName(String name) {
		this.nome = name;
	}


	public double getSalary() {
		return salario;
	}

	public void increaseSalary(double percentage)
	{
		this.salario+= this.salario * percentage / 100.0;
		
	}
	
	
	@Override
	
	public String toString() // classe Object classe mãe do java
	{
		String resultado;
		resultado = this.id+", "+this.nome+", "+String.format("%.2f", this.salario);
		return resultado;
	}
		
	
}
