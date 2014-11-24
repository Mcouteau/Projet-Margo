package model;

public class Enfant {
	// Variables
		protected int identifiant;
		protected String prenomEnfant;
		protected String dateDeNaiss;
		
	// Constructeurs
		public Enfant(int id, String prenom, String dateNaiss) {
			super();
			this.identifiant = id;
			this.prenomEnfant = prenom;
			this.dateDeNaiss = dateNaiss;
		}
		
	// Getteurs et Setteurs
		public int getIdentifiant() {
			return identifiant;
		}

		public void setIdentifiant(int identifiant) {
			this.identifiant = identifiant;
		}

		public String getPrenomEnfant() {
			return prenomEnfant;
		}

		public void setPrenomEnfant(String prenomEnfant) {
			this.prenomEnfant = prenomEnfant;
		}

		public String getDateDeNaiss() {
			return dateDeNaiss;
		}

		public void setDateDeNaiss(String dateDeNaiss) {
			this.dateDeNaiss = dateDeNaiss;
		}
		
		// Affichage
		public String toString() {
			return "Identifiant : " + getIdentifiant() + "\nPrenom : "
					+ getPrenomEnfant() + "\nDate de Naissance  : " + getDateDeNaiss();
		}
		

		
		
}
