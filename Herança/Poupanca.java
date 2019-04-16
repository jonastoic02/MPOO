package Conta;

public class Poupanca extends Conta{
	private final int dv = 51;//Exemplo assumindo 51
	
	//Quest2 - e se fosse 1 e 51, como ficaria?
	
	/*public Poupanca(){
	*	this.dv = 51;
	}
	*/
	
	/**
	 * Método para renderJuros mensais!
	 * @param taxa - valor em % da taxa a ser acrescida
	 * @return true se sucesso. false se fracasso!
	 */
	public boolean renderJuros(double taxa) {
		this.depositar((this.getSaldo()*taxa)/100);
		return true;
	}
}
