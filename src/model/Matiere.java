// Page fait par Timothy Daniel
package model;

public class Matiere {
	// Variables
	private int volumeHoraire;
	private int coefficient;
	
	// Getteurs et Setteurs
	public int getVolumeHoraire() {
		return volumeHoraire;
	}
	public int getCoefficient() {
		return coefficient;
	}
	
	public void setVolumeHoraire(int volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	
	// Constructeurs
	public Matiere(int volumeHoraire, int coefficient) {
		this.volumeHoraire = volumeHoraire;
		this.coefficient = coefficient;
	}
	
	
}
