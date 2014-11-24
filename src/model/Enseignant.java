package model;

public class Enseignant extends Intervenant {
	// Variables
		protected String diplome;

	// Constructeur
		public Enseignant(String nomPersonne, String prenomPersonne, String situationFam, String adress, String diplom) {
			super(nomPersonne, prenomPersonne, situationFam, adress);
			this.diplome = diplom;
		}
	
	// Getteur et Setteur
		public String getDiplome() {
			return diplome;
		}

		public void setDiplome(String diplome) {
			this.diplome = diplome;
		}
		
	// Affichage
		public String toString() {
			return super.toString() + "\nDipl�me : " + getDiplome() ;
		}

		
}
