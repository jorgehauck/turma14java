programa
{
	
	funcao inicio()
	{
		inteiro numeroConta, numeroCPF, talaoCheque=0, opcao, contador=0, limiteTalao=3, l, c, indice
		const inteiro j = 10
		const inteiro i = 31
		real movimentoDia[i][j]
		real saldoConta=0
		caracter opcaoTalao
		caracter continuar
		para(l = 0; l < i; l++){
			para(c = 0; c < j; c++){
			movimentoDia[l][c] = 0
			}
		}
		escreva("Seja Bem vindo ao seu Banco Digital G&4")
		pula()
		pula()
		escreva("||||| LOGIN |||||")
		pula()
		pula()
		escreva ("Prezado Cliente, informe seu número de Conta Corrente: ")
		leia(numeroConta)
		escreva("Agora, informe seu número de CPF: ")
		leia(numeroCPF)
		para(l = 0; l < i; l++){
			pula()
			escreva("Estamos no dia ", l+1, " do mês")
			pula()
			contador = 0
		
			faca{
				escreva("\nSelecione a opção desejada: (1) Consultar Saldo - (2) Realizar Depósito")
				escreva("\n(3) Realizar Saque - (4) Emitir novo talão de cheque - (5) Imprimir extrato - (6) SAIR: ")
				leia(opcao)
	
				escolha (opcao){
				caso 1:
					escreva("Seu saldo é de R$ ", saldoConta)
				pare
				caso 2:
					escreva("Operações restantes no dia: ", 10-contador)
	
					se(contador < 10){
						escreva("\nInforme quanto gostaria de depositar: ")
						leia(movimentoDia[l][contador])
	
						saldoConta = saldoConta + movimentoDia[l][contador]
	
						escreva("Seu novo saldo é de R$ ", saldoConta)
	
						contador++
					}
					senao{
						escreva("Limite de operações no dia alcançadas.")
					}		
					
				pare
				caso 3:
					escreva("Operações restantes no dia: ", 10-contador)
	
					se(contador < 10){
						escreva("\nInforme quanto gostaria de sacar: ")
						leia(movimentoDia[l][contador])
	
						movimentoDia[l][contador] = movimentoDia[l][contador] * (-1)
	
						se(movimentoDia[l][contador] <= saldoConta){
							saldoConta = saldoConta + movimentoDia[l][contador]
							escreva("Você sacou a quantia de R$ ", movimentoDia[l][contador])
							escreva("\nE seu novo saldo é de R$ ", saldoConta)
	
							contador++
						}
						senao{
							escreva("Saldo insuficiente. Selecione nova opção.")
						}
					}
					
				pare
				caso 4:
	
					se(talaoCheque < limiteTalao){
						escreva("Você tem ", limiteTalao-talaoCheque, " talão(ões) de cheque disponível(is).")
						escreva("\nVocê realmente deseja emitir um novo talão de cheque? (S)Sim - (N)Não: ")
						leia(opcaoTalao)
		
						se(opcaoTalao == 'S' ou opcaoTalao == 's'){
							talaoCheque++
		
							escreva("Talão emitido sob o número ", talaoCheque)
						}
						senao{
							escreva("Talão não emitido")
						}
					}
					senao{
						escreva("O limite de talões de cheque por dia foi atingido.")
					}
					
				pare
				caso 5:
					escreva("**** EXTRATO DA CONTA ", numeroConta, " ****")
					
					para(c = 0; c < 10; c++){
						se(movimentoDia[l][c] != 0){
							escreva("\nMovimentação: ", movimentoDia[l][c])
						}
					}
	
					escreva("\nSeu saldo é de R$ ", saldoConta)
	
				pare
				
				caso 6:
					escreva("Você optou por sair. Obrigado por utilizar nossos serviços!\n")
				pare
				caso contrario:
					escreva("Opção inválida. Selecione nova opção.")
				pare
				}
			}enquanto(opcao != 6)
			escreva("Fim do dia ", l+1, ". Deseja continuar? (S) SIM ou (N) NÃO: ")
			leia(continuar)
			se(continuar == 'N' ou continuar == 'n'){
				l = l + i
			}
		}
		para(c = 0; c < j; c++){
			para(l = 0; l < i; l++){
			escreva(movimentoDia[l][c], "  ")
			}
			escreva("\n")
		}
		
	}
	
	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */