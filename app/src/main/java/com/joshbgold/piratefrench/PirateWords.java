package com.joshbgold.piratefrench;

/**
 * Created by JoshG on 3/10/2015.
 */
public class PirateWords {

    //Member variables (properties about the object)
    int currentNumber =0;
    int wordIndex = 0;

    public String [] mPirateWord = {
            "pirate",
            "trésor",
            "navire",
            "or",
            "argent",
            "bronze",
            "océan",
            "capitaine",
            "perroquet",
            "canon",
            "pillage",
            "attaque",
            "boucanier",
            "brûler",
            "corsaire",
            "terrien",
            "matelot",
            "matelot qualifié",
            "scorbut",
            "scélérat",
            "escroc",
            "butín",
            "abandonné",
            "ancre"
    };


    public String [] mPirateAnswer = {
            "pirate",
            "treasure",
            "ship",
            "gold",
            "silver",
            "bronze",
            "ocean",
            "captain",
            "parrot",
            "cannon",
            "plunder",
            "attack",
            "buccaneer",
            "burn",
            "privateer",
            "landlubber",
            "deckhand",
            "able seaman",
            "scurvy",
            "scoundrel",
            "rogue",
            "booty",
            "marooned",
            "anchor"
    };

    //returns Spanish word
    public String getPirateWord(){
        String pirateWord = mPirateWord[wordIndex];
        currentNumber = wordIndex;
        if (wordIndex < mPirateWord.length - 1) {
            wordIndex = wordIndex + 1;
        }
        return pirateWord;
    }

    //returns English definition
    public String getPirateAnswer(){
        String pirateAnswer = mPirateAnswer[currentNumber];
        return pirateAnswer;
    }

    //goes back to previous word, unless you are on the first word already
    public String getPrevious() {
        String previousWord = "";
        if (currentNumber != 0) {
            currentNumber = currentNumber - 1;
            wordIndex = wordIndex -1;
        }
        previousWord = mPirateWord[currentNumber];
        return previousWord;
//}
    }

}
