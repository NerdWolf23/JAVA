package soluzione;

public class Nil extends List {

    @Override
    public String toString() {
        return "";
    }


    @Override
    public List add(String x, int i) {
        return new Node(x, this);
    }

    @Override
    public List remove(String x) {
        return this;
    }


    @Override
    public int countEndsWith(String suffix) {
        return 0;
    }

    @Override
    public List getNext(){
        return this;
    }

}
