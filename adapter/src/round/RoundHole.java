package round;

public class RoundHole {
	private double radius; // Declara��o de um campo private chamado radius do tipo double
	
	public RoundHole(double radius) { // Construtor que recebe um valor do tipo double como argumento
		this.radius = radius; // Atribui��o do valor recebido ao campo radius da classe
	}
	
	public double getRadius() { // M�todo p�blico que retorna um valor do tipo double
		return radius; // Retorno do valor do campo radius
	}
	
	public boolean fits(RoundPeg peg) { // M�todo p�blico que recebe um objeto RoundPeg como argumento e retorna um valor booleano
		boolean result; // Declara��o de uma vari�vel local chamada result do tipo boolean
		result = (this.getRadius() >= peg.getRadius()); // Verifica��o se o raio do objeto RoundHole � maior ou igual ao raio do objeto RoundPeg
		return result; // Retorno do resultado da verifica��o
	}
}
