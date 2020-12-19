package loja;

import java.util.Calendar;

public abstract  class Pessoa {
	protected String nome;
	protected char genero;
	protected int anoNascimento;


   public Pessoa(String nome, char genero, int anoNascimento)
   {
	   this.nome = nome;
	   this.genero = genero;
	   this.anoNascimento = anoNascimento;
   }


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	/*public int voltaIdade()
	{
		if(this.anoNascimento <= 1900)
		{
			System.out.println("DADOS INVÁLIDOS!!!");
			return 0;
		}
		else
		{
			return 2020 - this.anoNascimento;
		}
	}
*/

	public int voltaIdade(int anoAtual)
	{
		
		return anoAtual - this.anoNascimento;
	}


}
