package Model;

public class Sindico {
	public String login = "Jonas";
	public String senha = "123";
	
	public void sindicoAdicionarMorador(String nome, String rg, String cpf, String Telefone){
		BaseDados.adicionarMorador(new Moradores(nome,rg,cpf,Telefone));
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
