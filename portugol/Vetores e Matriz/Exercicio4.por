programa
{
	inclua biblioteca Util
	
	funcao inicio(){
	  inteiro matriz[3][3]
	  inteiro soma = 0

        para(inteiro linha = 0; linha < 3; linha++){
        	para(inteiro coluna = 0; coluna < 3; coluna++){
        		matriz[linha][coluna] = Util.sorteia(1,9)
        	}
        
        }
        

        para(inteiro linha = 0; linha < 3; linha++){
        	para(inteiro coluna = 0; coluna < 3; coluna++){
        		soma = matriz[linha][coluna] + matriz[linha][coluna]
        	}
        	
        }
        escreva("A soma das matriz é de: ",soma)
        escreva("\n")

        para(inteiro linha = 0; linha < 3; linha++){
        	para(inteiro coluna = 0; coluna < 3; coluna++){
        		soma = matriz[linha][coluna] + matriz[linha][coluna]
        	}
        	
        }

        para(inteiro linha = 0; linha < 3; linha++){
        	para(inteiro coluna = 0; coluna < 3; coluna++){
        		se(linha == coluna){
        			soma = matriz[linha][coluna] + soma
        			
        		}
        	
        	}
        	
        }
        escreva("A soma das matriz diagonal: ",soma)









	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1088; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */