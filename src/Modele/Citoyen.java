package Modele;


import java.io.*;
import java.util.*;

/**
 * 
 */
public class Citoyen {

    /**
     * 
     */
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaiss;
    
    ActeDeces deces;
    ActeNaissance acteNaiss;
    Mairie mairie;
    
    public Citoyen() {
    }

    /**
     * getter and setter
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    
    
    

}