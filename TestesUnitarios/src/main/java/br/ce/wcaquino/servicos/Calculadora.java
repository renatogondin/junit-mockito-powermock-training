package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.NaoDividePorZeroException;

public class Calculadora {

	public int soma(int a, int b) {
		System.out.println("Estou executando o método somar");
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
	
	public int divide(String a, String b) {
		return Integer.valueOf(a) / Integer.valueOf(b);
	}
	
	public void imprime(){
		System.out.println("Passei aqui");
	}
	
	public static void main(String[] args) {
		new Calculadora().divide("a", "b");
	}

	public int multiplica(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

}