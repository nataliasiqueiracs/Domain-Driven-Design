package Aula8_Repeticao;

import java.util.Scanner;

/**
 * Escreva um programa em Java que leia N números inteiros,
 * verifique e imprima o maior número lido.
 * O programa deve encerrar, ao digitar o número 0.
 * */

public class Exemplo1_while {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Número: ");
		int n = input.nextInt();
		int maior = n;
		System.out.println("GUARDOU: " + n);
		
		while(n != 0) {
			if(n > maior) {
				maior = n;
				System.out.println("GUARDOU: " + n);
			}
			System.out.println("Número: ");
			n = input.nextInt();
		}
		System.out.println("Saiu do looping, maior número digitado foi: " + maior);
	}

}
