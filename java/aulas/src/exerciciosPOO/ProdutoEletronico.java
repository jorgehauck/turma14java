package exerciciosPOO;

public class ProdutoEletronico {
     public String nomeProduto;
     public double preco;
     public int quantidade;
     
     
     
     
     public void retornarTotalCompra(int quantidade, double preco)
     {
    	 double total;
    	 total = this.quantidade * this.preco;
    	 System.out.printf("COMPRA TOTAL R$ %.2f",total);
    	
     }
		
}
