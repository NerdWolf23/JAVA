public class DisegnoStack {

    public static void main(String[] args) {
        List l = new Node(1,new Node(2,new Node(3,new Nil())));

        l = l.add(12,2);

        l = l.remove(2);

    }
}
