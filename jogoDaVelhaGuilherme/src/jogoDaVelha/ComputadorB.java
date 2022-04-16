package jogoDaVelha;

import java.util.Random;

public class ComputadorB extends Jogar {
	int id = 2;

	ComputadorB(int j) {
		super(j);
		this.id = j;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Computador Medium ";
	}
	
	
	// Esse bot verifica jogadas horizontais e diagonais tenta impedir
	// o player de ganhar, se o player não estiver perto de ganhar joga aleatoriamente..
	// não verifica jogadas verticais.
	public void computadorJoga(Jogada[][] jogada) { 
		Random r = new Random();					
		int p[] = new int[2];
		if(jogada[0][0].getSimbolo()=='X' && jogada[0][1].getSimbolo()=='X' && jogada[0][2].getSimbolo()==' '){
			jogada[0][2].setSimbolo('O');
		}
		else if(jogada[0][1].getSimbolo()=='X' && jogada[0][2].getSimbolo()=='X' && jogada[0][0].getSimbolo()==' '){
			jogada[0][0].setSimbolo('O');
		}
		else if(jogada[0][0].getSimbolo()=='X' && jogada[0][2].getSimbolo()=='X' && jogada[0][1].getSimbolo()==' '){
			jogada[0][1].setSimbolo('O');
		}
		else if(jogada[2][0].getSimbolo()=='X' && jogada[1][1].getSimbolo()=='X' && jogada[0][2].getSimbolo()==' '){
			jogada[0][2].setSimbolo('O');
		}
		else if(jogada[2][2].getSimbolo()=='X' && jogada[1][1].getSimbolo()=='X' && jogada[0][0].getSimbolo()==' '){
			jogada[0][0].setSimbolo('O');
		}
		else if(jogada[1][0].getSimbolo()=='X' && jogada[1][1].getSimbolo()=='X' && jogada[1][2].getSimbolo()==' '){
			jogada[1][2].setSimbolo('O');
		}
		else if(jogada[1][1].getSimbolo()=='X' && jogada[1][2].getSimbolo()=='X' && jogada[1][0].getSimbolo()==' '){
			jogada[1][0].setSimbolo('O');
		}
		else if(jogada[1][0].getSimbolo()=='X' && jogada[1][2].getSimbolo()=='X' && jogada[1][1].getSimbolo()==' '){
			jogada[1][1].setSimbolo('O');
		}
		else if(jogada[2][0].getSimbolo()=='X' && jogada[2][1].getSimbolo()=='X' && jogada[2][2].getSimbolo()==' '){
			jogada[2][2].setSimbolo('O');
		}
		else if(jogada[2][1].getSimbolo()=='X' && jogada[2][2].getSimbolo()=='X' && jogada[2][0].getSimbolo()==' '){
			jogada[2][0].setSimbolo('O');
		}
		else if(jogada[2][1].getSimbolo()=='X' && jogada[2][2].getSimbolo()=='X' && jogada[2][1].getSimbolo()==' '){
			jogada[2][1].setSimbolo('O');
		}
		else if(jogada[0][0].getSimbolo()=='X' && jogada[1][1].getSimbolo()=='X' && jogada[2][2].getSimbolo()==' '){
			jogada[2][2].setSimbolo('O');
		}
		else if(jogada[1][1].getSimbolo()=='X' && jogada[1][2].getSimbolo()=='X' && jogada[2][0].getSimbolo()==' '){
			jogada[2][0].setSimbolo('O');
		}
		else {
			while(true) {
				p[0] = r.nextInt(3);
				p[1] = r.nextInt(3);
				if (jogada[p[0]][p[1]].getSimbolo() == ' ') {
					jogada[p[0]][p[1]].setSimbolo('O');
					break;
				}else {
					continue;
				}
			}
		}
	}
}
