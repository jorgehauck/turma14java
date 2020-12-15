package exerciciosPOO;

public class Funcionario {
    public String nome;
    public double salario;
    
    
    public void recebeSalario(double salario)
    {
    	double calculo, reajuste;
    	if(this.salario < 1000)
    	{
    		reajuste = salario * 0.10;
    		calculo = reajuste + salario;
    		System.out.printf("Seu novo salário reajustado é de R$ %.2f",calculo);
    	}
    	else if(this.salario >= 1000 && this.salario < 2000)
    	{
    		reajuste = salario * 0.20;
    		calculo = reajuste + salario;
    		System.out.printf("Seu novo salário reajustado é de R$ %.2f",calculo);
    	}
    	else
    	{
    		reajuste = salario * 0.09;
    		calculo = reajuste + salario;
    		System.out.printf("Seu novo salário reajustado é de R$ %.2f",calculo);
    	}
    }
    
}
