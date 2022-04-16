package jogoDaVelha;

public class Jogada {
	private char simbolo;
	
	public Jogada() {
		this.simbolo = ' ';
	}

	public char getSimbolo() { //Getter de simbolo.
		return simbolo;
	}

	public void setSimbolo(char s) {  // Setter de simbolo.
		if (this.getSimbolo()==' ') {
			simbolo = s;
		}
		else {
			System.out.println("Alguem ja jogou nessa posição");
		}
	}
}
