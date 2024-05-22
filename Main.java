import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nomeDev = JOptionPane.showInputDialog("Nome");
		String depDev = JOptionPane.showInputDialog("Departamento");
		int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Horas"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor Hora"));
		
		Desenvolvedor desenvolvedor = new Desenvolvedor(nomeDev, depDev, horasTrabalhadas, valor);
		JOptionPane.showInternalMessageDialog(null, "O salário do desenvolvedor é " + desenvolvedor.calcularSalario());
		
		
	}

}
