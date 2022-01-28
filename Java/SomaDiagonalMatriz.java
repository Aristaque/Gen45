package VetMat;

import java.util.Scanner;

public class SomaDiagonalMatriz {

	public static void main(String[] args) {
		
		int mat[][] = new int [3][3];
		int somaTotal = 0,somaDiag=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x=0;x<3;x++) {
			for (int y=0;y<3;y++)
			{
				System.out.println("Digite o numero: ");
				mat[x][y]=leia.nextInt();
				somaTotal=somaTotal+mat[x][y];
				
				if (x==y)
					somaDiag=somaDiag+mat[x][y];
			}
			
		}
		
		for (int x=0;x<3;x++)
		{

		for (int y=0;y<3;y++)
		{
			System.out.print(mat[x][y]+"\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("O total da soma dos numeros na diagonal é: "+somaDiag);
		leia.close();
	}

}
