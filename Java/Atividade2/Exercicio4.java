package Atividade2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int x=0, media=0, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do{			
			System.out.println("Digite um número: ");
			x =leia.nextInt();
					
			if(x % 3 == 0 && x != 0)
		  {				
			soma = x + soma;
			media ++;				
		  }			
		}	
		
		while(x !=0);
		media = soma / media;
		
		System.out.println("A média final da soma é: "+media);
		leia.close();
		
	}
}