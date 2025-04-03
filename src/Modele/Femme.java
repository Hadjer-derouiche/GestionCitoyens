package Modele;


import java.io.*;
import java.util.*;

/**
 * 
 */
public class Femme extends Citoyen {
    /**
     * 
     */
    private static String sexe = "Femme";
    
     Vector <ActeMariage> listMar = new Vector<ActeMariage>();
     Vector <ActeNaissance> listeacteNaiss = new Vector<ActeNaissance>();

     /**
     * Default constructor
     */
     public Femme() {
      }

}