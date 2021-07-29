package soluzione;

public class Main_Soluzione {

    public static void main(String[] args) {

        List l = new Node("1N",new Node("2N",new Node("3",new Nil())));

        l = l.add("New",1);

        System.out.println(l.countEndsWith("N")); // questo dovrebbe stampare 2

        System.out.println("Inverti l'array");

        List reverse = new Nil();
        // Scrivere un ciclo per invertire la lista l

        System.out.println(reverse);
    }
}
