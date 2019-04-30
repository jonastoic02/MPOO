package Model;

import java.util.Observable;

import View.TelaTeste;

public class FichaAtendimento extends Observable{
	private int numero;
	TelaTeste tela;
	
	public FichaAtendimento(TelaTeste tela) {
		super(); //G
		this.tela = tela;
	}
	public FichaAtendimento() {
		//Observer
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void modificarNumero(int numero) {
		this.numero = numero;
		setChanged();
		notifyObservers(this.numero);
	}
	
}
