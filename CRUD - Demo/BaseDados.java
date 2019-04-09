package login;

import java.util.ArrayList;

public class BaseDados {
	//NÃO DEPENDE DA CRIAÇÃO BASEDADOS, NÃO DEPENDE DO TODO
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();	
	//.add .remove .get .size
	
	//OPERAÇÕES CRUD

	public static boolean adicionarUsuario(Usuario usuario) {
			return usuarios.add(usuario);		
		
		//Quest 02
		//Regras Negócios
		//RF01 - Só add se um usuário não existir
		//RF02 - Só add se for um usúario válido
		
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