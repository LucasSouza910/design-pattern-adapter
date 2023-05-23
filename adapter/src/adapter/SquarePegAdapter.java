package adapter;

import round.RoundPeg; // Importação da classe RoundPeg do pacote round
import square.SquarePeg; // Importação da classe SquarePeg do pacote square

public class SquarePegAdapter extends RoundPeg { // Declaração da classe SquarePegAdapter que herda de RoundPeg
	private SquarePeg peg; // Declaração de um campo private do tipo SquarePeg chamado peg

	public SquarePegAdapter (SquarePeg peg) { // Construtor que recebe um objeto SquarePeg como argumento
		this.peg = peg; // Atribuição do objeto recebido ao campo peg da classe
	}
	
	@Override // Anotação indicando que o método está sobrescrevendo um método da classe pai
	public double getRadius() { // Método público que retorna um valor do tipo double
		double result; // Declaração de uma variável local chamada result do tipo double
		result = (Math.sqrt(Math.pow((peg.getWidth() /2), 2) *2)); // Cálculo do resultado usando a largura do objeto SquarePeg
		return result; // Retorno do resultado calculado
	}
}

