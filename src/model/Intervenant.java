package model;

public class Intervenant extends Personnel {

	// Constructeur
		public Intervenant(int id,String login,String nomPersonne, String prenomPersonne, String situationFam, String adress,String mail,int type) {
			super(id,login,nomPersonne, prenomPersonne, situationFam,mail, adress,type);
		}
}
