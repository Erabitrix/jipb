/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author edoua
 */

@Entity
public class Client {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDCLIENT",
            nullable = false)
    private String idClient;
    
    @Column( name = "ABSCISSE",
            nullable = false
        )
    private double abscisse;
    
    @Column( name = "ORDONNEE",
            nullable = false
        )
    private double ordonnee;
    
    @Column( name = "PAYS",
            nullable = false
        )
    private String pays;
    
    @Column( name = "CHIFFRESAFFAIRES",
            nullable = false
        )
    private int chiffresAffaires;
    
    @Column ( name = "EMPRUNT",
            nullable = false
    )
    private int emprunt;
    
    public Client() {
        this.idClient = "0";
        this.abscisse =  0.0;
        this.ordonnee = 0.0;
        this.pays = "null";
        this.chiffresAffaires = 0;
        this.emprunt = 0;
    }
    

    public Client(String id,double abscisse, double ordonnee, String pays, int chiffresAffaires, int emprunt) {
        this.idClient = id;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.pays = pays;
        this.chiffresAffaires = chiffresAffaires;
        this.emprunt = emprunt;
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

    public int getChiffresAffaires() {
        return chiffresAffaires;
    }

    public int getEmprunt() {
        return emprunt;
    }



    

    @Override
    public String toString() {
        return "Client{" + "idClient=" + idClient + ", abscisse=" + abscisse + ", ordonnee=" + ordonnee + ", pays=" + pays + ", chiffresAffaires=" + chiffresAffaires + ", emprunt=" + emprunt + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.idClient);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.abscisse) ^ (Double.doubleToLongBits(this.abscisse) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.ordonnee) ^ (Double.doubleToLongBits(this.ordonnee) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.pays);
        hash = 23 * hash + this.chiffresAffaires;
        hash = 23 * hash + this.emprunt;
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
        final Client other = (Client) obj;
        if (Double.doubleToLongBits(this.abscisse) != Double.doubleToLongBits(other.abscisse)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ordonnee) != Double.doubleToLongBits(other.ordonnee)) {
            return false;
        }
        if (this.chiffresAffaires != other.chiffresAffaires) {
            return false;
        }
        if (this.emprunt != other.emprunt) {
            return false;
        }
        if (!Objects.equals(this.idClient, other.idClient)) {
            return false;
        }
        if (!Objects.equals(this.pays, other.pays)) {
            return false;
        }
        return true;
    }


    
    
    
}
