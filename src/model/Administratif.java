package model;

public class Administratif extends Personnel {
  
  private static final String ROLE = "admin";

	// Constructeur
	public Administratif(String nomPersonne, String prenomPersonne, String situationFam, String adress) {
		super( nomPersonne, prenomPersonne, situationFam, adress);
	}
  
}
