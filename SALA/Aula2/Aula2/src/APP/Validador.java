package APP;

public class Validador {
	
	public static void validarUsuario(Usuario usuario) {
		if(usuario.getEmail().equalsIgnoreCase(BaseDados.getUsuario2().getEmail())){
			
			System.out.println("Welcome!");
			
		}
		
	}
	
}
