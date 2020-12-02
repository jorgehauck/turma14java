programa
{
	inclua biblioteca Util
	
	funcao inicio(){
	  
	  inteiro N1[4][6], N2[4][6]
	  inteiro M1[4][6], M2[4][6]

	  para(inteiro linha = 0; linha < 4; linha++){
	  	para(inteiro coluna = 0; coluna < 6; coluna++){
                N1[linha][coluna] = Util.sorteia(1,9)
                escreva(N1[linha][coluna]," ")
	  	}
	  }
         escreva("\n")
       para(inteiro linha = 0; linha < 4; linha++){
	  	para(inteiro coluna = 0; coluna < 6; coluna++){
                N2[linha][coluna] = Util.sorteia(1,9)
                escreva(N2[linha][coluna]," ")
	  	}
	  }
        escreva("\n","\t")
        
       para(inteiro linha = 0; linha < 4; linha++){
	  	para(inteiro coluna = 0; coluna < 6; coluna++){
                M1[linha][coluna] = N1[linha][coluna]  +  N2[linha][coluna]
                escreva(M1[linha][coluna]," ")
	  	}
	  }
       escreva("\n","\t")
       

       para(inteiro linha = 0; linha < 4; linha++){
	  	para(inteiro coluna = 0; coluna < 6; coluna++){
                M2[linha][coluna] = N1[linha][coluna]  -  N2[linha][coluna]
                escreva(M1[linha][coluna]," ")
	  	}
	  }
       escreva("\n","\t")
       
      






       	  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */