package Pessoa;

public class KarenEx2bPessoa {
		
	    private String nome;
	    private int idade;
	    public KarenEx2bPessoa() {
	   
	    }
	    
	    public void setNome(String novoNome) {
	        this.nome = novoNome;
	    }
	    public String getNome() {
	        return nome;
	    }
	    
	    public void setIdade(int idade) {
	        this.idade = idade;
	    }
	    public int getIdade() {
	        return idade;
	    }
	    
	    
	    
	    
	    
	    public void fazerCompra(double dinheiro) {
	        System.out.println("A pessoa " + nome + " fez uma compra de R$" + dinheiro);
	    }
	    
	    public void trabalhar() {
	        System.out.println("A pessoa " + nome + " está trabalhando.");
	    }
	    
	    public void mendigar() {
	        System.out.println("A pessoa " + nome + " está mendigando.");
	    }
	    




	    public static void main(String[] args) {
	        // Exemplo de uso da classe
	        Rica rica = new LeticiaEx2BRica("Maria", 30);
	        rica.fazerCompra(100.50);
	        
	        Pessoas pobre = new Pobre("João", 25);
	        pobre.trabalhar();
	        
	        Pessoas miseravel = new Miseravel("Carlos", 40);
	        miseravel.mendigar();
	    }
	}


}
