package ListaExercicios2;

import java.util.Scanner;

public class FatorialN {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que zero: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for (int i = n; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é " + fatorial);

        sc.close();
    }
}
