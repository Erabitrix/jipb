/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import java.awt.Graphics;

/**
 *
 * @author Victor
 */
public class Etoile extends Forme{
    public Etoile(int xc, int yc, String nom){
        super(xc, yc, nom);
    }

    @Override
    public void dessiner(Graphics g) {
        // CRÉATION D'UNE LISTE DE COORDONNÉES
        int[] coordsX = new int[10];
        int[] coordsY = new int[10];
        // COORD PREMIER POINT 
        coordsX[0] = xc-19;
        coordsY[0] = yc+6;
        // COORD DEUXIEME POINT
        coordsX[1] = xc-5;
        coordsY[1] = yc+6;
        // COORD TROISIEME POINT
        coordsX[2] = xc+0;
        coordsY[2] = yc+20;
        // COORD QUATRIEME POINT
        coordsX[3] = xc+5;
        coordsY[3] = yc+6;
        // COORD CINQUIEME POINT
        coordsX[4] = xc+19;
        coordsY[4] = yc+6;
        // COORD SIXIEME POINT
        coordsX[5] = xc+7;
        coordsY[5] = yc-1;
        // COORD SEPTIEME POINT
        coordsX[6] = xc+12;
        coordsY[6] = yc-16;
        // COORD HUITIEMEPOINT
        coordsX[7] = xc+0;
        coordsY[7] = yc-8;
        // COORD NEUVIEME POINT
        coordsX[8] = xc-12;
        coordsY[8] = yc-16;
        // COORD DIXIEME POINT
        coordsX[9] = xc-7;
        coordsY[9] = yc-2;
        // COLORISATION ET TRACÉE/REMPLISSAGE
        g.setColor(RED);
        g.fillPolygon(coordsX, coordsY, 10);
        g.setColor(BLACK);
        g.drawPolygon(coordsX, coordsY, 10);
        g.drawString(nom, xc-6, yc+5);
    }
       
}
