package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.exceptions.NaoDividePorZeroException;

public class CalculadoraTest {
	
	private Calculadora calc;
	
	@Before
	public void setUp() {
	calc = new Calculadora();
	}
	@Test
	public void deveSomarDoisValores() {
		//cenário
		int a = 5;
		int b = 3;
		
		//ação
		int soma = calc.soma(a, b);
		//verificação
		Assert.assertEquals(8, soma);
	}
	@Test
	public void deveSubtrairDoisValores() {
		//cenário
		int a = 10;
		int b = 4;
		
		//ação
		int subtrai = calc.subtrai(a, b);
		//verificação
		Assert.assertEquals(6, subtrai);
	}
	@Test
	public void deveDividirDoisValores() throws NaoDividePorZeroException {
		//cenário
		int a = 6;
		int b = 3;
		
		//ação
		int divisao = calc.divide(a , b);
		Assert.assertEquals(2, divisao);
		
		}
	@Test
	public void deveMultiplicarDoisValores() {
		//cenário
		int a = 3;
		int b = 5;
		Calculadora calc = new Calculadora();
		//ação
		int mult = calc.multiplica(a, b);
		Assert.assertEquals(15, mult);
	}
	@Test(expected = NaoDividePorZeroException.class)
	public void naoDeveDividirPorZero() throws NaoDividePorZeroException {
		int a = 3;
		int b = 0;
		
		
		calc.divide(a, b);
	}

}
