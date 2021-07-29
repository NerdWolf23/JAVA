public class DisegnoStack {

    public static void main(String[] args) {
        List l = new Node("N1",new Node("N2",new Node("N3",new Nil())));

        l = l.add("New",1);

        l = l.remove("N1");

    }
}
