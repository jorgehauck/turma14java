package exercicios2POO;

public class Fornecedor extends Pessoa {

	protected double valorCredito;
	protected double valorDivida;
	
	public Fornecedor(String endereco, String telefone)
    {
    	this.endereco = endereco;
    	this.telefone = telefone;
    }
    
    public Fornecedor(String nome)
    {
    	this.nome = nome;
    }
	
    public double obterSaldo(double valorCredito, double valorDivida)
    {
    	double diferenca;
    	diferenca = this.valorCredito - this.valorDivida;
    	return diferenca;
    }
	
    public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	
}
