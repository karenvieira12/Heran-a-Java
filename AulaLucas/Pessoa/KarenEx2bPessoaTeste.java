public class HerancaExemplo {
    public static void main(String[] args) {
        Pobre pessoaPobre = new Pobre("João", 30);
        pessoaPobre.apresentar();
        pessoaPobre.trabalhar();

        Miseravel pessoaMiseravel = new Miseravel("Maria", 25);
        pessoaMiseravel.apresentar();
        pessoaMiseravel.pedirEsmola();

        Rica pessoaRica = new Rica("Carlos", 40);
        pessoaRica.apresentar();
        pessoaRica.aproveitarVidaLuxuosa();
    }
}
