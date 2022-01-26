programa
{
	
	funcao inicio()
	{
		
		real salario, salarioEx, salarioTo = 0.0
		inteiro C, N

			           escreva("Digite o codigo: ")
				      leia(C)
			           escreva("Digite quantas horas foram trabalhadas: ")
				      leia(N)
				
				      salario = N*10.00
				      		
			se(N>50) 
				     {
					 salarioEx = (N-50)*20.00
					 salario = 50 * 10.00
					 salarioTo = salario + salarioEx

			escreva("Salario total: $", +salarioTo+ "\nSalário excedente: $", salarioEx)
					}
				
			senao
				{
				escreva("Salario: $",salario)
							
				}
						
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 94; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */