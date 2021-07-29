import java.awt.*;
import java.awt.event.*;

public class Giocatore extends Rectangle{
    //attributi
    int id;
    int velocitaY;
    int accelerazione = 11;


    //costruttore con il super del classe estesa
    Giocatore(int x, int y, int GIOCATORE_WIDTH, int GIOCATORE_HEIGHT, int id){
        super(x,y,GIOCATORE_WIDTH,GIOCATORE_HEIGHT);
        this.id=id;
    }


    //per input da tastiera di entrambi i giocatori


    // metodo alla pressione
    public void keyPressed(KeyEvent e) {
        switch(id) {
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W) {
                    setYDirection(-accelerazione);
                }
                if(e.getKeyCode()==KeyEvent.VK_S) {
                    setYDirection(accelerazione);
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_UP) {
                    setYDirection(-accelerazione);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                    setYDirection(accelerazione);
                }
                break;
        }
    }


    // metodo al rilascio
    public void keyReleased(KeyEvent e) {
        switch(id) {
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W) {
                    setYDirection(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_S) {
                    setYDirection(0);
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_UP) {
                    setYDirection(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                    setYDirection(0);
                }
                break;
        }
    }

    //per settare la posizione sull'asse y
    public void setYDirection(int yDirection) {
        velocitaY = yDirection;
    }

    //metodo che somma posizione relativa alla posizione assoluta
    public void muovi() {
        y= y + velocitaY;
    }

    //metodo per colorare i giocatori
    public void disegna(Graphics g) {
        if(id==1)
            g.setColor(Color.yellow);
        else
            g.setColor(Color.yellow);
        g.fillRect(x, y, width, height);
    }
}