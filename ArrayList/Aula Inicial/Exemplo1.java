package ArrayList;

import java.util.ArrayList;

/**
 * - Array List
 * - Array Dinâmico
 * - Pode ser alterado em tempo de execução
 * - Framework Collection
 * - Java.util**/


public class Exemplo1 {
	public static void main(String[] args) {
		
		//Criar um ArrayList (Generics)
		ArrayList<String> carros = new ArrayList<String>();
		
		//Adicionar elementos no ArrayList carros, utilizando o método add()
		carros.add("BMW");
		carros.add("Corsa");
		carros.add("Gol");
		carros.add("Monza");
		carros.add("Santana");
		
		//imprimir todos os elementos do ArrayList (lista)
		System.out.println(carros);
		
		//Acessar um elemento específico do ArrayList utilizando o método GET()
		System.out.println(carros.get(4));
		
		//como alterar um elemento do AyyaList utilizando o método SET()
		//o 0 é onde coloca o elemento do arraylist a ser substituído
		//a string "Fusca" é onde vai o elemento a ser substituído
		carros.set(0, "Fusca");
		System.out.println(carros);
		
		//é possível Remover um elemento do ArrayList
		carros.remove(0);
		System.out.println(carros);
		
		//apagar todos os elementos do ArrayList utilizando o método clear()
		//    carros.clear();
		//    System.out.println(carros);
		
		//Obter o tamanho do ArrayList utilizando o método size()
		System.out.println("Tamanho do Array: " + carros.size());
		
		//Como percorrer o ArrayList com um laço FOR:
		//UTILIZANDO O .SIZE PORQUE SE TRATA DE UM OBJETO. Length é só para arrays fixos.
		for(int i = 0; i < carros.size(); i+=1) {
			System.out.printf("%d - %s\n", i+1, carros.get(i));
		}
		
		System.out.println("------------------");
		
		//Percorrer o ArrayList com foreach
		int i = 0;
		for (String carro : carros) {
			System.out.printf("%d - %s\n", i+1, carro);
			i++;
		}
		
		System.out.println("***************");
		
		//OU ENTÃO::::
		int j = 0;
		for (String carro : carros) {
			System.out.printf("%d - %s\n", ++j, carro);
		}
		
		System.out.println("------------------");
		
		//Obter o índice de um elemento específico:
		System.out.println("Índice: " + carros.indexOf("Monza"));
		
		
		//Verificar as ocorrências de um determinado elemento utilizando CONTAINS:
		carros.contains(carros);
		System.out.println("Contém: " + carros.contains("Celta"));
		System.out.println("Contém: " + carros.contains("Santana"));
		
		
		//Operador Ternário = serve para "mascarar" a informação true ou false para o usuário
		// var/ teste ? true : false
		System.out.println("Contém: " + (carros.contains("Santana") ? "sim" : "não"));
		
		
		System.out.println("*-*-**-*-**-*-**-*-**-*-*");
		
		
		//ArrayList - Integer (int)
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(4);
		numeros.add(-2);
		numeros.add(10);
		numeros.add(1000);
		numeros.add(7);
		System.out.println(numeros);
		
		for (Integer n : numeros) {
			System.out.println("Número: " + n);
		}
		
	}
}
