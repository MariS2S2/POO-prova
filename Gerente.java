public class Gerente extends Funcionario {
	private double salarioBase;
	private double bonus;

	public Gerente(String nome, String departamento, double salarioBase, double bonus) {
		super(nome, departamento);
		this.salarioBase = salarioBase;
		this.bonus = bonus;
	}


	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double calcularSalario() {
		return salarioBase + bonus;
	}
	
	
	
}
