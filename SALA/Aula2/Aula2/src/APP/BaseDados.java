package APP;

public class BaseDados {
	//static faz com que o atributo pertence a classe e n�o ao objeto, isso que significa que n�o
	//preciso inst�nciar para pegar um atributo statico.
	public static Usuario usuario = new Usuario("hotmail","12315211521","haha");
	private static Usuario usuario2 = new Usuario("hotmail","123-456-789-00","qwert12345");
	
	//N�o cabe o this, o porqu� disso � : N�O EXISTEM OBJETOS, usuario e usuario 2 pertencem a classe e n�o aos seus individuos.
	//Com static = Acessar o atributo da classe!
	public static Usuario getUsuario2() {
		return usuario2;
	}
	
	

}
