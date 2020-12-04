programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio(){
		real IMC, peso, altura
		escreva("Digite o seu peso: ")
		leia(peso)
		escreva("Digite a sua altura: ")
		leia(altura)

		IMC = peso / mat.potencia(altura, 2.0)

		se(IMC < 18.5){
			escreva("Abaixo do peso")
		}
		senao se(IMC >= 18.5 e IMC <=25){
			escreva("Peso normal")
		}
		senao se(IMC >= 25 e IMC <=30){
			escreva("Acima do peso")
		}
		senao{
			escreva("Obeso")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */