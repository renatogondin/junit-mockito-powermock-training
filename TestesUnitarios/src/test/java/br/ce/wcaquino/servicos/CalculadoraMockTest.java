package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class CalculadoraMockTest {

	@Test
	public void teste(){
		Calculadora calc = Mockito.mock(Calculadora.class);
		Mockito.when(calc.soma(Mockito.eq(1), Mockito.anyInt())).thenReturn(5);
		
		
		
		Assert.assertEquals(5, calc.soma(1, 100000));
	}
}