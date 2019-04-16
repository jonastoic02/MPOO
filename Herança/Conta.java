package Conta;

public abstract class Conta {
	private double saldo;
		
	public boolean depositar(double valor) {
		this.saldo += valor;
		return true;
	}	
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo-= valor;
			return true;
		}
		else {
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

}
