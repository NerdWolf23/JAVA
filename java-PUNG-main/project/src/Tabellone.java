import java.awt.*;

public class Tabellone extends Rectangle{

    //attributi
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int giocatore1;
    int giocatore2;

    //costruttore
    Tabellone(int GAME_WIDTH, int GAME_HEIGHT){
        Tabellone.GAME_WIDTH = GAME_WIDTH;
        Tabellone.GAME_HEIGHT = GAME_HEIGHT;
    }

    //metodo disegna
    public void disegna(Graphics g) {

        //per il segna punti
        g.setColor(Color.black);
        g.setFont(new Font("TimesRoman",Font.BOLD,40));

        //per linea mediana
        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
        //per il punteggio
        g.drawString(String.valueOf(giocatore1/10)+String.valueOf(giocatore1%10), (GAME_WIDTH/2)-85, 50);
        g.drawString(String.valueOf(giocatore2/10)+String.valueOf(giocatore2%10), (GAME_WIDTH/2)+20, 50);
    }
}