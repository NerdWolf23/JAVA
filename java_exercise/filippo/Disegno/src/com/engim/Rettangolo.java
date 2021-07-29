package com.engim;

import java.awt.*;

public class Rettangolo extends Poligono{

    // serve per inizializzare x e y
    public Rettangolo(int b, int h) {
    }

    @Override
    public void disegna(Graphics g, int x, int y) {
        g.drawLine(20, 50, 20, 200);
        g.drawLine(20, 200, 80, 200);
        g.drawLine(80, 200, 80, 50);
        g.drawLine(80, 50, 20, 50);
    }
}
