package Personnages;

public class Humain {
	private String nom ;
	private int argent ;
	private String boisson ;
	
	public Humain(String nom , int argent , String boisson) {
		this.nom = nom ; 
		this.argent = argent ; 
		this.boisson = boisson ;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}

	public void parler(String texte) {
		
		System.out.println(this.getNom() + texte);
	}
	
	public void direBonjour() {
		
		parler(" : Bonjour ! Je m'appelle " + this.getNom()  + " et j'aime boire du : " + this.getBoisson());
	}
	
	public void boire() {
		parler(" : Mmmm, un bon verre de " + this.getBoisson() + " GLOUPS !"); 
	}
	
	public void gagnerArgent(int montant ) {
		this.argent = this.argent + montant ;
	}
	
	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void perdreArgent(int montant ) {
		
		if(this.argent == 0) {
			System.out.println("Pas d'argent !!");
		}else {
			this.argent = this.argent - montant ;
		}
	}
}
