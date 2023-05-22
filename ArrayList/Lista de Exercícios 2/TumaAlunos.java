package ListaExercicios2;

import java.util.Scanner;

public class TumaAlunos {

    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;
        char sexoMaisVelho = ' ';

        int contador = 1;
        do {
            System.out.println("Digite o nome do " + contador + "º aluno:");
            String nome = input.nextLine();

            System.out.println("Digite a idade do " + contador + "º aluno:");
            int idade = input.nextInt();
            input.nextLine();

            System.out.println("Digite o sexo do " + contador + "º aluno (M/F):");
            char sexo = input.nextLine().charAt(0);

            if (idade > idadeMaisVelho) {
                nomeMaisVelho = nome;
                idadeMaisVelho = idade;
                sexoMaisVelho = sexo;
            }

            contador++;
        } while (contador <= 5);

        System.out.println("O aluno mais velho é " + nomeMaisVelho + ", de idade " + idadeMaisVelho + " e sexo " + sexoMaisVelho + ".");
    }
}

