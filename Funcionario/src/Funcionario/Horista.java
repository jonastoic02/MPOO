package Funcionario;

public class Horista extends Funcionario {
	
	private int hora;
	private double valorhora;
	
	public Horista(String nome,int hora, double valorhora) {
		super(nome);
		this.hora = hora;
		this.valorhora = valorhora;
		this.calcularSalario();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		this.setSalario(this.valorhora * this.hora);
		return this.getSalario();
	}

}
