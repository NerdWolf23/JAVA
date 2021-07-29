public class Main {
    public static void main(String[] args) {
        List l = new Node(25, new Node(1,new Node(4,new Node(10,new Nil()))));
        System.out.println(l);

        l = l.addLast(2);
        System.out.println(l);

        l = l.add(24,1);
        System.out.println(l);

        l = l.remove(4);
        System.out.println(l);

        l = l.removeAtIndex(2);
        System.out.println(l);

        l = l.doppio();
        System.out.println(l);

        boolean result = l.pari();
        System.out.println(result);

        //ordinata crescente
        result = l.ordinata(0);
        System.out.println(result);

        result = l.ordinataCrescenteDecrescente(0,0, 0);
        System.out.println(result);

        int lung = l.length();
        System.out.println(lung);
    }
}
