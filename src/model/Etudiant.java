package model;

public class Etudiant extends Personne {
  
  private static final String ROLE = "student";
  
	// Constructeur
		public Etudiant(int id,String nomPersonne, String prenomPersonne, String situationFam, String adress,int type) {
			super(id,nomPersonne, prenomPersonne, situationFam, adress,type);
		}
                
                public Object [] RetourTableau(String classe){
                        return new Object [] {nom,prenom,situationFamilial,adresse,classe}; 
                                
                }

}
