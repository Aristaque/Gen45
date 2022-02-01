package Heranca;

public class Animais {
	
		private String Nome, som;
		private int idade; 
	
			void aniversario() {
				this.idade++;
			}		

			public String getNome() {
				return Nome;
			}

			public void setNome(String nome) {
				Nome = nome;
			}

			public String getSom() {
				return som;
			}

			public void setSom(String som) {
				this.som = som;
			}

			public int getIdade() {
				return idade;
			}

			public void setIdade(int idade) {
				this.idade = idade;
			}
			}			