package OriObjeto;

public class Conta {
	float saldo, transferencia, saque;
	
	public void sacar() {
		if(saque>saldo)
				System.out.println("Saldo insuficiente! Tente outra op��o");
		else
			this.saldo=this.saldo-this.saque;
				System.out.println("Opera��o realizada com sucesso!\nO Voc� sacou: R$"+this.saque+"\nE seu saldo atual �: R$"+this.saldo);
	}
	public void transferir() {
		if(transferencia>saldo)
				System.out.println("Saldo insuficiente! Tente outra op��o");
		
		else
			this.transferencia=this.transferencia-this.saldo;
	}
	public void saldoConta() {
		System.out.println("Seu saldo �: "+this.saldo);
	}
}
