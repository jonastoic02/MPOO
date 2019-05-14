package Funcionario;

public class App {
	public static void main(String[] args) {
		Funcionario horista = new Horista("Maria",12,10);
		Funcionario assalariado = new Assalariado("Jonas",200);
		
		System.out.println(horista.getNome() + "   " + horista.getSalario());
		System.out.println(assalariado.getNome()+ "   " + assalariado.getSalario());
	}
}
