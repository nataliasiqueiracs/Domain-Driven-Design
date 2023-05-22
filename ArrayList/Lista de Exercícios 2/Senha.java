package ListaExercicios2;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 2002;
        int tentativas = 0;

        for (;;) {
            System.out.print("Digite a senha: ");
            int senha = sc.nextInt();
            tentativas++;

            if (senha == senhaCorreta) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }

        System.out.printf("Numero de tentativas: %d\n", tentativas);
        sc.close();
    }
	
}
