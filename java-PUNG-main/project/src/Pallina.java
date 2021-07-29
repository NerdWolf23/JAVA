import java.awt.*;
import java.util.*;

public class Pallina extends Rectangle{

    //attributi
    Random random;
    int velocitaX;
    int velocitaY;
    int velocita0 = 4;

    //costruttore
    Pallina(int x, int y, int width, int height){
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection*velocita0);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection*velocita0);

    }


    //metodi per direzionamento pallina
    public void setXDirection(int randomXDirection) {
        velocitaX = randomXDirection;
    }
    public void setYDirection(int randomYDirection) {
        velocitaY = randomYDirection;
    }
    public void muovi() {
        x += velocitaX;
        y += velocitaY;
    }

    //metodo per disegnare la pallina e colorarla
    public void disegna(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, height, width);
    }
}