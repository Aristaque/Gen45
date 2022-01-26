import java.util.Scanner;

public class Idadeemdias {
	public static void main(String[] args) {
		
		int  dias, meses, idTotal, mesTotal, diaTotal, anos;
		Scanner id = new Scanner (System.in);
		
		System.out.println("Quantos anos você tem? ");
			anos = id.nextInt();
		
		System.out.println("Agora digite quantos meses: ");
			meses = id.nextInt();
		
		System.out.println("E por ultimo quantos dias: ");
			dias = id.nextInt();
				
		idTotal = 350;
		mesTotal = 30;
		diaTotal = (anos*idTotal)+(meses*mesTotal)+dias;
		
		System.out.println("Sua idade em dias é: "+diaTotal);
	}
	
}
