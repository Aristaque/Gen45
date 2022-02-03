package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Estoque {

	public static void main(String[] args) {
		String pack1 = "Maça";
		String pack2 = "Uva";
		String pack3 = "Bala";
		
		ArrayList<String> estoque = new ArrayList<>();
		
		System.out.println(estoque);
		
		estoque.add(pack1);
		estoque.add(pack2);
		estoque.add(pack3);
		
		System.out.println(estoque);
		
		estoque.remove(2);
		
		System.out.println(estoque);

		Collections.sort(estoque);
		
		estoque.add(2, "Pão doce");
		
		System.out.println(estoque);
		
		estoque.add("Bisnaga");
		
		System.out.println(estoque);
	}

}
