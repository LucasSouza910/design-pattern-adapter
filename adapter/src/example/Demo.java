package example;

import adapter.SquarePegAdapter; // Importa��o da classe SquarePegAdapter do pacote adapter
import round.RoundHole; // Importa��o da classe RoundHole do pacote round
import round.RoundPeg; // Importa��o da classe RoundPeg do pacote round
import square.SquarePeg; // Importa��o da classe SquarePeg do pacote square

public class Demo {
	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5); // Cria��o de um objeto RoundHole com raio 5
		RoundPeg rpeg = new RoundPeg(5); // Cria��o de um objeto RoundPeg com raio 5
		if(hole.fits(rpeg)) { // Verifica��o se o objeto RoundPeg se encaixa no objeto RoundHole
			System.out.println("Round peg r5 fit round r5."); // Impress�o de uma mensagem
		}
		
		SquarePeg smallSqPeg = new SquarePeg(2); // Cria��o de um objeto SquarePeg com largura 2
		SquarePeg largeSqPeg = new SquarePeg(20); // Cria��o de um objeto SquarePeg com largura 20
		
		SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg); // Cria��o de um objeto SquarePegAdapter a partir do objeto smallSqPeg
		SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg); // Cria��o de um objeto SquarePegAdapter a partir do objeto largeSqPeg
		if(hole.fits(smallSqPegAdapter)) { // Verifica��o se o objeto SquarePegAdapter se encaixa no objeto RoundHole
			System.out.println("Square peg fits round hole r5."); // Impress�o de uma mensagem
		}
		if(!hole.fits(largeSqPegAdapter)) { // Verifica��o se o objeto SquarePegAdapter n�o se encaixa no objeto RoundHole
			System.out.println("Square peg w20 does not fit into round hole r5"); // Impress�o de uma mensagem
		}
	}
}

