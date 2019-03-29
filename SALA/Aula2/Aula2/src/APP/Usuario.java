package APP;

public class Usuario {
	// Atributos e Constantes
	// Metodos Construtores
	// Diversos
	// Getters e Setters
	
	private String email;
	private String cpf;
	private String senha;
	
	public Usuario(String email, String cpf, String senha) {
		this.email = email;
		this.cpf = cpf;
		this.senha = senha;
	}

	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public void falar() {
		System.out.println("Falei!");
	}
	
	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}
	
	
}
