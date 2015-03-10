package com.joshbgold.piratefrench;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private PirateWords mPirateWords = new PirateWords();
    private ColorRandomizer mColorRandomizer = new ColorRandomizer();
    //private int currentNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare our view variables & assign views from the layout file
        final TextView pirateLabel = (TextView) findViewById(R.id.pirateView);
        final Button pirateButton = (Button) findViewById(R.id.pirateButton);
        final Button pirateAnswerButton = (Button) findViewById(R.id.pirateAnswerButton);
        final Button previousButton = (Button) findViewById(R.id.previousButton);
        final Button exitButton = (Button) findViewById(R.id.exitButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        //Get Spanish word button
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String fact = mPirateWords.getPirateWord();
                //Update the screen with the Spanish word
                pirateLabel.setText(fact);

                int color = mColorRandomizer.getColor();
                relativeLayout.setBackgroundColor(color);
                pirateButton.setLinkTextColor(color);
            }

        };


        //Get English definition button
        View.OnClickListener listenerAnswer = new View.OnClickListener(){
            @Override
            public void onClick (View view) {

                String fact = mPirateWords.getPirateAnswer();
                //Update the screen with the word definition
                pirateLabel.setText(fact);

            }
        };

        View.OnClickListener previous = new View.OnClickListener(){
            @Override
            public void onClick (View view){
                String fact = mPirateWords.getPrevious();
                //Update the screen with the previous Spanish word
                pirateLabel.setText(fact);
            }
        };

        //Exit button
        View.OnClickListener walkThePlank = new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                System.exit(0);
            }
        };


        pirateButton.setOnClickListener(listener);
        pirateAnswerButton.setOnClickListener(listenerAnswer);
        previousButton.setOnClickListener(previous);
        exitButton.setOnClickListener(walkThePlank);


    }
}
