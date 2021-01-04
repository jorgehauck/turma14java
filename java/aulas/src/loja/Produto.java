package loja;

public class Produto {
	protected String nomeProduto;
	protected String codigo;
	protected double precoUnitario;
	protected int qtdeProdutoEstoque;
	protected int qtdeVendas;

	public Produto() {}
	
	public Produto(String codigo, String nomeProduto, double precoUnitario, int qtdeProdutoEstoque)
	{
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
		
	}
	
	
	public Produto(String nomeProduto, String codigo, double precoUnitario) 
	{
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
	}
	
	public Produto(String codigo, String nomeProduto, int qtdeVendas, double precoUnitario)
	{
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.qtdeVendas = qtdeVendas;
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
	
	public int getQtdeVendas() {
		return qtdeVendas;
	}

	public void setQtdeVendas(int qtdeVendas) {
		this.qtdeVendas = qtdeVendas;
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

	/*
	public String toString()
	{
		return "PRODUTO: "+this.nomeProduto+"PREÇO TOTAL R$ "+String.format("%2.f", this.precoUnitario);
	}
	*/

}
