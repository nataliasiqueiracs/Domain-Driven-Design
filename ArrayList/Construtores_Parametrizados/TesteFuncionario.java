package Aula04;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Natalia", "12.345.678-0", "TI", 6000, "30/02/23");
		
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Salário: " + f1.getSalario());
	}
}
