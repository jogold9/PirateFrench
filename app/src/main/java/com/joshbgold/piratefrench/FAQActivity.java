package com.joshbgold.piratefrench;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by JoshG on 4/13/2015.
 */
public class FAQActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);

        final Button exitButton = (Button) findViewById(R.id.exitButton);
        final TextView faq = (TextView) findViewById(R.id.FAQTextView);

        faq.setText("What are the quests in the game? \n"
                        + "The quests are Maiden Voyage, Nombre de Dios, " +
                        "Porto Bello,  Panama City, Santa Marta, Cartegena, Asunción, Granada, and Nueva Cádiz. \n\n" +
                        "What are the ranks in the game? \n" +
                        "The ranks in ascending order are Powder Monkey, sailor, rigger, gunner's mate, gunner, " +
                        "boatswain, carpenter, sailing master, quartermaster, and captain. \n\n" +
                        "Can the pieces of eight be spent?\n" +
                        "Perhaps in a future update you will be able to use the pieces of eight, but unfortunately not at this time."
        );

        View.OnClickListener walkThePlank = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };

        exitButton.setOnClickListener(walkThePlank);
    }

}
