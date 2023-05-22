package ListaExercicios2;

import java.util.Scanner;

public class MediaAlunos {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = sc.nextInt();
        
        int contador = 1;
        double somaNotas = 0.0;
        
        while (contador <= quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + contador + ": ");
            double nota = sc.nextDouble();
            somaNotas += nota;
            contador++;
        }
        
        double media = somaNotas / quantidadeAlunos;
        System.out.println("A média aritmética das notas dos alunos é: " + media);
        
        sc.close();
    }
}
