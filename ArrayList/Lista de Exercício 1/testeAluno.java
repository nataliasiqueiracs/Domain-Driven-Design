package ExerciciosLista1;

public class testeAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.curso = "Análise e Desenvolvimento de Sistemas";
		a1.dataNascimento = (byte) 98430;
		a1.endereco = "Avenida Paulista";
		
		
		System.out.println("Curso: " + a1.curso);
		System.out.println("Data de nascimento: " + a1.dataNascimento);
		
	}
	
	
}
