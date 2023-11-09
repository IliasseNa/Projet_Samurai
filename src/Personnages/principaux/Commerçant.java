package Personnages.principaux;

import Personnages.Humain;

public class Commerçant extends Humain {

	public Commerçant(String nom, int argent) {
		super(nom, argent, "the");

	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent() ;
		argent = argent - argent;
		parler(" : Ce monde est vraiment trop injuste");
		return argent ;
		
	}
	
	public void recevoir(int montant ) {
		this.setArgent(this.getArgent() + montant);
		parler(" : Merci monsieur !!");
		
	}

}
