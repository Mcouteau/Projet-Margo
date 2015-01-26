package model;

public class Technicien extends Intervenant {
	// Variables
		protected String specialite;	
    
      private static final String ROLE = "technician";


	// Constructeur
		public Technicien(int id,String login,String nomPersonne, String prenomPersonne, String situationFam, String adress,String mail,int type,String spe){
			super(id,login,nomPersonne, prenomPersonne, situationFam, adress,mail,type);
			this.specialite = spe;
		}
}