package Personnages.secondaires;

import Personnages.Humain;
import Personnages.principaux.Samurai;

public class Traitre extends Samurai{
	private int traitrise ;
	
	public Traitre(String nom, String boisson, String seigneur) {
		super(nom, boisson, seigneur);
		this.traitrise = 0;
	}
	
	public int getTraitrise() {
		return this.traitrise ;
		
	}
	public void extorquer() {
	        if (traitrise < 3) {
	            parler("Je t'ai extorqué ! Niveau de traîtrise : " + traitrise);
	            this.traitrise += 1;
	        } else {
	            parler("Je ne peux plus extorquer, mon niveau de traîtrise est trop élevé.");
	        }
	 }
	
	public void direBonjour() {
		super.direBonjour();
		parler(" : Mon niveau de traitrise est de : "+ this.getTraitrise());
	}
	
	public void faireLeGentil(Humain h, int montant) {
		if(this.getArgent() > 0) {
			h.gagnerArgent(montant);
			this.perdreArgent(montant);
			parler(" : J'ai fait ami-ami avec : " + h.getNom());
            this.traitrise = Math.max(0, this.traitrise - 1);
		}
	}
	
	public void fuir() {
		
	}

}
