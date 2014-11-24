package model;

public class Technicien extends Intervenant {
	// Variables
		protected String specialite;	

	// Constructeur
		public Technicien(String nomPersonne, String prenomPersonne, String situationFam, String adress, String spe) {
			super( nomPersonne, prenomPersonne, situationFam, adress);
			this.specialite = spe;
		}
}
