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
            "ancre",
            "aventure",
            "terre", 
            "agression", 
            "bandana", 
            "bandit", 
            "bandoulière", // mot 29 
            "tonneau", 
            "bataille", 
            "décapiter", 
            "bagarre ",
            "chavirage",
            "capture",
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
            "First Mate",
            "drapeau",
            "épaves", // mot 49
            "galion",
            "passerelle",
            "poudre",
            "Heist",
            "haute mer",
            "détourner",
            "coque de navire",
            "île","quille","fouet", // mot 59
            "carte",
            "mât",
            "fusil",
            "mutinerie",
            "nautique",
            "naviguer",
            "pegleg",
            "Pieces of Eight",
            "pistolet",
            "quartier",
            "quête", // mot 69
            "raid",
            "rations",
            "richesse",
            "gréement",
            "corde",
            "gouvernail",
            "rhum",
            "voile",
            "cicatrice", // mot 79
            "algues",
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
    };


    public String [] mPirateAnswer = {
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
            "plunder",
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
            "bandit",
            "bandolier", //word 29
            "barrel",
            "battle",
            "behead",
            "brawl",
            "capsize",
            "capture",
            "cargo",
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
            "raid",
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
            "swashbuckling"

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
