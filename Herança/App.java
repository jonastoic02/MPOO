package Conta;

public class App extends Servico{
	
	//Herança, Classe Abstrata, uso do super, herança do construtor, final
	//Polimorfismo de Objeto(Herança)

	public static void main(String[] args) {
		/*vamos criar
		 * 	uma corrente de 30 de saldo
		 * uma poupança de 1000 de saldo
		 * tirar dinehiro da corrente 10%
		 * colocar dinheiro na poupança 0,67%
		 * depositar 1 real em cada conta
		 * sacar 10 real de cada conta
		*/
		Corrente corrente = new Corrente();
		corrente.depositar(30);
		
		Poupanca poupanca = new Poupanca();
		poupanca.depositar(1000);
		
		corrente.correrJuros(10);
		poupanca.renderJuros(0.67);
		
		corrente.depositar(1);
		poupanca.depositar(1);
		
		corrente.sacar(10);
		poupanca.sacar(10);
		
		Servico.transferir(poupanca, corrente , 100);
		
		System.out.println(corrente.getSaldo());
		System.out.println(poupanca.getSaldo());
		
		//QUEST - Se eu precisar tratar o pai como um filho
		//QUEST - Como fazer para ver o dv?
		
	}

} 
