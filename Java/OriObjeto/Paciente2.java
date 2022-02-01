package OriObjeto;

public class Paciente2 {

	public static void main(String[] args) {

		Paciente pac1 = new Paciente();
		
		pac1.nome = "Antonio";
		pac1.idade = 77;
		pac1.acidente = "Queda de moto";
		pac1.vida = false;
		
				
		pac1.digitarNome();
		pac1.digitarIdade();
		pac1.digitarAcidente();
		pac1.digitarVida();

	}

}
