import java.util.Scanner;

public class IdadaAnos {
	public static void main(String[] args) {
			
		int anos, dias, meses, diaTotal;
			Scanner id = new Scanner (System.in);
			
			System.out.println("Digite quantos dias já viveu: ");
			dias = id.nextInt();
			
			anos = dias/365;
			meses = (dias/30);
			meses = dias%30;
			diaTotal = (dias%365);
					

			System.out.println("Você tem: "+anos+ " anos "+meses+" meses e "+diaTotal+ " dias");
							
		}

	
}