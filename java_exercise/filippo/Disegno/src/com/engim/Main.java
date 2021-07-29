package com.engim;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
    ArrayList<Forma> f;
    private final int WIDTH = 1000;
    private final int HEIGHT = 500;
    public Main() {
        setTitle("Forme");
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        f = new ArrayList<>();
        f.add(new Rettangolo(2005,1000));
        f.add(new Quadrato(1500));
    }



    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
       for(Forma forma: f){
            forma.disegna(g,WIDTH/2,HEIGHT/2);
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
    }
}
