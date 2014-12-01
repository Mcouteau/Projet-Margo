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
public class Role_uti {

    private String NOM_ROLE;
        
    private int ACCES_CREATION;
    
        private int ACCES_CONSULTATION;

    /**
     * Get the value of ACCES_CONSULTATION
     *
     * @return the value of ACCES_CONSULTATION
     */
    public int getACCES_CONSULTATION() {
        return ACCES_CONSULTATION;
    }

    /**
     * Set the value of ACCES_CONSULTATION
     *
     * @param ACCES_CONSULTATION new value of ACCES_CONSULTATION
     */
    public void setACCES_CONSULTATION(int ACCES_CONSULTATION) {
        this.ACCES_CONSULTATION = ACCES_CONSULTATION;
    }


    /**
     * Get the value of ACCES_CREATION
     *
     * @return the value of ACCES_CREATION
     */
    public int getACCES_CREATION() {
        return ACCES_CREATION;
    }

    /**
     * Set the value of ACCES_CREATION
     *
     * @param ACCES_CREATION new value of ACCES_CREATION
     */
    public void setACCES_CREATION(int ACCES_CREATION) {
        this.ACCES_CREATION = ACCES_CREATION;
    }


    /**
     * Get the value of NOM_ROLE
     *
     * @return the value of NOM_ROLE
     */
    public String getNOM_ROLE() {
        return NOM_ROLE;
    }

    /**
     * Set the value of NOM_ROLE
     *
     * @param NOM_ROLE new value of NOM_ROLE
     */
    public void setNOM_ROLE(String NOM_ROLE) {
        this.NOM_ROLE = NOM_ROLE;
    }

    public Role_uti() {
    }
    
}
