package br.com.heranca;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaHeranca {

	@Test
	public void test() {
		Policia policia = new Policia();
		assertEquals(policia.GetNome("eu"), "eu");
		assertEquals(policia.GetCpf("123.456.789-10"), "123.456.789-10");
		assertEquals(policia.GetEstado(), false);
		assertEquals(policia.GetDecisao(), false);
		
	}

}
