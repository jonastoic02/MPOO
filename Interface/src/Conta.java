public abstract class Conta implements AcaoConta {
	private double saldo;
	
	public Conta(double saldo) {
		
		this.saldo = saldo;
	}
	
	@Override
	public boolean sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
		return false;
	}
	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
