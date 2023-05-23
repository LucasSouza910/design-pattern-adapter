package round;

public class RoundHole {
	private double radius; // Declaração de um campo private chamado radius do tipo double
	
	public RoundHole(double radius) { // Construtor que recebe um valor do tipo double como argumento
		this.radius = radius; // Atribuição do valor recebido ao campo radius da classe
	}
	
	public double getRadius() { // Método público que retorna um valor do tipo double
		return radius; // Retorno do valor do campo radius
	}
	
	public boolean fits(RoundPeg peg) { // Método público que recebe um objeto RoundPeg como argumento e retorna um valor booleano
		boolean result; // Declaração de uma variável local chamada result do tipo boolean
		result = (this.getRadius() >= peg.getRadius()); // Verificação se o raio do objeto RoundHole é maior ou igual ao raio do objeto RoundPeg
		return result; // Retorno do resultado da verificação
	}
}
