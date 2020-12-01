programa
{
	
	funcao inicio(){
	 const real EXCEDENTE = 4.00
	 real P, eh, M

	  escreva("João, por favor informe o peso dos tomates: ")
	  leia(P)

	  se(P>50){
	  	eh = P - 50
	  	M = eh * EXCEDENTE
	  	escreva("\nJoão, o peso passou do limite dessa forma a sua multa será de R$",M)
	  }
	  senao {
	  	eh = 0
	  	M = 0
	  	escreva(M)
	  }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */