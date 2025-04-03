package Modele;


import java.io.*;
import java.util.*;


public class ActeDeces {

    
  
    private Date idActeDeces;
    private int dateDeces;
    
    Mairie mairie;
    Citoyen citoyen;
    
    
    public ActeDeces() {
    }
    /**
     * getter and setter
     */
    public Date getIdActeDeces() {
        return idActeDeces;
    }

    public void setIdActeDeces(Date idActeDeces) {
        this.idActeDeces = idActeDeces;
    }

    public int getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(int dateDeces) {
        this.dateDeces = dateDeces;
    }

}