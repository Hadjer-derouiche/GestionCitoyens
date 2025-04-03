package Modele;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Homme extends Citoyen {

    /**
     * 
     */
    private static String sexe = "Homme";

    Vector<ActeMariage> listMar = new Vector<ActeMariage>();
    Vector<ActeNaissance> listeacteNaiss = new Vector<ActeNaissance>();

    /**
     * Default constructor
     */
    public Homme(int idC, String n, String p, LocalDate dateNais, Mairie m) {
        super(idC, n, p, dateNais, m);
    }

    public void ajouterMar(ActeMariage m) {
        listMar.add(m);
    }

    public void ajouterEnfant(ActeNaissance n) {
        listeacteNaiss.add(n);
    }

}