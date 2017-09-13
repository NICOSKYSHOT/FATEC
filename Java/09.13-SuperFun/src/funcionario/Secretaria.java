package funcionario;

public class Secretaria extends Funcionario {
 
	private String pTra;
	 
	private boolean fIng;
	
	public Secretaria(int m, String n, double s, String d, String pTra, boolean fIng){
		super(m,n,s,d);
		
		this.fIng = fIng;
		this.pTra = pTra;
	}
	
	public String getPTra(){
		return this.pTra;
	}
	
	public boolean getFIng(){
		return this.fIng;
	}
}
 