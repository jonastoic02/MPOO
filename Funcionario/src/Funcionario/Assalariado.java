package Funcionario;

public class Assalariado extends Funcionario{
	public double salario;
	
	public Assalariado(String nome, double salario) {
		super(nome);
		this.salario = salario;
		this.calcularSalario();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		this.setSalario(salario);
		return this.getSalario();
	}

}
