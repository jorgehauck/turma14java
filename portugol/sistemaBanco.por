programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		// DEClARAÇÃO DE VARIAVEL
		cadeia cliente[39] = { "Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
						"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
						"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
						"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
						"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
						"Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso",
						"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
						"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
						"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
						"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
						"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
						"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
						"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda" }
		
		caracter sexoCliente[39] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
		'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
		inteiro talaoCheque=0, opcao, contador=0, limiteTalao=3, l, c, indice, x, encontra=0, opcao1=1
		const inteiro j = 10
		const inteiro i = 31
		real movimentoDia[i][j]
		real saldoConta=0.0
		caracter opcaoTalao
		caracter continuar
		cadeia clientes= "  "
		cadeia codigoCliente [39]
		login()
		para (x=0; x < 39; x++)
		{
			se(x < 9){
				codigoCliente[x] = "G4-0"+(x+1)	
			}
			senao{
				codigoCliente[x] = "G4-"+(x+1)	
			}
		}
	
		//VALIDADOR DE CÓDIGO
		faca{
			escreva("Digite o número do seu Código. Exemplo: G4-XX, onde XX varia de 01 a 39: " )
			leia(clientes)
			clientes=Texto.caixa_alta(clientes)
			
			para(x = 0; x < 39; x++){
				se(clientes == codigoCliente[x]){
					escreva("Seja Bem vindo ao seu Banco Digital G&4, Sr.(a) ", cliente[x])
					encontra = 1
					opcao1 = 2	
				}
			}
			se(encontra == 0){
				escreva("Cliente não encontrado. Digite um código de cliente válido!\n")
				escreva("Deseja inserir um novo código? [1] Sim ou [2] Não: \n")
				leia(opcao1)
				limpa()
			}
		}enquanto(opcao1 != 2)
		
		// LAÇO QUE ZERA AS POSIÇÕES DA MATRIZ
		para(l = 0; l < i; l++){
			para(c = 0; c < j; c++){
			movimentoDia[l][c] = 0
			}
		}
		// LOOP DIA - MATRIZ - 10X31
		para(l = 0; l < i; l++){
			pula()
			escreva("Estamos no dia ", l+1, " do mês")
			pula()
			contador = 0
		// LOOP PRINCIPAL DO BANCO - CONTAS
			faca{
				escreva ("\n|-----------------------------------------------|\n")
				escreva("|              SERVIÇOS DISPONÍVEIS                |")
				escreva ("\n|-----------------------------------------------|\n")
				escreva("|-------------------- M E N U ------------------|")
				escreva("\n[1] - Conta Poupança\n")
				escreva("[2] - Conta Corrente\n")
				escreva("[3] - Conta Especial\n")
				escreva("[4] - Conta Empresa\n")
				escreva("[5] - Conta Universitária\n")
				escreva("[0] - Sair do Banco\n")
				escreva("\nOpção: ")
				leia(opcao)
				limpa()
	
				escolha (opcao){
	
				//CONTA POUPANÇA - JJ
				caso 1:
					faca{
						escreva("|-----------------------------------------------------|\n")
						escreva("|                     CONTA POUPANÇA                  |\n")
						escreva("|-----------------------------------------------------|\n")
						escreva("\nSelecione a opção desejada: ")
						escreva("\n(1) Consultar Saldo")
						escreva("\n(2) Realizar Depósito")
						escreva("\n(3) Realizar Saque")
						escreva("(4) Imprimir extrato")
						escreva("(5) SAIR: ")
						leia(opcao)
					}enquanto(opcao != 5)
				pare
	
				// CONTA CORRENTE - VERONICA
				caso 2:
					faca{
						escreva("|-----------------------------------------------------|\n")
						escreva("|                     CONTA CORRENTE                  |\n")
						escreva("|-----------------------------------------------------|\n")
						escreva("\nSelecione a opção desejada: ")
						escreva("\n(1) Consultar Saldo")
						escreva("\n(2) Realizar Depósito")
						escreva("\n(3) Realizar Saque")
						escreva("(4) Emitir novo talão de cheque")
						escreva("(5) Imprimir extrato")
						escreva("(6) SAIR: ")
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
							escreva("**** EXTRATO DA CONTA ****")
							
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
				pare
	
				//CONTA ESPECIAL - KELVEN
				caso 3:
				faca{
					escreva("|-----------------------------------------------------|\n")
					escreva("|                     CONTA ESPECIAL                  |\n")
					escreva("|-----------------------------------------------------|\n")
					escreva("\n(1) Consultar Saldo")
					escreva("\n(2) Realizar Depósito")
					escreva("\n(3) Realizar Saque")
					escreva("\n(4) SAIR: ")
					leia(opcao)
				}enquanto(opcao != 4)
				
				pare
	
				//CONTA EMPRESA - BEYMAR
				caso 4:
				faca{
					escreva("|-----------------------------------------------------|\n")
					escreva("|                     CONTA EMPRESA                   |\n")
					escreva("|-----------------------------------------------------|\n")
					escreva("\n(1) Consultar Saldo")
					escreva("\n(2) Realizar Depósito")
					escreva("\n(3) Realizar Saque")
					escreva("\n(4) Solicitar empréstimo")
					escreva("\n(5) SAIR: ")
					leia(opcao)
				}enquanto(opcao != 5)
				
				pare
	
				//CONTA UNIVERSITÁRIA - GIDEÃO
				caso 5:
				faca{	
					escreva("|-----------------------------------------------------|\n")
					escreva("|                 CONTA UNIVERSITÁRIA                 |\n")
					escreva("|-----------------------------------------------------|\n")
					escreva("\n(1) Consultar Saldo")
					escreva("\n(2) Realizar Depósito")
					escreva("\n(3) Realizar Saque")
					escreva("\n(4) Solicitar empréstimo")
					escreva("\n(5) SAIR: ")
					leia(opcao)
				}enquanto(opcao != 5)
				pare
	
				caso contrario:
					escreva("Opção inválida. Selecione nova opção.")
				pare
	
				}
				// FINAL DO ESCOLHA CASO
				
				
			}enquanto (opcao == 0)
			escreva("Fim do dia ", l+1, ". Deseja continuar? (S) SIM ou (N) NÃO: ")
			leia(continuar)
			se(continuar == 'N' ou continuar == 'n'){
				l = l + i
			}
			para(c = 0; c < j; c++){
				para(l = 0; l < i; l++){
					escreva(movimentoDia[l][c], "  ")
				}
			escreva("\n")
			}
		}
	}
	funcao pula (){
		escreva("\n")
	}
	funcao login (){
		escreva ("\n|-----------------------------------------------|")
		escreva( "\n|    SEJA BEM-VINDO AO SEU BANCO DIGITAL G&4    |")
		escreva ("\n|-----------------------------------------------|")
		pula()
		pula()
		escreva("||||||||||||||||||||||| LOGIN |||||||||||||||||||||||")
		pula()
		pula()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */