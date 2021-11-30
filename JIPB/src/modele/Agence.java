/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author edoua
 */

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Agence implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDAGENCE",
            nullable = false)
    private String idAgence;
    
    @Column( name = "ABSCISSE",
            nullable = false
        )
    private double abscisse;
    
    @Column( name = "ORDONNEE",
            nullable = false
        )
    private double ordonnee;
    
    @Column( name = "PAYS",
            nullable = true
        )
    private String pays;
    
    @Column( name = "COUTLOCATION",
            nullable = false
        )
    private int coutLocation;
    
    public Agence(){
        this.idAgence = "null";
        this.abscisse =  0;
        this.ordonnee = 0;
    }
    
    public Agence(String id, double a, double o, String p, int c){
        this.idAgence = id;
        this.abscisse = a;
        this.ordonnee = o;
    }

    public String getId() {
        return idAgence;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public String getPays() {
        return pays;
    }

    public int getCoutLocation() {
        return coutLocation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.idAgence);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.abscisse) ^ (Double.doubleToLongBits(this.abscisse) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.ordonnee) ^ (Double.doubleToLongBits(this.ordonnee) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.pays);
        hash = 79 * hash + this.coutLocation;
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
        final Agence other = (Agence) obj;
        if (Double.doubleToLongBits(this.abscisse) != Double.doubleToLongBits(other.abscisse)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ordonnee) != Double.doubleToLongBits(other.ordonnee)) {
            return false;
        }
        if (this.coutLocation != other.coutLocation) {
            return false;
        }
        if (!Objects.equals(this.idAgence, other.idAgence)) {
            return false;
        }
        if (!Objects.equals(this.pays, other.pays)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Agence{" + "idAgence=" + idAgence + ", abscisse=" + abscisse + ", ordonnee=" + ordonnee + ", pays=" + pays + ", coutLocation=" + coutLocation +  '}';
    }

    
    
    
    
    
}
