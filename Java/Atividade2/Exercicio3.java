package Atividade2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int id1=0, id2=0,idade;
		
		
		System.out.println("Digite a idade: ");
		idade=leia.nextInt();
		
		while( idade!=-99) {
			
			if(idade<21 && idade>=0) {
				id1++;
			}
			if(idade>50) {
				id2++;
			}
			if(idade<0)
			System.out.print("\tPrograma encerrado\nO total de pessoas com menos de 21 anos é: "+id1+
					"\nO total de pessoas com mais de 50 anos é: "+id2);
			idade=leia.nextInt();
			
		}
				leia.close();
		}
			
	}



