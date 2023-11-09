package Personnages.principaux;

import Personnages.Humain;

public class Ronin extends Humain {

	private int honneur ; 
		
	public Ronin(String nom, int argent, String boisson, int honneur) {
		super(nom, argent, boisson);
		this.honneur = honneur ;
	}

}
