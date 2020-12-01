programa
{
	
	funcao inicio(){
	  real base, altura, area
	  escreva("Informe a base do triângulo: ")
	  leia(base)
	  escreva("Informe a altura do triângulo: ")
	  leia(altura)

	  se(base <= 0 ou altura <= 0){
	  	escreva("VALORES INCORRETOS!!!")
	  	escreva("\nInforme os valores maiores que zero e que seja positivo")
	  }
	  senao{
	  	area = base * altura / 2.0
	  	escreva("Área do triângulo é de: ",area)
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