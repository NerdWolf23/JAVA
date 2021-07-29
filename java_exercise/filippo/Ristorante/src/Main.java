public class Main {
    public static void main(String[] args) {
        Tavolo tav1 = new Tavolo(1);
        Tavolo tav2 = new Tavolo(2);
        Tavolo tav3 = new Tavolo(3);

        Coda coda = new Coda();
        Cameriere cam = new Cameriere("Matteo", coda);

        cam.inserisciOrdine(tav1, new Piatto("Carbonara"));
        cam.inserisciOrdine(tav1, new Piatto("Amatriciana"));

        System.out.println(coda.toString());
    }
}
