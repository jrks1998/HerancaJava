package br.com.heranca;

public class Policia extends Cidadao {
	
	public boolean GetDecisao() {
		if (bebeu == true) {
			System.out.println("Senhor " + nome + ", o senhor está preso por dirijir alcoolizado!");
			return true;
		} else {
			System.out.printf("Senhor " + nome + ", o senhor está liberado!");
			return false;
		}
	}
}
