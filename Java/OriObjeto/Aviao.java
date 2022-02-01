//2 - Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

package OriObjeto;

public class Aviao {
	
	
	String modelo;
	String porte;
	String velocidade;
	
	public void digitarModelo()
	{
		System.out.println("Modelo: "+this.modelo);
	}
	public void digitarPorte()
	{
		System.out.println("Porte: "+this.porte);
	}
	public void digitarVelocidade()
	{
		System.out.println("Velocidade Maxima: "+this.velocidade);
	}
}
