package Aula05;
 import java.lang.*;

import java.util.Scanner;

public class testeCalculadora {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		Scanner input = new Scanner(System.in);
		
		System.out.println("N1: ");
		double n1 = input.nextDouble();
		System.out.println("N2: ");
		double n2 = input.nextDouble();
		
		calc.setN1(n1);
		calc.setN2(n2);
		double r = calc.add(calc.getN1(), calc.getN2());
		System.out.println("Soma: " + r);	
	}
}
