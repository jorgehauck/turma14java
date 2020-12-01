programa
{
	
	funcao inicio(){
	real N, horasTrabalhadas= 10.00, horasBonus = 20.00, salarioTotal, E, total
	cadeia C
	escreva("Informe o seu código: ")
	leia(C)
	escreva("Informe o número de horas trabalhadas: ")
	leia(N)

      se(N<=50){
         salarioTotal = horasTrabalhadas * N
         escreva("O total é de R$: ",salarioTotal)
      }
      senao se(N>50){
      	E = N - 50
      	salarioTotal = E * horasBonus
      	total = 500 + salarioTotal
      	escreva("O seu salário é de R$: ",total)
      	
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