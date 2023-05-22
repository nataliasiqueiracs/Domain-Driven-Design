package Aula7_Condicionais;

import java.util.Scanner;



public class Exercicio3 {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 3 - Aula de condicionais");
		System.out.println("Peso: ");
		double peso = input.nextDouble();
		System.out.println("Altura: ");
		double altura = input.nextDouble();
		//math.pow é para fazer o cálculo altura * altura.
		//math.pow é uma classe estática, que recebe 2 parametros
		// colocar altura,2.... o 2 significa ao quadrado.
		double massa = (peso / Math.pow(altura, 2));
				
		
		// AND -> &&
		// OR -> ||
		
		
		// printf = é um print com formatação
		System.out.printf("Massa corpórea: %.1f \n", massa);
				
		if (massa <= 18.5) {
			System.out.println("Abaixo do peso!");
		}else if (massa > 18.5 && massa <25) {
			System.out.println("Parabéns, está no peso ideal!");
		}else if (massa >= 25 && massa < 30) {
			System.out.println("Levemente acima do peso.");
		}else if (massa >= 30 && massa < 35) {
			System.out.println("Obesidade - Grau I");
		}else if (massa >= 35 && massa < 40) {
			System.out.println("Obesidade - Grau II (Severa)");
		}else {
			System.out.println("Obesidade - Grau III (Mórbida)");
		}

		
	}

}
