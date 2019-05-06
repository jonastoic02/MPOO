package Model;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<Moradores> moradores = new ArrayList<Moradores>();
	
	public static boolean adicionarMorador(Moradores morador){
		if(morador != null){
			moradores.add(morador);
			return true;
		}
		return false;
	}
	
	public static Moradores buscarMorador(Moradores morador){
		if(morador != null){
			boolean verificar = moradores.contains(morador);
			if(verificar == true) {
				return morador;
			}
			else {
				return null;
			}
		}
		return null;
	}
	
	public static boolean removerMorador(Moradores morador){
		if(morador != null){
			if(buscarMorador(morador) == morador){
				moradores.remove(morador);
				return true;
			}
			else{
				return false;
			}
		}
		
		return false;
	}
	
	public static boolean atualizarMorador(Moradores moradorAtual, Moradores moradorNovo) {
		if(buscarMorador(moradorAtual) == moradorAtual) {
			moradorAtual = moradorNovo;
		}
		return false;
	}
	
	
	
}