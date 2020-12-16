package exercicios2POO;

public class Vendedor extends Pessoa {
    protected double valorVendas;
    protected double comissao = 0.10;
    
    public double retornaComissao(double valorVendas, double comissao)
    {
    	double calculo, salario;
    	calculo = this.valorVendas * this.comissao;
    	salario = calculo - this.valorVendas;
    	return salario;
    }

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
    
    
	
}
