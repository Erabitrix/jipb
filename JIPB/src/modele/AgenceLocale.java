/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;

/**
 *
 * @author edoua
 */

@Entity
public class AgenceLocale extends Agence {
    
    
    @JoinColumn(name="NBRCLIENTSMAX"
    )
    private int nbrClientsMax;
    
    @JoinColumn(name="ACCESSIBILITE"
    )
    private double accessibilite;
    
    public AgenceLocale(){
        
        super();
        this.accessibilite = 0;
        this.nbrClientsMax = 0;
        
    }
    
    
    public AgenceLocale(String id, double a, double o , String p , int co, String idA, int nb, double ac){
        
        super(id,a, o, p, co);
        this.accessibilite = ac;
        this.nbrClientsMax = nb;
        
    }

    public int getNbrClientsMax() {
        return nbrClientsMax;
    }

    public double getAccessibilite() {
        return accessibilite;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.nbrClientsMax;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.accessibilite) ^ (Double.doubleToLongBits(this.accessibilite) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AgenceLocale other = (AgenceLocale) obj;
        if (this.nbrClientsMax != other.nbrClientsMax) {
            return false;
        }
        if (Double.doubleToLongBits(this.accessibilite) != Double.doubleToLongBits(other.accessibilite)) {
            return false;
        }
        return true;
    }

    
    

    @Override
    public String toString() {

        return super.toString() + " AgenceLocale{" + "nbrClientsMax=" + nbrClientsMax + ", accessibilite=" + accessibilite + '}';
    }
     
    
    
    
}
