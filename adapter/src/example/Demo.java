package example;

import adapter.SquarePegAdapter; // Importação da classe SquarePegAdapter do pacote adapter
import round.RoundHole; // Importação da classe RoundHole do pacote round
import round.RoundPeg; // Importação da classe RoundPeg do pacote round
import square.SquarePeg; // Importação da classe SquarePeg do pacote square

public class Demo {
	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5); // Criação de um objeto RoundHole com raio 5
		RoundPeg rpeg = new RoundPeg(5); // Criação de um objeto RoundPeg com raio 5
		if(hole.fits(rpeg)) { // Verificação se o objeto RoundPeg se encaixa no objeto RoundHole
			System.out.println("Round peg r5 fit round r5."); // Impressão de uma mensagem
		}
		
		SquarePeg smallSqPeg = new SquarePeg(2); // Criação de um objeto SquarePeg com largura 2
		SquarePeg largeSqPeg = new SquarePeg(20); // Criação de um objeto SquarePeg com largura 20
		
		SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg); // Criação de um objeto SquarePegAdapter a partir do objeto smallSqPeg
		SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg); // Criação de um objeto SquarePegAdapter a partir do objeto largeSqPeg
		if(hole.fits(smallSqPegAdapter)) { // Verificação se o objeto SquarePegAdapter se encaixa no objeto RoundHole
			System.out.println("Square peg fits round hole r5."); // Impressão de uma mensagem
		}
		if(!hole.fits(largeSqPegAdapter)) { // Verificação se o objeto SquarePegAdapter não se encaixa no objeto RoundHole
			System.out.println("Square peg w20 does not fit into round hole r5"); // Impressão de uma mensagem
		}
	}
}

