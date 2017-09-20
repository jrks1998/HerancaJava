package br.com.heranca;

public class Policia extends Cidadao{
	
	public boolean GetDecisao() {
		if (bebeu == true) {
			System.out.println("CE TA FUDIDO MEU PACERO!!");
			return true;
		} else {
			System.out.println("ta liberado");
			return false;
		}
	}
}
