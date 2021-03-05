package model;

import androidx.annotation.RequiresApi;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import cedric.gautier.ced_forum.R;
import controller.Abonne;
import controller.Moderator;
import controller.Nouvelle;


public class ModeratorInterface extends Activity {
    private EditText name_forum,name,surname,age;
    private String val;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_moderator_interface);

        // pour afficher
        //AlertDialog.Builder builder = new AlertDialog.Builder(ModeratorInterface.this);


        name_forum = (EditText) findViewById(R.id.name_forum_txt);
        name = (EditText) findViewById(R.id.name_txt);
        surname = (EditText) findViewById(R.id.surname_txt);
        age= (EditText) findViewById(R.id.age_txt);

        // création du forum
        new Forum( name_forum.toString());

        //création du modérateur
        Moderator cedric = new Moderator("gautier","cedric",47);

        // création des abonnés
        Abonne marcel = new Abonne("Dupont","Marcel",33);
        Abonne pierre = new Abonne("Martin","Pierre",22);
        Abonne nathalie = new Abonne("Morin","Nathalie",22);
        Abonne catherine = new Abonne("Charpentier","Catherine",55);

        // ajout des abonnés

        cedric.ajouterAbonne(catherine);
        cedric.ajouterAbonne(marcel);
        cedric.ajouterAbonne(nathalie);
        cedric.ajouterAbonne(pierre);

        // affichage des abonnés

        //builder.setMessage(cedric.afficherLesAbonnes()).show();




        // Le modérateur ajoute un abonné et l'affiche
        cedric.ajouterAbonne(new Abonne("Léponge","Bob",15));

        //builder.setMessage(cedric.afficherLesAbonnes()).show();



        //builder.setMessage(cedric.afficherLesAbonnes()).show();

        // Le modérateur averti un abonné

        cedric.avertir(marcel);
        cedric.avertir(marcel);
        cedric.avertir(marcel);

        // Le modérateur exclu un abonné
        cedric.exclureAbonne(marcel);

        cedric.afficherLesAbonnes();




    }
}