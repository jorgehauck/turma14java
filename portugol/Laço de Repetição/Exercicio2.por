programa
{
	
	funcao inicio(){
       inteiro soma=0
       

       para(inteiro i=1; i<=500; i++){ 
       	se(i % 2!=0 e i % 3 == 0){
       		soma = soma + i
       	}
       }
       escreva("\nA soma dos números ímpares múltiplos de 3 é de: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 60; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */