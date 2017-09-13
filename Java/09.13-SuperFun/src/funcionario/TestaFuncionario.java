package funcionario;

import javax.swing.JOptionPane;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario paiDeTodos = new Funcionario(1,"Carlos de Souza",2300.50,"A");
		Secretaria secretaria = new Secretaria(2,"Ana",2340,"B","integral", true);
		
		JOptionPane.showMessageDialog(null, "paiDeTodos" + 
				"\nMatricula:" + paiDeTodos.getMat() + 
				"\nNome: " + paiDeTodos.getNome() +
				"\nSalario: " + paiDeTodos.getSal() + 
				"\nDepartamento: " + paiDeTodos.getDept()); 
		
		JOptionPane.showMessageDialog(null, "secretaria" + 
				"\nMatricula:" + secretaria.getMat() + 
				"\nNome: " + secretaria.getNome() +
				"\nSalario: " + secretaria.getSal() + 
				"\nDepartamento: " + secretaria.getDept() +
				"\nPeriodo de Trabalho: " + secretaria.getPTra() +
				"\nFala Inglês: " + secretaria.getFIng()); 		
	}

}
