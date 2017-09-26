package br.com.heranca;

public class Cidadao {
	String nome;
	String cpf;
	boolean bebeu;
	
	public String GetNome() {
		return this.nome;
	}
	
	public String GetCpf() {
		return this.cpf;
	}
	
	public boolean GetEstado() {
		return bebeu;
	}
	
	public String Nome(String nomee) {
		return nome = nomee;
	}
	
	public String CPF(String cpfCidadao) {
		return cpf = cpfCidadao;
	}
	
	public boolean Estado(boolean cachaca) {
		return bebeu = cachaca;
	}

}
