package square;

public class SquarePeg {
	private double width; // Declaração de um campo private chamado width do tipo double
	
	public SquarePeg(double width) { // Construtor que recebe um valor do tipo double como argumento
		this.width = width; // Atribuição do valor recebido ao campo width da classe
	}
	
	public double getWidth() { // Método público que retorna um valor do tipo double
		return width; // Retorno do valor do campo width
	}
	
	public double getSquare() { // Método público que retorna um valor do tipo double
		double result; // Declaração de uma variável local chamada result do tipo double
		result = Math.pow(this.width, 2); // Cálculo do quadrado da largura do objeto SquarePeg
		return result; // Retorno do resultado do cálculo
	}
}
