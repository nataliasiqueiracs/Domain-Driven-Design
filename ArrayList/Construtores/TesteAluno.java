package Aula11_Construtores;

import java.util.Scanner;

import Aula_java.CalculaMedia;

public class TesteAluno {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
	Aluno a1 = new Aluno();
	System.out.println("Matrícula: " + a1.getMatricula());
	System.out.println("Nome: " + a1.getNome());
	System.out.println("Curso: " + a1.getCurso());
	System.out.println("Status: " + a1.isStatus());
	System.out.println("Média Geral: " + a1.getMediaGeral());
	
	System.out.println();
	
	Aluno a2 = new Aluno(123, "Natalia");
	System.out.println("Matrícula: " + a2.getMatricula());
	System.out.println("Nome: " + a2.getNome());
	System.out.println("Curso: " + a2.getCurso());
	System.out.println("Status: " + a2.isStatus());
	System.out.println("Média Geral: " + a2.getMediaGeral());
	
	System.out.println("");
	
	Aluno a3 = new Aluno(123, "Natalia", "ADS", true);
	System.out.println("Matrícula: " + a3.getMatricula());
	System.out.println("Nome: " + a3.getNome());
	System.out.println("Curso: " + a3.getCurso());
	System.out.println("Status: " + a3.isStatus());
	
	System.out.println("Digite sua N1: ");
	float n1 = input.nextFloat();
	System.out.println("Digite sua N2: ");
	float n2 = input.nextFloat();
	System.out.println();
	float n3 = input.nextFloat();
	a3.setMediaGeral(a3.calcularMedia(n1, n2, n3));
	System.out.println("Média: " + a3.getMediaGeral());
	
	

	
}














}
