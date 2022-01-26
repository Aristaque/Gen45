programa
{
	
	funcao inicio()
{
		inteiro vet[10], x=0, maior=0, ult = 0
		real media = 0.0, soma = 0.0

			para(x=0;x<10;x++)
			{
				escreva("Digite o numero: ")
				leia(vet[x])

			se(vet[x]>maior) 
			{
								
				maior = vet[x]
				ult++
				
			}
		
				soma=soma+vet[x]
				media=soma/10
			}	
				escreva("\nO maior valor: ",maior)
				escreva("\nO maior valor apareceu: ", ult , "vezes")
				escreva("\nA média dos numeros: ",media)
						
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */