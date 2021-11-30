/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author edoua
 */

@Entity
public class AgenceRegionale extends Agence{
 
    @Column(name="CHIFFRESAFFAIRESMAX"
    )
    private int chiffresAffairesMax;
    
    @Column(name="EMPRUNTSMAX"
    )
    private int empruntsMax;
    
    public AgenceRegionale(){
        
        super();
        this.chiffresAffairesMax = 0;
        this.empruntsMax = 0;
        
    }

    
    public AgenceRegionale(String id, double  a, double  o , String p , int co, String idR, int ch, int em){
        
        super(id, a, o, p, co);
        this.chiffresAffairesMax = ch;
        this.empruntsMax = em;
        
    }

    public int getChiffresAffairesMax() {
        return chiffresAffairesMax;
    }

    public int getEmpruntsMax() {
        return empruntsMax;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.chiffresAffairesMax;
        hash = 61 * hash + this.empruntsMax;
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
        final AgenceRegionale other = (AgenceRegionale) obj;
        if (this.chiffresAffairesMax != other.chiffresAffairesMax) {
            return false;
        }
        if (this.empruntsMax != other.empruntsMax) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return super.toString() + " AgenceRegionale{" + "chiffresAffairesMax=" + chiffresAffairesMax + ", empruntsMax=" + empruntsMax + '}';
    }
    
    
    
    
}
