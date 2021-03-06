package model;

public class Personne {
	// Variables

    protected String idpers;

    protected String nom;
    protected String prenom;
    protected String situationFamilial;
    protected String adresse;
    protected String mail;
    protected String login;
    protected int type;
    protected int id;

    private static String ROLE = "";

    // Constructeur
    public Personne(int id,String login,String nomPersonne, String prenomPersonne, String situationFam, String adress,String mail,int type) {
        this.id = id;
        this.login = login;
        this.nom = nomPersonne;
        this.prenom = prenomPersonne;
        this.situationFamilial = situationFam;
        this.adresse = adress;
        this.type = type;
        this.mail = mail;
    }

    //
    public Personne() {
        this.id= 0;
        this.nom = "Non defini";
        this.prenom = "Non defini";
        this.situationFamilial = "Non defini";
        this.adresse = "Non defini";
        this.mail = "Non defini";
        this.type = 0;
        this.login = "Non defini";
    }

    // Getteurs et Setteurs
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

    public String getSituationFamilial() {
        if (situationFamilial==null)
            return "NULL";
        else  
            return situationFamilial;
    }

    public void setSituationFamilial(String situationFamilial) {
        this.situationFamilial = situationFamilial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
    
    
    
    /**
     * Get the value of idpers
     *
     * @return the value of idpers
     */
    public String getIdpers() {
        return idpers;
    }

    /**
     * Set the value of idpers
     *
     * @param idpers new value of idpers
     */
    public void setIdpers(String idpers) {
        this.idpers = idpers;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
	// Methode
    // Affichage
    public String toString() {
        return "Nom : " + getNom() + "\nPrenom : " + getPrenom() + "\nSituation Familial : " + getSituationFamilial() + "\nAdresse : " + getAdresse() + "\n";
    }

    public String getRole() {
        String libelle="";
        
        switch(this.type){
            case 1:
                libelle = "administratif";
                break;
            case 2:
                libelle = "etudiant";
                break;
            case 3:
                libelle = "prof";
                break;
            case 4:
                libelle = "intervenant";
                break;
            case 5:
                libelle = "technicien";
                break;
                
            
        }
        return libelle;
    }
}
