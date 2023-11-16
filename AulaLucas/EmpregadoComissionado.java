package heranca;

public class EmpregadoComissionado {
	
	//Atributos da classe EmpregadoComissionado
	private String primeiroNome;
	private String ultimoNome;
	private String cpf;
	private double vendasBruta;
	private double porcentagemComissao; //0 até 1
	
	// declaração de construtor da classe
	public EmpregadoComissionado(String pNome, String uNome, String cpf, double vendasBruta, double porcentagemComissao) 
	{
		primeiroNome= pNome;
		ultimoNome= uNome;
		this.cpf= cpf;
		this.vendasBruta= vendasBruta;
		this.porcentagemComissao= porcentagemComissao;
		
	}//fim
	
	public void setPrimeiroNome(String a) {
		this.primeiroNome= a;
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	
	public void setUltimoNome (String uNome) {
		this.ultimoNome= uNome;
	}
	
	public String getUltimoNome() {
		return ultimoNome;
	}
	
	public void setCpf(String cpf) {
		this.cpf= cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setVendasBruta(double venda) {
		this.vendasBruta= (venda < 0.0)? 0.0 : venda;
	}
	
	public double getVendasBruta() {
		return vendasBruta;
	}
	
	public void setPorcentagemComissao(double pc) {
		this.porcentagemComissao= (pc < 0.0 || pc > 1.0)?0.01 : pc;
	}
	
	public double getPorcentagemComissao() {
		return porcentagemComissao;
	}
	
	public double salario() {
		double valor= this.getVendasBruta() * this.getPorcentagemComissao();
		return valor;
	}

}//fim class
