programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio(){
	  const inteiro numeroConta = 2020
	  const cadeia numeroCPF = "000.111.222-4"
	   //Reais

		
		//inteiro N=10
		inteiro movimentacao[10]
		real saldoConta = 0.0//Reais
		inteiro opcao, status
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
		para (inteiro x = 0; x < 3; x++){
			escreva("--------------------------------------------------------")
			escreva("\n		    CONTA POUPANÇA                    \n")
			escreva("--------------------------------------------------------\n")
		     se(saldoConta == 0){
		     	escreva("\nVocê não tem saldo suficiente!")
		     	escreva("\nInforme quanto você quer depositar: ")
		     	leia(movimentacao[x])
		     	enquanto(movimentacao[x] < 0){
		     		escreva("\nVALOR INCORRETO! DIGITE NOVAMENTE: ")
		     		leia(movimentacao[x])
		     	}
				saldoConta+= movimentacao[x]
                    
		     }
		     senao{
		     	escreva("\n1- Depósito")
		     	escreva("\n2- Débitar")
		     	leia(status)
		     	se(status == 1){
		     		escreva("\nDigite o valor que você quer depositar: ")
		     		leia(movimentacao[x])
		     		enquanto(movimentacao[x] < 0){
		     		escreva("VALOR INCORRETO! DIGITE NOVAMENTE: ")
		     		leia(movimentacao[x])
		     	}
		     		saldoConta+= movimentacao[x]
		     		
		      }
		      
		     	senao{
		     		escreva("Digite os seus débitos: ")
		     		leia(movimentacao[x])
		     		movimentacao[x] = -movimentacao[x]
		     		saldoConta+= movimentacao[x]
		     		
		     	}
		     	
		     }
               
			}
			se(dataAniversarioConta == DATA_ANIVERSARIO){
				saldoConta = 1.005 * saldoConta 
				
			}
			
			escreva("\nSaldo do dia: ",mat.arredondar(saldoConta,2))
			escreva("\nDeseja continuar? ")
			leia(decisao)
		}enquanto(decisao == 'S' ou decisao == 's')
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 163; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */