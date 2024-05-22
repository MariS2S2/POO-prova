public abstract class Funcionario implements SalarioCalculavel {
	private String nome;
	private String departamento;
	
	// Construtor
	public Funcionario(String nome, String departamento) {
		super();
		this.nome = nome;
		this.departamento = departamento;
	}
	
	// Métodos Acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	// Método Abstrato
	public abstract double calcularSalario();
	
}
