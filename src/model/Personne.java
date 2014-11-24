package model;

public class Personne {
	// Variables
		protected String nom;
		protected String prenom;
		protected String situationFamilial;
		protected String adresse;		
	
	// Constructeur
		public Personne(String nomPersonne, String prenomPersonne, String situationFam, String adress) {
			this.nom = nomPersonne;
			this.prenom = prenomPersonne;
			this.situationFamilial = situationFam;
			this.adresse = adress;
		}
		
	//
		public Personne() {
			this.nom = "Non defini";
			this.prenom = "Non defini";
			this.situationFamilial = "Non defini";
			this.adresse = "Non defini";
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
		
	// Methode
		
	// Affichage
		public String toString() {
			return "Nom : " + getNom() + "\nPrenom : " + getPrenom() + "\nSituation Familial : " + getSituationFamilial() + "\nAdresse : " + getAdresse() + "\n";
		}
}
