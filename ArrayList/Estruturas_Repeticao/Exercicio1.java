package Aula8_Repeticao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
			
			System.out.println("Início: ");
			int inicio = input.nextInt();
			
			System.out.println("Fim: ");
			int fim = input.nextInt();
		
			if(inicio < fim) {
				for(int i=inicio; i<=fim; i++) {
					System.out.println("i: " + i);
				}		
			}else {
				for(int i=inicio; i>=fim; i--) {
					System.out.println("i: " + i);
				}
			}
			
			
 }
}
