package model;

public class Enseignant extends Intervenant {
	// Variables
		protected String diplome;
    
      private static final String ROLE = "teacher";


	// Constructeur
		public Enseignant(int id,String login,String nomPersonne, String prenomPersonne, String situationFam, String adress,String mail,int type,String diplom) {
			super(id,login,nomPersonne, prenomPersonne, situationFam, adress,mail,type);
			this.diplome=diplom;
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
