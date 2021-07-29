public class Tavolo {
    private int id;

    // COSTRUTTORE
    public Tavolo(int id) {
        this.id = id;
    }

    // GETTER
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tavolo " + id;
    }
}
