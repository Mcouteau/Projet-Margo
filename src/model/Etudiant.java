package model;

public class Etudiant extends Personne {
  
  private static final String ROLE = "student";
  
	// Constructeur
		public Etudiant(String nomPersonne, String prenomPersonne, String situationFam, String adress) {
			super(nomPersonne, prenomPersonne, situationFam, adress);
		}
                
                public Object [] RetourTableau(String classe){
                        return new Object [] {nom,prenom,situationFamilial,adresse,classe}; 
                                
                }

}
