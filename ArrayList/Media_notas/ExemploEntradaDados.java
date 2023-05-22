package Aula_java;

import java.util.Scanner;

public class ExemploEntradaDados {
	public static void main(String[] args) {
		
		//criando um objeto da classe Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		

		
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
		System.out.println("Olá, " + nome);
	}
	
}
