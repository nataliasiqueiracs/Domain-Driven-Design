package ListaExercicios2;

import java.util.Scanner;

public class NumeroPerfeito {
	private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        int somaDivisores = 0;
        for (int i = 1; i <= numero/2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == numero) {
            System.out.println(numero + " é um número perfeito!");
        } else {
            System.out.println(numero + " não é um número perfeito!");
        }
    }
}
