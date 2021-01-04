package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



public class CadLoja {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome = "";
		char genero = 0, decisao = 0, adicionarCarrinho;
		int anoNascimento = 0;
		String cpf;
		String codigo;
		int qtde, numeroNotaFiscal = 367800321, numeroCodigoBarras = 2020118700;
		int formaPagamento;
		double precoTotal = 0, subtotal;
		int tamanhoLinha = 80;

		List<Produto> carrinho = new ArrayList<>();
		List<Produto> listaProdutos = new ArrayList<>();

		listaProdutos.add(new Produto("JJ-01","NOTEBOOK",1500.00,10));
		listaProdutos.add(new Produto("JJ-02","CARREGADOR",1400.00,10));
		listaProdutos.add(new Produto("JJ-03","WEBCAM",1100.00,10));
		listaProdutos.add(new Produto("JJ-04","IMPRESSORA",1700.00,10));
		listaProdutos.add(new Produto("JJ-05","PLACA MÃE",1900.00,10));
		listaProdutos.add(new Produto("JJ-06","PLACE DE VIDEO",2900.00,10));
		listaProdutos.add(new Produto("JJ-08","MOUSE",1250.00,10));
		listaProdutos.add(new Produto("JJ-09","PENDRIVE 32GB",1000.00,10));
		listaProdutos.add(new Produto("JJ-10","HD SSD 950GB",1150.00,10));


		System.out.println("════════════════════════════════════════════════");
		System.out.println("\t\tJJ INFORMÁTICA®");
		System.out.println("════════════════════════════════════════════════");
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine().toUpperCase();
		System.out.println("Digite o seu CPF: ");
		cpf = leia.nextLine();
		System.out.println("Informe o seu sexo: [M/F]");
		genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Informe o seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		Cliente c = new Cliente(nome, genero, anoNascimento,cpf);
		System.out.println("Idade: "+c.voltaIdade(2020)+" anos.");
		System.out.println(retornaGenero(genero,nome));
		System.out.println();
		do
		{
		System.out.println("PRODUTOS DISPONÍVEIS EM NOSSA LOJA!");
		linha(50);
		listaProdutos(listaProdutos);
		System.out.println();
		linha(50);
		System.out.println("\n");
		System.out.printf("INFORME O CÓDIGO DO PRODUTO DESEJADO: ");
		leia.nextLine();
		codigo = leia.nextLine().toUpperCase();
		System.out.printf("INFORME A QUANTIDADE DESEJADA: ");
		qtde = leia.nextInt();

		
			for(Produto lista : listaProdutos)
			{
				if(codigo.equals(lista.getCodigo()) && qtde <= lista.getQtdeProdutoEstoque() && qtde > 0)
				{
					subtotal = lista.getPrecoUnitario() * qtde;
					System.out.printf("\nPRODUTO ESCOLHIDO: %s - PREÇO UNITÁRIO: R$ %.2f - TOTAL PARCIAL: R$ %.2f",lista.getNomeProduto(),
							lista.getPrecoUnitario(), subtotal);
					System.out.println("\nDESEJA ADICIONAR AO CARRINHO? [S] - SIM [N] - NÃO");
					adicionarCarrinho = leia.next().toUpperCase().charAt(0);

					if(adicionarCarrinho == 'S')
					{
						carrinho.add(new Produto(lista.getCodigo(), lista.getNomeProduto(),qtde,lista.getPrecoUnitario()));
						lista.tiraEstoque(qtde);
						precoTotal+=subtotal;
						System.out.printf("VALOR TOTAL DA COMPRA R$ %.2f",precoTotal);
						System.out.println();
						System.out.printf("\nDESEJA CONTINUAR COMPRANDO? [S/N]:");
						decisao = leia.next().toUpperCase().charAt(0);
					}
					else if(codigo.equals(lista.getCodigo()) && qtde > lista.getQtdeProdutoEstoque())
					{
						System.out.println("\nQUANTIDADE INDISPONÍVEL PARA VENDA!");
						System.out.println("DESEJA RETORNAR AO MENU DE PRODUTOS? [S/N]");
						decisao = leia.next().toUpperCase().charAt(0);
					}
					else if(codigo.equals(lista.getCodigo()) && qtde <= 0)
					{
						System.out.println("\nQUANTIDADE DIGITADA INVÁLIDA!");
						System.out.println("DESEJA RETORNAR AO MENU DE PRODUTOS? [S/N]");
						decisao = leia.next().toUpperCase().charAt(0);
					}
				}
			}
		
		
		
		}while(decisao == 'S');
		
