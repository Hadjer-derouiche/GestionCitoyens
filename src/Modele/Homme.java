package Modele;


import java.io.*;
import java.util.*;

/**
 * 
 */
public class Homme extends Citoyen {

    /**
     * 
     */
    private static String sexe = "Homme";
    
    Vector <ActeMariage> listMar = new Vector<ActeMariage>();
    Vector <ActeNaissance> listeacteNaiss = new Vector<ActeNaissance>();
     /**
     * Default constructor
     */
    public Homme() {
    }

}