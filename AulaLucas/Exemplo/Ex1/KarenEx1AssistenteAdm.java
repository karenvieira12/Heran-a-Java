package KarenListaHeranca;

public class KarenEx1AssistenteAdm extends KarenEx1Assistente {
	
	private String turno; // dia ou noite
	private double adicionalNoturno;
	
	public KarenEx1AssistenteAdm(String turno, double adicionalNoturno, String matricula, String nome, double salario) {
		super(matricula,nome, salario);
		this.turno= turno;
		this.setAdicionalNorturno(adicionalNoturno);
	}
	
	public void setTurno(String t) {
		this.turno=t;
	}
	
	public String getTurno() {
		return this.turno;
	}
	
	public void setAdicionalNorturno(double valor) {
		
		if(this.getTurno().equals("noite"))
		{
		this.adicionalNoturno=(valor <0.0)? 0.0: valor;;
		}else {
		this.adicionalNoturno=0.0;
		}
	}
	
	public double getAdcionalNoturno() {
		return adicionalNoturno;
	}
    public double ganhoAnual() { 
			double salarioAnual= (this.getSalario() + this.getAdcionalNoturno()) * 13; // estamos trabalhando a nivel de clt
			return salarioAnual;
	}
    public void exibeDados() {

    	System.out.println("********Informações de Assistente Administrativo********");
    	super.exibeDados();
    	System.out.printf("Turno:$%s\n", this.getTurno());
    	System.out.printf("Adcional Noturno:$%.2f\n", this.getAdcionalNoturno());
    	
    	}
    
}


