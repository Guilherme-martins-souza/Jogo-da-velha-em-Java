package jogoDaVelha;

public abstract class Jogar {
	
	// Classe abstract que ter� os metodos padr�es de JogadorHumano,
	// ComputadorA, ComputadorB e ComputadorC.
	int id;
		
	Jogar(int j){
		this.id =j;
	}
	
	public void computadorJoga(Jogada[][] jogada) {  //Esse met�do ser� implementado por cada computador em sua devia classe.
	
	}
}
