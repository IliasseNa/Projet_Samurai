package Personnages.principaux;

public class Samurai extends Ronin{

	private String seigneur ;
	
	   public Samurai(String nom, String boisson, String seigneur) {
	        super(nom, 0, boisson); 
	        this.seigneur = seigneur;
	    }

	   
	public String getSeigneur() {
		return this.seigneur ;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Je sers monsieur : " + this.getSeigneur());
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + "GLOUPS !");
	}
	
}
