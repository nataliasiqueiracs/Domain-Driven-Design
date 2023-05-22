package ListaExercicios2;

import java.util.Scanner;

public class DivisoresDeUmNumero {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();

        System.out.printf("Divisores de %d: ", n);

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d ", i);
            }
        }

        input.close();
    }
}
