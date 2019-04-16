package Conta;

public class Corrente extends Conta {
	
	
	//Quest2  - Faz sentido isso ser um comportamento do objeto?
	//public static void correrJuros(double taxa, Corrente conta)
	
	/**
	 * 
	 * @param taxa - é um valor fixo em R$
	 */
	
	public void correrJuros(double taxa) {		
		this.sacar(taxa);
		
	}
	
}
