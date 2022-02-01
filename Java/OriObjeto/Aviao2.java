package OriObjeto;

public class Aviao2 {

	public static void main(String[] args) {
		
		Aviao av1 = new Aviao();
		
		av1.modelo = "Boeing 707";
		av1.porte = "Grande";
		av1.velocidade = "960km/Hora";
			
			System.out.println("Modelo: "+av1.modelo);
			System.out.println("Porte: "+av1.porte);
			System.out.println("Velocidade maxima: "+av1.velocidade);
		
	}

}
