package model;

public class Technicien extends Intervenant {
	// Variables
		protected String specialite;	
    
      private static final String ROLE = "technician";


	// Constructeur
		public Technicien(int id,String nomPersonne, String prenomPersonne, String situationFam, String adress,int type,String spe){
			super(id,nomPersonne, prenomPersonne, situationFam, adress,type);
			this.specialite = spe;
		}
}