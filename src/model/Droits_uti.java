/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Etudiant
 */
public class Droits_uti {
    
    private String IDPERS;

    private String Nom_role;

    /**
     * Get the value of Nom_role
     *
     * @return the value of Nom_role
     */
    public String getNom_role() {
        return Nom_role;
    }

    /**
     * Set the value of Nom_role
     *
     * @param Nom_role new value of Nom_role
     */
    public void setNom_role(String Nom_role) {
        this.Nom_role = Nom_role;
    }

    /**
     * Get the value of IDPERS
     *
     * @return the value of IDPERS
     */
    public String getIDPERS() {
        return IDPERS;
    }

    /**
     * Set the value of IDPERS
     *
     * @param IDPERS new value of IDPERS
     */
    public void setIDPERS(String IDPERS) {
        this.IDPERS = IDPERS;
    }


    public Droits_uti() {
    }

    public Droits_uti(String IDPERS, String Nom_role) {
        this.IDPERS = IDPERS;
        this.Nom_role = Nom_role;
    }
    
}
