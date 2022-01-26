programa
{
	
	funcao inicio()
	{
	
		inteiro hab, num_fil, total_fil = 0 
		real med_fil, sal, med_sal, maior_sal = 0.0, total_sal = 0.0, perc_sal = 0.0, perc_pes
		
 
		     para(hab = 1; hab <= 20; hab++)
		     {

			escreva("\n\nInsira o seu salário:\nR$ ")
			leia(sal)

			total_sal = total_sal + sal
		
			escreva("Escreva quantos filhos você tem?\n")
			leia(num_fil)

			total_fil = total_fil + num_fil


			se(sal > maior_sal)
			{

				maior_sal = sal
		
			}
		
			limpa()

			se(sal <= 100)
			{
				
				perc_sal = perc_sal + 1	
			
		}

		limpa()

		}

		med_sal = total_sal / 20.0
		med_fil = total_fil / 20.0
		perc_sal = (perc_sal / 20.0) *100


		escreva("\nA média de salário da população é: \nR$ ", med_sal)
		escreva("\n")
		
		escreva("\nA média de filhos da população é de: \n", med_fil)
		escreva("\n")
		
		escreva("\nO maior salário entre a população é de: \nR$ ", maior_sal)
		escreva("\n")
		
		escreva("\nO percentual de pessoas que recebe até R$ 100,00 é de  ", perc_sal)
					
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */