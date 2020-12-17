package desafio;

public class TesteFunc {

	public static void main(String[] args)
	{
	 
		Funcionario normal = new Funcionario("JOÃO",44,10.00);
        Terceiro folguista = new Terceiro("Maria",20,10.00,50.25);
        
        System.out.printf("O funcionário %s recebe de salário: R$ %.2f\n",normal.getNome());
        System.out.printf("O funcionário %s recebe de salário: R$ %.2f\n",folguista.getNome());
	}

}
