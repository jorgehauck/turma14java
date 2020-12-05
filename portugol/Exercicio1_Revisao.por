programa
{
	inclua biblioteca Matematica-->mat

     funcao linha(){
     	escreva("\n========================================================")
     }

     funcao pula(){
     	escreva("\n")
     }
     funcao condicoesPagamento(){
     	escreva("\n1-À vista em dinheiro ou cheque, recebe 20% de desconto ")
     	escreva("\n2-À vista no cartão de crédito, recebe 15% de desconto")
     	escreva("\n3-Em duas vezes, preço normal de etiqueta sem juros ")
     	escreva("\n4-Em três vezes, preço normal de etiqueta mais juros de 10%")
     }
	
	funcao inicio(){
		real precoEtiqueta, calculo = 0.0, valorFinal = 0.0
		inteiro codigo
          linha()
		escreva("\nInforme o valor do seu produto: ")
		leia(precoEtiqueta)
		pula()
          linha()
		escreva("\nInforme as condições de pagamento: ")
		condicoesPagamento()
		leia(codigo)

		se(codigo == 1){
			calculo = precoEtiqueta * 0.20
			valorFinal = precoEtiqueta - calculo
			escreva("\nDesconto de 20% no seu pagamento á vista ou cheque é de: R$",mat.arredondar(valorFinal,2))
			linha()
		}
		senao se(codigo==2){
			calculo = precoEtiqueta * 0.15
			valorFinal = precoEtiqueta - calculo
			escreva("\nPagamento feito no cartão de crédito á vista é de: R$",mat.arredondar(valorFinal,2))
			linha()
		}
		senao se(codigo==3){
			calculo = precoEtiqueta / 2.0
			valorFinal = calculo
			escreva("\nPagamento feito em 2x sem juros R$: ",mat.arredondar(valorFinal,2))
			linha()
		}
         senao se(codigo==4){
         	    calculo = precoEtiqueta * 0.10
         	    valorFinal = precoEtiqueta + calculo
         	    escreva("\nPagamento feito em 3x com juros de 10% R$: ",mat.arredondar(valorFinal,2))
         	    linha()
         }

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1701; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */