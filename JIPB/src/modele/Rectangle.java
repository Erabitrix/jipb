/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
import java.awt.Graphics;

/**
 *
 * @author Victor
 */
public class Rectangle extends Forme{
    static Color LIGHT_BLUE = new Color(0,154,255);
    
    public Rectangle(int xc, int yc, String nom) {
        super(xc, yc, nom);
    }
    
    @Override
    public void dessiner(Graphics g) {
        g.setColor(LIGHT_BLUE);
        g.fillRect(xc-10, yc-10, 20, 20);
        g.setColor(BLACK);
        g.drawRect(xc-10, yc-10, 20, 20);
        g.drawString(nom, xc-5, yc+5);
    }
}
