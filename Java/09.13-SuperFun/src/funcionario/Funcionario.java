package funcionario;

public class Funcionario {
 
		private int mat;
		private String nome;
		private double sal;
		private String dept;

	public Funcionario(int m, String n, double s, String d) {
		this.mat= m;
		this.nome = n;
		this.sal = s;
		this.dept = d;
	}
	
	public int getMat() {
		return this.mat;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSal() {
		return this.sal;
	}
	
	public String getDept() {
		return this.dept;
	}

}
