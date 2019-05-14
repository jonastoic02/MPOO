
public class App {
	public static void main(String[] args) {
		SerHumano homem = new SerHumano();
	
		if(homem instanceof Animal) {
			System.out.println(true);
		}
		if(homem instanceof SerHumano) {
			System.out.println(true);
		}
		
		ContaCorrente contacorrente = new ContaCorrente(200);
		Conta contacorrente2 = new ContaCorrente(300);
		AcaoConta contacorrente3 = new ContaCorrente(500);
		
		System.out.println(contacorrente.getSaldo());
		System.out.println(contacorrente2.getSaldo());
		//Só acessa se tiver na interface = AcaoConta;
		//System.out.println(contacorrente3.getSaldo());
		
	}
}