		linha(60);
		System.out.printf("\n\t\tCARRINHO DE COMPRAS");
		System.out.printf("\nQuantidade | Valor Unitário |  SubTotal  | Produto\n");
		for(Produto car : carrinho)
		{
			subtotal = car.getPrecoUnitario() * car.getQtdeVendas();
			System.out.printf("\n     %d     |    R$%.2f    |  R$%.2f  | %s",car.getQtdeVendas(),
					car.getPrecoUnitario(),subtotal,car.getNomeProduto());
		}
		System.out.println();
		linha(60);
		System.out.printf("\nVALOR TOTAL DA COMPRA R$ %.2f",precoTotal);
		numeroNotaFiscal ++;
		numeroCodigoBarras ++;
		encerrarCompra(precoTotal, c.getCpf(), numeroNotaFiscal, numeroCodigoBarras, c.getNome());
	}

	public static void encerrarCompra(double precoTotal, String cpfCliente, int numeroNotaFiscal, int numeroCodigoBarras, String nome)
	{
		Scanner sc = new Scanner (System.in);
		Timer timer = new Timer();
		
		int formaPagamento, delay = 5000, interval = 1000;
		double impostos, valorDesconto, valorJuros, valorFinalCompra, parcelas;
		System.out.println();
		System.out.println("\n\t\tFORMAS DE PAGAMENTO");
		System.out.println("\n[1] - PAGAMENTO A VISTA - 10%");
		System.out.println("[2] - DEBITO - VALOR SIMPLES");
		System.out.println("[3] - CREDITO COM 5% A MAIS");
		System.out.println("[4] - CREDITO [ATÉ 3 VEZES] COM JUROS DE 10%");
		formaPagamento = sc.nextInt();
		
		if(formaPagamento == 1)
		{
			valorDesconto = precoTotal * 0.10;
			valorJuros = precoTotal * 0.0;
			impostos = (precoTotal - valorDesconto + valorJuros) * 0.09;
			valorFinalCompra = precoTotal - valorDesconto + impostos + valorJuros;
			System.out.println();
			System.out.println("PROCESSANDO EMISSÃO DE CUPOM FISCAL....");
			timer.scheduleAtFixedRate(new TimerTask() {
		        public void run() {
		        	System.out.println("╔══════════════════════════╗");
		            System.out.printf("║CUPOM FISCAL %d    ║\n",numeroNotaFiscal);
		            System.out.println("║                          ║ ");
		            System.out.printf("║CPF: %s                  ║\n",cpfCliente);
		            System.out.println("║PAGAMENTO À VISTA-DINHEIRO║");
		            System.out.printf("║SUBTOTAL: R$%.2f        ║\n",precoTotal);
		            System.out.printf("║DESCONTOS: R$%.2f        ║\n",valorDesconto);
		            System.out.printf("║JUROS: R$%.2f             ║\n",valorJuros);
		            System.out.printf("║IMPOSTOS: R$%.2f         ║\n",impostos);
		            System.out.printf("║VALOR FINAL: R$%.2f     ║\n",valorFinalCompra);
		            System.out.println("║                          ║");
		            System.out.println("║      ║|║|║║║║|║║         ║");
		            System.out.printf ("║       %d         ║\n",numeroCodigoBarras);
		            System.out.println("╚══════════════════════════╝");
		            System.out.println("Olá, "+nome+" Nós da empresa JJ INFORMÁTICA®,\n "
		            		+ "gostaríamos de agradecer imensamente pela "
		            		+ "confiança em nossos produtos!\n "
		            		+ "Esperamos que você esteja "
		            		+ "super feliz com a sua compra, assim como nós estamos");
		            timer.cancel();
		        }
		    }, delay, interval);
			
		}
		else if(formaPagamento == 2)
		{
			valorDesconto = precoTotal * 0.0;
			valorJuros = precoTotal * 0.0;
			impostos = (precoTotal - valorDesconto + valorJuros) * 0.09;
			valorFinalCompra = precoTotal - valorDesconto + impostos + valorJuros;
			System.out.println();
			System.out.println("PROCESSANDO EMISSÃO DE CUPOM FISCAL....");
			timer.scheduleAtFixedRate(new TimerTask() {
		        public void run() {
		        	System.out.println("╔══════════════════════════╗");
		            System.out.printf("║CUPOM FISCAL %d    ║\n",numeroNotaFiscal);
		            System.out.println("║                          ║ ");
		            System.out.printf("║CPF: %s                  ║\n",cpfCliente);
		            System.out.println("║PAGAMENTO À VISTA-DINHEIRO║");
		            System.out.printf("║SUBTOTAL: R$%.2f        ║\n",precoTotal);
		            System.out.printf("║DESCONTOS: R$%.2f        ║\n",valorDesconto);
		            System.out.printf("║JUROS: R$%.2f             ║\n",valorJuros);
		            System.out.printf("║IMPOSTOS: R$%.2f         ║\n",impostos);
		            System.out.printf("║VALOR FINAL: R$%.2f     ║\n",valorFinalCompra);
		            System.out.println("║                          ║");
		            System.out.println("║      ║|║|║║║║|║║         ║");
		            System.out.printf ("║       %d         ║\n",numeroCodigoBarras);
		            System.out.println("╚══════════════════════════╝");
		            System.out.println("Olá, "+nome+" Nós da empresa JJ INFORMÁTICA®,\n "
		            		+ "gostaríamos de agradecer imensamente pela "
		            		+ "confiança em nossos produtos!\n "
		            		+ "Esperamos que você esteja "
		            		+ "super feliz com a sua compra, assim como nós estamos");
		            timer.cancel();
		        }
		    }, delay, interval);
		}
		else if(formaPagamento == 3)
		{
			valorDesconto = precoTotal * 0.0;
			valorJuros = precoTotal * 0.05;
			impostos = (precoTotal - valorDesconto + valorJuros) * 0.09;
			valorFinalCompra = precoTotal - valorDesconto + impostos + valorJuros;
			System.out.println();
			System.out.println("PROCESSANDO EMISSÃO DE CUPOM FISCAL....");
			timer.scheduleAtFixedRate(new TimerTask() {
		        public void run() {
		        	System.out.println("╔══════════════════════════╗");
		            System.out.printf("║CUPOM FISCAL %d    ║\n",numeroNotaFiscal);
		            System.out.println("║                          ║ ");
		            System.out.printf("║CPF: %s                  ║\n",cpfCliente);
		            System.out.println("║PAGAMENTO À VISTA-DINHEIRO║");
		            System.out.printf("║SUBTOTAL: R$%.2f        ║\n",precoTotal);
		            System.out.printf("║DESCONTOS: R$%.2f        ║\n",valorDesconto);
		            System.out.printf("║JUROS: R$%.2f             ║\n",valorJuros);
		            System.out.printf("║IMPOSTOS: R$%.2f         ║\n",impostos);
		            System.out.printf("║VALOR FINAL: R$%.2f     ║\n",valorFinalCompra);
		            System.out.println("║                          ║");
		            System.out.println("║      ║|║|║║║║|║║         ║");
		            System.out.printf ("║       %d         ║\n",numeroCodigoBarras);
		            System.out.println("╚══════════════════════════╝");
		            System.out.println("Olá, "+nome+" Nós da empresa JJ INFORMÁTICA®,\n "
		            		+ "gostaríamos de agradecer imensamente pela "
		            		+ "confiança em nossos produtos!\n "
		            		+ "Esperamos que você esteja "
		            		+ "super feliz com a sua compra, assim como nós estamos");
		            timer.cancel();
		        }
		    }, delay, interval);
		}
		else if(formaPagamento == 4)
		{
			valorDesconto = precoTotal * 0.0;
			valorJuros = precoTotal * 0.10;
			impostos = (precoTotal - valorDesconto + valorJuros) * 0.09;
			valorFinalCompra = precoTotal - valorDesconto + impostos + valorJuros;
			parcelas = valorFinalCompra / 3;
			System.out.println();
			System.out.println("PROCESSANDO EMISSÃO DE CUPOM FISCAL....");
			timer.scheduleAtFixedRate(new TimerTask() {
		        public void run() {
		        	System.out.println("╔══════════════════════════╗");
					System.out.printf("║NOTA FISCAL %d    ║\n",numeroNotaFiscal);
		            System.out.println("║                          ║ ");
		            System.out.printf("║CPF: %s                  ║\n",cpfCliente);
		            System.out.println("║PAGAMENTO PARCELADO-3X    ║");
		            System.out.printf("║SUBTOTAL: R$%.2f        ║\n",precoTotal);
		            System.out.printf("║DESCONTOS: R$%.2f         ║\n",valorDesconto);
		            System.out.printf("║JUROS: R$%.2f            ║\n",valorJuros);
		            System.out.printf("║IMPOSTOS: R$%.2f         ║\n",impostos);
		            System.out.printf("║PARCELAS: R$%.2f        ║\n",parcelas);
		            System.out.printf("║VALOR FINAL: R$%.2f     ║\n",valorFinalCompra);
		            System.out.println("║                          ║");
		            System.out.println("║      ║|║|║║║║|║║         ║");
		            System.out.printf ("║       %d         ║\n",numeroCodigoBarras);
		            System.out.println("╚══════════════════════════╝");
		            System.out.println("Olá, "+nome+" Nós da empresa JJ INFORMÁTICA®,\n "
		            		+ "gostaríamos de agradecer imensamente pela "
		            		+ "confiança em nossos produtos!\n "
		            		+ "Esperamos que você esteja "
		            		+ "super feliz com a sua compra, assim como nós estamos");
		            timer.cancel();
		        }
		    }, delay, interval);
			
		}
		
	}

	public static void listaProdutos(List<Produto> listaProdutos)
	{
		System.out.printf("\nCODIGO | Preço Unit R$ | Estoque | Produto\n");
		for(Produto prod : listaProdutos)
		{
			System.out.printf("\n %s |    %.2f    |    %d   | %s ", prod.getCodigo(), prod.getPrecoUnitario(),
					prod.getQtdeProdutoEstoque(), prod.getNomeProduto());

		}
	}

	public static void linha(int tamanhoLinha)
	{
		for(int x = 0; x<tamanhoLinha; x++)
		{
			System.out.print("═");
		}
	}


	public static String retornaGenero(char genero, String nome)
	{
		String texto;
		if(genero == 'M')
		{
			texto = "Seja bem vindo! "+nome;
		}
		else if(genero == 'F')
		{
			texto = "Seja bem vinda! "+nome;
		}
		else
		{
			texto = "Seja bem vindx! "+nome;
		}

		return texto;
	}


}
