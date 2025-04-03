package Modele;


import java.io.*;
import java.util.*;

/**
 * 
 */
public class ActeMariage {
    
    private boolean div;
    private int idActMariage;
    
    Femme Conjointe;
    Homme Conjoint;
    Mairie mairie;

     public ActeMariage() {
    }
     
    /**
     * getter and setter
     */
    public boolean isDiv() {
        return div;
    }

    public void setDiv(boolean div) {
        this.div = div;
    }

    public int getIdActMariage() {
        return idActMariage;
    }

    public void setIdActMariage(int idActMariage) {
        this.idActMariage = idActMariage;
    }
     
     
}