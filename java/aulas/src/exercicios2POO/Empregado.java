package exercicios2POO;

public class Empregado extends Pessoa {
      protected int codigoSetor;
      protected double salarioBase;
      protected double imposto;
      
      
      public double calcularSalario(double salarioBase, double imposto)
      {
    	  double calculo, reajuste;
    	  reajuste = this.salarioBase * this.imposto / 100;
    	  calculo = this.salarioBase - reajuste;
    	  
    	  return calculo;
      }

      

	public int getCodigoSetor() {
		return codigoSetor;
	}


	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public double getImposto() {
		return imposto;
	}


	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
      
      
      
      
}
