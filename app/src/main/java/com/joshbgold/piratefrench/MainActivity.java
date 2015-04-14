package com.joshbgold.piratefrench;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private int rank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare our view variables & assign views from the layout file

        final Button practiceButton = (Button) findViewById(R.id.practiceWordsButton);
        final Button quizButton = (Button) findViewById(R.id.quizButton);
        final Button helpButton = (Button) findViewById(R.id.helpButton);
        final Button faqButton = (Button) findViewById(R.id.FAQButton);
        final Button exitButton = (Button) findViewById(R.id.exitButton);


        //practice button
        View.OnClickListener practiceWords = new View.OnClickListener(){
            @Override
            public void onClick (View view){
                startPracticeWords();
            }
        };

        //quiz button
        View.OnClickListener beOffToBattle = new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startQuiz();
            }
        };

        //help button
        View.OnClickListener help = new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                startHelp();
            }
        };

        View.OnClickListener faq = new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                startFAQ();
            }
        };

        //Exit button
        View.OnClickListener walkThePlank = new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                finish();
            }
        };

        practiceButton.setOnClickListener(practiceWords);
        quizButton.setOnClickListener(beOffToBattle);
        helpButton.setOnClickListener(help);
        faqButton.setOnClickListener(faq);
        exitButton.setOnClickListener(walkThePlank);
    }

    //go to the settings page
    private void startHelp(){
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    //go to the practice page
    private void startPracticeWords(){
        Intent intent = new Intent(MainActivity.this, WordPracticeActivity.class);
        startActivity(intent);
    }

    //go to FAQ page
    private void startFAQ(){
        Intent intent = new Intent(MainActivity.this, FAQActivity.class);
        startActivity(intent);
    }

    //go to the quiz page
    private void startQuiz() {
        //get user rank
        rank = LoadPreferences("UserRank", rank);

        if (rank == 9){ //User is a captain, and has won the game!
            startCaptainActivity();
        }
        else {
            Intent intent = new Intent(MainActivity.this, quizActivity.class);
            startActivity(intent);
        }
    };

    //go to the settings page
    private void startCaptainActivity(){

        Intent intent = new Intent(MainActivity.this, CaptainActivity.class);
        startActivity(intent);
    }

    //save prefs
    public void savePrefs(String key, int value){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    //get prefs
    private int LoadPreferences(String key, int value){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        int data = sharedPreferences.getInt(key, value);
        return data;
    }
}
