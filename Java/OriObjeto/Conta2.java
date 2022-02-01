package OriObjeto;

public class Conta2 {

	public static void main(String[] args) {
		Conta con1 = new Conta();
		
		con1.saldo = 1000f;
		con1.transferencia = 10000f;
	
		con1.transferir();
		
	}

}
