programa
{
	
	funcao inicio(){
	  inteiro idade
	  escreva("Informe a sua idade: ")
	  leia(idade)

	  se(idade <= 4){
	  	escreva("Desculpe, mas você não pode nadar, devido a sua idade!")	
	  }
	  senao se(idade <= 5 e idade <=7){
	  	escreva("Infantil A")
	  }
	  senao se(idade <= 8 ou idade <=11){
	  	escreva("Infantil B")
	  }
       senao se(idade <= 12 ou idade <=13){
       	escreva("Juvenil A")
       }
       senao se(idade <= 14 ou idade <=17){
       	escreva("Juvenil B")
       }
       senao{
       	escreva("Adultos")
       }
	  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 219; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */