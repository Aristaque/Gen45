package OriObjeto;

public class Paciente {
	String nome, acidente;
	int idade;
	boolean vida=true;
	
	public void digitarNome(){
		System.out.println("Nome: "+this.nome);
	}
	public void digitarAcidente() {
		System.out.println("Acidente: "+this.acidente);
	}
	public void digitarIdade() {
		System.out.println("Idade: "+this.idade);	
	}
	public void digitarVida() {
		if (this.vida=false)
				System.out.println("\nFelizmente voc� n�o teve muitos ferimentos. Logo voc� ter� alta");
		else 
			System.out.println("Infelizmente temos menos uma pessoa no mundo");
	}
}
