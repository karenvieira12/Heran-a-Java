class Miseravel extends Pessoa {
    Miseravel(String nome) {
        super(nome);
    }

    void pedirEsmola() {
        System.out.println(nome + " está pedindo esmola.");
    }
}
