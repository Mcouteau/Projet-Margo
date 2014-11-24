package model;

import java.util.ArrayList;

public class Filiere {
	// Variables
	private String type;
	private ArrayList<Classe> classes;
	private ArrayList<Enseignant> responsables;
	private ArrayList<Matiere> matieres;
	
	// Getteurs et Setteurs
	public String getType() {
		return type;
	}
	
	public ArrayList<Classe> getClasses() {
		return classes;
	}
	
	public ArrayList<Enseignant> getResponsables() {
		return responsables;
	}
	
	public ArrayList<Matiere> getMatieres() {
		return matieres;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setClasses(ArrayList<Classe> classes) {
		this.classes = classes;
	}
	
	public void setResponsables(ArrayList<Enseignant> responsables) {
		this.responsables = responsables;
	}
	
	public void setMatieres(ArrayList<Matiere> matieres) {
		this.matieres = matieres;
	}
	
	// Constructeurs
	public Filiere(String type, ArrayList<Classe> classes, ArrayList<Enseignant> responsables,
			ArrayList<Matiere> matieres) {
		this.type = type;
		this.classes = classes;
		this.responsables = responsables;
		this.matieres = matieres;
	}
}
