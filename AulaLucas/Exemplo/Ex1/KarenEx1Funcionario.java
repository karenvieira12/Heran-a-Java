package KarenListaHeranca;

public class KarenEx1Funcionario {
	
	private String nome;
	private double salario;
	
	//construtor da classe
	public KarenEx1Funcionario (String nome, double salario) {
		this.nome= nome;
		this.salario= salario;
	}//fim construtor
	
	public void setNome(String novoNome) {
		this.nome= novoNome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSalario(double salarioNovo) {
		this.salario= salarioNovo < 0.0 ? 0.0 : salarioNovo;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void addAumento(double valorAumento) {
		this.salario=(valorAumento < 0.0)?this.salario : (this.salario+ valorAumento);
	}
	
	public double ganhoAnual() {
		double salarioAnual= this.getSalario() * 13;
		return salarioAnual;
	}
	
	public void exibeDados() {
		System.out.printf("Nome:%s\n"
		+ "Salário Mensal:$%.2f\n"
		+ "Ganho Anual:$%.2f\\n"
		+"**************\n", this.getNome(),this.getSalario(),this.ganhoAnual());
	}
	
	

}//fim da classe
