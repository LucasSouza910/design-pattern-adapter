package round;

public class RoundPeg {
	private double radius; // Declara��o de um campo private chamado radius do tipo double
	
	public RoundPeg() {} // Construtor vazio
	
	public RoundPeg(double radius) { // Construtor que recebe um valor do tipo double como argumento
		this.radius = radius; // Atribui��o do valor recebido ao campo radius da classe
	}
	
	public double getRadius() { // M�todo p�blico que retorna um valor do tipo double
		return radius; // Retorno do valor do campo radius
	}
}
