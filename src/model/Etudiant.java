package model;

public class Etudiant extends Personne {
  
  private static final String ROLE = "student";
  
	// Constructeur
		public Etudiant(int id,String login,String nomPersonne, String prenomPersonne, String situationFam, String adress,String mail,int type) {
			super(id,login,nomPersonne, prenomPersonne, situationFam,mail, adress,type);
		}
                
                public Object [] RetourTableau(String classe){
                        return new Object [] {nom,prenom,situationFamilial,adresse,classe}; 
                                
                }

}
