package model;

public class Administratif extends Personnel {
  
  private static final String ROLE = "admin";

	// Constructeur
	public Administratif(int id,String login,String nomPersonne, String prenomPersonne, String situationFam, String adress,String mail,int type) {
			super(id,login,nomPersonne, prenomPersonne, situationFam,mail, adress,type);
			
		}
  
}
