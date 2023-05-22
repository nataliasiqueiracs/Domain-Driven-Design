package ExerciciosLista1;

public class Professor {
	int id;
	String nome;
	String email;
	String telefone;
	String curso;
	String disciplina;
	double salario;
	
	public Professor(){
		System.out.println("Objeto professor criado!");
	}
	
	public Professor(String nome, String email, String telefone, String curso, String disciplina, double salario){
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.curso = curso;
		this.disciplina = disciplina;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
