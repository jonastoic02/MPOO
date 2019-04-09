package login;

public class Usuario {
	public String login;
	public String senha;
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	//Destrutor Local
	public static void destrutor(Usuario usuario) {
		//this=null;
		usuario=null;
		System.gc();
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
