package ExerciciosLista1;

public class testePessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Natalia";
		p1.idade = 29;
		p1.sexo = "feminino";
		
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		System.out.println("Sexo: " + p1.sexo);
	}
}
