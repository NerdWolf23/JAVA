
public class Node extends List {
    private int value;
    private List next;

    public Node(int value, List next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return value + " " + next.toString();
    }

    @Override
    public List add(int x, int i) {
        if(i==0) {
            this.next = new Node(this.value, this.next);
            this.value = x;
        }else{
            this.next = this.next.add(x, i-1);
        }
        return this;
    }

    @Override
    public List remove(int x) {
        if(this.value == x)
            return this.next.remove(x);
        else {
            this.next = this.next.remove(x);
            return this;
        }
    }


    @Override
    public int countOdd(List l) {
        int cont = 0;
        if(this.value % 2 != 0){
            cont++;
        }

        return cont;
    }

/*    @Override
    public List doubleValue() {
        // completa qui
    }*/

  /*  @Override
    public boolean equals(Object obj) {
        // completa qui
    }*/

    @Override
    public List getNext(){
        return next;
    }

    public int getValue() {
        return value;
    }

}
