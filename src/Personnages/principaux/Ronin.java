package Personnages.principaux;

import Personnages.Humain;

public class Ronin extends Humain {

	private int honneur  = 1; 
		
	public Ronin(String nom, int argent, String boisson, int honneur) {
		super(nom, argent, boisson);
		this.honneur = honneur ;
	}
	
	public void donner(Commerçant c , int montant) {
		c.gagnerArgent(montant);
		this.perdreArgent(montant);
	}
	
	public void provoquer(Yakusa y) {
		
		if(this.honneur * 2 > y.getReputation()) {
			y.perdreDuel();
			y.perdreArgent(y.getArgent());
			this.gagnerArgent(y.getArgent());
			this.honneur += 1 ; 
			parler("J'ai gagner mon duel");
			
		}else {
			this.honneur -= honneur ;
			parler("C'etait injuste ce combat, je devrais le gagner !!");
		}
	}

}
