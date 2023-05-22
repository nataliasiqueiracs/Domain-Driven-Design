package ExerciciosLista1;

public class Retangulo {

	private double altura;
	private double largura;
		
		
	public Retangulo(){
		System.out.println("Objeto Retângulo criado!");
	}
	
	public Retangulo(double altura, double largura){
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double calcularArea(double altura, double largura){
		return altura * largura;
	}
		
	public double calcularPerimetro(double altura, double largura){
		return 4 * largura;
	}
	
	public void calcularLadosIguais(double altura, double largura){
		if (largura == altura){
			System.out.println("É um quadrado");
		} else {
			System.out.println("Não é um quadrado");
		}
		
	}
}
