package ExerciciosLista1;

import java.util.Scanner;

public class testeRetangulo {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		
		input = new Scanner(System.in);
		
		System.out.println("Digite a largura da forma: ");
		float l1 = input.nextFloat();
		
		System.out.println("Digite a altura da forma: ");
		float a1 = input.nextFloat();
		
	
		
		System.out.println(r1.calcularArea(a1, l1));
		
		
	}
}
