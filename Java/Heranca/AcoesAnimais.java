package Heranca;

public class AcoesAnimais {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo pe = new Cavalo();
		Preguica cid = new Preguica();
		
		dog.setNome("Bidu");
		dog.setIdade(20);
		dog.setSom("AUUUUUUUUUUU DIDI");
		dog.setCorrer("Morder");
		
		pe.setNome("Pé de pano");
		pe.setIdade(35);
		pe.setSom("IIIIIIIRIRIIIIII");
		pe.setTrota("Trotar");
		
		cid.setNome("CID");
		cid.setIdade(14);
		cid.setSom("Estou com sono");
		cid.setDorme("Dormir");
		
		System.out.println("Meus animais e algumas informações sobre eles:");
		System.out.println("\n");
		
		System.out.println("Meu cachorro se chama: "+dog.getNome());
		System.out.println("Ele tem: "+dog.getIdade()+" anos");
		System.out.println("Ele faz uma barulho mais ou menos assim: "+dog.getSom());
		System.out.println("O que ele mais gosta de fazer? "+dog.getCorrer());
		
		System.out.println("\n");
		
		System.out.println("Meu cavalo se chama: "+pe.getNome());
		System.out.println("Ele tem: "+pe.getIdade()+" anos");
		System.out.println("O barulho que ele faz é assim: "+pe.getSom());
		System.out.println("O que ele ama fazer? "+pe.getTrota());
		
		System.out.println("\n");
		
		System.out.println("Minha preguiça se chama: "+cid.getNome());
		System.out.println("Ela tem: "+cid.getIdade()+" anos");
		System.out.println("Ela sempre diz: "+cid.getSom());
		System.out.println("O que ela mais gosta de fazer? "+cid.getDorme());

	}

}
