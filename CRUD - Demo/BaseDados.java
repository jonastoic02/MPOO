package login;

import java.util.ArrayList;

public class BaseDados {
	//N�O DEPENDE DA CRIA��O BASEDADOS, N�O DEPENDE DO TODO
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();	
	//.add .remove .get .size
	
	//OPERA��ES CRUD

	public static boolean adicionarUsuario(Usuario usuario) {
			return usuarios.add(usuario);		
		
		//Quest 02
		//Regras Neg�cios
		//RF01 - S� add se um usu�rio n�o existir
		//RF02 - S� add se for um us�ario v�lido
		
	}
	public static boolean removerUsuario(Usuario usuario) {
		if(recuperarUsuario(usuario.getLogin())!=null) {
			return usuarios.remove(recuperarUsuario(usuario.getLogin()));
		}
		else {
			return false;
		}
		
	}
	
	public static ArrayList<Usuario> recuperarUsuario(){
		return usuarios;
	}
	
	public static Usuario recuperarUsuario(String login){
		for(Usuario usuario: usuarios) {
			if (usuario.getLogin().equalsIgnoreCase(login)) {
				return usuario;
			}
		}
		return null;
	}
	
	public static boolean editarUsuario(Usuario usuarioAtual, Usuario usuarioNovo) {
		//Remover atual e Add o novo
		
		Usuario atual;
		atual = recuperarUsuario(usuarioAtual.getLogin());
		
		usuarios.remove(atual);
		usuarios.add(usuarioNovo);
		
		return true;
	}
	
	public static void consultarUsuario() {
		
	}
	
	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	
}