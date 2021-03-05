package model;

import androidx.annotation.RequiresApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import cedric.gautier.ced_forum.R;
import controller.Nouvelle;


public class AbonneInterface extends Activity {
    private EditText n1,n2,n3,n4;
    private TextView tn1,tn2,tn3,tn4,abonne;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_abonne_interface);


        abonne = (TextView) findViewById(R.id.abonne_txt);
        n1 = (EditText) findViewById(R.id.nouv1_txt);
        n2 = (EditText) findViewById(R.id.nouv2_txt);
        n3 = (EditText) findViewById(R.id.nouv3_txt);
        n4 = (EditText) findViewById(R.id.nouv4_txt);
        tn1 = (TextView) findViewById(R.id.title1_txt);
        tn2 = (TextView) findViewById(R.id.title2_txt);
        tn3 = (TextView) findViewById(R.id.title3_txt);
        tn4 = (TextView) findViewById(R.id.title4_txt);

        //Titre de bienvenu
        abonne.setText("Bienvenu "+ getIntent().getStringExtra("nom").toUpperCase() +" dans ce forum");

        //création des nouvelles
        Nouvelle a = new Nouvelle("Java ---", "C'est bien ?");
        Nouvelle b = new Nouvelle("Interface ---", "Principe indispensable en Java");
        Nouvelle c = new Nouvelle("Classe abstraite ---", "C'est une classe non instanciable");
        Nouvelle d = new Nouvelle("Java ---", "Les classes abstraites sont ...");

        tn1.setText(a.getSubject());
        n1.setText(a.getText());
        tn2.setText(b.getSubject());
        n2.setText(b.getText());
        tn3.setText(c.getSubject());
        n3.setText(c.getText());
        tn4.setText(d.getSubject());
        n4.setText(d.getText());

        // nouvelles déposées par les abonnés
        //marcel.deposerNouvelle(a);
        //pierre.deposerNouvelle(b);
        //nathalie.deposerNouvelle(c);
        //catherine.deposerNouvelle(d);

        //marcel.creerNouvelle();

        // Le modérateur supprime une nouvelle
        //cedric.supprimerNouvelle(d);

        // Modérateur affiche les nouvelles
        // builder.setMessage(cedric.afficherLesNouvelles()).show();

        // Un abonné lit une nouvelle
        // builder.setMessage(marcel.lireNouvelle(2)).show();
    }


}