package loja;

public class Produto {
	protected String nomeProduto;
	protected String codigo;
	protected double precoUnitario;
	protected int qtdeProdutoEstoque;

	public Produto(String codigo, String nomeProduto, double precoUnitario, int qtdeProdutoEstoque)
	{
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}


	public Produto(String nomeProduto, String codigo, double precoUnitario) 
	{
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}

	public void tiraEstoque(int saida)
	{
        if(testarEstoque(saida))
        {
		this.qtdeProdutoEstoque -= saida;
        }
        else
        {
        	System.out.println("ESTOQUE INDISPONÍVEL!!!");
        }
	}

	public void adicionaEstoque(int entrada)
	{

		this.qtdeProdutoEstoque += entrada;
	}

	public boolean testarEstoque(int valor)
	{
		if(valor > this.qtdeProdutoEstoque)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public double venda(int qtdeVendida)
	{
		tiraEstoque(qtdeVendida);
		return qtdeVendida * this.precoUnitario;
	}



}
