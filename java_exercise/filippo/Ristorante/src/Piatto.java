public class Piatto {
    private String nome;

    // COSTRUTTORE
    public Piatto(String nome) {
        this.nome = nome;
    }

    // GETTER
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
