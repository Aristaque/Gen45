//3-Crie uma classe produto eletr�nico e apresente os atributos e m�todos
//referentes esta classe, em seguida crie um objeto produto eletr�nico,
//defina as instancias deste objeto e apresente as informa��es deste objeto no console.

package OriObjeto;

public class Televisao {
	
	String marca;
	String modelo;
	String polegada;
	boolean ligada=false;
	
	public Televisao()
	{
		this.marca="Samsung";
		this.modelo="Fullhd";
		this.polegada="42";
		this.ligada=false;
		
	}
	public void informarMarca()
	{
		System.out.println("Marca: "+marca);
	}
	public void informcarModelo()
	{
		System.out.println("Modelo: "+modelo);
	}
	public void informarPolegada()
	{
		System.out.println("Polegada: "+polegada);
	}
	public void ligada()
	{
		this.ligada=true;
		System.out.println("Ligando...");
	}
	public void desligada()
	{
		this.ligada=false;
		System.out.println("Desligando...");
	}
}
