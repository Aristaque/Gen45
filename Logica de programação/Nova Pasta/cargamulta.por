programa
{
	
	funcao inicio()
	{
		inteiro peso, multa, excesso, pesoLim

		
		escreva("Quantos quilos de tomate voce trouxe? ")
		leia(peso)

			pesoLim = 50
			excesso = pesoLim - peso
			multa = excesso * 4

		se (peso>50)
		{
	      multa=(peso-50)*4
	      escreva("O peso excedeu, o valor da multa é:", multa)
		}
		
	     senao
	     {
	     	escreva("Multa = ZERO" ,"\nExcesso = ZERO")
	     	
	     	
			
		}
		
		
		
		
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 78; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */