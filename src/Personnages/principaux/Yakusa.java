package Personnages.principaux;

import Personnages.Humain;

public class Yakusa extends Humain{
	private String clan ;
	private int reputation ;
	
	public Yakusa(String nom, int argent, String boisson, String clan, int reputation) {
		super(nom, argent, boisson);
		this.clan = clan ;
		this.reputation = reputation ;
		
	}

}
