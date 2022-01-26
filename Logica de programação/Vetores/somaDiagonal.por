programa
{

    funcao inicio()
    {

        inteiro  m[3][3], linha, coluna, soma_total = 0, soma_diag = 0

      			  para(linha=0;linha<3;linha++)
      				  {

         				   para(coluna=0;coluna<3;coluna++)
           				 {
              				  escreva("Digite um número: ")
              				  leia(m[linha][coluna])

              				  escreva("\n")

           			       soma_total = soma_total + m[linha][coluna]1

			 			  limpa ( )

           				  se(linha==coluna)

               			  soma_diag = soma_diag + m[linha][coluna]

         			       }

     			       }


           	      para(linha=0;linha<3;linha++)
    				      {

     			       para(coluna=0;coluna<3;coluna++)
       				     {

              				  escreva("\t", m[linha][coluna])

          			     }
                               escreva("\n\n")
       				     }

                               escreva("\nA soma total dos números é: ",soma_total)
                               escreva("\n")
          				 escreva("\nA soma dos valores em diagonal é: ", soma_diag)
                               escreva("\n")

    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1107; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */