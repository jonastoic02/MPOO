package Model;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static boolean isUsuario(Usuario usuario) {
		//usuarios.contains(buscarUsuario(usuario));
			
		for (Usuario user: usuarios) {
			if(user.getLogin().equalsIgnoreCase(user.getLogin()) && user.getSenha().equalsIgnoreCase(user.getSenha())) {
				return true;
			}
			
		}
		return false;
	}

}
