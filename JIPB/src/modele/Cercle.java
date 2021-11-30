/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.GREEN;
import java.awt.Graphics;

/**
 *
 * @author Victor
 */
public class Cercle extends Forme {
    public Cercle(int xc, int yc, String nom) {
        super(xc, yc, nom);
    }
    
    @Override
    public void dessiner(Graphics g) {
        g.setColor(GREEN);
        g.fillOval(xc-10, yc-10, 20, 20);
        g.setColor(BLACK);
        g.drawOval(xc-10, yc-10, 20, 20);
        g.drawString(nom, xc-7, yc+5);
    }
}
