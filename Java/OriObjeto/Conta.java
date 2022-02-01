package OriObjeto;

public class Conta {
	float saldo, transferencia, saque;
	
	public void sacar() {
		if(saque>saldo)
				System.out.println("Saldo insuficiente! Tente outra opção");
		else
			this.saldo=this.saldo-this.saque;
				System.out.println("Operação realizada com sucesso!\nO Você sacou: R$"+this.saque+"\nE seu saldo atual é: R$"+this.saldo);
	}
	public void transferir() {
		if(transferencia>saldo)
				System.out.println("Saldo insuficiente! Tente outra opção");
		
		else
			this.transferencia=this.transferencia-this.saldo;
	}
	public void saldoConta() {
		System.out.println("Seu saldo é: "+this.saldo);
	}
}
