programa
{
	
	funcao inicio(){
	  inteiro valores[5]
	  inteiro maior = -1

	  para(inteiro i=0; i<5; i++){
	  	escreva("Digite o ",i+1,"º valor: ")
	  	leia(valores[i])
	  	
	  	
	  }
	  para(inteiro i=0; i<5; i++){
	  	se(valores[i] > maior){
	  		maior = valores[i]
	  	}
	  }
	  escreva("\n")
	escreva("\n O maior número é de:",maior)
	  
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */