import java.awt.*;
import javax.swing.*;

public class Scena extends JFrame{
    //attributo
    OggettiDiScena panel;
    //costruttore
    Scena(){
        panel = new OggettiDiScena();
        this.add(panel);
        this.setTitle("PUNG");
        this.setResizable(false);
        this.setBackground(Color.gray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}