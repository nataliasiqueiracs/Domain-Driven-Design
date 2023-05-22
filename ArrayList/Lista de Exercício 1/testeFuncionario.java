package ExerciciosLista1;

public class testeFuncionario {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Natalia", "Presidente", "Contas", 10000);
		
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Cargo: " + f1.getCargo());
		System.out.println("Departamento; " + f1.departamento);
		System.out.println("Salário: " + f1.getSalario());
		
		
	}
}
