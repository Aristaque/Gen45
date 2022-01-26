import java.util.Scanner;

public class TempoEvento {
	public static void main(String[] args) {
		
		int segundos, minutos, horas, totalSeg;
		Scanner id = new Scanner (System.in);
		
		System.out.println("Digite quantos segundos o evento teve: ");
		totalSeg = id.nextInt();
		
		horas = totalSeg/3600;
		minutos = totalSeg/60;
		minutos = totalSeg%60;
		segundos = minutos/60;
		segundos = minutos%60;
		
		System.out.println("O evento durou: "+horas+"horas "+minutos+"minutos e "+segundos+"segundos");
			
	}

}
