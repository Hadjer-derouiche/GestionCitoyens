package Modele;


import java.io.*;
import java.util.*;

/**
 * 
 */
public class ActeNaissance {
    
    private int idActeNais;
    
    Femme mere;
    Homme pere;
    Citoyen citoyen;
    
    
    public ActeNaissance() {
    }
    
    /**
     * getter and setter
     */

    public int getIdActeNais() {
        return idActeNais;
    }

    public void setIdActeNais(int idActeNais) {
        this.idActeNais = idActeNais;
    }
    
    

}