public class Desenvolvedor extends Funcionario {
	
	// Atributos
	private int horasTrabalhadas;
	private double valorHora;
	
	// Construtor
	public Desenvolvedor(String nome, String departamento, int horasTrabalhadas, double valorHora) {
		super(nome, departamento);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	// Get e Set
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	// Sobrescrita de Método
	@Override
	public double calcularSalario() {
		return horasTrabalhadas * valorHora;
	}
	
	
	
}
