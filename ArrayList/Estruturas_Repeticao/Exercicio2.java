package Aula8_Repeticao;

import java.util.Scanner;

/***
 * Crie um programa que leia um valor X e em seguida,
 * mostre os valores ímpares entre 1 e X.
 ***/

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Número: ");
		int n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%2 == 1) {
			System.out.println("i: " + i + " é ímpar.");
			}
		}
		
		
	}
}
