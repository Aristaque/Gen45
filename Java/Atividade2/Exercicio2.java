package Atividade2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int impar=0, par=0, num, x;
		
		for (x=1;x<=10;x++)
		{
			System.out.println("Digite o numero: ");
			num=leia.nextInt();
						
			if(num%2==0)
			{
				par++;
			}
			else
				impar++;
			}
			System.out.println("De todos numeros lidos "+par+" são pares e "+impar+" são impares");
	}
}
