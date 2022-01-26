import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
		
		  double precoFabrica, precoFinal;
	      Scanner id = new Scanner (System.in);

	      System.out.print("Qual o valor do carro sem impostos? ");
	      precoFabrica=id.nextDouble();

	      precoFinal=(precoFabrica*0.73)+precoFabrica;

	      System.out.print("O valor do carro com impostos é: R$"+ precoFinal);

	}

}
