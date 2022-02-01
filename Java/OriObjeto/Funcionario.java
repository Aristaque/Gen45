package OriObjeto;

public class Funcionario {
	String nome;
	String endereço;
	String cpf;
	int idade;
	float salario;
	boolean vt;
	
	public void precisaVt() {
		this.vt=true;
	}
	public void naoprecisaVt() {
		this.vt=false;
	}
	public void vt() {
		if(this.vt==true)
			System.out.println("Passe no RH para solicitar o vale transporte");
		else
			System.out.println("Caso posteiormente precise solicitar, entre em contato com o RH");
	}
	public void status() {
		System.out.println("Segue abaixo informações pertinentes ao funcionario, caso identique algum erro, nos informe imediatamente!\n");
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Idade: "+this.idade);
		System.out.println("Endereço: "+this.endereço);
		System.out.println("Salario: R$"+this.salario);
		System.out.println("Vale transporte: "+this.vt);
		precisaVt();
		naoprecisaVt();
	}
}

