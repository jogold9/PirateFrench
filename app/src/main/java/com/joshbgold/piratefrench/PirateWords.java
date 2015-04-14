package com.joshbgold.piratefrench;

public class PirateWords {
    //Member variables (properties about the object)
    private int currentNumber = 0;
    private int wordIndex = 0;
    private boolean hasStarted = false;

    public int getWordIndex() {
        return wordIndex;
    }

    public void setWordIndex(int wordIndex) {
        this.wordIndex = wordIndex;
    }

    private String [] mPirateWord = {
            "pirate",
            "trésor",
            "navire",
            "or",
            "argent",
            "bronze",
            "océan",
            "capitaine",
            "perroquet",
            "canon", //mot 9
            "saccage",
            "attaque",
            "boucanier",
            "brûler",
            "corsaire",
            "terrien",
            "matelot",
            "matelot qualifié",
            "scorbut",
            "scélérat", //mot 19
            "escroc",
            "butín",
            "abandonné",
            "ancre",
            "aventure",
            "terre", 
            "agression", 
            "bandana", 
            "criminel",
            "bandoulière", // mot 29 
            "tonneau", 
            "bataille", 
            "décapiter", 
            "bagarre ",
            "chavirage",
            "capter",
            "fret",
            "bord de mer",
            "pièces de monnaie",
            "boussole", // mot 39
            "conquête",
            "cours",
            "équipage",
            "le nid de pie",
            "coutelas",
            "doublon",
            "correction d'oeil",
            "premier officier",
            "drapeau",
            "épaves", // mot 49
            "galion",
            "passerelle",
            "poudre",
            "vol",
            "haute mer",
            "détourner",
            "coque de navire",
            "île",
            "quille",
            "fouet", // mot 59
            "carte",
            "mât",
            "fusil",
            "mutinerie",
            "nautique",
            "naviguer",
            "jambe de bois",
            "pièces de huit",
            "pistolet",
            "quartier",
            "quête", // mot 69
            "de mauvais augure",
            "vivres",
            "richesse",
            "gréement",
            "corde",
            "gouvernail",
            "rhum",
            "voile",
            "cicatrice",
            "algues", // mot 79
            "terre",
            "tamponner le pont",
            "l'épée",
            "marées",
            "trahison",
            "trêve",
            "la fièvre jaune",
            "x marque l'endroit",
            "marcher la planche", // mot 89
            "cape et d'épée",
            "requin",
            "bourrasque",
            "houle",
            "os",
            "squelette",
            "potence",
            "poignard",
            "abandonner" //word 99
    };


    private String [] mPirateAnswer = {
            "pirate", //word 0
            "treasure",
            "ship",
            "gold",
            "silver",
            "bronze",
            "ocean",
            "captain",
            "parrot",
            "cannon", //word 9
            "pillage",
            "attack",
            "buccaneer",
            "burn",
            "privateer",
            "landlubber",
            "deckhand",
            "able seaman",
            "scurvy",
            "scoundrel",  //word 19
            "rogue",
            "booty",
            "marooned",
            "anchor",
            "adventure",
            "ashore",
            "assault",
            "bandanna",
            "criminal",
            "bandolier", //word 29
            "barrel",
            "battle",
            "behead",
            "brawl",
            "capsize",
            "capture",
            "freight",
            "seashore",
            "coins",
            "compass",  //word 39
            "conquest",
            "course",
            "crew",
            "crow's nest",
            "cutlass",
            "doubloon",
            "eye patch",
            "first mate",
            "flag",
            "flotsam and jetsam", //word 49
            "galleon",
            "gangplank",
            "gunpowder",
            "heist",
            "high seas",
            "hijack",
            "ship's hull",
            "island",
            "keel",
            "lash", //word 59
            "map",
            "mast",
            "musket",
            "mutiny",
            "nautical",
            "navigate",
            "pegleg",
            "pieces of eight",
            "pistol",
            "quartermaster", //word 69
            "quest",
            "ominous",
            "rations",
            "riches",
            "rigging",
            "rope",
            "rudder",
            "rum",
            "sail",
            "scar", //word 79
            "seaweed",
            "shore",
            "swab the deck",
            "sword",
            "tides",
            "treason",
            "truce",
            "yellow fever",
            "x marks the spot",
            "walk the plank", //word 89
            "swashbuckling",
            "shark",
            "squall",
            "heave",
            "bones",
            "skeleton",
            "gallows",
            "dagger",
            "jettison"  //word 99
     };

    //returns French word, used for Main Activity
    public String getPirateWord() {
        String pirateWord = mPirateWord[wordIndex];
        currentNumber = wordIndex;
        if (wordIndex < mPirateWord.length - 1) {
            wordIndex = wordIndex + 1;
        }
        hasStarted = true;
        return pirateWord;
    }

    //returns French word, used for quizzes
    public String getPirateWord(int rank) {
        String pirateWord = mPirateWord[wordIndex + (rank * 10)];  //grabs the appropriate word list for their rank
        currentNumber = wordIndex;
        if (wordIndex < mPirateWord.length - 1) {
            wordIndex = wordIndex + 1;
        }
        hasStarted = true;
        return pirateWord;
    }

    //returns English definition, used for Main Activity
    public String getPirateAnswer(boolean hasStarted) {
        String emptyAnswer = "";
        if (hasStarted) {
            String pirateAnswer = mPirateAnswer[currentNumber];
            return pirateAnswer;
        }
        return emptyAnswer = "";
    }

    //returns English definition, used for quizzes
    public String getPirateAnswer(int rank) {
        String pirateAnswer = mPirateAnswer[currentNumber + (rank * 10)];  //grabs the appropriate word list for their rank
        return pirateAnswer;
    }

    //goes back to previous word, unless you are on the first word already
    public String getPrevious() {
        String previousWord = "";
        String emptyAnswer = "";

        if (hasStarted){
            if (currentNumber != 0) { //we are past the first word
                currentNumber = currentNumber - 1;
                wordIndex = wordIndex - 1;
                previousWord = mPirateWord[currentNumber];
                return previousWord;
            }
            else if (currentNumber == 0){  //we are at the first word, "pirata"
                previousWord = mPirateWord[currentNumber];
                return previousWord;
            }
        }
        return emptyAnswer;  //shows nothing when we haven't even displayed the first word
    }

}
