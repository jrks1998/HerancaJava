package br.com.heranca;

public class Policia extends Cidadao{
	
	public String GetNome(String nomee) {
		return nome = nomee;
	}
	
	public String GetCPF(String cpfCidadao) {
		return cpf = cpfCidadao;
	}
	
	public boolean GetEstado() {
		return bebeu;
	}
	
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