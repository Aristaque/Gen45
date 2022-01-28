package VetMat;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[]vet = new int [10];
		int maior=0;
		
		for(int x=0;x<10;x++) {
			System.out.println("Digite o numero: ");
			vet[x]=leia.nextInt();
			if(vet[x]>maior)
				maior=vet[x];
		}
		for(int x=0;x<10;x++)
			System.out.println("\t"+vet[x]);
			System.out.println("O maior numero dentro do vetor é: "+maior);
		leia.close();
	}

}
