package KarenListaHeranca;

public class KarenEx1Assistente extends KarenEx1Funcionario{
	
	private String matricula;
	
	
	public KarenEx1Assistente(String matricula, String nome, double salario) {
		super(nome, salario);
		this.matricula= matricula;
	}
	
	public void setMatricula(String mat) {
		this.matricula= mat;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
    public void exibeDados() {
    	System.out.println("************Informações de Assistente***********");
    	super.exibeDados();
    	System.out.printf("Matrícila:%s\n", this.getMatricula());
    }
}
