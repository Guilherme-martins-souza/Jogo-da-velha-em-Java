package jogoDaVelha;

public abstract class Jogar {
	
	// Classe abstract que terá os metodos padrões de JogadorHumano,
	// ComputadorA, ComputadorB e ComputadorC.
	int id;
		
	Jogar(int j){
		this.id =j;
	}
	
	public void computadorJoga(Jogada[][] jogada) {  //Esse metódo será implementado por cada computador em sua devia classe.
	
	}
}
