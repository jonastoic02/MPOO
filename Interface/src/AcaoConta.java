public interface AcaoConta {
	final double TAXA = 1.5;
	public boolean sacar(double valor);
	public void depositar(double valor);
	public void getSaldo();
	
}
