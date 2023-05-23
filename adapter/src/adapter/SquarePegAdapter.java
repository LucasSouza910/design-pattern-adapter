package adapter;

import round.RoundPeg; // Importa��o da classe RoundPeg do pacote round
import square.SquarePeg; // Importa��o da classe SquarePeg do pacote square

public class SquarePegAdapter extends RoundPeg { // Declara��o da classe SquarePegAdapter que herda de RoundPeg
	private SquarePeg peg; // Declara��o de um campo private do tipo SquarePeg chamado peg

	public SquarePegAdapter (SquarePeg peg) { // Construtor que recebe um objeto SquarePeg como argumento
		this.peg = peg; // Atribui��o do objeto recebido ao campo peg da classe
	}
	
	@Override // Anota��o indicando que o m�todo est� sobrescrevendo um m�todo da classe pai
	public double getRadius() { // M�todo p�blico que retorna um valor do tipo double
		double result; // Declara��o de uma vari�vel local chamada result do tipo double
		result = (Math.sqrt(Math.pow((peg.getWidth() /2), 2) *2)); // C�lculo do resultado usando a largura do objeto SquarePeg
		return result; // Retorno do resultado calculado
	}
}

