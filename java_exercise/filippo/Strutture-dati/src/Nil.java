// SERVE PER CONCLUDERE LA LISTA, POICHÉ LA LISTA È DINAMICA
public class Nil extends List{
    @Override
    public String toString() {
        // stampiamo nulla poiché la lista sarà finita
        return "";

        // metodo ricorsivo, va all'infinito (in realtà si ferma prima di occupare ...
        // ... tutta quanta la RAM
//        return "" + this.toString();
    }

    @Override
    public List addLast(int x) {
        return new Node(x, this);
    }

    @Override
    public List add(int x, int i) {
        return new Node(x, this);
    }

    @Override
    public List remove(int x) {
        return null;
    }

    @Override
    public List removeAtIndex(int i) {
        return null;
    }

    @Override
    public List doppio() {
        return new Nil();
    }

    @Override
    public boolean pari() {
        return true;
    }

    @Override
    public boolean ordinata(int next) {
        return true;
    }

    @Override
    public boolean ordinataCrescenteDecrescente(int next, int counter, int step) {
        if(Math.abs(counter) == step)
            return true;
        else
            return false;
    }

    @Override
    public int length() {
        return 0;
    }
}
