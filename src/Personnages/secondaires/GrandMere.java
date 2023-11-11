package Personnages.secondaires;

import java.util.Random;

import Personnages.Humain;
import Personnages.principaux.Commerçant;
import Personnages.principaux.Ronin;
import Personnages.principaux.Samurai;

public class GrandMere extends Humain{

	private Humain [] memoire ;
	
	public GrandMere(String nom, int argent) {
		super(nom, argent, "Tisane");
		this.memoire = new Humain[30] ;
		
	}
	
	private String humainHasard() {
		String s = " : " ; 
		Random random = new Random();
		int choix = random.nextInt(4) ;
		
		switch(choix) {
		case 0 : 
			return s += "Commerçant";
		case 1 : 
			return s += "Ronin";
		case 2 : 
			return s += "Samurai";
		case 3 : 
			return s += "Traitre";
		 default:
            return s += "Inconnu";
		}
	}
	
	public void faireConnaissanceAvec(Humain h ) {
		for(int i = 0 ; i < this.memoire.length; i++) {
			if(this.memoire[i]== null) {
				memoire[i] = h ;
				parler(" : J'ai fais connaissance avec : " + h.getNom());
				break ;
			}
		}
			
		parler(" : Ma mémoire est pleine");
	}
	
	public void ragoter() {
		
		for(Humain h : memoire) {
			if(h instanceof Commerçant) {
				parler(this.getNom() + " : Je crois que " + h.getNom() + " est un : Commerçant");
				
			}else if(h instanceof Ronin) {
				parler(this.getNom() + " : Je crois que" + h.getNom() + " est un : Ronin");
				
			}else if(h instanceof Samurai) {
				parler(this.getNom() + " : Je crois que" + h.getNom() + " est un : Samurai");
					
			}else if (h instanceof Traitre) {
				parler(this.getNom() + " : Je sais que " + h.getNom() + " est un : Traitre");
			}	
		}
	}
	
}
