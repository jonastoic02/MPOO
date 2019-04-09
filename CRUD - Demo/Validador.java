package login;

public class Validador {
	//foreach = fazer lista
	
	public static boolean validarUsuario(Usuario usuario) {
		
		//For Normal
		//No lugar do getUsuario() = recuperarUsuario()
		
//		for(int i=0; i<BaseDados.getUsuarios().size();i++){
//			if(usuario.getLogin().equals(BaseDados.getUsuarios().get(i).getLogin()) 
//					
//					&& 
//					
//					usuario.getSenha().equals(BaseDados.getUsuarios().get(i).getSenha())) {
//				
//				return true;
//			
//			}
//		
//		}
//		
//		return false;
		
		for(Usuario user: BaseDados.recuperarUsuario()) {
			if(usuario.getLogin().equalsIgnoreCase(user.getLogin()) && usuario.getSenha().equalsIgnoreCase(user.getSenha())) {
				System.out.println("Está na Base!");
				return true;
			}
		}
		return false;
	
}		
		
}