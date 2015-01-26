/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Etudiant
 */
public class Item {
    
    private String code;

    /**
     * Get the value of code
     *
     * @return the value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Set the value of code
     *
     * @param code new value of code
     */
    public void setCode(String code) {
        this.code = code;
    }

    private String valeur;

    /**
     * Get the value of valeur
     *
     * @return the value of valeur
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * Set the value of valeur
     *
     * @param valeur new value of valeur
     */
    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Item(String code, String valeur) {
        this.code = code;
        this.valeur = valeur;
    }

    
}
