package square;

public class SquarePeg {
	private double width; // Declara��o de um campo private chamado width do tipo double
	
	public SquarePeg(double width) { // Construtor que recebe um valor do tipo double como argumento
		this.width = width; // Atribui��o do valor recebido ao campo width da classe
	}
	
	public double getWidth() { // M�todo p�blico que retorna um valor do tipo double
		return width; // Retorno do valor do campo width
	}
	
	public double getSquare() { // M�todo p�blico que retorna um valor do tipo double
		double result; // Declara��o de uma vari�vel local chamada result do tipo double
		result = Math.pow(this.width, 2); // C�lculo do quadrado da largura do objeto SquarePeg
		return result; // Retorno do resultado do c�lculo
	}
}
