

public class Nil extends List {

    @Override
    public String toString() {
        return "";
    }


    @Override
    public List add(int x, int i) {
        return new Node(x, this);
    }

    @Override
    public List remove(int x) {
        return this;
    }

    @Override
    public int countOdd(List l) {
        return 0;
    }


 /*   @Override
    public List doubleValue() {
        // completa qui
    }*/



    /*  @Override
    public boolean equals(Object obj) {
        // completa qui
    }*/

    @Override
    public List getNext(){
        return this;
    }

}
