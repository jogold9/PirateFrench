package com.joshbgold.piratefrench;

public class Rank {

    //private int rank = 0;
    private String[] rankDescription = {
            "Powder Monkey",  //rank = 0
            "Sailor",
            "Rigger",
            "Gunner's Mate",
            "Gunner",
            "Boatswain",
            "Carpenter",
            "Sailing Master",
            "Quartermaster",
            "Captain"  //rank = 9
    };

    public String getRankDescription(int i) {
        return rankDescription[i];
    }

}
