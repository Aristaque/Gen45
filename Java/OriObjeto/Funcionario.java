package OriObjeto;

public class Funcionario {
	String nome;
	String endere�o;
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
		System.out.println("Segue abaixo informa��es pertinentes ao funcionario, caso identique algum erro, nos informe imediatamente!\n");
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Idade: "+this.idade);
		System.out.println("Endere�o: "+this.endere�o);
		System.out.println("Salario: R$"+this.salario);
		System.out.println("Vale transporte: "+this.vt);
		precisaVt();
		naoprecisaVt();
	}
}

