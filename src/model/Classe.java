package model;

import java.util.ArrayList;


public class Classe {
	private ArrayList<Etudiant> etudiant;
	private String nom;
	
	public ArrayList<Etudiant> getEtudiants() {
		return etudiant;
	}
	public String getNom() {
		return nom;
	}
	
	public void setEtudiants(ArrayList<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Classe(ArrayList<Etudiant> etudiant, String nom) {
		this.etudiant = etudiant;
		this.nom = nom;
	}
}
