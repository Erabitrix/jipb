/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author victo
 */
public class Clients {

/**
 * TODO JAVADOC EXPLIQUANT LA CLASSE
 * 
 */
    private int id;
    private float abscisse;
    private float ordonnee;
    private String pays;
    private int chiffresAffaire;
    private int emprunt;
    private String idAgenceLocale;
    private String idAgenceRegionale;
    
    /**
     *  Constructeur par défaut, définissant toute les valeurs à 0, et les Strings en Non Défini.
     */
    public Clients(){
        id = 0;
        abscisse = 0;
        ordonnee = 0;
        pays = "N/D";
        chiffresAffaire = 0;
        emprunt = 0;
        idAgenceLocale = "N/D";
        idAgenceRegionale = "N/D";
    }

    /**
     *  Constructeur par données
     * @param id int correspondant à l'id interne du client
     * @param abscisse float, la position en X sur la fenetre
     * @param ordonnee float, la position en Y sur la fenetre
     * @param pays String, Pays de résidence du client
     * @param chiffresAffaire int, Chiffres d'affaires du client
     * @param emprunt int, Montant de l'emprunt demandé par le client
     * @param idAgenceLocale String, Agence locale lui étant associé
     * @param idAgenceRegionale String, Agence Régionale lui étant associé
     */
    public Clients(int id, float abscisse, float ordonnee, String pays, int chiffresAffaire, int emprunt, String idAgenceLocale, String idAgenceRegionale) {
        this.id = id;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.pays = pays;
        this.chiffresAffaire = chiffresAffaire;
        this.emprunt = emprunt;
        this.idAgenceLocale = idAgenceLocale;
        this.idAgenceRegionale = idAgenceRegionale;
    }
    
    public int getId() {
        return id;
    }

    public float getAbscisse() {
        return abscisse;
    }

    public float getOrdonnee() {
        return ordonnee;
    }

    public String getPays() {
        return pays;
    }

    public int getChiffresAffaire() {
        return chiffresAffaire;
    }

    public int getEmprunt() {
        return emprunt;
    }

    public String getIdAgenceLocale() {
        return idAgenceLocale;
    }

    public String getIdAgenceRegionale() {
        return idAgenceRegionale;
    }

    @Override
    public String toString() {
        return "Clients{" + "id=" + id + ", abscisse=" + abscisse + ", ordonnee=" + ordonnee + ", pays=" + pays + ", chiffresAffaire=" + chiffresAffaire + ", emprunt=" + emprunt + ", idAgenceLocale=" + idAgenceLocale + ", idAgenceRegionale=" + idAgenceRegionale + '}';
    }
    
    public static void main(String[] args) {
        
        Clients c1 = new Clients();
        Clients c2 = new Clients(1,(float) 3.4,(float)5.6,"France",12,13,"AgenceLocale","AgenceRegionale");
        
        System.out.println(c1);
        System.out.println(c2);
        
    }
            
}
