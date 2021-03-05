package controller;

/**
 * Created by Cedric GAUTIER - AFPA TP's on 14/02/2021.
 */
public class Adresse {

    private int numéro_rue;
    private String nom_rue;
    private int codePostal;
    private String ville;



    public Adresse(int i, String string, int j, String string2) {
        this.numéro_rue=i;
        this.nom_rue=string;
        this.codePostal=j;
        this.ville=string2;
        // JOptionPane.showMessageDialog(null,i+", "+string+", "+j+" "+string2, " Adresse à "+string2.toString(), 1);

    }

    public String toString() {
        return numéro_rue+", "+nom_rue+", "+codePostal+" "+ville;

    }

    public Adresse() {
        // TODO Auto-generated constructor stub
    }



    public int getNuméro_rue() {
        return numéro_rue;
    }
    public void setNuméro_rue(int numéro_rue) {
        this.numéro_rue = numéro_rue;
    }
    public String getNom_rue() {
        return nom_rue;
    }
    public void setNom_rue(String nom_rue) {
        this.nom_rue = nom_rue;
    }
    public int getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }




}

