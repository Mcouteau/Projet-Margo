package model;

public class Administratif extends Personnel {
  
  private static final String ROLE = "admin";

	// Constructeur
	public Administratif(int id,String nomPersonne, String prenomPersonne, String situationFam, String adress,int type){
			super(id,nomPersonne, prenomPersonne, situationFam, adress,type);
			
		}
  
}
