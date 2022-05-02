package jogoDaVelha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int dificuldade; 						  //Vari�vel que portar� as dificuldades do jogo.
		
		Tabuleiro tab = new Tabuleiro();		  //Cria um objeto da classe tabuleiro.
		Scanner teclado = new Scanner(System.in); //M�todo scanner do java �til, para capturar input do usu�rio.
		
		//Um pouco de contexto.
		System.out.println("              JOGO DA VELHA");
		System.out.println();
		System.out.println("Escolha a Dificuldade Do computador 1 , 2 ou 3 ...");
		System.out.println("Escolha 0 para jogar contra Player 2.");
		
		dificuldade = teclado.nextInt(); //Passando o input do jogador para a vari�vel dificuldade.
		
		// la�o de repeti��o que ir� verificar se a dificuldade escolhida � valida, criara os jogadores e
		// chamara o metodo "jogar" da classe tabuleiro.
		while(true) {
			if (dificuldade == 0) {
				System.out.println("Voc� escolheu a Dificuldade 0 e jogar� contra o Player 2");
				Jogar j1 = new JogadorHumano("1",0); //Cria o player 1 "j1" que fica definido como jogador 1
				Jogar j2 = new JogadorHumano("2",1); //Cria o player 2 "j2" que fica definido como jogador 0
				tab.jogar(j1, j2);
				break;
			}
			else if (dificuldade==1) {
				System.out.println("Voc� escolheu a Dificuldade 1 e jogar� contra o computador no Easy.");
				Jogar j1 = new JogadorHumano("1",2); //Cria o player 1 "j1"  que fica definido como jogador 2
				Jogar j2 = new ComputadorA(3);  	 //Cria computadorA "j2" que fica definido como jogador 3
				tab.jogar(j1, j2);
				break;
			}
			else if(dificuldade==2) {
				System.out.println("Voc� escolheu a Dificuldade 2 e jogar� contra o computador no Medium. ");
				Jogar j1 = new JogadorHumano("1",2); //Cria o player 1 "j1"  que fica definido como jogador 2
				Jogar j2 = new ComputadorB(3);		 //Cria computadorB "j2" que fica definido como jogador 3
				tab.jogar(j1, j2);
				break;
			}
			else if(dificuldade==3) {
				System.out.println("Voc� escolheu a Dificuldade 3 e jogar� contra o computador no Hard.");
				Jogar j1 = new JogadorHumano("1",2); //Cria o player 1 "j1"  que fica definido como jogador 2
				Jogar j2 = new ComputadorC(3);		 //Cria computadorC "j2" que fica definido como jogador 3
				tab.jogar(j1, j2);
				break;
			}
			else {
				System.out.println("Voc� escolheu uma dificuldade que n�o existe,");
				System.out.println("Escolha uma nova dificuldade.");
				dificuldade = teclado.nextInt(); // Caso a dificuldade seja invalida, recebe outra.
				continue;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
