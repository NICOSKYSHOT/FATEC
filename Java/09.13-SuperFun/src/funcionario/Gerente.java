package funcionario;

public class Gerente extends Funcionario {
 
	private int nSub;
	 
	private int tGeren;
	
	public Gerente(int m, String n, double s, String d, int nSub, int tGeren){
		super(m,n,s,d);
		this.nSub = nSub;
		this.tGeren = tGeren;
	}
	
	public int nSub(){
		return this.nSub;
	}
	
	public int tGeren(){
		return this.tGeren;
	}
	 
}