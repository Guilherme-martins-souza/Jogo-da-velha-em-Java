package jogoDaVelha;

public class JogadorHumano extends Jogar {
	int id = 0;
	String jogador;

	JogadorHumano(String s, int j) { //Construtor para criar um player.
		super(j);
		this.id = j;
		this.jogador = s;
	}

	@Override
	public String toString() { //Comando que retorna Player1 ou Player2".
		return "Player" + jogador;
	}
}
