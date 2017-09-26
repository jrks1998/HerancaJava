package br.com.heranca;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaHeranca {

	@Test
	public void test() {
		Policia policia = new Policia();
		assertEquals(policia.GetNome("lucao"), "lucao");
		assertEquals(policia.GetCpf("123.456.789-10"), "123.456.789-10");
		assertEquals(policia.GetEstado(true), true);
		assertEquals(policia.GetDecisao(), true);
		
	}

}
