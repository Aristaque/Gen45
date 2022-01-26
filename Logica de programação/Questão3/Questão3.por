programa
{
	
	funcao inicio()
	{
		inteiro segundos1, minutos1, horas, totalSegundos, sobraHoras, sobraMinuto

				escreva("Digite quantos segundos durou o evento:")
				leia(totalSegundos)

				horas = totalSegundos/3600
				sobraHoras = totalSegundos%3600
				minutos1 = sobraHoras/60
				sobraMinuto = sobraHoras%60
				segundos1 = minutos1/60
				totalSegundos = minutos1%60

				escreva("O evento durou: "+horas+"horas", +minutos1+"minutos", +segundos1+"segundos")
				
				

				

			
				
	          
	          
	          
				
											
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */