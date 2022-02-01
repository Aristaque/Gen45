package OriObjeto;

public class Cliente2 {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();

		
		c1.nome = "Jeferson";
		c1.idade = 28;
		c1.cpf = "000.000.000-00";
		c1.telefone = "0987654321";
		c1.rua = "Caçapava";
		
			
			System.out.println("Nome: "+c1.nome);
			System.out.println("CPF: "+c1.cpf);
			System.out.println("Idade: "+c1.idade);
			System.out.println("Telefone: "+c1.telefone);
			System.out.println("Rua: "+c1.rua);
			
	}

}
