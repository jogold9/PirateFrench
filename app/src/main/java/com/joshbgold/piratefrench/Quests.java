package com.joshbgold.piratefrench;

public class Quests {

    private String mVoyage[] = {"Maiden Voyage", "Nombre de Dios", "Porto Bello",  "Panama City", "Santa Marta", "Cartegena", "Asunción", "Granada",
            "Nueva Cádiz", "Nueva Cádiz" };

    //Strings for voyage descriptions will go here
    //  String mVoyageDescription[] = {};

    public String getVoyage(int rank) {
        return mVoyage[rank];
    }

/*    public void setVoyage(String[] voyage) {
        mVoyage = voyage;
    }*/
}
