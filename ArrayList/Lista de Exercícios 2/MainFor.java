package ListaExercicios2;

import java.util.Scanner;

public class MainFor {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de valores a serem lidos: ");
        int n = sc.nextInt();

        int valor;
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
            valor = sc.nextInt();

            if (valor == 0) {
                System.out.println("NULO");
            } else {
                if (valor % 2 == 0) {
                    System.out.print("PAR ");
                } else {
                    System.out.print("ÍMPAR ");
                }

                if (valor > 0) {
                    System.out.println("POSITIVO");
                } else {
                    System.out.println("NEGATIVO");
                }
            }
        }

        sc.close();
    }
}
