package ListaExercicios2;

import java.util.Scanner;

public class maiorNumeroFor {
	public static void main(String[] args) {
		
	
	Scanner num = new Scanner(System.in);
	
	int maior = 0;
	int numero;
	
	for (int i = 1; i <=10; i++){
		System.out.println("Digite o " + i + "° número: ");
		numero = num.nextInt();
		
		if (numero > maior){
			maior = numero;
		}
	}
	
	System.out.println("O maior número digitado foi: " + maior);
	num.close();
		
	}
}
