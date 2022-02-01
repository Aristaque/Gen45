//1 - Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.


package OriObjeto;

public class Cliente {

	String nome;
	int idade;
	String telefone;
	String cpf;
	String rua;
	
	public void digitarNome()
		{
		System.out.println("Nome: "+this.nome);
	}
	public void digitarIdade() 
		{
		System.out.println("Idade: "+this.idade);
	}
	public void digitarCpf()
		{
		System.out.println("CPF: "+this.cpf);
	}
	public void digitarTelefone()
		{
		System.out.println("Telefone: "+this.telefone);
	}
	public void digitarRua()
		{
		System.out.println("Rua: "+this.rua);
	}
}


