package controller;

/**
 * Created by Cedric GAUTIER - AFPA TP's on 14/02/2021.
 */

import model.Forum;
import view.IAbonneForum;


public class Abonne{
    private String name_abon;
    private String surname_abon;
    private int age_abon;
    private int avertissement;
    public static Forum<IAbonneForum> forum;

    public Abonne(String name_abon,String surname_abon,int age_abon) {
        setAge_abon(age_abon);
        setName_abon(name_abon);
        setSurname_abon(surname_abon);
    }


    public static Forum<IAbonneForum> getForum() {
        return forum;
    }

    public static void setForum(Forum<IAbonneForum> forum) {
        Abonne.forum = forum;
    }

    public String getName_abon() {
        return name_abon;
    }

    public void setName_abon(String name_abon) {
        this.name_abon = name_abon;
    }

    public String getSurname_abon() {
        return surname_abon;
    }

    public void setSurname_abon(String surname_abon) {
        this.surname_abon = surname_abon;
    }

    public int getAge_abon() {
        return age_abon;
    }

    public void setAge_abon(int age_abon) {
        this.age_abon = age_abon;
    }

    public int getAvertissement() {
        return avertissement;
    }


    public void setAvertissement(int avertissement) {
        this.avertissement += avertissement;
    }


    public void creerNouvelle() {
        String subject="Nouvelle";
        String text="Texte du message";
        Nouvelle e = new Nouvelle(subject,text);
        forum.ajouterNouvelle(e);
    }

    public void deposerNouvelle(Nouvelle nelle) {
        forum.deposerNouvelle(nelle);
    }

    public String lireNouvelle(int i) {
        return forum.consulterNouvelle(i);
    }

    public void repondreNouvelle(Nouvelle nelle) {

    }


}