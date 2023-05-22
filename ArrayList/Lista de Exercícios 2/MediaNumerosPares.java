package ListaExercicios2;

public class MediaNumerosPares {
	public static void main(String[] args) {
        int soma = 0;
        int count = 0;

        for (int i = 13; i <= 73; i++) {
            if (i % 2 == 0) {
                soma += i;
                count++;
            }
        }

        double media = soma / (double) count;
        System.out.println("A média dos números pares entre 13 e 73 é: " + media);
    }
}
