package Aula04;

public class Funcionario {
	
	//atributos
	private String nome;
	private String rg;
	private String departamento;
	private double salario;
	private String admissao;
	public String nomeMae;
	
	//construtor parametrizado (com parâmetro)
	public Funcionario (String nome, String rg, String departamento, double salario, String admissao) {
		this.nome = nome;
		this.rg = rg;
		this.departamento = departamento;
		this.salario = salario;
		this.admissao = admissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	
	public double aumentoSalario(double percentual) {
		double novoSalario = this.salario + (salario * (percentual/100));
		return novoSalario;
	}
	
	public double calculoGanhoReal(double novoSalario) {
		double ganhoReal = novoSalario - this.salario;
		return ganhoReal;
	}
}
