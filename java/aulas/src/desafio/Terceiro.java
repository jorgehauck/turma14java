package desafio;

public class Terceiro extends Funcionario {
     private double valorTerceiro;

     
     
     
     public Terceiro(String nome, int horasMensais, double valorHora, double valorTerceiro) {
		super(nome, horasMensais, valorHora);
		this.valorTerceiro = valorTerceiro;
	}

	public double getValorTerceiro() {
		return valorTerceiro;
	}

	public void setValorTerceiro(double valorTerceiro) {
		this.valorTerceiro = valorTerceiro;
	}
     
	@Override 

    public double pagamentoSalario(int valorHora, int horasMensais)
    {
  	  double salario;
  	  salario = horasMensais * valorHora + valorTerceiro;
  	  return salario;
    
    }
    
}
