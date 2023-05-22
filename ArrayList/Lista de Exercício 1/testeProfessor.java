package ExerciciosLista1;

public class testeProfessor {
	public static void main(String[] args) {
		
		Professor p1 = new Professor("Fernando", "professorfernando@fiap.com.br", "3233-2990", "DDD", "DDD", 7000);
		
		System.out.println("Disciplina do professor: " + p1.getDisciplina());
		System.out.println("Salário do professor: " + p1.salario);
		System.out.println("Email do professor: " + p1.email);
	}
}
