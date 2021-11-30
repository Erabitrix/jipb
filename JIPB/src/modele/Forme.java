/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

/**
 *
 * @author Victor
 */

abstract public class Forme implements Serializable  {

    
protected int xc,yc;
protected String nom;

    public Forme(int xi, int yi, String nom) {
        this.xc = xi;
        this.yc = yi;
        this.nom = nom;
    }

    public abstract void dessiner(Graphics g);
    
    
    
    
}

