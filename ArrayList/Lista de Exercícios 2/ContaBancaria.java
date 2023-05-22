package ListaExercicios2;

import java.util.Scanner;

public class ContaBancaria {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = sc.nextDouble();
        
        int operacao = 0;
        double valor = 0;
        
        do {
            System.out.print("\nDigite o código da operação: ");
            operacao = sc.nextInt();
            
            if (operacao == 1) {
                System.out.print("Digite o valor a ser depositado: ");
                valor = sc.nextDouble();
                saldo += valor;
                System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
            } else if (operacao == 2) {
                System.out.print("Digite o valor a ser sacado: ");
                valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                } else {
                    saldo -= valor;
                    System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
                }
            } else if (operacao == 3) {
                System.out.println("Encerrando programa...");
            } else {
                System.out.println("Código de operação inválido.");
            }
        } while (operacao != 3);
        
        if (saldo == 0) {
            System.out.println("CONTA ZERADA");
        } else if (saldo < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }
        
        sc.close();
    }
}
