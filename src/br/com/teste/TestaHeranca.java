package br.com.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.heranca.Policia;

public class TestaHeranca {
	Policia policia;
	
	@Before
	public void before() {
		policia = new Policia();
	}

	@Test
	public void testaNome() {
		policia.Nome("Lucao");
		assertEquals(policia.GetNome(), "Lucao");
		}
	
	public void testaCpf() {
		policia.CPF("123.456.789-10");
		assertEquals(policia.GetCpf(), "123.456.789-10");
	}
	
	public void testaEstado() {
		policia.Estado(true);
		assertEquals(policia.GetEstado(), true);
	}
	
	public void testaDecisao() {
		policia.Estado(true);
		assertEquals(policia.GetDecisao(), true);
	}
	
}


