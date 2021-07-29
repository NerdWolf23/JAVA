
public class Main {

    public static void main(String[] args) {

        List l = new Node(1,new Node(2,new Node(3,new Nil())));

        l = l.add(4,1);

        System.out.println(l.countOdd()); // questo dovrebbe stampare 2

        System.out.println("Inverti l'array");

        List reverse = new Nil();

        // Scrivere un ciclo per invertire la lista l

        System.out.println(reverse); // questo deve stampare 3 2 4 1

        //       System.out.println(l.doubleValue()); // questo deve stampare 2 8 4 6

        List l2 = new Node(1,new Node(4,new Node(2,new Node(3,new Nil()))));
//        System.out.println(l.equals(l2)); // questo deve stampare true
//        System.out.println(l.equals(l.doubleValue())); // questo deve stampare false
    }
}
