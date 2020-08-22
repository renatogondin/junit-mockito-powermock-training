package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;



public class AssertTest {

	@Test
	public void testar() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		Assert.assertEquals(1.1, 1.2, 0.1);
		Assert.assertEquals("bola", "bola");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola") );
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("usu1");
		Usuario u2 = new Usuario("usu1");
		Usuario u3 = null;
		//era para serem iguais, mas a assertiva não dará certo
		//até eu ir na classe Usuario e meter um equals.
		Assert.assertEquals(u1, u2);
		//só passa assim
		Assert.assertSame(u1, u1);
		Assert.assertTrue(u3 == null);
		Assert.assertNull(u3);
		Assert.assertNotNull(u1);
		assertThat(1.0, CoreMatchers.is ((1.0)));
		
	}
}
