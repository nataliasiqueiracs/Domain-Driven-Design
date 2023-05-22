package Aula7_Condicionais;

import java.util.Scanner;

public class Ex_Switchcase {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Final da placa: ");
		byte finalPlaca = input.nextByte();
		
		System.out.println("*--*Exemplo utilizando if else*--*");
		
		if(finalPlaca == 1 || finalPlaca == 2) {
			System.out.println("Rodízio é segunda-feira");
		}else if (finalPlaca == 3 || finalPlaca == 4){
			System.out.println("Rodízio é terça-feira");
		}else if (finalPlaca == 5 || finalPlaca == 6){
			System.out.println("Rodízio é quarta-feira");
		}else if (finalPlaca == 7 || finalPlaca == 8){
			System.out.println("Rodízio é quinta-feira");
		}else if (finalPlaca == 9 || finalPlaca == 0){
			System.out.println("Rodízio é sexta-feira");
		}else {
			System.out.println("Erro. Digite um número existente.");
		}
		
		
		System.out.println("*--*Exemplo utilizando switch-case*--*");
		
		switch(finalPlaca) {
			
		case 1:
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
		case 4:
			System.out.println("Terça-feira");
			break;
		case 5:
		case 6:
			System.out.println("Quarta-feira");
			break;
		case 7:
		case 8:
			System.out.println("Quinta-feira");
			break;
		case 9:
		case 0:
			System.out.println("Sexta-feira");
			break;
			default:
				System.out.println("Número de placa inválido.");
		}
		
	}
}
