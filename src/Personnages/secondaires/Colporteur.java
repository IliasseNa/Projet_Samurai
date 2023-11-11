package Personnages.secondaires;

import Personnages.principaux.Commerçant;

public class Colporteur extends Commerçant {

	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}
	
    @Override
	public int seFaireExtorquer() {
		int argent = this.getArgent()/2 ;
        this.setArgent(this.getArgent() - argent);
		parler(" : Hihi il'a pas voler tout mon argent ");
		return argent ;
	}

}
