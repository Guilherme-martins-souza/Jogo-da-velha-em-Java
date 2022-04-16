package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {

	Scanner teclado = new Scanner(System.in);
	Random random = new Random(); // M�todo random do java �til, decidir� quem sera o primeiro a jogar.

	private int jogador = random.nextInt(2); // Receber� um n�mero 0 ou 1, sendo 0 = O e 1 = X.
	private boolean partidaRolando = true; // Um boolean true s� para iniciar while a onde acontece o jogo.
	private char simboloAtual = ' ';
	private int numeroRodada = 0; // Guarda o n�mero de rodadas j� jogadas.
	private Jogada[][] jogada = new Jogada[3][3]; // Cria um objeto "jogada" da classe Jogada, que basicamente armazena a
												// jogada do jogador/maquina.

	private void tutorial() { // Comando para mostrar um mini tutorialzinho.
		System.out.println(" ");
		System.out.println("Para jogar escolha o numero Coluna e o Numero andar cujo,");
		System.out.println("deseja adicionar seu simbolo.");
		System.out.println(" ");
		System.out.println("     C o l u n a s ");
		System.out.println("A | --------------->  Ex: Jogar 1 2 .");
		System.out.println("n |    0  1  2    ");
		System.out.printf("d |  0 %c| %c |%c \n", ' ', ' ', ' ');
		System.out.println("a |   _________   ");
		System.out.printf("r |  1 %c| %c |%c \n", ' ', ' ', ' ');
		System.out.println("e |   _________   ");
		System.out.printf("s V  2 %c| %c |%c \n", ' ', 'X', ' ');
		System.out.println("");
	}

	private void tabelaVelha(Jogada[][] jogada) { // Comando que cria a tabela do jogo da velha.
		System.out.println("   0   1  2   ");
		System.out.printf(" 0 %c| %c |%c \n", jogada[0][0].getSimbolo(), jogada[0][1].getSimbolo(),
				jogada[0][2].getSimbolo());
		System.out.println("  _________   ");
		System.out.printf(" 1 %c| %c |%c \n", jogada[1][0].getSimbolo(), jogada[1][1].getSimbolo(),
				jogada[1][2].getSimbolo());
		System.out.println("  _________   ");
		System.out.printf(" 2 %c| %c |%c \n", jogada[2][0].getSimbolo(), jogada[2][1].getSimbolo(),
				jogada[2][2].getSimbolo());
	}

	private String ganhador(Jogada[][] jogada) { // Esse m�todo serve para verificar as jogadas j� feita e se
														// algu�m, j� venceu.
		if (jogada[0][0].getSimbolo() == 'X' && jogada[0][1].getSimbolo() == 'X' && jogada[0][2].getSimbolo() == 'X'|| 
			jogada[1][0].getSimbolo() == 'X' && jogada[1][1].getSimbolo() == 'X' && jogada[1][2].getSimbolo() == 'X'|| 
			jogada[2][0].getSimbolo() == 'X' && jogada[2][1].getSimbolo() == 'X' && jogada[2][2].getSimbolo() == 'X'|| 
			jogada[0][0].getSimbolo() == 'X' && jogada[1][0].getSimbolo() == 'X' && jogada[2][0].getSimbolo() == 'X'|| 
			jogada[0][1].getSimbolo() == 'X' && jogada[1][1].getSimbolo() == 'X' && jogada[2][2].getSimbolo() == 'X'|| 
			jogada[2][0].getSimbolo() == 'X' && jogada[2][1].getSimbolo() == 'X' && jogada[2][2].getSimbolo() == 'X'|| 
			jogada[0][0].getSimbolo() == 'X' && jogada[1][1].getSimbolo() == 'X' && jogada[2][2].getSimbolo() == 'X'|| 
			jogada[2][0].getSimbolo() == 'X' && jogada[1][1].getSimbolo() == 'X' && jogada[0][2].getSimbolo() == 'X') {
			return "X";
		} else if (
			jogada[0][0].getSimbolo() == 'O' && jogada[0][1].getSimbolo() == 'O' && jogada[0][2].getSimbolo() == 'O'||
			jogada[1][0].getSimbolo() == 'O' && jogada[1][1].getSimbolo() == 'O' && jogada[1][2].getSimbolo() == 'O'|| 
			jogada[2][0].getSimbolo() == 'O' && jogada[2][1].getSimbolo() == 'O' && jogada[2][2].getSimbolo() == 'O'||
			jogada[0][0].getSimbolo() == 'O' && jogada[1][0].getSimbolo() == 'O' && jogada[2][0].getSimbolo() == 'O'||
			jogada[0][1].getSimbolo() == 'O' && jogada[1][1].getSimbolo() == 'O' && jogada[2][2].getSimbolo() == 'O'||
			jogada[2][0].getSimbolo() == 'O' && jogada[2][1].getSimbolo() == 'O' && jogada[2][2].getSimbolo() == 'O'||
			jogada[0][0].getSimbolo() == 'O' && jogada[1][1].getSimbolo() == 'O' && jogada[2][2].getSimbolo() == 'O'||
			jogada[2][0].getSimbolo() == 'O' && jogada[1][1].getSimbolo() == 'O' && jogada[0][2].getSimbolo() == 'O') {
			return "O";
		} else {
			return " ";
		}
	}

	public void jogar(Jogar j1, Jogar j2) { // Esse � o m�todo que junta tudo e faz o jogo funcionar.
		System.out.println();
		System.out.println(j1.toString());
		System.out.println("Versus:");
		System.out.println(j2.toString());
		System.out.println();
		tutorial();
		iniciarJogo(jogada);
		while (isPartidaRolando() == true) { // Um la�o de repeti��o que pega o input do jogador/computador e s� termina
											// quando houver vitoria/empate.
			if (ganhador(jogada) == "X" || ganhador(jogada) == "O") { // verifica ganhador
				System.out.println("Ganhador � : " + ganhador(jogada));
				break;
			} else if (getNumeroRodada() != 9) {
				if (j1.id == 0 && j2.id == 1) { // Esse if s� acontece se jogador for equivalente a zero, ou seja
												// dificuldade 0, que serve para jogar com 2 Players.
					if (getJogador() == 0) {
						setSimboloAtual('X');
						System.out.println("Jogador " + getSimboloAtual());
						if (getJogada(jogada, setJogada(teclado), getSimboloAtual()) == true) {
							tabelaVelha(jogada);
							setJogador(getJogador() + 1);
							setNumeroRodada(getNumeroRodada() + 1);
							System.out.println("");
							continue;
						} else {
							System.out.println("Jogada invalida, campo j� preenchido.");
							continue;
						}
					}
					if (getJogador() == 1) {
						setSimboloAtual('O');
						System.out.println("Jogador " + getSimboloAtual());
						if (getJogada(jogada, setJogada(teclado), getSimboloAtual()) == true) {
							tabelaVelha(jogada);
							setJogador(getJogador() - 1);
							setNumeroRodada(getNumeroRodada() + 1);
							System.out.println("");
							continue;
						} else {
							System.out.println("Jogada invalida, campo j� preenchido.");
							continue;
						}
					}
				} else if (j1.id == 2 && j2.id == 3) { // Aqui � onde o player 1, enfrentar� os computadores.
					if (getJogador() == 0) {
						setSimboloAtual('X');
						System.out.println("Sua vez jogador X !!!");
						/*
						 * Esse if abaixo � onde "Acontece tudo", vai chamar todos os m�todos que
						 * precisa, "getJogada" � o m�todo que pega a jogada do jogador e verifica a
						 * mesma, "setJogada" captura o input do jogador e transforma numa jogada.
						 */
						if (getJogada(jogada, setJogada(teclado), getSimboloAtual()) == true) {
							tabelaVelha(jogada);
							setJogador(getJogador() + 1);
							setNumeroRodada(getNumeroRodada() + 1);
							System.out.println("");
							continue;
						} else {
							System.out.println("Jogada invalida, campo j� preenchido.");
							continue;
						}
					} else if (getJogador() == 1) {
						System.out.println("Vez do robo O !!!");
						System.out.println(" ");
						setSimboloAtual('O');
						j2.computadorJoga(jogada);
						tabelaVelha(jogada);
						setJogador(getJogador() - 1);
						setNumeroRodada(getNumeroRodada() + 1);
						System.out.println("");
						continue;
					}
				}

			} else {
				System.out.println("Empate");
				break;
			}
		}
	}

	// Esse m�todo verifica se a jogada do Player/maquina � valida.
	private boolean getJogada(Jogada[][] jogada, int[] p, char simboloAtual) {
		if (jogada[p[0]][p[1]].getSimbolo() == ' ') {
			jogada[p[0]][p[1]].setSimbolo(simboloAtual);
			return true;
		} else {
			return false;
		}
	}

	// Esse m�todo pega o input do jogador e transforma numa jogada.
	private int[] setJogada(Scanner teclado) {
		int[] p = new int[2];
		System.out.println("Informe o andar:");
		p[0] = teclado.nextInt();
		System.out.println("Informe a coluna:");
		p[1] = teclado.nextInt();
		return p;
	}

	private void iniciarJogo(Jogada[][] jogada) { // m�todo que inicializa a matriz jogada.
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				jogada[l][c] = new Jogada();
			}
		}
	}
	
	public int getJogador() {
		return jogador;
	}

	public void setJogador(int jogador) {
		this.jogador = jogador;
	}

	public char getSimboloAtual() {
		return simboloAtual;
	}

	public void setSimboloAtual(char simboloAtual) {
		this.simboloAtual = simboloAtual;
	}

	public int getNumeroRodada() {
		return numeroRodada;
	}

	public void setNumeroRodada(int numeroRodada) {
		this.numeroRodada = numeroRodada;
	}

	public boolean isPartidaRolando() {
		return partidaRolando;
	}

	public void setPartidaRolando(boolean partidaRolando) {
		this.partidaRolando = partidaRolando;
	}
}
