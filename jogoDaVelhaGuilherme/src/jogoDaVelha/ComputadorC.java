package jogoDaVelha;

public class ComputadorC extends Jogar {
	
	int id = 2;
	int[][] jogadasProgramadas = {{1,1},{0,2},{2,2},{2,0},{0,0},{0,1},{2,1},{0,1},{1,2},{0,2}}; //Array com posições do jogo da velha.
	
	ComputadorC(int j) {
		super(j);
		this.id = j;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Computador Hard ";
	}
	
	public void computadorJoga(Jogada[][] jogada) { //Esse computador joga nas posições programadas no array.
		for(int i = 0; i < jogadasProgramadas.length; i++) {
			int p1,p2;
			p1 = jogadasProgramadas[i][0];
			p2 = jogadasProgramadas[i][1];
			if(jogada[p1][p2].getSimbolo()==' ') {
				jogada[p1][p2].setSimbolo('O');
				break;
			}else {
				continue;
			}
		}
	}
}
