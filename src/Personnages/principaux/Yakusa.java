package Personnages.principaux;

import Personnages.Humain;

public class Yakusa extends Humain{
	private String clan ;
	private int reputation = 0 ;
	
	public Yakusa(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan ;
		this.reputation = 0 ;
		
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commerçant c ) {
		c.seFaireExtorquer();
		this.reputation += 1 ;
		parler(" : Je viens d'extorquer un commerçant hahaha !!");
	}
	
	public void gagnerDuel() {
		this.reputation += 1 ;
		parler(" : J'ai battu votre ronin haha !!");
	}
	
	public int perdreDuel() {
		int argent = this.getArgent() ;
		argent -= argent ;
		this.reputation -= 1 ;
		parler(" : J'ai perdu contre un ronin");
		return argent ;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler(" : Je suis fier d'appartenir au clan " + this.getClan() + " des Yakusa.");
	}

}
