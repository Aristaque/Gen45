package OriObjeto;

public class Funcionario2 {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario ();
		
		func1.nome = "Jeferson Aristaque";
		func1.cpf = "12345678911";
		func1.idade = 28;
		func1.endereço = "Cacapava";
		func1.salario = 15000;
		func1.precisaVt();
		
		func1.status();
		
		
	}

}
