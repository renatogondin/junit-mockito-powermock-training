package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.NaoDividePorZeroException;

public class Calculadora {

	public Calculadora() {
		
	}
	
	public int soma(int a , int b) {
		return a + b;
	}

	public int subtrai(int a, int b) {
		
		return a - b;
	}

	public int divide(int a, int b) throws NaoDividePorZeroException {
		
		if(b == 0) {
			throw new NaoDividePorZeroException();
		}
		
		return a / b;
	}

	public int multiplica(int a, int b) {
		
		return a * b;
	}
}
