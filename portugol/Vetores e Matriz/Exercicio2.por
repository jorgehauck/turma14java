programa
{
	inclua biblioteca Util
	
	funcao inicio(){
	  
	  inteiro lancamento[10]
	  real media = 0.0, soma = 0.0, calc = 0.0
	  inteiro maiorPosicao = 0, maior = 0
	  

	  para(inteiro i=0; i<10; i++){
	  	lancamento[i] = Util.sorteia(1,6)
	  	escreva("\nLançamento: ",lancamento[i])

	  	soma = lancamento[i] + soma
	  	se(lancamento[i] > maior){
	  		maior = lancamento[i]
	  	}
	  }
       para(inteiro i = 0; i < 10; i++){
       	se(lancamento[i] == maior){
       		maiorPosicao++
       	}
       }

	  
	  escreva("\nA média das jogadas foi de: ",soma/10)
	  escreva("\nO maior número foi: ",maior)
	  escreva("\n a quantidade de vezes foi de: ",maiorPosicao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */