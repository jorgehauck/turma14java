programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio(){
	  const inteiro numeroConta = 0, numeroCPF = 0
	  
             cadeia clientes[39] ={ "Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
						"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
						"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
						"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
						"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
						"Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso",
						"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
						"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
						"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
						"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
						"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
						"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
						"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda" }
		
		//inteiro N=10
		inteiro movimentacao[2][2]
		real saldoConta = 0.0//Reais  
		inteiro opcao, status       / 
		const inteiro DATA_ANIVERSARIO = 5
		real credito = 0.0, debito = 0.0
		inteiro dataAniversarioConta = 0
		caracter decisao
		escreva ("\n------------------------------------------------------\n")
		escreva("         Seja Bem vindo ao seu Banco Digital G&4")
		escreva ("\n------------------------------------------------------\n")
		escreva("Selecione uma das seguintes operações:\n1-Conta Poupança o saldo\n2-Creditar em conta\n3-Debitar em conta\n")
		leia(opcao)

          escreva("\nInforme o dia do aniversário da conta: ")
		leia(dataAniversarioConta)
		faca{
		para(inteiro x = 0; x < 2; x++){
			para(inteiro i = 0; i<2; i++){
			escreva("--------------------------------------------------------")
			escreva("\n		    CONTA POUPANÇA                    \n")
			escreva("--------------------------------------------------------\n")
		     se(saldoConta == 0){
		     	escreva("\nVocê não tem saldo suficiente!")
		     	escreva("\nInforme quanto você quer depositar: ")
		     	leia(movimentacao[i][x])
		     	enquanto(movimentacao[i][x] < 0){
		     		escreva("\nVALOR INCORRETO! DIGITE NOVAMENTE: ")
		     		leia(movimentacao[i][x])
		     	}
				saldoConta+= movimentacao[i][x]
                    
		     }
		     senao{
		     	escreva("\n1- Depósito")
		     	escreva("\n2- Débitar")
		     	leia(status)
		     	se(status == 1){
		     		escreva("\nDigite o valor que você quer depositar: ")
		     		leia(movimentacao[i][x])
		     		enquanto(movimentacao[i][x] < 0){
		     		escreva("VALOR INCORRETO! DIGITE NOVAMENTE: ")
		     		leia(movimentacao[i][x])
		     	}
		     		saldoConta+= movimentacao[i][x]
		     		
		      }
		      
		     	senao{
		     		escreva("Digite os seus débitos: ")
		     		leia(movimentacao[i][x])
		     		movimentacao[i][x] = -movimentacao[i][x]
		     		saldoConta+= movimentacao[i][x]
		     		
		     	}
		     	
		     }
               
			}
			se(dataAniversarioConta == DATA_ANIVERSARIO){
				saldoConta = 1.005 * saldoConta 
				
			}
		}
		     
			escreva("\nSaldo do dia: ",mat.arredondar(saldoConta,2))
			escreva("\nDeseja continuar? ")
			leia(decisao)
		     
		}enquanto(decisao == 'S' ou decisao == 's')
		  escreva("==============================================\n")
		  escreva("                  EXTRATO         \n")
		  escreva("==============================================\n")
		 para(inteiro x = 0; x < 2; x++){
			para(inteiro i = 0; i<2; i++){
				
				escreva(movimentacao[x][i],"\t")
			}
			escreva("\n")
		 }
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */