package ListaExercicios2;

import java.util.Scanner;

public class exWhile {
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = input.nextInt();
		System.out.println("Você digitou o número: " + n);
		
		int i = 1;
		int soma = 0;
		
		while (i<=n) {
			soma +=1;
			i++;
		}
		 System.out.println("A soma de todos os números inteiros de 1 até " + n + " é igual à " + soma + ".");
	
		
	}
}
