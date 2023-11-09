package Personnages.principaux;

import Personnages.Humain;

public class Yakusa extends Humain{
	private String clan ;
	private int reputation = 0 ;
	
	public Yakusa(String nom, int argent, String boisson, String clan, int reputation) {
		super(nom, argent, boisson);
		this.clan = clan ;
		this.reputation = reputation ;
		
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
		parler("Je viens d'extorquer un commerçant hahaha !!");
	}
	
	public void gagnerDuel() {
		this.reputation += 1 ;
		parler("J'ai battu votre ronin haha !!");
	}
	
	public int perdreDuel() {
		int argent = this.getArgent() ;
		argent -= argent ;
		this.reputation -= 1 ;
		parler("J'ai perdu contre un ronin");
		return argent ;
	}

}
