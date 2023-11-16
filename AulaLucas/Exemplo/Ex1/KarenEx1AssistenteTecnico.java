package KarenListaHeranca;

public class KarenEx1AssistenteTecnico extends KarenEx1Assistente {
	private double bonus;

	
	//cria construtor 
	public KarenEx1AssistenteTecnico(double bonus, String matricula, String nome, double salario) { 
		super(matricula, nome, salario);
		this.setBonus (bonus);
	}

	//fim construtor

	public void setBonus (double aditivo) {
		this.bonus= (aditivo <0.0)? 0.0: aditivo;
	}

	public double getBonus() { 
		return this.bonus;
	}

	public double ganhoAnual() { 
		double salarioAnual= (this.getSalario() + this.getBonus()) * 13; // estamos trabalhando a nivel de clt
		return salarioAnual;
	}

	public void exibeDados() {

	System.out.println("********Informações de Assistente Técnico********");
	super.exibeDados();
	System.out.printf("Bônus:$%.2f\n", this.getBonus());
	
	}
}
