package jogoDaVelha;

import java.util.Random;

public class ComputadorA extends Jogar {
	int id = 2;

	ComputadorA(int j) { //Construtor para criar um computador.
		super(j);
		this.id = j;
	}
	
	@Override
	public String toString() {     //Comando que retorna "Computador Easy".
		return "Computador Easy ";
	}
	
	public void computadorJoga(Jogada[][] jogada) { // Método bem simples que fará esse computador jogar aleatoriamente.
		int[] p=new int[2];
		Random r = new Random();
		while(true) {
		p[0] = r.nextInt(3);
		p[1] = r.nextInt(3);
		if (jogada[p[0]][p[1]].getSimbolo() == ' ') {
			jogada[p[0]][p[1]].setSimbolo('O');
			break;
		}else{
			continue;
			}
		}
	}
}
