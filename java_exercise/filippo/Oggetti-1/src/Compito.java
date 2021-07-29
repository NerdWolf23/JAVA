public class Compito {
    // PRENDIAMO LA VARIABILE da studente???!!!
    protected int id;
    // LA VARIABILE nextId SARÀ DISPONIBILE SOLO IN QUESTA CLASSE
    private static int nextId = 0;

    // CREIAMO UNA VARIABILE s DI TIPO STUDENTE PER COLLEGARE IL COMPITO CON IL SUO ID
    protected Studente s;

    // OGNI VOLTA CHE CHIAMIAMO Compito DAL MAIN, QUESTA CLASSE ESEGUIRÀ IL COSTRUTTORE
    public Compito() {
        // INIZIALIZZIAMO LA VARIABILE id A nextId (0)
        this.id = nextId;
        // AUMENTIAMO nextId
        nextId++;
    }

    // CI SERVE PER OTTENERE LA VARIABILE CHE VERRÀ POI UTILIZZATA NELLE ALTRE CLASSI
    public static int getNextId() {
        return nextId;
    }

    // STAMPA L'id
    @Override
    public String toString() {
        return "Compito{" +
                "id=" + id +
                '}';
    }
}
